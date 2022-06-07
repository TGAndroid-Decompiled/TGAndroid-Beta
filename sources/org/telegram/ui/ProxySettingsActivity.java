package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
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

public class ProxySettingsActivity extends BaseFragment {
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

    public ProxySettingsActivity() {
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
                ProxySettingsActivity.this.updatePasteCell();
            }
        };
        this.currentProxyInfo = new SharedConfig.ProxyInfo("", 1080, "", "", "");
        this.addingNewProxy = true;
    }

    public ProxySettingsActivity(SharedConfig.ProxyInfo proxyInfo) {
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
                ProxySettingsActivity.this.updatePasteCell();
            }
        };
        this.currentProxyInfo = proxyInfo;
    }

    @Override
    public void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.clipboardManager.addPrimaryClipChangedListener(this.clipChangedListener);
        updatePasteCell();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.clipboardManager.removePrimaryClipChangedListener(this.clipChangedListener);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString("ProxyDetails", R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                boolean z;
                if (i == -1) {
                    ProxySettingsActivity.this.finishFragment();
                } else if (i == 1 && ProxySettingsActivity.this.getParentActivity() != null) {
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
                    SharedPreferences.Editor edit = globalMainSettings.edit();
                    if (ProxySettingsActivity.this.addingNewProxy) {
                        SharedConfig.addProxy(ProxySettingsActivity.this.currentProxyInfo);
                        SharedConfig.currentProxy = ProxySettingsActivity.this.currentProxyInfo;
                        edit.putBoolean("proxy_enabled", true);
                        z = true;
                    } else {
                        boolean z2 = globalMainSettings.getBoolean("proxy_enabled", false);
                        SharedConfig.saveProxyList();
                        z = z2;
                    }
                    if (ProxySettingsActivity.this.addingNewProxy || SharedConfig.currentProxy == ProxySettingsActivity.this.currentProxyInfo) {
                        edit.putString("proxy_ip", ProxySettingsActivity.this.currentProxyInfo.address);
                        edit.putString("proxy_pass", ProxySettingsActivity.this.currentProxyInfo.password);
                        edit.putString("proxy_user", ProxySettingsActivity.this.currentProxyInfo.username);
                        edit.putInt("proxy_port", ProxySettingsActivity.this.currentProxyInfo.port);
                        edit.putString("proxy_secret", ProxySettingsActivity.this.currentProxyInfo.secret);
                        ConnectionsManager.setProxySettings(z, ProxySettingsActivity.this.currentProxyInfo.address, ProxySettingsActivity.this.currentProxyInfo.port, ProxySettingsActivity.this.currentProxyInfo.username, ProxySettingsActivity.this.currentProxyInfo.password, ProxySettingsActivity.this.currentProxyInfo.secret);
                    }
                    edit.commit();
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.proxySettingsChanged, new Object[0]);
                    ProxySettingsActivity.this.finishFragment();
                }
            }
        });
        ActionBarMenuItem addItemWithWidth = this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.doneItem = addItemWithWidth;
        addItemWithWidth.setContentDescription(LocaleController.getString("Done", R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor("actionBarDefault"));
        frameLayout2.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout2 = linearLayout;
        linearLayout.setOrientation(1);
        this.scrollView.addView(this.linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener proxySettingsActivity$$ExternalSyntheticLambda2 = new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ProxySettingsActivity.this.lambda$createView$0(view);
            }
        };
        int i = 0;
        while (i < 2) {
            this.typeCell[i] = new RadioCell(context);
            this.typeCell[i].setBackground(Theme.getSelectorDrawable(true));
            this.typeCell[i].setTag(Integer.valueOf(i));
            if (i == 0) {
                this.typeCell[i].setText(LocaleController.getString("UseProxySocks5", R.string.UseProxySocks5), i == this.currentType, true);
            } else {
                this.typeCell[i].setText(LocaleController.getString("UseProxyTelegram", R.string.UseProxyTelegram), i == this.currentType, false);
            }
            this.linearLayout2.addView(this.typeCell[i], LayoutHelper.createLinear(-1, 50));
            this.typeCell[i].setOnClickListener(proxySettingsActivity$$ExternalSyntheticLambda2);
            i++;
        }
        this.sectionCell[0] = new ShadowSectionCell(context);
        this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.inputFieldsContainer = linearLayout2;
        linearLayout2.setOrientation(1);
        this.inputFieldsContainer.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        if (Build.VERSION.SDK_INT >= 21) {
            this.inputFieldsContainer.setElevation(AndroidUtilities.dp(1.0f));
            this.inputFieldsContainer.setOutlineProvider(null);
        }
        this.linearLayout2.addView(this.inputFieldsContainer, LayoutHelper.createLinear(-1, -2));
        this.inputFields = new EditTextBoldCursor[5];
        int i2 = 0;
        for (int i3 = 5; i2 < i3; i3 = 5) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.inputFieldsContainer.addView(frameLayout3, LayoutHelper.createLinear(-1, 64));
            this.inputFields[i2] = new EditTextBoldCursor(context);
            this.inputFields[i2].setTag(Integer.valueOf(i2));
            this.inputFields[i2].setTextSize(1, 16.0f);
            this.inputFields[i2].setHintColor(Theme.getColor("windowBackgroundWhiteHintText"));
            this.inputFields[i2].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i2].setBackground(null);
            this.inputFields[i2].setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.inputFields[i2].setCursorSize(AndroidUtilities.dp(20.0f));
            this.inputFields[i2].setCursorWidth(1.5f);
            this.inputFields[i2].setSingleLine(true);
            this.inputFields[i2].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.inputFields[i2].setHeaderHintColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
            this.inputFields[i2].setTransformHintToHeader(true);
            this.inputFields[i2].setLineColors(Theme.getColor("windowBackgroundWhiteInputField"), Theme.getColor("windowBackgroundWhiteInputFieldActivated"), Theme.getColor("windowBackgroundWhiteRedText3"));
            if (i2 == 0) {
                this.inputFields[i2].setInputType(524305);
                this.inputFields[i2].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        ProxySettingsActivity.this.checkShareDone(true);
                    }
                });
            } else if (i2 == 1) {
                this.inputFields[i2].setInputType(2);
                this.inputFields[i2].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (!ProxySettingsActivity.this.ignoreOnTextChange) {
                            EditTextBoldCursor editTextBoldCursor = ProxySettingsActivity.this.inputFields[1];
                            int selectionStart = editTextBoldCursor.getSelectionStart();
                            String obj = editTextBoldCursor.getText().toString();
                            StringBuilder sb = new StringBuilder(obj.length());
                            int i4 = 0;
                            while (i4 < obj.length()) {
                                int i5 = i4 + 1;
                                String substring = obj.substring(i4, i5);
                                if ("0123456789".contains(substring)) {
                                    sb.append(substring);
                                }
                                i4 = i5;
                            }
                            ProxySettingsActivity.this.ignoreOnTextChange = true;
                            int intValue = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                            if (intValue < 0 || intValue > 65535 || !obj.equals(sb.toString())) {
                                if (intValue < 0) {
                                    editTextBoldCursor.setText("0");
                                } else if (intValue > 65535) {
                                    editTextBoldCursor.setText("65535");
                                } else {
                                    editTextBoldCursor.setText(sb.toString());
                                }
                            } else if (selectionStart >= 0) {
                                editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                            }
                            ProxySettingsActivity.this.ignoreOnTextChange = false;
                            ProxySettingsActivity.this.checkShareDone(true);
                        }
                    }
                });
            } else if (i2 == 3) {
                this.inputFields[i2].setInputType(129);
                this.inputFields[i2].setTypeface(Typeface.DEFAULT);
                this.inputFields[i2].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.inputFields[i2].setInputType(524289);
            }
            this.inputFields[i2].setImeOptions(268435461);
            if (i2 == 0) {
                this.inputFields[i2].setHintText(LocaleController.getString("UseProxyAddress", R.string.UseProxyAddress));
                this.inputFields[i2].setText(this.currentProxyInfo.address);
            } else if (i2 == 1) {
                this.inputFields[i2].setHintText(LocaleController.getString("UseProxyPort", R.string.UseProxyPort));
                EditTextBoldCursor editTextBoldCursor = this.inputFields[i2];
                editTextBoldCursor.setText("" + this.currentProxyInfo.port);
            } else if (i2 == 2) {
                this.inputFields[i2].setHintText(LocaleController.getString("UseProxyUsername", R.string.UseProxyUsername));
                this.inputFields[i2].setText(this.currentProxyInfo.username);
            } else if (i2 == 3) {
                this.inputFields[i2].setHintText(LocaleController.getString("UseProxyPassword", R.string.UseProxyPassword));
                this.inputFields[i2].setText(this.currentProxyInfo.password);
            } else if (i2 == 4) {
                this.inputFields[i2].setHintText(LocaleController.getString("UseProxySecret", R.string.UseProxySecret));
                this.inputFields[i2].setText(this.currentProxyInfo.secret);
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            editTextBoldCursorArr[i2].setSelection(editTextBoldCursorArr[i2].length());
            this.inputFields[i2].setPadding(0, 0, 0, 0);
            frameLayout3.addView(this.inputFields[i2], LayoutHelper.createFrame(-1, -1.0f, 51, 17.0f, i2 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.inputFields[i2].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                    boolean lambda$createView$1;
                    lambda$createView$1 = ProxySettingsActivity.this.lambda$createView$1(textView, i4, keyEvent);
                    return lambda$createView$1;
                }
            });
            i2++;
        }
        for (int i4 = 0; i4 < 2; i4++) {
            this.bottomCells[i4] = new TextInfoPrivacyCell(context);
            this.bottomCells[i4].setBackground(Theme.getThemedDrawable(context, (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
            if (i4 == 0) {
                this.bottomCells[i4].setText(LocaleController.getString("UseProxyInfo", R.string.UseProxyInfo));
            } else {
                TextInfoPrivacyCell textInfoPrivacyCell = this.bottomCells[i4];
                textInfoPrivacyCell.setText(LocaleController.getString("UseProxyTelegramInfo", R.string.UseProxyTelegramInfo) + "\n\n" + LocaleController.getString("UseProxyTelegramInfo2", R.string.UseProxyTelegramInfo2));
                this.bottomCells[i4].setVisibility(8);
            }
            this.linearLayout2.addView(this.bottomCells[i4], LayoutHelper.createLinear(-1, -2));
        }
        TextSettingsCell textSettingsCell = new TextSettingsCell(this.fragmentView.getContext());
        this.pasteCell = textSettingsCell;
        textSettingsCell.setBackground(Theme.getSelectorDrawable(true));
        this.pasteCell.setText(LocaleController.getString("PasteFromClipboard", R.string.PasteFromClipboard), false);
        this.pasteCell.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText4"));
        this.pasteCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ProxySettingsActivity.this.lambda$createView$3(view);
            }
        });
        this.linearLayout2.addView(this.pasteCell, 0, LayoutHelper.createLinear(-1, -2));
        this.pasteCell.setVisibility(8);
        this.sectionCell[2] = new ShadowSectionCell(this.fragmentView.getContext());
        this.sectionCell[2].setBackground(Theme.getThemedDrawable(this.fragmentView.getContext(), (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
        this.linearLayout2.addView(this.sectionCell[2], 1, LayoutHelper.createLinear(-1, -2));
        this.sectionCell[2].setVisibility(8);
        TextSettingsCell textSettingsCell2 = new TextSettingsCell(context);
        this.shareCell = textSettingsCell2;
        textSettingsCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        this.shareCell.setText(LocaleController.getString("ShareFile", R.string.ShareFile), false);
        this.shareCell.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText4"));
        this.linearLayout2.addView(this.shareCell, LayoutHelper.createLinear(-1, -2));
        this.shareCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ProxySettingsActivity.this.lambda$createView$4(view);
            }
        });
        this.sectionCell[1] = new ShadowSectionCell(context);
        this.sectionCell[1].setBackgroundDrawable(Theme.getThemedDrawable(context, (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
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

    public void lambda$createView$0(View view) {
        setProxyType(((Integer) view.getTag()).intValue(), true);
    }

    public boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            int intValue = ((Integer) textView.getTag()).intValue() + 1;
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            if (intValue < editTextBoldCursorArr.length) {
                editTextBoldCursorArr[intValue].requestFocus();
            }
            return true;
        } else if (i != 6) {
            return false;
        } else {
            finishFragment();
            return true;
        }
    }

    public void lambda$createView$3(View view) {
        if (this.pasteType != -1) {
            int i = 0;
            while (true) {
                String[] strArr = this.pasteFields;
                if (i < strArr.length) {
                    int i2 = this.pasteType;
                    if (!((i2 == 0 && i == 4) || (i2 == 1 && (i == 2 || i == 3)))) {
                        if (strArr[i] != null) {
                            try {
                                this.inputFields[i].setText(URLDecoder.decode(strArr[i], "UTF-8"));
                            } catch (UnsupportedEncodingException unused) {
                                this.inputFields[i].setText(this.pasteFields[i]);
                            }
                        } else {
                            this.inputFields[i].setText((CharSequence) null);
                        }
                    }
                    i++;
                } else {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
                    editTextBoldCursorArr[0].setSelection(editTextBoldCursorArr[0].length());
                    setProxyType(this.pasteType, true, new Runnable() {
                        @Override
                        public final void run() {
                            ProxySettingsActivity.this.lambda$createView$2();
                        }
                    });
                    return;
                }
            }
        }
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

    public void lambda$createView$4(View view) {
        String str;
        StringBuilder sb = new StringBuilder();
        String obj = this.inputFields[0].getText().toString();
        String obj2 = this.inputFields[3].getText().toString();
        String obj3 = this.inputFields[2].getText().toString();
        String obj4 = this.inputFields[1].getText().toString();
        String obj5 = this.inputFields[4].getText().toString();
        try {
            if (!TextUtils.isEmpty(obj)) {
                sb.append("server=");
                sb.append(URLEncoder.encode(obj, "UTF-8"));
            }
            if (!TextUtils.isEmpty(obj4)) {
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append("port=");
                sb.append(URLEncoder.encode(obj4, "UTF-8"));
            }
            if (this.currentType == 1) {
                str = "https://t.me/proxy?";
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append("secret=");
                sb.append(URLEncoder.encode(obj5, "UTF-8"));
            } else {
                str = "https://t.me/socks?";
                if (!TextUtils.isEmpty(obj3)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append("user=");
                    sb.append(URLEncoder.encode(obj3, "UTF-8"));
                }
                if (!TextUtils.isEmpty(obj2)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append("pass=");
                    sb.append(URLEncoder.encode(obj2, "UTF-8"));
                }
            }
            if (sb.length() != 0) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str + sb.toString());
                Intent createChooser = Intent.createChooser(intent, LocaleController.getString("ShareLink", R.string.ShareLink));
                createChooser.setFlags(268435456);
                getParentActivity().startActivity(createChooser);
            }
        } catch (Exception unused) {
        }
    }

    public void updatePasteCell() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxySettingsActivity.updatePasteCell():void");
    }

    private void setShareDoneEnabled(boolean z, boolean z2) {
        if (this.shareDoneEnabled != z) {
            ValueAnimator valueAnimator = this.shareDoneAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.shareDoneAnimator = ofFloat;
                ofFloat.setDuration(200L);
                this.shareDoneAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ProxySettingsActivity.this.lambda$setShareDoneEnabled$5(valueAnimator2);
                    }
                });
            }
            float f = 0.0f;
            float f2 = 1.0f;
            if (z2) {
                float[] fArr = this.shareDoneProgressAnimValues;
                fArr[0] = this.shareDoneProgress;
                if (z) {
                    f = 1.0f;
                }
                fArr[1] = f;
                this.shareDoneAnimator.start();
            } else {
                if (z) {
                    f = 1.0f;
                }
                this.shareDoneProgress = f;
                this.shareCell.setTextColor(Theme.getColor(z ? "windowBackgroundWhiteBlueText4" : "windowBackgroundWhiteGrayText2"));
                ActionBarMenuItem actionBarMenuItem = this.doneItem;
                if (!z) {
                    f2 = 0.5f;
                }
                actionBarMenuItem.setAlpha(f2);
            }
            this.shareCell.setEnabled(z);
            this.doneItem.setEnabled(z);
            this.shareDoneEnabled = z;
        }
    }

    public void lambda$setShareDoneEnabled$5(ValueAnimator valueAnimator) {
        this.shareDoneProgress = AndroidUtilities.lerp(this.shareDoneProgressAnimValues, valueAnimator.getAnimatedFraction());
        this.shareCell.setTextColor(ColorUtils.blendARGB(Theme.getColor("windowBackgroundWhiteGrayText2"), Theme.getColor("windowBackgroundWhiteBlueText4"), this.shareDoneProgress));
        this.doneItem.setAlpha((this.shareDoneProgress / 2.0f) + 0.5f);
    }

    public void checkShareDone(boolean z) {
        if (this.shareCell != null && this.doneItem != null) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            boolean z2 = false;
            if (editTextBoldCursorArr[0] != null && editTextBoldCursorArr[1] != null) {
                if (!(editTextBoldCursorArr[0].length() == 0 || Utilities.parseInt((CharSequence) this.inputFields[1].getText().toString()).intValue() == 0)) {
                    z2 = true;
                }
                setShareDoneEnabled(z2, z);
            }
        }
    }

    private void setProxyType(int i, boolean z) {
        setProxyType(i, z, null);
    }

    private void setProxyType(int i, boolean z, final Runnable runnable) {
        if (this.currentType != i) {
            this.currentType = i;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                TransitionManager.endTransitions(this.linearLayout2);
            }
            boolean z2 = true;
            if (z && i2 >= 21) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT).setDuration(250L);
                if (runnable != null) {
                    duration.addListener(new Transition.TransitionListener(this) {
                        @Override
                        public void onTransitionCancel(Transition transition) {
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

                        @Override
                        public void onTransitionEnd(Transition transition) {
                            runnable.run();
                        }
                    });
                }
                TransitionManager.beginDelayedTransition(this.linearLayout2, duration);
            }
            int i3 = this.currentType;
            if (i3 == 0) {
                this.bottomCells[0].setVisibility(0);
                this.bottomCells[1].setVisibility(8);
                ((View) this.inputFields[4].getParent()).setVisibility(8);
                ((View) this.inputFields[3].getParent()).setVisibility(0);
                ((View) this.inputFields[2].getParent()).setVisibility(0);
            } else if (i3 == 1) {
                this.bottomCells[0].setVisibility(8);
                this.bottomCells[1].setVisibility(0);
                ((View) this.inputFields[4].getParent()).setVisibility(0);
                ((View) this.inputFields[3].getParent()).setVisibility(8);
                ((View) this.inputFields[2].getParent()).setVisibility(8);
            }
            this.typeCell[0].setChecked(this.currentType == 0, z);
            RadioCell radioCell = this.typeCell[1];
            if (this.currentType != 1) {
                z2 = false;
            }
            radioCell.setChecked(z2, z);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2 && this.addingNewProxy) {
            this.inputFields[0].requestFocus();
            AndroidUtilities.showKeyboard(this.inputFields[0]);
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ThemeDescription.ThemeDescriptionDelegate proxySettingsActivity$$ExternalSyntheticLambda7 = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ProxySettingsActivity.this.lambda$getThemeDescriptions$6();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.scrollView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "actionBarDefaultSearch"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "actionBarDefaultSearchPlaceholder"));
        arrayList.add(new ThemeDescription(this.inputFieldsContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.shareCell, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.shareCell, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, proxySettingsActivity$$ExternalSyntheticLambda7, "windowBackgroundWhiteBlueText4"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, proxySettingsActivity$$ExternalSyntheticLambda7, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.pasteCell, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.pasteCell, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.pasteCell, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueText4"));
        for (int i = 0; i < this.typeCell.length; i++) {
            arrayList.add(new ThemeDescription(this.typeCell[i], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, "windowBackgroundWhite"));
            arrayList.add(new ThemeDescription(this.typeCell[i], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, "listSelectorSDK21"));
            arrayList.add(new ThemeDescription(this.typeCell[i], 0, new Class[]{RadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(this.typeCell[i], ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "radioBackground"));
            arrayList.add(new ThemeDescription(this.typeCell[i], ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "radioBackgroundChecked"));
        }
        if (this.inputFields != null) {
            for (int i2 = 0; i2 < this.inputFields.length; i2++) {
                arrayList.add(new ThemeDescription(this.inputFields[i2], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
                arrayList.add(new ThemeDescription(this.inputFields[i2], ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
                arrayList.add(new ThemeDescription(this.inputFields[i2], ThemeDescription.FLAG_HINTTEXTCOLOR | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, "windowBackgroundWhiteBlueHeader"));
                arrayList.add(new ThemeDescription(this.inputFields[i2], ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
                arrayList.add(new ThemeDescription(null, 0, null, null, null, proxySettingsActivity$$ExternalSyntheticLambda7, "windowBackgroundWhiteInputField"));
                arrayList.add(new ThemeDescription(null, 0, null, null, null, proxySettingsActivity$$ExternalSyntheticLambda7, "windowBackgroundWhiteInputFieldActivated"));
                arrayList.add(new ThemeDescription(null, 0, null, null, null, proxySettingsActivity$$ExternalSyntheticLambda7, "windowBackgroundWhiteRedText3"));
            }
        } else {
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        }
        arrayList.add(new ThemeDescription(this.headerCell, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.headerCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        int i3 = 0;
        while (true) {
            ShadowSectionCell[] shadowSectionCellArr = this.sectionCell;
            if (i3 >= shadowSectionCellArr.length) {
                break;
            }
            if (shadowSectionCellArr[i3] != null) {
                arrayList.add(new ThemeDescription(this.sectionCell[i3], ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
            }
            i3++;
        }
        for (int i4 = 0; i4 < this.bottomCells.length; i4++) {
            arrayList.add(new ThemeDescription(this.bottomCells[i4], ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
            arrayList.add(new ThemeDescription(this.bottomCells[i4], 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
            arrayList.add(new ThemeDescription(this.bottomCells[i4], ThemeDescription.FLAG_LINKCOLOR, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteLinkText"));
        }
        return arrayList;
    }

    public void lambda$getThemeDescriptions$6() {
        ValueAnimator valueAnimator;
        if (this.shareCell != null && ((valueAnimator = this.shareDoneAnimator) == null || !valueAnimator.isRunning())) {
            this.shareCell.setTextColor(Theme.getColor(this.shareDoneEnabled ? "windowBackgroundWhiteBlueText4" : "windowBackgroundWhiteGrayText2"));
        }
        if (this.inputFields != null) {
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
                if (i < editTextBoldCursorArr.length) {
                    editTextBoldCursorArr[i].setLineColors(Theme.getColor("windowBackgroundWhiteInputField"), Theme.getColor("windowBackgroundWhiteInputFieldActivated"), Theme.getColor("windowBackgroundWhiteRedText3"));
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
