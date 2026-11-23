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
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a81 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public String E;
    public b31 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.l6 J;
    public final org.telegram.ui.ActionBar.j6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f45501a;
    public EditTextBoldCursor f45502b;
    public org.telegram.ui.ActionBar.q0 f45503c;
    public org.telegram.ui.Cells.a9 d;
    public org.telegram.ui.Cells.a9 f45504e;
    public org.telegram.ui.Cells.ba f45505f;
    public org.telegram.ui.Cells.x9 h;
    public org.telegram.ui.Cells.a9 f45506n;
    public org.telegram.ui.ActionBar.t1 f45507r;
    public org.telegram.ui.Cells.o4 f45508s;
    public EditTextBoldCursor f45509w;
    public LinearLayout f45510x;
    public int f45511y;

    public a81(org.telegram.ui.ActionBar.l6 l6Var, org.telegram.ui.ActionBar.j6 j6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i7;
        this.J = l6Var;
        this.K = j6Var;
        if (j6Var != null) {
            tL_theme = j6Var.f29077r;
        } else {
            tL_theme = l6Var.G;
        }
        this.L = tL_theme;
        if (j6Var != null) {
            i7 = j6Var.f29079t;
        } else {
            i7 = l6Var.F;
        }
        this.currentAccount = i7;
        this.I = z10;
    }

    public static void a0(a81 a81Var, TLRPC.TL_theme tL_theme) {
        try {
            a81Var.f45507r.dismiss();
            a81Var.f45507r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.m6.I1(a81Var.J, a81Var.K, tL_theme, a81Var.currentAccount, false);
        a81Var.finishFragment();
    }

    public static void b0(a81 a81Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            a81Var.f45507r.dismiss();
            a81Var.f45507r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.c5.c0(a81Var.currentAccount, tL_error, a81Var, updatetheme, new Object[0]);
    }

    public static void c0(a81 a81Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        a81Var.f45511y = ConnectionsManager.getInstance(a81Var.currentAccount).sendRequest(createtheme, new e31(3, a81Var, str), 2);
    }

    public static void d0(a81 a81Var) {
        org.telegram.ui.ActionBar.l6 l6Var = a81Var.J;
        TLRPC.TL_theme tL_theme = a81Var.L;
        if (!a81Var.e0(a81Var.f45501a.getText().toString(), true) || a81Var.getParentActivity() == null) {
            return;
        }
        if (a81Var.f45502b.length() == 0) {
            org.telegram.ui.Components.c5.r0(a81Var, org.telegram.messenger.hd.N0(2131743949, null), org.telegram.messenger.hd.N0(2131743936, null), null);
        } else if (a81Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, a81Var.getParentActivity(), null);
            a81Var.f45507r = t1Var;
            t1Var.setOnCancelListener(new Object());
            a81Var.f45507r.show();
            String obj = a81Var.f45502b.getText().toString();
            tL_theme.title = obj;
            l6Var.f29198a = obj;
            l6Var.G.slug = a81Var.f45501a.getText().toString();
            org.telegram.ui.ActionBar.m6.x1(l6Var, true, true, true);
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
            String obj2 = a81Var.f45501a.getText().toString();
            String obj3 = a81Var.f45502b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                a81Var.finishFragment();
                return;
            }
            a81Var.f45507r = new org.telegram.ui.ActionBar.t1(3, a81Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f28469id = tL_theme.f28537id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i7 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i7 | 3;
            int sendRequest = ConnectionsManager.getInstance(a81Var.currentAccount).sendRequest(updatetheme, new e31(4, a81Var, updatetheme), 2);
            ConnectionsManager.getInstance(a81Var.currentAccount).bindRequestToGuid(sendRequest, a81Var.classGuid);
            a81Var.f45507r.setOnCancelListener(new di.z(a81Var, sendRequest, 8));
            a81Var.f45507r.show();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29463jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29648tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29629sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29706wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29687vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29668ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29611rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29647ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29610ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29701w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29568p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29684v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131748059, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131751206, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new is0(this, 17));
        this.f45503c = this.actionBar.s().e(1, org.telegram.messenger.hd.N0(2131751342, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29290a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new gi.a(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f45510x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f45510x;
        int i10 = org.telegram.ui.ActionBar.m6.f29347d6;
        org.telegram.ui.ActionBar.t6.h(i10, linearLayout4, null);
        linearLayout2.addView(this.f45510x, c8.na.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 23);
        this.f45508s = o4Var;
        o4Var.setText(org.telegram.messenger.hd.N0(2131749004, null));
        this.f45510x.addView(this.f45508s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f45502b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f45502b;
        int i11 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f45502b;
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor3, i12, null);
        this.f45502b.setMaxLines(1);
        this.f45502b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f45502b;
        if (org.telegram.messenger.hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor4.setGravity(i7 | 16);
        this.f45502b.setBackgroundDrawable(null);
        this.f45502b.setPadding(0, 0, 0, 0);
        this.f45502b.setSingleLine(true);
        this.f45502b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f45502b.setInputType(163872);
        this.f45502b.setImeOptions(6);
        this.f45502b.setHint(org.telegram.messenger.hd.N0(2131743935, null));
        org.telegram.ui.ActionBar.t6.v(this.f45502b, i12, null);
        this.f45502b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f45502b.setCursorWidth(1.5f);
        this.f45510x.addView(this.f45502b, c8.na.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f45502b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final a81 f54052b;

            {
                this.f54052b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (r2) {
                    case 0:
                        a81 a81Var = this.f54052b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(a81Var.f45502b);
                            return true;
                        }
                        a81Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (q0Var = this.f54052b.f45503c) != null) {
                            q0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f45510x.addView(new org.telegram.ui.Components.ln(context, 26), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f45510x.addView(linearLayout5, c8.na.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f45509w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().X2 + "/addtheme/");
        this.f45509w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.D(this.f45509w, i11, null);
        org.telegram.ui.ActionBar.t6.U(this.f45509w, i12, null);
        this.f45509w.setMaxLines(1);
        this.f45509w.setLines(1);
        this.f45509w.setEnabled(false);
        this.f45509w.setBackgroundDrawable(null);
        this.f45509w.setPadding(0, 0, 0, 0);
        this.f45509w.setSingleLine(true);
        this.f45509w.setInputType(163840);
        this.f45509w.setImeOptions(6);
        linearLayout5.addView(this.f45509w, c8.na.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f45501a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.D(this.f45501a, i11, null);
        org.telegram.ui.ActionBar.t6.U(this.f45501a, i12, null);
        this.f45501a.setMaxLines(1);
        this.f45501a.setLines(1);
        this.f45501a.setBackgroundDrawable(null);
        this.f45501a.setPadding(0, 0, 0, 0);
        this.f45501a.setSingleLine(true);
        this.f45501a.setInputType(163872);
        this.f45501a.setImeOptions(6);
        this.f45501a.setHint(org.telegram.messenger.hd.N0(2131745305, null));
        org.telegram.ui.ActionBar.t6.v(this.f45501a, i12, null);
        this.f45501a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f45501a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f45501a, c8.na.o(-1, 50));
        this.f45501a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final a81 f54052b;

            {
                this.f54052b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (r2) {
                    case 0:
                        a81 a81Var = this.f54052b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(a81Var.f45502b);
                            return true;
                        }
                        a81Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (q0Var = this.f54052b.f45503c) != null) {
                            q0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f45501a.addTextChangedListener(new m0(this, 16));
        if (z10) {
            this.f45501a.setOnFocusChangeListener(new ed(this, 11));
        }
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.f45504e = a9Var;
        int i13 = org.telegram.ui.ActionBar.m6.f29311b7;
        org.telegram.ui.ActionBar.t6.Z(a9Var, context, 2131231230, i13);
        this.f45504e.setVisibility(8);
        this.f45504e.setBottomPadding(0);
        linearLayout2.addView(this.f45504e, c8.na.o(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
        this.d = a9Var2;
        a9Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.t6.C(this.d.getTextView(), org.telegram.ui.ActionBar.m6.K6, null);
        if (z10) {
            this.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131743944, null)));
        } else {
            org.telegram.ui.Cells.a9 a9Var3 = this.d;
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131743903, null));
            this.H = W2;
            a9Var3.setText(W2);
        }
        linearLayout2.addView(this.d, c8.na.o(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.t6.Z(this.d, context, 2131231229, i13);
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, this.parentLayout, 1);
            this.f45505f = baVar;
            linearLayout2.addView(baVar, c8.na.o(-1, -2));
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.h = x9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.m6.N0(true);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.f29439i6);
            x9Var.setBackground(N0);
            org.telegram.ui.ActionBar.t6.j(x9Var, N0, M, M2, null);
            this.h.b(org.telegram.messenger.hd.N0(2131743556, null), false);
            linearLayout2.addView(this.h, c8.na.o(-1, -2));
            this.h.setOnClickListener(new jg0(16, this, context));
            org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context);
            this.f45506n = a9Var4;
            a9Var4.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131743555, null)));
            org.telegram.ui.ActionBar.t6.Z(this.f45506n, context, 2131231230, i13);
            linearLayout2.addView(this.f45506n, c8.na.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.t6.Z(this.d, context, 2131231230, i13);
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f45502b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f45502b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f45501a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f45501a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.t1 t1Var;
        org.telegram.ui.ActionBar.t1 t1Var2;
        int i11 = org.telegram.messenger.ls.M2;
        org.telegram.ui.ActionBar.j6 j6Var = this.K;
        org.telegram.ui.ActionBar.l6 l6Var = this.J;
        if (i7 == i11) {
            org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) objArr[0];
            org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[1];
            if (l6Var2 == l6Var && j6Var2 == j6Var && (t1Var2 = this.f45507r) != null) {
                try {
                    t1Var2.dismiss();
                    this.f45507r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.m6.u(l6Var, true, false);
                finishFragment();
            }
        } else if (i7 == org.telegram.messenger.ls.N2) {
            org.telegram.ui.ActionBar.l6 l6Var3 = (org.telegram.ui.ActionBar.l6) objArr[0];
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[1];
            if (l6Var3 == l6Var && j6Var3 == j6Var && (t1Var = this.f45507r) != null) {
                try {
                    t1Var.dismiss();
                    this.f45507r = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final boolean e0(String str, boolean z10) {
        b31 b31Var = this.F;
        if (b31Var != null) {
            org.telegram.messenger.g0.r(b31Var);
            this.F = null;
            this.E = null;
            if (this.f45511y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45511y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.c5.r0(this, org.telegram.messenger.hd.N0(2131743949, null), org.telegram.messenger.hd.N0(2131745306, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.m6.f29568p7, org.telegram.messenger.hd.N0(2131745306, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.c5.r0(this, org.telegram.messenger.hd.N0(2131743949, null), org.telegram.messenger.hd.N0(2131745309, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.m6.f29568p7, org.telegram.messenger.hd.N0(2131745309, null));
                        return false;
                    }
                }
            } else {
                f0(org.telegram.ui.ActionBar.m6.f29568p7, org.telegram.messenger.hd.N0(2131745309, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.c5.r0(this, org.telegram.messenger.hd.N0(2131743949, null), org.telegram.messenger.hd.N0(2131745308, null), null);
                    return false;
                }
                f0(org.telegram.ui.ActionBar.m6.f29568p7, org.telegram.messenger.hd.N0(2131745308, null));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    f0(org.telegram.ui.ActionBar.m6.f29701w6, org.telegram.messenger.hd.a0("SetUrlAvailable", null, 2131745312, str));
                    return true;
                }
                f0(org.telegram.ui.ActionBar.m6.F6, org.telegram.messenger.hd.N0(2131745311, null));
                this.E = str;
                b31 b31Var2 = new b31(7, this, str);
                this.F = b31Var2;
                org.telegram.messenger.g0.h3(b31Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.c5.r0(this, org.telegram.messenger.hd.N0(2131743949, null), org.telegram.messenger.hd.N0(2131745307, null), null);
            return false;
        } else {
            f0(org.telegram.ui.ActionBar.m6.f29568p7, org.telegram.messenger.hd.N0(2131745307, null));
            return false;
        }
    }

    public final void f0(int i7, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.f45504e.setVisibility(8);
            if (z10) {
                org.telegram.ui.ActionBar.t6.Z(this.d, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.m6.f29311b7);
                return;
            } else {
                org.telegram.ui.ActionBar.t6.Z(this.d, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.m6.f29311b7);
                return;
            }
        }
        this.f45504e.setVisibility(0);
        this.f45504e.setText(str);
        this.f45504e.setTag(Integer.valueOf(i7));
        this.f45504e.setTextColorByKey(i7);
        if (z10) {
            org.telegram.ui.ActionBar.t6.Z(this.d, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.m6.f29311b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45501a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29476k6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45501a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29494l6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29373ee));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29462jc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45505f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29371ec));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ls.M2);
        getNotificationCenter().c(this, org.telegram.messenger.ls.N2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ls.M2);
        getNotificationCenter().n(this, org.telegram.messenger.ls.N2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.np.g1().getBoolean("view_animations", true) && this.I) {
            this.f45501a.requestFocus();
            org.telegram.messenger.g0.I3(this.f45501a);
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f45502b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.m6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f45501a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.m6.G6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f45501a.requestFocus();
            org.telegram.messenger.g0.I3(this.f45501a);
        }
    }
}
