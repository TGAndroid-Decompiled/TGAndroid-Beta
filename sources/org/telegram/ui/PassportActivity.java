package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import android.view.KeyEvent;
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
import com.google.android.gms.cast.framework.media.zzq;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
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
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
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
import org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.HintEditText;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.SlideView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.web.MHTML;

public final class PassportActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public TextView acceptTextView;
    public TextSettingsCell addDocumentCell;
    public ShadowSectionCell addDocumentSectionCell;
    public boolean allowNonLatinName;
    public ArrayList availableDocumentTypes;
    public TextInfoPrivacyCell bottomCell;
    public TextInfoPrivacyCell bottomCellTranslation;
    public FrameLayout bottomLayout;
    public boolean callbackCalled;
    public ChatAttachAlert chatAttachAlert;
    public final HashMap codesMap;
    public final ArrayList countriesArray;
    public final HashMap countriesMap;
    public final int currentActivityType;
    public long currentBotId;
    public final String currentCallbackUrl;
    public String currentCitizeship;
    public final HashMap currentDocumentValues;
    public TLRPC.TL_secureRequiredType currentDocumentsType;
    public final TLRPC.TL_secureValue currentDocumentsTypeValue;
    public String currentEmail;
    public final int[] currentExpireDate;
    public TL_account.authorizationForm currentForm;
    public String currentGender;
    public final String currentNonce;
    public TL_account.Password currentPassword;
    public final String currentPayload;
    public TLRPC.TL_auth_sentCode currentPhoneVerification;
    public LinearLayout currentPhotoViewerLayout;
    public String currentPicturePath;
    public final String currentPublicKey;
    public String currentResidence;
    public final String currentScope;
    public final TLRPC.TL_secureRequiredType currentType;
    public final TLRPC.TL_secureValue currentTypeValue;
    public final HashMap currentValues;
    public int currentViewNum;
    public PassportActivityDelegate delegate;
    public TextSettingsCell deletePassportCell;
    public final ArrayList dividers;
    public boolean documentOnly;
    public final ArrayList documents;
    public final HashMap documentsCells;
    public HashMap documentsErrors;
    public LinearLayout documentsLayout;
    public final HashMap documentsToTypesLink;
    public ActionBarMenuItem doneItem;
    public AnimatorSet doneItemAnimation;
    public int emailCodeLength;
    public ImageView emptyImageView;
    public LinearLayout emptyLayout;
    public TextView emptyTextView1;
    public TextView emptyTextView2;
    public TextView emptyTextView3;
    public EmptyTextProgressView emptyView;
    public final HashMap errorsMap;
    public final HashMap errorsValues;
    public View extraBackgroundView;
    public View extraBackgroundView2;
    public HashMap fieldsErrors;
    public SecureDocument frontDocument;
    public LinearLayout frontLayout;
    public HeaderCell headerCell;
    public boolean ignoreOnFailure;
    public boolean ignoreOnPhoneChange;
    public boolean ignoreOnTextChange;
    public String initialValues;
    public EditTextBoldCursor[] inputExtraFields;
    public ViewGroup[] inputFieldContainers;
    public EditTextBoldCursor[] inputFields;
    public HashMap languageMap;
    public LinearLayout linearLayout2;
    public final HashMap mainErrorsMap;
    public TextInfoPrivacyCell nativeInfoCell;
    public boolean needActivityResult;
    public String noAllDocumentsErrorText;
    public String noAllTranslationErrorText;
    public ImageView noPasswordImageView;
    public TextView noPasswordSetTextView;
    public TextView noPasswordTextView;
    public final boolean[] nonLatinNames;
    public FrameLayout passwordAvatarContainer;
    public TextView passwordForgotButton;
    public TextInfoPrivacyCell passwordInfoRequestTextView;
    public TextInfoPrivacyCell passwordRequestTextView;
    public PassportActivityDelegate pendingDelegate;
    public PhotoViewer.AnonymousClass14 pendingErrorRunnable;
    public PhotoViewer$$ExternalSyntheticLambda21 pendingFinishRunnable;
    public String pendingPhone;
    public Dialog permissionsDialog;
    public final ArrayList permissionsItems;
    public final HashMap phoneFormatMap;
    public TextView plusTextView;
    public PassportActivity presentAfterAnimation;
    public AlertDialog progressDialog;
    public ContextProgressView progressView;
    public ContextProgressView progressViewButton;
    public final AnonymousClass1 provider;
    public SecureDocument reverseDocument;
    public LinearLayout reverseLayout;
    public byte[] saltedPassword;
    public final byte[] savedPasswordHash;
    public final byte[] savedSaltedPassword;
    public TextSettingsCell scanDocumentCell;
    public int scrollHeight;
    public ScrollView scrollView;
    public ShadowSectionCell sectionCell;
    public ShadowSectionCell sectionCell2;
    public byte[] secureSecret;
    public long secureSecretId;
    public SecureDocument selfieDocument;
    public LinearLayout selfieLayout;
    public TextInfoPrivacyCell topErrorCell;
    public final ArrayList translationDocuments;
    public LinearLayout translationLayout;
    public final HashMap typesValues;
    public final HashMap typesViews;
    public TextSettingsCell uploadDocumentCell;
    public TextDetailSettingsCell uploadFrontCell;
    public TextDetailSettingsCell uploadReverseCell;
    public TextDetailSettingsCell uploadSelfieCell;
    public TextSettingsCell uploadTranslationCell;
    public final HashMap uploadingDocuments;
    public int uploadingFileType;
    public boolean useCurrentValue;
    public int usingSavedPassword;
    public final SlideView[] views;

    public final class AnonymousClass10 implements TextWatcher {
        public final int $r8$classId;
        public int actionPosition;
        public int characterAction;
        public final Object this$0;

        public AnonymousClass10(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.characterAction = -1;
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            int i;
            int i2;
            int length;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            switch (this.$r8$classId) {
                case 0:
                    PassportActivity passportActivity = (PassportActivity) this.this$0;
                    if (!passportActivity.ignoreOnPhoneChange) {
                        HintEditText hintEditText = (HintEditText) passportActivity.inputFields[2];
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
                        passportActivity.ignoreOnPhoneChange = true;
                        String hintText = hintEditText.getHintText();
                        if (hintText != null) {
                            int i11 = 0;
                            while (i11 < sb.length()) {
                                if (i11 < hintText.length()) {
                                    if (hintText.charAt(i11) == ' ') {
                                        sb.insert(i11, ' ');
                                        i11++;
                                        if (selectionStart == i11 && (i2 = this.characterAction) != 2 && i2 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i11++;
                                } else {
                                    sb.insert(i11, ' ');
                                    if (selectionStart == i11 + 1 && (i = this.characterAction) != 2 && i != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                        hintEditText.setText(sb);
                        if (selectionStart >= 0) {
                            hintEditText.setSelection(Math.min(selectionStart, hintEditText.length()));
                        }
                        hintEditText.invalidate();
                        passportActivity.ignoreOnPhoneChange = false;
                        break;
                    }
                    break;
                case 1:
                    CodeFieldContainer codeFieldContainer = (CodeFieldContainer) this.this$0;
                    if (!codeFieldContainer.ignoreOnTextChange && (length = editable.length()) >= 1) {
                        int i12 = this.actionPosition;
                        int i13 = this.characterAction;
                        if (length > 1) {
                            String string2 = editable.toString();
                            codeFieldContainer.ignoreOnTextChange = true;
                            int i14 = i13;
                            for (int i15 = 0; i15 < Math.min(i12 - i13, length); i15++) {
                                if (i15 == 0) {
                                    editable.replace(0, length, string2.substring(i15, i15 + 1));
                                } else {
                                    i14++;
                                    int i16 = i13 + i15;
                                    CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                                    if (i16 < codeNumberFieldArr.length) {
                                        codeNumberFieldArr[i16].setText(string2.substring(i15, i15 + 1));
                                    }
                                }
                            }
                            codeFieldContainer.ignoreOnTextChange = false;
                            i13 = i14;
                        }
                        int i17 = i13 + 1;
                        if (i17 >= 0) {
                            CodeNumberField[] codeNumberFieldArr2 = codeFieldContainer.codeField;
                            if (i17 < codeNumberFieldArr2.length) {
                                CodeNumberField codeNumberField = codeNumberFieldArr2[i17];
                                codeNumberField.setSelection(codeNumberField.length());
                                codeFieldContainer.codeField[i17].requestFocus();
                            }
                        }
                        if ((i13 == i12 - 1 || (i13 == i12 - 2 && length >= 2)) && codeFieldContainer.getCode().length() == i12) {
                            codeFieldContainer.processNextPressed();
                        }
                    }
                    break;
                case 2:
                    LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) this.this$0;
                    if (!phoneView.ignoreOnPhoneChange) {
                        LoginActivity.PhoneView.AnonymousClass3 anonymousClass3 = phoneView.phoneField;
                        int selectionStart2 = anonymousClass3.getSelectionStart();
                        String string3 = anonymousClass3.getText().toString();
                        if (this.characterAction == 3) {
                            string3 = string3.substring(0, this.actionPosition) + string3.substring(this.actionPosition + 1);
                            selectionStart2--;
                        }
                        StringBuilder sb2 = new StringBuilder(string3.length());
                        int i18 = 0;
                        while (i18 < string3.length()) {
                            int i19 = i18 + 1;
                            String strSubstring2 = string3.substring(i18, i19);
                            if ("0123456789".contains(strSubstring2)) {
                                sb2.append(strSubstring2);
                            }
                            i18 = i19;
                        }
                        phoneView.ignoreOnPhoneChange = true;
                        String hintText2 = anonymousClass3.getHintText();
                        if (hintText2 != null) {
                            int i20 = 0;
                            while (i20 < sb2.length()) {
                                if (i20 < hintText2.length()) {
                                    if (hintText2.charAt(i20) == ' ') {
                                        sb2.insert(i20, ' ');
                                        i20++;
                                        if (selectionStart2 == i20 && (i4 = this.characterAction) != 2 && i4 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i20++;
                                } else {
                                    sb2.insert(i20, ' ');
                                    if (selectionStart2 == i20 + 1 && (i3 = this.characterAction) != 2 && i3 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                        editable.replace(0, editable.length(), sb2);
                        if (selectionStart2 >= 0) {
                            anonymousClass3.setSelection(Math.min(selectionStart2, anonymousClass3.length()));
                        }
                        anonymousClass3.invalidate();
                        phoneView.invalidateCountryHint();
                        phoneView.ignoreOnPhoneChange = false;
                        break;
                    }
                    break;
                case 3:
                    NewContactBottomSheet newContactBottomSheet = (NewContactBottomSheet) this.this$0;
                    if (!newContactBottomSheet.ignoreOnPhoneChange) {
                        int selectionStart3 = newContactBottomSheet.phoneField.getSelectionStart();
                        String string4 = newContactBottomSheet.phoneField.getText().toString();
                        if (this.characterAction == 3) {
                            string4 = string4.substring(0, this.actionPosition) + string4.substring(this.actionPosition + 1);
                            selectionStart3--;
                        }
                        StringBuilder sb3 = new StringBuilder(string4.length());
                        int i21 = 0;
                        while (i21 < string4.length()) {
                            int i22 = i21 + 1;
                            String strSubstring3 = string4.substring(i21, i22);
                            if ("0123456789".contains(strSubstring3)) {
                                sb3.append(strSubstring3);
                            }
                            i21 = i22;
                        }
                        newContactBottomSheet.ignoreOnPhoneChange = true;
                        String hintText3 = newContactBottomSheet.phoneField.getHintText();
                        if (hintText3 != null) {
                            int i23 = 0;
                            while (i23 < sb3.length()) {
                                if (i23 < hintText3.length()) {
                                    if (hintText3.charAt(i23) == ' ') {
                                        sb3.insert(i23, ' ');
                                        i23++;
                                        if (selectionStart3 == i23 && (i6 = this.characterAction) != 2 && i6 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i23++;
                                } else {
                                    sb3.insert(i23, ' ');
                                    if (selectionStart3 == i23 + 1 && (i5 = this.characterAction) != 2 && i5 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                        editable.replace(0, editable.length(), sb3);
                        if (selectionStart3 >= 0) {
                            NewContactBottomSheet.AnonymousClass3 anonymousClass4 = newContactBottomSheet.phoneField;
                            anonymousClass4.setSelection(Math.min(selectionStart3, anonymousClass4.length()));
                        }
                        newContactBottomSheet.phoneField.invalidate();
                        newContactBottomSheet.ignoreOnPhoneChange = false;
                        NewContactBottomSheet.access$900(newContactBottomSheet);
                        break;
                    }
                    break;
                default:
                    PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.this$0;
                    if (!paymentFormActivity.ignoreOnPhoneChange) {
                        HintEditText hintEditText2 = (HintEditText) paymentFormActivity.inputFields[9];
                        int selectionStart4 = hintEditText2.getSelectionStart();
                        String string5 = hintEditText2.getText().toString();
                        if (this.characterAction == 3) {
                            string5 = string5.substring(0, this.actionPosition) + string5.substring(this.actionPosition + 1);
                            selectionStart4--;
                        }
                        StringBuilder sb4 = new StringBuilder(string5.length());
                        int i24 = 0;
                        while (i24 < string5.length()) {
                            int i25 = i24 + 1;
                            String strSubstring4 = string5.substring(i24, i25);
                            if ("0123456789".contains(strSubstring4)) {
                                sb4.append(strSubstring4);
                            }
                            i24 = i25;
                        }
                        paymentFormActivity.ignoreOnPhoneChange = true;
                        String hintText4 = hintEditText2.getHintText();
                        if (hintText4 != null) {
                            int i26 = 0;
                            while (i26 < sb4.length()) {
                                if (i26 < hintText4.length()) {
                                    if (hintText4.charAt(i26) == ' ') {
                                        sb4.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart4 == i26 && (i8 = this.characterAction) != 2 && i8 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb4.insert(i26, ' ');
                                    if (selectionStart4 == i26 + 1 && (i7 = this.characterAction) != 2 && i7 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                        hintEditText2.setText(sb4);
                        if (selectionStart4 >= 0) {
                            hintEditText2.setSelection(Math.min(selectionStart4, hintEditText2.length()));
                        }
                        hintEditText2.invalidate();
                        paymentFormActivity.ignoreOnPhoneChange = false;
                        break;
                    }
                    break;
            }
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 0:
                    if (i2 == 0 && i3 == 1) {
                        this.characterAction = 1;
                    } else if (i2 != 1 || i3 != 0) {
                        this.characterAction = -1;
                    } else if (charSequence.charAt(i) == ' ' && i > 0) {
                        this.characterAction = 3;
                        this.actionPosition = i - 1;
                    } else {
                        this.characterAction = 2;
                    }
                    break;
                case 1:
                    break;
                case 2:
                    if (i2 == 0 && i3 == 1) {
                        this.characterAction = 1;
                    } else if (i2 != 1 || i3 != 0) {
                        this.characterAction = -1;
                    } else if (charSequence.charAt(i) == ' ' && i > 0) {
                        this.characterAction = 3;
                        this.actionPosition = i - 1;
                    } else {
                        this.characterAction = 2;
                    }
                    break;
                case 3:
                    if (i2 == 0 && i3 == 1) {
                        this.characterAction = 1;
                    } else if (i2 != 1 || i3 != 0) {
                        this.characterAction = -1;
                    } else if (charSequence.charAt(i) == ' ' && i > 0) {
                        this.characterAction = 3;
                        this.actionPosition = i - 1;
                    } else {
                        this.characterAction = 2;
                    }
                    break;
                default:
                    if (i2 == 0 && i3 == 1) {
                        this.characterAction = 1;
                    } else if (i2 != 1 || i3 != 0) {
                        this.characterAction = -1;
                    } else if (charSequence.charAt(i) == ' ' && i > 0) {
                        this.characterAction = 3;
                        this.actionPosition = i - 1;
                    } else {
                        this.characterAction = 2;
                    }
                    break;
            }
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        public AnonymousClass10(CodeFieldContainer codeFieldContainer, int i, int i2) {
            this.$r8$classId = 1;
            this.this$0 = codeFieldContainer;
            this.characterAction = i;
            this.actionPosition = i2;
        }

        private final void beforeTextChanged$org$telegram$ui$CodeFieldContainer$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$CodeFieldContainer$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$LoginActivity$PhoneView$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$NewContactBottomSheet$6(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PassportActivity$10(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PaymentFormActivity$4(int i, int i2, int i3, CharSequence charSequence) {
        }
    }

    public final class AnonymousClass11 extends FrameLayout {
        public final int $r8$classId;
        public Object errorLayout;
        public float offsetX;
        public final KeyEvent.Callback val$field;

        public AnonymousClass11(Context context, EditTextBoldCursor editTextBoldCursor, int i) {
            super(context);
            this.$r8$classId = i;
            this.val$field = editTextBoldCursor;
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    if (((StaticLayout) this.errorLayout) != null) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(21.0f) + this.offsetX, ((EditTextBoldCursor) this.val$field).getLineY() + AndroidUtilities.dp(3.0f));
                        ((StaticLayout) this.errorLayout).draw(canvas);
                        canvas.restore();
                    }
                    break;
                case 1:
                    if (((StaticLayout) this.errorLayout) != null) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(21.0f) + this.offsetX, ((EditTextBoldCursor) this.val$field).getLineY() + AndroidUtilities.dp(3.0f));
                        ((StaticLayout) this.errorLayout).draw(canvas);
                        canvas.restore();
                    }
                    break;
                case 2:
                    if (((StaticLayout) this.errorLayout) != null) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(21.0f) + this.offsetX, ((EditTextBoldCursor) this.val$field).getLineY() + AndroidUtilities.dp(3.0f));
                        ((StaticLayout) this.errorLayout).draw(canvas);
                        canvas.restore();
                    }
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    int size = View.MeasureSpec.getSize(i) - AndroidUtilities.dp(34.0f);
                    StaticLayout errorLayout = ((EditTextBoldCursor) this.val$field).getErrorLayout(size);
                    this.errorLayout = errorLayout;
                    if (errorLayout != null) {
                        int lineCount = errorLayout.getLineCount();
                        if (lineCount > 1) {
                            i2 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.errorLayout).getLineBottom(lineCount - 1) - ((StaticLayout) this.errorLayout).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                        }
                        if (LocaleController.isRTL) {
                            float fMax = 0.0f;
                            for (int i3 = 0; i3 < lineCount; i3++) {
                                if (((StaticLayout) this.errorLayout).getLineLeft(i3) != 0.0f) {
                                    this.offsetX = 0.0f;
                                } else {
                                    fMax = Math.max(fMax, ((StaticLayout) this.errorLayout).getLineWidth(i3));
                                    if (i3 == lineCount - 1) {
                                        this.offsetX = size - fMax;
                                    }
                                }
                            }
                        }
                    }
                    super.onMeasure(i, i2);
                    break;
                case 1:
                    int size2 = View.MeasureSpec.getSize(i) - AndroidUtilities.dp(34.0f);
                    StaticLayout errorLayout2 = ((EditTextBoldCursor) this.val$field).getErrorLayout(size2);
                    this.errorLayout = errorLayout2;
                    if (errorLayout2 != null) {
                        int lineCount2 = errorLayout2.getLineCount();
                        if (lineCount2 > 1) {
                            i2 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.errorLayout).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.errorLayout).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                        }
                        if (LocaleController.isRTL) {
                            float fMax2 = 0.0f;
                            for (int i4 = 0; i4 < lineCount2; i4++) {
                                if (((StaticLayout) this.errorLayout).getLineLeft(i4) != 0.0f) {
                                    this.offsetX = 0.0f;
                                } else {
                                    fMax2 = Math.max(fMax2, ((StaticLayout) this.errorLayout).getLineWidth(i4));
                                    if (i4 == lineCount2 - 1) {
                                        this.offsetX = size2 - fMax2;
                                    }
                                }
                            }
                        }
                    }
                    super.onMeasure(i, i2);
                    break;
                case 2:
                    int size3 = View.MeasureSpec.getSize(i) - AndroidUtilities.dp(34.0f);
                    StaticLayout errorLayout3 = ((EditTextBoldCursor) this.val$field).getErrorLayout(size3);
                    this.errorLayout = errorLayout3;
                    if (errorLayout3 != null) {
                        int lineCount3 = errorLayout3.getLineCount();
                        if (lineCount3 > 1) {
                            i2 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.errorLayout).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.errorLayout).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                        }
                        if (LocaleController.isRTL) {
                            float fMax3 = 0.0f;
                            for (int i5 = 0; i5 < lineCount3; i5++) {
                                if (((StaticLayout) this.errorLayout).getLineLeft(i5) != 0.0f) {
                                    this.offsetX = 0.0f;
                                } else {
                                    fMax3 = Math.max(fMax3, ((StaticLayout) this.errorLayout).getLineWidth(i5));
                                    if (i5 == lineCount3 - 1) {
                                        this.offsetX = size3 - fMax3;
                                    }
                                }
                            }
                        }
                    }
                    super.onMeasure(i, i2);
                    break;
                default:
                    super.onMeasure(i, i2);
                    QRCodeBottomSheet qRCodeBottomSheet = (QRCodeBottomSheet) this.val$field;
                    float measuredHeight = (qRCodeBottomSheet.imageSize / 768.0f) * ((VoIPFragment.AnonymousClass9) this.errorLayout).getMeasuredHeight();
                    if (this.offsetX != measuredHeight) {
                        this.offsetX = measuredHeight;
                        ViewGroup.LayoutParams layoutParams = qRCodeBottomSheet.iconImage.getLayoutParams();
                        int i6 = (int) measuredHeight;
                        qRCodeBottomSheet.iconImage.getLayoutParams().width = i6;
                        layoutParams.height = i6;
                        super.onMeasure(i, i2);
                    }
                    break;
            }
        }

        public AnonymousClass11(QRCodeBottomSheet qRCodeBottomSheet, Context context, VoIPFragment.AnonymousClass9 anonymousClass9) {
            super(context);
            this.$r8$classId = 3;
            this.val$field = qRCodeBottomSheet;
            this.errorLayout = anonymousClass9;
        }
    }

    public final class AnonymousClass13 implements TextWatcher {
        public final int $r8$classId;
        public final Object this$0;
        public final Object val$field;
        public String val$key;

        public AnonymousClass13(PassportActivity passportActivity, EditTextBoldCursor editTextBoldCursor, String str, int i) {
            this.$r8$classId = i;
            this.this$0 = passportActivity;
            this.val$field = editTextBoldCursor;
            this.val$key = str;
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            long j;
            int i;
            switch (this.$r8$classId) {
                case 0:
                    PassportActivity.access$6500((PassportActivity) this.this$0, (EditTextBoldCursor) this.val$field, this.val$key, editable, false);
                    break;
                case 1:
                    PassportActivity.access$6500((PassportActivity) this.this$0, (EditTextBoldCursor) this.val$field, this.val$key, editable, false);
                    break;
                default:
                    ColorPickerBottomSheet.SlidersPickerView slidersPickerView = (ColorPickerBottomSheet.SlidersPickerView) this.this$0;
                    if (!slidersPickerView.isInvalidatingColor && this.val$key != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(this.val$key.toString(), editable.toString())) {
                        String string = editable.toString();
                        if (string.length() <= 8) {
                            if (((Pattern) this.val$field).matcher(editable).find()) {
                                int length = string.length();
                                ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
                                if (length != 3) {
                                    if (length == 6) {
                                        i = ((int) Long.parseLong(string, 16)) - 16777216;
                                    } else if (length != 8) {
                                        i = colorPickerBottomSheet.mColor;
                                    } else {
                                        j = Long.parseLong(string, 16);
                                    }
                                    if (i == colorPickerBottomSheet.mColor) {
                                        colorPickerBottomSheet.onSetColor(i, 5);
                                        break;
                                    }
                                } else {
                                    j = Long.parseLong("FF" + string.charAt(0) + string.charAt(0) + string.charAt(1) + string.charAt(1) + string.charAt(2) + string.charAt(2), 16);
                                }
                                i = (int) j;
                                if (i == colorPickerBottomSheet.mColor) {
                                    colorPickerBottomSheet.onSetColor(i, 5);
                                    break;
                                }
                            }
                        } else {
                            EditTextBoldCursor editTextBoldCursor = slidersPickerView.hexEdit;
                            editTextBoldCursor.setText(string.substring(2, 8).toUpperCase());
                            editTextBoldCursor.setSelection(8);
                            break;
                        }
                    }
                    break;
            }
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 0:
                case 1:
                    break;
                default:
                    this.val$key = charSequence.toString();
                    break;
            }
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        public AnonymousClass13(ColorPickerBottomSheet.SlidersPickerView slidersPickerView) {
            this.$r8$classId = 2;
            this.this$0 = slidersPickerView;
            this.val$field = Pattern.compile("^[0-9a-fA-F]*$");
        }

        private final void beforeTextChanged$org$telegram$ui$PassportActivity$13(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$PassportActivity$19(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$Paint$ColorPickerBottomSheet$SlidersPickerView$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PassportActivity$13(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PassportActivity$19(int i, int i2, int i3, CharSequence charSequence) {
        }
    }

    public final class AnonymousClass17 implements TextWatcher {
        public final int $r8$classId = 1;
        public final NotificationCenter.NotificationCenterDelegate this$0;
        public final EditTextBoldCursor val$field;
        public final Serializable val$key;
        public final Object val$values;

        public AnonymousClass17(StickersAlert stickersAlert, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
            this.this$0 = stickersAlert;
            this.val$key = iArr;
            this.val$values = textView;
            this.val$field = editTextBoldCursor;
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            switch (this.$r8$classId) {
                case 0:
                    PassportActivity passportActivity = (PassportActivity) this.this$0;
                    boolean z = ((HashMap) this.val$values) == passportActivity.currentDocumentValues;
                    EditTextBoldCursor editTextBoldCursor = this.val$field;
                    PassportActivity.access$6500(passportActivity, editTextBoldCursor, (String) this.val$key, editable, z);
                    int iIntValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                    EditTextBoldCursor editTextBoldCursor2 = passportActivity.inputFields[iIntValue];
                    if (iIntValue == 6) {
                        passportActivity.checkNativeFields(true);
                    }
                    break;
            }
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    if (((int[]) this.val$key)[0] == 2) {
                        ((StickersAlert) this.this$0).checkUrlAvailable((TextView) this.val$values, this.val$field.getText().toString(), false);
                        break;
                    }
                    break;
            }
        }

        public AnonymousClass17(PassportActivity passportActivity, EditTextBoldCursor editTextBoldCursor, String str, HashMap map) {
            this.this$0 = passportActivity;
            this.val$field = editTextBoldCursor;
            this.val$key = str;
            this.val$values = map;
        }

        private final void afterTextChanged$org$telegram$ui$Components$StickersAlert$15(Editable editable) {
        }

        private final void beforeTextChanged$org$telegram$ui$Components$StickersAlert$15(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$PassportActivity$17(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PassportActivity$17(int i, int i2, int i3, CharSequence charSequence) {
        }
    }

    public final class C1ValueToSend {
        public final boolean selfie_required;
        public final boolean translation_required;
        public final TLRPC.TL_secureValue value;

        public C1ValueToSend(TLRPC.TL_secureValue tL_secureValue, boolean z, boolean z2) {
            this.value = tL_secureValue;
            this.selfie_required = z;
            this.translation_required = z2;
        }
    }

    public final class AnonymousClass20 implements PassportActivityDelegate {
        public final int val$availableDocumentTypesCount;
        public final boolean val$documentOnly;
        public final TLRPC.SecureValueType val$type;

        public final class AnonymousClass1 implements RequestDelegate {
            public final AnonymousClass20 val$currentDelegate;
            public final TLRPC.TL_secureRequiredType val$documentRequiredType;
            public final ArrayList val$documents;
            public final String val$documentsJson;
            public final PhotoViewer.AnonymousClass14 val$errorRunnable;
            public final TLRPC.TL_inputSecureValue val$finalFileInputSecureValue;
            public final Runnable val$finishRunnable;
            public final SecureDocument val$front;
            public final String val$json;
            public final TL_account.saveSecureValue val$req;
            public final TLRPC.TL_secureRequiredType val$requiredType;
            public final SecureDocument val$reverse;
            public final SecureDocument val$selfie;
            public final String val$text;
            public final ArrayList val$translationDocuments;

            public AnonymousClass1(PhotoViewer.AnonymousClass14 anonymousClass14, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, AnonymousClass20 anonymousClass20, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
                this.val$errorRunnable = anonymousClass14;
                this.val$text = str;
                this.val$req = savesecurevalue;
                this.val$documentRequiredType = tL_secureRequiredType;
                this.val$requiredType = tL_secureRequiredType2;
                this.val$documents = arrayList;
                this.val$selfie = secureDocument;
                this.val$front = secureDocument2;
                this.val$reverse = secureDocument3;
                this.val$translationDocuments = arrayList2;
                this.val$json = str2;
                this.val$documentsJson = str3;
                this.val$finishRunnable = runnable;
                this.val$currentDelegate = anonymousClass20;
                this.val$finalFileInputSecureValue = tL_inputSecureValue;
            }

            public final void onResult(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
                AnonymousClass20 anonymousClass20 = AnonymousClass20.this;
                final boolean z = anonymousClass20.val$documentOnly;
                final TL_account.saveSecureValue savesecurevalue = this.val$req;
                final ArrayList arrayList = this.val$documents;
                final ArrayList arrayList2 = this.val$translationDocuments;
                final Runnable runnable = this.val$finishRunnable;
                final PhotoViewer.AnonymousClass14 anonymousClass14 = this.val$errorRunnable;
                final String str = this.val$text;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.val$documentRequiredType;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.val$requiredType;
                final SecureDocument secureDocument = this.val$selfie;
                final SecureDocument secureDocument2 = this.val$front;
                final SecureDocument secureDocument3 = this.val$reverse;
                final String str2 = this.val$json;
                final String str3 = this.val$documentsJson;
                final int i = anonymousClass20.val$availableDocumentTypesCount;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList3;
                        ArrayList arrayList4;
                        PassportActivity.AnonymousClass20 anonymousClass21 = PassportActivity.AnonymousClass20.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str4 = str;
                        if (tL_error2 != null) {
                            PhotoViewer.AnonymousClass14 anonymousClass15 = anonymousClass14;
                            if (anonymousClass15 != null) {
                                anonymousClass15.onError(tL_error2.text, str4);
                            }
                            AlertsCreator.processError(((BaseFragment) PassportActivity.this).currentAccount, tL_error2, PassportActivity.this, savesecurevalue, str4);
                            return;
                        }
                        boolean z2 = z;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType2;
                        if (!z2) {
                            PassportActivity.this.removeValue(tL_secureRequiredType4);
                            PassportActivity.this.removeValue(tL_secureRequiredType3);
                        } else if (tL_secureRequiredType3 != null) {
                            PassportActivity.this.removeValue(tL_secureRequiredType3);
                        } else {
                            PassportActivity.this.removeValue(tL_secureRequiredType4);
                        }
                        TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                        if (tL_secureValue3 != null) {
                            PassportActivity.this.currentForm.values.add(tL_secureValue3);
                        }
                        TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                        if (tL_secureValue4 != null) {
                            PassportActivity.this.currentForm.values.add(tL_secureValue4);
                        }
                        ArrayList arrayList5 = arrayList;
                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                            int size = arrayList5.size();
                            int i2 = 0;
                            while (i2 < size) {
                                SecureDocument secureDocument4 = (SecureDocument) arrayList5.get(i2);
                                if (secureDocument4.inputFile == null) {
                                    arrayList4 = arrayList5;
                                    break;
                                    break;
                                }
                                int size2 = tL_secureValue3.files.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size2) {
                                        arrayList4 = arrayList5;
                                        break;
                                    }
                                    TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i3);
                                    if (secureFile instanceof TLRPC.TL_secureFile) {
                                        TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                        arrayList4 = arrayList5;
                                        if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                            PassportActivity.AnonymousClass20.access$8100(secureDocument4, tL_secureFile);
                                            break;
                                        }
                                    } else {
                                        arrayList4 = arrayList5;
                                    }
                                    i3++;
                                    arrayList5 = arrayList4;
                                }
                                i2++;
                                arrayList5 = arrayList4;
                            }
                        }
                        SecureDocument secureDocument5 = secureDocument;
                        if (secureDocument5 != null && secureDocument5.inputFile != null) {
                            TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                            if (secureFile2 instanceof TLRPC.TL_secureFile) {
                                TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                                if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                                    PassportActivity.AnonymousClass20.access$8100(secureDocument5, tL_secureFile2);
                                }
                            }
                        }
                        SecureDocument secureDocument6 = secureDocument2;
                        if (secureDocument6 != null && secureDocument6.inputFile != null) {
                            TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                            if (secureFile3 instanceof TLRPC.TL_secureFile) {
                                TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                                if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                                    PassportActivity.AnonymousClass20.access$8100(secureDocument6, tL_secureFile3);
                                }
                            }
                        }
                        SecureDocument secureDocument7 = secureDocument3;
                        if (secureDocument7 != null && secureDocument7.inputFile != null) {
                            TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                            if (secureFile4 instanceof TLRPC.TL_secureFile) {
                                TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                                if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                                    PassportActivity.AnonymousClass20.access$8100(secureDocument7, tL_secureFile4);
                                }
                            }
                        }
                        ArrayList arrayList6 = arrayList2;
                        if (arrayList6 != null && !arrayList6.isEmpty()) {
                            int size3 = arrayList6.size();
                            int i4 = 0;
                            while (i4 < size3) {
                                SecureDocument secureDocument8 = (SecureDocument) arrayList6.get(i4);
                                if (secureDocument8.inputFile == null) {
                                    arrayList3 = arrayList6;
                                    break;
                                    break;
                                }
                                int size4 = tL_secureValue3.translation.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size4) {
                                        arrayList3 = arrayList6;
                                        break;
                                    }
                                    TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i5);
                                    if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                        TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                        arrayList3 = arrayList6;
                                        if (Utilities.arraysEquals(secureDocument8.fileSecret, 0, tL_secureFile5.secret, 0)) {
                                            PassportActivity.AnonymousClass20.access$8100(secureDocument8, tL_secureFile5);
                                            break;
                                        }
                                    } else {
                                        arrayList3 = arrayList6;
                                    }
                                    i5++;
                                    arrayList6 = arrayList3;
                                }
                                i4++;
                                arrayList6 = arrayList3;
                            }
                        }
                        PassportActivity.this.setTypeValue(tL_secureRequiredType4, str4, str2, tL_secureRequiredType3, str3, z2, i);
                        runnable.run();
                    }
                });
            }

            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AnonymousClass1 anonymousClass1;
                TLRPC.TL_inputSecureValue tL_inputSecureValue;
                AnonymousClass20 anonymousClass20 = AnonymousClass20.this;
                if (tL_error != null) {
                    boolean zEquals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
                    String str = this.val$text;
                    if (zEquals) {
                        TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                        sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                        sendverifyemailcode.email = str;
                        ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(sendverifyemailcode, new ChatActivity$$ExternalSyntheticLambda206(this, this.val$text, this.val$requiredType, this.val$currentDelegate, this.val$errorRunnable));
                        return;
                    }
                    anonymousClass1 = this;
                    if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(anonymousClass1.val$errorRunnable, tL_error, str, 27));
                        return;
                    }
                } else {
                    anonymousClass1 = this;
                }
                if (tL_error != null || (tL_inputSecureValue = anonymousClass1.val$finalFileInputSecureValue) == null) {
                    onResult(tL_error, (TLRPC.TL_secureValue) tLObject, null);
                    return;
                }
                TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
                savesecurevalue.value = tL_inputSecureValue;
                PassportActivity passportActivity = PassportActivity.this;
                savesecurevalue.secure_secret_id = passportActivity.secureSecretId;
                ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(savesecurevalue, new ProfileActivity$$ExternalSyntheticLambda65(3, this, (TLRPC.TL_secureValue) tLObject));
            }
        }

        public AnonymousClass20(TLRPC.SecureValueType secureValueType, boolean z, int i) {
            this.val$type = secureValueType;
            this.val$documentOnly = z;
            this.val$availableDocumentTypesCount = i;
        }

        public static void access$8100(SecureDocument secureDocument, TLRPC.TL_secureFile tL_secureFile) {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(secureDocument);
            String str = secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.id;
            File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_secureFile);
            String str2 = tL_secureFile.dc_id + "_" + tL_secureFile.id;
            pathToAttach.renameTo(pathToAttach2);
            ImageLoader.getInstance().replaceImageInCache(str, str2, null, false);
        }

        public static TLRPC.InputSecureFile getInputSecureFile(SecureDocument secureDocument) {
            if (secureDocument.inputFile == null) {
                TLRPC.TL_inputSecureFile tL_inputSecureFile = new TLRPC.TL_inputSecureFile();
                TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
                tL_inputSecureFile.id = tL_secureFile.id;
                tL_inputSecureFile.access_hash = tL_secureFile.access_hash;
                return tL_inputSecureFile;
            }
            TLRPC.TL_inputSecureFileUploaded tL_inputSecureFileUploaded = new TLRPC.TL_inputSecureFileUploaded();
            TLRPC.TL_inputFile tL_inputFile = secureDocument.inputFile;
            tL_inputSecureFileUploaded.id = tL_inputFile.id;
            tL_inputSecureFileUploaded.parts = tL_inputFile.parts;
            tL_inputSecureFileUploaded.md5_checksum = tL_inputFile.md5_checksum;
            tL_inputSecureFileUploaded.file_hash = secureDocument.fileHash;
            tL_inputSecureFileUploaded.secret = secureDocument.fileSecret;
            return tL_inputSecureFileUploaded;
        }

        public final void saveValue(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, ArrayList arrayList, SecureDocument secureDocument, ArrayList arrayList2, SecureDocument secureDocument2, SecureDocument secureDocument3, Runnable runnable, PhotoViewer.AnonymousClass14 anonymousClass14) {
            TLRPC.TL_inputSecureValue tL_inputSecureValue;
            TLRPC.SecurePlainData securePlainData;
            TLRPC.TL_inputSecureValue tL_inputSecureValue2;
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            PassportActivity passportActivity = PassportActivity.this;
            if (!zIsEmpty) {
                tL_inputSecureValue = new TLRPC.TL_inputSecureValue();
                tL_inputSecureValue.type = tL_secureRequiredType.type;
                tL_inputSecureValue.flags |= 1;
                MHTML mhtmlEncryptData = passportActivity.encryptData(AndroidUtilities.getStringBytes(str2));
                TLRPC.TL_secureData tL_secureData = new TLRPC.TL_secureData();
                tL_inputSecureValue.data = tL_secureData;
                tL_secureData.data = (byte[]) mhtmlEncryptData.entries;
                tL_secureData.data_hash = (byte[]) mhtmlEncryptData.entriesByLocation;
                tL_secureData.secret = (byte[]) mhtmlEncryptData.file;
            } else if (TextUtils.isEmpty(str)) {
                tL_inputSecureValue = null;
            } else {
                TLRPC.SecureValueType secureValueType = this.val$type;
                if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
                    TLRPC.TL_securePlainEmail tL_securePlainEmail = new TLRPC.TL_securePlainEmail();
                    tL_securePlainEmail.email = str;
                    securePlainData = tL_securePlainEmail;
                } else {
                    if (!(secureValueType instanceof TLRPC.TL_secureValueTypePhone)) {
                        return;
                    }
                    TLRPC.TL_securePlainPhone tL_securePlainPhone = new TLRPC.TL_securePlainPhone();
                    tL_securePlainPhone.phone = str;
                    securePlainData = tL_securePlainPhone;
                }
                TLRPC.TL_inputSecureValue tL_inputSecureValue3 = new TLRPC.TL_inputSecureValue();
                tL_inputSecureValue3.type = tL_secureRequiredType.type;
                tL_inputSecureValue3.flags |= 32;
                tL_inputSecureValue3.plain_data = securePlainData;
                tL_inputSecureValue = tL_inputSecureValue3;
            }
            boolean z = this.val$documentOnly;
            if (!z && tL_inputSecureValue == null) {
                if (anonymousClass14 != null) {
                    anonymousClass14.onError((String) null, (String) null);
                    return;
                }
                return;
            }
            if (tL_secureRequiredType2 != null) {
                TLRPC.TL_inputSecureValue tL_inputSecureValue4 = new TLRPC.TL_inputSecureValue();
                tL_inputSecureValue4.type = tL_secureRequiredType2.type;
                if (!TextUtils.isEmpty(str3)) {
                    tL_inputSecureValue4.flags |= 1;
                    MHTML mhtmlEncryptData2 = passportActivity.encryptData(AndroidUtilities.getStringBytes(str3));
                    TLRPC.TL_secureData tL_secureData2 = new TLRPC.TL_secureData();
                    tL_inputSecureValue4.data = tL_secureData2;
                    tL_secureData2.data = (byte[]) mhtmlEncryptData2.entries;
                    tL_secureData2.data_hash = (byte[]) mhtmlEncryptData2.entriesByLocation;
                    tL_secureData2.secret = (byte[]) mhtmlEncryptData2.file;
                }
                if (secureDocument2 != null) {
                    tL_inputSecureValue4.front_side = getInputSecureFile(secureDocument2);
                    tL_inputSecureValue4.flags |= 2;
                }
                if (secureDocument3 != null) {
                    tL_inputSecureValue4.reverse_side = getInputSecureFile(secureDocument3);
                    tL_inputSecureValue4.flags |= 4;
                }
                if (secureDocument != null) {
                    tL_inputSecureValue4.selfie = getInputSecureFile(secureDocument);
                    tL_inputSecureValue4.flags |= 8;
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    tL_inputSecureValue4.flags |= 64;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        tL_inputSecureValue4.translation.add(getInputSecureFile((SecureDocument) arrayList2.get(i)));
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_inputSecureValue4.flags |= 16;
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        tL_inputSecureValue4.files.add(getInputSecureFile((SecureDocument) arrayList.get(i2)));
                    }
                }
                if (z) {
                    tL_inputSecureValue = tL_inputSecureValue4;
                    tL_inputSecureValue2 = null;
                } else {
                    tL_inputSecureValue2 = tL_inputSecureValue4;
                }
            } else {
                tL_inputSecureValue2 = null;
            }
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = passportActivity.secureSecretId;
            ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(savesecurevalue, new AnonymousClass1(anonymousClass14, str, savesecurevalue, tL_secureRequiredType2, tL_secureRequiredType, arrayList, secureDocument, secureDocument2, secureDocument3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
        }
    }

    public final class AnonymousClass3 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass3() {
        }

        public final boolean onIdentityDone(PhotoViewer$$ExternalSyntheticLambda21 photoViewer$$ExternalSyntheticLambda21, PhotoViewer.AnonymousClass14 anonymousClass14) {
            char c;
            char c2;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            char c3 = 2;
            ?? r10 = 1;
            PassportActivity passportActivity = PassportActivity.this;
            int[] iArr = passportActivity.currentExpireDate;
            final int i = 0;
            if (passportActivity.uploadingDocuments.isEmpty() && !PassportActivity.access$2200(passportActivity)) {
                Theme.ResourcesProvider resourcesProvider = null;
                if (passportActivity.allowNonLatinName) {
                    passportActivity.allowNonLatinName = false;
                    boolean z = false;
                    int i2 = 0;
                    while (true) {
                        boolean[] zArr = passportActivity.nonLatinNames;
                        if (i2 >= zArr.length) {
                            break;
                        }
                        if (zArr[i2]) {
                            passportActivity.inputFields[i2].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                            if (!z) {
                                String translitString = zArr[0] ? LocaleController.getInstance().getTranslitString(passportActivity.inputExtraFields[0].getText().toString(), r10) : passportActivity.inputFields[0].getText().toString();
                                String translitString2 = zArr[r10] ? LocaleController.getInstance().getTranslitString(passportActivity.inputExtraFields[r10].getText().toString(), r10) : passportActivity.inputFields[r10].getText().toString();
                                String translitString3 = zArr[c3] ? LocaleController.getInstance().getTranslitString(passportActivity.inputExtraFields[c3].getText().toString(), r10) : passportActivity.inputFields[c3].getText().toString();
                                if (TextUtils.isEmpty(translitString) || TextUtils.isEmpty(translitString2) || TextUtils.isEmpty(translitString3)) {
                                    passportActivity.onFieldError(passportActivity.inputFields[i2]);
                                } else {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity(), 0, resourcesProvider);
                                    int i3 = R.string.PassportNameCheckAlert;
                                    Object[] objArr = new Object[3];
                                    objArr[0] = translitString;
                                    objArr[r10] = translitString2;
                                    objArr[c3] = translitString3;
                                    String string = LocaleController.formatString("PassportNameCheckAlert", i3, objArr);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.message = string;
                                    alertDialog.title = LocaleController.getString(R.string.AppName);
                                    builder.setPositiveButton(LocaleController.getString(R.string.Done), new PassportActivity$3$$ExternalSyntheticLambda3(this, translitString, translitString2, translitString3, photoViewer$$ExternalSyntheticLambda21, anonymousClass14, 0));
                                    builder.setNegativeButton(LocaleController.getString(R.string.Edit), new LaunchActivity$$ExternalSyntheticLambda9(this, i2, 14));
                                    passportActivity.showDialog(alertDialog);
                                }
                                z = true;
                            }
                        }
                        i2++;
                        c3 = 2;
                        r10 = 1;
                        resourcesProvider = null;
                    }
                    c = 2;
                    c2 = 1;
                    if (!z) {
                    }
                } else {
                    c = 2;
                    c2 = 1;
                }
                String str = passportActivity.initialValues;
                if (str != null && !str.equals(passportActivity.getCurrentValues())) {
                    try {
                        if (passportActivity.documentOnly) {
                            jSONObject = null;
                        } else {
                            HashMap map = new HashMap(passportActivity.currentValues);
                            if (passportActivity.currentType.native_names) {
                                if (passportActivity.nativeInfoCell.getVisibility() == 0) {
                                    map.put("first_name_native", passportActivity.inputExtraFields[0].getText().toString());
                                    map.put("middle_name_native", passportActivity.inputExtraFields[c2].getText().toString());
                                    map.put("last_name_native", passportActivity.inputExtraFields[c].getText().toString());
                                } else {
                                    map.put("first_name_native", passportActivity.inputFields[0].getText().toString());
                                    map.put("middle_name_native", passportActivity.inputFields[c2].getText().toString());
                                    map.put("last_name_native", passportActivity.inputFields[c].getText().toString());
                                }
                            }
                            map.put("first_name", passportActivity.inputFields[0].getText().toString());
                            map.put("middle_name", passportActivity.inputFields[c2].getText().toString());
                            map.put("last_name", passportActivity.inputFields[c].getText().toString());
                            map.put("birth_date", passportActivity.inputFields[3].getText().toString());
                            map.put("gender", passportActivity.currentGender);
                            map.put("country_code", passportActivity.currentCitizeship);
                            map.put("residence_country_code", passportActivity.currentResidence);
                            jSONObject = new JSONObject();
                            try {
                                ArrayList arrayList = new ArrayList(map.keySet());
                                Collections.sort(arrayList, new Comparator(this) {
                                    public final PassportActivity.AnonymousClass3 f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final int compare(Object obj, Object obj2) {
                                        String str2 = (String) obj;
                                        String str3 = (String) obj2;
                                        switch (i) {
                                            case 0:
                                                PassportActivity passportActivity2 = PassportActivity.this;
                                                int iAccess$2000 = PassportActivity.access$2000(passportActivity2, str2);
                                                int iAccess$2001 = PassportActivity.access$2000(passportActivity2, str3);
                                                if (iAccess$2000 < iAccess$2001) {
                                                    return -1;
                                                }
                                                return iAccess$2000 > iAccess$2001 ? 1 : 0;
                                            default:
                                                PassportActivity passportActivity3 = PassportActivity.this;
                                                int iAccess$2002 = PassportActivity.access$2000(passportActivity3, str2);
                                                int iAccess$2003 = PassportActivity.access$2000(passportActivity3, str3);
                                                if (iAccess$2002 < iAccess$2003) {
                                                    return -1;
                                                }
                                                return iAccess$2002 > iAccess$2003 ? 1 : 0;
                                        }
                                    }
                                });
                                int size = arrayList.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    String str2 = (String) arrayList.get(i4);
                                    jSONObject.put(str2, map.get(str2));
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (passportActivity.currentDocumentsType != null) {
                            HashMap map2 = new HashMap(passportActivity.currentDocumentValues);
                            map2.put("document_no", passportActivity.inputFields[7].getText().toString());
                            if (iArr[0] != 0) {
                                Locale locale = Locale.US;
                                Integer numValueOf = Integer.valueOf(iArr[c]);
                                Integer numValueOf2 = Integer.valueOf(iArr[c2]);
                                Integer numValueOf3 = Integer.valueOf(iArr[0]);
                                Object[] objArr2 = new Object[3];
                                objArr2[0] = numValueOf;
                                objArr2[c2] = numValueOf2;
                                objArr2[c] = numValueOf3;
                                map2.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
                            } else {
                                map2.put("expiry_date", "");
                            }
                            jSONObject2 = new JSONObject();
                            try {
                                ArrayList arrayList2 = new ArrayList(map2.keySet());
                                final int i5 = 1;
                                Collections.sort(arrayList2, new Comparator(this) {
                                    public final PassportActivity.AnonymousClass3 f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final int compare(Object obj, Object obj2) {
                                        String str3 = (String) obj;
                                        String str4 = (String) obj2;
                                        switch (i5) {
                                            case 0:
                                                PassportActivity passportActivity2 = PassportActivity.this;
                                                int iAccess$2000 = PassportActivity.access$2000(passportActivity2, str3);
                                                int iAccess$2001 = PassportActivity.access$2000(passportActivity2, str4);
                                                if (iAccess$2000 < iAccess$2001) {
                                                    return -1;
                                                }
                                                return iAccess$2000 > iAccess$2001 ? 1 : 0;
                                            default:
                                                PassportActivity passportActivity3 = PassportActivity.this;
                                                int iAccess$2002 = PassportActivity.access$2000(passportActivity3, str3);
                                                int iAccess$2003 = PassportActivity.access$2000(passportActivity3, str4);
                                                if (iAccess$2002 < iAccess$2003) {
                                                    return -1;
                                                }
                                                return iAccess$2002 > iAccess$2003 ? 1 : 0;
                                        }
                                    }
                                });
                                int size2 = arrayList2.size();
                                while (i < size2) {
                                    String str3 = (String) arrayList2.get(i);
                                    jSONObject2.put(str3, map2.get(str3));
                                    i++;
                                }
                            } catch (Exception unused2) {
                            }
                        } else {
                            jSONObject2 = null;
                        }
                    } catch (Exception unused3) {
                        jSONObject = null;
                    }
                    HashMap map3 = passportActivity.fieldsErrors;
                    if (map3 != null) {
                        map3.clear();
                    }
                    HashMap map4 = passportActivity.documentsErrors;
                    if (map4 != null) {
                        map4.clear();
                    }
                    PassportActivityDelegate passportActivityDelegate = passportActivity.delegate;
                    String string2 = jSONObject != null ? jSONObject.toString() : null;
                    TLRPC.TL_secureRequiredType tL_secureRequiredType = passportActivity.currentDocumentsType;
                    String string3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    SecureDocument secureDocument = passportActivity.selfieDocument;
                    ArrayList arrayList3 = passportActivity.translationDocuments;
                    SecureDocument secureDocument2 = passportActivity.frontDocument;
                    LinearLayout linearLayout = passportActivity.reverseLayout;
                    ((AnonymousClass20) passportActivityDelegate).saveValue(passportActivity.currentType, null, string2, tL_secureRequiredType, string3, null, secureDocument, arrayList3, secureDocument2, (linearLayout == null || linearLayout.getVisibility() != 0) ? null : passportActivity.reverseDocument, photoViewer$$ExternalSyntheticLambda21, anonymousClass14);
                    return true;
                }
                passportActivity.finishFragment();
            }
            return false;
        }

        @Override
        public final void onItemClick(int i) {
            JSONObject jSONObject;
            String str;
            String string;
            PassportActivity passportActivity = PassportActivity.this;
            int i2 = passportActivity.currentActivityType;
            if (i == -1) {
                if (passportActivity.checkDiscard$4(true)) {
                    return;
                }
                if (i2 == 0 || i2 == 5) {
                    passportActivity.callCallback(false);
                }
                passportActivity.finishFragment();
                return;
            }
            if (i == 1) {
                if (passportActivity.getParentActivity() == null) {
                    return;
                }
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(passportActivity.getParentActivity(), null);
                String string2 = LocaleController.getString(R.string.PassportInfo2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                int iIndexOf = string2.indexOf(42);
                int iLastIndexOf = string2.lastIndexOf(42);
                if (iIndexOf != -1 && iLastIndexOf != -1) {
                    spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new StickersActivity.AnonymousClass4(LocaleController.getString(R.string.PassportInfoUrl), 5, this), iIndexOf, iLastIndexOf - 1, 33);
                }
                linksTextView.setText(spannableStringBuilder);
                linksTextView.setTextSize(1, 16.0f);
                linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_dialogTextLink, false));
                linksTextView.setHighlightColor(Theme.getColor(null, Theme.key_dialogLinkSelection, false));
                linksTextView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                linksTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                linksTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity(), 0, null);
                builder.setView(linksTextView);
                String string3 = LocaleController.getString(R.string.PassportInfoTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string3;
                builder.setNegativeButton(LocaleController.getString(R.string.Close), null);
                passportActivity.showDialog(alertDialog);
                return;
            }
            if (i == 2) {
                if (i2 == 5) {
                    passportActivity.onPasswordDone(false);
                    return;
                }
                if (i2 == 7) {
                    passportActivity.views[passportActivity.currentViewNum].onNextPressed(null);
                    return;
                }
                PhotoViewer$$ExternalSyntheticLambda21 photoViewer$$ExternalSyntheticLambda21 = new PhotoViewer$$ExternalSyntheticLambda21(this, 2);
                PhotoViewer.AnonymousClass14 anonymousClass14 = new PhotoViewer.AnonymousClass14(6, this, photoViewer$$ExternalSyntheticLambda21);
                if (i2 == 4) {
                    if (passportActivity.useCurrentValue) {
                        string = passportActivity.currentEmail;
                    } else if (PassportActivity.access$2200(passportActivity)) {
                        return;
                    } else {
                        string = passportActivity.inputFields[0].getText().toString();
                    }
                    ((AnonymousClass20) passportActivity.delegate).saveValue(passportActivity.currentType, string, null, null, null, null, null, null, null, null, photoViewer$$ExternalSyntheticLambda21, anonymousClass14);
                } else if (i2 == 3) {
                    if (passportActivity.useCurrentValue) {
                        str = UserConfig.getInstance(((BaseFragment) passportActivity).currentAccount).getCurrentUser().phone;
                    } else {
                        if (PassportActivity.access$2200(passportActivity)) {
                            return;
                        }
                        str = passportActivity.inputFields[1].getText().toString() + passportActivity.inputFields[2].getText().toString();
                    }
                    ((AnonymousClass20) passportActivity.delegate).saveValue(passportActivity.currentType, str, null, null, null, null, null, null, null, null, photoViewer$$ExternalSyntheticLambda21, anonymousClass14);
                } else if (i2 == 2) {
                    if (!passportActivity.uploadingDocuments.isEmpty() || PassportActivity.access$2200(passportActivity)) {
                        return;
                    }
                    String str2 = passportActivity.initialValues;
                    if (str2 == null || str2.equals(passportActivity.getCurrentValues())) {
                        passportActivity.finishFragment();
                        return;
                    }
                    try {
                        if (passportActivity.documentOnly) {
                            jSONObject = null;
                        } else {
                            jSONObject = new JSONObject();
                            try {
                                jSONObject.put("street_line1", passportActivity.inputFields[0].getText().toString());
                                jSONObject.put("street_line2", passportActivity.inputFields[1].getText().toString());
                                jSONObject.put("post_code", passportActivity.inputFields[2].getText().toString());
                                jSONObject.put("city", passportActivity.inputFields[3].getText().toString());
                                jSONObject.put("state", passportActivity.inputFields[4].getText().toString());
                                jSONObject.put("country_code", passportActivity.currentCitizeship);
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    HashMap map = passportActivity.fieldsErrors;
                    if (map != null) {
                        map.clear();
                    }
                    HashMap map2 = passportActivity.documentsErrors;
                    if (map2 != null) {
                        map2.clear();
                    }
                    PassportActivityDelegate passportActivityDelegate = passportActivity.delegate;
                    ((AnonymousClass20) passportActivityDelegate).saveValue(passportActivity.currentType, null, jSONObject != null ? jSONObject.toString() : null, passportActivity.currentDocumentsType, null, passportActivity.documents, passportActivity.selfieDocument, passportActivity.translationDocuments, null, null, photoViewer$$ExternalSyntheticLambda21, anonymousClass14);
                } else if (i2 == 1) {
                    if (!onIdentityDone(photoViewer$$ExternalSyntheticLambda21, anonymousClass14)) {
                        return;
                    }
                } else if (i2 == 6) {
                    TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                    verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode.code = passportActivity.inputFields[0].getText().toString();
                    verifyemail.verification = tL_emailVerificationCode;
                    ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(verifyemail, new LoginActivity$$ExternalSyntheticLambda42(this, photoViewer$$ExternalSyntheticLambda21, anonymousClass14, verifyemail, 9)), ((BaseFragment) passportActivity).classGuid);
                }
                passportActivity.showEditDoneProgress$2(true, true);
            }
        }
    }

    public final class AnonymousClass8 implements RequestDelegate {
        public final TL_account.getPasswordSettings val$req;
        public final boolean val$saved;
        public final String val$textPassword;
        public final byte[] val$x_bytes;

        public AnonymousClass8(boolean z, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
            this.val$saved = z;
            this.val$x_bytes = bArr;
            this.val$req = getpasswordsettings;
            this.val$textPassword = str;
        }

        public final void openRequestInterface() {
            PassportActivity passportActivity = PassportActivity.this;
            if (passportActivity.inputFields == null) {
                return;
            }
            if (!this.val$saved) {
                UserConfig.getInstance(((BaseFragment) passportActivity).currentAccount).savePassword(this.val$x_bytes, passportActivity.saltedPassword);
            }
            AndroidUtilities.hideKeyboard(passportActivity.inputFields[0]);
            passportActivity.ignoreOnFailure = true;
            long j = passportActivity.currentBotId;
            int i = j == 0 ? 8 : 0;
            PassportActivity passportActivity2 = new PassportActivity(i, j, passportActivity.currentScope, passportActivity.currentPublicKey, passportActivity.currentPayload, passportActivity.currentNonce, passportActivity.currentCallbackUrl, passportActivity.currentForm, passportActivity.currentPassword);
            passportActivity2.currentEmail = passportActivity.currentEmail;
            ((BaseFragment) passportActivity2).currentAccount = ((BaseFragment) passportActivity).currentAccount;
            passportActivity2.saltedPassword = passportActivity.saltedPassword;
            passportActivity2.secureSecret = passportActivity.secureSecret;
            passportActivity2.secureSecretId = passportActivity.secureSecretId;
            passportActivity2.needActivityResult = passportActivity.needActivityResult;
            if (((BaseFragment) passportActivity).parentLayout == null || !((ActionBarLayout) ((BaseFragment) passportActivity).parentLayout).checkTransitionAnimation()) {
                passportActivity.presentFragment(passportActivity2, true);
            } else {
                passportActivity.presentAfterAnimation = passportActivity2;
            }
        }

        public final void resetSecret() {
            TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
            PassportActivity passportActivity = PassportActivity.this;
            TL_account.Password password = passportActivity.currentPassword;
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.password = SRPHelper.startCheck(this.val$x_bytes, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
            ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(this.val$req, new PassportActivity$8$$ExternalSyntheticLambda0(this, 2));
        }

        @Override
        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new CallLogActivity$$ExternalSyntheticLambda31(8, this, this.val$saved), 8);
            } else if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda15(this, tLObject, this.val$textPassword, this.val$saved, 21));
            } else {
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(this, this.val$saved, tL_error, 27));
            }
        }
    }

    public final class LinkSpan extends ClickableSpan {
        public LinkSpan() {
        }

        @Override
        public final void onClick(View view) {
            PassportActivity passportActivity = PassportActivity.this;
            Browser.openUrl(passportActivity.getParentActivity(), passportActivity.currentForm.privacy_policy_url);
        }

        @Override
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setTypeface(AndroidUtilities.bold());
        }
    }

    public interface PassportActivityDelegate {
    }

    public final class PhoneConfirmationView extends SlideView implements NotificationCenter.NotificationCenterDelegate {
        public static final int $r8$clinit = 0;
        public final ImageView blueImageView;
        public EditTextBoldCursor[] codeField;
        public final LinearLayout codeFieldContainer;
        public int codeTime;
        public Timer codeTimer;
        public final TextView confirmTextView;
        public boolean ignoreOnTextChange;
        public double lastCodeTime;
        public double lastCurrentTime;
        public String lastError;
        public int length;
        public boolean nextPressed;
        public int nextType;
        public String pattern;
        public String phone;
        public String phoneHash;
        public final ArticleViewer.AnonymousClass9 problemText;
        public final ProgressView progressView;
        public int time;
        public final ArticleViewer.AnonymousClass9 timeText;
        public Timer timeTimer;
        public int timeout;
        public final Object timerSync;
        public final TextView titleTextView;
        public final int verificationType;
        public boolean waitingForEvent;

        public final class AnonymousClass5 extends TimerTask {
            public AnonymousClass5() {
            }

            @Override
            public final void run() {
                PhoneConfirmationView phoneConfirmationView = PhoneConfirmationView.this;
                if (phoneConfirmationView.timeTimer == null) {
                    return;
                }
                double dCurrentTimeMillis = System.currentTimeMillis();
                phoneConfirmationView.time = (int) (((double) phoneConfirmationView.time) - (dCurrentTimeMillis - phoneConfirmationView.lastCurrentTime));
                phoneConfirmationView.lastCurrentTime = dCurrentTimeMillis;
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda21(this, 5));
            }
        }

        public PhoneConfirmationView(Context context, int i) {
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
            textView.setTextSize(1, 14.0f);
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            TextView textView2 = new TextView(context);
            this.titleTextView = textView2;
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(18.0f, Theme.getColor(null, i3, false), 1, textView2);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setGravity(49);
            if (i == 3) {
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                FrameLayout frameLayout = new FrameLayout(context);
                addView(frameLayout, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3));
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.phone_activate);
                boolean z = LocaleController.isRTL;
                if (z) {
                    frameLayout.addView(imageView, LayoutHelper.createFrame(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                    frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, z ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                    frameLayout.addView(imageView, LayoutHelper.createFrame(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
                }
            } else {
                textView.setGravity(49);
                FrameLayout frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, LayoutHelper.createLinear(-2, -2, 49));
                if (i == 1) {
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.sms_devices);
                    int color = Theme.getColor(null, i3, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView2.setColorFilter(new PorterDuffColorFilter(color, mode));
                    frameLayout2.addView(imageView2, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    ImageView imageView3 = new ImageView(context);
                    this.blueImageView = imageView3;
                    imageView3.setImageResource(R.drawable.sms_bubble);
                    imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_actionBackground, false), mode));
                    frameLayout2.addView(imageView3, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    textView2.setText(LocaleController.getString(R.string.SentAppCodeTitle));
                } else {
                    ImageView imageView4 = new ImageView(context);
                    this.blueImageView = imageView4;
                    imageView4.setImageResource(R.drawable.sms_code);
                    imageView4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_actionBackground, false), PorterDuff.Mode.MULTIPLY));
                    frameLayout2.addView(imageView4, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    textView2.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
                }
                addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 0, 18, 0, 0));
                addView(textView, LayoutHelper.createLinear(-2, -2, 49, 0, 17, 0, 0));
            }
            LinearLayout linearLayout = new LinearLayout(context);
            this.codeFieldContainer = linearLayout;
            linearLayout.setOrientation(0);
            addView(linearLayout, LayoutHelper.createLinear(-2, 36, 1));
            if (i == 3) {
                linearLayout.setVisibility(8);
            }
            ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 19);
            this.timeText = anonymousClass9;
            anonymousClass9.setTextColor(Theme.getColor(null, i2, false));
            anonymousClass9.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (i == 3) {
                anonymousClass9.setTextSize(1, 14.0f);
                addView(anonymousClass9, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3));
                ProgressView progressView = new ProgressView(context);
                this.progressView = progressView;
                anonymousClass9.setGravity(LocaleController.isRTL ? 5 : 3);
                addView(progressView, LayoutHelper.createLinear(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
            } else {
                anonymousClass9.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
                anonymousClass9.setTextSize(1, 15.0f);
                anonymousClass9.setGravity(49);
                addView(anonymousClass9, LayoutHelper.createLinear(-2, -2, 49));
            }
            ArticleViewer.AnonymousClass9 anonymousClass10 = new ArticleViewer.AnonymousClass9(context, 20);
            this.problemText = anonymousClass10;
            anonymousClass10.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            anonymousClass10.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            anonymousClass10.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
            anonymousClass10.setTextSize(1, 15.0f);
            anonymousClass10.setGravity(49);
            if (i == 1) {
                anonymousClass10.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
            } else {
                anonymousClass10.setText(LocaleController.getString(R.string.DidNotGetTheCode));
            }
            addView(anonymousClass10, LayoutHelper.createLinear(-2, -2, 49));
            anonymousClass10.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 14));
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

        public final void destroyCodeTimer$1() {
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

        public final void destroyTimer$1() {
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

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
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

        @Override
        public final boolean needBackButton() {
            return true;
        }

        @Override
        public final boolean onBackPressed(boolean z) {
            PassportActivity passportActivity = PassportActivity.this;
            if (!z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.AppName);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.StopVerification);
                builder.setPositiveButton(LocaleController.getString(R.string.Continue), null);
                builder.setNegativeButton(LocaleController.getString(R.string.Stop), new PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda2(this, 0));
                passportActivity.showDialog(alertDialog);
                return false;
            }
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.phone;
            tL_auth_cancelCode.phone_code_hash = this.phoneHash;
            ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(tL_auth_cancelCode, new PassportActivity$$ExternalSyntheticLambda1(14), 2);
            destroyTimer$1();
            destroyCodeTimer$1();
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
        public final void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public final void onDestroyActivity() {
            int i = this.verificationType;
            if (i == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            destroyTimer$1();
            destroyCodeTimer$1();
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            super.onLayout(z, i, i2, i3, i4);
            if (this.verificationType == 3 || this.blueImageView == null) {
                return;
            }
            int bottom = this.confirmTextView.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            ArticleViewer.AnonymousClass9 anonymousClass9 = this.problemText;
            if (anonymousClass9.getVisibility() == 0) {
                int measuredHeight2 = anonymousClass9.getMeasuredHeight();
                i5 = (measuredHeight + bottom) - measuredHeight2;
                anonymousClass9.layout(anonymousClass9.getLeft(), i5, anonymousClass9.getRight(), measuredHeight2 + i5);
            } else {
                ArticleViewer.AnonymousClass9 anonymousClass10 = this.timeText;
                if (anonymousClass10.getVisibility() == 0) {
                    int measuredHeight3 = anonymousClass10.getMeasuredHeight();
                    i5 = (measuredHeight + bottom) - measuredHeight3;
                    anonymousClass10.layout(anonymousClass10.getLeft(), i5, anonymousClass10.getRight(), measuredHeight3 + i5);
                } else {
                    i5 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.codeFieldContainer;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int iM = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i5 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), iM, linearLayout.getRight(), measuredHeight4 + iM);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            ImageView imageView;
            super.onMeasure(i, i2);
            if (this.verificationType == 3 || (imageView = this.blueImageView) == null) {
                return;
            }
            int iDp = AndroidUtilities.dp(35.0f) + this.confirmTextView.getMeasuredHeight() + this.titleTextView.getMeasuredHeight() + imageView.getMeasuredHeight();
            int iDp2 = AndroidUtilities.dp(80.0f);
            int iDp3 = AndroidUtilities.dp(291.0f);
            PassportActivity passportActivity = PassportActivity.this;
            if (passportActivity.scrollHeight - iDp < iDp2) {
                setMeasuredDimension(getMeasuredWidth(), iDp + iDp2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(passportActivity.scrollHeight, iDp3));
            }
        }

        @Override
        public final void onNextPressed(String str) {
            if (this.nextPressed) {
                return;
            }
            String code = getCode();
            if (TextUtils.isEmpty(code)) {
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
            PassportActivity passportActivity = PassportActivity.this;
            passportActivity.showEditDoneProgress$2(true, true);
            TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
            verifyphone.phone_number = this.phone;
            verifyphone.phone_code = code;
            verifyphone.phone_code_hash = this.phoneHash;
            destroyTimer$1();
            passportActivity.needShowProgress$1();
            ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(verifyphone, new ProfileActivity$$ExternalSyntheticLambda65(4, this, verifyphone), 2);
        }

        @Override
        public final void onShow() {
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

        public final void resendCode$1() {
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            this.nextPressed = true;
            PassportActivity passportActivity = PassportActivity.this;
            passportActivity.needShowProgress$1();
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = this.phone;
            tL_auth_resendCode.phone_code_hash = this.phoneHash;
            ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(tL_auth_resendCode, new LinkManager$$ExternalSyntheticLambda0(this, bundle, tL_auth_resendCode, 16), 2);
        }

        @Override
        public final void setParams(Bundle bundle, boolean z) {
            int i;
            int i2;
            int i3 = 3;
            if (bundle == null) {
                return;
            }
            this.waitingForEvent = true;
            int i4 = this.verificationType;
            if (i4 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i4 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.phone = bundle.getString("phone");
            this.phoneHash = bundle.getString("phoneHash");
            int i5 = bundle.getInt("timeout");
            this.time = i5;
            this.timeout = i5;
            this.nextType = bundle.getInt("nextType");
            this.pattern = bundle.getString("pattern");
            int i6 = bundle.getInt("length");
            this.length = i6;
            if (i6 == 0) {
                this.length = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
            CharSequence charSequenceReplaceTags = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.length) {
                int i7 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.codeField;
                    if (i7 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    editTextBoldCursorArr2[i7].setText("");
                    i7++;
                }
            } else {
                this.codeField = new EditTextBoldCursor[this.length];
                final int i8 = 0;
                while (i8 < this.length) {
                    this.codeField[i8] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.codeField[i8];
                    int i9 = Theme.key_windowBackgroundWhiteBlackText;
                    editTextBoldCursor.setTextColor(Theme.getColor(null, i9, false));
                    this.codeField[i8].setCursorColor(Theme.getColor(null, i9, false));
                    this.codeField[i8].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.codeField[i8].setCursorWidth(1.5f);
                    Drawable drawableMutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), PorterDuff.Mode.MULTIPLY));
                    this.codeField[i8].setBackgroundDrawable(drawableMutate);
                    this.codeField[i8].setImeOptions(268435461);
                    this.codeField[i8].setTextSize(1, 20.0f);
                    this.codeField[i8].setMaxLines(1);
                    this.codeField[i8].setTypeface(AndroidUtilities.bold());
                    this.codeField[i8].setPadding(0, 0, 0, 0);
                    this.codeField[i8].setGravity(49);
                    if (i4 == 3) {
                        this.codeField[i8].setEnabled(false);
                        this.codeField[i8].setInputType(0);
                        this.codeField[i8].setVisibility(8);
                    } else {
                        this.codeField[i8].setInputType(3);
                    }
                    this.codeFieldContainer.addView(this.codeField[i8], LayoutHelper.createLinear(34, 36, 1, 0, 0, i8 != this.length - 1 ? 7 : 0, 0));
                    this.codeField[i8].addTextChangedListener(new ColorPicker.AnonymousClass4(this, i8, i3));
                    this.codeField[i8].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                            PassportActivity.PhoneConfirmationView phoneConfirmationView = this.f$0;
                            if (i10 != 67) {
                                phoneConfirmationView.getClass();
                                return false;
                            }
                            EditTextBoldCursor[] editTextBoldCursorArr3 = phoneConfirmationView.codeField;
                            int i11 = i8;
                            if (editTextBoldCursorArr3[i11].length() != 0 || i11 <= 0) {
                                return false;
                            }
                            int i12 = i11 - 1;
                            EditTextBoldCursor editTextBoldCursor2 = phoneConfirmationView.codeField[i12];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                            phoneConfirmationView.codeField[i12].requestFocus();
                            phoneConfirmationView.codeField[i12].dispatchKeyEvent(keyEvent);
                            return true;
                        }
                    });
                    this.codeField[i8].setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 20));
                    i8++;
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
            if (i4 == 2) {
                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(strM)));
            } else if (i4 == 3) {
                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(strM)));
            } else if (i4 == 4) {
                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(strM)));
            }
            this.confirmTextView.setText(charSequenceReplaceTags);
            if (i4 != 3) {
                AndroidUtilities.showKeyboard(this.codeField[0]);
                this.codeField[0].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.codeField[0]);
            }
            destroyTimer$1();
            destroyCodeTimer$1();
            this.lastCurrentTime = System.currentTimeMillis();
            ArticleViewer.AnonymousClass9 anonymousClass9 = this.problemText;
            ArticleViewer.AnonymousClass9 anonymousClass10 = this.timeText;
            if (i4 == 3 && ((i2 = this.nextType) == 4 || i2 == 2)) {
                anonymousClass9.setVisibility(8);
                anonymousClass10.setVisibility(0);
                int i10 = this.nextType;
                if (i10 == 4) {
                    anonymousClass10.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                } else if (i10 == 2) {
                    anonymousClass10.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                }
                if (this.timeTimer != null) {
                    return;
                }
                Timer timer = new Timer();
                this.timeTimer = timer;
                timer.schedule(new AnonymousClass5(), 0L, 1000L);
                return;
            }
            if (i4 == 2 && ((i = this.nextType) == 4 || i == 3)) {
                anonymousClass10.setText(LocaleController.formatString("CallText", R.string.CallText, 2, 0));
                anonymousClass9.setVisibility(this.time < 1000 ? 0 : 8);
                anonymousClass10.setVisibility(this.time < 1000 ? 8 : 0);
                if (this.timeTimer != null) {
                    return;
                }
                Timer timer2 = new Timer();
                this.timeTimer = timer2;
                timer2.schedule(new AnonymousClass5(), 0L, 1000L);
                return;
            }
            if (i4 == 4 && this.nextType == 2) {
                anonymousClass10.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
                anonymousClass9.setVisibility(this.time < 1000 ? 0 : 8);
                anonymousClass10.setVisibility(this.time < 1000 ? 8 : 0);
                if (this.timeTimer != null) {
                    return;
                }
                Timer timer3 = new Timer();
                this.timeTimer = timer3;
                timer3.schedule(new AnonymousClass5(), 0L, 1000L);
                return;
            }
            anonymousClass10.setVisibility(8);
            anonymousClass9.setVisibility(8);
            if (this.codeTimer != null) {
                return;
            }
            this.codeTime = 15000;
            this.codeTimer = new Timer();
            this.lastCodeTime = System.currentTimeMillis();
            this.codeTimer.schedule(new zzq(this, i3), 0L, 1000L);
        }
    }

    public final class ProgressView extends View {
        public final Paint paint;
        public final Paint paint2;
        public float progress;

        public ProgressView(Context context) {
            super(context);
            Paint paint = new Paint();
            this.paint = paint;
            Paint paint2 = new Paint();
            this.paint2 = paint2;
            paint.setColor(Theme.getColor(null, Theme.key_login_progressInner, false));
            paint2.setColor(Theme.getColor(null, Theme.key_login_progressOuter, false));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float measuredWidth = (int) (getMeasuredWidth() * this.progress);
            canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.paint2);
            canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
        }
    }

    public final class SecureDocumentCell extends FrameLayout implements DownloadController.FileDownloadProgressListener {
        public final int TAG;
        public int buttonState;
        public SecureDocument currentSecureDocument;
        public final BackupImageView imageView;
        public final RadialProgress radialProgress;
        public final TextView textView;
        public final TextView valueTextView;

        public SecureDocumentCell(Activity activity) {
            super(activity);
            this.TAG = DownloadController.getInstance(((BaseFragment) PassportActivity.this).currentAccount).generateObserverTag();
            this.radialProgress = new RadialProgress(this);
            BackupImageView backupImageView = new BackupImageView(activity);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 8.0f, 21.0f, 0.0f));
            TextView textView = new TextView(activity);
            this.textView = textView;
            ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 16.0f, 1, true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 81, 10.0f, z ? 81 : 21, 0.0f));
            TextView textView2 = new TextView(activity);
            this.valueTextView = textView2;
            textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
            textView2.setTextSize(1, 13.0f);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setPadding(0, 0, 0, 0);
            boolean z2 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 81, 35.0f, z2 ? 81 : 21, 0.0f));
            setWillNotDraw(false);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
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
        public final void invalidate() {
            super.invalidate();
            this.textView.invalidate();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }

        @Override
        public final void onFailedDownload(String str, boolean z) {
            updateButtonState(false);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BackupImageView backupImageView = this.imageView;
            int measuredWidth = ((backupImageView.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) / 2) + backupImageView.getLeft();
            int measuredHeight = ((backupImageView.getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2) + backupImageView.getTop();
            this.radialProgress.setProgressRect(measuredWidth, measuredHeight, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + measuredHeight);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), zzkm.m(64.0f, 1));
        }

        @Override
        public final void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
            if (this.buttonState != 1) {
                updateButtonState(false);
            }
        }

        @Override
        public final void onProgressUpload(String str, long j, long j2, boolean z) {
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
        }

        @Override
        public final void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        public void setValue(CharSequence charSequence) {
            this.valueTextView.setText(charSequence);
        }

        public final void updateButtonState(boolean z) {
            String attachFileName = FileLoader.getAttachFileName(this.currentSecureDocument);
            boolean zExists = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.currentSecureDocument).exists();
            boolean zIsEmpty = TextUtils.isEmpty(attachFileName);
            RadialProgress radialProgress = this.radialProgress;
            if (zIsEmpty) {
                radialProgress.setBackground(null, false, false);
                return;
            }
            SecureDocument secureDocument = this.currentSecureDocument;
            String str = secureDocument.path;
            TextView textView = this.textView;
            PassportActivity passportActivity = PassportActivity.this;
            if (str != null) {
                if (secureDocument.inputFile != null) {
                    DownloadController.getInstance(((BaseFragment) passportActivity).currentAccount).removeLoadingFileObserver(this);
                    radialProgress.setBackground(null, false, z);
                    this.buttonState = -1;
                    return;
                }
                DownloadController.getInstance(((BaseFragment) passportActivity).currentAccount).addLoadingFileObserver(this.currentSecureDocument.path, this);
                this.buttonState = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(this.currentSecureDocument.path);
                radialProgress.setBackground(getResources().getDrawable(R.drawable.circle), true, z);
                radialProgress.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
                super.invalidate();
                textView.invalidate();
                return;
            }
            if (zExists) {
                DownloadController.getInstance(((BaseFragment) passportActivity).currentAccount).removeLoadingFileObserver(this);
                this.buttonState = -1;
                radialProgress.setBackground(null, false, z);
                super.invalidate();
                textView.invalidate();
                return;
            }
            DownloadController.getInstance(((BaseFragment) passportActivity).currentAccount).addLoadingFileObserver(attachFileName, this);
            this.buttonState = 1;
            Float fileProgress2 = ImageLoader.getInstance().getFileProgress(attachFileName);
            radialProgress.setBackground(getResources().getDrawable(R.drawable.circle), true, z);
            radialProgress.setProgress(fileProgress2 != null ? fileProgress2.floatValue() : 0.0f, z);
            super.invalidate();
            textView.invalidate();
        }
    }

    public final class TextDetailSecureCell extends FrameLayout {
        public final ImageView checkImageView;
        public boolean needDivider;
        public final TextView textView;
        public final TextView valueTextView;

        public TextDetailSecureCell(PassportActivity passportActivity, Context context) {
            super(context);
            int i = passportActivity.currentActivityType == 8 ? 21 : 51;
            TextView textView = new TextView(context);
            this.textView = textView;
            ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 16.0f, 1, true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? i : 21, 10.0f, z ? 21 : i, 0.0f));
            TextView textView2 = new TextView(context);
            this.valueTextView = textView2;
            textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
            textView2.setTextSize(1, 13.0f);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(truncateAt);
            textView2.setPadding(0, 0, 0, 0);
            boolean z2 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? i : 21, 35.0f, z2 ? 21 : i, 0.0f));
            ImageView imageView = new ImageView(context);
            this.checkImageView = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_featuredStickers_addedIcon, false), PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(R.drawable.sticker_added);
            addView(imageView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 25.0f, 21.0f, 0.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
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

        public void setValue(CharSequence charSequence) {
            this.valueTextView.setText(charSequence);
        }
    }

    public PassportActivity(int i, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap map, HashMap map2) {
        super(null);
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
            public final void deleteImageAtIndex(int i2) {
                SecureDocument secureDocument;
                PassportActivity passportActivity = PassportActivity.this;
                int i3 = passportActivity.uploadingFileType;
                if (i3 == 1) {
                    secureDocument = passportActivity.selfieDocument;
                } else if (i3 == 4) {
                    secureDocument = (SecureDocument) passportActivity.translationDocuments.get(i2);
                } else if (i3 == 2) {
                    secureDocument = passportActivity.frontDocument;
                } else {
                    secureDocument = i3 == 3 ? passportActivity.reverseDocument : (SecureDocument) passportActivity.documents.get(i2);
                }
                SecureDocumentCell secureDocumentCell = (SecureDocumentCell) passportActivity.documentsCells.remove(secureDocument);
                if (secureDocumentCell == null) {
                    return;
                }
                String documentHash = PassportActivity.getDocumentHash(secureDocument);
                int i4 = passportActivity.uploadingFileType;
                String strM = null;
                if (i4 == 1) {
                    passportActivity.selfieDocument = null;
                    strM = zzil.m("selfie", documentHash);
                } else if (i4 == 4) {
                    strM = zzil.m("translation", documentHash);
                } else if (i4 == 2) {
                    passportActivity.frontDocument = null;
                    strM = zzil.m("front", documentHash);
                } else if (i4 == 3) {
                    passportActivity.reverseDocument = null;
                    strM = zzil.m("reverse", documentHash);
                } else if (i4 == 0) {
                    strM = zzil.m("files", documentHash);
                }
                if (strM != null) {
                    HashMap map3 = passportActivity.documentsErrors;
                    if (map3 != null) {
                        map3.remove(strM);
                    }
                    HashMap map4 = passportActivity.errorsValues;
                    if (map4 != null) {
                        map4.remove(strM);
                    }
                }
                passportActivity.updateUploadText(passportActivity.uploadingFileType);
                passportActivity.currentPhotoViewerLayout.removeView(secureDocumentCell);
            }

            @Override
            public final String getDeleteMessageString() {
                return PassportActivity.this.uploadingFileType == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
            }

            @Override
            public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i2, boolean z, boolean z2) {
                if (i2 < 0) {
                    return null;
                }
                PassportActivity passportActivity = PassportActivity.this;
                if (i2 >= passportActivity.currentPhotoViewerLayout.getChildCount()) {
                    return null;
                }
                SecureDocumentCell secureDocumentCell = (SecureDocumentCell) passportActivity.currentPhotoViewerLayout.getChildAt(i2);
                int[] iArr = new int[2];
                secureDocumentCell.imageView.getLocationInWindow(iArr);
                PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                placeProviderObject.viewX = iArr[0];
                placeProviderObject.viewY = iArr[1];
                placeProviderObject.parentView = passportActivity.currentPhotoViewerLayout;
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
            this.permissionsItems = new ArrayList();
        } else if (i == 7) {
            this.views = new SlideView[3];
        }
        if (map == null) {
            this.currentValues = new HashMap();
        }
        if (map2 == null) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new PassportActivity$$ExternalSyntheticLambda1(0));
        }
    }

    public static int access$2000(PassportActivity passportActivity, String str) {
        passportActivity.getClass();
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

    public static boolean access$2200(PassportActivity passportActivity) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        boolean z;
        View view;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = passportActivity.currentDocumentsType;
        HashMap map = passportActivity.errorsValues;
        if (tL_secureRequiredType != null) {
            if (map.containsKey("error_all") || map.containsKey("error_document_all")) {
                passportActivity.onFieldError(passportActivity.topErrorCell);
                return true;
            }
            TextSettingsCell textSettingsCell = passportActivity.uploadDocumentCell;
            HashMap map2 = passportActivity.documentsCells;
            if (textSettingsCell != null) {
                ArrayList arrayList = passportActivity.documents;
                if (arrayList.isEmpty()) {
                    passportActivity.onFieldError(passportActivity.uploadDocumentCell);
                    return true;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    SecureDocument secureDocument = (SecureDocument) arrayList.get(i);
                    String str = "files" + getDocumentHash(secureDocument);
                    if (str != null && map.containsKey(str)) {
                        passportActivity.onFieldError((View) map2.get(secureDocument));
                        return true;
                    }
                }
            }
            if (map.containsKey("files_all") || map.containsKey("translation_all")) {
                passportActivity.onFieldError(passportActivity.bottomCell);
                return true;
            }
            View view2 = passportActivity.uploadFrontCell;
            if (view2 != null) {
                if (passportActivity.frontDocument == null) {
                    passportActivity.onFieldError(view2);
                    return true;
                }
                if (map.containsKey("front" + getDocumentHash(passportActivity.frontDocument))) {
                    passportActivity.onFieldError((View) map2.get(passportActivity.frontDocument));
                    return true;
                }
            }
            TLRPC.SecureValueType secureValueType = passportActivity.currentDocumentsType.type;
            if (((secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) && (view = passportActivity.uploadReverseCell) != null) {
                if (passportActivity.reverseDocument == null) {
                    passportActivity.onFieldError(view);
                    return true;
                }
                if (map.containsKey("reverse" + getDocumentHash(passportActivity.reverseDocument))) {
                    passportActivity.onFieldError((View) map2.get(passportActivity.reverseDocument));
                    return true;
                }
            }
            View view3 = passportActivity.uploadSelfieCell;
            if (view3 != null && passportActivity.currentBotId != 0) {
                if (passportActivity.selfieDocument == null) {
                    passportActivity.onFieldError(view3);
                    return true;
                }
                if (map.containsKey("selfie" + getDocumentHash(passportActivity.selfieDocument))) {
                    passportActivity.onFieldError((View) map2.get(passportActivity.selfieDocument));
                    return true;
                }
            }
            if (passportActivity.uploadTranslationCell != null && passportActivity.currentBotId != 0) {
                ArrayList arrayList2 = passportActivity.translationDocuments;
                if (arrayList2.isEmpty()) {
                    passportActivity.onFieldError(passportActivity.uploadTranslationCell);
                    return true;
                }
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    SecureDocument secureDocument2 = (SecureDocument) arrayList2.get(i2);
                    if (map.containsKey("translation" + getDocumentHash(secureDocument2))) {
                        passportActivity.onFieldError((View) map2.get(secureDocument2));
                        return true;
                    }
                }
            }
        }
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                editTextBoldCursorArr = passportActivity.inputFields;
            } else {
                TextInfoPrivacyCell textInfoPrivacyCell = passportActivity.nativeInfoCell;
                editTextBoldCursorArr = (textInfoPrivacyCell == null || textInfoPrivacyCell.getVisibility() != 0) ? null : passportActivity.inputExtraFields;
            }
            if (editTextBoldCursorArr != null) {
                int i4 = 0;
                while (i4 < editTextBoldCursorArr.length) {
                    boolean zHasErrorText = editTextBoldCursorArr[i4].hasErrorText();
                    if (!map.isEmpty()) {
                        TLRPC.SecureValueType secureValueType2 = passportActivity.currentType.type;
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
                            String str3 = (String) map.get(str2);
                            if (!TextUtils.isEmpty(str3) && str3.equals(editTextBoldCursorArr[i4].getText().toString())) {
                                zHasErrorText = true;
                            }
                        }
                    }
                    if (!passportActivity.documentOnly || passportActivity.currentDocumentsType == null || i4 >= 7) {
                        if (!zHasErrorText) {
                            int length = editTextBoldCursorArr[i4].length();
                            int i5 = passportActivity.currentActivityType;
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    if (i4 == 1) {
                                        continue;
                                    } else if (i4 == 3) {
                                        if (length < 2) {
                                            zHasErrorText = true;
                                        }
                                    } else if (i4 == 4) {
                                        if (!"US".equals(passportActivity.currentCitizeship)) {
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
                                    passportActivity.onFieldError(editTextBoldCursorArr[i4]);
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
                                        passportActivity.onFieldError(editTextBoldCursorArr[i4]);
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
                                    passportActivity.onFieldError(editTextBoldCursorArr[i4]);
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        } else if (zHasErrorText) {
                            passportActivity.onFieldError(editTextBoldCursorArr[i4]);
                            return true;
                        }
                    }
                    i4++;
                }
            }
        }
        return false;
    }

    public static void access$6500(PassportActivity passportActivity, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z) {
        String str2;
        String str3;
        String str4;
        HashMap map = passportActivity.errorsValues;
        if (map == null || (str2 = (String) map.get(str)) == null || !TextUtils.equals(str2, editable)) {
            editTextBoldCursor.setErrorText(null);
        } else {
            HashMap map2 = passportActivity.fieldsErrors;
            if (map2 == null || (str4 = (String) map2.get(str)) == null) {
                HashMap map3 = passportActivity.documentsErrors;
                if (map3 != null && (str3 = (String) map3.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str3);
                }
            } else {
                editTextBoldCursor.setErrorText(str4);
            }
        }
        String str5 = z ? "error_document_all" : "error_all";
        HashMap map4 = passportActivity.errorsValues;
        if (map4 == null || !map4.containsKey(str5)) {
            return;
        }
        map4.remove(str5);
        passportActivity.checkTopErrorCell(false);
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

    public static String decryptData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
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

    public static String getDocumentHash(SecureDocument secureDocument) {
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

    public static String getNameForType(TLRPC.SecureValueType secureValueType) {
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

    public static byte[] getRandomSecret() {
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

    public static String getTextForType(TLRPC.SecureValueType secureValueType) {
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

    public static boolean isAddressDocument(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) || (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) || (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement);
    }

    public static boolean isPersonalDocument(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard);
    }

    public final void addDocumentView(final SecureDocument secureDocument, final int i) {
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
        TextView textView = secureDocumentCell.valueTextView;
        if (str2 == null || (map = this.documentsErrors) == null || (dateForBan = (String) map.get(str2)) == null) {
            dateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        } else {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            this.errorsValues.put(str2, "");
        }
        secureDocumentCell.textView.setText(string);
        textView.setText(dateForBan);
        BackupImageView backupImageView = secureDocumentCell.imageView;
        backupImageView.getClass();
        backupImageView.setImage(ImageLocation.getForSecureDocument(secureDocument), "48_48", null, null, null, null, 0, null);
        secureDocumentCell.currentSecureDocument = secureDocument;
        secureDocumentCell.updateButtonState(false);
        secureDocumentCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i, 17));
        secureDocumentCell.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                PassportActivity passportActivity = this.f$0;
                AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity(), 0, null);
                int i2 = i;
                AlertDialog alertDialog = builder.alertDialog;
                if (i2 == 1) {
                    alertDialog.message = LocaleController.getString(R.string.PassportDeleteSelfie);
                } else {
                    alertDialog.message = LocaleController.getString(R.string.PassportDeleteScan);
                }
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                alertDialog.title = LocaleController.getString(R.string.AppName);
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new PassportActivity$$ExternalSyntheticLambda66(passportActivity, secureDocument, i2, secureDocumentCell, str2, 0));
                passportActivity.showDialog(alertDialog);
                return true;
            }
        });
    }

    public final void addDocumentViewInternal(TLRPC.TL_secureFile tL_secureFile, int i) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] bArrComputeSHA512 = Utilities.computeSHA512(decryptValueSecret(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(bArrComputeSHA512, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArrComputeSHA512, 32, bArr4, 0, 16);
        addDocumentView(new SecureDocument(new SecureDocumentKey(bArr3, bArr4), tL_secureFile, null, null, null), i);
    }

    public final TextDetailSecureCell addField(Context context, TLRPC.TL_secureRequiredType tL_secureRequiredType, ArrayList arrayList, boolean z, boolean z2) {
        String string;
        String str;
        String strDecryptData;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureValue valueByType;
        String string2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType;
        int size = arrayList != null ? arrayList.size() : 0;
        TextDetailSecureCell textDetailSecureCell = new TextDetailSecureCell(this, context);
        textDetailSecureCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType3.type;
        boolean z3 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
        TextView textView = textDetailSecureCell.valueTextView;
        TextView textView2 = textDetailSecureCell.textView;
        if (z3) {
            if (arrayList == null || arrayList.isEmpty()) {
                string2 = LocaleController.getString(R.string.PassportPersonalDetails);
            } else if (z && arrayList.size() == 1) {
                string2 = getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type);
            } else {
                string2 = (z && arrayList.size() == 2) ? LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : LocaleController.getString(R.string.PassportIdentityDocument);
            }
            textView2.setText(string2);
            textView.setText("");
            textDetailSecureCell.needDivider = !z2;
            textDetailSecureCell.setWillNotDraw(z2);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            if (arrayList == null || arrayList.isEmpty()) {
                string = LocaleController.getString(R.string.PassportAddress);
            } else if (z && arrayList.size() == 1) {
                string = getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type);
            } else {
                string = (z && arrayList.size() == 2) ? LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), getTextForType(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : LocaleController.getString(R.string.PassportResidentialAddress);
            }
            textView2.setText(string);
            textView.setText("");
            textDetailSecureCell.needDivider = !z2;
            textDetailSecureCell.setWillNotDraw(z2);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            textView2.setText(LocaleController.getString(R.string.PassportPhone));
            textView.setText("");
            textDetailSecureCell.needDivider = !z2;
            textDetailSecureCell.setWillNotDraw(z2);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            textView2.setText(LocaleController.getString(R.string.PassportEmail));
            textView.setText("");
            textDetailSecureCell.needDivider = !z2;
            textDetailSecureCell.setWillNotDraw(z2);
        }
        if (this.currentActivityType == 8) {
            LinearLayout linearLayout = this.linearLayout2;
            linearLayout.addView(textDetailSecureCell, linearLayout.getChildCount() - 5, LayoutHelper.createLinear(-1, -2));
        } else {
            this.linearLayout2.addView(textDetailSecureCell, LayoutHelper.createLinear(-1, -2));
        }
        textDetailSecureCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda55(arrayList, tL_secureRequiredType3, this, z));
        this.typesViews.put(tL_secureRequiredType3, textDetailSecureCell);
        HashMap map = this.typesValues;
        map.put(tL_secureRequiredType3, new HashMap());
        TLRPC.TL_secureValue valueByType2 = getValueByType(tL_secureRequiredType3, false);
        String str2 = null;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = null;
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
        } else {
            int size2 = arrayList.size();
            String strDecryptData2 = null;
            int i = 0;
            boolean z4 = false;
            while (i < size2) {
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList.get(i);
                map.put(tL_secureRequiredType5, new HashMap());
                this.documentsToTypesLink.put(tL_secureRequiredType5, tL_secureRequiredType3);
                if (!z4 && (valueByType = getValueByType(tL_secureRequiredType5, false)) != null) {
                    TLRPC.TL_secureData tL_secureData2 = valueByType.data;
                    if (tL_secureData2 != null) {
                        strDecryptData2 = decryptData(tL_secureData2.data, decryptValueSecret(tL_secureData2.secret, tL_secureData2.data_hash), valueByType.data.data_hash);
                    }
                    tL_secureRequiredType4 = tL_secureRequiredType5;
                    z4 = true;
                }
                i++;
                tL_secureRequiredType3 = tL_secureRequiredType;
            }
            if (tL_secureRequiredType4 == null) {
                tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) arrayList.get(0);
            }
            tL_secureRequiredType2 = tL_secureRequiredType4;
            str2 = strDecryptData2;
        }
        setTypeValue(tL_secureRequiredType, str, strDecryptData, tL_secureRequiredType2, str2, z, size);
        return textDetailSecureCell;
    }

    public final void callCallback(boolean z) {
        if (this.callbackCalled) {
            return;
        }
        String str = this.currentCallbackUrl;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        int i = this.currentActivityType;
        if (zIsEmpty) {
            if (this.needActivityResult) {
                if (z || (!this.ignoreOnFailure && (i == 5 || i == 0))) {
                    getParentActivity().setResult(z ? -1 : 0);
                }
                this.callbackCalled = true;
                return;
            }
            return;
        }
        if (z) {
            Browser.openUrl(getParentActivity(), Uri.parse(str + "&tg_passport=success"), true, true);
        } else if (!this.ignoreOnFailure && (i == 5 || i == 0)) {
            Browser.openUrl(getParentActivity(), Uri.parse(str + "&tg_passport=cancel"), true, true);
        }
        this.callbackCalled = true;
    }

    public final boolean checkDiscard$4(boolean z) {
        String str = this.initialValues;
        if (str == null || str.equals(getCurrentValues())) {
            return false;
        }
        if (!z) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new PassportActivity$$ExternalSyntheticLambda7(this, 0));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.DiscardChanges);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.PassportDiscardChanges);
        showDialog(alertDialog);
        return true;
    }

    public final void checkNativeFields(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i = 2;
        int i2 = 0;
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
                    if (i2 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i2].getParent()).setVisibility(8);
                    i2++;
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
            AndroidUtilities.runOnUIThread(new PassportActivity$$ExternalSyntheticLambda14(this, i));
        }
    }

    public final void checkTopErrorCell(boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.topErrorCell == null) {
            return;
        }
        HashMap map = this.fieldsErrors;
        HashMap map2 = this.errorsValues;
        if (map == null || (!(z || map2.containsKey("error_all")) || (str2 = (String) this.fieldsErrors.get("error_all")) == null)) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str2);
            if (z) {
                map2.put("error_all", "");
            }
        }
        if (this.documentsErrors != null && ((z || map2.containsKey("error_document_all")) && (str = (String) this.documentsErrors.get("error_all")) != null)) {
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
            }
            if (z) {
                map2.put("error_document_all", "");
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

    public final void createAddressInterface(Context context) {
        final String str;
        String str2;
        String str3;
        int i = 8;
        int i2 = 0;
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
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
        this.topErrorCell = textInfoPrivacyCell;
        int i3 = R.drawable.greydivider_top;
        int i4 = Theme.key_windowBackgroundGrayShadow;
        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i3, i4));
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
            int i5 = Theme.key_windowBackgroundWhite;
            headerCell2.setBackgroundColor(Theme.getColor(null, i5, false));
            this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.documentsLayout = linearLayout;
            linearLayout.setOrientation(1);
            this.linearLayout2.addView(this.documentsLayout, LayoutHelper.createLinear(-1, -2));
            TextSettingsCell textSettingsCell = new TextSettingsCell(context, 0, null);
            this.uploadDocumentCell = textSettingsCell;
            textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.linearLayout2.addView(this.uploadDocumentCell, LayoutHelper.createLinear(-1, -2));
            this.uploadDocumentCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, i));
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, null);
            this.bottomCell = textInfoPrivacyCell2;
            int i6 = R.drawable.greydivider;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i6, i4));
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
            String str4 = this.noAllDocumentsErrorText;
            HashMap map = this.documentsErrors;
            HashMap map2 = this.errorsValues;
            CharSequence charSequence = str4;
            if (map != null && (str3 = (String) map.get("files_all")) != null) {
                charSequence = str4;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) this.noAllDocumentsErrorText);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_text_RedRegular, false)), 0, str3.length(), 33);
                map2.put("files_all", "");
                charSequence = spannableStringBuilder;
            }
            charSequence = str4;
            this.bottomCell.setText(charSequence);
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            if (this.currentDocumentsType.translation_required) {
                HeaderCell headerCell3 = new HeaderCell(context);
                this.headerCell = headerCell3;
                headerCell3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.headerCell.setBackgroundColor(Theme.getColor(null, i5, false));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.translationLayout = linearLayout2;
                linearLayout2.setOrientation(1);
                this.linearLayout2.addView(this.translationLayout, LayoutHelper.createLinear(-1, -2));
                TextSettingsCell textSettingsCell2 = new TextSettingsCell(context, 0, null);
                this.uploadTranslationCell = textSettingsCell2;
                textSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.linearLayout2.addView(this.uploadTranslationCell, LayoutHelper.createLinear(-1, -2));
                this.uploadTranslationCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 9));
                TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context, 24, null);
                this.bottomCellTranslation = textInfoPrivacyCell3;
                textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i6, i4));
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
                String str5 = this.noAllTranslationErrorText;
                HashMap map3 = this.documentsErrors;
                CharSequence charSequence2 = str5;
                if (map3 != null && (str2 = (String) map3.get("translation_all")) != null) {
                    charSequence2 = str5;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                    spannableStringBuilder2.append((CharSequence) "\n\n");
                    spannableStringBuilder2.append((CharSequence) this.noAllTranslationErrorText);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_text_RedRegular, false)), 0, str2.length(), 33);
                    map2.put("translation_all", "");
                    charSequence2 = spannableStringBuilder2;
                }
                charSequence2 = str5;
                this.bottomCellTranslation.setText(charSequence2);
                this.linearLayout2.addView(this.bottomCellTranslation, LayoutHelper.createLinear(-1, -2));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        HeaderCell headerCell4 = new HeaderCell(context);
        this.headerCell = headerCell4;
        headerCell4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        this.headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
        this.inputFields = new EditTextBoldCursor[6];
        for (int i7 = 0; i7 < 6; i7++) {
            final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.inputFields[i7] = editTextBoldCursor;
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(context, editTextBoldCursor, i2);
            anonymousClass11.setWillNotDraw(false);
            this.linearLayout2.addView(anonymousClass11, LayoutHelper.createLinear(-1, -2));
            int i8 = Theme.key_windowBackgroundWhite;
            anonymousClass11.setBackgroundColor(Theme.getColor(null, i8, false));
            if (i7 == 5) {
                View view = new View(context);
                this.extraBackgroundView = view;
                view.setBackgroundColor(Theme.getColor(null, i8, false));
                this.linearLayout2.addView(this.extraBackgroundView, LayoutHelper.createLinear(-1, 6));
            }
            if (this.documentOnly && this.currentDocumentsType != null) {
                anonymousClass11.setVisibility(8);
                View view2 = this.extraBackgroundView;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.inputFields[i7].setTag(Integer.valueOf(i7));
            this.inputFields[i7].setSupportRtlHint(true);
            this.inputFields[i7].setTextSize(1, 16.0f);
            this.inputFields[i7].setHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            this.inputFields[i7].setHeaderHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
            this.inputFields[i7].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i7];
            int i9 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor2.setTextColor(Theme.getColor(null, i9, false));
            this.inputFields[i7].setBackgroundDrawable(null);
            this.inputFields[i7].setCursorColor(Theme.getColor(null, i9, false));
            this.inputFields[i7].setCursorSize(AndroidUtilities.dp(20.0f));
            this.inputFields[i7].setCursorWidth(1.5f);
            this.inputFields[i7].setLineColors(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
            if (i7 == 5) {
                this.inputFields[i7].setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda11(this, 3));
                this.inputFields[i7].setInputType(0);
                this.inputFields[i7].setFocusable(false);
            } else {
                this.inputFields[i7].setInputType(16385);
                this.inputFields[i7].setImeOptions(268435461);
            }
            if (i7 == 0) {
                this.inputFields[i7].setHintText(LocaleController.getString(R.string.PassportStreet1));
                str = "street_line1";
            } else if (i7 == 1) {
                this.inputFields[i7].setHintText(LocaleController.getString(R.string.PassportStreet2));
                str = "street_line2";
            } else if (i7 == 2) {
                this.inputFields[i7].setHintText(LocaleController.getString(R.string.PassportPostcode));
                str = "post_code";
            } else if (i7 == 3) {
                this.inputFields[i7].setHintText(LocaleController.getString(R.string.PassportCity));
                str = "city";
            } else if (i7 != 4) {
                if (i7 == 5) {
                    this.inputFields[i7].setHintText(LocaleController.getString(R.string.PassportCountry));
                    str = "country_code";
                }
            } else {
                this.inputFields[i7].setHintText(LocaleController.getString(R.string.PassportState));
                str = "state";
            }
            setFieldValues(this.currentValues, this.inputFields[i7], str);
            if (i7 == 2) {
                this.inputFields[i7].addTextChangedListener(new TextWatcher() {
                    public boolean ignore;

                    @Override
                    public final void afterTextChanged(Editable editable) {
                        if (this.ignore) {
                            return;
                        }
                        boolean z = true;
                        this.ignore = true;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= editable.length()) {
                                z = false;
                                break;
                            }
                            char cCharAt = editable.charAt(i10);
                            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-' || cCharAt == ' '))) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        this.ignore = false;
                        EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursor;
                        if (z) {
                            editTextBoldCursor3.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        } else {
                            PassportActivity.access$6500(PassportActivity.this, editTextBoldCursor3, str, editable, false);
                        }
                    }

                    @Override
                    public final void beforeTextChanged(CharSequence charSequence3, int i10, int i11, int i12) {
                    }

                    @Override
                    public final void onTextChanged(CharSequence charSequence3, int i10, int i11, int i12) {
                    }
                });
                this.inputFields[i7].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.inputFields[i7].addTextChangedListener(new AnonymousClass13(this, editTextBoldCursor, str, i2));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.inputFields[i7];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.inputFields[i7].setPadding(0, 0, 0, 0);
            this.inputFields[i7].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            anonymousClass11.addView(this.inputFields[i7], LayoutHelper.createFrame(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.inputFields[i7].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 4));
        }
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, (Object) null);
        this.sectionCell = shadowSectionCell;
        this.linearLayout2.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
        if (this.documentOnly && this.currentDocumentsType != null) {
            this.headerCell.setVisibility(8);
            this.sectionCell.setVisibility(8);
        }
        long j = this.currentBotId;
        TLRPC.TL_secureValue tL_secureValue = this.currentDocumentsTypeValue;
        if (((j == 0 && this.currentDocumentsType != null) || this.currentTypeValue == null || this.documentOnly) && tL_secureValue == null) {
            ShadowSectionCell shadowSectionCell2 = this.sectionCell;
            int i10 = R.drawable.greydivider_bottom;
            int i11 = Theme.key_windowBackgroundGrayShadow;
            shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i10, i11));
            if (this.documentOnly && this.currentDocumentsType != null) {
                this.bottomCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i10, i11));
            }
        } else {
            if (tL_secureValue != null) {
                ArrayList<TLRPC.SecureFile> arrayList = tL_secureValue.files;
                this.documents.clear();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.SecureFile secureFile = arrayList.get(i12);
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        addDocumentViewInternal((TLRPC.TL_secureFile) secureFile, 0);
                    }
                }
                ArrayList<TLRPC.SecureFile> arrayList2 = tL_secureValue.translation;
                this.translationDocuments.clear();
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    TLRPC.SecureFile secureFile2 = arrayList2.get(i13);
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        addDocumentViewInternal((TLRPC.TL_secureFile) secureFile2, 4);
                    }
                }
            }
            ShadowSectionCell shadowSectionCell3 = this.sectionCell;
            int i14 = R.drawable.greydivider;
            int i15 = Theme.key_windowBackgroundGrayShadow;
            shadowSectionCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i14, i15));
            TextSettingsCell textSettingsCell3 = new TextSettingsCell(context, 0, null);
            textSettingsCell3.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            textSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            if (this.currentDocumentsType == null) {
                textSettingsCell3.setText(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                textSettingsCell3.setText(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.linearLayout2.addView(textSettingsCell3, LayoutHelper.createLinear(-1, -2));
            textSettingsCell3.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 10));
            ShadowSectionCell shadowSectionCell4 = new ShadowSectionCell(context, (Object) null);
            this.sectionCell = shadowSectionCell4;
            shadowSectionCell4.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, i15));
            this.linearLayout2.addView(this.sectionCell, LayoutHelper.createLinear(-1, -2));
        }
        updateUploadText(0);
        updateUploadText(4);
    }

    public final void createChatAttachView$3() {
        if (getParentActivity() != null && this.chatAttachAlert == null) {
            ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getParentActivity(), this, false, false, true, null);
            this.chatAttachAlert = chatAttachAlert;
            chatAttachAlert.delegate = new ChatAttachAlert.ChatAttachViewDelegate() {
                @Override
                public final void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                    ChatAttachAlert chatAttachAlert2;
                    PassportActivity passportActivity = PassportActivity.this;
                    if (passportActivity.getParentActivity() == null || (chatAttachAlert2 = passportActivity.chatAttachAlert) == null) {
                        return;
                    }
                    if (i != 8 && i != 7) {
                        chatAttachAlert2.dismissWithButtonClick(i);
                        passportActivity.processSelectedAttach$1(i);
                        return;
                    }
                    if (i != 8) {
                        chatAttachAlert2.dismiss(true);
                    }
                    HashMap<Object, Object> selectedPhotos = passportActivity.chatAttachAlert.photoLayout.getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = passportActivity.chatAttachAlert.photoLayout.getSelectedPhotosOrder();
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
                    passportActivity.processSelectedFiles(arrayList);
                }

                @Override
                public final void didSelectBot(TLRPC.User user) {
                }

                @Override
                public final void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
                    chatAttachAlert$$ExternalSyntheticLambda7.run();
                }

                @Override
                public final boolean needEnterComment() {
                    return false;
                }

                @Override
                public final void onCameraOpened() {
                    AndroidUtilities.hideKeyboard(PassportActivity.this.fragmentView.findFocus());
                }

                @Override
                public final void onWallpaperSelected(Object obj) {
                }

                @Override
                public final void openAvatarsSearch() {
                }

                @Override
                public final boolean selectItemOnClicking() {
                    return false;
                }

                @Override
                public final void sendAudio(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
                }
            };
        }
    }

    public final void createDocumentDeleteAlert() {
        boolean[] zArr = {true};
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), new DialogsActivity$$ExternalSyntheticLambda89(29, this, zArr));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.AppName);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        boolean z = this.documentOnly;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.currentType;
        if (z && this.currentDocumentsType == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            alertDialog.message = LocaleController.getString(R.string.PassportDeleteAddressAlert);
        } else if (z && this.currentDocumentsType == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            alertDialog.message = LocaleController.getString(R.string.PassportDeletePersonalAlert);
        } else {
            alertDialog.message = LocaleController.getString(R.string.PassportDeleteDocumentAlert);
        }
        if (!this.documentOnly && this.currentDocumentsType != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1);
            checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                checkBoxCell.setText(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                checkBoxCell.setText(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false, false);
            }
            checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48, 51));
            checkBoxCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(11, zArr));
            builder.setView(frameLayout);
        }
        showDialog(alertDialog);
    }

    public final void createIdentityInterface(Context context) {
        boolean[] zArr;
        int i;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        long j;
        int i2;
        int i3;
        int i4;
        String str;
        final String str2;
        int i5;
        String str3;
        this.languageMap = new HashMap();
        ?? r3 = 1;
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
                int i6 = 64;
                HashMap map = this.currentValues;
                if (i4 >= i3) {
                    ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, (Object) null);
                    this.sectionCell2 = shadowSectionCell;
                    this.linearLayout2.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
                    HeaderCell headerCell = new HeaderCell(context);
                    this.headerCell = headerCell;
                    headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                    int i7 = 3;
                    this.inputExtraFields = new EditTextBoldCursor[3];
                    int i8 = 0;
                    while (i8 < i7) {
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                        this.inputExtraFields[i8] = editTextBoldCursor;
                        AnonymousClass11 anonymousClass11 = new AnonymousClass11(context, editTextBoldCursor, 2);
                        anonymousClass11.setWillNotDraw(false);
                        this.linearLayout2.addView(anonymousClass11, LayoutHelper.createLinear(-1, i6));
                        int i9 = Theme.key_windowBackgroundWhite;
                        anonymousClass11.setBackgroundColor(Theme.getColor(null, i9, false));
                        if (i8 == 2) {
                            View view = new View(context);
                            this.extraBackgroundView2 = view;
                            view.setBackgroundColor(Theme.getColor(null, i9, false));
                            this.linearLayout2.addView(this.extraBackgroundView2, LayoutHelper.createLinear(-1, 6));
                        }
                        this.inputExtraFields[i8].setTag(Integer.valueOf(i8));
                        this.inputExtraFields[i8].setSupportRtlHint(true);
                        this.inputExtraFields[i8].setTextSize(1, 16.0f);
                        this.inputExtraFields[i8].setHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
                        EditTextBoldCursor editTextBoldCursor2 = this.inputExtraFields[i8];
                        int i10 = Theme.key_windowBackgroundWhiteBlackText;
                        editTextBoldCursor2.setTextColor(Theme.getColor(null, i10, false));
                        this.inputExtraFields[i8].setHeaderHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
                        this.inputExtraFields[i8].setTransformHintToHeader(true);
                        this.inputExtraFields[i8].setBackgroundDrawable(null);
                        this.inputExtraFields[i8].setCursorColor(Theme.getColor(null, i10, false));
                        this.inputExtraFields[i8].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.inputExtraFields[i8].setCursorWidth(1.5f);
                        this.inputExtraFields[i8].setLineColors(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
                        this.inputExtraFields[i8].setInputType(16385);
                        this.inputExtraFields[i8].setImeOptions(268435461);
                        if (i8 == 0) {
                            str = "first_name_native";
                        } else if (i8 != 1) {
                            if (i8 == 2) {
                                str = "last_name_native";
                            }
                            i8++;
                            i7 = 3;
                            i6 = 64;
                        } else {
                            str = "middle_name_native";
                        }
                        setFieldValues(map, this.inputExtraFields[i8], str);
                        EditTextBoldCursor editTextBoldCursor3 = this.inputExtraFields[i8];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i8 == 0 || i8 == 2 || i8 == 1) {
                            this.inputExtraFields[i8].addTextChangedListener(new AnonymousClass13(this, editTextBoldCursor, str, 1));
                        }
                        this.inputExtraFields[i8].setPadding(0, 0, 0, 0);
                        this.inputExtraFields[i8].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        anonymousClass11.addView(this.inputExtraFields[i8], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputExtraFields[i8].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 3));
                        i8++;
                        i7 = 3;
                        i6 = 64;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                    this.nativeInfoCell = textInfoPrivacyCell;
                    this.linearLayout2.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
                    long j2 = this.currentBotId;
                    TLRPC.TL_secureValue tL_secureValue = this.currentDocumentsTypeValue;
                    if (((j2 == j && this.currentDocumentsType != null) || this.currentTypeValue == null || this.documentOnly) && tL_secureValue == null) {
                        this.nativeInfoCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    } else {
                        if (tL_secureValue != null) {
                            ArrayList<TLRPC.SecureFile> arrayList = tL_secureValue.files;
                            this.documents.clear();
                            int size = arrayList.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                TLRPC.SecureFile secureFile = arrayList.get(i11);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    addDocumentViewInternal((TLRPC.TL_secureFile) secureFile, 0);
                                }
                            }
                            TLRPC.SecureFile secureFile2 = tL_secureValue.front_side;
                            if (secureFile2 instanceof TLRPC.TL_secureFile) {
                                addDocumentViewInternal((TLRPC.TL_secureFile) secureFile2, 2);
                            }
                            TLRPC.SecureFile secureFile3 = tL_secureValue.reverse_side;
                            if (secureFile3 instanceof TLRPC.TL_secureFile) {
                                addDocumentViewInternal((TLRPC.TL_secureFile) secureFile3, 3);
                            }
                            TLRPC.SecureFile secureFile4 = tL_secureValue.selfie;
                            if (secureFile4 instanceof TLRPC.TL_secureFile) {
                                addDocumentViewInternal((TLRPC.TL_secureFile) secureFile4, 1);
                            }
                            ArrayList<TLRPC.SecureFile> arrayList2 = tL_secureValue.translation;
                            this.translationDocuments.clear();
                            int size2 = arrayList2.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                TLRPC.SecureFile secureFile5 = arrayList2.get(i12);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    addDocumentViewInternal((TLRPC.TL_secureFile) secureFile5, 4);
                                }
                            }
                        }
                        TextSettingsCell textSettingsCell = new TextSettingsCell(context, 0, null);
                        textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                        textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        if (this.currentDocumentsType == null) {
                            textSettingsCell.setText(LocaleController.getString(R.string.PassportDeleteInfo), false);
                        } else {
                            textSettingsCell.setText(LocaleController.getString(R.string.PassportDeleteDocument), false);
                        }
                        this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
                        textSettingsCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 3));
                        TextInfoPrivacyCell textInfoPrivacyCell2 = this.nativeInfoCell;
                        int i13 = R.drawable.greydivider;
                        int i14 = Theme.key_windowBackgroundGrayShadow;
                        textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i13, i14));
                        ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context, (Object) null);
                        this.sectionCell = shadowSectionCell2;
                        shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, i14));
                        this.linearLayout2.addView(this.sectionCell, LayoutHelper.createLinear(-1, -2));
                    }
                    updateInterfaceStringsForDocumentType();
                    checkNativeFields(false);
                    return;
                }
                final EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
                this.inputFields[i4] = editTextBoldCursor4;
                AnonymousClass11 anonymousClass12 = new AnonymousClass11(context, editTextBoldCursor4, 1);
                anonymousClass12.setWillNotDraw(false);
                this.linearLayout2.addView(anonymousClass12, LayoutHelper.createLinear(i, 64));
                int i15 = Theme.key_windowBackgroundWhite;
                anonymousClass12.setBackgroundColor(Theme.getColor(zArr, i15, false));
                if (i4 == i3 - 1) {
                    View view2 = new View(context);
                    this.extraBackgroundView = view2;
                    view2.setBackgroundColor(Theme.getColor(zArr, i15, false));
                    this.linearLayout2.addView(this.extraBackgroundView, LayoutHelper.createLinear(i, 6));
                }
                if (this.documentOnly && this.currentDocumentsType != null && i4 < i2) {
                    anonymousClass12.setVisibility(8);
                    View view3 = this.extraBackgroundView;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                this.inputFields[i4].setTag(Integer.valueOf(i4));
                this.inputFields[i4].setSupportRtlHint(r3);
                this.inputFields[i4].setTextSize(r3, 16.0f);
                this.inputFields[i4].setHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
                EditTextBoldCursor editTextBoldCursor5 = this.inputFields[i4];
                int i16 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor5.setTextColor(Theme.getColor(null, i16, false));
                this.inputFields[i4].setHeaderHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
                this.inputFields[i4].setTransformHintToHeader(r3);
                this.inputFields[i4].setBackgroundDrawable(null);
                this.inputFields[i4].setCursorColor(Theme.getColor(null, i16, false));
                this.inputFields[i4].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[i4].setCursorWidth(1.5f);
                this.inputFields[i4].setLineColors(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
                if (i4 == 5 || i4 == 6) {
                    this.inputFields[i4].setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda11(this, 2));
                    this.inputFields[i4].setInputType(0);
                } else if (i4 == 3 || i4 == 8) {
                    this.inputFields[i4].setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda22(0, this, context));
                    this.inputFields[i4].setInputType(0);
                    this.inputFields[i4].setFocusable(false);
                } else if (i4 == 4) {
                    this.inputFields[i4].setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda11(this, 1));
                    this.inputFields[i4].setInputType(0);
                    this.inputFields[i4].setFocusable(false);
                } else {
                    this.inputFields[i4].setInputType(16385);
                    this.inputFields[i4].setImeOptions(268435461);
                }
                HashMap map2 = this.currentDocumentValues;
                switch (i4) {
                    case 0:
                        if (tL_secureRequiredType.native_names) {
                            this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                        } else {
                            this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportName));
                        }
                        str2 = "first_name";
                        setFieldValues(map, this.inputFields[i4], str2);
                        EditTextBoldCursor editTextBoldCursor6 = this.inputFields[i4];
                        editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                        if (i4 != 0 || i4 == 2 || i4 == 1) {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor7 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor7.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor7.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor7, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        } else {
                            this.inputFields[i4].addTextChangedListener(new AnonymousClass17(this, editTextBoldCursor4, str2, map));
                        }
                        this.inputFields[i4].setPadding(0, 0, 0, 0);
                        EditTextBoldCursor editTextBoldCursor7 = this.inputFields[i4];
                        if (LocaleController.isRTL) {
                            i5 = 5;
                        } else {
                            i5 = 3;
                        }
                        editTextBoldCursor7.setGravity(i5 | 16);
                        anonymousClass12.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 2));
                        break;
                    case 1:
                        if (tL_secureRequiredType.native_names) {
                            this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                        } else {
                            this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportMidname));
                        }
                        str2 = "middle_name";
                        setFieldValues(map, this.inputFields[i4], str2);
                        EditTextBoldCursor editTextBoldCursor8 = this.inputFields[i4];
                        editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
                        if (i4 != 0) {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor9 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor9.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor9.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor9, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        } else {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor9 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor9.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor9.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor9, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        }
                        this.inputFields[i4].setPadding(0, 0, 0, 0);
                        EditTextBoldCursor editTextBoldCursor9 = this.inputFields[i4];
                        if (LocaleController.isRTL) {
                            i5 = 5;
                        } else {
                            i5 = 3;
                        }
                        editTextBoldCursor9.setGravity(i5 | 16);
                        anonymousClass12.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 2));
                        break;
                    case 2:
                        if (tL_secureRequiredType.native_names) {
                            this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                        } else {
                            this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportSurname));
                        }
                        str2 = "last_name";
                        setFieldValues(map, this.inputFields[i4], str2);
                        EditTextBoldCursor editTextBoldCursor10 = this.inputFields[i4];
                        editTextBoldCursor10.setSelection(editTextBoldCursor10.length());
                        if (i4 != 0) {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor11 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor11.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor11.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor11, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        } else {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor11 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor11.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor11.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor11, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        }
                        this.inputFields[i4].setPadding(0, 0, 0, 0);
                        EditTextBoldCursor editTextBoldCursor11 = this.inputFields[i4];
                        if (LocaleController.isRTL) {
                            i5 = 5;
                        } else {
                            i5 = 3;
                        }
                        editTextBoldCursor11.setGravity(i5 | 16);
                        anonymousClass12.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 2));
                        break;
                    case 3:
                        this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                        str2 = "birth_date";
                        setFieldValues(map, this.inputFields[i4], str2);
                        EditTextBoldCursor editTextBoldCursor12 = this.inputFields[i4];
                        editTextBoldCursor12.setSelection(editTextBoldCursor12.length());
                        if (i4 != 0) {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor13 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor13.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor13.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor13, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        } else {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor13 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor13.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor13.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor13, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        }
                        this.inputFields[i4].setPadding(0, 0, 0, 0);
                        EditTextBoldCursor editTextBoldCursor13 = this.inputFields[i4];
                        if (LocaleController.isRTL) {
                            i5 = 5;
                        } else {
                            i5 = 3;
                        }
                        editTextBoldCursor13.setGravity(i5 | 16);
                        anonymousClass12.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 2));
                        break;
                    case 4:
                        this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportGender));
                        str2 = "gender";
                        setFieldValues(map, this.inputFields[i4], str2);
                        EditTextBoldCursor editTextBoldCursor14 = this.inputFields[i4];
                        editTextBoldCursor14.setSelection(editTextBoldCursor14.length());
                        if (i4 != 0) {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor15 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor15.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor15.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor15, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        } else {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor15 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor15.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor15.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor15, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        }
                        this.inputFields[i4].setPadding(0, 0, 0, 0);
                        EditTextBoldCursor editTextBoldCursor15 = this.inputFields[i4];
                        if (LocaleController.isRTL) {
                            i5 = 5;
                        } else {
                            i5 = 3;
                        }
                        editTextBoldCursor15.setGravity(i5 | 16);
                        anonymousClass12.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 2));
                        break;
                    case 5:
                        this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                        str2 = "country_code";
                        setFieldValues(map, this.inputFields[i4], str2);
                        EditTextBoldCursor editTextBoldCursor16 = this.inputFields[i4];
                        editTextBoldCursor16.setSelection(editTextBoldCursor16.length());
                        if (i4 != 0) {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor17 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor17.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor17.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor17, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        } else {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor17 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor17.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor17.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor17, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        }
                        this.inputFields[i4].setPadding(0, 0, 0, 0);
                        EditTextBoldCursor editTextBoldCursor17 = this.inputFields[i4];
                        if (LocaleController.isRTL) {
                            i5 = 5;
                        } else {
                            i5 = 3;
                        }
                        editTextBoldCursor17.setGravity(i5 | 16);
                        anonymousClass12.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 2));
                        break;
                    case 6:
                        this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportResidence));
                        str2 = "residence_country_code";
                        setFieldValues(map, this.inputFields[i4], str2);
                        EditTextBoldCursor editTextBoldCursor18 = this.inputFields[i4];
                        editTextBoldCursor18.setSelection(editTextBoldCursor18.length());
                        if (i4 != 0) {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor19 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor19.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor19.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor19, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        } else {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor19 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor19.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor19.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor19, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        }
                        this.inputFields[i4].setPadding(0, 0, 0, 0);
                        EditTextBoldCursor editTextBoldCursor19 = this.inputFields[i4];
                        if (LocaleController.isRTL) {
                            i5 = 5;
                        } else {
                            i5 = 3;
                        }
                        editTextBoldCursor19.setGravity(i5 | 16);
                        anonymousClass12.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 2));
                        break;
                    case 7:
                        this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                        str2 = "document_no";
                        map = map2;
                        setFieldValues(map, this.inputFields[i4], str2);
                        EditTextBoldCursor editTextBoldCursor110 = this.inputFields[i4];
                        editTextBoldCursor110.setSelection(editTextBoldCursor110.length());
                        if (i4 != 0) {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor111 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor111.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor111.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor111, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        } else {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor111 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor111.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor111.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor111, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        }
                        this.inputFields[i4].setPadding(0, 0, 0, 0);
                        EditTextBoldCursor editTextBoldCursor111 = this.inputFields[i4];
                        if (LocaleController.isRTL) {
                            i5 = 5;
                        } else {
                            i5 = 3;
                        }
                        editTextBoldCursor111.setGravity(i5 | 16);
                        anonymousClass12.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 2));
                        break;
                    case 8:
                        this.inputFields[i4].setHintText(LocaleController.getString(R.string.PassportExpired));
                        str2 = "expiry_date";
                        map = map2;
                        setFieldValues(map, this.inputFields[i4], str2);
                        EditTextBoldCursor editTextBoldCursor112 = this.inputFields[i4];
                        editTextBoldCursor112.setSelection(editTextBoldCursor112.length());
                        if (i4 != 0) {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor113 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor113.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor113.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor113, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        } else {
                            this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    boolean z;
                                    EditTextBoldCursor editTextBoldCursor113 = editTextBoldCursor4;
                                    int iIntValue = ((Integer) editTextBoldCursor113.getTag()).intValue();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= editable.length()) {
                                            z = false;
                                            break;
                                        }
                                        char cCharAt = editable.charAt(i17);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                                            z = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                    PassportActivity passportActivity = PassportActivity.this;
                                    if (z && !passportActivity.allowNonLatinName) {
                                        editTextBoldCursor113.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                                    } else {
                                        passportActivity.nonLatinNames[iIntValue] = z;
                                        PassportActivity.access$6500(passportActivity, editTextBoldCursor113, str2, editable, false);
                                    }
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }
                            });
                        }
                        this.inputFields[i4].setPadding(0, 0, 0, 0);
                        EditTextBoldCursor editTextBoldCursor113 = this.inputFields[i4];
                        if (LocaleController.isRTL) {
                            i5 = 5;
                        } else {
                            i5 = 3;
                        }
                        editTextBoldCursor113.setGravity(i5 | 16);
                        anonymousClass12.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 2));
                        break;
                }
                i4++;
                r3 = 1;
                zArr = null;
                i2 = 7;
                i = -1;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        zArr = null;
        TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context, 24, null);
        this.topErrorCell = textInfoPrivacyCell3;
        int i17 = R.drawable.greydivider_top;
        int i18 = Theme.key_windowBackgroundGrayShadow;
        textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i17, i18));
        this.topErrorCell.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        i = -1;
        this.linearLayout2.addView(this.topErrorCell, LayoutHelper.createLinear(-1, -2));
        checkTopErrorCell(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.currentDocumentsType;
        tL_secureRequiredType = this.currentType;
        if (tL_secureRequiredType2 != null) {
            HeaderCell headerCell2 = new HeaderCell(context);
            this.headerCell = headerCell2;
            if (this.documentOnly) {
                headerCell2.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                headerCell2.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            HeaderCell headerCell3 = this.headerCell;
            int i19 = Theme.key_windowBackgroundWhite;
            headerCell3.setBackgroundColor(Theme.getColor(null, i19, false));
            j = 0;
            this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.frontLayout = linearLayout;
            linearLayout.setOrientation(1);
            this.linearLayout2.addView(this.frontLayout, LayoutHelper.createLinear(-1, -2));
            TextDetailSettingsCell textDetailSettingsCell = new TextDetailSettingsCell(context);
            this.uploadFrontCell = textDetailSettingsCell;
            textDetailSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.linearLayout2.addView(this.uploadFrontCell, LayoutHelper.createLinear(-1, -2));
            this.uploadFrontCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 2));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.reverseLayout = linearLayout2;
            linearLayout2.setOrientation(1);
            this.linearLayout2.addView(this.reverseLayout, LayoutHelper.createLinear(-1, -2));
            boolean z = this.currentDocumentsType.selfie_required;
            TextDetailSettingsCell textDetailSettingsCell2 = new TextDetailSettingsCell(context);
            this.uploadReverseCell = textDetailSettingsCell2;
            textDetailSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.uploadReverseCell.setTextAndValue(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z);
            this.linearLayout2.addView(this.uploadReverseCell, LayoutHelper.createLinear(-1, -2));
            this.uploadReverseCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 4));
            if (this.currentDocumentsType.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.selfieLayout = linearLayout3;
                linearLayout3.setOrientation(1);
                this.linearLayout2.addView(this.selfieLayout, LayoutHelper.createLinear(-1, -2));
                TextDetailSettingsCell textDetailSettingsCell3 = new TextDetailSettingsCell(context);
                this.uploadSelfieCell = textDetailSettingsCell3;
                textDetailSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.uploadSelfieCell.setTextAndValue(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), tL_secureRequiredType.translation_required);
                this.linearLayout2.addView(this.uploadSelfieCell, LayoutHelper.createLinear(-1, -2));
                this.uploadSelfieCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 5));
            }
            TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context, 24, null);
            this.bottomCell = textInfoPrivacyCell4;
            int i20 = R.drawable.greydivider;
            textInfoPrivacyCell4.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i20, i18));
            this.bottomCell.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            if (this.currentDocumentsType.translation_required) {
                HeaderCell headerCell4 = new HeaderCell(context);
                this.headerCell = headerCell4;
                headerCell4.setText(LocaleController.getString(R.string.PassportTranslation));
                this.headerCell.setBackgroundColor(Theme.getColor(null, i19, false));
                this.linearLayout2.addView(this.headerCell, LayoutHelper.createLinear(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.translationLayout = linearLayout4;
                linearLayout4.setOrientation(1);
                this.linearLayout2.addView(this.translationLayout, LayoutHelper.createLinear(-1, -2));
                TextSettingsCell textSettingsCell2 = new TextSettingsCell(context, 0, null);
                this.uploadTranslationCell = textSettingsCell2;
                textSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.linearLayout2.addView(this.uploadTranslationCell, LayoutHelper.createLinear(-1, -2));
                this.uploadTranslationCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 6));
                TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context, 24, null);
                this.bottomCellTranslation = textInfoPrivacyCell5;
                textInfoPrivacyCell5.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i20, i18));
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
                String str4 = this.noAllTranslationErrorText;
                HashMap map3 = this.documentsErrors;
                CharSequence charSequence = str4;
                if (map3 != null && (str3 = (String) map3.get("translation_all")) != null) {
                    charSequence = str4;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.noAllTranslationErrorText);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_text_RedRegular, false)), 0, str3.length(), 33);
                    this.errorsValues.put("translation_all", "");
                    charSequence = spannableStringBuilder;
                }
                charSequence = str4;
                this.bottomCellTranslation.setText(charSequence);
                this.linearLayout2.addView(this.bottomCellTranslation, LayoutHelper.createLinear(-1, -2));
            }
        } else {
            j = 0;
            TextSettingsCell textSettingsCell3 = new TextSettingsCell(context, 0, null);
            this.scanDocumentCell = textSettingsCell3;
            textSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            this.scanDocumentCell.setText(LocaleController.getString(R.string.PassportScanPassport), false);
            this.linearLayout2.addView(this.scanDocumentCell, LayoutHelper.createLinear(-1, -2));
            this.scanDocumentCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 7));
            TextInfoPrivacyCell textInfoPrivacyCell6 = new TextInfoPrivacyCell(context, 24, null);
            this.bottomCell = textInfoPrivacyCell6;
            textInfoPrivacyCell6.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, i18));
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
        i2 = 7;
        i3 = this.currentDocumentsType != null ? 9 : 7;
        this.inputFields = new EditTextBoldCursor[i3];
        i4 = 0;
    }

    public final void createManageInterface(Context context) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        ArrayList arrayList;
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
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context2, (Object) null);
        passportActivity.sectionCell = shadowSectionCell;
        int i = R.drawable.greydivider;
        int i2 = Theme.key_windowBackgroundGrayShadow;
        shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, i, i2));
        passportActivity.linearLayout2.addView(passportActivity.sectionCell, LayoutHelper.createLinear(-1, -2));
        TextSettingsCell textSettingsCell = new TextSettingsCell(context2, 0, null);
        passportActivity.addDocumentCell = textSettingsCell;
        textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        TextSettingsCell textSettingsCell2 = passportActivity.addDocumentCell;
        int i3 = R.string.PassportNoDocumentsAdd;
        textSettingsCell2.setText(LocaleController.getString(i3), true);
        passportActivity.linearLayout2.addView(passportActivity.addDocumentCell, LayoutHelper.createLinear(-1, -2));
        passportActivity.addDocumentCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(passportActivity, 13));
        TextSettingsCell textSettingsCell3 = new TextSettingsCell(context2, 0, null);
        passportActivity.deletePassportCell = textSettingsCell3;
        textSettingsCell3.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
        passportActivity.deletePassportCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        passportActivity.deletePassportCell.setText(LocaleController.getString(R.string.TelegramPassportDelete), false);
        passportActivity.linearLayout2.addView(passportActivity.deletePassportCell, LayoutHelper.createLinear(-1, -2));
        passportActivity.deletePassportCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(passportActivity, 14));
        ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context2, (Object) null);
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
        TextView textViewM = ArticleViewer.IBlock.CC.m(passportActivity.emptyLayout, passportActivity.emptyTextView1, LayoutHelper.createLinear(-2, -2, 17, 0, 16, 0, 0), context2);
        passportActivity.emptyTextView2 = textViewM;
        textViewM.setTextColor(Theme.getColor(null, i5, false));
        passportActivity.emptyTextView2.setGravity(17);
        passportActivity.emptyTextView2.setTextSize(1, 14.0f);
        passportActivity.emptyTextView2.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        passportActivity.emptyTextView2.setText(LocaleController.getString(R.string.PassportNoDocumentsInfo));
        TextView textViewM2 = ArticleViewer.IBlock.CC.m(passportActivity.emptyLayout, passportActivity.emptyTextView2, LayoutHelper.createLinear(-2, -2, 17, 0, 14, 0, 0), context2);
        passportActivity.emptyTextView3 = textViewM2;
        int i6 = Theme.key_windowBackgroundWhiteBlueText4;
        textViewM2.setTextColor(Theme.getColor(null, i6, false));
        passportActivity.emptyTextView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        passportActivity.emptyTextView3.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(null, i6, false), 32), 7, -1));
        passportActivity.emptyTextView3.setGravity(17);
        passportActivity.emptyTextView3.setTextSize(1, 15.0f);
        passportActivity.emptyTextView3.setTypeface(AndroidUtilities.bold());
        passportActivity.emptyTextView3.setGravity(17);
        passportActivity.emptyTextView3.setText(LocaleController.getString(i3).toUpperCase());
        passportActivity.emptyLayout.addView(passportActivity.emptyTextView3, LayoutHelper.createLinear(-2, 30, 17, 0, 12, 0, 0));
        passportActivity.emptyTextView3.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(passportActivity, 15));
        int size = passportActivity.currentForm.values.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_secureValue tL_secureValue = passportActivity.currentForm.values.get(i7);
            if (isPersonalDocument(tL_secureValue.type)) {
                arrayList = new ArrayList();
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = tL_secureValue.type;
                tL_secureRequiredType2.selfie_required = true;
                tL_secureRequiredType2.translation_required = true;
                arrayList.add(tL_secureRequiredType2);
                tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
            } else {
                if (isAddressDocument(tL_secureValue.type)) {
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

    public final void createPhoneInterface(Context context) {
        String upperCase;
        String str;
        ViewGroup frameLayout;
        int i = 3;
        int i2 = 0;
        int i3 = 1;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.countriesArray, new ChatActivity$$ExternalSyntheticLambda18(18));
        String str2 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        TextSettingsCell textSettingsCell = new TextSettingsCell(context, 0, null);
        textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
        textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        textSettingsCell.setText(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, PhoneFormat.getInstance().format("+" + str2)), false);
        this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
        textSettingsCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, i3));
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
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == 2) {
                this.inputFields[i4] = new HintEditText(context);
            } else {
                this.inputFields[i4] = new EditTextBoldCursor(context);
            }
            if (i4 == 1) {
                frameLayout = zzkf.m(context, 0);
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
            int i5 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor.setTextColor(Theme.getColor(null, i5, false));
            this.inputFields[i4].setBackgroundDrawable(null);
            this.inputFields[i4].setCursorColor(Theme.getColor(null, i5, false));
            this.inputFields[i4].setCursorSize(AndroidUtilities.dp(20.0f));
            this.inputFields[i4].setCursorWidth(1.5f);
            if (i4 == 0) {
                this.inputFields[i4].setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda11(this, i2));
                this.inputFields[i4].setText(LocaleController.getString(R.string.ChooseCountry));
                this.inputFields[i4].setInputType(0);
                this.inputFields[i4].setFocusable(false);
            } else {
                this.inputFields[i4].setInputType(3);
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
                this.plusTextView.setTextColor(Theme.getColor(null, i5, false));
                this.plusTextView.setTextSize(1, 16.0f);
                frameLayout.addView(this.plusTextView, LayoutHelper.createLinear(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.inputFields[i4].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.inputFields[i4].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.inputFields[i4].setGravity(19);
                frameLayout.addView(this.inputFields[i4], LayoutHelper.createLinear(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.inputFields[i4].addTextChangedListener(new TextWatcher() {
                    @Override
                    public final void afterTextChanged(Editable editable) {
                        String str3;
                        boolean z;
                        ArrayList arrayList;
                        int iIndexOf;
                        PassportActivity passportActivity = PassportActivity.this;
                        if (passportActivity.ignoreOnTextChange) {
                            return;
                        }
                        passportActivity.ignoreOnTextChange = true;
                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(passportActivity.inputFields[1].getText().toString(), false);
                        passportActivity.inputFields[1].setText(strStripExceptNumbers);
                        HintEditText hintEditText = (HintEditText) passportActivity.inputFields[2];
                        if (strStripExceptNumbers.length() == 0) {
                            hintEditText.setHintText((String) null);
                            hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                            passportActivity.inputFields[0].setText(LocaleController.getString(R.string.ChooseCountry));
                        } else {
                            int length = strStripExceptNumbers.length();
                            HashMap map = passportActivity.codesMap;
                            int i6 = 4;
                            if (length > 4) {
                                while (true) {
                                    if (i6 < 1) {
                                        str3 = null;
                                        z = false;
                                        break;
                                    }
                                    String strSubstring = strStripExceptNumbers.substring(0, i6);
                                    if (((String) map.get(strSubstring)) != null) {
                                        String str4 = strStripExceptNumbers.substring(i6) + passportActivity.inputFields[2].getText().toString();
                                        passportActivity.inputFields[1].setText(strSubstring);
                                        str3 = str4;
                                        strStripExceptNumbers = strSubstring;
                                        z = true;
                                        break;
                                    }
                                    i6--;
                                }
                                if (!z) {
                                    str3 = strStripExceptNumbers.substring(1) + passportActivity.inputFields[2].getText().toString();
                                    EditTextBoldCursor editTextBoldCursor3 = passportActivity.inputFields[1];
                                    strStripExceptNumbers = strStripExceptNumbers.substring(0, 1);
                                    editTextBoldCursor3.setText(strStripExceptNumbers);
                                }
                            } else {
                                str3 = null;
                                z = false;
                            }
                            String str5 = (String) map.get(strStripExceptNumbers);
                            if (str5 == null || (iIndexOf = (arrayList = passportActivity.countriesArray).indexOf(str5)) == -1) {
                                hintEditText.setHintText((String) null);
                                hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                passportActivity.inputFields[0].setText(LocaleController.getString(R.string.WrongCountry));
                            } else {
                                passportActivity.inputFields[0].setText((CharSequence) arrayList.get(iIndexOf));
                                String str6 = (String) passportActivity.phoneFormatMap.get(strStripExceptNumbers);
                                if (str6 != null) {
                                    hintEditText.setHintText(str6.replace('X', (char) 8211));
                                    hintEditText.setHint((CharSequence) null);
                                }
                            }
                            if (!z) {
                                EditTextBoldCursor editTextBoldCursor4 = passportActivity.inputFields[1];
                                editTextBoldCursor4.setSelection(editTextBoldCursor4.getText().length());
                            }
                            if (str3 != null) {
                                hintEditText.requestFocus();
                                hintEditText.setText(str3);
                                hintEditText.setSelection(hintEditText.length());
                            }
                        }
                        passportActivity.ignoreOnTextChange = false;
                    }

                    @Override
                    public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    }

                    @Override
                    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    }
                });
            } else if (i4 == 2) {
                this.inputFields[i4].setPadding(0, 0, 0, 0);
                this.inputFields[i4].setGravity(19);
                this.inputFields[i4].setHintText(null);
                this.inputFields[i4].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.inputFields[i4], LayoutHelper.createLinear(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.inputFields[i4].addTextChangedListener(new AnonymousClass10(this, i2));
            } else {
                this.inputFields[i4].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[i4].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout.addView(this.inputFields[i4], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.inputFields[i4].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, i3));
            if (i4 == 2) {
                this.inputFields[i4].setOnKeyListener(new ChatActivity$$ExternalSyntheticLambda379(this, i));
            }
            if (i4 == 0) {
                View view = new View(context);
                this.dividers.add(view);
                view.setBackgroundColor(Theme.getColor(null, Theme.key_divider, false));
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            upperCase = telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase() : null;
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        if (upperCase != null && (str = (String) this.languageMap.get(upperCase)) != null && this.countriesArray.indexOf(str) != -1) {
            this.inputFields[1].setText((CharSequence) this.countriesMap.get(str));
        }
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, null);
        this.bottomCell = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
        this.bottomCell.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
    }

    @Override
    public final View createView(Context context) {
        char c;
        int i;
        int i2;
        TLRPC.User user;
        boolean z;
        ArrayList arrayList;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        boolean z2;
        boolean z3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Integer num;
        TLRPC.User currentUser;
        ChatAttachAlert chatAttachAlert;
        Context context2 = context;
        int i3 = 5;
        int i4 = 2;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i5 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass3());
        Integer num2 = 0;
        int i6 = this.currentActivityType;
        if (i6 == 7) {
            LoginActivity.AnonymousClass3 anonymousClass3 = new LoginActivity.AnonymousClass3(this, context2, i3);
            this.scrollView = anonymousClass3;
            this.fragmentView = anonymousClass3;
            anonymousClass3.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(null, Theme.key_actionBarDefault, false));
        } else {
            FrameLayout frameLayout = new FrameLayout(context2);
            this.fragmentView = frameLayout;
            frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
            DialogsActivity.AnonymousClass34 anonymousClass34 = new DialogsActivity.AnonymousClass34(context2, i4);
            this.scrollView = anonymousClass34;
            anonymousClass34.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(null, Theme.key_actionBarDefault, false));
            frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i6 == 0 ? 48.0f : 0.0f));
            LinearLayout linearLayout = new LinearLayout(context2);
            this.linearLayout2 = linearLayout;
            linearLayout.setOrientation(1);
            this.scrollView.addView(this.linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        }
        if (i6 == 0 || i6 == 8) {
            c = 0;
        } else {
            c = 0;
            this.doneItem = this.actionBar.createMenu().addItemWithWidth(2, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            ContextProgressView contextProgressView = new ContextProgressView(context2, 1);
            this.progressView = contextProgressView;
            contextProgressView.setAlpha(0.0f);
            this.progressView.setScaleX(0.1f);
            this.progressView.setScaleY(0.1f);
            this.progressView.setVisibility(4);
            this.doneItem.addView(this.progressView, LayoutHelper.createFrame(-1.0f, -1));
            if ((i6 == 1 || i6 == 2) && (chatAttachAlert = this.chatAttachAlert) != null) {
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
        if (i6 == 5) {
            if (this.currentForm != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= this.currentForm.users.size()) {
                        num = num2;
                        currentUser = null;
                        break;
                    }
                    currentUser = this.currentForm.users.get(i7);
                    num = num2;
                    if (currentUser.id == this.currentBotId) {
                        break;
                    }
                    i7++;
                    num2 = num;
                }
            } else {
                num = num2;
                currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            }
            FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
            EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context2, null);
            this.emptyView = emptyTextProgressView;
            emptyTextProgressView.showProgress();
            frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context2);
            this.passwordAvatarContainer = frameLayout3;
            this.linearLayout2.addView(frameLayout3, LayoutHelper.createLinear(-1, 100));
            BackupImageView backupImageView = new BackupImageView(context2);
            backupImageView.setRoundRadius(AndroidUtilities.dp(32.0f));
            this.passwordAvatarContainer.addView(backupImageView, LayoutHelper.createFrame(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
            backupImageView.imageReceiver.setForUserOrChat(currentUser, new AvatarDrawable(currentUser));
            backupImageView.onNewImageSet();
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context2, 24, null);
            this.passwordRequestTextView = textInfoPrivacyCell;
            textInfoPrivacyCell.getTextView().setGravity(1);
            if (this.currentBotId == 0) {
                this.passwordRequestTextView.setText(LocaleController.getString(R.string.PassportSelfRequest));
            } else {
                TextInfoPrivacyCell textInfoPrivacyCell2 = this.passwordRequestTextView;
                int i8 = R.string.PassportRequest;
                String firstName = UserObject.getFirstName(currentUser);
                Object[] objArr = new Object[1];
                objArr[c] = firstName;
                textInfoPrivacyCell2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportRequest", i8, objArr)));
            }
            ((FrameLayout.LayoutParams) this.passwordRequestTextView.getTextView().getLayoutParams()).gravity = 1;
            this.linearLayout2.addView(this.passwordRequestTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
            ImageView imageView = new ImageView(context2);
            this.noPasswordImageView = imageView;
            imageView.setImageResource(R.drawable.no_password);
            this.noPasswordImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
            this.linearLayout2.addView(this.noPasswordImageView, LayoutHelper.createLinear(-2, -2, 49, 0, 13, 0, 0));
            TextView textView = new TextView(context2);
            this.noPasswordTextView = textView;
            textView.setTextSize(1, 14.0f);
            this.noPasswordTextView.setGravity(1);
            this.noPasswordTextView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(17.0f));
            this.noPasswordTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
            this.noPasswordTextView.setText(LocaleController.getString(R.string.TelegramPassportCreatePasswordInfo));
            this.linearLayout2.addView(this.noPasswordTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(context2);
            this.noPasswordSetTextView = textView2;
            textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText5, false));
            this.noPasswordSetTextView.setGravity(17);
            this.noPasswordSetTextView.setTextSize(1, 16.0f);
            this.noPasswordSetTextView.setTypeface(AndroidUtilities.bold());
            this.noPasswordSetTextView.setText(LocaleController.getString(R.string.TelegramPassportCreatePassword));
            this.linearLayout2.addView(this.noPasswordSetTextView, LayoutHelper.createFrame(-1, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 9.0f, 21.0f, 0.0f));
            this.noPasswordSetTextView.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 11));
            this.inputFields = new EditTextBoldCursor[1];
            this.inputFieldContainers = new ViewGroup[]{new FrameLayout(context2)};
            this.linearLayout2.addView(this.inputFieldContainers[0], LayoutHelper.createLinear(-1, 50));
            this.inputFieldContainers[0].setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            this.inputFields[0] = new EditTextBoldCursor(context2);
            this.inputFields[0].setTag(num);
            this.inputFields[0].setTextSize(1, 16.0f);
            this.inputFields[0].setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            EditTextBoldCursor editTextBoldCursor = this.inputFields[0];
            int i9 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor.setTextColor(Theme.getColor(null, i9, false));
            this.inputFields[0].setBackgroundDrawable(null);
            this.inputFields[0].setCursorColor(Theme.getColor(null, i9, false));
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
            this.inputFields[0].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 5));
            this.inputFields[0].setCustomSelectionActionModeCallback(new RichEditText.AnonymousClass1(4));
            TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context2, 24, null);
            this.passwordInfoRequestTextView = textInfoPrivacyCell3;
            textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.passwordInfoRequestTextView.setText(LocaleController.formatString("PassportRequestPasswordInfo", R.string.PassportRequestPasswordInfo, new Object[0]));
            this.linearLayout2.addView(this.passwordInfoRequestTextView, LayoutHelper.createLinear(-1, -2));
            TextView textView3 = new TextView(context2);
            this.passwordForgotButton = textView3;
            textView3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.passwordForgotButton.setTextSize(1, 14.0f);
            this.passwordForgotButton.setText(LocaleController.getString(R.string.ForgotPassword));
            this.passwordForgotButton.setPadding(0, 0, 0, 0);
            this.linearLayout2.addView(this.passwordForgotButton, LayoutHelper.createLinear(-2, 30, (LocaleController.isRTL ? 5 : 3) | 48, 21, 0, 21, 0));
            this.passwordForgotButton.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 12));
            updatePasswordInterface();
        } else if (i6 == 0) {
            if (this.currentForm == null) {
                user = null;
                break;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= this.currentForm.users.size()) {
                    user = null;
                    break;
                }
                TLRPC.User user2 = this.currentForm.users.get(i10);
                if (user2.id == this.currentBotId) {
                    user = user2;
                    break;
                }
                i10++;
            }
            FrameLayout frameLayout4 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
            this.actionBar.createMenu().addItem(1, R.drawable.msg_info);
            if (user != null) {
                FrameLayout frameLayout5 = new FrameLayout(context2);
                this.linearLayout2.addView(frameLayout5, LayoutHelper.createLinear(-1, 100));
                BackupImageView backupImageView2 = new BackupImageView(context2);
                backupImageView2.setRoundRadius(AndroidUtilities.dp(32.0f));
                frameLayout5.addView(backupImageView2, LayoutHelper.createFrame(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
                backupImageView2.imageReceiver.setForUserOrChat(user, new AvatarDrawable(user));
                backupImageView2.onNewImageSet();
                TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context2, 24, null);
                this.bottomCell = textInfoPrivacyCell4;
                textInfoPrivacyCell4.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_top, Theme.key_windowBackgroundGrayShadow));
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
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i11 = 0;
                boolean z4 = false;
                int i12 = 0;
                boolean z5 = false;
                int i13 = 0;
                while (i11 < size) {
                    TLRPC.SecureRequiredType secureRequiredType = this.currentForm.required_types.get(i11);
                    if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) secureRequiredType;
                        if (isPersonalDocument(tL_secureRequiredType3.type)) {
                            arrayList4.add(tL_secureRequiredType3);
                            i12 += i5;
                        } else if (isAddressDocument(tL_secureRequiredType3.type)) {
                            arrayList5.add(tL_secureRequiredType3);
                            i13 += i5;
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
                                TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                                if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                                    if (isPersonalDocument(tL_secureRequiredType4.type)) {
                                        int size2 = tL_secureRequiredTypeOneOf.types.size();
                                        for (int i14 = 0; i14 < size2; i14++) {
                                            TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i14);
                                            if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                                arrayList4.add((TLRPC.TL_secureRequiredType) secureRequiredType3);
                                            }
                                        }
                                        i12++;
                                    } else if (isAddressDocument(tL_secureRequiredType4.type)) {
                                        int size3 = tL_secureRequiredTypeOneOf.types.size();
                                        for (int i15 = 0; i15 < size3; i15++) {
                                            TLRPC.SecureRequiredType secureRequiredType4 = tL_secureRequiredTypeOneOf.types.get(i15);
                                            if (secureRequiredType4 instanceof TLRPC.TL_secureRequiredType) {
                                                arrayList5.add((TLRPC.TL_secureRequiredType) secureRequiredType4);
                                            }
                                        }
                                        i13++;
                                    }
                                }
                            }
                        }
                        i11++;
                        i5 = 1;
                    }
                    i11++;
                    i5 = 1;
                }
                boolean z6 = !z4 || i12 > 1;
                boolean z7 = !z5 || i13 > 1;
                for (int i16 = 0; i16 < size; i16++) {
                    TLRPC.SecureRequiredType secureRequiredType5 = this.currentForm.required_types.get(i16);
                    if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType5;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType5.type;
                        if ((secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) {
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                            arrayList = null;
                            z2 = false;
                        } else {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                if (z6) {
                                    arrayList3 = null;
                                } else {
                                    arrayList3 = arrayList4;
                                }
                                arrayList = arrayList3;
                                z2 = false;
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (z7) {
                                    arrayList3 = null;
                                } else {
                                    arrayList3 = arrayList5;
                                }
                                arrayList = arrayList3;
                                z2 = false;
                            } else {
                                if (z6 && isPersonalDocument(secureValueType2)) {
                                    arrayList2 = new ArrayList();
                                    arrayList2.add(tL_secureRequiredType5);
                                    tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                } else if (z7 && isAddressDocument(tL_secureRequiredType5.type)) {
                                    arrayList2 = new ArrayList();
                                    arrayList2.add(tL_secureRequiredType5);
                                    tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypeAddress();
                                }
                                arrayList = arrayList2;
                                z2 = true;
                            }
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                        }
                        if (i16 == size - 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        addField(context, tL_secureRequiredType2, arrayList, z2, z3);
                    } else if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf2 = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType5;
                        if (!tL_secureRequiredTypeOneOf2.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType6 = tL_secureRequiredTypeOneOf2.types.get(0);
                            if (secureRequiredType6 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = (TLRPC.TL_secureRequiredType) secureRequiredType6;
                                if ((z6 && isPersonalDocument(tL_secureRequiredType6.type)) || (z7 && isAddressDocument(tL_secureRequiredType6.type))) {
                                    arrayList = new ArrayList();
                                    int size4 = tL_secureRequiredTypeOneOf2.types.size();
                                    for (int i17 = 0; i17 < size4; i17++) {
                                        TLRPC.SecureRequiredType secureRequiredType7 = tL_secureRequiredTypeOneOf2.types.get(i17);
                                        if (secureRequiredType7 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList.add((TLRPC.TL_secureRequiredType) secureRequiredType7);
                                        }
                                    }
                                    if (isPersonalDocument(tL_secureRequiredType6.type)) {
                                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                    } else {
                                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
                                    }
                                    tL_secureRequiredType2 = tL_secureRequiredType;
                                    z2 = true;
                                    if (i16 == size - 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    addField(context, tL_secureRequiredType2, arrayList, z2, z3);
                                }
                            }
                        }
                    }
                }
                context2 = context;
            }
            if (user != null) {
                TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context2, 24, null);
                this.bottomCell = textInfoPrivacyCell5;
                textInfoPrivacyCell5.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                TextInfoPrivacyCell textInfoPrivacyCell6 = this.bottomCell;
                int i18 = Theme.key_windowBackgroundWhiteGrayText4;
                textInfoPrivacyCell6.setLinkTextColorKey(i18);
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
                this.bottomCell.getTextView().setHighlightColor(Theme.getColor(null, i18, z));
                this.bottomCell.getTextView().setGravity(1);
                this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            }
            FrameLayout frameLayout6 = new FrameLayout(context2);
            this.bottomLayout = frameLayout6;
            frameLayout6.setBackgroundDrawable(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(null, Theme.key_passport_authorizeBackground, false), Theme.getColor(null, Theme.key_passport_authorizeBackgroundSelected, false)));
            frameLayout4.addView(this.bottomLayout, LayoutHelper.createFrame(-1, 48, 80));
            this.bottomLayout.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 16));
            TextView textView4 = new TextView(context2);
            this.acceptTextView = textView4;
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
            this.acceptTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.authorize, 0, 0, 0);
            this.acceptTextView.setTextColor(Theme.getColor(null, Theme.key_passport_authorizeText, false));
            this.acceptTextView.setText(LocaleController.getString(R.string.PassportAuthorize));
            this.acceptTextView.setTextSize(1, 14.0f);
            this.acceptTextView.setGravity(17);
            this.acceptTextView.setTypeface(AndroidUtilities.bold());
            this.bottomLayout.addView(this.acceptTextView, LayoutHelper.createFrame(-2, -1, 17));
            ContextProgressView contextProgressView2 = new ContextProgressView(context2, 0);
            this.progressViewButton = contextProgressView2;
            contextProgressView2.setVisibility(4);
            this.bottomLayout.addView(this.progressViewButton, LayoutHelper.createFrame(-1.0f, -1));
            View view = new View(context2);
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            frameLayout4.addView(view, LayoutHelper.createFrame(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        } else if (i6 == 1) {
            createIdentityInterface(context);
            if (this.initialValues == null) {
                this.initialValues = getCurrentValues();
            }
        } else if (i6 == 2) {
            createAddressInterface(context);
            if (this.initialValues == null) {
                this.initialValues = getCurrentValues();
            }
        } else if (i6 == 3) {
            createPhoneInterface(context);
        } else if (i6 == 4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
            if (TextUtils.isEmpty(this.currentEmail)) {
                i = -1;
            } else {
                TextSettingsCell textSettingsCell = new TextSettingsCell(context2, 0, null);
                textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
                textSettingsCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                textSettingsCell.setText(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, this.currentEmail), false);
                this.linearLayout2.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
                textSettingsCell.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda2(this, 0));
                TextInfoPrivacyCell textInfoPrivacyCell7 = new TextInfoPrivacyCell(context2, 24, null);
                this.bottomCell = textInfoPrivacyCell7;
                textInfoPrivacyCell7.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                this.bottomCell.setText(LocaleController.getString(R.string.PassportPhoneUseSameEmailInfo));
                i = -1;
                this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            }
            this.inputFields = new EditTextBoldCursor[1];
            FrameLayout frameLayout7 = new FrameLayout(context2);
            this.linearLayout2.addView(frameLayout7, LayoutHelper.createLinear(i, 50));
            frameLayout7.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            this.inputFields[0] = new EditTextBoldCursor(context2);
            this.inputFields[0].setTag(num2);
            this.inputFields[0].setTextSize(1, 16.0f);
            this.inputFields[0].setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            EditTextBoldCursor editTextBoldCursor2 = this.inputFields[0];
            int i19 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor2.setTextColor(Theme.getColor(null, i19, false));
            this.inputFields[0].setBackgroundDrawable(null);
            this.inputFields[0].setCursorColor(Theme.getColor(null, i19, false));
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
                    if (TextUtils.isEmpty(tL_securePlainEmail.email)) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        this.inputFields[0].setText(tL_securePlainEmail.email);
                    }
                } else {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            EditTextBoldCursor editTextBoldCursor3 = this.inputFields[i2];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.inputFields[i2].setPadding(i2, i2, i2, AndroidUtilities.dp(6.0f));
            this.inputFields[i2].setGravity(LocaleController.isRTL ? 5 : 3);
            frameLayout7.addView(this.inputFields[i2], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            this.inputFields[i2].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, i2));
            TextInfoPrivacyCell textInfoPrivacyCell8 = new TextInfoPrivacyCell(context2, 24, null);
            this.bottomCell = textInfoPrivacyCell8;
            textInfoPrivacyCell8.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.bottomCell.setText(LocaleController.getString(R.string.PassportEmailUploadInfo));
            this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
        } else {
            HashMap map = this.currentValues;
            if (i6 == 6) {
                this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
                this.inputFields = new EditTextBoldCursor[1];
                FrameLayout frameLayout8 = new FrameLayout(context2);
                this.linearLayout2.addView(frameLayout8, LayoutHelper.createLinear(-1, 50));
                frameLayout8.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                this.inputFields[0] = new EditTextBoldCursor(context2);
                this.inputFields[0].setTag(num2);
                this.inputFields[0].setTextSize(1, 16.0f);
                this.inputFields[0].setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
                EditTextBoldCursor editTextBoldCursor4 = this.inputFields[0];
                int i20 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor4.setTextColor(Theme.getColor(null, i20, false));
                this.inputFields[0].setBackgroundDrawable(null);
                this.inputFields[0].setCursorColor(Theme.getColor(null, i20, false));
                this.inputFields[0].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[0].setCursorWidth(1.5f);
                this.inputFields[0].setInputType(3);
                this.inputFields[0].setImeOptions(268435462);
                this.inputFields[0].setHint(LocaleController.getString(R.string.PassportEmailCode));
                EditTextBoldCursor editTextBoldCursor5 = this.inputFields[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                this.inputFields[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[0].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout8.addView(this.inputFields[0], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.inputFields[0].setOnEditorActionListener(new PassportActivity$$ExternalSyntheticLambda3(this, 6));
                this.inputFields[0].addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 28));
                TextInfoPrivacyCell textInfoPrivacyCell9 = new TextInfoPrivacyCell(context2, 24, null);
                this.bottomCell = textInfoPrivacyCell9;
                textInfoPrivacyCell9.setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                this.bottomCell.setText(LocaleController.formatString("PassportEmailVerifyInfo", R.string.PassportEmailVerifyInfo, map.get("email")));
                this.linearLayout2.addView(this.bottomCell, LayoutHelper.createLinear(-1, -2));
            } else if (i6 == 7) {
                this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
                FrameLayout frameLayout9 = new FrameLayout(context2);
                this.scrollView.addView(frameLayout9, LayoutHelper.createScroll(-1, -2, 51));
                for (int i21 = 0; i21 < 3; i21++) {
                    PhoneConfirmationView phoneConfirmationView = new PhoneConfirmationView(context2, i21 + 2);
                    SlideView[] slideViewArr = this.views;
                    slideViewArr[i21] = phoneConfirmationView;
                    phoneConfirmationView.setVisibility(8);
                    frameLayout9.addView(slideViewArr[i21], LayoutHelper.createFrame(-1, -1.0f, 51, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 30.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
                }
                Bundle bundle = new Bundle();
                bundle.putString("phone", (String) map.get("phone"));
                fillNextCodeParams(bundle, this.currentPhoneVerification, false);
            } else if (i6 == 8) {
                createManageInterface(context);
            }
        }
        return this.fragmentView;
    }

    public final byte[] decryptValueSecret(byte[] bArr, byte[] bArr2) {
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

    public final void deleteValueInternal(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z, final PassportActivity$$ExternalSyntheticLambda14 passportActivity$$ExternalSyntheticLambda14, final PassportActivity$$ExternalSyntheticLambda7 passportActivity$$ExternalSyntheticLambda7, final boolean z2) {
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
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final PassportActivity passportActivity = this.f$0;
                passportActivity.getClass();
                final ArrayList arrayList2 = arrayList;
                final PassportActivity$$ExternalSyntheticLambda14 passportActivity$$ExternalSyntheticLambda15 = passportActivity$$ExternalSyntheticLambda14;
                final PassportActivity$$ExternalSyntheticLambda7 passportActivity$$ExternalSyntheticLambda8 = passportActivity$$ExternalSyntheticLambda7;
                final boolean z3 = z2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z4 = z;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String strDecryptData;
                        TLRPC.TL_secureData tL_secureData;
                        PassportActivity passportActivity2 = passportActivity;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String strDecryptData2 = null;
                        if (tL_error2 != null) {
                            passportActivity2.getClass();
                            PassportActivity$$ExternalSyntheticLambda7 passportActivity$$ExternalSyntheticLambda9 = passportActivity$$ExternalSyntheticLambda8;
                            if (passportActivity$$ExternalSyntheticLambda9 != null) {
                                String str = tL_error2.text;
                                passportActivity$$ExternalSyntheticLambda9.f$0.needHideProgress();
                            }
                            passportActivity2.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error2.text);
                            return;
                        }
                        boolean z5 = z3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z6 = z4;
                        if (!z5) {
                            if (z6) {
                                passportActivity2.removeValue(tL_secureRequiredType6);
                            }
                            passportActivity2.removeValue(tL_secureRequiredType5);
                        } else if (tL_secureRequiredType5 != null) {
                            passportActivity2.removeValue(tL_secureRequiredType5);
                        } else {
                            passportActivity2.removeValue(tL_secureRequiredType6);
                        }
                        if (passportActivity2.currentActivityType == 8) {
                            PassportActivity.TextDetailSecureCell textDetailSecureCell = (PassportActivity.TextDetailSecureCell) passportActivity2.typesViews.remove(tL_secureRequiredType6);
                            if (textDetailSecureCell != null) {
                                passportActivity2.linearLayout2.removeView(textDetailSecureCell);
                                LinearLayout linearLayout = passportActivity2.linearLayout2;
                                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof PassportActivity.TextDetailSecureCell) {
                                    ((PassportActivity.TextDetailSecureCell) childAt).setNeedDivider(false);
                                }
                            }
                            passportActivity2.updateManageVisibility();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 == null || arrayList3 == null || arrayList3.size() <= 1) {
                                strDecryptData = null;
                            } else {
                                int size = arrayList3.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        strDecryptData = null;
                                        break;
                                    }
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i);
                                    TLRPC.TL_secureValue valueByType = passportActivity2.getValueByType(tL_secureRequiredType7, false);
                                    if (valueByType != null) {
                                        TLRPC.TL_secureData tL_secureData2 = valueByType.data;
                                        strDecryptData = tL_secureData2 != null ? PassportActivity.decryptData(tL_secureData2.data, passportActivity2.decryptValueSecret(tL_secureData2.secret, tL_secureData2.data_hash), valueByType.data.data_hash) : null;
                                        tL_secureRequiredType5 = tL_secureRequiredType7;
                                        break;
                                    }
                                    i++;
                                }
                                if (tL_secureRequiredType5 == null) {
                                    tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList3.get(0);
                                }
                            }
                            if (z6) {
                                passportActivity2.setTypeValue(tL_secureRequiredType6, null, null, tL_secureRequiredType5, strDecryptData, z5, arrayList3 != null ? arrayList3.size() : 0);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str2 = strDecryptData;
                                TLRPC.TL_secureValue valueByType2 = passportActivity2.getValueByType(tL_secureRequiredType6, false);
                                if (valueByType2 != null && (tL_secureData = valueByType2.data) != null) {
                                    strDecryptData2 = PassportActivity.decryptData(tL_secureData.data, passportActivity2.decryptValueSecret(tL_secureData.secret, tL_secureData.data_hash), valueByType2.data.data_hash);
                                }
                                passportActivity2.setTypeValue(tL_secureRequiredType6, null, strDecryptData2, tL_secureRequiredType8, str2, z5, arrayList3 != null ? arrayList3.size() : 0);
                            }
                        }
                        PassportActivity$$ExternalSyntheticLambda14 passportActivity$$ExternalSyntheticLambda16 = passportActivity$$ExternalSyntheticLambda15;
                        if (passportActivity$$ExternalSyntheticLambda16 != null) {
                            passportActivity$$ExternalSyntheticLambda16.run();
                        }
                    }
                });
            }
        });
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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
        HashMap map = this.uploadingDocuments;
        SecureDocument secureDocument = (SecureDocument) map.get(str);
        if (secureDocument != null) {
            secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
            map.remove(str);
            if (map.isEmpty() && (actionBarMenuItem = this.doneItem) != null) {
                actionBarMenuItem.setEnabled(true);
                this.doneItem.setAlpha(1.0f);
            }
            HashMap map2 = this.documentsCells;
            if (map2 != null && (secureDocumentCell = (SecureDocumentCell) map2.get(secureDocument)) != null) {
                secureDocumentCell.updateButtonState(true);
            }
            HashMap map3 = this.errorsValues;
            if (map3 != null && map3.containsKey("error_document_all")) {
                map3.remove("error_document_all");
                checkTopErrorCell(false);
            }
            int i3 = secureDocument.type;
            if (i3 == 0) {
                if (this.bottomCell != null && !TextUtils.isEmpty(this.noAllDocumentsErrorText)) {
                    this.bottomCell.setText(this.noAllDocumentsErrorText);
                }
                map3.remove("files_all");
                return;
            }
            if (i3 == 4) {
                if (this.bottomCellTranslation != null && !TextUtils.isEmpty(this.noAllTranslationErrorText)) {
                    this.bottomCellTranslation.setText(this.noAllTranslationErrorText);
                }
                map3.remove("translation_all");
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert == null || this.visibleDialog != chatAttachAlert) {
            super.dismissCurrentDialog();
            return;
        }
        chatAttachAlert.photoLayout.closeCamera(false);
        this.chatAttachAlert.dismissInternal();
        this.chatAttachAlert.photoLayout.hideCamera(true);
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.chatAttachAlert && super.dismissDialogOnPause(dialog);
    }

    public final MHTML encryptData(byte[] bArr) {
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
        MHTML mhtml = new MHTML();
        mhtml.entries = bArr3;
        mhtml.file = bArr11;
        mhtml.entriesByLocation = bArrComputeSHA256;
        mhtml.boundary = randomSecret;
        mhtml.filePos = new SecureDocumentKey(bArr4, bArr5);
        return mhtml;
    }

    public final void fillNextCodeParams(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z) {
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

    public final String getCurrentValues() {
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
        ArrayList arrayList = this.documents;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append(((SecureDocument) arrayList.get(i3)).secureFile.id);
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
        ArrayList arrayList2 = this.translationDocuments;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            sb.append(((SecureDocument) arrayList2.get(i4)).secureFile.id);
        }
        return sb.toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.dividers;
            if (i4 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new ThemeDescription((View) arrayList2.get(i4), 1, null, null, null, null, Theme.key_divider));
            i4++;
        }
        Iterator it = this.documentsCells.entrySet().iterator();
        while (it.hasNext()) {
            SecureDocumentCell secureDocumentCell = (SecureDocumentCell) ((Map.Entry) it.next()).getValue();
            arrayList.add(new ThemeDescription(secureDocumentCell, 268435456, new Class[]{SecureDocumentCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(secureDocumentCell, 0, new Class[]{SecureDocumentCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(secureDocumentCell, 0, new Class[]{SecureDocumentCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
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

    public final TLRPC.TL_secureValue getValueByType(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
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
                            return null;
                        }
                    }
                }
                return tL_secureValue;
            }
        }
        return null;
    }

    public final boolean hasNotValueForType(Class cls) {
        int size = this.currentForm.values.size();
        for (int i = 0; i < size; i++) {
            if (this.currentForm.values.get(i).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    public final void lambda$addDocumentView$56(SecureDocument secureDocument, int i, SecureDocumentCell secureDocumentCell, String str) {
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
            HashMap map = this.documentsErrors;
            if (map != null) {
                map.remove(str);
            }
            HashMap map2 = this.errorsValues;
            if (map2 != null) {
                map2.remove(str);
            }
        }
        updateUploadText(i);
        String str2 = secureDocument.path;
        if (str2 != null) {
            HashMap map3 = this.uploadingDocuments;
            if (map3.remove(str2) != null) {
                if (map3.isEmpty()) {
                    this.doneItem.setEnabled(true);
                    this.doneItem.setAlpha(1.0f);
                }
                FileLoader.getInstance(this.currentAccount).cancelFileUpload(secureDocument.path, false);
            }
        }
    }

    public final void lambda$createManageInterface$20() {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i = 0; i < this.currentForm.values.size(); i++) {
            deletesecurevalue.types.add(this.currentForm.values.get(i).type);
        }
        needShowProgress$1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new PassportActivity$$ExternalSyntheticLambda9(this, 3));
    }

    public final void lambda$createPasswordInterface$11() {
        Browser.openUrl(getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.currentAccount).getClientPhone());
    }

    public final void lambda$createPasswordInterface$12() {
        if (this.currentPassword.has_recovery) {
            needShowProgress$1();
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new PassportActivity$$ExternalSyntheticLambda9(this, 1), 10), this.classGuid);
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setNegativeButton(LocaleController.getString(R.string.RestorePasswordResetAccount), new PassportActivity$$ExternalSyntheticLambda7(this, 4));
        String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.RestorePasswordNoEmailText);
        showDialog(alertDialog);
    }

    public final void lambda$createPasswordInterface$6() {
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 0, this.currentPassword);
        twoStepVerificationSetupActivity.closeAfterSet = true;
        presentFragment(twoStepVerificationSetupActivity);
    }

    public final void lambda$createPasswordInterface$8(TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = this.currentPassword;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        presentFragment(new TwoStepVerificationSetupActivity(this.currentAccount, 4, password));
    }

    public final void lambda$createRequestInterface$16() {
        ArrayList arrayList;
        int i;
        int i2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
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
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                            int size2 = tL_secureRequiredTypeOneOf.types.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    tL_secureRequiredType = tL_secureRequiredType4;
                                    break;
                                }
                                TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i4);
                                if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                    if (getValueByType(tL_secureRequiredType5, true) != null) {
                                        tL_secureRequiredType = tL_secureRequiredType5;
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
            HashMap map = this.documentsToTypesLink;
            HashMap map2 = this.typesViews;
            if (valueByType == null) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                TextDetailSecureCell textDetailSecureCell = (TextDetailSecureCell) map2.get(tL_secureRequiredType);
                if (textDetailSecureCell == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) map.get(tL_secureRequiredType)) != null) {
                    textDetailSecureCell = (TextDetailSecureCell) map2.get(tL_secureRequiredType2);
                }
                AndroidUtilities.shakeView(textDetailSecureCell);
                return;
            }
            HashMap map3 = (HashMap) this.errorsMap.get(getNameForType(tL_secureRequiredType.type));
            if (map3 != null && !map3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                TextDetailSecureCell textDetailSecureCell2 = (TextDetailSecureCell) map2.get(tL_secureRequiredType);
                if (textDetailSecureCell2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) map.get(tL_secureRequiredType)) != null) {
                    textDetailSecureCell2 = (TextDetailSecureCell) map2.get(tL_secureRequiredType3);
                }
                AndroidUtilities.shakeView(textDetailSecureCell2);
                return;
            }
            arrayList2.add(new C1ValueToSend(valueByType, tL_secureRequiredType.selfie_required, tL_secureRequiredType.translation_required));
        }
        showEditDoneProgress$2(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = this.currentBotId;
        acceptauthorization.scope = this.currentScope;
        String str = this.currentPublicKey;
        acceptauthorization.public_key = str;
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
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(bArrDecryptValueSecret, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                            i = size3;
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (tL_secureValue.files.isEmpty()) {
                        i = size3;
                        i2 = i5;
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        int size4 = tL_secureValue.files.size();
                        int i6 = 0;
                        while (i6 < size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i6);
                            int i7 = size4;
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
                                    size4 = i7;
                                    size3 = i;
                                    i5 = i2;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                i2 = i5;
                            }
                        }
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
                        for (int i8 = 0; i8 < size5; i8++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i8);
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
        MHTML mhtmlEncryptData = encryptData(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) mhtmlEncryptData.entriesByLocation;
        tL_secureCredentialsEncrypted.data = (byte[]) mhtmlEncryptData.entries;
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, rSAPublicKey);
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) mhtmlEncryptData.boundary);
        } catch (Exception e) {
            FileLog.e(e);
        }
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(acceptauthorization, new PassportActivity$$ExternalSyntheticLambda9(this, 2)), this.classGuid);
    }

    public final void lambda$onPasswordDone$13(String str, boolean z) {
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

    public final void lambda$processSelectedFiles$70(SecureDocument secureDocument, int i) {
        int i2 = this.uploadingFileType;
        HashMap map = this.documentsCells;
        if (i2 == 1) {
            SecureDocument secureDocument2 = this.selfieDocument;
            if (secureDocument2 != null) {
                SecureDocumentCell secureDocumentCell = (SecureDocumentCell) map.remove(secureDocument2);
                if (secureDocumentCell != null) {
                    this.selfieLayout.removeView(secureDocumentCell);
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
                SecureDocumentCell secureDocumentCell2 = (SecureDocumentCell) map.remove(secureDocument3);
                if (secureDocumentCell2 != null) {
                    this.frontLayout.removeView(secureDocumentCell2);
                }
                this.frontDocument = null;
            }
        } else if (i2 == 3) {
            SecureDocument secureDocument4 = this.reverseDocument;
            if (secureDocument4 != null) {
                SecureDocumentCell secureDocumentCell3 = (SecureDocumentCell) map.remove(secureDocument4);
                if (secureDocumentCell3 != null) {
                    this.reverseLayout.removeView(secureDocumentCell3);
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

    public final void lambda$startPhoneVerification$65(TLRPC.TL_error tL_error, String str, PassportActivityDelegate passportActivityDelegate, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error != null) {
            AlertsCreator.processError(this.currentAccount, tL_error, this, sendverifyphonecode, str);
            return;
        }
        HashMap map = new HashMap();
        map.put("phone", str);
        PassportActivity passportActivity = new PassportActivity(7, this.currentForm, this.currentPassword, this.currentType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, map, (HashMap) null);
        passportActivity.currentAccount = this.currentAccount;
        passportActivity.saltedPassword = this.saltedPassword;
        passportActivity.secureSecret = this.secureSecret;
        passportActivity.delegate = passportActivityDelegate;
        passportActivity.currentPhoneVerification = (TLRPC.TL_auth_sentCode) tLObject;
        presentFragment(passportActivity, true);
    }

    public final void loadPasswordInfo() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new PassportActivity$$ExternalSyntheticLambda9(this, 0)), this.classGuid);
    }

    public final void needHideProgress() {
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

    public final void needShowProgress$1() {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.progressDialog != null) {
            return;
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        this.progressDialog = alertDialog;
        alertDialog.canCacnel = false;
        alertDialog.show();
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) throws Throwable {
        if (i2 == -1) {
            if (i == 0 || i == 2) {
                createChatAttachView$3();
                ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
                if (chatAttachAlert != null) {
                    chatAttachAlert.photoLayout.onActivityResultFragment(i, intent, this.currentPicturePath);
                }
                this.currentPicturePath = null;
                return;
            }
            if (i == 1) {
                if (intent == null || intent.getData() == null) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.UnsupportedAttachment), 0).show();
                } else {
                    ArrayList arrayList = new ArrayList();
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    sendingMediaInfo.uri = intent.getData();
                    arrayList.add(sendingMediaInfo);
                    processSelectedFiles(arrayList);
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        int i = this.currentActivityType;
        if (i == 7) {
            if (z) {
                int i2 = this.currentViewNum;
                SlideView[] slideViewArr = this.views;
                slideViewArr[i2].onBackPressed(true);
                for (SlideView slideView : slideViewArr) {
                    if (slideView != null) {
                        slideView.onDestroyActivity();
                    }
                }
            }
        } else if (i == 0 || i == 5) {
            if (z) {
                callCallback(false);
            }
        } else if (i == 1 || i == 2) {
            return !checkDiscard$4(z);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.currentActivityType == 3 && Build.VERSION.SDK_INT >= 23 && dialog == this.permissionsDialog) {
            ArrayList arrayList = this.permissionsItems;
            if (arrayList.isEmpty()) {
                return;
            }
            getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
        }
    }

    public final void onFieldError(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        AndroidUtilities.shakeView(view);
        while (view != null && this.linearLayout2.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.scrollView.smoothScrollTo(0, view.getTop() - ((this.scrollView.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
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

    public final void onPasswordDone(boolean z) {
        String string;
        if (z) {
            string = null;
        } else {
            string = this.inputFields[0].getText().toString();
            if (TextUtils.isEmpty(string)) {
                if (getParentActivity() == null) {
                    return;
                }
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(this.inputFields[0]);
                return;
            }
            showEditDoneProgress$2(true, true);
        }
        Utilities.globalQueue.postRunnable(new PhotoViewer$$ExternalSyntheticLambda89(this, z, string, 26));
    }

    @Override
    public final void onPause() {
        super.onPause();
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onPause();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
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
            chatAttachAlert.photoLayout.checkCamera(false);
            return;
        }
        if (i == 21) {
            if (getParentActivity() == null || iArr == null || iArr.length == 0 || iArr[0] == 0) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.AppName);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
            builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new PassportActivity$$ExternalSyntheticLambda7(this, 1));
            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
            builder.show();
            return;
        }
        if (i == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            processSelectedAttach$1(0);
            return;
        }
        if (i != 22 || iArr == null || iArr.length <= 0 || iArr[0] != 0 || (textSettingsCell = this.scanDocumentCell) == null) {
            return;
        }
        textSettingsCell.callOnClick();
    }

    @Override
    public final void onResume() {
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
            AndroidUtilities.runOnUIThread(new PassportActivity$$ExternalSyntheticLambda14(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (this.presentAfterAnimation != null) {
            AndroidUtilities.runOnUIThread(new PassportActivity$$ExternalSyntheticLambda14(this, 1));
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
            createChatAttachView$3();
        }
    }

    public final void openAddDocumentAlert() {
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
        String string = LocaleController.getString(R.string.PassportNoDocumentsAdd);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        builder.setItems((CharSequence[]) arrayList.toArray(new CharSequence[0]), new ArticleViewer$$ExternalSyntheticLambda24(10, this, arrayList2));
        showDialog(alertDialog);
    }

    public final void openAttachMenu$1() {
        int size;
        int i;
        int i2 = 1;
        if (getParentActivity() == null) {
            return;
        }
        int i3 = this.uploadingFileType;
        ArrayList arrayList = this.documents;
        if (i3 == 0 && arrayList.size() >= 20) {
            showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        createChatAttachView$3();
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        int i4 = this.uploadingFileType;
        chatAttachAlert.openWithFrontFaceCamera = i4 == 1;
        if (i4 != 0) {
            if (i4 == 4) {
                size = this.translationDocuments.size();
            }
            chatAttachAlert.setMaxSelectedPhotos(i2, false);
            this.chatAttachAlert.photoLayout.loadGalleryPhotos();
            i = Build.VERSION.SDK_INT;
            if (i != 21 || i == 22) {
                AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            }
            this.chatAttachAlert.init();
            showDialog(this.chatAttachAlert);
        }
        size = arrayList.size();
        i2 = 20 - size;
        chatAttachAlert.setMaxSelectedPhotos(i2, false);
        this.chatAttachAlert.photoLayout.loadGalleryPhotos();
        i = Build.VERSION.SDK_INT;
        if (i != 21) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
        } else {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
        }
        this.chatAttachAlert.init();
        showDialog(this.chatAttachAlert);
    }

    public final void openTypeActivity(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z) {
        int i;
        int size = arrayList != null ? arrayList.size() : 0;
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2 != null ? tL_secureRequiredType2.type : null;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            i = 1;
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            i = 2;
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            i = 3;
        } else {
            i = secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? 4 : -1;
        }
        if (i != -1) {
            HashMap map = this.errorsMap;
            HashMap map2 = !z ? (HashMap) map.get(getNameForType(secureValueType)) : null;
            HashMap map3 = (HashMap) map.get(getNameForType(secureValueType2));
            TLRPC.TL_secureValue valueByType = getValueByType(tL_secureRequiredType, false);
            TLRPC.TL_secureValue valueByType2 = getValueByType(tL_secureRequiredType2, false);
            HashMap map4 = map2;
            TL_account.authorizationForm authorizationform = this.currentForm;
            int i2 = i;
            TL_account.Password password = this.currentPassword;
            HashMap map5 = this.typesValues;
            PassportActivity passportActivity = new PassportActivity(i2, authorizationform, password, tL_secureRequiredType, valueByType, tL_secureRequiredType2, valueByType2, (HashMap) map5.get(tL_secureRequiredType), tL_secureRequiredType2 != null ? (HashMap) map5.get(tL_secureRequiredType2) : null);
            passportActivity.delegate = new AnonymousClass20(secureValueType, z, size);
            passportActivity.currentAccount = this.currentAccount;
            passportActivity.saltedPassword = this.saltedPassword;
            passportActivity.secureSecret = this.secureSecret;
            passportActivity.currentBotId = this.currentBotId;
            passportActivity.fieldsErrors = map4;
            passportActivity.documentOnly = z;
            passportActivity.documentsErrors = map3;
            passportActivity.availableDocumentTypes = arrayList;
            if (i2 == 4) {
                passportActivity.currentEmail = this.currentEmail;
            }
            presentFragment(passportActivity);
        }
    }

    public final void processSelectedAttach$1(int i) {
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

    public final void processSelectedFiles(ArrayList arrayList) {
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
        Utilities.globalQueue.postRunnable(new ChatActivity$70$$ExternalSyntheticLambda1(this.uploadingFileType, 7, this, arrayList, z));
    }

    public final void removeValue(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return;
        }
        int size = this.currentForm.values.size();
        for (int i = 0; i < size; i++) {
            if (tL_secureRequiredType.type.getClass() == this.currentForm.values.get(i).type.getClass()) {
                this.currentForm.values.remove(i);
                return;
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.currentPicturePath = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.currentPicturePath;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void setFieldValues(HashMap map, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) map.get(str);
        if (str2 != null) {
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
                    boolean zIsEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.currentExpireDate;
                    if (zIsEmpty) {
                        iArr[2] = 0;
                        iArr[1] = 0;
                        iArr[0] = 0;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                        break;
                    } else {
                        String[] strArrSplit = str2.split("\\.");
                        if (strArrSplit.length != 3) {
                            iArr[2] = 0;
                            iArr[1] = 0;
                            iArr[0] = 0;
                            editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                        } else {
                            iArr[0] = Utilities.parseInt((CharSequence) strArrSplit[2]).intValue();
                            iArr[1] = Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                            iArr[2] = Utilities.parseInt((CharSequence) strArrSplit[0]).intValue();
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
        HashMap map2 = this.fieldsErrors;
        HashMap map3 = this.errorsValues;
        if (map2 != null && (charSequence2 = (String) map2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            map3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap map4 = this.documentsErrors;
        if (map4 == null || (charSequence = (String) map4.get(str)) == null) {
            return;
        }
        editTextBoldCursor.setErrorText(charSequence);
        map3.put(str, editTextBoldCursor.getText().toString());
    }

    public final void setPage(int i, boolean z, Bundle bundle) {
        if (i == 3) {
            this.doneItem.setVisibility(8);
        }
        int i2 = this.currentViewNum;
        SlideView[] slideViewArr = this.views;
        SlideView slideView = slideViewArr[i2];
        SlideView slideView2 = slideViewArr[i];
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
        animatorSet.addListener(new QrActivity.AnonymousClass4(slideView2, slideView));
        animatorSet.start();
    }

    public final void setTypeValue(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, boolean z, int i) {
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
        if (str4 == null || this.languageMap != null) {
            c = 2;
            this.languageMap = null;
        } else {
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
                        map5 = (HashMap) this.errorsMap.get(getNameForType(tL_secureRequiredType3.type));
                    }
                    if (tL_secureRequiredType2 != null) {
                        tL_secureRequiredType4 = tL_secureRequiredType2;
                        map6 = (HashMap) this.errorsMap.get(getNameForType(tL_secureRequiredType4.type));
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
                                                    String str6 = (String) this.languageMap.get(string);
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
            string2 = !z ? (String) this.mainErrorsMap.get(getNameForType(tL_secureRequiredType3.type)) : null;
            if (string2 == null) {
                string2 = (String) this.mainErrorsMap.get(getNameForType(tL_secureRequiredType4.type));
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

    public final void showAlertWithText(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = str;
        alertDialog.message = str2;
        showDialog(alertDialog);
    }

    public final void showEditDoneProgress$2(boolean z, final boolean z2) {
        final int i = 0;
        final int i2 = 1;
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
            this.doneItemAnimation.addListener(new AnimatorListenerAdapter(this) {
                public final PassportActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onAnimationCancel(Animator animator) {
                    switch (i) {
                        case 0:
                            PassportActivity passportActivity = this.this$0;
                            AnimatorSet animatorSet4 = passportActivity.doneItemAnimation;
                            if (animatorSet4 != null && animatorSet4.equals(animator)) {
                                passportActivity.doneItemAnimation = null;
                                break;
                            }
                            break;
                        default:
                            PassportActivity passportActivity2 = this.this$0;
                            AnimatorSet animatorSet5 = passportActivity2.doneItemAnimation;
                            if (animatorSet5 != null && animatorSet5.equals(animator)) {
                                passportActivity2.doneItemAnimation = null;
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 0:
                            PassportActivity passportActivity = this.this$0;
                            AnimatorSet animatorSet4 = passportActivity.doneItemAnimation;
                            if (animatorSet4 != null && animatorSet4.equals(animator)) {
                                if (!z2) {
                                    passportActivity.progressView.setVisibility(4);
                                } else {
                                    passportActivity.doneItem.getContentView().setVisibility(4);
                                }
                                break;
                            }
                            break;
                        default:
                            PassportActivity passportActivity2 = this.this$0;
                            AnimatorSet animatorSet5 = passportActivity2.doneItemAnimation;
                            if (animatorSet5 != null && animatorSet5.equals(animator)) {
                                if (!z2) {
                                    passportActivity2.progressViewButton.setVisibility(4);
                                } else {
                                    passportActivity2.acceptTextView.setVisibility(4);
                                }
                                break;
                            }
                            break;
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
            this.doneItemAnimation.addListener(new AnimatorListenerAdapter(this) {
                public final PassportActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onAnimationCancel(Animator animator) {
                    switch (i2) {
                        case 0:
                            PassportActivity passportActivity = this.this$0;
                            AnimatorSet animatorSet6 = passportActivity.doneItemAnimation;
                            if (animatorSet6 != null && animatorSet6.equals(animator)) {
                                passportActivity.doneItemAnimation = null;
                                break;
                            }
                            break;
                        default:
                            PassportActivity passportActivity2 = this.this$0;
                            AnimatorSet animatorSet7 = passportActivity2.doneItemAnimation;
                            if (animatorSet7 != null && animatorSet7.equals(animator)) {
                                passportActivity2.doneItemAnimation = null;
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i2) {
                        case 0:
                            PassportActivity passportActivity = this.this$0;
                            AnimatorSet animatorSet6 = passportActivity.doneItemAnimation;
                            if (animatorSet6 != null && animatorSet6.equals(animator)) {
                                if (!z2) {
                                    passportActivity.progressView.setVisibility(4);
                                } else {
                                    passportActivity.doneItem.getContentView().setVisibility(4);
                                }
                                break;
                            }
                            break;
                        default:
                            PassportActivity passportActivity2 = this.this$0;
                            AnimatorSet animatorSet7 = passportActivity2.doneItemAnimation;
                            if (animatorSet7 != null && animatorSet7.equals(animator)) {
                                if (!z2) {
                                    passportActivity2.progressViewButton.setVisibility(4);
                                } else {
                                    passportActivity2.acceptTextView.setVisibility(4);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
        }
    }

    public final void startPhoneVerification(boolean z, String str, PhotoViewer$$ExternalSyntheticLambda21 photoViewer$$ExternalSyntheticLambda21, PhotoViewer.AnonymousClass14 anonymousClass14, PassportActivityDelegate passportActivityDelegate) {
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
                        builder.alertDialog.title = LocaleController.getString(R.string.AppName);
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.AllowReadCall);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.message = string;
                        this.permissionsDialog = showDialog(alertDialog);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.permissionsItems.toArray(new String[0]), 6);
                    }
                    this.pendingPhone = str;
                    this.pendingErrorRunnable = anonymousClass14;
                    this.pendingFinishRunnable = photoViewer$$ExternalSyntheticLambda21;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new LoginActivity$$ExternalSyntheticLambda42(this, str, passportActivityDelegate, sendverifyphonecode, 8), 2);
    }

    public final void updateInterfaceStringsForDocumentType() {
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

    public final void updateManageVisibility() {
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
        if (hasNotValueForType(TLRPC.TL_secureValueTypePhone.class) || hasNotValueForType(TLRPC.TL_secureValueTypeEmail.class) || hasNotValueForType(TLRPC.TL_secureValueTypePersonalDetails.class) || hasNotValueForType(TLRPC.TL_secureValueTypePassport.class) || hasNotValueForType(TLRPC.TL_secureValueTypeInternalPassport.class) || hasNotValueForType(TLRPC.TL_secureValueTypeIdentityCard.class) || hasNotValueForType(TLRPC.TL_secureValueTypeDriverLicense.class) || hasNotValueForType(TLRPC.TL_secureValueTypeAddress.class) || hasNotValueForType(TLRPC.TL_secureValueTypeUtilityBill.class) || hasNotValueForType(TLRPC.TL_secureValueTypePassportRegistration.class) || hasNotValueForType(TLRPC.TL_secureValueTypeTemporaryRegistration.class) || hasNotValueForType(TLRPC.TL_secureValueTypeBankStatement.class) || hasNotValueForType(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.addDocumentCell.setVisibility(0);
        } else {
            this.addDocumentCell.setVisibility(8);
        }
    }

    public final void updatePasswordInterface() {
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
            this.passwordRequestTextView.setLayoutParams(LayoutHelper.createLinear(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
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
        this.passwordRequestTextView.setLayoutParams(LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        if (this.inputFields != null) {
            TL_account.Password password2 = this.currentPassword;
            if (password2 == null || TextUtils.isEmpty(password2.hint)) {
                this.inputFields[0].setHint(LocaleController.getString(R.string.LoginPassword));
            } else {
                this.inputFields[0].setHint(this.currentPassword.hint);
            }
        }
    }

    public final void updateUploadText(int i) {
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
                @Override
                public final int compare(Object obj, Object obj2) {
                    int errorValue = getErrorValue((TLRPC.SecureValueError) obj);
                    int errorValue2 = getErrorValue((TLRPC.SecureValueError) obj2);
                    if (errorValue < errorValue2) {
                        return -1;
                    }
                    return errorValue > errorValue2 ? 1 : 0;
                }

                public final int getErrorValue(TLRPC.SecureValueError secureValueError) {
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
                        return PassportActivity.access$2000(PassportActivity.this, ((TLRPC.TL_secureValueErrorData) secureValueError).field);
                    }
                    return 100;
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
        }
