package org.telegram.ui;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzig;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.OutlineEditText;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class NewContactBottomSheet extends BottomSheet implements AdapterView.OnItemSelectedListener {
    private AccountInfo account;
    private OutlineTextContainerView accountOutlineView;
    private LinkSpanDrawable.LinksTextView accountTextView;
    private CheckBox2 checkBox;
    private LinearLayout checkLayout;
    private TextView checkTextView;
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
    private boolean ignoreOnPhoneChangePaste;
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
    private HashMap<String, List<String>> phoneFormatMap;
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

    public class AnonymousClass1 extends TextView {
        final NotificationCenter.NotificationCenterDelegate delegate;

        public AnonymousClass1(Context context) {
            super(context);
            this.delegate = new CountrySelectActivity$4$$ExternalSyntheticLambda0(this, 1);
        }

        public void lambda$$0(int i, int i2, Object[] objArr) {
            invalidate();
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this.delegate, NotificationCenter.emojiLoaded);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this.delegate, NotificationCenter.emojiLoaded);
        }
    }

    public class AnonymousClass2 implements CountrySelectActivity.CountrySelectActivityDelegate {
        public AnonymousClass2() {
        }

        public void lambda$didSelectCountry$0() {
            AndroidUtilities.showKeyboard(NewContactBottomSheet.this.phoneField);
        }

        @Override
        public void didSelectCountry(CountrySelectActivity.Country country) {
            NewContactBottomSheet.this.selectCountry(country);
            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda60(this, 8), 300L);
            NewContactBottomSheet.this.phoneField.requestFocus();
            NewContactBottomSheet.this.phoneField.setSelection(NewContactBottomSheet.this.phoneField.length());
        }
    }

    public class AnonymousClass7 implements CameraScanActivity.CameraScanActivityDelegate {
        public AnonymousClass7() {
        }

        public static void lambda$didFindQr$0() {
            BulletinFactory.global().createSimpleBulletin(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).show();
        }

        public static void lambda$didFindQr$1(Long l) {
            if (l == null || l.longValue() == Long.MAX_VALUE) {
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda5(1));
                return;
            }
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(ProfileActivity.of(l.longValue()));
            }
        }

        public static void lambda$didFindQr$2() {
            BulletinFactory.global().createSimpleBulletin(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).show();
        }

        @Override
        public final void didFindMrzInfo(MrzRecognizer.Result result) {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
        }

        @Override
        public void didFindQr(String str) {
            String strExtractUsername = Browser.extractUsername(str);
            if (TextUtils.isEmpty(strExtractUsername)) {
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda5(2));
            } else {
                MessagesController.getInstance(((BottomSheet) NewContactBottomSheet.this).currentAccount).getUserNameResolver().resolve(strExtractUsername, new ChatActivity$$ExternalSyntheticLambda117(1));
            }
        }

        @Override
        public final String getSubtitleText() {
            return CameraScanActivity.CameraScanActivityDelegate.CC.$default$getSubtitleText(this);
        }

        @Override
        public final void onDismiss() {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$onDismiss(this);
        }

        @Override
        public final boolean processQr(String str, Runnable runnable) {
            return CameraScanActivity.CameraScanActivityDelegate.CC.$default$processQr(this, str, runnable);
        }
    }

    public static class AccountInfo {
        public String displayName;
        public String name;
        public String type;

        public String toString() {
            StringBuilder sb = new StringBuilder("Account \"");
            sb.append(this.displayName);
            sb.append("\" {name='");
            sb.append(this.name);
            sb.append("', type='");
            return MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, this.type, "'}");
        }
    }

    public NewContactBottomSheet(BaseFragment baseFragment, Context context) {
        super(context, true, false, null);
        this.countriesArray = new ArrayList<>();
        this.codesMap = new HashMap<>();
        this.phoneFormatMap = new HashMap<>();
        this.requestingPhoneId = -1;
        fixNavigationBar();
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.parentFragment = baseFragment;
        setCustomView(createView(getContext()));
        setTitle(LocaleController.getString(R.string.NewContactTitle), true);
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
            PermissionRequest.ensurePermission(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, "android.permission.WRITE_CONTACTS", new PollItemMenu$$ExternalSyntheticLambda15(this, 14));
        } else {
            done();
        }
    }

    private void done() {
        this.donePressed = true;
        showEditDoneProgress(true, true);
        String str = "+" + this.codeField.getText().toString() + this.phoneField.getText().toString();
        String string = this.firstNameField.getEditText().getText().toString();
        String string2 = this.lastNameField.getEditText().getText().toString();
        String string3 = this.notesField.getVisibility() == 0 ? this.notesField.getEditText().getText().toString() : "";
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = string;
        tL_inputPhoneContact.last_name = string2;
        tL_inputPhoneContact.phone = str;
        if (!TextUtils.isEmpty(string3)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = string3;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new ProfileActivity$$ExternalSyntheticLambda2(this, tL_inputPhoneContact, tL_contacts_importContacts, 1), 2), this.classGuid);
        if (this.checkBox.isChecked()) {
            saveContact(getContext(), str, string, string2, null, this.account);
        }
    }

    public static ArrayList<AccountInfo> getAllAccounts(Context context) {
        ArrayList<AccountInfo> arrayList = new ArrayList<>();
        for (Account account : AccountManager.get(context).getAccounts()) {
            AccountInfo accountInfo = new AccountInfo();
            accountInfo.name = account.name;
            accountInfo.type = account.type;
            accountInfo.displayName = getDisplayNameForAccount(context, account);
            arrayList.add(accountInfo);
        }
        return arrayList;
    }

    private static String getDisplayNameForAccount(Context context, Account account) {
        String str = account.type;
        String str2 = account.name;
        if (str.equals("com.google")) {
            return str2;
        }
        if (!str.contains("sim") && !str.contains("usim")) {
            return (str.equals("com.android.localphone") || str2 == null || str2.isEmpty() || str2.equals("Device")) ? "Device" : str2;
        }
        String simPhoneNumber = getSimPhoneNumber(context, str2);
        if (simPhoneNumber == null || simPhoneNumber.isEmpty()) {
            return (str2 == null || str2.isEmpty()) ? "SIM Card" : str2;
        }
        return simPhoneNumber;
    }

    public static String getPhoneNumber(Context context, TLRPC.User user, String str, boolean z) {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                map.put(strArrSplit[0], strArrSplit[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!str.startsWith("+")) {
            if (z || user == null || TextUtils.isEmpty(user.phone)) {
                return "+".concat(str);
            }
            String str2 = user.phone;
            for (int i = 4; i >= 1; i--) {
                String strSubstring = str2.substring(0, i);
                if (((String) map.get(strSubstring)) != null) {
                    return zzig.m("+", strSubstring, str);
                }
            }
        }
        return str;
    }

    private static String getSimPhoneNumber(Context context, String str) {
        String line1Number;
        SubscriptionManager subscriptionManagerM2786m;
        List activeSubscriptionInfoList;
        if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 22 && (subscriptionManagerM2786m = LoginActivity$$ExternalSyntheticApiModelOutline2.m2786m(context.getSystemService("telephony_subscription_service"))) != null && (activeSubscriptionInfoList = subscriptionManagerM2786m.getActiveSubscriptionInfoList()) != null) {
                Iterator it = activeSubscriptionInfoList.iterator();
                while (it.hasNext()) {
                    String number = LoginActivity$$ExternalSyntheticApiModelOutline2.m(it.next()).getNumber();
                    if (number != null && !number.isEmpty()) {
                        return number;
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null || (line1Number = telephonyManager.getLine1Number()) == null || line1Number.isEmpty()) {
                return null;
            }
            return line1Number;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void invalidateCountryHint() {
        int i;
        int i2;
        String str = this.countryCodeForHint;
        String strReplace = this.phoneField.getText() != null ? this.phoneField.getText().toString().replace(" ", "") : "";
        if (this.phoneFormatMap.get(str) == null || this.phoneFormatMap.get(str).isEmpty()) {
            if (this.wasCountryHintIndex != -1) {
                int selectionStart = this.phoneField.getSelectionStart();
                int selectionEnd = this.phoneField.getSelectionEnd();
                this.phoneField.setHintText((String) null);
                this.phoneField.setSelection(selectionStart, selectionEnd);
                this.wasCountryHintIndex = -1;
                return;
            }
            return;
        }
        List<String> list = this.phoneFormatMap.get(str);
        if (strReplace.isEmpty()) {
            i = -1;
            break;
        }
        i = 0;
        while (true) {
            if (i >= list.size()) {
                i = -1;
                break;
            } else if (strReplace.startsWith(list.get(i).replace(" ", "").replace("X", "").replace("0", ""))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                String str2 = list.get(i3);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i = i3;
                    break;
                }
            }
            i2 = i != -1 ? i : 0;
        }
        if (this.wasCountryHintIndex != i2) {
            String str3 = this.phoneFormatMap.get(str).get(i2);
            int selectionStart2 = this.phoneField.getSelectionStart();
            int selectionEnd2 = this.phoneField.getSelectionEnd();
            this.phoneField.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.phoneField.setSelection(selectionStart2, selectionEnd2);
            this.wasCountryHintIndex = i2;
        }
    }

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.lastNameField.requestFocus();
        this.lastNameField.getEditText().setSelection(this.lastNameField.getEditText().length());
        return true;
    }

    public void lambda$createView$10(View view) {
        doOnDone();
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
        CheckBox2 checkBox2 = this.checkBox;
        checkBox2.setChecked(!checkBox2.isChecked(), true);
        updateQrButtonVisible(true);
    }

    public void lambda$createView$7(View view) {
        lambda$showGiftOfferSheet$15();
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

    public void lambda$dismiss$25() {
        AndroidUtilities.hideKeyboard(this.contentLayout);
    }

    public void lambda$doOnDone$21(Boolean bool) {
        if (bool.booleanValue()) {
            done();
        }
    }

    public void lambda$done$22(TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.donePressed = false;
        if (tL_contacts_importedContacts == null) {
            showEditDoneProgress(false, true);
            AlertsCreator.processError(this.currentAccount, tL_error, this.parentFragment, tL_contacts_importContacts, new Object[0]);
        } else if (!tL_contacts_importedContacts.users.isEmpty()) {
            MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
            MessagesController.getInstance(this.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, this.parentFragment, 1, false);
            lambda$showGiftOfferSheet$15();
        } else {
            if (this.parentFragment.getParentActivity() == null) {
                return;
            }
            showEditDoneProgress(false, true);
            AlertsCreator.createContactInviteDialog(this.parentFragment, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
        }
    }

    public void lambda$done$23(TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((KeyEvent.Callback) this, tLObject, (Object) tL_inputPhoneContact, tL_error, (TLObject) tL_contacts_importContacts, 29));
    }

    public void lambda$show$24() {
        AndroidUtilities.showKeyboard(this.firstNameField.getEditText());
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

    public void lambda$updatedPhone$14(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:+" + str));
        intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
        getContext().startActivity(intent);
    }

    public void lambda$updatedPhone$15(TLRPC.User user) {
        lambda$showGiftOfferSheet$15();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ProfileActivity.of(user.id));
        }
    }

    public void lambda$updatedPhone$16(String str, TLRPC.User user) {
        if (user == null) {
            this.phoneStatusView.setImageDrawable(null);
            this.underPhoneTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new PhotoViewer$$ExternalSyntheticLambda15(16, this, str)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else {
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), PorterDuff.Mode.SRC_IN));
            this.phoneStatusView.setImageDrawable(drawableMutate);
            if (user.contact) {
                this.underPhoneTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new PhotoViewer$$ExternalSyntheticLambda15(17, this, user)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            } else {
                this.underPhoneTextView.setText("This phone number is on Telegram.");
            }
        }
        updateBottomTranslation(false);
    }

    public void lambda$updatedPhone$18(TLRPC.TL_contact tL_contact, Utilities.Callback callback) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(callback, MessagesStorage.getInstance(this.currentAccount).getUser(tL_contact.user_id), 1));
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
            } else {
                user = null;
            }
        } else {
            user = null;
        }
        callback.run(user);
    }

    public void lambda$updatedPhone$20(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25(this, tLObject, callback, 15));
    }

    public static boolean saveContact(Context context, String str, String str2, String str3, String str4, AccountInfo accountInfo) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder builderNewInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        if (accountInfo != null) {
            builderNewInsert.withValue("account_type", accountInfo.type);
            builderNewInsert.withValue("account_name", accountInfo.name);
        } else {
            builderNewInsert.withValue("account_type", null);
            builderNewInsert.withValue("account_name", null);
        }
        arrayList.add(builderNewInsert.build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
        if (!TextUtils.isEmpty(str2)) {
            builderWithValue = builderWithValue.withValue("data2", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            builderWithValue = builderWithValue.withValue("data2", str3);
        }
        arrayList.add(builderWithValue.build());
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

    public void setCountryButtonText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.countryFlag.animate();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            viewPropertyAnimatorAnimate.setInterpolator(cubicBezierInterpolator).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.plusTextView.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.codeField.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.countryFlag.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = this.plusTextView.animate();
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
        viewPropertyAnimatorAnimate2.setInterpolator(cubicBezierInterpolator2).translationX(0.0f).setDuration(150L);
        this.codeField.animate().setInterpolator(cubicBezierInterpolator2).translationX(0.0f).setDuration(150L);
        this.countryFlag.setText(charSequence);
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

    private void showEditDoneProgress(boolean z, boolean z2) {
        AndroidUtilities.updateViewVisibilityAnimated(this.doneButton, !z, 0.5f, z2);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, z, 0.5f, z2);
    }

    private void updateBottomTranslation(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.checkLayout.animate().translationY(z ? -AndroidUtilities.dp(21.33f) : 0.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        OKLCH.m(viewPropertyAnimatorTranslationY, cubicBezierInterpolator, 420L);
        this.qrButtonContainer.animate().translationY(z ? -AndroidUtilities.dp(10.665f) : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
    }

    private void updateQrButtonVisible(boolean z) {
        boolean zIsChecked = this.checkBox.isChecked();
        final boolean z2 = !zIsChecked;
        if (!z) {
            this.qrButton.animate().cancel();
            this.qrButton.setVisibility(!zIsChecked ? 0 : 4);
            this.qrButton.setAlpha(!zIsChecked ? 1.0f : 0.0f);
            this.qrButtonSeparator.animate().cancel();
            this.qrButtonSeparator.setVisibility(!zIsChecked ? 0 : 8);
            this.qrButtonSeparator.setAlpha(!zIsChecked ? 1.0f : 0.0f);
            this.notesField.animate().cancel();
            this.notesField.setVisibility(zIsChecked ? 0 : 4);
            this.notesField.setAlpha(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        this.qrButton.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.qrButton.animate().alpha(!zIsChecked ? 1.0f : 0.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        final int i = 0;
        viewPropertyAnimatorAlpha.setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$updateQrButtonVisible$11(z2);
                        break;
                    case 1:
                        this.f$0.lambda$updateQrButtonVisible$12(z2);
                        break;
                    default:
                        this.f$0.lambda$updateQrButtonVisible$13(z2);
                        break;
                }
            }
        }).start();
        this.qrButtonSeparator.setVisibility(0);
        final int i2 = 1;
        this.qrButtonSeparator.animate().alpha(!zIsChecked ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$updateQrButtonVisible$11(z2);
                        break;
                    case 1:
                        this.f$0.lambda$updateQrButtonVisible$12(z2);
                        break;
                    default:
                        this.f$0.lambda$updateQrButtonVisible$13(z2);
                        break;
                }
            }
        }).start();
        this.notesField.setVisibility(0);
        final int i3 = 2;
        this.notesField.animate().alpha(zIsChecked ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$updateQrButtonVisible$11(z2);
                        break;
                    case 1:
                        this.f$0.lambda$updateQrButtonVisible$12(z2);
                        break;
                    default:
                        this.f$0.lambda$updateQrButtonVisible$13(z2);
                        break;
                }
            }
        }).start();
    }

    private void updatedPhone(String str) {
        if (this.requestingPhoneId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestingPhoneId, true);
            this.requestingPhoneId = -1;
        }
        if (TextUtils.isEmpty(str)) {
            OKLCH.m(this.phoneStatusView.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 420L);
            this.underPhoneTextView.setText("");
            updateBottomTranslation(true);
            return;
        }
        OKLCH.m(this.phoneStatusView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 420L);
        this.phoneStatusView.setImageDrawable(new CircularProgressDrawable(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(Theme.key_dialogTextBlue)));
        this.underPhoneTextView.setText("");
        updateBottomTranslation(true);
        OAuthSheet$$ExternalSyntheticLambda1 oAuthSheet$$ExternalSyntheticLambda1 = new OAuthSheet$$ExternalSyntheticLambda1(24, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(PhoneFormat.stripExceptNumbers(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = PhoneFormat.stripExceptNumbers(str, false);
            this.requestingPhoneId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new LinkManager$$ExternalSyntheticLambda15(6, this, oAuthSheet$$ExternalSyntheticLambda1));
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                oAuthSheet$$ExternalSyntheticLambda1.run(user);
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new LinkManager$$ExternalSyntheticLambda25(this, tL_contact, oAuthSheet$$ExternalSyntheticLambda1, 16));
            }
        }
    }

    public void updatedTextPhone() {
        String strReplaceAll = (this.codeField.getText().toString() + this.phoneField.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z = false;
        for (int iMin = Math.min(3, strReplaceAll.length()); iMin >= 0; iMin--) {
            String strSubstring = strReplaceAll.substring(0, iMin);
            List<CountrySelectActivity.Country> list = this.codesMap.get(strSubstring);
            if (list == null || list.isEmpty()) {
                if (z) {
                    break;
                }
            } else {
                List<String> list2 = this.phoneFormatMap.get(strSubstring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator<String> it = list2.iterator();
                    while (it.hasNext()) {
                        if (strReplaceAll.length() - iMin >= it.next().replace(" ", "").length()) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        break;
                        break;
                    }
                }
            }
        }
        if (z) {
            if (TextUtils.equals(this.lastPhone, strReplaceAll)) {
                return;
            }
            this.lastPhone = strReplaceAll;
            updatedPhone(strReplaceAll);
            return;
        }
        if (TextUtils.isEmpty(this.lastPhone)) {
            return;
        }
        this.lastPhone = null;
        updatedPhone(null);
    }

    public View createView(Context context) {
        String upperCase;
        String str;
        CountrySelectActivity.Country country;
        final int i = 1;
        ContextProgressView contextProgressView = new ContextProgressView(context, 1);
        this.editDoneItemProgress = contextProgressView;
        contextProgressView.setVisibility(4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.contentLayout = linearLayout;
        final int i2 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.contentLayout.setOrientation(1);
        scrollView.addView(this.contentLayout, LayoutHelper.createScroll(-1, -2, 51));
        this.contentLayout.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(19));
        FrameLayout frameLayout = new FrameLayout(context);
        this.contentLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
        OutlineEditText outlineEditText = new OutlineEditText(context);
        this.firstNameField = outlineEditText;
        outlineEditText.getEditText().setInputType(49152);
        this.firstNameField.getEditText().setImeOptions(5);
        this.firstNameField.setHint(LocaleController.getString(R.string.FirstName));
        if (this.initialFirstName != null) {
            this.firstNameField.getEditText().setText(this.initialFirstName);
            this.initialFirstName = null;
        }
        frameLayout.addView(this.firstNameField, LayoutHelper.createFrame(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.firstNameField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                switch (i2) {
                    case 0:
                        return this.f$0.lambda$createView$1(textView, i3, keyEvent);
                    case 1:
                        return this.f$0.lambda$createView$2(textView, i3, keyEvent);
                    case 2:
                        return this.f$0.lambda$createView$4(textView, i3, keyEvent);
                    case 3:
                        return this.f$0.lambda$createView$5(textView, i3, keyEvent);
                    default:
                        return this.f$0.lambda$createView$8(textView, i3, keyEvent);
                }
            }
        });
        OutlineEditText outlineEditText2 = new OutlineEditText(context);
        this.lastNameField = outlineEditText2;
        outlineEditText2.setBackground(null);
        this.lastNameField.getEditText().setInputType(49152);
        this.lastNameField.getEditText().setImeOptions(5);
        this.lastNameField.setHint(LocaleController.getString(R.string.LastName));
        if (this.initialLastName != null) {
            this.lastNameField.getEditText().setText(this.initialLastName);
            this.initialLastName = null;
        }
        frameLayout.addView(this.lastNameField, LayoutHelper.createFrame(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        this.lastNameField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        return this.f$0.lambda$createView$1(textView, i3, keyEvent);
                    case 1:
                        return this.f$0.lambda$createView$2(textView, i3, keyEvent);
                    case 2:
                        return this.f$0.lambda$createView$4(textView, i3, keyEvent);
                    case 3:
                        return this.f$0.lambda$createView$5(textView, i3, keyEvent);
                    default:
                        return this.f$0.lambda$createView$8(textView, i3, keyEvent);
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
        this.phoneOutlineView = outlineTextContainerView;
        outlineTextContainerView.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        OutlineTextContainerView outlineTextContainerView2 = this.phoneOutlineView;
        int i3 = R.string.PhoneNumber;
        outlineTextContainerView2.setText(LocaleController.getString(i3));
        this.contentLayout.addView(this.phoneOutlineView, LayoutHelper.createLinear(-1, 58, 0.0f, 12.0f, 0.0f, 6.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        this.underPhoneTextView = linksTextView;
        linksTextView.setTextSize(1, 12.0f);
        this.underPhoneTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        this.underPhoneTextView.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        this.contentLayout.addView(this.underPhoneTextView, LayoutHelper.createLinear(-1, -2, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.countryFlag = anonymousClass1;
        anonymousClass1.setTextSize(1, 16.0f);
        this.countryFlag.setFocusable(false);
        this.countryFlag.setGravity(17);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$createView$10(view);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view);
                        break;
                    case 2:
                        this.f$0.lambda$createView$6(view);
                        break;
                    default:
                        this.f$0.lambda$createView$7(view);
                        break;
                }
            }
        });
        int iDp = AndroidUtilities.dp(6.0f);
        int i4 = Theme.key_listSelector;
        int color = Theme.getColor(null, i4, false);
        frameLayout2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, color, color));
        frameLayout2.addView(this.countryFlag, LayoutHelper.createFrame(-1, -2, 16));
        linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(42, -1));
        TextView textView = new TextView(context);
        this.plusTextView = textView;
        textView.setText("+");
        this.plusTextView.setTextSize(1, 16.0f);
        this.plusTextView.setFocusable(false);
        linearLayout2.addView(this.plusTextView, LayoutHelper.createLinear(-2, -2));
        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = new AnimatedPhoneNumberEditText(context) {
            @Override
            public void onFocusChanged(boolean z, int i5, Rect rect) {
                super.onFocusChanged(z, i5, rect);
                NewContactBottomSheet.this.phoneOutlineView.animateSelection((z || NewContactBottomSheet.this.phoneField.isFocused()) ? 1.0f : 0.0f);
            }
        };
        this.codeField = animatedPhoneNumberEditText;
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        animatedPhoneNumberEditText.setTextColor(Theme.getColor(null, i5, false));
        this.codeField.setInputType(3);
        this.codeField.setCursorSize(AndroidUtilities.dp(20.0f));
        this.codeField.setCursorWidth(1.5f);
        this.codeField.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        this.codeField.setTextSize(1, 16.0f);
        this.codeField.setMaxLines(1);
        this.codeField.setGravity(19);
        this.codeField.setImeOptions(268435461);
        this.codeField.setBackground(null);
        this.codeField.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(this.codeField, LayoutHelper.createLinear(55, 36, -9.0f, 0.0f, 0.0f, 0.0f));
        this.codeField.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                String str2;
                boolean z;
                CountrySelectActivity.Country country2;
                CountrySelectActivity.Country country3;
                if (NewContactBottomSheet.this.ignoreOnTextChange) {
                    return;
                }
                NewContactBottomSheet.this.ignoreOnTextChange = true;
                String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(NewContactBottomSheet.this.codeField.getText().toString(), false);
                NewContactBottomSheet.this.codeField.setText(strStripExceptNumbers);
                if (strStripExceptNumbers.length() == 0) {
                    NewContactBottomSheet.this.setCountryButtonText(null);
                    NewContactBottomSheet.this.phoneField.setHintText((String) null);
                } else {
                    int i6 = 4;
                    if (strStripExceptNumbers.length() > 4) {
                        while (true) {
                            if (i6 < 1) {
                                str2 = null;
                                z = false;
                                break;
                            }
                            String strSubstring = strStripExceptNumbers.substring(0, i6);
                            List list = (List) NewContactBottomSheet.this.codesMap.get(strSubstring);
                            if (list == null) {
                                country3 = null;
                            } else if (list.size() > 1) {
                                String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring, null);
                                country3 = (CountrySelectActivity.Country) RendererCapabilities.CC.m(1, list);
                                if (string != null) {
                                    ArrayList arrayList = NewContactBottomSheet.this.countriesArray;
                                    int size = arrayList.size();
                                    int i7 = 0;
                                    while (i7 < size) {
                                        Object obj = arrayList.get(i7);
                                        i7++;
                                        CountrySelectActivity.Country country4 = (CountrySelectActivity.Country) obj;
                                        if (Objects.equals(country4.shortname, string)) {
                                            country3 = country4;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                country3 = (CountrySelectActivity.Country) list.get(0);
                            }
                            if (country3 != null) {
                                String str3 = strStripExceptNumbers.substring(i6) + NewContactBottomSheet.this.phoneField.getText().toString();
                                NewContactBottomSheet.this.codeField.setText(strSubstring);
                                str2 = str3;
                                strStripExceptNumbers = strSubstring;
                                z = true;
                                break;
                            }
                            i6--;
                        }
                        if (!z) {
                            str2 = strStripExceptNumbers.substring(1) + NewContactBottomSheet.this.phoneField.getText().toString();
                            AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = NewContactBottomSheet.this.codeField;
                            strStripExceptNumbers = strStripExceptNumbers.substring(0, 1);
                            animatedPhoneNumberEditText2.setText(strStripExceptNumbers);
                        }
                    } else {
                        str2 = null;
                        z = false;
                    }
                    ArrayList arrayList2 = NewContactBottomSheet.this.countriesArray;
                    int size2 = arrayList2.size();
                    CountrySelectActivity.Country country5 = null;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < size2) {
                        Object obj2 = arrayList2.get(i8);
                        i8++;
                        CountrySelectActivity.Country country6 = (CountrySelectActivity.Country) obj2;
                        if (country6.code.startsWith(strStripExceptNumbers)) {
                            i9++;
                            if (country6.code.equals(strStripExceptNumbers)) {
                                country5 = country6;
                            }
                        }
                    }
                    if (i9 == 1 && country5 != null && str2 == null) {
                        str2 = strStripExceptNumbers.substring(country5.code.length()) + NewContactBottomSheet.this.phoneField.getText().toString();
                        AnimatedPhoneNumberEditText animatedPhoneNumberEditText3 = NewContactBottomSheet.this.codeField;
                        String str4 = country5.code;
                        animatedPhoneNumberEditText3.setText(str4);
                        strStripExceptNumbers = str4;
                    }
                    List list2 = (List) NewContactBottomSheet.this.codesMap.get(strStripExceptNumbers);
                    if (list2 == null) {
                        country2 = null;
                    } else if (list2.size() > 1) {
                        String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strStripExceptNumbers, null);
                        country2 = (CountrySelectActivity.Country) RendererCapabilities.CC.m(1, list2);
                        if (string2 != null) {
                            ArrayList arrayList3 = NewContactBottomSheet.this.countriesArray;
                            int size3 = arrayList3.size();
                            int i10 = 0;
                            while (i10 < size3) {
                                Object obj3 = arrayList3.get(i10);
                                i10++;
                                CountrySelectActivity.Country country7 = (CountrySelectActivity.Country) obj3;
                                if (Objects.equals(country7.shortname, string2)) {
                                    country2 = country7;
                                    break;
                                }
                            }
                        }
                    } else {
                        country2 = (CountrySelectActivity.Country) list2.get(0);
                    }
                    if (country2 != null) {
                        NewContactBottomSheet.this.ignoreSelection = true;
                        NewContactBottomSheet.this.setCountryHint(strStripExceptNumbers, country2);
                    } else {
                        NewContactBottomSheet.this.setCountryButtonText(null);
                        NewContactBottomSheet.this.phoneField.setHintText((String) null);
                    }
                    if (!z) {
                        NewContactBottomSheet.this.codeField.setSelection(NewContactBottomSheet.this.codeField.getText().length());
                    }
                    if (str2 != null && str2.length() != 0) {
                        NewContactBottomSheet.this.phoneField.requestFocus();
                        NewContactBottomSheet.this.phoneField.setText(str2);
                        NewContactBottomSheet.this.phoneField.setSelection(NewContactBottomSheet.this.phoneField.length());
                    }
                }
                NewContactBottomSheet.this.ignoreOnTextChange = false;
                NewContactBottomSheet.this.updatedTextPhone();
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }
        });
        final int i6 = 2;
        this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView2, int i7, KeyEvent keyEvent) {
                switch (i6) {
                    case 0:
                        return this.f$0.lambda$createView$1(textView2, i7, keyEvent);
                    case 1:
                        return this.f$0.lambda$createView$2(textView2, i7, keyEvent);
                    case 2:
                        return this.f$0.lambda$createView$4(textView2, i7, keyEvent);
                    case 3:
                        return this.f$0.lambda$createView$5(textView2, i7, keyEvent);
                    default:
                        return this.f$0.lambda$createView$8(textView2, i7, keyEvent);
                }
            }
        });
        this.codeDividerView = new View(context);
        LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(0, -1, 4.0f, 8.0f, 12.0f, 8.0f);
        layoutParamsCreateLinear.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(this.codeDividerView, layoutParamsCreateLinear);
        AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = new AnimatedPhoneNumberEditText(context) {
            @Override
            public void onFocusChanged(boolean z, int i7, Rect rect) {
                super.onFocusChanged(z, i7, rect);
                NewContactBottomSheet.this.phoneOutlineView.animateSelection((z || NewContactBottomSheet.this.codeField.isFocused()) ? 1.0f : 0.0f);
            }

            @Override
            public boolean onKeyDown(int i7, KeyEvent keyEvent) {
                if (i7 == 67 && NewContactBottomSheet.this.phoneField.length() == 0) {
                    NewContactBottomSheet.this.codeField.requestFocus();
                    NewContactBottomSheet.this.codeField.setSelection(NewContactBottomSheet.this.codeField.length());
                    NewContactBottomSheet.this.codeField.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i7, keyEvent);
            }
        };
        this.phoneField = animatedPhoneNumberEditText2;
        animatedPhoneNumberEditText2.setTextColor(Theme.getColor(null, i5, false));
        this.phoneField.setInputType(3);
        this.phoneField.setPadding(0, 0, 0, 0);
        this.phoneField.setCursorSize(AndroidUtilities.dp(20.0f));
        this.phoneField.setCursorWidth(1.5f);
        this.phoneField.setTextSize(1, 16.0f);
        this.phoneField.setMaxLines(1);
        this.phoneField.setGravity(19);
        this.phoneField.setImeOptions(268435461);
        this.phoneField.setBackground(null);
        this.phoneField.setContentDescription(LocaleController.getString(i3));
        linearLayout2.addView(this.phoneField, LayoutHelper.createLinear(-1, 36));
        this.phoneField.addTextChangedListener(new TextWatcher() {
            private int actionPosition;
            private int characterAction = -1;

            @Override
            public void afterTextChanged(Editable editable) {
                int i7;
                int i8;
                if (NewContactBottomSheet.this.ignoreOnPhoneChange) {
                    return;
                }
                int selectionStart = NewContactBottomSheet.this.phoneField.getSelectionStart();
                String string = NewContactBottomSheet.this.phoneField.getText().toString();
                if (this.characterAction == 3) {
                    string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                    selectionStart--;
                }
                StringBuilder sb = new StringBuilder(string.length());
                int i9 = 0;
                while (i9 < string.length()) {
                    int i10 = i9 + 1;
                    String strSubstring = string.substring(i9, i10);
                    if ("0123456789".contains(strSubstring)) {
                        sb.append(strSubstring);
                    }
                    i9 = i10;
                }
                NewContactBottomSheet.this.ignoreOnPhoneChange = true;
                String hintText = NewContactBottomSheet.this.phoneField.getHintText();
                if (hintText != null) {
                    int i11 = 0;
                    while (i11 < sb.length()) {
                        if (i11 >= hintText.length()) {
                            sb.insert(i11, ' ');
                            if (selectionStart == i11 + 1 && (i7 = this.characterAction) != 2 && i7 != 3) {
                                selectionStart++;
                                break;
                            } else {
                                break;
                                break;
                                break;
                            }
                        }
                        if (hintText.charAt(i11) == ' ') {
                            sb.insert(i11, ' ');
                            i11++;
                            if (selectionStart == i11 && (i8 = this.characterAction) != 2 && i8 != 3) {
                                selectionStart++;
                            }
                        }
                        i11++;
                    }
                }
                editable.replace(0, editable.length(), sb);
                if (selectionStart >= 0) {
                    NewContactBottomSheet.this.phoneField.setSelection(Math.min(selectionStart, NewContactBottomSheet.this.phoneField.length()));
                }
                NewContactBottomSheet.this.phoneField.onTextChange();
                NewContactBottomSheet.this.ignoreOnPhoneChange = false;
                NewContactBottomSheet.this.updatedTextPhone();
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                if (i8 == 0 && i9 == 1) {
                    this.characterAction = 1;
                    return;
                }
                if (i8 != 1 || i9 != 0) {
                    this.characterAction = -1;
                } else if (charSequence.charAt(i7) != ' ' || i7 <= 0) {
                    this.characterAction = 2;
                } else {
                    this.characterAction = 3;
                    this.actionPosition = i7 - 1;
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }
        });
        final int i7 = 3;
        this.phoneField.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView2, int i8, KeyEvent keyEvent) {
                switch (i7) {
                    case 0:
                        return this.f$0.lambda$createView$1(textView2, i8, keyEvent);
                    case 1:
                        return this.f$0.lambda$createView$2(textView2, i8, keyEvent);
                    case 2:
                        return this.f$0.lambda$createView$4(textView2, i8, keyEvent);
                    case 3:
                        return this.f$0.lambda$createView$5(textView2, i8, keyEvent);
                    default:
                        return this.f$0.lambda$createView$8(textView2, i8, keyEvent);
                }
            }
        });
        ImageView imageView = new ImageView(context);
        this.phoneStatusView = imageView;
        imageView.setScaleX(0.5f);
        this.phoneStatusView.setScaleY(0.5f);
        this.phoneStatusView.setAlpha(0.0f);
        this.phoneOutlineView.addView(this.phoneStatusView, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 21, this.resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        this.checkBox.setDrawUnchecked(true);
        this.checkBox.setChecked(false, false);
        this.checkBox.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        this.checkTextView = textView2;
        textView2.setTextColor(Theme.getColor(i5, this.resourcesProvider));
        this.checkTextView.setTextSize(1, 14.0f);
        this.checkTextView.setText(LocaleController.getString(R.string.AddContactSync));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.checkLayout = linearLayout3;
        linearLayout3.setOrientation(0);
        this.checkLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        this.checkLayout.addView(this.checkBox, LayoutHelper.createLinear(21, 21, 16, 0, 0, 9, 0));
        this.checkLayout.addView(this.checkTextView, LayoutHelper.createLinear(-2, -2, 16));
        final int i8 = 2;
        this.checkLayout.setOnClickListener(new View.OnClickListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        this.f$0.lambda$createView$10(view);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view);
                        break;
                    case 2:
                        this.f$0.lambda$createView$6(view);
                        break;
                    default:
                        this.f$0.lambda$createView$7(view);
                        break;
                }
            }
        });
        this.checkLayout.setTranslationY(AndroidUtilities.dp(-21.33f));
        this.checkLayout.setPivotX(0.0f);
        ScaleStateListAnimator.apply(this.checkLayout, 0.0125f, 1.2f);
        this.checkLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i4, this.resourcesProvider), 6, 6));
        this.contentLayout.addView(this.checkLayout, LayoutHelper.createLinear(-2, -2, 0.0f, 5.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.qrButtonContainer = frameLayout3;
        frameLayout3.setTranslationY(AndroidUtilities.dp(-10.665f));
        this.contentLayout.addView(this.qrButtonContainer, LayoutHelper.createLinear(-1, -2, 0.0f, 6.0f, 0.0f, -6.0f));
        View view = new View(context);
        this.qrButtonSeparator = view;
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
        this.qrButtonContainer.addView(this.qrButtonSeparator, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, this.resourcesProvider);
        this.qrButton = buttonWithCounterView;
        buttonWithCounterView.setRound();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.header_qr_24), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AddContactQr));
        this.qrButton.setText(spannableStringBuilder, false);
        final int i9 = 3;
        this.qrButton.setOnClickListener(new View.OnClickListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i9) {
                    case 0:
                        this.f$0.lambda$createView$10(view2);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view2);
                        break;
                    case 2:
                        this.f$0.lambda$createView$6(view2);
                        break;
                    default:
                        this.f$0.lambda$createView$7(view2);
                        break;
                }
            }
        });
        this.qrButtonContainer.addView(this.qrButton, LayoutHelper.createFrame(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        OutlineEditText outlineEditText3 = new OutlineEditText(context);
        this.notesField = outlineEditText3;
        outlineEditText3.setBackground(null);
        this.notesField.getEditText().setInputType(49152);
        this.notesField.getEditText().setImeOptions(5);
        this.notesField.setHint("Notes");
        this.qrButtonContainer.addView(this.notesField, LayoutHelper.createFrame(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        final int i10 = 4;
        this.notesField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        return this.f$0.lambda$createView$1(textView3, i11, keyEvent);
                    case 1:
                        return this.f$0.lambda$createView$2(textView3, i11, keyEvent);
                    case 2:
                        return this.f$0.lambda$createView$4(textView3, i11, keyEvent);
                    case 3:
                        return this.f$0.lambda$createView$5(textView3, i11, keyEvent);
                    default:
                        return this.f$0.lambda$createView$8(textView3, i11, keyEvent);
                }
            }
        });
        updateQrButtonVisible(false);
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                CountrySelectActivity.Country country2 = new CountrySelectActivity.Country();
                country2.name = strArrSplit[2];
                country2.code = strArrSplit[0];
                country2.shortname = strArrSplit[1];
                this.countriesArray.add(0, country2);
                List<CountrySelectActivity.Country> list = this.codesMap.get(strArrSplit[0]);
                if (list == null) {
                    HashMap<String, List<CountrySelectActivity.Country>> map2 = this.codesMap;
                    String str2 = strArrSplit[0];
                    ArrayList arrayList = new ArrayList();
                    map2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(country2);
                if (strArrSplit.length > 3) {
                    this.phoneFormatMap.put(strArrSplit[0], Collections.singletonList(strArrSplit[3]));
                }
                map.put(strArrSplit[1], strArrSplit[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.countriesArray, Comparator$CC.comparing(new GroupCallSheet$$ExternalSyntheticLambda0(5)));
        if (TextUtils.isEmpty(this.initialPhoneNumber)) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                upperCase = telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase() : null;
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            if (upperCase != null && (str = (String) map.get(upperCase)) != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.countriesArray.size()) {
                        country = null;
                        break;
                    }
                    if (Objects.equals(this.countriesArray.get(i11).name, str)) {
                        country = this.countriesArray.get(i11);
                        break;
                    }
                    i11++;
                }
                if (country != null) {
                    this.codeField.setText(country.code);
                }
            }
            if (this.codeField.length() == 0) {
                this.phoneField.setHintText((String) null);
            }
        } else {
            TLRPC.User currentUser = this.parentFragment.getUserConfig().getCurrentUser();
            if (this.initialPhoneNumber.startsWith("+")) {
                this.codeField.setText(this.initialPhoneNumber.substring(1));
            } else if (this.initialPhoneNumberWithCountryCode || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.codeField.setText(this.initialPhoneNumber);
            } else {
                String str3 = currentUser.phone;
                for (int i12 = 4; i12 >= 1; i12--) {
                    String strSubstring = str3.substring(0, i12);
                    if (this.codesMap.get(strSubstring) != null) {
                        this.codeField.setText(strSubstring);
                        break;
                    }
                }
                this.phoneField.setText(this.initialPhoneNumber);
            }
            this.initialPhoneNumber = null;
        }
        this.doneButtonContainer = new FrameLayout(getContext());
        TextView textView3 = new TextView(context);
        this.doneButton = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.doneButton.setGravity(17);
        this.doneButton.setLines(1);
        this.doneButton.setSingleLine(true);
        this.doneButton.setText(LocaleController.getString(R.string.CreateContact));
        TextView textView4 = this.doneButton;
        BaseFragment baseFragment = this.parentFragment;
        int i13 = Theme.key_featuredStickers_buttonText;
        textView4.setTextColor(baseFragment.getThemedColor(i13));
        this.doneButton.setTextSize(1, 15.0f);
        this.doneButton.setTypeface(AndroidUtilities.bold());
        ScaleStateListAnimator.apply(this.doneButtonContainer, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.progressView.setProgressColor(this.parentFragment.getThemedColor(i13));
        this.doneButtonContainer.addView(this.doneButton, LayoutHelper.createFrame(-1, -1.0f));
        this.doneButtonContainer.addView(this.progressView, LayoutHelper.createFrame(40, 40, 17));
        this.contentLayout.addView(this.doneButtonContainer, LayoutHelper.createLinear(-1, 48, 0, 0, 8, 0, 4));
        AndroidUtilities.updateViewVisibilityAnimated(this.doneButton, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 1.0f, false);
        FrameLayout frameLayout4 = this.doneButtonContainer;
        int themedColor = this.parentFragment.getThemedColor(Theme.key_featuredStickers_addButton);
        frameLayout4.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, themedColor, Theme.AdaptiveRipple.calcRippleColor(themedColor)));
        this.doneButtonContainer.setOnClickListener(new View.OnClickListener(this) {
            public final NewContactBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$createView$10(view2);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view2);
                        break;
                    case 2:
                        this.f$0.lambda$createView$6(view2);
                        break;
                    default:
                        this.f$0.lambda$createView$7(view2);
                        break;
                }
            }
        });
        this.plusTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        this.codeDividerView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false));
        return scrollView;
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        AndroidUtilities.runOnUIThread(new NewContactBottomSheet$$ExternalSyntheticLambda9(this, 0), 50L);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        OutlineEditText outlineEditText = this.firstNameField;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(outlineEditText, 4, null, null, null, null, i));
        OutlineEditText outlineEditText2 = this.firstNameField;
        int i2 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(outlineEditText2, 8388608, null, null, null, null, i2));
        OutlineEditText outlineEditText3 = this.firstNameField;
        int i3 = Theme.key_windowBackgroundWhiteInputField;
        arrayList.add(new ThemeDescription(outlineEditText3, 32, null, null, null, null, i3));
        OutlineEditText outlineEditText4 = this.firstNameField;
        int i4 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        arrayList.add(new ThemeDescription(outlineEditText4, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.lastNameField, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.lastNameField, 8388608, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.lastNameField, 32, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.lastNameField, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.codeField, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.codeField, 32, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.codeField, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.phoneField, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.phoneField, 8388608, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.phoneField, 32, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.phoneField, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, Theme.key_contextProgressInner2));
        arrayList.add(new ThemeDescription(this.editDoneItemProgress, 0, null, null, null, null, Theme.key_contextProgressOuter2));
        return arrayList;
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

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void selectCountry(CountrySelectActivity.Country country) {
        this.ignoreOnTextChange = true;
        String str = country.code;
        this.codeField.setText(str);
        setCountryHint(str, country);
        this.ignoreOnTextChange = false;
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

    public NewContactBottomSheet setInitialPhoneNumber(String str, boolean z) {
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
                    if (i < 1) {
                        if (Build.VERSION.SDK_INT < 23) {
                            break;
                        }
                        Context context = ApplicationLoader.applicationContext;
                        String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                        this.codeField.setText(upperCase);
                        if (!upperCase.endsWith("0") || !this.initialPhoneNumber.startsWith("0")) {
                            break;
                            break;
                        }
                        this.initialPhoneNumber = this.initialPhoneNumber.substring(1);
                        break;
                    }
                    List<CountrySelectActivity.Country> list = this.codesMap.get(str2.substring(0, i));
                    if (list != null && list.size() > 0) {
                        String str3 = list.get(0).code;
                        this.codeField.setText(str3);
                        if (!str3.endsWith("0") || !this.initialPhoneNumber.startsWith("0")) {
                            break;
                            break;
                        }
                        this.initialPhoneNumber = this.initialPhoneNumber.substring(1);
                        break;
                    }
                    i--;
                }
                this.phoneField.setText(this.initialPhoneNumber);
            }
            this.initialPhoneNumber = null;
        }
        return this;
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    @Override
    public void show() {
        super.show();
        this.firstNameField.getEditText().requestFocus();
        this.firstNameField.getEditText().setSelection(this.firstNameField.getEditText().length());
        AndroidUtilities.runOnUIThread(new NewContactBottomSheet$$ExternalSyntheticLambda9(this, 1), 50L);
    }
}
