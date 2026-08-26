package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
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
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
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
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.LayoutHelper;

public final class ProxySettingsActivity extends BaseFragment {
    public final boolean addingNewProxy;
    public final TextInfoPrivacyCell[] bottomCells;
    public final ClipboardManager.OnPrimaryClipChangedListener clipChangedListener;
    public ClipboardManager clipboardManager;
    public final SharedConfig.ProxyInfo currentProxyInfo;
    public int currentType;
    public ActionBarMenuItem doneItem;
    public boolean ignoreOnTextChange;
    public EditTextBoldCursor[] inputFields;
    public LinearLayout inputFieldsContainer;
    public LinearLayout linearLayout2;
    public TextSettingsCell pasteCell;
    public String[] pasteFields;
    public String pasteString;
    public int pasteType;
    public ScrollView scrollView;
    public final ShadowSectionCell[] sectionCell;
    public TextSettingsCell shareCell;
    public ValueAnimator shareDoneAnimator;
    public boolean shareDoneEnabled;
    public float shareDoneProgress;
    public final float[] shareDoneProgressAnimValues;
    public final RadioCell[] typeCell;

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

    public final void checkShareDone(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        int i = 1;
        if (this.shareCell == null || this.doneItem == null || (editTextBoldCursor = (editTextBoldCursorArr = this.inputFields)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z2 = (editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.inputFields[1].getText().toString()).intValue() == 0) ? false : true;
        if (this.shareDoneEnabled != z2) {
            ValueAnimator valueAnimator = this.shareDoneAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.shareDoneAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(200L);
                this.shareDoneAnimator.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, i));
            }
            if (z) {
                float f = this.shareDoneProgress;
                float[] fArr = this.shareDoneProgressAnimValues;
                fArr[0] = f;
                fArr[1] = z2 ? 1.0f : 0.0f;
                this.shareDoneAnimator.start();
            } else {
                this.shareDoneProgress = z2 ? 1.0f : 0.0f;
                this.shareCell.setTextColor(Theme.getColor(null, z2 ? Theme.key_windowBackgroundWhiteBlueText4 : Theme.key_windowBackgroundWhiteGrayText2, false));
                this.doneItem.setAlpha(z2 ? 1.0f : 0.5f);
            }
            this.shareCell.setEnabled(z2);
            this.doneItem.setEnabled(z2);
            this.shareDoneEnabled = z2;
        }
    }

    @Override
    public final View createView(Context context) {
        SharedConfig.ProxyInfo proxyInfo;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public final void onItemClick(int i) {
                boolean z;
                ProxySettingsActivity proxySettingsActivity = ProxySettingsActivity.this;
                if (i == -1) {
                    proxySettingsActivity.finishFragment();
                    return;
                }
                if (i != 1 || proxySettingsActivity.getParentActivity() == null) {
                    return;
                }
                String string = proxySettingsActivity.inputFields[0].getText().toString();
                SharedConfig.ProxyInfo proxyInfo2 = proxySettingsActivity.currentProxyInfo;
                proxyInfo2.address = string;
                proxyInfo2.port = Utilities.parseInt((CharSequence) proxySettingsActivity.inputFields[1].getText().toString()).intValue();
                if (proxySettingsActivity.currentType == 0) {
                    proxyInfo2.secret = "";
                    proxyInfo2.username = proxySettingsActivity.inputFields[2].getText().toString();
                    proxyInfo2.password = proxySettingsActivity.inputFields[3].getText().toString();
                } else {
                    proxyInfo2.secret = proxySettingsActivity.inputFields[4].getText().toString();
                    proxyInfo2.username = "";
                    proxyInfo2.password = "";
                }
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                SharedPreferences.Editor editorEdit = globalMainSettings.edit();
                boolean z2 = proxySettingsActivity.addingNewProxy;
                if (z2) {
                    SharedConfig.addProxy(proxyInfo2);
                    SharedConfig.currentProxy = proxyInfo2;
                    editorEdit.putBoolean("proxy_enabled", true);
                    z = true;
                } else {
                    boolean z3 = globalMainSettings.getBoolean("proxy_enabled", false);
                    SharedConfig.saveProxyList();
                    z = z3;
                }
                if (z2 || SharedConfig.currentProxy == proxyInfo2) {
                    editorEdit.putString("proxy_ip", proxyInfo2.address);
                    editorEdit.putString("proxy_pass", proxyInfo2.password);
                    editorEdit.putString("proxy_user", proxyInfo2.username);
                    editorEdit.putInt("proxy_port", proxyInfo2.port);
                    editorEdit.putString("proxy_secret", proxyInfo2.secret);
                    ConnectionsManager.setProxySettings(z, proxyInfo2.address, proxyInfo2.port, proxyInfo2.username, proxyInfo2.password, proxyInfo2.secret);
                }
                editorEdit.commit();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                proxySettingsActivity.finishFragment();
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
        int i = -1;
        frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout2 = linearLayout;
        linearLayout.setOrientation(1);
        this.scrollView.addView(this.linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        final int i2 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final ProxySettingsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.setProxyType(((Integer) view.getTag()).intValue(), true, null);
                        break;
                    default:
                        ProxySettingsActivity proxySettingsActivity = this.f$0;
                        if (proxySettingsActivity.pasteType != -1) {
                            int i3 = 0;
                            while (true) {
                                String[] strArr = proxySettingsActivity.pasteFields;
                                if (i3 >= strArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = proxySettingsActivity.inputFields[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    proxySettingsActivity.setProxyType(proxySettingsActivity.pasteType, true, new ProfileActivity$9$$ExternalSyntheticLambda1(proxySettingsActivity, 6));
                                } else {
                                    int i4 = proxySettingsActivity.pasteType;
                                    if ((i4 != 0 || i3 != 4) && (i4 != 1 || (i3 != 2 && i3 != 3))) {
                                        String str = strArr[i3];
                                        if (str != null) {
                                            try {
                                                proxySettingsActivity.inputFields[i3].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                proxySettingsActivity.inputFields[i3].setText(proxySettingsActivity.pasteFields[i3]);
                                            }
                                        } else {
                                            proxySettingsActivity.inputFields[i3].setText((CharSequence) null);
                                        }
                                    }
                                    i3++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i3 = 0;
        while (i3 < 2) {
            RadioCell radioCell = new RadioCell(context, null);
            RadioCell[] radioCellArr = this.typeCell;
            radioCellArr[i3] = radioCell;
            radioCell.setBackground(Theme.getSelectorDrawable(true));
            radioCellArr[i3].setTag(Integer.valueOf(i3));
            if (i3 == 0) {
                radioCellArr[i3].setText(LocaleController.getString(R.string.UseProxySocks5), i3 == this.currentType, true);
            } else {
                radioCellArr[i3].setText(LocaleController.getString(R.string.UseProxyTelegram), i3 == this.currentType, false);
            }
            this.linearLayout2.addView(radioCellArr[i3], LayoutHelper.createLinear(-1, 50));
            radioCellArr[i3].setOnClickListener(onClickListener);
            i3++;
        }
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, (Object) null);
        ShadowSectionCell[] shadowSectionCellArr = this.sectionCell;
        shadowSectionCellArr[0] = shadowSectionCell;
        this.linearLayout2.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.inputFieldsContainer = linearLayout2;
        linearLayout2.setOrientation(1);
        this.inputFieldsContainer.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.inputFieldsContainer.setElevation(AndroidUtilities.dp(1.0f));
        this.inputFieldsContainer.setOutlineProvider(null);
        this.linearLayout2.addView(this.inputFieldsContainer, LayoutHelper.createLinear(-1, -2));
        int i4 = 5;
        this.inputFields = new EditTextBoldCursor[5];
        int i5 = 0;
        while (true) {
            proxyInfo = this.currentProxyInfo;
            if (i5 >= i4) {
                break;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.inputFieldsContainer.addView(frameLayout2, LayoutHelper.createLinear(i, 64));
            this.inputFields[i5] = new EditTextBoldCursor(context);
            this.inputFields[i5].setTag(Integer.valueOf(i5));
            this.inputFields[i5].setTextSize(1, 16.0f);
            this.inputFields[i5].setHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            EditTextBoldCursor editTextBoldCursor = this.inputFields[i5];
            int i6 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor.setTextColor(Theme.getColor(null, i6, false));
            this.inputFields[i5].setBackground(null);
            this.inputFields[i5].setCursorColor(Theme.getColor(null, i6, false));
            this.inputFields[i5].setCursorSize(AndroidUtilities.dp(20.0f));
            this.inputFields[i5].setCursorWidth(1.5f);
            this.inputFields[i5].setSingleLine(true);
            this.inputFields[i5].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.inputFields[i5].setHeaderHintColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
            this.inputFields[i5].setTransformHintToHeader(true);
            this.inputFields[i5].setLineColors(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
            if (i5 == 0) {
                this.inputFields[i5].setInputType(524305);
                final int i7 = 0;
                this.inputFields[i5].addTextChangedListener(new TextWatcher(this) {
                    public final ProxySettingsActivity this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void afterTextChanged(Editable editable) {
                        switch (i7) {
                            case 0:
                                this.this$0.checkShareDone(true);
                                break;
                            default:
                                ProxySettingsActivity proxySettingsActivity = this.this$0;
                                if (!proxySettingsActivity.ignoreOnTextChange) {
                                    EditTextBoldCursor editTextBoldCursor2 = proxySettingsActivity.inputFields[1];
                                    int selectionStart = editTextBoldCursor2.getSelectionStart();
                                    String string = editTextBoldCursor2.getText().toString();
                                    StringBuilder sb = new StringBuilder(string.length());
                                    int i8 = 0;
                                    while (i8 < string.length()) {
                                        int i9 = i8 + 1;
                                        String strSubstring = string.substring(i8, i9);
                                        if ("0123456789".contains(strSubstring)) {
                                            sb.append(strSubstring);
                                        }
                                        i8 = i9;
                                    }
                                    proxySettingsActivity.ignoreOnTextChange = true;
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
                                    proxySettingsActivity.ignoreOnTextChange = false;
                                    proxySettingsActivity.checkShareDone(true);
                                    break;
                                }
                                break;
                        }
                    }

                    @Override
                    public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
                        int i11 = i7;
                    }

                    @Override
                    public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
                        int i11 = i7;
                    }

                    private final void beforeTextChanged$org$telegram$ui$ProxySettingsActivity$2(int i8, int i9, int i10, CharSequence charSequence) {
                    }

                    private final void beforeTextChanged$org$telegram$ui$ProxySettingsActivity$3(int i8, int i9, int i10, CharSequence charSequence) {
                    }

                    private final void onTextChanged$org$telegram$ui$ProxySettingsActivity$2(int i8, int i9, int i10, CharSequence charSequence) {
                    }

                    private final void onTextChanged$org$telegram$ui$ProxySettingsActivity$3(int i8, int i9, int i10, CharSequence charSequence) {
                    }
                });
            } else if (i5 == 1) {
                this.inputFields[i5].setInputType(2);
                final int i8 = 1;
                this.inputFields[i5].addTextChangedListener(new TextWatcher(this) {
                    public final ProxySettingsActivity this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void afterTextChanged(Editable editable) {
                        switch (i8) {
                            case 0:
                                this.this$0.checkShareDone(true);
                                break;
                            default:
                                ProxySettingsActivity proxySettingsActivity = this.this$0;
                                if (!proxySettingsActivity.ignoreOnTextChange) {
                                    EditTextBoldCursor editTextBoldCursor2 = proxySettingsActivity.inputFields[1];
                                    int selectionStart = editTextBoldCursor2.getSelectionStart();
                                    String string = editTextBoldCursor2.getText().toString();
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
                                    proxySettingsActivity.ignoreOnTextChange = true;
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
                                    proxySettingsActivity.ignoreOnTextChange = false;
                                    proxySettingsActivity.checkShareDone(true);
                                    break;
                                }
                                break;
                        }
                    }

                    @Override
                    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
                        int i12 = i8;
                    }

                    @Override
                    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
                        int i12 = i8;
                    }

                    private final void beforeTextChanged$org$telegram$ui$ProxySettingsActivity$2(int i9, int i10, int i11, CharSequence charSequence) {
                    }

                    private final void beforeTextChanged$org$telegram$ui$ProxySettingsActivity$3(int i9, int i10, int i11, CharSequence charSequence) {
                    }

                    private final void onTextChanged$org$telegram$ui$ProxySettingsActivity$2(int i9, int i10, int i11, CharSequence charSequence) {
                    }

                    private final void onTextChanged$org$telegram$ui$ProxySettingsActivity$3(int i9, int i10, int i11, CharSequence charSequence) {
                    }
                });
            } else if (i5 == 3) {
                this.inputFields[i5].setInputType(129);
                this.inputFields[i5].setTypeface(Typeface.DEFAULT);
                this.inputFields[i5].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.inputFields[i5].setInputType(524289);
            }
            this.inputFields[i5].setImeOptions(268435461);
            if (i5 == 0) {
                this.inputFields[i5].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.inputFields[i5].setText(proxyInfo.address);
            } else if (i5 == 1) {
                this.inputFields[i5].setHintText(LocaleController.getString(R.string.UseProxyPort));
                this.inputFields[i5].setText("" + proxyInfo.port);
            } else if (i5 == 2) {
                this.inputFields[i5].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                this.inputFields[i5].setText(proxyInfo.username);
            } else if (i5 == 3) {
                this.inputFields[i5].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                this.inputFields[i5].setText(proxyInfo.password);
            } else if (i5 == 4) {
                this.inputFields[i5].setHintText(LocaleController.getString(R.string.UseProxySecret));
                this.inputFields[i5].setText(proxyInfo.secret);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i5];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.inputFields[i5].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.inputFields[i5], LayoutHelper.createFrame(-1, -1.0f, 51, 17.0f, i5 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.inputFields[i5].setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 21));
            i5++;
            i4 = 5;
            i = -1;
        }
        for (int i9 = 0; i9 < 2; i9++) {
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
            TextInfoPrivacyCell[] textInfoPrivacyCellArr = this.bottomCells;
            textInfoPrivacyCellArr[i9] = textInfoPrivacyCell;
            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            if (i9 == 0) {
                textInfoPrivacyCellArr[i9].setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                TextInfoPrivacyCell textInfoPrivacyCell2 = textInfoPrivacyCellArr[i9];
                StringBuilder sb = new StringBuilder();
                zzlf.m(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                textInfoPrivacyCell2.setText(sb.toString());
                textInfoPrivacyCellArr[i9].setVisibility(8);
            }
            this.linearLayout2.addView(textInfoPrivacyCellArr[i9], LayoutHelper.createLinear(-1, -2));
        }
        TextSettingsCell textSettingsCell = new TextSettingsCell(this.fragmentView.getContext(), 0, null);
        this.pasteCell = textSettingsCell;
        textSettingsCell.setBackground(Theme.getSelectorDrawable(true));
        this.pasteCell.setText(LocaleController.getString(R.string.PasteFromClipboard), false);
        TextSettingsCell textSettingsCell2 = this.pasteCell;
        int i10 = Theme.key_windowBackgroundWhiteBlueText4;
        textSettingsCell2.setTextColor(Theme.getColor(null, i10, false));
        final int i11 = 1;
        this.pasteCell.setOnClickListener(new View.OnClickListener(this) {
            public final ProxySettingsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f$0.setProxyType(((Integer) view.getTag()).intValue(), true, null);
                        break;
                    default:
                        ProxySettingsActivity proxySettingsActivity = this.f$0;
                        if (proxySettingsActivity.pasteType != -1) {
                            int i12 = 0;
                            while (true) {
                                String[] strArr = proxySettingsActivity.pasteFields;
                                if (i12 >= strArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = proxySettingsActivity.inputFields[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    proxySettingsActivity.setProxyType(proxySettingsActivity.pasteType, true, new ProfileActivity$9$$ExternalSyntheticLambda1(proxySettingsActivity, 6));
                                } else {
                                    int i13 = proxySettingsActivity.pasteType;
                                    if ((i13 != 0 || i12 != 4) && (i13 != 1 || (i12 != 2 && i12 != 3))) {
                                        String str = strArr[i12];
                                        if (str != null) {
                                            try {
                                                proxySettingsActivity.inputFields[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                proxySettingsActivity.inputFields[i12].setText(proxySettingsActivity.pasteFields[i12]);
                                            }
                                        } else {
                                            proxySettingsActivity.inputFields[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.linearLayout2.addView(this.pasteCell, 0, LayoutHelper.createLinear(-1, -2));
        this.pasteCell.setVisibility(8);
        ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(this.fragmentView.getContext(), (Object) null);
        shadowSectionCellArr[2] = shadowSectionCell2;
        Context context2 = this.fragmentView.getContext();
        int i12 = R.drawable.greydivider_bottom;
        int i13 = Theme.key_windowBackgroundGrayShadow;
        shadowSectionCell2.setBackground(Theme.getThemedDrawableByKey(context2, i12, i13));
        this.linearLayout2.addView(shadowSectionCellArr[2], 1, LayoutHelper.createLinear(-1, -2));
        shadowSectionCellArr[2].setVisibility(8);
        TextSettingsCell textSettingsCell3 = new TextSettingsCell(context, 0, null);
        this.shareCell = textSettingsCell3;
        textSettingsCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        this.shareCell.setText(LocaleController.getString(R.string.ShareFile), false);
        this.shareCell.setTextColor(Theme.getColor(null, i10, false));
        this.linearLayout2.addView(this.shareCell, LayoutHelper.createLinear(-1, -2));
        this.shareCell.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(7, this, context));
        ShadowSectionCell shadowSectionCell3 = new ShadowSectionCell(context, (Object) null);
        shadowSectionCellArr[1] = shadowSectionCell3;
        shadowSectionCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i12, i13));
        this.linearLayout2.addView(shadowSectionCellArr[1], LayoutHelper.createLinear(-1, -2));
        this.clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        this.shareDoneEnabled = true;
        this.shareDoneProgress = 1.0f;
        checkShareDone(false);
        this.currentType = -1;
        setProxyType(!TextUtils.isEmpty(proxyInfo.secret) ? 1 : 0, false, null);
        this.pasteType = -1;
        this.pasteString = null;
        updatePasteCell();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(15, this);
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
        LinearLayout linearLayout = this.inputFieldsContainer;
        int i2 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.shareCell, 268435456, null, null, null, null, i2));
        TextSettingsCell textSettingsCell = this.shareCell;
        int i3 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(textSettingsCell, 268435456, null, null, null, null, i3));
        int i4 = Theme.key_windowBackgroundWhiteBlueText4;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, i4));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteGrayText2));
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
            arrayList.add(new ThemeDescription(radioCellArr[i5], 268435456, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(radioCellArr[i5], 0, new Class[]{RadioCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(radioCellArr[i5], 8192, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackground));
            arrayList.add(new ThemeDescription(radioCellArr[i5], 16384, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackgroundChecked));
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
                arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteInputField));
                arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteInputFieldActivated));
                arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_text_RedRegular));
                i6++;
            }
        } else {
            arrayList.add(new ThemeDescription(null, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(null, 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
        }
        arrayList.add(new ThemeDescription(null, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
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
            arrayList.add(new ThemeDescription(textInfoPrivacyCellArr[i9], 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
            arrayList.add(new ThemeDescription(textInfoPrivacyCellArr[i9], 2, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteLinkText));
            i9++;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.clipboardManager.removePrimaryClipChangedListener(this.clipChangedListener);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.clipboardManager.addPrimaryClipChangedListener(this.clipChangedListener);
        updatePasteCell();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2 && this.addingNewProxy) {
            this.inputFields[0].requestFocus();
            AndroidUtilities.showKeyboard(this.inputFields[0]);
        }
    }

    public final void setProxyType(int i, boolean z, ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda1) {
        if (this.currentType != i) {
            this.currentType = i;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.linearLayout2);
            }
            if (z) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT).setDuration(250L);
                if (profileActivity$9$$ExternalSyntheticLambda1 != null) {
                    duration.addListener((Transition.TransitionListener) new AnonymousClass4(profileActivity$9$$ExternalSyntheticLambda1, 0));
                }
                TransitionManager.beginDelayedTransition(this.linearLayout2, duration);
            }
            int i2 = this.currentType;
            TextInfoPrivacyCell[] textInfoPrivacyCellArr = this.bottomCells;
            if (i2 == 0) {
                textInfoPrivacyCellArr[0].setVisibility(0);
                textInfoPrivacyCellArr[1].setVisibility(8);
                ((View) this.inputFields[4].getParent()).setVisibility(8);
                ((View) this.inputFields[3].getParent()).setVisibility(0);
                ((View) this.inputFields[2].getParent()).setVisibility(0);
            } else if (i2 == 1) {
                textInfoPrivacyCellArr[0].setVisibility(8);
                textInfoPrivacyCellArr[1].setVisibility(0);
                ((View) this.inputFields[4].getParent()).setVisibility(0);
                ((View) this.inputFields[3].getParent()).setVisibility(8);
                ((View) this.inputFields[2].getParent()).setVisibility(8);
            }
            RadioCell[] radioCellArr = this.typeCell;
            radioCellArr[0].radioButton.setChecked(this.currentType == 0, z);
            radioCellArr[1].radioButton.setChecked(this.currentType == 1, z);
        }
    }

    public final void updatePasteCell() {
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
        int i3 = this.pasteType;
        ShadowSectionCell[] shadowSectionCellArr = this.sectionCell;
        if (i3 != -1) {
            if (this.pasteCell.getVisibility() != 0) {
                this.pasteCell.setVisibility(0);
                shadowSectionCellArr[2].setVisibility(0);
                return;
            }
            return;
        }
        if (this.pasteCell.getVisibility() != 8) {
            this.pasteCell.setVisibility(8);
            shadowSectionCellArr[2].setVisibility(8);
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

    public final class AnonymousClass4 implements Transition.TransitionListener {
        public final int $r8$classId;
        public final Object val$onTransitionEnd;

        public AnonymousClass4(Object obj, int i) {
            this.$r8$classId = i;
            this.val$onTransitionEnd = obj;
        }

        @Override
        public final void onTransitionCancel(Transition transition) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    ((FragmentSearchField) this.val$onTransitionEnd).notificationsLocker.unlock();
                    break;
            }
        }

        @Override
        public final void onTransitionEnd(Transition transition) {
            switch (this.$r8$classId) {
                case 0:
                    ((ProfileActivity$9$$ExternalSyntheticLambda1) this.val$onTransitionEnd).run();
                    break;
                default:
                    ((FragmentSearchField) this.val$onTransitionEnd).notificationsLocker.unlock();
                    break;
            }
        }

        @Override
        public final void onTransitionPause(Transition transition) {
            int i = this.$r8$classId;
        }

        @Override
        public final void onTransitionResume(Transition transition) {
            int i = this.$r8$classId;
        }

        @Override
        public final void onTransitionStart(Transition transition) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    ((FragmentSearchField) this.val$onTransitionEnd).notificationsLocker.lock();
                    break;
            }
        }

        private final void onTransitionCancel$org$telegram$ui$ProxySettingsActivity$4(Transition transition) {
        }

        private final void onTransitionPause$org$telegram$ui$Components$FragmentSearchField$5(Transition transition) {
        }

        private final void onTransitionPause$org$telegram$ui$ProxySettingsActivity$4(Transition transition) {
        }

        private final void onTransitionResume$org$telegram$ui$Components$FragmentSearchField$5(Transition transition) {
        }

        private final void onTransitionResume$org$telegram$ui$ProxySettingsActivity$4(Transition transition) {
        }

        private final void onTransitionStart$org$telegram$ui$ProxySettingsActivity$4(Transition transition) {
        }
    }
}
