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
public final class a81 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public String D;
    public rw0 E;
    public boolean F;
    public SpannableStringBuilder G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.l6 I;
    public final org.telegram.ui.ActionBar.j6 J;
    public final TLRPC.TL_theme K;
    public EditTextBoldCursor f43602a;
    public EditTextBoldCursor f43603b;
    public org.telegram.ui.ActionBar.r0 f43604c;
    public org.telegram.ui.Cells.z8 d;
    public org.telegram.ui.Cells.z8 f43605e;
    public org.telegram.ui.Cells.z9 f43606f;
    public org.telegram.ui.Cells.w9 h;
    public org.telegram.ui.Cells.z8 f43607n;
    public org.telegram.ui.ActionBar.u1 f43608r;
    public org.telegram.ui.Cells.n4 f43609s;
    public EditTextBoldCursor f43610w;
    public LinearLayout f43611x;
    public int f43612y;

    public a81(org.telegram.ui.ActionBar.l6 l6Var, org.telegram.ui.ActionBar.j6 j6Var, boolean z9) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i7;
        this.I = l6Var;
        this.J = j6Var;
        if (j6Var != null) {
            tL_theme = j6Var.f27624r;
        } else {
            tL_theme = l6Var.F;
        }
        this.K = tL_theme;
        if (j6Var != null) {
            i7 = j6Var.f27626t;
        } else {
            i7 = l6Var.E;
        }
        this.currentAccount = i7;
        this.H = z9;
    }

    public static void Z(a81 a81Var, int i7) {
        ConnectionsManager.getInstance(a81Var.currentAccount).cancelRequest(i7, true);
    }

    public static void a0(a81 a81Var, TLRPC.TL_theme tL_theme) {
        try {
            a81Var.f43608r.dismiss();
            a81Var.f43608r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.m6.I1(a81Var.I, a81Var.J, tL_theme, a81Var.currentAccount, false);
        a81Var.finishFragment();
    }

    public static void b0(a81 a81Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            a81Var.f43608r.dismiss();
            a81Var.f43608r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.u4.c0(a81Var.currentAccount, tL_error, a81Var, updatetheme, new Object[0]);
    }

    public static void c0(a81 a81Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        a81Var.f43612y = ConnectionsManager.getInstance(a81Var.currentAccount).sendRequest(createtheme, new p41(1, a81Var, str), 2);
    }

    public static void d0(a81 a81Var) {
        org.telegram.ui.ActionBar.l6 l6Var = a81Var.I;
        TLRPC.TL_theme tL_theme = a81Var.K;
        if (!a81Var.e0(a81Var.f43602a.getText().toString(), true) || a81Var.getParentActivity() == null) {
            return;
        }
        if (a81Var.f43603b.length() == 0) {
            org.telegram.ui.Components.u4.r0(a81Var, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131744177, null), null);
        } else if (a81Var.H) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, a81Var.getParentActivity(), null);
            a81Var.f43608r = u1Var;
            u1Var.setOnCancelListener(new Object());
            a81Var.f43608r.show();
            String obj = a81Var.f43603b.getText().toString();
            tL_theme.title = obj;
            l6Var.f27765a = obj;
            l6Var.F.slug = a81Var.f43602a.getText().toString();
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
            String obj2 = a81Var.f43602a.getText().toString();
            String obj3 = a81Var.f43603b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                a81Var.finishFragment();
                return;
            }
            a81Var.f43608r = new org.telegram.ui.ActionBar.u1(3, a81Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f27031id = tL_theme.f27099id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i7 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i7 | 3;
            int sendRequest = ConnectionsManager.getInstance(a81Var.currentAccount).sendRequest(updatetheme, new p41(2, a81Var, updatetheme), 2);
            ConnectionsManager.getInstance(a81Var.currentAccount).bindRequestToGuid(sendRequest, a81Var.classGuid);
            a81Var.f43608r.setOnCancelListener(new bi.g0(a81Var, sendRequest, 8));
            a81Var.f43608r.show();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27952gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28304zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28286yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28268xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28135qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28115pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28191tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28172sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28154rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28095ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28190ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28153ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28244w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28111p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z9 = this.H;
        if (z9) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748252, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131751218, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new qt0(this, 14));
        this.f43604c = this.actionBar.s().e(1, org.telegram.messenger.id.M0(2131751354, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new ei.b(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f43611x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f43611x;
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        org.telegram.ui.ActionBar.t6.h(i10, linearLayout4, null);
        linearLayout2.addView(this.f43611x, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f43609s = n4Var;
        n4Var.setText(org.telegram.messenger.id.M0(2131749197, null));
        this.f43611x.addView(this.f43609s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f43603b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f43603b;
        int i11 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f43603b;
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor3, i12, null);
        this.f43603b.setMaxLines(1);
        this.f43603b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f43603b;
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor4.setGravity(i7 | 16);
        this.f43603b.setBackgroundDrawable(null);
        this.f43603b.setPadding(0, 0, 0, 0);
        this.f43603b.setSingleLine(true);
        this.f43603b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f43603b.setInputType(163872);
        this.f43603b.setImeOptions(6);
        this.f43603b.setHint(org.telegram.messenger.id.M0(2131744176, null));
        org.telegram.ui.ActionBar.t6.v(this.f43603b, i12, null);
        this.f43603b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f43603b.setCursorWidth(1.5f);
        this.f43611x.addView(this.f43603b, c8.ha.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f43603b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final a81 f51958b;

            {
                this.f51958b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        a81 a81Var = this.f51958b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(a81Var.f43603b);
                            return true;
                        }
                        a81Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (r0Var = this.f51958b.f43604c) != null) {
                            r0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f43611x.addView(new org.telegram.ui.Components.sm(context, 26), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f43611x.addView(linearLayout5, c8.ha.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f43610w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().U2 + "/addtheme/");
        this.f43610w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.D(this.f43610w, i11, null);
        org.telegram.ui.ActionBar.t6.U(this.f43610w, i12, null);
        this.f43610w.setMaxLines(1);
        this.f43610w.setLines(1);
        this.f43610w.setEnabled(false);
        this.f43610w.setBackgroundDrawable(null);
        this.f43610w.setPadding(0, 0, 0, 0);
        this.f43610w.setSingleLine(true);
        this.f43610w.setInputType(163840);
        this.f43610w.setImeOptions(6);
        linearLayout5.addView(this.f43610w, c8.ha.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f43602a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.D(this.f43602a, i11, null);
        org.telegram.ui.ActionBar.t6.U(this.f43602a, i12, null);
        this.f43602a.setMaxLines(1);
        this.f43602a.setLines(1);
        this.f43602a.setBackgroundDrawable(null);
        this.f43602a.setPadding(0, 0, 0, 0);
        this.f43602a.setSingleLine(true);
        this.f43602a.setInputType(163872);
        this.f43602a.setImeOptions(6);
        this.f43602a.setHint(org.telegram.messenger.id.M0(2131745501, null));
        org.telegram.ui.ActionBar.t6.v(this.f43602a, i12, null);
        this.f43602a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f43602a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f43602a, c8.ha.o(-1, 50));
        this.f43602a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final a81 f51958b;

            {
                this.f51958b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        a81 a81Var = this.f51958b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(a81Var.f43603b);
                            return true;
                        }
                        a81Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (r0Var = this.f51958b.f43604c) != null) {
                            r0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f43602a.addTextChangedListener(new m0(this, 16));
        if (z9) {
            this.f43602a.setOnFocusChangeListener(new fd(this, 11));
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.f43605e = z8Var;
        int i13 = org.telegram.ui.ActionBar.m6.f27854b7;
        org.telegram.ui.ActionBar.t6.Z(z8Var, context, 2131231230, i13);
        this.f43605e.setVisibility(8);
        this.f43605e.setBottomPadding(0);
        linearLayout2.addView(this.f43605e, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
        this.d = z8Var2;
        z8Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.t6.C(this.d.getTextView(), org.telegram.ui.ActionBar.m6.K6, null);
        if (z9) {
            this.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744185, null)));
        } else {
            org.telegram.ui.Cells.z8 z8Var3 = this.d;
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744144, null));
            this.G = X2;
            z8Var3.setText(X2);
        }
        linearLayout2.addView(this.d, c8.ha.o(-1, -2));
        if (z9) {
            org.telegram.ui.ActionBar.t6.Z(this.d, context, 2131231229, i13);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f43606f = z9Var;
            linearLayout2.addView(z9Var, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.h = w9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.m6.N0(true);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.f27982i6);
            w9Var.setBackground(N0);
            org.telegram.ui.ActionBar.t6.j(w9Var, N0, M, M2, null);
            this.h.b(org.telegram.messenger.id.M0(2131743799, null), false);
            linearLayout2.addView(this.h, c8.ha.o(-1, -2));
            this.h.setOnClickListener(new ik0(14, this, context));
            org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
            this.f43607n = z8Var4;
            z8Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743798, null)));
            org.telegram.ui.ActionBar.t6.Z(this.f43607n, context, 2131231230, i13);
            linearLayout2.addView(this.f43607n, c8.ha.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.t6.Z(this.d, context, 2131231230, i13);
        }
        TLRPC.TL_theme tL_theme = this.K;
        if (tL_theme != null) {
            this.F = true;
            this.f43603b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f43603b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f43602a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f43602a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.F = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.u1 u1Var;
        org.telegram.ui.ActionBar.u1 u1Var2;
        int i11 = org.telegram.messenger.qs.M2;
        org.telegram.ui.ActionBar.j6 j6Var = this.J;
        org.telegram.ui.ActionBar.l6 l6Var = this.I;
        if (i7 == i11) {
            org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) objArr[0];
            org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[1];
            if (l6Var2 == l6Var && j6Var2 == j6Var && (u1Var2 = this.f43608r) != null) {
                try {
                    u1Var2.dismiss();
                    this.f43608r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.m6.u(l6Var, true, false);
                finishFragment();
            }
        } else if (i7 == org.telegram.messenger.qs.N2) {
            org.telegram.ui.ActionBar.l6 l6Var3 = (org.telegram.ui.ActionBar.l6) objArr[0];
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[1];
            if (l6Var3 == l6Var && j6Var3 == j6Var && (u1Var = this.f43608r) != null) {
                try {
                    u1Var.dismiss();
                    this.f43608r = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final boolean e0(String str, boolean z9) {
        rw0 rw0Var = this.E;
        if (rw0Var != null) {
            org.telegram.messenger.g0.r(rw0Var);
            this.E = null;
            this.D = null;
            if (this.f43612y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f43612y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z9) {
                            org.telegram.ui.Components.u4.r0(this, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131745502, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.m6.f28111p7, org.telegram.messenger.id.M0(2131745502, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z9) {
                            org.telegram.ui.Components.u4.r0(this, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131745505, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.m6.f28111p7, org.telegram.messenger.id.M0(2131745505, null));
                        return false;
                    }
                }
            } else {
                f0(org.telegram.ui.ActionBar.m6.f28111p7, org.telegram.messenger.id.M0(2131745505, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z9) {
                    org.telegram.ui.Components.u4.r0(this, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131745504, null), null);
                    return false;
                }
                f0(org.telegram.ui.ActionBar.m6.f28111p7, org.telegram.messenger.id.M0(2131745504, null));
                return false;
            }
            if (!z9) {
                TLRPC.TL_theme tL_theme = this.K;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    f0(org.telegram.ui.ActionBar.m6.f28244w6, org.telegram.messenger.id.a0("SetUrlAvailable", null, 2131745508, str));
                    return true;
                }
                f0(org.telegram.ui.ActionBar.m6.F6, org.telegram.messenger.id.M0(2131745507, null));
                this.D = str;
                rw0 rw0Var2 = new rw0(17, this, str);
                this.E = rw0Var2;
                org.telegram.messenger.g0.i3(rw0Var2, 300L);
            }
            return true;
        } else if (z9) {
            org.telegram.ui.Components.u4.r0(this, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131745503, null), null);
            return false;
        } else {
            f0(org.telegram.ui.ActionBar.m6.f28111p7, org.telegram.messenger.id.M0(2131745503, null));
            return false;
        }
    }

    public final void f0(int i7, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z9 = this.H;
        if (isEmpty) {
            this.f43605e.setVisibility(8);
            if (z9) {
                org.telegram.ui.ActionBar.t6.Z(this.d, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.m6.f27854b7);
                return;
            } else {
                org.telegram.ui.ActionBar.t6.Z(this.d, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.m6.f27854b7);
                return;
            }
        }
        this.f43605e.setVisibility(0);
        this.f43605e.setText(str);
        this.f43605e.setTag(Integer.valueOf(i7));
        this.f43605e.setTextColorByKey(i7);
        if (z9) {
            org.telegram.ui.ActionBar.t6.Z(this.d, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.m6.f27854b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43602a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28019k6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43602a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28037l6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27860be));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27951gc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27880ce));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43606f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27859bc));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.N2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.N2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.qp.e1().getBoolean("view_animations", true) && this.H) {
            this.f43602a.requestFocus();
            org.telegram.messenger.g0.K3(this.f43602a);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f43603b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.m6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f43602a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.m6.G6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && !this.H) {
            this.f43602a.requestFocus();
            org.telegram.messenger.g0.K3(this.f43602a);
        }
    }
}
