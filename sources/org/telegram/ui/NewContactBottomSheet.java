package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_contacts_importContacts;
import org.telegram.tgnet.TLRPC$TL_contacts_importedContacts;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPhoneContact;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.OutlineEditText;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.NewContactBottomSheet;

public class NewContactBottomSheet extends BottomSheet implements AdapterView.OnItemSelectedListener {
    int classGuid;
    private View codeDividerView;
    private AnimatedPhoneNumberEditText codeField;
    private HashMap<String, List<CountrySelectActivity.Country>> codesMap;
    private LinearLayout contentLayout;
    private ArrayList<CountrySelectActivity.Country> countriesArray;
    private String countryCodeForHint;
    private TextView countryFlag;
    private TextView doneButton;
    private FrameLayout doneButtonContainer;
    private boolean donePressed;
    private ContextProgressView editDoneItemProgress;
    private OutlineEditText firstNameField;
    private boolean ignoreOnPhoneChange;
    private boolean ignoreOnTextChange;
    private boolean ignoreSelection;
    private String initialFirstName;
    private String initialLastName;
    private String initialPhoneNumber;
    private boolean initialPhoneNumberWithCountryCode;
    private OutlineEditText lastNameField;
    BaseFragment parentFragment;
    private AnimatedPhoneNumberEditText phoneField;
    private HashMap<String, List<String>> phoneFormatMap;
    private OutlineTextContainerView phoneOutlineView;
    private TextView plusTextView;
    private RadialProgressView progressView;
    private int wasCountryHintIndex;

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public NewContactBottomSheet(BaseFragment baseFragment, Context context) {
        super(context, true);
        this.countriesArray = new ArrayList<>();
        this.codesMap = new HashMap<>();
        this.phoneFormatMap = new HashMap<>();
        fixNavigationBar();
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.parentFragment = baseFragment;
        setCustomView(createView(getContext()));
        setTitle(LocaleController.getString(R.string.NewContactTitle), true);
    }

    public android.view.View createView(android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NewContactBottomSheet.createView(android.content.Context):android.view.View");
    }

    public boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.lastNameField.requestFocus();
        this.lastNameField.getEditText().setSelection(this.lastNameField.getEditText().length());
        return true;
    }

    public boolean lambda$createView$2(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.codeField.requestFocus();
        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.codeField;
        animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
        return true;
    }

    public class AnonymousClass1 extends TextView {
        final NotificationCenter.NotificationCenterDelegate delegate;

        AnonymousClass1(Context context) {
            super(context);
            this.delegate = new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                    NewContactBottomSheet.AnonymousClass1.this.lambda$$0(i, i2, objArr);
                }
            };
        }

        public void lambda$$0(int i, int i2, Object[] objArr) {
            invalidate();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this.delegate, NotificationCenter.emojiLoaded);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this.delegate, NotificationCenter.emojiLoaded);
        }
    }

    public class AnonymousClass2 implements CountrySelectActivity.CountrySelectActivityDelegate {
        AnonymousClass2() {
        }

        @Override
        public void didSelectCountry(CountrySelectActivity.Country country) {
            NewContactBottomSheet.this.selectCountry(country);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NewContactBottomSheet.AnonymousClass2.this.lambda$didSelectCountry$0();
                }
            }, 300L);
            NewContactBottomSheet.this.phoneField.requestFocus();
            NewContactBottomSheet.this.phoneField.setSelection(NewContactBottomSheet.this.phoneField.length());
        }

        public void lambda$didSelectCountry$0() {
            AndroidUtilities.showKeyboard(NewContactBottomSheet.this.phoneField);
        }
    }

    public void lambda$createView$3(View view) {
        CountrySelectActivity countrySelectActivity = new CountrySelectActivity(true);
        countrySelectActivity.setCountrySelectActivityDelegate(new AnonymousClass2());
        this.parentFragment.showAsSheet(countrySelectActivity);
    }

    public boolean lambda$createView$4(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.phoneField.requestFocus();
        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
        animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
        return true;
    }

    public boolean lambda$createView$5(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.doneButtonContainer.callOnClick();
        return true;
    }

    public void lambda$createView$7(View view) {
        doOnDone();
    }

    private void doOnDone() {
        BaseFragment baseFragment;
        if (this.donePressed || (baseFragment = this.parentFragment) == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (this.firstNameField.getEditText().length() == 0) {
            Vibrator vibrator = (Vibrator) this.parentFragment.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.firstNameField);
            return;
        }
        if (this.codeField.length() == 0) {
            Vibrator vibrator2 = (Vibrator) this.parentFragment.getParentActivity().getSystemService("vibrator");
            if (vibrator2 != null) {
                vibrator2.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.codeField);
            return;
        }
        if (this.phoneField.length() == 0) {
            Vibrator vibrator3 = (Vibrator) this.parentFragment.getParentActivity().getSystemService("vibrator");
            if (vibrator3 != null) {
                vibrator3.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.phoneField);
            return;
        }
        this.donePressed = true;
        showEditDoneProgress(true, true);
        final TLRPC$TL_contacts_importContacts tLRPC$TL_contacts_importContacts = new TLRPC$TL_contacts_importContacts();
        final TLRPC$TL_inputPhoneContact tLRPC$TL_inputPhoneContact = new TLRPC$TL_inputPhoneContact();
        tLRPC$TL_inputPhoneContact.first_name = this.firstNameField.getEditText().getText().toString();
        tLRPC$TL_inputPhoneContact.last_name = this.lastNameField.getEditText().getText().toString();
        tLRPC$TL_inputPhoneContact.phone = "+" + this.codeField.getText().toString() + this.phoneField.getText().toString();
        tLRPC$TL_contacts_importContacts.contacts.add(tLRPC$TL_inputPhoneContact);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_contacts_importContacts, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                NewContactBottomSheet.this.lambda$doOnDone$9(tLRPC$TL_inputPhoneContact, tLRPC$TL_contacts_importContacts, tLObject, tLRPC$TL_error);
            }
        }, 2), this.classGuid);
    }

    public void lambda$doOnDone$9(final TLRPC$TL_inputPhoneContact tLRPC$TL_inputPhoneContact, final TLRPC$TL_contacts_importContacts tLRPC$TL_contacts_importContacts, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        final TLRPC$TL_contacts_importedContacts tLRPC$TL_contacts_importedContacts = (TLRPC$TL_contacts_importedContacts) tLObject;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NewContactBottomSheet.this.lambda$doOnDone$8(tLRPC$TL_contacts_importedContacts, tLRPC$TL_inputPhoneContact, tLRPC$TL_error, tLRPC$TL_contacts_importContacts);
            }
        });
    }

    public void lambda$doOnDone$8(TLRPC$TL_contacts_importedContacts tLRPC$TL_contacts_importedContacts, TLRPC$TL_inputPhoneContact tLRPC$TL_inputPhoneContact, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_contacts_importContacts tLRPC$TL_contacts_importContacts) {
        this.donePressed = false;
        if (tLRPC$TL_contacts_importedContacts != null) {
            if (!tLRPC$TL_contacts_importedContacts.users.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_contacts_importedContacts.users, false);
                MessagesController.getInstance(this.currentAccount).openChatOrProfileWith(tLRPC$TL_contacts_importedContacts.users.get(0), null, this.parentFragment, 1, false);
                dismiss();
                return;
            } else {
                if (this.parentFragment.getParentActivity() == null) {
                    return;
                }
                showEditDoneProgress(false, true);
                AlertsCreator.createContactInviteDialog(this.parentFragment, tLRPC$TL_inputPhoneContact.first_name, tLRPC$TL_inputPhoneContact.last_name, tLRPC$TL_inputPhoneContact.phone);
                return;
            }
        }
        showEditDoneProgress(false, true);
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this.parentFragment, tLRPC$TL_contacts_importContacts, new Object[0]);
    }

    @Override
    public void show() {
        super.show();
        this.firstNameField.getEditText().requestFocus();
        this.firstNameField.getEditText().setSelection(this.firstNameField.getEditText().length());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NewContactBottomSheet.this.lambda$show$10();
            }
        }, 50L);
    }

    public void lambda$show$10() {
        AndroidUtilities.showKeyboard(this.firstNameField.getEditText());
    }

    private void showEditDoneProgress(boolean z, boolean z2) {
        AndroidUtilities.updateViewVisibilityAnimated(this.doneButton, !z, 0.5f, z2);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, z, 0.5f, z2);
    }

    public static String getPhoneNumber(Context context, TLRPC$User tLRPC$User, String str, boolean z) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                hashMap.put(split[0], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (str.startsWith("+")) {
            return str;
        }
        if (z || tLRPC$User == null || TextUtils.isEmpty(tLRPC$User.phone)) {
            return "+" + str;
        }
        String str2 = tLRPC$User.phone;
        for (int i = 4; i >= 1; i--) {
            String substring = str2.substring(0, i);
            if (((String) hashMap.get(substring)) != null) {
                return "+" + substring + str;
            }
        }
        return str;
    }

    public NewContactBottomSheet setInitialPhoneNumber(String str, boolean z) {
        String country;
        Object systemService;
        this.initialPhoneNumber = str;
        this.initialPhoneNumberWithCountryCode = z;
        if (!TextUtils.isEmpty(str)) {
            TLRPC$User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (this.initialPhoneNumber.startsWith("+")) {
                this.codeField.setText(this.initialPhoneNumber.substring(1));
            } else if (this.initialPhoneNumberWithCountryCode || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.codeField.setText(this.initialPhoneNumber);
            } else {
                String str2 = currentUser.phone;
                int i = 4;
                while (true) {
                    if (i >= 1) {
                        List<CountrySelectActivity.Country> list = this.codesMap.get(str2.substring(0, i));
                        if (list == null || list.size() <= 0) {
                            i--;
                        } else {
                            String str3 = list.get(0).code;
                            this.codeField.setText(str3);
                            if (str3.endsWith("0") && this.initialPhoneNumber.startsWith("0")) {
                                this.initialPhoneNumber = this.initialPhoneNumber.substring(1);
                            }
                        }
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        Context context = ApplicationLoader.applicationContext;
                        if (context != null) {
                            systemService = context.getSystemService((Class<Object>) TelephonyManager.class);
                            country = ((TelephonyManager) systemService).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.codeField.setText(country);
                        if (country.endsWith("0") && this.initialPhoneNumber.startsWith("0")) {
                            this.initialPhoneNumber = this.initialPhoneNumber.substring(1);
                        }
                    }
                }
                this.phoneField.setText(this.initialPhoneNumber);
            }
            this.initialPhoneNumber = null;
        }
        return this;
    }

    public void setInitialName(String str, String str2) {
        OutlineEditText outlineEditText = this.firstNameField;
        if (outlineEditText != null) {
            outlineEditText.getEditText().setText(str);
        } else {
            this.initialFirstName = str;
        }
        OutlineEditText outlineEditText2 = this.lastNameField;
        if (outlineEditText2 != null) {
            outlineEditText2.getEditText().setText(str2);
        } else {
            this.initialLastName = str2;
        }
    }

    public void setCountryHint(String str, CountrySelectActivity.Country country) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(country.shortname);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag);
        }
        setCountryButtonText(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.countryFlag.getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false));
        this.countryCodeForHint = str;
        this.wasCountryHintIndex = -1;
        invalidateCountryHint();
    }

    public void setCountryButtonText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.countryFlag.animate();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            animate.setInterpolator(cubicBezierInterpolator).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.plusTextView.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.codeField.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.countryFlag.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.plusTextView.animate();
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        animate2.setInterpolator(cubicBezierInterpolator2).translationX(0.0f).setDuration(150L);
        this.codeField.animate().setInterpolator(cubicBezierInterpolator2).translationX(0.0f).setDuration(150L);
        this.countryFlag.setText(charSequence);
    }

    private void invalidateCountryHint() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NewContactBottomSheet.invalidateCountryHint():void");
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.ignoreSelection) {
            this.ignoreSelection = false;
            return;
        }
        this.ignoreOnTextChange = true;
        this.codeField.setText(this.countriesArray.get(i).code);
        this.ignoreOnTextChange = false;
    }

    public void selectCountry(CountrySelectActivity.Country country) {
        this.ignoreOnTextChange = true;
        String str = country.code;
        this.codeField.setText(str);
        setCountryHint(str, country);
        this.ignoreOnTextChange = false;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        OutlineEditText outlineEditText = this.firstNameField;
        int i = ThemeDescription.FLAG_TEXTCOLOR;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(outlineEditText, i, null, null, null, null, i2));
        OutlineEditText outlineEditText2 = this.firstNameField;
        int i3 = ThemeDescription.FLAG_HINTTEXTCOLOR;
        int i4 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(outlineEditText2, i3, null, null, null, null, i4));
        OutlineEditText outlineEditText3 = this.firstNameField;
        int i5 = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i6 = Theme.key_windowBackgroundWhiteInputField;
        arrayList.add(new ThemeDescription(outlineEditText3, i5, null, null, null, null, i6));
        OutlineEditText outlineEditText4 = this.firstNameField;
        int i7 = ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE;
        int i8 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        arrayList.add(new ThemeDescription(outlineEditText4, i7, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, Theme.key_contextProgressInner2));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, Theme.key_contextProgressOuter2));
        return arrayList;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NewContactBottomSheet.this.lambda$dismiss$11();
            }
        }, 50L);
    }

    public void lambda$dismiss$11() {
        AndroidUtilities.hideKeyboard(this.contentLayout);
    }
}
