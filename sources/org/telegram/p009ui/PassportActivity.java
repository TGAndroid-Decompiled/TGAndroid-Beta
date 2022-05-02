package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
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
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.PhoneFormat.C0894PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.DispatchQueue;
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
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.CameraScanActivity;
import org.telegram.p009ui.Cells.CheckBoxCell;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.TextDetailSettingsCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.ChatAttachAlert;
import org.telegram.p009ui.Components.ContextProgressView;
import org.telegram.p009ui.Components.EditTextBoldCursor;
import org.telegram.p009ui.Components.EmptyTextProgressView;
import org.telegram.p009ui.Components.HintEditText;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RadialProgress;
import org.telegram.p009ui.Components.SlideView;
import org.telegram.p009ui.CountrySelectActivity;
import org.telegram.p009ui.PassportActivity;
import org.telegram.p009ui.PhotoViewer;
import org.telegram.tgnet.C1005x72c667f;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputSecureFile;
import org.telegram.tgnet.TLRPC$PasswordKdfAlgo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$SecureFile;
import org.telegram.tgnet.TLRPC$SecurePasswordKdfAlgo;
import org.telegram.tgnet.TLRPC$SecurePlainData;
import org.telegram.tgnet.TLRPC$SecureRequiredType;
import org.telegram.tgnet.TLRPC$SecureValueType;
import org.telegram.tgnet.TLRPC$TL_account_acceptAuthorization;
import org.telegram.tgnet.TLRPC$TL_account_authorizationForm;
import org.telegram.tgnet.TLRPC$TL_account_deleteSecureValue;
import org.telegram.tgnet.TLRPC$TL_account_getPassword;
import org.telegram.tgnet.TLRPC$TL_account_getPasswordSettings;
import org.telegram.tgnet.TLRPC$TL_account_password;
import org.telegram.tgnet.TLRPC$TL_account_passwordInputSettings;
import org.telegram.tgnet.TLRPC$TL_account_passwordSettings;
import org.telegram.tgnet.TLRPC$TL_account_saveSecureValue;
import org.telegram.tgnet.TLRPC$TL_account_sendVerifyEmailCode;
import org.telegram.tgnet.TLRPC$TL_account_sendVerifyPhoneCode;
import org.telegram.tgnet.TLRPC$TL_account_sentEmailCode;
import org.telegram.tgnet.TLRPC$TL_account_updatePasswordSettings;
import org.telegram.tgnet.TLRPC$TL_account_verifyEmail;
import org.telegram.tgnet.TLRPC$TL_account_verifyPhone;
import org.telegram.tgnet.TLRPC$TL_auth_cancelCode;
import org.telegram.tgnet.TLRPC$TL_auth_codeTypeCall;
import org.telegram.tgnet.TLRPC$TL_auth_codeTypeFlashCall;
import org.telegram.tgnet.TLRPC$TL_auth_codeTypeSms;
import org.telegram.tgnet.TLRPC$TL_auth_passwordRecovery;
import org.telegram.tgnet.TLRPC$TL_auth_requestPasswordRecovery;
import org.telegram.tgnet.TLRPC$TL_auth_resendCode;
import org.telegram.tgnet.TLRPC$TL_auth_sentCode;
import org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeCall;
import org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeFlashCall;
import org.telegram.tgnet.TLRPC$TL_auth_sentCodeTypeSms;
import org.telegram.tgnet.TLRPC$TL_codeSettings;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_help_getPassportConfig;
import org.telegram.tgnet.TLRPC$TL_help_passportConfig;
import org.telegram.tgnet.TLRPC$TL_inputFile;
import org.telegram.tgnet.TLRPC$TL_inputSecureFile;
import org.telegram.tgnet.TLRPC$TL_inputSecureFileUploaded;
import org.telegram.tgnet.TLRPC$TL_inputSecureValue;
import org.telegram.tgnet.TLRPC$TL_secureCredentialsEncrypted;
import org.telegram.tgnet.TLRPC$TL_secureData;
import org.telegram.tgnet.TLRPC$TL_secureFile;
import org.telegram.tgnet.TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
import org.telegram.tgnet.TLRPC$TL_securePasswordKdfAlgoSHA512;
import org.telegram.tgnet.TLRPC$TL_securePasswordKdfAlgoUnknown;
import org.telegram.tgnet.TLRPC$TL_securePlainEmail;
import org.telegram.tgnet.TLRPC$TL_securePlainPhone;
import org.telegram.tgnet.TLRPC$TL_secureRequiredType;
import org.telegram.tgnet.TLRPC$TL_secureRequiredTypeOneOf;
import org.telegram.tgnet.TLRPC$TL_secureSecretSettings;
import org.telegram.tgnet.TLRPC$TL_secureValue;
import org.telegram.tgnet.TLRPC$TL_secureValueHash;
import org.telegram.tgnet.TLRPC$TL_secureValueTypeAddress;
import org.telegram.tgnet.TLRPC$TL_secureValueTypeBankStatement;
import org.telegram.tgnet.TLRPC$TL_secureValueTypeDriverLicense;
import org.telegram.tgnet.TLRPC$TL_secureValueTypeEmail;
import org.telegram.tgnet.TLRPC$TL_secureValueTypeIdentityCard;
import org.telegram.tgnet.TLRPC$TL_secureValueTypeInternalPassport;
import org.telegram.tgnet.TLRPC$TL_secureValueTypePassport;
import org.telegram.tgnet.TLRPC$TL_secureValueTypePassportRegistration;
import org.telegram.tgnet.TLRPC$TL_secureValueTypePersonalDetails;
import org.telegram.tgnet.TLRPC$TL_secureValueTypePhone;
import org.telegram.tgnet.TLRPC$TL_secureValueTypeRentalAgreement;
import org.telegram.tgnet.TLRPC$TL_secureValueTypeTemporaryRegistration;
import org.telegram.tgnet.TLRPC$TL_secureValueTypeUtilityBill;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$auth_CodeType;
import org.telegram.tgnet.TLRPC$auth_SentCodeType;

public class PassportActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private TextView acceptTextView;
    private TextSettingsCell addDocumentCell;
    private ShadowSectionCell addDocumentSectionCell;
    private boolean allowNonLatinName;
    private ArrayList<TLRPC$TL_secureRequiredType> availableDocumentTypes;
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
    private TLRPC$TL_secureRequiredType currentDocumentsType;
    private TLRPC$TL_secureValue currentDocumentsTypeValue;
    private String currentEmail;
    private int[] currentExpireDate;
    private TLRPC$TL_account_authorizationForm currentForm;
    private String currentGender;
    private String currentNonce;
    private TLRPC$TL_account_password currentPassword;
    private String currentPayload;
    private TLRPC$TL_auth_sentCode currentPhoneVerification;
    private LinearLayout currentPhotoViewerLayout;
    private String currentPicturePath;
    private String currentPublicKey;
    private String currentResidence;
    private String currentScope;
    private TLRPC$TL_secureRequiredType currentType;
    private TLRPC$TL_secureValue currentTypeValue;
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
    private HashMap<TLRPC$TL_secureRequiredType, TLRPC$TL_secureRequiredType> documentsToTypesLink;
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
    private HashMap<TLRPC$TL_secureRequiredType, HashMap<String, String>> typesValues;
    private HashMap<TLRPC$TL_secureRequiredType, TextDetailSecureCell> typesViews;
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

    public interface ErrorRunnable {
        void onError(String str, String str2);
    }

    public interface PassportActivityDelegate {
        void deleteValue(TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2, ArrayList<TLRPC$TL_secureRequiredType> arrayList, boolean z, Runnable runnable, ErrorRunnable errorRunnable);

        SecureDocument saveFile(TLRPC$TL_secureFile tLRPC$TL_secureFile);

        void saveValue(TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, String str, String str2, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2, String str3, ArrayList<SecureDocument> arrayList, SecureDocument secureDocument, ArrayList<SecureDocument> arrayList2, SecureDocument secureDocument2, SecureDocument secureDocument3, Runnable runnable, ErrorRunnable errorRunnable);
    }

    public class LinkSpan extends ClickableSpan {
        public LinkSpan() {
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        }

        @Override
        public void onClick(View view) {
            Browser.openUrl(PassportActivity.this.getParentActivity(), PassportActivity.this.currentForm.privacy_policy_url);
        }
    }

    public class TextDetailSecureCell extends FrameLayout {
        private ImageView checkImageView;
        private boolean needDivider;
        private TextView textView;
        private TextView valueTextView;

        public TextDetailSecureCell(PassportActivity passportActivity, Context context) {
            super(context);
            int i = 21;
            int i2 = passportActivity.currentActivityType == 8 ? 21 : 51;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            int i3 = 5;
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView2 = this.textView;
            boolean z = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? i2 : 21, 10.0f, z ? 21 : i2, 0.0f));
            TextView textView3 = new TextView(context);
            this.valueTextView = textView3;
            textView3.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2"));
            this.valueTextView.setTextSize(1, 13.0f);
            this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.valueTextView.setLines(1);
            this.valueTextView.setMaxLines(1);
            this.valueTextView.setSingleLine(true);
            this.valueTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.valueTextView.setPadding(0, 0, 0, 0);
            TextView textView4 = this.valueTextView;
            boolean z2 = LocaleController.isRTL;
            addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? i2 : 21, 35.0f, !z2 ? i2 : i, 0.0f));
            ImageView imageView = new ImageView(context);
            this.checkImageView = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("featuredStickers_addedIcon"), PorterDuff.Mode.MULTIPLY));
            this.checkImageView.setImageResource(C0952R.C0953drawable.sticker_added);
            addView(this.checkImageView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : i3) | 48, 21.0f, 25.0f, 21.0f, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        public void setTextAndValue(String str, CharSequence charSequence, boolean z) {
            this.textView.setText(str);
            this.valueTextView.setText(charSequence);
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        public void setChecked(boolean z) {
            this.checkImageView.setVisibility(z ? 0 : 4);
        }

        public void setValue(CharSequence charSequence) {
            this.valueTextView.setText(charSequence);
        }

        public void setNeedDivider(boolean z) {
            this.needDivider = z;
            setWillNotDraw(!z);
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.m34dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.m34dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    public class SecureDocumentCell extends FrameLayout implements DownloadController.FileDownloadProgressListener {
        private int TAG;
        private int buttonState;
        private SecureDocument currentSecureDocument;
        private BackupImageView imageView;
        private RadialProgress radialProgress = new RadialProgress(this);
        private TextView textView;
        private TextView valueTextView;

        public SecureDocumentCell(Context context) {
            super(context);
            this.TAG = DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).generateObserverTag();
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            int i = 5;
            addView(backupImageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 8.0f, 21.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            View view = this.textView;
            boolean z = LocaleController.isRTL;
            int i2 = 21;
            addView(view, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 81, 10.0f, z ? 81 : 21, 0.0f));
            TextView textView2 = new TextView(context);
            this.valueTextView = textView2;
            textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2"));
            this.valueTextView.setTextSize(1, 13.0f);
            this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.valueTextView.setLines(1);
            this.valueTextView.setMaxLines(1);
            this.valueTextView.setSingleLine(true);
            this.valueTextView.setPadding(0, 0, 0, 0);
            View view2 = this.valueTextView;
            boolean z2 = LocaleController.isRTL;
            addView(view2, LayoutHelper.createFrame(-2, -2.0f, (!z2 ? 3 : i) | 48, z2 ? 21 : 81, 35.0f, z2 ? 81 : i2, 0.0f));
            setWillNotDraw(false);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(64.0f) + 1, 1073741824));
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int left = this.imageView.getLeft() + ((this.imageView.getMeasuredWidth() - AndroidUtilities.m34dp(24.0f)) / 2);
            int top = this.imageView.getTop() + ((this.imageView.getMeasuredHeight() - AndroidUtilities.m34dp(24.0f)) / 2);
            this.radialProgress.setProgressRect(left, top, AndroidUtilities.m34dp(24.0f) + left, AndroidUtilities.m34dp(24.0f) + top);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            boolean drawChild = super.drawChild(canvas, view, j);
            if (view == this.imageView) {
                this.radialProgress.draw(canvas);
            }
            return drawChild;
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
            boolean exists = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.currentSecureDocument).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setBackground(null, false, false);
                return;
            }
            SecureDocument secureDocument = this.currentSecureDocument;
            float f = 0.0f;
            if (secureDocument.path != null) {
                if (secureDocument.inputFile != null) {
                    DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).removeLoadingFileObserver(this);
                    this.radialProgress.setBackground(null, false, z);
                    this.buttonState = -1;
                    return;
                }
                DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).addLoadingFileObserver(this.currentSecureDocument.path, this);
                this.buttonState = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(this.currentSecureDocument.path);
                this.radialProgress.setBackground(Theme.chat_photoStatesDrawables[5][0], true, z);
                RadialProgress radialProgress = this.radialProgress;
                if (fileProgress != null) {
                    f = fileProgress.floatValue();
                }
                radialProgress.setProgress(f, false);
                invalidate();
            } else if (exists) {
                DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).removeLoadingFileObserver(this);
                this.buttonState = -1;
                this.radialProgress.setBackground(null, false, z);
                invalidate();
            } else {
                DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).addLoadingFileObserver(attachFileName, this);
                this.buttonState = 1;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(attachFileName);
                this.radialProgress.setBackground(Theme.chat_photoStatesDrawables[5][0], true, z);
                RadialProgress radialProgress2 = this.radialProgress;
                if (fileProgress2 != null) {
                    f = fileProgress2.floatValue();
                }
                radialProgress2.setProgress(f, z);
                invalidate();
            }
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.textView.invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.m34dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.m34dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(false);
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
            if (this.buttonState != 1) {
                updateButtonState(false);
            }
        }

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
            this.radialProgress.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
        }

        @Override
        public int getObserverTag() {
            return this.TAG;
        }
    }

    public PassportActivity(int r20, long r21, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, org.telegram.tgnet.TLRPC$TL_account_authorizationForm r28, org.telegram.tgnet.TLRPC$TL_account_password r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.<init>(int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_account_authorizationForm, org.telegram.tgnet.TLRPC$TL_account_password):void");
    }

    public PassportActivity(int i, TLRPC$TL_account_authorizationForm tLRPC$TL_account_authorizationForm, TLRPC$TL_account_password tLRPC$TL_account_password, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, TLRPC$TL_secureValue tLRPC$TL_secureValue, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2, TLRPC$TL_secureValue tLRPC$TL_secureValue2, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
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
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i2, boolean z) {
                if (i2 < 0 || i2 >= PassportActivity.this.currentPhotoViewerLayout.getChildCount()) {
                    return null;
                }
                SecureDocumentCell secureDocumentCell = (SecureDocumentCell) PassportActivity.this.currentPhotoViewerLayout.getChildAt(i2);
                int[] iArr = new int[2];
                secureDocumentCell.imageView.getLocationInWindow(iArr);
                PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                int i3 = 0;
                placeProviderObject.viewX = iArr[0];
                int i4 = iArr[1];
                if (Build.VERSION.SDK_INT < 21) {
                    i3 = AndroidUtilities.statusBarHeight;
                }
                placeProviderObject.viewY = i4 - i3;
                placeProviderObject.parentView = PassportActivity.this.currentPhotoViewerLayout;
                ImageReceiver imageReceiver = secureDocumentCell.imageView.getImageReceiver();
                placeProviderObject.imageReceiver = imageReceiver;
                placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                return placeProviderObject;
            }

            @Override
            public void deleteImageAtIndex(int i2) {
                SecureDocument secureDocument = PassportActivity.this.uploadingFileType == 1 ? PassportActivity.this.selfieDocument : PassportActivity.this.uploadingFileType == 4 ? (SecureDocument) PassportActivity.this.translationDocuments.get(i2) : PassportActivity.this.uploadingFileType == 2 ? PassportActivity.this.frontDocument : PassportActivity.this.uploadingFileType == 3 ? PassportActivity.this.reverseDocument : (SecureDocument) PassportActivity.this.documents.get(i2);
                SecureDocumentCell secureDocumentCell = (SecureDocumentCell) PassportActivity.this.documentsCells.remove(secureDocument);
                if (secureDocumentCell != null) {
                    String documentHash = PassportActivity.this.getDocumentHash(secureDocument);
                    String str = null;
                    if (PassportActivity.this.uploadingFileType == 1) {
                        PassportActivity.this.selfieDocument = null;
                        str = "selfie" + documentHash;
                    } else if (PassportActivity.this.uploadingFileType == 4) {
                        str = "translation" + documentHash;
                    } else if (PassportActivity.this.uploadingFileType == 2) {
                        PassportActivity.this.frontDocument = null;
                        str = "front" + documentHash;
                    } else if (PassportActivity.this.uploadingFileType == 3) {
                        PassportActivity.this.reverseDocument = null;
                        str = "reverse" + documentHash;
                    } else if (PassportActivity.this.uploadingFileType == 0) {
                        str = "files" + documentHash;
                    }
                    if (str != null) {
                        if (PassportActivity.this.documentsErrors != null) {
                            PassportActivity.this.documentsErrors.remove(str);
                        }
                        if (PassportActivity.this.errorsValues != null) {
                            PassportActivity.this.errorsValues.remove(str);
                        }
                    }
                    PassportActivity passportActivity = PassportActivity.this;
                    passportActivity.updateUploadText(passportActivity.uploadingFileType);
                    PassportActivity.this.currentPhotoViewerLayout.removeView(secureDocumentCell);
                }
            }

            @Override
            public String getDeleteMessageString() {
                if (PassportActivity.this.uploadingFileType == 1) {
                    return LocaleController.formatString("PassportDeleteSelfieAlert", C0952R.string.PassportDeleteSelfieAlert, new Object[0]);
                }
                return LocaleController.formatString("PassportDeleteScanAlert", C0952R.string.PassportDeleteScanAlert, new Object[0]);
            }
        };
        this.currentActivityType = i;
        this.currentForm = tLRPC$TL_account_authorizationForm;
        this.currentType = tLRPC$TL_secureRequiredType;
        if (tLRPC$TL_secureRequiredType != null) {
            this.allowNonLatinName = tLRPC$TL_secureRequiredType.native_names;
        }
        this.currentTypeValue = tLRPC$TL_secureValue;
        this.currentDocumentsType = tLRPC$TL_secureRequiredType2;
        this.currentDocumentsTypeValue = tLRPC$TL_secureValue2;
        this.currentPassword = tLRPC$TL_account_password;
        this.currentValues = hashMap;
        this.currentDocumentValues = hashMap2;
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
            if (!(UserConfig.getInstance(this.currentAccount).savedPasswordHash == null || UserConfig.getInstance(this.currentAccount).savedSaltedPassword == null)) {
                this.usingSavedPassword = 1;
                this.savedPasswordHash = UserConfig.getInstance(this.currentAccount).savedPasswordHash;
                this.savedSaltedPassword = UserConfig.getInstance(this.currentAccount).savedSaltedPassword;
            }
            TLRPC$TL_account_password tLRPC$TL_account_password2 = this.currentPassword;
            if (tLRPC$TL_account_password2 == null) {
                loadPasswordInfo();
            } else {
                TwoStepVerificationActivity.initPasswordNewAlgo(tLRPC$TL_account_password2);
                if (this.usingSavedPassword == 1) {
                    onPasswordDone(true);
                }
            }
            if (!SharedConfig.isPassportConfigLoaded()) {
                TLRPC$TL_help_getPassportConfig tLRPC$TL_help_getPassportConfig = new TLRPC$TL_help_getPassportConfig();
                tLRPC$TL_help_getPassportConfig.hash = SharedConfig.passportConfigHash;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_help_getPassportConfig, PassportActivity$$ExternalSyntheticLambda68.INSTANCE);
            }
        }
    }

    public static void lambda$new$1(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PassportActivity.lambda$new$0(TLObject.this);
            }
        });
    }

    public static void lambda$new$0(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_help_passportConfig) {
            TLRPC$TL_help_passportConfig tLRPC$TL_help_passportConfig = (TLRPC$TL_help_passportConfig) tLObject;
            SharedConfig.setPassportConfig(tLRPC$TL_help_passportConfig.countries_langs.data, tLRPC$TL_help_passportConfig.hash);
            return;
        }
        SharedConfig.getCountryLangs();
    }

    @Override
    public void onResume() {
        ViewGroup[] viewGroupArr;
        super.onResume();
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onResume();
        }
        if (this.currentActivityType == 5 && (viewGroupArr = this.inputFieldContainers) != null && viewGroupArr[0] != null && viewGroupArr[0].getVisibility() == 0) {
            this.inputFields[0].requestFocus();
            AndroidUtilities.showKeyboard(this.inputFields[0]);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.this.lambda$onResume$2();
                }
            }, 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void lambda$onResume$2() {
        ViewGroup[] viewGroupArr = this.inputFieldContainers;
        if (viewGroupArr != null && viewGroupArr[0] != null && viewGroupArr[0].getVisibility() == 0) {
            this.inputFields[0].requestFocus();
            AndroidUtilities.showKeyboard(this.inputFields[0]);
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
                if (slideViewArr[i] != null) {
                    slideViewArr[i].onDestroyActivity();
                }
                i++;
            }
            AlertDialog alertDialog = this.progressDialog;
            if (alertDialog != null) {
                try {
                    alertDialog.dismiss();
                } catch (Exception e) {
                    FileLog.m30e(e);
                }
                this.progressDialog = null;
            }
        }
    }

    @Override
    public View createView(Context context) {
        ChatAttachAlert chatAttachAlert;
        this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new C31833());
        if (this.currentActivityType == 7) {
            ScrollView scrollView = new ScrollView(context) {
                @Override
                protected boolean onRequestFocusInDescendants(int i, Rect rect) {
                    return false;
                }

                @Override
                public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                    if (PassportActivity.this.currentViewNum == 1 || PassportActivity.this.currentViewNum == 2 || PassportActivity.this.currentViewNum == 4) {
                        rect.bottom += AndroidUtilities.m34dp(40.0f);
                    }
                    return super.requestChildRectangleOnScreen(view, rect, z);
                }

                @Override
                protected void onMeasure(int i, int i2) {
                    PassportActivity.this.scrollHeight = View.MeasureSpec.getSize(i2) - AndroidUtilities.m34dp(30.0f);
                    super.onMeasure(i, i2);
                }
            };
            this.scrollView = scrollView;
            this.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor("actionBarDefault"));
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            this.fragmentView = frameLayout;
            FrameLayout frameLayout2 = frameLayout;
            frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
            ScrollView scrollView2 = new ScrollView(this, context) {
                @Override
                protected boolean onRequestFocusInDescendants(int i, Rect rect) {
                    return false;
                }

                @Override
                public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top += AndroidUtilities.m34dp(20.0f);
                    rect.bottom += AndroidUtilities.m34dp(50.0f);
                    return super.requestChildRectangleOnScreen(view, rect, z);
                }
            };
            this.scrollView = scrollView2;
            scrollView2.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor("actionBarDefault"));
            frameLayout2.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.currentActivityType == 0 ? 48.0f : 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout2 = linearLayout;
            linearLayout.setOrientation(1);
            this.scrollView.addView(this.linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        }
        int i = this.currentActivityType;
        if (!(i == 0 || i == 8)) {
            this.doneItem = this.actionBar.createMenu().addItemWithWidth(2, C0952R.C0953drawable.ic_done, AndroidUtilities.m34dp(56.0f), LocaleController.getString("Done", C0952R.string.Done));
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
                        this.chatAttachAlert.dismiss();
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

    public class C31833 extends C1006ActionBar.ActionBarMenuOnItemClick {
        C31833() {
        }

        private boolean onIdentityDone(final java.lang.Runnable r26, final org.telegram.p009ui.PassportActivity.ErrorRunnable r27) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.C31833.onIdentityDone(java.lang.Runnable, org.telegram.ui.PassportActivity$ErrorRunnable):boolean");
        }

        public void lambda$onIdentityDone$0(String str, String str2, String str3, Runnable runnable, ErrorRunnable errorRunnable, DialogInterface dialogInterface, int i) {
            PassportActivity.this.inputFields[0].setText(str);
            PassportActivity.this.inputFields[1].setText(str2);
            PassportActivity.this.inputFields[2].setText(str3);
            PassportActivity.this.showEditDoneProgress(true, true);
            onIdentityDone(runnable, errorRunnable);
        }

        public void lambda$onIdentityDone$1(int i, DialogInterface dialogInterface, int i2) {
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

        @Override
        public void onItemClick(int r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.C31833.onItemClick(int):void");
        }

        public void lambda$onItemClick$4() {
            PassportActivity.this.finishFragment();
        }

        public void lambda$onItemClick$6(final Runnable runnable, final ErrorRunnable errorRunnable, final TLRPC$TL_account_verifyEmail tLRPC$TL_account_verifyEmail, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.C31833.this.lambda$onItemClick$5(tLRPC$TL_error, runnable, errorRunnable, tLRPC$TL_account_verifyEmail);
                }
            });
        }

        public void lambda$onItemClick$5(TLRPC$TL_error tLRPC$TL_error, Runnable runnable, ErrorRunnable errorRunnable, TLRPC$TL_account_verifyEmail tLRPC$TL_account_verifyEmail) {
            if (tLRPC$TL_error == null) {
                PassportActivity.this.delegate.saveValue(PassportActivity.this.currentType, (String) PassportActivity.this.currentValues.get("email"), null, null, null, null, null, null, null, null, runnable, errorRunnable);
                return;
            }
            AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tLRPC$TL_error, PassportActivity.this, tLRPC$TL_account_verifyEmail, new Object[0]);
            errorRunnable.onError(null, null);
        }
    }

    @Override
    public boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.chatAttachAlert && super.dismissDialogOnPause(dialog);
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

    public String getTranslitString(String str) {
        return LocaleController.getInstance().getTranslitString(str, true);
    }

    public int getFieldCost(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2006252145:
                if (str.equals("residence_country_code")) {
                    c = 0;
                    break;
                }
                break;
            case -1537298398:
                if (str.equals("last_name_native")) {
                    c = 1;
                    break;
                }
                break;
            case -1249512767:
                if (str.equals("gender")) {
                    c = 2;
                    break;
                }
                break;
            case -796150911:
                if (str.equals("street_line1")) {
                    c = 3;
                    break;
                }
                break;
            case -796150910:
                if (str.equals("street_line2")) {
                    c = 4;
                    break;
                }
                break;
            case -160985414:
                if (str.equals("first_name")) {
                    c = 5;
                    break;
                }
                break;
            case 3053931:
                if (str.equals("city")) {
                    c = 6;
                    break;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    c = 7;
                    break;
                }
                break;
            case 421072629:
                if (str.equals("middle_name")) {
                    c = '\b';
                    break;
                }
                break;
            case 451516732:
                if (str.equals("first_name_native")) {
                    c = '\t';
                    break;
                }
                break;
            case 475919162:
                if (str.equals("expiry_date")) {
                    c = '\n';
                    break;
                }
                break;
            case 506677093:
                if (str.equals("document_no")) {
                    c = 11;
                    break;
                }
                break;
            case 1168724782:
                if (str.equals("birth_date")) {
                    c = '\f';
                    break;
                }
                break;
            case 1181577377:
                if (str.equals("middle_name_native")) {
                    c = '\r';
                    break;
                }
                break;
            case 1481071862:
                if (str.equals("country_code")) {
                    c = 14;
                    break;
                }
                break;
            case 2002465324:
                if (str.equals("post_code")) {
                    c = 15;
                    break;
                }
                break;
            case 2013122196:
                if (str.equals("last_name")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 26;
            case 1:
            case 16:
                return 22;
            case 2:
                return 24;
            case 3:
                return 29;
            case 4:
                return 30;
            case 5:
            case '\t':
                return 20;
            case 6:
                return 32;
            case 7:
                return 33;
            case '\b':
            case '\r':
                return 21;
            case '\n':
                return 28;
            case 11:
                return 27;
            case '\f':
                return 23;
            case 14:
                return 25;
            case 15:
                return 31;
            default:
                return 100;
        }
    }

    private void createPhoneVerificationInterface(Context context) {
        this.actionBar.setTitle(LocaleController.getString("PassportPhone", C0952R.string.PassportPhone));
        FrameLayout frameLayout = new FrameLayout(context);
        this.scrollView.addView(frameLayout, LayoutHelper.createScroll(-1, -2, 51));
        for (int i = 0; i < 3; i++) {
            this.views[i] = new PhoneConfirmationView(context, i + 2);
            this.views[i].setVisibility(8);
            SlideView slideView = this.views[i];
            float f = 18.0f;
            float f2 = AndroidUtilities.isTablet() ? 26.0f : 18.0f;
            if (AndroidUtilities.isTablet()) {
                f = 26.0f;
            }
            frameLayout.addView(slideView, LayoutHelper.createFrame(-1, -1.0f, 51, f2, 30.0f, f, 0.0f));
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.currentValues.get("phone"));
        fillNextCodeParams(bundle, this.currentPhoneVerification, false);
    }

    private void loadPasswordInfo() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PassportActivity.this.lambda$loadPasswordInfo$4(tLObject, tLRPC$TL_error);
            }
        }), this.classGuid);
    }

    public void lambda$loadPasswordInfo$4(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PassportActivity.this.lambda$loadPasswordInfo$3(tLObject);
            }
        });
    }

    public void lambda$loadPasswordInfo$3(TLObject tLObject) {
        if (tLObject != null) {
            TLRPC$TL_account_password tLRPC$TL_account_password = (TLRPC$TL_account_password) tLObject;
            this.currentPassword = tLRPC$TL_account_password;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(tLRPC$TL_account_password, false)) {
                AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString("UpdateAppAlert", C0952R.string.UpdateAppAlert), true);
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

    private void createEmailVerificationInterface(Context context) {
        this.actionBar.setTitle(LocaleController.getString("PassportEmail", C0952R.string.PassportEmail));
        this.inputFields = new EditTextBoldCursor[1];
        for (int i = 0; i < 1; i++) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
            frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            this.inputFields[i] = new EditTextBoldCursor(context);
            this.inputFields[i].setTag(Integer.valueOf(i));
            this.inputFields[i].setTextSize(1, 16.0f);
            this.inputFields[i].setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
            this.inputFields[i].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i].setBackgroundDrawable(null);
            this.inputFields[i].setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i].setCursorSize(AndroidUtilities.m34dp(20.0f));
            this.inputFields[i].setCursorWidth(1.5f);
            int i2 = 3;
            this.inputFields[i].setInputType(3);
            this.inputFields[i].setImeOptions(268435462);
            this.inputFields[i].setHint(LocaleController.getString("PassportEmailCode", C0952R.string.PassportEmailCode));
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            editTextBoldCursorArr[i].setSelection(editTextBoldCursorArr[i].length());
            this.inputFields[i].setPadding(0, 0, 0, AndroidUtilities.m34dp(6.0f));
            EditTextBoldCursor editTextBoldCursor = this.inputFields[i];
            if (LocaleController.isRTL) {
                i2 = 5;
            }
            editTextBoldCursor.setGravity(i2);
            frameLayout.addView(this.inputFields[i], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            this.inputFields[i].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                    boolean lambda$createEmailVerificationInterface$5;
                    lambda$createEmailVerificationInterface$5 = PassportActivity.this.lambda$createEmailVerificationInterface$5(textView, i3, keyEvent);
                    return lambda$createEmailVerificationInterface$5;
                }
            });
            this.inputFields[i].addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (!PassportActivity.this.ignoreOnTextChange && PassportActivity.this.emailCodeLength != 0 && PassportActivity.this.inputFields[0].length() == PassportActivity.this.emailCodeLength) {
                        PassportActivity.this.doneItem.callOnClick();
                    }
                }
            });
        }
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
        this.bottomCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
        this.bottomCell.setText(LocaleController.formatString("PassportEmailVerifyInfo", C0952R.string.PassportEmailVerifyInfo, this.currentValues.get("email")));
        this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
    }

    public boolean lambda$createEmailVerificationInterface$5(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 5) {
            return false;
        }
        this.doneItem.callOnClick();
        return true;
    }

    private void createPasswordInterface(Context context) {
        TLRPC$User tLRPC$User;
        if (this.currentForm != null) {
            int i = 0;
            while (true) {
                if (i >= this.currentForm.users.size()) {
                    tLRPC$User = null;
                    break;
                }
                tLRPC$User = this.currentForm.users.get(i);
                if (tLRPC$User.f985id == this.currentBotId) {
                    break;
                }
                i++;
            }
        } else {
            tLRPC$User = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        this.actionBar.setTitle(LocaleController.getString("TelegramPassport", C0952R.string.TelegramPassport));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        ((FrameLayout) this.fragmentView).addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.passwordAvatarContainer = frameLayout;
        this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 100));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.m34dp(32.0f));
        this.passwordAvatarContainer.addView(backupImageView, LayoutHelper.createFrame(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        backupImageView.setForUserOrChat(tLRPC$User, new AvatarDrawable(tLRPC$User));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
        this.passwordRequestTextView = textInfoPrivacyCell;
        textInfoPrivacyCell.getTextView().setGravity(1);
        if (this.currentBotId == 0) {
            this.passwordRequestTextView.setText(LocaleController.getString("PassportSelfRequest", C0952R.string.PassportSelfRequest));
        } else {
            this.passwordRequestTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportRequest", C0952R.string.PassportRequest, UserObject.getFirstName(tLRPC$User))));
        }
        ((FrameLayout.LayoutParams) this.passwordRequestTextView.getTextView().getLayoutParams()).gravity = 1;
        int i2 = 5;
        this.linearLayout2.addView(this.passwordRequestTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.noPasswordImageView = imageView;
        imageView.setImageResource(C0952R.C0953drawable.no_password);
        this.noPasswordImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_messagePanelIcons"), PorterDuff.Mode.MULTIPLY));
        this.linearLayout2.addView(this.noPasswordImageView, LayoutHelper.createLinear(-2, -2, 49, 0, 13, 0, 0));
        TextView textView = new TextView(context);
        this.noPasswordTextView = textView;
        textView.setTextSize(1, 14.0f);
        this.noPasswordTextView.setGravity(1);
        this.noPasswordTextView.setPadding(AndroidUtilities.m34dp(21.0f), AndroidUtilities.m34dp(10.0f), AndroidUtilities.m34dp(21.0f), AndroidUtilities.m34dp(17.0f));
        this.noPasswordTextView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText4"));
        this.noPasswordTextView.setText(LocaleController.getString("TelegramPassportCreatePasswordInfo", C0952R.string.TelegramPassportCreatePasswordInfo));
        this.linearLayout2.addView(this.noPasswordTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.noPasswordSetTextView = textView2;
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText5"));
        this.noPasswordSetTextView.setGravity(17);
        this.noPasswordSetTextView.setTextSize(1, 16.0f);
        this.noPasswordSetTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.noPasswordSetTextView.setText(LocaleController.getString("TelegramPassportCreatePassword", C0952R.string.TelegramPassportCreatePassword));
        this.linearLayout2.addView(this.noPasswordSetTextView, LayoutHelper.createFrame(-1, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 9.0f, 21.0f, 0.0f));
        this.noPasswordSetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PassportActivity.this.lambda$createPasswordInterface$6(view);
            }
        });
        this.inputFields = new EditTextBoldCursor[1];
        this.inputFieldContainers = new ViewGroup[1];
        for (int i3 = 0; i3 < 1; i3++) {
            this.inputFieldContainers[i3] = new FrameLayout(context);
            this.linearLayout2.addView(this.inputFieldContainers[i3], LayoutHelper.createLinear(-1, 50));
            this.inputFieldContainers[i3].setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            this.inputFields[i3] = new EditTextBoldCursor(context);
            this.inputFields[i3].setTag(Integer.valueOf(i3));
            this.inputFields[i3].setTextSize(1, 16.0f);
            this.inputFields[i3].setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
            this.inputFields[i3].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i3].setBackgroundDrawable(null);
            this.inputFields[i3].setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i3].setCursorSize(AndroidUtilities.m34dp(20.0f));
            this.inputFields[i3].setCursorWidth(1.5f);
            this.inputFields[i3].setInputType(129);
            this.inputFields[i3].setMaxLines(1);
            this.inputFields[i3].setLines(1);
            this.inputFields[i3].setSingleLine(true);
            this.inputFields[i3].setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.inputFields[i3].setTypeface(Typeface.DEFAULT);
            this.inputFields[i3].setImeOptions(268435462);
            this.inputFields[i3].setPadding(0, 0, 0, AndroidUtilities.m34dp(6.0f));
            this.inputFields[i3].setGravity(LocaleController.isRTL ? 5 : 3);
            this.inputFieldContainers[i3].addView(this.inputFields[i3], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            this.inputFields[i3].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i4, KeyEvent keyEvent) {
                    boolean lambda$createPasswordInterface$7;
                    lambda$createPasswordInterface$7 = PassportActivity.this.lambda$createPasswordInterface$7(textView3, i4, keyEvent);
                    return lambda$createPasswordInterface$7;
                }
            });
            this.inputFields[i3].setCustomSelectionActionModeCallback(new ActionMode.Callback(this) {
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
        }
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
        this.passwordInfoRequestTextView = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
        this.passwordInfoRequestTextView.setText(LocaleController.formatString("PassportRequestPasswordInfo", C0952R.string.PassportRequestPasswordInfo, new Object[0]));
        this.linearLayout2.addView(this.passwordInfoRequestTextView, LayoutHelper.createLinear(-1, -2));
        TextView textView3 = new TextView(context);
        this.passwordForgotButton = textView3;
        textView3.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText4"));
        this.passwordForgotButton.setTextSize(1, 14.0f);
        this.passwordForgotButton.setText(LocaleController.getString("ForgotPassword", C0952R.string.ForgotPassword));
        this.passwordForgotButton.setPadding(0, 0, 0, 0);
        LinearLayout linearLayout = this.linearLayout2;
        TextView textView4 = this.passwordForgotButton;
        if (!LocaleController.isRTL) {
            i2 = 3;
        }
        linearLayout.addView(textView4, LayoutHelper.createLinear(-2, 30, i2 | 48, 21, 0, 21, 0));
        this.passwordForgotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PassportActivity.this.lambda$createPasswordInterface$12(view);
            }
        });
        updatePasswordInterface();
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

    public void lambda$createPasswordInterface$12(View view) {
        if (this.currentPassword.has_recovery) {
            needShowProgress();
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_auth_requestPasswordRecovery(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    PassportActivity.this.lambda$createPasswordInterface$10(tLObject, tLRPC$TL_error);
                }
            }, 10), this.classGuid);
        } else if (getParentActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
            builder.setNegativeButton(LocaleController.getString("RestorePasswordResetAccount", C0952R.string.RestorePasswordResetAccount), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PassportActivity.this.lambda$createPasswordInterface$11(dialogInterface, i);
                }
            });
            builder.setTitle(LocaleController.getString("RestorePasswordNoEmailTitle", C0952R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString("RestorePasswordNoEmailText", C0952R.string.RestorePasswordNoEmailText));
            showDialog(builder.create());
        }
    }

    public void lambda$createPasswordInterface$10(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PassportActivity.this.lambda$createPasswordInterface$9(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$createPasswordInterface$9(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        String str;
        needHideProgress();
        if (tLRPC$TL_error == null) {
            final TLRPC$TL_auth_passwordRecovery tLRPC$TL_auth_passwordRecovery = (TLRPC$TL_auth_passwordRecovery) tLObject;
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setMessage(LocaleController.formatString("RestoreEmailSent", C0952R.string.RestoreEmailSent, tLRPC$TL_auth_passwordRecovery.email_pattern));
            builder.setTitle(LocaleController.getString("RestoreEmailSentTitle", C0952R.string.RestoreEmailSentTitle));
            builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PassportActivity.this.lambda$createPasswordInterface$8(tLRPC$TL_auth_passwordRecovery, dialogInterface, i);
                }
            });
            Dialog showDialog = showDialog(builder.create());
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt(tLRPC$TL_error.text).intValue();
            if (intValue < 60) {
                str = LocaleController.formatPluralString("Seconds", intValue);
            } else {
                str = LocaleController.formatPluralString("Minutes", intValue / 60);
            }
            showAlertWithText(LocaleController.getString("AppName", C0952R.string.AppName), LocaleController.formatString("FloodWaitTime", C0952R.string.FloodWaitTime, str));
        } else {
            showAlertWithText(LocaleController.getString("AppName", C0952R.string.AppName), tLRPC$TL_error.text);
        }
    }

    public void lambda$createPasswordInterface$8(TLRPC$TL_auth_passwordRecovery tLRPC$TL_auth_passwordRecovery, DialogInterface dialogInterface, int i) {
        TLRPC$TL_account_password tLRPC$TL_account_password = this.currentPassword;
        tLRPC$TL_account_password.email_unconfirmed_pattern = tLRPC$TL_auth_passwordRecovery.email_pattern;
        presentFragment(new TwoStepVerificationSetupActivity(this.currentAccount, 4, tLRPC$TL_account_password));
    }

    public void lambda$createPasswordInterface$11(DialogInterface dialogInterface, int i) {
        Activity parentActivity = getParentActivity();
        Browser.openUrl(parentActivity, "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.currentAccount).getClientPhone());
    }

    public void onPasswordDone(final boolean z) {
        final String str;
        if (z) {
            str = null;
        } else {
            str = this.inputFields[0].getText().toString();
            if (TextUtils.isEmpty(str)) {
                onPasscodeError(false);
                return;
            }
            showEditDoneProgress(true, true);
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                PassportActivity.this.lambda$onPasswordDone$13(z, str);
            }
        });
    }

    public void lambda$onPasswordDone$13(boolean r11, java.lang.String r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.lambda$onPasswordDone$13(boolean, java.lang.String):void");
    }

    public class C31908 implements RequestDelegate {
        final TLRPC$TL_account_getPasswordSettings val$req;
        final boolean val$saved;
        final String val$textPassword;
        final byte[] val$x_bytes;

        C31908(boolean z, byte[] bArr, TLRPC$TL_account_getPasswordSettings tLRPC$TL_account_getPasswordSettings, String str) {
            this.val$saved = z;
            this.val$x_bytes = bArr;
            this.val$req = tLRPC$TL_account_getPasswordSettings;
            this.val$textPassword = str;
        }

        private void openRequestInterface() {
            if (PassportActivity.this.inputFields != null) {
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
                if (((BaseFragment) PassportActivity.this).parentLayout == null || !((BaseFragment) PassportActivity.this).parentLayout.checkTransitionAnimation()) {
                    PassportActivity.this.presentFragment(passportActivity, true);
                } else {
                    PassportActivity.this.presentAfterAnimation = passportActivity;
                }
            }
        }

        private void resetSecret() {
            TLRPC$TL_account_updatePasswordSettings tLRPC$TL_account_updatePasswordSettings = new TLRPC$TL_account_updatePasswordSettings();
            if (PassportActivity.this.currentPassword.current_algo instanceof C1005x72c667f) {
                tLRPC$TL_account_updatePasswordSettings.password = SRPHelper.startCheck(this.val$x_bytes, PassportActivity.this.currentPassword.srp_id, PassportActivity.this.currentPassword.srp_B, (C1005x72c667f) PassportActivity.this.currentPassword.current_algo);
            }
            TLRPC$TL_account_passwordInputSettings tLRPC$TL_account_passwordInputSettings = new TLRPC$TL_account_passwordInputSettings();
            tLRPC$TL_account_updatePasswordSettings.new_settings = tLRPC$TL_account_passwordInputSettings;
            tLRPC$TL_account_passwordInputSettings.new_secure_settings = new TLRPC$TL_secureSecretSettings();
            TLRPC$TL_secureSecretSettings tLRPC$TL_secureSecretSettings = tLRPC$TL_account_updatePasswordSettings.new_settings.new_secure_settings;
            tLRPC$TL_secureSecretSettings.secure_secret = new byte[0];
            tLRPC$TL_secureSecretSettings.secure_algo = new TLRPC$TL_securePasswordKdfAlgoUnknown();
            TLRPC$TL_account_passwordInputSettings tLRPC$TL_account_passwordInputSettings2 = tLRPC$TL_account_updatePasswordSettings.new_settings;
            tLRPC$TL_account_passwordInputSettings2.new_secure_settings.secure_secret_id = 0L;
            tLRPC$TL_account_passwordInputSettings2.flags |= 4;
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(this.val$req, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    PassportActivity.C31908.this.lambda$resetSecret$3(tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$resetSecret$3(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.C31908.this.lambda$resetSecret$2(tLRPC$TL_error);
                }
            });
        }

        public void lambda$resetSecret$2(TLRPC$TL_error tLRPC$TL_error) {
            if (tLRPC$TL_error == null || !"SRP_ID_INVALID".equals(tLRPC$TL_error.text)) {
                generateNewSecret();
                return;
            }
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error2) {
                    PassportActivity.C31908.this.lambda$resetSecret$1(tLObject, tLRPC$TL_error2);
                }
            }, 8);
        }

        public void lambda$resetSecret$1(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.C31908.this.lambda$resetSecret$0(tLRPC$TL_error, tLObject);
                }
            });
        }

        public void lambda$resetSecret$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
            if (tLRPC$TL_error == null) {
                PassportActivity.this.currentPassword = (TLRPC$TL_account_password) tLObject;
                TwoStepVerificationActivity.initPasswordNewAlgo(PassportActivity.this.currentPassword);
                resetSecret();
            }
        }

        private void generateNewSecret() {
            DispatchQueue dispatchQueue = Utilities.globalQueue;
            final byte[] bArr = this.val$x_bytes;
            final String str = this.val$textPassword;
            dispatchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.C31908.this.lambda$generateNewSecret$8(bArr, str);
                }
            });
        }

        public void lambda$generateNewSecret$8(byte[] bArr, String str) {
            Utilities.random.setSeed(PassportActivity.this.currentPassword.secure_random);
            TLRPC$TL_account_updatePasswordSettings tLRPC$TL_account_updatePasswordSettings = new TLRPC$TL_account_updatePasswordSettings();
            if (PassportActivity.this.currentPassword.current_algo instanceof C1005x72c667f) {
                tLRPC$TL_account_updatePasswordSettings.password = SRPHelper.startCheck(bArr, PassportActivity.this.currentPassword.srp_id, PassportActivity.this.currentPassword.srp_B, (C1005x72c667f) PassportActivity.this.currentPassword.current_algo);
            }
            tLRPC$TL_account_updatePasswordSettings.new_settings = new TLRPC$TL_account_passwordInputSettings();
            PassportActivity passportActivity = PassportActivity.this;
            passportActivity.secureSecret = passportActivity.getRandomSecret();
            PassportActivity passportActivity2 = PassportActivity.this;
            passportActivity2.secureSecretId = Utilities.bytesToLong(Utilities.computeSHA256(passportActivity2.secureSecret));
            if (PassportActivity.this.currentPassword.new_secure_algo instanceof TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) PassportActivity.this.currentPassword.new_secure_algo;
                PassportActivity.this.saltedPassword = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr2 = new byte[32];
                System.arraycopy(PassportActivity.this.saltedPassword, 0, bArr2, 0, 32);
                byte[] bArr3 = new byte[16];
                System.arraycopy(PassportActivity.this.saltedPassword, 32, bArr3, 0, 16);
                Utilities.aesCbcEncryptionByteArraySafe(PassportActivity.this.secureSecret, bArr2, bArr3, 0, PassportActivity.this.secureSecret.length, 0, 1);
                tLRPC$TL_account_updatePasswordSettings.new_settings.new_secure_settings = new TLRPC$TL_secureSecretSettings();
                TLRPC$TL_secureSecretSettings tLRPC$TL_secureSecretSettings = tLRPC$TL_account_updatePasswordSettings.new_settings.new_secure_settings;
                tLRPC$TL_secureSecretSettings.secure_algo = tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tLRPC$TL_secureSecretSettings.secure_secret = PassportActivity.this.secureSecret;
                tLRPC$TL_account_updatePasswordSettings.new_settings.new_secure_settings.secure_secret_id = PassportActivity.this.secureSecretId;
                tLRPC$TL_account_updatePasswordSettings.new_settings.flags |= 4;
            }
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tLRPC$TL_account_updatePasswordSettings, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    PassportActivity.C31908.this.lambda$generateNewSecret$7(tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$generateNewSecret$7(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.C31908.this.lambda$generateNewSecret$6(tLRPC$TL_error);
                }
            });
        }

        public void lambda$generateNewSecret$6(TLRPC$TL_error tLRPC$TL_error) {
            if (tLRPC$TL_error == null || !"SRP_ID_INVALID".equals(tLRPC$TL_error.text)) {
                if (PassportActivity.this.currentForm == null) {
                    PassportActivity.this.currentForm = new TLRPC$TL_account_authorizationForm();
                }
                openRequestInterface();
                return;
            }
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error2) {
                    PassportActivity.C31908.this.lambda$generateNewSecret$5(tLObject, tLRPC$TL_error2);
                }
            }, 8);
        }

        public void lambda$generateNewSecret$5(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.C31908.this.lambda$generateNewSecret$4(tLRPC$TL_error, tLObject);
                }
            });
        }

        public void lambda$generateNewSecret$4(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
            if (tLRPC$TL_error == null) {
                PassportActivity.this.currentPassword = (TLRPC$TL_account_password) tLObject;
                TwoStepVerificationActivity.initPasswordNewAlgo(PassportActivity.this.currentPassword);
                generateNewSecret();
            }
        }

        @Override
        public void run(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            if (tLRPC$TL_error != null && "SRP_ID_INVALID".equals(tLRPC$TL_error.text)) {
                TLRPC$TL_account_getPassword tLRPC$TL_account_getPassword = new TLRPC$TL_account_getPassword();
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount);
                final boolean z = this.val$saved;
                connectionsManager.sendRequest(tLRPC$TL_account_getPassword, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                        PassportActivity.C31908.this.lambda$run$10(z, tLObject2, tLRPC$TL_error2);
                    }
                }, 8);
            } else if (tLRPC$TL_error == null) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                final String str = this.val$textPassword;
                final boolean z2 = this.val$saved;
                dispatchQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.C31908.this.lambda$run$15(tLObject, str, z2);
                    }
                });
            } else {
                final boolean z3 = this.val$saved;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.C31908.this.lambda$run$16(z3, tLRPC$TL_error);
                    }
                });
            }
        }

        public void lambda$run$10(final boolean z, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.C31908.this.lambda$run$9(tLRPC$TL_error, tLObject, z);
                }
            });
        }

        public void lambda$run$9(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, boolean z) {
            if (tLRPC$TL_error == null) {
                PassportActivity.this.currentPassword = (TLRPC$TL_account_password) tLObject;
                TwoStepVerificationActivity.initPasswordNewAlgo(PassportActivity.this.currentPassword);
                PassportActivity.this.onPasswordDone(z);
            }
        }

        public void lambda$run$15(TLObject tLObject, String str, final boolean z) {
            final byte[] bArr;
            final TLRPC$TL_account_passwordSettings tLRPC$TL_account_passwordSettings = (TLRPC$TL_account_passwordSettings) tLObject;
            TLRPC$TL_secureSecretSettings tLRPC$TL_secureSecretSettings = tLRPC$TL_account_passwordSettings.secure_settings;
            if (tLRPC$TL_secureSecretSettings != null) {
                PassportActivity.this.secureSecret = tLRPC$TL_secureSecretSettings.secure_secret;
                PassportActivity.this.secureSecretId = tLRPC$TL_account_passwordSettings.secure_settings.secure_secret_id;
                TLRPC$SecurePasswordKdfAlgo tLRPC$SecurePasswordKdfAlgo = tLRPC$TL_account_passwordSettings.secure_settings.secure_algo;
                if (tLRPC$SecurePasswordKdfAlgo instanceof TLRPC$TL_securePasswordKdfAlgoSHA512) {
                    bArr = ((TLRPC$TL_securePasswordKdfAlgoSHA512) tLRPC$SecurePasswordKdfAlgo).salt;
                    PassportActivity.this.saltedPassword = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str), bArr);
                } else if (tLRPC$SecurePasswordKdfAlgo instanceof TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) tLRPC$SecurePasswordKdfAlgo;
                    byte[] bArr2 = tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                    PassportActivity.this.saltedPassword = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    bArr = bArr2;
                } else if (tLRPC$SecurePasswordKdfAlgo instanceof TLRPC$TL_securePasswordKdfAlgoUnknown) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.C31908.this.lambda$run$11();
                        }
                    });
                    return;
                } else {
                    bArr = new byte[0];
                }
            } else {
                if (PassportActivity.this.currentPassword.new_secure_algo instanceof TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) PassportActivity.this.currentPassword.new_secure_algo;
                    byte[] bArr3 = tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                    PassportActivity.this.saltedPassword = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                    bArr = bArr3;
                } else {
                    bArr = new byte[0];
                }
                PassportActivity.this.secureSecret = null;
                PassportActivity.this.secureSecretId = 0L;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.C31908.this.lambda$run$14(tLRPC$TL_account_passwordSettings, z, bArr);
                }
            });
        }

        public void lambda$run$11() {
            AlertsCreator.showUpdateAppAlert(PassportActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", C0952R.string.UpdateAppAlert), true);
        }

        public void lambda$run$14(TLRPC$TL_account_passwordSettings tLRPC$TL_account_passwordSettings, boolean z, byte[] bArr) {
            PassportActivity.this.currentEmail = tLRPC$TL_account_passwordSettings.email;
            if (z) {
                PassportActivity passportActivity = PassportActivity.this;
                passportActivity.saltedPassword = passportActivity.savedSaltedPassword;
            }
            PassportActivity passportActivity2 = PassportActivity.this;
            if (!PassportActivity.checkSecret(passportActivity2.decryptSecret(passportActivity2.secureSecret, PassportActivity.this.saltedPassword), Long.valueOf(PassportActivity.this.secureSecretId)) || bArr.length == 0 || PassportActivity.this.secureSecretId == 0) {
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
            } else if (PassportActivity.this.currentBotId == 0) {
                ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TLObject() {
                    public static int constructor = -1299661699;

                    @Override
                    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                        TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                        int readInt32 = abstractSerializedData.readInt32(z2);
                        for (int i2 = 0; i2 < readInt32; i2++) {
                            TLRPC$TL_secureValue TLdeserialize = TLRPC$TL_secureValue.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return tLRPC$Vector;
                            }
                            tLRPC$Vector.objects.add(TLdeserialize);
                        }
                        return tLRPC$Vector;
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                        abstractSerializedData.writeInt32(constructor);
                    }
                }, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        PassportActivity.C31908.this.lambda$run$13(tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                openRequestInterface();
            }
        }

        public void lambda$run$13(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.C31908.this.lambda$run$12(tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$run$12(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject != null) {
                PassportActivity.this.currentForm = new TLRPC$TL_account_authorizationForm();
                TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
                int size = tLRPC$Vector.objects.size();
                for (int i = 0; i < size; i++) {
                    PassportActivity.this.currentForm.values.add((TLRPC$TL_secureValue) tLRPC$Vector.objects.get(i));
                }
                openRequestInterface();
                return;
            }
            if ("APP_VERSION_OUTDATED".equals(tLRPC$TL_error.text)) {
                AlertsCreator.showUpdateAppAlert(PassportActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", C0952R.string.UpdateAppAlert), true);
            } else {
                PassportActivity.this.showAlertWithText(LocaleController.getString("AppName", C0952R.string.AppName), tLRPC$TL_error.text);
            }
            PassportActivity.this.showEditDoneProgress(true, false);
        }

        public void lambda$run$16(boolean z, TLRPC$TL_error tLRPC$TL_error) {
            String str;
            if (z) {
                UserConfig.getInstance(((BaseFragment) PassportActivity.this).currentAccount).resetSavedPassword();
                PassportActivity.this.usingSavedPassword = 0;
                PassportActivity.this.updatePasswordInterface();
                if (PassportActivity.this.inputFieldContainers != null && PassportActivity.this.inputFieldContainers[0].getVisibility() == 0) {
                    PassportActivity.this.inputFields[0].requestFocus();
                    AndroidUtilities.showKeyboard(PassportActivity.this.inputFields[0]);
                    return;
                }
                return;
            }
            PassportActivity.this.showEditDoneProgress(true, false);
            if (tLRPC$TL_error.text.equals("PASSWORD_HASH_INVALID")) {
                PassportActivity.this.onPasscodeError(true);
            } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.parseInt(tLRPC$TL_error.text).intValue();
                if (intValue < 60) {
                    str = LocaleController.formatPluralString("Seconds", intValue);
                } else {
                    str = LocaleController.formatPluralString("Minutes", intValue / 60);
                }
                PassportActivity.this.showAlertWithText(LocaleController.getString("AppName", C0952R.string.AppName), LocaleController.formatString("FloodWaitTime", C0952R.string.FloodWaitTime, str));
            } else {
                PassportActivity.this.showAlertWithText(LocaleController.getString("AppName", C0952R.string.AppName), tLRPC$TL_error.text);
            }
        }
    }

    private boolean isPersonalDocument(TLRPC$SecureValueType tLRPC$SecureValueType) {
        return (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeDriverLicense) || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePassport) || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeInternalPassport) || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeIdentityCard);
    }

    private boolean isAddressDocument(TLRPC$SecureValueType tLRPC$SecureValueType) {
        return (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeUtilityBill) || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeBankStatement) || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePassportRegistration) || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeTemporaryRegistration) || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeRentalAgreement);
    }

    private void createRequestInterface(android.content.Context r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.createRequestInterface(android.content.Context):void");
    }

    public class C1ValueToSend {
        boolean selfie_required;
        boolean translation_required;
        TLRPC$TL_secureValue value;

        public C1ValueToSend(PassportActivity passportActivity, TLRPC$TL_secureValue tLRPC$TL_secureValue, boolean z, boolean z2) {
            this.value = tLRPC$TL_secureValue;
            this.selfie_required = z;
            this.translation_required = z2;
        }
    }

    public void lambda$createRequestInterface$16(View view) {
        int i;
        ArrayList arrayList;
        TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType;
        ArrayList arrayList2 = new ArrayList();
        int size = this.currentForm.required_types.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC$SecureRequiredType tLRPC$SecureRequiredType = this.currentForm.required_types.get(i2);
            if (tLRPC$SecureRequiredType instanceof TLRPC$TL_secureRequiredType) {
                tLRPC$TL_secureRequiredType = (TLRPC$TL_secureRequiredType) tLRPC$SecureRequiredType;
            } else {
                if (tLRPC$SecureRequiredType instanceof TLRPC$TL_secureRequiredTypeOneOf) {
                    TLRPC$TL_secureRequiredTypeOneOf tLRPC$TL_secureRequiredTypeOneOf = (TLRPC$TL_secureRequiredTypeOneOf) tLRPC$SecureRequiredType;
                    if (!tLRPC$TL_secureRequiredTypeOneOf.types.isEmpty()) {
                        TLRPC$SecureRequiredType tLRPC$SecureRequiredType2 = tLRPC$TL_secureRequiredTypeOneOf.types.get(0);
                        if (tLRPC$SecureRequiredType2 instanceof TLRPC$TL_secureRequiredType) {
                            TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2 = (TLRPC$TL_secureRequiredType) tLRPC$SecureRequiredType2;
                            int size2 = tLRPC$TL_secureRequiredTypeOneOf.types.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    tLRPC$TL_secureRequiredType = tLRPC$TL_secureRequiredType2;
                                    break;
                                }
                                TLRPC$SecureRequiredType tLRPC$SecureRequiredType3 = tLRPC$TL_secureRequiredTypeOneOf.types.get(i3);
                                if (tLRPC$SecureRequiredType3 instanceof TLRPC$TL_secureRequiredType) {
                                    TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType3 = (TLRPC$TL_secureRequiredType) tLRPC$SecureRequiredType3;
                                    if (getValueByType(tLRPC$TL_secureRequiredType3, true) != null) {
                                        tLRPC$TL_secureRequiredType = tLRPC$TL_secureRequiredType3;
                                        break;
                                    }
                                }
                                i3++;
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
            TLRPC$TL_secureValue valueByType = getValueByType(tLRPC$TL_secureRequiredType, true);
            if (valueByType == null) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(getViewByType(tLRPC$TL_secureRequiredType), 2.0f, 0);
                return;
            }
            HashMap<String, String> hashMap = this.errorsMap.get(getNameForType(tLRPC$TL_secureRequiredType.type));
            if (hashMap == null || hashMap.isEmpty()) {
                arrayList2.add(new C1ValueToSend(this, valueByType, tLRPC$TL_secureRequiredType.selfie_required, tLRPC$TL_secureRequiredType.translation_required));
            } else {
                Vibrator vibrator2 = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(getViewByType(tLRPC$TL_secureRequiredType), 2.0f, 0);
                return;
            }
        }
        showEditDoneProgress(false, true);
        TLRPC$TL_account_acceptAuthorization tLRPC$TL_account_acceptAuthorization = new TLRPC$TL_account_acceptAuthorization();
        tLRPC$TL_account_acceptAuthorization.bot_id = this.currentBotId;
        tLRPC$TL_account_acceptAuthorization.scope = this.currentScope;
        tLRPC$TL_account_acceptAuthorization.public_key = this.currentPublicKey;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            C1ValueToSend r9 = (C1ValueToSend) arrayList2.get(i4);
            TLRPC$TL_secureValue tLRPC$TL_secureValue = r9.value;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC$SecurePlainData tLRPC$SecurePlainData = tLRPC$TL_secureValue.plain_data;
            if (tLRPC$SecurePlainData == null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC$TL_secureData tLRPC$TL_secureData = tLRPC$TL_secureValue.data;
                    if (tLRPC$TL_secureData != null) {
                        byte[] decryptValueSecret = decryptValueSecret(tLRPC$TL_secureData.secret, tLRPC$TL_secureData.data_hash);
                        jSONObject2.put("data_hash", Base64.encodeToString(tLRPC$TL_secureValue.data.data_hash, 2));
                        jSONObject2.put("secret", Base64.encodeToString(decryptValueSecret, 2));
                        jSONObject3.put("data", jSONObject2);
                    }
                    if (!tLRPC$TL_secureValue.files.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        int size4 = tLRPC$TL_secureValue.files.size();
                        int i5 = 0;
                        while (i5 < size4) {
                            TLRPC$TL_secureFile tLRPC$TL_secureFile = (TLRPC$TL_secureFile) tLRPC$TL_secureValue.files.get(i5);
                            arrayList = arrayList2;
                            try {
                                i = size3;
                                try {
                                    byte[] decryptValueSecret2 = decryptValueSecret(tLRPC$TL_secureFile.secret, tLRPC$TL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    size4 = size4;
                                    jSONObject4.put("file_hash", Base64.encodeToString(tLRPC$TL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(decryptValueSecret2, 2));
                                    jSONArray.put(jSONObject4);
                                    i5++;
                                    arrayList2 = arrayList;
                                    size3 = i;
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                            }
                        }
                        arrayList = arrayList2;
                        i = size3;
                        jSONObject3.put("files", jSONArray);
                    } else {
                        arrayList = arrayList2;
                        i = size3;
                    }
                    TLRPC$SecureFile tLRPC$SecureFile = tLRPC$TL_secureValue.front_side;
                    if (tLRPC$SecureFile instanceof TLRPC$TL_secureFile) {
                        TLRPC$TL_secureFile tLRPC$TL_secureFile2 = (TLRPC$TL_secureFile) tLRPC$SecureFile;
                        byte[] decryptValueSecret3 = decryptValueSecret(tLRPC$TL_secureFile2.secret, tLRPC$TL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tLRPC$TL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(decryptValueSecret3, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC$SecureFile tLRPC$SecureFile2 = tLRPC$TL_secureValue.reverse_side;
                    if (tLRPC$SecureFile2 instanceof TLRPC$TL_secureFile) {
                        TLRPC$TL_secureFile tLRPC$TL_secureFile3 = (TLRPC$TL_secureFile) tLRPC$SecureFile2;
                        byte[] decryptValueSecret4 = decryptValueSecret(tLRPC$TL_secureFile3.secret, tLRPC$TL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tLRPC$TL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(decryptValueSecret4, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (r9.selfie_required) {
                        TLRPC$SecureFile tLRPC$SecureFile3 = tLRPC$TL_secureValue.selfie;
                        if (tLRPC$SecureFile3 instanceof TLRPC$TL_secureFile) {
                            TLRPC$TL_secureFile tLRPC$TL_secureFile4 = (TLRPC$TL_secureFile) tLRPC$SecureFile3;
                            byte[] decryptValueSecret5 = decryptValueSecret(tLRPC$TL_secureFile4.secret, tLRPC$TL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tLRPC$TL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(decryptValueSecret5, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (r9.translation_required && !tLRPC$TL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tLRPC$TL_secureValue.translation.size();
                        for (int i6 = 0; i6 < size5; i6++) {
                            TLRPC$TL_secureFile tLRPC$TL_secureFile5 = (TLRPC$TL_secureFile) tLRPC$TL_secureValue.translation.get(i6);
                            byte[] decryptValueSecret6 = decryptValueSecret(tLRPC$TL_secureFile5.secret, tLRPC$TL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tLRPC$TL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(decryptValueSecret6, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(getNameForType(tLRPC$TL_secureValue.type), jSONObject3);
                } catch (Exception unused3) {
                }
                TLRPC$TL_secureValueHash tLRPC$TL_secureValueHash = new TLRPC$TL_secureValueHash();
                tLRPC$TL_secureValueHash.type = tLRPC$TL_secureValue.type;
                tLRPC$TL_secureValueHash.hash = tLRPC$TL_secureValue.hash;
                tLRPC$TL_account_acceptAuthorization.value_hashes.add(tLRPC$TL_secureValueHash);
                i4++;
                arrayList2 = arrayList;
                size3 = i;
            } else if (tLRPC$SecurePlainData instanceof TLRPC$TL_securePlainEmail) {
                TLRPC$TL_securePlainEmail tLRPC$TL_securePlainEmail = (TLRPC$TL_securePlainEmail) tLRPC$SecurePlainData;
            } else if (tLRPC$SecurePlainData instanceof TLRPC$TL_securePlainPhone) {
                TLRPC$TL_securePlainPhone tLRPC$TL_securePlainPhone = (TLRPC$TL_securePlainPhone) tLRPC$SecurePlainData;
            }
            arrayList = arrayList2;
            i = size3;
            TLRPC$TL_secureValueHash tLRPC$TL_secureValueHash2 = new TLRPC$TL_secureValueHash();
            tLRPC$TL_secureValueHash2.type = tLRPC$TL_secureValue.type;
            tLRPC$TL_secureValueHash2.hash = tLRPC$TL_secureValue.hash;
            tLRPC$TL_account_acceptAuthorization.value_hashes.add(tLRPC$TL_secureValueHash2);
            i4++;
            arrayList2 = arrayList;
            size3 = i;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused4) {
        }
        Object obj = this.currentPayload;
        if (obj != null) {
            try {
                jSONObject9.put("payload", obj);
            } catch (Exception unused5) {
            }
        }
        Object obj2 = this.currentNonce;
        if (obj2 != null) {
            try {
                jSONObject9.put("nonce", obj2);
            } catch (Exception unused6) {
            }
        }
        EncryptionResult encryptData = encryptData(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC$TL_secureCredentialsEncrypted tLRPC$TL_secureCredentialsEncrypted = new TLRPC$TL_secureCredentialsEncrypted();
        tLRPC$TL_account_acceptAuthorization.credentials = tLRPC$TL_secureCredentialsEncrypted;
        tLRPC$TL_secureCredentialsEncrypted.hash = encryptData.fileHash;
        tLRPC$TL_secureCredentialsEncrypted.data = encryptData.encryptedData;
        try {
            String replace = this.currentPublicKey.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            tLRPC$TL_account_acceptAuthorization.credentials.secret = cipher.doFinal(encryptData.decrypyedFileSecret);
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_acceptAuthorization, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PassportActivity.this.lambda$createRequestInterface$15(tLObject, tLRPC$TL_error);
            }
        }), this.classGuid);
    }

    public void lambda$createRequestInterface$15(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PassportActivity.this.lambda$createRequestInterface$14(tLRPC$TL_error);
            }
        });
    }

    public void lambda$createRequestInterface$14(TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            this.ignoreOnFailure = true;
            callCallback(true);
            finishFragment();
            return;
        }
        showEditDoneProgress(false, false);
        if ("APP_VERSION_OUTDATED".equals(tLRPC$TL_error.text)) {
            AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString("UpdateAppAlert", C0952R.string.UpdateAppAlert), true);
        } else {
            showAlertWithText(LocaleController.getString("AppName", C0952R.string.AppName), tLRPC$TL_error.text);
        }
    }

    private void createManageInterface(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.createManageInterface(android.content.Context):void");
    }

    public void lambda$createManageInterface$17(View view) {
        openAddDocumentAlert();
    }

    public void lambda$createManageInterface$21(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("TelegramPassportDeleteTitle", C0952R.string.TelegramPassportDeleteTitle));
        builder.setMessage(LocaleController.getString("TelegramPassportDeleteAlert", C0952R.string.TelegramPassportDeleteAlert));
        builder.setPositiveButton(LocaleController.getString("Delete", C0952R.string.Delete), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                PassportActivity.this.lambda$createManageInterface$20(dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        AlertDialog create = builder.create();
        showDialog(create);
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor("dialogTextRed2"));
        }
    }

    public void lambda$createManageInterface$20(DialogInterface dialogInterface, int i) {
        TLRPC$TL_account_deleteSecureValue tLRPC$TL_account_deleteSecureValue = new TLRPC$TL_account_deleteSecureValue();
        for (int i2 = 0; i2 < this.currentForm.values.size(); i2++) {
            tLRPC$TL_account_deleteSecureValue.types.add(this.currentForm.values.get(i2).type);
        }
        needShowProgress();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_deleteSecureValue, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PassportActivity.this.lambda$createManageInterface$19(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$createManageInterface$19(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PassportActivity.this.lambda$createManageInterface$18();
            }
        });
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

    public void lambda$createManageInterface$22(View view) {
        openAddDocumentAlert();
    }

    private boolean hasNotValueForType(Class<? extends TLRPC$SecureValueType> cls) {
        int size = this.currentForm.values.size();
        for (int i = 0; i < size; i++) {
            if (this.currentForm.values.get(i).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    private boolean hasUnfilledValues() {
        return hasNotValueForType(TLRPC$TL_secureValueTypePhone.class) || hasNotValueForType(TLRPC$TL_secureValueTypeEmail.class) || hasNotValueForType(TLRPC$TL_secureValueTypePersonalDetails.class) || hasNotValueForType(TLRPC$TL_secureValueTypePassport.class) || hasNotValueForType(TLRPC$TL_secureValueTypeInternalPassport.class) || hasNotValueForType(TLRPC$TL_secureValueTypeIdentityCard.class) || hasNotValueForType(TLRPC$TL_secureValueTypeDriverLicense.class) || hasNotValueForType(TLRPC$TL_secureValueTypeAddress.class) || hasNotValueForType(TLRPC$TL_secureValueTypeUtilityBill.class) || hasNotValueForType(TLRPC$TL_secureValueTypePassportRegistration.class) || hasNotValueForType(TLRPC$TL_secureValueTypeTemporaryRegistration.class) || hasNotValueForType(TLRPC$TL_secureValueTypeBankStatement.class) || hasNotValueForType(TLRPC$TL_secureValueTypeRentalAgreement.class);
    }

    private void openAddDocumentAlert() {
        Class<? extends TLRPC$SecureValueType> cls;
        Class<? extends TLRPC$SecureValueType> cls2;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (hasNotValueForType(TLRPC$TL_secureValueTypePhone.class)) {
            cls2 = TLRPC$TL_secureValueTypeRentalAgreement.class;
            cls = TLRPC$TL_secureValueTypeBankStatement.class;
            arrayList.add(LocaleController.getString("ActionBotDocumentPhone", C0952R.string.ActionBotDocumentPhone));
            arrayList2.add(TLRPC$TL_secureValueTypePhone.class);
        } else {
            cls2 = TLRPC$TL_secureValueTypeRentalAgreement.class;
            cls = TLRPC$TL_secureValueTypeBankStatement.class;
        }
        if (hasNotValueForType(TLRPC$TL_secureValueTypeEmail.class)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentEmail", C0952R.string.ActionBotDocumentEmail));
            arrayList2.add(TLRPC$TL_secureValueTypeEmail.class);
        }
        if (hasNotValueForType(TLRPC$TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentIdentity", C0952R.string.ActionBotDocumentIdentity));
            arrayList2.add(TLRPC$TL_secureValueTypePersonalDetails.class);
        }
        if (hasNotValueForType(TLRPC$TL_secureValueTypePassport.class)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentPassport", C0952R.string.ActionBotDocumentPassport));
            arrayList2.add(TLRPC$TL_secureValueTypePassport.class);
        }
        if (hasNotValueForType(TLRPC$TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentInternalPassport", C0952R.string.ActionBotDocumentInternalPassport));
            arrayList2.add(TLRPC$TL_secureValueTypeInternalPassport.class);
        }
        if (hasNotValueForType(TLRPC$TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentPassportRegistration", C0952R.string.ActionBotDocumentPassportRegistration));
            arrayList2.add(TLRPC$TL_secureValueTypePassportRegistration.class);
        }
        if (hasNotValueForType(TLRPC$TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentTemporaryRegistration", C0952R.string.ActionBotDocumentTemporaryRegistration));
            arrayList2.add(TLRPC$TL_secureValueTypeTemporaryRegistration.class);
        }
        if (hasNotValueForType(TLRPC$TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentIdentityCard", C0952R.string.ActionBotDocumentIdentityCard));
            arrayList2.add(TLRPC$TL_secureValueTypeIdentityCard.class);
        }
        if (hasNotValueForType(TLRPC$TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentDriverLicence", C0952R.string.ActionBotDocumentDriverLicence));
            arrayList2.add(TLRPC$TL_secureValueTypeDriverLicense.class);
        }
        if (hasNotValueForType(TLRPC$TL_secureValueTypeAddress.class)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentAddress", C0952R.string.ActionBotDocumentAddress));
            arrayList2.add(TLRPC$TL_secureValueTypeAddress.class);
        }
        if (hasNotValueForType(TLRPC$TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentUtilityBill", C0952R.string.ActionBotDocumentUtilityBill));
            arrayList2.add(TLRPC$TL_secureValueTypeUtilityBill.class);
        }
        Class<? extends TLRPC$SecureValueType> cls3 = cls;
        if (hasNotValueForType(cls3)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentBankStatement", C0952R.string.ActionBotDocumentBankStatement));
            arrayList2.add(cls3);
        }
        Class<? extends TLRPC$SecureValueType> cls4 = cls2;
        if (hasNotValueForType(cls4)) {
            arrayList.add(LocaleController.getString("ActionBotDocumentRentalAgreement", C0952R.string.ActionBotDocumentRentalAgreement));
            arrayList2.add(cls4);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("PassportNoDocumentsAdd", C0952R.string.PassportNoDocumentsAdd));
            builder.setItems((CharSequence[]) arrayList.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PassportActivity.this.lambda$openAddDocumentAlert$23(arrayList2, dialogInterface, i);
                }
            });
            showDialog(builder.create());
        }
    }

    public void lambda$openAddDocumentAlert$23(java.util.ArrayList r2, android.content.DialogInterface r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.lambda$openAddDocumentAlert$23(java.util.ArrayList, android.content.DialogInterface, int):void");
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

    public void callCallback(boolean z) {
        int i;
        int i2;
        if (this.callbackCalled) {
            return;
        }
        if (!TextUtils.isEmpty(this.currentCallbackUrl)) {
            if (z) {
                Activity parentActivity = getParentActivity();
                Browser.openUrl(parentActivity, Uri.parse(this.currentCallbackUrl + "&tg_passport=success"));
            } else if (!this.ignoreOnFailure && ((i2 = this.currentActivityType) == 5 || i2 == 0)) {
                Activity parentActivity2 = getParentActivity();
                Browser.openUrl(parentActivity2, Uri.parse(this.currentCallbackUrl + "&tg_passport=cancel"));
            }
            this.callbackCalled = true;
        } else if (this.needActivityResult) {
            if (z || (!this.ignoreOnFailure && ((i = this.currentActivityType) == 5 || i == 0))) {
                getParentActivity().setResult(z ? -1 : 0);
            }
            this.callbackCalled = true;
        }
    }

    private void createEmailInterface(Context context) {
        this.actionBar.setTitle(LocaleController.getString("PassportEmail", C0952R.string.PassportEmail));
        if (!TextUtils.isEmpty(this.currentEmail)) {
            TextSettingsCell textSettingsCell = new TextSettingsCell(context);
            textSettingsCell.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText4"));
            textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            textSettingsCell.setText(LocaleController.formatString("PassportPhoneUseSame", C0952R.string.PassportPhoneUseSame, this.currentEmail), false);
            this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
            textSettingsCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PassportActivity.this.lambda$createEmailInterface$24(view);
                }
            });
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
            this.bottomCell = textInfoPrivacyCell;
            textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
            this.bottomCell.setText(LocaleController.getString("PassportPhoneUseSameEmailInfo", C0952R.string.PassportPhoneUseSameEmailInfo));
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
        }
        this.inputFields = new EditTextBoldCursor[1];
        for (int i = 0; i < 1; i++) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
            frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            this.inputFields[i] = new EditTextBoldCursor(context);
            this.inputFields[i].setTag(Integer.valueOf(i));
            this.inputFields[i].setTextSize(1, 16.0f);
            this.inputFields[i].setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
            this.inputFields[i].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i].setBackgroundDrawable(null);
            this.inputFields[i].setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i].setCursorSize(AndroidUtilities.m34dp(20.0f));
            this.inputFields[i].setCursorWidth(1.5f);
            this.inputFields[i].setInputType(33);
            this.inputFields[i].setImeOptions(268435462);
            this.inputFields[i].setHint(LocaleController.getString("PaymentShippingEmailPlaceholder", C0952R.string.PaymentShippingEmailPlaceholder));
            TLRPC$TL_secureValue tLRPC$TL_secureValue = this.currentTypeValue;
            if (tLRPC$TL_secureValue != null) {
                TLRPC$SecurePlainData tLRPC$SecurePlainData = tLRPC$TL_secureValue.plain_data;
                if (tLRPC$SecurePlainData instanceof TLRPC$TL_securePlainEmail) {
                    TLRPC$TL_securePlainEmail tLRPC$TL_securePlainEmail = (TLRPC$TL_securePlainEmail) tLRPC$SecurePlainData;
                    if (!TextUtils.isEmpty(tLRPC$TL_securePlainEmail.email)) {
                        this.inputFields[i].setText(tLRPC$TL_securePlainEmail.email);
                    }
                }
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            editTextBoldCursorArr[i].setSelection(editTextBoldCursorArr[i].length());
            this.inputFields[i].setPadding(0, 0, 0, AndroidUtilities.m34dp(6.0f));
            this.inputFields[i].setGravity(LocaleController.isRTL ? 5 : 3);
            frameLayout.addView(this.inputFields[i], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            this.inputFields[i].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                    boolean lambda$createEmailInterface$25;
                    lambda$createEmailInterface$25 = PassportActivity.this.lambda$createEmailInterface$25(textView, i2, keyEvent);
                    return lambda$createEmailInterface$25;
                }
            });
        }
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
        this.bottomCell = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
        this.bottomCell.setText(LocaleController.getString("PassportEmailUploadInfo", C0952R.string.PassportEmailUploadInfo));
        this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
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

    private void createPhoneInterface(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        LinearLayout linearLayout;
        this.actionBar.setTitle(LocaleController.getString("PassportPhone", C0952R.string.PassportPhone));
        this.languageMap = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.countriesArray.add(0, split[2]);
                this.countriesMap.put(split[2], split[0]);
                this.codesMap.put(split[0], split[2]);
                if (split.length > 3) {
                    this.phoneFormatMap.put(split[0], split[3]);
                }
                this.languageMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        Collections.sort(this.countriesArray, ChangePhoneActivity$PhoneView$$ExternalSyntheticLambda6.INSTANCE);
        String str3 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        TextSettingsCell textSettingsCell = new TextSettingsCell(context);
        textSettingsCell.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText4"));
        textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        textSettingsCell.setText(LocaleController.formatString("PassportPhoneUseSame", C0952R.string.PassportPhoneUseSame, C0894PhoneFormat.getInstance().format("+" + str3)), false);
        int i = -1;
        this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
        textSettingsCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PassportActivity.this.lambda$createPhoneInterface$26(view);
            }
        });
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
        this.bottomCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
        this.bottomCell.setText(LocaleController.getString("PassportPhoneUseSameInfo", C0952R.string.PassportPhoneUseSameInfo));
        this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell = new HeaderCell(context);
        this.headerCell = headerCell;
        headerCell.setText(LocaleController.getString("PassportPhoneUseOther", C0952R.string.PassportPhoneUseOther));
        this.headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
        this.inputFields = new EditTextBoldCursor[3];
        int i2 = 0;
        while (i2 < 3) {
            if (i2 == 2) {
                this.inputFields[i2] = new HintEditText(context);
            } else {
                this.inputFields[i2] = new EditTextBoldCursor(context);
            }
            if (i2 == 1) {
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                this.linearLayout2.addView(linearLayout2, LayoutHelper.createLinear(i, 50));
                linearLayout2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                linearLayout = linearLayout2;
            } else if (i2 == 2) {
                linearLayout = (ViewGroup) this.inputFields[1].getParent();
            } else {
                FrameLayout frameLayout = new FrameLayout(context);
                this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(i, 50));
                frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                linearLayout = frameLayout;
            }
            this.inputFields[i2].setTag(Integer.valueOf(i2));
            this.inputFields[i2].setTextSize(1, 16.0f);
            this.inputFields[i2].setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
            this.inputFields[i2].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i2].setBackgroundDrawable(null);
            this.inputFields[i2].setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i2].setCursorSize(AndroidUtilities.m34dp(20.0f));
            this.inputFields[i2].setCursorWidth(1.5f);
            if (i2 == 0) {
                this.inputFields[i2].setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean lambda$createPhoneInterface$29;
                        lambda$createPhoneInterface$29 = PassportActivity.this.lambda$createPhoneInterface$29(view, motionEvent);
                        return lambda$createPhoneInterface$29;
                    }
                });
                this.inputFields[i2].setText(LocaleController.getString("ChooseCountry", C0952R.string.ChooseCountry));
                this.inputFields[i2].setInputType(0);
                this.inputFields[i2].setFocusable(false);
            } else {
                this.inputFields[i2].setInputType(3);
                if (i2 == 2) {
                    this.inputFields[i2].setImeOptions(268435462);
                } else {
                    this.inputFields[i2].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            editTextBoldCursorArr[i2].setSelection(editTextBoldCursorArr[i2].length());
            int i3 = 5;
            if (i2 == 1) {
                TextView textView = new TextView(context);
                this.plusTextView = textView;
                textView.setText("+");
                this.plusTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.plusTextView.setTextSize(1, 16.0f);
                linearLayout.addView(this.plusTextView, LayoutHelper.createLinear(-2, -2, 21.0f, 12.0f, 0.0f, 6.0f));
                this.inputFields[i2].setPadding(AndroidUtilities.m34dp(10.0f), 0, 0, 0);
                this.inputFields[i2].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.inputFields[i2].setGravity(19);
                linearLayout.addView(this.inputFields[i2], LayoutHelper.createLinear(55, -2, 0.0f, 12.0f, 16.0f, 6.0f));
                this.inputFields[i2].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        boolean z;
                        String str4;
                        boolean z2;
                        int indexOf;
                        if (!PassportActivity.this.ignoreOnTextChange) {
                            PassportActivity.this.ignoreOnTextChange = true;
                            String stripExceptNumbers = C0894PhoneFormat.stripExceptNumbers(PassportActivity.this.inputFields[1].getText().toString());
                            PassportActivity.this.inputFields[1].setText(stripExceptNumbers);
                            HintEditText hintEditText = (HintEditText) PassportActivity.this.inputFields[2];
                            if (stripExceptNumbers.length() == 0) {
                                hintEditText.setHintText((String) null);
                                hintEditText.setHint(LocaleController.getString("PaymentShippingPhoneNumber", C0952R.string.PaymentShippingPhoneNumber));
                                PassportActivity.this.inputFields[0].setText(LocaleController.getString("ChooseCountry", C0952R.string.ChooseCountry));
                            } else {
                                int i4 = 4;
                                if (stripExceptNumbers.length() > 4) {
                                    while (true) {
                                        if (i4 < 1) {
                                            str4 = null;
                                            z = false;
                                            break;
                                        }
                                        String substring = stripExceptNumbers.substring(0, i4);
                                        if (((String) PassportActivity.this.codesMap.get(substring)) != null) {
                                            str4 = stripExceptNumbers.substring(i4) + PassportActivity.this.inputFields[2].getText().toString();
                                            PassportActivity.this.inputFields[1].setText(substring);
                                            z = true;
                                            stripExceptNumbers = substring;
                                            break;
                                        }
                                        i4--;
                                    }
                                    if (!z) {
                                        str4 = stripExceptNumbers.substring(1) + PassportActivity.this.inputFields[2].getText().toString();
                                        EditTextBoldCursor editTextBoldCursor = PassportActivity.this.inputFields[1];
                                        stripExceptNumbers = stripExceptNumbers.substring(0, 1);
                                        editTextBoldCursor.setText(stripExceptNumbers);
                                    }
                                } else {
                                    str4 = null;
                                    z = false;
                                }
                                String str5 = (String) PassportActivity.this.codesMap.get(stripExceptNumbers);
                                if (str5 == null || (indexOf = PassportActivity.this.countriesArray.indexOf(str5)) == -1) {
                                    z2 = false;
                                } else {
                                    PassportActivity.this.inputFields[0].setText((CharSequence) PassportActivity.this.countriesArray.get(indexOf));
                                    String str6 = (String) PassportActivity.this.phoneFormatMap.get(stripExceptNumbers);
                                    if (str6 != null) {
                                        hintEditText.setHintText(str6.replace('X', (char) 8211));
                                        hintEditText.setHint((CharSequence) null);
                                    }
                                    z2 = true;
                                }
                                if (!z2) {
                                    hintEditText.setHintText((String) null);
                                    hintEditText.setHint(LocaleController.getString("PaymentShippingPhoneNumber", C0952R.string.PaymentShippingPhoneNumber));
                                    PassportActivity.this.inputFields[0].setText(LocaleController.getString("WrongCountry", C0952R.string.WrongCountry));
                                }
                                if (!z) {
                                    PassportActivity.this.inputFields[1].setSelection(PassportActivity.this.inputFields[1].getText().length());
                                }
                                if (str4 != null) {
                                    hintEditText.requestFocus();
                                    hintEditText.setText(str4);
                                    hintEditText.setSelection(hintEditText.length());
                                }
                            }
                            PassportActivity.this.ignoreOnTextChange = false;
                        }
                    }
                });
            } else if (i2 == 2) {
                this.inputFields[i2].setPadding(0, 0, 0, 0);
                this.inputFields[i2].setGravity(19);
                this.inputFields[i2].setHintText(null);
                this.inputFields[i2].setHint(LocaleController.getString("PaymentShippingPhoneNumber", C0952R.string.PaymentShippingPhoneNumber));
                linearLayout.addView(this.inputFields[i2], LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                this.inputFields[i2].addTextChangedListener(new TextWatcher() {
                    private int actionPosition;
                    private int characterAction = -1;

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                        if (i5 == 0 && i6 == 1) {
                            this.characterAction = 1;
                        } else if (i5 != 1 || i6 != 0) {
                            this.characterAction = -1;
                        } else if (charSequence.charAt(i4) != ' ' || i4 <= 0) {
                            this.characterAction = 2;
                        } else {
                            this.characterAction = 3;
                            this.actionPosition = i4 - 1;
                        }
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        int i4;
                        int i5;
                        if (!PassportActivity.this.ignoreOnPhoneChange) {
                            HintEditText hintEditText = (HintEditText) PassportActivity.this.inputFields[2];
                            int selectionStart = hintEditText.getSelectionStart();
                            String obj = hintEditText.getText().toString();
                            if (this.characterAction == 3) {
                                obj = obj.substring(0, this.actionPosition) + obj.substring(this.actionPosition + 1);
                                selectionStart--;
                            }
                            StringBuilder sb = new StringBuilder(obj.length());
                            int i6 = 0;
                            while (i6 < obj.length()) {
                                int i7 = i6 + 1;
                                String substring = obj.substring(i6, i7);
                                if ("0123456789".contains(substring)) {
                                    sb.append(substring);
                                }
                                i6 = i7;
                            }
                            PassportActivity.this.ignoreOnPhoneChange = true;
                            String hintText = hintEditText.getHintText();
                            if (hintText != null) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= sb.length()) {
                                        break;
                                    } else if (i8 < hintText.length()) {
                                        if (hintText.charAt(i8) == ' ') {
                                            sb.insert(i8, ' ');
                                            i8++;
                                            if (!(selectionStart != i8 || (i5 = this.characterAction) == 2 || i5 == 3)) {
                                                selectionStart++;
                                            }
                                        }
                                        i8++;
                                    } else {
                                        sb.insert(i8, ' ');
                                        if (selectionStart == i8 + 1 && (i4 = this.characterAction) != 2 && i4 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                }
                            }
                            hintEditText.setText(sb);
                            if (selectionStart >= 0) {
                                hintEditText.setSelection(Math.min(selectionStart, hintEditText.length()));
                            }
                            hintEditText.onTextChange();
                            PassportActivity.this.ignoreOnPhoneChange = false;
                        }
                    }
                });
            } else {
                this.inputFields[i2].setPadding(0, 0, 0, AndroidUtilities.m34dp(6.0f));
                EditTextBoldCursor editTextBoldCursor = this.inputFields[i2];
                if (!LocaleController.isRTL) {
                    i3 = 3;
                }
                editTextBoldCursor.setGravity(i3);
                linearLayout.addView(this.inputFields[i2], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.inputFields[i2].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView2, int i4, KeyEvent keyEvent) {
                    boolean lambda$createPhoneInterface$30;
                    lambda$createPhoneInterface$30 = PassportActivity.this.lambda$createPhoneInterface$30(textView2, i4, keyEvent);
                    return lambda$createPhoneInterface$30;
                }
            });
            if (i2 == 2) {
                this.inputFields[i2].setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                        boolean lambda$createPhoneInterface$31;
                        lambda$createPhoneInterface$31 = PassportActivity.this.lambda$createPhoneInterface$31(view, i4, keyEvent);
                        return lambda$createPhoneInterface$31;
                    }
                });
            }
            if (i2 == 0) {
                View view = new View(context);
                this.dividers.add(view);
                view.setBackgroundColor(Theme.getColor("divider"));
                linearLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
            i2++;
            i = -1;
        }
        try {
            telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e2) {
            FileLog.m30e(e2);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (!(str == null || (str2 = this.languageMap.get(str)) == null || this.countriesArray.indexOf(str2) == -1)) {
                this.inputFields[1].setText(this.countriesMap.get(str2));
            }
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
            this.bottomCell = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
            this.bottomCell.setText(LocaleController.getString("PassportPhoneUploadInfo", C0952R.string.PassportPhoneUploadInfo));
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
        }
        str = null;
        if (str == null) {
            this.inputFields[1].setText(this.countriesMap.get(str2));
        }
        TextInfoPrivacyCell textInfoPrivacyCell22 = new TextInfoPrivacyCell(context);
        this.bottomCell = textInfoPrivacyCell22;
        textInfoPrivacyCell22.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
        this.bottomCell.setText(LocaleController.getString("PassportPhoneUploadInfo", C0952R.string.PassportPhoneUploadInfo));
        this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
    }

    public void lambda$createPhoneInterface$26(View view) {
        this.useCurrentValue = true;
        this.doneItem.callOnClick();
        this.useCurrentValue = false;
    }

    public boolean lambda$createPhoneInterface$29(View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() {
                @Override
                public final void didSelectCountry(CountrySelectActivity.Country country) {
                    PassportActivity.this.lambda$createPhoneInterface$28(country);
                }
            });
            presentFragment(countrySelectActivity);
        }
        return true;
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
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PassportActivity.this.lambda$createPhoneInterface$27();
            }
        }, 300L);
        this.inputFields[2].requestFocus();
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
        editTextBoldCursorArr[2].setSelection(editTextBoldCursorArr[2].length());
    }

    public void lambda$createPhoneInterface$27() {
        AndroidUtilities.showKeyboard(this.inputFields[2]);
    }

    public boolean lambda$createPhoneInterface$30(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            this.inputFields[2].requestFocus();
            return true;
        } else if (i != 6) {
            return false;
        } else {
            this.doneItem.callOnClick();
            return true;
        }
    }

    public boolean lambda$createPhoneInterface$31(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || this.inputFields[2].length() != 0) {
            return false;
        }
        this.inputFields[1].requestFocus();
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
        editTextBoldCursorArr[1].setSelection(editTextBoldCursorArr[1].length());
        this.inputFields[1].dispatchKeyEvent(keyEvent);
        return true;
    }

    private void createAddressInterface(Context context) {
        final String str;
        this.languageMap = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.languageMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
        this.topErrorCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_top, "windowBackgroundGrayShadow"));
        this.topErrorCell.setPadding(0, AndroidUtilities.m34dp(7.0f), 0, 0);
        int i = -2;
        this.linearLayout2.addView(this.topErrorCell, LayoutHelper.createLinear(-1, -2));
        checkTopErrorCell(true);
        TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType = this.currentDocumentsType;
        if (tLRPC$TL_secureRequiredType != null) {
            TLRPC$SecureValueType tLRPC$SecureValueType = tLRPC$TL_secureRequiredType.type;
            if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(LocaleController.getString("ActionBotDocumentRentalAgreement", C0952R.string.ActionBotDocumentRentalAgreement));
            } else if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(LocaleController.getString("ActionBotDocumentBankStatement", C0952R.string.ActionBotDocumentBankStatement));
            } else if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(LocaleController.getString("ActionBotDocumentUtilityBill", C0952R.string.ActionBotDocumentUtilityBill));
            } else if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(LocaleController.getString("ActionBotDocumentPassportRegistration", C0952R.string.ActionBotDocumentPassportRegistration));
            } else if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(LocaleController.getString("ActionBotDocumentTemporaryRegistration", C0952R.string.ActionBotDocumentTemporaryRegistration));
            }
            HeaderCell headerCell = new HeaderCell(context);
            this.headerCell = headerCell;
            headerCell.setText(LocaleController.getString("PassportDocuments", C0952R.string.PassportDocuments));
            this.headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.documentsLayout = linearLayout;
            linearLayout.setOrientation(1);
            this.linearLayout2.addView(this.documentsLayout, LayoutHelper.createLinear(-1, -2));
            TextSettingsCell textSettingsCell = new TextSettingsCell(context);
            this.uploadDocumentCell = textSettingsCell;
            textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.linearLayout2.addView(this.uploadDocumentCell, LayoutHelper.createLinear(-1, -2));
            this.uploadDocumentCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PassportActivity.this.lambda$createAddressInterface$32(view);
                }
            });
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
            this.bottomCell = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
            if (this.currentBotId != 0) {
                this.noAllDocumentsErrorText = LocaleController.getString("PassportAddAddressUploadInfo", C0952R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC$SecureValueType tLRPC$SecureValueType2 = this.currentDocumentsType.type;
                if (tLRPC$SecureValueType2 instanceof TLRPC$TL_secureValueTypeRentalAgreement) {
                    this.noAllDocumentsErrorText = LocaleController.getString("PassportAddAgreementInfo", C0952R.string.PassportAddAgreementInfo);
                } else if (tLRPC$SecureValueType2 instanceof TLRPC$TL_secureValueTypeUtilityBill) {
                    this.noAllDocumentsErrorText = LocaleController.getString("PassportAddBillInfo", C0952R.string.PassportAddBillInfo);
                } else if (tLRPC$SecureValueType2 instanceof TLRPC$TL_secureValueTypePassportRegistration) {
                    this.noAllDocumentsErrorText = LocaleController.getString("PassportAddPassportRegistrationInfo", C0952R.string.PassportAddPassportRegistrationInfo);
                } else if (tLRPC$SecureValueType2 instanceof TLRPC$TL_secureValueTypeTemporaryRegistration) {
                    this.noAllDocumentsErrorText = LocaleController.getString("PassportAddTemporaryRegistrationInfo", C0952R.string.PassportAddTemporaryRegistrationInfo);
                } else if (tLRPC$SecureValueType2 instanceof TLRPC$TL_secureValueTypeBankStatement) {
                    this.noAllDocumentsErrorText = LocaleController.getString("PassportAddBankInfo", C0952R.string.PassportAddBankInfo);
                } else {
                    this.noAllDocumentsErrorText = "";
                }
            }
            CharSequence charSequence = this.noAllDocumentsErrorText;
            HashMap<String, String> hashMap = this.documentsErrors;
            SpannableStringBuilder spannableStringBuilder = charSequence;
            if (hashMap != null) {
                String str2 = hashMap.get("files_all");
                spannableStringBuilder = charSequence;
                if (str2 != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                    spannableStringBuilder2.append((CharSequence) "\n\n");
                    spannableStringBuilder2.append(this.noAllDocumentsErrorText);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(Theme.getColor("windowBackgroundWhiteRedText3")), 0, str2.length(), 33);
                    this.errorsValues.put("files_all", "");
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            this.bottomCell.setText(spannableStringBuilder);
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            if (this.currentDocumentsType.translation_required) {
                HeaderCell headerCell2 = new HeaderCell(context);
                this.headerCell = headerCell2;
                headerCell2.setText(LocaleController.getString("PassportTranslation", C0952R.string.PassportTranslation));
                this.headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.translationLayout = linearLayout2;
                linearLayout2.setOrientation(1);
                this.linearLayout2.addView(this.translationLayout, LayoutHelper.createLinear(-1, -2));
                TextSettingsCell textSettingsCell2 = new TextSettingsCell(context);
                this.uploadTranslationCell = textSettingsCell2;
                textSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.linearLayout2.addView(this.uploadTranslationCell, LayoutHelper.createLinear(-1, -2));
                this.uploadTranslationCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PassportActivity.this.lambda$createAddressInterface$33(view);
                    }
                });
                TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context);
                this.bottomCellTranslation = textInfoPrivacyCell3;
                textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                if (this.currentBotId != 0) {
                    this.noAllTranslationErrorText = LocaleController.getString("PassportAddTranslationUploadInfo", C0952R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC$SecureValueType tLRPC$SecureValueType3 = this.currentDocumentsType.type;
                    if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeRentalAgreement) {
                        this.noAllTranslationErrorText = LocaleController.getString("PassportAddTranslationAgreementInfo", C0952R.string.PassportAddTranslationAgreementInfo);
                    } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeUtilityBill) {
                        this.noAllTranslationErrorText = LocaleController.getString("PassportAddTranslationBillInfo", C0952R.string.PassportAddTranslationBillInfo);
                    } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypePassportRegistration) {
                        this.noAllTranslationErrorText = LocaleController.getString("PassportAddTranslationPassportRegistrationInfo", C0952R.string.PassportAddTranslationPassportRegistrationInfo);
                    } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeTemporaryRegistration) {
                        this.noAllTranslationErrorText = LocaleController.getString("PassportAddTranslationTemporaryRegistrationInfo", C0952R.string.PassportAddTranslationTemporaryRegistrationInfo);
                    } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeBankStatement) {
                        this.noAllTranslationErrorText = LocaleController.getString("PassportAddTranslationBankInfo", C0952R.string.PassportAddTranslationBankInfo);
                    } else {
                        this.noAllTranslationErrorText = "";
                    }
                }
                CharSequence charSequence2 = this.noAllTranslationErrorText;
                HashMap<String, String> hashMap2 = this.documentsErrors;
                SpannableStringBuilder spannableStringBuilder3 = charSequence2;
                if (hashMap2 != null) {
                    String str3 = hashMap2.get("translation_all");
                    spannableStringBuilder3 = charSequence2;
                    if (str3 != null) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(str3);
                        spannableStringBuilder4.append((CharSequence) "\n\n");
                        spannableStringBuilder4.append(this.noAllTranslationErrorText);
                        spannableStringBuilder4.setSpan(new ForegroundColorSpan(Theme.getColor("windowBackgroundWhiteRedText3")), 0, str3.length(), 33);
                        this.errorsValues.put("translation_all", "");
                        spannableStringBuilder3 = spannableStringBuilder4;
                    }
                }
                this.bottomCellTranslation.setText(spannableStringBuilder3);
                this.linearLayout2.addView(this.bottomCellTranslation, LayoutHelper.createLinear(-1, -2));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString("PassportAddress", C0952R.string.PassportAddress));
        }
        HeaderCell headerCell3 = new HeaderCell(context);
        this.headerCell = headerCell3;
        headerCell3.setText(LocaleController.getString("PassportAddressHeader", C0952R.string.PassportAddressHeader));
        this.headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
        int i2 = 6;
        this.inputFields = new EditTextBoldCursor[6];
        int i3 = 0;
        while (i3 < i2) {
            final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.inputFields[i3] = editTextBoldCursor;
            FrameLayout frameLayout = new FrameLayout(this, context) {
                private StaticLayout errorLayout;
                float offsetX;

                @Override
                protected void onMeasure(int i4, int i5) {
                    int size = View.MeasureSpec.getSize(i4) - AndroidUtilities.m34dp(34.0f);
                    StaticLayout errorLayout = editTextBoldCursor.getErrorLayout(size);
                    this.errorLayout = errorLayout;
                    if (errorLayout != null) {
                        int lineCount = errorLayout.getLineCount();
                        int i6 = 0;
                        if (lineCount > 1) {
                            i5 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(64.0f) + (this.errorLayout.getLineBottom(lineCount - 1) - this.errorLayout.getLineBottom(0)), 1073741824);
                        }
                        if (LocaleController.isRTL) {
                            float f = 0.0f;
                            while (true) {
                                if (i6 >= lineCount) {
                                    break;
                                } else if (this.errorLayout.getLineLeft(i6) != 0.0f) {
                                    this.offsetX = 0.0f;
                                    break;
                                } else {
                                    f = Math.max(f, this.errorLayout.getLineWidth(i6));
                                    if (i6 == lineCount - 1) {
                                        this.offsetX = size - f;
                                    }
                                    i6++;
                                }
                            }
                        }
                    }
                    super.onMeasure(i4, i5);
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    if (this.errorLayout != null) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.m34dp(21.0f) + this.offsetX, editTextBoldCursor.getLineY() + AndroidUtilities.m34dp(3.0f));
                        this.errorLayout.draw(canvas);
                        canvas.restore();
                    }
                }
            };
            frameLayout.setWillNotDraw(false);
            this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, i));
            frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            int i4 = 5;
            if (i3 == 5) {
                View view = new View(context);
                this.extraBackgroundView = view;
                view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                this.linearLayout2.addView(this.extraBackgroundView, LayoutHelper.createLinear(-1, i2));
            }
            if (this.documentOnly && this.currentDocumentsType != null) {
                frameLayout.setVisibility(8);
                View view2 = this.extraBackgroundView;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.inputFields[i3].setTag(Integer.valueOf(i3));
            this.inputFields[i3].setSupportRtlHint(true);
            this.inputFields[i3].setTextSize(1, 16.0f);
            this.inputFields[i3].setHintColor(Theme.getColor("windowBackgroundWhiteHintText"));
            this.inputFields[i3].setHeaderHintColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
            this.inputFields[i3].setTransformHintToHeader(true);
            this.inputFields[i3].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i3].setBackgroundDrawable(null);
            this.inputFields[i3].setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i3].setCursorSize(AndroidUtilities.m34dp(20.0f));
            this.inputFields[i3].setCursorWidth(1.5f);
            this.inputFields[i3].setLineColors(Theme.getColor("windowBackgroundWhiteInputField"), Theme.getColor("windowBackgroundWhiteInputFieldActivated"), Theme.getColor("windowBackgroundWhiteRedText3"));
            if (i3 == 5) {
                this.inputFields[i3].setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        boolean lambda$createAddressInterface$35;
                        lambda$createAddressInterface$35 = PassportActivity.this.lambda$createAddressInterface$35(view3, motionEvent);
                        return lambda$createAddressInterface$35;
                    }
                });
                this.inputFields[i3].setInputType(0);
                this.inputFields[i3].setFocusable(false);
            } else {
                this.inputFields[i3].setInputType(16385);
                this.inputFields[i3].setImeOptions(268435461);
            }
            if (i3 == 0) {
                this.inputFields[i3].setHintText(LocaleController.getString("PassportStreet1", C0952R.string.PassportStreet1));
                str = "street_line1";
            } else if (i3 == 1) {
                this.inputFields[i3].setHintText(LocaleController.getString("PassportStreet2", C0952R.string.PassportStreet2));
                str = "street_line2";
            } else if (i3 == 2) {
                this.inputFields[i3].setHintText(LocaleController.getString("PassportPostcode", C0952R.string.PassportPostcode));
                str = "post_code";
            } else if (i3 == 3) {
                this.inputFields[i3].setHintText(LocaleController.getString("PassportCity", C0952R.string.PassportCity));
                str = "city";
            } else if (i3 == 4) {
                this.inputFields[i3].setHintText(LocaleController.getString("PassportState", C0952R.string.PassportState));
                str = "state";
            } else if (i3 != 5) {
                i3++;
                i2 = 6;
                i = -2;
            } else {
                this.inputFields[i3].setHintText(LocaleController.getString("PassportCountry", C0952R.string.PassportCountry));
                str = "country_code";
            }
            setFieldValues(this.currentValues, this.inputFields[i3], str);
            if (i3 == 2) {
                this.inputFields[i3].addTextChangedListener(new TextWatcher() {
                    private boolean ignore;

                    @Override
                    public void beforeTextChanged(CharSequence charSequence3, int i5, int i6, int i7) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence3, int i5, int i6, int i7) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (!this.ignore) {
                            boolean z = true;
                            this.ignore = true;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= editable.length()) {
                                    z = false;
                                    break;
                                }
                                char charAt = editable.charAt(i5);
                                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                                    break;
                                }
                                i5++;
                            }
                            this.ignore = false;
                            if (z) {
                                editTextBoldCursor.setErrorText(LocaleController.getString("PassportUseLatinOnly", C0952R.string.PassportUseLatinOnly));
                            } else {
                                PassportActivity.this.checkFieldForError(editTextBoldCursor, str, editable, false);
                            }
                        }
                    }
                });
                this.inputFields[i3].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.inputFields[i3].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence3, int i5, int i6, int i7) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence3, int i5, int i6, int i7) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        PassportActivity.this.checkFieldForError(editTextBoldCursor, str, editable, false);
                    }
                });
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            editTextBoldCursorArr[i3].setSelection(editTextBoldCursorArr[i3].length());
            this.inputFields[i3].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i3];
            if (!LocaleController.isRTL) {
                i4 = 3;
            }
            editTextBoldCursor2.setGravity(i4 | 16);
            frameLayout.addView(this.inputFields[i3], LayoutHelper.createFrame(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.inputFields[i3].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                    boolean lambda$createAddressInterface$36;
                    lambda$createAddressInterface$36 = PassportActivity.this.lambda$createAddressInterface$36(textView, i5, keyEvent);
                    return lambda$createAddressInterface$36;
                }
            });
            i3++;
            i2 = 6;
            i = -2;
        }
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context);
        this.sectionCell = shadowSectionCell;
        this.linearLayout2.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
        if (this.documentOnly && this.currentDocumentsType != null) {
            this.headerCell.setVisibility(8);
            this.sectionCell.setVisibility(8);
        }
        if (((this.currentBotId != 0 || this.currentDocumentsType == null) && this.currentTypeValue != null && !this.documentOnly) || this.currentDocumentsTypeValue != null) {
            TLRPC$TL_secureValue tLRPC$TL_secureValue = this.currentDocumentsTypeValue;
            if (tLRPC$TL_secureValue != null) {
                addDocumentViews(tLRPC$TL_secureValue.files);
                addTranslationDocumentViews(this.currentDocumentsTypeValue.translation);
            }
            this.sectionCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
            TextSettingsCell textSettingsCell3 = new TextSettingsCell(context);
            textSettingsCell3.setTextColor(Theme.getColor("windowBackgroundWhiteRedText3"));
            textSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            if (this.currentDocumentsType == null) {
                textSettingsCell3.setText(LocaleController.getString("PassportDeleteInfo", C0952R.string.PassportDeleteInfo), false);
            } else {
                textSettingsCell3.setText(LocaleController.getString("PassportDeleteDocument", C0952R.string.PassportDeleteDocument), false);
            }
            this.linearLayout2.addView(textSettingsCell3, LayoutHelper.createLinear(-1, -2));
            textSettingsCell3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    PassportActivity.this.lambda$createAddressInterface$37(view3);
                }
            });
            ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context);
            this.sectionCell = shadowSectionCell2;
            shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
            this.linearLayout2.addView(this.sectionCell, LayoutHelper.createLinear(-1, -2));
        } else {
            this.sectionCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
            if (this.documentOnly && this.currentDocumentsType != null) {
                this.bottomCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
            }
        }
        updateUploadText(0);
        updateUploadText(4);
    }

    public void lambda$createAddressInterface$32(View view) {
        this.uploadingFileType = 0;
        openAttachMenu();
    }

    public void lambda$createAddressInterface$33(View view) {
        this.uploadingFileType = 4;
        openAttachMenu();
    }

    public boolean lambda$createAddressInterface$35(View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() {
                @Override
                public final void didSelectCountry(CountrySelectActivity.Country country) {
                    PassportActivity.this.lambda$createAddressInterface$34(country);
                }
            });
            presentFragment(countrySelectActivity);
        }
        return true;
    }

    public void lambda$createAddressInterface$34(CountrySelectActivity.Country country) {
        this.inputFields[5].setText(country.name);
        this.currentCitizeship = country.shortname;
    }

    public boolean lambda$createAddressInterface$36(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        int intValue = ((Integer) textView.getTag()).intValue() + 1;
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
        if (intValue < editTextBoldCursorArr.length) {
            if (editTextBoldCursorArr[intValue].isFocusable()) {
                this.inputFields[intValue].requestFocus();
            } else {
                this.inputFields[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
        return true;
    }

    public void lambda$createAddressInterface$37(View view) {
        createDocumentDeleteAlert();
    }

    private void createDocumentDeleteAlert() {
        final boolean[] zArr = {true};
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                PassportActivity.this.lambda$createDocumentDeleteAlert$38(zArr, dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
        boolean z = this.documentOnly;
        if (z && this.currentDocumentsType == null && (this.currentType.type instanceof TLRPC$TL_secureValueTypeAddress)) {
            builder.setMessage(LocaleController.getString("PassportDeleteAddressAlert", C0952R.string.PassportDeleteAddressAlert));
        } else if (!z || this.currentDocumentsType != null || !(this.currentType.type instanceof TLRPC$TL_secureValueTypePersonalDetails)) {
            builder.setMessage(LocaleController.getString("PassportDeleteDocumentAlert", C0952R.string.PassportDeleteDocumentAlert));
        } else {
            builder.setMessage(LocaleController.getString("PassportDeletePersonalAlert", C0952R.string.PassportDeletePersonalAlert));
        }
        if (!this.documentOnly && this.currentDocumentsType != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1);
            checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            TLRPC$SecureValueType tLRPC$SecureValueType = this.currentType.type;
            if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeAddress) {
                checkBoxCell.setText(LocaleController.getString("PassportDeleteDocumentAddress", C0952R.string.PassportDeleteDocumentAddress), "", true, false);
            } else if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePersonalDetails) {
                checkBoxCell.setText(LocaleController.getString("PassportDeleteDocumentPersonal", C0952R.string.PassportDeleteDocumentPersonal), "", true, false);
            }
            checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.m34dp(16.0f) : AndroidUtilities.m34dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.m34dp(8.0f) : AndroidUtilities.m34dp(16.0f), 0);
            frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48, 51));
            checkBoxCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PassportActivity.lambda$createDocumentDeleteAlert$39(zArr, view);
                }
            });
            builder.setView(frameLayout);
        }
        showDialog(builder.create());
    }

    public void lambda$createDocumentDeleteAlert$38(boolean[] zArr, DialogInterface dialogInterface, int i) {
        if (!this.documentOnly) {
            this.currentValues.clear();
        }
        this.currentDocumentValues.clear();
        this.delegate.deleteValue(this.currentType, this.currentDocumentsType, this.availableDocumentTypes, zArr[0], null, null);
        finishFragment();
    }

    public static void lambda$createDocumentDeleteAlert$39(boolean[] zArr, View view) {
        if (view.isEnabled()) {
            zArr[0] = !zArr[0];
            ((CheckBoxCell) view).setChecked(zArr[0], true);
        }
    }

    public void onFieldError(View view) {
        if (view != null) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(view, 2.0f, 0);
            scrollToField(view);
        }
    }

    private void scrollToField(View view) {
        while (view != null && this.linearLayout2.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.scrollView.smoothScrollTo(0, view.getTop() - ((this.scrollView.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public String getDocumentHash(SecureDocument secureDocument) {
        byte[] bArr;
        if (secureDocument == null) {
            return "";
        }
        TLRPC$TL_secureFile tLRPC$TL_secureFile = secureDocument.secureFile;
        if (tLRPC$TL_secureFile != null && (bArr = tLRPC$TL_secureFile.file_hash) != null) {
            return Base64.encodeToString(bArr, 2);
        }
        byte[] bArr2 = secureDocument.fileHash;
        return bArr2 != null ? Base64.encodeToString(bArr2, 2) : "";
    }

    public void checkFieldForError(EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z) {
        String str2;
        String str3;
        String str4;
        HashMap<String, String> hashMap = this.errorsValues;
        if (hashMap == null || (str2 = hashMap.get(str)) == null) {
            editTextBoldCursor.setErrorText(null);
        } else if (TextUtils.equals(str2, editable)) {
            HashMap<String, String> hashMap2 = this.fieldsErrors;
            if (hashMap2 == null || (str4 = hashMap2.get(str)) == null) {
                HashMap<String, String> hashMap3 = this.documentsErrors;
                if (!(hashMap3 == null || (str3 = hashMap3.get(str)) == null)) {
                    editTextBoldCursor.setErrorText(str3);
                }
            } else {
                editTextBoldCursor.setErrorText(str4);
            }
        } else {
            editTextBoldCursor.setErrorText(null);
        }
        String str5 = z ? "error_document_all" : "error_all";
        HashMap<String, String> hashMap4 = this.errorsValues;
        if (hashMap4 != null && hashMap4.containsKey(str5)) {
            this.errorsValues.remove(str5);
            checkTopErrorCell(false);
        }
    }

    public boolean checkFieldsForError() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.checkFieldsForError():boolean");
    }

    private void createIdentityInterface(final Context context) {
        final String str;
        HashMap<String, String> hashMap;
        final String str2;
        final HashMap<String, String> hashMap2;
        this.languageMap = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.languageMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
        this.topErrorCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_top, "windowBackgroundGrayShadow"));
        this.topErrorCell.setPadding(0, AndroidUtilities.m34dp(7.0f), 0, 0);
        int i = -1;
        this.linearLayout2.addView(this.topErrorCell, LayoutHelper.createLinear(-1, -2));
        checkTopErrorCell(true);
        if (this.currentDocumentsType != null) {
            HeaderCell headerCell = new HeaderCell(context);
            this.headerCell = headerCell;
            if (this.documentOnly) {
                headerCell.setText(LocaleController.getString("PassportDocuments", C0952R.string.PassportDocuments));
            } else {
                headerCell.setText(LocaleController.getString("PassportRequiredDocuments", C0952R.string.PassportRequiredDocuments));
            }
            this.headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.frontLayout = linearLayout;
            linearLayout.setOrientation(1);
            this.linearLayout2.addView(this.frontLayout, LayoutHelper.createLinear(-1, -2));
            TextDetailSettingsCell textDetailSettingsCell = new TextDetailSettingsCell(context);
            this.uploadFrontCell = textDetailSettingsCell;
            textDetailSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.linearLayout2.addView(this.uploadFrontCell, LayoutHelper.createLinear(-1, -2));
            this.uploadFrontCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PassportActivity.this.lambda$createIdentityInterface$40(view);
                }
            });
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.reverseLayout = linearLayout2;
            linearLayout2.setOrientation(1);
            this.linearLayout2.addView(this.reverseLayout, LayoutHelper.createLinear(-1, -2));
            boolean z = this.currentDocumentsType.selfie_required;
            TextDetailSettingsCell textDetailSettingsCell2 = new TextDetailSettingsCell(context);
            this.uploadReverseCell = textDetailSettingsCell2;
            textDetailSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.uploadReverseCell.setTextAndValue(LocaleController.getString("PassportReverseSide", C0952R.string.PassportReverseSide), LocaleController.getString("PassportReverseSideInfo", C0952R.string.PassportReverseSideInfo), z);
            this.linearLayout2.addView(this.uploadReverseCell, LayoutHelper.createLinear(-1, -2));
            this.uploadReverseCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PassportActivity.this.lambda$createIdentityInterface$41(view);
                }
            });
            if (this.currentDocumentsType.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.selfieLayout = linearLayout3;
                linearLayout3.setOrientation(1);
                this.linearLayout2.addView(this.selfieLayout, LayoutHelper.createLinear(-1, -2));
                TextDetailSettingsCell textDetailSettingsCell3 = new TextDetailSettingsCell(context);
                this.uploadSelfieCell = textDetailSettingsCell3;
                textDetailSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.uploadSelfieCell.setTextAndValue(LocaleController.getString("PassportSelfie", C0952R.string.PassportSelfie), LocaleController.getString("PassportSelfieInfo", C0952R.string.PassportSelfieInfo), this.currentType.translation_required);
                this.linearLayout2.addView(this.uploadSelfieCell, LayoutHelper.createLinear(-1, -2));
                this.uploadSelfieCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PassportActivity.this.lambda$createIdentityInterface$42(view);
                    }
                });
            }
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
            this.bottomCell = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
            this.bottomCell.setText(LocaleController.getString("PassportPersonalUploadInfo", C0952R.string.PassportPersonalUploadInfo));
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            if (this.currentDocumentsType.translation_required) {
                HeaderCell headerCell2 = new HeaderCell(context);
                this.headerCell = headerCell2;
                headerCell2.setText(LocaleController.getString("PassportTranslation", C0952R.string.PassportTranslation));
                this.headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.translationLayout = linearLayout4;
                linearLayout4.setOrientation(1);
                this.linearLayout2.addView(this.translationLayout, LayoutHelper.createLinear(-1, -2));
                TextSettingsCell textSettingsCell = new TextSettingsCell(context);
                this.uploadTranslationCell = textSettingsCell;
                textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.linearLayout2.addView(this.uploadTranslationCell, LayoutHelper.createLinear(-1, -2));
                this.uploadTranslationCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PassportActivity.this.lambda$createIdentityInterface$43(view);
                    }
                });
                TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context);
                this.bottomCellTranslation = textInfoPrivacyCell3;
                textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                if (this.currentBotId != 0) {
                    this.noAllTranslationErrorText = LocaleController.getString("PassportAddTranslationUploadInfo", C0952R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC$SecureValueType tLRPC$SecureValueType = this.currentDocumentsType.type;
                    if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePassport) {
                        this.noAllTranslationErrorText = LocaleController.getString("PassportAddPassportInfo", C0952R.string.PassportAddPassportInfo);
                    } else if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeInternalPassport) {
                        this.noAllTranslationErrorText = LocaleController.getString("PassportAddInternalPassportInfo", C0952R.string.PassportAddInternalPassportInfo);
                    } else if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeIdentityCard) {
                        this.noAllTranslationErrorText = LocaleController.getString("PassportAddIdentityCardInfo", C0952R.string.PassportAddIdentityCardInfo);
                    } else if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeDriverLicense) {
                        this.noAllTranslationErrorText = LocaleController.getString("PassportAddDriverLicenceInfo", C0952R.string.PassportAddDriverLicenceInfo);
                    } else {
                        this.noAllTranslationErrorText = "";
                    }
                }
                CharSequence charSequence = this.noAllTranslationErrorText;
                HashMap<String, String> hashMap3 = this.documentsErrors;
                SpannableStringBuilder spannableStringBuilder = charSequence;
                if (hashMap3 != null) {
                    String str3 = hashMap3.get("translation_all");
                    spannableStringBuilder = charSequence;
                    if (str3 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str3);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append(this.noAllTranslationErrorText);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Theme.getColor("windowBackgroundWhiteRedText3")), 0, str3.length(), 33);
                        this.errorsValues.put("translation_all", "");
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                }
                this.bottomCellTranslation.setText(spannableStringBuilder);
                this.linearLayout2.addView(this.bottomCellTranslation, LayoutHelper.createLinear(-1, -2));
            }
        } else if (Build.VERSION.SDK_INT >= 18) {
            TextSettingsCell textSettingsCell2 = new TextSettingsCell(context);
            this.scanDocumentCell = textSettingsCell2;
            textSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.scanDocumentCell.setText(LocaleController.getString("PassportScanPassport", C0952R.string.PassportScanPassport), false);
            this.linearLayout2.addView(this.scanDocumentCell, LayoutHelper.createLinear(-1, -2));
            this.scanDocumentCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PassportActivity.this.lambda$createIdentityInterface$44(view);
                }
            });
            TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context);
            this.bottomCell = textInfoPrivacyCell4;
            textInfoPrivacyCell4.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
            this.bottomCell.setText(LocaleController.getString("PassportScanPassportInfo", C0952R.string.PassportScanPassportInfo));
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
        }
        HeaderCell headerCell3 = new HeaderCell(context);
        this.headerCell = headerCell3;
        if (this.documentOnly) {
            headerCell3.setText(LocaleController.getString("PassportDocument", C0952R.string.PassportDocument));
        } else {
            headerCell3.setText(LocaleController.getString("PassportPersonal", C0952R.string.PassportPersonal));
        }
        this.headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
        int i2 = this.currentDocumentsType != null ? 9 : 7;
        this.inputFields = new EditTextBoldCursor[i2];
        int i3 = 0;
        while (true) {
            int i4 = 6;
            if (i3 < i2) {
                final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.inputFields[i3] = editTextBoldCursor;
                FrameLayout frameLayout = new FrameLayout(this, context) {
                    private StaticLayout errorLayout;
                    private float offsetX;

                    @Override
                    protected void onMeasure(int i5, int i6) {
                        int size = View.MeasureSpec.getSize(i5) - AndroidUtilities.m34dp(34.0f);
                        StaticLayout errorLayout = editTextBoldCursor.getErrorLayout(size);
                        this.errorLayout = errorLayout;
                        if (errorLayout != null) {
                            int lineCount = errorLayout.getLineCount();
                            int i7 = 0;
                            if (lineCount > 1) {
                                i6 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(64.0f) + (this.errorLayout.getLineBottom(lineCount - 1) - this.errorLayout.getLineBottom(0)), 1073741824);
                            }
                            if (LocaleController.isRTL) {
                                float f = 0.0f;
                                while (true) {
                                    if (i7 >= lineCount) {
                                        break;
                                    } else if (this.errorLayout.getLineLeft(i7) != 0.0f) {
                                        this.offsetX = 0.0f;
                                        break;
                                    } else {
                                        f = Math.max(f, this.errorLayout.getLineWidth(i7));
                                        if (i7 == lineCount - 1) {
                                            this.offsetX = size - f;
                                        }
                                        i7++;
                                    }
                                }
                            }
                        }
                        super.onMeasure(i5, i6);
                    }

                    @Override
                    protected void onDraw(Canvas canvas) {
                        if (this.errorLayout != null) {
                            canvas.save();
                            canvas.translate(AndroidUtilities.m34dp(21.0f) + this.offsetX, editTextBoldCursor.getLineY() + AndroidUtilities.m34dp(3.0f));
                            this.errorLayout.draw(canvas);
                            canvas.restore();
                        }
                    }
                };
                frameLayout.setWillNotDraw(false);
                this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(i, 64));
                frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                if (i3 == i2 - 1) {
                    View view = new View(context);
                    this.extraBackgroundView = view;
                    view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    this.linearLayout2.addView(this.extraBackgroundView, LayoutHelper.createLinear(i, 6));
                }
                if (this.documentOnly && this.currentDocumentsType != null) {
                    if (i3 < 7) {
                        frameLayout.setVisibility(8);
                        View view2 = this.extraBackgroundView;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                    }
                }
                this.inputFields[i3].setTag(Integer.valueOf(i3));
                this.inputFields[i3].setSupportRtlHint(true);
                this.inputFields[i3].setTextSize(1, 16.0f);
                this.inputFields[i3].setHintColor(Theme.getColor("windowBackgroundWhiteHintText"));
                this.inputFields[i3].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.inputFields[i3].setHeaderHintColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
                this.inputFields[i3].setTransformHintToHeader(true);
                this.inputFields[i3].setBackgroundDrawable(null);
                this.inputFields[i3].setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.inputFields[i3].setCursorSize(AndroidUtilities.m34dp(20.0f));
                this.inputFields[i3].setCursorWidth(1.5f);
                this.inputFields[i3].setLineColors(Theme.getColor("windowBackgroundWhiteInputField"), Theme.getColor("windowBackgroundWhiteInputFieldActivated"), Theme.getColor("windowBackgroundWhiteRedText3"));
                if (i3 == 5 || i3 == 6) {
                    this.inputFields[i3].setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public final boolean onTouch(View view3, MotionEvent motionEvent) {
                            boolean lambda$createIdentityInterface$46;
                            lambda$createIdentityInterface$46 = PassportActivity.this.lambda$createIdentityInterface$46(view3, motionEvent);
                            return lambda$createIdentityInterface$46;
                        }
                    });
                    this.inputFields[i3].setInputType(0);
                } else if (i3 == 3 || i3 == 8) {
                    this.inputFields[i3].setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public final boolean onTouch(View view3, MotionEvent motionEvent) {
                            boolean lambda$createIdentityInterface$49;
                            lambda$createIdentityInterface$49 = PassportActivity.this.lambda$createIdentityInterface$49(context, view3, motionEvent);
                            return lambda$createIdentityInterface$49;
                        }
                    });
                    this.inputFields[i3].setInputType(0);
                    this.inputFields[i3].setFocusable(false);
                } else if (i3 == 4) {
                    this.inputFields[i3].setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public final boolean onTouch(View view3, MotionEvent motionEvent) {
                            boolean lambda$createIdentityInterface$51;
                            lambda$createIdentityInterface$51 = PassportActivity.this.lambda$createIdentityInterface$51(view3, motionEvent);
                            return lambda$createIdentityInterface$51;
                        }
                    });
                    this.inputFields[i3].setInputType(0);
                    this.inputFields[i3].setFocusable(false);
                } else {
                    this.inputFields[i3].setInputType(16385);
                    this.inputFields[i3].setImeOptions(268435461);
                }
                switch (i3) {
                    case 0:
                        if (this.currentType.native_names) {
                            this.inputFields[i3].setHintText(LocaleController.getString("PassportNameLatin", C0952R.string.PassportNameLatin));
                        } else {
                            this.inputFields[i3].setHintText(LocaleController.getString("PassportName", C0952R.string.PassportName));
                        }
                        hashMap2 = this.currentValues;
                        str2 = "first_name";
                        break;
                    case 1:
                        if (this.currentType.native_names) {
                            this.inputFields[i3].setHintText(LocaleController.getString("PassportMidnameLatin", C0952R.string.PassportMidnameLatin));
                        } else {
                            this.inputFields[i3].setHintText(LocaleController.getString("PassportMidname", C0952R.string.PassportMidname));
                        }
                        hashMap2 = this.currentValues;
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (this.currentType.native_names) {
                            this.inputFields[i3].setHintText(LocaleController.getString("PassportSurnameLatin", C0952R.string.PassportSurnameLatin));
                        } else {
                            this.inputFields[i3].setHintText(LocaleController.getString("PassportSurname", C0952R.string.PassportSurname));
                        }
                        hashMap2 = this.currentValues;
                        str2 = "last_name";
                        break;
                    case 3:
                        this.inputFields[i3].setHintText(LocaleController.getString("PassportBirthdate", C0952R.string.PassportBirthdate));
                        hashMap2 = this.currentValues;
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.inputFields[i3].setHintText(LocaleController.getString("PassportGender", C0952R.string.PassportGender));
                        hashMap2 = this.currentValues;
                        str2 = "gender";
                        break;
                    case 5:
                        this.inputFields[i3].setHintText(LocaleController.getString("PassportCitizenship", C0952R.string.PassportCitizenship));
                        hashMap2 = this.currentValues;
                        str2 = "country_code";
                        break;
                    case 6:
                        this.inputFields[i3].setHintText(LocaleController.getString("PassportResidence", C0952R.string.PassportResidence));
                        hashMap2 = this.currentValues;
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.inputFields[i3].setHintText(LocaleController.getString("PassportDocumentNumber", C0952R.string.PassportDocumentNumber));
                        hashMap2 = this.currentDocumentValues;
                        str2 = "document_no";
                        break;
                    case 8:
                        this.inputFields[i3].setHintText(LocaleController.getString("PassportExpired", C0952R.string.PassportExpired));
                        hashMap2 = this.currentDocumentValues;
                        str2 = "expiry_date";
                        break;
                    default:
                        i3++;
                        i = -1;
                }
                setFieldValues(hashMap2, this.inputFields[i3], str2);
                EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
                editTextBoldCursorArr[i3].setSelection(editTextBoldCursorArr[i3].length());
                if (i3 == 0 || i3 == 2 || i3 == 1) {
                    this.inputFields[i3].addTextChangedListener(new TextWatcher() {
                        private boolean ignore;

                        @Override
                        public void beforeTextChanged(CharSequence charSequence2, int i5, int i6, int i7) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence2, int i5, int i6, int i7) {
                        }

                        @Override
                        public void afterTextChanged(Editable editable) {
                            boolean z2;
                            if (!this.ignore) {
                                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= editable.length()) {
                                        z2 = false;
                                        break;
                                    }
                                    char charAt = editable.charAt(i5);
                                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && !((charAt >= 'A' && charAt <= 'Z') || charAt == ' ' || charAt == '\'' || charAt == ',' || charAt == '.' || charAt == '&' || charAt == '-' || charAt == '/'))) {
                                        z2 = true;
                                        break;
                                    }
                                    i5++;
                                }
                                if (!z2 || PassportActivity.this.allowNonLatinName) {
                                    PassportActivity.this.nonLatinNames[intValue] = z2;
                                    PassportActivity.this.checkFieldForError(editTextBoldCursor, str2, editable, false);
                                    return;
                                }
                                editTextBoldCursor.setErrorText(LocaleController.getString("PassportUseLatinOnly", C0952R.string.PassportUseLatinOnly));
                            }
                        }
                    });
                } else {
                    this.inputFields[i3].addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence2, int i5, int i6, int i7) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence2, int i5, int i6, int i7) {
                        }

                        @Override
                        public void afterTextChanged(Editable editable) {
                            PassportActivity passportActivity = PassportActivity.this;
                            passportActivity.checkFieldForError(editTextBoldCursor, str2, editable, hashMap2 == passportActivity.currentDocumentValues);
                            int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                            EditTextBoldCursor editTextBoldCursor2 = PassportActivity.this.inputFields[intValue];
                            if (intValue == 6) {
                                PassportActivity.this.checkNativeFields(true);
                            }
                        }
                    });
                }
                this.inputFields[i3].setPadding(0, 0, 0, 0);
                this.inputFields[i3].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                frameLayout.addView(this.inputFields[i3], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.inputFields[i3].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                        boolean lambda$createIdentityInterface$52;
                        lambda$createIdentityInterface$52 = PassportActivity.this.lambda$createIdentityInterface$52(textView, i5, keyEvent);
                        return lambda$createIdentityInterface$52;
                    }
                });
                i3++;
                i = -1;
            } else {
                ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context);
                this.sectionCell2 = shadowSectionCell;
                this.linearLayout2.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
                HeaderCell headerCell4 = new HeaderCell(context);
                this.headerCell = headerCell4;
                headerCell4.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                int i5 = 3;
                this.inputExtraFields = new EditTextBoldCursor[3];
                int i6 = 0;
                while (i6 < i5) {
                    final EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
                    this.inputExtraFields[i6] = editTextBoldCursor2;
                    FrameLayout frameLayout2 = new FrameLayout(this, context) {
                        private StaticLayout errorLayout;
                        private float offsetX;

                        @Override
                        protected void onMeasure(int i7, int i8) {
                            int size = View.MeasureSpec.getSize(i7) - AndroidUtilities.m34dp(34.0f);
                            StaticLayout errorLayout = editTextBoldCursor2.getErrorLayout(size);
                            this.errorLayout = errorLayout;
                            if (errorLayout != null) {
                                int lineCount = errorLayout.getLineCount();
                                int i9 = 0;
                                if (lineCount > 1) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(64.0f) + (this.errorLayout.getLineBottom(lineCount - 1) - this.errorLayout.getLineBottom(0)), 1073741824);
                                }
                                if (LocaleController.isRTL) {
                                    float f = 0.0f;
                                    while (true) {
                                        if (i9 >= lineCount) {
                                            break;
                                        } else if (this.errorLayout.getLineLeft(i9) != 0.0f) {
                                            this.offsetX = 0.0f;
                                            break;
                                        } else {
                                            f = Math.max(f, this.errorLayout.getLineWidth(i9));
                                            if (i9 == lineCount - 1) {
                                                this.offsetX = size - f;
                                            }
                                            i9++;
                                        }
                                    }
                                }
                            }
                            super.onMeasure(i7, i8);
                        }

                        @Override
                        protected void onDraw(Canvas canvas) {
                            if (this.errorLayout != null) {
                                canvas.save();
                                canvas.translate(AndroidUtilities.m34dp(21.0f) + this.offsetX, editTextBoldCursor2.getLineY() + AndroidUtilities.m34dp(3.0f));
                                this.errorLayout.draw(canvas);
                                canvas.restore();
                            }
                        }
                    };
                    frameLayout2.setWillNotDraw(false);
                    this.linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-1, 64));
                    frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    if (i6 == 2) {
                        View view3 = new View(context);
                        this.extraBackgroundView2 = view3;
                        view3.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                        this.linearLayout2.addView(this.extraBackgroundView2, LayoutHelper.createLinear(-1, i4));
                    }
                    this.inputExtraFields[i6].setTag(Integer.valueOf(i6));
                    this.inputExtraFields[i6].setSupportRtlHint(true);
                    this.inputExtraFields[i6].setTextSize(1, 16.0f);
                    this.inputExtraFields[i6].setHintColor(Theme.getColor("windowBackgroundWhiteHintText"));
                    this.inputExtraFields[i6].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                    this.inputExtraFields[i6].setHeaderHintColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
                    this.inputExtraFields[i6].setTransformHintToHeader(true);
                    this.inputExtraFields[i6].setBackgroundDrawable(null);
                    this.inputExtraFields[i6].setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                    this.inputExtraFields[i6].setCursorSize(AndroidUtilities.m34dp(20.0f));
                    this.inputExtraFields[i6].setCursorWidth(1.5f);
                    this.inputExtraFields[i6].setLineColors(Theme.getColor("windowBackgroundWhiteInputField"), Theme.getColor("windowBackgroundWhiteInputFieldActivated"), Theme.getColor("windowBackgroundWhiteRedText3"));
                    this.inputExtraFields[i6].setInputType(16385);
                    this.inputExtraFields[i6].setImeOptions(268435461);
                    if (i6 == 0) {
                        hashMap = this.currentValues;
                        str = "first_name_native";
                    } else if (i6 == 1) {
                        hashMap = this.currentValues;
                        str = "middle_name_native";
                    } else if (i6 != 2) {
                        i6++;
                        i5 = 3;
                        i4 = 6;
                    } else {
                        hashMap = this.currentValues;
                        str = "last_name_native";
                    }
                    setFieldValues(hashMap, this.inputExtraFields[i6], str);
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.inputExtraFields;
                    editTextBoldCursorArr2[i6].setSelection(editTextBoldCursorArr2[i6].length());
                    if (i6 == 0 || i6 == 2 || i6 == 1) {
                        this.inputExtraFields[i6].addTextChangedListener(new TextWatcher() {
                            private boolean ignore;

                            @Override
                            public void beforeTextChanged(CharSequence charSequence2, int i7, int i8, int i9) {
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence2, int i7, int i8, int i9) {
                            }

                            @Override
                            public void afterTextChanged(Editable editable) {
                                if (!this.ignore) {
                                    PassportActivity.this.checkFieldForError(editTextBoldCursor2, str, editable, false);
                                }
                            }
                        });
                    }
                    this.inputExtraFields[i6].setPadding(0, 0, 0, 0);
                    this.inputExtraFields[i6].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    frameLayout2.addView(this.inputExtraFields[i6], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.inputExtraFields[i6].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
                            boolean lambda$createIdentityInterface$53;
                            lambda$createIdentityInterface$53 = PassportActivity.this.lambda$createIdentityInterface$53(textView, i7, keyEvent);
                            return lambda$createIdentityInterface$53;
                        }
                    });
                    i6++;
                    i5 = 3;
                    i4 = 6;
                }
                TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context);
                this.nativeInfoCell = textInfoPrivacyCell5;
                this.linearLayout2.addView(textInfoPrivacyCell5, LayoutHelper.createLinear(-1, -2));
                if (((this.currentBotId != 0 || this.currentDocumentsType == null) && this.currentTypeValue != null && !this.documentOnly) || this.currentDocumentsTypeValue != null) {
                    TLRPC$TL_secureValue tLRPC$TL_secureValue = this.currentDocumentsTypeValue;
                    if (tLRPC$TL_secureValue != null) {
                        addDocumentViews(tLRPC$TL_secureValue.files);
                        TLRPC$SecureFile tLRPC$SecureFile = this.currentDocumentsTypeValue.front_side;
                        if (tLRPC$SecureFile instanceof TLRPC$TL_secureFile) {
                            addDocumentViewInternal((TLRPC$TL_secureFile) tLRPC$SecureFile, 2);
                        }
                        TLRPC$SecureFile tLRPC$SecureFile2 = this.currentDocumentsTypeValue.reverse_side;
                        if (tLRPC$SecureFile2 instanceof TLRPC$TL_secureFile) {
                            addDocumentViewInternal((TLRPC$TL_secureFile) tLRPC$SecureFile2, 3);
                        }
                        TLRPC$SecureFile tLRPC$SecureFile3 = this.currentDocumentsTypeValue.selfie;
                        if (tLRPC$SecureFile3 instanceof TLRPC$TL_secureFile) {
                            addDocumentViewInternal((TLRPC$TL_secureFile) tLRPC$SecureFile3, 1);
                        }
                        addTranslationDocumentViews(this.currentDocumentsTypeValue.translation);
                    }
                    TextSettingsCell textSettingsCell3 = new TextSettingsCell(context);
                    textSettingsCell3.setTextColor(Theme.getColor("windowBackgroundWhiteRedText3"));
                    textSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                    if (this.currentDocumentsType == null) {
                        textSettingsCell3.setText(LocaleController.getString("PassportDeleteInfo", C0952R.string.PassportDeleteInfo), false);
                    } else {
                        textSettingsCell3.setText(LocaleController.getString("PassportDeleteDocument", C0952R.string.PassportDeleteDocument), false);
                    }
                    this.linearLayout2.addView(textSettingsCell3, LayoutHelper.createLinear(-1, -2));
                    textSettingsCell3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view4) {
                            PassportActivity.this.lambda$createIdentityInterface$54(view4);
                        }
                    });
                    this.nativeInfoCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                    ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context);
                    this.sectionCell = shadowSectionCell2;
                    shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                    this.linearLayout2.addView(this.sectionCell, LayoutHelper.createLinear(-1, -2));
                } else {
                    this.nativeInfoCell.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                }
                updateInterfaceStringsForDocumentType();
                checkNativeFields(false);
                return;
            }
        }
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
        if (Build.VERSION.SDK_INT < 23 || getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
            CameraScanActivity cameraScanActivity = new CameraScanActivity(0);
            cameraScanActivity.setDelegate(new CameraScanActivity.CameraScanActivityDelegate() {
                @Override
                public void didFindQr(String str) {
                    CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindQr(this, str);
                }

                @Override
                public boolean processQr(String str, Runnable runnable) {
                    return CameraScanActivity.CameraScanActivityDelegate.CC.$default$processQr(this, str, runnable);
                }

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
                            PassportActivity.this.inputFields[4].setText(LocaleController.getString("PassportMale", C0952R.string.PassportMale));
                        } else if (i == 2) {
                            PassportActivity.this.currentGender = "female";
                            PassportActivity.this.inputFields[4].setText(LocaleController.getString("PassportFemale", C0952R.string.PassportFemale));
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
                    if (result.birthDay > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                        PassportActivity.this.inputFields[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(result.birthDay), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                    }
                }
            });
            presentFragment(cameraScanActivity);
            return;
        }
        getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
    }

    public boolean lambda$createIdentityInterface$46(final View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() {
                @Override
                public final void didSelectCountry(CountrySelectActivity.Country country) {
                    PassportActivity.this.lambda$createIdentityInterface$45(view, country);
                }
            });
            presentFragment(countrySelectActivity);
        }
        return true;
    }

    public void lambda$createIdentityInterface$45(View view, CountrySelectActivity.Country country) {
        int intValue = ((Integer) view.getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = this.inputFields[intValue];
        if (intValue == 5) {
            this.currentCitizeship = country.shortname;
        } else {
            this.currentResidence = country.shortname;
        }
        editTextBoldCursor.setText(country.name);
    }

    public boolean lambda$createIdentityInterface$49(Context context, View view, MotionEvent motionEvent) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            Calendar calendar = Calendar.getInstance();
            calendar.get(1);
            calendar.get(2);
            calendar.get(5);
            try {
                final EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                final int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                if (intValue == 8) {
                    str = LocaleController.getString("PassportSelectExpiredDate", C0952R.string.PassportSelectExpiredDate);
                    i3 = 0;
                    i2 = 20;
                    i = 0;
                } else {
                    str = LocaleController.getString("PassportSelectBithdayDate", C0952R.string.PassportSelectBithdayDate);
                    i3 = -120;
                    i2 = 0;
                    i = -18;
                }
                String[] split = editTextBoldCursor.getText().toString().split("\\.");
                if (split.length == 3) {
                    i6 = Utilities.parseInt(split[0]).intValue();
                    i5 = Utilities.parseInt(split[1]).intValue();
                    i4 = Utilities.parseInt(split[2]).intValue();
                } else {
                    i6 = -1;
                    i5 = -1;
                    i4 = -1;
                }
                AlertDialog.Builder createDatePickerDialog = AlertsCreator.createDatePickerDialog(context, i3, i2, i, i6, i5, i4, str, intValue == 8, new AlertsCreator.DatePickerDelegate() {
                    @Override
                    public final void didSelectDate(int i7, int i8, int i9) {
                        PassportActivity.this.lambda$createIdentityInterface$47(intValue, editTextBoldCursor, i7, i8, i9);
                    }
                });
                if (intValue == 8) {
                    createDatePickerDialog.setNegativeButton(LocaleController.getString("PassportSelectNotExpire", C0952R.string.PassportSelectNotExpire), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            PassportActivity.this.lambda$createIdentityInterface$48(editTextBoldCursor, dialogInterface, i7);
                        }
                    });
                }
                showDialog(createDatePickerDialog.create());
            } catch (Exception e) {
                FileLog.m30e(e);
            }
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

    public void lambda$createIdentityInterface$48(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface, int i) {
        int[] iArr = this.currentExpireDate;
        iArr[2] = 0;
        iArr[1] = 0;
        iArr[0] = 0;
        editTextBoldCursor.setText(LocaleController.getString("PassportNoExpireDate", C0952R.string.PassportNoExpireDate));
    }

    public boolean lambda$createIdentityInterface$51(View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("PassportSelectGender", C0952R.string.PassportSelectGender));
            builder.setItems(new CharSequence[]{LocaleController.getString("PassportMale", C0952R.string.PassportMale), LocaleController.getString("PassportFemale", C0952R.string.PassportFemale)}, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PassportActivity.this.lambda$createIdentityInterface$50(dialogInterface, i);
                }
            });
            builder.setPositiveButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
            showDialog(builder.create());
        }
        return true;
    }

    public void lambda$createIdentityInterface$50(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            this.currentGender = "male";
            this.inputFields[4].setText(LocaleController.getString("PassportMale", C0952R.string.PassportMale));
        } else if (i == 1) {
            this.currentGender = "female";
            this.inputFields[4].setText(LocaleController.getString("PassportFemale", C0952R.string.PassportFemale));
        }
    }

    public boolean lambda$createIdentityInterface$52(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        int intValue = ((Integer) textView.getTag()).intValue() + 1;
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
        if (intValue < editTextBoldCursorArr.length) {
            if (editTextBoldCursorArr[intValue].isFocusable()) {
                this.inputFields[intValue].requestFocus();
            } else {
                this.inputFields[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
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
        int intValue = ((Integer) textView.getTag()).intValue() + 1;
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputExtraFields;
        if (intValue < editTextBoldCursorArr.length) {
            if (editTextBoldCursorArr[intValue].isFocusable()) {
                this.inputExtraFields[intValue].requestFocus();
            } else {
                this.inputExtraFields[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
        return true;
    }

    public void lambda$createIdentityInterface$54(View view) {
        createDocumentDeleteAlert();
    }

    private void updateInterfaceStringsForDocumentType() {
        TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType = this.currentDocumentsType;
        if (tLRPC$TL_secureRequiredType != null) {
            this.actionBar.setTitle(getTextForType(tLRPC$TL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(LocaleController.getString("PassportPersonal", C0952R.string.PassportPersonal));
        }
        updateUploadText(2);
        updateUploadText(3);
        updateUploadText(1);
        updateUploadText(4);
    }

    public void updateUploadText(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.updateUploadText(int):void");
    }

    private void checkTopErrorCell(boolean z) {
        String str;
        String str2;
        if (this.topErrorCell != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            if (this.fieldsErrors != null && ((z || this.errorsValues.containsKey("error_all")) && (str2 = this.fieldsErrors.get("error_all")) != null)) {
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor("windowBackgroundWhiteRedText3")), 0, spannableStringBuilder.length(), 33);
                this.topErrorCell.setText(spannableStringBuilder);
                this.topErrorCell.setVisibility(0);
            } else if (this.topErrorCell.getVisibility() != 8) {
                this.topErrorCell.setVisibility(8);
            }
        }
    }

    private void addDocumentViewInternal(TLRPC$TL_secureFile tLRPC$TL_secureFile, int i) {
        addDocumentView(new SecureDocument(getSecureDocumentKey(tLRPC$TL_secureFile.secret, tLRPC$TL_secureFile.file_hash), tLRPC$TL_secureFile, null, null, null), i);
    }

    private void addDocumentViews(ArrayList<TLRPC$SecureFile> arrayList) {
        this.documents.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$SecureFile tLRPC$SecureFile = arrayList.get(i);
            if (tLRPC$SecureFile instanceof TLRPC$TL_secureFile) {
                addDocumentViewInternal((TLRPC$TL_secureFile) tLRPC$SecureFile, 0);
            }
        }
    }

    private void addTranslationDocumentViews(ArrayList<TLRPC$SecureFile> arrayList) {
        this.translationDocuments.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$SecureFile tLRPC$SecureFile = arrayList.get(i);
            if (tLRPC$SecureFile instanceof TLRPC$TL_secureFile) {
                addDocumentViewInternal((TLRPC$TL_secureFile) tLRPC$SecureFile, 4);
            }
        }
    }

    private void setFieldValues(java.util.HashMap<java.lang.String, java.lang.String> r7, org.telegram.p009ui.Components.EditTextBoldCursor r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.setFieldValues(java.util.HashMap, org.telegram.ui.Components.EditTextBoldCursor, java.lang.String):void");
    }

    private void addDocumentView(final SecureDocument secureDocument, final int i) {
        String string;
        String str;
        String str2;
        HashMap<String, String> hashMap;
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
        if (getParentActivity() != null) {
            final SecureDocumentCell secureDocumentCell = new SecureDocumentCell(getParentActivity());
            secureDocumentCell.setTag(secureDocument);
            secureDocumentCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.documentsCells.put(secureDocument, secureDocumentCell);
            String documentHash = getDocumentHash(secureDocument);
            if (i == 1) {
                string = LocaleController.getString("PassportSelfie", C0952R.string.PassportSelfie);
                this.selfieLayout.addView(secureDocumentCell, LayoutHelper.createLinear(-1, -2));
                str = "selfie" + documentHash;
            } else if (i == 4) {
                string = LocaleController.getString("AttachPhoto", C0952R.string.AttachPhoto);
                this.translationLayout.addView(secureDocumentCell, LayoutHelper.createLinear(-1, -2));
                str = "translation" + documentHash;
            } else if (i == 2) {
                TLRPC$SecureValueType tLRPC$SecureValueType = this.currentDocumentsType.type;
                if ((tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePassport) || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeInternalPassport)) {
                    string = LocaleController.getString("PassportMainPage", C0952R.string.PassportMainPage);
                } else {
                    string = LocaleController.getString("PassportFrontSide", C0952R.string.PassportFrontSide);
                }
                this.frontLayout.addView(secureDocumentCell, LayoutHelper.createLinear(-1, -2));
                str = "front" + documentHash;
            } else if (i == 3) {
                string = LocaleController.getString("PassportReverseSide", C0952R.string.PassportReverseSide);
                this.reverseLayout.addView(secureDocumentCell, LayoutHelper.createLinear(-1, -2));
                str = "reverse" + documentHash;
            } else {
                string = LocaleController.getString("AttachPhoto", C0952R.string.AttachPhoto);
                this.documentsLayout.addView(secureDocumentCell, LayoutHelper.createLinear(-1, -2));
                str = "files" + documentHash;
            }
            final String str3 = str;
            if (str3 == null || (hashMap = this.documentsErrors) == null || (str2 = hashMap.get(str3)) == null) {
                str2 = LocaleController.formatDateForBan(secureDocument.secureFile.date);
            } else {
                secureDocumentCell.valueTextView.setTextColor(Theme.getColor("windowBackgroundWhiteRedText3"));
                this.errorsValues.put(str3, "");
            }
            secureDocumentCell.setTextAndValueAndImage(string, str2, secureDocument);
            secureDocumentCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PassportActivity.this.lambda$addDocumentView$55(i, view);
                }
            });
            secureDocumentCell.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    boolean lambda$addDocumentView$57;
                    lambda$addDocumentView$57 = PassportActivity.this.lambda$addDocumentView$57(i, secureDocument, secureDocumentCell, str3, view);
                    return lambda$addDocumentView$57;
                }
            });
        }
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
        PhotoViewer.getInstance().setParentActivity(getParentActivity());
        if (i == 1) {
            ArrayList<SecureDocument> arrayList = new ArrayList<>();
            arrayList.add(this.selfieDocument);
            PhotoViewer.getInstance().openPhoto(arrayList, 0, this.provider);
        } else if (i == 2) {
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

    public boolean lambda$addDocumentView$57(final int i, final SecureDocument secureDocument, final SecureDocumentCell secureDocumentCell, final String str, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        if (i == 1) {
            builder.setMessage(LocaleController.getString("PassportDeleteSelfie", C0952R.string.PassportDeleteSelfie));
        } else {
            builder.setMessage(LocaleController.getString("PassportDeleteScan", C0952R.string.PassportDeleteScan));
        }
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
        builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PassportActivity.this.lambda$addDocumentView$56(secureDocument, i, secureDocumentCell, str, dialogInterface, i2);
            }
        });
        showDialog(builder.create());
        return true;
    }

    public void lambda$addDocumentView$56(SecureDocument secureDocument, int i, SecureDocumentCell secureDocumentCell, String str, DialogInterface dialogInterface, int i2) {
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
            HashMap<String, String> hashMap = this.documentsErrors;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap<String, String> hashMap2 = this.errorsValues;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        updateUploadText(i);
        String str2 = secureDocument.path;
        if (str2 != null && this.uploadingDocuments.remove(str2) != null) {
            if (this.uploadingDocuments.isEmpty()) {
                this.doneItem.setEnabled(true);
                this.doneItem.setAlpha(1.0f);
            }
            FileLoader.getInstance(this.currentAccount).cancelFileUpload(secureDocument.path, false);
        }
    }

    private String getNameForType(TLRPC$SecureValueType tLRPC$SecureValueType) {
        return tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePersonalDetails ? "personal_details" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePassport ? "passport" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeInternalPassport ? "internal_passport" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeDriverLicense ? "driver_license" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeIdentityCard ? "identity_card" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeUtilityBill ? "utility_bill" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeAddress ? "address" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeBankStatement ? "bank_statement" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeRentalAgreement ? "rental_agreement" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeTemporaryRegistration ? "temporary_registration" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePassportRegistration ? "passport_registration" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeEmail ? "email" : tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePhone ? "phone" : "";
    }

    private TextDetailSecureCell getViewByType(TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType) {
        TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2;
        TextDetailSecureCell textDetailSecureCell = this.typesViews.get(tLRPC$TL_secureRequiredType);
        return (textDetailSecureCell != null || (tLRPC$TL_secureRequiredType2 = this.documentsToTypesLink.get(tLRPC$TL_secureRequiredType)) == null) ? textDetailSecureCell : this.typesViews.get(tLRPC$TL_secureRequiredType2);
    }

    private String getTextForType(TLRPC$SecureValueType tLRPC$SecureValueType) {
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePassport) {
            return LocaleController.getString("ActionBotDocumentPassport", C0952R.string.ActionBotDocumentPassport);
        }
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeDriverLicense) {
            return LocaleController.getString("ActionBotDocumentDriverLicence", C0952R.string.ActionBotDocumentDriverLicence);
        }
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeIdentityCard) {
            return LocaleController.getString("ActionBotDocumentIdentityCard", C0952R.string.ActionBotDocumentIdentityCard);
        }
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeUtilityBill) {
            return LocaleController.getString("ActionBotDocumentUtilityBill", C0952R.string.ActionBotDocumentUtilityBill);
        }
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeBankStatement) {
            return LocaleController.getString("ActionBotDocumentBankStatement", C0952R.string.ActionBotDocumentBankStatement);
        }
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeRentalAgreement) {
            return LocaleController.getString("ActionBotDocumentRentalAgreement", C0952R.string.ActionBotDocumentRentalAgreement);
        }
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeInternalPassport) {
            return LocaleController.getString("ActionBotDocumentInternalPassport", C0952R.string.ActionBotDocumentInternalPassport);
        }
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePassportRegistration) {
            return LocaleController.getString("ActionBotDocumentPassportRegistration", C0952R.string.ActionBotDocumentPassportRegistration);
        }
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeTemporaryRegistration) {
            return LocaleController.getString("ActionBotDocumentTemporaryRegistration", C0952R.string.ActionBotDocumentTemporaryRegistration);
        }
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePhone) {
            return LocaleController.getString("ActionBotDocumentPhone", C0952R.string.ActionBotDocumentPhone);
        }
        return tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeEmail ? LocaleController.getString("ActionBotDocumentEmail", C0952R.string.ActionBotDocumentEmail) : "";
    }

    public void setTypeValue(org.telegram.tgnet.TLRPC$TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC$TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.setTypeValue(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public void checkNativeFields(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.inputExtraFields != null) {
            String str = this.languageMap.get(this.currentResidence);
            String str2 = SharedConfig.getCountryLangs().get(this.currentResidence);
            int i = 0;
            if (this.currentType.native_names && !TextUtils.isEmpty(this.currentResidence) && !"EN".equals(str2)) {
                if (this.nativeInfoCell.getVisibility() != 0) {
                    this.nativeInfoCell.setVisibility(0);
                    this.headerCell.setVisibility(0);
                    this.extraBackgroundView2.setVisibility(0);
                    int i2 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.inputExtraFields;
                        if (i2 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i2].getParent()).setVisibility(0);
                        i2++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.inputExtraFields[1].length() == 0 && this.inputExtraFields[2].length() == 0) {
                        int i3 = 0;
                        while (true) {
                            boolean[] zArr = this.nonLatinNames;
                            if (i3 >= zArr.length) {
                                break;
                            } else if (zArr[i3]) {
                                this.inputExtraFields[0].setText(this.inputFields[0].getText());
                                this.inputExtraFields[1].setText(this.inputFields[1].getText());
                                this.inputExtraFields[2].setText(this.inputFields[2].getText());
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    this.sectionCell2.setBackgroundDrawable(Theme.getThemedDrawable(getParentActivity(), (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                }
                this.nativeInfoCell.setText(LocaleController.formatString("PassportNativeInfo", C0952R.string.PassportNativeInfo, str));
                String serverString = str2 != null ? LocaleController.getServerString("PassportLanguage_" + str2) : null;
                if (serverString != null) {
                    this.headerCell.setText(LocaleController.formatString("PassportNativeHeaderLang", C0952R.string.PassportNativeHeaderLang, serverString));
                } else {
                    this.headerCell.setText(LocaleController.getString("PassportNativeHeader", C0952R.string.PassportNativeHeader));
                }
                for (int i4 = 0; i4 < 3; i4++) {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                if (serverString != null) {
                                    this.inputExtraFields[i4].setHintText(LocaleController.getString("PassportSurname", C0952R.string.PassportSurname));
                                } else {
                                    this.inputExtraFields[i4].setHintText(LocaleController.formatString("PassportSurnameCountry", C0952R.string.PassportSurnameCountry, str));
                                }
                            }
                        } else if (serverString != null) {
                            this.inputExtraFields[i4].setHintText(LocaleController.getString("PassportMidname", C0952R.string.PassportMidname));
                        } else {
                            this.inputExtraFields[i4].setHintText(LocaleController.formatString("PassportMidnameCountry", C0952R.string.PassportMidnameCountry, str));
                        }
                    } else if (serverString != null) {
                        this.inputExtraFields[i4].setHintText(LocaleController.getString("PassportName", C0952R.string.PassportName));
                    } else {
                        this.inputExtraFields[i4].setHintText(LocaleController.formatString("PassportNameCountry", C0952R.string.PassportNameCountry, str));
                    }
                }
                if (z) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.this.lambda$checkNativeFields$58();
                        }
                    });
                }
            } else if (this.nativeInfoCell.getVisibility() != 8) {
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
                if (((this.currentBotId != 0 || this.currentDocumentsType == null) && this.currentTypeValue != null && !this.documentOnly) || this.currentDocumentsTypeValue != null) {
                    this.sectionCell2.setBackgroundDrawable(Theme.getThemedDrawable(getParentActivity(), (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                } else {
                    this.sectionCell2.setBackgroundDrawable(Theme.getThemedDrawable(getParentActivity(), (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                }
            }
        }
    }

    public void lambda$checkNativeFields$58() {
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputExtraFields;
        if (editTextBoldCursorArr != null) {
            scrollToField(editTextBoldCursorArr[0]);
        }
    }

    private TLRPC$TL_secureValue getValueByType(TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, boolean z) {
        String[] strArr;
        JSONObject jSONObject;
        if (tLRPC$TL_secureRequiredType == null) {
            return null;
        }
        int size = this.currentForm.values.size();
        for (int i = 0; i < size; i++) {
            TLRPC$TL_secureValue tLRPC$TL_secureValue = this.currentForm.values.get(i);
            if (tLRPC$TL_secureRequiredType.type.getClass() == tLRPC$TL_secureValue.type.getClass()) {
                if (z) {
                    if (tLRPC$TL_secureRequiredType.selfie_required && !(tLRPC$TL_secureValue.selfie instanceof TLRPC$TL_secureFile)) {
                        return null;
                    }
                    if (tLRPC$TL_secureRequiredType.translation_required && tLRPC$TL_secureValue.translation.isEmpty()) {
                        return null;
                    }
                    if (isAddressDocument(tLRPC$TL_secureRequiredType.type) && tLRPC$TL_secureValue.files.isEmpty()) {
                        return null;
                    }
                    if (isPersonalDocument(tLRPC$TL_secureRequiredType.type) && !(tLRPC$TL_secureValue.front_side instanceof TLRPC$TL_secureFile)) {
                        return null;
                    }
                    TLRPC$SecureValueType tLRPC$SecureValueType = tLRPC$TL_secureRequiredType.type;
                    if (((tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeDriverLicense) || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeIdentityCard)) && !(tLRPC$TL_secureValue.reverse_side instanceof TLRPC$TL_secureFile)) {
                        return null;
                    }
                    if ((tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePersonalDetails) || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeAddress)) {
                        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePersonalDetails) {
                            strArr = tLRPC$TL_secureRequiredType.native_names ? new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"};
                        } else {
                            strArr = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                        }
                        try {
                            TLRPC$TL_secureData tLRPC$TL_secureData = tLRPC$TL_secureValue.data;
                            jSONObject = new JSONObject(decryptData(tLRPC$TL_secureData.data, decryptValueSecret(tLRPC$TL_secureData.secret, tLRPC$TL_secureData.data_hash), tLRPC$TL_secureValue.data.data_hash));
                        } catch (Throwable unused) {
                        }
                        for (int i2 = 0; i2 < strArr.length; i2++) {
                            if (jSONObject.has(strArr[i2]) && !TextUtils.isEmpty(jSONObject.getString(strArr[i2]))) {
                            }
                            return null;
                        }
                    }
                }
                return tLRPC$TL_secureValue;
            }
        }
        return null;
    }

    private void openTypeActivity(TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2, ArrayList<TLRPC$TL_secureRequiredType> arrayList, final boolean z) {
        int i;
        TLRPC$TL_account_password tLRPC$TL_account_password;
        HashMap<String, String> hashMap;
        final int size = arrayList != null ? arrayList.size() : 0;
        final TLRPC$SecureValueType tLRPC$SecureValueType = tLRPC$TL_secureRequiredType.type;
        TLRPC$SecureValueType tLRPC$SecureValueType2 = tLRPC$TL_secureRequiredType2 != null ? tLRPC$TL_secureRequiredType2.type : null;
        if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePersonalDetails) {
            i = 1;
        } else if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeAddress) {
            i = 2;
        } else if (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePhone) {
            i = 3;
        } else {
            i = tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeEmail ? 4 : -1;
        }
        if (i != -1) {
            HashMap<String, String> hashMap2 = !z ? this.errorsMap.get(getNameForType(tLRPC$SecureValueType)) : null;
            HashMap<String, String> hashMap3 = this.errorsMap.get(getNameForType(tLRPC$SecureValueType2));
            TLRPC$TL_secureValue valueByType = getValueByType(tLRPC$TL_secureRequiredType, false);
            TLRPC$TL_secureValue valueByType2 = getValueByType(tLRPC$TL_secureRequiredType2, false);
            TLRPC$TL_account_authorizationForm tLRPC$TL_account_authorizationForm = this.currentForm;
            TLRPC$TL_account_password tLRPC$TL_account_password2 = this.currentPassword;
            HashMap<String, String> hashMap4 = this.typesValues.get(tLRPC$TL_secureRequiredType);
            if (tLRPC$TL_secureRequiredType2 != null) {
                hashMap = this.typesValues.get(tLRPC$TL_secureRequiredType2);
                tLRPC$TL_account_password = tLRPC$TL_account_password2;
            } else {
                tLRPC$TL_account_password = tLRPC$TL_account_password2;
                hashMap = null;
            }
            int i2 = i;
            PassportActivity passportActivity = new PassportActivity(i, tLRPC$TL_account_authorizationForm, tLRPC$TL_account_password, tLRPC$TL_secureRequiredType, valueByType, tLRPC$TL_secureRequiredType2, valueByType2, hashMap4, hashMap);
            passportActivity.delegate = new PassportActivityDelegate() {
                private TLRPC$InputSecureFile getInputSecureFile(SecureDocument secureDocument) {
                    if (secureDocument.inputFile != null) {
                        TLRPC$TL_inputSecureFileUploaded tLRPC$TL_inputSecureFileUploaded = new TLRPC$TL_inputSecureFileUploaded();
                        TLRPC$TL_inputFile tLRPC$TL_inputFile = secureDocument.inputFile;
                        tLRPC$TL_inputSecureFileUploaded.f919id = tLRPC$TL_inputFile.f871id;
                        tLRPC$TL_inputSecureFileUploaded.parts = tLRPC$TL_inputFile.parts;
                        tLRPC$TL_inputSecureFileUploaded.md5_checksum = tLRPC$TL_inputFile.md5_checksum;
                        tLRPC$TL_inputSecureFileUploaded.file_hash = secureDocument.fileHash;
                        tLRPC$TL_inputSecureFileUploaded.secret = secureDocument.fileSecret;
                        return tLRPC$TL_inputSecureFileUploaded;
                    }
                    TLRPC$TL_inputSecureFile tLRPC$TL_inputSecureFile = new TLRPC$TL_inputSecureFile();
                    TLRPC$TL_secureFile tLRPC$TL_secureFile = secureDocument.secureFile;
                    tLRPC$TL_inputSecureFile.f918id = tLRPC$TL_secureFile.f971id;
                    tLRPC$TL_inputSecureFile.access_hash = tLRPC$TL_secureFile.access_hash;
                    return tLRPC$TL_inputSecureFile;
                }

                public void renameFile(SecureDocument secureDocument, TLRPC$TL_secureFile tLRPC$TL_secureFile) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(secureDocument);
                    File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$TL_secureFile);
                    pathToAttach.renameTo(pathToAttach2);
                    ImageLoader.getInstance().replaceImageInCache(secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.f971id, tLRPC$TL_secureFile.dc_id + "_" + tLRPC$TL_secureFile.f971id, null, false);
                }

                @Override
                public void saveValue(TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType3, String str, String str2, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType4, String str3, ArrayList<SecureDocument> arrayList2, SecureDocument secureDocument, ArrayList<SecureDocument> arrayList3, SecureDocument secureDocument2, SecureDocument secureDocument3, Runnable runnable, ErrorRunnable errorRunnable) {
                    TLRPC$TL_inputSecureValue tLRPC$TL_inputSecureValue;
                    TLRPC$TL_inputSecureValue tLRPC$TL_inputSecureValue2;
                    TLRPC$TL_securePlainPhone tLRPC$TL_securePlainPhone;
                    if (!TextUtils.isEmpty(str2)) {
                        tLRPC$TL_inputSecureValue = new TLRPC$TL_inputSecureValue();
                        tLRPC$TL_inputSecureValue.type = tLRPC$TL_secureRequiredType3.type;
                        tLRPC$TL_inputSecureValue.flags |= 1;
                        EncryptionResult encryptData = PassportActivity.this.encryptData(AndroidUtilities.getStringBytes(str2));
                        TLRPC$TL_secureData tLRPC$TL_secureData = new TLRPC$TL_secureData();
                        tLRPC$TL_inputSecureValue.data = tLRPC$TL_secureData;
                        tLRPC$TL_secureData.data = encryptData.encryptedData;
                        tLRPC$TL_secureData.data_hash = encryptData.fileHash;
                        tLRPC$TL_secureData.secret = encryptData.fileSecret;
                    } else if (!TextUtils.isEmpty(str)) {
                        TLRPC$SecureValueType tLRPC$SecureValueType3 = tLRPC$SecureValueType;
                        if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeEmail) {
                            TLRPC$TL_securePlainEmail tLRPC$TL_securePlainEmail = new TLRPC$TL_securePlainEmail();
                            tLRPC$TL_securePlainEmail.email = str;
                            tLRPC$TL_securePlainPhone = tLRPC$TL_securePlainEmail;
                        } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypePhone) {
                            TLRPC$TL_securePlainPhone tLRPC$TL_securePlainPhone2 = new TLRPC$TL_securePlainPhone();
                            tLRPC$TL_securePlainPhone2.phone = str;
                            tLRPC$TL_securePlainPhone = tLRPC$TL_securePlainPhone2;
                        } else {
                            return;
                        }
                        TLRPC$TL_inputSecureValue tLRPC$TL_inputSecureValue3 = new TLRPC$TL_inputSecureValue();
                        tLRPC$TL_inputSecureValue3.type = tLRPC$TL_secureRequiredType3.type;
                        tLRPC$TL_inputSecureValue3.flags |= 32;
                        tLRPC$TL_inputSecureValue3.plain_data = tLRPC$TL_securePlainPhone;
                        tLRPC$TL_inputSecureValue = tLRPC$TL_inputSecureValue3;
                    } else {
                        tLRPC$TL_inputSecureValue = null;
                    }
                    if (z || tLRPC$TL_inputSecureValue != null) {
                        if (tLRPC$TL_secureRequiredType4 != null) {
                            TLRPC$TL_inputSecureValue tLRPC$TL_inputSecureValue4 = new TLRPC$TL_inputSecureValue();
                            tLRPC$TL_inputSecureValue4.type = tLRPC$TL_secureRequiredType4.type;
                            if (!TextUtils.isEmpty(str3)) {
                                tLRPC$TL_inputSecureValue4.flags |= 1;
                                EncryptionResult encryptData2 = PassportActivity.this.encryptData(AndroidUtilities.getStringBytes(str3));
                                TLRPC$TL_secureData tLRPC$TL_secureData2 = new TLRPC$TL_secureData();
                                tLRPC$TL_inputSecureValue4.data = tLRPC$TL_secureData2;
                                tLRPC$TL_secureData2.data = encryptData2.encryptedData;
                                tLRPC$TL_secureData2.data_hash = encryptData2.fileHash;
                                tLRPC$TL_secureData2.secret = encryptData2.fileSecret;
                            }
                            if (secureDocument2 != null) {
                                tLRPC$TL_inputSecureValue4.front_side = getInputSecureFile(secureDocument2);
                                tLRPC$TL_inputSecureValue4.flags |= 2;
                            }
                            if (secureDocument3 != null) {
                                tLRPC$TL_inputSecureValue4.reverse_side = getInputSecureFile(secureDocument3);
                                tLRPC$TL_inputSecureValue4.flags |= 4;
                            }
                            if (secureDocument != null) {
                                tLRPC$TL_inputSecureValue4.selfie = getInputSecureFile(secureDocument);
                                tLRPC$TL_inputSecureValue4.flags |= 8;
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                tLRPC$TL_inputSecureValue4.flags |= 64;
                                int size2 = arrayList3.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    tLRPC$TL_inputSecureValue4.translation.add(getInputSecureFile(arrayList3.get(i3)));
                                }
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                tLRPC$TL_inputSecureValue4.flags |= 16;
                                int size3 = arrayList2.size();
                                for (int i4 = 0; i4 < size3; i4++) {
                                    tLRPC$TL_inputSecureValue4.files.add(getInputSecureFile(arrayList2.get(i4)));
                                }
                            }
                            if (z) {
                                tLRPC$TL_inputSecureValue = tLRPC$TL_inputSecureValue4;
                            } else {
                                tLRPC$TL_inputSecureValue2 = tLRPC$TL_inputSecureValue4;
                                TLRPC$TL_account_saveSecureValue tLRPC$TL_account_saveSecureValue = new TLRPC$TL_account_saveSecureValue();
                                tLRPC$TL_account_saveSecureValue.value = tLRPC$TL_inputSecureValue;
                                tLRPC$TL_account_saveSecureValue.secure_secret_id = PassportActivity.this.secureSecretId;
                                ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tLRPC$TL_account_saveSecureValue, new C31781(errorRunnable, str, tLRPC$TL_account_saveSecureValue, tLRPC$TL_secureRequiredType4, tLRPC$TL_secureRequiredType3, arrayList2, secureDocument, secureDocument2, secureDocument3, arrayList3, str2, str3, runnable, this, tLRPC$TL_inputSecureValue2));
                            }
                        }
                        tLRPC$TL_inputSecureValue2 = null;
                        TLRPC$TL_account_saveSecureValue tLRPC$TL_account_saveSecureValue2 = new TLRPC$TL_account_saveSecureValue();
                        tLRPC$TL_account_saveSecureValue2.value = tLRPC$TL_inputSecureValue;
                        tLRPC$TL_account_saveSecureValue2.secure_secret_id = PassportActivity.this.secureSecretId;
                        ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tLRPC$TL_account_saveSecureValue2, new C31781(errorRunnable, str, tLRPC$TL_account_saveSecureValue2, tLRPC$TL_secureRequiredType4, tLRPC$TL_secureRequiredType3, arrayList2, secureDocument, secureDocument2, secureDocument3, arrayList3, str2, str3, runnable, this, tLRPC$TL_inputSecureValue2));
                    } else if (errorRunnable != null) {
                        errorRunnable.onError(null, null);
                    }
                }

                public class C31781 implements RequestDelegate {
                    final PassportActivityDelegate val$currentDelegate;
                    final TLRPC$TL_secureRequiredType val$documentRequiredType;
                    final ArrayList val$documents;
                    final String val$documentsJson;
                    final ErrorRunnable val$errorRunnable;
                    final TLRPC$TL_inputSecureValue val$finalFileInputSecureValue;
                    final Runnable val$finishRunnable;
                    final SecureDocument val$front;
                    final String val$json;
                    final TLRPC$TL_account_saveSecureValue val$req;
                    final TLRPC$TL_secureRequiredType val$requiredType;
                    final SecureDocument val$reverse;
                    final SecureDocument val$selfie;
                    final String val$text;
                    final ArrayList val$translationDocuments;

                    C31781(ErrorRunnable errorRunnable, String str, TLRPC$TL_account_saveSecureValue tLRPC$TL_account_saveSecureValue, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, PassportActivityDelegate passportActivityDelegate, TLRPC$TL_inputSecureValue tLRPC$TL_inputSecureValue) {
                        this.val$errorRunnable = errorRunnable;
                        this.val$text = str;
                        this.val$req = tLRPC$TL_account_saveSecureValue;
                        this.val$documentRequiredType = tLRPC$TL_secureRequiredType;
                        this.val$requiredType = tLRPC$TL_secureRequiredType2;
                        this.val$documents = arrayList;
                        this.val$selfie = secureDocument;
                        this.val$front = secureDocument2;
                        this.val$reverse = secureDocument3;
                        this.val$translationDocuments = arrayList2;
                        this.val$json = str2;
                        this.val$documentsJson = str3;
                        this.val$finishRunnable = runnable;
                        this.val$currentDelegate = passportActivityDelegate;
                        this.val$finalFileInputSecureValue = tLRPC$TL_inputSecureValue;
                    }

                    public void lambda$run$4(final TLRPC$TL_error tLRPC$TL_error, final TLRPC$TL_secureValue tLRPC$TL_secureValue, final TLRPC$TL_secureValue tLRPC$TL_secureValue2) {
                        final ErrorRunnable errorRunnable = this.val$errorRunnable;
                        final String str = this.val$text;
                        final TLRPC$TL_account_saveSecureValue tLRPC$TL_account_saveSecureValue = this.val$req;
                        C317720 r15 = C317720.this;
                        final boolean z = z;
                        final TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType = this.val$documentRequiredType;
                        final TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2 = this.val$requiredType;
                        final ArrayList arrayList = this.val$documents;
                        final SecureDocument secureDocument = this.val$selfie;
                        final SecureDocument secureDocument2 = this.val$front;
                        final SecureDocument secureDocument3 = this.val$reverse;
                        final ArrayList arrayList2 = this.val$translationDocuments;
                        final String str2 = this.val$json;
                        final String str3 = this.val$documentsJson;
                        final int i = size;
                        final Runnable runnable = this.val$finishRunnable;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                PassportActivity.C317720.C31781.this.lambda$onResult$0(tLRPC$TL_error, errorRunnable, str, tLRPC$TL_account_saveSecureValue, z, tLRPC$TL_secureRequiredType, tLRPC$TL_secureRequiredType2, tLRPC$TL_secureValue, tLRPC$TL_secureValue2, arrayList, secureDocument, secureDocument2, secureDocument3, arrayList2, str2, str3, i, runnable);
                            }
                        });
                    }

                    public void lambda$onResult$0(TLRPC$TL_error tLRPC$TL_error, ErrorRunnable errorRunnable, String str, TLRPC$TL_account_saveSecureValue tLRPC$TL_account_saveSecureValue, boolean z, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2, TLRPC$TL_secureValue tLRPC$TL_secureValue, TLRPC$TL_secureValue tLRPC$TL_secureValue2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, int i, Runnable runnable) {
                        int i2;
                        if (tLRPC$TL_error != null) {
                            if (errorRunnable != null) {
                                errorRunnable.onError(tLRPC$TL_error.text, str);
                            }
                            AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tLRPC$TL_error, PassportActivity.this, tLRPC$TL_account_saveSecureValue, str);
                            return;
                        }
                        if (!z) {
                            PassportActivity.this.removeValue(tLRPC$TL_secureRequiredType2);
                            PassportActivity.this.removeValue(tLRPC$TL_secureRequiredType);
                        } else if (tLRPC$TL_secureRequiredType != null) {
                            PassportActivity.this.removeValue(tLRPC$TL_secureRequiredType);
                        } else {
                            PassportActivity.this.removeValue(tLRPC$TL_secureRequiredType2);
                        }
                        if (tLRPC$TL_secureValue != null) {
                            PassportActivity.this.currentForm.values.add(tLRPC$TL_secureValue);
                        }
                        if (tLRPC$TL_secureValue2 != null) {
                            PassportActivity.this.currentForm.values.add(tLRPC$TL_secureValue2);
                        }
                        if (arrayList != null && !arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                SecureDocument secureDocument4 = (SecureDocument) arrayList.get(i3);
                                if (secureDocument4.inputFile != null) {
                                    int size2 = tLRPC$TL_secureValue.files.size();
                                    int i4 = 0;
                                    while (i4 < size2) {
                                        TLRPC$SecureFile tLRPC$SecureFile = tLRPC$TL_secureValue.files.get(i4);
                                        i2 = size;
                                        if (tLRPC$SecureFile instanceof TLRPC$TL_secureFile) {
                                            TLRPC$TL_secureFile tLRPC$TL_secureFile = (TLRPC$TL_secureFile) tLRPC$SecureFile;
                                            if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tLRPC$TL_secureFile.secret, 0)) {
                                                renameFile(secureDocument4, tLRPC$TL_secureFile);
                                                break;
                                            }
                                        }
                                        i4++;
                                        size = i2;
                                    }
                                }
                                i2 = size;
                                i3++;
                                size = i2;
                            }
                        }
                        if (!(secureDocument == null || secureDocument.inputFile == null)) {
                            TLRPC$SecureFile tLRPC$SecureFile2 = tLRPC$TL_secureValue.selfie;
                            if (tLRPC$SecureFile2 instanceof TLRPC$TL_secureFile) {
                                TLRPC$TL_secureFile tLRPC$TL_secureFile2 = (TLRPC$TL_secureFile) tLRPC$SecureFile2;
                                if (Utilities.arraysEquals(secureDocument.fileSecret, 0, tLRPC$TL_secureFile2.secret, 0)) {
                                    renameFile(secureDocument, tLRPC$TL_secureFile2);
                                }
                            }
                        }
                        if (!(secureDocument2 == null || secureDocument2.inputFile == null)) {
                            TLRPC$SecureFile tLRPC$SecureFile3 = tLRPC$TL_secureValue.front_side;
                            if (tLRPC$SecureFile3 instanceof TLRPC$TL_secureFile) {
                                TLRPC$TL_secureFile tLRPC$TL_secureFile3 = (TLRPC$TL_secureFile) tLRPC$SecureFile3;
                                if (Utilities.arraysEquals(secureDocument2.fileSecret, 0, tLRPC$TL_secureFile3.secret, 0)) {
                                    renameFile(secureDocument2, tLRPC$TL_secureFile3);
                                }
                            }
                        }
                        if (!(secureDocument3 == null || secureDocument3.inputFile == null)) {
                            TLRPC$SecureFile tLRPC$SecureFile4 = tLRPC$TL_secureValue.reverse_side;
                            if (tLRPC$SecureFile4 instanceof TLRPC$TL_secureFile) {
                                TLRPC$TL_secureFile tLRPC$TL_secureFile4 = (TLRPC$TL_secureFile) tLRPC$SecureFile4;
                                if (Utilities.arraysEquals(secureDocument3.fileSecret, 0, tLRPC$TL_secureFile4.secret, 0)) {
                                    renameFile(secureDocument3, tLRPC$TL_secureFile4);
                                }
                            }
                        }
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int size3 = arrayList2.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                SecureDocument secureDocument5 = (SecureDocument) arrayList2.get(i5);
                                if (secureDocument5.inputFile != null) {
                                    int size4 = tLRPC$TL_secureValue.translation.size();
                                    for (int i6 = 0; i6 < size4; i6++) {
                                        TLRPC$SecureFile tLRPC$SecureFile5 = tLRPC$TL_secureValue.translation.get(i6);
                                        if (tLRPC$SecureFile5 instanceof TLRPC$TL_secureFile) {
                                            TLRPC$TL_secureFile tLRPC$TL_secureFile5 = (TLRPC$TL_secureFile) tLRPC$SecureFile5;
                                            if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tLRPC$TL_secureFile5.secret, 0)) {
                                                renameFile(secureDocument5, tLRPC$TL_secureFile5);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        PassportActivity.this.setTypeValue(tLRPC$TL_secureRequiredType2, str, str2, tLRPC$TL_secureRequiredType, str3, z, i);
                        if (runnable != null) {
                            runnable.run();
                        }
                    }

                    @Override
                    public void run(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                        if (tLRPC$TL_error != null) {
                            if (tLRPC$TL_error.text.equals("EMAIL_VERIFICATION_NEEDED")) {
                                TLRPC$TL_account_sendVerifyEmailCode tLRPC$TL_account_sendVerifyEmailCode = new TLRPC$TL_account_sendVerifyEmailCode();
                                tLRPC$TL_account_sendVerifyEmailCode.email = this.val$text;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount);
                                final String str = this.val$text;
                                final TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType = this.val$requiredType;
                                final PassportActivityDelegate passportActivityDelegate = this.val$currentDelegate;
                                final ErrorRunnable errorRunnable = this.val$errorRunnable;
                                connectionsManager.sendRequest(tLRPC$TL_account_sendVerifyEmailCode, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                                        PassportActivity.C317720.C31781.this.lambda$run$2(str, tLRPC$TL_secureRequiredType, passportActivityDelegate, errorRunnable, tLObject2, tLRPC$TL_error2);
                                    }
                                });
                                return;
                            } else if (tLRPC$TL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                                final ErrorRunnable errorRunnable2 = this.val$errorRunnable;
                                final String str2 = this.val$text;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        PassportActivity.C317720.C31781.lambda$run$3(PassportActivity.ErrorRunnable.this, tLRPC$TL_error, str2);
                                    }
                                });
                                return;
                            }
                        }
                        if (tLRPC$TL_error != null || this.val$finalFileInputSecureValue == null) {
                            lambda$run$4(tLRPC$TL_error, (TLRPC$TL_secureValue) tLObject, null);
                            return;
                        }
                        final TLRPC$TL_secureValue tLRPC$TL_secureValue = (TLRPC$TL_secureValue) tLObject;
                        TLRPC$TL_account_saveSecureValue tLRPC$TL_account_saveSecureValue = new TLRPC$TL_account_saveSecureValue();
                        tLRPC$TL_account_saveSecureValue.value = this.val$finalFileInputSecureValue;
                        tLRPC$TL_account_saveSecureValue.secure_secret_id = PassportActivity.this.secureSecretId;
                        ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tLRPC$TL_account_saveSecureValue, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                                PassportActivity.C317720.C31781.this.lambda$run$4(tLRPC$TL_secureValue, tLObject2, tLRPC$TL_error2);
                            }
                        });
                    }

                    public void lambda$run$2(final String str, final TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, final PassportActivityDelegate passportActivityDelegate, final ErrorRunnable errorRunnable, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                PassportActivity.C317720.C31781.this.lambda$run$1(tLObject, str, tLRPC$TL_secureRequiredType, passportActivityDelegate, tLRPC$TL_error, errorRunnable);
                            }
                        });
                    }

                    public void lambda$run$1(TLObject tLObject, String str, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, PassportActivityDelegate passportActivityDelegate, TLRPC$TL_error tLRPC$TL_error, ErrorRunnable errorRunnable) {
                        if (tLObject != null) {
                            TLRPC$TL_account_sentEmailCode tLRPC$TL_account_sentEmailCode = (TLRPC$TL_account_sentEmailCode) tLObject;
                            HashMap hashMap = new HashMap();
                            hashMap.put("email", str);
                            hashMap.put("pattern", tLRPC$TL_account_sentEmailCode.email_pattern);
                            PassportActivity passportActivity = new PassportActivity(6, PassportActivity.this.currentForm, PassportActivity.this.currentPassword, tLRPC$TL_secureRequiredType, (TLRPC$TL_secureValue) null, (TLRPC$TL_secureRequiredType) null, (TLRPC$TL_secureValue) null, hashMap, (HashMap<String, String>) null);
                            ((BaseFragment) passportActivity).currentAccount = ((BaseFragment) PassportActivity.this).currentAccount;
                            passportActivity.emailCodeLength = tLRPC$TL_account_sentEmailCode.length;
                            passportActivity.saltedPassword = PassportActivity.this.saltedPassword;
                            passportActivity.secureSecret = PassportActivity.this.secureSecret;
                            passportActivity.delegate = passportActivityDelegate;
                            PassportActivity.this.presentFragment(passportActivity, true);
                            return;
                        }
                        PassportActivity.this.showAlertWithText(LocaleController.getString("PassportEmail", C0952R.string.PassportEmail), tLRPC$TL_error.text);
                        if (errorRunnable != null) {
                            errorRunnable.onError(tLRPC$TL_error.text, str);
                        }
                    }

                    public static void lambda$run$3(ErrorRunnable errorRunnable, TLRPC$TL_error tLRPC$TL_error, String str) {
                        errorRunnable.onError(tLRPC$TL_error.text, str);
                    }
                }

                @Override
                public SecureDocument saveFile(TLRPC$TL_secureFile tLRPC$TL_secureFile) {
                    String str = FileLoader.getDirectory(4) + "/" + tLRPC$TL_secureFile.dc_id + "_" + tLRPC$TL_secureFile.f971id + ".jpg";
                    EncryptionResult createSecureDocument = PassportActivity.this.createSecureDocument(str);
                    return new SecureDocument(createSecureDocument.secureDocumentKey, tLRPC$TL_secureFile, str, createSecureDocument.fileHash, createSecureDocument.fileSecret);
                }

                @Override
                public void deleteValue(TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType3, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType4, ArrayList<TLRPC$TL_secureRequiredType> arrayList2, boolean z2, Runnable runnable, ErrorRunnable errorRunnable) {
                    PassportActivity.this.deleteValueInternal(tLRPC$TL_secureRequiredType3, tLRPC$TL_secureRequiredType4, arrayList2, z2, runnable, errorRunnable, z);
                }
            };
            passportActivity.currentAccount = this.currentAccount;
            passportActivity.saltedPassword = this.saltedPassword;
            passportActivity.secureSecret = this.secureSecret;
            passportActivity.currentBotId = this.currentBotId;
            passportActivity.fieldsErrors = hashMap2;
            passportActivity.documentOnly = z;
            passportActivity.documentsErrors = hashMap3;
            passportActivity.availableDocumentTypes = arrayList;
            if (i2 == 4) {
                passportActivity.currentEmail = this.currentEmail;
            }
            presentFragment(passportActivity);
        }
    }

    public TLRPC$TL_secureValue removeValue(TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType) {
        if (tLRPC$TL_secureRequiredType == null) {
            return null;
        }
        int size = this.currentForm.values.size();
        for (int i = 0; i < size; i++) {
            if (tLRPC$TL_secureRequiredType.type.getClass() == this.currentForm.values.get(i).type.getClass()) {
                return this.currentForm.values.remove(i);
            }
        }
        return null;
    }

    public void deleteValueInternal(final TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, final TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2, final ArrayList<TLRPC$TL_secureRequiredType> arrayList, final boolean z, final Runnable runnable, final ErrorRunnable errorRunnable, final boolean z2) {
        if (tLRPC$TL_secureRequiredType != null) {
            TLRPC$TL_account_deleteSecureValue tLRPC$TL_account_deleteSecureValue = new TLRPC$TL_account_deleteSecureValue();
            if (!z2 || tLRPC$TL_secureRequiredType2 == null) {
                if (z) {
                    tLRPC$TL_account_deleteSecureValue.types.add(tLRPC$TL_secureRequiredType.type);
                }
                if (tLRPC$TL_secureRequiredType2 != null) {
                    tLRPC$TL_account_deleteSecureValue.types.add(tLRPC$TL_secureRequiredType2.type);
                }
            } else {
                tLRPC$TL_account_deleteSecureValue.types.add(tLRPC$TL_secureRequiredType2.type);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_deleteSecureValue, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    PassportActivity.this.lambda$deleteValueInternal$60(errorRunnable, z2, tLRPC$TL_secureRequiredType2, tLRPC$TL_secureRequiredType, z, arrayList, runnable, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$deleteValueInternal$60(final ErrorRunnable errorRunnable, final boolean z, final TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, final TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2, final boolean z2, final ArrayList arrayList, final Runnable runnable, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PassportActivity.this.lambda$deleteValueInternal$59(tLRPC$TL_error, errorRunnable, z, tLRPC$TL_secureRequiredType, tLRPC$TL_secureRequiredType2, z2, arrayList, runnable);
            }
        });
    }

    public void lambda$deleteValueInternal$59(TLRPC$TL_error tLRPC$TL_error, ErrorRunnable errorRunnable, boolean z, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2, boolean z2, ArrayList arrayList, Runnable runnable) {
        String str;
        TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType3;
        TLRPC$TL_secureData tLRPC$TL_secureData;
        String str2;
        LinearLayout linearLayout;
        String str3 = null;
        if (tLRPC$TL_error != null) {
            if (errorRunnable != null) {
                errorRunnable.onError(tLRPC$TL_error.text, null);
            }
            showAlertWithText(LocaleController.getString("AppName", C0952R.string.AppName), tLRPC$TL_error.text);
            return;
        }
        if (!z) {
            if (z2) {
                removeValue(tLRPC$TL_secureRequiredType2);
            }
            removeValue(tLRPC$TL_secureRequiredType);
        } else if (tLRPC$TL_secureRequiredType != null) {
            removeValue(tLRPC$TL_secureRequiredType);
        } else {
            removeValue(tLRPC$TL_secureRequiredType2);
        }
        if (this.currentActivityType == 8) {
            TextDetailSecureCell remove = this.typesViews.remove(tLRPC$TL_secureRequiredType2);
            if (remove != null) {
                this.linearLayout2.removeView(remove);
                View childAt = this.linearLayout2.getChildAt(linearLayout.getChildCount() - 6);
                if (childAt instanceof TextDetailSecureCell) {
                    ((TextDetailSecureCell) childAt).setNeedDivider(false);
                }
            }
            updateManageVisibility();
        } else {
            if (tLRPC$TL_secureRequiredType == null || arrayList == null || arrayList.size() <= 1) {
                tLRPC$TL_secureRequiredType3 = tLRPC$TL_secureRequiredType;
                str = null;
            } else {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        tLRPC$TL_secureRequiredType3 = tLRPC$TL_secureRequiredType;
                        break;
                    }
                    tLRPC$TL_secureRequiredType3 = (TLRPC$TL_secureRequiredType) arrayList.get(i);
                    TLRPC$TL_secureValue valueByType = getValueByType(tLRPC$TL_secureRequiredType3, false);
                    if (valueByType != null) {
                        TLRPC$TL_secureData tLRPC$TL_secureData2 = valueByType.data;
                        if (tLRPC$TL_secureData2 != null) {
                            str2 = decryptData(tLRPC$TL_secureData2.data, decryptValueSecret(tLRPC$TL_secureData2.secret, tLRPC$TL_secureData2.data_hash), valueByType.data.data_hash);
                        }
                    } else {
                        i++;
                    }
                }
                str2 = null;
                if (tLRPC$TL_secureRequiredType3 == null) {
                    tLRPC$TL_secureRequiredType3 = (TLRPC$TL_secureRequiredType) arrayList.get(0);
                    str = str2;
                } else {
                    str = str2;
                }
            }
            if (z2) {
                setTypeValue(tLRPC$TL_secureRequiredType2, null, null, tLRPC$TL_secureRequiredType3, str, z, arrayList != null ? arrayList.size() : 0);
            } else {
                TLRPC$TL_secureValue valueByType2 = getValueByType(tLRPC$TL_secureRequiredType2, false);
                if (!(valueByType2 == null || (tLRPC$TL_secureData = valueByType2.data) == null)) {
                    str3 = decryptData(tLRPC$TL_secureData.data, decryptValueSecret(tLRPC$TL_secureData.secret, tLRPC$TL_secureData.data_hash), valueByType2.data.data_hash);
                }
                setTypeValue(tLRPC$TL_secureRequiredType2, null, str3, tLRPC$TL_secureRequiredType3, str, z, arrayList != null ? arrayList.size() : 0);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    private org.telegram.p009ui.PassportActivity.TextDetailSecureCell addField(android.content.Context r17, final org.telegram.tgnet.TLRPC$TL_secureRequiredType r18, final java.util.ArrayList<org.telegram.tgnet.TLRPC$TL_secureRequiredType> r19, final boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.addField(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.PassportActivity$TextDetailSecureCell");
    }

    public void lambda$addField$64(final ArrayList arrayList, final TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, final boolean z, View view) {
        TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2;
        String str;
        int i;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                tLRPC$TL_secureRequiredType2 = (TLRPC$TL_secureRequiredType) arrayList.get(i2);
                if (getValueByType(tLRPC$TL_secureRequiredType2, false) != null || size == 1) {
                    break;
                }
            }
        }
        tLRPC$TL_secureRequiredType2 = null;
        TLRPC$SecureValueType tLRPC$SecureValueType = tLRPC$TL_secureRequiredType.type;
        if (!(tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePersonalDetails) && !(tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeAddress)) {
            boolean z2 = tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypePhone;
            if ((z2 || (tLRPC$SecureValueType instanceof TLRPC$TL_secureValueTypeEmail)) && getValueByType(tLRPC$TL_secureRequiredType, false) != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        PassportActivity.this.lambda$addField$63(tLRPC$TL_secureRequiredType, z, dialogInterface, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
                if (z2) {
                    i = C0952R.string.PassportDeletePhoneAlert;
                    str = "PassportDeletePhoneAlert";
                } else {
                    i = C0952R.string.PassportDeleteEmailAlert;
                    str = "PassportDeleteEmailAlert";
                }
                builder.setMessage(LocaleController.getString(str, i));
                showDialog(builder.create());
                return;
            }
        } else if (tLRPC$TL_secureRequiredType2 == null && arrayList != null && !arrayList.isEmpty()) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
            builder2.setPositiveButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
            TLRPC$SecureValueType tLRPC$SecureValueType2 = tLRPC$TL_secureRequiredType.type;
            if (tLRPC$SecureValueType2 instanceof TLRPC$TL_secureValueTypePersonalDetails) {
                builder2.setTitle(LocaleController.getString("PassportIdentityDocument", C0952R.string.PassportIdentityDocument));
            } else if (tLRPC$SecureValueType2 instanceof TLRPC$TL_secureValueTypeAddress) {
                builder2.setTitle(LocaleController.getString("PassportAddress", C0952R.string.PassportAddress));
            }
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                TLRPC$SecureValueType tLRPC$SecureValueType3 = ((TLRPC$TL_secureRequiredType) arrayList.get(i3)).type;
                if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeDriverLicense) {
                    arrayList2.add(LocaleController.getString("PassportAddLicence", C0952R.string.PassportAddLicence));
                } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypePassport) {
                    arrayList2.add(LocaleController.getString("PassportAddPassport", C0952R.string.PassportAddPassport));
                } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeInternalPassport) {
                    arrayList2.add(LocaleController.getString("PassportAddInternalPassport", C0952R.string.PassportAddInternalPassport));
                } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeIdentityCard) {
                    arrayList2.add(LocaleController.getString("PassportAddCard", C0952R.string.PassportAddCard));
                } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeUtilityBill) {
                    arrayList2.add(LocaleController.getString("PassportAddBill", C0952R.string.PassportAddBill));
                } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeBankStatement) {
                    arrayList2.add(LocaleController.getString("PassportAddBank", C0952R.string.PassportAddBank));
                } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeRentalAgreement) {
                    arrayList2.add(LocaleController.getString("PassportAddAgreement", C0952R.string.PassportAddAgreement));
                } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypeTemporaryRegistration) {
                    arrayList2.add(LocaleController.getString("PassportAddTemporaryRegistration", C0952R.string.PassportAddTemporaryRegistration));
                } else if (tLRPC$SecureValueType3 instanceof TLRPC$TL_secureValueTypePassportRegistration) {
                    arrayList2.add(LocaleController.getString("PassportAddPassportRegistration", C0952R.string.PassportAddPassportRegistration));
                }
            }
            builder2.setItems((CharSequence[]) arrayList2.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    PassportActivity.this.lambda$addField$61(tLRPC$TL_secureRequiredType, arrayList, z, dialogInterface, i4);
                }
            });
            showDialog(builder2.create());
            return;
        }
        openTypeActivity(tLRPC$TL_secureRequiredType, tLRPC$TL_secureRequiredType2, arrayList, z);
    }

    public void lambda$addField$61(TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, ArrayList arrayList, boolean z, DialogInterface dialogInterface, int i) {
        openTypeActivity(tLRPC$TL_secureRequiredType, (TLRPC$TL_secureRequiredType) arrayList.get(i), arrayList, z);
    }

    public void lambda$addField$63(TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType, boolean z, DialogInterface dialogInterface, int i) {
        needShowProgress();
        deleteValueInternal(tLRPC$TL_secureRequiredType, null, null, true, new Runnable() {
            @Override
            public final void run() {
                PassportActivity.this.needHideProgress();
            }
        }, new ErrorRunnable() {
            @Override
            public final void onError(String str, String str2) {
                PassportActivity.this.lambda$addField$62(str, str2);
            }
        }, z);
    }

    public void lambda$addField$62(String str, String str2) {
        needHideProgress();
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

    private SecureDocumentKey getSecureDocumentKey(byte[] bArr, byte[] bArr2) {
        byte[] computeSHA512 = Utilities.computeSHA512(decryptValueSecret(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr4, 0, 16);
        return new SecureDocumentKey(bArr3, bArr4);
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
        byte[] computeSHA512 = Utilities.computeSHA512(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    public org.telegram.p009ui.PassportActivity.EncryptionResult createSecureDocument(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PassportActivity.createSecureDocument(java.lang.String):org.telegram.ui.PassportActivity$EncryptionResult");
    }

    private String decryptData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr2.length != 32 || bArr3 == null || bArr3.length != 32) {
            return null;
        }
        byte[] computeSHA512 = Utilities.computeSHA512(bArr2, bArr3);
        byte[] bArr4 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
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

    public byte[] getRandomSecret() {
        byte[] bArr = new byte[32];
        Utilities.random.nextBytes(bArr);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            i += 255 & bArr[i2];
        }
        int i3 = i % 255;
        if (i3 != 239) {
            int nextInt = Utilities.random.nextInt(32);
            int i4 = (bArr[nextInt] & 255) + (239 - i3);
            if (i4 < 255) {
                i4 += 255;
            }
            bArr[nextInt] = (byte) (i4 % 255);
        }
        return bArr;
    }

    public EncryptionResult encryptData(byte[] bArr) {
        byte[] randomSecret = getRandomSecret();
        int nextInt = Utilities.random.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.random.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] computeSHA256 = Utilities.computeSHA256(bArr3);
        byte[] computeSHA512 = Utilities.computeSHA512(randomSecret, computeSHA256);
        byte[] bArr4 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
        Utilities.aesCbcEncryptionByteArraySafe(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.saltedPassword, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.saltedPassword, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.secureSecret, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] computeSHA5122 = Utilities.computeSHA512(bArr8, computeSHA256);
        byte[] bArr9 = new byte[32];
        System.arraycopy(computeSHA5122, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(computeSHA5122, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(randomSecret, 0, bArr11, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        return new EncryptionResult(bArr3, bArr11, randomSecret, computeSHA256, bArr4, bArr5);
    }

    public void showAlertWithText(String str, String str2) {
        if (getParentActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
            builder.setTitle(str);
            builder.setMessage(str2);
            showDialog(builder.create());
        }
    }

    public void onPasscodeError(boolean z) {
        if (getParentActivity() != null) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            if (z) {
                this.inputFields[0].setText("");
            }
            AndroidUtilities.shakeView(this.inputFields[0], 2.0f, 0);
        }
    }

    public void startPhoneVerification(boolean z, final String str, Runnable runnable, ErrorRunnable errorRunnable, final PassportActivityDelegate passportActivityDelegate) {
        boolean z2;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        boolean z3 = true;
        boolean z4 = (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0) ? false : true;
        if (getParentActivity() == null || Build.VERSION.SDK_INT < 23 || !z4) {
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                        builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
                        builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
                        builder.setMessage(LocaleController.getString("AllowReadCall", C0952R.string.AllowReadCall));
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
        final TLRPC$TL_account_sendVerifyPhoneCode tLRPC$TL_account_sendVerifyPhoneCode = new TLRPC$TL_account_sendVerifyPhoneCode();
        tLRPC$TL_account_sendVerifyPhoneCode.phone_number = str;
        TLRPC$TL_codeSettings tLRPC$TL_codeSettings = new TLRPC$TL_codeSettings();
        tLRPC$TL_account_sendVerifyPhoneCode.settings = tLRPC$TL_codeSettings;
        if (!z4 || !z2) {
            z3 = false;
        }
        tLRPC$TL_codeSettings.allow_flashcall = z3;
        tLRPC$TL_codeSettings.allow_app_hash = ApplicationLoader.hasPlayServices;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        if (tLRPC$TL_account_sendVerifyPhoneCode.settings.allow_app_hash) {
            sharedPreferences.edit().putString("sms_hash", BuildVars.SMS_HASH).commit();
        } else {
            sharedPreferences.edit().remove("sms_hash").commit();
        }
        if (tLRPC$TL_account_sendVerifyPhoneCode.settings.allow_flashcall) {
            try {
                String line1Number = telephonyManager.getLine1Number();
                if (!TextUtils.isEmpty(line1Number)) {
                    tLRPC$TL_account_sendVerifyPhoneCode.settings.current_number = PhoneNumberUtils.compare(str, line1Number);
                    TLRPC$TL_codeSettings tLRPC$TL_codeSettings2 = tLRPC$TL_account_sendVerifyPhoneCode.settings;
                    if (!tLRPC$TL_codeSettings2.current_number) {
                        tLRPC$TL_codeSettings2.allow_flashcall = false;
                    }
                } else {
                    tLRPC$TL_account_sendVerifyPhoneCode.settings.current_number = false;
                }
            } catch (Exception e) {
                tLRPC$TL_account_sendVerifyPhoneCode.settings.allow_flashcall = false;
                FileLog.m30e(e);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_sendVerifyPhoneCode, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PassportActivity.this.lambda$startPhoneVerification$66(str, passportActivityDelegate, tLRPC$TL_account_sendVerifyPhoneCode, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$startPhoneVerification$66(final String str, final PassportActivityDelegate passportActivityDelegate, final TLRPC$TL_account_sendVerifyPhoneCode tLRPC$TL_account_sendVerifyPhoneCode, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PassportActivity.this.lambda$startPhoneVerification$65(tLRPC$TL_error, str, passportActivityDelegate, tLObject, tLRPC$TL_account_sendVerifyPhoneCode);
            }
        });
    }

    public void lambda$startPhoneVerification$65(TLRPC$TL_error tLRPC$TL_error, String str, PassportActivityDelegate passportActivityDelegate, TLObject tLObject, TLRPC$TL_account_sendVerifyPhoneCode tLRPC$TL_account_sendVerifyPhoneCode) {
        if (tLRPC$TL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            PassportActivity passportActivity = new PassportActivity(7, this.currentForm, this.currentPassword, this.currentType, (TLRPC$TL_secureValue) null, (TLRPC$TL_secureRequiredType) null, (TLRPC$TL_secureValue) null, hashMap, (HashMap<String, String>) null);
            passportActivity.currentAccount = this.currentAccount;
            passportActivity.saltedPassword = this.saltedPassword;
            passportActivity.secureSecret = this.secureSecret;
            passportActivity.delegate = passportActivityDelegate;
            passportActivity.currentPhoneVerification = (TLRPC$TL_auth_sentCode) tLObject;
            presentFragment(passportActivity, true);
            return;
        }
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this, tLRPC$TL_account_sendVerifyPhoneCode, str);
    }

    public void updatePasswordInterface() {
        ImageView imageView = this.noPasswordImageView;
        if (imageView != null) {
            TLRPC$TL_account_password tLRPC$TL_account_password = this.currentPassword;
            if (tLRPC$TL_account_password == null || this.usingSavedPassword != 0) {
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
            } else if (!tLRPC$TL_account_password.has_password) {
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
            } else {
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
                    TLRPC$TL_account_password tLRPC$TL_account_password2 = this.currentPassword;
                    if (tLRPC$TL_account_password2 == null || TextUtils.isEmpty(tLRPC$TL_account_password2.hint)) {
                        this.inputFields[0].setHint(LocaleController.getString("LoginPassword", C0952R.string.LoginPassword));
                    } else {
                        this.inputFields[0].setHint(this.currentPassword.hint);
                    }
                }
            }
        }
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
                this.doneItemAnimation.playTogether(ObjectAnimator.ofFloat(this.doneItem.getContentView(), View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.progressView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.progressView, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.progressView, View.ALPHA, 1.0f));
            } else {
                this.doneItem.getContentView().setVisibility(0);
                this.doneItem.setEnabled(true);
                this.doneItemAnimation.playTogether(ObjectAnimator.ofFloat(this.progressView, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.progressView, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.progressView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), View.ALPHA, 1.0f));
            }
            this.doneItemAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PassportActivity.this.doneItemAnimation != null && PassportActivity.this.doneItemAnimation.equals(animator)) {
                        if (!z2) {
                            PassportActivity.this.progressView.setVisibility(4);
                        } else {
                            PassportActivity.this.doneItem.getContentView().setVisibility(4);
                        }
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (PassportActivity.this.doneItemAnimation != null && PassportActivity.this.doneItemAnimation.equals(animator)) {
                        PassportActivity.this.doneItemAnimation = null;
                    }
                }
            });
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
        } else if (this.acceptTextView != null) {
            this.doneItemAnimation = new AnimatorSet();
            if (z2) {
                this.progressViewButton.setVisibility(0);
                this.bottomLayout.setEnabled(false);
                this.doneItemAnimation.playTogether(ObjectAnimator.ofFloat(this.acceptTextView, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.acceptTextView, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.acceptTextView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.progressViewButton, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.progressViewButton, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.progressViewButton, View.ALPHA, 1.0f));
            } else {
                this.acceptTextView.setVisibility(0);
                this.bottomLayout.setEnabled(true);
                this.doneItemAnimation.playTogether(ObjectAnimator.ofFloat(this.progressViewButton, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.progressViewButton, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.progressViewButton, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.acceptTextView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.acceptTextView, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.acceptTextView, View.ALPHA, 1.0f));
            }
            this.doneItemAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PassportActivity.this.doneItemAnimation != null && PassportActivity.this.doneItemAnimation.equals(animator)) {
                        if (!z2) {
                            PassportActivity.this.progressViewButton.setVisibility(4);
                        } else {
                            PassportActivity.this.acceptTextView.setVisibility(4);
                        }
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (PassportActivity.this.doneItemAnimation != null && PassportActivity.this.doneItemAnimation.equals(animator)) {
                        PassportActivity.this.doneItemAnimation = null;
                    }
                }
            });
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        SecureDocumentCell secureDocumentCell;
        ActionBarMenuItem actionBarMenuItem;
        if (i == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            SecureDocument secureDocument = this.uploadingDocuments.get(str);
            if (secureDocument != null) {
                secureDocument.inputFile = (TLRPC$TL_inputFile) objArr[1];
                this.uploadingDocuments.remove(str);
                if (this.uploadingDocuments.isEmpty() && (actionBarMenuItem = this.doneItem) != null) {
                    actionBarMenuItem.setEnabled(true);
                    this.doneItem.setAlpha(1.0f);
                }
                HashMap<SecureDocument, SecureDocumentCell> hashMap = this.documentsCells;
                if (!(hashMap == null || (secureDocumentCell = hashMap.get(secureDocument)) == null)) {
                    secureDocumentCell.updateButtonState(true);
                }
                HashMap<String, String> hashMap2 = this.errorsValues;
                if (hashMap2 != null && hashMap2.containsKey("error_document_all")) {
                    this.errorsValues.remove("error_document_all");
                    checkTopErrorCell(false);
                }
                int i3 = secureDocument.type;
                if (i3 == 0) {
                    if (this.bottomCell != null && !TextUtils.isEmpty(this.noAllDocumentsErrorText)) {
                        this.bottomCell.setText(this.noAllDocumentsErrorText);
                    }
                    this.errorsValues.remove("files_all");
                } else if (i3 == 4) {
                    if (this.bottomCellTranslation != null && !TextUtils.isEmpty(this.noAllTranslationErrorText)) {
                        this.bottomCellTranslation.setText(this.noAllTranslationErrorText);
                    }
                    this.errorsValues.remove("translation_all");
                }
            }
        } else if (i != NotificationCenter.fileUploadFailed) {
            if (i == NotificationCenter.twoStepPasswordChanged) {
                if (objArr == null || objArr.length <= 0) {
                    this.currentPassword = null;
                    loadPasswordInfo();
                } else {
                    if (objArr[7] != null) {
                        EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
                        if (editTextBoldCursorArr[0] != null) {
                            editTextBoldCursorArr[0].setText((String) objArr[7]);
                        }
                    }
                    if (objArr[6] == null) {
                        TLRPC$TL_account_password tLRPC$TL_account_password = new TLRPC$TL_account_password();
                        this.currentPassword = tLRPC$TL_account_password;
                        tLRPC$TL_account_password.current_algo = (TLRPC$PasswordKdfAlgo) objArr[1];
                        tLRPC$TL_account_password.new_secure_algo = (TLRPC$SecurePasswordKdfAlgo) objArr[2];
                        tLRPC$TL_account_password.secure_random = (byte[]) objArr[3];
                        tLRPC$TL_account_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                        TLRPC$TL_account_password tLRPC$TL_account_password2 = this.currentPassword;
                        tLRPC$TL_account_password2.hint = (String) objArr[5];
                        tLRPC$TL_account_password2.srp_id = -1L;
                        byte[] bArr = new byte[256];
                        tLRPC$TL_account_password2.srp_B = bArr;
                        Utilities.random.nextBytes(bArr);
                        EditTextBoldCursor[] editTextBoldCursorArr2 = this.inputFields;
                        if (editTextBoldCursorArr2[0] != null && editTextBoldCursorArr2[0].length() > 0) {
                            this.usingSavedPassword = 2;
                        }
                    }
                }
                updatePasswordInterface();
                return;
            }
            int i4 = NotificationCenter.didRemoveTwoStepPassword;
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (this.presentAfterAnimation != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.this.lambda$onTransitionAnimationEnd$67();
                }
            });
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
                }
            }
        } else if (i == 7) {
            if (z) {
                this.views[this.currentViewNum].onShow();
            }
        } else if (i == 4) {
            if (z) {
                this.inputFields[0].requestFocus();
                AndroidUtilities.showKeyboard(this.inputFields[0]);
            }
        } else if (i == 6) {
            if (z) {
                this.inputFields[0].requestFocus();
                AndroidUtilities.showKeyboard(this.inputFields[0]);
            }
        } else if ((i == 2 || i == 1) && Build.VERSION.SDK_INT >= 21) {
            createChatAttachView();
        }
    }

    public void lambda$onTransitionAnimationEnd$67() {
        presentFragment(this.presentAfterAnimation, true);
        this.presentAfterAnimation = null;
    }

    private void showAttachmentError() {
        if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), LocaleController.getString("UnsupportedAttachment", C0952R.string.UnsupportedAttachment), 0).show();
        }
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (i == 0 || i == 2) {
            createChatAttachView();
            ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
            if (chatAttachAlert != null) {
                chatAttachAlert.onActivityResultFragment(i, intent, this.currentPicturePath);
            }
            this.currentPicturePath = null;
        } else if (i != 1) {
        } else {
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

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ChatAttachAlert chatAttachAlert;
        TextSettingsCell textSettingsCell;
        int i2 = this.currentActivityType;
        if ((i2 == 1 || i2 == 2) && (chatAttachAlert = this.chatAttachAlert) != null) {
            if (i == 17) {
                chatAttachAlert.getPhotoLayout().checkCamera(false);
            } else if (i == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
                    builder.setMessage(LocaleController.getString("PermissionNoAudioVideoWithHint", C0952R.string.PermissionNoAudioVideoWithHint));
                    builder.setNegativeButton(LocaleController.getString("PermissionOpenSettings", C0952R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            PassportActivity.this.lambda$onRequestPermissionsResultFragment$68(dialogInterface, i3);
                        }
                    });
                    builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
                    builder.show();
                }
            } else if (i == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                processSelectedAttach(0);
            } else if (i == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (textSettingsCell = this.scanDocumentCell) != null) {
                textSettingsCell.callOnClick();
            }
        } else if (i2 == 3 && i == 6) {
            startPhoneVerification(false, this.pendingPhone, this.pendingFinishRunnable, this.pendingErrorRunnable, this.pendingDelegate);
        }
    }

    public void lambda$onRequestPermissionsResultFragment$68(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }

    @Override
    public void saveSelfArgs(Bundle bundle) {
        String str = this.currentPicturePath;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override
    public boolean onBackPressed() {
        int i = this.currentActivityType;
        int i2 = 0;
        if (i == 7) {
            this.views[this.currentViewNum].onBackPressed(true);
            while (true) {
                SlideView[] slideViewArr = this.views;
                if (i2 >= slideViewArr.length) {
                    break;
                }
                if (slideViewArr[i2] != null) {
                    slideViewArr[i2].onDestroyActivity();
                }
                i2++;
            }
        } else if (i == 0 || i == 5) {
            callCallback(false);
        } else if (i == 1 || i == 2) {
            return !checkDiscard();
        }
        return true;
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        if (this.currentActivityType == 3 && Build.VERSION.SDK_INT >= 23 && dialog == this.permissionsDialog && !this.permissionsItems.isEmpty()) {
            getParentActivity().requestPermissions((String[]) this.permissionsItems.toArray(new String[0]), 6);
        }
    }

    public void needShowProgress() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.progressDialog == null) {
            AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
            this.progressDialog = alertDialog;
            alertDialog.setCanCancel(false);
            this.progressDialog.show();
        }
    }

    public void needHideProgress() {
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.m30e(e);
            }
            this.progressDialog = null;
        }
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
        if (z) {
            slideView2.setTranslationX(AndroidUtilities.displaySize.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(slideView, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(slideView2, "translationX", 0.0f));
            animatorSet.addListener(new AnimatorListenerAdapter(this) {
                @Override
                public void onAnimationStart(Animator animator) {
                    slideView2.setVisibility(0);
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    slideView.setVisibility(8);
                    slideView.setX(0.0f);
                }
            });
            animatorSet.start();
            return;
        }
        slideView2.setTranslationX(0.0f);
        slideView2.setVisibility(0);
        if (slideView != slideView2) {
            slideView.setVisibility(8);
        }
    }

    public void fillNextCodeParams(Bundle bundle, TLRPC$TL_auth_sentCode tLRPC$TL_auth_sentCode, boolean z) {
        bundle.putString("phoneHash", tLRPC$TL_auth_sentCode.phone_code_hash);
        TLRPC$auth_CodeType tLRPC$auth_CodeType = tLRPC$TL_auth_sentCode.next_type;
        if (tLRPC$auth_CodeType instanceof TLRPC$TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (tLRPC$auth_CodeType instanceof TLRPC$TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (tLRPC$auth_CodeType instanceof TLRPC$TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        }
        if (tLRPC$TL_auth_sentCode.timeout == 0) {
            tLRPC$TL_auth_sentCode.timeout = 60;
        }
        bundle.putInt("timeout", tLRPC$TL_auth_sentCode.timeout * 1000);
        TLRPC$auth_SentCodeType tLRPC$auth_SentCodeType = tLRPC$TL_auth_sentCode.type;
        if (tLRPC$auth_SentCodeType instanceof TLRPC$TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", tLRPC$TL_auth_sentCode.type.length);
            setPage(2, z, bundle);
        } else if (tLRPC$auth_SentCodeType instanceof TLRPC$TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tLRPC$TL_auth_sentCode.type.pattern);
            setPage(1, z, bundle);
        } else if (tLRPC$auth_SentCodeType instanceof TLRPC$TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tLRPC$TL_auth_sentCode.type.length);
            setPage(0, z, bundle);
        }
    }

    private void openAttachMenu() {
        if (getParentActivity() != null) {
            boolean z = true;
            if (this.uploadingFileType != 0 || this.documents.size() < 20) {
                createChatAttachView();
                ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
                if (this.uploadingFileType != 1) {
                    z = false;
                }
                chatAttachAlert.setOpenWithFrontFaceCamera(z);
                this.chatAttachAlert.setMaxSelectedPhotos(getMaxSelectedDocuments(), false);
                this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
                int i = Build.VERSION.SDK_INT;
                if (i == 21 || i == 22) {
                    AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
                }
                this.chatAttachAlert.init();
                showDialog(this.chatAttachAlert);
                return;
            }
            showAlertWithText(LocaleController.getString("AppName", C0952R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", C0952R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20)));
        }
    }

    private void createChatAttachView() {
        if (getParentActivity() != null && this.chatAttachAlert == null) {
            ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getParentActivity(), this, false, false);
            this.chatAttachAlert = chatAttachAlert;
            chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
                @Override
                public void didSelectBot(TLRPC$User tLRPC$User) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, tLRPC$User);
                }

                @Override
                public void doOnIdle(Runnable runnable) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$doOnIdle(this, runnable);
                }

                @Override
                public boolean needEnterComment() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
                }

                @Override
                public void openAvatarsSearch() {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
                }

                @Override
                public void didPressedButton(int i, boolean z, boolean z2, int i2, boolean z3) {
                    if (!(PassportActivity.this.getParentActivity() == null || PassportActivity.this.chatAttachAlert == null)) {
                        if (i == 8 || i == 7) {
                            if (i != 8) {
                                PassportActivity.this.chatAttachAlert.dismiss(true);
                            }
                            HashMap<Object, Object> selectedPhotos = PassportActivity.this.chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                            ArrayList<Object> selectedPhotosOrder = PassportActivity.this.chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
                            if (!selectedPhotos.isEmpty()) {
                                ArrayList arrayList = new ArrayList();
                                for (int i3 = 0; i3 < selectedPhotosOrder.size(); i3++) {
                                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i3));
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
                                return;
                            }
                            return;
                        }
                        if (PassportActivity.this.chatAttachAlert != null) {
                            PassportActivity.this.chatAttachAlert.dismissWithButtonClick(i);
                        }
                        PassportActivity.this.processSelectedAttach(i);
                    }
                }

                @Override
                public void onCameraOpened() {
                    AndroidUtilities.hideKeyboard(((BaseFragment) PassportActivity.this).fragmentView.findFocus());
                }
            });
        }
    }

    private int getMaxSelectedDocuments() {
        int size;
        int i = this.uploadingFileType;
        if (i == 0) {
            size = this.documents.size();
        } else if (i != 4) {
            return 1;
        } else {
            size = this.translationDocuments.size();
        }
        return 20 - size;
    }

    public void processSelectedAttach(int i) {
        if (i == 0) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 23 || getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                try {
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    File generatePicturePath = AndroidUtilities.generatePicturePath();
                    if (generatePicturePath != null) {
                        if (i2 >= 24) {
                            intent.putExtra("output", FileProvider.getUriForFile(getParentActivity(), "org.telegram.messenger.beta.provider", generatePicturePath));
                            intent.addFlags(2);
                            intent.addFlags(1);
                        } else {
                            intent.putExtra("output", Uri.fromFile(generatePicturePath));
                        }
                        this.currentPicturePath = generatePicturePath.getAbsolutePath();
                    }
                    startActivityForResult(intent, 0);
                } catch (Exception e) {
                    FileLog.m30e(e);
                }
            } else {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
            }
        }
    }

    public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z, int i) {
        processSelectedFiles(arrayList);
    }

    public void startDocumentSelectActivity() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            if (Build.VERSION.SDK_INT >= 18) {
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            }
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }

    public void didSelectFiles(ArrayList<String> arrayList, String str, boolean z, int i) {
        ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            sendingMediaInfo.path = arrayList.get(i2);
            arrayList2.add(sendingMediaInfo);
        }
        processSelectedFiles(arrayList2);
    }

    private void fillInitialValues() {
        if (this.initialValues == null) {
            this.initialValues = getCurrentValues();
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
            sb.append(this.documents.get(i3).secureFile.f971id);
        }
        SecureDocument secureDocument = this.frontDocument;
        if (secureDocument != null) {
            sb.append(secureDocument.secureFile.f971id);
        }
        SecureDocument secureDocument2 = this.reverseDocument;
        if (secureDocument2 != null) {
            sb.append(secureDocument2.secureFile.f971id);
        }
        SecureDocument secureDocument3 = this.selfieDocument;
        if (secureDocument3 != null) {
            sb.append(secureDocument3.secureFile.f971id);
        }
        int size2 = this.translationDocuments.size();
        for (int i4 = 0; i4 < size2; i4++) {
            sb.append(this.translationDocuments.get(i4).secureFile.f971id);
        }
        return sb.toString();
    }

    public boolean isHasNotAnyChanges() {
        String str = this.initialValues;
        return str == null || str.equals(getCurrentValues());
    }

    public boolean checkDiscard() {
        if (isHasNotAnyChanges()) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setPositiveButton(LocaleController.getString("PassportDiscard", C0952R.string.PassportDiscard), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                PassportActivity.this.lambda$checkDiscard$69(dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        builder.setTitle(LocaleController.getString("DiscardChanges", C0952R.string.DiscardChanges));
        builder.setMessage(LocaleController.getString("PassportDiscardChanges", C0952R.string.PassportDiscardChanges));
        showDialog(builder.create());
        return true;
    }

    public void lambda$checkDiscard$69(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    public void processSelectedFiles(final ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList) {
        if (!arrayList.isEmpty()) {
            int i = this.uploadingFileType;
            boolean z = true;
            final boolean z2 = false;
            if (!(i == 1 || i == 4 || !(this.currentType.type instanceof TLRPC$TL_secureValueTypePersonalDetails))) {
                int i2 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
                    if (i2 < editTextBoldCursorArr.length) {
                        if (i2 != 5 && i2 != 8 && i2 != 4 && i2 != 6 && editTextBoldCursorArr[i2].length() > 0) {
                            z = false;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                z2 = z;
            }
            final int i3 = this.uploadingFileType;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.this.lambda$processSelectedFiles$72(arrayList, i3, z2);
                }
            });
        }
    }

    public void lambda$processSelectedFiles$72(ArrayList arrayList, final int i, boolean z) {
        TLRPC$PhotoSize scaleAndSaveImage;
        Throwable th;
        int i2 = this.uploadingFileType;
        int min = Math.min((i2 == 0 || i2 == 4) ? 20 : 1, arrayList.size());
        boolean z2 = false;
        for (int i3 = 0; i3 < min; i3++) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(i3);
            Bitmap loadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, sendingMediaInfo.uri, 2048.0f, 2048.0f, false);
            if (!(loadBitmap == null || (scaleAndSaveImage = ImageLoader.scaleAndSaveImage(loadBitmap, 2048.0f, 2048.0f, 89, false, 320, 320)) == null)) {
                TLRPC$TL_secureFile tLRPC$TL_secureFile = new TLRPC$TL_secureFile();
                TLRPC$FileLocation tLRPC$FileLocation = scaleAndSaveImage.location;
                tLRPC$TL_secureFile.dc_id = (int) tLRPC$FileLocation.volume_id;
                tLRPC$TL_secureFile.f971id = tLRPC$FileLocation.local_id;
                tLRPC$TL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                final SecureDocument saveFile = this.delegate.saveFile(tLRPC$TL_secureFile);
                saveFile.type = i;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.this.lambda$processSelectedFiles$70(saveFile, i);
                    }
                });
                if (z && !z2) {
                    try {
                        final MrzRecognizer.Result recognize = MrzRecognizer.recognize(loadBitmap, this.currentDocumentsType.type instanceof TLRPC$TL_secureValueTypeDriverLicense);
                        if (recognize != null) {
                            try {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        PassportActivity.this.lambda$processSelectedFiles$71(recognize);
                                    }
                                });
                                z2 = true;
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = true;
                                FileLog.m30e(th);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        SharedConfig.saveConfig();
    }

    public void lambda$processSelectedFiles$70(SecureDocument secureDocument, int i) {
        int i2 = this.uploadingFileType;
        if (i2 == 1) {
            SecureDocument secureDocument2 = this.selfieDocument;
            if (secureDocument2 != null) {
                SecureDocumentCell remove = this.documentsCells.remove(secureDocument2);
                if (remove != null) {
                    this.selfieLayout.removeView(remove);
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
                SecureDocumentCell remove2 = this.documentsCells.remove(secureDocument3);
                if (remove2 != null) {
                    this.frontLayout.removeView(remove2);
                }
                this.frontDocument = null;
            }
        } else if (i2 == 3) {
            SecureDocument secureDocument4 = this.reverseDocument;
            if (secureDocument4 != null) {
                SecureDocumentCell remove3 = this.documentsCells.remove(secureDocument4);
                if (remove3 != null) {
                    this.reverseLayout.removeView(remove3);
                }
                this.reverseDocument = null;
            }
        } else if (i2 == 0 && this.documents.size() >= 20) {
            return;
        }
        this.uploadingDocuments.put(secureDocument.path, secureDocument);
        this.doneItem.setEnabled(false);
        this.doneItem.setAlpha(0.5f);
        FileLoader.getInstance(this.currentAccount).uploadFile(secureDocument.path, false, true, ConnectionsManager.FileTypePhoto);
        addDocumentView(secureDocument, i);
        updateUploadText(i);
    }

    public void lambda$processSelectedFiles$71(MrzRecognizer.Result result) {
        int i;
        int i2;
        int i3 = result.type;
        if (i3 == 2) {
            if (!(this.currentDocumentsType.type instanceof TLRPC$TL_secureValueTypeIdentityCard)) {
                int size = this.availableDocumentTypes.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType = this.availableDocumentTypes.get(i4);
                    if (tLRPC$TL_secureRequiredType.type instanceof TLRPC$TL_secureValueTypeIdentityCard) {
                        this.currentDocumentsType = tLRPC$TL_secureRequiredType;
                        updateInterfaceStringsForDocumentType();
                        break;
                    }
                    i4++;
                }
            }
        } else if (i3 == 1) {
            if (!(this.currentDocumentsType.type instanceof TLRPC$TL_secureValueTypePassport)) {
                int size2 = this.availableDocumentTypes.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        break;
                    }
                    TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType2 = this.availableDocumentTypes.get(i5);
                    if (tLRPC$TL_secureRequiredType2.type instanceof TLRPC$TL_secureValueTypePassport) {
                        this.currentDocumentsType = tLRPC$TL_secureRequiredType2;
                        updateInterfaceStringsForDocumentType();
                        break;
                    }
                    i5++;
                }
            }
        } else if (i3 == 3) {
            if (!(this.currentDocumentsType.type instanceof TLRPC$TL_secureValueTypeInternalPassport)) {
                int size3 = this.availableDocumentTypes.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        break;
                    }
                    TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType3 = this.availableDocumentTypes.get(i6);
                    if (tLRPC$TL_secureRequiredType3.type instanceof TLRPC$TL_secureValueTypeInternalPassport) {
                        this.currentDocumentsType = tLRPC$TL_secureRequiredType3;
                        updateInterfaceStringsForDocumentType();
                        break;
                    }
                    i6++;
                }
            }
        } else if (i3 == 4 && !(this.currentDocumentsType.type instanceof TLRPC$TL_secureValueTypeDriverLicense)) {
            int size4 = this.availableDocumentTypes.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size4) {
                    break;
                }
                TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType4 = this.availableDocumentTypes.get(i7);
                if (tLRPC$TL_secureRequiredType4.type instanceof TLRPC$TL_secureValueTypeDriverLicense) {
                    this.currentDocumentsType = tLRPC$TL_secureRequiredType4;
                    updateInterfaceStringsForDocumentType();
                    break;
                }
                i7++;
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
                this.inputFields[4].setText(LocaleController.getString("PassportMale", C0952R.string.PassportMale));
            } else if (i8 == 2) {
                this.currentGender = "female";
                this.inputFields[4].setText(LocaleController.getString("PassportFemale", C0952R.string.PassportFemale));
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
            this.inputFields[8].setText(LocaleController.getString("PassportNoExpireDate", C0952R.string.PassportNoExpireDate));
            return;
        }
        int[] iArr2 = this.currentExpireDate;
        iArr2[0] = i2;
        iArr2[1] = i;
        iArr2[2] = i10;
        this.inputFields[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
    }

    public void setNeedActivityResult(boolean z) {
        this.needActivityResult = z;
    }

    public static class ProgressView extends View {
        private Paint paint = new Paint();
        private Paint paint2 = new Paint();
        private float progress;

        public ProgressView(Context context) {
            super(context);
            this.paint.setColor(Theme.getColor("login_progressInner"));
            this.paint2.setColor(Theme.getColor("login_progressOuter"));
        }

        public void setProgress(float f) {
            this.progress = f;
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float measuredWidth = (int) (getMeasuredWidth() * this.progress);
            canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.paint2);
            canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
        }
    }

    public class PhoneConfirmationView extends SlideView implements NotificationCenter.NotificationCenterDelegate {
        private ImageView blackImageView;
        private ImageView blueImageView;
        private EditTextBoldCursor[] codeField;
        private LinearLayout codeFieldContainer;
        private Timer codeTimer;
        private TextView confirmTextView;
        private boolean ignoreOnTextChange;
        private double lastCodeTime;
        private double lastCurrentTime;
        private int length;
        private boolean nextPressed;
        private int nextType;
        private String phone;
        private String phoneHash;
        private TextView problemText;
        private ProgressView progressView;
        private TextView timeText;
        private Timer timeTimer;
        private int timeout;
        private TextView titleTextView;
        private int verificationType;
        private boolean waitingForEvent;
        private final Object timerSync = new Object();
        private int time = 60000;
        private int codeTime = 15000;
        private String lastError = "";
        private String pattern = "*";

        public static void lambda$onBackPressed$9(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        static int access$10026(PhoneConfirmationView phoneConfirmationView, double d) {
            double d2 = phoneConfirmationView.codeTime;
            Double.isNaN(d2);
            int i = (int) (d2 - d);
            phoneConfirmationView.codeTime = i;
            return i;
        }

        static int access$10626(PhoneConfirmationView phoneConfirmationView, double d) {
            double d2 = phoneConfirmationView.time;
            Double.isNaN(d2);
            int i = (int) (d2 - d);
            phoneConfirmationView.time = i;
            return i;
        }

        public PhoneConfirmationView(Context context, int i) {
            super(context);
            this.verificationType = i;
            setOrientation(1);
            TextView textView = new TextView(context);
            this.confirmTextView = textView;
            textView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText6"));
            this.confirmTextView.setTextSize(1, 14.0f);
            this.confirmTextView.setLineSpacing(AndroidUtilities.m34dp(2.0f), 1.0f);
            TextView textView2 = new TextView(context);
            this.titleTextView = textView2;
            textView2.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.titleTextView.setTextSize(1, 18.0f);
            this.titleTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            this.titleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.titleTextView.setLineSpacing(AndroidUtilities.m34dp(2.0f), 1.0f);
            this.titleTextView.setGravity(49);
            if (this.verificationType == 3) {
                this.confirmTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                FrameLayout frameLayout = new FrameLayout(context);
                addView(frameLayout, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3));
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(C0952R.C0953drawable.phone_activate);
                boolean z = LocaleController.isRTL;
                if (z) {
                    frameLayout.addView(imageView, LayoutHelper.createFrame(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                    frameLayout.addView(this.confirmTextView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    frameLayout.addView(this.confirmTextView, LayoutHelper.createFrame(-1, -2.0f, z ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                    frameLayout.addView(imageView, LayoutHelper.createFrame(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
                }
            } else {
                this.confirmTextView.setGravity(49);
                FrameLayout frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, LayoutHelper.createLinear(-2, -2, 49));
                if (this.verificationType == 1) {
                    ImageView imageView2 = new ImageView(context);
                    this.blackImageView = imageView2;
                    imageView2.setImageResource(C0952R.C0953drawable.sms_devices);
                    this.blackImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteBlackText"), PorterDuff.Mode.MULTIPLY));
                    frameLayout2.addView(this.blackImageView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    ImageView imageView3 = new ImageView(context);
                    this.blueImageView = imageView3;
                    imageView3.setImageResource(C0952R.C0953drawable.sms_bubble);
                    this.blueImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chats_actionBackground"), PorterDuff.Mode.MULTIPLY));
                    frameLayout2.addView(this.blueImageView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    this.titleTextView.setText(LocaleController.getString("SentAppCodeTitle", C0952R.string.SentAppCodeTitle));
                } else {
                    ImageView imageView4 = new ImageView(context);
                    this.blueImageView = imageView4;
                    imageView4.setImageResource(C0952R.C0953drawable.sms_code);
                    this.blueImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chats_actionBackground"), PorterDuff.Mode.MULTIPLY));
                    frameLayout2.addView(this.blueImageView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    this.titleTextView.setText(LocaleController.getString("SentSmsCodeTitle", C0952R.string.SentSmsCodeTitle));
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
            TextView textView3 = new TextView(this, context, PassportActivity.this) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(100.0f), Integer.MIN_VALUE));
                }
            };
            this.timeText = textView3;
            textView3.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText6"));
            this.timeText.setLineSpacing(AndroidUtilities.m34dp(2.0f), 1.0f);
            if (this.verificationType == 3) {
                this.timeText.setTextSize(1, 14.0f);
                addView(this.timeText, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3));
                this.progressView = new ProgressView(context);
                this.timeText.setGravity(LocaleController.isRTL ? 5 : 3);
                addView(this.progressView, LayoutHelper.createLinear(-1, 3, 0.0f, 12.0f, 0.0f, 0.0f));
            } else {
                this.timeText.setPadding(0, AndroidUtilities.m34dp(2.0f), 0, AndroidUtilities.m34dp(10.0f));
                this.timeText.setTextSize(1, 15.0f);
                this.timeText.setGravity(49);
                addView(this.timeText, LayoutHelper.createLinear(-2, -2, 49));
            }
            TextView textView4 = new TextView(this, context, PassportActivity.this) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(100.0f), Integer.MIN_VALUE));
                }
            };
            this.problemText = textView4;
            textView4.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText4"));
            this.problemText.setLineSpacing(AndroidUtilities.m34dp(2.0f), 1.0f);
            this.problemText.setPadding(0, AndroidUtilities.m34dp(2.0f), 0, AndroidUtilities.m34dp(10.0f));
            this.problemText.setTextSize(1, 15.0f);
            this.problemText.setGravity(49);
            if (this.verificationType == 1) {
                this.problemText.setText(LocaleController.getString("DidNotGetTheCodeSms", C0952R.string.DidNotGetTheCodeSms));
            } else {
                this.problemText.setText(LocaleController.getString("DidNotGetTheCode", C0952R.string.DidNotGetTheCode));
            }
            addView(this.problemText, LayoutHelper.createLinear(-2, -2, 49));
            this.problemText.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PassportActivity.PhoneConfirmationView.this.lambda$new$0(view);
                }
            });
        }

        public void lambda$new$0(View view) {
            if (!this.nextPressed) {
                int i = this.nextType;
                if (!((i == 4 && this.verificationType == 2) || i == 0)) {
                    resendCode();
                    return;
                }
                try {
                    PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                    String format = String.format(Locale.US, "%s (%d)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                    intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + format + " " + this.phone);
                    intent.putExtra("android.intent.extra.TEXT", "Phone: " + this.phone + "\nApp version: " + format + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + this.lastError);
                    getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                } catch (Exception unused) {
                    AlertsCreator.showSimpleAlert(PassportActivity.this, LocaleController.getString("NoMailInstalled", C0952R.string.NoMailInstalled));
                }
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            ImageView imageView;
            super.onMeasure(i, i2);
            if (this.verificationType != 3 && (imageView = this.blueImageView) != null) {
                int measuredHeight = imageView.getMeasuredHeight() + this.titleTextView.getMeasuredHeight() + this.confirmTextView.getMeasuredHeight() + AndroidUtilities.m34dp(35.0f);
                int dp = AndroidUtilities.m34dp(80.0f);
                int dp2 = AndroidUtilities.m34dp(291.0f);
                if (PassportActivity.this.scrollHeight - measuredHeight < dp) {
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight + dp);
                } else {
                    setMeasuredDimension(getMeasuredWidth(), Math.min(PassportActivity.this.scrollHeight, dp2));
                }
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            super.onLayout(z, i, i2, i3, i4);
            if (this.verificationType != 3 && this.blueImageView != null) {
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
                int i6 = (((i5 - bottom) - measuredHeight4) / 2) + bottom;
                LinearLayout linearLayout = this.codeFieldContainer;
                linearLayout.layout(linearLayout.getLeft(), i6, this.codeFieldContainer.getRight(), measuredHeight4 + i6);
            }
        }

        public void resendCode() {
            final Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            this.nextPressed = true;
            PassportActivity.this.needShowProgress();
            final TLRPC$TL_auth_resendCode tLRPC$TL_auth_resendCode = new TLRPC$TL_auth_resendCode();
            tLRPC$TL_auth_resendCode.phone_number = this.phone;
            tLRPC$TL_auth_resendCode.phone_code_hash = this.phoneHash;
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tLRPC$TL_auth_resendCode, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    PassportActivity.PhoneConfirmationView.this.lambda$resendCode$3(bundle, tLRPC$TL_auth_resendCode, tLObject, tLRPC$TL_error);
                }
            }, 2);
        }

        public void lambda$resendCode$3(final Bundle bundle, final TLRPC$TL_auth_resendCode tLRPC$TL_auth_resendCode, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.PhoneConfirmationView.this.lambda$resendCode$2(tLRPC$TL_error, bundle, tLObject, tLRPC$TL_auth_resendCode);
                }
            });
        }

        public void lambda$resendCode$2(TLRPC$TL_error tLRPC$TL_error, Bundle bundle, TLObject tLObject, TLRPC$TL_auth_resendCode tLRPC$TL_auth_resendCode) {
            this.nextPressed = false;
            if (tLRPC$TL_error == null) {
                PassportActivity.this.fillNextCodeParams(bundle, (TLRPC$TL_auth_sentCode) tLObject, true);
            } else {
                AlertDialog alertDialog = (AlertDialog) AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tLRPC$TL_error, PassportActivity.this, tLRPC$TL_auth_resendCode, new Object[0]);
                if (alertDialog != null && tLRPC$TL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    alertDialog.setPositiveButtonListener(new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            PassportActivity.PhoneConfirmationView.this.lambda$resendCode$1(dialogInterface, i);
                        }
                    });
                }
            }
            PassportActivity.this.needHideProgress();
        }

        public void lambda$resendCode$1(DialogInterface dialogInterface, int i) {
            onBackPressed(true);
            PassportActivity.this.finishFragment();
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            int i;
            int i2;
            if (bundle != null) {
                this.waitingForEvent = true;
                int i3 = this.verificationType;
                if (i3 == 2) {
                    AndroidUtilities.setWaitingForSms(true);
                    NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
                } else if (i3 == 3) {
                    AndroidUtilities.setWaitingForCall(true);
                    NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                }
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
                CharSequence charSequence = "";
                int i6 = 8;
                if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.length) {
                    int i7 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr2 = this.codeField;
                        if (i7 >= editTextBoldCursorArr2.length) {
                            break;
                        }
                        editTextBoldCursorArr2[i7].setText(charSequence);
                        i7++;
                    }
                } else {
                    this.codeField = new EditTextBoldCursor[this.length];
                    final int i8 = 0;
                    while (i8 < this.length) {
                        this.codeField[i8] = new EditTextBoldCursor(getContext());
                        this.codeField[i8].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                        this.codeField[i8].setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                        this.codeField[i8].setCursorSize(AndroidUtilities.m34dp(20.0f));
                        this.codeField[i8].setCursorWidth(1.5f);
                        Drawable mutate = getResources().getDrawable(C0952R.C0953drawable.search_dark_activated).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteInputFieldActivated"), PorterDuff.Mode.MULTIPLY));
                        this.codeField[i8].setBackgroundDrawable(mutate);
                        this.codeField[i8].setImeOptions(268435461);
                        this.codeField[i8].setTextSize(1, 20.0f);
                        this.codeField[i8].setMaxLines(1);
                        this.codeField[i8].setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                        this.codeField[i8].setPadding(0, 0, 0, 0);
                        this.codeField[i8].setGravity(49);
                        if (this.verificationType == 3) {
                            this.codeField[i8].setEnabled(false);
                            this.codeField[i8].setInputType(0);
                            this.codeField[i8].setVisibility(8);
                        } else {
                            this.codeField[i8].setInputType(3);
                        }
                        this.codeFieldContainer.addView(this.codeField[i8], LayoutHelper.createLinear(34, 36, 1, 0, 0, i8 != this.length - 1 ? 7 : 0, 0));
                        this.codeField[i8].addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence charSequence2, int i9, int i10, int i11) {
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence2, int i9, int i10, int i11) {
                            }

                            @Override
                            public void afterTextChanged(Editable editable) {
                                int length;
                                if (!PhoneConfirmationView.this.ignoreOnTextChange && (length = editable.length()) >= 1) {
                                    if (length > 1) {
                                        String obj = editable.toString();
                                        PhoneConfirmationView.this.ignoreOnTextChange = true;
                                        for (int i9 = 0; i9 < Math.min(PhoneConfirmationView.this.length - i8, length); i9++) {
                                            if (i9 == 0) {
                                                editable.replace(0, length, obj.substring(i9, i9 + 1));
                                            } else {
                                                PhoneConfirmationView.this.codeField[i8 + i9].setText(obj.substring(i9, i9 + 1));
                                            }
                                        }
                                        PhoneConfirmationView.this.ignoreOnTextChange = false;
                                    }
                                    if (i8 != PhoneConfirmationView.this.length - 1) {
                                        PhoneConfirmationView.this.codeField[i8 + 1].setSelection(PhoneConfirmationView.this.codeField[i8 + 1].length());
                                        PhoneConfirmationView.this.codeField[i8 + 1].requestFocus();
                                    }
                                    if ((i8 == PhoneConfirmationView.this.length - 1 || (i8 == PhoneConfirmationView.this.length - 2 && length >= 2)) && PhoneConfirmationView.this.getCode().length() == PhoneConfirmationView.this.length) {
                                        PhoneConfirmationView.this.onNextPressed(null);
                                    }
                                }
                            }
                        });
                        this.codeField[i8].setOnKeyListener(new View.OnKeyListener() {
                            @Override
                            public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
                                boolean lambda$setParams$4;
                                lambda$setParams$4 = PassportActivity.PhoneConfirmationView.this.lambda$setParams$4(i8, view, i9, keyEvent);
                                return lambda$setParams$4;
                            }
                        });
                        this.codeField[i8].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                            @Override
                            public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
                                boolean lambda$setParams$5;
                                lambda$setParams$5 = PassportActivity.PhoneConfirmationView.this.lambda$setParams$5(textView, i9, keyEvent);
                                return lambda$setParams$5;
                            }
                        });
                        i8++;
                    }
                }
                ProgressView progressView = this.progressView;
                if (progressView != null) {
                    progressView.setVisibility(this.nextType != 0 ? 0 : 8);
                }
                if (this.phone != null) {
                    C0894PhoneFormat phoneFormat = C0894PhoneFormat.getInstance();
                    String format = phoneFormat.format("+" + this.phone);
                    int i9 = this.verificationType;
                    if (i9 == 2) {
                        charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", C0952R.string.SentSmsCode, LocaleController.addNbsp(format)));
                    } else if (i9 == 3) {
                        charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", C0952R.string.SentCallCode, LocaleController.addNbsp(format)));
                    } else if (i9 == 4) {
                        charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", C0952R.string.SentCallOnly, LocaleController.addNbsp(format)));
                    }
                    this.confirmTextView.setText(charSequence);
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
                            this.timeText.setText(LocaleController.formatString("CallText", C0952R.string.CallText, 1, 0));
                        } else if (i11 == 2) {
                            this.timeText.setText(LocaleController.formatString("SmsText", C0952R.string.SmsText, 1, 0));
                        }
                        createTimer();
                    } else if (i10 == 2 && ((i = this.nextType) == 4 || i == 3)) {
                        this.timeText.setText(LocaleController.formatString("CallText", C0952R.string.CallText, 2, 0));
                        this.problemText.setVisibility(this.time < 1000 ? 0 : 8);
                        TextView textView = this.timeText;
                        if (this.time >= 1000) {
                            i6 = 0;
                        }
                        textView.setVisibility(i6);
                        createTimer();
                    } else if (i10 == 4 && this.nextType == 2) {
                        this.timeText.setText(LocaleController.formatString("SmsText", C0952R.string.SmsText, 2, 0));
                        this.problemText.setVisibility(this.time < 1000 ? 0 : 8);
                        TextView textView2 = this.timeText;
                        if (this.time >= 1000) {
                            i6 = 0;
                        }
                        textView2.setVisibility(i6);
                        createTimer();
                    } else {
                        this.timeText.setVisibility(8);
                        this.problemText.setVisibility(8);
                        createCodeTimer();
                    }
                }
            }
        }

        public boolean lambda$setParams$4(int i, View view, int i2, KeyEvent keyEvent) {
            if (i2 != 67 || this.codeField[i].length() != 0 || i <= 0) {
                return false;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
            int i3 = i - 1;
            editTextBoldCursorArr[i3].setSelection(editTextBoldCursorArr[i3].length());
            this.codeField[i3].requestFocus();
            this.codeField[i3].dispatchKeyEvent(keyEvent);
            return true;
        }

        public boolean lambda$setParams$5(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            onNextPressed(null);
            return true;
        }

        public void createCodeTimer() {
            if (this.codeTimer == null) {
                this.codeTime = 15000;
                this.codeTimer = new Timer();
                this.lastCodeTime = System.currentTimeMillis();
                this.codeTimer.schedule(new C31954(), 0L, 1000L);
            }
        }

        public class C31954 extends TimerTask {
            C31954() {
            }

            @Override
            public void run() {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.PhoneConfirmationView.C31954.this.lambda$run$0();
                    }
                });
            }

            public void lambda$run$0() {
                double currentTimeMillis = System.currentTimeMillis();
                double d = PhoneConfirmationView.this.lastCodeTime;
                Double.isNaN(currentTimeMillis);
                PhoneConfirmationView.this.lastCodeTime = currentTimeMillis;
                PhoneConfirmationView.access$10026(PhoneConfirmationView.this, currentTimeMillis - d);
                if (PhoneConfirmationView.this.codeTime <= 1000) {
                    PhoneConfirmationView.this.problemText.setVisibility(0);
                    PhoneConfirmationView.this.timeText.setVisibility(8);
                    PhoneConfirmationView.this.destroyCodeTimer();
                }
            }
        }

        public void destroyCodeTimer() {
            try {
                synchronized (this.timerSync) {
                    Timer timer = this.codeTimer;
                    if (timer != null) {
                        timer.cancel();
                        this.codeTimer = null;
                    }
                }
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }

        private void createTimer() {
            if (this.timeTimer == null) {
                Timer timer = new Timer();
                this.timeTimer = timer;
                timer.schedule(new C31965(), 0L, 1000L);
            }
        }

        public class C31965 extends TimerTask {
            C31965() {
            }

            @Override
            public void run() {
                if (PhoneConfirmationView.this.timeTimer != null) {
                    double currentTimeMillis = System.currentTimeMillis();
                    double d = PhoneConfirmationView.this.lastCurrentTime;
                    Double.isNaN(currentTimeMillis);
                    PhoneConfirmationView.access$10626(PhoneConfirmationView.this, currentTimeMillis - d);
                    PhoneConfirmationView.this.lastCurrentTime = currentTimeMillis;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.PhoneConfirmationView.C31965.this.lambda$run$2();
                        }
                    });
                }
            }

            public void lambda$run$2() {
                if (PhoneConfirmationView.this.time >= 1000) {
                    int i = (PhoneConfirmationView.this.time / 1000) / 60;
                    int i2 = (PhoneConfirmationView.this.time / 1000) - (i * 60);
                    if (PhoneConfirmationView.this.nextType == 4 || PhoneConfirmationView.this.nextType == 3) {
                        PhoneConfirmationView.this.timeText.setText(LocaleController.formatString("CallText", C0952R.string.CallText, Integer.valueOf(i), Integer.valueOf(i2)));
                    } else if (PhoneConfirmationView.this.nextType == 2) {
                        PhoneConfirmationView.this.timeText.setText(LocaleController.formatString("SmsText", C0952R.string.SmsText, Integer.valueOf(i), Integer.valueOf(i2)));
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
                } else if (PhoneConfirmationView.this.verificationType != 2 && PhoneConfirmationView.this.verificationType != 4) {
                } else {
                    if (PhoneConfirmationView.this.nextType == 4 || PhoneConfirmationView.this.nextType == 2) {
                        if (PhoneConfirmationView.this.nextType == 4) {
                            PhoneConfirmationView.this.timeText.setText(LocaleController.getString("Calling", C0952R.string.Calling));
                        } else {
                            PhoneConfirmationView.this.timeText.setText(LocaleController.getString("SendingSms", C0952R.string.SendingSms));
                        }
                        PhoneConfirmationView.this.createCodeTimer();
                        TLRPC$TL_auth_resendCode tLRPC$TL_auth_resendCode = new TLRPC$TL_auth_resendCode();
                        tLRPC$TL_auth_resendCode.phone_number = PhoneConfirmationView.this.phone;
                        tLRPC$TL_auth_resendCode.phone_code_hash = PhoneConfirmationView.this.phoneHash;
                        ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tLRPC$TL_auth_resendCode, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                PassportActivity.PhoneConfirmationView.C31965.this.lambda$run$1(tLObject, tLRPC$TL_error);
                            }
                        }, 2);
                    } else if (PhoneConfirmationView.this.nextType == 3) {
                        AndroidUtilities.setWaitingForSms(false);
                        NotificationCenter.getGlobalInstance().removeObserver(PhoneConfirmationView.this, NotificationCenter.didReceiveSmsCode);
                        PhoneConfirmationView.this.waitingForEvent = false;
                        PhoneConfirmationView.this.destroyCodeTimer();
                        PhoneConfirmationView.this.resendCode();
                    }
                }
            }

            public void lambda$run$1(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                if (tLRPC$TL_error != null && tLRPC$TL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.PhoneConfirmationView.C31965.this.lambda$run$0(tLRPC$TL_error);
                        }
                    });
                }
            }

            public void lambda$run$0(TLRPC$TL_error tLRPC$TL_error) {
                PhoneConfirmationView.this.lastError = tLRPC$TL_error.text;
            }
        }

        public void destroyTimer() {
            try {
                synchronized (this.timerSync) {
                    Timer timer = this.timeTimer;
                    if (timer != null) {
                        timer.cancel();
                        this.timeTimer = null;
                    }
                }
            } catch (Exception e) {
                FileLog.m30e(e);
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
                sb.append(C0894PhoneFormat.stripExceptNumbers(editTextBoldCursorArr[i].getText().toString()));
                i++;
            }
        }

        @Override
        public void onNextPressed(String str) {
            if (!this.nextPressed) {
                if (str == null) {
                    str = getCode();
                }
                if (TextUtils.isEmpty(str)) {
                    AndroidUtilities.shakeView(this.codeFieldContainer, 2.0f, 0);
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
                final TLRPC$TL_account_verifyPhone tLRPC$TL_account_verifyPhone = new TLRPC$TL_account_verifyPhone();
                tLRPC$TL_account_verifyPhone.phone_number = this.phone;
                tLRPC$TL_account_verifyPhone.phone_code = str;
                tLRPC$TL_account_verifyPhone.phone_code_hash = this.phoneHash;
                destroyTimer();
                PassportActivity.this.needShowProgress();
                ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tLRPC$TL_account_verifyPhone, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        PassportActivity.PhoneConfirmationView.this.lambda$onNextPressed$7(tLRPC$TL_account_verifyPhone, tLObject, tLRPC$TL_error);
                    }
                }, 2);
            }
        }

        public void lambda$onNextPressed$7(final TLRPC$TL_account_verifyPhone tLRPC$TL_account_verifyPhone, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PassportActivity.PhoneConfirmationView.this.lambda$onNextPressed$6(tLRPC$TL_error, tLRPC$TL_account_verifyPhone);
                }
            });
        }

        public void lambda$onNextPressed$6(TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_account_verifyPhone tLRPC$TL_account_verifyPhone) {
            int i;
            int i2;
            PassportActivity.this.needHideProgress();
            this.nextPressed = false;
            if (tLRPC$TL_error == null) {
                destroyTimer();
                destroyCodeTimer();
                PassportActivityDelegate passportActivityDelegate = PassportActivity.this.delegate;
                TLRPC$TL_secureRequiredType tLRPC$TL_secureRequiredType = PassportActivity.this.currentType;
                String str = (String) PassportActivity.this.currentValues.get("phone");
                final PassportActivity passportActivity = PassportActivity.this;
                passportActivityDelegate.saveValue(tLRPC$TL_secureRequiredType, str, null, null, null, null, null, null, null, null, new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.this.finishFragment();
                    }
                }, null);
                return;
            }
            this.lastError = tLRPC$TL_error.text;
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
                AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tLRPC$TL_error, PassportActivity.this, tLRPC$TL_account_verifyPhone, new Object[0]);
            }
            PassportActivity.this.showEditDoneProgress(true, false);
            if (tLRPC$TL_error.text.contains("PHONE_CODE_EMPTY") || tLRPC$TL_error.text.contains("PHONE_CODE_INVALID")) {
                int i5 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
                    if (i5 < editTextBoldCursorArr.length) {
                        editTextBoldCursorArr[i5].setText("");
                        i5++;
                    } else {
                        editTextBoldCursorArr[0].requestFocus();
                        return;
                    }
                }
            } else if (tLRPC$TL_error.text.contains("PHONE_CODE_EXPIRED")) {
                onBackPressed(true);
                PassportActivity.this.setPage(0, true, null);
            }
        }

        @Override
        public boolean onBackPressed(boolean z) {
            if (!z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PassportActivity.this.getParentActivity());
                builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
                builder.setMessage(LocaleController.getString("StopVerification", C0952R.string.StopVerification));
                builder.setPositiveButton(LocaleController.getString("Continue", C0952R.string.Continue), null);
                builder.setNegativeButton(LocaleController.getString("Stop", C0952R.string.Stop), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PassportActivity.PhoneConfirmationView.this.lambda$onBackPressed$8(dialogInterface, i);
                    }
                });
                PassportActivity.this.showDialog(builder.create());
                return false;
            }
            TLRPC$TL_auth_cancelCode tLRPC$TL_auth_cancelCode = new TLRPC$TL_auth_cancelCode();
            tLRPC$TL_auth_cancelCode.phone_number = this.phone;
            tLRPC$TL_auth_cancelCode.phone_code_hash = this.phoneHash;
            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tLRPC$TL_auth_cancelCode, C3197x3891375b.INSTANCE, 2);
            destroyTimer();
            destroyCodeTimer();
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

        public void lambda$onBackPressed$8(DialogInterface dialogInterface, int i) {
            onBackPressed(true);
            PassportActivity.this.setPage(0, true, null);
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
        public void onShow() {
            super.onShow();
            LinearLayout linearLayout = this.codeFieldContainer;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                for (int length = this.codeField.length - 1; length >= 0; length--) {
                    if (length == 0 || this.codeField[length].length() != 0) {
                        this.codeField[length].requestFocus();
                        EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
                        editTextBoldCursorArr[length].setSelection(editTextBoldCursorArr[length].length());
                        AndroidUtilities.showKeyboard(this.codeField[length]);
                        return;
                    }
                }
            }
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            EditTextBoldCursor[] editTextBoldCursorArr;
            if (this.waitingForEvent && (editTextBoldCursorArr = this.codeField) != null) {
                if (i == NotificationCenter.didReceiveSmsCode) {
                    editTextBoldCursorArr[0].setText("" + objArr[0]);
                    onNextPressed(null);
                } else if (i == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.pattern, str)) {
                        this.ignoreOnTextChange = true;
                        this.codeField[0].setText(str);
                        this.ignoreOnTextChange = false;
                        onNextPressed(null);
                    }
                }
            }
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.scrollView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "actionBarDefaultSearch"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "actionBarDefaultSearchPlaceholder"));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.extraBackgroundView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        if (this.extraBackgroundView2 != null) {
            arrayList.add(new ThemeDescription(this.extraBackgroundView2, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        }
        for (int i = 0; i < this.dividers.size(); i++) {
            arrayList.add(new ThemeDescription(this.dividers.get(i), ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "divider"));
        }
        for (Map.Entry<SecureDocument, SecureDocumentCell> entry : this.documentsCells.entrySet()) {
            SecureDocumentCell value = entry.getValue();
            arrayList.add(new ThemeDescription(value, ThemeDescription.FLAG_SELECTORWHITE, new Class[]{SecureDocumentCell.class}, null, null, null, "windowBackgroundWhite"));
            arrayList.add(new ThemeDescription(value, 0, new Class[]{SecureDocumentCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(value, 0, new Class[]{SecureDocumentCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        }
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_SELECTORWHITE, new Class[]{TextDetailSettingsCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_SELECTORWHITE, new Class[]{TextSettingsCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_SELECTORWHITE, new Class[]{TextDetailSecureCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextDetailSecureCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextDetailSecureCell.class}, null, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextDetailSecureCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{TextDetailSecureCell.class}, new String[]{"checkImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "featuredStickers_addedIcon"));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        if (this.inputFields != null) {
            for (int i2 = 0; i2 < this.inputFields.length; i2++) {
                arrayList.add(new ThemeDescription((View) this.inputFields[i2].getParent(), ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
                arrayList.add(new ThemeDescription(this.inputFields[i2], ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
                arrayList.add(new ThemeDescription(this.inputFields[i2], ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
                arrayList.add(new ThemeDescription(this.inputFields[i2], ThemeDescription.FLAG_HINTTEXTCOLOR | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, "windowBackgroundWhiteBlueHeader"));
                arrayList.add(new ThemeDescription(this.inputFields[i2], ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
                arrayList.add(new ThemeDescription(this.inputFields[i2], ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
                arrayList.add(new ThemeDescription(this.inputFields[i2], ThemeDescription.FLAG_PROGRESSBAR | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteRedText3"));
            }
        } else {
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_PROGRESSBAR | ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlueHeader"));
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, "windowBackgroundWhiteRedText3"));
        }
        if (this.inputExtraFields != null) {
            for (int i3 = 0; i3 < this.inputExtraFields.length; i3++) {
                arrayList.add(new ThemeDescription((View) this.inputExtraFields[i3].getParent(), ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i3], ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i3], ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i3], ThemeDescription.FLAG_HINTTEXTCOLOR | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, "windowBackgroundWhiteBlueHeader"));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i3], ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i3], ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
                arrayList.add(new ThemeDescription(this.inputExtraFields[i3], ThemeDescription.FLAG_PROGRESSBAR | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteRedText3"));
            }
        }
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, "progressCircle"));
        arrayList.add(new ThemeDescription(this.noPasswordImageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "chat_messagePanelIcons"));
        arrayList.add(new ThemeDescription(this.noPasswordTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.noPasswordSetTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlueText5"));
        arrayList.add(new ThemeDescription(this.passwordForgotButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlueText4"));
        arrayList.add(new ThemeDescription(this.plusTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.acceptTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "passport_authorizeText"));
        arrayList.add(new ThemeDescription(this.bottomLayout, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "passport_authorizeBackground"));
        arrayList.add(new ThemeDescription(this.bottomLayout, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "passport_authorizeBackgroundSelected"));
        arrayList.add(new ThemeDescription(this.progressView, 0, null, null, null, null, "contextProgressInner2"));
        arrayList.add(new ThemeDescription(this.progressView, 0, null, null, null, null, "contextProgressOuter2"));
        arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, "contextProgressInner2"));
        arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, "contextProgressOuter2"));
        arrayList.add(new ThemeDescription(this.emptyImageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "sessions_devicesImage"));
        arrayList.add(new ThemeDescription(this.emptyTextView1, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.emptyTextView2, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.emptyTextView3, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlueText4"));
        return arrayList;
    }
}
