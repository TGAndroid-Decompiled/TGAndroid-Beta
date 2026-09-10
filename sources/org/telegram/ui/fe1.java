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
public final class fe1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public r91 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.i6 J;
    public final org.telegram.ui.ActionBar.h6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f32793a;
    public EditTextBoldCursor f32794b;
    public org.telegram.ui.ActionBar.w0 f32795c;
    public org.telegram.ui.Cells.f9 d;
    public org.telegram.ui.Cells.f9 e;
    public org.telegram.ui.Cells.ka f32796f;
    public org.telegram.ui.Cells.ga h;
    public org.telegram.ui.Cells.f9 f32797n;
    public org.telegram.ui.ActionBar.d2 f32798r;
    public org.telegram.ui.Components.qn f32799s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f32800w;
    public LinearLayout f32801x;
    public int f32802y;

    public fe1(org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = i6Var;
        this.K = h6Var;
        if (h6Var != null) {
            tL_theme = h6Var.f17806r;
        } else {
            tL_theme = i6Var.F;
        }
        this.L = tL_theme;
        if (h6Var != null) {
            i10 = h6Var.f17808t;
        } else {
            i10 = i6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void U(fe1 fe1Var, int i10) {
        ConnectionsManager.getInstance(fe1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(fe1 fe1Var, TLRPC.TL_theme tL_theme) {
        try {
            fe1Var.f32798r.dismiss();
            fe1Var.f32798r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.j6.C1(fe1Var.J, fe1Var.K, tL_theme, fe1Var.currentAccount, false);
        fe1Var.finishFragment();
    }

    public static void W(fe1 fe1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            fe1Var.f32798r.dismiss();
            fe1Var.f32798r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.d5.f0(fe1Var.currentAccount, tL_error, fe1Var, updatetheme, new Object[0]);
    }

    public static void X(fe1 fe1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        fe1Var.f32802y = ConnectionsManager.getInstance(fe1Var.currentAccount).sendRequest(createtheme, new rg0(20, fe1Var, str), 2);
    }

    public static void Y(fe1 fe1Var) {
        org.telegram.ui.ActionBar.i6 i6Var = fe1Var.J;
        TLRPC.TL_theme tL_theme = fe1Var.L;
        if (!fe1Var.Z(fe1Var.f32793a.getText().toString(), true) || fe1Var.getParentActivity() == null) {
            return;
        }
        if (fe1Var.f32794b.length() == 0) {
            org.telegram.ui.Components.d5.u0(fe1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (fe1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(fe1Var.getParentActivity(), 3, null);
            fe1Var.f32798r = d2Var;
            d2Var.setOnCancelListener(new Object());
            fe1Var.f32798r.show();
            String obj = fe1Var.f32794b.getText().toString();
            tL_theme.title = obj;
            i6Var.f17834a = obj;
            i6Var.F.slug = fe1Var.f32793a.getText().toString();
            org.telegram.ui.ActionBar.j6.r1(i6Var, true, true, true);
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
            String obj2 = fe1Var.f32793a.getText().toString();
            String obj3 = fe1Var.f32794b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                fe1Var.finishFragment();
                return;
            }
            fe1Var.f32798r = new org.telegram.ui.ActionBar.d2(fe1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f17266id = tL_theme.f17332id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(fe1Var.currentAccount).sendRequest(updatetheme, new rg0(21, fe1Var, updatetheme), 2);
            ConnectionsManager.getInstance(fe1Var.currentAccount).bindRequestToGuid(sendRequest, fe1Var.classGuid);
            fe1Var.f32798r.setOnCancelListener(new ba(fe1Var, sendRequest, 8));
            fe1Var.f32798r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        r91 r91Var = this.F;
        if (r91Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r91Var);
            this.F = null;
            this.E = null;
            if (this.f32802y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f32802y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.j6.f18144p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.j6.f18144p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.j6.f18144p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.j6.f18144p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.j6.f18271w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.j6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                r91 r91Var2 = new r91(5, this, str);
                this.F = r91Var2;
                AndroidUtilities.runOnUIThread(r91Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.j6.f18144p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f17892b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.j6.f17892b7));
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
        int i10 = 3;
        this.actionBar.setActionBarMenuOnItemClick(new b91(this, 3));
        this.f32795c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new ai.h(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f32801x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f32801x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        linearLayout2.addView(this.f32801x, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f32801x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f32794b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f32794b;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f32794b;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f32794b.setMaxLines(1);
        this.f32794b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f32794b;
        if (LocaleController.isRTL) {
            i10 = 5;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f32794b.setBackgroundDrawable(null);
        this.f32794b.setPadding(0, 0, 0, 0);
        this.f32794b.setSingleLine(true);
        this.f32794b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f32794b.setInputType(163872);
        this.f32794b.setImeOptions(6);
        this.f32794b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f32794b.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f32794b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32794b.setCursorWidth(1.5f);
        this.f32801x.addView(this.f32794b, w7.a6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f32794b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final fe1 f31245b;

            {
                this.f31245b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        fe1 fe1Var = this.f31245b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(fe1Var.f32794b);
                            return true;
                        }
                        fe1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f31245b.f32795c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.qn qnVar = new org.telegram.ui.Components.qn(context, 26);
        this.f32799s = qnVar;
        this.f32801x.addView(qnVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f32801x.addView(linearLayout4, w7.a6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f32800w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f32800w.setTextSize(1, 18.0f);
        this.f32800w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f32800w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f32800w.setMaxLines(1);
        this.f32800w.setLines(1);
        this.f32800w.setEnabled(false);
        this.f32800w.setBackgroundDrawable(null);
        this.f32800w.setPadding(0, 0, 0, 0);
        this.f32800w.setSingleLine(true);
        this.f32800w.setInputType(163840);
        this.f32800w.setImeOptions(6);
        linearLayout4.addView(this.f32800w, w7.a6.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f32793a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f32793a.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f32793a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f32793a.setMaxLines(1);
        this.f32793a.setLines(1);
        this.f32793a.setBackgroundDrawable(null);
        this.f32793a.setPadding(0, 0, 0, 0);
        this.f32793a.setSingleLine(true);
        this.f32793a.setInputType(163872);
        this.f32793a.setImeOptions(6);
        this.f32793a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f32793a.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f32793a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32793a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f32793a, w7.a6.n(-1, 50));
        this.f32793a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final fe1 f31245b;

            {
                this.f31245b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        fe1 fe1Var = this.f31245b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(fe1Var.f32794b);
                            return true;
                        }
                        fe1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f31245b.f32795c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f32793a.addTextChangedListener(new ee1(this));
        if (z10) {
            this.f32793a.setOnFocusChangeListener(new qd(this, 11));
        }
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
        this.e = f9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.j6.f17892b7;
        f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i13, i14));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context);
        this.d = f9Var2;
        f9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.uv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.f9 f9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.H = replaceTags;
            f9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, w7.a6.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, this.parentLayout, 1);
            this.f32796f = kaVar;
            linearLayout2.addView(kaVar, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
            this.h = gaVar;
            gaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.a6.n(-1, -2));
            this.h.setOnClickListener(new w71(6, this, context));
            org.telegram.ui.Cells.f9 f9Var4 = new org.telegram.ui.Cells.f9(context);
            this.f32797n = f9Var4;
            f9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f32797n.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f32797n, w7.a6.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f32794b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f32794b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f32793a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f32793a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.d2 d2Var;
        org.telegram.ui.ActionBar.d2 d2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.h6 h6Var = this.K;
        org.telegram.ui.ActionBar.i6 i6Var = this.J;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var2 == i6Var && h6Var2 == h6Var && (d2Var2 = this.f32798r) != null) {
                try {
                    d2Var2.dismiss();
                    this.f32798r = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.j6.t(i6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var3 == i6Var && h6Var3 == h6Var && (d2Var = this.f32798r) != null) {
                try {
                    d2Var.dismiss();
                    this.f32798r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        LinearLayout linearLayout = this.f32801x;
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.f17892b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32797n, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32797n, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18144p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18271w6));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32793a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f32793a;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32793a, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f18055k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32793a, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f18073l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32793a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32793a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32793a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32794b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32794b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32794b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32800w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32800w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.qn qnVar = this.f32799s;
        Paint paint = org.telegram.ui.ActionBar.j6.f18049k0;
        int i15 = org.telegram.ui.ActionBar.j6.f17929d7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(qnVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32799s, 1, null, org.telegram.ui.ActionBar.j6.f18049k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18088m3, org.telegram.ui.ActionBar.j6.f18159q3}, null, org.telegram.ui.ActionBar.j6.f18184ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18107n3, org.telegram.ui.ActionBar.j6.f18177r3}, null, org.telegram.ui.ActionBar.j6.f17934dc));
        org.telegram.ui.Cells.ka kaVar = this.f32796f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f18088m3.f17790y;
        int i16 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, org.telegram.ui.ActionBar.j6.f18159q3.f17790y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18123o3, org.telegram.ui.ActionBar.j6.f18196s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18123o3, org.telegram.ui.ActionBar.j6.f18196s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18123o3, org.telegram.ui.ActionBar.j6.f18196s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18123o3, org.telegram.ui.ActionBar.j6.f18196s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18141p3, org.telegram.ui.ActionBar.j6.f18215t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        org.telegram.ui.Cells.ka kaVar2 = this.f32796f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.f18123o3.f17790y;
        int i17 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, org.telegram.ui.ActionBar.j6.f18196s3.f17790y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f17969fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18322z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f18205sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f17876ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f17933db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f17878ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f17968fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18115nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18204sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18132od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32796f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.nb));
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
            this.f32793a.requestFocus();
            AndroidUtilities.showKeyboard(this.f32793a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f32793a.requestFocus();
            AndroidUtilities.showKeyboard(this.f32793a);
        }
    }
}
