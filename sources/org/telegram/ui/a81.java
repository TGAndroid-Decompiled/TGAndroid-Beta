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
public final class a81 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public String E;
    public b31 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.m6 J;
    public final org.telegram.ui.ActionBar.k6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f45491a;
    public EditTextBoldCursor f45492b;
    public org.telegram.ui.ActionBar.r0 f45493c;
    public org.telegram.ui.Cells.a9 d;
    public org.telegram.ui.Cells.a9 f45494e;
    public org.telegram.ui.Cells.ba f45495f;
    public org.telegram.ui.Cells.x9 h;
    public org.telegram.ui.Cells.a9 f45496n;
    public org.telegram.ui.ActionBar.u1 f45497r;
    public org.telegram.ui.Cells.o4 f45498s;
    public EditTextBoldCursor f45499w;
    public LinearLayout f45500x;
    public int f45501y;

    public a81(org.telegram.ui.ActionBar.m6 m6Var, org.telegram.ui.ActionBar.k6 k6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i7;
        this.J = m6Var;
        this.K = k6Var;
        if (k6Var != null) {
            tL_theme = k6Var.f29183r;
        } else {
            tL_theme = m6Var.G;
        }
        this.L = tL_theme;
        if (k6Var != null) {
            i7 = k6Var.f29185t;
        } else {
            i7 = m6Var.F;
        }
        this.currentAccount = i7;
        this.I = z10;
    }

    public static void a0(a81 a81Var, TLRPC.TL_theme tL_theme) {
        try {
            a81Var.f45497r.dismiss();
            a81Var.f45497r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.n6.I1(a81Var.J, a81Var.K, tL_theme, a81Var.currentAccount, false);
        a81Var.finishFragment();
    }

    public static void b0(a81 a81Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            a81Var.f45497r.dismiss();
            a81Var.f45497r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.b5.c0(a81Var.currentAccount, tL_error, a81Var, updatetheme, new Object[0]);
    }

    public static void c0(a81 a81Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        a81Var.f45501y = ConnectionsManager.getInstance(a81Var.currentAccount).sendRequest(createtheme, new e31(3, a81Var, str), 2);
    }

    public static void d0(a81 a81Var) {
        org.telegram.ui.ActionBar.m6 m6Var = a81Var.J;
        TLRPC.TL_theme tL_theme = a81Var.L;
        if (!a81Var.e0(a81Var.f45491a.getText().toString(), true) || a81Var.getParentActivity() == null) {
            return;
        }
        if (a81Var.f45492b.length() == 0) {
            org.telegram.ui.Components.b5.r0(a81Var, org.telegram.messenger.gd.M0(2131743955, null), org.telegram.messenger.gd.M0(2131743942, null), null);
        } else if (a81Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, a81Var.getParentActivity(), null);
            a81Var.f45497r = u1Var;
            u1Var.setOnCancelListener(new Object());
            a81Var.f45497r.show();
            String obj = a81Var.f45492b.getText().toString();
            tL_theme.title = obj;
            m6Var.f29247a = obj;
            m6Var.G.slug = a81Var.f45491a.getText().toString();
            org.telegram.ui.ActionBar.n6.x1(m6Var, true, true, true);
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
            String obj2 = a81Var.f45491a.getText().toString();
            String obj3 = a81Var.f45492b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                a81Var.finishFragment();
                return;
            }
            a81Var.f45497r = new org.telegram.ui.ActionBar.u1(3, a81Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f28474id = tL_theme.f28542id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i7 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i7 | 3;
            int sendRequest = ConnectionsManager.getInstance(a81Var.currentAccount).sendRequest(updatetheme, new e31(4, a81Var, updatetheme), 2);
            ConnectionsManager.getInstance(a81Var.currentAccount).bindRequestToGuid(sendRequest, a81Var.classGuid);
            a81Var.f45497r.setOnCancelListener(new di.z(a81Var, sendRequest, 8));
            a81Var.f45497r.show();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29510jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29695tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29753wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29734vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29715ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29658rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29657ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29748w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29615p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131748060, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131751207, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new hs0(this, 17));
        this.f45493c = this.actionBar.t().e(1, org.telegram.messenger.gd.M0(2131751343, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new gi.a(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f45500x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f45500x;
        int i10 = org.telegram.ui.ActionBar.n6.f29394d6;
        org.telegram.ui.ActionBar.u6.h(i10, linearLayout4, null);
        linearLayout2.addView(this.f45500x, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 23);
        this.f45498s = o4Var;
        o4Var.setText(org.telegram.messenger.gd.M0(2131749005, null));
        this.f45500x.addView(this.f45498s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f45492b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f45492b;
        int i11 = org.telegram.ui.ActionBar.n6.H6;
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f45492b;
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor3, i12, null);
        this.f45492b.setMaxLines(1);
        this.f45492b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f45492b;
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor4.setGravity(i7 | 16);
        this.f45492b.setBackgroundDrawable(null);
        this.f45492b.setPadding(0, 0, 0, 0);
        this.f45492b.setSingleLine(true);
        this.f45492b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f45492b.setInputType(163872);
        this.f45492b.setImeOptions(6);
        this.f45492b.setHint(org.telegram.messenger.gd.M0(2131743941, null));
        org.telegram.ui.ActionBar.u6.v(this.f45492b, i12, null);
        this.f45492b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f45492b.setCursorWidth(1.5f);
        this.f45500x.addView(this.f45492b, c8.ma.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f45492b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final a81 f54027b;

            {
                this.f54027b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        a81 a81Var = this.f54027b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(a81Var.f45492b);
                            return true;
                        }
                        a81Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (r0Var = this.f54027b.f45493c) != null) {
                            r0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f45500x.addView(new org.telegram.ui.Components.jn(context, 26), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f45500x.addView(linearLayout5, c8.ma.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f45499w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().X2 + "/addtheme/");
        this.f45499w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.D(this.f45499w, i11, null);
        org.telegram.ui.ActionBar.u6.U(this.f45499w, i12, null);
        this.f45499w.setMaxLines(1);
        this.f45499w.setLines(1);
        this.f45499w.setEnabled(false);
        this.f45499w.setBackgroundDrawable(null);
        this.f45499w.setPadding(0, 0, 0, 0);
        this.f45499w.setSingleLine(true);
        this.f45499w.setInputType(163840);
        this.f45499w.setImeOptions(6);
        linearLayout5.addView(this.f45499w, c8.ma.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f45491a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.D(this.f45491a, i11, null);
        org.telegram.ui.ActionBar.u6.U(this.f45491a, i12, null);
        this.f45491a.setMaxLines(1);
        this.f45491a.setLines(1);
        this.f45491a.setBackgroundDrawable(null);
        this.f45491a.setPadding(0, 0, 0, 0);
        this.f45491a.setSingleLine(true);
        this.f45491a.setInputType(163872);
        this.f45491a.setImeOptions(6);
        this.f45491a.setHint(org.telegram.messenger.gd.M0(2131745306, null));
        org.telegram.ui.ActionBar.u6.v(this.f45491a, i12, null);
        this.f45491a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f45491a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f45491a, c8.ma.o(-1, 50));
        this.f45491a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final a81 f54027b;

            {
                this.f54027b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        a81 a81Var = this.f54027b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(a81Var.f45492b);
                            return true;
                        }
                        a81Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (r0Var = this.f54027b.f45493c) != null) {
                            r0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f45491a.addTextChangedListener(new m0(this, 16));
        if (z10) {
            this.f45491a.setOnFocusChangeListener(new ed(this, 11));
        }
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.f45494e = a9Var;
        int i13 = org.telegram.ui.ActionBar.n6.f29358b7;
        org.telegram.ui.ActionBar.u6.Z(a9Var, context, 2131231230, i13);
        this.f45494e.setVisibility(8);
        this.f45494e.setBottomPadding(0);
        linearLayout2.addView(this.f45494e, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
        this.d = a9Var2;
        a9Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.u6.C(this.d.getTextView(), org.telegram.ui.ActionBar.n6.K6, null);
        if (z10) {
            this.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743950, null)));
        } else {
            org.telegram.ui.Cells.a9 a9Var3 = this.d;
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743909, null));
            this.H = W2;
            a9Var3.setText(W2);
        }
        linearLayout2.addView(this.d, c8.ma.o(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.u6.Z(this.d, context, 2131231229, i13);
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, this.parentLayout, 1);
            this.f45495f = baVar;
            linearLayout2.addView(baVar, c8.ma.o(-1, -2));
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.h = x9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.n6.N0(true);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29486i6);
            x9Var.setBackground(N0);
            org.telegram.ui.ActionBar.u6.j(x9Var, N0, M, M2, null);
            this.h.b(org.telegram.messenger.gd.M0(2131743562, null), false);
            linearLayout2.addView(this.h, c8.ma.o(-1, -2));
            this.h.setOnClickListener(new cd0(18, this, context));
            org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context);
            this.f45496n = a9Var4;
            a9Var4.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743561, null)));
            org.telegram.ui.ActionBar.u6.Z(this.f45496n, context, 2131231230, i13);
            linearLayout2.addView(this.f45496n, c8.ma.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.u6.Z(this.d, context, 2131231230, i13);
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f45492b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f45492b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f45491a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f45491a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.u1 u1Var;
        org.telegram.ui.ActionBar.u1 u1Var2;
        int i11 = org.telegram.messenger.ks.M2;
        org.telegram.ui.ActionBar.k6 k6Var = this.K;
        org.telegram.ui.ActionBar.m6 m6Var = this.J;
        if (i7 == i11) {
            org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) objArr[0];
            org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) objArr[1];
            if (m6Var2 == m6Var && k6Var2 == k6Var && (u1Var2 = this.f45497r) != null) {
                try {
                    u1Var2.dismiss();
                    this.f45497r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.n6.u(m6Var, true, false);
                finishFragment();
            }
        } else if (i7 == org.telegram.messenger.ks.N2) {
            org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) objArr[0];
            org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) objArr[1];
            if (m6Var3 == m6Var && k6Var3 == k6Var && (u1Var = this.f45497r) != null) {
                try {
                    u1Var.dismiss();
                    this.f45497r = null;
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
            if (this.f45501y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45501y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.M0(2131743955, null), org.telegram.messenger.gd.M0(2131745307, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.n6.f29615p7, org.telegram.messenger.gd.M0(2131745307, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.M0(2131743955, null), org.telegram.messenger.gd.M0(2131745310, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.n6.f29615p7, org.telegram.messenger.gd.M0(2131745310, null));
                        return false;
                    }
                }
            } else {
                f0(org.telegram.ui.ActionBar.n6.f29615p7, org.telegram.messenger.gd.M0(2131745310, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.M0(2131743955, null), org.telegram.messenger.gd.M0(2131745309, null), null);
                    return false;
                }
                f0(org.telegram.ui.ActionBar.n6.f29615p7, org.telegram.messenger.gd.M0(2131745309, null));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    f0(org.telegram.ui.ActionBar.n6.f29748w6, org.telegram.messenger.gd.a0("SetUrlAvailable", null, 2131745313, str));
                    return true;
                }
                f0(org.telegram.ui.ActionBar.n6.F6, org.telegram.messenger.gd.M0(2131745312, null));
                this.E = str;
                b31 b31Var2 = new b31(7, this, str);
                this.F = b31Var2;
                org.telegram.messenger.g0.h3(b31Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.M0(2131743955, null), org.telegram.messenger.gd.M0(2131745308, null), null);
            return false;
        } else {
            f0(org.telegram.ui.ActionBar.n6.f29615p7, org.telegram.messenger.gd.M0(2131745308, null));
            return false;
        }
    }

    public final void f0(int i7, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.f45494e.setVisibility(8);
            if (z10) {
                org.telegram.ui.ActionBar.u6.Z(this.d, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.n6.f29358b7);
                return;
            } else {
                org.telegram.ui.ActionBar.u6.Z(this.d, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.n6.f29358b7);
                return;
            }
        }
        this.f45494e.setVisibility(0);
        this.f45494e.setText(str);
        this.f45494e.setTag(Integer.valueOf(i7));
        this.f45494e.setTextColorByKey(i7);
        if (z10) {
            org.telegram.ui.ActionBar.u6.Z(this.d, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.n6.f29358b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45491a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29523k6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45491a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29541l6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29420ee));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29509jc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45495f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29418ec));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ks.M2);
        getNotificationCenter().c(this, org.telegram.messenger.ks.N2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.M2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.N2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.mp.g1().getBoolean("view_animations", true) && this.I) {
            this.f45491a.requestFocus();
            org.telegram.messenger.g0.I3(this.f45491a);
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f45492b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.n6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f45491a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.u6.l(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.n6.G6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f45491a.requestFocus();
            org.telegram.messenger.g0.I3(this.f45491a);
        }
    }
}
