package org.telegram.p009ui;

import android.content.Context;
import android.os.Vibrator;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.p009ui.Components.ContextProgressView;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.OutlineEditText;
import org.telegram.p009ui.Components.OutlineTextContainerView;
import org.telegram.p009ui.Components.RadialProgressView;
import org.telegram.p009ui.CountrySelectActivity;
import org.telegram.p009ui.NewContactBottomSheet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_contacts_importContacts;
import org.telegram.tgnet.TLRPC$TL_contacts_importedContacts;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPhoneContact;
import org.telegram.tgnet.TLRPC$User;

public class NewContactBottomSheet extends BottomSheet implements AdapterView.OnItemSelectedListener {
    int classGuid;
    private View codeDividerView;
    private AnimatedPhoneNumberEditText codeField;
    private HashMap<String, List<CountrySelectActivity.Country>> codesMap;
    private LinearLayout contentLayout;
    private ArrayList<CountrySelectActivity.Country> countriesArray;
    private String countryCodeForHint;
    private TextView countryFlag;
    private int countryState;
    private CountrySelectActivity.Country currentCountry;
    private TextView doneButton;
    private FrameLayout doneButtonContainer;
    private boolean donePressed;
    private ContextProgressView editDoneItemProgress;
    private OutlineEditText firstNameField;
    private boolean ignoreOnPhoneChange;
    private boolean ignoreOnPhoneChangePaste;
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
        this.smoothKeyboardAnimationEnabled = true;
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.parentFragment = baseFragment;
        setCustomView(createView(getContext()));
        setTitle(LocaleController.getString("NewContactTitle", C1072R.string.NewContactTitle), true);
    }

    public android.view.View createView(android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.NewContactBottomSheet.createView(android.content.Context):android.view.View");
    }

    public boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            this.lastNameField.requestFocus();
            this.lastNameField.getEditText().setSelection(this.lastNameField.getEditText().length());
            return true;
        }
        return false;
    }

    public boolean lambda$createView$2(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            this.codeField.requestFocus();
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.codeField;
            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
            return true;
        }
        return false;
    }

    public class C36191 extends TextView {
        final NotificationCenter.NotificationCenterDelegate delegate;

        C36191(NewContactBottomSheet newContactBottomSheet, Context context) {
            super(context);
            this.delegate = new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                    NewContactBottomSheet.C36191.this.lambda$$0(i, i2, objArr);
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

    public class C36202 implements CountrySelectActivity.CountrySelectActivityDelegate {
        C36202() {
        }

        @Override
        public void didSelectCountry(CountrySelectActivity.Country country) {
            NewContactBottomSheet.this.selectCountry(country);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NewContactBottomSheet.C36202.this.lambda$didSelectCountry$0();
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
        countrySelectActivity.setCountrySelectActivityDelegate(new C36202());
        this.parentFragment.showAsSheet(countrySelectActivity);
    }

    public boolean lambda$createView$4(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            this.phoneField.requestFocus();
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
            return true;
        }
        return false;
    }

    public boolean lambda$createView$5(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            this.doneButtonContainer.callOnClick();
            return true;
        }
        return false;
    }

    public void lambda$createView$7(View view) {
        doOnDone();
    }

    private void doOnDone() {
        if (this.donePressed) {
            return;
        }
        if (this.firstNameField.getEditText().length() == 0) {
            Vibrator vibrator = (Vibrator) this.parentFragment.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.firstNameField);
        } else if (this.codeField.length() == 0) {
            Vibrator vibrator2 = (Vibrator) this.parentFragment.getParentActivity().getSystemService("vibrator");
            if (vibrator2 != null) {
                vibrator2.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.codeField);
        } else if (this.phoneField.length() == 0) {
            Vibrator vibrator3 = (Vibrator) this.parentFragment.getParentActivity().getSystemService("vibrator");
            if (vibrator3 != null) {
                vibrator3.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.phoneField);
        } else {
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
                MessagesController.openChatOrProfileWith(tLRPC$TL_contacts_importedContacts.users.get(0), null, this.parentFragment, 1, true);
                dismiss();
                return;
            } else if (this.parentFragment.getParentActivity() == null) {
                return;
            } else {
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
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NewContactBottomSheet.this.lambda$show$10();
            }
        }, 200L);
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
            FileLog.m32e(e);
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

    public void setInitialPhoneNumber(String str, boolean z) {
        this.initialPhoneNumber = str;
        this.initialPhoneNumberWithCountryCode = z;
    }

    public void setInitialName(String str, String str2) {
        this.initialFirstName = str;
        this.initialLastName = str2;
    }

    public void setCountryHint(String str, CountrySelectActivity.Country country) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(country.shortname);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag);
        }
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.countryFlag.getPaint().getFontMetricsInt(), AndroidUtilities.m36dp(20.0f), false));
        this.countryCodeForHint = str;
        this.wasCountryHintIndex = -1;
        invalidateCountryHint();
    }

    public void setCountryButtonText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.countryFlag.animate();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            animate.setInterpolator(cubicBezierInterpolator).translationY(AndroidUtilities.m36dp(30.0f)).setDuration(150L);
            this.plusTextView.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.m36dp(30.0f)).setDuration(150L);
            this.codeField.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.m36dp(30.0f)).setDuration(150L);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.NewContactBottomSheet.invalidateCountryHint():void");
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
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.codeField, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.phoneField, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, "contextProgressInner2"));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, "contextProgressOuter2"));
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
