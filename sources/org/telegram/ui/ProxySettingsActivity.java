package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.QRCodeBottomSheet;

public class ProxySettingsActivity extends BaseFragment {
    private static final int FIELD_IP = 0;
    private static final int FIELD_PASSWORD = 3;
    private static final int FIELD_PORT = 1;
    private static final int FIELD_SECRET = 4;
    private static final int FIELD_USER = 2;
    private static final int TYPE_MTPROTO = 1;
    private static final int TYPE_SOCKS5 = 0;
    private static final int done_button = 1;
    private boolean addingNewProxy;
    private TextInfoPrivacyCell[] bottomCells;
    private ClipboardManager.OnPrimaryClipChangedListener clipChangedListener;
    private ClipboardManager clipboardManager;
    private SharedConfig.ProxyInfo currentProxyInfo;
    private int currentType;
    private ActionBarMenuItem doneItem;
    private HeaderCell headerCell;
    private boolean ignoreOnTextChange;
    private EditTextBoldCursor[] inputFields;
    private LinearLayout inputFieldsContainer;
    private LinearLayout linearLayout2;
    private TextSettingsCell pasteCell;
    private String[] pasteFields;
    private String pasteString;
    private int pasteType;
    private ScrollView scrollView;
    private ShadowSectionCell[] sectionCell;
    private TextSettingsCell shareCell;
    private ValueAnimator shareDoneAnimator;
    private boolean shareDoneEnabled;
    private float shareDoneProgress;
    private float[] shareDoneProgressAnimValues;
    private RadioCell[] typeCell;

    public static class TypeCell extends FrameLayout {
        private ImageView checkImage;
        private boolean needDivider;
        private TextView textView;

        public TypeCell(Context context) {
            super(context);
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView2 = this.textView;
            boolean z = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 71.0f : 21.0f, 0.0f, z ? 21.0f : 23.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.checkImage = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_featuredStickers_addedIcon, false), PorterDuff.Mode.MULTIPLY));
            this.checkImage.setImageResource(R.drawable.sticker_added);
            addView(this.checkImage, LayoutHelper.createFrame(19, 14.0f, (LocaleController.isRTL ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        public void setTypeChecked(boolean z) {
            this.checkImage.setVisibility(z ? 0 : 4);
        }

        public void setValue(String str, boolean z, boolean z2) {
            this.textView.setText(str);
            this.checkImage.setVisibility(z ? 0 : 4);
            this.needDivider = z2;
        }
    }

    public ProxySettingsActivity() {
        super(null);
        this.sectionCell = new ShadowSectionCell[3];
        this.bottomCells = new TextInfoPrivacyCell[2];
        this.typeCell = new RadioCell[2];
        this.currentType = -1;
        this.pasteType = -1;
        this.shareDoneProgress = 1.0f;
        this.shareDoneProgressAnimValues = new float[2];
        this.shareDoneEnabled = true;
        this.clipChangedListener = new ClipboardManager.OnPrimaryClipChangedListener() {
            @Override
            public final void onPrimaryClipChanged() {
                this.f$0.updatePasteCell();
            }
        };
        this.currentProxyInfo = new SharedConfig.ProxyInfo("", 1080, "", "", "");
        this.addingNewProxy = true;
    }

    public void checkShareDone(boolean z) {
        if (this.shareCell == null || this.doneItem == null) {
            return;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
        boolean z2 = false;
        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
        if (editTextBoldCursor == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        if (editTextBoldCursor.length() != 0 && Utilities.parseInt((CharSequence) this.inputFields[1].getText().toString()).intValue() != 0) {
            z2 = true;
        }
        setShareDoneEnabled(z2, z);
    }

    public void lambda$createView$0(View view) {
        setProxyType(((Integer) view.getTag()).intValue(), true);
    }

    public boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            if (i != 6) {
                return false;
            }
            finishFragment();
            return true;
        }
        int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
        EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
        if (iIntValue < editTextBoldCursorArr.length) {
            editTextBoldCursorArr[iIntValue].requestFocus();
        }
        return true;
    }

    public void lambda$createView$2() {
        AndroidUtilities.hideKeyboard(this.inputFieldsContainer.findFocus());
        for (int i = 0; i < this.pasteFields.length; i++) {
            int i2 = this.pasteType;
            if ((i2 != 0 || i == 4) && (i2 != 1 || i == 2 || i == 3)) {
                this.inputFields[i].setText((CharSequence) null);
            }
        }
    }

    public void lambda$createView$3(View view) {
        if (this.pasteType == -1) {
            return;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.pasteFields;
            if (i >= strArr.length) {
                EditTextBoldCursor editTextBoldCursor = this.inputFields[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                setProxyType(this.pasteType, true, new MainTabsLayout$$ExternalSyntheticLambda0(this, 20));
                return;
            }
            int i2 = this.pasteType;
            if ((i2 != 0 || i != 4) && (i2 != 1 || (i != 2 && i != 3))) {
                String str = strArr[i];
                if (str != null) {
                    try {
                        this.inputFields[i].setText(URLDecoder.decode(str, "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                        this.inputFields[i].setText(this.pasteFields[i]);
                    }
                } else {
                    this.inputFields[i].setText((CharSequence) null);
                }
            }
            i++;
        }
    }

    public void lambda$createView$4(Context context, View view) {
        String str;
        StringBuilder sb = new StringBuilder();
        String string = this.inputFields[0].getText().toString();
        String string2 = this.inputFields[3].getText().toString();
        String string3 = this.inputFields[2].getText().toString();
        String string4 = this.inputFields[1].getText().toString();
        String string5 = this.inputFields[4].getText().toString();
        try {
            if (!TextUtils.isEmpty(string)) {
                sb.append("server=");
                sb.append(URLEncoder.encode(string, "UTF-8"));
            }
            if (!TextUtils.isEmpty(string4)) {
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append("port=");
                sb.append(URLEncoder.encode(string4, "UTF-8"));
            }
            if (this.currentType == 1) {
                str = "https://t.me/proxy?";
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append("secret=");
                sb.append(URLEncoder.encode(string5, "UTF-8"));
            } else {
                str = "https://t.me/socks?";
                if (!TextUtils.isEmpty(string3)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append("user=");
                    sb.append(URLEncoder.encode(string3, "UTF-8"));
                }
                if (!TextUtils.isEmpty(string2)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append("pass=");
                    sb.append(URLEncoder.encode(string2, "UTF-8"));
                }
            }
            if (sb.length() == 0) {
                return;
            }
            StringBuilder sbM = DiffUtil.m(str);
            sbM.append(sb.toString());
            QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet(context, LocaleController.getString(R.string.ShareQrCode), sbM.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
            qRCodeBottomSheet.setCenterImage(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
            showDialog(qRCodeBottomSheet);
        } catch (Exception unused) {
        }
    }

    public void lambda$getThemeDescriptions$6() {
        ValueAnimator valueAnimator;
        if (this.shareCell != null && ((valueAnimator = this.shareDoneAnimator) == null || !valueAnimator.isRunning())) {
            this.shareCell.setTextColor(Theme.getColor(null, this.shareDoneEnabled ? Theme.key_windowBackgroundWhiteBlueText4 : Theme.key_windowBackgroundWhiteGrayText2, false));
        }
        if (this.inputFields == null) {
            return;
        }
        int i = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            if (i >= editTextBoldCursorArr.length) {
                return;
            }
            editTextBoldCursorArr[i].setLineColors(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
            i++;
        }
    }

    public void lambda$setShareDoneEnabled$5(ValueAnimator valueAnimator) {
        this.shareDoneProgress = AndroidUtilities.lerp(this.shareDoneProgressAnimValues, valueAnimator.getAnimatedFraction());
        this.shareCell.setTextColor(ColorUtils.blendARGB(this.shareDoneProgress, Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false)));
        this.doneItem.setAlpha((this.shareDoneProgress / 2.0f) + 0.5f);
    }

    private void setProxyType(int i, boolean z) {
        setProxyType(i, z, null);
    }

    private void setShareDoneEnabled(boolean z, boolean z2) {
        if (this.shareDoneEnabled != z) {
            ValueAnimator valueAnimator = this.shareDoneAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.shareDoneAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(200L);
                this.shareDoneAnimator.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, 14));
            }
            if (z2) {
                float[] fArr = this.shareDoneProgressAnimValues;
                fArr[0] = this.shareDoneProgress;
                fArr[1] = z ? 1.0f : 0.0f;
                this.shareDoneAnimator.start();
            } else {
                this.shareDoneProgress = z ? 1.0f : 0.0f;
                this.shareCell.setTextColor(Theme.getColor(null, z ? Theme.key_windowBackgroundWhiteBlueText4 : Theme.key_windowBackgroundWhiteGrayText2, false));
                this.doneItem.setAlpha(z ? 1.0f : 0.5f);
            }
            this.shareCell.setEnabled(z);
            this.doneItem.setEnabled(z);
            this.shareDoneEnabled = z;
        }
    }

    public void updatePasteCell() {
        String string;
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        String[] strArrSplit = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            string = null;
        } else {
            try {
                string = primaryClip.getItemAt(0).coerceToText(this.fragmentView.getContext()).toString();
            } catch (Exception unused) {
                string = null;
            }
        }
        if (TextUtils.equals(string, this.pasteString)) {
            return;
        }
        this.pasteType = -1;
        this.pasteString = string;
        this.pasteFields = new String[this.inputFields.length];
        if (string != null) {
            String[] strArr = {"t.me/socks?", "tg://socks?"};
            for (int i = 0; i < 2; i++) {
                int iIndexOf = string.indexOf(strArr[i]);
                if (iIndexOf >= 0) {
                    this.pasteType = 0;
                    strArrSplit = string.substring(strArr[i].length() + iIndexOf).split("&");
                    break;
                }
            }
            if (strArrSplit == null) {
                String[] strArr2 = {"t.me/proxy?", "tg://proxy?"};
                for (int i2 = 0; i2 < 2; i2++) {
                    int iIndexOf2 = string.indexOf(strArr2[i2]);
                    if (iIndexOf2 >= 0) {
                        this.pasteType = 1;
                        strArrSplit = string.substring(strArr2[i2].length() + iIndexOf2).split("&");
                        break;
                    }
                }
            }
            if (strArrSplit != null) {
                for (String str : strArrSplit) {
                    String[] strArrSplit2 = str.split("=");
                    if (strArrSplit2.length == 2) {
                        String lowerCase = strArrSplit2[0].toLowerCase();
                        lowerCase.getClass();
                        switch (lowerCase) {
                            case "secret":
                                if (this.pasteType == 1) {
                                    this.pasteFields[4] = strArrSplit2[1];
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "server":
                                this.pasteFields[0] = strArrSplit2[1];
                                break;
                            case "pass":
                                if (this.pasteType == 0) {
                                    this.pasteFields[3] = strArrSplit2[1];
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "port":
                                this.pasteFields[1] = strArrSplit2[1];
                                break;
                            case "user":
                                if (this.pasteType == 0) {
                                    this.pasteFields[2] = strArrSplit2[1];
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    }
                }
            }
        }
        if (this.pasteType != -1) {
            if (this.pasteCell.getVisibility() != 0) {
                this.pasteCell.setVisibility(0);
                this.sectionCell[2].setVisibility(0);
                return;
            }
            return;
        }
        if (this.pasteCell.getVisibility() != 8) {
            this.pasteCell.setVisibility(8);
            this.sectionCell[2].setVisibility(8);
        }
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                boolean z;
                if (i == -1) {
                    ProxySettingsActivity.this.finishFragment();
                    return;
                }
                if (i != 1 || ProxySettingsActivity.this.getParentActivity() == null) {
                    return;
                }
                ProxySettingsActivity.this.currentProxyInfo.address = ProxySettingsActivity.this.inputFields[0].getText().toString();
                ProxySettingsActivity.this.currentProxyInfo.port = Utilities.parseInt((CharSequence) ProxySettingsActivity.this.inputFields[1].getText().toString()).intValue();
                if (ProxySettingsActivity.this.currentType == 0) {
                    ProxySettingsActivity.this.currentProxyInfo.secret = "";
                    ProxySettingsActivity.this.currentProxyInfo.username = ProxySettingsActivity.this.inputFields[2].getText().toString();
                    ProxySettingsActivity.this.currentProxyInfo.password = ProxySettingsActivity.this.inputFields[3].getText().toString();
                } else {
                    ProxySettingsActivity.this.currentProxyInfo.secret = ProxySettingsActivity.this.inputFields[4].getText().toString();
                    ProxySettingsActivity.this.currentProxyInfo.username = "";
                    ProxySettingsActivity.this.currentProxyInfo.password = "";
                }
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                SharedPreferences.Editor editorEdit = globalMainSettings.edit();
                if (ProxySettingsActivity.this.addingNewProxy) {
                    SharedConfig.addProxy(ProxySettingsActivity.this.currentProxyInfo);
                    SharedConfig.currentProxy = ProxySettingsActivity.this.currentProxyInfo;
                    editorEdit.putBoolean("proxy_enabled", true);
                    z = true;
                } else {
                    boolean z2 = globalMainSettings.getBoolean("proxy_enabled", false);
                    SharedConfig.saveProxyList();
                    z = z2;
                }
                if (ProxySettingsActivity.this.addingNewProxy || SharedConfig.currentProxy == ProxySettingsActivity.this.currentProxyInfo) {
                    editorEdit.putString("proxy_ip", ProxySettingsActivity.this.currentProxyInfo.address);
                    editorEdit.putString("proxy_pass", ProxySettingsActivity.this.currentProxyInfo.password);
                    editorEdit.putString("proxy_user", ProxySettingsActivity.this.currentProxyInfo.username);
                    editorEdit.putInt("proxy_port", ProxySettingsActivity.this.currentProxyInfo.port);
                    editorEdit.putString("proxy_secret", ProxySettingsActivity.this.currentProxyInfo.secret);
                    ConnectionsManager.setProxySettings(z, ProxySettingsActivity.this.currentProxyInfo.address, ProxySettingsActivity.this.currentProxyInfo.port, ProxySettingsActivity.this.currentProxyInfo.username, ProxySettingsActivity.this.currentProxyInfo.password, ProxySettingsActivity.this.currentProxyInfo.secret);
                }
                editorEdit.commit();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                ProxySettingsActivity.this.finishFragment();
            }
        });
        ActionBarMenuItem actionBarMenuItemAddItemWithWidth = this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.doneItem = actionBarMenuItemAddItemWithWidth;
        actionBarMenuItemAddItemWithWidth.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(null, Theme.key_actionBarDefault, false));
        frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout2 = linearLayout;
        linearLayout.setOrientation(1);
        this.scrollView.addView(this.linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        final int i = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final ProxySettingsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$createView$0(view);
                        break;
                    default:
                        this.f$0.lambda$createView$3(view);
                        break;
                }
            }
        };
        int i2 = 0;
        while (i2 < 2) {
            this.typeCell[i2] = new RadioCell(context, null);
            this.typeCell[i2].setBackground(Theme.getSelectorDrawable(true));
            this.typeCell[i2].setTag(Integer.valueOf(i2));
            if (i2 == 0) {
                this.typeCell[i2].setText(LocaleController.getString(R.string.UseProxySocks5), i2 == this.currentType, true);
            } else {
                this.typeCell[i2].setText(LocaleController.getString(R.string.UseProxyTelegram), i2 == this.currentType, false);
            }
            this.linearLayout2.addView(this.typeCell[i2], LayoutHelper.createLinear(-1, 50));
            this.typeCell[i2].setOnClickListener(onClickListener);
            i2++;
        }
        this.sectionCell[0] = new ShadowSectionCell(context, null, 0);
        this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.inputFieldsContainer = linearLayout2;
        linearLayout2.setOrientation(1);
        this.inputFieldsContainer.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.inputFieldsContainer.setElevation(AndroidUtilities.dp(1.0f));
        this.inputFieldsContainer.setOutlineProvider(null);
        this.linearLayout2.addView(this.inputFieldsContainer, LayoutHelper.createLinear(-1, -2));
        this.inputFields = new EditTextBoldCursor[5];
        int i3 = 0;
        for (int i4 = 5; i3 < i4; i4 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.inputFieldsContainer.addView(frameLayout2, LayoutHelper.createLinear(-1, 64));
            this.inputFields[i3] = new EditTextBoldCursor(context);
            this.inputFields[i3].setTag(Integer.valueOf(i3));
            this.inputFields[i3].setTextSize(1, 16.0f);
            this.inputFields[i3].setHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            EditTextBoldCursor editTextBoldCursor = this.inputFields[i3];
            int i5 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor.setTextColor(Theme.getColor(null, i5, false));
            this.inputFields[i3].setBackground(null);
            this.inputFields[i3].setCursorColor(Theme.getColor(null, i5, false));
            this.inputFields[i3].setCursorSize(AndroidUtilities.dp(20.0f));
            this.inputFields[i3].setCursorWidth(1.5f);
            this.inputFields[i3].setSingleLine(true);
            this.inputFields[i3].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.inputFields[i3].setHeaderHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
            this.inputFields[i3].setTransformHintToHeader(true);
            this.inputFields[i3].setLineColors(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
            if (i3 == 0) {
                this.inputFields[i3].setInputType(524305);
                this.inputFields[i3].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                        ProxySettingsActivity.this.checkShareDone(true);
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    }
                });
            } else if (i3 == 1) {
                this.inputFields[i3].setInputType(2);
                this.inputFields[i3].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (ProxySettingsActivity.this.ignoreOnTextChange) {
                            return;
                        }
                        EditTextBoldCursor editTextBoldCursor2 = ProxySettingsActivity.this.inputFields[1];
                        int selectionStart = editTextBoldCursor2.getSelectionStart();
                        String string = editTextBoldCursor2.getText().toString();
                        StringBuilder sb = new StringBuilder(string.length());
                        int i6 = 0;
                        while (i6 < string.length()) {
                            int i7 = i6 + 1;
                            String strSubstring = string.substring(i6, i7);
                            if ("0123456789".contains(strSubstring)) {
                                sb.append(strSubstring);
                            }
                            i6 = i7;
                        }
                        ProxySettingsActivity.this.ignoreOnTextChange = true;
                        int iIntValue = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                        if (iIntValue < 0 || iIntValue > 65535 || !string.equals(sb.toString())) {
                            if (iIntValue < 0) {
                                editTextBoldCursor2.setText("0");
                            } else if (iIntValue > 65535) {
                                editTextBoldCursor2.setText("65535");
                            } else {
                                editTextBoldCursor2.setText(sb.toString());
                            }
                        } else if (selectionStart >= 0) {
                            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
                        }
                        ProxySettingsActivity.this.ignoreOnTextChange = false;
                        ProxySettingsActivity.this.checkShareDone(true);
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    }
                });
            } else if (i3 == 3) {
                this.inputFields[i3].setInputType(129);
                this.inputFields[i3].setTypeface(Typeface.DEFAULT);
                this.inputFields[i3].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.inputFields[i3].setInputType(524289);
            }
            this.inputFields[i3].setImeOptions(268435461);
            if (i3 == 0) {
                this.inputFields[i3].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.inputFields[i3].setText(this.currentProxyInfo.address);
            } else if (i3 == 1) {
                this.inputFields[i3].setHintText(LocaleController.getString(R.string.UseProxyPort));
                this.inputFields[i3].setText("" + this.currentProxyInfo.port);
            } else if (i3 == 2) {
                this.inputFields[i3].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                this.inputFields[i3].setText(this.currentProxyInfo.username);
            } else if (i3 == 3) {
                this.inputFields[i3].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                this.inputFields[i3].setText(this.currentProxyInfo.password);
            } else if (i3 == 4) {
                this.inputFields[i3].setHintText(LocaleController.getString(R.string.UseProxySecret));
                this.inputFields[i3].setText(this.currentProxyInfo.secret);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i3];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.inputFields[i3].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.inputFields[i3], LayoutHelper.createFrame(-1, -1.0f, 51, 17.0f, i3 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.inputFields[i3].setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda350(this, 11));
            i3++;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            this.bottomCells[i6] = new TextInfoPrivacyCell(context, 24, null);
            this.bottomCells[i6].setBackground(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            if (i6 == 0) {
                this.bottomCells[i6].setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                TextInfoPrivacyCell textInfoPrivacyCell = this.bottomCells[i6];
                StringBuilder sb = new StringBuilder();
                zzko.m(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                textInfoPrivacyCell.setText(sb.toString());
                this.bottomCells[i6].setVisibility(8);
            }
            this.linearLayout2.addView(this.bottomCells[i6], LayoutHelper.createLinear(-1, -2));
        }
        TextSettingsCell textSettingsCell = new TextSettingsCell(this.fragmentView.getContext(), null, 0);
        this.pasteCell = textSettingsCell;
        textSettingsCell.setBackground(Theme.getSelectorDrawable(true));
        this.pasteCell.setText(LocaleController.getString(R.string.PasteFromClipboard), false);
        TextSettingsCell textSettingsCell2 = this.pasteCell;
        int i7 = Theme.key_windowBackgroundWhiteBlueText4;
        textSettingsCell2.setTextColor(Theme.getColor(null, i7, false));
        final int i8 = 1;
        this.pasteCell.setOnClickListener(new View.OnClickListener(this) {
            public final ProxySettingsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        this.f$0.lambda$createView$0(view);
                        break;
                    default:
                        this.f$0.lambda$createView$3(view);
                        break;
                }
            }
        });
        this.linearLayout2.addView(this.pasteCell, 0, LayoutHelper.createLinear(-1, -2));
        this.pasteCell.setVisibility(8);
        this.sectionCell[2] = new ShadowSectionCell(this.fragmentView.getContext(), null, 0);
        ShadowSectionCell shadowSectionCell = this.sectionCell[2];
        Context context2 = this.fragmentView.getContext();
        int i9 = R.drawable.greydivider_bottom;
        int i10 = Theme.key_windowBackgroundGrayShadow;
        shadowSectionCell.setBackground(Theme.getThemedDrawableByKey(context2, i9, i10));
        this.linearLayout2.addView(this.sectionCell[2], 1, LayoutHelper.createLinear(-1, -2));
        this.sectionCell[2].setVisibility(8);
        TextSettingsCell textSettingsCell3 = new TextSettingsCell(context, null, 0);
        this.shareCell = textSettingsCell3;
        textSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        this.shareCell.setText(LocaleController.getString(R.string.ShareFile), false);
        this.shareCell.setTextColor(Theme.getColor(null, i7, false));
        this.linearLayout2.addView(this.shareCell, LayoutHelper.createLinear(-1, -2));
        this.shareCell.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(23, this, context));
        this.sectionCell[1] = new ShadowSectionCell(context, null, 0);
        this.sectionCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i9, i10));
        this.linearLayout2.addView(this.sectionCell[1], LayoutHelper.createLinear(-1, -2));
        this.clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        this.shareDoneEnabled = true;
        this.shareDoneProgress = 1.0f;
        checkShareDone(false);
        this.currentType = -1;
        setProxyType(!TextUtils.isEmpty(this.currentProxyInfo.secret) ? 1 : 0, false);
        this.pasteType = -1;
        this.pasteString = null;
        updatePasteCell();
        return this.fragmentView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        QrActivity$$ExternalSyntheticLambda18 qrActivity$$ExternalSyntheticLambda18 = new QrActivity$$ExternalSyntheticLambda18(this, 3);
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
        LinearLayout linearLayout = this.inputFieldsContainer;
        int i2 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.shareCell, 268435456, null, null, null, null, i2));
        TextSettingsCell textSettingsCell = this.shareCell;
        int i3 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(textSettingsCell, 268435456, null, null, null, null, i3));
        int i4 = Theme.key_windowBackgroundWhiteBlueText4;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda18, i4));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda18, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.pasteCell, 268435456, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.pasteCell, 268435456, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.pasteCell, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        int i5 = 0;
        while (true) {
            RadioCell[] radioCellArr = this.typeCell;
            if (i5 >= radioCellArr.length) {
                break;
            }
            arrayList.add(new ThemeDescription(radioCellArr[i5], 268435456, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.typeCell[i5], 268435456, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(this.typeCell[i5], 0, new Class[]{RadioCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(this.typeCell[i5], 8192, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackground));
            arrayList.add(new ThemeDescription(this.typeCell[i5], 16384, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackgroundChecked));
            i5++;
        }
        if (this.inputFields != null) {
            int i6 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
                if (i6 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i6];
                int i7 = Theme.key_windowBackgroundWhiteBlackText;
                arrayList.add(new ThemeDescription(editTextBoldCursor, 4, null, null, null, null, i7));
                arrayList.add(new ThemeDescription(this.inputFields[i6], 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
                arrayList.add(new ThemeDescription(this.inputFields[i6], 8390656, null, null, null, null, Theme.key_windowBackgroundWhiteBlueHeader));
                arrayList.add(new ThemeDescription(this.inputFields[i6], 16777216, null, null, null, null, i7));
                arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda18, Theme.key_windowBackgroundWhiteInputField));
                arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda18, Theme.key_windowBackgroundWhiteInputFieldActivated));
                arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda18, Theme.key_text_RedRegular));
                i6++;
            }
        } else {
            arrayList.add(new ThemeDescription(null, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(null, 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
        }
        arrayList.add(new ThemeDescription(this.headerCell, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.headerCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i8 = 0;
        while (true) {
            ShadowSectionCell[] shadowSectionCellArr = this.sectionCell;
            if (i8 >= shadowSectionCellArr.length) {
                break;
            }
            ShadowSectionCell shadowSectionCell = shadowSectionCellArr[i8];
            if (shadowSectionCell != null) {
                arrayList.add(new ThemeDescription(shadowSectionCell, 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
            }
            i8++;
        }
        int i9 = 0;
        while (true) {
            TextInfoPrivacyCell[] textInfoPrivacyCellArr = this.bottomCells;
            if (i9 >= textInfoPrivacyCellArr.length) {
                return arrayList;
            }
            arrayList.add(new ThemeDescription(textInfoPrivacyCellArr[i9], 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
            arrayList.add(new ThemeDescription(this.bottomCells[i9], 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
            arrayList.add(new ThemeDescription(this.bottomCells[i9], 2, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteLinkText));
            i9++;
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        this.clipboardManager.removePrimaryClipChangedListener(this.clipChangedListener);
    }

    @Override
    public void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.clipboardManager.addPrimaryClipChangedListener(this.clipChangedListener);
        updatePasteCell();
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2 && this.addingNewProxy) {
            this.inputFields[0].requestFocus();
            AndroidUtilities.showKeyboard(this.inputFields[0]);
        }
    }

    private void setProxyType(int i, boolean z, final Runnable runnable) {
        if (this.currentType != i) {
            this.currentType = i;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.linearLayout2);
            }
            if (z) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT).setDuration(250L);
                if (runnable != null) {
                    duration.addListener(new Transition.TransitionListener() {
                        @Override
                        public void onTransitionCancel(Transition transition) {
                        }

                        @Override
                        public void onTransitionEnd(Transition transition) {
                            runnable.run();
                        }

                        @Override
                        public void onTransitionPause(Transition transition) {
                        }

                        @Override
                        public void onTransitionResume(Transition transition) {
                        }

                        @Override
                        public void onTransitionStart(Transition transition) {
                        }
                    });
                }
                TransitionManager.beginDelayedTransition(this.linearLayout2, duration);
            }
            int i2 = this.currentType;
            if (i2 == 0) {
                this.bottomCells[0].setVisibility(0);
                this.bottomCells[1].setVisibility(8);
                ((View) this.inputFields[4].getParent()).setVisibility(8);
                ((View) this.inputFields[3].getParent()).setVisibility(0);
                ((View) this.inputFields[2].getParent()).setVisibility(0);
            } else if (i2 == 1) {
                this.bottomCells[0].setVisibility(8);
                this.bottomCells[1].setVisibility(0);
                ((View) this.inputFields[4].getParent()).setVisibility(0);
                ((View) this.inputFields[3].getParent()).setVisibility(8);
                ((View) this.inputFields[2].getParent()).setVisibility(8);
            }
            this.typeCell[0].setChecked(this.currentType == 0, z);
            this.typeCell[1].setChecked(this.currentType == 1, z);
        }
    }

    public ProxySettingsActivity(SharedConfig.ProxyInfo proxyInfo) {
        super(null);
        this.sectionCell = new ShadowSectionCell[3];
        this.bottomCells = new TextInfoPrivacyCell[2];
        this.typeCell = new RadioCell[2];
        this.currentType = -1;
        this.pasteType = -1;
        this.shareDoneProgress = 1.0f;
        this.shareDoneProgressAnimValues = new float[2];
        this.shareDoneEnabled = true;
        this.clipChangedListener = new ClipboardManager.OnPrimaryClipChangedListener() {
            @Override
            public final void onPrimaryClipChanged() {
                this.f$0.updatePasteCell();
            }
        };
        this.currentProxyInfo = proxyInfo;
    }
}
