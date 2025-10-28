package org.telegram.ui;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Consumer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.CameraScanActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.OutlineEditText;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.NewContactBottomSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class NewContactBottomSheet extends BottomSheet implements AdapterView.OnItemSelectedListener {
    private CheckBox2 checkBox;
    private LinearLayout checkLayout;
    private TextView checkTextView;
    int classGuid;
    private View codeDividerView;
    private AnimatedPhoneNumberEditText codeField;
    private HashMap codesMap;
    private LinearLayout contentLayout;
    private ArrayList countriesArray;
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
    private String lastPhone;
    private OutlineEditText notesField;
    BaseFragment parentFragment;
    private AnimatedPhoneNumberEditText phoneField;
    private HashMap phoneFormatMap;
    private OutlineTextContainerView phoneOutlineView;
    private ImageView phoneStatusView;
    private TextView plusTextView;
    private RadialProgressView progressView;
    private ButtonWithCounterView qrButton;
    private FrameLayout qrButtonContainer;
    private View qrButtonSeparator;
    private int requestingPhoneId;
    private TextView underPhoneTextView;
    private int wasCountryHintIndex;

    public static class AccountInfo {
    }

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onNothingSelected(AdapterView adapterView) {
    }

    public NewContactBottomSheet(BaseFragment baseFragment, Context context) {
        super(context, true);
        this.countriesArray = new ArrayList();
        this.codesMap = new HashMap();
        this.phoneFormatMap = new HashMap();
        this.requestingPhoneId = -1;
        fixNavigationBar();
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.parentFragment = baseFragment;
        setCustomView(createView(getContext()));
        setTitle(LocaleController.getString(R.string.NewContactTitle), true);
    }

    public android.view.View createView(android.content.Context r33) {
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

    public void lambda$createView$6(View view) {
        this.checkBox.setChecked(!r3.isChecked(), true);
        updateQrButtonVisible(true);
    }

    public class AnonymousClass7 implements CameraScanActivity.CameraScanActivityDelegate {
        @Override
        public void didFindMrzInfo(MrzRecognizer.Result result) {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
        }

        @Override
        public String getSubtitleText() {
            return CameraScanActivity.CameraScanActivityDelegate.CC.$default$getSubtitleText(this);
        }

        @Override
        public void onDismiss() {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$onDismiss(this);
        }

        @Override
        public boolean processQr(String str, Runnable runnable) {
            return CameraScanActivity.CameraScanActivityDelegate.CC.$default$processQr(this, str, runnable);
        }

        AnonymousClass7() {
        }

        @Override
        public void didFindQr(String str) {
            String extractUsername = Browser.extractUsername(str);
            if (!TextUtils.isEmpty(extractUsername)) {
                MessagesController.getInstance(((BottomSheet) NewContactBottomSheet.this).currentAccount).getUserNameResolver().resolve(extractUsername, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        NewContactBottomSheet.AnonymousClass7.lambda$didFindQr$1((Long) obj);
                    }
                });
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        NewContactBottomSheet.AnonymousClass7.lambda$didFindQr$2();
                    }
                });
            }
        }

        public static void lambda$didFindQr$1(Long l) {
            if (l == null || l.longValue() == Long.MAX_VALUE) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        NewContactBottomSheet.AnonymousClass7.lambda$didFindQr$0();
                    }
                });
                return;
            }
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(ProfileActivity.of(l.longValue()));
            }
        }

        public static void lambda$didFindQr$0() {
            BulletinFactory.global().createSimpleBulletin(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).show();
        }

        public static void lambda$didFindQr$2() {
            BulletinFactory.global().createSimpleBulletin(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).show();
        }
    }

    public void lambda$createView$7(View view) {
        lambda$new$0();
        CameraScanActivity.showAsSheet((Activity) LaunchActivity.instance, false, 1, (CameraScanActivity.CameraScanActivityDelegate) new AnonymousClass7());
    }

    public boolean lambda$createView$8(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.codeField.requestFocus();
        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.codeField;
        animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
        return true;
    }

    public void lambda$createView$10(View view) {
        doOnDone();
    }

    private void updateBottomTranslation(boolean z) {
        ViewPropertyAnimator translationY = this.checkLayout.animate().translationY(z ? -AndroidUtilities.dp(21.33f) : 0.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        translationY.setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
        this.qrButtonContainer.animate().translationY(z ? -AndroidUtilities.dp(10.665f) : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
    }

    private void updateQrButtonVisible(boolean z) {
        boolean isChecked = this.checkBox.isChecked();
        final boolean z2 = !isChecked;
        if (z) {
            this.qrButton.setVisibility(0);
            ViewPropertyAnimator alpha = this.qrButton.animate().alpha(!isChecked ? 1.0f : 0.0f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            alpha.setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    NewContactBottomSheet.this.lambda$updateQrButtonVisible$11(z2);
                }
            }).start();
            this.qrButtonSeparator.setVisibility(0);
            this.qrButtonSeparator.animate().alpha(!isChecked ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    NewContactBottomSheet.this.lambda$updateQrButtonVisible$12(z2);
                }
            }).start();
            this.notesField.setVisibility(0);
            this.notesField.animate().alpha(isChecked ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    NewContactBottomSheet.this.lambda$updateQrButtonVisible$13(z2);
                }
            }).start();
            return;
        }
        this.qrButton.animate().cancel();
        this.qrButton.setVisibility(!isChecked ? 0 : 4);
        this.qrButton.setAlpha(!isChecked ? 1.0f : 0.0f);
        this.qrButtonSeparator.animate().cancel();
        this.qrButtonSeparator.setVisibility(!isChecked ? 0 : 8);
        this.qrButtonSeparator.setAlpha(!isChecked ? 1.0f : 0.0f);
        this.notesField.animate().cancel();
        this.notesField.setVisibility(isChecked ? 0 : 4);
        this.notesField.setAlpha(isChecked ? 1.0f : 0.0f);
    }

    public void lambda$updateQrButtonVisible$11(boolean z) {
        if (z) {
            return;
        }
        this.qrButton.setVisibility(4);
    }

    public void lambda$updateQrButtonVisible$12(boolean z) {
        if (z) {
            return;
        }
        this.qrButtonSeparator.setVisibility(4);
    }

    public void lambda$updateQrButtonVisible$13(boolean z) {
        if (z) {
            this.notesField.setVisibility(4);
        }
    }

    public void updatedTextPhone() {
        String replaceAll = (this.codeField.getText().toString() + this.phoneField.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) this.codesMap.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) this.phoneFormatMap.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            if (z) {
                break;
            }
        }
        if (!z) {
            if (TextUtils.isEmpty(this.lastPhone)) {
                return;
            }
            this.lastPhone = null;
            updatedPhone(null);
            return;
        }
        if (TextUtils.equals(this.lastPhone, replaceAll)) {
            return;
        }
        this.lastPhone = replaceAll;
        updatedPhone(replaceAll);
    }

    private void updatedPhone(final String str) {
        if (this.requestingPhoneId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestingPhoneId, true);
            this.requestingPhoneId = -1;
        }
        if (TextUtils.isEmpty(str)) {
            this.phoneStatusView.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
            this.underPhoneTextView.setText("");
            updateBottomTranslation(true);
            return;
        }
        this.phoneStatusView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
        this.phoneStatusView.setImageDrawable(new CircularProgressDrawable(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(Theme.key_dialogTextBlue)));
        this.underPhoneTextView.setText("");
        updateBottomTranslation(true);
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                NewContactBottomSheet.this.lambda$updatedPhone$16(str, (TLRPC.User) obj);
            }
        };
        final TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(PhoneFormat.stripExceptNumbers(str));
        if (tL_contact != null) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                callback.run(user);
                return;
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        NewContactBottomSheet.this.lambda$updatedPhone$18(tL_contact, callback);
                    }
                });
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = PhoneFormat.stripExceptNumbers(str);
        this.requestingPhoneId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NewContactBottomSheet.this.lambda$updatedPhone$20(callback, tLObject, tL_error);
            }
        });
    }

    public void lambda$updatedPhone$16(final String str, final TLRPC.User user) {
        if (user == null) {
            this.phoneStatusView.setImageDrawable(null);
            this.underPhoneTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new Runnable() {
                @Override
                public final void run() {
                    NewContactBottomSheet.this.lambda$updatedPhone$14(str);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), PorterDuff.Mode.SRC_IN));
            this.phoneStatusView.setImageDrawable(mutate);
            if (user.contact) {
                this.underPhoneTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new Runnable() {
                    @Override
                    public final void run() {
                        NewContactBottomSheet.this.lambda$updatedPhone$15(user);
                    }
                }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            } else {
                this.underPhoneTextView.setText("This phone number is on Telegram.");
            }
        }
        updateBottomTranslation(false);
    }

    public void lambda$updatedPhone$14(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:+" + str));
        intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
        getContext().startActivity(intent);
    }

    public void lambda$updatedPhone$15(TLRPC.User user) {
        lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ProfileActivity.of(user.id));
        }
    }

    public void lambda$updatedPhone$18(TLRPC.TL_contact tL_contact, final Utilities.Callback callback) {
        final TLRPC.User user = MessagesStorage.getInstance(this.currentAccount).getUser(tL_contact.user_id);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Utilities.Callback.this.run(user);
            }
        });
    }

    public void lambda$updatedPhone$20(final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NewContactBottomSheet.this.lambda$updatedPhone$19(tLObject, callback);
            }
        });
    }

    public void lambda$updatedPhone$19(TLObject tLObject, Utilities.Callback callback) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                callback.run(user);
            }
        }
        user = null;
        callback.run(user);
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
        if (this.checkBox.isChecked()) {
            PermissionRequest.ensurePermission(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, "android.permission.WRITE_CONTACTS", new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    NewContactBottomSheet.this.lambda$doOnDone$21((Boolean) obj);
                }
            });
        } else {
            done();
        }
    }

    public void lambda$doOnDone$21(Boolean bool) {
        if (bool.booleanValue()) {
            done();
        }
    }

    private void done() {
        this.donePressed = true;
        showEditDoneProgress(true, true);
        String str = "+" + this.codeField.getText().toString() + this.phoneField.getText().toString();
        String obj = this.firstNameField.getEditText().getText().toString();
        String obj2 = this.lastNameField.getEditText().getText().toString();
        String obj3 = this.notesField.getVisibility() == 0 ? this.notesField.getEditText().getText().toString() : "";
        final TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        final TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = obj;
        tL_inputPhoneContact.last_name = obj2;
        tL_inputPhoneContact.phone = str;
        if (!TextUtils.isEmpty(obj3)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = obj3;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NewContactBottomSheet.this.lambda$done$23(tL_inputPhoneContact, tL_contacts_importContacts, tLObject, tL_error);
            }
        }, 2), this.classGuid);
        if (this.checkBox.isChecked()) {
            saveContact(getContext(), str, obj, obj2, null, null);
        }
    }

    public void lambda$done$23(final TLRPC.TL_inputPhoneContact tL_inputPhoneContact, final TLRPC.TL_contacts_importContacts tL_contacts_importContacts, TLObject tLObject, final TLRPC.TL_error tL_error) {
        final TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NewContactBottomSheet.this.lambda$done$22(tL_contacts_importedContacts, tL_inputPhoneContact, tL_error, tL_contacts_importContacts);
            }
        });
    }

    public void lambda$done$22(TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.donePressed = false;
        if (tL_contacts_importedContacts != null) {
            if (!tL_contacts_importedContacts.users.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
                MessagesController.getInstance(this.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, this.parentFragment, 1, false);
                lambda$new$0();
                return;
            } else {
                if (this.parentFragment.getParentActivity() == null) {
                    return;
                }
                showEditDoneProgress(false, true);
                AlertsCreator.createContactInviteDialog(this.parentFragment, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                return;
            }
        }
        showEditDoneProgress(false, true);
        AlertsCreator.processError(this.currentAccount, tL_error, this.parentFragment, tL_contacts_importContacts, new Object[0]);
    }

    @Override
    public void show() {
        super.show();
        this.firstNameField.getEditText().requestFocus();
        this.firstNameField.getEditText().setSelection(this.firstNameField.getEditText().length());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NewContactBottomSheet.this.lambda$show$24();
            }
        }, 50L);
    }

    public void lambda$show$24() {
        AndroidUtilities.showKeyboard(this.firstNameField.getEditText());
    }

    private void showEditDoneProgress(boolean z, boolean z2) {
        AndroidUtilities.updateViewVisibilityAnimated(this.doneButton, !z, 0.5f, z2);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, z, 0.5f, z2);
    }

    public static String getPhoneNumber(Context context, TLRPC.User user, String str, boolean z) {
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
        if (z || user == null || TextUtils.isEmpty(user.phone)) {
            return "+" + str;
        }
        String str2 = user.phone;
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
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (this.initialPhoneNumber.startsWith("+")) {
                this.codeField.setText(this.initialPhoneNumber.substring(1));
            } else if (this.initialPhoneNumberWithCountryCode || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.codeField.setText(this.initialPhoneNumber);
            } else {
                String str2 = currentUser.phone;
                int i = 4;
                while (true) {
                    if (i >= 1) {
                        List list = (List) this.codesMap.get(str2.substring(0, i));
                        if (list == null || list.size() <= 0) {
                            i--;
                        } else {
                            String str3 = ((CountrySelectActivity.Country) list.get(0)).code;
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
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.countryFlag.getPaint().getFontMetricsInt(), false));
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
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.ignoreSelection) {
            this.ignoreSelection = false;
            return;
        }
        this.ignoreOnTextChange = true;
        this.codeField.setText(((CountrySelectActivity.Country) this.countriesArray.get(i)).code);
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
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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
    public void lambda$new$0() {
        super.lambda$new$0();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NewContactBottomSheet.this.lambda$dismiss$25();
            }
        }, 50L);
    }

    public void lambda$dismiss$25() {
        AndroidUtilities.hideKeyboard(this.contentLayout);
    }

    public static boolean saveContact(Context context, String str, String str2, String str3, String str4, AccountInfo accountInfo) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        newInsert.withValue("account_type", null);
        newInsert.withValue("account_name", null);
        arrayList.add(newInsert.build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
        if (!TextUtils.isEmpty(str2)) {
            withValue = withValue.withValue("data2", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            withValue = withValue.withValue("data2", str3);
        }
        arrayList.add(withValue.build());
        if (str != null && !str.isEmpty()) {
            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str).withValue("data2", 2).build());
        }
        if (str4 != null && !str4.isEmpty()) {
            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/note").withValue("data1", str4).build());
        }
        try {
            context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            return true;
        } catch (OperationApplicationException | RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
