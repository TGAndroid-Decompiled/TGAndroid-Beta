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
public final class n91 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public String D;
    public y01 E;
    public boolean F;
    public SpannableStringBuilder G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.s6 I;
    public final org.telegram.ui.ActionBar.r6 J;
    public final TLRPC.TL_theme K;
    public EditTextBoldCursor f39776a;
    public EditTextBoldCursor f39777b;
    public org.telegram.ui.ActionBar.t0 f39778c;
    public org.telegram.ui.Cells.b9 d;
    public org.telegram.ui.Cells.b9 e;
    public org.telegram.ui.Cells.z9 f39779f;
    public org.telegram.ui.Cells.x9 h;
    public org.telegram.ui.Cells.b9 f39780n;
    public org.telegram.ui.ActionBar.x1 f39781r;
    public org.telegram.ui.Cells.p4 f39782s;
    public EditTextBoldCursor f39783w;
    public LinearLayout f39784x;
    public int f39785y;

    public n91(org.telegram.ui.ActionBar.s6 s6Var, org.telegram.ui.ActionBar.r6 r6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.I = s6Var;
        this.J = r6Var;
        if (r6Var != null) {
            tL_theme = r6Var.f20745r;
        } else {
            tL_theme = s6Var.F;
        }
        this.K = tL_theme;
        if (r6Var != null) {
            i10 = r6Var.f20747t;
        } else {
            i10 = s6Var.E;
        }
        this.currentAccount = i10;
        this.H = z10;
    }

    public static void a0(n91 n91Var, TLRPC.TL_theme tL_theme) {
        try {
            n91Var.f39781r.dismiss();
            n91Var.f39781r = null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.ActionBar.t6.I1(n91Var.I, n91Var.J, tL_theme, n91Var.currentAccount, false);
        n91Var.finishFragment();
    }

    public static void b0(n91 n91Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            n91Var.f39781r.dismiss();
            n91Var.f39781r = null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.Components.s4.e0(n91Var.currentAccount, tL_error, n91Var, updatetheme, new Object[0]);
    }

    public static void c0(n91 n91Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        n91Var.f39785y = ConnectionsManager.getInstance(n91Var.currentAccount).sendRequest(createtheme, new sl0(15, n91Var, str), 2);
    }

    public static void d0(n91 n91Var) {
        org.telegram.ui.ActionBar.s6 s6Var = n91Var.I;
        TLRPC.TL_theme tL_theme = n91Var.K;
        if (!n91Var.e0(n91Var.f39776a.getText().toString(), true) || n91Var.getParentActivity() == null) {
            return;
        }
        if (n91Var.f39777b.length() == 0) {
            org.telegram.ui.Components.s4.t0(n91Var, org.telegram.messenger.dd.L0(2131744215, null), org.telegram.messenger.dd.L0(2131744202, null), null);
        } else if (n91Var.H) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, n91Var.getParentActivity(), null);
            n91Var.f39781r = x1Var;
            x1Var.setOnCancelListener(new Object());
            n91Var.f39781r.show();
            String obj = n91Var.f39777b.getText().toString();
            tL_theme.title = obj;
            s6Var.f20802a = obj;
            s6Var.F.slug = n91Var.f39776a.getText().toString();
            org.telegram.ui.ActionBar.t6.x1(s6Var, true, true, true);
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
            String obj2 = n91Var.f39776a.getText().toString();
            String obj3 = n91Var.f39777b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                n91Var.finishFragment();
                return;
            }
            n91Var.f39781r = new org.telegram.ui.ActionBar.x1(3, n91Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f19865id = tL_theme.f19933id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(n91Var.currentAccount).sendRequest(updatetheme, new sl0(16, n91Var, updatetheme), 2);
            ConnectionsManager.getInstance(n91Var.currentAccount).bindRequestToGuid(sendRequest, n91Var.classGuid);
            n91Var.f39781r.setOnCancelListener(new ba(n91Var, sendRequest, 8));
            n91Var.f39781r.show();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20991gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21317yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21175qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21157pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21229tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21210sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21192rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21140ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21228ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21191ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21278w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21154p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.H;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748269, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131751219, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 5));
        this.f39778c = this.actionBar.p().e(1, org.telegram.messenger.dd.L0(2131751355, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20873a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f39784x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f39784x;
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.a7.i(i11, linearLayout4, null);
        linearLayout2.addView(this.f39784x, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, 23);
        this.f39782s = p4Var;
        p4Var.setText(org.telegram.messenger.dd.L0(2131749206, null));
        this.f39784x.addView(this.f39782s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f39777b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f39777b;
        int i12 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f39777b;
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor3, i13, null);
        this.f39777b.setMaxLines(1);
        this.f39777b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f39777b;
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f39777b.setBackgroundDrawable(null);
        this.f39777b.setPadding(0, 0, 0, 0);
        this.f39777b.setSingleLine(true);
        this.f39777b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f39777b.setInputType(163872);
        this.f39777b.setImeOptions(6);
        this.f39777b.setHint(org.telegram.messenger.dd.L0(2131744201, null));
        org.telegram.ui.ActionBar.a7.w(this.f39777b, i13, null);
        this.f39777b.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.f39777b.setCursorWidth(1.5f);
        this.f39784x.addView(this.f39777b, w7.b6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f39777b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final n91 f39156b;

            {
                this.f39156b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.t0 t0Var;
                switch (r2) {
                    case 0:
                        n91 n91Var = this.f39156b;
                        if (i14 == 6) {
                            org.telegram.messenger.i0.v1(n91Var.f39777b);
                            return true;
                        }
                        n91Var.getClass();
                        return false;
                    default:
                        if (i14 == 6 && (t0Var = this.f39156b.f39778c) != null) {
                            t0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f39784x.addView(new org.telegram.ui.Components.bn(context, 23), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f39784x.addView(linearLayout5, w7.b6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f39783w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().U2 + "/addtheme/");
        this.f39783w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.f39783w, i12, null);
        org.telegram.ui.ActionBar.a7.V(this.f39783w, i13, null);
        this.f39783w.setMaxLines(1);
        this.f39783w.setLines(1);
        this.f39783w.setEnabled(false);
        this.f39783w.setBackgroundDrawable(null);
        this.f39783w.setPadding(0, 0, 0, 0);
        this.f39783w.setSingleLine(true);
        this.f39783w.setInputType(163840);
        this.f39783w.setImeOptions(6);
        linearLayout5.addView(this.f39783w, w7.b6.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f39776a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.f39776a, i12, null);
        org.telegram.ui.ActionBar.a7.V(this.f39776a, i13, null);
        this.f39776a.setMaxLines(1);
        this.f39776a.setLines(1);
        this.f39776a.setBackgroundDrawable(null);
        this.f39776a.setPadding(0, 0, 0, 0);
        this.f39776a.setSingleLine(true);
        this.f39776a.setInputType(163872);
        this.f39776a.setImeOptions(6);
        this.f39776a.setHint(org.telegram.messenger.dd.L0(2131745518, null));
        org.telegram.ui.ActionBar.a7.w(this.f39776a, i13, null);
        this.f39776a.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.f39776a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f39776a, w7.b6.o(-1, 50));
        this.f39776a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final n91 f39156b;

            {
                this.f39156b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.t0 t0Var;
                switch (r2) {
                    case 0:
                        n91 n91Var = this.f39156b;
                        if (i14 == 6) {
                            org.telegram.messenger.i0.v1(n91Var.f39777b);
                            return true;
                        }
                        n91Var.getClass();
                        return false;
                    default:
                        if (i14 == 6 && (t0Var = this.f39156b.f39778c) != null) {
                            t0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f39776a.addTextChangedListener(new n0(this, 16));
        if (z10) {
            this.f39776a.setOnFocusChangeListener(new od(this, 11));
        }
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.e = b9Var;
        int i14 = org.telegram.ui.ActionBar.t6.f20893b7;
        org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231231, i14);
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
        this.d = b9Var2;
        b9Var2.getTextView().setMovementMethod(new org.telegram.messenger.e0(3));
        org.telegram.ui.ActionBar.a7.D(this.d.getTextView(), org.telegram.ui.ActionBar.t6.K6, null);
        if (z10) {
            this.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131744210, null)));
        } else {
            org.telegram.ui.Cells.b9 b9Var3 = this.d;
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131744169, null));
            this.G = W2;
            b9Var3.setText(W2);
        }
        linearLayout2.addView(this.d, w7.b6.o(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.a7.a0(this.d, context, 2131231230, i14);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f39779f = z9Var;
            linearLayout2.addView(z9Var, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.h = x9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21021i6);
            x9Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(x9Var, N0, N, N2, null);
            this.h.b(org.telegram.messenger.dd.L0(2131743825, null), false);
            linearLayout2.addView(this.h, w7.b6.o(-1, -2));
            this.h.setOnClickListener(new qv0(8, this, context));
            org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context);
            this.f39780n = b9Var4;
            b9Var4.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131743824, null)));
            org.telegram.ui.ActionBar.a7.a0(this.f39780n, context, 2131231231, i14);
            linearLayout2.addView(this.f39780n, w7.b6.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.a7.a0(this.d, context, 2131231231, i14);
        }
        TLRPC.TL_theme tL_theme = this.K;
        if (tL_theme != null) {
            this.F = true;
            this.f39777b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f39777b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f39776a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f39776a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.F = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.x1 x1Var;
        org.telegram.ui.ActionBar.x1 x1Var2;
        int i12 = org.telegram.messenger.at.M2;
        org.telegram.ui.ActionBar.r6 r6Var = this.J;
        org.telegram.ui.ActionBar.s6 s6Var = this.I;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) objArr[0];
            org.telegram.ui.ActionBar.r6 r6Var2 = (org.telegram.ui.ActionBar.r6) objArr[1];
            if (s6Var2 == s6Var && r6Var2 == r6Var && (x1Var2 = this.f39781r) != null) {
                try {
                    x1Var2.dismiss();
                    this.f39781r = null;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                org.telegram.ui.ActionBar.t6.u(s6Var, true, false);
                finishFragment();
            }
        } else if (i10 == org.telegram.messenger.at.N2) {
            org.telegram.ui.ActionBar.s6 s6Var3 = (org.telegram.ui.ActionBar.s6) objArr[0];
            org.telegram.ui.ActionBar.r6 r6Var3 = (org.telegram.ui.ActionBar.r6) objArr[1];
            if (s6Var3 == s6Var && r6Var3 == r6Var && (x1Var = this.f39781r) != null) {
                try {
                    x1Var.dismiss();
                    this.f39781r = null;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
        }
    }

    public final boolean e0(String str, boolean z10) {
        y01 y01Var = this.E;
        if (y01Var != null) {
            org.telegram.messenger.i0.r(y01Var);
            this.E = null;
            this.D = null;
            if (this.f39785y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39785y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.dd.L0(2131744215, null), org.telegram.messenger.dd.L0(2131745519, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.t6.f21154p7, org.telegram.messenger.dd.L0(2131745519, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.dd.L0(2131744215, null), org.telegram.messenger.dd.L0(2131745522, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.t6.f21154p7, org.telegram.messenger.dd.L0(2131745522, null));
                        return false;
                    }
                }
            } else {
                f0(org.telegram.ui.ActionBar.t6.f21154p7, org.telegram.messenger.dd.L0(2131745522, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.dd.L0(2131744215, null), org.telegram.messenger.dd.L0(2131745521, null), null);
                    return false;
                }
                f0(org.telegram.ui.ActionBar.t6.f21154p7, org.telegram.messenger.dd.L0(2131745521, null));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.K;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    f0(org.telegram.ui.ActionBar.t6.f21278w6, org.telegram.messenger.dd.a0("SetUrlAvailable", null, 2131745525, str));
                    return true;
                }
                f0(org.telegram.ui.ActionBar.t6.F6, org.telegram.messenger.dd.L0(2131745524, null));
                this.D = str;
                y01 y01Var2 = new y01(9, this, str);
                this.E = y01Var2;
                org.telegram.messenger.i0.h3(y01Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.dd.L0(2131744215, null), org.telegram.messenger.dd.L0(2131745520, null), null);
            return false;
        } else {
            f0(org.telegram.ui.ActionBar.t6.f21154p7, org.telegram.messenger.dd.L0(2131745520, null));
            return false;
        }
    }

    public final void f0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.H;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                org.telegram.ui.ActionBar.a7.a0(this.d, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.t6.f20893b7);
                return;
            } else {
                org.telegram.ui.ActionBar.a7.a0(this.d, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            org.telegram.ui.ActionBar.a7.a0(this.d, getParentActivity(), 2131231232, org.telegram.ui.ActionBar.t6.f20893b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39776a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39776a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20900be));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20919ce));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39779f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20898bc));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.at.M2);
        getNotificationCenter().c(this, org.telegram.messenger.at.N2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.M2);
        getNotificationCenter().n(this, org.telegram.messenger.at.N2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.wp.d1().getBoolean("view_animations", true) && this.H) {
            this.f39776a.requestFocus();
            org.telegram.messenger.i0.J3(this.f39776a);
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f39777b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f39776a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.t6.G6, null);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.H) {
            this.f39776a.requestFocus();
            org.telegram.messenger.i0.J3(this.f39776a);
        }
    }
}
