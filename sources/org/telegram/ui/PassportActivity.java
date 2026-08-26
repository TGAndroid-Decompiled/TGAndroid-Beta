package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.util.Property;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextDetailSettingsCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.HintEditText;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.SlideView;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;

public class PassportActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int FIELD_ADDRESS_COUNT = 6;
    private static final int FIELD_BIRTHDAY = 3;
    private static final int FIELD_CARDNUMBER = 7;
    private static final int FIELD_CITIZENSHIP = 5;
    private static final int FIELD_CITY = 3;
    private static final int FIELD_COUNTRY = 5;
    private static final int FIELD_EMAIL = 0;
    private static final int FIELD_EXPIRE = 8;
    private static final int FIELD_GENDER = 4;
    private static final int FIELD_IDENTITY_COUNT = 9;
    private static final int FIELD_IDENTITY_NODOC_COUNT = 7;
    private static final int FIELD_MIDNAME = 1;
    private static final int FIELD_NAME = 0;
    private static final int FIELD_NATIVE_COUNT = 3;
    private static final int FIELD_NATIVE_MIDNAME = 1;
    private static final int FIELD_NATIVE_NAME = 0;
    private static final int FIELD_NATIVE_SURNAME = 2;
    private static final int FIELD_PASSWORD = 0;
    private static final int FIELD_PHONE = 2;
    private static final int FIELD_PHONECODE = 1;
    private static final int FIELD_PHONECOUNTRY = 0;
    private static final int FIELD_POSTCODE = 2;
    private static final int FIELD_RESIDENCE = 6;
    private static final int FIELD_STATE = 4;
    private static final int FIELD_STREET1 = 0;
    private static final int FIELD_STREET2 = 1;
    private static final int FIELD_SURNAME = 2;
    public static final int TYPE_ADDRESS = 2;
    public static final int TYPE_EMAIL = 4;
    public static final int TYPE_EMAIL_VERIFICATION = 6;
    public static final int TYPE_IDENTITY = 1;
    public static final int TYPE_MANAGE = 8;
    public static final int TYPE_PASSWORD = 5;
    public static final int TYPE_PHONE = 3;
    public static final int TYPE_PHONE_VERIFICATION = 7;
    public static final int TYPE_REQUEST = 0;
    private static final int UPLOADING_TYPE_DOCUMENTS = 0;
    private static final int UPLOADING_TYPE_FRONT = 2;
    private static final int UPLOADING_TYPE_REVERSE = 3;
    private static final int UPLOADING_TYPE_SELFIE = 1;
    private static final int UPLOADING_TYPE_TRANSLATION = 4;
    private static final int attach_document = 4;
    private static final int attach_photo = 0;
    private static final int done_button = 2;
    private static final int info_item = 1;
    private TextView acceptTextView;
    private TextSettingsCell addDocumentCell;
    private ShadowSectionCell addDocumentSectionCell;
    private boolean allowNonLatinName;
    private ArrayList<TLRPC.TL_secureRequiredType> availableDocumentTypes;
    private TextInfoPrivacyCell bottomCell;
    private TextInfoPrivacyCell bottomCellTranslation;
    private FrameLayout bottomLayout;
    private boolean callbackCalled;
    private ChatAttachAlert chatAttachAlert;
    private HashMap<String, String> codesMap;
    private ArrayList<String> countriesArray;
    private HashMap<String, String> countriesMap;
    private int currentActivityType;
    private long currentBotId;
    private String currentCallbackUrl;
    private String currentCitizeship;
    private HashMap<String, String> currentDocumentValues;
    private TLRPC.TL_secureRequiredType currentDocumentsType;
    private TLRPC.TL_secureValue currentDocumentsTypeValue;
    private String currentEmail;
    private int[] currentExpireDate;
    private TL_account.authorizationForm currentForm;
    private String currentGender;
    private String currentNonce;
    private TL_account.Password currentPassword;
    private String currentPayload;
    private TLRPC.TL_auth_sentCode currentPhoneVerification;
    private LinearLayout currentPhotoViewerLayout;
    private String currentPicturePath;
    private String currentPublicKey;
    private String currentResidence;
    private String currentScope;
    private TLRPC.TL_secureRequiredType currentType;
    private TLRPC.TL_secureValue currentTypeValue;
    private HashMap<String, String> currentValues;
    private int currentViewNum;
    private PassportActivityDelegate delegate;
    private TextSettingsCell deletePassportCell;
    private ArrayList<View> dividers;
    private boolean documentOnly;
    private ArrayList<SecureDocument> documents;
    private HashMap<SecureDocument, SecureDocumentCell> documentsCells;
    private HashMap<String, String> documentsErrors;
    private LinearLayout documentsLayout;
    private HashMap<TLRPC.TL_secureRequiredType, TLRPC.TL_secureRequiredType> documentsToTypesLink;
    private ActionBarMenuItem doneItem;
    private AnimatorSet doneItemAnimation;
    private int emailCodeLength;
    private ImageView emptyImageView;
    private LinearLayout emptyLayout;
    private TextView emptyTextView1;
    private TextView emptyTextView2;
    private TextView emptyTextView3;
    private EmptyTextProgressView emptyView;
    private HashMap<String, HashMap<String, String>> errorsMap;
    private HashMap<String, String> errorsValues;
    private View extraBackgroundView;
    private View extraBackgroundView2;
    private HashMap<String, String> fieldsErrors;
    private SecureDocument frontDocument;
    private LinearLayout frontLayout;
    private HeaderCell headerCell;
    private boolean ignoreOnFailure;
    private boolean ignoreOnPhoneChange;
    private boolean ignoreOnTextChange;
    private String initialValues;
    private EditTextBoldCursor[] inputExtraFields;
    private ViewGroup[] inputFieldContainers;
    private EditTextBoldCursor[] inputFields;
    private HashMap<String, String> languageMap;
    private LinearLayout linearLayout2;
    private HashMap<String, String> mainErrorsMap;
    private TextInfoPrivacyCell nativeInfoCell;
    private boolean needActivityResult;
    private CharSequence noAllDocumentsErrorText;
    private CharSequence noAllTranslationErrorText;
    private ImageView noPasswordImageView;
    private TextView noPasswordSetTextView;
    private TextView noPasswordTextView;
    private boolean[] nonLatinNames;
    private FrameLayout passwordAvatarContainer;
    private TextView passwordForgotButton;
    private TextInfoPrivacyCell passwordInfoRequestTextView;
    private TextInfoPrivacyCell passwordRequestTextView;
    private PassportActivityDelegate pendingDelegate;
    private ErrorRunnable pendingErrorRunnable;
    private Runnable pendingFinishRunnable;
    private String pendingPhone;
    private Dialog permissionsDialog;
    private ArrayList<String> permissionsItems;
    private HashMap<String, String> phoneFormatMap;
    private TextView plusTextView;
    private PassportActivity presentAfterAnimation;
    private AlertDialog progressDialog;
    private ContextProgressView progressView;
    private ContextProgressView progressViewButton;
    private PhotoViewer.PhotoViewerProvider provider;
    private SecureDocument reverseDocument;
    private LinearLayout reverseLayout;
    private byte[] saltedPassword;
    private byte[] savedPasswordHash;
    private byte[] savedSaltedPassword;
    private TextSettingsCell scanDocumentCell;
    private int scrollHeight;
    private ScrollView scrollView;
    private ShadowSectionCell sectionCell;
    private ShadowSectionCell sectionCell2;
    private byte[] secureSecret;
    private long secureSecretId;
    private SecureDocument selfieDocument;
    private LinearLayout selfieLayout;
    private TextInfoPrivacyCell topErrorCell;
    private ArrayList<SecureDocument> translationDocuments;
    private LinearLayout translationLayout;
    private HashMap<TLRPC.TL_secureRequiredType, HashMap<String, String>> typesValues;
    private HashMap<TLRPC.TL_secureRequiredType, TextDetailSecureCell> typesViews;
    private TextSettingsCell uploadDocumentCell;
    private TextDetailSettingsCell uploadFrontCell;
    private TextDetailSettingsCell uploadReverseCell;
    private TextDetailSettingsCell uploadSelfieCell;
    private TextSettingsCell uploadTranslationCell;
    private HashMap<String, SecureDocument> uploadingDocuments;
    private int uploadingFileType;
    private boolean useCurrentValue;
    private int usingSavedPassword;
    private SlideView[] views;

    public class C1ValueToSend {
        boolean selfie_required;
        boolean translation_required;
        TLRPC.TL_secureValue value;

        public C1ValueToSend(TLRPC.TL_secureValue tL_secureValue, boolean z, boolean z2) {
            this.value = tL_secureValue;
            this.selfie_required = z;
            this.translation_required = z2;
        }
    }

    public class AnonymousClass3 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass3() {
        }

        public void lambda$onIdentityDone$0(String str, String str2, String str3, Runnable runnable, ErrorRunnable errorRunnable, AlertDialog alertDialog, int i) {
            PassportActivity.this.inputFields[0].setText(str);
            PassportActivity.this.inputFields[1].setText(str2);
            PassportActivity.this.inputFields[2].setText(str3);
            PassportActivity.this.showEditDoneProgress(true, true);
            onIdentityDone(runnable, errorRunnable);
        }

        public void lambda$onIdentityDone$1(int i, AlertDialog alertDialog, int i2) {
            PassportActivity passportActivity = PassportActivity.this;
            passportActivity.onFieldError(passportActivity.inputFields[i]);
        }

        public int lambda$onIdentityDone$2(String str, String str2) {
            int fieldCost = PassportActivity.this.getFieldCost(str);
            int fieldCost2 = PassportActivity.this.getFieldCost(str2);
            if (fieldCost < fieldCost2) {
                return -1;
            }
            return fieldCost > fieldCost2 ? 1 : 0;
        }

        public int lambda$onIdentityDone$3(String str, String str2) {
            int fieldCost = PassportActivity.this.getFieldCost(str);
            int fieldCost2 = PassportActivity.this.getFieldCost(str2);
            if (fieldCost < fieldCost2) {
                return -1;
            }
            return fieldCost > fieldCost2 ? 1 : 0;
        }

        public void lambda$onItemClick$4() {
            PassportActivity.this.finishFragment();
        }

        public void lambda$onItemClick$5(TLRPC.TL_error tL_error, Runnable runnable, ErrorRunnable errorRunnable, TL_account.verifyEmail verifyemail) {
            if (tL_error == null) {
                PassportActivity.this.delegate.saveValue(PassportActivity.this.currentType, (String) PassportActivity.this.currentValues.get("email"), null, null, null, null, null, null, null, null, runnable, errorRunnable);
            } else {
                AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tL_error, PassportActivity.this, verifyemail, new Object[0]);
                errorRunnable.onError(null, null);
            }
        }

        public void lambda$onItemClick$6(Runnable runnable, ErrorRunnable errorRunnable, TL_account.verifyEmail verifyemail, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22(this, tL_error, runnable, errorRunnable, verifyemail, 4));
        }

        private boolean onIdentityDone(final java.lang.Runnable r29, final org.telegram.ui.PassportActivity.ErrorRunnable r30) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PassportActivity.AnonymousClass3.onIdentityDone(java.lang.Runnable, org.telegram.ui.PassportActivity$ErrorRunnable):boolean");
        }

        @Override
        public void onItemClick(int i) {
            JSONObject jSONObject;
            String str;
            String string;
            if (i == -1) {
                if (PassportActivity.this.checkDiscard(true)) {
                    return;
                }
                if (PassportActivity.this.currentActivityType == 0 || PassportActivity.this.currentActivityType == 5) {
                    PassportActivity.this.callCallback(false);
                }
                PassportActivity.this.finishFragment();
                return;
            }
            if (i == 1) {
                if (PassportActivity.this.getParentActivity() == null) {
                    return;
                }
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(PassportActivity.this.getParentActivity());
                String string2 = LocaleController.getString(R.string.PassportInfo2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                int iIndexOf = string2.indexOf(42);
                int iLastIndexOf = string2.lastIndexOf(42);
                if (iIndexOf != -1 && iLastIndexOf != -1) {
                    spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.PassportInfoUrl)) {
                        @Override
                        public void onClick(View view) {
                            PassportActivity.this.dismissCurrentDialog();
                            super.onClick(view);
                        }
                    }, iIndexOf, iLastIndexOf - 1, 33);
                }
                linksTextView.setText(spannableStringBuilder);
                linksTextView.setTextSize(1, 16.0f);
                linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_dialogTextLink, false));
                linksTextView.setHighlightColor(Theme.getColor(null, Theme.key_dialogLinkSelection, false));
                linksTextView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                linksTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                linksTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                AlertDialog.Builder builder = new AlertDialog.Builder(PassportActivity.this.getParentActivity(), 0, null);
                builder.setView(linksTextView);
                builder.setTitle(LocaleController.getString(R.string.PassportInfoTitle));
                builder.setNegativeButton(LocaleController.getString(R.string.Close), null);
                PassportActivity.this.showDialog(builder.create());
                return;
            }
            if (i == 2) {
                if (PassportActivity.this.currentActivityType == 5) {
                    PassportActivity.this.onPasswordDone(false);
                    return;
                }
                if (PassportActivity.this.currentActivityType == 7) {
                    PassportActivity.this.views[PassportActivity.this.currentViewNum].lambda$onNextPressed$16(null);
                    return;
                }
                final PhotoViewer$$ExternalSyntheticLambda60 photoViewer$$ExternalSyntheticLambda60 = new PhotoViewer$$ExternalSyntheticLambda60(this, 10);
                ErrorRunnable errorRunnable = new ErrorRunnable() {
                    @Override
                    public void onError(String str2, String str3) {
                        if (!"PHONE_VERIFICATION_NEEDED".equals(str2)) {
                            PassportActivity.this.showEditDoneProgress(true, false);
                        } else {
                            PassportActivity passportActivity = PassportActivity.this;
                            passportActivity.startPhoneVerification(true, str3, photoViewer$$ExternalSyntheticLambda60, this, passportActivity.delegate);
                        }
                    }
                };
                if (PassportActivity.this.currentActivityType == 4) {
                    if (PassportActivity.this.useCurrentValue) {
                        string = PassportActivity.this.currentEmail;
                    } else if (PassportActivity.this.checkFieldsForError()) {
                        return;
                    } else {
                        string = PassportActivity.this.inputFields[0].getText().toString();
                    }
                    PassportActivity.this.delegate.saveValue(PassportActivity.this.currentType, string, null, null, null, null, null, null, null, null, photoViewer$$ExternalSyntheticLambda60, errorRunnable);
                } else if (PassportActivity.this.currentActivityType == 3) {
                    if (PassportActivity.this.useCurrentValue) {
                        str = UserConfig.getInstance(((BaseFragment) PassportActivity.this).currentAccount).getCurrentUser().phone;
                    } else {
                        if (PassportActivity.this.checkFieldsForError()) {
                            return;
                        }
                        str = PassportActivity.this.inputFields[1].getText().toString() + PassportActivity.this.inputFields[2].getText().toString();
                    }
                    PassportActivity.this.delegate.saveValue(PassportActivity.this.currentType, str, null, null, null, null, null, null, null, null, photoViewer$$ExternalSyntheticLambda60, errorRunnable);
                } else if (PassportActivity.this.currentActivityType == 2) {
                    if (!PassportActivity.this.uploadingDocuments.isEmpty() || PassportActivity.this.checkFieldsForError()) {
                        return;
                    }
                    if (PassportActivity.this.isHasNotAnyChanges()) {
                        PassportActivity.this.finishFragment();
                        return;
                    }
                    try {
                        if (PassportActivity.this.documentOnly) {
                            jSONObject = null;
                        } else {
                            jSONObject = new JSONObject();
                            try {
                                jSONObject.put("street_line1", PassportActivity.this.inputFields[0].getText().toString());
                                jSONObject.put("street_line2", PassportActivity.this.inputFields[1].getText().toString());
                                jSONObject.put("post_code", PassportActivity.this.inputFields[2].getText().toString());
                                jSONObject.put("city", PassportActivity.this.inputFields[3].getText().toString());
                                jSONObject.put("state", PassportActivity.this.inputFields[4].getText().toString());
                                jSONObject.put("country_code", PassportActivity.this.currentCitizeship);
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    if (PassportActivity.this.fieldsErrors != null) {
                        PassportActivity.this.fieldsErrors.clear();
                    }
                    if (PassportActivity.this.documentsErrors != null) {
                        PassportActivity.this.documentsErrors.clear();
                    }
                    PassportActivity.this.delegate.saveValue(PassportActivity.this.currentType, null, jSONObject != null ? jSONObject.toString() : null, PassportActivity.this.currentDocumentsType, null, PassportActivity.this.documents, PassportActivity.this.selfieDocument, PassportActivity.this.translationDocuments, null, null, photoViewer$$ExternalSyntheticLambda60, errorRunnable);
                } else if (PassportActivity.this.currentActivityType == 1) {
                    if (!onIdentityDone(photoViewer$$ExternalSyntheticLambda60, errorRunnable)) {
                        return;
                    }
                } else if (PassportActivity.this.currentActivityType == 6) {
                    TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                    verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode.code = PassportActivity.this.inputFields[0].getText().toString();
                    verifyemail.verification = tL_emailVerificationCode;
                    ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(verifyemail, new LoginActivity$$ExternalSyntheticLambda27(3, this, photoViewer$$ExternalSyntheticLambda60, errorRunnable, verifyemail)), ((BaseFragment) PassportActivity.this).classGuid);
                }
                PassportActivity.this.showEditDoneProgress(true, true);
            }
        }
    }

    public class AnonymousClass8 implements RequestDelegate {
        final TL_account.getPasswordSettings val$req;
        final boolean val$saved;
        final String val$textPassword;
        final byte[] val$x_bytes;

        public AnonymousClass8(boolean z, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
            this.val$saved = z;
            this.val$x_bytes = bArr;
            this.val$req = getpasswordsettings;
            this.val$textPassword = str;
        }

        private void generateNewSecret() {
            Utilities.globalQueue.postRunnable(new PhotoViewer$86$$ExternalSyntheticLambda0(this, this.val$x_bytes, this.val$textPassword, 16));
        }

        public void lambda$generateNewSecret$4(TLRPC.TL_error tL_error, TLObject tLObject) {
            if (tL_error == null) {
                PassportActivity.this.currentPassword = (TL_account.Password) tLObject;
                TwoStepVerificationActivity.initPasswordNewAlgo(PassportActivity.this.currentPassword);
                generateNewSecret();
            }
        }

        public void lambda$generateNewSecret$5(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PassportActivity$8$$ExternalSyntheticLambda0(this, tL_error, tLObject, 1));
        }

        public void lambda$generateNewSecret$6(TLRPC.TL_error tL_error) {
            if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new PassportActivity$8$$ExternalSyntheticLambda1(this, 1), 8);
            } else {
                if (PassportActivity.this.currentForm == null) {
                    PassportActivity.this.currentForm = new TL_account.authorizationForm();
                }
                openRequestInterface();
            }
        }

        public void lambda$generateNewSecret$7(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PassportActivity$8$$ExternalSyntheticLambda5(this, tL_error, 0));
        }

        public void lambda$generateNewSecret$8(byte[] bArr, String str) {
            Utilities.random.setSeed(PassportActivity.this.currentPassword.secure_random);
            TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
            if (PassportActivity.this.currentPassword.current_algo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.password = SRPHelper.startCheck(bArr, PassportActivity.this.currentPassword.srp_id, PassportActivity.this.currentPassword.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) PassportActivity.this.currentPassword.current_algo);
            }
            updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
            PassportActivity passportActivity = PassportActivity.this;
            passportActivity.secureSecret = passportActivity.getRandomSecret();
            PassportActivity passportActivity2 = PassportActivity.this;
            passportActivity2.secureSecretId = Utilities.bytesToLong(Utilities.computeSHA256(passportActivity2.secureSecret));
            if (PassportActivity.this.currentPassword.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) PassportActivity.this.currentPassword.new_secure_algo;
                PassportActivity.this.saltedPassword = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr2 = new byte[32];
                System.arraycopy(PassportActivity.this.saltedPassword, 0, bArr2, 0, 32);
                byte[] bArr3 = new byte[16];
                System.arraycopy(PassportActivity.this.saltedPassword, 32, bArr3, 0, 16);
                Utilities.aesCbcEncryptionByteArraySafe(PassportActivity.this.secureSecret, bArr2, bArr3, 0, PassportActivity.this.secureSecret.length, 0, 1);
                updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = PassportActivity.this.secureSecret;
                updatepasswordsettings.new_settings.new_secure_settings.secure_secret_id = PassportActivity.this.secureSecretId;
                updatepasswordsettings.new_settings.flags |= 4;
            }
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(updatepasswordsettings, new PassportActivity$8$$ExternalSyntheticLambda1(this, 3));
        }

        public void lambda$resetSecret$0(TLRPC.TL_error tL_error, TLObject tLObject) {
            if (tL_error == null) {
                PassportActivity.this.currentPassword = (TL_account.Password) tLObject;
                TwoStepVerificationActivity.initPasswordNewAlgo(PassportActivity.this.currentPassword);
                resetSecret();
            }
        }

        public void lambda$resetSecret$1(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PassportActivity$8$$ExternalSyntheticLambda0(this, tL_error, tLObject, 0));
        }

        public void lambda$resetSecret$2(TLRPC.TL_error tL_error) {
            if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
                generateNewSecret();
            } else {
                ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new PassportActivity$8$$ExternalSyntheticLambda1(this, 2), 8);
            }
        }

        public void lambda$resetSecret$3(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PassportActivity$8$$ExternalSyntheticLambda5(this, tL_error, 1));
        }

        public void lambda$run$10(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda3(this, tL_error, tLObject, z, 4));
        }

        public void lambda$run$11() {
            AlertsCreator.showUpdateAppAlert(PassportActivity.this.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
        }

        public void lambda$run$12(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (!(tLObject instanceof Vector)) {
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    AlertsCreator.showUpdateAppAlert(PassportActivity.this.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    PassportActivity.this.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                PassportActivity.this.showEditDoneProgress(true, false);
                return;
            }
            PassportActivity.this.currentForm = new TL_account.authorizationForm();
            Vector vector = (Vector) tLObject;
            int size = vector.objects.size();
            for (int i = 0; i < size; i++) {
                PassportActivity.this.currentForm.values.add((TLRPC.TL_secureValue) vector.objects.get(i));
            }
            openRequestInterface();
        }

        public void lambda$run$13(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PassportActivity$8$$ExternalSyntheticLambda0(tLObject, tL_error, this));
        }

        public void lambda$run$14(TL_account.passwordSettings passwordsettings, boolean z, byte[] bArr) {
            PassportActivity.this.currentEmail = passwordsettings.email;
            if (z) {
                PassportActivity passportActivity = PassportActivity.this;
                passportActivity.saltedPassword = passportActivity.savedSaltedPassword;
            }
            PassportActivity passportActivity2 = PassportActivity.this;
            if (PassportActivity.checkSecret(passportActivity2.decryptSecret(passportActivity2.secureSecret, PassportActivity.this.saltedPassword), Long.valueOf(PassportActivity.this.secureSecretId)) && bArr.length != 0 && PassportActivity.this.secureSecretId != 0) {
                if (PassportActivity.this.currentBotId != 0) {
                    openRequestInterface();
                    return;
                } else {
                    ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TL_account.getAllSecureValues(), new PassportActivity$8$$ExternalSyntheticLambda1(this, 4));
                    return;
                }
            }
            if (z) {
                UserConfig.getInstance(((BaseFragment) PassportActivity.this).currentAccount).resetSavedPassword();
                PassportActivity.this.usingSavedPassword = 0;
                PassportActivity.this.updatePasswordInterface();
                return;
            }
            if (PassportActivity.this.currentForm != null) {
                PassportActivity.this.currentForm.values.clear();
                PassportActivity.this.currentForm.errors.clear();
            }
            if (PassportActivity.this.secureSecret == null || PassportActivity.this.secureSecret.length == 0) {
                generateNewSecret();
            } else {
                resetSecret();
            }
        }

        public void lambda$run$15(TLObject tLObject, String str, boolean z) {
            byte[] bArr;
            byte[] bArr2;
            TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
            if (tL_secureSecretSettings != null) {
                PassportActivity.this.secureSecret = tL_secureSecretSettings.secure_secret;
                PassportActivity.this.secureSecretId = passwordsettings.secure_settings.secure_secret_id;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = passwordsettings.secure_settings.secure_algo;
                if (!(securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512)) {
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        PassportActivity.this.saltedPassword = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr3;
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda60(this, 11));
                            return;
                        }
                        bArr = new byte[0];
                    }
                    AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda3(this, passwordsettings, z, bArr2, 5));
                }
                bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                PassportActivity.this.saltedPassword = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str), bArr);
            } else {
                if (PassportActivity.this.currentPassword.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) PassportActivity.this.currentPassword.new_secure_algo;
                    byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001.salt;
                    PassportActivity.this.saltedPassword = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001.salt);
                    bArr = bArr4;
                } else {
                    bArr = new byte[0];
                }
                PassportActivity.this.secureSecret = null;
                PassportActivity.this.secureSecretId = 0L;
            }
            bArr2 = bArr;
            AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda3(this, passwordsettings, z, bArr2, 5));
        }

        public void lambda$run$16(boolean z, TLRPC.TL_error tL_error) {
            if (z) {
                UserConfig.getInstance(((BaseFragment) PassportActivity.this).currentAccount).resetSavedPassword();
                PassportActivity.this.usingSavedPassword = 0;
                PassportActivity.this.updatePasswordInterface();
                if (PassportActivity.this.inputFieldContainers == null || PassportActivity.this.inputFieldContainers[0].getVisibility() != 0) {
                    return;
                }
                PassportActivity.this.inputFields[0].requestFocus();
                AndroidUtilities.showKeyboard(PassportActivity.this.inputFields[0]);
                return;
            }
            PassportActivity.this.showEditDoneProgress(true, false);
            if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                PassportActivity.this.onPasscodeError(true);
            } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                PassportActivity.this.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
            } else {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                PassportActivity.this.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
            }
        }

        public void lambda$run$9(TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
            if (tL_error == null) {
                PassportActivity.this.currentPassword = (TL_account.Password) tLObject;
                TwoStepVerificationActivity.initPasswordNewAlgo(PassportActivity.this.currentPassword);
                PassportActivity.this.onPasswordDone(z);
            }
        }

        private void openRequestInterface() {
            if (PassportActivity.this.inputFields == null) {
                return;
            }
            if (!this.val$saved) {
                UserConfig.getInstance(((BaseFragment) PassportActivity.this).currentAccount).savePassword(this.val$x_bytes, PassportActivity.this.saltedPassword);
            }
            AndroidUtilities.hideKeyboard(PassportActivity.this.inputFields[0]);
            PassportActivity.this.ignoreOnFailure = true;
            PassportActivity passportActivity = new PassportActivity(PassportActivity.this.currentBotId == 0 ? 8 : 0, PassportActivity.this.currentBotId, PassportActivity.this.currentScope, PassportActivity.this.currentPublicKey, PassportActivity.this.currentPayload, PassportActivity.this.currentNonce, PassportActivity.this.currentCallbackUrl, PassportActivity.this.currentForm, PassportActivity.this.currentPassword);
            passportActivity.currentEmail = PassportActivity.this.currentEmail;
            ((BaseFragment) passportActivity).currentAccount = ((BaseFragment) PassportActivity.this).currentAccount;
            passportActivity.saltedPassword = PassportActivity.this.saltedPassword;
            passportActivity.secureSecret = PassportActivity.this.secureSecret;
            passportActivity.secureSecretId = PassportActivity.this.secureSecretId;
            passportActivity.needActivityResult = PassportActivity.this.needActivityResult;
            if (((BaseFragment) PassportActivity.this).parentLayout == null || !((ActionBarLayout) ((BaseFragment) PassportActivity.this).parentLayout).checkTransitionAnimation()) {
                PassportActivity.this.presentFragment(passportActivity, true);
            } else {
                PassportActivity.this.presentAfterAnimation = passportActivity;
            }
        }

        private void resetSecret() {
            TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
            if (PassportActivity.this.currentPassword.current_algo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.password = SRPHelper.startCheck(this.val$x_bytes, PassportActivity.this.currentPassword.srp_id, PassportActivity.this.currentPassword.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) PassportActivity.this.currentPassword.current_algo);
            }
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings = updatepasswordsettings.new_settings.new_secure_settings;
            tL_secureSecretSettings.secure_secret = new byte[0];
            tL_secureSecretSettings.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
            TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
            passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
            passwordinputsettings2.flags |= 4;
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(this.val$req, new PassportActivity$8$$ExternalSyntheticLambda1(this, 0));
        }

        @Override
        public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new CallLogActivity$$ExternalSyntheticLambda31(this, this.val$saved, 2), 8);
            } else if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda3(this, tLObject, this.val$textPassword, this.val$saved, 3));
            } else {
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda28(this, this.val$saved, tL_error, 8));
            }
        }
    }

    public static class EncryptionResult {
        byte[] decrypyedFileSecret;
        byte[] encryptedData;
        byte[] fileHash;
        byte[] fileSecret;
        SecureDocumentKey secureDocumentKey;

        public EncryptionResult(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this.encryptedData = bArr;
            this.fileSecret = bArr2;
            this.fileHash = bArr4;
            this.decrypyedFileSecret = bArr3;
            this.secureDocumentKey = new SecureDocumentKey(bArr5, bArr6);
        }
    }

    public interface ErrorRunnable {
        void onError(String str, String str2);
    }

    public class LinkSpan extends ClickableSpan {
        public LinkSpan() {
        }

        @Override
        public void onClick(View view) {
            Browser.openUrl(PassportActivity.this.getParentActivity(), PassportActivity.this.currentForm.privacy_policy_url);
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setTypeface(AndroidUtilities.bold());
        }
    }

    public interface PassportActivityDelegate {
        void deleteValue(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList<TLRPC.TL_secureRequiredType> arrayList, boolean z, Runnable runnable, ErrorRunnable errorRunnable);

        SecureDocument saveFile(TLRPC.TL_secureFile tL_secureFile);

        void saveValue(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, ArrayList<SecureDocument> arrayList, SecureDocument secureDocument, ArrayList<SecureDocument> arrayList2, SecureDocument secureDocument2, SecureDocument secureDocument3, Runnable runnable, ErrorRunnable errorRunnable);
    }

    public class PhoneConfirmationView extends SlideView implements NotificationCenter.NotificationCenterDelegate {
        private ImageView blackImageView;
        private ImageView blueImageView;
        private EditTextBoldCursor[] codeField;
        private LinearLayout codeFieldContainer;
        private int codeTime;
        private Timer codeTimer;
        private TextView confirmTextView;
        private Bundle currentParams;
        private boolean ignoreOnTextChange;
        private double lastCodeTime;
        private double lastCurrentTime;
        private String lastError;
        private int length;
        private boolean nextPressed;
        private int nextType;
        private String pattern;
        private String phone;
        private String phoneHash;
        private TextView problemText;
        private ProgressView progressView;
        private int time;
        private TextView timeText;
        private Timer timeTimer;
        private int timeout;
        private final Object timerSync;
        private TextView titleTextView;
        private int verificationType;
        private boolean waitingForEvent;

        public class AnonymousClass4 extends TimerTask {
            public AnonymousClass4() {
            }

            public void lambda$run$0() {
                double dCurrentTimeMillis = System.currentTimeMillis();
                double d = dCurrentTimeMillis - PhoneConfirmationView.this.lastCodeTime;
                PhoneConfirmationView.this.lastCodeTime = dCurrentTimeMillis;
                PhoneConfirmationView.access$9926(PhoneConfirmationView.this, d);
                if (PhoneConfirmationView.this.codeTime <= 1000) {
                    PhoneConfirmationView.this.problemText.setVisibility(0);
                    PhoneConfirmationView.this.timeText.setVisibility(8);
                    PhoneConfirmationView.this.destroyCodeTimer();
                }
            }

            @Override
            public void run() {
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda60(this, 12));
            }
        }

        public class AnonymousClass5 extends TimerTask {
            public AnonymousClass5() {
            }

            public void lambda$run$0(TLRPC.TL_error tL_error) {
                PhoneConfirmationView.this.lastError = tL_error.text;
            }

            public void lambda$run$1(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null || tL_error.text == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new PhotoViewer$44$$ExternalSyntheticLambda0(27, this, tL_error));
            }

            public void lambda$run$2() {
                int i = 3;
                if (PhoneConfirmationView.this.time >= 1000) {
                    int i2 = (PhoneConfirmationView.this.time / 1000) / 60;
                    int i3 = (PhoneConfirmationView.this.time / 1000) - (i2 * 60);
                    if (PhoneConfirmationView.this.nextType == 4 || PhoneConfirmationView.this.nextType == 3) {
                        PhoneConfirmationView.this.timeText.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i2), Integer.valueOf(i3)));
                    } else if (PhoneConfirmationView.this.nextType == 2) {
                        PhoneConfirmationView.this.timeText.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i2), Integer.valueOf(i3)));
                    }
                    if (PhoneConfirmationView.this.progressView != null) {
                        PhoneConfirmationView.this.progressView.setProgress(1.0f - (PhoneConfirmationView.this.time / PhoneConfirmationView.this.timeout));
                        return;
                    }
                    return;
                }
                if (PhoneConfirmationView.this.progressView != null) {
                    PhoneConfirmationView.this.progressView.setProgress(1.0f);
                }
                PhoneConfirmationView.this.destroyTimer();
                if (PhoneConfirmationView.this.verificationType == 3) {
                    AndroidUtilities.setWaitingForCall(false);
                    NotificationCenter.getGlobalInstance().removeObserver(PhoneConfirmationView.this, NotificationCenter.didReceiveCall);
                    PhoneConfirmationView.this.waitingForEvent = false;
                    PhoneConfirmationView.this.destroyCodeTimer();
                    PhoneConfirmationView.this.resendCode();
                    return;
                }
                if (PhoneConfirmationView.this.verificationType == 2 || PhoneConfirmationView.this.verificationType == 4) {
                    if (PhoneConfirmationView.this.nextType != 4 && PhoneConfirmationView.this.nextType != 2) {
                        if (PhoneConfirmationView.this.nextType == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(PhoneConfirmationView.this, NotificationCenter.didReceiveSmsCode);
                            PhoneConfirmationView.this.waitingForEvent = false;
                            PhoneConfirmationView.this.destroyCodeTimer();
                            PhoneConfirmationView.this.resendCode();
                            return;
                        }
                        return;
                    }
                    if (PhoneConfirmationView.this.nextType == 4) {
                        PhoneConfirmationView.this.timeText.setText(LocaleController.getString(R.string.Calling));
                    } else {
                        PhoneConfirmationView.this.timeText.setText(LocaleController.getString(R.string.SendingSms));
                    }
                    PhoneConfirmationView.this.createCodeTimer();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = PhoneConfirmationView.this.phone;
                    tL_auth_resendCode.phone_code_hash = PhoneConfirmationView.this.phoneHash;
                    ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LinkManager$$ExternalSyntheticLambda10(this, i), 2);
                }
            }

            @Override
            public void run() {
                if (PhoneConfirmationView.this.timeTimer == null) {
                    return;
                }
                double dCurrentTimeMillis = System.currentTimeMillis();
                PhoneConfirmationView.access$10526(PhoneConfirmationView.this, dCurrentTimeMillis - PhoneConfirmationView.this.lastCurrentTime);
                PhoneConfirmationView.this.lastCurrentTime = dCurrentTimeMillis;
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda60(this, 13));
            }
        }

        public PhoneConfirmationView(Context context, int i) {
            float f;
            super(context);
            this.timerSync = new Object();
            this.time = 60000;
            this.codeTime = 15000;
            this.lastError = "";
            this.pattern = "*";
            this.verificationType = i;
            setOrientation(1);
            TextView textView = new TextView(context);
            this.confirmTextView = textView;
            int i2 = Theme.key_windowBackgroundWhiteGrayText6;
            textView.setTextColor(Theme.getColor(null, i2, false));
            this.confirmTextView.setTextSize(1, 14.0f);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            TextView textView2 = new TextView(context);
            this.titleTextView = textView2;
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            textView2.setTextColor(Theme.getColor(null, i3, false));
            this.titleTextView.setTextSize(1, 18.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.titleTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.titleTextView.setGravity(49);
            if (this.verificationType == 3) {
                this.confirmTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                FrameLayout frameLayout = new FrameLayout(context);
                addView(frameLayout, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3));
                ImageView imageView = new ImageView(context);
                f = 2.0f;
                imageView.setImageResource(R.drawable.phone_activate);
                boolean z = LocaleController.isRTL;
                if (z) {
                    frameLayout.addView(imageView, LayoutHelper.createFrame(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                    frameLayout.addView(this.confirmTextView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    frameLayout.addView(this.confirmTextView, LayoutHelper.createFrame(-1, -2.0f, z ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                    frameLayout.addView(imageView, LayoutHelper.createFrame(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
                }
            } else {
                f = 2.0f;
                this.confirmTextView.setGravity(49);
                FrameLayout frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, LayoutHelper.createLinear(-2, -2, 49));
                if (this.verificationType == 1) {
                    ImageView imageView2 = new ImageView(context);
                    this.blackImageView = imageView2;
                    imageView2.setImageResource(R.drawable.sms_devices);
                    ImageView imageView3 = this.blackImageView;
                    int color = Theme.getColor(null, i3, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView3.setColorFilter(new PorterDuffColorFilter(color, mode));
                    frameLayout2.addView(this.blackImageView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    ImageView imageView4 = new ImageView(context);
                    this.blueImageView = imageView4;
                    imageView4.setImageResource(R.drawable.sms_bubble);
                    this.blueImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_actionBackground, false), mode));
                    frameLayout2.addView(this.blueImageView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    this.titleTextView.setText(LocaleController.getString(R.string.SentAppCodeTitle));
                } else {
                    ImageView imageView5 = new ImageView(context);
                    this.blueImageView = imageView5;
                    imageView5.setImageResource(R.drawable.sms_code);
                    this.blueImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_actionBackground, false), PorterDuff.Mode.MULTIPLY));
                    frameLayout2.addView(this.blueImageView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    this.titleTextView.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
                }
                addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 18, 0, 0));
                addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 17, 0, 0));
            }
            LinearLayout linearLayout = new LinearLayout(context);
            this.codeFieldContainer = linearLayout;
            linearLayout.setOrientation(0);
            addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, 36, 1));
            if (this.verificationType == 3) {
                this.codeFieldContainer.setVisibility(8);
            }
            TextView textView3 = new TextView(context) {
                @Override
                public void onMeasure(int i4, int i5) {
                    super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                }
            };
            this.timeText = textView3;
            textView3.setTextColor(Theme.getColor(null, i2, false));
            this.timeText.setLineSpacing(AndroidUtilities.dp(f), 1.0f);
            if (this.verificationType == 3) {
                this.timeText.setTextSize(1, 14.0f);
                addView(this.timeText, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3));
                this.progressView = new ProgressView(context);
                this.timeText.setGravity(LocaleController.isRTL ? 5 : 3);
                addView(this.progressView, LayoutHelper.createLinear(-1, 3, 0.0f, 12.0f, 0.0f, 0.0f));
            } else {
                this.timeText.setPadding(0, AndroidUtilities.dp(f), 0, AndroidUtilities.dp(10.0f));
                this.timeText.setTextSize(1, 15.0f);
                this.timeText.setGravity(49);
                addView(this.timeText, LayoutHelper.createLinear(-2, -2, 49));
            }
            TextView textView4 = new TextView(context) {
                @Override
                public void onMeasure(int i4, int i5) {
                    super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                }
            };
            this.problemText = textView4;
            textView4.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.problemText.setLineSpacing(AndroidUtilities.dp(f), 1.0f);
            this.problemText.setPadding(0, AndroidUtilities.dp(f), 0, AndroidUtilities.dp(10.0f));
            this.problemText.setTextSize(1, 15.0f);
            this.problemText.setGravity(49);
            if (this.verificationType == 1) {
                this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
            } else {
                this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCode));
            }
            addView(this.problemText, LayoutHelper.createLinear(-2, -2, 49));
            this.problemText.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 27));
        }

        public static int access$10526(PhoneConfirmationView phoneConfirmationView, double d) {
            int i = (int) (((double) phoneConfirmationView.time) - d);
            phoneConfirmationView.time = i;
            return i;
        }

        public static int access$9926(PhoneConfirmationView phoneConfirmationView, double d) {
            int i = (int) (((double) phoneConfirmationView.codeTime) - d);
            phoneConfirmationView.codeTime = i;
            return i;
        }

        public void createCodeTimer() {
            if (this.codeTimer != null) {
                return;
            }
            this.codeTime = 15000;
            this.codeTimer = new Timer();
            this.lastCodeTime = System.currentTimeMillis();
            this.codeTimer.schedule(new AnonymousClass4(), 0L, 1000L);
        }

        private void createTimer() {
            if (this.timeTimer != null) {
                return;
            }
            Timer timer = new Timer();
            this.timeTimer = timer;
            timer.schedule(new AnonymousClass5(), 0L, 1000L);
        }

        public void destroyCodeTimer() {
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.codeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.codeTimer = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void destroyTimer() {
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.timeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.timeTimer = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public String getCode() {
            if (this.codeField == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
                if (i >= editTextBoldCursorArr.length) {
                    return sb.toString();
                }
                sb.append(PhoneFormat.stripExceptNumbers(editTextBoldCursorArr[i].getText().toString(), false));
                i++;
            }
        }

        public void lambda$new$0(View view) {
            if (this.nextPressed) {
                return;
            }
            int i = this.nextType;
            if ((i != 4 || this.verificationType != 2) && i != 0) {
                resendCode();
                return;
            }
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                Locale locale = Locale.US;
                String str = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str + " " + this.phone);
                intent.putExtra("android.intent.extra.TEXT", "Phone: " + this.phone + "\nApp version: " + str + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + this.lastError);
                getContext().startActivity(Intent.createChooser(intent, "Send email..."));
            } catch (Exception unused) {
                AlertsCreator.showSimpleAlert(PassportActivity.this, LocaleController.getString(R.string.NoMailInstalled));
            }
        }

        public void lambda$onBackPressed$8(AlertDialog alertDialog, int i) {
            onBackPressed(true);
            PassportActivity.this.setPage(0, true, null);
        }

        public static void lambda$onBackPressed$9(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        public void lambda$onNextPressed$6(TLRPC.TL_error tL_error, TL_account.verifyPhone verifyphone) {
            int i;
            int i2;
            PassportActivity.this.needHideProgress();
            this.nextPressed = false;
            if (tL_error == null) {
                destroyTimer();
                destroyCodeTimer();
                PassportActivity.this.delegate.saveValue(PassportActivity.this.currentType, (String) PassportActivity.this.currentValues.get("phone"), null, null, null, null, null, null, null, null, new PassportActivity$$ExternalSyntheticLambda11(PassportActivity.this, 6), null);
                return;
            }
            this.lastError = tL_error.text;
            int i3 = this.verificationType;
            if ((i3 == 3 && ((i2 = this.nextType) == 4 || i2 == 2)) || ((i3 == 2 && ((i = this.nextType) == 4 || i == 3)) || (i3 == 4 && this.nextType == 2))) {
                createTimer();
            }
            int i4 = this.verificationType;
            if (i4 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i4 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = true;
            if (this.verificationType != 3) {
                AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tL_error, PassportActivity.this, verifyphone, new Object[0]);
            }
            PassportActivity.this.showEditDoneProgress(true, false);
            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    onBackPressed(true);
                    PassportActivity.this.setPage(0, true, null);
                    return;
                }
                return;
            }
            int i5 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
                if (i5 >= editTextBoldCursorArr.length) {
                    editTextBoldCursorArr[0].requestFocus();
                    return;
                } else {
                    editTextBoldCursorArr[i5].setText("");
                    i5++;
                }
            }
        }

        public void lambda$onNextPressed$7(TL_account.verifyPhone verifyphone, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25((Object) this, (Object) tL_error, (Object) verifyphone, 19));
        }

        public void lambda$resendCode$1(AlertDialog alertDialog, int i) {
            onBackPressed(true);
            PassportActivity.this.finishFragment();
        }

        public void lambda$resendCode$2(TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
            this.nextPressed = false;
            if (tL_error == null) {
                PassportActivity.this.fillNextCodeParams(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
            } else {
                AlertDialog alertDialog = (AlertDialog) AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tL_error, PassportActivity.this, tL_auth_resendCode, new Object[0]);
                if (alertDialog != null && tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    alertDialog.positiveButtonListener = new PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda1(this, 0);
                }
            }
            PassportActivity.this.needHideProgress();
        }

        public void lambda$resendCode$3(Bundle bundle, TLRPC.TL_auth_resendCode tL_auth_resendCode, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda52(this, tL_error, bundle, tLObject, tL_auth_resendCode, 1));
        }

        public boolean lambda$setParams$4(int i, View view, int i2, KeyEvent keyEvent) {
            if (i2 != 67 || this.codeField[i].length() != 0 || i <= 0) {
                return false;
            }
            int i3 = i - 1;
            EditTextBoldCursor editTextBoldCursor = this.codeField[i3];
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            this.codeField[i3].requestFocus();
            this.codeField[i3].dispatchKeyEvent(keyEvent);
            return true;
        }

        public boolean lambda$setParams$5(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        public void resendCode() {
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            this.nextPressed = true;
            PassportActivity.this.needShowProgress();
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = this.phone;
            tL_auth_resendCode.phone_code_hash = this.phoneHash;
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new ProfileActivity$$ExternalSyntheticLambda2(this, bundle, tL_auth_resendCode, 2), 2);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            EditTextBoldCursor[] editTextBoldCursorArr;
            if (!this.waitingForEvent || (editTextBoldCursorArr = this.codeField) == null) {
                return;
            }
            if (i == NotificationCenter.didReceiveSmsCode) {
                editTextBoldCursorArr[0].setText("" + objArr[0]);
                lambda$onNextPressed$16(null);
                return;
            }
            if (i == NotificationCenter.didReceiveCall) {
                String str = "" + objArr[0];
                if (AndroidUtilities.checkPhonePattern(this.pattern, str)) {
                    this.ignoreOnTextChange = true;
                    this.codeField[0].setText(str);
                    this.ignoreOnTextChange = false;
                    lambda$onNextPressed$16(null);
                }
            }
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        @Override
        public boolean onBackPressed(boolean z) {
            if (!z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PassportActivity.this.getParentActivity(), 0, null);
                builder.setTitle(LocaleController.getString(R.string.AppName));
                builder.setMessage(LocaleController.getString(R.string.StopVerification));
                builder.setPositiveButton(LocaleController.getString(R.string.Continue), null);
                builder.setNegativeButton(LocaleController.getString(R.string.Stop), new PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda1(this, 1));
                PassportActivity.this.showDialog(builder.create());
                return false;
            }
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.phone;
            tL_auth_cancelCode.phone_code_hash = this.phoneHash;
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tL_auth_cancelCode, new PassportActivity$$ExternalSyntheticLambda3(13), 2);
            destroyTimer();
            destroyCodeTimer();
            this.currentParams = null;
            int i = this.verificationType;
            if (i == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            return true;
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public void onDestroyActivity() {
            super.onDestroyActivity();
            int i = this.verificationType;
            if (i == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            destroyTimer();
            destroyCodeTimer();
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            super.onLayout(z, i, i2, i3, i4);
            if (this.verificationType == 3 || this.blueImageView == null) {
                return;
            }
            int bottom = this.confirmTextView.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            if (this.problemText.getVisibility() == 0) {
                int measuredHeight2 = this.problemText.getMeasuredHeight();
                i5 = (measuredHeight + bottom) - measuredHeight2;
                TextView textView = this.problemText;
                textView.layout(textView.getLeft(), i5, this.problemText.getRight(), measuredHeight2 + i5);
            } else if (this.timeText.getVisibility() == 0) {
                int measuredHeight3 = this.timeText.getMeasuredHeight();
                i5 = (measuredHeight + bottom) - measuredHeight3;
                TextView textView2 = this.timeText;
                textView2.layout(textView2.getLeft(), i5, this.timeText.getRight(), measuredHeight3 + i5);
            } else {
                i5 = measuredHeight + bottom;
            }
            int measuredHeight4 = this.codeFieldContainer.getMeasuredHeight();
            int iM = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i5 - bottom, measuredHeight4, 2, bottom);
            LinearLayout linearLayout = this.codeFieldContainer;
            linearLayout.layout(linearLayout.getLeft(), iM, this.codeFieldContainer.getRight(), measuredHeight4 + iM);
        }

        @Override
        public void onMeasure(int i, int i2) {
            ImageView imageView;
            super.onMeasure(i, i2);
            if (this.verificationType == 3 || (imageView = this.blueImageView) == null) {
                return;
            }
            int iDp = AndroidUtilities.dp(35.0f) + this.confirmTextView.getMeasuredHeight() + this.titleTextView.getMeasuredHeight() + imageView.getMeasuredHeight();
            int iDp2 = AndroidUtilities.dp(80.0f);
            int iDp3 = AndroidUtilities.dp(291.0f);
            if (PassportActivity.this.scrollHeight - iDp < iDp2) {
                setMeasuredDimension(getMeasuredWidth(), iDp + iDp2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(PassportActivity.this.scrollHeight, iDp3));
            }
        }

        @Override
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            if (str == null) {
                str = getCode();
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.shakeView(this.codeFieldContainer);
                return;
            }
            this.nextPressed = true;
            int i = this.verificationType;
            if (i == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            PassportActivity.this.showEditDoneProgress(true, true);
            TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
            verifyphone.phone_number = this.phone;
            verifyphone.phone_code = str;
            verifyphone.phone_code_hash = this.phoneHash;
            destroyTimer();
            PassportActivity.this.needShowProgress();
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(verifyphone, new LinkManager$$ExternalSyntheticLambda15(7, this, verifyphone), 2);
        }

        @Override
        public void onShow() {
            super.onShow();
            LinearLayout linearLayout = this.codeFieldContainer;
            if (linearLayout == null || linearLayout.getVisibility() != 0) {
                return;
            }
            for (int length = this.codeField.length - 1; length >= 0; length--) {
                if (length == 0 || this.codeField[length].length() != 0) {
                    this.codeField[length].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = this.codeField[length];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(this.codeField[length]);
                    return;
                }
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            int i;
            int i2;
            if (bundle == null) {
                return;
            }
            this.waitingForEvent = true;
            int i3 = this.verificationType;
            if (i3 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i3 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.currentParams = bundle;
            this.phone = bundle.getString("phone");
            this.phoneHash = bundle.getString("phoneHash");
            int i4 = bundle.getInt("timeout");
            this.time = i4;
            this.timeout = i4;
            this.nextType = bundle.getInt("nextType");
            this.pattern = bundle.getString("pattern");
            int i5 = bundle.getInt("length");
            this.length = i5;
            if (i5 == 0) {
                this.length = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
            CharSequence charSequenceReplaceTags = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.length) {
                int i6 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.codeField;
                    if (i6 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    editTextBoldCursorArr2[i6].setText("");
                    i6++;
                }
            } else {
                this.codeField = new EditTextBoldCursor[this.length];
                final int i7 = 0;
                while (i7 < this.length) {
                    this.codeField[i7] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.codeField[i7];
                    int i8 = Theme.key_windowBackgroundWhiteBlackText;
                    editTextBoldCursor.setTextColor(Theme.getColor(null, i8, false));
                    this.codeField[i7].setCursorColor(Theme.getColor(null, i8, false));
                    this.codeField[i7].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.codeField[i7].setCursorWidth(1.5f);
                    Drawable drawableMutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), PorterDuff.Mode.MULTIPLY));
                    this.codeField[i7].setBackgroundDrawable(drawableMutate);
                    this.codeField[i7].setImeOptions(268435461);
                    this.codeField[i7].setTextSize(1, 20.0f);
                    this.codeField[i7].setMaxLines(1);
                    this.codeField[i7].setTypeface(AndroidUtilities.bold());
                    this.codeField[i7].setPadding(0, 0, 0, 0);
                    this.codeField[i7].setGravity(49);
                    if (this.verificationType == 3) {
                        this.codeField[i7].setEnabled(false);
                        this.codeField[i7].setInputType(0);
                        this.codeField[i7].setVisibility(8);
                    } else {
                        this.codeField[i7].setInputType(3);
                    }
                    this.codeFieldContainer.addView(this.codeField[i7], LayoutHelper.createLinear(34, 36, 1, 0, 0, i7 != this.length - 1 ? 7 : 0, 0));
                    this.codeField[i7].addTextChangedListener(new TextWatcher() {
                        @Override
                        public void afterTextChanged(Editable editable) {
                            int length;
                            if (!PhoneConfirmationView.this.ignoreOnTextChange && (length = editable.length()) >= 1) {
                                if (length > 1) {
                                    String string = editable.toString();
                                    PhoneConfirmationView.this.ignoreOnTextChange = true;
                                    for (int i9 = 0; i9 < Math.min(PhoneConfirmationView.this.length - i7, length); i9++) {
                                        if (i9 == 0) {
                                            editable.replace(0, length, string.substring(i9, i9 + 1));
                                        } else {
                                            PhoneConfirmationView.this.codeField[i7 + i9].setText(string.substring(i9, i9 + 1));
                                        }
                                    }
                                    PhoneConfirmationView.this.ignoreOnTextChange = false;
                                }
                                if (i7 != PhoneConfirmationView.this.length - 1) {
                                    PhoneConfirmationView.this.codeField[i7 + 1].setSelection(PhoneConfirmationView.this.codeField[i7 + 1].length());
                                    PhoneConfirmationView.this.codeField[i7 + 1].requestFocus();
                                }
                                if ((i7 == PhoneConfirmationView.this.length - 1 || (i7 == PhoneConfirmationView.this.length - 2 && length >= 2)) && PhoneConfirmationView.this.getCode().length() == PhoneConfirmationView.this.length) {
                                    PhoneConfirmationView.this.lambda$onNextPressed$16(null);
                                }
                            }
                        }

                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
                        }
                    });
                    this.codeField[i7].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
                            return this.f$0.lambda$setParams$4(i7, view, i9, keyEvent);
                        }
                    });
                    this.codeField[i7].setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda350(this, 10));
                    i7++;
                }
            }
            ProgressView progressView = this.progressView;
            if (progressView != null) {
                progressView.setVisibility(this.nextType != 0 ? 0 : 8);
            }
            if (this.phone == null) {
                return;
            }
            String strM = UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), this.phone, PhoneFormat.getInstance());
            int i9 = this.verificationType;
            if (i9 == 2) {
                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(strM)));
            } else if (i9 == 3) {
                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(strM)));
            } else if (i9 == 4) {
                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(strM)));
            }
            this.confirmTextView.setText(charSequenceReplaceTags);
            if (this.verificationType != 3) {
                AndroidUtilities.showKeyboard(this.codeField[0]);
                this.codeField[0].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.codeField[0]);
            }
            destroyTimer();
            destroyCodeTimer();
            this.lastCurrentTime = System.currentTimeMillis();
            int i10 = this.verificationType;
            if (i10 == 3 && ((i2 = this.nextType) == 4 || i2 == 2)) {
                this.problemText.setVisibility(8);
                this.timeText.setVisibility(0);
                int i11 = this.nextType;
                if (i11 == 4) {
                    this.timeText.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                } else if (i11 == 2) {
                    this.timeText.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                }
                createTimer();
                return;
            }
            if (i10 == 2 && ((i = this.nextType) == 4 || i == 3)) {
                this.timeText.setText(LocaleController.formatString("CallText", R.string.CallText, 2, 0));
                this.problemText.setVisibility(this.time < 1000 ? 0 : 8);
                this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                createTimer();
                return;
            }
            if (i10 != 4 || this.nextType != 2) {
                this.timeText.setVisibility(8);
                this.problemText.setVisibility(8);
                createCodeTimer();
            } else {
                this.timeText.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
                this.problemText.setVisibility(this.time < 1000 ? 0 : 8);
                this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                createTimer();
            }
        }
    }

    public static class ProgressView extends View {
        private Paint paint;
        private Paint paint2;
        private float progress;

        public ProgressView(Context context) {
            super(context);
            this.paint = new Paint();
            this.paint2 = new Paint();
            this.paint.setColor(Theme.getColor(null, Theme.key_login_progressInner, false));
            this.paint2.setColor(Theme.getColor(null, Theme.key_login_progressOuter, false));
        }

        @Override
        public void onDraw(Canvas canvas) {
            float measuredWidth = (int) (getMeasuredWidth() * this.progress);
            canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.paint2);
            canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
        }

        public void setProgress(float f) {
            this.progress = f;
            invalidate();
        }
    }

    public class SecureDocumentCell extends FrameLayout implements DownloadController.FileDownloadProgressListener {
        private int TAG;
        private int buttonState;
        private SecureDocument currentSecureDocument;
        private BackupImageView imageView;
        private RadialProgress radialProgress;
        private TextView textView;
        private TextView valueTextView;

        public SecureDocumentCell(Context context) {
            super(context);
            this.TAG = DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).generateObserverTag();
            this.radialProgress = new RadialProgress(this);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 8.0f, 21.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            View view = this.textView;
            boolean z = LocaleController.isRTL;
            addView(view, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 81, 10.0f, z ? 81 : 21, 0.0f));
            TextView textView2 = new TextView(context);
            this.valueTextView = textView2;
            textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
            this.valueTextView.setTextSize(1, 13.0f);
            this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.valueTextView.setLines(1);
            this.valueTextView.setMaxLines(1);
            this.valueTextView.setSingleLine(true);
            this.valueTextView.setPadding(0, 0, 0, 0);
            View view2 = this.valueTextView;
            boolean z2 = LocaleController.isRTL;
            addView(view2, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 81, 35.0f, z2 ? 81 : 21, 0.0f));
            setWillNotDraw(false);
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            boolean zDrawChild = super.drawChild(canvas, view, j);
            if (view == this.imageView) {
                this.radialProgress.draw(canvas);
            }
            return zDrawChild;
        }

        @Override
        public int getObserverTag() {
            return this.TAG;
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.textView.invalidate();
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(false);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int measuredWidth = ((this.imageView.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) / 2) + this.imageView.getLeft();
            int measuredHeight = ((this.imageView.getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2) + this.imageView.getTop();
            this.radialProgress.setProgressRect(measuredWidth, measuredHeight, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + measuredHeight);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ArticleViewer$10$$ExternalSyntheticOutline0.m(64.0f, 1, 1073741824));
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
            if (this.buttonState != 1) {
                updateButtonState(false);
            }
        }

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        public void setTextAndValueAndImage(String str, CharSequence charSequence, SecureDocument secureDocument) {
            this.textView.setText(str);
            this.valueTextView.setText(charSequence);
            this.imageView.setImage(secureDocument, "48_48");
            this.currentSecureDocument = secureDocument;
            updateButtonState(false);
        }

        public void setValue(CharSequence charSequence) {
            this.valueTextView.setText(charSequence);
        }

        public void updateButtonState(boolean z) {
            String attachFileName = FileLoader.getAttachFileName(this.currentSecureDocument);
            boolean zExists = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.currentSecureDocument).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setBackground(null, false, false);
                return;
            }
            SecureDocument secureDocument = this.currentSecureDocument;
            if (secureDocument.path != null) {
                if (secureDocument.inputFile != null) {
                    DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).removeLoadingFileObserver(this);
                    this.radialProgress.setBackground(null, false, z);
                    this.buttonState = -1;
                    return;
                } else {
                    DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).addLoadingFileObserver(this.currentSecureDocument.path, this);
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(this.currentSecureDocument.path);
                    this.radialProgress.setBackground(getResources().getDrawable(R.drawable.circle), true, z);
                    this.radialProgress.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
                    invalidate();
                    return;
                }
            }
            if (zExists) {
                DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).removeLoadingFileObserver(this);
                this.buttonState = -1;
                this.radialProgress.setBackground(null, false, z);
                invalidate();
                return;
            }
            DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).addLoadingFileObserver(attachFileName, this);
            this.buttonState = 1;
            Float fileProgress2 = ImageLoader.getInstance().getFileProgress(attachFileName);
            this.radialProgress.setBackground(getResources().getDrawable(R.drawable.circle), true, z);
            this.radialProgress.setProgress(fileProgress2 != null ? fileProgress2.floatValue() : 0.0f, z);
            invalidate();
        }
    }

    public class TextDetailSecureCell extends FrameLayout {
        private ImageView checkImageView;
        private boolean needDivider;
        private TextView textView;
        private TextView valueTextView;

        public TextDetailSecureCell(Context context) {
            super(context);
            int i = PassportActivity.this.currentActivityType == 8 ? 21 : 51;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            TextView textView2 = this.textView;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView3 = this.textView;
            boolean z = LocaleController.isRTL;
            addView(textView3, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? i : 21, 10.0f, z ? 21 : i, 0.0f));
            TextView textView4 = new TextView(context);
            this.valueTextView = textView4;
            textView4.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
            this.valueTextView.setTextSize(1, 13.0f);
            this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.valueTextView.setLines(1);
            this.valueTextView.setMaxLines(1);
            this.valueTextView.setSingleLine(true);
            this.valueTextView.setEllipsize(truncateAt);
            this.valueTextView.setPadding(0, 0, 0, 0);
            TextView textView5 = this.valueTextView;
            boolean z2 = LocaleController.isRTL;
            addView(textView5, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? i : 21, 35.0f, z2 ? 21 : i, 0.0f));
            ImageView imageView = new ImageView(context);
            this.checkImageView = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_featuredStickers_addedIcon, false), PorterDuff.Mode.MULTIPLY));
            this.checkImageView.setImageResource(R.drawable.sticker_added);
            addView(this.checkImageView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 25.0f, 21.0f, 0.0f));
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        public void setChecked(boolean z) {
            this.checkImageView.setVisibility(z ? 0 : 4);
        }

        public void setNeedDivider(boolean z) {
            this.needDivider = z;
            setWillNotDraw(!z);
            invalidate();
        }

        public void setTextAndValue(String str, CharSequence charSequence, boolean z) {
            this.textView.setText(str);
            this.valueTextView.setText(charSequence);
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        public void setValue(CharSequence charSequence) {
            this.valueTextView.setText(charSequence);
        }
    }

    public PassportActivity(int i, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap<String, String> map, HashMap<String, String> map2) {
        super(null);
        this.currentCitizeship = "";
        this.currentResidence = "";
        this.currentExpireDate = new int[3];
        this.dividers = new ArrayList<>();
        this.nonLatinNames = new boolean[3];
        this.allowNonLatinName = true;
        this.countriesArray = new ArrayList<>();
        this.countriesMap = new HashMap<>();
        this.codesMap = new HashMap<>();
        this.phoneFormatMap = new HashMap<>();
        this.documents = new ArrayList<>();
        this.translationDocuments = new ArrayList<>();
        this.documentsCells = new HashMap<>();
        this.uploadingDocuments = new HashMap<>();
        this.typesValues = new HashMap<>();
        this.typesViews = new HashMap<>();
        this.documentsToTypesLink = new HashMap<>();
        this.errorsMap = new HashMap<>();
        this.mainErrorsMap = new HashMap<>();
        this.errorsValues = new HashMap<>();
        this.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public void deleteImageAtIndex(int i2) {
                SecureDocument secureDocument;
                if (PassportActivity.this.uploadingFileType == 1) {
                    secureDocument = PassportActivity.this.selfieDocument;
                } else if (PassportActivity.this.uploadingFileType == 4) {
                    secureDocument = (SecureDocument) PassportActivity.this.translationDocuments.get(i2);
                } else if (PassportActivity.this.uploadingFileType == 2) {
                    secureDocument = PassportActivity.this.frontDocument;
                } else {
                    secureDocument = PassportActivity.this.uploadingFileType == 3 ? PassportActivity.this.reverseDocument : (SecureDocument) PassportActivity.this.documents.get(i2);
                }
                SecureDocumentCell secureDocumentCell = (SecureDocumentCell) PassportActivity.this.documentsCells.remove(secureDocument);
                if (secureDocumentCell == null) {
                    return;
                }
                String documentHash = PassportActivity.this.getDocumentHash(secureDocument);
                String strM = null;
                if (PassportActivity.this.uploadingFileType == 1) {
                    PassportActivity.this.selfieDocument = null;
                    strM = "selfie" + documentHash;
                } else if (PassportActivity.this.uploadingFileType == 4) {
                    strM = zzii.m("translation", documentHash);
                } else if (PassportActivity.this.uploadingFileType == 2) {
                    PassportActivity.this.frontDocument = null;
                    strM = "front" + documentHash;
                } else if (PassportActivity.this.uploadingFileType == 3) {
                    PassportActivity.this.reverseDocument = null;
                    strM = "reverse" + documentHash;
                } else if (PassportActivity.this.uploadingFileType == 0) {
                    strM = zzii.m("files", documentHash);
                }
                if (strM != null) {
                    if (PassportActivity.this.documentsErrors != null) {
                        PassportActivity.this.documentsErrors.remove(strM);
                    }
                    if (PassportActivity.this.errorsValues != null) {
                        PassportActivity.this.errorsValues.remove(strM);
                    }
                }
                PassportActivity passportActivity = PassportActivity.this;
                passportActivity.updateUploadText(passportActivity.uploadingFileType);
                PassportActivity.this.currentPhotoViewerLayout.removeView(secureDocumentCell);
            }

            @Override
            public String getDeleteMessageString() {
                return PassportActivity.this.uploadingFileType == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
            }

            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i2, boolean z, boolean z2) {
                if (i2 < 0 || i2 >= PassportActivity.this.currentPhotoViewerLayout.getChildCount()) {
                    return null;
                }
                SecureDocumentCell secureDocumentCell = (SecureDocumentCell) PassportActivity.this.currentPhotoViewerLayout.getChildAt(i2);
                int[] iArr = new int[2];
                secureDocumentCell.imageView.getLocationInWindow(iArr);
                PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                placeProviderObject.viewX = iArr[0];
                placeProviderObject.viewY = iArr[1];
                placeProviderObject.parentView = PassportActivity.this.currentPhotoViewerLayout;
                ImageReceiver imageReceiver = secureDocumentCell.imageView.getImageReceiver();
                placeProviderObject.imageReceiver = imageReceiver;
                placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                return placeProviderObject;
            }
        };
        this.currentActivityType = i;
        this.currentForm = authorizationform;
        this.currentType = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.allowNonLatinName = tL_secureRequiredType.native_names;
        }
        this.currentTypeValue = tL_secureValue;
        this.currentDocumentsType = tL_secureRequiredType2;
        this.currentDocumentsTypeValue = tL_secureValue2;
        this.currentPassword = password;
        this.currentValues = map;
        this.currentDocumentValues = map2;
        if (i == 3) {
            this.permissionsItems = new ArrayList<>();
        } else if (i == 7) {
            this.views = new SlideView[3];
        }
        if (this.currentValues == null) {
            this.currentValues = new HashMap<>();
        }
        if (this.currentDocumentValues == null) {
            this.currentDocumentValues = new HashMap<>();
        }
        if (i == 5) {
            if (UserConfig.getInstance(this.currentAccount).savedPasswordHash != null && UserConfig.getInstance(this.currentAccount).savedSaltedPassword != null) {
                this.usingSavedPassword = 1;
                this.savedPasswordHash = UserConfig.getInstance(this.currentAccount).savedPasswordHash;
                this.savedSaltedPassword = UserConfig.getInstance(this.currentAccount).savedSaltedPassword;
            }
            TL_account.Password password2 = this.currentPassword;
            if (password2 == null) {
                loadPasswordInfo();
            } else {
                TwoStepVerificationActivity.initPasswordNewAlgo(password2);
                if (this.usingSavedPassword == 1) {
                    onPasswordDone(true);
                }
            }
            if (SharedConfig.isPassportConfigLoaded()) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = SharedConfig.passportConfigHash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new PassportActivity$$ExternalSyntheticLambda3(0));
        }
    }

    private void addDocumentView(final SecureDocument secureDocument, final int i) {
        String string;
        String str;
        String dateForBan;
        HashMap<String, String> map;
        if (i == 1) {
            this.selfieDocument = secureDocument;
            if (this.selfieLayout == null) {
                return;
            }
        } else if (i == 4) {
            this.translationDocuments.add(secureDocument);
            if (this.translationLayout == null) {
                return;
            }
        } else if (i == 2) {
            this.frontDocument = secureDocument;
            if (this.frontLayout == null) {
                return;
            }
        } else if (i == 3) {
            this.reverseDocument = secureDocument;
            if (this.reverseLayout == null) {
                return;
            }
        } else {
            this.documents.add(secureDocument);
            if (this.documentsLayout == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final SecureDocumentCell secureDocumentCell = new SecureDocumentCell(getParentActivity());
        secureDocumentCell.setTag(secureDocument);
        secureDocumentCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        this.documentsCells.put(secureDocument, secureDocumentCell);
        String documentHash = getDocumentHash(secureDocument);
        if (i == 1) {
            string = LocaleController.getString(R.string.PassportSelfie);
            this.selfieLayout.addView(secureDocumentCell, LayoutHelper.createLinear(-1, -2));
            str = "selfie" + documentHash;
        } else if (i == 4) {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.translationLayout.addView(secureDocumentCell, LayoutHelper.createLinear(-1, -2));
            str = "translation" + documentHash;
        } else if (i == 2) {
            TLRPC.SecureValueType secureValueType = this.currentDocumentsType.type;
            string = ((secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) ? LocaleController.getString(R.string.PassportMainPage) : LocaleController.getString(R.string.PassportFrontSide);
            this.frontLayout.addView(secureDocumentCell, LayoutHelper.createLinear(-1, -2));
            str = "front" + documentHash;
        } else if (i == 3) {
            string = LocaleController.getString(R.string.PassportReverseSide);
            this.reverseLayout.addView(secureDocumentCell, LayoutHelper.createLinear(-1, -2));
            str = "reverse" + documentHash;
        } else {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.documentsLayout.addView(secureDocumentCell, LayoutHelper.createLinear(-1, -2));
            str = "files" + documentHash;
        }
        final String str2 = str;
        if (str2 == null || (map = this.documentsErrors) == null || (dateForBan = map.get(str2)) == null) {
            dateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        } else {
            secureDocumentCell.valueTextView.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            this.errorsValues.put(str2, "");
        }
        secureDocumentCell.setTextAndValueAndImage(string, dateForBan, secureDocument);
        secureDocumentCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda323(this, i, 5));
        secureDocumentCell.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.lambda$addDocumentView$57(i, secureDocument, secureDocumentCell, str2, view);
            }
        });
    }

    private void addDocumentViewInternal(TLRPC.TL_secureFile tL_secureFile, int i) {
        addDocumentView(new SecureDocument(getSecureDocumentKey(tL_secureFile.secret, tL_secureFile.file_hash), tL_secureFile, null, null, null), i);
    }

    private void addDocumentViews(ArrayList<TLRPC.SecureFile> arrayList) {
        this.documents.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.SecureFile secureFile = arrayList.get(i);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                addDocumentViewInternal((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    private TextDetailSecureCell addField(Context context, TLRPC.TL_secureRequiredType tL_secureRequiredType, ArrayList<TLRPC.TL_secureRequiredType> arrayList, boolean z, boolean z2) {
        String string;
        String str;
        String strDecryptData;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        String str2;
        TLRPC.TL_secureValue valueByType;
        String string2;
        int size = arrayList != null ? arrayList.size() : 0;
        TextDetailSecureCell textDetailSecureCell = new TextDetailSecureCell(context);
        textDetailSecureCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            if (arrayList == null || arrayList.isEmpty()) {
                string2 = LocaleController.getString(R.string.PassportPersonalDetails);
            } else if (z && arrayList.size() == 1) {
                string2 = getTextForType(arrayList.get(0).type);
            } else {
                string2 = (z && arrayList.size() == 2) ? LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, getTextForType(arrayList.get(0).type), getTextForType(arrayList.get(1).type)) : LocaleController.getString(R.string.PassportIdentityDocument);
            }
            textDetailSecureCell.setTextAndValue(string2, "", !z2);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            if (arrayList == null || arrayList.isEmpty()) {
                string = LocaleController.getString(R.string.PassportAddress);
            } else if (z && arrayList.size() == 1) {
                string = getTextForType(arrayList.get(0).type);
            } else {
                string = (z && arrayList.size() == 2) ? LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, getTextForType(arrayList.get(0).type), getTextForType(arrayList.get(1).type)) : LocaleController.getString(R.string.PassportResidentialAddress);
            }
            textDetailSecureCell.setTextAndValue(string, "", !z2);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            textDetailSecureCell.setTextAndValue(LocaleController.getString(R.string.PassportPhone), "", !z2);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            textDetailSecureCell.setTextAndValue(LocaleController.getString(R.string.PassportEmail), "", !z2);
        }
        if (this.currentActivityType == 8) {
            LinearLayout linearLayout = this.linearLayout2;
            linearLayout.addView(textDetailSecureCell, linearLayout.getChildCount() - 5, LayoutHelper.createLinear(-1, -2));
        } else {
            this.linearLayout2.addView(textDetailSecureCell, LayoutHelper.createLinear(-1, -2));
        }
        textDetailSecureCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda70(arrayList, tL_secureRequiredType, this, z));
        this.typesViews.put(tL_secureRequiredType, textDetailSecureCell);
        this.typesValues.put(tL_secureRequiredType, new HashMap<>());
        TLRPC.TL_secureValue valueByType2 = getValueByType(tL_secureRequiredType, false);
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        if (valueByType2 != null) {
            TLRPC.SecurePlainData securePlainData = valueByType2.plain_data;
            if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                str = ((TLRPC.TL_securePlainEmail) securePlainData).email;
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
                str = ((TLRPC.TL_securePlainPhone) securePlainData).phone;
            } else {
                TLRPC.TL_secureData tL_secureData = valueByType2.data;
                if (tL_secureData != null) {
                    strDecryptData = decryptData(tL_secureData.data, decryptValueSecret(tL_secureData.secret, tL_secureData.data_hash), valueByType2.data.data_hash);
                    str = null;
                } else {
                    str = null;
                    strDecryptData = null;
                }
            }
            strDecryptData = null;
        } else {
            str = null;
            strDecryptData = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            tL_secureRequiredType2 = null;
            str2 = null;
        } else {
            int size2 = arrayList.size();
            String strDecryptData2 = null;
            boolean z3 = false;
            for (int i = 0; i < size2; i++) {
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = arrayList.get(i);
                this.typesValues.put(tL_secureRequiredType4, new HashMap<>());
                this.documentsToTypesLink.put(tL_secureRequiredType4, tL_secureRequiredType);
                if (!z3 && (valueByType = getValueByType(tL_secureRequiredType4, false)) != null) {
                    TLRPC.TL_secureData tL_secureData2 = valueByType.data;
                    if (tL_secureData2 != null) {
                        strDecryptData2 = decryptData(tL_secureData2.data, decryptValueSecret(tL_secureData2.secret, tL_secureData2.data_hash), valueByType.data.data_hash);
                    }
                    tL_secureRequiredType3 = tL_secureRequiredType4;
                    z3 = true;
                }
            }
            if (tL_secureRequiredType3 == null) {
                tL_secureRequiredType3 = arrayList.get(0);
            }
            tL_secureRequiredType2 = tL_secureRequiredType3;
            str2 = strDecryptData2;
        }
        setTypeValue(tL_secureRequiredType, str, strDecryptData, tL_secureRequiredType2, str2, z, size);
        return textDetailSecureCell;
    }

    private void addTranslationDocumentViews(ArrayList<TLRPC.SecureFile> arrayList) {
        this.translationDocuments.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.SecureFile secureFile = arrayList.get(i);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                addDocumentViewInternal((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public void callCallback(boolean z) {
        int i;
        int i2;
        if (this.callbackCalled) {
            return;
        }
        if (TextUtils.isEmpty(this.currentCallbackUrl)) {
            if (this.needActivityResult) {
                if (z || (!this.ignoreOnFailure && ((i = this.currentActivityType) == 5 || i == 0))) {
                    getParentActivity().setResult(z ? -1 : 0);
                }
                this.callbackCalled = true;
                return;
            }
            return;
        }
        if (z) {
            Browser.openUrl(getParentActivity(), Uri.parse(this.currentCallbackUrl + "&tg_passport=success"), true, true);
        } else if (!this.ignoreOnFailure && ((i2 = this.currentActivityType) == 5 || i2 == 0)) {
            Browser.openUrl(getParentActivity(), Uri.parse(this.currentCallbackUrl + "&tg_passport=cancel"), true, true);
        }
        this.callbackCalled = true;
    }

    public boolean checkDiscard(boolean z) {
        if (isHasNotAnyChanges()) {
            return false;
        }
        if (!z) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new PassportActivity$$ExternalSyntheticLambda1(this, 6));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setTitle(LocaleController.getString(R.string.DiscardChanges));
        builder.setMessage(LocaleController.getString(R.string.PassportDiscardChanges));
        showDialog(builder.create());
        return true;
    }

    public void checkFieldForError(EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z) {
        String str2;
        String str3;
        String str4;
        HashMap<String, String> map = this.errorsValues;
        if (map == null || (str2 = map.get(str)) == null || !TextUtils.equals(str2, editable)) {
            editTextBoldCursor.setErrorText(null);
        } else {
            HashMap<String, String> map2 = this.fieldsErrors;
            if (map2 == null || (str4 = map2.get(str)) == null) {
                HashMap<String, String> map3 = this.documentsErrors;
                if (map3 != null && (str3 = map3.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str3);
                }
            } else {
                editTextBoldCursor.setErrorText(str4);
            }
        }
        String str5 = z ? "error_document_all" : "error_all";
        HashMap<String, String> map4 = this.errorsValues;
        if (map4 == null || !map4.containsKey(str5)) {
            return;
        }
        this.errorsValues.remove(str5);
        checkTopErrorCell(false);
    }

    public boolean checkFieldsForError() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        boolean z;
        View view;
        if (this.currentDocumentsType != null) {
            if (this.errorsValues.containsKey("error_all") || this.errorsValues.containsKey("error_document_all")) {
                onFieldError(this.topErrorCell);
                return true;
            }
            if (this.uploadDocumentCell != null) {
                if (this.documents.isEmpty()) {
                    onFieldError(this.uploadDocumentCell);
                    return true;
                }
                int size = this.documents.size();
                for (int i = 0; i < size; i++) {
                    SecureDocument secureDocument = this.documents.get(i);
                    String str = "files" + getDocumentHash(secureDocument);
                    if (str != null && this.errorsValues.containsKey(str)) {
                        onFieldError(this.documentsCells.get(secureDocument));
                        return true;
                    }
                }
            }
            if (this.errorsValues.containsKey("files_all") || this.errorsValues.containsKey("translation_all")) {
                onFieldError(this.bottomCell);
                return true;
            }
            View view2 = this.uploadFrontCell;
            if (view2 != null) {
                if (this.frontDocument == null) {
                    onFieldError(view2);
                    return true;
                }
                if (this.errorsValues.containsKey("front" + getDocumentHash(this.frontDocument))) {
                    onFieldError(this.documentsCells.get(this.frontDocument));
                    return true;
                }
            }
            TLRPC.SecureValueType secureValueType = this.currentDocumentsType.type;
            if (((secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) && (view = this.uploadReverseCell) != null) {
                if (this.reverseDocument == null) {
                    onFieldError(view);
                    return true;
                }
                if (this.errorsValues.containsKey("reverse" + getDocumentHash(this.reverseDocument))) {
                    onFieldError(this.documentsCells.get(this.reverseDocument));
                    return true;
                }
            }
            View view3 = this.uploadSelfieCell;
            if (view3 != null && this.currentBotId != 0) {
                if (this.selfieDocument == null) {
                    onFieldError(view3);
                    return true;
                }
                if (this.errorsValues.containsKey("selfie" + getDocumentHash(this.selfieDocument))) {
                    onFieldError(this.documentsCells.get(this.selfieDocument));
                    return true;
                }
            }
            if (this.uploadTranslationCell != null && this.currentBotId != 0) {
                if (this.translationDocuments.isEmpty()) {
                    onFieldError(this.uploadTranslationCell);
                    return true;
                }
                int size2 = this.translationDocuments.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    SecureDocument secureDocument2 = this.translationDocuments.get(i2);
                    if (this.errorsValues.containsKey("translation" + getDocumentHash(secureDocument2))) {
                        onFieldError(this.documentsCells.get(secureDocument2));
                        return true;
                    }
                }
            }
        }
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                editTextBoldCursorArr = this.inputFields;
            } else {
                TextInfoPrivacyCell textInfoPrivacyCell = this.nativeInfoCell;
                editTextBoldCursorArr = (textInfoPrivacyCell == null || textInfoPrivacyCell.getVisibility() != 0) ? null : this.inputExtraFields;
            }
            if (editTextBoldCursorArr != null) {
                int i4 = 0;
                while (i4 < editTextBoldCursorArr.length) {
                    boolean zHasErrorText = editTextBoldCursorArr[i4].hasErrorText();
                    if (!this.errorsValues.isEmpty()) {
                        TLRPC.SecureValueType secureValueType2 = this.currentType.type;
                        String str2 = "country_code";
                        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                            if (i3 == 0) {
                                switch (i4) {
                                    case 0:
                                        str2 = "first_name";
                                        break;
                                    case 1:
                                        str2 = "middle_name";
                                        break;
                                    case 2:
                                        str2 = "last_name";
                                        break;
                                    case 3:
                                        str2 = "birth_date";
                                        break;
                                    case 4:
                                        str2 = "gender";
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        str2 = "residence_country_code";
                                        break;
                                    case 7:
                                        str2 = "document_no";
                                        break;
                                    case 8:
                                        str2 = "expiry_date";
                                        break;
                                    default:
                                        str2 = null;
                                        break;
                                }
                            } else if (i4 == 0) {
                                str2 = "first_name_native";
                            } else if (i4 != 1) {
                                str2 = i4 != 2 ? null : "last_name_native";
                            } else {
                                str2 = "middle_name_native";
                            }
                        } else if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress)) {
                            str2 = null;
                        } else if (i4 == 0) {
                            str2 = "street_line1";
                        } else if (i4 == 1) {
                            str2 = "street_line2";
                        } else if (i4 == 2) {
                            str2 = "post_code";
                        } else if (i4 == 3) {
                            str2 = "city";
                        } else if (i4 == 4) {
                            str2 = "state";
                        } else if (i4 != 5) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            String str3 = this.errorsValues.get(str2);
                            if (!TextUtils.isEmpty(str3) && str3.equals(editTextBoldCursorArr[i4].getText().toString())) {
                                zHasErrorText = true;
                            }
                        }
                    }
                    if (!this.documentOnly || this.currentDocumentsType == null || i4 >= 7) {
                        if (!zHasErrorText) {
                            int length = editTextBoldCursorArr[i4].length();
                            int i5 = this.currentActivityType;
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    if (i4 == 1) {
                                        continue;
                                    } else if (i4 == 3) {
                                        if (length < 2) {
                                            zHasErrorText = true;
                                        }
                                    } else if (i4 == 4) {
                                        if (!"US".equals(this.currentCitizeship)) {
                                            continue;
                                        } else if (length < 2) {
                                            zHasErrorText = true;
                                        }
                                    } else if (i4 == 2 && (length < 2 || length > 10)) {
                                        zHasErrorText = true;
                                    }
                                }
                                z = false;
                                if (!zHasErrorText) {
                                    zHasErrorText = true;
                                }
                                if (zHasErrorText) {
                                    onFieldError(editTextBoldCursorArr[i4]);
                                    return true;
                                }
                            } else if (i4 != 8) {
                                if ((i3 == 0 && (i4 == 0 || i4 == 2 || i4 == 1)) || (i3 == 1 && (i4 == 0 || i4 == 1 || i4 == 2))) {
                                    if (length > 255) {
                                        zHasErrorText = true;
                                    }
                                    if ((i3 == 0 && i4 == 1) || (i3 == 1 && i4 == 1)) {
                                        z = true;
                                    }
                                    if (!zHasErrorText && !z && length == 0) {
                                        zHasErrorText = true;
                                    }
                                    if (zHasErrorText) {
                                        onFieldError(editTextBoldCursorArr[i4]);
                                        return true;
                                    }
                                } else if (i4 == 7 && length > 24) {
                                    zHasErrorText = true;
                                }
                                z = false;
                                if (!zHasErrorText) {
                                    zHasErrorText = true;
                                }
                                if (zHasErrorText) {
                                    onFieldError(editTextBoldCursorArr[i4]);
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        } else if (zHasErrorText) {
                            onFieldError(editTextBoldCursorArr[i4]);
                            return true;
                        }
                    }
                    i4++;
                }
            }
        }
        return false;
    }

    public void checkNativeFields(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i = 0;
        int i2 = 1;
        if (this.inputExtraFields == null) {
            return;
        }
        String str = this.languageMap.get(this.currentResidence);
        String str2 = SharedConfig.getCountryLangs().get(this.currentResidence);
        if (!this.currentType.native_names || TextUtils.isEmpty(this.currentResidence) || "EN".equals(str2)) {
            if (this.nativeInfoCell.getVisibility() != 8) {
                this.nativeInfoCell.setVisibility(8);
                this.headerCell.setVisibility(8);
                this.extraBackgroundView2.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.inputExtraFields;
                    if (i >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i].getParent()).setVisibility(8);
                    i++;
                }
                if (((this.currentBotId == 0 && this.currentDocumentsType != null) || this.currentTypeValue == null || this.documentOnly) && this.currentDocumentsTypeValue == null) {
                    this.sectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(getParentActivity(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    return;
                } else {
                    this.sectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(getParentActivity(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    return;
                }
            }
            return;
        }
        if (this.nativeInfoCell.getVisibility() != 0) {
            this.nativeInfoCell.setVisibility(0);
            this.headerCell.setVisibility(0);
            this.extraBackgroundView2.setVisibility(0);
            int i3 = 0;
            while (true) {
                editTextBoldCursorArr = this.inputExtraFields;
                if (i3 >= editTextBoldCursorArr.length) {
                    break;
                }
                ((View) editTextBoldCursorArr[i3].getParent()).setVisibility(0);
                i3++;
            }
            if (editTextBoldCursorArr[0].length() == 0 && this.inputExtraFields[1].length() == 0 && this.inputExtraFields[2].length() == 0) {
                int i4 = 0;
                while (true) {
                    boolean[] zArr = this.nonLatinNames;
                    if (i4 >= zArr.length) {
                        break;
                    }
                    if (zArr[i4]) {
                        this.inputExtraFields[0].setText(this.inputFields[0].getText());
                        this.inputExtraFields[1].setText(this.inputFields[1].getText());
                        this.inputExtraFields[2].setText(this.inputFields[2].getText());
                        break;
                    }
                    i4++;
                }
            }
            this.sectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(getParentActivity(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
        }
        this.nativeInfoCell.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str));
        String serverString = str2 != null ? LocaleController.getServerString("PassportLanguage_".concat(str2)) : null;
        if (serverString != null) {
            this.headerCell.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, serverString));
        } else {
            this.headerCell.setText(LocaleController.getString(R.string.PassportNativeHeader));
        }
        for (int i5 = 0; i5 < 3; i5++) {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (serverString != null) {
                            this.inputExtraFields[i5].setHintText(LocaleController.getString(R.string.PassportSurname));
                        } else {
                            this.inputExtraFields[i5].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str));
                        }
                    }
                } else if (serverString != null) {
                    this.inputExtraFields[i5].setHintText(LocaleController.getString(R.string.PassportMidname));
                } else {
                    this.inputExtraFields[i5].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str));
                }
            } else if (serverString != null) {
                this.inputExtraFields[i5].setHintText(LocaleController.getString(R.string.PassportName));
            } else {
                this.inputExtraFields[i5].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str));
            }
        }
        if (z) {
            AndroidUtilities.runOnUIThread(new PassportActivity$$ExternalSyntheticLambda11(this, i2));
        }
    }

    public static boolean checkSecret(byte[] bArr, Long l) {
        if (bArr == null || bArr.length != 32) {
            return false;
        }
        int i = 0;
        for (byte b : bArr) {
            i += b & 255;
        }
        if (i % 255 != 239) {
            return false;
        }
        return l == null || Utilities.bytesToLong(Utilities.computeSHA256(bArr)) == l.longValue();
    }

    private void checkTopErrorCell(boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.topErrorCell == null) {
            return;
        }
        if (this.fieldsErrors == null || (!(z || this.errorsValues.containsKey("error_all")) || (str2 = this.fieldsErrors.get("error_all")) == null)) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str2);
            if (z) {
                this.errorsValues.put("error_all", "");
            }
        }
        if (this.documentsErrors != null && ((z || this.errorsValues.containsKey("error_document_all")) && (str = this.documentsErrors.get("error_all")) != null)) {
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
            }
            if (z) {
                this.errorsValues.put("error_document_all", "");
            }
        }
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_text_RedRegular, false)), 0, spannableStringBuilder.length(), 33);
            this.topErrorCell.setText(spannableStringBuilder);
            this.topErrorCell.setVisibility(0);
        } else if (this.topErrorCell.getVisibility() != 8) {
            this.topErrorCell.setVisibility(8);
        }
    }

    private void createAddressInterface(Context context) {
        long j;
        final String str;
        String str2;
        String str3;
        this.languageMap = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                this.languageMap.put(strArrSplit[1], strArrSplit[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
        this.topErrorCell = textInfoPrivacyCell;
        int i = R.drawable.greydivider_top;
        int i2 = Theme.key_windowBackgroundGrayShadow;
        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i, i2));
        this.topErrorCell.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.linearLayout2.addView(this.topErrorCell, LayoutHelper.createLinear(-1, -2));
        checkTopErrorCell(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.currentDocumentsType;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
            }
            HeaderCell headerCell = new HeaderCell(context);
            this.headerCell = headerCell;
            headerCell.setText(LocaleController.getString(R.string.PassportDocuments));
            HeaderCell headerCell2 = this.headerCell;
            int i3 = Theme.key_windowBackgroundWhite;
            j = 0;
            headerCell2.setBackgroundColor(Theme.getColor(null, i3, false));
            this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.documentsLayout = linearLayout;
            linearLayout.setOrientation(1);
            this.linearLayout2.addView(this.documentsLayout, LayoutHelper.createLinear(-1, -2));
            TextSettingsCell textSettingsCell = new TextSettingsCell(context, null, 0);
            this.uploadDocumentCell = textSettingsCell;
            textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.linearLayout2.addView(this.uploadDocumentCell, LayoutHelper.createLinear(-1, -2));
            this.uploadDocumentCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 9));
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, null);
            this.bottomCell = textInfoPrivacyCell2;
            int i4 = R.drawable.greydivider;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i4, i2));
            if (this.currentBotId != 0) {
                this.noAllDocumentsErrorText = LocaleController.getString(R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.currentDocumentsType.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.noAllDocumentsErrorText = LocaleController.getString(R.string.PassportAddAgreementInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.noAllDocumentsErrorText = LocaleController.getString(R.string.PassportAddBillInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.noAllDocumentsErrorText = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.noAllDocumentsErrorText = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.noAllDocumentsErrorText = LocaleController.getString(R.string.PassportAddBankInfo);
                } else {
                    this.noAllDocumentsErrorText = "";
                }
            }
            CharSequence charSequence = this.noAllDocumentsErrorText;
            HashMap<String, String> map = this.documentsErrors;
            CharSequence charSequence2 = charSequence;
            if (map != null && (str3 = map.get("files_all")) != null) {
                charSequence2 = charSequence;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append(this.noAllDocumentsErrorText);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_text_RedRegular, false)), 0, str3.length(), 33);
                this.errorsValues.put("files_all", "");
                charSequence2 = spannableStringBuilder;
            }
            charSequence2 = charSequence;
            this.bottomCell.setText(charSequence2);
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            if (this.currentDocumentsType.translation_required) {
                HeaderCell headerCell3 = new HeaderCell(context);
                this.headerCell = headerCell3;
                headerCell3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.headerCell.setBackgroundColor(Theme.getColor(null, i3, false));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.translationLayout = linearLayout2;
                linearLayout2.setOrientation(1);
                this.linearLayout2.addView(this.translationLayout, LayoutHelper.createLinear(-1, -2));
                TextSettingsCell textSettingsCell2 = new TextSettingsCell(context, null, 0);
                this.uploadTranslationCell = textSettingsCell2;
                textSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.linearLayout2.addView(this.uploadTranslationCell, LayoutHelper.createLinear(-1, -2));
                this.uploadTranslationCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 10));
                TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context, 24, null);
                this.bottomCellTranslation = textInfoPrivacyCell3;
                textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i4, i2));
                if (this.currentBotId != 0) {
                    this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.currentDocumentsType.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddTranslationAgreementInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddTranslationBillInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddTranslationPassportRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddTranslationTemporaryRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddTranslationBankInfo);
                    } else {
                        this.noAllTranslationErrorText = "";
                    }
                }
                CharSequence charSequence3 = this.noAllTranslationErrorText;
                HashMap<String, String> map2 = this.documentsErrors;
                CharSequence charSequence4 = charSequence3;
                if (map2 != null && (str2 = map2.get("translation_all")) != null) {
                    charSequence4 = charSequence3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                    spannableStringBuilder2.append((CharSequence) "\n\n");
                    spannableStringBuilder2.append(this.noAllTranslationErrorText);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_text_RedRegular, false)), 0, str2.length(), 33);
                    this.errorsValues.put("translation_all", "");
                    charSequence4 = spannableStringBuilder2;
                }
                charSequence4 = charSequence3;
                this.bottomCellTranslation.setText(charSequence4);
                this.linearLayout2.addView(this.bottomCellTranslation, LayoutHelper.createLinear(-1, -2));
            }
        } else {
            j = 0;
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        HeaderCell headerCell4 = new HeaderCell(context);
        this.headerCell = headerCell4;
        headerCell4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        this.headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
        this.inputFields = new EditTextBoldCursor[6];
        for (int i5 = 0; i5 < 6; i5++) {
            final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.inputFields[i5] = editTextBoldCursor;
            FrameLayout frameLayout = new FrameLayout(context) {
                private StaticLayout errorLayout;
                float offsetX;

                @Override
                public void onDraw(Canvas canvas) {
                    if (this.errorLayout != null) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(21.0f) + this.offsetX, editTextBoldCursor.getLineY() + AndroidUtilities.dp(3.0f));
                        this.errorLayout.draw(canvas);
                        canvas.restore();
                    }
                }

                @Override
                public void onMeasure(int i6, int i7) {
                    int size = View.MeasureSpec.getSize(i6) - AndroidUtilities.dp(34.0f);
                    StaticLayout errorLayout = editTextBoldCursor.getErrorLayout(size);
                    this.errorLayout = errorLayout;
                    if (errorLayout != null) {
                        int lineCount = errorLayout.getLineCount();
                        if (lineCount > 1) {
                            i7 = View.MeasureSpec.makeMeasureSpec((this.errorLayout.getLineBottom(lineCount - 1) - this.errorLayout.getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                        }
                        if (LocaleController.isRTL) {
                            float fMax = 0.0f;
                            for (int i8 = 0; i8 < lineCount; i8++) {
                                if (this.errorLayout.getLineLeft(i8) != 0.0f) {
                                    this.offsetX = 0.0f;
                                    break;
                                }
                                fMax = Math.max(fMax, this.errorLayout.getLineWidth(i8));
                                if (i8 == lineCount - 1) {
                                    this.offsetX = size - fMax;
                                }
                            }
                        }
                    }
                    super.onMeasure(i6, i7);
                }
            };
            frameLayout.setWillNotDraw(false);
            this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
            int i6 = Theme.key_windowBackgroundWhite;
            frameLayout.setBackgroundColor(Theme.getColor(null, i6, false));
            if (i5 == 5) {
                View view = new View(context);
                this.extraBackgroundView = view;
                view.setBackgroundColor(Theme.getColor(null, i6, false));
                this.linearLayout2.addView(this.extraBackgroundView, LayoutHelper.createLinear(-1, 6));
            }
            if (this.documentOnly && this.currentDocumentsType != null) {
                frameLayout.setVisibility(8);
                View view2 = this.extraBackgroundView;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.inputFields[i5].setTag(Integer.valueOf(i5));
            this.inputFields[i5].setSupportRtlHint(true);
            this.inputFields[i5].setTextSize(1, 16.0f);
            this.inputFields[i5].setHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            this.inputFields[i5].setHeaderHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
            this.inputFields[i5].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i5];
            int i7 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor2.setTextColor(Theme.getColor(null, i7, false));
            this.inputFields[i5].setBackgroundDrawable(null);
            this.inputFields[i5].setCursorColor(Theme.getColor(null, i7, false));
            this.inputFields[i5].setCursorSize(AndroidUtilities.dp(20.0f));
            this.inputFields[i5].setCursorWidth(1.5f);
            this.inputFields[i5].setLineColors(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
            if (i5 == 5) {
                this.inputFields[i5].setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda20(this, 3));
                this.inputFields[i5].setInputType(0);
                this.inputFields[i5].setFocusable(false);
            } else {
                this.inputFields[i5].setInputType(16385);
                this.inputFields[i5].setImeOptions(268435461);
            }
            if (i5 == 0) {
                this.inputFields[i5].setHintText(LocaleController.getString(R.string.PassportStreet1));
                str = "street_line1";
            } else if (i5 == 1) {
                this.inputFields[i5].setHintText(LocaleController.getString(R.string.PassportStreet2));
                str = "street_line2";
            } else if (i5 == 2) {
                this.inputFields[i5].setHintText(LocaleController.getString(R.string.PassportPostcode));
                str = "post_code";
            } else if (i5 == 3) {
                this.inputFields[i5].setHintText(LocaleController.getString(R.string.PassportCity));
                str = "city";
            } else if (i5 != 4) {
                if (i5 == 5) {
                    this.inputFields[i5].setHintText(LocaleController.getString(R.string.PassportCountry));
                    str = "country_code";
                }
            } else {
                this.inputFields[i5].setHintText(LocaleController.getString(R.string.PassportState));
                str = "state";
            }
            setFieldValues(this.currentValues, this.inputFields[i5], str);
            if (i5 == 2) {
                this.inputFields[i5].addTextChangedListener(new TextWatcher() {
                    private boolean ignore;

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (this.ignore) {
                            return;
                        }
                        boolean z = true;
                        this.ignore = true;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= editable.length()) {
                                z = false;
                                break;
                            }
                            char cCharAt = editable.charAt(i8);
                            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-' || cCharAt == ' '))) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                        this.ignore = false;
                        if (z) {
                            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        } else {
                            PassportActivity.this.checkFieldForError(editTextBoldCursor, str, editable, false);
                        }
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence5, int i8, int i9, int i10) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence5, int i8, int i9, int i10) {
                    }
                });
                this.inputFields[i5].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.inputFields[i5].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                        PassportActivity.this.checkFieldForError(editTextBoldCursor, str, editable, false);
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence5, int i8, int i9, int i10) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence5, int i8, int i9, int i10) {
                    }
                });
            }
            EditTextBoldCursor editTextBoldCursor3 = this.inputFields[i5];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.inputFields[i5].setPadding(0, 0, 0, 0);
            this.inputFields[i5].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            frameLayout.addView(this.inputFields[i5], LayoutHelper.createFrame(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.inputFields[i5].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda6(this, 4));
        }
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, null, 0);
        this.sectionCell = shadowSectionCell;
        this.linearLayout2.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
        if (this.documentOnly && this.currentDocumentsType != null) {
            this.headerCell.setVisibility(8);
            this.sectionCell.setVisibility(8);
        }
        if (((this.currentBotId == j && this.currentDocumentsType != null) || this.currentTypeValue == null || this.documentOnly) && this.currentDocumentsTypeValue == null) {
            ShadowSectionCell shadowSectionCell2 = this.sectionCell;
            int i8 = R.drawable.greydivider_bottom;
            int i9 = Theme.key_windowBackgroundGrayShadow;
            shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i8, i9));
            if (this.documentOnly && this.currentDocumentsType != null) {
                this.bottomCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i8, i9));
            }
        } else {
            TLRPC.TL_secureValue tL_secureValue = this.currentDocumentsTypeValue;
            if (tL_secureValue != null) {
                addDocumentViews(tL_secureValue.files);
                addTranslationDocumentViews(this.currentDocumentsTypeValue.translation);
            }
            ShadowSectionCell shadowSectionCell3 = this.sectionCell;
            int i10 = R.drawable.greydivider;
            int i11 = Theme.key_windowBackgroundGrayShadow;
            shadowSectionCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i10, i11));
            TextSettingsCell textSettingsCell3 = new TextSettingsCell(context, null, 0);
            textSettingsCell3.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            textSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            if (this.currentDocumentsType == null) {
                textSettingsCell3.setText(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                textSettingsCell3.setText(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.linearLayout2.addView(textSettingsCell3, LayoutHelper.createLinear(-1, -2));
            textSettingsCell3.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 11));
            ShadowSectionCell shadowSectionCell4 = new ShadowSectionCell(context, null, 0);
            this.sectionCell = shadowSectionCell4;
            shadowSectionCell4.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, i11));
            this.linearLayout2.addView(this.sectionCell, LayoutHelper.createLinear(-1, -2));
        }
        updateUploadText(0);
        updateUploadText(4);
    }

    private void createChatAttachView() {
        if (getParentActivity() != null && this.chatAttachAlert == null) {
            ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getParentActivity(), this, false, false);
            this.chatAttachAlert = chatAttachAlert;
            chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
                @Override
                public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                    if (PassportActivity.this.getParentActivity() == null || PassportActivity.this.chatAttachAlert == null) {
                        return;
                    }
                    if (i != 8 && i != 7) {
                        if (PassportActivity.this.chatAttachAlert != null) {
                            PassportActivity.this.chatAttachAlert.dismissWithButtonClick(i);
                        }
                        PassportActivity.this.processSelectedAttach(i);
                        return;
                    }
                    if (i != 8) {
                        PassportActivity.this.chatAttachAlert.dismiss(true);
                    }
                    HashMap<Object, Object> selectedPhotos = PassportActivity.this.chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = PassportActivity.this.chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
                    if (selectedPhotos.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i4));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        String str = photoEntry.imagePath;
                        if (str != null) {
                            sendingMediaInfo.path = str;
                        } else {
                            sendingMediaInfo.path = photoEntry.path;
                        }
                        arrayList.add(sendingMediaInfo);
                        photoEntry.reset();
                    }
                    PassportActivity.this.processSelectedFiles(arrayList);
                }

                @Override
                public final void didSelectBot(TLRPC.User user) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
                }

                @Override
                public final void doOnIdle(Runnable runnable) {
                    runnable.run();
                }

                @Override
                public final View getRevealView() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
                }

                @Override
                public final boolean needEnterComment() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
                }

                @Override
                public void onCameraOpened() {
                    AndroidUtilities.hideKeyboard(PassportActivity.this.fragmentView.findFocus());
                }

                @Override
                public final void onWallpaperSelected(Object obj) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
                }

                @Override
                public final void openAvatarsSearch() {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
                }

                @Override
                public final boolean selectItemOnClicking() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
                }

                @Override
                public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
                }
            });
        }
    }

    private void createDocumentDeleteAlert() {
        boolean[] zArr = {true};
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), new TodoItemMenu$$ExternalSyntheticLambda7(3, this, zArr));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        boolean z = this.documentOnly;
        if (z && this.currentDocumentsType == null && (this.currentType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            builder.setMessage(LocaleController.getString(R.string.PassportDeleteAddressAlert));
        } else if (z && this.currentDocumentsType == null && (this.currentType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            builder.setMessage(LocaleController.getString(R.string.PassportDeletePersonalAlert));
        } else {
            builder.setMessage(LocaleController.getString(R.string.PassportDeleteDocumentAlert));
        }
        if (!this.documentOnly && this.currentDocumentsType != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1);
            checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            TLRPC.SecureValueType secureValueType = this.currentType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                checkBoxCell.setText(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                checkBoxCell.setText(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false, false);
            }
            checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48, 51));
            checkBoxCell.setOnClickListener(new PhotoViewer$16$$ExternalSyntheticLambda5(zArr, 5));
            builder.setView(frameLayout);
        }
        showDialog(builder.create());
    }

    private void createEmailInterface(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
        int i = 0;
        if (!TextUtils.isEmpty(this.currentEmail)) {
            TextSettingsCell textSettingsCell = new TextSettingsCell(context, null, 0);
            textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            textSettingsCell.setText(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, this.currentEmail), false);
            this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
            textSettingsCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, i));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
            this.bottomCell = textInfoPrivacyCell;
            textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.bottomCell.setText(LocaleController.getString(R.string.PassportPhoneUseSameEmailInfo));
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
        }
        this.inputFields = new EditTextBoldCursor[1];
        FrameLayout frameLayout = new FrameLayout(context);
        this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.inputFields[0] = new EditTextBoldCursor(context);
        this.inputFields[0].setTag(0);
        this.inputFields[0].setTextSize(1, 16.0f);
        this.inputFields[0].setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
        EditTextBoldCursor editTextBoldCursor = this.inputFields[0];
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor.setTextColor(Theme.getColor(null, i2, false));
        this.inputFields[0].setBackgroundDrawable(null);
        this.inputFields[0].setCursorColor(Theme.getColor(null, i2, false));
        this.inputFields[0].setCursorSize(AndroidUtilities.dp(20.0f));
        this.inputFields[0].setCursorWidth(1.5f);
        this.inputFields[0].setInputType(33);
        this.inputFields[0].setImeOptions(268435462);
        this.inputFields[0].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
        TLRPC.TL_secureValue tL_secureValue = this.currentTypeValue;
        if (tL_secureValue != null) {
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                TLRPC.TL_securePlainEmail tL_securePlainEmail = (TLRPC.TL_securePlainEmail) securePlainData;
                if (!TextUtils.isEmpty(tL_securePlainEmail.email)) {
                    this.inputFields[0].setText(tL_securePlainEmail.email);
                }
            }
        }
        EditTextBoldCursor editTextBoldCursor2 = this.inputFields[0];
        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
        this.inputFields[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.inputFields[0].setGravity(LocaleController.isRTL ? 5 : 3);
        frameLayout.addView(this.inputFields[0], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
        this.inputFields[0].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda6(this, i));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, null);
        this.bottomCell = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
        this.bottomCell.setText(LocaleController.getString(R.string.PassportEmailUploadInfo));
        this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
    }

    private void createEmailVerificationInterface(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
        this.inputFields = new EditTextBoldCursor[1];
        FrameLayout frameLayout = new FrameLayout(context);
        this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.inputFields[0] = new EditTextBoldCursor(context);
        this.inputFields[0].setTag(0);
        this.inputFields[0].setTextSize(1, 16.0f);
        this.inputFields[0].setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
        EditTextBoldCursor editTextBoldCursor = this.inputFields[0];
        int i = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor.setTextColor(Theme.getColor(null, i, false));
        this.inputFields[0].setBackgroundDrawable(null);
        this.inputFields[0].setCursorColor(Theme.getColor(null, i, false));
        this.inputFields[0].setCursorSize(AndroidUtilities.dp(20.0f));
        this.inputFields[0].setCursorWidth(1.5f);
        this.inputFields[0].setInputType(3);
        this.inputFields[0].setImeOptions(268435462);
        this.inputFields[0].setHint(LocaleController.getString(R.string.PassportEmailCode));
        EditTextBoldCursor editTextBoldCursor2 = this.inputFields[0];
        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
        this.inputFields[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.inputFields[0].setGravity(LocaleController.isRTL ? 5 : 3);
        frameLayout.addView(this.inputFields[0], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
        this.inputFields[0].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda6(this, 6));
        this.inputFields[0].addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                if (PassportActivity.this.ignoreOnTextChange || PassportActivity.this.emailCodeLength == 0 || PassportActivity.this.inputFields[0].length() != PassportActivity.this.emailCodeLength) {
                    return;
                }
                PassportActivity.this.doneItem.callOnClick();
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
        this.bottomCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
        this.bottomCell.setText(LocaleController.formatString("PassportEmailVerifyInfo", R.string.PassportEmailVerifyInfo, this.currentValues.get("email")));
        this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
    }

    private void createIdentityInterface(Context context) {
        long j;
        int i;
        int i2;
        int i3;
        HashMap<String, String> map;
        final String str;
        final HashMap<String, String> map2;
        final String str2;
        String str3;
        this.languageMap = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                this.languageMap.put(strArrSplit[1], strArrSplit[2]);
            }
            bufferedReader.close();
            while (true) {
                int i4 = 64;
                int i5 = 6;
                if (i3 >= i2) {
                    ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, null, 0);
                    this.sectionCell2 = shadowSectionCell;
                    this.linearLayout2.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
                    HeaderCell headerCell = new HeaderCell(context);
                    this.headerCell = headerCell;
                    headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                    int i6 = 3;
                    this.inputExtraFields = new EditTextBoldCursor[3];
                    int i7 = 0;
                    while (i7 < i6) {
                        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                        this.inputExtraFields[i7] = editTextBoldCursor;
                        FrameLayout frameLayout = new FrameLayout(context) {
                            private StaticLayout errorLayout;
                            private float offsetX;

                            @Override
                            public void onDraw(Canvas canvas) {
                                if (this.errorLayout != null) {
                                    canvas.save();
                                    canvas.translate(AndroidUtilities.dp(21.0f) + this.offsetX, editTextBoldCursor.getLineY() + AndroidUtilities.dp(3.0f));
                                    this.errorLayout.draw(canvas);
                                    canvas.restore();
                                }
                            }

                            @Override
                            public void onMeasure(int i8, int i9) {
                                int size = View.MeasureSpec.getSize(i8) - AndroidUtilities.dp(34.0f);
                                StaticLayout errorLayout = editTextBoldCursor.getErrorLayout(size);
                                this.errorLayout = errorLayout;
                                if (errorLayout != null) {
                                    int lineCount = errorLayout.getLineCount();
                                    if (lineCount > 1) {
                                        i9 = View.MeasureSpec.makeMeasureSpec((this.errorLayout.getLineBottom(lineCount - 1) - this.errorLayout.getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                                    }
                                    if (LocaleController.isRTL) {
                                        float fMax = 0.0f;
                                        for (int i10 = 0; i10 < lineCount; i10++) {
                                            if (this.errorLayout.getLineLeft(i10) != 0.0f) {
                                                this.offsetX = 0.0f;
                                                break;
                                            }
                                            fMax = Math.max(fMax, this.errorLayout.getLineWidth(i10));
                                            if (i10 == lineCount - 1) {
                                                this.offsetX = size - fMax;
                                            }
                                        }
                                    }
                                }
                                super.onMeasure(i8, i9);
                            }
                        };
                        frameLayout.setWillNotDraw(false);
                        this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, i4));
                        int i8 = Theme.key_windowBackgroundWhite;
                        frameLayout.setBackgroundColor(Theme.getColor(null, i8, false));
                        if (i7 == 2) {
                            View view = new View(context);
                            this.extraBackgroundView2 = view;
                            view.setBackgroundColor(Theme.getColor(null, i8, false));
                            this.linearLayout2.addView(this.extraBackgroundView2, LayoutHelper.createLinear(-1, i5));
                        }
                        this.inputExtraFields[i7].setTag(Integer.valueOf(i7));
                        this.inputExtraFields[i7].setSupportRtlHint(true);
                        this.inputExtraFields[i7].setTextSize(1, 16.0f);
                        this.inputExtraFields[i7].setHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
                        EditTextBoldCursor editTextBoldCursor2 = this.inputExtraFields[i7];
                        int i9 = Theme.key_windowBackgroundWhiteBlackText;
                        editTextBoldCursor2.setTextColor(Theme.getColor(null, i9, false));
                        this.inputExtraFields[i7].setHeaderHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
                        this.inputExtraFields[i7].setTransformHintToHeader(true);
                        this.inputExtraFields[i7].setBackgroundDrawable(null);
                        this.inputExtraFields[i7].setCursorColor(Theme.getColor(null, i9, false));
                        this.inputExtraFields[i7].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.inputExtraFields[i7].setCursorWidth(1.5f);
                        this.inputExtraFields[i7].setLineColors(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
                        this.inputExtraFields[i7].setInputType(16385);
                        this.inputExtraFields[i7].setImeOptions(268435461);
                        if (i7 == 0) {
                            map = this.currentValues;
                            str = "first_name_native";
                        } else if (i7 != 1) {
                            if (i7 == 2) {
                                map = this.currentValues;
                                str = "last_name_native";
                            }
                            i7++;
                            i6 = 3;
                            i5 = 6;
                            i4 = 64;
                        } else {
                            map = this.currentValues;
                            str = "middle_name_native";
                        }
                        setFieldValues(map, this.inputExtraFields[i7], str);
                        EditTextBoldCursor editTextBoldCursor3 = this.inputExtraFields[i7];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i7 == 0 || i7 == 2 || i7 == 1) {
                            this.inputExtraFields[i7].addTextChangedListener(new TextWatcher() {
                                private boolean ignore;

                                @Override
                                public void afterTextChanged(Editable editable) {
                                    if (this.ignore) {
                                        return;
                                    }
                                    PassportActivity.this.checkFieldForError(editTextBoldCursor, str, editable, false);
                                }

                                @Override
                                public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                                }
                            });
                        }
                        this.inputExtraFields[i7].setPadding(0, 0, 0, 0);
                        this.inputExtraFields[i7].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        frameLayout.addView(this.inputExtraFields[i7], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputExtraFields[i7].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda6(this, 3));
                        i7++;
                        i6 = 3;
                        i5 = 6;
                        i4 = 64;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                    this.nativeInfoCell = textInfoPrivacyCell;
                    this.linearLayout2.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
                    if (((this.currentBotId == j && this.currentDocumentsType != null) || this.currentTypeValue == null || this.documentOnly) && this.currentDocumentsTypeValue == null) {
                        this.nativeInfoCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    } else {
                        TLRPC.TL_secureValue tL_secureValue = this.currentDocumentsTypeValue;
                        if (tL_secureValue != null) {
                            addDocumentViews(tL_secureValue.files);
                            TLRPC.SecureFile secureFile = this.currentDocumentsTypeValue.front_side;
                            if (secureFile instanceof TLRPC.TL_secureFile) {
                                addDocumentViewInternal((TLRPC.TL_secureFile) secureFile, 2);
                            }
                            TLRPC.SecureFile secureFile2 = this.currentDocumentsTypeValue.reverse_side;
                            if (secureFile2 instanceof TLRPC.TL_secureFile) {
                                addDocumentViewInternal((TLRPC.TL_secureFile) secureFile2, 3);
                            }
                            TLRPC.SecureFile secureFile3 = this.currentDocumentsTypeValue.selfie;
                            if (secureFile3 instanceof TLRPC.TL_secureFile) {
                                addDocumentViewInternal((TLRPC.TL_secureFile) secureFile3, 1);
                            }
                            addTranslationDocumentViews(this.currentDocumentsTypeValue.translation);
                        }
                        TextSettingsCell textSettingsCell = new TextSettingsCell(context, null, 0);
                        textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                        textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        if (this.currentDocumentsType == null) {
                            textSettingsCell.setText(LocaleController.getString(R.string.PassportDeleteInfo), false);
                        } else {
                            textSettingsCell.setText(LocaleController.getString(R.string.PassportDeleteDocument), false);
                        }
                        this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
                        textSettingsCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 4));
                        TextInfoPrivacyCell textInfoPrivacyCell2 = this.nativeInfoCell;
                        int i10 = R.drawable.greydivider;
                        int i11 = Theme.key_windowBackgroundGrayShadow;
                        textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i10, i11));
                        ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context, null, 0);
                        this.sectionCell = shadowSectionCell2;
                        shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, i11));
                        this.linearLayout2.addView(this.sectionCell, LayoutHelper.createLinear(-1, -2));
                    }
                    updateInterfaceStringsForDocumentType();
                    checkNativeFields(false);
                    return;
                }
                final EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
                this.inputFields[i3] = editTextBoldCursor4;
                FrameLayout frameLayout2 = new FrameLayout(context) {
                    private StaticLayout errorLayout;
                    private float offsetX;

                    @Override
                    public void onDraw(Canvas canvas) {
                        if (this.errorLayout != null) {
                            canvas.save();
                            canvas.translate(AndroidUtilities.dp(21.0f) + this.offsetX, editTextBoldCursor4.getLineY() + AndroidUtilities.dp(3.0f));
                            this.errorLayout.draw(canvas);
                            canvas.restore();
                        }
                    }

                    @Override
                    public void onMeasure(int i12, int i13) {
                        int size = View.MeasureSpec.getSize(i12) - AndroidUtilities.dp(34.0f);
                        StaticLayout errorLayout = editTextBoldCursor4.getErrorLayout(size);
                        this.errorLayout = errorLayout;
                        if (errorLayout != null) {
                            int lineCount = errorLayout.getLineCount();
                            if (lineCount > 1) {
                                i13 = View.MeasureSpec.makeMeasureSpec((this.errorLayout.getLineBottom(lineCount - 1) - this.errorLayout.getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                            }
                            if (LocaleController.isRTL) {
                                float fMax = 0.0f;
                                for (int i14 = 0; i14 < lineCount; i14++) {
                                    if (this.errorLayout.getLineLeft(i14) != 0.0f) {
                                        this.offsetX = 0.0f;
                                        break;
                                    }
                                    fMax = Math.max(fMax, this.errorLayout.getLineWidth(i14));
                                    if (i14 == lineCount - 1) {
                                        this.offsetX = size - fMax;
                                    }
                                }
                            }
                        }
                        super.onMeasure(i12, i13);
                    }
                };
                frameLayout2.setWillNotDraw(false);
                this.linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-1, 64));
                int i12 = Theme.key_windowBackgroundWhite;
                frameLayout2.setBackgroundColor(Theme.getColor(null, i12, false));
                if (i3 == i2 - 1) {
                    View view2 = new View(context);
                    this.extraBackgroundView = view2;
                    view2.setBackgroundColor(Theme.getColor(null, i12, false));
                    this.linearLayout2.addView(this.extraBackgroundView, LayoutHelper.createLinear(-1, 6));
                }
                if (this.documentOnly && this.currentDocumentsType != null && i3 < i) {
                    frameLayout2.setVisibility(8);
                    View view3 = this.extraBackgroundView;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                this.inputFields[i3].setTag(Integer.valueOf(i3));
                this.inputFields[i3].setSupportRtlHint(true);
                this.inputFields[i3].setTextSize(1, 16.0f);
                this.inputFields[i3].setHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
                EditTextBoldCursor editTextBoldCursor5 = this.inputFields[i3];
                int i13 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor5.setTextColor(Theme.getColor(null, i13, false));
                this.inputFields[i3].setHeaderHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
                this.inputFields[i3].setTransformHintToHeader(true);
                this.inputFields[i3].setBackgroundDrawable(null);
                this.inputFields[i3].setCursorColor(Theme.getColor(null, i13, false));
                this.inputFields[i3].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[i3].setCursorWidth(1.5f);
                this.inputFields[i3].setLineColors(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
                if (i3 == 5 || i3 == 6) {
                    this.inputFields[i3].setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda20(this, 2));
                    this.inputFields[i3].setInputType(0);
                } else if (i3 == 3 || i3 == 8) {
                    this.inputFields[i3].setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda33(0, this, context));
                    this.inputFields[i3].setInputType(0);
                    this.inputFields[i3].setFocusable(false);
                } else if (i3 == 4) {
                    this.inputFields[i3].setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda20(this, 1));
                    this.inputFields[i3].setInputType(0);
                    this.inputFields[i3].setFocusable(false);
                } else {
                    this.inputFields[i3].setInputType(16385);
                    this.inputFields[i3].setImeOptions(268435461);
                }
                switch (i3) {
                    case 0:
                        if (this.currentType.native_names) {
                            this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                        } else {
                            this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportName));
                        }
                        map2 = this.currentValues;
                        str2 = "first_name";
                        break;
                    case 1:
                        if (this.currentType.native_names) {
                            this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                        } else {
                            this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportMidname));
                        }
                        map2 = this.currentValues;
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (this.currentType.native_names) {
                            this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                        } else {
                            this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportSurname));
                        }
                        map2 = this.currentValues;
                        str2 = "last_name";
                        break;
                    case 3:
                        this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                        map2 = this.currentValues;
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportGender));
                        map2 = this.currentValues;
                        str2 = "gender";
                        break;
                    case 5:
                        this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                        map2 = this.currentValues;
                        str2 = "country_code";
                        break;
                    case 6:
                        this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportResidence));
                        map2 = this.currentValues;
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                        map2 = this.currentDocumentValues;
                        str2 = "document_no";
                        break;
                    case 8:
                        this.inputFields[i3].setHintText(LocaleController.getString(R.string.PassportExpired));
                        map2 = this.currentDocumentValues;
                        str2 = "expiry_date";
                        break;
                    default:
                        continue;
                        i3++;
                        i = 7;
                        break;
                }
                setFieldValues(map2, this.inputFields[i3], str2);
                EditTextBoldCursor editTextBoldCursor6 = this.inputFields[i3];
                editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                if (i3 == 0 || i3 == 2 || i3 == 1) {
                    this.inputFields[i3].addTextChangedListener(new TextWatcher() {
                        private boolean ignore;

                        @Override
                        public void afterTextChanged(Editable editable) {
                            boolean z;
                            if (this.ignore) {
                                return;
                            }
                            int iIntValue = ((Integer) editTextBoldCursor4.getTag()).intValue();
                            int i14 = 0;
                            while (true) {
                                if (i14 >= editable.length()) {
                                    z = false;
                                    break;
                                }
                                char cCharAt = editable.charAt(i14);
                                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                    z = true;
                                    break;
                                }
                                i14++;
                            }
                            if (z && !PassportActivity.this.allowNonLatinName) {
                                editTextBoldCursor4.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                            } else {
                                PassportActivity.this.nonLatinNames[iIntValue] = z;
                                PassportActivity.this.checkFieldForError(editTextBoldCursor4, str2, editable, false);
                            }
                        }

                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                        }
                    });
                } else {
                    this.inputFields[i3].addTextChangedListener(new TextWatcher() {
                        @Override
                        public void afterTextChanged(Editable editable) {
                            PassportActivity passportActivity = PassportActivity.this;
                            passportActivity.checkFieldForError(editTextBoldCursor4, str2, editable, map2 == passportActivity.currentDocumentValues);
                            int iIntValue = ((Integer) editTextBoldCursor4.getTag()).intValue();
                            EditTextBoldCursor editTextBoldCursor7 = PassportActivity.this.inputFields[iIntValue];
                            if (iIntValue == 6) {
                                PassportActivity.this.checkNativeFields(true);
                            }
                        }

                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                        }
                    });
                }
                this.inputFields[i3].setPadding(0, 0, 0, 0);
                this.inputFields[i3].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                frameLayout2.addView(this.inputFields[i3], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.inputFields[i3].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda6(this, 2));
                i3++;
                i = 7;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context, 24, null);
        this.topErrorCell = textInfoPrivacyCell3;
        int i14 = R.drawable.greydivider_top;
        int i15 = Theme.key_windowBackgroundGrayShadow;
        textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i14, i15));
        this.topErrorCell.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.linearLayout2.addView(this.topErrorCell, LayoutHelper.createLinear(-1, -2));
        checkTopErrorCell(true);
        if (this.currentDocumentsType != null) {
            HeaderCell headerCell2 = new HeaderCell(context);
            this.headerCell = headerCell2;
            if (this.documentOnly) {
                headerCell2.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                headerCell2.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            HeaderCell headerCell3 = this.headerCell;
            int i16 = Theme.key_windowBackgroundWhite;
            headerCell3.setBackgroundColor(Theme.getColor(null, i16, false));
            this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.frontLayout = linearLayout;
            linearLayout.setOrientation(1);
            this.linearLayout2.addView(this.frontLayout, LayoutHelper.createLinear(-1, -2));
            TextDetailSettingsCell textDetailSettingsCell = new TextDetailSettingsCell(context);
            this.uploadFrontCell = textDetailSettingsCell;
            textDetailSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.linearLayout2.addView(this.uploadFrontCell, LayoutHelper.createLinear(-1, -2));
            this.uploadFrontCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 3));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.reverseLayout = linearLayout2;
            linearLayout2.setOrientation(1);
            this.linearLayout2.addView(this.reverseLayout, LayoutHelper.createLinear(-1, -2));
            boolean z = this.currentDocumentsType.selfie_required;
            TextDetailSettingsCell textDetailSettingsCell2 = new TextDetailSettingsCell(context);
            this.uploadReverseCell = textDetailSettingsCell2;
            textDetailSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            j = 0;
            this.uploadReverseCell.setTextAndValue(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z);
            this.linearLayout2.addView(this.uploadReverseCell, LayoutHelper.createLinear(-1, -2));
            this.uploadReverseCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 5));
            if (this.currentDocumentsType.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.selfieLayout = linearLayout3;
                linearLayout3.setOrientation(1);
                this.linearLayout2.addView(this.selfieLayout, LayoutHelper.createLinear(-1, -2));
                TextDetailSettingsCell textDetailSettingsCell3 = new TextDetailSettingsCell(context);
                this.uploadSelfieCell = textDetailSettingsCell3;
                textDetailSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.uploadSelfieCell.setTextAndValue(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), this.currentType.translation_required);
                this.linearLayout2.addView(this.uploadSelfieCell, LayoutHelper.createLinear(-1, -2));
                this.uploadSelfieCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 6));
            }
            TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context, 24, null);
            this.bottomCell = textInfoPrivacyCell4;
            int i17 = R.drawable.greydivider;
            textInfoPrivacyCell4.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i17, i15));
            this.bottomCell.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            if (this.currentDocumentsType.translation_required) {
                HeaderCell headerCell4 = new HeaderCell(context);
                this.headerCell = headerCell4;
                headerCell4.setText(LocaleController.getString(R.string.PassportTranslation));
                this.headerCell.setBackgroundColor(Theme.getColor(null, i16, false));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.translationLayout = linearLayout4;
                linearLayout4.setOrientation(1);
                this.linearLayout2.addView(this.translationLayout, LayoutHelper.createLinear(-1, -2));
                TextSettingsCell textSettingsCell2 = new TextSettingsCell(context, null, 0);
                this.uploadTranslationCell = textSettingsCell2;
                textSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.linearLayout2.addView(this.uploadTranslationCell, LayoutHelper.createLinear(-1, -2));
                this.uploadTranslationCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 7));
                TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context, 24, null);
                this.bottomCellTranslation = textInfoPrivacyCell5;
                textInfoPrivacyCell5.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i17, i15));
                if (this.currentBotId != 0) {
                    this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType = this.currentDocumentsType.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddInternalPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddIdentityCardInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.noAllTranslationErrorText = LocaleController.getString(R.string.PassportAddDriverLicenceInfo);
                    } else {
                        this.noAllTranslationErrorText = "";
                    }
                }
                CharSequence charSequence = this.noAllTranslationErrorText;
                HashMap<String, String> map3 = this.documentsErrors;
                CharSequence charSequence2 = charSequence;
                if (map3 != null && (str3 = map3.get("translation_all")) != null) {
                    charSequence2 = charSequence;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append(this.noAllTranslationErrorText);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_text_RedRegular, false)), 0, str3.length(), 33);
                    this.errorsValues.put("translation_all", "");
                    charSequence2 = spannableStringBuilder;
                }
                charSequence2 = charSequence;
                this.bottomCellTranslation.setText(charSequence2);
                this.linearLayout2.addView(this.bottomCellTranslation, LayoutHelper.createLinear(-1, -2));
            }
        } else {
            j = 0;
            TextSettingsCell textSettingsCell3 = new TextSettingsCell(context, null, 0);
            this.scanDocumentCell = textSettingsCell3;
            textSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.scanDocumentCell.setText(LocaleController.getString(R.string.PassportScanPassport), false);
            this.linearLayout2.addView(this.scanDocumentCell, LayoutHelper.createLinear(-1, -2));
            this.scanDocumentCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 8));
            TextInfoPrivacyCell textInfoPrivacyCell6 = new TextInfoPrivacyCell(context, 24, null);
            this.bottomCell = textInfoPrivacyCell6;
            textInfoPrivacyCell6.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, i15));
            this.bottomCell.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
        }
        HeaderCell headerCell5 = new HeaderCell(context);
        this.headerCell = headerCell5;
        if (this.documentOnly) {
            headerCell5.setText(LocaleController.getString(R.string.PassportDocument));
        } else {
            headerCell5.setText(LocaleController.getString(R.string.PassportPersonal));
        }
        this.headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
        i = 7;
        i2 = this.currentDocumentsType != null ? 9 : 7;
        this.inputFields = new EditTextBoldCursor[i2];
        i3 = 0;
    }

    private void createManageInterface(Context context) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        ArrayList<TLRPC.TL_secureRequiredType> arrayList;
        boolean z;
        boolean z2;
        PassportActivity passportActivity = this;
        Context context2 = context;
        passportActivity.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
        passportActivity.actionBar.createMenu().addItem(1, R.drawable.msg_info);
        HeaderCell headerCell = new HeaderCell(context2);
        passportActivity.headerCell = headerCell;
        headerCell.setText(LocaleController.getString(R.string.PassportProvidedInformation));
        passportActivity.headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        passportActivity.linearLayout2.addView(passportActivity.headerCell, LayoutHelper.createLinear(-1, -2));
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context2, null, 0);
        passportActivity.sectionCell = shadowSectionCell;
        int i = R.drawable.greydivider;
        int i2 = Theme.key_windowBackgroundGrayShadow;
        shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, i, i2));
        passportActivity.linearLayout2.addView(passportActivity.sectionCell, LayoutHelper.createLinear(-1, -2));
        TextSettingsCell textSettingsCell = new TextSettingsCell(context2, null, 0);
        passportActivity.addDocumentCell = textSettingsCell;
        textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        TextSettingsCell textSettingsCell2 = passportActivity.addDocumentCell;
        int i3 = R.string.PassportNoDocumentsAdd;
        textSettingsCell2.setText(LocaleController.getString(i3), true);
        passportActivity.linearLayout2.addView(passportActivity.addDocumentCell, LayoutHelper.createLinear(-1, -2));
        passportActivity.addDocumentCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(passportActivity, 14));
        TextSettingsCell textSettingsCell3 = new TextSettingsCell(context2, null, 0);
        passportActivity.deletePassportCell = textSettingsCell3;
        textSettingsCell3.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
        passportActivity.deletePassportCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        passportActivity.deletePassportCell.setText(LocaleController.getString(R.string.TelegramPassportDelete), false);
        passportActivity.linearLayout2.addView(passportActivity.deletePassportCell, LayoutHelper.createLinear(-1, -2));
        passportActivity.deletePassportCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(passportActivity, 15));
        ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context2, null, 0);
        passportActivity.addDocumentSectionCell = shadowSectionCell2;
        int i4 = R.drawable.greydivider_bottom;
        shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, i4, i2));
        passportActivity.linearLayout2.addView(passportActivity.addDocumentSectionCell, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context2);
        passportActivity.emptyLayout = linearLayout;
        linearLayout.setOrientation(1);
        passportActivity.emptyLayout.setGravity(17);
        passportActivity.emptyLayout.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, i4, i2));
        if (AndroidUtilities.isTablet()) {
            passportActivity.linearLayout2.addView(passportActivity.emptyLayout, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(528.0f) - ActionBar.getCurrentActionBarHeight()));
        } else {
            passportActivity.linearLayout2.addView(passportActivity.emptyLayout, new LinearLayout.LayoutParams(-1, AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()));
        }
        ImageView imageView = new ImageView(context2);
        passportActivity.emptyImageView = imageView;
        imageView.setImageResource(R.drawable.no_passport);
        passportActivity.emptyImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_sessions_devicesImage, false), PorterDuff.Mode.MULTIPLY));
        passportActivity.emptyLayout.addView(passportActivity.emptyImageView, LayoutHelper.createLinear(-2, -2));
        TextView textView = new TextView(context2);
        passportActivity.emptyTextView1 = textView;
        int i5 = Theme.key_windowBackgroundWhiteGrayText2;
        textView.setTextColor(Theme.getColor(null, i5, false));
        passportActivity.emptyTextView1.setGravity(17);
        passportActivity.emptyTextView1.setTextSize(1, 15.0f);
        passportActivity.emptyTextView1.setTypeface(AndroidUtilities.bold());
        passportActivity.emptyTextView1.setText(LocaleController.getString(R.string.PassportNoDocuments));
        TextView textViewM = zzkc.m(passportActivity.emptyLayout, passportActivity.emptyTextView1, LayoutHelper.createLinear(-2, -2, 17, 0, 16, 0, 0), context2);
        passportActivity.emptyTextView2 = textViewM;
        textViewM.setTextColor(Theme.getColor(null, i5, false));
        passportActivity.emptyTextView2.setGravity(17);
        passportActivity.emptyTextView2.setTextSize(1, 14.0f);
        passportActivity.emptyTextView2.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        passportActivity.emptyTextView2.setText(LocaleController.getString(R.string.PassportNoDocumentsInfo));
        TextView textViewM2 = zzkc.m(passportActivity.emptyLayout, passportActivity.emptyTextView2, LayoutHelper.createLinear(-2, -2, 17, 0, 14, 0, 0), context2);
        passportActivity.emptyTextView3 = textViewM2;
        int i6 = Theme.key_windowBackgroundWhiteBlueText4;
        textViewM2.setTextColor(Theme.getColor(null, i6, false));
        passportActivity.emptyTextView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        passportActivity.emptyTextView3.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(null, i6, false), 32), 7, -1));
        passportActivity.emptyTextView3.setGravity(17);
        passportActivity.emptyTextView3.setTextSize(1, 15.0f);
        passportActivity.emptyTextView3.setTypeface(AndroidUtilities.bold());
        passportActivity.emptyTextView3.setGravity(17);
        ArticleViewer$$ExternalSyntheticOutline0.m(i3, passportActivity.emptyTextView3);
        passportActivity.emptyLayout.addView(passportActivity.emptyTextView3, LayoutHelper.createLinear(-2, 30, 17, 0, 12, 0, 0));
        passportActivity.emptyTextView3.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(passportActivity, 16));
        int size = passportActivity.currentForm.values.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_secureValue tL_secureValue = passportActivity.currentForm.values.get(i7);
            if (passportActivity.isPersonalDocument(tL_secureValue.type)) {
                arrayList = new ArrayList<>();
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = tL_secureValue.type;
                tL_secureRequiredType2.selfie_required = true;
                tL_secureRequiredType2.translation_required = true;
                arrayList.add(tL_secureRequiredType2);
                tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
            } else {
                if (passportActivity.isAddressDocument(tL_secureValue.type)) {
                    arrayList = new ArrayList<>();
                    TLRPC.TL_secureRequiredType tL_secureRequiredType3 = new TLRPC.TL_secureRequiredType();
                    tL_secureRequiredType3.type = tL_secureValue.type;
                    tL_secureRequiredType3.translation_required = true;
                    arrayList.add(tL_secureRequiredType3);
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
                } else {
                    TLRPC.TL_secureRequiredType tL_secureRequiredType4 = new TLRPC.TL_secureRequiredType();
                    tL_secureRequiredType4.type = tL_secureValue.type;
                    tL_secureRequiredType = tL_secureRequiredType4;
                    arrayList = null;
                    z = false;
                }
                if (i7 == size - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                passportActivity.addField(context2, tL_secureRequiredType, arrayList, z, z2);
                i7++;
                passportActivity = this;
                context2 = context;
            }
            z = true;
            if (i7 == size - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            passportActivity.addField(context2, tL_secureRequiredType, arrayList, z, z2);
            i7++;
            passportActivity = this;
            context2 = context;
        }
        updateManageVisibility();
    }

    private void createPasswordInterface(Context context) {
        TLRPC.User currentUser;
        int i = 5;
        if (this.currentForm != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.currentForm.users.size()) {
                    currentUser = null;
                    break;
                }
                currentUser = this.currentForm.users.get(i2);
                if (currentUser.id == this.currentBotId) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.passwordAvatarContainer = frameLayout2;
        this.linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-1, 100));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.passwordAvatarContainer.addView(backupImageView, LayoutHelper.createFrame(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        backupImageView.setForUserOrChat(currentUser, new AvatarDrawable(currentUser));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
        this.passwordRequestTextView = textInfoPrivacyCell;
        textInfoPrivacyCell.getTextView().setGravity(1);
        if (this.currentBotId == 0) {
            this.passwordRequestTextView.setText(LocaleController.getString(R.string.PassportSelfRequest));
        } else {
            this.passwordRequestTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportRequest", R.string.PassportRequest, UserObject.getFirstName(currentUser))));
        }
        ((FrameLayout.LayoutParams) this.passwordRequestTextView.getTextView().getLayoutParams()).gravity = 1;
        this.linearLayout2.addView(this.passwordRequestTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.noPasswordImageView = imageView;
        imageView.setImageResource(R.drawable.no_password);
        this.noPasswordImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
        this.linearLayout2.addView(this.noPasswordImageView, LayoutHelper.createLinear(-2, -2, 49, 0, 13, 0, 0));
        TextView textView = new TextView(context);
        this.noPasswordTextView = textView;
        textView.setTextSize(1, 14.0f);
        this.noPasswordTextView.setGravity(1);
        this.noPasswordTextView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(17.0f));
        this.noPasswordTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
        this.noPasswordTextView.setText(LocaleController.getString(R.string.TelegramPassportCreatePasswordInfo));
        this.linearLayout2.addView(this.noPasswordTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.noPasswordSetTextView = textView2;
        textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText5, false));
        this.noPasswordSetTextView.setGravity(17);
        this.noPasswordSetTextView.setTextSize(1, 16.0f);
        this.noPasswordSetTextView.setTypeface(AndroidUtilities.bold());
        this.noPasswordSetTextView.setText(LocaleController.getString(R.string.TelegramPassportCreatePassword));
        this.linearLayout2.addView(this.noPasswordSetTextView, LayoutHelper.createFrame(-1, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 9.0f, 21.0f, 0.0f));
        this.noPasswordSetTextView.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 12));
        this.inputFields = new EditTextBoldCursor[1];
        this.inputFieldContainers = new ViewGroup[]{new FrameLayout(context)};
        this.linearLayout2.addView(this.inputFieldContainers[0], LayoutHelper.createLinear(-1, 50));
        this.inputFieldContainers[0].setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.inputFields[0] = new EditTextBoldCursor(context);
        this.inputFields[0].setTag(0);
        this.inputFields[0].setTextSize(1, 16.0f);
        this.inputFields[0].setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
        EditTextBoldCursor editTextBoldCursor = this.inputFields[0];
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor.setTextColor(Theme.getColor(null, i3, false));
        this.inputFields[0].setBackgroundDrawable(null);
        this.inputFields[0].setCursorColor(Theme.getColor(null, i3, false));
        this.inputFields[0].setCursorSize(AndroidUtilities.dp(20.0f));
        this.inputFields[0].setCursorWidth(1.5f);
        this.inputFields[0].setInputType(129);
        this.inputFields[0].setMaxLines(1);
        this.inputFields[0].setLines(1);
        this.inputFields[0].setSingleLine(true);
        this.inputFields[0].setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.inputFields[0].setTypeface(Typeface.DEFAULT);
        this.inputFields[0].setImeOptions(268435462);
        this.inputFields[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.inputFields[0].setGravity(LocaleController.isRTL ? 5 : 3);
        this.inputFieldContainers[0].addView(this.inputFields[0], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
        this.inputFields[0].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda6(this, i));
        this.inputFields[0].setCustomSelectionActionModeCallback(new ActionMode.Callback() {
            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, null);
        this.passwordInfoRequestTextView = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
        this.passwordInfoRequestTextView.setText(LocaleController.formatString("PassportRequestPasswordInfo", R.string.PassportRequestPasswordInfo, new Object[0]));
        this.linearLayout2.addView(this.passwordInfoRequestTextView, LayoutHelper.createLinear(-1, -2));
        TextView textView3 = new TextView(context);
        this.passwordForgotButton = textView3;
        textView3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
        this.passwordForgotButton.setTextSize(1, 14.0f);
        this.passwordForgotButton.setText(LocaleController.getString(R.string.ForgotPassword));
        this.passwordForgotButton.setPadding(0, 0, 0, 0);
        this.linearLayout2.addView(this.passwordForgotButton, LayoutHelper.createLinear(-2, 30, (LocaleController.isRTL ? 5 : 3) | 48, 21, 0, 21, 0));
        this.passwordForgotButton.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 13));
        updatePasswordInterface();
    }

    private void createPhoneInterface(Context context) {
        String upperCase;
        String str;
        ViewGroup frameLayout;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
        this.languageMap = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                this.countriesArray.add(0, strArrSplit[2]);
                this.countriesMap.put(strArrSplit[2], strArrSplit[0]);
                this.codesMap.put(strArrSplit[0], strArrSplit[2]);
                if (strArrSplit.length > 3) {
                    this.phoneFormatMap.put(strArrSplit[0], strArrSplit[3]);
                }
                this.languageMap.put(strArrSplit[1], strArrSplit[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.countriesArray, new CacheModel$$ExternalSyntheticLambda0(4));
        String str2 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        TextSettingsCell textSettingsCell = new TextSettingsCell(context, null, 0);
        textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
        textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        textSettingsCell.setText(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, PhoneFormat.getInstance().format("+" + str2)), false);
        this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
        textSettingsCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, i));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
        this.bottomCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
        this.bottomCell.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
        this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell = new HeaderCell(context);
        this.headerCell = headerCell;
        headerCell.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
        this.headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
        this.inputFields = new EditTextBoldCursor[3];
        int i4 = 0;
        for (int i5 = 3; i4 < i5; i5 = 3) {
            if (i4 == 2) {
                this.inputFields[i4] = new HintEditText(context);
            } else {
                this.inputFields[i4] = new EditTextBoldCursor(context);
            }
            if (i4 == 1) {
                frameLayout = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
                this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
                frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i4 == 2) {
                frameLayout = (ViewGroup) this.inputFields[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
                frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            }
            this.inputFields[i4].setTag(Integer.valueOf(i4));
            this.inputFields[i4].setTextSize(1, 16.0f);
            this.inputFields[i4].setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            EditTextBoldCursor editTextBoldCursor = this.inputFields[i4];
            int i6 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor.setTextColor(Theme.getColor(null, i6, false));
            this.inputFields[i4].setBackgroundDrawable(null);
            this.inputFields[i4].setCursorColor(Theme.getColor(null, i6, false));
            this.inputFields[i4].setCursorSize(AndroidUtilities.dp(20.0f));
            this.inputFields[i4].setCursorWidth(1.5f);
            if (i4 == 0) {
                this.inputFields[i4].setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda20(this, i2));
                this.inputFields[i4].setText(LocaleController.getString(R.string.ChooseCountry));
                this.inputFields[i4].setInputType(0);
                this.inputFields[i4].setFocusable(false);
            } else {
                this.inputFields[i4].setInputType(i5);
                if (i4 == 2) {
                    this.inputFields[i4].setImeOptions(268435462);
                } else {
                    this.inputFields[i4].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i4];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            if (i4 == 1) {
                TextView textView = new TextView(context);
                this.plusTextView = textView;
                textView.setText("+");
                this.plusTextView.setTextColor(Theme.getColor(null, i6, false));
                this.plusTextView.setTextSize(1, 16.0f);
                frameLayout.addView(this.plusTextView, LayoutHelper.createLinear(-2, -2, 21.0f, 12.0f, 0.0f, 6.0f));
                this.inputFields[i4].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.inputFields[i4].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.inputFields[i4].setGravity(19);
                frameLayout.addView(this.inputFields[i4], LayoutHelper.createLinear(55, -2, 0.0f, 12.0f, 16.0f, 6.0f));
                this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                        String str3;
                        boolean z;
                        int iIndexOf;
                        if (PassportActivity.this.ignoreOnTextChange) {
                            return;
                        }
                        PassportActivity.this.ignoreOnTextChange = true;
                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(PassportActivity.this.inputFields[1].getText().toString(), false);
                        PassportActivity.this.inputFields[1].setText(strStripExceptNumbers);
                        HintEditText hintEditText = (HintEditText) PassportActivity.this.inputFields[2];
                        if (strStripExceptNumbers.length() == 0) {
                            hintEditText.setHintText((String) null);
                            hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                            PassportActivity.this.inputFields[0].setText(LocaleController.getString(R.string.ChooseCountry));
                        } else {
                            int i7 = 4;
                            if (strStripExceptNumbers.length() > 4) {
                                while (true) {
                                    if (i7 < 1) {
                                        str3 = null;
                                        z = false;
                                        break;
                                    }
                                    String strSubstring = strStripExceptNumbers.substring(0, i7);
                                    if (((String) PassportActivity.this.codesMap.get(strSubstring)) != null) {
                                        String str4 = strStripExceptNumbers.substring(i7) + PassportActivity.this.inputFields[2].getText().toString();
                                        PassportActivity.this.inputFields[1].setText(strSubstring);
                                        str3 = str4;
                                        strStripExceptNumbers = strSubstring;
                                        z = true;
                                        break;
                                    }
                                    i7--;
                                }
                                if (!z) {
                                    str3 = strStripExceptNumbers.substring(1) + PassportActivity.this.inputFields[2].getText().toString();
                                    EditTextBoldCursor editTextBoldCursor3 = PassportActivity.this.inputFields[1];
                                    strStripExceptNumbers = strStripExceptNumbers.substring(0, 1);
                                    editTextBoldCursor3.setText(strStripExceptNumbers);
                                }
                            } else {
                                str3 = null;
                                z = false;
                            }
                            String str5 = (String) PassportActivity.this.codesMap.get(strStripExceptNumbers);
                            if (str5 == null || (iIndexOf = PassportActivity.this.countriesArray.indexOf(str5)) == -1) {
                                hintEditText.setHintText((String) null);
                                hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                PassportActivity.this.inputFields[0].setText(LocaleController.getString(R.string.WrongCountry));
                            } else {
                                PassportActivity.this.inputFields[0].setText((CharSequence) PassportActivity.this.countriesArray.get(iIndexOf));
                                String str6 = (String) PassportActivity.this.phoneFormatMap.get(strStripExceptNumbers);
                                if (str6 != null) {
                                    hintEditText.setHintText(str6.replace('X', (char) 8211));
                                    hintEditText.setHint((CharSequence) null);
                                }
                            }
                            if (!z) {
                                PassportActivity.this.inputFields[1].setSelection(PassportActivity.this.inputFields[1].getText().length());
                            }
                            if (str3 != null) {
                                hintEditText.requestFocus();
                                hintEditText.setText(str3);
                                hintEditText.setSelection(hintEditText.length());
                            }
                        }
                        PassportActivity.this.ignoreOnTextChange = false;
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                    }
                });
            } else if (i4 == 2) {
                this.inputFields[i4].setPadding(0, 0, 0, 0);
                this.inputFields[i4].setGravity(19);
                this.inputFields[i4].setHintText(null);
                this.inputFields[i4].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.inputFields[i4], LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                    private int actionPosition;
                    private int characterAction = -1;

                    @Override
                    public void afterTextChanged(Editable editable) {
                        int i7;
                        int i8;
                        if (PassportActivity.this.ignoreOnPhoneChange) {
                            return;
                        }
                        HintEditText hintEditText = (HintEditText) PassportActivity.this.inputFields[2];
                        int selectionStart = hintEditText.getSelectionStart();
                        String string = hintEditText.getText().toString();
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
                        PassportActivity.this.ignoreOnPhoneChange = true;
                        String hintText = hintEditText.getHintText();
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
                        hintEditText.setText(sb);
                        if (selectionStart >= 0) {
                            hintEditText.setSelection(Math.min(selectionStart, hintEditText.length()));
                        }
                        hintEditText.onTextChange();
                        PassportActivity.this.ignoreOnPhoneChange = false;
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
            } else {
                this.inputFields[i4].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[i4].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda6(this, i3));
            if (i4 == 2) {
                this.inputFields[i4].setOnKeyListener(new ChatActivity$$ExternalSyntheticLambda349(this, i));
            }
            if (i4 == 0) {
                View view = new View(context);
                this.dividers.add(view);
                view.setBackgroundColor(Theme.getColor(null, Theme.key_divider, false));
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
            i4++;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            upperCase = telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase() : null;
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        if (upperCase != null && (str = this.languageMap.get(upperCase)) != null && this.countriesArray.indexOf(str) != -1) {
            this.inputFields[1].setText(this.countriesMap.get(str));
        }
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, null);
        this.bottomCell = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
        this.bottomCell.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
    }

    private void createPhoneVerificationInterface(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
        FrameLayout frameLayout = new FrameLayout(context);
        this.scrollView.addView(frameLayout, LayoutHelper.createScroll(-1, -2, 51));
        for (int i = 0; i < 3; i++) {
            this.views[i] = new PhoneConfirmationView(context, i + 2);
            this.views[i].setVisibility(8);
            frameLayout.addView(this.views[i], LayoutHelper.createFrame(-1, -1.0f, 51, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 30.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.currentValues.get("phone"));
        fillNextCodeParams(bundle, this.currentPhoneVerification, false);
    }

    private void createRequestInterface(Context context) {
        TLRPC.User user;
        boolean z;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        ArrayList<TLRPC.TL_secureRequiredType> arrayList;
        int i;
        boolean z2;
        boolean z3;
        ArrayList<TLRPC.TL_secureRequiredType> arrayList2;
        ArrayList<TLRPC.TL_secureRequiredType> arrayList3;
        Context context2 = context;
        int i2 = 1;
        int i3 = 0;
        if (this.currentForm == null) {
            user = null;
            break;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.currentForm.users.size()) {
                user = null;
                break;
            }
            TLRPC.User user2 = this.currentForm.users.get(i4);
            if (user2.id == this.currentBotId) {
                user = user2;
                break;
            }
            i4++;
        }
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
        this.actionBar.createMenu().addItem(1, R.drawable.msg_info);
        if (user != null) {
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-1, 100));
            BackupImageView backupImageView = new BackupImageView(context2);
            backupImageView.setRoundRadius(AndroidUtilities.dp(32.0f));
            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
            backupImageView.setForUserOrChat(user, new AvatarDrawable(user));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context2, 24, null);
            this.bottomCell = textInfoPrivacyCell;
            textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_top, Theme.key_windowBackgroundGrayShadow));
            this.bottomCell.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportRequest", R.string.PassportRequest, UserObject.getFirstName(user))));
            this.bottomCell.getTextView().setGravity(1);
            ((FrameLayout.LayoutParams) this.bottomCell.getTextView().getLayoutParams()).gravity = 1;
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
        }
        HeaderCell headerCell = new HeaderCell(context2);
        this.headerCell = headerCell;
        headerCell.setText(LocaleController.getString(R.string.PassportRequestedInformation));
        this.headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
        TL_account.authorizationForm authorizationform = this.currentForm;
        if (authorizationform != null) {
            int size = authorizationform.required_types.size();
            ArrayList<TLRPC.TL_secureRequiredType> arrayList4 = new ArrayList<>();
            ArrayList<TLRPC.TL_secureRequiredType> arrayList5 = new ArrayList<>();
            int i5 = 0;
            boolean z4 = false;
            int i6 = 0;
            int i7 = 0;
            boolean z5 = false;
            while (i5 < size) {
                TLRPC.SecureRequiredType secureRequiredType = this.currentForm.required_types.get(i5);
                if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                    TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) secureRequiredType;
                    if (isPersonalDocument(tL_secureRequiredType3.type)) {
                        arrayList4.add(tL_secureRequiredType3);
                        i6 += i2;
                    } else if (isAddressDocument(tL_secureRequiredType3.type)) {
                        arrayList5.add(tL_secureRequiredType3);
                        i7 += i2;
                    } else {
                        TLRPC.SecureValueType secureValueType = tL_secureRequiredType3.type;
                        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                            z4 = true;
                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                            z5 = true;
                        }
                    }
                } else {
                    if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                        if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(i3);
                            if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                                if (isPersonalDocument(tL_secureRequiredType4.type)) {
                                    int size2 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i8 = 0; i8 < size2; i8++) {
                                        TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i8);
                                        if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList4.add((TLRPC.TL_secureRequiredType) secureRequiredType3);
                                        }
                                    }
                                    i6++;
                                } else if (isAddressDocument(tL_secureRequiredType4.type)) {
                                    int size3 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i9 = 0; i9 < size3; i9++) {
                                        TLRPC.SecureRequiredType secureRequiredType4 = tL_secureRequiredTypeOneOf.types.get(i9);
                                        if (secureRequiredType4 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList5.add((TLRPC.TL_secureRequiredType) secureRequiredType4);
                                        }
                                    }
                                    i7++;
                                }
                            }
                        }
                    }
                    i5++;
                    i2 = 1;
                    i3 = 0;
                }
                i5++;
                i2 = 1;
                i3 = 0;
            }
            boolean z6 = !z4 || i6 > 1;
            boolean z7 = !z5 || i7 > 1;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.SecureRequiredType secureRequiredType5 = this.currentForm.required_types.get(i10);
                if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredType) {
                    tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) secureRequiredType5;
                    TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                    if ((secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) {
                        arrayList = null;
                    } else {
                        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                            if (z6) {
                                arrayList3 = null;
                            } else {
                                arrayList3 = arrayList4;
                            }
                        } else if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (z6 && isPersonalDocument(secureValueType2)) {
                                arrayList2 = new ArrayList<>();
                                arrayList2.add(tL_secureRequiredType2);
                                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                            } else if (z7 && isAddressDocument(tL_secureRequiredType2.type)) {
                                arrayList2 = new ArrayList<>();
                                arrayList2.add(tL_secureRequiredType2);
                                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                            } else {
                                i = 1;
                            }
                            arrayList = arrayList2;
                            i = 1;
                            z2 = true;
                            if (i10 == size - 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            context2 = context;
                            addField(context2, tL_secureRequiredType2, arrayList, z2, z3);
                        } else if (z7) {
                            arrayList3 = null;
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList = arrayList3;
                    }
                    i = 1;
                    z2 = false;
                    if (i10 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    context2 = context;
                    addField(context2, tL_secureRequiredType2, arrayList, z2, z3);
                } else {
                    if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf2 = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType5;
                        if (!tL_secureRequiredTypeOneOf2.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType6 = tL_secureRequiredTypeOneOf2.types.get(0);
                            if (secureRequiredType6 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType6;
                                if ((z6 && isPersonalDocument(tL_secureRequiredType5.type)) || (z7 && isAddressDocument(tL_secureRequiredType5.type))) {
                                    ArrayList<TLRPC.TL_secureRequiredType> arrayList6 = new ArrayList<>();
                                    int size4 = tL_secureRequiredTypeOneOf2.types.size();
                                    for (int i11 = 0; i11 < size4; i11++) {
                                        TLRPC.SecureRequiredType secureRequiredType7 = tL_secureRequiredTypeOneOf2.types.get(i11);
                                        if (secureRequiredType7 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList6.add((TLRPC.TL_secureRequiredType) secureRequiredType7);
                                        }
                                    }
                                    if (isPersonalDocument(tL_secureRequiredType5.type)) {
                                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                    } else {
                                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
                                    }
                                    tL_secureRequiredType2 = tL_secureRequiredType;
                                    arrayList = arrayList6;
                                    i = 1;
                                    z2 = true;
                                    if (i10 == size - 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    context2 = context;
                                    addField(context2, tL_secureRequiredType2, arrayList, z2, z3);
                                }
                            }
                        }
                    }
                    i = 1;
                }
                i10 += i;
                arrayList4 = arrayList4;
                arrayList5 = arrayList5;
            }
        }
        if (user != null) {
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context2, 24, null);
            this.bottomCell = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            TextInfoPrivacyCell textInfoPrivacyCell3 = this.bottomCell;
            int i12 = Theme.key_windowBackgroundWhiteGrayText4;
            textInfoPrivacyCell3.setLinkTextColorKey(i12);
            if (TextUtils.isEmpty(this.currentForm.privacy_policy_url)) {
                z = false;
                this.bottomCell.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportNoPolicy", R.string.PassportNoPolicy, UserObject.getFirstName(user), user.username)));
            } else {
                String string = LocaleController.formatString("PassportPolicy", R.string.PassportPolicy, UserObject.getFirstName(user), user.username);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int iIndexOf = string.indexOf(42);
                int iLastIndexOf = string.lastIndexOf(42);
                if (iIndexOf != -1 && iLastIndexOf != -1) {
                    this.bottomCell.getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new LinkSpan(), iIndexOf, iLastIndexOf - 1, 33);
                }
                this.bottomCell.setText(spannableStringBuilder);
                z = false;
            }
            this.bottomCell.getTextView().setHighlightColor(Theme.getColor(null, i12, z));
            this.bottomCell.getTextView().setGravity(1);
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
        }
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.bottomLayout = frameLayout3;
        frameLayout3.setBackgroundDrawable(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(null, Theme.key_passport_authorizeBackground, false), Theme.getColor(null, Theme.key_passport_authorizeBackgroundSelected, false)));
        frameLayout.addView(this.bottomLayout, LayoutHelper.createFrame(-1, 48, 80));
        this.bottomLayout.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda5(this, 1));
        TextView textView = new TextView(context2);
        this.acceptTextView = textView;
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        this.acceptTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.authorize, 0, 0, 0);
        this.acceptTextView.setTextColor(Theme.getColor(null, Theme.key_passport_authorizeText, false));
        this.acceptTextView.setText(LocaleController.getString(R.string.PassportAuthorize));
        this.acceptTextView.setTextSize(1, 14.0f);
        this.acceptTextView.setGravity(17);
        this.acceptTextView.setTypeface(AndroidUtilities.bold());
        this.bottomLayout.addView(this.acceptTextView, LayoutHelper.createFrame(-2, -1, 17));
        ContextProgressView contextProgressView = new ContextProgressView(context2, 0);
        this.progressViewButton = contextProgressView;
        contextProgressView.setVisibility(4);
        this.bottomLayout.addView(this.progressViewButton, LayoutHelper.createFrame(-1, -1.0f));
        View view = new View(context2);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        frameLayout.addView(view, LayoutHelper.createFrame(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
    }

    public EncryptionResult createSecureDocument(String str) {
        RandomAccessFile randomAccessFile;
        byte[] bArr = new byte[(int) new File(str).length()];
        try {
            randomAccessFile = new RandomAccessFile(str, "rws");
            try {
                randomAccessFile.readFully(bArr);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        }
        EncryptionResult encryptionResultEncryptData = encryptData(bArr);
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(encryptionResultEncryptData.encryptedData);
            randomAccessFile.close();
        } catch (Exception unused3) {
        }
        return encryptionResultEncryptData;
    }

    private String decryptData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr2.length != 32 || bArr3 == null || bArr3.length != 32) {
            return null;
        }
        byte[] bArrComputeSHA512 = Utilities.computeSHA512(bArr2, bArr3);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArrComputeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArrComputeSHA512, 32, bArr5, 0, 16);
        int length = bArr.length;
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, length, 0, 0);
        if (!Arrays.equals(Utilities.computeSHA256(bArr6), bArr3)) {
            return null;
        }
        int i = bArr6[0] & 255;
        return new String(bArr6, i, length - i);
    }

    public byte[] decryptSecret(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr2, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(bArr, 0, bArr5, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        return bArr5;
    }

    private byte[] decryptValueSecret(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.saltedPassword, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.saltedPassword, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.secureSecret, 0, bArr5, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!checkSecret(bArr5, null)) {
            return null;
        }
        byte[] bArrComputeSHA512 = Utilities.computeSHA512(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(bArrComputeSHA512, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(bArrComputeSHA512, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    public void deleteValueInternal(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList<TLRPC.TL_secureRequiredType> arrayList, final boolean z, final Runnable runnable, final ErrorRunnable errorRunnable, final boolean z2) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (!z2 || tL_secureRequiredType2 == null) {
            if (z) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        } else {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteValueInternal$60(errorRunnable, z2, tL_secureRequiredType2, tL_secureRequiredType, z, arrayList, runnable, tLObject, tL_error);
            }
        });
    }

    public EncryptionResult encryptData(byte[] bArr) {
        byte[] randomSecret = getRandomSecret();
        int iNextInt = Utilities.random.nextInt(208) + 32;
        while ((bArr.length + iNextInt) % 16 != 0) {
            iNextInt++;
        }
        byte[] bArr2 = new byte[iNextInt];
        Utilities.random.nextBytes(bArr2);
        bArr2[0] = (byte) iNextInt;
        int length = iNextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, iNextInt);
        System.arraycopy(bArr, 0, bArr3, iNextInt, bArr.length);
        byte[] bArrComputeSHA256 = Utilities.computeSHA256(bArr3);
        byte[] bArrComputeSHA512 = Utilities.computeSHA512(randomSecret, bArrComputeSHA256);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArrComputeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArrComputeSHA512, 32, bArr5, 0, 16);
        Utilities.aesCbcEncryptionByteArraySafe(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.saltedPassword, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.saltedPassword, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.secureSecret, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] bArrComputeSHA513 = Utilities.computeSHA512(bArr8, bArrComputeSHA256);
        byte[] bArr9 = new byte[32];
        System.arraycopy(bArrComputeSHA513, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(bArrComputeSHA513, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(randomSecret, 0, bArr11, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        return new EncryptionResult(bArr3, bArr11, randomSecret, bArrComputeSHA256, bArr4, bArr5);
    }

    private void fillInitialValues() {
        if (this.initialValues != null) {
            return;
        }
        this.initialValues = getCurrentValues();
    }

    public void fillNextCodeParams(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z) {
        bundle.putString("phoneHash", tL_auth_sentCode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = tL_auth_sentCode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        }
        if (tL_auth_sentCode.timeout == 0) {
            tL_auth_sentCode.timeout = 60;
        }
        bundle.putInt("timeout", tL_auth_sentCode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            setPage(2, z, bundle);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            setPage(1, z, bundle);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            setPage(0, z, bundle);
        }
    }

    private String getCurrentValues() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            if (i >= editTextBoldCursorArr.length) {
                break;
            }
            sb.append((CharSequence) editTextBoldCursorArr[i].getText());
            sb.append(",");
            i++;
        }
        if (this.inputExtraFields != null) {
            int i2 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.inputExtraFields;
                if (i2 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb.append((CharSequence) editTextBoldCursorArr2[i2].getText());
                sb.append(",");
                i2++;
            }
        }
        int size = this.documents.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append(this.documents.get(i3).secureFile.id);
        }
        SecureDocument secureDocument = this.frontDocument;
        if (secureDocument != null) {
            sb.append(secureDocument.secureFile.id);
        }
        SecureDocument secureDocument2 = this.reverseDocument;
        if (secureDocument2 != null) {
            sb.append(secureDocument2.secureFile.id);
        }
        SecureDocument secureDocument3 = this.selfieDocument;
        if (secureDocument3 != null) {
            sb.append(secureDocument3.secureFile.id);
        }
        int size2 = this.translationDocuments.size();
        for (int i4 = 0; i4 < size2; i4++) {
            sb.append(this.translationDocuments.get(i4).secureFile.id);
        }
        return sb.toString();
    }

    public String getDocumentHash(SecureDocument secureDocument) {
        byte[] bArr;
        if (secureDocument == null) {
            return "";
        }
        TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
        if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
            return Base64.encodeToString(bArr, 2);
        }
        byte[] bArr2 = secureDocument.fileHash;
        return bArr2 != null ? Base64.encodeToString(bArr2, 2) : "";
    }

    private String getErrorsString(HashMap<String, String> map, HashMap<String, String> map2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < 2) {
            HashMap<String, String> map3 = i == 0 ? map : map2;
            if (map3 != null) {
                Iterator<Map.Entry<String, String>> it = map3.entrySet().iterator();
                while (it.hasNext()) {
                    String value = it.next().getValue();
                    if (sb.length() > 0) {
                        sb.append(", ");
                        value = value.toLowerCase();
                    }
                    if (value.endsWith(".")) {
                        value = Fragment$$ExternalSyntheticOutline0.m(1, 0, value);
                    }
                    sb.append(value);
                }
            }
            i++;
        }
        if (sb.length() > 0) {
            sb.append('.');
        }
        return sb.toString();
    }

    public int getFieldCost(String str) {
        str.getClass();
        switch (str) {
            case "residence_country_code":
                return 26;
            case "last_name_native":
            case "last_name":
                return 22;
            case "gender":
                return 24;
            case "street_line1":
                return 29;
            case "street_line2":
                return 30;
            case "first_name":
            case "first_name_native":
                return 20;
            case "city":
                return 32;
            case "state":
                return 33;
            case "middle_name":
            case "middle_name_native":
                return 21;
            case "expiry_date":
                return 28;
            case "document_no":
                return 27;
            case "birth_date":
                return 23;
            case "country_code":
                return 25;
            case "post_code":
                return 31;
            default:
                return 100;
        }
    }

    private int getMaxSelectedDocuments() {
        int size;
        int i = this.uploadingFileType;
        if (i == 0) {
            size = this.documents.size();
        } else {
            if (i != 4) {
                return 1;
            }
            size = this.translationDocuments.size();
        }
        return 20 - size;
    }

    private String getNameForType(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            return "personal_details";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return "passport";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return "internal_passport";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return "driver_license";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return "identity_card";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return "utility_bill";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            return "address";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return "bank_statement";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return "rental_agreement";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return "temporary_registration";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return "passport_registration";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return "email";
        }
        return secureValueType instanceof TLRPC.TL_secureValueTypePhone ? "phone" : "";
    }

    public byte[] getRandomSecret() {
        byte[] bArr = new byte[32];
        Utilities.random.nextBytes(bArr);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            i += 255 & bArr[i2];
        }
        int i3 = i % 255;
        if (i3 != 239) {
            int iNextInt = Utilities.random.nextInt(32);
            int i4 = (bArr[iNextInt] & 255) + (239 - i3);
            if (i4 < 255) {
                i4 += 255;
            }
            bArr[iNextInt] = (byte) (i4 % 255);
        }
        return bArr;
    }

    private SecureDocumentKey getSecureDocumentKey(byte[] bArr, byte[] bArr2) {
        byte[] bArrComputeSHA512 = Utilities.computeSHA512(decryptValueSecret(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(bArrComputeSHA512, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArrComputeSHA512, 32, bArr4, 0, 16);
        return new SecureDocumentKey(bArr3, bArr4);
    }

    private String getTextForType(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return LocaleController.getString(R.string.ActionBotDocumentPassport);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return LocaleController.getString(R.string.ActionBotDocumentDriverLicence);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return LocaleController.getString(R.string.ActionBotDocumentIdentityCard);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return LocaleController.getString(R.string.ActionBotDocumentUtilityBill);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return LocaleController.getString(R.string.ActionBotDocumentBankStatement);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return LocaleController.getString(R.string.ActionBotDocumentRentalAgreement);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return LocaleController.getString(R.string.ActionBotDocumentInternalPassport);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return LocaleController.getString(R.string.ActionBotDocumentPassportRegistration);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return LocaleController.getString(R.string.ActionBotDocumentPhone);
        }
        return secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? LocaleController.getString(R.string.ActionBotDocumentEmail) : "";
    }

    public String getTranslitString(String str) {
        return LocaleController.getInstance().getTranslitString(str, true);
    }

    private TLRPC.TL_secureValue getValueByType(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.currentForm.values.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_secureValue tL_secureValue = this.currentForm.values.get(i);
            if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                if (z) {
                    if (tL_secureRequiredType.selfie_required && !(tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    if (tL_secureRequiredType.translation_required && tL_secureValue.translation.isEmpty()) {
                        return null;
                    }
                    if (isAddressDocument(tL_secureRequiredType.type) && tL_secureValue.files.isEmpty()) {
                        return null;
                    }
                    if (isPersonalDocument(tL_secureRequiredType.type) && !(tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                    if (((secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) && !(tL_secureValue.reverse_side instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    boolean z2 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    if (z2 || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                        String[] strArr = z2 ? tL_secureRequiredType.native_names ? new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                        try {
                            TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                            JSONObject jSONObject = new JSONObject(decryptData(tL_secureData.data, decryptValueSecret(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
                            for (int i2 = 0; i2 < strArr.length; i2++) {
                                if (!jSONObject.has(strArr[i2]) || TextUtils.isEmpty(jSONObject.getString(strArr[i2]))) {
                                    return null;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                return tL_secureValue;
            }
        }
        return null;
    }

    private TextDetailSecureCell getViewByType(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TextDetailSecureCell textDetailSecureCell = this.typesViews.get(tL_secureRequiredType);
        return (textDetailSecureCell != null || (tL_secureRequiredType2 = this.documentsToTypesLink.get(tL_secureRequiredType)) == null) ? textDetailSecureCell : this.typesViews.get(tL_secureRequiredType2);
    }

    private boolean hasNotValueForType(Class<? extends TLRPC.SecureValueType> cls) {
        int size = this.currentForm.values.size();
        for (int i = 0; i < size; i++) {
            if (this.currentForm.values.get(i).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    private boolean hasUnfilledValues() {
        return hasNotValueForType(TLRPC.TL_secureValueTypePhone.class) || hasNotValueForType(TLRPC.TL_secureValueTypeEmail.class) || hasNotValueForType(TLRPC.TL_secureValueTypePersonalDetails.class) || hasNotValueForType(TLRPC.TL_secureValueTypePassport.class) || hasNotValueForType(TLRPC.TL_secureValueTypeInternalPassport.class) || hasNotValueForType(TLRPC.TL_secureValueTypeIdentityCard.class) || hasNotValueForType(TLRPC.TL_secureValueTypeDriverLicense.class) || hasNotValueForType(TLRPC.TL_secureValueTypeAddress.class) || hasNotValueForType(TLRPC.TL_secureValueTypeUtilityBill.class) || hasNotValueForType(TLRPC.TL_secureValueTypePassportRegistration.class) || hasNotValueForType(TLRPC.TL_secureValueTypeTemporaryRegistration.class) || hasNotValueForType(TLRPC.TL_secureValueTypeBankStatement.class) || hasNotValueForType(TLRPC.TL_secureValueTypeRentalAgreement.class);
    }

    private boolean isAddressDocument(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) || (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) || (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement);
    }

    public boolean isHasNotAnyChanges() {
        String str = this.initialValues;
        return str == null || str.equals(getCurrentValues());
    }

    private boolean isPersonalDocument(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard);
    }

    public void lambda$addDocumentView$55(int i, View view) {
        this.uploadingFileType = i;
        if (i == 1) {
            this.currentPhotoViewerLayout = this.selfieLayout;
        } else if (i == 4) {
            this.currentPhotoViewerLayout = this.translationLayout;
        } else if (i == 2) {
            this.currentPhotoViewerLayout = this.frontLayout;
        } else if (i == 3) {
            this.currentPhotoViewerLayout = this.reverseLayout;
        } else {
            this.currentPhotoViewerLayout = this.documentsLayout;
        }
        SecureDocument secureDocument = (SecureDocument) view.getTag();
        PhotoViewer.getInstance().setParentActivity(this);
        if (i == 1) {
            ArrayList<SecureDocument> arrayList = new ArrayList<>();
            arrayList.add(this.selfieDocument);
            PhotoViewer.getInstance().openPhoto(arrayList, 0, this.provider);
            return;
        }
        if (i == 2) {
            ArrayList<SecureDocument> arrayList2 = new ArrayList<>();
            arrayList2.add(this.frontDocument);
            PhotoViewer.getInstance().openPhoto(arrayList2, 0, this.provider);
        } else if (i == 3) {
            ArrayList<SecureDocument> arrayList3 = new ArrayList<>();
            arrayList3.add(this.reverseDocument);
            PhotoViewer.getInstance().openPhoto(arrayList3, 0, this.provider);
        } else if (i == 0) {
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            ArrayList<SecureDocument> arrayList4 = this.documents;
            photoViewer.openPhoto(arrayList4, arrayList4.indexOf(secureDocument), this.provider);
        } else {
            PhotoViewer photoViewer2 = PhotoViewer.getInstance();
            ArrayList<SecureDocument> arrayList5 = this.translationDocuments;
            photoViewer2.openPhoto(arrayList5, arrayList5.indexOf(secureDocument), this.provider);
        }
    }

    public void lambda$addDocumentView$56(SecureDocument secureDocument, int i, SecureDocumentCell secureDocumentCell, String str, AlertDialog alertDialog, int i2) {
        this.documentsCells.remove(secureDocument);
        if (i == 1) {
            this.selfieDocument = null;
            this.selfieLayout.removeView(secureDocumentCell);
        } else if (i == 4) {
            this.translationDocuments.remove(secureDocument);
            this.translationLayout.removeView(secureDocumentCell);
        } else if (i == 2) {
            this.frontDocument = null;
            this.frontLayout.removeView(secureDocumentCell);
        } else if (i == 3) {
            this.reverseDocument = null;
            this.reverseLayout.removeView(secureDocumentCell);
        } else {
            this.documents.remove(secureDocument);
            this.documentsLayout.removeView(secureDocumentCell);
        }
        if (str != null) {
            HashMap<String, String> map = this.documentsErrors;
            if (map != null) {
                map.remove(str);
            }
            HashMap<String, String> map2 = this.errorsValues;
            if (map2 != null) {
                map2.remove(str);
            }
        }
        updateUploadText(i);
        String str2 = secureDocument.path;
        if (str2 == null || this.uploadingDocuments.remove(str2) == null) {
            return;
        }
        if (this.uploadingDocuments.isEmpty()) {
            this.doneItem.setEnabled(true);
            this.doneItem.setAlpha(1.0f);
        }
        FileLoader.getInstance(this.currentAccount).cancelFileUpload(secureDocument.path, false);
    }

    public boolean lambda$addDocumentView$57(int i, SecureDocument secureDocument, SecureDocumentCell secureDocumentCell, String str, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        if (i == 1) {
            builder.setMessage(LocaleController.getString(R.string.PassportDeleteSelfie));
        } else {
            builder.setMessage(LocaleController.getString(R.string.PassportDeleteScan));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), new PassportActivity$$ExternalSyntheticLambda52(i, str, secureDocument, secureDocumentCell, this));
        showDialog(builder.create());
        return true;
    }

    public void lambda$addField$61(TLRPC.TL_secureRequiredType tL_secureRequiredType, ArrayList arrayList, boolean z, DialogInterface dialogInterface, int i) {
        openTypeActivity(tL_secureRequiredType, (TLRPC.TL_secureRequiredType) arrayList.get(i), arrayList, z);
    }

    public void lambda$addField$62(String str, String str2) {
        needHideProgress();
    }

    public void lambda$addField$63(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z, AlertDialog alertDialog, int i) {
        needShowProgress();
        deleteValueInternal(tL_secureRequiredType, null, null, true, new PassportActivity$$ExternalSyntheticLambda11(this, 3), new PassportActivity$$ExternalSyntheticLambda1(this, 1), z);
    }

    public void lambda$addField$64(final ArrayList arrayList, final TLRPC.TL_secureRequiredType tL_secureRequiredType, final boolean z, View view) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        if (arrayList == null) {
            tL_secureRequiredType2 = null;
            break;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tL_secureRequiredType2 = null;
                break;
            }
            tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) arrayList.get(i);
            if (getValueByType(tL_secureRequiredType2, false) != null || size == 1) {
                break;
            } else {
                i++;
            }
        }
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) && !(secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
            boolean z2 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
            if ((z2 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && getValueByType(tL_secureRequiredType, false) != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new LoginActivity$$ExternalSyntheticLambda26(this, tL_secureRequiredType, z, 6));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.setTitle(LocaleController.getString(R.string.AppName));
                builder.setMessage(LocaleController.getString(z2 ? R.string.PassportDeletePhoneAlert : R.string.PassportDeleteEmailAlert));
                showDialog(builder.create());
                return;
            }
        } else if (tL_secureRequiredType2 == null && arrayList != null && !arrayList.isEmpty()) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder2.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
            TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
            if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                builder2.setTitle(LocaleController.getString(R.string.PassportIdentityDocument));
            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                builder2.setTitle(LocaleController.getString(R.string.PassportAddress));
            }
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList.get(i2)).type;
                if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                    arrayList2.add(LocaleController.getString(R.string.PassportAddLicence));
                } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                    arrayList2.add(LocaleController.getString(R.string.PassportAddPassport));
                } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                    arrayList2.add(LocaleController.getString(R.string.PassportAddInternalPassport));
                } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                    arrayList2.add(LocaleController.getString(R.string.PassportAddCard));
                } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    arrayList2.add(LocaleController.getString(R.string.PassportAddBill));
                } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    arrayList2.add(LocaleController.getString(R.string.PassportAddBank));
                } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    arrayList2.add(LocaleController.getString(R.string.PassportAddAgreement));
                } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    arrayList2.add(LocaleController.getString(R.string.PassportAddTemporaryRegistration));
                } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    arrayList2.add(LocaleController.getString(R.string.PassportAddPassportRegistration));
                }
            }
            builder2.setItems((CharSequence[]) arrayList2.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    this.lambda$addField$61(tL_secureRequiredType, arrayList, z, dialogInterface, i3);
                }
            });
            showDialog(builder2.create());
            return;
        }
        openTypeActivity(tL_secureRequiredType, tL_secureRequiredType2, arrayList, z);
    }

    public void lambda$checkDiscard$69(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkNativeFields$58() {
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputExtraFields;
        if (editTextBoldCursorArr != null) {
            scrollToField(editTextBoldCursorArr[0]);
        }
    }

    public void lambda$createAddressInterface$32(View view) {
        this.uploadingFileType = 0;
        openAttachMenu();
    }

    public void lambda$createAddressInterface$33(View view) {
        this.uploadingFileType = 4;
        openAttachMenu();
    }

    public void lambda$createAddressInterface$34(CountrySelectActivity.Country country) {
        this.inputFields[5].setText(country.name);
        this.currentCitizeship = country.shortname;
    }

    public boolean lambda$createAddressInterface$35(View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setCountrySelectActivityDelegate(new PassportActivity$$ExternalSyntheticLambda1(this, 0));
            presentFragment(countrySelectActivity);
        }
        return true;
    }

    public boolean lambda$createAddressInterface$36(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
        if (iIntValue < editTextBoldCursorArr.length) {
            if (editTextBoldCursorArr[iIntValue].isFocusable()) {
                this.inputFields[iIntValue].requestFocus();
            } else {
                this.inputFields[iIntValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
        return true;
    }

    public void lambda$createAddressInterface$37(View view) {
        createDocumentDeleteAlert();
    }

    public void lambda$createDocumentDeleteAlert$38(boolean[] zArr, AlertDialog alertDialog, int i) {
        if (!this.documentOnly) {
            this.currentValues.clear();
        }
        this.currentDocumentValues.clear();
        this.delegate.deleteValue(this.currentType, this.currentDocumentsType, this.availableDocumentTypes, zArr[0], null, null);
        finishFragment();
    }

    public static void lambda$createDocumentDeleteAlert$39(boolean[] zArr, View view) {
        if (view.isEnabled()) {
            boolean z = !zArr[0];
            zArr[0] = z;
            ((CheckBoxCell) view).setChecked(z, true);
        }
    }

    public void lambda$createEmailInterface$24(View view) {
        this.useCurrentValue = true;
        this.doneItem.callOnClick();
        this.useCurrentValue = false;
    }

    public boolean lambda$createEmailInterface$25(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 5) {
            return false;
        }
        this.doneItem.callOnClick();
        return true;
    }

    public boolean lambda$createEmailVerificationInterface$5(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 5) {
            return false;
        }
        this.doneItem.callOnClick();
        return true;
    }

    public void lambda$createIdentityInterface$40(View view) {
        this.uploadingFileType = 2;
        openAttachMenu();
    }

    public void lambda$createIdentityInterface$41(View view) {
        this.uploadingFileType = 3;
        openAttachMenu();
    }

    public void lambda$createIdentityInterface$42(View view) {
        this.uploadingFileType = 1;
        openAttachMenu();
    }

    public void lambda$createIdentityInterface$43(View view) {
        this.uploadingFileType = 4;
        openAttachMenu();
    }

    public void lambda$createIdentityInterface$44(View view) {
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
            return;
        }
        CameraScanActivity cameraScanActivity = new CameraScanActivity(0);
        cameraScanActivity.setDelegate(new CameraScanActivity.CameraScanActivityDelegate() {
            @Override
            public void didFindMrzInfo(MrzRecognizer.Result result) {
                if (!TextUtils.isEmpty(result.firstName)) {
                    PassportActivity.this.inputFields[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    PassportActivity.this.inputFields[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    PassportActivity.this.inputFields[2].setText(result.lastName);
                }
                int i = result.gender;
                if (i != 0) {
                    if (i == 1) {
                        PassportActivity.this.currentGender = "male";
                        PassportActivity.this.inputFields[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i == 2) {
                        PassportActivity.this.currentGender = "female";
                        PassportActivity.this.inputFields[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    PassportActivity.this.currentCitizeship = result.nationality;
                    String str = (String) PassportActivity.this.languageMap.get(PassportActivity.this.currentCitizeship);
                    if (str != null) {
                        PassportActivity.this.inputFields[5].setText(str);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    PassportActivity.this.currentResidence = result.issuingCountry;
                    String str2 = (String) PassportActivity.this.languageMap.get(PassportActivity.this.currentResidence);
                    if (str2 != null) {
                        PassportActivity.this.inputFields[6].setText(str2);
                    }
                }
                if (result.birthDay <= 0 || result.birthMonth <= 0 || result.birthYear <= 0) {
                    return;
                }
                PassportActivity.this.inputFields[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(result.birthDay), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
            }

            @Override
            public final void didFindQr(String str) {
                CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindQr(this, str);
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
        });
        presentFragment(cameraScanActivity);
    }

    public void lambda$createIdentityInterface$45(View view, CountrySelectActivity.Country country) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = this.inputFields[iIntValue];
        if (iIntValue == 5) {
            this.currentCitizeship = country.shortname;
        } else {
            this.currentResidence = country.shortname;
        }
        editTextBoldCursor.setText(country.name);
    }

    public boolean lambda$createIdentityInterface$46(View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setCountrySelectActivityDelegate(new TodoItemMenu$$ExternalSyntheticLambda7(6, this, view));
            presentFragment(countrySelectActivity);
        }
        return true;
    }

    public void lambda$createIdentityInterface$47(int i, EditTextBoldCursor editTextBoldCursor, int i2, int i3, int i4) {
        if (i == 8) {
            int[] iArr = this.currentExpireDate;
            iArr[0] = i2;
            iArr[1] = i3 + 1;
            iArr[2] = i4;
        }
        editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i4), Integer.valueOf(i3 + 1), Integer.valueOf(i2)));
    }

    public void lambda$createIdentityInterface$48(EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, int i) {
        int[] iArr = this.currentExpireDate;
        iArr[2] = 0;
        iArr[1] = 0;
        iArr[0] = 0;
        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
    }

    public boolean lambda$createIdentityInterface$49(Context context, View view, MotionEvent motionEvent) {
        String string;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iIntValue;
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            Calendar calendar = Calendar.getInstance();
            calendar.get(1);
            calendar.get(2);
            calendar.get(5);
            try {
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                int iIntValue2 = ((Integer) editTextBoldCursor.getTag()).intValue();
                if (iIntValue2 == 8) {
                    string = LocaleController.getString(R.string.PassportSelectExpiredDate);
                    i = 0;
                    i2 = 20;
                    i3 = 0;
                } else {
                    string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                    i = -120;
                    i2 = 0;
                    i3 = -18;
                }
                String str = string;
                String[] strArrSplit = editTextBoldCursor.getText().toString().split("\\.");
                if (strArrSplit.length == 3) {
                    int iIntValue3 = Utilities.parseInt((CharSequence) strArrSplit[0]).intValue();
                    int iIntValue4 = Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                    iIntValue = Utilities.parseInt((CharSequence) strArrSplit[2]).intValue();
                    i4 = iIntValue3;
                    i5 = iIntValue4;
                } else {
                    i4 = -1;
                    i5 = -1;
                    iIntValue = -1;
                }
                AlertDialog.Builder builderCreateDatePickerDialog = AlertsCreator.createDatePickerDialog(context, i, i2, i3, i4, i5, iIntValue, str, iIntValue2 == 8, new ChatActivity$$ExternalSyntheticLambda437(this, iIntValue2, editTextBoldCursor, 6));
                if (iIntValue2 == 8) {
                    builderCreateDatePickerDialog.setNegativeButton(LocaleController.getString(R.string.PassportSelectNotExpire), new TodoItemMenu$$ExternalSyntheticLambda7(5, this, editTextBoldCursor));
                }
                showDialog(builderCreateDatePickerDialog.create());
                return true;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return true;
    }

    public void lambda$createIdentityInterface$50(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            this.currentGender = "male";
            this.inputFields[4].setText(LocaleController.getString(R.string.PassportMale));
        } else if (i == 1) {
            this.currentGender = "female";
            this.inputFields[4].setText(LocaleController.getString(R.string.PassportFemale));
        }
    }

    public boolean lambda$createIdentityInterface$51(View view, MotionEvent motionEvent) {
        int i = 2;
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.PassportSelectGender));
            builder.setItems(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new DialogsActivity$$ExternalSyntheticLambda99(this, i));
            builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder.create());
        }
        return true;
    }

    public boolean lambda$createIdentityInterface$52(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
        if (iIntValue < editTextBoldCursorArr.length) {
            if (editTextBoldCursorArr[iIntValue].isFocusable()) {
                this.inputFields[iIntValue].requestFocus();
            } else {
                this.inputFields[iIntValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
        return true;
    }

    public boolean lambda$createIdentityInterface$53(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputExtraFields;
        if (iIntValue < editTextBoldCursorArr.length) {
            if (editTextBoldCursorArr[iIntValue].isFocusable()) {
                this.inputExtraFields[iIntValue].requestFocus();
            } else {
                this.inputExtraFields[iIntValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
        return true;
    }

    public void lambda$createIdentityInterface$54(View view) {
        createDocumentDeleteAlert();
    }

    public void lambda$createManageInterface$17(View view) {
        openAddDocumentAlert();
    }

    public void lambda$createManageInterface$18() {
        int i = 0;
        while (i < this.linearLayout2.getChildCount()) {
            View childAt = this.linearLayout2.getChildAt(i);
            if (childAt instanceof TextDetailSecureCell) {
                this.linearLayout2.removeView(childAt);
                i--;
            }
            i++;
        }
        needHideProgress();
        this.typesViews.clear();
        this.typesValues.clear();
        this.currentForm.values.clear();
        updateManageVisibility();
    }

    public void lambda$createManageInterface$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PassportActivity$$ExternalSyntheticLambda11(this, 4));
    }

    public void lambda$createManageInterface$20(AlertDialog alertDialog, int i) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i2 = 0; i2 < this.currentForm.values.size(); i2++) {
            deletesecurevalue.types.add(this.currentForm.values.get(i2).type);
        }
        needShowProgress();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new PassportActivity$$ExternalSyntheticLambda13(this, 0));
    }

    public void lambda$createManageInterface$21(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.TelegramPassportDeleteTitle));
        builder.setMessage(LocaleController.getString(R.string.TelegramPassportDeleteAlert));
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new PassportActivity$$ExternalSyntheticLambda1(this, 5));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public void lambda$createManageInterface$22(View view) {
        openAddDocumentAlert();
    }

    public void lambda$createPasswordInterface$10(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25((NotificationCenter.NotificationCenterDelegate) this, (Object) tL_error, tLObject, 18));
    }

    public void lambda$createPasswordInterface$11(AlertDialog alertDialog, int i) {
        Browser.openUrl(getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.currentAccount).getClientPhone());
    }

    public void lambda$createPasswordInterface$12(View view) {
        if (this.currentPassword.has_recovery) {
            needShowProgress();
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new PassportActivity$$ExternalSyntheticLambda13(this, 1), 10), this.classGuid);
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setNegativeButton(LocaleController.getString(R.string.RestorePasswordResetAccount), new PassportActivity$$ExternalSyntheticLambda1(this, 2));
        builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
        builder.setMessage(LocaleController.getString(R.string.RestorePasswordNoEmailText));
        showDialog(builder.create());
    }

    public void lambda$createPasswordInterface$6(View view) {
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 0, this.currentPassword);
        twoStepVerificationSetupActivity.setCloseAfterSet(true);
        presentFragment(twoStepVerificationSetupActivity);
    }

    public boolean lambda$createPasswordInterface$7(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5 && i != 6) {
            return false;
        }
        this.doneItem.callOnClick();
        return true;
    }

    public void lambda$createPasswordInterface$8(TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery, AlertDialog alertDialog, int i) {
        TL_account.Password password = this.currentPassword;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        presentFragment(new TwoStepVerificationSetupActivity(this.currentAccount, 4, password));
    }

    public void lambda$createPasswordInterface$9(TLRPC.TL_error tL_error, TLObject tLObject) {
        needHideProgress();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                return;
            } else {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                return;
            }
        }
        TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject;
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setMessage(LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern));
        builder.setTitle(LocaleController.getString(R.string.RestoreEmailSentTitle));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), new TodoItemMenu$$ExternalSyntheticLambda7(4, this, tL_auth_passwordRecovery));
        Dialog dialogShowDialog = showDialog(builder.create());
        if (dialogShowDialog != null) {
            dialogShowDialog.setCanceledOnTouchOutside(false);
            dialogShowDialog.setCancelable(false);
        }
    }

    public void lambda$createPhoneInterface$26(View view) {
        this.useCurrentValue = true;
        this.doneItem.callOnClick();
        this.useCurrentValue = false;
    }

    public void lambda$createPhoneInterface$27() {
        AndroidUtilities.showKeyboard(this.inputFields[2]);
    }

    public void lambda$createPhoneInterface$28(CountrySelectActivity.Country country) {
        this.inputFields[0].setText(country.name);
        if (this.countriesArray.indexOf(country.name) != -1) {
            this.ignoreOnTextChange = true;
            String str = this.countriesMap.get(country.name);
            this.inputFields[1].setText(str);
            String str2 = this.phoneFormatMap.get(str);
            this.inputFields[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
            this.ignoreOnTextChange = false;
        }
        AndroidUtilities.runOnUIThread(new PassportActivity$$ExternalSyntheticLambda11(this, 0), 300L);
        this.inputFields[2].requestFocus();
        EditTextBoldCursor editTextBoldCursor = this.inputFields[2];
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
    }

    public boolean lambda$createPhoneInterface$29(View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setCountrySelectActivityDelegate(new PassportActivity$$ExternalSyntheticLambda1(this, 3));
            presentFragment(countrySelectActivity);
        }
        return true;
    }

    public boolean lambda$createPhoneInterface$30(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            this.inputFields[2].requestFocus();
            return true;
        }
        if (i != 6) {
            return false;
        }
        this.doneItem.callOnClick();
        return true;
    }

    public boolean lambda$createPhoneInterface$31(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || this.inputFields[2].length() != 0) {
            return false;
        }
        this.inputFields[1].requestFocus();
        EditTextBoldCursor editTextBoldCursor = this.inputFields[1];
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        this.inputFields[1].dispatchKeyEvent(keyEvent);
        return true;
    }

    public void lambda$createRequestInterface$14(TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.ignoreOnFailure = true;
            callCallback(true);
            finishFragment();
        } else {
            showEditDoneProgress(false, false);
            if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
            } else {
                showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
            }
        }
    }

    public void lambda$createRequestInterface$15(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(21, this, tL_error));
    }

    public void lambda$createRequestInterface$16(View view) {
        ArrayList arrayList;
        int i;
        int i2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        ArrayList arrayList2 = new ArrayList();
        int size = this.currentForm.required_types.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.SecureRequiredType secureRequiredType = this.currentForm.required_types.get(i3);
            if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                tL_secureRequiredType = (TLRPC.TL_secureRequiredType) secureRequiredType;
            } else {
                if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                    TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                    if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                        TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                        if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                            int size2 = tL_secureRequiredTypeOneOf.types.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    tL_secureRequiredType = tL_secureRequiredType2;
                                    break;
                                }
                                TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i4);
                                if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                    if (getValueByType(tL_secureRequiredType3, true) != null) {
                                        tL_secureRequiredType = tL_secureRequiredType3;
                                        break;
                                    }
                                }
                                i4++;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            TLRPC.TL_secureValue valueByType = getValueByType(tL_secureRequiredType, true);
            if (valueByType == null) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(getViewByType(tL_secureRequiredType));
                return;
            }
            HashMap<String, String> map = this.errorsMap.get(getNameForType(tL_secureRequiredType.type));
            if (map != null && !map.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(getViewByType(tL_secureRequiredType));
                return;
            }
            arrayList2.add(new C1ValueToSend(valueByType, tL_secureRequiredType.selfie_required, tL_secureRequiredType.translation_required));
        }
        showEditDoneProgress(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = this.currentBotId;
        acceptauthorization.scope = this.currentScope;
        acceptauthorization.public_key = this.currentPublicKey;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i5 = 0;
        while (i5 < size3) {
            C1ValueToSend c1ValueToSend = (C1ValueToSend) arrayList2.get(i5);
            TLRPC.TL_secureValue tL_secureValue = c1ValueToSend.value;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData == null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                    if (tL_secureData != null) {
                        byte[] bArrDecryptValueSecret = decryptValueSecret(tL_secureData.secret, tL_secureData.data_hash);
                        jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                        jSONObject2.put("secret", Base64.encodeToString(bArrDecryptValueSecret, 2));
                        jSONObject3.put("data", jSONObject2);
                    }
                    if (tL_secureValue.files.isEmpty()) {
                        arrayList = arrayList2;
                        i = size3;
                        i2 = i5;
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        int size4 = tL_secureValue.files.size();
                        int i6 = 0;
                        while (i6 < size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i6);
                            arrayList = arrayList2;
                            try {
                                i = size3;
                                try {
                                    byte[] bArrDecryptValueSecret2 = decryptValueSecret(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    i2 = i5;
                                    try {
                                        jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                        jSONObject4.put("secret", Base64.encodeToString(bArrDecryptValueSecret2, 2));
                                        jSONArray.put(jSONObject4);
                                        i6++;
                                        arrayList2 = arrayList;
                                        size3 = i;
                                        i5 = i2;
                                    } catch (Exception unused) {
                                    }
                                } catch (Exception unused2) {
                                    i2 = i5;
                                }
                            } catch (Exception unused3) {
                                i = size3;
                            }
                        }
                        arrayList = arrayList2;
                        i = size3;
                        i2 = i5;
                        jSONObject3.put("files", jSONArray);
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] bArrDecryptValueSecret3 = decryptValueSecret(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(bArrDecryptValueSecret3, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] bArrDecryptValueSecret4 = decryptValueSecret(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(bArrDecryptValueSecret4, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (c1ValueToSend.selfie_required) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] bArrDecryptValueSecret5 = decryptValueSecret(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(bArrDecryptValueSecret5, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (c1ValueToSend.translation_required && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i7 = 0; i7 < size5; i7++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i7);
                            byte[] bArrDecryptValueSecret6 = decryptValueSecret(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(bArrDecryptValueSecret6, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(getNameForType(tL_secureValue.type), jSONObject3);
                } catch (Exception unused4) {
                    arrayList = arrayList2;
                }
                TLRPC.TL_secureValueHash tL_secureValueHash = new TLRPC.TL_secureValueHash();
                tL_secureValueHash.type = tL_secureValue.type;
                tL_secureValueHash.hash = tL_secureValue.hash;
                acceptauthorization.value_hashes.add(tL_secureValueHash);
                i5 = i2 + 1;
                arrayList2 = arrayList;
                size3 = i;
            } else if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
            }
            arrayList = arrayList2;
            i = size3;
            i2 = i5;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i5 = i2 + 1;
            arrayList2 = arrayList;
            size3 = i;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj = this.currentPayload;
        if (obj != null) {
            try {
                jSONObject9.put("payload", obj);
            } catch (Exception unused6) {
            }
        }
        Object obj2 = this.currentNonce;
        if (obj2 != null) {
            try {
                jSONObject9.put("nonce", obj2);
            } catch (Exception unused7) {
            }
        }
        EncryptionResult encryptionResultEncryptData = encryptData(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = encryptionResultEncryptData.fileHash;
        tL_secureCredentialsEncrypted.data = encryptionResultEncryptData.encryptedData;
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(this.currentPublicKey.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, rSAPublicKey);
            acceptauthorization.credentials.secret = cipher.doFinal(encryptionResultEncryptData.decrypyedFileSecret);
        } catch (Exception e) {
            FileLog.e(e);
        }
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(acceptauthorization, new PassportActivity$$ExternalSyntheticLambda13(this, 3)), this.classGuid);
    }

    public void lambda$deleteValueInternal$59(TLRPC.TL_error tL_error, ErrorRunnable errorRunnable, boolean z, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, boolean z2, ArrayList arrayList, Runnable runnable) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        String strDecryptData;
        TLRPC.TL_secureData tL_secureData;
        String strDecryptData2 = null;
        if (tL_error != null) {
            if (errorRunnable != null) {
                errorRunnable.onError(tL_error.text, null);
            }
            showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
            return;
        }
        if (!z) {
            if (z2) {
                removeValue(tL_secureRequiredType2);
            }
            removeValue(tL_secureRequiredType);
        } else if (tL_secureRequiredType != null) {
            removeValue(tL_secureRequiredType);
        } else {
            removeValue(tL_secureRequiredType2);
        }
        if (this.currentActivityType == 8) {
            TextDetailSecureCell textDetailSecureCellRemove = this.typesViews.remove(tL_secureRequiredType2);
            if (textDetailSecureCellRemove != null) {
                this.linearLayout2.removeView(textDetailSecureCellRemove);
                LinearLayout linearLayout = this.linearLayout2;
                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 6);
                if (childAt instanceof TextDetailSecureCell) {
                    ((TextDetailSecureCell) childAt).setNeedDivider(false);
                }
            }
            updateManageVisibility();
        } else {
            if (tL_secureRequiredType == null || arrayList == null || arrayList.size() <= 1) {
                tL_secureRequiredType3 = tL_secureRequiredType;
                strDecryptData = null;
            } else {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        tL_secureRequiredType3 = tL_secureRequiredType;
                    } else {
                        tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) arrayList.get(i);
                        TLRPC.TL_secureValue valueByType = getValueByType(tL_secureRequiredType3, false);
                        if (valueByType != null) {
                            TLRPC.TL_secureData tL_secureData2 = valueByType.data;
                            if (tL_secureData2 != null) {
                                strDecryptData = decryptData(tL_secureData2.data, decryptValueSecret(tL_secureData2.secret, tL_secureData2.data_hash), valueByType.data.data_hash);
                                break;
                            }
                        } else {
                            i++;
                        }
                    }
                    strDecryptData = null;
                    break;
                }
                if (tL_secureRequiredType3 == null) {
                    tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) arrayList.get(0);
                }
            }
            if (z2) {
                setTypeValue(tL_secureRequiredType2, null, null, tL_secureRequiredType3, strDecryptData, z, arrayList != null ? arrayList.size() : 0);
            } else {
                String str = strDecryptData;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType3;
                TLRPC.TL_secureValue valueByType2 = getValueByType(tL_secureRequiredType2, false);
                if (valueByType2 != null && (tL_secureData = valueByType2.data) != null) {
                    strDecryptData2 = decryptData(tL_secureData.data, decryptValueSecret(tL_secureData.secret, tL_secureData.data_hash), valueByType2.data.data_hash);
                }
                setTypeValue(tL_secureRequiredType2, null, strDecryptData2, tL_secureRequiredType4, str, z, arrayList != null ? arrayList.size() : 0);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$deleteValueInternal$60(final ErrorRunnable errorRunnable, final boolean z, final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final boolean z2, final ArrayList arrayList, final Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteValueInternal$59(tL_error, errorRunnable, z, tL_secureRequiredType, tL_secureRequiredType2, z2, arrayList, runnable);
            }
        });
    }

    public void lambda$loadPasswordInfo$3(TLObject tLObject) {
        if (tLObject != null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            TwoStepVerificationActivity.initPasswordNewAlgo(this.currentPassword);
            updatePasswordInterface();
            if (this.inputFieldContainers[0].getVisibility() == 0) {
                this.inputFields[0].requestFocus();
                AndroidUtilities.showKeyboard(this.inputFields[0]);
            }
            if (this.usingSavedPassword == 1) {
                onPasswordDone(true);
            }
        }
    }

    public void lambda$loadPasswordInfo$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(23, this, tLObject));
    }

    public static void lambda$new$0(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_help_passportConfig)) {
            SharedConfig.getCountryLangs();
        } else {
            TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
            SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
        }
    }

    public static void lambda$new$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MainTabsLayout$$ExternalSyntheticLambda0(tLObject, 8));
    }

    public void lambda$onPasswordDone$13(boolean z, String str) {
        byte[] bArr;
        byte[] x;
        AnonymousClass8 anonymousClass8;
        TL_account.Password password;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        if (!z) {
            if (this.currentPassword.current_algo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                x = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) this.currentPassword.current_algo);
            } else {
                bArr = null;
            }
            anonymousClass8 = new AnonymousClass8(z, bArr, getpasswordsettings, str);
            password = this.currentPassword;
            passwordKdfAlgo = password.current_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "PASSWORD_HASH_INVALID";
                anonymousClass8.run(null, tL_error);
                return;
            }
            tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
            getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
            if (tL_inputCheckPasswordSRPStartCheck == null) {
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, anonymousClass8, 10), this.classGuid);
            } else {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                anonymousClass8.run(null, tL_error2);
            }
        }
        x = this.savedPasswordHash;
        bArr = x;
        anonymousClass8 = new AnonymousClass8(z, bArr, getpasswordsettings, str);
        password = this.currentPassword;
        passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_error tL_error3 = new TLRPC.TL_error();
            tL_error3.text = "PASSWORD_HASH_INVALID";
            anonymousClass8.run(null, tL_error3);
            return;
        }
        tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
        if (tL_inputCheckPasswordSRPStartCheck == null) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, anonymousClass8, 10), this.classGuid);
        } else {
            TLRPC.TL_error tL_error4 = new TLRPC.TL_error();
            tL_error4.text = "ALGO_INVALID";
            anonymousClass8.run(null, tL_error4);
        }
    }

    public void lambda$onRequestPermissionsResultFragment$68(AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onResume$2() {
        ViewGroup viewGroup;
        ViewGroup[] viewGroupArr = this.inputFieldContainers;
        if (viewGroupArr == null || (viewGroup = viewGroupArr[0]) == null || viewGroup.getVisibility() != 0) {
            return;
        }
        this.inputFields[0].requestFocus();
        AndroidUtilities.showKeyboard(this.inputFields[0]);
    }

    public void lambda$onTransitionAnimationEnd$67() {
        presentFragment(this.presentAfterAnimation, true);
        this.presentAfterAnimation = null;
    }

    public void lambda$openAddDocumentAlert$23(ArrayList arrayList, DialogInterface dialogInterface, int i) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        try {
            tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
            try {
                tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList.get(i)).newInstance();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            tL_secureRequiredType = null;
        }
        if (!isPersonalDocument(tL_secureRequiredType.type)) {
            if (isAddressDocument(tL_secureRequiredType.type)) {
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
            }
            openTypeActivity(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList<>(), tL_secureRequiredType3 != null);
        }
        tL_secureRequiredType.selfie_required = true;
        tL_secureRequiredType.translation_required = true;
        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
        tL_secureRequiredType3 = tL_secureRequiredType;
        tL_secureRequiredType = tL_secureRequiredType2;
        openTypeActivity(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList<>(), tL_secureRequiredType3 != null);
    }

    public void lambda$processSelectedFiles$70(SecureDocument secureDocument, int i) {
        int i2 = this.uploadingFileType;
        if (i2 == 1) {
            SecureDocument secureDocument2 = this.selfieDocument;
            if (secureDocument2 != null) {
                SecureDocumentCell secureDocumentCellRemove = this.documentsCells.remove(secureDocument2);
                if (secureDocumentCellRemove != null) {
                    this.selfieLayout.removeView(secureDocumentCellRemove);
                }
                this.selfieDocument = null;
            }
        } else if (i2 == 4) {
            if (this.translationDocuments.size() >= 20) {
                return;
            }
        } else if (i2 == 2) {
            SecureDocument secureDocument3 = this.frontDocument;
            if (secureDocument3 != null) {
                SecureDocumentCell secureDocumentCellRemove2 = this.documentsCells.remove(secureDocument3);
                if (secureDocumentCellRemove2 != null) {
                    this.frontLayout.removeView(secureDocumentCellRemove2);
                }
                this.frontDocument = null;
            }
        } else if (i2 == 3) {
            SecureDocument secureDocument4 = this.reverseDocument;
            if (secureDocument4 != null) {
                SecureDocumentCell secureDocumentCellRemove3 = this.documentsCells.remove(secureDocument4);
                if (secureDocumentCellRemove3 != null) {
                    this.reverseLayout.removeView(secureDocumentCellRemove3);
                }
                this.reverseDocument = null;
            }
        } else if (i2 == 0 && this.documents.size() >= 20) {
            return;
        }
        this.uploadingDocuments.put(secureDocument.path, secureDocument);
        this.doneItem.setEnabled(false);
        this.doneItem.setAlpha(0.5f);
        FileLoader.getInstance(this.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
        addDocumentView(secureDocument, i);
        updateUploadText(i);
    }

    public void lambda$processSelectedFiles$71(MrzRecognizer.Result result) {
        int i;
        int i2;
        int i3 = result.type;
        if (i3 == 2) {
            if (!(this.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                int size = this.availableDocumentTypes.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.TL_secureRequiredType tL_secureRequiredType = this.availableDocumentTypes.get(i4);
                    if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.currentDocumentsType = tL_secureRequiredType;
                        updateInterfaceStringsForDocumentType();
                        break;
                    }
                }
            }
        } else if (i3 == 1) {
            if (!(this.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypePassport)) {
                int size2 = this.availableDocumentTypes.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.availableDocumentTypes.get(i5);
                    if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                        this.currentDocumentsType = tL_secureRequiredType2;
                        updateInterfaceStringsForDocumentType();
                        break;
                    }
                }
            }
        } else if (i3 == 3) {
            if (!(this.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                int size3 = this.availableDocumentTypes.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    TLRPC.TL_secureRequiredType tL_secureRequiredType3 = this.availableDocumentTypes.get(i6);
                    if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.currentDocumentsType = tL_secureRequiredType3;
                        updateInterfaceStringsForDocumentType();
                        break;
                    }
                }
            }
        } else if (i3 == 4 && !(this.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
            int size4 = this.availableDocumentTypes.size();
            for (int i7 = 0; i7 < size4; i7++) {
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = this.availableDocumentTypes.get(i7);
                if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                    this.currentDocumentsType = tL_secureRequiredType4;
                    updateInterfaceStringsForDocumentType();
                    break;
                }
            }
        }
        if (!TextUtils.isEmpty(result.firstName)) {
            this.inputFields[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            this.inputFields[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            this.inputFields[2].setText(result.lastName);
        }
        if (!TextUtils.isEmpty(result.number)) {
            this.inputFields[7].setText(result.number);
        }
        int i8 = result.gender;
        if (i8 != 0) {
            if (i8 == 1) {
                this.currentGender = "male";
                this.inputFields[4].setText(LocaleController.getString(R.string.PassportMale));
            } else if (i8 == 2) {
                this.currentGender = "female";
                this.inputFields[4].setText(LocaleController.getString(R.string.PassportFemale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            this.currentCitizeship = str;
            String str2 = this.languageMap.get(str);
            if (str2 != null) {
                this.inputFields[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            this.currentResidence = str3;
            String str4 = this.languageMap.get(str3);
            if (str4 != null) {
                this.inputFields[6].setText(str4);
            }
        }
        int i9 = result.birthDay;
        if (i9 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            this.inputFields[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i9), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
        int i10 = result.expiryDay;
        if (i10 <= 0 || (i = result.expiryMonth) <= 0 || (i2 = result.expiryYear) <= 0) {
            int[] iArr = this.currentExpireDate;
            iArr[2] = 0;
            iArr[1] = 0;
            iArr[0] = 0;
            this.inputFields[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
            return;
        }
        int[] iArr2 = this.currentExpireDate;
        iArr2[0] = i2;
        iArr2[1] = i;
        iArr2[2] = i10;
        this.inputFields[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
    }

    public void lambda$processSelectedFiles$72(ArrayList arrayList, int i, boolean z) throws FileNotFoundException {
        TLRPC.PhotoSize photoSizeScaleAndSaveImage;
        int i2 = this.uploadingFileType;
        int iMin = Math.min((i2 == 0 || i2 == 4) ? 20 : 1, arrayList.size());
        boolean z2 = false;
        for (int i3 = 0; i3 < iMin; i3++) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(i3);
            Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, sendingMediaInfo.uri, 2048.0f, 2048.0f, false);
            if (bitmapLoadBitmap != null && (photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmapLoadBitmap, 2048.0f, 2048.0f, 89, false, 320, 320)) != null) {
                TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                TLRPC.FileLocation fileLocation = photoSizeScaleAndSaveImage.location;
                tL_secureFile.dc_id = (int) fileLocation.volume_id;
                tL_secureFile.id = fileLocation.local_id;
                tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                SecureDocument secureDocumentSaveFile = this.delegate.saveFile(tL_secureFile);
                secureDocumentSaveFile.type = i;
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(this, secureDocumentSaveFile, i, 21));
                if (z && !z2) {
                    try {
                        MrzRecognizer.Result resultRecognize = MrzRecognizer.recognize(bitmapLoadBitmap, this.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                        if (resultRecognize != null) {
                            try {
                                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(22, this, resultRecognize));
                                z2 = true;
                            } catch (Throwable th) {
                                th = th;
                                z2 = true;
                                FileLog.e(th);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        SharedConfig.saveConfig();
    }

    public void lambda$startPhoneVerification$65(TLRPC.TL_error tL_error, String str, PassportActivityDelegate passportActivityDelegate, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error != null) {
            AlertsCreator.processError(this.currentAccount, tL_error, this, sendverifyphonecode, str);
            return;
        }
        HashMap map = new HashMap();
        map.put("phone", str);
        PassportActivity passportActivity = new PassportActivity(7, this.currentForm, this.currentPassword, this.currentType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap<String, String>) map, (HashMap<String, String>) null);
        passportActivity.currentAccount = this.currentAccount;
        passportActivity.saltedPassword = this.saltedPassword;
        passportActivity.secureSecret = this.secureSecret;
        passportActivity.delegate = passportActivityDelegate;
        passportActivity.currentPhoneVerification = (TLRPC.TL_auth_sentCode) tLObject;
        presentFragment(passportActivity, true);
    }

    public void lambda$startPhoneVerification$66(String str, PassportActivityDelegate passportActivityDelegate, TL_account.sendVerifyPhoneCode sendverifyphonecode, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda295(str, tLObject, tL_error, sendverifyphonecode, passportActivityDelegate, this));
    }

    private void loadPasswordInfo() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new PassportActivity$$ExternalSyntheticLambda13(this, 2)), this.classGuid);
    }

    public void onFieldError(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        AndroidUtilities.shakeView(view);
        scrollToField(view);
    }

    public void onPasscodeError(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z) {
            this.inputFields[0].setText("");
        }
        AndroidUtilities.shakeView(this.inputFields[0]);
    }

    public void onPasswordDone(boolean z) {
        String string;
        if (z) {
            string = null;
        } else {
            string = this.inputFields[0].getText().toString();
            if (TextUtils.isEmpty(string)) {
                onPasscodeError(false);
                return;
            }
            showEditDoneProgress(true, true);
        }
        Utilities.globalQueue.postRunnable(new PhotoViewer$$ExternalSyntheticLambda28(this, z, string, 14));
    }

    private void openAddDocumentAlert() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (hasNotValueForType(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPhone));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentEmail));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentity));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassport));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentInternalPassport));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentityCard));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentDriverLicence));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentAddress));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (hasNotValueForType(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() == null || arrayList.isEmpty()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.PassportNoDocumentsAdd));
        builder.setItems((CharSequence[]) arrayList.toArray(new CharSequence[0]), new ArticleViewer$$ExternalSyntheticLambda1(7, this, arrayList2));
        showDialog(builder.create());
    }

    private void openAttachMenu() {
        if (getParentActivity() == null) {
            return;
        }
        if (this.uploadingFileType == 0 && this.documents.size() >= 20) {
            showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        createChatAttachView();
        this.chatAttachAlert.setOpenWithFrontFaceCamera(this.uploadingFileType == 1);
        this.chatAttachAlert.setMaxSelectedPhotos(getMaxSelectedDocuments(), false);
        this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
        }
        this.chatAttachAlert.init();
        showDialog(this.chatAttachAlert);
    }

    private void openTypeActivity(org.telegram.tgnet.TLRPC.TL_secureRequiredType r19, org.telegram.tgnet.TLRPC.TL_secureRequiredType r20, java.util.ArrayList<org.telegram.tgnet.TLRPC.TL_secureRequiredType> r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PassportActivity.openTypeActivity(org.telegram.tgnet.TLRPC$TL_secureRequiredType, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean):void");
    }

    public void processSelectedAttach(int i) {
        if (i == 0) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File fileGeneratePicturePath = AndroidUtilities.generatePicturePath();
                if (fileGeneratePicturePath != null) {
                    if (i2 >= 24) {
                        intent.putExtra("output", FileProvider.getUriForFile(getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", fileGeneratePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(fileGeneratePicturePath));
                    }
                    this.currentPicturePath = fileGeneratePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void processSelectedFiles(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList) {
        boolean z;
        if (arrayList.isEmpty()) {
            return;
        }
        int i = this.uploadingFileType;
        if (i != 1 && i != 4 && (this.currentType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i2 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
                if (i2 >= editTextBoldCursorArr.length) {
                    z = true;
                    break;
                }
                if (i2 != 5 && i2 != 8 && i2 != 4 && i2 != 6 && editTextBoldCursorArr[i2].length() > 0) {
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = false;
            break;
        }
        Utilities.globalQueue.postRunnable(new ChatActivity$70$$ExternalSyntheticLambda1(this, arrayList, this.uploadingFileType, z, 2));
    }

    public TLRPC.TL_secureValue removeValue(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.currentForm.values.size();
        for (int i = 0; i < size; i++) {
            if (tL_secureRequiredType.type.getClass() == this.currentForm.values.get(i).type.getClass()) {
                return this.currentForm.values.remove(i);
            }
        }
        return null;
    }

    private void scrollToField(View view) {
        while (view != null && this.linearLayout2.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.scrollView.smoothScrollTo(0, view.getTop() - ((this.scrollView.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    private void setFieldValues(HashMap<String, String> map, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = map.get(str);
        if (str2 != null) {
            str.getClass();
            switch (str) {
                case "residence_country_code":
                    this.currentResidence = str2;
                    CharSequence charSequence3 = (String) this.languageMap.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case "gender":
                    if ("male".equals(str2)) {
                        this.currentGender = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportMale));
                        break;
                    } else {
                        if ("female".equals(str2)) {
                            this.currentGender = str2;
                            editTextBoldCursor.setText(LocaleController.getString(R.string.PassportFemale));
                        }
                        break;
                    }
                    break;
                case "expiry_date":
                    if (TextUtils.isEmpty(str2)) {
                        int[] iArr = this.currentExpireDate;
                        iArr[2] = 0;
                        iArr[1] = 0;
                        iArr[0] = 0;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                        break;
                    } else {
                        String[] strArrSplit = str2.split("\\.");
                        if (strArrSplit.length != 3) {
                            int[] iArr2 = this.currentExpireDate;
                            iArr2[2] = 0;
                            iArr2[1] = 0;
                            iArr2[0] = 0;
                            editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                        } else {
                            this.currentExpireDate[0] = Utilities.parseInt((CharSequence) strArrSplit[2]).intValue();
                            this.currentExpireDate[1] = Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                            this.currentExpireDate[2] = Utilities.parseInt((CharSequence) strArrSplit[0]).intValue();
                            editTextBoldCursor.setText(str2);
                        }
                        break;
                    }
                    break;
                case "country_code":
                    this.currentCitizeship = str2;
                    CharSequence charSequence4 = (String) this.languageMap.get(str2);
                    if (charSequence4 != null) {
                        editTextBoldCursor.setText(charSequence4);
                        break;
                    }
                    break;
                default:
                    editTextBoldCursor.setText(str2);
                    break;
            }
        }
        HashMap<String, String> map2 = this.fieldsErrors;
        if (map2 != null && (charSequence2 = (String) map2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            this.errorsValues.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap<String, String> map3 = this.documentsErrors;
        if (map3 == null || (charSequence = (String) map3.get(str)) == null) {
            return;
        }
        editTextBoldCursor.setErrorText(charSequence);
        this.errorsValues.put(str, editTextBoldCursor.getText().toString());
    }

    public void setTypeValue(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, boolean z, int i) {
        char c;
        StringBuilder sb;
        TLRPC.SecureValueType secureValueType;
        TLRPC.TL_secureValue tL_secureValue;
        TextDetailSecureCell textDetailSecureCell;
        String[] strArr;
        String[] strArr2;
        int i2;
        StringBuilder sb2;
        String[] strArr3;
        JSONObject jSONObject;
        int i3;
        String[] strArr4;
        JSONObject jSONObject2;
        String[] strArr5;
        JSONObject jSONObject3;
        HashMap<String, String> map;
        HashMap<String, String> map2;
        String[] strArr6;
        StringBuilder sb3;
        int i4;
        JSONObject jSONObject4;
        HashMap<String, String> map3;
        HashMap<String, String> map4;
        String[] strArr7;
        String string;
        byte b;
        Iterator<String> itKeys;
        String next;
        int i5;
        int i6;
        String string2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap<String, String> map5;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4;
        HashMap<String, String> map6;
        TLRPC.SecureValueType secureValueType2;
        TLRPC.SecureValueType secureValueType3;
        boolean z2;
        TLRPC.SecureValueType secureValueType4;
        int i7;
        boolean z3;
        TLRPC.SecureValueType secureValueType5;
        String str4 = str2;
        TextDetailSecureCell textDetailSecureCellAddField = this.typesViews.get(tL_secureRequiredType);
        if (textDetailSecureCellAddField == null) {
            if (this.currentActivityType != 8) {
                return;
            }
            ArrayList<TLRPC.TL_secureRequiredType> arrayList = new ArrayList<>();
            if (tL_secureRequiredType2 != null) {
                arrayList.add(tL_secureRequiredType2);
            }
            LinearLayout linearLayout = this.linearLayout2;
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 6);
            if (childAt instanceof TextDetailSecureCell) {
                ((TextDetailSecureCell) childAt).setNeedDivider(true);
            }
            textDetailSecureCellAddField = addField(getParentActivity(), tL_secureRequiredType, arrayList, true, true);
            updateManageVisibility();
        }
        TextDetailSecureCell textDetailSecureCell2 = textDetailSecureCellAddField;
        HashMap<String, String> map7 = this.typesValues.get(tL_secureRequiredType);
        HashMap<String, String> map8 = tL_secureRequiredType2 != null ? this.typesValues.get(tL_secureRequiredType2) : null;
        TLRPC.TL_secureValue valueByType = getValueByType(tL_secureRequiredType, true);
        TLRPC.TL_secureValue valueByType2 = getValueByType(tL_secureRequiredType2, true);
        if (str4 == null || this.languageMap != null) {
            c = 2;
            this.languageMap = null;
        } else {
            this.languageMap = new HashMap<>();
            try {
                c = 2;
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = line.split(";");
                            this.languageMap.put(strArrSplit[1], strArrSplit[2]);
                        }
                        bufferedReader.close();
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    FileLog.e(e);
                    if (str != null) {
                        secureValueType5 = tL_secureRequiredType.type;
                        if (secureValueType5 instanceof TLRPC.TL_secureValueTypePhone) {
                            string2 = PhoneFormat.getInstance().format("+".concat(str));
                            textDetailSecureCell = textDetailSecureCell2;
                        } else {
                            textDetailSecureCell = textDetailSecureCell2;
                            if (secureValueType5 instanceof TLRPC.TL_secureValueTypeEmail) {
                                string2 = str;
                            } else {
                                tL_secureValue = valueByType;
                                string2 = null;
                            }
                        }
                        tL_secureValue = valueByType;
                    } else {
                        if (this.currentActivityType != 8) {
                            sb = null;
                        } else {
                            sb = null;
                        }
                        if (str4 != null) {
                            if (map7 == null) {
                                return;
                            }
                            map7.clear();
                            secureValueType = tL_secureRequiredType.type;
                            tL_secureValue = valueByType;
                            textDetailSecureCell = textDetailSecureCell2;
                            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                i5 = this.currentActivityType;
                                if (i5 == 0) {
                                    i6 = 8;
                                    if (i5 == 8) {
                                        if (tL_secureRequiredType2 == null) {
                                            String[] strArr8 = new String[10];
                                            strArr8[0] = "first_name";
                                            strArr8[1] = "middle_name";
                                            strArr8[c] = "last_name";
                                            strArr8[3] = "first_name_native";
                                            strArr8[4] = "middle_name_native";
                                            strArr8[5] = "last_name_native";
                                            strArr8[6] = "birth_date";
                                            strArr8[7] = "gender";
                                            strArr2 = strArr8;
                                            i6 = 8;
                                            strArr2[8] = "country_code";
                                            strArr2[9] = "residence_country_code";
                                        } else {
                                            i6 = 8;
                                        }
                                    }
                                    strArr2 = null;
                                } else {
                                    i6 = 8;
                                    if (i5 == 8) {
                                        if (tL_secureRequiredType2 == null) {
                                            String[] strArr9 = new String[10];
                                            strArr9[0] = "first_name";
                                            strArr9[1] = "middle_name";
                                            strArr9[c] = "last_name";
                                            strArr9[3] = "first_name_native";
                                            strArr9[4] = "middle_name_native";
                                            strArr9[5] = "last_name_native";
                                            strArr9[6] = "birth_date";
                                            strArr9[7] = "gender";
                                            strArr2 = strArr9;
                                            i6 = 8;
                                            strArr2[8] = "country_code";
                                            strArr2[9] = "residence_country_code";
                                        } else {
                                            i6 = 8;
                                        }
                                    }
                                    strArr2 = null;
                                }
                                if (i5 != 0) {
                                }
                            } else {
                                if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                }
                                strArr = null;
                                strArr2 = null;
                            }
                            if (strArr2 == null) {
                                sb2 = sb;
                                strArr3 = strArr;
                                jSONObject = null;
                                i3 = 0;
                                strArr4 = null;
                                while (i3 < 2) {
                                    if (i3 == 0) {
                                        if (str4 != null) {
                                            try {
                                                jSONObject2 = new JSONObject(str4);
                                                strArr5 = strArr2;
                                            } catch (Exception unused) {
                                                sb = sb2;
                                            }
                                        } else {
                                            strArr5 = strArr4;
                                            jSONObject2 = jSONObject;
                                        }
                                        if (strArr5 != null) {
                                            try {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    Iterator<String> it = itKeys;
                                                    next = itKeys.next();
                                                    if (i3 == 0) {
                                                        map7.put(next, jSONObject2.getString(next));
                                                    } else {
                                                        map8.put(next, jSONObject2.getString(next));
                                                    }
                                                    itKeys = it;
                                                }
                                            } catch (Throwable th) {
                                                FileLog.e(th);
                                            }
                                            i4 = 0;
                                            while (i4 < strArr5.length) {
                                                if (jSONObject2.has(strArr5[i4])) {
                                                    if (sb2 == null) {
                                                        sb = new StringBuilder();
                                                    } else {
                                                        sb = sb2;
                                                    }
                                                    map3 = map7;
                                                    try {
                                                        string = jSONObject2.getString(strArr5[i4]);
                                                        if (string != null) {
                                                            jSONObject4 = jSONObject2;
                                                            map4 = map8;
                                                            strArr7 = strArr5;
                                                        } else {
                                                            jSONObject4 = jSONObject2;
                                                            map4 = map8;
                                                            strArr7 = strArr5;
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                } else {
                                                    jSONObject4 = jSONObject2;
                                                    map3 = map7;
                                                    map4 = map8;
                                                    strArr7 = strArr5;
                                                    sb = sb2;
                                                }
                                                i4++;
                                                sb2 = sb;
                                                map7 = map3;
                                                jSONObject2 = jSONObject4;
                                                map8 = map4;
                                                strArr5 = strArr7;
                                            }
                                        }
                                        jSONObject3 = jSONObject2;
                                        map = map7;
                                        map2 = map8;
                                        strArr6 = strArr5;
                                        sb3 = sb2;
                                        i3++;
                                        str4 = str2;
                                        sb2 = sb3;
                                        map7 = map;
                                        jSONObject = jSONObject3;
                                        map8 = map2;
                                        strArr4 = strArr6;
                                    } else {
                                        if (map8 == null) {
                                            jSONObject3 = jSONObject;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr4;
                                            sb3 = sb2;
                                            i3 = i3;
                                        } else {
                                            if (str3 != null) {
                                                jSONObject2 = new JSONObject(str3);
                                                strArr5 = strArr3;
                                            } else {
                                                strArr5 = strArr4;
                                                jSONObject2 = jSONObject;
                                            }
                                            if (strArr5 != null) {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    Iterator<String> it2 = itKeys;
                                                    next = itKeys.next();
                                                    if (i3 == 0) {
                                                        map7.put(next, jSONObject2.getString(next));
                                                    } else {
                                                        map8.put(next, jSONObject2.getString(next));
                                                    }
                                                    itKeys = it2;
                                                }
                                                i4 = 0;
                                                while (i4 < strArr5.length) {
                                                    if (jSONObject2.has(strArr5[i4])) {
                                                        if (sb2 == null) {
                                                            sb = new StringBuilder();
                                                        } else {
                                                            sb = sb2;
                                                        }
                                                        map3 = map7;
                                                        string = jSONObject2.getString(strArr5[i4]);
                                                        if (string != null) {
                                                            jSONObject4 = jSONObject2;
                                                            map4 = map8;
                                                            strArr7 = strArr5;
                                                        } else {
                                                            jSONObject4 = jSONObject2;
                                                            map4 = map8;
                                                            strArr7 = strArr5;
                                                        }
                                                    } else {
                                                        jSONObject4 = jSONObject2;
                                                        map3 = map7;
                                                        map4 = map8;
                                                        strArr7 = strArr5;
                                                        sb = sb2;
                                                    }
                                                    i4++;
                                                    sb2 = sb;
                                                    map7 = map3;
                                                    jSONObject2 = jSONObject4;
                                                    map8 = map4;
                                                    strArr5 = strArr7;
                                                }
                                            }
                                            jSONObject3 = jSONObject2;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr5;
                                            sb3 = sb2;
                                        }
                                        i3++;
                                        str4 = str2;
                                        sb2 = sb3;
                                        map7 = map;
                                        jSONObject = jSONObject3;
                                        map8 = map2;
                                        strArr4 = strArr6;
                                    }
                                }
                                sb = sb2;
                            } else {
                                sb2 = sb;
                                strArr3 = strArr;
                                jSONObject = null;
                                i3 = 0;
                                strArr4 = null;
                                while (i3 < 2) {
                                    if (i3 == 0) {
                                        if (str4 != null) {
                                            jSONObject2 = new JSONObject(str4);
                                            strArr5 = strArr2;
                                        } else {
                                            strArr5 = strArr4;
                                            jSONObject2 = jSONObject;
                                        }
                                        if (strArr5 != null) {
                                            itKeys = jSONObject2.keys();
                                            while (itKeys.hasNext()) {
                                                Iterator<String> it3 = itKeys;
                                                next = itKeys.next();
                                                if (i3 == 0) {
                                                    map7.put(next, jSONObject2.getString(next));
                                                } else {
                                                    map8.put(next, jSONObject2.getString(next));
                                                }
                                                itKeys = it3;
                                            }
                                            i4 = 0;
                                            while (i4 < strArr5.length) {
                                                if (jSONObject2.has(strArr5[i4])) {
                                                    if (sb2 == null) {
                                                        sb = new StringBuilder();
                                                    } else {
                                                        sb = sb2;
                                                    }
                                                    map3 = map7;
                                                    string = jSONObject2.getString(strArr5[i4]);
                                                    if (string != null) {
                                                        jSONObject4 = jSONObject2;
                                                        map4 = map8;
                                                        strArr7 = strArr5;
                                                    } else {
                                                        jSONObject4 = jSONObject2;
                                                        map4 = map8;
                                                        strArr7 = strArr5;
                                                    }
                                                } else {
                                                    jSONObject4 = jSONObject2;
                                                    map3 = map7;
                                                    map4 = map8;
                                                    strArr7 = strArr5;
                                                    sb = sb2;
                                                }
                                                i4++;
                                                sb2 = sb;
                                                map7 = map3;
                                                jSONObject2 = jSONObject4;
                                                map8 = map4;
                                                strArr5 = strArr7;
                                            }
                                        }
                                        jSONObject3 = jSONObject2;
                                        map = map7;
                                        map2 = map8;
                                        strArr6 = strArr5;
                                        sb3 = sb2;
                                        i3++;
                                        str4 = str2;
                                        sb2 = sb3;
                                        map7 = map;
                                        jSONObject = jSONObject3;
                                        map8 = map2;
                                        strArr4 = strArr6;
                                    } else {
                                        if (map8 == null) {
                                            jSONObject3 = jSONObject;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr4;
                                            sb3 = sb2;
                                            i3 = i3;
                                        } else {
                                            if (str3 != null) {
                                                jSONObject2 = new JSONObject(str3);
                                                strArr5 = strArr3;
                                            } else {
                                                strArr5 = strArr4;
                                                jSONObject2 = jSONObject;
                                            }
                                            if (strArr5 != null) {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    Iterator<String> it4 = itKeys;
                                                    next = itKeys.next();
                                                    if (i3 == 0) {
                                                        map7.put(next, jSONObject2.getString(next));
                                                    } else {
                                                        map8.put(next, jSONObject2.getString(next));
                                                    }
                                                    itKeys = it4;
                                                }
                                                i4 = 0;
                                                while (i4 < strArr5.length) {
                                                    if (jSONObject2.has(strArr5[i4])) {
                                                        if (sb2 == null) {
                                                            sb = new StringBuilder();
                                                        } else {
                                                            sb = sb2;
                                                        }
                                                        map3 = map7;
                                                        string = jSONObject2.getString(strArr5[i4]);
                                                        if (string != null) {
                                                            jSONObject4 = jSONObject2;
                                                            map4 = map8;
                                                            strArr7 = strArr5;
                                                        } else {
                                                            jSONObject4 = jSONObject2;
                                                            map4 = map8;
                                                            strArr7 = strArr5;
                                                        }
                                                    } else {
                                                        jSONObject4 = jSONObject2;
                                                        map3 = map7;
                                                        map4 = map8;
                                                        strArr7 = strArr5;
                                                        sb = sb2;
                                                    }
                                                    i4++;
                                                    sb2 = sb;
                                                    map7 = map3;
                                                    jSONObject2 = jSONObject4;
                                                    map8 = map4;
                                                    strArr5 = strArr7;
                                                }
                                            }
                                            jSONObject3 = jSONObject2;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr5;
                                            sb3 = sb2;
                                        }
                                        i3++;
                                        str4 = str2;
                                        sb2 = sb3;
                                        map7 = map;
                                        jSONObject = jSONObject3;
                                        map8 = map2;
                                        strArr4 = strArr6;
                                    }
                                }
                                sb = sb2;
                            }
                        } else {
                            if (map7 == null) {
                                return;
                            }
                            map7.clear();
                            secureValueType = tL_secureRequiredType.type;
                            tL_secureValue = valueByType;
                            textDetailSecureCell = textDetailSecureCell2;
                            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                i5 = this.currentActivityType;
                                if (i5 == 0) {
                                    i6 = 8;
                                    if (i5 == 8) {
                                        if (tL_secureRequiredType2 == null) {
                                            String[] strArr10 = new String[10];
                                            strArr10[0] = "first_name";
                                            strArr10[1] = "middle_name";
                                            strArr10[c] = "last_name";
                                            strArr10[3] = "first_name_native";
                                            strArr10[4] = "middle_name_native";
                                            strArr10[5] = "last_name_native";
                                            strArr10[6] = "birth_date";
                                            strArr10[7] = "gender";
                                            strArr2 = strArr10;
                                            i6 = 8;
                                            strArr2[8] = "country_code";
                                            strArr2[9] = "residence_country_code";
                                        } else {
                                            i6 = 8;
                                        }
                                    }
                                    strArr2 = null;
                                } else {
                                    i6 = 8;
                                    if (i5 == 8) {
                                        if (tL_secureRequiredType2 == null) {
                                            String[] strArr11 = new String[10];
                                            strArr11[0] = "first_name";
                                            strArr11[1] = "middle_name";
                                            strArr11[c] = "last_name";
                                            strArr11[3] = "first_name_native";
                                            strArr11[4] = "middle_name_native";
                                            strArr11[5] = "last_name_native";
                                            strArr11[6] = "birth_date";
                                            strArr11[7] = "gender";
                                            strArr2 = strArr11;
                                            i6 = 8;
                                            strArr2[8] = "country_code";
                                            strArr2[9] = "residence_country_code";
                                        } else {
                                            i6 = 8;
                                        }
                                    }
                                    strArr2 = null;
                                }
                                if (i5 != 0) {
                                }
                            } else {
                                if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                }
                                strArr = null;
                                strArr2 = null;
                            }
                            if (strArr2 == null) {
                                sb2 = sb;
                                strArr3 = strArr;
                                jSONObject = null;
                                i3 = 0;
                                strArr4 = null;
                                while (i3 < 2) {
                                    if (i3 == 0) {
                                        if (str4 != null) {
                                            jSONObject2 = new JSONObject(str4);
                                            strArr5 = strArr2;
                                        } else {
                                            strArr5 = strArr4;
                                            jSONObject2 = jSONObject;
                                        }
                                        if (strArr5 != null) {
                                            itKeys = jSONObject2.keys();
                                            while (itKeys.hasNext()) {
                                                Iterator<String> it5 = itKeys;
                                                next = itKeys.next();
                                                if (i3 == 0) {
                                                    map7.put(next, jSONObject2.getString(next));
                                                } else {
                                                    map8.put(next, jSONObject2.getString(next));
                                                }
                                                itKeys = it5;
                                            }
                                            i4 = 0;
                                            while (i4 < strArr5.length) {
                                                if (jSONObject2.has(strArr5[i4])) {
                                                    if (sb2 == null) {
                                                        sb = new StringBuilder();
                                                    } else {
                                                        sb = sb2;
                                                    }
                                                    map3 = map7;
                                                    string = jSONObject2.getString(strArr5[i4]);
                                                    if (string != null) {
                                                        jSONObject4 = jSONObject2;
                                                        map4 = map8;
                                                        strArr7 = strArr5;
                                                    } else {
                                                        jSONObject4 = jSONObject2;
                                                        map4 = map8;
                                                        strArr7 = strArr5;
                                                    }
                                                } else {
                                                    jSONObject4 = jSONObject2;
                                                    map3 = map7;
                                                    map4 = map8;
                                                    strArr7 = strArr5;
                                                    sb = sb2;
                                                }
                                                i4++;
                                                sb2 = sb;
                                                map7 = map3;
                                                jSONObject2 = jSONObject4;
                                                map8 = map4;
                                                strArr5 = strArr7;
                                            }
                                        }
                                        jSONObject3 = jSONObject2;
                                        map = map7;
                                        map2 = map8;
                                        strArr6 = strArr5;
                                        sb3 = sb2;
                                        i3++;
                                        str4 = str2;
                                        sb2 = sb3;
                                        map7 = map;
                                        jSONObject = jSONObject3;
                                        map8 = map2;
                                        strArr4 = strArr6;
                                    } else {
                                        if (map8 == null) {
                                            jSONObject3 = jSONObject;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr4;
                                            sb3 = sb2;
                                            i3 = i3;
                                        } else {
                                            if (str3 != null) {
                                                jSONObject2 = new JSONObject(str3);
                                                strArr5 = strArr3;
                                            } else {
                                                strArr5 = strArr4;
                                                jSONObject2 = jSONObject;
                                            }
                                            if (strArr5 != null) {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    Iterator<String> it6 = itKeys;
                                                    next = itKeys.next();
                                                    if (i3 == 0) {
                                                        map7.put(next, jSONObject2.getString(next));
                                                    } else {
                                                        map8.put(next, jSONObject2.getString(next));
                                                    }
                                                    itKeys = it6;
                                                }
                                                i4 = 0;
                                                while (i4 < strArr5.length) {
                                                    if (jSONObject2.has(strArr5[i4])) {
                                                        if (sb2 == null) {
                                                            sb = new StringBuilder();
                                                        } else {
                                                            sb = sb2;
                                                        }
                                                        map3 = map7;
                                                        string = jSONObject2.getString(strArr5[i4]);
                                                        if (string != null) {
                                                            jSONObject4 = jSONObject2;
                                                            map4 = map8;
                                                            strArr7 = strArr5;
                                                        } else {
                                                            jSONObject4 = jSONObject2;
                                                            map4 = map8;
                                                            strArr7 = strArr5;
                                                        }
                                                    } else {
                                                        jSONObject4 = jSONObject2;
                                                        map3 = map7;
                                                        map4 = map8;
                                                        strArr7 = strArr5;
                                                        sb = sb2;
                                                    }
                                                    i4++;
                                                    sb2 = sb;
                                                    map7 = map3;
                                                    jSONObject2 = jSONObject4;
                                                    map8 = map4;
                                                    strArr5 = strArr7;
                                                }
                                            }
                                            jSONObject3 = jSONObject2;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr5;
                                            sb3 = sb2;
                                        }
                                        i3++;
                                        str4 = str2;
                                        sb2 = sb3;
                                        map7 = map;
                                        jSONObject = jSONObject3;
                                        map8 = map2;
                                        strArr4 = strArr6;
                                    }
                                }
                                sb = sb2;
                            } else {
                                sb2 = sb;
                                strArr3 = strArr;
                                jSONObject = null;
                                i3 = 0;
                                strArr4 = null;
                                while (i3 < 2) {
                                    if (i3 == 0) {
                                        if (str4 != null) {
                                            jSONObject2 = new JSONObject(str4);
                                            strArr5 = strArr2;
                                        } else {
                                            strArr5 = strArr4;
                                            jSONObject2 = jSONObject;
                                        }
                                        if (strArr5 != null) {
                                            itKeys = jSONObject2.keys();
                                            while (itKeys.hasNext()) {
                                                Iterator<String> it7 = itKeys;
                                                next = itKeys.next();
                                                if (i3 == 0) {
                                                    map7.put(next, jSONObject2.getString(next));
                                                } else {
                                                    map8.put(next, jSONObject2.getString(next));
                                                }
                                                itKeys = it7;
                                            }
                                            i4 = 0;
                                            while (i4 < strArr5.length) {
                                                if (jSONObject2.has(strArr5[i4])) {
                                                    if (sb2 == null) {
                                                        sb = new StringBuilder();
                                                    } else {
                                                        sb = sb2;
                                                    }
                                                    map3 = map7;
                                                    string = jSONObject2.getString(strArr5[i4]);
                                                    if (string != null) {
                                                        jSONObject4 = jSONObject2;
                                                        map4 = map8;
                                                        strArr7 = strArr5;
                                                    } else {
                                                        jSONObject4 = jSONObject2;
                                                        map4 = map8;
                                                        strArr7 = strArr5;
                                                    }
                                                } else {
                                                    jSONObject4 = jSONObject2;
                                                    map3 = map7;
                                                    map4 = map8;
                                                    strArr7 = strArr5;
                                                    sb = sb2;
                                                }
                                                i4++;
                                                sb2 = sb;
                                                map7 = map3;
                                                jSONObject2 = jSONObject4;
                                                map8 = map4;
                                                strArr5 = strArr7;
                                            }
                                        }
                                        jSONObject3 = jSONObject2;
                                        map = map7;
                                        map2 = map8;
                                        strArr6 = strArr5;
                                        sb3 = sb2;
                                        i3++;
                                        str4 = str2;
                                        sb2 = sb3;
                                        map7 = map;
                                        jSONObject = jSONObject3;
                                        map8 = map2;
                                        strArr4 = strArr6;
                                    } else {
                                        if (map8 == null) {
                                            jSONObject3 = jSONObject;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr4;
                                            sb3 = sb2;
                                            i3 = i3;
                                        } else {
                                            if (str3 != null) {
                                                jSONObject2 = new JSONObject(str3);
                                                strArr5 = strArr3;
                                            } else {
                                                strArr5 = strArr4;
                                                jSONObject2 = jSONObject;
                                            }
                                            if (strArr5 != null) {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    Iterator<String> it8 = itKeys;
                                                    next = itKeys.next();
                                                    if (i3 == 0) {
                                                        map7.put(next, jSONObject2.getString(next));
                                                    } else {
                                                        map8.put(next, jSONObject2.getString(next));
                                                    }
                                                    itKeys = it8;
                                                }
                                                i4 = 0;
                                                while (i4 < strArr5.length) {
                                                    if (jSONObject2.has(strArr5[i4])) {
                                                        if (sb2 == null) {
                                                            sb = new StringBuilder();
                                                        } else {
                                                            sb = sb2;
                                                        }
                                                        map3 = map7;
                                                        string = jSONObject2.getString(strArr5[i4]);
                                                        if (string != null) {
                                                            jSONObject4 = jSONObject2;
                                                            map4 = map8;
                                                            strArr7 = strArr5;
                                                        } else {
                                                            jSONObject4 = jSONObject2;
                                                            map4 = map8;
                                                            strArr7 = strArr5;
                                                        }
                                                    } else {
                                                        jSONObject4 = jSONObject2;
                                                        map3 = map7;
                                                        map4 = map8;
                                                        strArr7 = strArr5;
                                                        sb = sb2;
                                                    }
                                                    i4++;
                                                    sb2 = sb;
                                                    map7 = map3;
                                                    jSONObject2 = jSONObject4;
                                                    map8 = map4;
                                                    strArr5 = strArr7;
                                                }
                                            }
                                            jSONObject3 = jSONObject2;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr5;
                                            sb3 = sb2;
                                        }
                                        i3++;
                                        str4 = str2;
                                        sb2 = sb3;
                                        map7 = map;
                                        jSONObject = jSONObject3;
                                        map8 = map2;
                                        strArr4 = strArr6;
                                    }
                                }
                                sb = sb2;
                            }
                        }
                        if (sb != null) {
                            string2 = sb.toString();
                        } else {
                            string2 = null;
                        }
                    }
                    if (z) {
                        tL_secureRequiredType3 = tL_secureRequiredType;
                        map5 = null;
                    } else {
                        tL_secureRequiredType3 = tL_secureRequiredType;
                        map5 = this.errorsMap.get(getNameForType(tL_secureRequiredType3.type));
                    }
                    if (tL_secureRequiredType2 != null) {
                        tL_secureRequiredType4 = tL_secureRequiredType2;
                        map6 = this.errorsMap.get(getNameForType(tL_secureRequiredType4.type));
                    } else {
                        tL_secureRequiredType4 = tL_secureRequiredType2;
                        map6 = null;
                    }
                    if (map5 != null) {
                        secureValueType2 = tL_secureRequiredType3.type;
                        if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (TextUtils.isEmpty(string2)) {
                                    if (tL_secureRequiredType4 == null) {
                                        string2 = LocaleController.getString(R.string.PassportAddressNoUploadInfo);
                                    } else if (this.currentActivityType == 8) {
                                        string2 = LocaleController.getString(R.string.PassportDocuments);
                                    } else if (i == 1) {
                                        secureValueType3 = tL_secureRequiredType4.type;
                                        if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                            string2 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                            string2 = LocaleController.getString(R.string.PassportAddBillInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                            string2 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                            string2 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                            string2 = LocaleController.getString(R.string.PassportAddBankInfo);
                                        }
                                    } else {
                                        string2 = LocaleController.getString(R.string.PassportAddressInfo);
                                    }
                                }
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
                                if (TextUtils.isEmpty(string2)) {
                                    string2 = LocaleController.getString(R.string.PassportPhoneInfo);
                                }
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
                                string2 = LocaleController.getString(R.string.PassportEmailInfo);
                            }
                            z2 = false;
                        } else if (TextUtils.isEmpty(string2)) {
                            if (tL_secureRequiredType4 == null) {
                                string2 = LocaleController.getString(R.string.PassportPersonalDetailsInfo);
                            } else if (this.currentActivityType == 8) {
                                string2 = LocaleController.getString(R.string.PassportDocuments);
                            } else if (i == 1) {
                                secureValueType4 = tL_secureRequiredType4.type;
                                if (secureValueType4 instanceof TLRPC.TL_secureValueTypePassport) {
                                    string2 = LocaleController.getString(R.string.PassportIdentityPassport);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    string2 = LocaleController.getString(R.string.PassportIdentityInternalPassport);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                    string2 = LocaleController.getString(R.string.PassportIdentityDriverLicence);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    string2 = LocaleController.getString(R.string.PassportIdentityID);
                                }
                            } else {
                                string2 = LocaleController.getString(R.string.PassportIdentityDocumentInfo);
                            }
                        }
                        z2 = false;
                    } else {
                        secureValueType2 = tL_secureRequiredType3.type;
                        if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (TextUtils.isEmpty(string2)) {
                                    if (tL_secureRequiredType4 == null) {
                                        string2 = LocaleController.getString(R.string.PassportAddressNoUploadInfo);
                                    } else if (this.currentActivityType == 8) {
                                        string2 = LocaleController.getString(R.string.PassportDocuments);
                                    } else if (i == 1) {
                                        secureValueType3 = tL_secureRequiredType4.type;
                                        if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                            string2 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                            string2 = LocaleController.getString(R.string.PassportAddBillInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                            string2 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                            string2 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                            string2 = LocaleController.getString(R.string.PassportAddBankInfo);
                                        }
                                    } else {
                                        string2 = LocaleController.getString(R.string.PassportAddressInfo);
                                    }
                                }
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
                                if (TextUtils.isEmpty(string2)) {
                                    string2 = LocaleController.getString(R.string.PassportPhoneInfo);
                                }
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
                                string2 = LocaleController.getString(R.string.PassportEmailInfo);
                            }
                            z2 = false;
                        } else if (TextUtils.isEmpty(string2)) {
                            if (tL_secureRequiredType4 == null) {
                                string2 = LocaleController.getString(R.string.PassportPersonalDetailsInfo);
                            } else if (this.currentActivityType == 8) {
                                string2 = LocaleController.getString(R.string.PassportDocuments);
                            } else if (i == 1) {
                                secureValueType4 = tL_secureRequiredType4.type;
                                if (secureValueType4 instanceof TLRPC.TL_secureValueTypePassport) {
                                    string2 = LocaleController.getString(R.string.PassportIdentityPassport);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    string2 = LocaleController.getString(R.string.PassportIdentityInternalPassport);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                    string2 = LocaleController.getString(R.string.PassportIdentityDriverLicence);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    string2 = LocaleController.getString(R.string.PassportIdentityID);
                                }
                            } else {
                                string2 = LocaleController.getString(R.string.PassportIdentityDocumentInfo);
                            }
                        }
                        z2 = false;
                    }
                    textDetailSecureCell.setValue(string2);
                    TextView textView = textDetailSecureCell.valueTextView;
                    if (z2) {
                        i7 = Theme.key_text_RedRegular;
                    } else {
                        i7 = Theme.key_windowBackgroundWhiteGrayText2;
                    }
                    textView.setTextColor(Theme.getColor(null, i7, false));
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    textDetailSecureCell.setChecked(z3);
                }
            } catch (Exception e3) {
                e = e3;
                c = 2;
            }
        }
        if (str != null) {
            secureValueType5 = tL_secureRequiredType.type;
            if (secureValueType5 instanceof TLRPC.TL_secureValueTypePhone) {
                string2 = PhoneFormat.getInstance().format("+".concat(str));
                textDetailSecureCell = textDetailSecureCell2;
            } else {
                textDetailSecureCell = textDetailSecureCell2;
                if (secureValueType5 instanceof TLRPC.TL_secureValueTypeEmail) {
                    string2 = str;
                } else {
                    tL_secureValue = valueByType;
                    string2 = null;
                }
            }
            tL_secureValue = valueByType;
        } else {
            if (this.currentActivityType != 8 || tL_secureRequiredType2 == null || (TextUtils.isEmpty(str3) && valueByType2 == null)) {
                sb = null;
            } else {
                sb = new StringBuilder();
                if (i > 1) {
                    sb.append(getTextForType(tL_secureRequiredType2.type));
                } else if (TextUtils.isEmpty(str3)) {
                    sb.append(LocaleController.getString(R.string.PassportDocuments));
                }
            }
            if (str4 != null && str3 == null) {
                textDetailSecureCell = textDetailSecureCell2;
                tL_secureValue = valueByType;
            } else {
                if (map7 == null) {
                    return;
                }
                map7.clear();
                secureValueType = tL_secureRequiredType.type;
                tL_secureValue = valueByType;
                textDetailSecureCell = textDetailSecureCell2;
                if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                    i5 = this.currentActivityType;
                    if (i5 == 0 || z) {
                        i6 = 8;
                        if (i5 == 8) {
                            if (tL_secureRequiredType2 == null) {
                                String[] strArr12 = new String[10];
                                strArr12[0] = "first_name";
                                strArr12[1] = "middle_name";
                                strArr12[c] = "last_name";
                                strArr12[3] = "first_name_native";
                                strArr12[4] = "middle_name_native";
                                strArr12[5] = "last_name_native";
                                strArr12[6] = "birth_date";
                                strArr12[7] = "gender";
                                strArr2 = strArr12;
                                i6 = 8;
                                strArr2[8] = "country_code";
                                strArr2[9] = "residence_country_code";
                            } else {
                                i6 = 8;
                            }
                        }
                        strArr2 = null;
                    } else {
                        String[] strArr13 = new String[10];
                        strArr13[0] = "first_name";
                        strArr13[1] = "middle_name";
                        strArr13[c] = "last_name";
                        strArr13[3] = "first_name_native";
                        strArr13[4] = "middle_name_native";
                        strArr13[5] = "last_name_native";
                        strArr13[6] = "birth_date";
                        strArr13[7] = "gender";
                        strArr2 = strArr13;
                        i6 = 8;
                        strArr2[8] = "country_code";
                        strArr2[9] = "residence_country_code";
                    }
                    strArr = (i5 != 0 || (i5 == i6 && tL_secureRequiredType2 != null)) ? new String[]{"document_no", "expiry_date"} : null;
                } else if ((secureValueType instanceof TLRPC.TL_secureValueTypeAddress) || (((i2 = this.currentActivityType) != 0 || z) && !(i2 == 8 && tL_secureRequiredType2 == null))) {
                    strArr = null;
                    strArr2 = null;
                } else {
                    strArr2 = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                }
                if (strArr2 == null || strArr != null) {
                    sb2 = sb;
                    strArr3 = strArr;
                    jSONObject = null;
                    i3 = 0;
                    strArr4 = null;
                    while (i3 < 2) {
                        if (i3 == 0) {
                            if (str4 != null) {
                                jSONObject2 = new JSONObject(str4);
                                strArr5 = strArr2;
                            } else {
                                strArr5 = strArr4;
                                jSONObject2 = jSONObject;
                            }
                            if (strArr5 != null && jSONObject2 != null) {
                                itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    Iterator<String> it9 = itKeys;
                                    next = itKeys.next();
                                    if (i3 == 0) {
                                        map7.put(next, jSONObject2.getString(next));
                                    } else {
                                        map8.put(next, jSONObject2.getString(next));
                                    }
                                    itKeys = it9;
                                }
                                i4 = 0;
                                while (i4 < strArr5.length) {
                                    if (jSONObject2.has(strArr5[i4])) {
                                        if (sb2 == null) {
                                            sb = new StringBuilder();
                                        } else {
                                            sb = sb2;
                                        }
                                        map3 = map7;
                                        string = jSONObject2.getString(strArr5[i4]);
                                        if (string != null || TextUtils.isEmpty(string)) {
                                            jSONObject4 = jSONObject2;
                                        } else {
                                            jSONObject4 = jSONObject2;
                                            if (!"first_name_native".equals(strArr5[i4]) && !"middle_name_native".equals(strArr5[i4]) && !"last_name_native".equals(strArr5[i4])) {
                                                if (sb.length() > 0) {
                                                    if ("last_name".equals(strArr5[i4]) || "last_name_native".equals(strArr5[i4]) || "middle_name".equals(strArr5[i4]) || "middle_name_native".equals(strArr5[i4])) {
                                                        sb.append(" ");
                                                    } else {
                                                        sb.append(", ");
                                                    }
                                                }
                                                String str5 = strArr5[i4];
                                                map4 = map8;
                                                int iHashCode = str5.hashCode();
                                                strArr7 = strArr5;
                                                if (iHashCode != -2006252145) {
                                                    if (iHashCode != -1249512767) {
                                                        if (iHashCode == 1481071862 && str5.equals("country_code")) {
                                                            b = 0;
                                                        } else {
                                                            b = -1;
                                                        }
                                                    } else if (str5.equals("gender")) {
                                                        b = 2;
                                                    } else {
                                                        b = -1;
                                                    }
                                                } else if (str5.equals("residence_country_code")) {
                                                    b = 1;
                                                } else {
                                                    b = -1;
                                                }
                                                if (b == 0 || b == 1) {
                                                    String str6 = this.languageMap.get(string);
                                                    if (str6 != null) {
                                                        sb.append(str6);
                                                    }
                                                } else if (b != 2) {
                                                    sb.append(string);
                                                } else if ("male".equals(string)) {
                                                    sb.append(LocaleController.getString(R.string.PassportMale));
                                                } else if ("female".equals(string)) {
                                                    sb.append(LocaleController.getString(R.string.PassportFemale));
                                                }
                                            }
                                        }
                                        map4 = map8;
                                        strArr7 = strArr5;
                                    } else {
                                        jSONObject4 = jSONObject2;
                                        map3 = map7;
                                        map4 = map8;
                                        strArr7 = strArr5;
                                        sb = sb2;
                                    }
                                    i4++;
                                    sb2 = sb;
                                    map7 = map3;
                                    jSONObject2 = jSONObject4;
                                    map8 = map4;
                                    strArr5 = strArr7;
                                }
                            }
                            jSONObject3 = jSONObject2;
                            map = map7;
                            map2 = map8;
                            strArr6 = strArr5;
                            sb3 = sb2;
                            i3++;
                            str4 = str2;
                            sb2 = sb3;
                            map7 = map;
                            jSONObject = jSONObject3;
                            map8 = map2;
                            strArr4 = strArr6;
                        } else {
                            if (map8 == null) {
                                jSONObject3 = jSONObject;
                                map = map7;
                                map2 = map8;
                                strArr6 = strArr4;
                                sb3 = sb2;
                                i3 = i3;
                            } else {
                                if (str3 != null) {
                                    jSONObject2 = new JSONObject(str3);
                                    strArr5 = strArr3;
                                } else {
                                    strArr5 = strArr4;
                                    jSONObject2 = jSONObject;
                                }
                                if (strArr5 != null) {
                                    itKeys = jSONObject2.keys();
                                    while (itKeys.hasNext()) {
                                        Iterator<String> it10 = itKeys;
                                        next = itKeys.next();
                                        if (i3 == 0) {
                                            map7.put(next, jSONObject2.getString(next));
                                        } else {
                                            map8.put(next, jSONObject2.getString(next));
                                        }
                                        itKeys = it10;
                                    }
                                    i4 = 0;
                                    while (i4 < strArr5.length) {
                                        if (jSONObject2.has(strArr5[i4])) {
                                            if (sb2 == null) {
                                                sb = new StringBuilder();
                                            } else {
                                                sb = sb2;
                                            }
                                            map3 = map7;
                                            string = jSONObject2.getString(strArr5[i4]);
                                            if (string != null) {
                                                jSONObject4 = jSONObject2;
                                                map4 = map8;
                                                strArr7 = strArr5;
                                            } else {
                                                jSONObject4 = jSONObject2;
                                                map4 = map8;
                                                strArr7 = strArr5;
                                            }
                                        } else {
                                            jSONObject4 = jSONObject2;
                                            map3 = map7;
                                            map4 = map8;
                                            strArr7 = strArr5;
                                            sb = sb2;
                                        }
                                        i4++;
                                        sb2 = sb;
                                        map7 = map3;
                                        jSONObject2 = jSONObject4;
                                        map8 = map4;
                                        strArr5 = strArr7;
                                    }
                                }
                                jSONObject3 = jSONObject2;
                                map = map7;
                                map2 = map8;
                                strArr6 = strArr5;
                                sb3 = sb2;
                            }
                            i3++;
                            str4 = str2;
                            sb2 = sb3;
                            map7 = map;
                            jSONObject = jSONObject3;
                            map8 = map2;
                            strArr4 = strArr6;
                        }
                    }
                    sb = sb2;
                }
            }
            if (sb != null) {
                string2 = sb.toString();
            } else {
                string2 = null;
            }
        }
        if (z) {
            tL_secureRequiredType3 = tL_secureRequiredType;
            map5 = this.errorsMap.get(getNameForType(tL_secureRequiredType3.type));
        } else {
            tL_secureRequiredType3 = tL_secureRequiredType;
            map5 = null;
        }
        if (tL_secureRequiredType2 != null) {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            map6 = this.errorsMap.get(getNameForType(tL_secureRequiredType4.type));
        } else {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            map6 = null;
        }
        if ((map5 != null || map5.size() <= 0) && (map6 == null || map6.size() <= 0)) {
            secureValueType2 = tL_secureRequiredType3.type;
            if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                    if (TextUtils.isEmpty(string2)) {
                        if (tL_secureRequiredType4 == null) {
                            string2 = LocaleController.getString(R.string.PassportAddressNoUploadInfo);
                        } else if (this.currentActivityType == 8) {
                            string2 = LocaleController.getString(R.string.PassportDocuments);
                        } else if (i == 1) {
                            secureValueType3 = tL_secureRequiredType4.type;
                            if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                string2 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                            } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                string2 = LocaleController.getString(R.string.PassportAddBillInfo);
                            } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                string2 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                            } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                string2 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                            } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                string2 = LocaleController.getString(R.string.PassportAddBankInfo);
                            }
                        } else {
                            string2 = LocaleController.getString(R.string.PassportAddressInfo);
                        }
                    }
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
                    if (TextUtils.isEmpty(string2)) {
                        string2 = LocaleController.getString(R.string.PassportPhoneInfo);
                    }
                } else if ((secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) && TextUtils.isEmpty(string2)) {
                    string2 = LocaleController.getString(R.string.PassportEmailInfo);
                }
                z2 = false;
            } else if (TextUtils.isEmpty(string2)) {
                if (tL_secureRequiredType4 == null) {
                    string2 = LocaleController.getString(R.string.PassportPersonalDetailsInfo);
                } else if (this.currentActivityType == 8) {
                    string2 = LocaleController.getString(R.string.PassportDocuments);
                } else if (i == 1) {
                    secureValueType4 = tL_secureRequiredType4.type;
                    if (secureValueType4 instanceof TLRPC.TL_secureValueTypePassport) {
                        string2 = LocaleController.getString(R.string.PassportIdentityPassport);
                    } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        string2 = LocaleController.getString(R.string.PassportIdentityInternalPassport);
                    } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        string2 = LocaleController.getString(R.string.PassportIdentityDriverLicence);
                    } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        string2 = LocaleController.getString(R.string.PassportIdentityID);
                    }
                } else {
                    string2 = LocaleController.getString(R.string.PassportIdentityDocumentInfo);
                }
            }
            z2 = false;
        } else {
            string2 = !z ? this.mainErrorsMap.get(getNameForType(tL_secureRequiredType3.type)) : null;
            if (string2 == null) {
                string2 = this.mainErrorsMap.get(getNameForType(tL_secureRequiredType4.type));
            }
            z2 = true;
        }
        textDetailSecureCell.setValue(string2);
        TextView textView2 = textDetailSecureCell.valueTextView;
        if (z2) {
            i7 = Theme.key_text_RedRegular;
        } else {
            i7 = Theme.key_windowBackgroundWhiteGrayText2;
        }
        textView2.setTextColor(Theme.getColor(null, i7, false));
        if (z2 || this.currentActivityType == 8 || (((!z || tL_secureRequiredType4 == null) && (z || tL_secureValue == null)) || (tL_secureRequiredType4 != null && valueByType2 == null))) {
            z3 = false;
        } else {
            z3 = true;
        }
        textDetailSecureCell.setChecked(z3);
    }

    public void showAlertWithText(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setTitle(str);
        builder.setMessage(str2);
        showDialog(builder.create());
    }

    private void showAttachmentError() {
        if (getParentActivity() == null) {
            return;
        }
        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.UnsupportedAttachment), 0).show();
    }

    public void showEditDoneProgress(boolean z, final boolean z2) {
        AnimatorSet animatorSet = this.doneItemAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z && this.doneItem != null) {
            this.doneItemAnimation = new AnimatorSet();
            if (z2) {
                this.progressView.setVisibility(0);
                this.doneItem.setEnabled(false);
                AnimatorSet animatorSet2 = this.doneItemAnimation;
                View contentView = this.doneItem.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property, 0.1f);
                View contentView2 = this.doneItem.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property2, 0.1f);
                View contentView3 = this.doneItem.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property3, 1.0f));
            } else {
                this.doneItem.getContentView().setVisibility(0);
                this.doneItem.setEnabled(true);
                AnimatorSet animatorSet3 = this.doneItemAnimation;
                ContextProgressView contextProgressView = this.progressView;
                Property property4 = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(contextProgressView, (Property<ContextProgressView, Float>) property4, 0.1f);
                ContextProgressView contextProgressView2 = this.progressView;
                Property property5 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(contextProgressView2, (Property<ContextProgressView, Float>) property5, 0.1f);
                ContextProgressView contextProgressView3 = this.progressView;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(contextProgressView3, (Property<ContextProgressView, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property6, 1.0f));
            }
            this.doneItemAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animator) {
                    if (PassportActivity.this.doneItemAnimation == null || !PassportActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    PassportActivity.this.doneItemAnimation = null;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PassportActivity.this.doneItemAnimation == null || !PassportActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    if (z2) {
                        PassportActivity.this.doneItem.getContentView().setVisibility(4);
                    } else {
                        PassportActivity.this.progressView.setVisibility(4);
                    }
                }
            });
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
            return;
        }
        if (this.acceptTextView != null) {
            this.doneItemAnimation = new AnimatorSet();
            if (z2) {
                this.progressViewButton.setVisibility(0);
                this.bottomLayout.setEnabled(false);
                AnimatorSet animatorSet4 = this.doneItemAnimation;
                TextView textView = this.acceptTextView;
                Property property7 = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property7, 0.1f);
                TextView textView2 = this.acceptTextView;
                Property property8 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property8, 0.1f);
                TextView textView3 = this.acceptTextView;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property9, 1.0f));
            } else {
                this.acceptTextView.setVisibility(0);
                this.bottomLayout.setEnabled(true);
                AnimatorSet animatorSet5 = this.doneItemAnimation;
                ContextProgressView contextProgressView4 = this.progressViewButton;
                Property property10 = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(contextProgressView4, (Property<ContextProgressView, Float>) property10, 0.1f);
                ContextProgressView contextProgressView5 = this.progressViewButton;
                Property property11 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(contextProgressView5, (Property<ContextProgressView, Float>) property11, 0.1f);
                ContextProgressView contextProgressView6 = this.progressViewButton;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, ObjectAnimator.ofFloat(contextProgressView6, (Property<ContextProgressView, Float>) property12, 0.0f), ObjectAnimator.ofFloat(this.acceptTextView, (Property<TextView, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.acceptTextView, (Property<TextView, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.acceptTextView, (Property<TextView, Float>) property12, 1.0f));
            }
            this.doneItemAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animator) {
                    if (PassportActivity.this.doneItemAnimation == null || !PassportActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    PassportActivity.this.doneItemAnimation = null;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PassportActivity.this.doneItemAnimation == null || !PassportActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    if (z2) {
                        PassportActivity.this.acceptTextView.setVisibility(4);
                    } else {
                        PassportActivity.this.progressViewButton.setVisibility(4);
                    }
                }
            });
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
        }
    }

    public void startPhoneVerification(boolean z, String str, Runnable runnable, ErrorRunnable errorRunnable, PassportActivityDelegate passportActivityDelegate) {
        boolean z2;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        boolean z3 = (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0) ? false : true;
        if (getParentActivity() == null || Build.VERSION.SDK_INT < 23 || !z3) {
            z2 = true;
        } else {
            z2 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (z) {
                this.permissionsItems.clear();
                if (!z2) {
                    this.permissionsItems.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.permissionsItems.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                        builder.setTitle(LocaleController.getString(R.string.AppName));
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        builder.setMessage(LocaleController.getString(R.string.AllowReadCall));
                        this.permissionsDialog = showDialog(builder.create());
                    } else {
                        getParentActivity().requestPermissions((String[]) this.permissionsItems.toArray(new String[0]), 6);
                    }
                    this.pendingPhone = str;
                    this.pendingErrorRunnable = errorRunnable;
                    this.pendingFinishRunnable = runnable;
                    this.pendingDelegate = passportActivityDelegate;
                    return;
                }
            }
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        tL_codeSettings.allow_flashcall = z3 && z2;
        tL_codeSettings.allow_app_hash = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).commit();
        } else {
            sharedPreferences.edit().remove("sms_hash").commit();
        }
        if (sendverifyphonecode.settings.allow_flashcall) {
            try {
                String line1Number = telephonyManager.getLine1Number();
                if (TextUtils.isEmpty(line1Number)) {
                    TLRPC.TL_codeSettings tL_codeSettings2 = sendverifyphonecode.settings;
                    tL_codeSettings2.unknown_number = true;
                    tL_codeSettings2.current_number = false;
                } else {
                    sendverifyphonecode.settings.current_number = PhoneNumberUtils.compare(str, line1Number);
                    TLRPC.TL_codeSettings tL_codeSettings3 = sendverifyphonecode.settings;
                    if (!tL_codeSettings3.current_number) {
                        tL_codeSettings3.allow_flashcall = false;
                    }
                }
            } catch (Exception e) {
                sendverifyphonecode.settings.allow_flashcall = false;
                FileLog.e(e);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new LoginActivity$$ExternalSyntheticLambda27(2, this, str, passportActivityDelegate, sendverifyphonecode), 2);
    }

    private void updateInterfaceStringsForDocumentType() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.currentDocumentsType;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(getTextForType(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportPersonal));
        }
        updateUploadText(2);
        updateUploadText(3);
        updateUploadText(1);
        updateUploadText(4);
    }

    private void updateManageVisibility() {
        if (this.currentForm.values.isEmpty()) {
            this.emptyLayout.setVisibility(0);
            this.sectionCell.setVisibility(8);
            this.headerCell.setVisibility(8);
            this.addDocumentCell.setVisibility(8);
            this.deletePassportCell.setVisibility(8);
            this.addDocumentSectionCell.setVisibility(8);
            return;
        }
        this.emptyLayout.setVisibility(8);
        this.sectionCell.setVisibility(0);
        this.headerCell.setVisibility(0);
        this.deletePassportCell.setVisibility(0);
        this.addDocumentSectionCell.setVisibility(0);
        if (hasUnfilledValues()) {
            this.addDocumentCell.setVisibility(0);
        } else {
            this.addDocumentCell.setVisibility(8);
        }
    }

    public void updatePasswordInterface() {
        ImageView imageView = this.noPasswordImageView;
        if (imageView == null) {
            return;
        }
        TL_account.Password password = this.currentPassword;
        if (password == null || this.usingSavedPassword != 0) {
            imageView.setVisibility(8);
            this.noPasswordTextView.setVisibility(8);
            this.noPasswordSetTextView.setVisibility(8);
            this.passwordAvatarContainer.setVisibility(8);
            this.inputFieldContainers[0].setVisibility(8);
            this.doneItem.setVisibility(8);
            this.passwordForgotButton.setVisibility(8);
            this.passwordInfoRequestTextView.setVisibility(8);
            this.passwordRequestTextView.setVisibility(8);
            this.emptyView.setVisibility(0);
            return;
        }
        if (!password.has_password) {
            this.passwordRequestTextView.setVisibility(0);
            this.noPasswordImageView.setVisibility(0);
            this.noPasswordTextView.setVisibility(0);
            this.noPasswordSetTextView.setVisibility(0);
            this.passwordAvatarContainer.setVisibility(8);
            this.inputFieldContainers[0].setVisibility(8);
            this.doneItem.setVisibility(8);
            this.passwordForgotButton.setVisibility(8);
            this.passwordInfoRequestTextView.setVisibility(8);
            this.passwordRequestTextView.setLayoutParams(LayoutHelper.createLinear(-1, -2, 0.0f, 25.0f, 0.0f, 0.0f));
            this.emptyView.setVisibility(8);
            return;
        }
        this.passwordRequestTextView.setVisibility(0);
        this.noPasswordImageView.setVisibility(8);
        this.noPasswordTextView.setVisibility(8);
        this.noPasswordSetTextView.setVisibility(8);
        this.emptyView.setVisibility(8);
        this.passwordAvatarContainer.setVisibility(0);
        this.inputFieldContainers[0].setVisibility(0);
        this.doneItem.setVisibility(0);
        this.passwordForgotButton.setVisibility(0);
        this.passwordInfoRequestTextView.setVisibility(0);
        this.passwordRequestTextView.setLayoutParams(LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
        if (this.inputFields != null) {
            TL_account.Password password2 = this.currentPassword;
            if (password2 == null || TextUtils.isEmpty(password2.hint)) {
                this.inputFields[0].setHint(LocaleController.getString(R.string.LoginPassword));
            } else {
                this.inputFields[0].setHint(this.currentPassword.hint);
            }
        }
    }

    public void updateUploadText(int i) {
        boolean z = true;
        if (i == 0) {
            if (this.uploadDocumentCell == null) {
                return;
            }
            if (this.documents.size() >= 1) {
                this.uploadDocumentCell.setText(LocaleController.getString(R.string.PassportUploadAdditinalDocument), false);
                return;
            } else {
                this.uploadDocumentCell.setText(LocaleController.getString(R.string.PassportUploadDocument), false);
                return;
            }
        }
        if (i == 1) {
            TextDetailSettingsCell textDetailSettingsCell = this.uploadSelfieCell;
            if (textDetailSettingsCell == null) {
                return;
            }
            textDetailSettingsCell.setVisibility(this.selfieDocument != null ? 8 : 0);
            return;
        }
        if (i == 4) {
            if (this.uploadTranslationCell == null) {
                return;
            }
            if (this.translationDocuments.size() >= 1) {
                this.uploadTranslationCell.setText(LocaleController.getString(R.string.PassportUploadAdditinalDocument), false);
                return;
            } else {
                this.uploadTranslationCell.setText(LocaleController.getString(R.string.PassportUploadDocument), false);
                return;
            }
        }
        if (i != 2) {
            if (i != 3 || this.uploadReverseCell == null) {
                return;
            }
            TLRPC.SecureValueType secureValueType = this.currentDocumentsType.type;
            if ((secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                this.reverseLayout.setVisibility(0);
                this.uploadReverseCell.setVisibility(this.reverseDocument != null ? 8 : 0);
                return;
            } else {
                this.reverseLayout.setVisibility(8);
                this.uploadReverseCell.setVisibility(8);
                return;
            }
        }
        TextDetailSettingsCell textDetailSettingsCell2 = this.uploadFrontCell;
        if (textDetailSettingsCell2 == null) {
            return;
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.currentDocumentsType;
        if (tL_secureRequiredType == null) {
            z = false;
        } else if (!tL_secureRequiredType.selfie_required) {
            TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
            if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypeIdentityCard) && !(secureValueType2 instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                z = false;
            }
        }
        TLRPC.SecureValueType secureValueType3 = tL_secureRequiredType.type;
        if ((secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
            textDetailSettingsCell2.setTextAndValue(LocaleController.getString(R.string.PassportMainPage), LocaleController.getString(R.string.PassportMainPageInfo), z);
        } else {
            textDetailSettingsCell2.setTextAndValue(LocaleController.getString(R.string.PassportFrontSide), LocaleController.getString(R.string.PassportFrontSideInfo), z);
        }
        this.uploadFrontCell.setVisibility(this.frontDocument != null ? 8 : 0);
    }

    @Override
    public View createView(Context context) {
        ChatAttachAlert chatAttachAlert;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass3());
        if (this.currentActivityType == 7) {
            ScrollView scrollView = new ScrollView(context) {
                @Override
                public void onMeasure(int i, int i2) {
                    PassportActivity.this.scrollHeight = View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(30.0f);
                    super.onMeasure(i, i2);
                }

                @Override
                public boolean onRequestFocusInDescendants(int i, Rect rect) {
                    return false;
                }

                @Override
                public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                    if (PassportActivity.this.currentViewNum == 1 || PassportActivity.this.currentViewNum == 2 || PassportActivity.this.currentViewNum == 4) {
                        rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                    }
                    return super.requestChildRectangleOnScreen(view, rect, z);
                }
            };
            this.scrollView = scrollView;
            this.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(null, Theme.key_actionBarDefault, false));
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            this.fragmentView = frameLayout;
            frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
            ScrollView scrollView2 = new ScrollView(context) {
                @Override
                public boolean onRequestFocusInDescendants(int i, Rect rect) {
                    return false;
                }

                @Override
                public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = AndroidUtilities.dp(20.0f) + rect.top;
                    rect.bottom = AndroidUtilities.dp(50.0f) + rect.bottom;
                    return super.requestChildRectangleOnScreen(view, rect, z);
                }
            };
            this.scrollView = scrollView2;
            scrollView2.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(null, Theme.key_actionBarDefault, false));
            frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.currentActivityType == 0 ? 48.0f : 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout2 = linearLayout;
            linearLayout.setOrientation(1);
            this.scrollView.addView(this.linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        }
        int i = this.currentActivityType;
        if (i != 0 && i != 8) {
            this.doneItem = this.actionBar.createMenu().addItemWithWidth(2, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            ContextProgressView contextProgressView = new ContextProgressView(context, 1);
            this.progressView = contextProgressView;
            contextProgressView.setAlpha(0.0f);
            this.progressView.setScaleX(0.1f);
            this.progressView.setScaleY(0.1f);
            this.progressView.setVisibility(4);
            this.doneItem.addView(this.progressView, LayoutHelper.createFrame(-1, -1.0f));
            int i2 = this.currentActivityType;
            if ((i2 == 1 || i2 == 2) && (chatAttachAlert = this.chatAttachAlert) != null) {
                try {
                    if (chatAttachAlert.isShowing()) {
                        this.chatAttachAlert.lambda$showGiftOfferSheet$15();
                    }
                } catch (Exception unused) {
                }
                this.chatAttachAlert.onDestroy();
                this.chatAttachAlert = null;
            }
        }
        int i3 = this.currentActivityType;
        if (i3 == 5) {
            createPasswordInterface(context);
        } else if (i3 == 0) {
            createRequestInterface(context);
        } else if (i3 == 1) {
            createIdentityInterface(context);
            fillInitialValues();
        } else if (i3 == 2) {
            createAddressInterface(context);
            fillInitialValues();
        } else if (i3 == 3) {
            createPhoneInterface(context);
        } else if (i3 == 4) {
            createEmailInterface(context);
        } else if (i3 == 6) {
            createEmailVerificationInterface(context);
        } else if (i3 == 7) {
            createPhoneVerificationInterface(context);
        } else if (i3 == 8) {
            createManageInterface(context);
        }
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        SecureDocumentCell secureDocumentCell;
        ActionBarMenuItem actionBarMenuItem;
        if (i != NotificationCenter.fileUploaded) {
            if (i != NotificationCenter.fileUploadFailed && i == NotificationCenter.twoStepPasswordChanged) {
                if (objArr == null || objArr.length <= 0) {
                    this.currentPassword = null;
                    loadPasswordInfo();
                } else {
                    Object obj = objArr[7];
                    if (obj != null && (editTextBoldCursor = this.inputFields[0]) != null) {
                        editTextBoldCursor.setText((String) obj);
                    }
                    if (objArr[6] == null) {
                        TL_account.TL_password tL_password = new TL_account.TL_password();
                        this.currentPassword = tL_password;
                        tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                        tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                        tL_password.secure_random = (byte[]) objArr[3];
                        tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                        TL_account.Password password = this.currentPassword;
                        password.hint = (String) objArr[5];
                        password.srp_id = -1L;
                        byte[] bArr = new byte[256];
                        password.srp_B = bArr;
                        Utilities.random.nextBytes(bArr);
                        EditTextBoldCursor editTextBoldCursor2 = this.inputFields[0];
                        if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                            this.usingSavedPassword = 2;
                        }
                    }
                }
                updatePasswordInterface();
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        SecureDocument secureDocument = this.uploadingDocuments.get(str);
        if (secureDocument != null) {
            secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
            this.uploadingDocuments.remove(str);
            if (this.uploadingDocuments.isEmpty() && (actionBarMenuItem = this.doneItem) != null) {
                actionBarMenuItem.setEnabled(true);
                this.doneItem.setAlpha(1.0f);
            }
            HashMap<SecureDocument, SecureDocumentCell> map = this.documentsCells;
            if (map != null && (secureDocumentCell = map.get(secureDocument)) != null) {
                secureDocumentCell.updateButtonState(true);
            }
            HashMap<String, String> map2 = this.errorsValues;
            if (map2 != null && map2.containsKey("error_document_all")) {
                this.errorsValues.remove("error_document_all");
                checkTopErrorCell(false);
            }
            int i3 = secureDocument.type;
            if (i3 == 0) {
                if (this.bottomCell != null && !TextUtils.isEmpty(this.noAllDocumentsErrorText)) {
                    this.bottomCell.setText(this.noAllDocumentsErrorText);
                }
                this.errorsValues.remove("files_all");
                return;
            }
            if (i3 == 4) {
                if (this.bottomCellTranslation != null && !TextUtils.isEmpty(this.noAllTranslationErrorText)) {
                    this.bottomCellTranslation.setText(this.noAllTranslationErrorText);
                }
                this.errorsValues.remove("translation_all");
            }
        }
    }

    public void didSelectFiles(ArrayList<String> arrayList, String str, boolean z, int i, long j, boolean z2) {
        ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            sendingMediaInfo.path = arrayList.get(i2);
            arrayList2.add(sendingMediaInfo);
        }
        processSelectedFiles(arrayList2);
    }

    public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z, int i) {
        processSelectedFiles(arrayList);
    }

    @Override
    public void dismissCurrentDialog() {
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert == null || this.visibleDialog != chatAttachAlert) {
            super.dismissCurrentDialog();
            return;
        }
        chatAttachAlert.getPhotoLayout().closeCamera(false);
        this.chatAttachAlert.dismissInternal();
        this.chatAttachAlert.getPhotoLayout().hideCamera(true);
    }

    @Override
    public boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.chatAttachAlert && super.dismissDialogOnPause(dialog);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.scrollView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        int i2 = 0;
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        View view = this.extraBackgroundView;
        int i3 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i3));
        View view2 = this.extraBackgroundView2;
        if (view2 != null) {
            arrayList.add(new ThemeDescription(view2, 1, null, null, null, null, i3));
        }
        for (int i4 = 0; i4 < this.dividers.size(); i4++) {
            arrayList.add(new ThemeDescription(this.dividers.get(i4), 1, null, null, null, null, Theme.key_divider));
        }
        Iterator<Map.Entry<SecureDocument, SecureDocumentCell>> it = this.documentsCells.entrySet().iterator();
        while (it.hasNext()) {
            SecureDocumentCell value = it.next().getValue();
            arrayList.add(new ThemeDescription(value, 268435456, new Class[]{SecureDocumentCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(value, 0, new Class[]{SecureDocumentCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(value, 0, new Class[]{SecureDocumentCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        }
        int i5 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.linearLayout2, 268435456, new Class[]{TextDetailSettingsCell.class}, null, null, null, i5));
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i6));
        int i7 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.linearLayout2, 268435456, new Class[]{TextSettingsCell.class}, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i6));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        int i8 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.linearLayout2, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.linearLayout2, 268435456, new Class[]{TextDetailSecureCell.class}, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.linearLayout2, 4, new Class[]{TextDetailSecureCell.class}, new String[]{"textView"}, null, null, -1, null, i6));
        arrayList.add(new ThemeDescription(this.linearLayout2, 4, new Class[]{TextDetailSecureCell.class}, null, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.linearLayout2, 4, new Class[]{TextDetailSecureCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.linearLayout2, 8, new Class[]{TextDetailSecureCell.class}, new String[]{"checkImageView"}, null, null, -1, null, Theme.key_featuredStickers_addedIcon));
        arrayList.add(new ThemeDescription(this.linearLayout2, 16, new Class[]{HeaderCell.class}, null, null, null, i5));
        int i9 = Theme.key_windowBackgroundWhiteBlueHeader;
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.linearLayout2, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        if (this.inputFields != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new ThemeDescription((View) editTextBoldCursorArr[i10].getParent(), 1, null, null, null, null, Theme.key_windowBackgroundWhite));
                arrayList.add(new ThemeDescription(this.inputFields[i10], 16777220, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
                arrayList.add(new ThemeDescription(this.inputFields[i10], 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
                arrayList.add(new ThemeDescription(this.inputFields[i10], 8390656, null, null, null, null, Theme.key_windowBackgroundWhiteBlueHeader));
                arrayList.add(new ThemeDescription(this.inputFields[i10], 32, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
                arrayList.add(new ThemeDescription(this.inputFields[i10], 65568, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
                arrayList.add(new ThemeDescription(this.inputFields[i10], 2080, null, null, null, null, Theme.key_text_RedRegular));
                i10++;
            }
        } else {
            arrayList.add(new ThemeDescription(null, 4, null, null, null, null, i6));
            arrayList.add(new ThemeDescription(null, 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
            arrayList.add(new ThemeDescription(null, 8390656, null, null, null, null, i9));
            arrayList.add(new ThemeDescription(null, 32, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
            arrayList.add(new ThemeDescription(null, 65568, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
            arrayList.add(new ThemeDescription(null, 2080, null, null, null, null, Theme.key_text_RedRegular));
        }
        if (this.inputExtraFields != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.inputExtraFields;
                if (i2 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new ThemeDescription((View) editTextBoldCursorArr2[i2].getParent(), 1, null, null, null, null, Theme.key_windowBackgroundWhite));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i2], 16777220, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i2], 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i2], 8390656, null, null, null, null, Theme.key_windowBackgroundWhiteBlueHeader));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i2], 32, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i2], 65568, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i2], 2080, null, null, null, null, Theme.key_text_RedRegular));
                i2++;
            }
        }
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.noPasswordImageView, 8, null, null, null, null, Theme.key_chat_messagePanelIcons));
        arrayList.add(new ThemeDescription(this.noPasswordTextView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.noPasswordSetTextView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlueText5));
        TextView textView = this.passwordForgotButton;
        int i11 = Theme.key_windowBackgroundWhiteBlueText4;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, i11));
        arrayList.add(new ThemeDescription(this.plusTextView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.acceptTextView, 4, null, null, null, null, Theme.key_passport_authorizeText));
        arrayList.add(new ThemeDescription(this.bottomLayout, 32, null, null, null, null, Theme.key_passport_authorizeBackground));
        arrayList.add(new ThemeDescription(this.bottomLayout, 65568, null, null, null, null, Theme.key_passport_authorizeBackgroundSelected));
        ContextProgressView contextProgressView = this.progressView;
        int i12 = Theme.key_contextProgressInner2;
        arrayList.add(new ThemeDescription(contextProgressView, 0, null, null, null, null, i12));
        ContextProgressView contextProgressView2 = this.progressView;
        int i13 = Theme.key_contextProgressOuter2;
        arrayList.add(new ThemeDescription(contextProgressView2, 0, null, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.emptyImageView, 8, null, null, null, null, Theme.key_sessions_devicesImage));
        TextView textView2 = this.emptyTextView1;
        int i14 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(textView2, 4, null, null, null, null, i14));
        arrayList.add(new ThemeDescription(this.emptyTextView2, 4, null, null, null, null, i14));
        arrayList.add(new ThemeDescription(this.emptyTextView3, 4, null, null, null, null, i11));
        return arrayList;
    }

    public void needHideProgress() {
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog == null) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.progressDialog = null;
    }

    public void needShowProgress() {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.progressDialog != null) {
            return;
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        this.progressDialog = alertDialog;
        alertDialog.canCacnel = false;
        alertDialog.show();
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 0 || i == 2) {
                createChatAttachView();
                ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
                if (chatAttachAlert != null) {
                    chatAttachAlert.onActivityResultFragment(i, intent, this.currentPicturePath);
                }
                this.currentPicturePath = null;
                return;
            }
            if (i == 1) {
                if (intent == null || intent.getData() == null) {
                    showAttachmentError();
                    return;
                }
                ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList = new ArrayList<>();
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.uri = intent.getData();
                arrayList.add(sendingMediaInfo);
                processSelectedFiles(arrayList);
            }
        }
    }

    @Override
    public boolean onBackPressed(boolean z) {
        int i = this.currentActivityType;
        int i2 = 0;
        if (i == 7) {
            if (z) {
                this.views[this.currentViewNum].onBackPressed(true);
                while (true) {
                    SlideView[] slideViewArr = this.views;
                    if (i2 >= slideViewArr.length) {
                        break;
                    }
                    SlideView slideView = slideViewArr[i2];
                    if (slideView != null) {
                        slideView.onDestroyActivity();
                    }
                    i2++;
                }
            }
        } else if (i == 0 || i == 5) {
            if (z) {
                callCallback(false);
            }
        } else if (i == 1 || i == 2) {
            return !checkDiscard(z);
        }
        return true;
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        if (this.currentActivityType != 3 || Build.VERSION.SDK_INT < 23 || dialog != this.permissionsDialog || this.permissionsItems.isEmpty()) {
            return;
        }
        getParentActivity().requestPermissions((String[]) this.permissionsItems.toArray(new String[0]), 6);
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        int i = 0;
        callCallback(false);
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.dismissInternal();
            this.chatAttachAlert.onDestroy();
        }
        if (this.currentActivityType == 7) {
            while (true) {
                SlideView[] slideViewArr = this.views;
                if (i >= slideViewArr.length) {
                    break;
                }
                SlideView slideView = slideViewArr[i];
                if (slideView != null) {
                    slideView.onDestroyActivity();
                }
                i++;
            }
            AlertDialog alertDialog = this.progressDialog;
            if (alertDialog != null) {
                try {
                    alertDialog.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.progressDialog = null;
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onPause();
        }
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ChatAttachAlert chatAttachAlert;
        TextSettingsCell textSettingsCell;
        int i2 = this.currentActivityType;
        if ((i2 != 1 && i2 != 2) || (chatAttachAlert = this.chatAttachAlert) == null) {
            if (i2 == 3 && i == 6) {
                startPhoneVerification(false, this.pendingPhone, this.pendingFinishRunnable, this.pendingErrorRunnable, this.pendingDelegate);
                return;
            }
            return;
        }
        if (i == 17) {
            chatAttachAlert.getPhotoLayout().checkCamera(false);
            return;
        }
        if (i == 21) {
            if (getParentActivity() == null || iArr == null || iArr.length == 0 || iArr[0] == 0) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.AppName));
            builder.setMessage(LocaleController.getString(R.string.PermissionNoAudioVideoWithHint));
            builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new PassportActivity$$ExternalSyntheticLambda1(this, 4));
            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
            builder.show();
            return;
        }
        if (i == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            processSelectedAttach(0);
            return;
        }
        if (i != 22 || iArr == null || iArr.length <= 0 || iArr[0] != 0 || (textSettingsCell = this.scanDocumentCell) == null) {
            return;
        }
        textSettingsCell.callOnClick();
    }

    @Override
    public void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onResume();
        }
        if (this.currentActivityType == 5 && (viewGroupArr = this.inputFieldContainers) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.inputFields[0].requestFocus();
            AndroidUtilities.showKeyboard(this.inputFields[0]);
            AndroidUtilities.runOnUIThread(new PassportActivity$$ExternalSyntheticLambda11(this, 2), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (this.presentAfterAnimation != null) {
            AndroidUtilities.runOnUIThread(new PassportActivity$$ExternalSyntheticLambda11(this, 5));
        }
        int i = this.currentActivityType;
        if (i == 5) {
            if (z) {
                if (this.inputFieldContainers[0].getVisibility() == 0) {
                    this.inputFields[0].requestFocus();
                    AndroidUtilities.showKeyboard(this.inputFields[0]);
                }
                if (this.usingSavedPassword == 2) {
                    onPasswordDone(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 7) {
            if (z) {
                this.views[this.currentViewNum].onShow();
                return;
            }
            return;
        }
        if (i == 4) {
            if (z) {
                this.inputFields[0].requestFocus();
                AndroidUtilities.showKeyboard(this.inputFields[0]);
                return;
            }
            return;
        }
        if (i == 6) {
            if (z) {
                this.inputFields[0].requestFocus();
                AndroidUtilities.showKeyboard(this.inputFields[0]);
                return;
            }
            return;
        }
        if (i == 2 || i == 1) {
            createChatAttachView();
        }
    }

    @Override
    public void restoreSelfArgs(Bundle bundle) {
        this.currentPicturePath = bundle.getString("path");
    }

    @Override
    public void saveSelfArgs(Bundle bundle) {
        String str = this.currentPicturePath;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public void setNeedActivityResult(boolean z) {
        this.needActivityResult = z;
    }

    public void setPage(int i, boolean z, Bundle bundle) {
        if (i == 3) {
            this.doneItem.setVisibility(8);
        }
        SlideView[] slideViewArr = this.views;
        final SlideView slideView = slideViewArr[this.currentViewNum];
        final SlideView slideView2 = slideViewArr[i];
        this.currentViewNum = i;
        slideView2.setParams(bundle, false);
        slideView2.onShow();
        if (!z) {
            slideView2.setTranslationX(0.0f);
            slideView2.setVisibility(0);
            if (slideView != slideView2) {
                slideView.setVisibility(8);
                return;
            }
            return;
        }
        slideView2.setTranslationX(AndroidUtilities.displaySize.x);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(slideView, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(slideView2, "translationX", 0.0f));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                slideView.setVisibility(8);
                slideView.setX(0.0f);
            }

            @Override
            public void onAnimationStart(Animator animator) {
                slideView2.setVisibility(0);
            }
        });
        animatorSet.start();
    }

    public void startDocumentSelectActivity() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public PassportActivity(int i, long j, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        String nameForType;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        HashMap<String, String> map;
        String strEncodeToString;
        this(i, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap<String, String>) null, (HashMap<String, String>) null);
        this.currentBotId = j;
        this.currentPayload = str3;
        this.currentNonce = str4;
        this.currentScope = str;
        this.currentPublicKey = str2;
        this.currentCallbackUrl = str5;
        if (i != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new Comparator<TLRPC.SecureValueError>() {
                public int getErrorValue(TLRPC.SecureValueError secureValueError) {
                    if (secureValueError instanceof TLRPC.TL_secureValueError) {
                        return 0;
                    }
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                        return 1;
                    }
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                        return 2;
                    }
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                        return 3;
                    }
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        return 4;
                    }
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        return 5;
                    }
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                        return 6;
                    }
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                        return 7;
                    }
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
                        return PassportActivity.this.getFieldCost(((TLRPC.TL_secureValueErrorData) secureValueError).field);
                    }
                    return 100;
                }

                @Override
                public int compare(TLRPC.SecureValueError secureValueError, TLRPC.SecureValueError secureValueError2) {
                    int errorValue = getErrorValue(secureValueError);
                    int errorValue2 = getErrorValue(secureValueError2);
                    if (errorValue < errorValue2) {
                        return -1;
                    }
                    return errorValue > errorValue2 ? 1 : 0;
                }
            });
            int size = authorizationform.errors.size();
            int i2 = 0;
            while (i2 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i2);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    nameForType = getNameForType(tL_secureValueErrorFrontSide.type);
                    String str13 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str6 = null;
                    str7 = str13;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    nameForType = getNameForType(tL_secureValueErrorReverseSide.type);
                    String str14 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str6 = null;
                    str7 = str14;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    nameForType = getNameForType(tL_secureValueErrorSelfie.type);
                    String str15 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str6 = null;
                    str7 = str15;
                    str8 = "selfie";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                    TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                    nameForType = getNameForType(tL_secureValueErrorTranslationFile.type);
                    String str16 = tL_secureValueErrorTranslationFile.text;
                    bArr = tL_secureValueErrorTranslationFile.file_hash;
                    str6 = null;
                    str7 = str16;
                    str8 = "translation";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        nameForType = getNameForType(tL_secureValueErrorTranslationFiles.type);
                        str9 = tL_secureValueErrorTranslationFiles.text;
                        str10 = "translation";
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                        TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                        nameForType = getNameForType(tL_secureValueErrorFile.type);
                        String str17 = tL_secureValueErrorFile.text;
                        bArr = tL_secureValueErrorFile.file_hash;
                        str6 = null;
                        str7 = str17;
                        str8 = "files";
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            nameForType = getNameForType(tL_secureValueErrorFiles.type);
                            str9 = tL_secureValueErrorFiles.text;
                            str10 = "files";
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            nameForType = getNameForType(tL_secureValueError.type);
                            String str18 = tL_secureValueError.text;
                            bArr = tL_secureValueError.hash;
                            str6 = null;
                            str7 = str18;
                            str8 = "error_all";
                        } else {
                            if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
                                TLRPC.TL_secureValueErrorData tL_secureValueErrorData = (TLRPC.TL_secureValueErrorData) secureValueError;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < authorizationform.values.size()) {
                                        TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i3).data;
                                        if (tL_secureData == null || !Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                            i3++;
                                            size = size;
                                        } else {
                                            nameForType = getNameForType(tL_secureValueErrorData.type);
                                            String str19 = tL_secureValueErrorData.text;
                                            String str20 = tL_secureValueErrorData.field;
                                            bArr = tL_secureValueErrorData.data_hash;
                                            str6 = str20;
                                            str7 = str19;
                                            str8 = "data";
                                        }
                                    }
                                }
                            }
                            size = size;
                        }
                        i2++;
                        size = size;
                    }
                    str11 = str10;
                    str12 = null;
                    map = this.errorsMap.get(nameForType);
                    if (map == null) {
                        map = new HashMap<>();
                        this.errorsMap.put(nameForType, map);
                        this.mainErrorsMap.put(nameForType, str9);
                    }
                    if (bArr != null) {
                        strEncodeToString = Base64.encodeToString(bArr, 2);
                    } else {
                        strEncodeToString = "";
                    }
                    switch (str11) {
                        case "data":
                            if (str12 != null) {
                                map.put(str12, str9);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "files":
                            if (bArr == null) {
                                map.put("files_all", str9);
                                break;
                            } else {
                                map.put("files" + strEncodeToString, str9);
                                break;
                            }
                            break;
                        case "selfie":
                            map.put("selfie" + strEncodeToString, str9);
                            break;
                        case "translation":
                            if (bArr == null) {
                                map.put("translation_all", str9);
                                break;
                            } else {
                                map.put("translation" + strEncodeToString, str9);
                                break;
                            }
                            break;
                        case "front":
                            map.put("front" + strEncodeToString, str9);
                            break;
                        case "reverse":
                            map.put("reverse" + strEncodeToString, str9);
                            break;
                        case "error_all":
                            map.put("error_all", str9);
                            break;
                    }
                    i2++;
                    size = size;
                }
                str11 = str8;
                str12 = str6;
                str9 = str7;
                map = this.errorsMap.get(nameForType);
                if (map == null) {
                    map = new HashMap<>();
                    this.errorsMap.put(nameForType, map);
                    this.mainErrorsMap.put(nameForType, str9);
                }
                if (bArr != null) {
                    strEncodeToString = Base64.encodeToString(bArr, 2);
                } else {
                    strEncodeToString = "";
                }
                switch (str11) {
                    case -1840647503:
                        if (str11.equals("translation")) {
                        }
                        break;
                    case -906020504:
                        if (str11.equals("selfie")) {
                        }
                        break;
                    case 3076010:
                        if (str11.equals("data")) {
                        }
                        break;
                    case 97434231:
                        if (str11.equals("files")) {
                        }
                        break;
                    case 97705513:
                        if (str11.equals("front")) {
                        }
                        break;
                    case 329856746:
                        if (str11.equals("error_all")) {
                        }
                        break;
                    case 1099846370:
                        if (str11.equals("reverse")) {
                        }
                        break;
                    default:
                        break;
                }
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PassportActivity.<init>(int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.tl.TL_account$authorizationForm, org.telegram.tgnet.tl.TL_account$Password):void");
            }
        }
