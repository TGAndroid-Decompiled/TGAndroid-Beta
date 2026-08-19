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
import java.io.BufferedReader;
import java.io.File;
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
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
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
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda24;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.SlideView;
import org.telegram.ui.Components.URLSpanNoUnderline;

public class PassportActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private TextView acceptTextView;
    private TextSettingsCell addDocumentCell;
    private ShadowSectionCell addDocumentSectionCell;
    private boolean allowNonLatinName;
    private ArrayList availableDocumentTypes;
    private TextInfoPrivacyCell bottomCell;
    private TextInfoPrivacyCell bottomCellTranslation;
    private FrameLayout bottomLayout;
    private boolean callbackCalled;
    private ChatAttachAlert chatAttachAlert;
    private HashMap codesMap;
    private ArrayList countriesArray;
    private HashMap countriesMap;
    private int currentActivityType;
    private long currentBotId;
    private String currentCallbackUrl;
    private String currentCitizeship;
    private HashMap currentDocumentValues;
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
    private HashMap currentValues;
    private int currentViewNum;
    private PassportActivityDelegate delegate;
    private TextSettingsCell deletePassportCell;
    private ArrayList dividers;
    private boolean documentOnly;
    private ArrayList documents;
    private HashMap documentsCells;
    private HashMap documentsErrors;
    private LinearLayout documentsLayout;
    private HashMap documentsToTypesLink;
    private ActionBarMenuItem doneItem;
    private AnimatorSet doneItemAnimation;
    private int emailCodeLength;
    private ImageView emptyImageView;
    private LinearLayout emptyLayout;
    private TextView emptyTextView1;
    private TextView emptyTextView2;
    private TextView emptyTextView3;
    private EmptyTextProgressView emptyView;
    private HashMap errorsMap;
    private HashMap errorsValues;
    private View extraBackgroundView;
    private View extraBackgroundView2;
    private HashMap fieldsErrors;
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
    private HashMap languageMap;
    private LinearLayout linearLayout2;
    private HashMap mainErrorsMap;
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
    private ArrayList permissionsItems;
    private HashMap phoneFormatMap;
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
    private ArrayList translationDocuments;
    private LinearLayout translationLayout;
    private HashMap typesValues;
    private HashMap typesViews;
    private TextSettingsCell uploadDocumentCell;
    private TextDetailSettingsCell uploadFrontCell;
    private TextDetailSettingsCell uploadReverseCell;
    private TextDetailSettingsCell uploadSelfieCell;
    private TextSettingsCell uploadTranslationCell;
    private HashMap uploadingDocuments;
    private int uploadingFileType;
    private boolean useCurrentValue;
    private int usingSavedPassword;
    private SlideView[] views;

    interface ErrorRunnable {
        void onError(String str, String str2);
    }

    interface PassportActivityDelegate {
        void deleteValue(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z, Runnable runnable, ErrorRunnable errorRunnable);

        SecureDocument saveFile(TLRPC.TL_secureFile tL_secureFile);

        void saveValue(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, ArrayList arrayList, SecureDocument secureDocument, ArrayList arrayList2, SecureDocument secureDocument2, SecureDocument secureDocument3, Runnable runnable, ErrorRunnable errorRunnable);
    }

    public class LinkSpan extends ClickableSpan {
        public LinkSpan() {
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setTypeface(AndroidUtilities.bold());
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

        public TextDetailSecureCell(Context context) {
            super(context);
            int i = PassportActivity.this.currentActivityType == 8 ? 21 : 51;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
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
            textView4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
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
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addedIcon), PorterDuff.Mode.MULTIPLY));
            this.checkImageView.setImageResource(R.drawable.sticker_added);
            addView(this.checkImageView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 25.0f, 21.0f, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
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
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
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
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
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
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
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
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + 1, 1073741824));
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int left = this.imageView.getLeft() + ((this.imageView.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) / 2);
            int top = this.imageView.getTop() + ((this.imageView.getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
            this.radialProgress.setProgressRect(left, top, AndroidUtilities.dp(24.0f) + left, AndroidUtilities.dp(24.0f) + top);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            boolean zDrawChild = super.drawChild(canvas, view, j);
            if (view == this.imageView) {
                this.radialProgress.draw(canvas);
            }
            return zDrawChild;
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

        @Override
        public void invalidate() {
            super.invalidate();
            this.textView.invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
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
        public int getObserverTag() {
            return this.TAG;
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
        HashMap map;
        String strEncodeToString;
        this(i, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
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
            Collections.sort(authorizationform.errors, new Comparator() {
                int getErrorValue(TLRPC.SecureValueError secureValueError) {
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
                    map = (HashMap) this.errorsMap.get(nameForType);
                    if (map == null) {
                        map = new HashMap();
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
                map = (HashMap) this.errorsMap.get(nameForType);
                if (map == null) {
                    map = new HashMap();
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

            public PassportActivity(int i, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap map, HashMap map2) {
                this.currentCitizeship = "";
                this.currentResidence = "";
                this.currentExpireDate = new int[3];
                this.dividers = new ArrayList();
                this.nonLatinNames = new boolean[3];
                this.allowNonLatinName = true;
                this.countriesArray = new ArrayList();
                this.countriesMap = new HashMap();
                this.codesMap = new HashMap();
                this.phoneFormatMap = new HashMap();
                this.documents = new ArrayList();
                this.translationDocuments = new ArrayList();
                this.documentsCells = new HashMap();
                this.uploadingDocuments = new HashMap();
                this.typesValues = new HashMap();
                this.typesViews = new HashMap();
                this.documentsToTypesLink = new HashMap();
                this.errorsMap = new HashMap();
                this.mainErrorsMap = new HashMap();
                this.errorsValues = new HashMap();
                this.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
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
                        String str = null;
                        if (PassportActivity.this.uploadingFileType == 1) {
                            PassportActivity.this.selfieDocument = null;
                            str = "selfie" + documentHash;
                        } else if (PassportActivity.this.uploadingFileType != 4) {
                            if (PassportActivity.this.uploadingFileType == 2) {
                                PassportActivity.this.frontDocument = null;
                                str = "front" + documentHash;
                            } else if (PassportActivity.this.uploadingFileType == 3) {
                                PassportActivity.this.reverseDocument = null;
                                str = "reverse" + documentHash;
                            } else if (PassportActivity.this.uploadingFileType == 0) {
                                str = "files" + documentHash;
                            }
                        } else {
                            str = "translation" + documentHash;
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

                    @Override
                    public String getDeleteMessageString() {
                        if (PassportActivity.this.uploadingFileType == 1) {
                            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
                        }
                        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
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
                    this.permissionsItems = new ArrayList();
                } else if (i == 7) {
                    this.views = new SlideView[3];
                }
                if (this.currentValues == null) {
                    this.currentValues = new HashMap();
                }
                if (this.currentDocumentValues == null) {
                    this.currentDocumentValues = new HashMap();
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
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    PassportActivity.$r8$lambda$zpSXSBH9Jl1Ue6Z13JiM9UoBiyA(tLObject);
                                }
                            });
                        }
                    });
                }
            }

            public static void $r8$lambda$zpSXSBH9Jl1Ue6Z13JiM9UoBiyA(TLObject tLObject) {
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                } else {
                    SharedConfig.getCountryLangs();
                }
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
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.m3608$r8$lambda$iY5oC0CTvJkA5YbIFf8gJGl6W4(this.f$0);
                        }
                    }, 200L);
                }
                AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            }

            public static void m3608$r8$lambda$iY5oC0CTvJkA5YbIFf8gJGl6W4(PassportActivity passportActivity) {
                ViewGroup viewGroup;
                ViewGroup[] viewGroupArr = passportActivity.inputFieldContainers;
                if (viewGroupArr == null || (viewGroup = viewGroupArr[0]) == null || viewGroup.getVisibility() != 0) {
                    return;
                }
                passportActivity.inputFields[0].requestFocus();
                AndroidUtilities.showKeyboard(passportActivity.inputFields[0]);
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
            public View createView(Context context) {
                ChatAttachAlert chatAttachAlert;
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass3());
                if (this.currentActivityType == 7) {
                    ScrollView scrollView = new ScrollView(context) {
                        @Override
                        protected boolean onRequestFocusInDescendants(int i, Rect rect) {
                            return false;
                        }

                        @Override
                        public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                            if (PassportActivity.this.currentViewNum == 1 || PassportActivity.this.currentViewNum == 2 || PassportActivity.this.currentViewNum == 4) {
                                rect.bottom += AndroidUtilities.dp(40.0f);
                            }
                            return super.requestChildRectangleOnScreen(view, rect, z);
                        }

                        @Override
                        protected void onMeasure(int i, int i2) {
                            PassportActivity.this.scrollHeight = View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(30.0f);
                            super.onMeasure(i, i2);
                        }
                    };
                    this.scrollView = scrollView;
                    this.fragmentView = scrollView;
                    scrollView.setFillViewport(true);
                    AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(Theme.key_actionBarDefault));
                } else {
                    FrameLayout frameLayout = new FrameLayout(context);
                    this.fragmentView = frameLayout;
                    frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
                    ScrollView scrollView2 = new ScrollView(context) {
                        @Override
                        protected boolean onRequestFocusInDescendants(int i, Rect rect) {
                            return false;
                        }

                        @Override
                        public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                            rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                            rect.top += AndroidUtilities.dp(20.0f);
                            rect.bottom += AndroidUtilities.dp(50.0f);
                            return super.requestChildRectangleOnScreen(view, rect, z);
                        }
                    };
                    this.scrollView = scrollView2;
                    scrollView2.setFillViewport(true);
                    AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(Theme.key_actionBarDefault));
                    frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.currentActivityType == 0 ? 48.0f : 0.0f));
                    LinearLayout linearLayout = new LinearLayout(context);
                    this.linearLayout2 = linearLayout;
                    linearLayout.setOrientation(1);
                    this.scrollView.addView(this.linearLayout2, new FrameLayout.LayoutParams(-1, -2));
                }
                int i = this.currentActivityType;
                if (i != 0 && i != 8) {
                    this.doneItem = this.actionBar.createMenu().addItemWithWidth(2, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
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

            class AnonymousClass3 extends ActionBar.ActionBarMenuOnItemClick {
                AnonymousClass3() {
                }

                private boolean onIdentityDone(final Runnable runnable, final ErrorRunnable errorRunnable) {
                    JSONObject jSONObject;
                    JSONObject jSONObject2;
                    String string;
                    String string2;
                    String string3;
                    if (!PassportActivity.this.uploadingDocuments.isEmpty() || PassportActivity.this.checkFieldsForError()) {
                        return false;
                    }
                    if (PassportActivity.this.allowNonLatinName) {
                        PassportActivity.this.allowNonLatinName = false;
                        boolean z = false;
                        for (final int i = 0; i < PassportActivity.this.nonLatinNames.length; i++) {
                            if (PassportActivity.this.nonLatinNames[i]) {
                                PassportActivity.this.inputFields[i].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                if (!z) {
                                    if (PassportActivity.this.nonLatinNames[0]) {
                                        PassportActivity passportActivity = PassportActivity.this;
                                        string = passportActivity.getTranslitString(passportActivity.inputExtraFields[0].getText().toString());
                                    } else {
                                        string = PassportActivity.this.inputFields[0].getText().toString();
                                    }
                                    final String str = string;
                                    if (PassportActivity.this.nonLatinNames[1]) {
                                        PassportActivity passportActivity2 = PassportActivity.this;
                                        string2 = passportActivity2.getTranslitString(passportActivity2.inputExtraFields[1].getText().toString());
                                    } else {
                                        string2 = PassportActivity.this.inputFields[1].getText().toString();
                                    }
                                    final String str2 = string2;
                                    if (PassportActivity.this.nonLatinNames[2]) {
                                        PassportActivity passportActivity3 = PassportActivity.this;
                                        string3 = passportActivity3.getTranslitString(passportActivity3.inputExtraFields[2].getText().toString());
                                    } else {
                                        string3 = PassportActivity.this.inputFields[2].getText().toString();
                                    }
                                    final String str3 = string3;
                                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                                        AlertDialog.Builder builder = new AlertDialog.Builder(PassportActivity.this.getParentActivity());
                                        builder.setMessage(LocaleController.formatString("PassportNameCheckAlert", R.string.PassportNameCheckAlert, str, str2, str3));
                                        builder.setTitle(LocaleController.getString(R.string.AppName));
                                        builder.setPositiveButton(LocaleController.getString(R.string.Done), new AlertDialog.OnButtonClickListener() {
                                            @Override
                                            public final void onClick(AlertDialog alertDialog, int i2) {
                                                PassportActivity.AnonymousClass3.$r8$lambda$0XPSqHb3SyfykSt6FOYFcxEqlQQ(this.f$0, str, str2, str3, runnable, errorRunnable, alertDialog, i2);
                                            }
                                        });
                                        builder.setNegativeButton(LocaleController.getString(R.string.Edit), new AlertDialog.OnButtonClickListener() {
                                            @Override
                                            public final void onClick(AlertDialog alertDialog, int i2) {
                                                PassportActivity.AnonymousClass3.m3616$r8$lambda$FFF4CFeKgk_Ne8UBwhhw9089Q(this.f$0, i, alertDialog, i2);
                                            }
                                        });
                                        PassportActivity.this.showDialog(builder.create());
                                    } else {
                                        PassportActivity passportActivity4 = PassportActivity.this;
                                        passportActivity4.onFieldError(passportActivity4.inputFields[i]);
                                    }
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            return false;
                        }
                    }
                    if (!PassportActivity.this.isHasNotAnyChanges()) {
                        SecureDocument secureDocument = null;
                        try {
                            if (PassportActivity.this.documentOnly) {
                                jSONObject = null;
                            } else {
                                HashMap map = new HashMap(PassportActivity.this.currentValues);
                                if (PassportActivity.this.currentType.native_names) {
                                    if (PassportActivity.this.nativeInfoCell.getVisibility() == 0) {
                                        map.put("first_name_native", PassportActivity.this.inputExtraFields[0].getText().toString());
                                        map.put("middle_name_native", PassportActivity.this.inputExtraFields[1].getText().toString());
                                        map.put("last_name_native", PassportActivity.this.inputExtraFields[2].getText().toString());
                                    } else {
                                        map.put("first_name_native", PassportActivity.this.inputFields[0].getText().toString());
                                        map.put("middle_name_native", PassportActivity.this.inputFields[1].getText().toString());
                                        map.put("last_name_native", PassportActivity.this.inputFields[2].getText().toString());
                                    }
                                }
                                map.put("first_name", PassportActivity.this.inputFields[0].getText().toString());
                                map.put("middle_name", PassportActivity.this.inputFields[1].getText().toString());
                                map.put("last_name", PassportActivity.this.inputFields[2].getText().toString());
                                map.put("birth_date", PassportActivity.this.inputFields[3].getText().toString());
                                map.put("gender", PassportActivity.this.currentGender);
                                map.put("country_code", PassportActivity.this.currentCitizeship);
                                map.put("residence_country_code", PassportActivity.this.currentResidence);
                                jSONObject = new JSONObject();
                                try {
                                    ArrayList arrayList = new ArrayList(map.keySet());
                                    Collections.sort(arrayList, new Comparator() {
                                        @Override
                                        public final int compare(Object obj, Object obj2) {
                                            return PassportActivity.AnonymousClass3.$r8$lambda$eAF8B6x195EZ3tmKUZy9CSufAIA(this.f$0, (String) obj, (String) obj2);
                                        }
                                    });
                                    int size = arrayList.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        String str4 = (String) arrayList.get(i2);
                                        jSONObject.put(str4, map.get(str4));
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            if (PassportActivity.this.currentDocumentsType != null) {
                                HashMap map2 = new HashMap(PassportActivity.this.currentDocumentValues);
                                map2.put("document_no", PassportActivity.this.inputFields[7].getText().toString());
                                if (PassportActivity.this.currentExpireDate[0] != 0) {
                                    map2.put("expiry_date", String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(PassportActivity.this.currentExpireDate[2]), Integer.valueOf(PassportActivity.this.currentExpireDate[1]), Integer.valueOf(PassportActivity.this.currentExpireDate[0])));
                                } else {
                                    map2.put("expiry_date", "");
                                }
                                jSONObject2 = new JSONObject();
                                try {
                                    ArrayList arrayList2 = new ArrayList(map2.keySet());
                                    Collections.sort(arrayList2, new Comparator() {
                                        @Override
                                        public final int compare(Object obj, Object obj2) {
                                            return PassportActivity.AnonymousClass3.$r8$lambda$XY3IJ1rN_cVDNoVZX4UYSiiJcWQ(this.f$0, (String) obj, (String) obj2);
                                        }
                                    });
                                    int size2 = arrayList2.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        String str5 = (String) arrayList2.get(i3);
                                        jSONObject2.put(str5, map2.get(str5));
                                    }
                                } catch (Exception unused2) {
                                }
                            } else {
                                jSONObject2 = null;
                            }
                        } catch (Exception unused3) {
                            jSONObject = null;
                        }
                        if (PassportActivity.this.fieldsErrors != null) {
                            PassportActivity.this.fieldsErrors.clear();
                        }
                        if (PassportActivity.this.documentsErrors != null) {
                            PassportActivity.this.documentsErrors.clear();
                        }
                        PassportActivityDelegate passportActivityDelegate = PassportActivity.this.delegate;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType = PassportActivity.this.currentType;
                        String string4 = jSONObject != null ? jSONObject.toString() : null;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = PassportActivity.this.currentDocumentsType;
                        String string5 = jSONObject2 != null ? jSONObject2.toString() : null;
                        SecureDocument secureDocument2 = PassportActivity.this.selfieDocument;
                        ArrayList arrayList3 = PassportActivity.this.translationDocuments;
                        SecureDocument secureDocument3 = PassportActivity.this.frontDocument;
                        if (PassportActivity.this.reverseLayout != null && PassportActivity.this.reverseLayout.getVisibility() == 0) {
                            secureDocument = PassportActivity.this.reverseDocument;
                        }
                        passportActivityDelegate.saveValue(tL_secureRequiredType, null, string4, tL_secureRequiredType2, string5, null, secureDocument2, arrayList3, secureDocument3, secureDocument, runnable, errorRunnable);
                        return true;
                    }
                    PassportActivity.this.finishFragment();
                    return false;
                }

                public static void $r8$lambda$0XPSqHb3SyfykSt6FOYFcxEqlQQ(AnonymousClass3 anonymousClass3, String str, String str2, String str3, Runnable runnable, ErrorRunnable errorRunnable, AlertDialog alertDialog, int i) {
                    PassportActivity.this.inputFields[0].setText(str);
                    PassportActivity.this.inputFields[1].setText(str2);
                    PassportActivity.this.inputFields[2].setText(str3);
                    PassportActivity.this.showEditDoneProgress(true, true);
                    anonymousClass3.onIdentityDone(runnable, errorRunnable);
                }

                public static void m3616$r8$lambda$FFF4CFeKgk_Ne8UBwhhw9089Q(AnonymousClass3 anonymousClass3, int i, AlertDialog alertDialog, int i2) {
                    PassportActivity passportActivity = PassportActivity.this;
                    passportActivity.onFieldError(passportActivity.inputFields[i]);
                }

                public static int $r8$lambda$eAF8B6x195EZ3tmKUZy9CSufAIA(AnonymousClass3 anonymousClass3, String str, String str2) {
                    int fieldCost = PassportActivity.this.getFieldCost(str);
                    int fieldCost2 = PassportActivity.this.getFieldCost(str2);
                    if (fieldCost < fieldCost2) {
                        return -1;
                    }
                    return fieldCost > fieldCost2 ? 1 : 0;
                }

                public static int $r8$lambda$XY3IJ1rN_cVDNoVZX4UYSiiJcWQ(AnonymousClass3 anonymousClass3, String str, String str2) {
                    int fieldCost = PassportActivity.this.getFieldCost(str);
                    int fieldCost2 = PassportActivity.this.getFieldCost(str2);
                    if (fieldCost < fieldCost2) {
                        return -1;
                    }
                    return fieldCost > fieldCost2 ? 1 : 0;
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
                        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_dialogTextLink));
                        linksTextView.setHighlightColor(Theme.getColor(Theme.key_dialogLinkSelection));
                        linksTextView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                        linksTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                        AlertDialog.Builder builder = new AlertDialog.Builder(PassportActivity.this.getParentActivity());
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
                            PassportActivity.this.views[PassportActivity.this.currentViewNum].onNextPressed(null);
                            return;
                        }
                        final Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                PassportActivity.this.finishFragment();
                            }
                        };
                        final ErrorRunnable errorRunnable = new ErrorRunnable() {
                            @Override
                            public void onError(String str2, String str3) {
                                if (!"PHONE_VERIFICATION_NEEDED".equals(str2)) {
                                    PassportActivity.this.showEditDoneProgress(true, false);
                                } else {
                                    PassportActivity passportActivity = PassportActivity.this;
                                    passportActivity.startPhoneVerification(true, str3, runnable, this, passportActivity.delegate);
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
                            PassportActivity.this.delegate.saveValue(PassportActivity.this.currentType, string, null, null, null, null, null, null, null, null, runnable, errorRunnable);
                        } else if (PassportActivity.this.currentActivityType == 3) {
                            if (PassportActivity.this.useCurrentValue) {
                                str = UserConfig.getInstance(((BaseFragment) PassportActivity.this).currentAccount).getCurrentUser().phone;
                            } else {
                                if (PassportActivity.this.checkFieldsForError()) {
                                    return;
                                }
                                str = PassportActivity.this.inputFields[1].getText().toString() + PassportActivity.this.inputFields[2].getText().toString();
                            }
                            PassportActivity.this.delegate.saveValue(PassportActivity.this.currentType, str, null, null, null, null, null, null, null, null, runnable, errorRunnable);
                        } else if (PassportActivity.this.currentActivityType == 2) {
                            if (!PassportActivity.this.uploadingDocuments.isEmpty() || PassportActivity.this.checkFieldsForError()) {
                                return;
                            }
                            if (!PassportActivity.this.isHasNotAnyChanges()) {
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
                                PassportActivity.this.delegate.saveValue(PassportActivity.this.currentType, null, jSONObject != null ? jSONObject.toString() : null, PassportActivity.this.currentDocumentsType, null, PassportActivity.this.documents, PassportActivity.this.selfieDocument, PassportActivity.this.translationDocuments, null, null, runnable, errorRunnable);
                            } else {
                                PassportActivity.this.finishFragment();
                                return;
                            }
                        } else if (PassportActivity.this.currentActivityType != 1) {
                            if (PassportActivity.this.currentActivityType == 6) {
                                final TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                                tL_emailVerificationCode.code = PassportActivity.this.inputFields[0].getText().toString();
                                verifyemail.verification = tL_emailVerificationCode;
                                ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(verifyemail, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                        PassportActivity.AnonymousClass3.$r8$lambda$SE6_aLdRb_0ssAXgnMgV5o15vFE(this.f$0, runnable, errorRunnable, verifyemail, tLObject, tL_error);
                                    }
                                }), ((BaseFragment) PassportActivity.this).classGuid);
                            }
                        } else if (!onIdentityDone(runnable, errorRunnable)) {
                            return;
                        }
                        PassportActivity.this.showEditDoneProgress(true, true);
                    }
                }

                public static void $r8$lambda$SE6_aLdRb_0ssAXgnMgV5o15vFE(final AnonymousClass3 anonymousClass3, final Runnable runnable, final ErrorRunnable errorRunnable, final TL_account.verifyEmail verifyemail, TLObject tLObject, final TLRPC.TL_error tL_error) {
                    anonymousClass3.getClass();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.AnonymousClass3.$r8$lambda$uly5LaRZCK8FOVXhGXxKOer3cl4(this.f$0, tL_error, runnable, errorRunnable, verifyemail);
                        }
                    });
                }

                public static void $r8$lambda$uly5LaRZCK8FOVXhGXxKOer3cl4(AnonymousClass3 anonymousClass3, TLRPC.TL_error tL_error, Runnable runnable, ErrorRunnable errorRunnable, TL_account.verifyEmail verifyemail) {
                    if (tL_error == null) {
                        PassportActivity.this.delegate.saveValue(PassportActivity.this.currentType, (String) PassportActivity.this.currentValues.get("email"), null, null, null, null, null, null, null, null, runnable, errorRunnable);
                    } else {
                        AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tL_error, PassportActivity.this, verifyemail, new Object[0]);
                        errorRunnable.onError(null, null);
                    }
                }
            }

            @Override
            public boolean dismissDialogOnPause(Dialog dialog) {
                return dialog != this.chatAttachAlert && super.dismissDialogOnPause(dialog);
            }

            @Override
            public void dismissCurrentDialog() {
                ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
                if (chatAttachAlert != null && this.visibleDialog == chatAttachAlert) {
                    chatAttachAlert.getPhotoLayout().closeCamera(false);
                    this.chatAttachAlert.dismissInternal();
                    this.chatAttachAlert.getPhotoLayout().hideCamera(true);
                    return;
                }
                super.dismissCurrentDialog();
            }

            public String getTranslitString(String str) {
                return LocaleController.getInstance().getTranslitString(str, true);
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
                bundle.putString("phone", (String) this.currentValues.get("phone"));
                fillNextCodeParams(bundle, this.currentPhoneVerification, false);
            }

            private void loadPasswordInfo() {
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        PassportActivity.m3599$r8$lambda$DAljIjsH8pbqsXx3chyrrDsbDg(this.f$0, tLObject, tL_error);
                    }
                }), this.classGuid);
            }

            public static void m3599$r8$lambda$DAljIjsH8pbqsXx3chyrrDsbDg(final PassportActivity passportActivity, final TLObject tLObject, TLRPC.TL_error tL_error) {
                passportActivity.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.m3613$r8$lambda$vOemIGqXR4_ukAtrAsNV2MG3e0(this.f$0, tLObject);
                    }
                });
            }

            public static void m3613$r8$lambda$vOemIGqXR4_ukAtrAsNV2MG3e0(PassportActivity passportActivity, TLObject tLObject) {
                passportActivity.getClass();
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    passportActivity.currentPassword = password;
                    if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                        AlertsCreator.showUpdateAppAlert(passportActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.initPasswordNewAlgo(passportActivity.currentPassword);
                    passportActivity.updatePasswordInterface();
                    if (passportActivity.inputFieldContainers[0].getVisibility() == 0) {
                        passportActivity.inputFields[0].requestFocus();
                        AndroidUtilities.showKeyboard(passportActivity.inputFields[0]);
                    }
                    if (passportActivity.usingSavedPassword == 1) {
                        passportActivity.onPasswordDone(true);
                    }
                }
            }

            private void createEmailVerificationInterface(Context context) {
                this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
                this.inputFields = new EditTextBoldCursor[1];
                FrameLayout frameLayout = new FrameLayout(context);
                this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
                frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                this.inputFields[0] = new EditTextBoldCursor(context);
                this.inputFields[0].setTag(0);
                this.inputFields[0].setTextSize(1, 16.0f);
                this.inputFields[0].setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor = this.inputFields[0];
                int i = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor.setTextColor(Theme.getColor(i));
                this.inputFields[0].setBackgroundDrawable(null);
                this.inputFields[0].setCursorColor(Theme.getColor(i));
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
                this.inputFields[0].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                        return PassportActivity.$r8$lambda$tVL_7kk0WZjQL_5EPGHea5mN11Y(this.f$0, textView, i2, keyEvent);
                    }
                });
                this.inputFields[0].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (PassportActivity.this.ignoreOnTextChange || PassportActivity.this.emailCodeLength == 0 || PassportActivity.this.inputFields[0].length() != PassportActivity.this.emailCodeLength) {
                            return;
                        }
                        PassportActivity.this.doneItem.callOnClick();
                    }
                });
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
                this.bottomCell = textInfoPrivacyCell;
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                this.bottomCell.setText(LocaleController.formatString("PassportEmailVerifyInfo", R.string.PassportEmailVerifyInfo, this.currentValues.get("email")));
                this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            }

            public static boolean $r8$lambda$tVL_7kk0WZjQL_5EPGHea5mN11Y(PassportActivity passportActivity, TextView textView, int i, KeyEvent keyEvent) {
                passportActivity.getClass();
                if (i != 6 && i != 5) {
                    return false;
                }
                passportActivity.doneItem.callOnClick();
                return true;
            }

            private void createPasswordInterface(Context context) {
                TLRPC.User currentUser;
                if (this.currentForm != null) {
                    int i = 0;
                    while (true) {
                        if (i >= this.currentForm.users.size()) {
                            currentUser = null;
                            break;
                        }
                        currentUser = this.currentForm.users.get(i);
                        if (currentUser.id == this.currentBotId) {
                            break;
                        } else {
                            i++;
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
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
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
                this.noPasswordImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelIcons), PorterDuff.Mode.MULTIPLY));
                this.linearLayout2.addView(this.noPasswordImageView, LayoutHelper.createLinear(-2, -2, 49, 0, 13, 0, 0));
                TextView textView = new TextView(context);
                this.noPasswordTextView = textView;
                textView.setTextSize(1, 14.0f);
                this.noPasswordTextView.setGravity(1);
                this.noPasswordTextView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(17.0f));
                this.noPasswordTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
                this.noPasswordTextView.setText(LocaleController.getString(R.string.TelegramPassportCreatePasswordInfo));
                this.linearLayout2.addView(this.noPasswordTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.noPasswordSetTextView = textView2;
                textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText5));
                this.noPasswordSetTextView.setGravity(17);
                this.noPasswordSetTextView.setTextSize(1, 16.0f);
                this.noPasswordSetTextView.setTypeface(AndroidUtilities.bold());
                this.noPasswordSetTextView.setText(LocaleController.getString(R.string.TelegramPassportCreatePassword));
                this.linearLayout2.addView(this.noPasswordSetTextView, LayoutHelper.createFrame(-1, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 9.0f, 21.0f, 0.0f));
                this.noPasswordSetTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PassportActivity.$r8$lambda$sp6u31Zub4GH6cj24YRVSJikMlo(this.f$0, view);
                    }
                });
                this.inputFields = new EditTextBoldCursor[1];
                this.inputFieldContainers = new ViewGroup[]{new FrameLayout(context)};
                this.linearLayout2.addView(this.inputFieldContainers[0], LayoutHelper.createLinear(-1, 50));
                this.inputFieldContainers[0].setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                this.inputFields[0] = new EditTextBoldCursor(context);
                this.inputFields[0].setTag(0);
                this.inputFields[0].setTextSize(1, 16.0f);
                this.inputFields[0].setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor = this.inputFields[0];
                int i2 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor.setTextColor(Theme.getColor(i2));
                this.inputFields[0].setBackgroundDrawable(null);
                this.inputFields[0].setCursorColor(Theme.getColor(i2));
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
                this.inputFields[0].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView3, int i3, KeyEvent keyEvent) {
                        return PassportActivity.$r8$lambda$VdaDpQWHrQj1ME54U6ujiOQiV2I(this.f$0, textView3, i3, keyEvent);
                    }
                });
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
                TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
                this.passwordInfoRequestTextView = textInfoPrivacyCell2;
                textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                this.passwordInfoRequestTextView.setText(LocaleController.formatString("PassportRequestPasswordInfo", R.string.PassportRequestPasswordInfo, new Object[0]));
                this.linearLayout2.addView(this.passwordInfoRequestTextView, LayoutHelper.createLinear(-1, -2));
                TextView textView3 = new TextView(context);
                this.passwordForgotButton = textView3;
                textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
                this.passwordForgotButton.setTextSize(1, 14.0f);
                this.passwordForgotButton.setText(LocaleController.getString(R.string.ForgotPassword));
                this.passwordForgotButton.setPadding(0, 0, 0, 0);
                this.linearLayout2.addView(this.passwordForgotButton, LayoutHelper.createLinear(-2, 30, (LocaleController.isRTL ? 5 : 3) | 48, 21, 0, 21, 0));
                this.passwordForgotButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PassportActivity.$r8$lambda$wGX1gXqVpAikMsno12bg2frw8VY(this.f$0, view);
                    }
                });
                updatePasswordInterface();
            }

            public static void $r8$lambda$sp6u31Zub4GH6cj24YRVSJikMlo(PassportActivity passportActivity, View view) {
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(passportActivity.currentAccount, 0, passportActivity.currentPassword);
                twoStepVerificationSetupActivity.setCloseAfterSet(true);
                passportActivity.presentFragment(twoStepVerificationSetupActivity);
            }

            public static boolean $r8$lambda$VdaDpQWHrQj1ME54U6ujiOQiV2I(PassportActivity passportActivity, TextView textView, int i, KeyEvent keyEvent) {
                passportActivity.getClass();
                if (i != 5 && i != 6) {
                    return false;
                }
                passportActivity.doneItem.callOnClick();
                return true;
            }

            public static void $r8$lambda$wGX1gXqVpAikMsno12bg2frw8VY(final PassportActivity passportActivity, View view) {
                if (passportActivity.currentPassword.has_recovery) {
                    passportActivity.needShowProgress();
                    ConnectionsManager.getInstance(passportActivity.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(passportActivity.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            PassportActivity.$r8$lambda$vgTs2pY2dAlvkhZk8Oz_DODNjhc(this.f$0, tLObject, tL_error);
                        }
                    }, 10), passportActivity.classGuid);
                    return;
                }
                if (passportActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity());
                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                builder.setNegativeButton(LocaleController.getString(R.string.RestorePasswordResetAccount), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        PassportActivity passportActivity2 = this.f$0;
                        Browser.openUrl(passportActivity2.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(passportActivity2.currentAccount).getClientPhone());
                    }
                });
                builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
                builder.setMessage(LocaleController.getString(R.string.RestorePasswordNoEmailText));
                passportActivity.showDialog(builder.create());
            }

            public static void $r8$lambda$vgTs2pY2dAlvkhZk8Oz_DODNjhc(final PassportActivity passportActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
                passportActivity.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.m3606$r8$lambda$_w_RZbip5cP1g6uSYu5WD1gfOU(this.f$0, tL_error, tLObject);
                    }
                });
            }

            public static void m3606$r8$lambda$_w_RZbip5cP1g6uSYu5WD1gfOU(final PassportActivity passportActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
                String pluralString;
                passportActivity.needHideProgress();
                if (tL_error == null) {
                    final TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject;
                    AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity());
                    builder.setMessage(LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern));
                    builder.setTitle(LocaleController.getString(R.string.RestoreEmailSentTitle));
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i) {
                            PassportActivity.$r8$lambda$3bmgB0x_UwtzH1B8qPLvpwZYpDk(this.f$0, tL_auth_passwordRecovery, alertDialog, i);
                        }
                    });
                    Dialog dialogShowDialog = passportActivity.showDialog(builder.create());
                    if (dialogShowDialog != null) {
                        dialogShowDialog.setCanceledOnTouchOutside(false);
                        dialogShowDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (iIntValue < 60) {
                        pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
                    } else {
                        pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
                    }
                    passportActivity.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
                    return;
                }
                passportActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
            }

            public static void $r8$lambda$3bmgB0x_UwtzH1B8qPLvpwZYpDk(PassportActivity passportActivity, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery, AlertDialog alertDialog, int i) {
                TL_account.Password password = passportActivity.currentPassword;
                password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
                passportActivity.presentFragment(new TwoStepVerificationSetupActivity(passportActivity.currentAccount, 4, password));
            }

            public void onPasswordDone(final boolean z) {
                final String string;
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
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.$r8$lambda$X0sKVTdBSYnCa5gHGty39hZf0bY(this.f$0, z, string);
                    }
                });
            }

            public static void $r8$lambda$X0sKVTdBSYnCa5gHGty39hZf0bY(PassportActivity passportActivity, boolean z, String str) {
                byte[] bArr;
                byte[] x;
                AnonymousClass8 anonymousClass8;
                TL_account.Password password;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo;
                TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck;
                passportActivity.getClass();
                TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
                if (z) {
                    x = passportActivity.savedPasswordHash;
                } else {
                    if (passportActivity.currentPassword.current_algo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                        x = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passportActivity.currentPassword.current_algo);
                    } else {
                        bArr = null;
                    }
                    anonymousClass8 = passportActivity.new AnonymousClass8(z, bArr, getpasswordsettings, str);
                    password = passportActivity.currentPassword;
                    passwordKdfAlgo = password.current_algo;
                    if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                        tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
                        if (tL_inputCheckPasswordSRPStartCheck == null) {
                            TLRPC.TL_error tL_error = new TLRPC.TL_error();
                            tL_error.text = "ALGO_INVALID";
                            anonymousClass8.run(null, tL_error);
                            return;
                        } else {
                            ConnectionsManager.getInstance(passportActivity.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(passportActivity.currentAccount).sendRequest(getpasswordsettings, anonymousClass8, 10), passportActivity.classGuid);
                            return;
                        }
                    }
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "PASSWORD_HASH_INVALID";
                    anonymousClass8.run(null, tL_error2);
                }
                bArr = x;
                anonymousClass8 = passportActivity.new AnonymousClass8(z, bArr, getpasswordsettings, str);
                password = passportActivity.currentPassword;
                passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
                    if (tL_inputCheckPasswordSRPStartCheck == null) {
                        TLRPC.TL_error tL_error3 = new TLRPC.TL_error();
                        tL_error3.text = "ALGO_INVALID";
                        anonymousClass8.run(null, tL_error3);
                        return;
                    } else {
                        ConnectionsManager.getInstance(passportActivity.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(passportActivity.currentAccount).sendRequest(getpasswordsettings, anonymousClass8, 10), passportActivity.classGuid);
                        return;
                    }
                }
                TLRPC.TL_error tL_error4 = new TLRPC.TL_error();
                tL_error4.text = "PASSWORD_HASH_INVALID";
                anonymousClass8.run(null, tL_error4);
            }

            class AnonymousClass8 implements RequestDelegate {
                final TL_account.getPasswordSettings val$req;
                final boolean val$saved;
                final String val$textPassword;
                final byte[] val$x_bytes;

                AnonymousClass8(boolean z, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
                    this.val$saved = z;
                    this.val$x_bytes = bArr;
                    this.val$req = getpasswordsettings;
                    this.val$textPassword = str;
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
                    if (((BaseFragment) PassportActivity.this).parentLayout != null && ((BaseFragment) PassportActivity.this).parentLayout.checkTransitionAnimation()) {
                        PassportActivity.this.presentAfterAnimation = passportActivity;
                    } else {
                        PassportActivity.this.presentFragment(passportActivity, true);
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
                    ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(this.val$req, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            PassportActivity.AnonymousClass8.$r8$lambda$Eqpv5i_FPutaUQNKDy1FPpJ31qU(this.f$0, tLObject, tL_error);
                        }
                    });
                }

                public static void $r8$lambda$Eqpv5i_FPutaUQNKDy1FPpJ31qU(final AnonymousClass8 anonymousClass8, TLObject tLObject, final TLRPC.TL_error tL_error) {
                    anonymousClass8.getClass();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.AnonymousClass8.$r8$lambda$iwMABCbrAb4blvFxGKH1gLHD3Lk(this.f$0, tL_error);
                        }
                    });
                }

                public static void $r8$lambda$iwMABCbrAb4blvFxGKH1gLHD3Lk(final AnonymousClass8 anonymousClass8, TLRPC.TL_error tL_error) {
                    if (tL_error != null) {
                        anonymousClass8.getClass();
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                                    PassportActivity.AnonymousClass8.$r8$lambda$8wAtAcSujdshpqqU8W0HgXpUHNE(this.f$0, tLObject, tL_error2);
                                }
                            }, 8);
                            return;
                        }
                    }
                    anonymousClass8.generateNewSecret();
                }

                public static void $r8$lambda$8wAtAcSujdshpqqU8W0HgXpUHNE(final AnonymousClass8 anonymousClass8, final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    anonymousClass8.getClass();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.AnonymousClass8.$r8$lambda$RHZPwo2_IEGXBI2VzmLmPmz1WdM(this.f$0, tL_error, tLObject);
                        }
                    });
                }

                public static void $r8$lambda$RHZPwo2_IEGXBI2VzmLmPmz1WdM(AnonymousClass8 anonymousClass8, TLRPC.TL_error tL_error, TLObject tLObject) {
                    if (tL_error != null) {
                        anonymousClass8.getClass();
                        return;
                    }
                    PassportActivity.this.currentPassword = (TL_account.Password) tLObject;
                    TwoStepVerificationActivity.initPasswordNewAlgo(PassportActivity.this.currentPassword);
                    anonymousClass8.resetSecret();
                }

                private void generateNewSecret() {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    final byte[] bArr = this.val$x_bytes;
                    final String str = this.val$textPassword;
                    dispatchQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.AnonymousClass8.m3619$r8$lambda$UVtyHscuAF42jADYfHHFTbfUf0(this.f$0, bArr, str);
                        }
                    });
                }

                public static void m3619$r8$lambda$UVtyHscuAF42jADYfHHFTbfUf0(final AnonymousClass8 anonymousClass8, byte[] bArr, String str) {
                    anonymousClass8.getClass();
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
                    ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(updatepasswordsettings, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            PassportActivity.AnonymousClass8.$r8$lambda$iXmDpyZM05AxLNgISjV6LCJUzhA(this.f$0, tLObject, tL_error);
                        }
                    });
                }

                public static void $r8$lambda$iXmDpyZM05AxLNgISjV6LCJUzhA(final AnonymousClass8 anonymousClass8, TLObject tLObject, final TLRPC.TL_error tL_error) {
                    anonymousClass8.getClass();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.AnonymousClass8.$r8$lambda$nmRdmdNsKvQlc9kYgpZgtgqkodU(this.f$0, tL_error);
                        }
                    });
                }

                public static void $r8$lambda$nmRdmdNsKvQlc9kYgpZgtgqkodU(final AnonymousClass8 anonymousClass8, TLRPC.TL_error tL_error) {
                    if (tL_error != null) {
                        anonymousClass8.getClass();
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                                    PassportActivity.AnonymousClass8.m3617$r8$lambda$pkcqJj9ECs5DkeAS3Dv47EpwI0(this.f$0, tLObject, tL_error2);
                                }
                            }, 8);
                            return;
                        }
                    }
                    if (PassportActivity.this.currentForm == null) {
                        PassportActivity.this.currentForm = new TL_account.authorizationForm();
                    }
                    anonymousClass8.openRequestInterface();
                }

                public static void m3617$r8$lambda$pkcqJj9ECs5DkeAS3Dv47EpwI0(final AnonymousClass8 anonymousClass8, final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    anonymousClass8.getClass();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.AnonymousClass8.$r8$lambda$IV_GzzYEgg9s47rdcOkahKg0lZc(this.f$0, tL_error, tLObject);
                        }
                    });
                }

                public static void $r8$lambda$IV_GzzYEgg9s47rdcOkahKg0lZc(AnonymousClass8 anonymousClass8, TLRPC.TL_error tL_error, TLObject tLObject) {
                    if (tL_error != null) {
                        anonymousClass8.getClass();
                        return;
                    }
                    PassportActivity.this.currentPassword = (TL_account.Password) tLObject;
                    TwoStepVerificationActivity.initPasswordNewAlgo(PassportActivity.this.currentPassword);
                    anonymousClass8.generateNewSecret();
                }

                @Override
                public void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount);
                        final boolean z = this.val$saved;
                        connectionsManager.sendRequest(getpassword, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                PassportActivity.AnonymousClass8.$r8$lambda$vc_AD66yAJui9FFx5BoTebKck4E(this.f$0, z, tLObject2, tL_error2);
                            }
                        }, 8);
                        return;
                    }
                    if (tL_error == null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        final String str = this.val$textPassword;
                        final boolean z2 = this.val$saved;
                        dispatchQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                PassportActivity.AnonymousClass8.$r8$lambda$wuLaFIql6iY5js3MykyfGPQCs0w(this.f$0, tLObject, str, z2);
                            }
                        });
                        return;
                    }
                    final boolean z3 = this.val$saved;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.AnonymousClass8.$r8$lambda$512leeeXZVvw7ZAuUKewBLjdnGs(this.f$0, z3, tL_error);
                        }
                    });
                }

                public static void $r8$lambda$vc_AD66yAJui9FFx5BoTebKck4E(final AnonymousClass8 anonymousClass8, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    anonymousClass8.getClass();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.AnonymousClass8.m3618$r8$lambda$7FF5vIBx69V1lYce247YLdWOfA(this.f$0, tL_error, tLObject, z);
                        }
                    });
                }

                public static void m3618$r8$lambda$7FF5vIBx69V1lYce247YLdWOfA(AnonymousClass8 anonymousClass8, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
                    if (tL_error != null) {
                        anonymousClass8.getClass();
                        return;
                    }
                    PassportActivity.this.currentPassword = (TL_account.Password) tLObject;
                    TwoStepVerificationActivity.initPasswordNewAlgo(PassportActivity.this.currentPassword);
                    PassportActivity.this.onPasswordDone(z);
                }

                public static void $r8$lambda$wuLaFIql6iY5js3MykyfGPQCs0w(final AnonymousClass8 anonymousClass8, TLObject tLObject, String str, final boolean z) {
                    final byte[] bArr;
                    anonymousClass8.getClass();
                    final TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                    if (tL_secureSecretSettings == null) {
                        if (PassportActivity.this.currentPassword.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) PassportActivity.this.currentPassword.new_secure_algo;
                            byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                            PassportActivity.this.saltedPassword = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                            bArr = bArr2;
                        } else {
                            bArr = new byte[0];
                        }
                        PassportActivity.this.secureSecret = null;
                        PassportActivity.this.secureSecretId = 0L;
                    } else {
                        PassportActivity.this.secureSecret = tL_secureSecretSettings.secure_secret;
                        PassportActivity.this.secureSecretId = passwordsettings.secure_settings.secure_secret_id;
                        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = passwordsettings.secure_settings.secure_algo;
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                            bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                            PassportActivity.this.saltedPassword = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str), bArr);
                        } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                            byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001.salt;
                            PassportActivity.this.saltedPassword = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100001.salt);
                            bArr = bArr3;
                        } else {
                            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        AlertsCreator.showUpdateAppAlert(PassportActivity.this.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                                    }
                                });
                                return;
                            }
                            bArr = new byte[0];
                        }
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.AnonymousClass8.m3621$r8$lambda$p_D1Jm0CVa0IUg7OSOHuZvsPjE(this.f$0, passwordsettings, z, bArr);
                        }
                    });
                }

                public static void m3621$r8$lambda$p_D1Jm0CVa0IUg7OSOHuZvsPjE(final AnonymousClass8 anonymousClass8, TL_account.passwordSettings passwordsettings, boolean z, byte[] bArr) {
                    PassportActivity.this.currentEmail = passwordsettings.email;
                    if (z) {
                        PassportActivity passportActivity = PassportActivity.this;
                        passportActivity.saltedPassword = passportActivity.savedSaltedPassword;
                    }
                    PassportActivity passportActivity2 = PassportActivity.this;
                    if (PassportActivity.checkSecret(passportActivity2.decryptSecret(passportActivity2.secureSecret, PassportActivity.this.saltedPassword), Long.valueOf(PassportActivity.this.secureSecretId)) && bArr.length != 0 && PassportActivity.this.secureSecretId != 0) {
                        if (PassportActivity.this.currentBotId == 0) {
                            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TL_account.getAllSecureValues(), new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    PassportActivity.AnonymousClass8.m3620$r8$lambda$c0dnErPaM0xMqqO55yr1hVCcto(this.f$0, tLObject, tL_error);
                                }
                            });
                            return;
                        } else {
                            anonymousClass8.openRequestInterface();
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
                        anonymousClass8.generateNewSecret();
                    } else {
                        anonymousClass8.resetSecret();
                    }
                }

                public static void m3620$r8$lambda$c0dnErPaM0xMqqO55yr1hVCcto(final AnonymousClass8 anonymousClass8, final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    anonymousClass8.getClass();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.AnonymousClass8.$r8$lambda$47T2DFvJgErSOqg5UWq_rPYIfmg(this.f$0, tLObject, tL_error);
                        }
                    });
                }

                public static void $r8$lambda$47T2DFvJgErSOqg5UWq_rPYIfmg(AnonymousClass8 anonymousClass8, TLObject tLObject, TLRPC.TL_error tL_error) {
                    anonymousClass8.getClass();
                    if (tLObject instanceof Vector) {
                        PassportActivity.this.currentForm = new TL_account.authorizationForm();
                        Vector vector = (Vector) tLObject;
                        int size = vector.objects.size();
                        for (int i = 0; i < size; i++) {
                            PassportActivity.this.currentForm.values.add((TLRPC.TL_secureValue) vector.objects.get(i));
                        }
                        anonymousClass8.openRequestInterface();
                        return;
                    }
                    if (!"APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        PassportActivity.this.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                    } else {
                        AlertsCreator.showUpdateAppAlert(PassportActivity.this.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    PassportActivity.this.showEditDoneProgress(true, false);
                }

                public static void $r8$lambda$512leeeXZVvw7ZAuUKewBLjdnGs(AnonymousClass8 anonymousClass8, boolean z, TLRPC.TL_error tL_error) {
                    String pluralString;
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
                        return;
                    }
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        PassportActivity.this.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    }
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (iIntValue < 60) {
                        pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
                    } else {
                        pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
                    }
                    PassportActivity.this.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
                }
            }

            private boolean isPersonalDocument(TLRPC.SecureValueType secureValueType) {
                return (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard);
            }

            private boolean isAddressDocument(TLRPC.SecureValueType secureValueType) {
                return (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) || (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) || (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement);
            }

            private void createRequestInterface(Context context) {
                TLRPC.User user;
                TLRPC.TL_secureRequiredType tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2;
                ArrayList arrayList;
                int i;
                boolean z;
                boolean z2;
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
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context2);
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
                this.headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                TL_account.authorizationForm authorizationform = this.currentForm;
                if (authorizationform != null) {
                    int size = authorizationform.required_types.size();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    boolean z3 = false;
                    int i6 = 0;
                    int i7 = 0;
                    boolean z4 = false;
                    while (i5 < size) {
                        TLRPC.SecureRequiredType secureRequiredType = this.currentForm.required_types.get(i5);
                        if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) secureRequiredType;
                            if (isPersonalDocument(tL_secureRequiredType3.type)) {
                                arrayList2.add(tL_secureRequiredType3);
                                i6 += i2;
                            } else if (isAddressDocument(tL_secureRequiredType3.type)) {
                                arrayList3.add(tL_secureRequiredType3);
                                i7 += i2;
                            } else {
                                TLRPC.SecureValueType secureValueType = tL_secureRequiredType3.type;
                                if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                    z3 = true;
                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                    z4 = true;
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
                                                    arrayList2.add((TLRPC.TL_secureRequiredType) secureRequiredType3);
                                                }
                                            }
                                            i6++;
                                        } else if (isAddressDocument(tL_secureRequiredType4.type)) {
                                            int size3 = tL_secureRequiredTypeOneOf.types.size();
                                            for (int i9 = 0; i9 < size3; i9++) {
                                                TLRPC.SecureRequiredType secureRequiredType4 = tL_secureRequiredTypeOneOf.types.get(i9);
                                                if (secureRequiredType4 instanceof TLRPC.TL_secureRequiredType) {
                                                    arrayList3.add((TLRPC.TL_secureRequiredType) secureRequiredType4);
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
                    boolean z5 = !z3 || i6 > 1;
                    boolean z6 = !z4 || i7 > 1;
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.SecureRequiredType secureRequiredType5 = this.currentForm.required_types.get(i10);
                        if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredType) {
                            tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) secureRequiredType5;
                            TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                            if ((secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) {
                                arrayList = null;
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                if (z5) {
                                    arrayList = null;
                                } else {
                                    arrayList = arrayList2;
                                }
                            } else if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress)) {
                                if (z5 && isPersonalDocument(secureValueType2)) {
                                    arrayList = new ArrayList();
                                    arrayList.add(tL_secureRequiredType2);
                                    tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                } else if (z6 && isAddressDocument(tL_secureRequiredType2.type)) {
                                    arrayList = new ArrayList();
                                    arrayList.add(tL_secureRequiredType2);
                                    tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                                } else {
                                    i = 1;
                                }
                                i = 1;
                                z = true;
                                if (i10 == size - 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                context2 = context;
                                addField(context2, tL_secureRequiredType2, arrayList, z, z2);
                            } else if (z6) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList3;
                            }
                            i = 1;
                            z = false;
                            if (i10 == size - 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            context2 = context;
                            addField(context2, tL_secureRequiredType2, arrayList, z, z2);
                        } else {
                            if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                                TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf2 = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType5;
                                if (!tL_secureRequiredTypeOneOf2.types.isEmpty()) {
                                    TLRPC.SecureRequiredType secureRequiredType6 = tL_secureRequiredTypeOneOf2.types.get(0);
                                    if (secureRequiredType6 instanceof TLRPC.TL_secureRequiredType) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType6;
                                        if ((z5 && isPersonalDocument(tL_secureRequiredType5.type)) || (z6 && isAddressDocument(tL_secureRequiredType5.type))) {
                                            ArrayList arrayList4 = new ArrayList();
                                            int size4 = tL_secureRequiredTypeOneOf2.types.size();
                                            for (int i11 = 0; i11 < size4; i11++) {
                                                TLRPC.SecureRequiredType secureRequiredType7 = tL_secureRequiredTypeOneOf2.types.get(i11);
                                                if (secureRequiredType7 instanceof TLRPC.TL_secureRequiredType) {
                                                    arrayList4.add((TLRPC.TL_secureRequiredType) secureRequiredType7);
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
                                            arrayList = arrayList4;
                                            i = 1;
                                            z = true;
                                            if (i10 == size - 1) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            context2 = context;
                                            addField(context2, tL_secureRequiredType2, arrayList, z, z2);
                                        }
                                    }
                                }
                            }
                            i = 1;
                        }
                        i10 += i;
                        arrayList3 = arrayList3;
                    }
                }
                if (user != null) {
                    TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context2);
                    this.bottomCell = textInfoPrivacyCell2;
                    textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    TextInfoPrivacyCell textInfoPrivacyCell3 = this.bottomCell;
                    int i12 = Theme.key_windowBackgroundWhiteGrayText4;
                    textInfoPrivacyCell3.setLinkTextColorKey(i12);
                    if (!TextUtils.isEmpty(this.currentForm.privacy_policy_url)) {
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
                    } else {
                        this.bottomCell.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportNoPolicy", R.string.PassportNoPolicy, UserObject.getFirstName(user), user.username)));
                    }
                    this.bottomCell.getTextView().setHighlightColor(Theme.getColor(i12));
                    this.bottomCell.getTextView().setGravity(1);
                    this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
                }
                FrameLayout frameLayout3 = new FrameLayout(context2);
                this.bottomLayout = frameLayout3;
                frameLayout3.setBackgroundDrawable(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(Theme.key_passport_authorizeBackground), Theme.getColor(Theme.key_passport_authorizeBackgroundSelected)));
                frameLayout.addView(this.bottomLayout, LayoutHelper.createFrame(-1, 48, 80));
                this.bottomLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PassportActivity.$r8$lambda$SP3eNvbAaDhGxhfbHjBgmXjsrao(this.f$0, view);
                    }
                });
                TextView textView = new TextView(context2);
                this.acceptTextView = textView;
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
                this.acceptTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.authorize, 0, 0, 0);
                this.acceptTextView.setTextColor(Theme.getColor(Theme.key_passport_authorizeText));
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

            class C1ValueToSend {
                boolean selfie_required;
                boolean translation_required;
                TLRPC.TL_secureValue value;

                public C1ValueToSend(TLRPC.TL_secureValue tL_secureValue, boolean z, boolean z2) {
                    this.value = tL_secureValue;
                    this.selfie_required = z;
                    this.translation_required = z2;
                }
            }

            public static void $r8$lambda$SP3eNvbAaDhGxhfbHjBgmXjsrao(final PassportActivity passportActivity, View view) {
                ArrayList arrayList;
                int i;
                int i2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType;
                passportActivity.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size = passportActivity.currentForm.required_types.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.SecureRequiredType secureRequiredType = passportActivity.currentForm.required_types.get(i3);
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
                                            if (passportActivity.getValueByType(tL_secureRequiredType3, true) != null) {
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
                    TLRPC.TL_secureValue valueByType = passportActivity.getValueByType(tL_secureRequiredType, true);
                    if (valueByType == null) {
                        Vibrator vibrator = (Vibrator) passportActivity.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(passportActivity.getViewByType(tL_secureRequiredType));
                        return;
                    }
                    HashMap map = (HashMap) passportActivity.errorsMap.get(passportActivity.getNameForType(tL_secureRequiredType.type));
                    if (map != null && !map.isEmpty()) {
                        Vibrator vibrator2 = (Vibrator) passportActivity.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(passportActivity.getViewByType(tL_secureRequiredType));
                        return;
                    }
                    arrayList2.add(passportActivity.new C1ValueToSend(valueByType, tL_secureRequiredType.selfie_required, tL_secureRequiredType.translation_required));
                }
                passportActivity.showEditDoneProgress(false, true);
                TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
                acceptauthorization.bot_id = passportActivity.currentBotId;
                acceptauthorization.scope = passportActivity.currentScope;
                acceptauthorization.public_key = passportActivity.currentPublicKey;
                JSONObject jSONObject = new JSONObject();
                int size3 = arrayList2.size();
                int i5 = 0;
                while (i5 < size3) {
                    C1ValueToSend c1ValueToSend = (C1ValueToSend) arrayList2.get(i5);
                    TLRPC.TL_secureValue tL_secureValue = c1ValueToSend.value;
                    JSONObject jSONObject2 = new JSONObject();
                    TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
                    if (securePlainData != null) {
                        if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                        } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
                        }
                    } else {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                            if (tL_secureData != null) {
                                byte[] bArrDecryptValueSecret = passportActivity.decryptValueSecret(tL_secureData.secret, tL_secureData.data_hash);
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
                                            byte[] bArrDecryptValueSecret2 = passportActivity.decryptValueSecret(tL_secureFile.secret, tL_secureFile.file_hash);
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
                                byte[] bArrDecryptValueSecret3 = passportActivity.decryptValueSecret(tL_secureFile2.secret, tL_secureFile2.file_hash);
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                                jSONObject5.put("secret", Base64.encodeToString(bArrDecryptValueSecret3, 2));
                                jSONObject3.put("front_side", jSONObject5);
                            }
                            TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                            if (secureFile2 instanceof TLRPC.TL_secureFile) {
                                TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                                byte[] bArrDecryptValueSecret4 = passportActivity.decryptValueSecret(tL_secureFile3.secret, tL_secureFile3.file_hash);
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                                jSONObject6.put("secret", Base64.encodeToString(bArrDecryptValueSecret4, 2));
                                jSONObject3.put("reverse_side", jSONObject6);
                            }
                            if (c1ValueToSend.selfie_required) {
                                TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                                if (secureFile3 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                                    byte[] bArrDecryptValueSecret5 = passportActivity.decryptValueSecret(tL_secureFile4.secret, tL_secureFile4.file_hash);
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
                                    byte[] bArrDecryptValueSecret6 = passportActivity.decryptValueSecret(tL_secureFile5.secret, tL_secureFile5.file_hash);
                                    JSONObject jSONObject8 = new JSONObject();
                                    jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                                    jSONObject8.put("secret", Base64.encodeToString(bArrDecryptValueSecret6, 2));
                                    jSONArray2.put(jSONObject8);
                                }
                                jSONObject3.put("translation", jSONArray2);
                            }
                            jSONObject.put(passportActivity.getNameForType(tL_secureValue.type), jSONObject3);
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
                Object obj = passportActivity.currentPayload;
                if (obj != null) {
                    try {
                        jSONObject9.put("payload", obj);
                    } catch (Exception unused6) {
                    }
                }
                Object obj2 = passportActivity.currentNonce;
                if (obj2 != null) {
                    try {
                        jSONObject9.put("nonce", obj2);
                    } catch (Exception unused7) {
                    }
                }
                EncryptionResult encryptionResultEncryptData = passportActivity.encryptData(AndroidUtilities.getStringBytes(jSONObject9.toString()));
                TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
                acceptauthorization.credentials = tL_secureCredentialsEncrypted;
                tL_secureCredentialsEncrypted.hash = encryptionResultEncryptData.fileHash;
                tL_secureCredentialsEncrypted.data = encryptionResultEncryptData.encryptedData;
                try {
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(passportActivity.currentPublicKey.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
                    Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
                    cipher.init(1, rSAPublicKey);
                    acceptauthorization.credentials.secret = cipher.doFinal(encryptionResultEncryptData.decrypyedFileSecret);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                ConnectionsManager.getInstance(passportActivity.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(passportActivity.currentAccount).sendRequest(acceptauthorization, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        PassportActivity.$r8$lambda$oBxjLy6pqg5dpTwlP83N1BHLELo(this.f$0, tLObject, tL_error);
                    }
                }), passportActivity.classGuid);
            }

            public static void $r8$lambda$oBxjLy6pqg5dpTwlP83N1BHLELo(final PassportActivity passportActivity, TLObject tLObject, final TLRPC.TL_error tL_error) {
                passportActivity.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.m3609$r8$lambda$k5Alf7TbuWfq72_Wi54A_owy4Q(this.f$0, tL_error);
                    }
                });
            }

            public static void m3609$r8$lambda$k5Alf7TbuWfq72_Wi54A_owy4Q(PassportActivity passportActivity, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    passportActivity.ignoreOnFailure = true;
                    passportActivity.callCallback(true);
                    passportActivity.finishFragment();
                } else {
                    passportActivity.showEditDoneProgress(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        AlertsCreator.showUpdateAppAlert(passportActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        passportActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                }
            }

            private void createManageInterface(Context context) {
                ArrayList arrayList;
                TLRPC.TL_secureRequiredType tL_secureRequiredType;
                boolean z;
                boolean z2;
                final PassportActivity passportActivity = this;
                Context context2 = context;
                passportActivity.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
                passportActivity.actionBar.createMenu().addItem(1, R.drawable.msg_info);
                HeaderCell headerCell = new HeaderCell(context2);
                passportActivity.headerCell = headerCell;
                headerCell.setText(LocaleController.getString(R.string.PassportProvidedInformation));
                passportActivity.headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                passportActivity.linearLayout2.addView(passportActivity.headerCell, LayoutHelper.createLinear(-1, -2));
                ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context2);
                passportActivity.sectionCell = shadowSectionCell;
                int i = R.drawable.greydivider;
                int i2 = Theme.key_windowBackgroundGrayShadow;
                shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, i, i2));
                passportActivity.linearLayout2.addView(passportActivity.sectionCell, LayoutHelper.createLinear(-1, -2));
                TextSettingsCell textSettingsCell = new TextSettingsCell(context2);
                passportActivity.addDocumentCell = textSettingsCell;
                textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                TextSettingsCell textSettingsCell2 = passportActivity.addDocumentCell;
                int i3 = R.string.PassportNoDocumentsAdd;
                textSettingsCell2.setText(LocaleController.getString(i3), true);
                passportActivity.linearLayout2.addView(passportActivity.addDocumentCell, LayoutHelper.createLinear(-1, -2));
                passportActivity.addDocumentCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.openAddDocumentAlert();
                    }
                });
                TextSettingsCell textSettingsCell3 = new TextSettingsCell(context2);
                passportActivity.deletePassportCell = textSettingsCell3;
                textSettingsCell3.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
                passportActivity.deletePassportCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                passportActivity.deletePassportCell.setText(LocaleController.getString(R.string.TelegramPassportDelete), false);
                passportActivity.linearLayout2.addView(passportActivity.deletePassportCell, LayoutHelper.createLinear(-1, -2));
                passportActivity.deletePassportCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PassportActivity.$r8$lambda$iEQDiqee8HveFUMmgMor1xdGf3Q(this.f$0, view);
                    }
                });
                ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context2);
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
                passportActivity.emptyImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_sessions_devicesImage), PorterDuff.Mode.MULTIPLY));
                passportActivity.emptyLayout.addView(passportActivity.emptyImageView, LayoutHelper.createLinear(-2, -2));
                TextView textView = new TextView(context2);
                passportActivity.emptyTextView1 = textView;
                int i5 = Theme.key_windowBackgroundWhiteGrayText2;
                textView.setTextColor(Theme.getColor(i5));
                passportActivity.emptyTextView1.setGravity(17);
                passportActivity.emptyTextView1.setTextSize(1, 15.0f);
                passportActivity.emptyTextView1.setTypeface(AndroidUtilities.bold());
                passportActivity.emptyTextView1.setText(LocaleController.getString(R.string.PassportNoDocuments));
                passportActivity.emptyLayout.addView(passportActivity.emptyTextView1, LayoutHelper.createLinear(-2, -2, 17, 0, 16, 0, 0));
                TextView textView2 = new TextView(context2);
                passportActivity.emptyTextView2 = textView2;
                textView2.setTextColor(Theme.getColor(i5));
                passportActivity.emptyTextView2.setGravity(17);
                passportActivity.emptyTextView2.setTextSize(1, 14.0f);
                passportActivity.emptyTextView2.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                passportActivity.emptyTextView2.setText(LocaleController.getString(R.string.PassportNoDocumentsInfo));
                passportActivity.emptyLayout.addView(passportActivity.emptyTextView2, LayoutHelper.createLinear(-2, -2, 17, 0, 14, 0, 0));
                TextView textView3 = new TextView(context2);
                passportActivity.emptyTextView3 = textView3;
                int i6 = Theme.key_windowBackgroundWhiteBlueText4;
                textView3.setTextColor(Theme.getColor(i6));
                passportActivity.emptyTextView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                passportActivity.emptyTextView3.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(i6), 32), 7));
                passportActivity.emptyTextView3.setGravity(17);
                passportActivity.emptyTextView3.setTextSize(1, 15.0f);
                passportActivity.emptyTextView3.setTypeface(AndroidUtilities.bold());
                passportActivity.emptyTextView3.setGravity(17);
                passportActivity.emptyTextView3.setText(LocaleController.getString(i3).toUpperCase());
                passportActivity.emptyLayout.addView(passportActivity.emptyTextView3, LayoutHelper.createLinear(-2, 30, 17, 0, 12, 0, 0));
                passportActivity.emptyTextView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.openAddDocumentAlert();
                    }
                });
                int size = passportActivity.currentForm.values.size();
                int i7 = 0;
                while (i7 < size) {
                    TLRPC.TL_secureValue tL_secureValue = passportActivity.currentForm.values.get(i7);
                    if (passportActivity.isPersonalDocument(tL_secureValue.type)) {
                        arrayList = new ArrayList();
                        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = tL_secureValue.type;
                        tL_secureRequiredType2.selfie_required = true;
                        tL_secureRequiredType2.translation_required = true;
                        arrayList.add(tL_secureRequiredType2);
                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
                    } else {
                        if (passportActivity.isAddressDocument(tL_secureValue.type)) {
                            arrayList = new ArrayList();
                            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = new TLRPC.TL_secureRequiredType();
                            tL_secureRequiredType3.type = tL_secureValue.type;
                            tL_secureRequiredType3.translation_required = true;
                            arrayList.add(tL_secureRequiredType3);
                            tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                            tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
                        } else {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = new TLRPC.TL_secureRequiredType();
                            tL_secureRequiredType4.type = tL_secureValue.type;
                            arrayList = null;
                            tL_secureRequiredType = tL_secureRequiredType4;
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

            public static void $r8$lambda$iEQDiqee8HveFUMmgMor1xdGf3Q(final PassportActivity passportActivity, View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity());
                builder.setTitle(LocaleController.getString(R.string.TelegramPassportDeleteTitle));
                builder.setMessage(LocaleController.getString(R.string.TelegramPassportDeleteAlert));
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        PassportActivity.$r8$lambda$k8S_tWfPp62k6Sgy2e0Th3siyOE(this.f$0, alertDialog, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                passportActivity.showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                }
            }

            public static void $r8$lambda$k8S_tWfPp62k6Sgy2e0Th3siyOE(final PassportActivity passportActivity, AlertDialog alertDialog, int i) {
                passportActivity.getClass();
                TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
                for (int i2 = 0; i2 < passportActivity.currentForm.values.size(); i2++) {
                    deletesecurevalue.types.add(passportActivity.currentForm.values.get(i2).type);
                }
                passportActivity.needShowProgress();
                ConnectionsManager.getInstance(passportActivity.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        PassportActivity.$r8$lambda$d70YpfXrW5yWJ8RRhkYHrgqj4To(this.f$0, tLObject, tL_error);
                    }
                });
            }

            public static void $r8$lambda$d70YpfXrW5yWJ8RRhkYHrgqj4To(final PassportActivity passportActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
                passportActivity.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.$r8$lambda$TqzOgD_1ZyggTXXNAg1yOEtcwO4(this.f$0);
                    }
                });
            }

            public static void $r8$lambda$TqzOgD_1ZyggTXXNAg1yOEtcwO4(PassportActivity passportActivity) {
                int i = 0;
                while (i < passportActivity.linearLayout2.getChildCount()) {
                    View childAt = passportActivity.linearLayout2.getChildAt(i);
                    if (childAt instanceof TextDetailSecureCell) {
                        passportActivity.linearLayout2.removeView(childAt);
                        i--;
                    }
                    i++;
                }
                passportActivity.needHideProgress();
                passportActivity.typesViews.clear();
                passportActivity.typesValues.clear();
                passportActivity.currentForm.values.clear();
                passportActivity.updateManageVisibility();
            }

            private boolean hasNotValueForType(Class cls) {
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

            public void openAddDocumentAlert() {
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
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
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString(R.string.PassportNoDocumentsAdd));
                builder.setItems((CharSequence[]) arrayList.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PassportActivity.$r8$lambda$4eHsq5yS8dOaIHkRpHmVaO9lCY4(this.f$0, arrayList2, dialogInterface, i);
                    }
                });
                showDialog(builder.create());
            }

            public static void $r8$lambda$4eHsq5yS8dOaIHkRpHmVaO9lCY4(PassportActivity passportActivity, ArrayList arrayList, DialogInterface dialogInterface, int i) {
                TLRPC.TL_secureRequiredType tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2;
                passportActivity.getClass();
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
                if (passportActivity.isPersonalDocument(tL_secureRequiredType.type)) {
                    tL_secureRequiredType.selfie_required = true;
                    tL_secureRequiredType.translation_required = true;
                    tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                    tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                } else {
                    if (passportActivity.isAddressDocument(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    passportActivity.openTypeActivity(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                }
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                passportActivity.openTypeActivity(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
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
                        Browser.openUrl(getParentActivity(), Uri.parse(this.currentCallbackUrl + "&tg_passport=success"));
                    } else if (!this.ignoreOnFailure && ((i2 = this.currentActivityType) == 5 || i2 == 0)) {
                        Browser.openUrl(getParentActivity(), Uri.parse(this.currentCallbackUrl + "&tg_passport=cancel"));
                    }
                    this.callbackCalled = true;
                    return;
                }
                if (this.needActivityResult) {
                    if (z || (!this.ignoreOnFailure && ((i = this.currentActivityType) == 5 || i == 0))) {
                        getParentActivity().setResult(z ? -1 : 0);
                    }
                    this.callbackCalled = true;
                }
            }

            private void createEmailInterface(Context context) {
                this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
                if (!TextUtils.isEmpty(this.currentEmail)) {
                    TextSettingsCell textSettingsCell = new TextSettingsCell(context);
                    textSettingsCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
                    textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                    textSettingsCell.setText(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, this.currentEmail), false);
                    this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
                    textSettingsCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            PassportActivity.m3604$r8$lambda$U0BF77mZFgCuvL5R6p9cCizw00(this.f$0, view);
                        }
                    });
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
                    this.bottomCell = textInfoPrivacyCell;
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    this.bottomCell.setText(LocaleController.getString(R.string.PassportPhoneUseSameEmailInfo));
                    this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
                }
                this.inputFields = new EditTextBoldCursor[1];
                FrameLayout frameLayout = new FrameLayout(context);
                this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
                frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                this.inputFields[0] = new EditTextBoldCursor(context);
                this.inputFields[0].setTag(0);
                this.inputFields[0].setTextSize(1, 16.0f);
                this.inputFields[0].setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor = this.inputFields[0];
                int i = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor.setTextColor(Theme.getColor(i));
                this.inputFields[0].setBackgroundDrawable(null);
                this.inputFields[0].setCursorColor(Theme.getColor(i));
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
                this.inputFields[0].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                        return PassportActivity.$r8$lambda$l0F3zGCkMug8fbl9qSbBBH9eFek(this.f$0, textView, i2, keyEvent);
                    }
                });
                TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
                this.bottomCell = textInfoPrivacyCell2;
                textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                this.bottomCell.setText(LocaleController.getString(R.string.PassportEmailUploadInfo));
                this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            }

            public static void m3604$r8$lambda$U0BF77mZFgCuvL5R6p9cCizw00(PassportActivity passportActivity, View view) {
                passportActivity.useCurrentValue = true;
                passportActivity.doneItem.callOnClick();
                passportActivity.useCurrentValue = false;
            }

            public static boolean $r8$lambda$l0F3zGCkMug8fbl9qSbBBH9eFek(PassportActivity passportActivity, TextView textView, int i, KeyEvent keyEvent) {
                passportActivity.getClass();
                if (i != 6 && i != 5) {
                    return false;
                }
                passportActivity.doneItem.callOnClick();
                return true;
            }

            private void createPhoneInterface(Context context) {
                int i;
                String upperCase;
                String str;
                ViewGroup viewGroup;
                this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
                this.languageMap = new HashMap();
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
                    while (true) {
                        upperCase = null;
                        if (i < 3) {
                            if (i == 2) {
                                this.inputFields[i] = new HintEditText(context);
                            } else {
                                this.inputFields[i] = new EditTextBoldCursor(context);
                            }
                            if (i == 1) {
                                LinearLayout linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(0);
                                this.linearLayout2.addView(linearLayout, LayoutHelper.createLinear(-1, 50));
                                linearLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                                viewGroup = linearLayout;
                            } else if (i == 2) {
                                viewGroup = (ViewGroup) this.inputFields[1].getParent();
                            } else {
                                FrameLayout frameLayout = new FrameLayout(context);
                                this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
                                frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                                viewGroup = frameLayout;
                            }
                            this.inputFields[i].setTag(Integer.valueOf(i));
                            this.inputFields[i].setTextSize(1, 16.0f);
                            this.inputFields[i].setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
                            EditTextBoldCursor editTextBoldCursor = this.inputFields[i];
                            int i2 = Theme.key_windowBackgroundWhiteBlackText;
                            editTextBoldCursor.setTextColor(Theme.getColor(i2));
                            this.inputFields[i].setBackgroundDrawable(null);
                            this.inputFields[i].setCursorColor(Theme.getColor(i2));
                            this.inputFields[i].setCursorSize(AndroidUtilities.dp(20.0f));
                            this.inputFields[i].setCursorWidth(1.5f);
                            if (i == 0) {
                                this.inputFields[i].setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                                        return PassportActivity.$r8$lambda$GIBFOW7F5UfpucbGc68lyZfTX6A(this.f$0, view, motionEvent);
                                    }
                                });
                                this.inputFields[i].setText(LocaleController.getString(R.string.ChooseCountry));
                                this.inputFields[i].setInputType(0);
                                this.inputFields[i].setFocusable(false);
                            } else {
                                this.inputFields[i].setInputType(3);
                                if (i == 2) {
                                    this.inputFields[i].setImeOptions(268435462);
                                } else {
                                    this.inputFields[i].setImeOptions(268435461);
                                }
                            }
                            EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                            if (i == 1) {
                                TextView textView = new TextView(context);
                                this.plusTextView = textView;
                                textView.setText("+");
                                this.plusTextView.setTextColor(Theme.getColor(i2));
                                this.plusTextView.setTextSize(1, 16.0f);
                                viewGroup.addView(this.plusTextView, LayoutHelper.createLinear(-2, -2, 21.0f, 12.0f, 0.0f, 6.0f));
                                this.inputFields[i].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                                this.inputFields[i].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                                this.inputFields[i].setGravity(19);
                                viewGroup.addView(this.inputFields[i], LayoutHelper.createLinear(55, -2, 0.0f, 12.0f, 16.0f, 6.0f));
                                this.inputFields[i].addTextChangedListener(new TextWatcher() {
                                    @Override
                                    public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                                    }

                                    @Override
                                    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                                    }

                                    @Override
                                    public void afterTextChanged(Editable editable) {
                                        String str2;
                                        boolean z;
                                        int iIndexOf;
                                        if (PassportActivity.this.ignoreOnTextChange) {
                                            return;
                                        }
                                        PassportActivity.this.ignoreOnTextChange = true;
                                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(PassportActivity.this.inputFields[1].getText().toString());
                                        PassportActivity.this.inputFields[1].setText(strStripExceptNumbers);
                                        HintEditText hintEditText = (HintEditText) PassportActivity.this.inputFields[2];
                                        if (strStripExceptNumbers.length() == 0) {
                                            hintEditText.setHintText((String) null);
                                            hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                            PassportActivity.this.inputFields[0].setText(LocaleController.getString(R.string.ChooseCountry));
                                        } else {
                                            int i3 = 4;
                                            if (strStripExceptNumbers.length() > 4) {
                                                while (true) {
                                                    if (i3 < 1) {
                                                        str2 = null;
                                                        z = false;
                                                        break;
                                                    }
                                                    String strSubstring = strStripExceptNumbers.substring(0, i3);
                                                    if (((String) PassportActivity.this.codesMap.get(strSubstring)) != null) {
                                                        String str3 = strStripExceptNumbers.substring(i3) + PassportActivity.this.inputFields[2].getText().toString();
                                                        PassportActivity.this.inputFields[1].setText(strSubstring);
                                                        str2 = str3;
                                                        strStripExceptNumbers = strSubstring;
                                                        z = true;
                                                        break;
                                                    }
                                                    i3--;
                                                }
                                                if (!z) {
                                                    str2 = strStripExceptNumbers.substring(1) + PassportActivity.this.inputFields[2].getText().toString();
                                                    EditTextBoldCursor editTextBoldCursor3 = PassportActivity.this.inputFields[1];
                                                    strStripExceptNumbers = strStripExceptNumbers.substring(0, 1);
                                                    editTextBoldCursor3.setText(strStripExceptNumbers);
                                                }
                                            } else {
                                                str2 = null;
                                                z = false;
                                            }
                                            String str4 = (String) PassportActivity.this.codesMap.get(strStripExceptNumbers);
                                            if (str4 != null && (iIndexOf = PassportActivity.this.countriesArray.indexOf(str4)) != -1) {
                                                PassportActivity.this.inputFields[0].setText((CharSequence) PassportActivity.this.countriesArray.get(iIndexOf));
                                                String str5 = (String) PassportActivity.this.phoneFormatMap.get(strStripExceptNumbers);
                                                if (str5 != null) {
                                                    hintEditText.setHintText(str5.replace('X', (char) 8211));
                                                    hintEditText.setHint((CharSequence) null);
                                                }
                                            } else {
                                                hintEditText.setHintText((String) null);
                                                hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                                PassportActivity.this.inputFields[0].setText(LocaleController.getString(R.string.WrongCountry));
                                            }
                                            if (!z) {
                                                PassportActivity.this.inputFields[1].setSelection(PassportActivity.this.inputFields[1].getText().length());
                                            }
                                            if (str2 != null) {
                                                hintEditText.requestFocus();
                                                hintEditText.setText(str2);
                                                hintEditText.setSelection(hintEditText.length());
                                            }
                                        }
                                        PassportActivity.this.ignoreOnTextChange = false;
                                    }
                                });
                            } else if (i == 2) {
                                this.inputFields[i].setPadding(0, 0, 0, 0);
                                this.inputFields[i].setGravity(19);
                                this.inputFields[i].setHintText(null);
                                this.inputFields[i].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                viewGroup.addView(this.inputFields[i], LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                                this.inputFields[i].addTextChangedListener(new TextWatcher() {
                                    private int actionPosition;
                                    private int characterAction = -1;

                                    @Override
                                    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                                    }

                                    @Override
                                    public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                                        if (i4 == 0 && i5 == 1) {
                                            this.characterAction = 1;
                                            return;
                                        }
                                        if (i4 == 1 && i5 == 0) {
                                            if (charSequence.charAt(i3) == ' ' && i3 > 0) {
                                                this.characterAction = 3;
                                                this.actionPosition = i3 - 1;
                                                return;
                                            } else {
                                                this.characterAction = 2;
                                                return;
                                            }
                                        }
                                        this.characterAction = -1;
                                    }

                                    @Override
                                    public void afterTextChanged(Editable editable) {
                                        int i3;
                                        int i4;
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
                                        int i5 = 0;
                                        while (i5 < string.length()) {
                                            int i6 = i5 + 1;
                                            String strSubstring = string.substring(i5, i6);
                                            if ("0123456789".contains(strSubstring)) {
                                                sb.append(strSubstring);
                                            }
                                            i5 = i6;
                                        }
                                        PassportActivity.this.ignoreOnPhoneChange = true;
                                        String hintText = hintEditText.getHintText();
                                        if (hintText != null) {
                                            int i7 = 0;
                                            while (i7 < sb.length()) {
                                                if (i7 < hintText.length()) {
                                                    if (hintText.charAt(i7) == ' ') {
                                                        sb.insert(i7, ' ');
                                                        i7++;
                                                        if (selectionStart == i7 && (i4 = this.characterAction) != 2 && i4 != 3) {
                                                            selectionStart++;
                                                        }
                                                    }
                                                    i7++;
                                                } else {
                                                    sb.insert(i7, ' ');
                                                    if (selectionStart == i7 + 1 && (i3 = this.characterAction) != 2 && i3 != 3) {
                                                        selectionStart++;
                                                        break;
                                                    } else {
                                                        break;
                                                        break;
                                                        break;
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
                                });
                            } else {
                                this.inputFields[i].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                                this.inputFields[i].setGravity(LocaleController.isRTL ? 5 : 3);
                                viewGroup.addView(this.inputFields[i], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            }
                            this.inputFields[i].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                                @Override
                                public final boolean onEditorAction(TextView textView2, int i3, KeyEvent keyEvent) {
                                    return PassportActivity.$r8$lambda$grDk1ndx1hhhE_9WHgXy8flFFAg(this.f$0, textView2, i3, keyEvent);
                                }
                            });
                            if (i == 2) {
                                this.inputFields[i].setOnKeyListener(new View.OnKeyListener() {
                                    @Override
                                    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                                        return PassportActivity.$r8$lambda$KQuERTi5JueXbJoEw2MPL0DIR8A(this.f$0, view, i3, keyEvent);
                                    }
                                });
                            }
                            if (i == 0) {
                                View view = new View(context);
                                this.dividers.add(view);
                                view.setBackgroundColor(Theme.getColor(Theme.key_divider));
                                viewGroup.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            i++;
                        } else {
                            try {
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                Collections.sort(this.countriesArray, new BoostRepository$$ExternalSyntheticLambda24());
                String str2 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
                TextSettingsCell textSettingsCell = new TextSettingsCell(context);
                textSettingsCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
                textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                textSettingsCell.setText(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, PhoneFormat.getInstance().format("+" + str2)), false);
                this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
                textSettingsCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        PassportActivity.m3596$r8$lambda$3g_G9zkPRWl9B5FEdlziXR1SWk(this.f$0, view2);
                    }
                });
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
                this.bottomCell = textInfoPrivacyCell;
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                this.bottomCell.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
                this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
                HeaderCell headerCell = new HeaderCell(context);
                this.headerCell = headerCell;
                headerCell.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
                this.headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                this.inputFields = new EditTextBoldCursor[3];
                i = 0;
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                if (telephonyManager != null) {
                    upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                }
                if (upperCase != null && (str = (String) this.languageMap.get(upperCase)) != null && this.countriesArray.indexOf(str) != -1) {
                    this.inputFields[1].setText((CharSequence) this.countriesMap.get(str));
                }
                TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
                this.bottomCell = textInfoPrivacyCell2;
                textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                this.bottomCell.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
                this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            }

            public static void m3596$r8$lambda$3g_G9zkPRWl9B5FEdlziXR1SWk(PassportActivity passportActivity, View view) {
                passportActivity.useCurrentValue = true;
                passportActivity.doneItem.callOnClick();
                passportActivity.useCurrentValue = false;
            }

            public static boolean $r8$lambda$GIBFOW7F5UfpucbGc68lyZfTX6A(final PassportActivity passportActivity, View view, MotionEvent motionEvent) {
                if (passportActivity.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
                    countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() {
                        @Override
                        public final void didSelectCountry(CountrySelectActivity.Country country) {
                            PassportActivity.$r8$lambda$W2KUr65Qf1R9TAXu0HS53x201tw(this.f$0, country);
                        }
                    });
                    passportActivity.presentFragment(countrySelectActivity);
                }
                return true;
            }

            public static void $r8$lambda$W2KUr65Qf1R9TAXu0HS53x201tw(final PassportActivity passportActivity, CountrySelectActivity.Country country) {
                passportActivity.inputFields[0].setText(country.name);
                if (passportActivity.countriesArray.indexOf(country.name) != -1) {
                    passportActivity.ignoreOnTextChange = true;
                    String str = (String) passportActivity.countriesMap.get(country.name);
                    passportActivity.inputFields[1].setText(str);
                    String str2 = (String) passportActivity.phoneFormatMap.get(str);
                    passportActivity.inputFields[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    passportActivity.ignoreOnTextChange = false;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        AndroidUtilities.showKeyboard(this.f$0.inputFields[2]);
                    }
                }, 300L);
                passportActivity.inputFields[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = passportActivity.inputFields[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }

            public static boolean $r8$lambda$grDk1ndx1hhhE_9WHgXy8flFFAg(PassportActivity passportActivity, TextView textView, int i, KeyEvent keyEvent) {
                if (i == 5) {
                    passportActivity.inputFields[2].requestFocus();
                    return true;
                }
                if (i == 6) {
                    passportActivity.doneItem.callOnClick();
                    return true;
                }
                passportActivity.getClass();
                return false;
            }

            public static boolean $r8$lambda$KQuERTi5JueXbJoEw2MPL0DIR8A(PassportActivity passportActivity, View view, int i, KeyEvent keyEvent) {
                if (i != 67) {
                    passportActivity.getClass();
                    return false;
                }
                if (passportActivity.inputFields[2].length() != 0) {
                    return false;
                }
                passportActivity.inputFields[1].requestFocus();
                EditTextBoldCursor editTextBoldCursor = passportActivity.inputFields[1];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                passportActivity.inputFields[1].dispatchKeyEvent(keyEvent);
                return true;
            }

            private void createAddressInterface(Context context) {
                long j;
                final String str;
                String str2;
                String str3;
                this.languageMap = new HashMap();
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
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
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
                    headerCell2.setBackgroundColor(Theme.getColor(i3));
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
                            PassportActivity.m3598$r8$lambda$CDoIeVndKpTdJGDKKOyMQWwDG0(this.f$0, view);
                        }
                    });
                    TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
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
                    HashMap map = this.documentsErrors;
                    j = 0;
                    CharSequence charSequence2 = charSequence;
                    if (map != null && (str3 = (String) map.get("files_all")) != null) {
                        charSequence2 = charSequence;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append(this.noAllDocumentsErrorText);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_text_RedRegular)), 0, str3.length(), 33);
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
                        this.headerCell.setBackgroundColor(Theme.getColor(i3));
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
                                PassportActivity.$r8$lambda$8kO83n9I0ywxF8epJlo94r4dcIc(this.f$0, view);
                            }
                        });
                        TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context);
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
                        HashMap map2 = this.documentsErrors;
                        CharSequence charSequence4 = charSequence3;
                        if (map2 != null && (str2 = (String) map2.get("translation_all")) != null) {
                            charSequence4 = charSequence3;
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                            spannableStringBuilder2.append((CharSequence) "\n\n");
                            spannableStringBuilder2.append(this.noAllTranslationErrorText);
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_text_RedRegular)), 0, str2.length(), 33);
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
                this.headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                this.inputFields = new EditTextBoldCursor[6];
                for (int i5 = 0; i5 < 6; i5++) {
                    final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.inputFields[i5] = editTextBoldCursor;
                    FrameLayout frameLayout = new FrameLayout(context) {
                        private StaticLayout errorLayout;
                        float offsetX;

                        @Override
                        protected void onMeasure(int i6, int i7) {
                            int size = View.MeasureSpec.getSize(i6) - AndroidUtilities.dp(34.0f);
                            StaticLayout errorLayout = editTextBoldCursor.getErrorLayout(size);
                            this.errorLayout = errorLayout;
                            if (errorLayout != null) {
                                int lineCount = errorLayout.getLineCount();
                                if (lineCount > 1) {
                                    i7 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.errorLayout.getLineBottom(lineCount - 1) - this.errorLayout.getLineBottom(0)), 1073741824);
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

                        @Override
                        protected void onDraw(Canvas canvas) {
                            if (this.errorLayout != null) {
                                canvas.save();
                                canvas.translate(AndroidUtilities.dp(21.0f) + this.offsetX, editTextBoldCursor.getLineY() + AndroidUtilities.dp(3.0f));
                                this.errorLayout.draw(canvas);
                                canvas.restore();
                            }
                        }
                    };
                    frameLayout.setWillNotDraw(false);
                    this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
                    int i6 = Theme.key_windowBackgroundWhite;
                    frameLayout.setBackgroundColor(Theme.getColor(i6));
                    if (i5 == 5) {
                        View view = new View(context);
                        this.extraBackgroundView = view;
                        view.setBackgroundColor(Theme.getColor(i6));
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
                    this.inputFields[i5].setHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
                    this.inputFields[i5].setHeaderHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader));
                    this.inputFields[i5].setTransformHintToHeader(true);
                    EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i5];
                    int i7 = Theme.key_windowBackgroundWhiteBlackText;
                    editTextBoldCursor2.setTextColor(Theme.getColor(i7));
                    this.inputFields[i5].setBackgroundDrawable(null);
                    this.inputFields[i5].setCursorColor(Theme.getColor(i7));
                    this.inputFields[i5].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.inputFields[i5].setCursorWidth(1.5f);
                    this.inputFields[i5].setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated), Theme.getColor(Theme.key_text_RedRegular));
                    if (i5 == 5) {
                        this.inputFields[i5].setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                                return PassportActivity.$r8$lambda$sBgdfIAXnOfuM9PLSNDezUF4Aus(this.f$0, view3, motionEvent);
                            }
                        });
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
                            public void beforeTextChanged(CharSequence charSequence5, int i8, int i9, int i10) {
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence5, int i8, int i9, int i10) {
                            }

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
                                if (!z) {
                                    PassportActivity.this.checkFieldForError(editTextBoldCursor, str, editable, false);
                                } else {
                                    editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                }
                            }
                        });
                        this.inputFields[i5].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
                    } else {
                        this.inputFields[i5].addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence charSequence5, int i8, int i9, int i10) {
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence5, int i8, int i9, int i10) {
                            }

                            @Override
                            public void afterTextChanged(Editable editable) {
                                PassportActivity.this.checkFieldForError(editTextBoldCursor, str, editable, false);
                            }
                        });
                    }
                    EditTextBoldCursor editTextBoldCursor3 = this.inputFields[i5];
                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                    this.inputFields[i5].setPadding(0, 0, 0, 0);
                    this.inputFields[i5].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    frameLayout.addView(this.inputFields[i5], LayoutHelper.createFrame(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.inputFields[i5].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                            return PassportActivity.$r8$lambda$yxRCbNdv3E7oCThfrNvg4sVF5Fo(this.f$0, textView, i8, keyEvent);
                        }
                    });
                }
                ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context);
                this.sectionCell = shadowSectionCell;
                this.linearLayout2.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
                if (this.documentOnly && this.currentDocumentsType != null) {
                    this.headerCell.setVisibility(8);
                    this.sectionCell.setVisibility(8);
                }
                if (((this.currentBotId != j || this.currentDocumentsType == null) && this.currentTypeValue != null && !this.documentOnly) || this.currentDocumentsTypeValue != null) {
                    TLRPC.TL_secureValue tL_secureValue = this.currentDocumentsTypeValue;
                    if (tL_secureValue != null) {
                        addDocumentViews(tL_secureValue.files);
                        addTranslationDocumentViews(this.currentDocumentsTypeValue.translation);
                    }
                    ShadowSectionCell shadowSectionCell2 = this.sectionCell;
                    int i8 = R.drawable.greydivider;
                    int i9 = Theme.key_windowBackgroundGrayShadow;
                    shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i8, i9));
                    TextSettingsCell textSettingsCell3 = new TextSettingsCell(context);
                    textSettingsCell3.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
                    textSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                    if (this.currentDocumentsType == null) {
                        textSettingsCell3.setText(LocaleController.getString(R.string.PassportDeleteInfo), false);
                    } else {
                        textSettingsCell3.setText(LocaleController.getString(R.string.PassportDeleteDocument), false);
                    }
                    this.linearLayout2.addView(textSettingsCell3, LayoutHelper.createLinear(-1, -2));
                    textSettingsCell3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view3) {
                            this.f$0.createDocumentDeleteAlert();
                        }
                    });
                    ShadowSectionCell shadowSectionCell3 = new ShadowSectionCell(context);
                    this.sectionCell = shadowSectionCell3;
                    shadowSectionCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, i9));
                    this.linearLayout2.addView(this.sectionCell, LayoutHelper.createLinear(-1, -2));
                } else {
                    ShadowSectionCell shadowSectionCell4 = this.sectionCell;
                    int i10 = R.drawable.greydivider_bottom;
                    int i11 = Theme.key_windowBackgroundGrayShadow;
                    shadowSectionCell4.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i10, i11));
                    if (this.documentOnly && this.currentDocumentsType != null) {
                        this.bottomCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i10, i11));
                    }
                }
                updateUploadText(0);
                updateUploadText(4);
            }

            public static void m3598$r8$lambda$CDoIeVndKpTdJGDKKOyMQWwDG0(PassportActivity passportActivity, View view) {
                passportActivity.uploadingFileType = 0;
                passportActivity.openAttachMenu();
            }

            public static void $r8$lambda$8kO83n9I0ywxF8epJlo94r4dcIc(PassportActivity passportActivity, View view) {
                passportActivity.uploadingFileType = 4;
                passportActivity.openAttachMenu();
            }

            public static boolean $r8$lambda$sBgdfIAXnOfuM9PLSNDezUF4Aus(final PassportActivity passportActivity, View view, MotionEvent motionEvent) {
                if (passportActivity.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
                    countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() {
                        @Override
                        public final void didSelectCountry(CountrySelectActivity.Country country) {
                            PassportActivity.$r8$lambda$hx6sWXjZXWpO8DP_Z9N2BilLxN0(this.f$0, country);
                        }
                    });
                    passportActivity.presentFragment(countrySelectActivity);
                }
                return true;
            }

            public static void $r8$lambda$hx6sWXjZXWpO8DP_Z9N2BilLxN0(PassportActivity passportActivity, CountrySelectActivity.Country country) {
                passportActivity.inputFields[5].setText(country.name);
                passportActivity.currentCitizeship = country.shortname;
            }

            public static boolean $r8$lambda$yxRCbNdv3E7oCThfrNvg4sVF5Fo(PassportActivity passportActivity, TextView textView, int i, KeyEvent keyEvent) {
                passportActivity.getClass();
                if (i != 5) {
                    return false;
                }
                int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = passportActivity.inputFields;
                if (iIntValue < editTextBoldCursorArr.length) {
                    if (editTextBoldCursorArr[iIntValue].isFocusable()) {
                        passportActivity.inputFields[iIntValue].requestFocus();
                        return true;
                    }
                    passportActivity.inputFields[iIntValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                }
                return true;
            }

            public void createDocumentDeleteAlert() {
                final boolean[] zArr = {true};
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        PassportActivity.m3602$r8$lambda$O7Kcjg1wfohYsiYG7nzUJzBuf0(this.f$0, zArr, alertDialog, i);
                    }
                });
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
                        checkBoxCell.setText(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                        checkBoxCell.setText(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false);
                    }
                    checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48, 51));
                    checkBoxCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            PassportActivity.$r8$lambda$gXsVndGqTKMJoGnpCUq0kiXTB9o(zArr, view);
                        }
                    });
                    builder.setView(frameLayout);
                }
                showDialog(builder.create());
            }

            public static void m3602$r8$lambda$O7Kcjg1wfohYsiYG7nzUJzBuf0(PassportActivity passportActivity, boolean[] zArr, AlertDialog alertDialog, int i) {
                if (!passportActivity.documentOnly) {
                    passportActivity.currentValues.clear();
                }
                passportActivity.currentDocumentValues.clear();
                passportActivity.delegate.deleteValue(passportActivity.currentType, passportActivity.currentDocumentsType, passportActivity.availableDocumentTypes, zArr[0], null, null);
                passportActivity.finishFragment();
            }

            public static void $r8$lambda$gXsVndGqTKMJoGnpCUq0kiXTB9o(boolean[] zArr, View view) {
                if (view.isEnabled()) {
                    boolean z = !zArr[0];
                    zArr[0] = z;
                    ((CheckBoxCell) view).setChecked(z, true);
                }
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
                if (secureDocument != null) {
                    TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
                    if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
                        return Base64.encodeToString(bArr, 2);
                    }
                    byte[] bArr2 = secureDocument.fileHash;
                    if (bArr2 != null) {
                        return Base64.encodeToString(bArr2, 2);
                    }
                    return "";
                }
                return "";
            }

            public void checkFieldForError(EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z) {
                String str2;
                String str3;
                String str4;
                HashMap map = this.errorsValues;
                if (map != null && (str2 = (String) map.get(str)) != null && TextUtils.equals(str2, editable)) {
                    HashMap map2 = this.fieldsErrors;
                    if (map2 != null && (str4 = (String) map2.get(str)) != null) {
                        editTextBoldCursor.setErrorText(str4);
                    } else {
                        HashMap map3 = this.documentsErrors;
                        if (map3 != null && (str3 = (String) map3.get(str)) != null) {
                            editTextBoldCursor.setErrorText(str3);
                        }
                    }
                } else {
                    editTextBoldCursor.setErrorText(null);
                }
                String str5 = z ? "error_document_all" : "error_all";
                HashMap map4 = this.errorsValues;
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
                            SecureDocument secureDocument = (SecureDocument) this.documents.get(i);
                            String str = "files" + getDocumentHash(secureDocument);
                            if (str != null && this.errorsValues.containsKey(str)) {
                                onFieldError((View) this.documentsCells.get(secureDocument));
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
                            onFieldError((View) this.documentsCells.get(this.frontDocument));
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
                            onFieldError((View) this.documentsCells.get(this.reverseDocument));
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
                            onFieldError((View) this.documentsCells.get(this.selfieDocument));
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
                            SecureDocument secureDocument2 = (SecureDocument) this.translationDocuments.get(i2);
                            if (this.errorsValues.containsKey("translation" + getDocumentHash(secureDocument2))) {
                                onFieldError((View) this.documentsCells.get(secureDocument2));
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
                                    } else if (i4 == 1) {
                                        str2 = "middle_name_native";
                                    } else {
                                        str2 = i4 != 2 ? null : "last_name_native";
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
                                    String str3 = (String) this.errorsValues.get(str2);
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

            private void createIdentityInterface(final Context context) {
                boolean z;
                long j;
                int i;
                int i2;
                HashMap map;
                final String str;
                final HashMap map2;
                final String str2;
                String str3;
                this.languageMap = new HashMap();
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
                        long j2 = j;
                        int i3 = 6;
                        if (i2 < i) {
                            final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                            this.inputFields[i2] = editTextBoldCursor;
                            FrameLayout frameLayout = new FrameLayout(context) {
                                private StaticLayout errorLayout;
                                private float offsetX;

                                @Override
                                protected void onMeasure(int i4, int i5) {
                                    int size = View.MeasureSpec.getSize(i4) - AndroidUtilities.dp(34.0f);
                                    StaticLayout errorLayout = editTextBoldCursor.getErrorLayout(size);
                                    this.errorLayout = errorLayout;
                                    if (errorLayout != null) {
                                        int lineCount = errorLayout.getLineCount();
                                        if (lineCount > 1) {
                                            i5 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.errorLayout.getLineBottom(lineCount - 1) - this.errorLayout.getLineBottom(0)), 1073741824);
                                        }
                                        if (LocaleController.isRTL) {
                                            float fMax = 0.0f;
                                            for (int i6 = 0; i6 < lineCount; i6++) {
                                                if (this.errorLayout.getLineLeft(i6) != 0.0f) {
                                                    this.offsetX = 0.0f;
                                                    break;
                                                }
                                                fMax = Math.max(fMax, this.errorLayout.getLineWidth(i6));
                                                if (i6 == lineCount - 1) {
                                                    this.offsetX = size - fMax;
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
                                        canvas.translate(AndroidUtilities.dp(21.0f) + this.offsetX, editTextBoldCursor.getLineY() + AndroidUtilities.dp(3.0f));
                                        this.errorLayout.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            };
                            frameLayout.setWillNotDraw(z);
                            this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 64));
                            int i4 = Theme.key_windowBackgroundWhite;
                            frameLayout.setBackgroundColor(Theme.getColor(i4));
                            if (i2 == i - 1) {
                                View view = new View(context);
                                this.extraBackgroundView = view;
                                view.setBackgroundColor(Theme.getColor(i4));
                                this.linearLayout2.addView(this.extraBackgroundView, LayoutHelper.createLinear(-1, 6));
                            }
                            if (this.documentOnly && this.currentDocumentsType != null && i2 < 7) {
                                frameLayout.setVisibility(8);
                                View view2 = this.extraBackgroundView;
                                if (view2 != null) {
                                    view2.setVisibility(8);
                                }
                            }
                            this.inputFields[i2].setTag(Integer.valueOf(i2));
                            this.inputFields[i2].setSupportRtlHint(true);
                            this.inputFields[i2].setTextSize(1, 16.0f);
                            this.inputFields[i2].setHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
                            EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i2];
                            int i5 = Theme.key_windowBackgroundWhiteBlackText;
                            editTextBoldCursor2.setTextColor(Theme.getColor(i5));
                            this.inputFields[i2].setHeaderHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader));
                            this.inputFields[i2].setTransformHintToHeader(true);
                            this.inputFields[i2].setBackgroundDrawable(null);
                            this.inputFields[i2].setCursorColor(Theme.getColor(i5));
                            this.inputFields[i2].setCursorSize(AndroidUtilities.dp(20.0f));
                            this.inputFields[i2].setCursorWidth(1.5f);
                            this.inputFields[i2].setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated), Theme.getColor(Theme.key_text_RedRegular));
                            if (i2 == 5 || i2 == 6) {
                                this.inputFields[i2].setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                                        return PassportActivity.m3607$r8$lambda$gTYsgvmLkqZeyKgLAOZnPQCgI(this.f$0, view3, motionEvent);
                                    }
                                });
                                this.inputFields[i2].setInputType(0);
                            } else if (i2 == 3 || i2 == 8) {
                                this.inputFields[i2].setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                                        return PassportActivity.$r8$lambda$BpjDeQGdM2h8MyH4RRbLAHnh3xQ(this.f$0, context, view3, motionEvent);
                                    }
                                });
                                this.inputFields[i2].setInputType(0);
                                this.inputFields[i2].setFocusable(false);
                            } else if (i2 == 4) {
                                this.inputFields[i2].setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                                        return PassportActivity.$r8$lambda$XhzsstMUjTjM9Wd80k1_oQYersE(this.f$0, view3, motionEvent);
                                    }
                                });
                                this.inputFields[i2].setInputType(0);
                                this.inputFields[i2].setFocusable(false);
                            } else {
                                this.inputFields[i2].setInputType(16385);
                                this.inputFields[i2].setImeOptions(268435461);
                            }
                            switch (i2) {
                                case 0:
                                    if (this.currentType.native_names) {
                                        this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                                    } else {
                                        this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportName));
                                    }
                                    map2 = this.currentValues;
                                    str2 = "first_name";
                                    break;
                                case 1:
                                    if (this.currentType.native_names) {
                                        this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                                    } else {
                                        this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportMidname));
                                    }
                                    map2 = this.currentValues;
                                    str2 = "middle_name";
                                    break;
                                case 2:
                                    if (this.currentType.native_names) {
                                        this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                                    } else {
                                        this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportSurname));
                                    }
                                    map2 = this.currentValues;
                                    str2 = "last_name";
                                    break;
                                case 3:
                                    this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                                    map2 = this.currentValues;
                                    str2 = "birth_date";
                                    break;
                                case 4:
                                    this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportGender));
                                    map2 = this.currentValues;
                                    str2 = "gender";
                                    break;
                                case 5:
                                    this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                                    map2 = this.currentValues;
                                    str2 = "country_code";
                                    break;
                                case 6:
                                    this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportResidence));
                                    map2 = this.currentValues;
                                    str2 = "residence_country_code";
                                    break;
                                case 7:
                                    this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                                    map2 = this.currentDocumentValues;
                                    str2 = "document_no";
                                    break;
                                case 8:
                                    this.inputFields[i2].setHintText(LocaleController.getString(R.string.PassportExpired));
                                    map2 = this.currentDocumentValues;
                                    str2 = "expiry_date";
                                    break;
                                default:
                                    continue;
                                    i2++;
                                    j = j2;
                                    z = false;
                                    break;
                            }
                            setFieldValues(map2, this.inputFields[i2], str2);
                            EditTextBoldCursor editTextBoldCursor3 = this.inputFields[i2];
                            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                            if (i2 == 0 || i2 == 2 || i2 == 1) {
                                this.inputFields[i2].addTextChangedListener(new TextWatcher() {
                                    private boolean ignore;

                                    @Override
                                    public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                                    }

                                    @Override
                                    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                                    }

                                    @Override
                                    public void afterTextChanged(Editable editable) {
                                        boolean z2;
                                        if (this.ignore) {
                                            return;
                                        }
                                        int iIntValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= editable.length()) {
                                                z2 = false;
                                                break;
                                            }
                                            char cCharAt = editable.charAt(i6);
                                            if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                                z2 = true;
                                                break;
                                            }
                                            i6++;
                                        }
                                        if (!z2 || PassportActivity.this.allowNonLatinName) {
                                            PassportActivity.this.nonLatinNames[iIntValue] = z2;
                                            PassportActivity.this.checkFieldForError(editTextBoldCursor, str2, editable, false);
                                        } else {
                                            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                        }
                                    }
                                });
                            } else {
                                this.inputFields[i2].addTextChangedListener(new TextWatcher() {
                                    @Override
                                    public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                                    }

                                    @Override
                                    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                                    }

                                    @Override
                                    public void afterTextChanged(Editable editable) {
                                        PassportActivity passportActivity = PassportActivity.this;
                                        passportActivity.checkFieldForError(editTextBoldCursor, str2, editable, map2 == passportActivity.currentDocumentValues);
                                        int iIntValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                                        EditTextBoldCursor editTextBoldCursor4 = PassportActivity.this.inputFields[iIntValue];
                                        if (iIntValue == 6) {
                                            PassportActivity.this.checkNativeFields(true);
                                        }
                                    }
                                });
                            }
                            this.inputFields[i2].setPadding(0, 0, 0, 0);
                            this.inputFields[i2].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                            frameLayout.addView(this.inputFields[i2], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                            this.inputFields[i2].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                                @Override
                                public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                    return PassportActivity.$r8$lambda$_nVLuyXnfl_rJTA4jLPt6ulnxD0(this.f$0, textView, i6, keyEvent);
                                }
                            });
                            i2++;
                            j = j2;
                            z = false;
                        } else {
                            ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context);
                            this.sectionCell2 = shadowSectionCell;
                            this.linearLayout2.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
                            HeaderCell headerCell = new HeaderCell(context);
                            this.headerCell = headerCell;
                            headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                            this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                            int i6 = 3;
                            this.inputExtraFields = new EditTextBoldCursor[3];
                            int i7 = 0;
                            while (i7 < i6) {
                                final EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
                                this.inputExtraFields[i7] = editTextBoldCursor4;
                                FrameLayout frameLayout2 = new FrameLayout(context) {
                                    private StaticLayout errorLayout;
                                    private float offsetX;

                                    @Override
                                    protected void onMeasure(int i8, int i9) {
                                        int size = View.MeasureSpec.getSize(i8) - AndroidUtilities.dp(34.0f);
                                        StaticLayout errorLayout = editTextBoldCursor4.getErrorLayout(size);
                                        this.errorLayout = errorLayout;
                                        if (errorLayout != null) {
                                            int lineCount = errorLayout.getLineCount();
                                            if (lineCount > 1) {
                                                i9 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.errorLayout.getLineBottom(lineCount - 1) - this.errorLayout.getLineBottom(0)), 1073741824);
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

                                    @Override
                                    protected void onDraw(Canvas canvas) {
                                        if (this.errorLayout != null) {
                                            canvas.save();
                                            canvas.translate(AndroidUtilities.dp(21.0f) + this.offsetX, editTextBoldCursor4.getLineY() + AndroidUtilities.dp(3.0f));
                                            this.errorLayout.draw(canvas);
                                            canvas.restore();
                                        }
                                    }
                                };
                                frameLayout2.setWillNotDraw(false);
                                this.linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-1, 64));
                                int i8 = Theme.key_windowBackgroundWhite;
                                frameLayout2.setBackgroundColor(Theme.getColor(i8));
                                if (i7 == 2) {
                                    View view3 = new View(context);
                                    this.extraBackgroundView2 = view3;
                                    view3.setBackgroundColor(Theme.getColor(i8));
                                    this.linearLayout2.addView(this.extraBackgroundView2, LayoutHelper.createLinear(-1, i3));
                                }
                                this.inputExtraFields[i7].setTag(Integer.valueOf(i7));
                                this.inputExtraFields[i7].setSupportRtlHint(true);
                                this.inputExtraFields[i7].setTextSize(1, 16.0f);
                                this.inputExtraFields[i7].setHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
                                EditTextBoldCursor editTextBoldCursor5 = this.inputExtraFields[i7];
                                int i9 = Theme.key_windowBackgroundWhiteBlackText;
                                editTextBoldCursor5.setTextColor(Theme.getColor(i9));
                                this.inputExtraFields[i7].setHeaderHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader));
                                this.inputExtraFields[i7].setTransformHintToHeader(true);
                                this.inputExtraFields[i7].setBackgroundDrawable(null);
                                this.inputExtraFields[i7].setCursorColor(Theme.getColor(i9));
                                this.inputExtraFields[i7].setCursorSize(AndroidUtilities.dp(20.0f));
                                this.inputExtraFields[i7].setCursorWidth(1.5f);
                                this.inputExtraFields[i7].setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated), Theme.getColor(Theme.key_text_RedRegular));
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
                                    i3 = 6;
                                } else {
                                    map = this.currentValues;
                                    str = "middle_name_native";
                                }
                                setFieldValues(map, this.inputExtraFields[i7], str);
                                EditTextBoldCursor editTextBoldCursor6 = this.inputExtraFields[i7];
                                editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                                if (i7 == 0 || i7 == 2 || i7 == 1) {
                                    this.inputExtraFields[i7].addTextChangedListener(new TextWatcher() {
                                        private boolean ignore;

                                        @Override
                                        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                                        }

                                        @Override
                                        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                                        }

                                        @Override
                                        public void afterTextChanged(Editable editable) {
                                            if (this.ignore) {
                                                return;
                                            }
                                            PassportActivity.this.checkFieldForError(editTextBoldCursor4, str, editable, false);
                                        }
                                    });
                                }
                                this.inputExtraFields[i7].setPadding(0, 0, 0, 0);
                                this.inputExtraFields[i7].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                                frameLayout2.addView(this.inputExtraFields[i7], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                                this.inputExtraFields[i7].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                                    @Override
                                    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                                        return PassportActivity.$r8$lambda$7_F0p7BrEsYfl1fNKotKJSzPZrE(this.f$0, textView, i10, keyEvent);
                                    }
                                });
                                i7++;
                                i6 = 3;
                                i3 = 6;
                            }
                            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
                            this.nativeInfoCell = textInfoPrivacyCell;
                            this.linearLayout2.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
                            if (((this.currentBotId != j2 || this.currentDocumentsType == null) && this.currentTypeValue != null && !this.documentOnly) || this.currentDocumentsTypeValue != null) {
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
                                TextSettingsCell textSettingsCell = new TextSettingsCell(context);
                                textSettingsCell.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
                                textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                                if (this.currentDocumentsType == null) {
                                    textSettingsCell.setText(LocaleController.getString(R.string.PassportDeleteInfo), false);
                                } else {
                                    textSettingsCell.setText(LocaleController.getString(R.string.PassportDeleteDocument), false);
                                }
                                this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
                                textSettingsCell.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view4) {
                                        this.f$0.createDocumentDeleteAlert();
                                    }
                                });
                                TextInfoPrivacyCell textInfoPrivacyCell2 = this.nativeInfoCell;
                                int i10 = R.drawable.greydivider;
                                int i11 = Theme.key_windowBackgroundGrayShadow;
                                textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i10, i11));
                                ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context);
                                this.sectionCell = shadowSectionCell2;
                                shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, i11));
                                this.linearLayout2.addView(this.sectionCell, LayoutHelper.createLinear(-1, -2));
                            } else {
                                this.nativeInfoCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                            }
                            updateInterfaceStringsForDocumentType();
                            checkNativeFields(false);
                            return;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context);
                this.topErrorCell = textInfoPrivacyCell3;
                int i12 = R.drawable.greydivider_top;
                int i13 = Theme.key_windowBackgroundGrayShadow;
                textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i12, i13));
                z = false;
                this.topErrorCell.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                this.linearLayout2.addView(this.topErrorCell, LayoutHelper.createLinear(-1, -2));
                checkTopErrorCell(true);
                j = 0;
                if (this.currentDocumentsType != null) {
                    HeaderCell headerCell2 = new HeaderCell(context);
                    this.headerCell = headerCell2;
                    if (this.documentOnly) {
                        headerCell2.setText(LocaleController.getString(R.string.PassportDocuments));
                    } else {
                        headerCell2.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
                    }
                    HeaderCell headerCell3 = this.headerCell;
                    int i14 = Theme.key_windowBackgroundWhite;
                    headerCell3.setBackgroundColor(Theme.getColor(i14));
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
                        public final void onClick(View view4) {
                            PassportActivity.$r8$lambda$i9QnYneRf7UVUZ8vOV6WcZ9xDC0(this.f$0, view4);
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.reverseLayout = linearLayout2;
                    linearLayout2.setOrientation(1);
                    this.linearLayout2.addView(this.reverseLayout, LayoutHelper.createLinear(-1, -2));
                    boolean z2 = this.currentDocumentsType.selfie_required;
                    TextDetailSettingsCell textDetailSettingsCell2 = new TextDetailSettingsCell(context);
                    this.uploadReverseCell = textDetailSettingsCell2;
                    textDetailSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                    this.uploadReverseCell.setTextAndValue(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z2);
                    this.linearLayout2.addView(this.uploadReverseCell, LayoutHelper.createLinear(-1, -2));
                    this.uploadReverseCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view4) {
                            PassportActivity.$r8$lambda$mpX79cHkBJP9xMaHkZw063bD_wQ(this.f$0, view4);
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
                        this.uploadSelfieCell.setTextAndValue(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), this.currentType.translation_required);
                        this.linearLayout2.addView(this.uploadSelfieCell, LayoutHelper.createLinear(-1, -2));
                        this.uploadSelfieCell.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view4) {
                                PassportActivity.$r8$lambda$PpKPAoluF3i0Xm5kTqd75fIGMjk(this.f$0, view4);
                            }
                        });
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context);
                    this.bottomCell = textInfoPrivacyCell4;
                    int i15 = R.drawable.greydivider;
                    textInfoPrivacyCell4.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i15, i13));
                    this.bottomCell.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
                    this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
                    if (this.currentDocumentsType.translation_required) {
                        HeaderCell headerCell4 = new HeaderCell(context);
                        this.headerCell = headerCell4;
                        headerCell4.setText(LocaleController.getString(R.string.PassportTranslation));
                        this.headerCell.setBackgroundColor(Theme.getColor(i14));
                        this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.translationLayout = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.linearLayout2.addView(this.translationLayout, LayoutHelper.createLinear(-1, -2));
                        TextSettingsCell textSettingsCell2 = new TextSettingsCell(context);
                        this.uploadTranslationCell = textSettingsCell2;
                        textSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.linearLayout2.addView(this.uploadTranslationCell, LayoutHelper.createLinear(-1, -2));
                        this.uploadTranslationCell.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view4) {
                                PassportActivity.m3595$r8$lambda$0C6Y4HGiPCpinS7_kYWsR4Zn8(this.f$0, view4);
                            }
                        });
                        TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context);
                        this.bottomCellTranslation = textInfoPrivacyCell5;
                        textInfoPrivacyCell5.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i15, i13));
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
                        HashMap map3 = this.documentsErrors;
                        CharSequence charSequence2 = charSequence;
                        if (map3 != null && (str3 = (String) map3.get("translation_all")) != null) {
                            charSequence2 = charSequence;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append(this.noAllTranslationErrorText);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_text_RedRegular)), 0, str3.length(), 33);
                            this.errorsValues.put("translation_all", "");
                            charSequence2 = spannableStringBuilder;
                        }
                        charSequence2 = charSequence;
                        this.bottomCellTranslation.setText(charSequence2);
                        this.linearLayout2.addView(this.bottomCellTranslation, LayoutHelper.createLinear(-1, -2));
                    }
                } else {
                    TextSettingsCell textSettingsCell3 = new TextSettingsCell(context);
                    this.scanDocumentCell = textSettingsCell3;
                    textSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                    this.scanDocumentCell.setText(LocaleController.getString(R.string.PassportScanPassport), false);
                    this.linearLayout2.addView(this.scanDocumentCell, LayoutHelper.createLinear(-1, -2));
                    this.scanDocumentCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view4) {
                            PassportActivity.$r8$lambda$zG5rxzrUsEVmSKxjDocOviA97Gg(this.f$0, view4);
                        }
                    });
                    TextInfoPrivacyCell textInfoPrivacyCell6 = new TextInfoPrivacyCell(context);
                    this.bottomCell = textInfoPrivacyCell6;
                    textInfoPrivacyCell6.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, i13));
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
                this.headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                i = this.currentDocumentsType != null ? 9 : 7;
                this.inputFields = new EditTextBoldCursor[i];
                i2 = 0;
            }

            public static void $r8$lambda$i9QnYneRf7UVUZ8vOV6WcZ9xDC0(PassportActivity passportActivity, View view) {
                passportActivity.uploadingFileType = 2;
                passportActivity.openAttachMenu();
            }

            public static void $r8$lambda$mpX79cHkBJP9xMaHkZw063bD_wQ(PassportActivity passportActivity, View view) {
                passportActivity.uploadingFileType = 3;
                passportActivity.openAttachMenu();
            }

            public static void $r8$lambda$PpKPAoluF3i0Xm5kTqd75fIGMjk(PassportActivity passportActivity, View view) {
                passportActivity.uploadingFileType = 1;
                passportActivity.openAttachMenu();
            }

            public static void m3595$r8$lambda$0C6Y4HGiPCpinS7_kYWsR4Zn8(PassportActivity passportActivity, View view) {
                passportActivity.uploadingFileType = 4;
                passportActivity.openAttachMenu();
            }

            public static void $r8$lambda$zG5rxzrUsEVmSKxjDocOviA97Gg(PassportActivity passportActivity, View view) {
                if (Build.VERSION.SDK_INT < 23) {
                    passportActivity.getClass();
                } else if (passportActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    passportActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                CameraScanActivity cameraScanActivity = new CameraScanActivity(0);
                cameraScanActivity.setDelegate(new CameraScanActivity.CameraScanActivityDelegate() {
                    @Override
                    public void didFindQr(String str) {
                        CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindQr(this, str);
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
                });
                passportActivity.presentFragment(cameraScanActivity);
            }

            public static boolean m3607$r8$lambda$gTYsgvmLkqZeyKgLAOZnPQCgI(final PassportActivity passportActivity, final View view, MotionEvent motionEvent) {
                if (passportActivity.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
                    countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() {
                        @Override
                        public final void didSelectCountry(CountrySelectActivity.Country country) {
                            PassportActivity.$r8$lambda$1Od4_182vkeIvNZlHDNcEDab_J8(this.f$0, view, country);
                        }
                    });
                    passportActivity.presentFragment(countrySelectActivity);
                }
                return true;
            }

            public static void $r8$lambda$1Od4_182vkeIvNZlHDNcEDab_J8(PassportActivity passportActivity, View view, CountrySelectActivity.Country country) {
                passportActivity.getClass();
                int iIntValue = ((Integer) view.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor = passportActivity.inputFields[iIntValue];
                if (iIntValue == 5) {
                    passportActivity.currentCitizeship = country.shortname;
                } else {
                    passportActivity.currentResidence = country.shortname;
                }
                editTextBoldCursor.setText(country.name);
            }

            public static boolean $r8$lambda$BpjDeQGdM2h8MyH4RRbLAHnh3xQ(final PassportActivity passportActivity, Context context, View view, MotionEvent motionEvent) {
                String string;
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int iIntValue;
                if (passportActivity.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.get(1);
                    calendar.get(2);
                    calendar.get(5);
                    try {
                        final EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                        final int iIntValue2 = ((Integer) editTextBoldCursor.getTag()).intValue();
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
                        AlertDialog.Builder builderCreateDatePickerDialog = AlertsCreator.createDatePickerDialog(context, i, i2, i3, i4, i5, iIntValue, str, iIntValue2 == 8, new AlertsCreator.DatePickerDelegate() {
                            @Override
                            public final void didSelectDate(int i6, int i7, int i8) {
                                PassportActivity.m3600$r8$lambda$GGeb_VPx5pW2RxlyJxCZyDYUDA(this.f$0, iIntValue2, editTextBoldCursor, i6, i7, i8);
                            }
                        });
                        if (iIntValue2 == 8) {
                            builderCreateDatePickerDialog.setNegativeButton(LocaleController.getString(R.string.PassportSelectNotExpire), new AlertDialog.OnButtonClickListener() {
                                @Override
                                public final void onClick(AlertDialog alertDialog, int i6) {
                                    PassportActivity.$r8$lambda$v6SearmdrDF7MUaYs37pjWFe46M(this.f$0, editTextBoldCursor, alertDialog, i6);
                                }
                            });
                        }
                        passportActivity.showDialog(builderCreateDatePickerDialog.create());
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
            }

            public static void m3600$r8$lambda$GGeb_VPx5pW2RxlyJxCZyDYUDA(PassportActivity passportActivity, int i, EditTextBoldCursor editTextBoldCursor, int i2, int i3, int i4) {
                if (i == 8) {
                    int[] iArr = passportActivity.currentExpireDate;
                    iArr[0] = i2;
                    iArr[1] = i3 + 1;
                    iArr[2] = i4;
                } else {
                    passportActivity.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i4), Integer.valueOf(i3 + 1), Integer.valueOf(i2)));
            }

            public static void $r8$lambda$v6SearmdrDF7MUaYs37pjWFe46M(PassportActivity passportActivity, EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, int i) {
                int[] iArr = passportActivity.currentExpireDate;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
            }

            public static boolean $r8$lambda$XhzsstMUjTjM9Wd80k1_oQYersE(final PassportActivity passportActivity, View view, MotionEvent motionEvent) {
                if (passportActivity.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity());
                    builder.setTitle(LocaleController.getString(R.string.PassportSelectGender));
                    builder.setItems(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            PassportActivity.$r8$lambda$2WIr0XjZTLDvwGCpFUmivsSq9ms(this.f$0, dialogInterface, i);
                        }
                    });
                    builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
                    passportActivity.showDialog(builder.create());
                }
                return true;
            }

            public static void $r8$lambda$2WIr0XjZTLDvwGCpFUmivsSq9ms(PassportActivity passportActivity, DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    passportActivity.currentGender = "male";
                    passportActivity.inputFields[4].setText(LocaleController.getString(R.string.PassportMale));
                } else if (i != 1) {
                    passportActivity.getClass();
                } else {
                    passportActivity.currentGender = "female";
                    passportActivity.inputFields[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            }

            public static boolean $r8$lambda$_nVLuyXnfl_rJTA4jLPt6ulnxD0(PassportActivity passportActivity, TextView textView, int i, KeyEvent keyEvent) {
                passportActivity.getClass();
                if (i != 5) {
                    return false;
                }
                int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = passportActivity.inputFields;
                if (iIntValue < editTextBoldCursorArr.length) {
                    if (editTextBoldCursorArr[iIntValue].isFocusable()) {
                        passportActivity.inputFields[iIntValue].requestFocus();
                        return true;
                    }
                    passportActivity.inputFields[iIntValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                }
                return true;
            }

            public static boolean $r8$lambda$7_F0p7BrEsYfl1fNKotKJSzPZrE(PassportActivity passportActivity, TextView textView, int i, KeyEvent keyEvent) {
                passportActivity.getClass();
                if (i != 5) {
                    return false;
                }
                int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = passportActivity.inputExtraFields;
                if (iIntValue < editTextBoldCursorArr.length) {
                    if (editTextBoldCursorArr[iIntValue].isFocusable()) {
                        passportActivity.inputExtraFields[iIntValue].requestFocus();
                        return true;
                    }
                    passportActivity.inputExtraFields[iIntValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                }
                return true;
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
                if (i == 2) {
                    TextDetailSettingsCell textDetailSettingsCell2 = this.uploadFrontCell;
                    if (textDetailSettingsCell2 == null) {
                        return;
                    }
                    TLRPC.TL_secureRequiredType tL_secureRequiredType = this.currentDocumentsType;
                    if (tL_secureRequiredType == null) {
                        z = false;
                    } else if (!tL_secureRequiredType.selfie_required) {
                        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) && !(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                            z = false;
                        }
                    }
                    TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
                    if ((secureValueType2 instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        textDetailSettingsCell2.setTextAndValue(LocaleController.getString(R.string.PassportMainPage), LocaleController.getString(R.string.PassportMainPageInfo), z);
                    } else {
                        textDetailSettingsCell2.setTextAndValue(LocaleController.getString(R.string.PassportFrontSide), LocaleController.getString(R.string.PassportFrontSideInfo), z);
                    }
                    this.uploadFrontCell.setVisibility(this.frontDocument != null ? 8 : 0);
                    return;
                }
                if (i != 3 || this.uploadReverseCell == null) {
                    return;
                }
                TLRPC.SecureValueType secureValueType3 = this.currentDocumentsType.type;
                if ((secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    this.reverseLayout.setVisibility(0);
                    this.uploadReverseCell.setVisibility(this.reverseDocument != null ? 8 : 0);
                } else {
                    this.reverseLayout.setVisibility(8);
                    this.uploadReverseCell.setVisibility(8);
                }
            }

            private void checkTopErrorCell(boolean z) {
                SpannableStringBuilder spannableStringBuilder;
                String str;
                String str2;
                if (this.topErrorCell == null) {
                    return;
                }
                if (this.fieldsErrors == null || (!(z || this.errorsValues.containsKey("error_all")) || (str2 = (String) this.fieldsErrors.get("error_all")) == null)) {
                    spannableStringBuilder = null;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(str2);
                    if (z) {
                        this.errorsValues.put("error_all", "");
                    }
                }
                if (this.documentsErrors != null && ((z || this.errorsValues.containsKey("error_document_all")) && (str = (String) this.documentsErrors.get("error_all")) != null)) {
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
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_text_RedRegular)), 0, spannableStringBuilder.length(), 33);
                    this.topErrorCell.setText(spannableStringBuilder);
                    this.topErrorCell.setVisibility(0);
                } else if (this.topErrorCell.getVisibility() != 8) {
                    this.topErrorCell.setVisibility(8);
                }
            }

            private void addDocumentViewInternal(TLRPC.TL_secureFile tL_secureFile, int i) {
                addDocumentView(new SecureDocument(getSecureDocumentKey(tL_secureFile.secret, tL_secureFile.file_hash), tL_secureFile, null, null, null), i);
            }

            private void addDocumentViews(ArrayList arrayList) {
                this.documents.clear();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i);
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        addDocumentViewInternal((TLRPC.TL_secureFile) secureFile, 0);
                    }
                }
            }

            private void addTranslationDocumentViews(ArrayList arrayList) {
                this.translationDocuments.clear();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i);
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        addDocumentViewInternal((TLRPC.TL_secureFile) secureFile, 4);
                    }
                }
            }

            private void setFieldValues(HashMap map, EditTextBoldCursor editTextBoldCursor, String str) {
                CharSequence charSequence;
                CharSequence charSequence2;
                String str2 = (String) map.get(str);
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
                            if (!TextUtils.isEmpty(str2)) {
                                String[] strArrSplit = str2.split("\\.");
                                if (strArrSplit.length == 3) {
                                    this.currentExpireDate[0] = Utilities.parseInt((CharSequence) strArrSplit[2]).intValue();
                                    this.currentExpireDate[1] = Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                                    this.currentExpireDate[2] = Utilities.parseInt((CharSequence) strArrSplit[0]).intValue();
                                    editTextBoldCursor.setText(str2);
                                } else {
                                    int[] iArr = this.currentExpireDate;
                                    iArr[2] = 0;
                                    iArr[1] = 0;
                                    iArr[0] = 0;
                                    editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                                }
                                break;
                            } else {
                                int[] iArr2 = this.currentExpireDate;
                                iArr2[2] = 0;
                                iArr2[1] = 0;
                                iArr2[0] = 0;
                                editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
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
                HashMap map2 = this.fieldsErrors;
                if (map2 != null && (charSequence2 = (String) map2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(charSequence2);
                    this.errorsValues.put(str, editTextBoldCursor.getText().toString());
                    return;
                }
                HashMap map3 = this.documentsErrors;
                if (map3 == null || (charSequence = (String) map3.get(str)) == null) {
                    return;
                }
                editTextBoldCursor.setErrorText(charSequence);
                this.errorsValues.put(str, editTextBoldCursor.getText().toString());
            }

            private void addDocumentView(final SecureDocument secureDocument, final int i) {
                String string;
                String str;
                String dateForBan;
                HashMap map;
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
                    if ((secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        string = LocaleController.getString(R.string.PassportMainPage);
                    } else {
                        string = LocaleController.getString(R.string.PassportFrontSide);
                    }
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
                if (str2 != null && (map = this.documentsErrors) != null && (dateForBan = (String) map.get(str2)) != null) {
                    secureDocumentCell.valueTextView.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
                    this.errorsValues.put(str2, "");
                } else {
                    dateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
                }
                secureDocumentCell.setTextAndValueAndImage(string, dateForBan, secureDocument);
                secureDocumentCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PassportActivity.$r8$lambda$H0tXIS3ooqe770iAyeJwxuw3ZuI(this.f$0, i, view);
                    }
                });
                secureDocumentCell.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        return PassportActivity.m3605$r8$lambda$VRp7raSYGJplM7DrTajAEJDN6U(this.f$0, i, secureDocument, secureDocumentCell, str2, view);
                    }
                });
            }

            public static void $r8$lambda$H0tXIS3ooqe770iAyeJwxuw3ZuI(PassportActivity passportActivity, int i, View view) {
                passportActivity.uploadingFileType = i;
                if (i == 1) {
                    passportActivity.currentPhotoViewerLayout = passportActivity.selfieLayout;
                } else if (i == 4) {
                    passportActivity.currentPhotoViewerLayout = passportActivity.translationLayout;
                } else if (i == 2) {
                    passportActivity.currentPhotoViewerLayout = passportActivity.frontLayout;
                } else if (i == 3) {
                    passportActivity.currentPhotoViewerLayout = passportActivity.reverseLayout;
                } else {
                    passportActivity.currentPhotoViewerLayout = passportActivity.documentsLayout;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.getInstance().setParentActivity(passportActivity);
                if (i == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(passportActivity.selfieDocument);
                    PhotoViewer.getInstance().openPhoto(arrayList, 0, passportActivity.provider);
                    return;
                }
                if (i == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(passportActivity.frontDocument);
                    PhotoViewer.getInstance().openPhoto(arrayList2, 0, passportActivity.provider);
                } else if (i == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(passportActivity.reverseDocument);
                    PhotoViewer.getInstance().openPhoto(arrayList3, 0, passportActivity.provider);
                } else if (i == 0) {
                    PhotoViewer photoViewer = PhotoViewer.getInstance();
                    ArrayList arrayList4 = passportActivity.documents;
                    photoViewer.openPhoto(arrayList4, arrayList4.indexOf(secureDocument), passportActivity.provider);
                } else {
                    PhotoViewer photoViewer2 = PhotoViewer.getInstance();
                    ArrayList arrayList5 = passportActivity.translationDocuments;
                    photoViewer2.openPhoto(arrayList5, arrayList5.indexOf(secureDocument), passportActivity.provider);
                }
            }

            public static boolean m3605$r8$lambda$VRp7raSYGJplM7DrTajAEJDN6U(final PassportActivity passportActivity, final int i, final SecureDocument secureDocument, final SecureDocumentCell secureDocumentCell, final String str, View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity());
                if (i == 1) {
                    builder.setMessage(LocaleController.getString(R.string.PassportDeleteSelfie));
                } else {
                    builder.setMessage(LocaleController.getString(R.string.PassportDeleteScan));
                }
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.setTitle(LocaleController.getString(R.string.AppName));
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        PassportActivity.$r8$lambda$X7qpFUR7ZVZzv9fkPFMNvFsrvIY(this.f$0, secureDocument, i, secureDocumentCell, str, alertDialog, i2);
                    }
                });
                passportActivity.showDialog(builder.create());
                return true;
            }

            public static void $r8$lambda$X7qpFUR7ZVZzv9fkPFMNvFsrvIY(PassportActivity passportActivity, SecureDocument secureDocument, int i, SecureDocumentCell secureDocumentCell, String str, AlertDialog alertDialog, int i2) {
                passportActivity.documentsCells.remove(secureDocument);
                if (i == 1) {
                    passportActivity.selfieDocument = null;
                    passportActivity.selfieLayout.removeView(secureDocumentCell);
                } else if (i == 4) {
                    passportActivity.translationDocuments.remove(secureDocument);
                    passportActivity.translationLayout.removeView(secureDocumentCell);
                } else if (i == 2) {
                    passportActivity.frontDocument = null;
                    passportActivity.frontLayout.removeView(secureDocumentCell);
                } else if (i == 3) {
                    passportActivity.reverseDocument = null;
                    passportActivity.reverseLayout.removeView(secureDocumentCell);
                } else {
                    passportActivity.documents.remove(secureDocument);
                    passportActivity.documentsLayout.removeView(secureDocumentCell);
                }
                if (str != null) {
                    HashMap map = passportActivity.documentsErrors;
                    if (map != null) {
                        map.remove(str);
                    }
                    HashMap map2 = passportActivity.errorsValues;
                    if (map2 != null) {
                        map2.remove(str);
                    }
                }
                passportActivity.updateUploadText(i);
                String str2 = secureDocument.path;
                if (str2 == null || passportActivity.uploadingDocuments.remove(str2) == null) {
                    return;
                }
                if (passportActivity.uploadingDocuments.isEmpty()) {
                    passportActivity.doneItem.setEnabled(true);
                    passportActivity.doneItem.setAlpha(1.0f);
                }
                FileLoader.getInstance(passportActivity.currentAccount).cancelFileUpload(secureDocument.path, false);
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
                if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                    return "phone";
                }
                return "";
            }

            private TextDetailSecureCell getViewByType(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
                TLRPC.TL_secureRequiredType tL_secureRequiredType2;
                TextDetailSecureCell textDetailSecureCell = (TextDetailSecureCell) this.typesViews.get(tL_secureRequiredType);
                return (textDetailSecureCell != null || (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.documentsToTypesLink.get(tL_secureRequiredType)) == null) ? textDetailSecureCell : (TextDetailSecureCell) this.typesViews.get(tL_secureRequiredType2);
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
                if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
                    return LocaleController.getString(R.string.ActionBotDocumentEmail);
                }
                return "";
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
                HashMap map;
                HashMap map2;
                String[] strArr6;
                StringBuilder sb3;
                int i4;
                JSONObject jSONObject4;
                HashMap map3;
                HashMap map4;
                String[] strArr7;
                String string;
                byte b;
                Iterator<String> itKeys;
                String next;
                int i5;
                int i6;
                String string2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                HashMap map5;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4;
                HashMap map6;
                TLRPC.SecureValueType secureValueType2;
                TLRPC.SecureValueType secureValueType3;
                boolean z2;
                TLRPC.SecureValueType secureValueType4;
                int i7;
                boolean z3;
                TLRPC.SecureValueType secureValueType5;
                String str4 = str2;
                TextDetailSecureCell textDetailSecureCellAddField = (TextDetailSecureCell) this.typesViews.get(tL_secureRequiredType);
                if (textDetailSecureCellAddField == null) {
                    if (this.currentActivityType != 8) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
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
                HashMap map7 = (HashMap) this.typesValues.get(tL_secureRequiredType);
                HashMap map8 = tL_secureRequiredType2 != null ? (HashMap) this.typesValues.get(tL_secureRequiredType2) : null;
                TLRPC.TL_secureValue valueByType = getValueByType(tL_secureRequiredType, true);
                TLRPC.TL_secureValue valueByType2 = getValueByType(tL_secureRequiredType2, true);
                if (str4 != null && this.languageMap == null) {
                    this.languageMap = new HashMap();
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
                                    string2 = PhoneFormat.getInstance().format("+" + str);
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
                                map5 = (HashMap) this.errorsMap.get(getNameForType(tL_secureRequiredType3.type));
                            }
                            if (tL_secureRequiredType2 != null) {
                                tL_secureRequiredType4 = tL_secureRequiredType2;
                                map6 = (HashMap) this.errorsMap.get(getNameForType(tL_secureRequiredType4.type));
                            } else {
                                tL_secureRequiredType4 = tL_secureRequiredType2;
                                map6 = null;
                            }
                            if (map5 == null) {
                                secureValueType2 = tL_secureRequiredType3.type;
                                if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                    if (TextUtils.isEmpty(string2)) {
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
                                } else {
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
                                }
                                z2 = false;
                            } else {
                                secureValueType2 = tL_secureRequiredType3.type;
                                if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                    if (TextUtils.isEmpty(string2)) {
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
                                } else {
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
                            textView.setTextColor(Theme.getColor(i7));
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
                } else {
                    c = 2;
                    this.languageMap = null;
                }
                if (str != null) {
                    secureValueType5 = tL_secureRequiredType.type;
                    if (secureValueType5 instanceof TLRPC.TL_secureValueTypePhone) {
                        string2 = PhoneFormat.getInstance().format("+" + str);
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
                                                            String str6 = (String) this.languageMap.get(string);
                                                            if (str6 != null) {
                                                                sb.append(str6);
                                                            }
                                                        } else if (b == 2) {
                                                            if ("male".equals(string)) {
                                                                sb.append(LocaleController.getString(R.string.PassportMale));
                                                            } else if ("female".equals(string)) {
                                                                sb.append(LocaleController.getString(R.string.PassportFemale));
                                                            }
                                                        } else {
                                                            sb.append(string);
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
                    map5 = (HashMap) this.errorsMap.get(getNameForType(tL_secureRequiredType3.type));
                } else {
                    tL_secureRequiredType3 = tL_secureRequiredType;
                    map5 = null;
                }
                if (tL_secureRequiredType2 != null) {
                    tL_secureRequiredType4 = tL_secureRequiredType2;
                    map6 = (HashMap) this.errorsMap.get(getNameForType(tL_secureRequiredType4.type));
                } else {
                    tL_secureRequiredType4 = tL_secureRequiredType2;
                    map6 = null;
                }
                if ((map5 == null && map5.size() > 0) || (map6 != null && map6.size() > 0)) {
                    String str7 = !z ? (String) this.mainErrorsMap.get(getNameForType(tL_secureRequiredType3.type)) : null;
                    string2 = str7 == null ? (String) this.mainErrorsMap.get(getNameForType(tL_secureRequiredType4.type)) : str7;
                    z2 = true;
                } else {
                    secureValueType2 = tL_secureRequiredType3.type;
                    if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                        if (TextUtils.isEmpty(string2)) {
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
                    } else {
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
                    }
                    z2 = false;
                }
                textDetailSecureCell.setValue(string2);
                TextView textView2 = textDetailSecureCell.valueTextView;
                if (z2) {
                    i7 = Theme.key_text_RedRegular;
                } else {
                    i7 = Theme.key_windowBackgroundWhiteGrayText2;
                }
                textView2.setTextColor(Theme.getColor(i7));
                if (z2 || this.currentActivityType == 8 || (((!z || tL_secureRequiredType4 == null) && (z || tL_secureValue == null)) || (tL_secureRequiredType4 != null && valueByType2 == null))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                textDetailSecureCell.setChecked(z3);
            }

            public void checkNativeFields(boolean z) {
                EditTextBoldCursor[] editTextBoldCursorArr;
                int i = 0;
                if (this.inputExtraFields == null) {
                    return;
                }
                String str = (String) this.languageMap.get(this.currentResidence);
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
                        if (((this.currentBotId != 0 || this.currentDocumentsType == null) && this.currentTypeValue != null && !this.documentOnly) || this.currentDocumentsTypeValue != null) {
                            this.sectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(getParentActivity(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                            return;
                        } else {
                            this.sectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(getParentActivity(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                            return;
                        }
                    }
                    return;
                }
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
                            }
                            if (zArr[i3]) {
                                this.inputExtraFields[0].setText(this.inputFields[0].getText());
                                this.inputExtraFields[1].setText(this.inputFields[1].getText());
                                this.inputExtraFields[2].setText(this.inputFields[2].getText());
                                break;
                            }
                            i3++;
                        }
                    }
                    this.sectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(getParentActivity(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                }
                this.nativeInfoCell.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str));
                String serverString = str2 != null ? LocaleController.getServerString("PassportLanguage_" + str2) : null;
                if (serverString != null) {
                    this.headerCell.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, serverString));
                } else {
                    this.headerCell.setText(LocaleController.getString(R.string.PassportNativeHeader));
                }
                for (int i4 = 0; i4 < 3; i4++) {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                if (serverString != null) {
                                    this.inputExtraFields[i4].setHintText(LocaleController.getString(R.string.PassportSurname));
                                } else {
                                    this.inputExtraFields[i4].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str));
                                }
                            }
                        } else if (serverString != null) {
                            this.inputExtraFields[i4].setHintText(LocaleController.getString(R.string.PassportMidname));
                        } else {
                            this.inputExtraFields[i4].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str));
                        }
                    } else if (serverString != null) {
                        this.inputExtraFields[i4].setHintText(LocaleController.getString(R.string.PassportName));
                    } else {
                        this.inputExtraFields[i4].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str));
                    }
                }
                if (z) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.m3597$r8$lambda$4C1uX9eGZPucbj4xT4sirbTxRY(this.f$0);
                        }
                    });
                }
            }

            public static void m3597$r8$lambda$4C1uX9eGZPucbj4xT4sirbTxRY(PassportActivity passportActivity) {
                EditTextBoldCursor[] editTextBoldCursorArr = passportActivity.inputExtraFields;
                if (editTextBoldCursorArr != null) {
                    passportActivity.scrollToField(editTextBoldCursorArr[0]);
                }
            }

            private TLRPC.TL_secureValue getValueByType(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
                String[] strArr;
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
                                if (z2) {
                                    if (tL_secureRequiredType.native_names) {
                                        strArr = new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"};
                                    } else {
                                        strArr = new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"};
                                    }
                                } else {
                                    strArr = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                                }
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

            private void openTypeActivity(org.telegram.tgnet.TLRPC.TL_secureRequiredType r19, org.telegram.tgnet.TLRPC.TL_secureRequiredType r20, java.util.ArrayList r21, boolean r22) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PassportActivity.openTypeActivity(org.telegram.tgnet.TLRPC$TL_secureRequiredType, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean):void");
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

            public void deleteValueInternal(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z, final Runnable runnable, final ErrorRunnable errorRunnable, final boolean z2) {
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
                        PassportActivity.$r8$lambda$AydNrOC2UEWc630rN87xbTdNNJ0(this.f$0, errorRunnable, z2, tL_secureRequiredType2, tL_secureRequiredType, z, arrayList, runnable, tLObject, tL_error);
                    }
                });
            }

            public static void $r8$lambda$AydNrOC2UEWc630rN87xbTdNNJ0(final PassportActivity passportActivity, final ErrorRunnable errorRunnable, final boolean z, final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final boolean z2, final ArrayList arrayList, final Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
                passportActivity.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.$r8$lambda$fsAFTyphtVu5_lxjfLPXLJPlc90(this.f$0, tL_error, errorRunnable, z, tL_secureRequiredType, tL_secureRequiredType2, z2, arrayList, runnable);
                    }
                });
            }

            public static void $r8$lambda$fsAFTyphtVu5_lxjfLPXLJPlc90(PassportActivity passportActivity, TLRPC.TL_error tL_error, ErrorRunnable errorRunnable, boolean z, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, boolean z2, ArrayList arrayList, Runnable runnable) {
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                String strDecryptData;
                TLRPC.TL_secureData tL_secureData;
                String strDecryptData2 = null;
                if (tL_error != null) {
                    passportActivity.getClass();
                    if (errorRunnable != null) {
                        errorRunnable.onError(tL_error.text, null);
                    }
                    passportActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
                if (!z) {
                    if (z2) {
                        passportActivity.removeValue(tL_secureRequiredType2);
                    }
                    passportActivity.removeValue(tL_secureRequiredType);
                } else if (tL_secureRequiredType != null) {
                    passportActivity.removeValue(tL_secureRequiredType);
                } else {
                    passportActivity.removeValue(tL_secureRequiredType2);
                }
                if (passportActivity.currentActivityType == 8) {
                    TextDetailSecureCell textDetailSecureCell = (TextDetailSecureCell) passportActivity.typesViews.remove(tL_secureRequiredType2);
                    if (textDetailSecureCell != null) {
                        passportActivity.linearLayout2.removeView(textDetailSecureCell);
                        LinearLayout linearLayout = passportActivity.linearLayout2;
                        View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 6);
                        if (childAt instanceof TextDetailSecureCell) {
                            ((TextDetailSecureCell) childAt).setNeedDivider(false);
                        }
                    }
                    passportActivity.updateManageVisibility();
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
                                TLRPC.TL_secureValue valueByType = passportActivity.getValueByType(tL_secureRequiredType3, false);
                                if (valueByType != null) {
                                    TLRPC.TL_secureData tL_secureData2 = valueByType.data;
                                    if (tL_secureData2 != null) {
                                        strDecryptData = passportActivity.decryptData(tL_secureData2.data, passportActivity.decryptValueSecret(tL_secureData2.secret, tL_secureData2.data_hash), valueByType.data.data_hash);
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
                        passportActivity.setTypeValue(tL_secureRequiredType2, null, null, tL_secureRequiredType3, strDecryptData, z, arrayList != null ? arrayList.size() : 0);
                    } else {
                        String str = strDecryptData;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType3;
                        TLRPC.TL_secureValue valueByType2 = passportActivity.getValueByType(tL_secureRequiredType2, false);
                        if (valueByType2 != null && (tL_secureData = valueByType2.data) != null) {
                            strDecryptData2 = passportActivity.decryptData(tL_secureData.data, passportActivity.decryptValueSecret(tL_secureData.secret, tL_secureData.data_hash), valueByType2.data.data_hash);
                        }
                        passportActivity.setTypeValue(tL_secureRequiredType2, null, strDecryptData2, tL_secureRequiredType4, str, z, arrayList != null ? arrayList.size() : 0);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                }
            }

            private TextDetailSecureCell addField(Context context, final TLRPC.TL_secureRequiredType tL_secureRequiredType, final ArrayList arrayList, final boolean z, boolean z2) {
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
                        string2 = getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type);
                    } else if (z && arrayList.size() == 2) {
                        string2 = LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type));
                    } else {
                        string2 = LocaleController.getString(R.string.PassportIdentityDocument);
                    }
                    textDetailSecureCell.setTextAndValue(string2, "", !z2);
                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                    if (arrayList == null || arrayList.isEmpty()) {
                        string = LocaleController.getString(R.string.PassportAddress);
                    } else if (z && arrayList.size() == 1) {
                        string = getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type);
                    } else if (z && arrayList.size() == 2) {
                        string = LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type));
                    } else {
                        string = LocaleController.getString(R.string.PassportResidentialAddress);
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
                textDetailSecureCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PassportActivity.$r8$lambda$wPOgWaIwjkaArgw6Mj_9ShvfBF0(this.f$0, arrayList, tL_secureRequiredType, z, view);
                    }
                });
                this.typesViews.put(tL_secureRequiredType, textDetailSecureCell);
                this.typesValues.put(tL_secureRequiredType, new HashMap());
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
                        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) arrayList.get(i);
                        this.typesValues.put(tL_secureRequiredType4, new HashMap());
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
                        tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) arrayList.get(0);
                    }
                    tL_secureRequiredType2 = tL_secureRequiredType3;
                    str2 = strDecryptData2;
                }
                setTypeValue(tL_secureRequiredType, str, strDecryptData, tL_secureRequiredType2, str2, z, size);
                return textDetailSecureCell;
            }

            public static void $r8$lambda$wPOgWaIwjkaArgw6Mj_9ShvfBF0(final PassportActivity passportActivity, final ArrayList arrayList, final TLRPC.TL_secureRequiredType tL_secureRequiredType, final boolean z, View view) {
                TLRPC.TL_secureRequiredType tL_secureRequiredType2;
                passportActivity.getClass();
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
                    if (passportActivity.getValueByType(tL_secureRequiredType2, false) != null || size == 1) {
                        break;
                    } else {
                        i++;
                    }
                }
                TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                if ((secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                    if (tL_secureRequiredType2 == null && arrayList != null && !arrayList.isEmpty()) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity());
                        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
                        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                            builder.setTitle(LocaleController.getString(R.string.PassportIdentityDocument));
                        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                            builder.setTitle(LocaleController.getString(R.string.PassportAddress));
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
                        builder.setItems((CharSequence[]) arrayList2.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                PassportActivity.m3603$r8$lambda$R__yOOlirRkCXzkxedIIdHphFc(this.f$0, tL_secureRequiredType, arrayList, z, dialogInterface, i3);
                            }
                        });
                        passportActivity.showDialog(builder.create());
                        return;
                    }
                } else {
                    boolean z2 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                    if ((z2 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && passportActivity.getValueByType(tL_secureRequiredType, false) != null) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(passportActivity.getParentActivity());
                        builder2.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i3) {
                                PassportActivity.$r8$lambda$7_7kJN2Rep5DE97HkRyi1pFkc1U(this.f$0, tL_secureRequiredType, z, alertDialog, i3);
                            }
                        });
                        builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        builder2.setTitle(LocaleController.getString(R.string.AppName));
                        builder2.setMessage(LocaleController.getString(z2 ? R.string.PassportDeletePhoneAlert : R.string.PassportDeleteEmailAlert));
                        passportActivity.showDialog(builder2.create());
                        return;
                    }
                }
                passportActivity.openTypeActivity(tL_secureRequiredType, tL_secureRequiredType2, arrayList, z);
            }

            public static void m3603$r8$lambda$R__yOOlirRkCXzkxedIIdHphFc(PassportActivity passportActivity, TLRPC.TL_secureRequiredType tL_secureRequiredType, ArrayList arrayList, boolean z, DialogInterface dialogInterface, int i) {
                passportActivity.getClass();
                passportActivity.openTypeActivity(tL_secureRequiredType, (TLRPC.TL_secureRequiredType) arrayList.get(i), arrayList, z);
            }

            public static void $r8$lambda$7_7kJN2Rep5DE97HkRyi1pFkc1U(final PassportActivity passportActivity, TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z, AlertDialog alertDialog, int i) {
                passportActivity.needShowProgress();
                passportActivity.deleteValueInternal(tL_secureRequiredType, null, null, true, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.needHideProgress();
                    }
                }, new ErrorRunnable() {
                    @Override
                    public final void onError(String str, String str2) {
                        this.f$0.needHideProgress();
                    }
                }, z);
            }

            static class EncryptionResult {
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
                byte[] bArrComputeSHA512 = Utilities.computeSHA512(decryptValueSecret(bArr, bArr2), bArr2);
                byte[] bArr3 = new byte[32];
                System.arraycopy(bArrComputeSHA512, 0, bArr3, 0, 32);
                byte[] bArr4 = new byte[16];
                System.arraycopy(bArrComputeSHA512, 32, bArr4, 0, 16);
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
                    int iNextInt = Utilities.random.nextInt(32);
                    int i4 = (bArr[iNextInt] & 255) + (239 - i3);
                    if (i4 < 255) {
                        i4 += 255;
                    }
                    bArr[iNextInt] = (byte) (i4 % 255);
                }
                return bArr;
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

            public void showAlertWithText(String str, String str2) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                builder.setTitle(str);
                builder.setMessage(str2);
                showDialog(builder.create());
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

            public void startPhoneVerification(boolean z, final String str, Runnable runnable, ErrorRunnable errorRunnable, final PassportActivityDelegate passportActivityDelegate) {
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
                                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
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
                final TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
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
                        if (!TextUtils.isEmpty(line1Number)) {
                            sendverifyphonecode.settings.current_number = PhoneNumberUtils.compare(str, line1Number);
                            TLRPC.TL_codeSettings tL_codeSettings2 = sendverifyphonecode.settings;
                            if (!tL_codeSettings2.current_number) {
                                tL_codeSettings2.allow_flashcall = false;
                            }
                        } else {
                            TLRPC.TL_codeSettings tL_codeSettings3 = sendverifyphonecode.settings;
                            tL_codeSettings3.unknown_number = true;
                            tL_codeSettings3.current_number = false;
                        }
                    } catch (Exception e) {
                        sendverifyphonecode.settings.allow_flashcall = false;
                        FileLog.e(e);
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        PassportActivity.$r8$lambda$ra78BiX_t80ORbNxWlslsnjcE1U(this.f$0, str, passportActivityDelegate, sendverifyphonecode, tLObject, tL_error);
                    }
                }, 2);
            }

            public static void $r8$lambda$ra78BiX_t80ORbNxWlslsnjcE1U(final PassportActivity passportActivity, final String str, final PassportActivityDelegate passportActivityDelegate, final TL_account.sendVerifyPhoneCode sendverifyphonecode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
                passportActivity.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.$r8$lambda$VD2WG08kT33wU6BMU4ZIFEVyptk(this.f$0, tL_error, str, passportActivityDelegate, tLObject, sendverifyphonecode);
                    }
                });
            }

            public static void $r8$lambda$VD2WG08kT33wU6BMU4ZIFEVyptk(PassportActivity passportActivity, TLRPC.TL_error tL_error, String str, PassportActivityDelegate passportActivityDelegate, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
                if (tL_error == null) {
                    passportActivity.getClass();
                    HashMap map = new HashMap();
                    map.put("phone", str);
                    PassportActivity passportActivity2 = new PassportActivity(7, passportActivity.currentForm, passportActivity.currentPassword, passportActivity.currentType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, map, (HashMap) null);
                    passportActivity2.currentAccount = passportActivity.currentAccount;
                    passportActivity2.saltedPassword = passportActivity.saltedPassword;
                    passportActivity2.secureSecret = passportActivity.secureSecret;
                    passportActivity2.delegate = passportActivityDelegate;
                    passportActivity2.currentPhoneVerification = (TLRPC.TL_auth_sentCode) tLObject;
                    passportActivity.presentFragment(passportActivity2, true);
                    return;
                }
                AlertsCreator.processError(passportActivity.currentAccount, tL_error, passportActivity, sendverifyphonecode, str);
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
                    if (password2 != null && !TextUtils.isEmpty(password2.hint)) {
                        this.inputFields[0].setHint(this.currentPassword.hint);
                    } else {
                        this.inputFields[0].setHint(LocaleController.getString(R.string.LoginPassword));
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
                        public void onAnimationEnd(Animator animator) {
                            if (PassportActivity.this.doneItemAnimation == null || !PassportActivity.this.doneItemAnimation.equals(animator)) {
                                return;
                            }
                            if (!z2) {
                                PassportActivity.this.progressView.setVisibility(4);
                            } else {
                                PassportActivity.this.doneItem.getContentView().setVisibility(4);
                            }
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {
                            if (PassportActivity.this.doneItemAnimation == null || !PassportActivity.this.doneItemAnimation.equals(animator)) {
                                return;
                            }
                            PassportActivity.this.doneItemAnimation = null;
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
                        public void onAnimationEnd(Animator animator) {
                            if (PassportActivity.this.doneItemAnimation == null || !PassportActivity.this.doneItemAnimation.equals(animator)) {
                                return;
                            }
                            if (!z2) {
                                PassportActivity.this.progressViewButton.setVisibility(4);
                            } else {
                                PassportActivity.this.acceptTextView.setVisibility(4);
                            }
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {
                            if (PassportActivity.this.doneItemAnimation == null || !PassportActivity.this.doneItemAnimation.equals(animator)) {
                                return;
                            }
                            PassportActivity.this.doneItemAnimation = null;
                        }
                    });
                    this.doneItemAnimation.setDuration(150L);
                    this.doneItemAnimation.start();
                }
            }

            @Override
            public void didReceivedNotification(int i, int i2, Object... objArr) {
                EditTextBoldCursor editTextBoldCursor;
                SecureDocumentCell secureDocumentCell;
                ActionBarMenuItem actionBarMenuItem;
                if (i == NotificationCenter.fileUploaded) {
                    String str = (String) objArr[0];
                    SecureDocument secureDocument = (SecureDocument) this.uploadingDocuments.get(str);
                    if (secureDocument != null) {
                        secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
                        this.uploadingDocuments.remove(str);
                        if (this.uploadingDocuments.isEmpty() && (actionBarMenuItem = this.doneItem) != null) {
                            actionBarMenuItem.setEnabled(true);
                            this.doneItem.setAlpha(1.0f);
                        }
                        HashMap map = this.documentsCells;
                        if (map != null && (secureDocumentCell = (SecureDocumentCell) map.get(secureDocument)) != null) {
                            secureDocumentCell.updateButtonState(true);
                        }
                        HashMap map2 = this.errorsValues;
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
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i != NotificationCenter.fileUploadFailed && i == NotificationCenter.twoStepPasswordChanged) {
                    if (objArr != null && objArr.length > 0) {
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
                    } else {
                        this.currentPassword = null;
                        loadPasswordInfo();
                    }
                    updatePasswordInterface();
                }
            }

            @Override
            public void onTransitionAnimationEnd(boolean z, boolean z2) {
                if (this.presentAfterAnimation != null) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.$r8$lambda$wpKpmyZLiw8whbT5hHZ1skXfz58(this.f$0);
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

            public static void $r8$lambda$wpKpmyZLiw8whbT5hHZ1skXfz58(PassportActivity passportActivity) {
                passportActivity.presentFragment(passportActivity.presentAfterAnimation, true);
                passportActivity.presentAfterAnimation = null;
            }

            private void showAttachmentError() {
                if (getParentActivity() == null) {
                    return;
                }
                Toast.makeText(getParentActivity(), LocaleController.getString(R.string.UnsupportedAttachment), 0).show();
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
                        ArrayList arrayList = new ArrayList();
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        sendingMediaInfo.uri = intent.getData();
                        arrayList.add(sendingMediaInfo);
                        processSelectedFiles(arrayList);
                    }
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
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    builder.setTitle(LocaleController.getString(R.string.AppName));
                    builder.setMessage(LocaleController.getString(R.string.PermissionNoAudioVideoWithHint));
                    builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i3) {
                            PassportActivity.$r8$lambda$barGLn0lNoAK052NjmLOs4bnCHw(this.f$0, alertDialog, i3);
                        }
                    });
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

            public static void $r8$lambda$barGLn0lNoAK052NjmLOs4bnCHw(PassportActivity passportActivity, AlertDialog alertDialog, int i) {
                passportActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    passportActivity.getParentActivity().startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
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
            public void restoreSelfArgs(Bundle bundle) {
                this.currentPicturePath = bundle.getString("path");
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
            protected void onDialogDismiss(Dialog dialog) {
                if (this.currentActivityType != 3 || Build.VERSION.SDK_INT < 23 || dialog != this.permissionsDialog || this.permissionsItems.isEmpty()) {
                    return;
                }
                getParentActivity().requestPermissions((String[]) this.permissionsItems.toArray(new String[0]), 6);
            }

            public void needShowProgress() {
                if (getParentActivity() == null || getParentActivity().isFinishing() || this.progressDialog != null) {
                    return;
                }
                AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
                this.progressDialog = alertDialog;
                alertDialog.setCanCancel(false);
                this.progressDialog.show();
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
                    animatorSet.addListener(new AnimatorListenerAdapter() {
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

            private void createChatAttachView() {
                if (getParentActivity() != null && this.chatAttachAlert == null) {
                    ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getParentActivity(), this, false, false);
                    this.chatAttachAlert = chatAttachAlert;
                    chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
                        @Override
                        public void didSelectBot(TLRPC.User user) {
                            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
                        }

                        @Override
                        public void doOnIdle(Runnable runnable) {
                            runnable.run();
                        }

                        @Override
                        public boolean needEnterComment() {
                            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
                        }

                        @Override
                        public void onWallpaperSelected(Object obj) {
                            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
                        }

                        @Override
                        public void openAvatarsSearch() {
                            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
                        }

                        @Override
                        public boolean selectItemOnClicking() {
                            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
                        }

                        @Override
                        public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
                        }

                        @Override
                        public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                            if (PassportActivity.this.getParentActivity() == null || PassportActivity.this.chatAttachAlert == null) {
                                return;
                            }
                            if (i == 8 || i == 7) {
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
                                return;
                            }
                            if (PassportActivity.this.chatAttachAlert != null) {
                                PassportActivity.this.chatAttachAlert.dismissWithButtonClick(i);
                            }
                            PassportActivity.this.processSelectedAttach(i);
                        }

                        @Override
                        public void onCameraOpened() {
                            AndroidUtilities.hideKeyboard(PassportActivity.this.fragmentView.findFocus());
                        }
                    });
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

            public void didSelectPhotos(ArrayList arrayList, boolean z, int i) {
                processSelectedFiles(arrayList);
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

            public void didSelectFiles(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    sendingMediaInfo.path = (String) arrayList.get(i2);
                    arrayList2.add(sendingMediaInfo);
                }
                processSelectedFiles(arrayList2);
            }

            private void fillInitialValues() {
                if (this.initialValues != null) {
                    return;
                }
                this.initialValues = getCurrentValues();
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
                    sb.append(((SecureDocument) this.documents.get(i3)).secureFile.id);
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
                    sb.append(((SecureDocument) this.translationDocuments.get(i4)).secureFile.id);
                }
                return sb.toString();
            }

            public boolean isHasNotAnyChanges() {
                String str = this.initialValues;
                return str == null || str.equals(getCurrentValues());
            }

            public boolean checkDiscard(boolean z) {
                if (isHasNotAnyChanges()) {
                    return false;
                }
                if (!z) {
                    return true;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.finishFragment();
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.setTitle(LocaleController.getString(R.string.DiscardChanges));
                builder.setMessage(LocaleController.getString(R.string.PassportDiscardChanges));
                showDialog(builder.create());
                return true;
            }

            public void processSelectedFiles(final ArrayList arrayList) {
                if (arrayList.isEmpty()) {
                    return;
                }
                int i = this.uploadingFileType;
                final boolean z = false;
                if (i != 1 && i != 4 && (this.currentType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                    int i2 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
                        if (i2 >= editTextBoldCursorArr.length) {
                            z = true;
                            break;
                        } else if (i2 != 5 && i2 != 8 && i2 != 4 && i2 != 6 && editTextBoldCursorArr[i2].length() > 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                final int i3 = this.uploadingFileType;
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        PassportActivity.$r8$lambda$KAQn_bHYLjlDcfdCGw2gXqSQvXQ(this.f$0, arrayList, i3, z);
                    }
                });
            }

            public static void $r8$lambda$KAQn_bHYLjlDcfdCGw2gXqSQvXQ(final PassportActivity passportActivity, ArrayList arrayList, final int i, boolean z) {
                TLRPC.PhotoSize photoSizeScaleAndSaveImage;
                int i2 = passportActivity.uploadingFileType;
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
                        final SecureDocument secureDocumentSaveFile = passportActivity.delegate.saveFile(tL_secureFile);
                        secureDocumentSaveFile.type = i;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                PassportActivity.$r8$lambda$WydboVvdKWvlBYWGRu6MGQscNZU(this.f$0, secureDocumentSaveFile, i);
                            }
                        });
                        if (z && !z2) {
                            try {
                                final MrzRecognizer.Result resultRecognize = MrzRecognizer.recognize(bitmapLoadBitmap, passportActivity.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                if (resultRecognize != null) {
                                    try {
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                PassportActivity.m3611$r8$lambda$l5CFj9i4ivrYVU596dr0wMEqd4(this.f$0, resultRecognize);
                                            }
                                        });
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

            public static void $r8$lambda$WydboVvdKWvlBYWGRu6MGQscNZU(PassportActivity passportActivity, SecureDocument secureDocument, int i) {
                int i2 = passportActivity.uploadingFileType;
                if (i2 == 1) {
                    SecureDocument secureDocument2 = passportActivity.selfieDocument;
                    if (secureDocument2 != null) {
                        SecureDocumentCell secureDocumentCell = (SecureDocumentCell) passportActivity.documentsCells.remove(secureDocument2);
                        if (secureDocumentCell != null) {
                            passportActivity.selfieLayout.removeView(secureDocumentCell);
                        }
                        passportActivity.selfieDocument = null;
                    }
                } else if (i2 == 4) {
                    if (passportActivity.translationDocuments.size() >= 20) {
                        return;
                    }
                } else if (i2 == 2) {
                    SecureDocument secureDocument3 = passportActivity.frontDocument;
                    if (secureDocument3 != null) {
                        SecureDocumentCell secureDocumentCell2 = (SecureDocumentCell) passportActivity.documentsCells.remove(secureDocument3);
                        if (secureDocumentCell2 != null) {
                            passportActivity.frontLayout.removeView(secureDocumentCell2);
                        }
                        passportActivity.frontDocument = null;
                    }
                } else if (i2 == 3) {
                    SecureDocument secureDocument4 = passportActivity.reverseDocument;
                    if (secureDocument4 != null) {
                        SecureDocumentCell secureDocumentCell3 = (SecureDocumentCell) passportActivity.documentsCells.remove(secureDocument4);
                        if (secureDocumentCell3 != null) {
                            passportActivity.reverseLayout.removeView(secureDocumentCell3);
                        }
                        passportActivity.reverseDocument = null;
                    }
                } else if (i2 == 0 && passportActivity.documents.size() >= 20) {
                    return;
                }
                passportActivity.uploadingDocuments.put(secureDocument.path, secureDocument);
                passportActivity.doneItem.setEnabled(false);
                passportActivity.doneItem.setAlpha(0.5f);
                FileLoader.getInstance(passportActivity.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
                passportActivity.addDocumentView(secureDocument, i);
                passportActivity.updateUploadText(i);
            }

            public static void m3611$r8$lambda$l5CFj9i4ivrYVU596dr0wMEqd4(PassportActivity passportActivity, MrzRecognizer.Result result) {
                int i;
                int i2;
                passportActivity.getClass();
                int i3 = result.type;
                if (i3 == 2) {
                    if (!(passportActivity.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = passportActivity.availableDocumentTypes.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) passportActivity.availableDocumentTypes.get(i4);
                            if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                passportActivity.currentDocumentsType = tL_secureRequiredType;
                                passportActivity.updateInterfaceStringsForDocumentType();
                                break;
                            }
                        }
                    }
                } else if (i3 == 1) {
                    if (!(passportActivity.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = passportActivity.availableDocumentTypes.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) passportActivity.availableDocumentTypes.get(i5);
                            if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                passportActivity.currentDocumentsType = tL_secureRequiredType2;
                                passportActivity.updateInterfaceStringsForDocumentType();
                                break;
                            }
                        }
                    }
                } else if (i3 == 3) {
                    if (!(passportActivity.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = passportActivity.availableDocumentTypes.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) passportActivity.availableDocumentTypes.get(i6);
                            if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                passportActivity.currentDocumentsType = tL_secureRequiredType3;
                                passportActivity.updateInterfaceStringsForDocumentType();
                                break;
                            }
                        }
                    }
                } else if (i3 == 4 && !(passportActivity.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = passportActivity.availableDocumentTypes.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) passportActivity.availableDocumentTypes.get(i7);
                        if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                            passportActivity.currentDocumentsType = tL_secureRequiredType4;
                            passportActivity.updateInterfaceStringsForDocumentType();
                            break;
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    passportActivity.inputFields[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    passportActivity.inputFields[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    passportActivity.inputFields[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    passportActivity.inputFields[7].setText(result.number);
                }
                int i8 = result.gender;
                if (i8 != 0) {
                    if (i8 == 1) {
                        passportActivity.currentGender = "male";
                        passportActivity.inputFields[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i8 == 2) {
                        passportActivity.currentGender = "female";
                        passportActivity.inputFields[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str = result.nationality;
                    passportActivity.currentCitizeship = str;
                    String str2 = (String) passportActivity.languageMap.get(str);
                    if (str2 != null) {
                        passportActivity.inputFields[5].setText(str2);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str3 = result.issuingCountry;
                    passportActivity.currentResidence = str3;
                    String str4 = (String) passportActivity.languageMap.get(str3);
                    if (str4 != null) {
                        passportActivity.inputFields[6].setText(str4);
                    }
                }
                int i9 = result.birthDay;
                if (i9 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    passportActivity.inputFields[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i9), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i10 = result.expiryDay;
                if (i10 > 0 && (i = result.expiryMonth) > 0 && (i2 = result.expiryYear) > 0) {
                    int[] iArr = passportActivity.currentExpireDate;
                    iArr[0] = i2;
                    iArr[1] = i;
                    iArr[2] = i10;
                    passportActivity.inputFields[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                int[] iArr2 = passportActivity.currentExpireDate;
                iArr2[2] = 0;
                iArr2[1] = 0;
                iArr2[0] = 0;
                passportActivity.inputFields[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
            }

            public void setNeedActivityResult(boolean z) {
                this.needActivityResult = z;
            }

            static class ProgressView extends View {
                private Paint paint;
                private Paint paint2;
                private float progress;

                public ProgressView(Context context) {
                    super(context);
                    this.paint = new Paint();
                    this.paint2 = new Paint();
                    this.paint.setColor(Theme.getColor(Theme.key_login_progressInner));
                    this.paint2.setColor(Theme.getColor(Theme.key_login_progressOuter));
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

                public static void $r8$lambda$mNLGj_ZSSCgQ8GzzAPD9zg820oo(TLObject tLObject, TLRPC.TL_error tL_error) {
                }

                @Override
                public boolean needBackButton() {
                    return true;
                }

                static int access$10526(PhoneConfirmationView phoneConfirmationView, double d) {
                    int i = (int) (((double) phoneConfirmationView.time) - d);
                    phoneConfirmationView.time = i;
                    return i;
                }

                static int access$9926(PhoneConfirmationView phoneConfirmationView, double d) {
                    int i = (int) (((double) phoneConfirmationView.codeTime) - d);
                    phoneConfirmationView.codeTime = i;
                    return i;
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
                    textView.setTextColor(Theme.getColor(i2));
                    this.confirmTextView.setTextSize(1, 14.0f);
                    this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    TextView textView2 = new TextView(context);
                    this.titleTextView = textView2;
                    int i3 = Theme.key_windowBackgroundWhiteBlackText;
                    textView2.setTextColor(Theme.getColor(i3));
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
                        imageView.setImageResource(R.drawable.phone_activate);
                        boolean z = LocaleController.isRTL;
                        if (z) {
                            frameLayout.addView(imageView, LayoutHelper.createFrame(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                            frameLayout.addView(this.confirmTextView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
                        } else {
                            frameLayout.addView(this.confirmTextView, LayoutHelper.createFrame(-1, -2.0f, z ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                            frameLayout.addView(imageView, LayoutHelper.createFrame(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
                        }
                        f = 2.0f;
                    } else {
                        this.confirmTextView.setGravity(49);
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        addView(frameLayout2, LayoutHelper.createLinear(-2, -2, 49));
                        if (this.verificationType == 1) {
                            ImageView imageView2 = new ImageView(context);
                            this.blackImageView = imageView2;
                            imageView2.setImageResource(R.drawable.sms_devices);
                            ImageView imageView3 = this.blackImageView;
                            int color = Theme.getColor(i3);
                            f = 2.0f;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            imageView3.setColorFilter(new PorterDuffColorFilter(color, mode));
                            frameLayout2.addView(this.blackImageView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            ImageView imageView4 = new ImageView(context);
                            this.blueImageView = imageView4;
                            imageView4.setImageResource(R.drawable.sms_bubble);
                            this.blueImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_actionBackground), mode));
                            frameLayout2.addView(this.blueImageView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            this.titleTextView.setText(LocaleController.getString(R.string.SentAppCodeTitle));
                        } else {
                            f = 2.0f;
                            ImageView imageView5 = new ImageView(context);
                            this.blueImageView = imageView5;
                            imageView5.setImageResource(R.drawable.sms_code);
                            this.blueImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_actionBackground), PorterDuff.Mode.MULTIPLY));
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
                        protected void onMeasure(int i4, int i5) {
                            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                        }
                    };
                    this.timeText = textView3;
                    textView3.setTextColor(Theme.getColor(i2));
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
                        protected void onMeasure(int i4, int i5) {
                            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                        }
                    };
                    this.problemText = textView4;
                    textView4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
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
                    this.problemText.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            PassportActivity.PhoneConfirmationView.$r8$lambda$nxhTgmgFCRvSxXdZzI5tJYwBDsQ(this.f$0, view);
                        }
                    });
                }

                public static void $r8$lambda$nxhTgmgFCRvSxXdZzI5tJYwBDsQ(PhoneConfirmationView phoneConfirmationView, View view) {
                    if (phoneConfirmationView.nextPressed) {
                        return;
                    }
                    int i = phoneConfirmationView.nextType;
                    if ((i != 4 || phoneConfirmationView.verificationType != 2) && i != 0) {
                        phoneConfirmationView.resendCode();
                        return;
                    }
                    try {
                        PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                        String str = String.format(Locale.US, "%s (%d)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.parse("mailto:"));
                        intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                        intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str + " " + phoneConfirmationView.phone);
                        intent.putExtra("android.intent.extra.TEXT", "Phone: " + phoneConfirmationView.phone + "\nApp version: " + str + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + phoneConfirmationView.lastError);
                        phoneConfirmationView.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                    } catch (Exception unused) {
                        AlertsCreator.showSimpleAlert(PassportActivity.this, LocaleController.getString(R.string.NoMailInstalled));
                    }
                }

                @Override
                protected void onMeasure(int i, int i2) {
                    ImageView imageView;
                    super.onMeasure(i, i2);
                    if (this.verificationType == 3 || (imageView = this.blueImageView) == null) {
                        return;
                    }
                    int measuredHeight = imageView.getMeasuredHeight() + this.titleTextView.getMeasuredHeight() + this.confirmTextView.getMeasuredHeight() + AndroidUtilities.dp(35.0f);
                    int iDp = AndroidUtilities.dp(80.0f);
                    int iDp2 = AndroidUtilities.dp(291.0f);
                    if (PassportActivity.this.scrollHeight - measuredHeight >= iDp) {
                        setMeasuredDimension(getMeasuredWidth(), Math.min(PassportActivity.this.scrollHeight, iDp2));
                    } else {
                        setMeasuredDimension(getMeasuredWidth(), measuredHeight + iDp);
                    }
                }

                @Override
                protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
                    int i6 = (((i5 - bottom) - measuredHeight4) / 2) + bottom;
                    LinearLayout linearLayout = this.codeFieldContainer;
                    linearLayout.layout(linearLayout.getLeft(), i6, this.codeFieldContainer.getRight(), measuredHeight4 + i6);
                }

                public void resendCode() {
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", this.phone);
                    this.nextPressed = true;
                    PassportActivity.this.needShowProgress();
                    final TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = this.phone;
                    tL_auth_resendCode.phone_code_hash = this.phoneHash;
                    ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            PassportActivity.PhoneConfirmationView.$r8$lambda$RZ_jBQmf1ECDh60XdNydqyVy5pM(this.f$0, bundle, tL_auth_resendCode, tLObject, tL_error);
                        }
                    }, 2);
                }

                public static void $r8$lambda$RZ_jBQmf1ECDh60XdNydqyVy5pM(final PhoneConfirmationView phoneConfirmationView, final Bundle bundle, final TLRPC.TL_auth_resendCode tL_auth_resendCode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    phoneConfirmationView.getClass();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.PhoneConfirmationView.$r8$lambda$RhiVe6euPle_BdhJty4Lkq2WKyU(this.f$0, tL_error, bundle, tLObject, tL_auth_resendCode);
                        }
                    });
                }

                public static void $r8$lambda$RhiVe6euPle_BdhJty4Lkq2WKyU(final PhoneConfirmationView phoneConfirmationView, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
                    phoneConfirmationView.nextPressed = false;
                    if (tL_error == null) {
                        PassportActivity.this.fillNextCodeParams(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                    } else {
                        AlertDialog alertDialog = (AlertDialog) AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tL_error, PassportActivity.this, tL_auth_resendCode, new Object[0]);
                        if (alertDialog != null && tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            alertDialog.setPositiveButtonListener(new AlertDialog.OnButtonClickListener() {
                                @Override
                                public final void onClick(AlertDialog alertDialog2, int i) {
                                    PassportActivity.PhoneConfirmationView.$r8$lambda$5PvHzHnQpFk7W98qk0cpA4PAyUM(this.f$0, alertDialog2, i);
                                }
                            });
                        }
                    }
                    PassportActivity.this.needHideProgress();
                }

                public static void $r8$lambda$5PvHzHnQpFk7W98qk0cpA4PAyUM(PhoneConfirmationView phoneConfirmationView, AlertDialog alertDialog, int i) {
                    phoneConfirmationView.onBackPressed(true);
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
                            editTextBoldCursor.setTextColor(Theme.getColor(i8));
                            this.codeField[i7].setCursorColor(Theme.getColor(i8));
                            this.codeField[i7].setCursorSize(AndroidUtilities.dp(20.0f));
                            this.codeField[i7].setCursorWidth(1.5f);
                            Drawable drawableMutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated), PorterDuff.Mode.MULTIPLY));
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
                                public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
                                }

                                @Override
                                public void afterTextChanged(Editable editable) {
                                    int length;
                                    if (!PhoneConfirmationView.this.ignoreOnTextChange && (length = editable.length()) >= 1) {
                                        if (length > 1) {
                                            String string = editable.toString();
                                            PhoneConfirmationView.this.ignoreOnTextChange = true;
                                            for (int i9 = 0; i9 < Math.min(PhoneConfirmationView.this.length - i7, length); i9++) {
                                                if (i9 != 0) {
                                                    PhoneConfirmationView.this.codeField[i7 + i9].setText(string.substring(i9, i9 + 1));
                                                } else {
                                                    editable.replace(0, length, string.substring(i9, i9 + 1));
                                                }
                                            }
                                            PhoneConfirmationView.this.ignoreOnTextChange = false;
                                        }
                                        if (i7 != PhoneConfirmationView.this.length - 1) {
                                            PhoneConfirmationView.this.codeField[i7 + 1].setSelection(PhoneConfirmationView.this.codeField[i7 + 1].length());
                                            PhoneConfirmationView.this.codeField[i7 + 1].requestFocus();
                                        }
                                        if ((i7 == PhoneConfirmationView.this.length - 1 || (i7 == PhoneConfirmationView.this.length - 2 && length >= 2)) && PhoneConfirmationView.this.getCode().length() == PhoneConfirmationView.this.length) {
                                            PhoneConfirmationView.this.onNextPressed(null);
                                        }
                                    }
                                }
                            });
                            this.codeField[i7].setOnKeyListener(new View.OnKeyListener() {
                                @Override
                                public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
                                    return PassportActivity.PhoneConfirmationView.$r8$lambda$J2UHHzqdoZlW_PZ0U3qBtLfUwvQ(this.f$0, i7, view, i9, keyEvent);
                                }
                            });
                            this.codeField[i7].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                                @Override
                                public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
                                    return PassportActivity.PhoneConfirmationView.$r8$lambda$0aNdxWbwjMCYMe3F5NwvqLG63y8(this.f$0, textView, i9, keyEvent);
                                }
                            });
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
                    String str = PhoneFormat.getInstance().format("+" + this.phone);
                    int i9 = this.verificationType;
                    if (i9 == 2) {
                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(str)));
                    } else if (i9 == 3) {
                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(str)));
                    } else if (i9 == 4) {
                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(str)));
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
                    if (i10 == 4 && this.nextType == 2) {
                        this.timeText.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
                        this.problemText.setVisibility(this.time < 1000 ? 0 : 8);
                        this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                        createTimer();
                        return;
                    }
                    this.timeText.setVisibility(8);
                    this.problemText.setVisibility(8);
                    createCodeTimer();
                }

                public static boolean $r8$lambda$J2UHHzqdoZlW_PZ0U3qBtLfUwvQ(PhoneConfirmationView phoneConfirmationView, int i, View view, int i2, KeyEvent keyEvent) {
                    if (i2 != 67) {
                        phoneConfirmationView.getClass();
                        return false;
                    }
                    if (phoneConfirmationView.codeField[i].length() != 0 || i <= 0) {
                        return false;
                    }
                    int i3 = i - 1;
                    EditTextBoldCursor editTextBoldCursor = phoneConfirmationView.codeField[i3];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    phoneConfirmationView.codeField[i3].requestFocus();
                    phoneConfirmationView.codeField[i3].dispatchKeyEvent(keyEvent);
                    return true;
                }

                public static boolean $r8$lambda$0aNdxWbwjMCYMe3F5NwvqLG63y8(PhoneConfirmationView phoneConfirmationView, TextView textView, int i, KeyEvent keyEvent) {
                    if (i == 5) {
                        phoneConfirmationView.onNextPressed(null);
                        return true;
                    }
                    phoneConfirmationView.getClass();
                    return false;
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

                class AnonymousClass4 extends TimerTask {
                    AnonymousClass4() {
                    }

                    @Override
                    public void run() {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                PassportActivity.PhoneConfirmationView.AnonymousClass4.$r8$lambda$gnT_mDqJlxpjV1OfVrGZWf8JBLA(this.f$0);
                            }
                        });
                    }

                    public static void $r8$lambda$gnT_mDqJlxpjV1OfVrGZWf8JBLA(AnonymousClass4 anonymousClass4) {
                        anonymousClass4.getClass();
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

                private void createTimer() {
                    if (this.timeTimer != null) {
                        return;
                    }
                    Timer timer = new Timer();
                    this.timeTimer = timer;
                    timer.schedule(new AnonymousClass5(), 0L, 1000L);
                }

                class AnonymousClass5 extends TimerTask {
                    AnonymousClass5() {
                    }

                    @Override
                    public void run() {
                        if (PhoneConfirmationView.this.timeTimer == null) {
                            return;
                        }
                        double dCurrentTimeMillis = System.currentTimeMillis();
                        PhoneConfirmationView.access$10526(PhoneConfirmationView.this, dCurrentTimeMillis - PhoneConfirmationView.this.lastCurrentTime);
                        PhoneConfirmationView.this.lastCurrentTime = dCurrentTimeMillis;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                PassportActivity.PhoneConfirmationView.AnonymousClass5.$r8$lambda$ZEh9Ax4BCrJ2uSPp3St0zDadDsc(this.f$0);
                            }
                        });
                    }

                    public static void $r8$lambda$ZEh9Ax4BCrJ2uSPp3St0zDadDsc(final AnonymousClass5 anonymousClass5) {
                        if (PhoneConfirmationView.this.time >= 1000) {
                            int i = (PhoneConfirmationView.this.time / 1000) / 60;
                            int i2 = (PhoneConfirmationView.this.time / 1000) - (i * 60);
                            if (PhoneConfirmationView.this.nextType == 4 || PhoneConfirmationView.this.nextType == 3) {
                                PhoneConfirmationView.this.timeText.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i), Integer.valueOf(i2)));
                            } else if (PhoneConfirmationView.this.nextType == 2) {
                                PhoneConfirmationView.this.timeText.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i), Integer.valueOf(i2)));
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
                        if (PhoneConfirmationView.this.verificationType != 3) {
                            if (PhoneConfirmationView.this.verificationType == 2 || PhoneConfirmationView.this.verificationType == 4) {
                                if (PhoneConfirmationView.this.nextType == 4 || PhoneConfirmationView.this.nextType == 2) {
                                    if (PhoneConfirmationView.this.nextType == 4) {
                                        PhoneConfirmationView.this.timeText.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        PhoneConfirmationView.this.timeText.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    PhoneConfirmationView.this.createCodeTimer();
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = PhoneConfirmationView.this.phone;
                                    tL_auth_resendCode.phone_code_hash = PhoneConfirmationView.this.phoneHash;
                                    ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                                        @Override
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            PassportActivity.PhoneConfirmationView.AnonymousClass5.$r8$lambda$rtxMoCPIXiUmwq0FfNIngwPs_D0(this.f$0, tLObject, tL_error);
                                        }
                                    }, 2);
                                    return;
                                }
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
                            return;
                        }
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(PhoneConfirmationView.this, NotificationCenter.didReceiveCall);
                        PhoneConfirmationView.this.waitingForEvent = false;
                        PhoneConfirmationView.this.destroyCodeTimer();
                        PhoneConfirmationView.this.resendCode();
                    }

                    public static void $r8$lambda$rtxMoCPIXiUmwq0FfNIngwPs_D0(final AnonymousClass5 anonymousClass5, TLObject tLObject, final TLRPC.TL_error tL_error) {
                        anonymousClass5.getClass();
                        if (tL_error == null || tL_error.text == null) {
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                PassportActivity.PhoneConfirmationView.this.lastError = tL_error.text;
                            }
                        });
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
                        if (i < editTextBoldCursorArr.length) {
                            sb.append(PhoneFormat.stripExceptNumbers(editTextBoldCursorArr[i].getText().toString()));
                            i++;
                        } else {
                            return sb.toString();
                        }
                    }
                }

                @Override
                public void onNextPressed(String str) {
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
                    final TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
                    verifyphone.phone_number = this.phone;
                    verifyphone.phone_code = str;
                    verifyphone.phone_code_hash = this.phoneHash;
                    destroyTimer();
                    PassportActivity.this.needShowProgress();
                    ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(verifyphone, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            PassportActivity.PhoneConfirmationView.$r8$lambda$OtZbL3pMIsdVMuXFRgkqJfCfHFE(this.f$0, verifyphone, tLObject, tL_error);
                        }
                    }, 2);
                }

                public static void $r8$lambda$OtZbL3pMIsdVMuXFRgkqJfCfHFE(final PhoneConfirmationView phoneConfirmationView, final TL_account.verifyPhone verifyphone, TLObject tLObject, final TLRPC.TL_error tL_error) {
                    phoneConfirmationView.getClass();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PassportActivity.PhoneConfirmationView.m3622$r8$lambda$0GndYJyYFGo8E2KmIOTA_ILeNo(this.f$0, tL_error, verifyphone);
                        }
                    });
                }

                public static void m3622$r8$lambda$0GndYJyYFGo8E2KmIOTA_ILeNo(PhoneConfirmationView phoneConfirmationView, TLRPC.TL_error tL_error, TL_account.verifyPhone verifyphone) {
                    int i;
                    int i2;
                    PassportActivity.this.needHideProgress();
                    phoneConfirmationView.nextPressed = false;
                    if (tL_error == null) {
                        phoneConfirmationView.destroyTimer();
                        phoneConfirmationView.destroyCodeTimer();
                        PassportActivityDelegate passportActivityDelegate = PassportActivity.this.delegate;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType = PassportActivity.this.currentType;
                        String str = (String) PassportActivity.this.currentValues.get("phone");
                        final PassportActivity passportActivity = PassportActivity.this;
                        passportActivityDelegate.saveValue(tL_secureRequiredType, str, null, null, null, null, null, null, null, null, new Runnable() {
                            @Override
                            public final void run() {
                                passportActivity.finishFragment();
                            }
                        }, null);
                        return;
                    }
                    phoneConfirmationView.lastError = tL_error.text;
                    int i3 = phoneConfirmationView.verificationType;
                    if ((i3 == 3 && ((i2 = phoneConfirmationView.nextType) == 4 || i2 == 2)) || ((i3 == 2 && ((i = phoneConfirmationView.nextType) == 4 || i == 3)) || (i3 == 4 && phoneConfirmationView.nextType == 2))) {
                        phoneConfirmationView.createTimer();
                    }
                    int i4 = phoneConfirmationView.verificationType;
                    if (i4 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(phoneConfirmationView, NotificationCenter.didReceiveSmsCode);
                    } else if (i4 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(phoneConfirmationView, NotificationCenter.didReceiveCall);
                    }
                    phoneConfirmationView.waitingForEvent = true;
                    if (phoneConfirmationView.verificationType != 3) {
                        AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tL_error, PassportActivity.this, verifyphone, new Object[0]);
                    }
                    PassportActivity.this.showEditDoneProgress(true, false);
                    if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            phoneConfirmationView.onBackPressed(true);
                            PassportActivity.this.setPage(0, true, null);
                            return;
                        }
                        return;
                    }
                    int i5 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = phoneConfirmationView.codeField;
                        if (i5 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i5].setText("");
                            i5++;
                        } else {
                            editTextBoldCursorArr[0].requestFocus();
                            return;
                        }
                    }
                }

                @Override
                public boolean onBackPressed(boolean z) {
                    if (!z) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(PassportActivity.this.getParentActivity());
                        builder.setTitle(LocaleController.getString(R.string.AppName));
                        builder.setMessage(LocaleController.getString(R.string.StopVerification));
                        builder.setPositiveButton(LocaleController.getString(R.string.Continue), null);
                        builder.setNegativeButton(LocaleController.getString(R.string.Stop), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i) {
                                PassportActivity.PhoneConfirmationView.m3623$r8$lambda$Yl8nc1rFr779tNbf8jJyD3qH80(this.f$0, alertDialog, i);
                            }
                        });
                        PassportActivity.this.showDialog(builder.create());
                        return false;
                    }
                    TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
                    tL_auth_cancelCode.phone_number = this.phone;
                    tL_auth_cancelCode.phone_code_hash = this.phoneHash;
                    ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tL_auth_cancelCode, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            PassportActivity.PhoneConfirmationView.$r8$lambda$mNLGj_ZSSCgQ8GzzAPD9zg820oo(tLObject, tL_error);
                        }
                    }, 2);
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

                public static void m3623$r8$lambda$Yl8nc1rFr779tNbf8jJyD3qH80(PhoneConfirmationView phoneConfirmationView, AlertDialog alertDialog, int i) {
                    phoneConfirmationView.onBackPressed(true);
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
                public void didReceivedNotification(int i, int i2, Object... objArr) {
                    EditTextBoldCursor[] editTextBoldCursorArr;
                    if (!this.waitingForEvent || (editTextBoldCursorArr = this.codeField) == null) {
                        return;
                    }
                    if (i == NotificationCenter.didReceiveSmsCode) {
                        editTextBoldCursorArr[0].setText("" + objArr[0]);
                        onNextPressed(null);
                        return;
                    }
                    if (i == NotificationCenter.didReceiveCall) {
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

            @Override
            public ArrayList getThemeDescriptions() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
                ActionBar actionBar = this.actionBar;
                int i = ThemeDescription.FLAG_BACKGROUND;
                int i2 = Theme.key_actionBarDefault;
                arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
                arrayList.add(new ThemeDescription(this.scrollView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
                arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
                arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
                arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
                arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, Theme.key_actionBarDefaultSearch));
                arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
                arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
                View view = this.extraBackgroundView;
                int i3 = ThemeDescription.FLAG_BACKGROUND;
                int i4 = Theme.key_windowBackgroundWhite;
                arrayList.add(new ThemeDescription(view, i3, null, null, null, null, i4));
                if (this.extraBackgroundView2 != null) {
                    arrayList.add(new ThemeDescription(this.extraBackgroundView2, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i4));
                }
                for (int i5 = 0; i5 < this.dividers.size(); i5++) {
                    arrayList.add(new ThemeDescription((View) this.dividers.get(i5), ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_divider));
                }
                Iterator it = this.documentsCells.entrySet().iterator();
                while (it.hasNext()) {
                    SecureDocumentCell secureDocumentCell = (SecureDocumentCell) ((Map.Entry) it.next()).getValue();
                    arrayList.add(new ThemeDescription(secureDocumentCell, ThemeDescription.FLAG_SELECTORWHITE, new Class[]{SecureDocumentCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
                    arrayList.add(new ThemeDescription(secureDocumentCell, 0, new Class[]{SecureDocumentCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
                    arrayList.add(new ThemeDescription(secureDocumentCell, 0, new Class[]{SecureDocumentCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
                }
                int i6 = Theme.key_windowBackgroundWhite;
                arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_SELECTORWHITE, new Class[]{TextDetailSettingsCell.class}, null, null, null, i6));
                int i7 = Theme.key_windowBackgroundWhiteBlackText;
                arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
                int i8 = Theme.key_windowBackgroundWhiteGrayText2;
                arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i8));
                arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_SELECTORWHITE, new Class[]{TextSettingsCell.class}, null, null, null, i6));
                arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
                arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
                int i9 = Theme.key_windowBackgroundGrayShadow;
                arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i9));
                arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_SELECTORWHITE, new Class[]{TextDetailSecureCell.class}, null, null, null, i6));
                arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextDetailSecureCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
                arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextDetailSecureCell.class}, null, null, null, Theme.key_divider));
                arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextDetailSecureCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i8));
                arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{TextDetailSecureCell.class}, new String[]{"checkImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addedIcon));
                arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class}, null, null, null, i6));
                int i10 = Theme.key_windowBackgroundWhiteBlueHeader;
                arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
                arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i9));
                arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
                if (this.inputFields != null) {
                    for (int i11 = 0; i11 < this.inputFields.length; i11++) {
                        arrayList.add(new ThemeDescription((View) this.inputFields[i11].getParent(), ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
                        arrayList.add(new ThemeDescription(this.inputFields[i11], ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
                        arrayList.add(new ThemeDescription(this.inputFields[i11], ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
                        arrayList.add(new ThemeDescription(this.inputFields[i11], ThemeDescription.FLAG_HINTTEXTCOLOR | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_windowBackgroundWhiteBlueHeader));
                        arrayList.add(new ThemeDescription(this.inputFields[i11], ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
                        arrayList.add(new ThemeDescription(this.inputFields[i11], ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
                        arrayList.add(new ThemeDescription(this.inputFields[i11], ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_text_RedRegular));
                    }
                } else {
                    arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i7));
                    arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
                    arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_HINTTEXTCOLOR | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, i10));
                    arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
                    arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
                    arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_text_RedRegular));
                }
                if (this.inputExtraFields != null) {
                    for (int i12 = 0; i12 < this.inputExtraFields.length; i12++) {
                        arrayList.add(new ThemeDescription((View) this.inputExtraFields[i12].getParent(), ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
                        arrayList.add(new ThemeDescription(this.inputExtraFields[i12], ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
                        arrayList.add(new ThemeDescription(this.inputExtraFields[i12], ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
                        arrayList.add(new ThemeDescription(this.inputExtraFields[i12], ThemeDescription.FLAG_HINTTEXTCOLOR | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_windowBackgroundWhiteBlueHeader));
                        arrayList.add(new ThemeDescription(this.inputExtraFields[i12], ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
                        arrayList.add(new ThemeDescription(this.inputExtraFields[i12], ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
                        arrayList.add(new ThemeDescription(this.inputExtraFields[i12], ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_text_RedRegular));
                    }
                }
                arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_progressCircle));
                arrayList.add(new ThemeDescription(this.noPasswordImageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_chat_messagePanelIcons));
                arrayList.add(new ThemeDescription(this.noPasswordTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText4));
                arrayList.add(new ThemeDescription(this.noPasswordSetTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlueText5));
                TextView textView = this.passwordForgotButton;
                int i13 = ThemeDescription.FLAG_TEXTCOLOR;
                int i14 = Theme.key_windowBackgroundWhiteBlueText4;
                arrayList.add(new ThemeDescription(textView, i13, null, null, null, null, i14));
                arrayList.add(new ThemeDescription(this.plusTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
                arrayList.add(new ThemeDescription(this.acceptTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_passport_authorizeText));
                arrayList.add(new ThemeDescription(this.bottomLayout, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_passport_authorizeBackground));
                arrayList.add(new ThemeDescription(this.bottomLayout, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_passport_authorizeBackgroundSelected));
                ContextProgressView contextProgressView = this.progressView;
                int i15 = Theme.key_contextProgressInner2;
                arrayList.add(new ThemeDescription(contextProgressView, 0, null, null, null, null, i15));
                ContextProgressView contextProgressView2 = this.progressView;
                int i16 = Theme.key_contextProgressOuter2;
                arrayList.add(new ThemeDescription(contextProgressView2, 0, null, null, null, null, i16));
                arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, i15));
                arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, i16));
                arrayList.add(new ThemeDescription(this.emptyImageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_sessions_devicesImage));
                TextView textView2 = this.emptyTextView1;
                int i17 = ThemeDescription.FLAG_TEXTCOLOR;
                int i18 = Theme.key_windowBackgroundWhiteGrayText2;
                arrayList.add(new ThemeDescription(textView2, i17, null, null, null, null, i18));
                arrayList.add(new ThemeDescription(this.emptyTextView2, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i18));
                arrayList.add(new ThemeDescription(this.emptyTextView3, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i14));
                return arrayList;
            }
        }
