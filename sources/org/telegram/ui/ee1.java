package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ee1 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public w31 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.g6 J;
    public final org.telegram.ui.ActionBar.e6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f37069a;
    public EditTextBoldCursor f37070b;
    public org.telegram.ui.ActionBar.u0 f37071c;
    public org.telegram.ui.Cells.e9 d;
    public org.telegram.ui.Cells.e9 f37072e;
    public org.telegram.ui.Cells.ga f37073f;
    public org.telegram.ui.Cells.ca h;
    public org.telegram.ui.Cells.e9 f37074n;
    public org.telegram.ui.ActionBar.a2 f37075r;
    public org.telegram.ui.Components.co f37076s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f37077w;
    public LinearLayout f37078x;
    public int f37079y;

    public ee1(org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = g6Var;
        this.K = e6Var;
        if (e6Var != null) {
            tL_theme = e6Var.f20364r;
        } else {
            tL_theme = g6Var.F;
        }
        this.L = tL_theme;
        if (e6Var != null) {
            i10 = e6Var.f20366t;
        } else {
            i10 = g6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void V(ee1 ee1Var, TLRPC.TL_theme tL_theme) {
        try {
            ee1Var.f37075r.dismiss();
            ee1Var.f37075r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.ActionBar.h6.D1(ee1Var.J, ee1Var.K, tL_theme, ee1Var.currentAccount, false);
        ee1Var.finishFragment();
    }

    public static void W(ee1 ee1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            ee1Var.f37075r.dismiss();
            ee1Var.f37075r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.Components.g5.e0(ee1Var.currentAccount, tL_error, ee1Var, updatetheme, new Object[0]);
    }

    public static void X(ee1 ee1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        ee1Var.f37079y = ConnectionsManager.getInstance(ee1Var.currentAccount).sendRequest(createtheme, new bc0(25, ee1Var, str), 2);
    }

    public static void Y(ee1 ee1Var) {
        org.telegram.ui.ActionBar.g6 g6Var = ee1Var.J;
        TLRPC.TL_theme tL_theme = ee1Var.L;
        if (!ee1Var.Z(ee1Var.f37069a.getText().toString(), true) || ee1Var.getParentActivity() == null) {
            return;
        }
        if (ee1Var.f37070b.length() == 0) {
            org.telegram.ui.Components.g5.t0(ee1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (ee1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ee1Var.getParentActivity(), 3, null);
            ee1Var.f37075r = a2Var;
            a2Var.setOnCancelListener(new Object());
            ee1Var.f37075r.show();
            String obj = ee1Var.f37070b.getText().toString();
            tL_theme.title = obj;
            g6Var.f20428a = obj;
            g6Var.F.slug = ee1Var.f37069a.getText().toString();
            org.telegram.ui.ActionBar.h6.s1(g6Var, true, true, true);
        } else {
            String str2 = tL_theme.slug;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = tL_theme.title;
            if (str4 != null) {
                str3 = str4;
            }
            String obj2 = ee1Var.f37069a.getText().toString();
            String obj3 = ee1Var.f37070b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                ee1Var.finishFragment();
                return;
            }
            ee1Var.f37075r = new org.telegram.ui.ActionBar.a2(ee1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f19873id = tL_theme.f19939id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(ee1Var.currentAccount).sendRequest(updatetheme, new bc0(26, ee1Var, updatetheme), 2);
            ConnectionsManager.getInstance(ee1Var.currentAccount).bindRequestToGuid(sendRequest, ee1Var.classGuid);
            ee1Var.f37075r.setOnCancelListener(new fa(ee1Var, sendRequest, 8));
            ee1Var.f37075r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        w31 w31Var = this.F;
        if (w31Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w31Var);
            this.F = null;
            this.E = null;
            if (this.f37079y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f37079y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.h6.f20780p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.h6.f20780p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.h6.f20780p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.h6.f20780p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.h6.f20910w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.h6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                w31 w31Var2 = new w31(13, this, str);
                this.F = w31Var2;
                AndroidUtilities.runOnUIThread(w31Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.h6.f20780p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.f37072e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20523b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20523b7));
                return;
            }
        }
        this.f37072e.setVisibility(0);
        this.f37072e.setText(str);
        this.f37072e.setTag(Integer.valueOf(i10));
        this.f37072e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.h6.f20523b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        int i10 = 5;
        this.actionBar.setActionBarMenuOnItemClick(new f51(this, 5));
        this.f37071c = this.actionBar.p().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f37078x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f37078x.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
        linearLayout2.addView(this.f37078x, w7.w5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f37078x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f37070b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f37070b;
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f37070b;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f37070b.setMaxLines(1);
        this.f37070b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f37070b;
        if (!LocaleController.isRTL) {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f37070b.setBackgroundDrawable(null);
        this.f37070b.setPadding(0, 0, 0, 0);
        this.f37070b.setSingleLine(true);
        this.f37070b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f37070b.setInputType(163872);
        this.f37070b.setImeOptions(6);
        this.f37070b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f37070b.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f37070b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f37070b.setCursorWidth(1.5f);
        this.f37078x.addView(this.f37070b, w7.w5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f37070b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ee1 f35775b;

            {
                this.f35775b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        ee1 ee1Var = this.f35775b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(ee1Var.f37070b);
                            return true;
                        }
                        ee1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (u0Var = this.f35775b.f37071c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(context, 27);
        this.f37076s = coVar;
        this.f37078x.addView(coVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f37078x.addView(linearLayout4, w7.w5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f37077w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f37077w.setTextSize(1, 18.0f);
        this.f37077w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f37077w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f37077w.setMaxLines(1);
        this.f37077w.setLines(1);
        this.f37077w.setEnabled(false);
        this.f37077w.setBackgroundDrawable(null);
        this.f37077w.setPadding(0, 0, 0, 0);
        this.f37077w.setSingleLine(true);
        this.f37077w.setInputType(163840);
        this.f37077w.setImeOptions(6);
        linearLayout4.addView(this.f37077w, w7.w5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f37069a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f37069a.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f37069a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f37069a.setMaxLines(1);
        this.f37069a.setLines(1);
        this.f37069a.setBackgroundDrawable(null);
        this.f37069a.setPadding(0, 0, 0, 0);
        this.f37069a.setSingleLine(true);
        this.f37069a.setInputType(163872);
        this.f37069a.setImeOptions(6);
        this.f37069a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f37069a.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f37069a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f37069a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f37069a, w7.w5.n(-1, 50));
        this.f37069a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ee1 f35775b;

            {
                this.f35775b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        ee1 ee1Var = this.f35775b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(ee1Var.f37070b);
                            return true;
                        }
                        ee1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (u0Var = this.f35775b.f37071c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f37069a.addTextChangedListener(new de1(this));
        if (z10) {
            this.f37069a.setOnFocusChangeListener(new td(this, 11));
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f37072e = e9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.h6.f20523b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i13, i14));
        this.f37072e.setVisibility(8);
        this.f37072e.setBottomPadding(0);
        linearLayout2.addView(this.f37072e, w7.w5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
        this.d = e9Var2;
        e9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.jw(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.e9 e9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.H = replaceTags;
            e9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, w7.w5.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, this.parentLayout, 1);
            this.f37073f = gaVar;
            linearLayout2.addView(gaVar, w7.w5.n(-1, -2));
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
            this.h = caVar;
            caVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.w5.n(-1, -2));
            this.h.setOnClickListener(new xy0(9, this, context));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f37074n = e9Var4;
            e9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f37074n.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f37074n, w7.w5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f37070b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f37070b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f37069a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f37069a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.a2 a2Var;
        org.telegram.ui.ActionBar.a2 a2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.e6 e6Var = this.K;
        org.telegram.ui.ActionBar.g6 g6Var = this.J;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (g6Var2 == g6Var && e6Var2 == e6Var && (a2Var2 = this.f37075r) != null) {
                try {
                    a2Var2.dismiss();
                    this.f37075r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.h6.t(g6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (g6Var3 == g6Var && e6Var3 == e6Var && (a2Var = this.f37075r) != null) {
                try {
                    a2Var.dismiss();
                    this.f37075r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20503a7));
        LinearLayout linearLayout = this.f37078x;
        int i10 = org.telegram.ui.ActionBar.h6.f20559d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20839s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20894v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20858t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.f20523b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37074n, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37074n, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37072e, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37072e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20780p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37072e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37072e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20910w6));
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.h6.f20650i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37069a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f37069a;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37069a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f20687k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37069a, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f20705l6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37069a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37069a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37069a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37070b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37070b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37070b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37077w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37077w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.co coVar = this.f37076s;
        Paint paint = org.telegram.ui.ActionBar.h6.f20681k0;
        int i15 = org.telegram.ui.ActionBar.h6.f20560d7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(coVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37076s, 1, null, org.telegram.ui.ActionBar.h6.f20681k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20721m3, org.telegram.ui.ActionBar.h6.f20796q3}, null, org.telegram.ui.ActionBar.h6.f20822ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20741n3, org.telegram.ui.ActionBar.h6.f20815r3}, null, org.telegram.ui.ActionBar.h6.f20565dc));
        org.telegram.ui.Cells.ga gaVar = this.f37073f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.h6.f20721m3.A;
        int i16 = org.telegram.ui.ActionBar.h6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.j6(gaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, org.telegram.ui.ActionBar.h6.f20796q3.A, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20759o3, org.telegram.ui.ActionBar.h6.f20834s3}, null, org.telegram.ui.ActionBar.h6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20759o3, org.telegram.ui.ActionBar.h6.f20834s3}, null, org.telegram.ui.ActionBar.h6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20759o3, org.telegram.ui.ActionBar.h6.f20834s3}, null, org.telegram.ui.ActionBar.h6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20759o3, org.telegram.ui.ActionBar.h6.f20834s3}, null, org.telegram.ui.ActionBar.h6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20777p3, org.telegram.ui.ActionBar.h6.f20853t3}, null, org.telegram.ui.ActionBar.h6.Ba));
        org.telegram.ui.Cells.ga gaVar2 = this.f37073f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.f20759o3.A;
        int i17 = org.telegram.ui.ActionBar.h6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.j6(gaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, org.telegram.ui.ActionBar.h6.f20834s3.A, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20601fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.y3}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20960z3}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.A3, org.telegram.ui.ActionBar.h6.C3}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.B3, org.telegram.ui.ActionBar.h6.D3}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f20843sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20507ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20564db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20509ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20600fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20749nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20842sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20768od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37073f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.nb));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.I) {
            this.f37069a.requestFocus();
            AndroidUtilities.showKeyboard(this.f37069a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f37069a.requestFocus();
            AndroidUtilities.showKeyboard(this.f37069a);
        }
    }
}
