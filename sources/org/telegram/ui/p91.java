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
public final class p91 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public String D;
    public t11 E;
    public boolean F;
    public SpannableStringBuilder G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.s6 I;
    public final org.telegram.ui.ActionBar.r6 J;
    public final TLRPC.TL_theme K;
    public EditTextBoldCursor f40542a;
    public EditTextBoldCursor f40543b;
    public org.telegram.ui.ActionBar.t0 f40544c;
    public org.telegram.ui.Cells.b9 d;
    public org.telegram.ui.Cells.b9 e;
    public org.telegram.ui.Cells.z9 f40545f;
    public org.telegram.ui.Cells.x9 h;
    public org.telegram.ui.Cells.b9 f40546n;
    public org.telegram.ui.ActionBar.x1 f40547r;
    public org.telegram.ui.Cells.p4 f40548s;
    public EditTextBoldCursor f40549w;
    public LinearLayout f40550x;
    public int f40551y;

    public p91(org.telegram.ui.ActionBar.s6 s6Var, org.telegram.ui.ActionBar.r6 r6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.I = s6Var;
        this.J = r6Var;
        if (r6Var != null) {
            tL_theme = r6Var.f20744r;
        } else {
            tL_theme = s6Var.F;
        }
        this.K = tL_theme;
        if (r6Var != null) {
            i10 = r6Var.f20746t;
        } else {
            i10 = s6Var.E;
        }
        this.currentAccount = i10;
        this.H = z10;
    }

    public static void Z(p91 p91Var, TLRPC.TL_theme tL_theme) {
        try {
            p91Var.f40547r.dismiss();
            p91Var.f40547r = null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.ActionBar.t6.I1(p91Var.I, p91Var.J, tL_theme, p91Var.currentAccount, false);
        p91Var.finishFragment();
    }

    public static void a0(p91 p91Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            p91Var.f40547r.dismiss();
            p91Var.f40547r = null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.Components.s4.e0(p91Var.currentAccount, tL_error, p91Var, updatetheme, new Object[0]);
    }

    public static void b0(p91 p91Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        p91Var.f40551y = ConnectionsManager.getInstance(p91Var.currentAccount).sendRequest(createtheme, new ul0(15, p91Var, str), 2);
    }

    public static void c0(p91 p91Var) {
        org.telegram.ui.ActionBar.s6 s6Var = p91Var.I;
        TLRPC.TL_theme tL_theme = p91Var.K;
        if (!p91Var.d0(p91Var.f40542a.getText().toString(), true) || p91Var.getParentActivity() == null) {
            return;
        }
        if (p91Var.f40543b.length() == 0) {
            org.telegram.ui.Components.s4.t0(p91Var, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131744202, null), null);
        } else if (p91Var.H) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, p91Var.getParentActivity(), null);
            p91Var.f40547r = x1Var;
            x1Var.setOnCancelListener(new Object());
            p91Var.f40547r.show();
            String obj = p91Var.f40543b.getText().toString();
            tL_theme.title = obj;
            s6Var.f20801a = obj;
            s6Var.F.slug = p91Var.f40542a.getText().toString();
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
            String obj2 = p91Var.f40542a.getText().toString();
            String obj3 = p91Var.f40543b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                p91Var.finishFragment();
                return;
            }
            p91Var.f40547r = new org.telegram.ui.ActionBar.x1(3, p91Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f19864id = tL_theme.f19932id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(p91Var.currentAccount).sendRequest(updatetheme, new ul0(16, p91Var, updatetheme), 2);
            ConnectionsManager.getInstance(p91Var.currentAccount).bindRequestToGuid(sendRequest, p91Var.classGuid);
            p91Var.f40547r.setOnCancelListener(new ba(p91Var, sendRequest, 8));
            p91Var.f40547r.show();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20990gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21316yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21174qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21156pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21228tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21209sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21191rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21139ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21227ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21190ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21277w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21153p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.H;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748269, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131751219, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 5));
        this.f40544c = this.actionBar.p().e(1, org.telegram.messenger.cd.L0(2131751355, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f40550x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f40550x;
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.a7.i(i11, linearLayout4, null);
        linearLayout2.addView(this.f40550x, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, 23);
        this.f40548s = p4Var;
        p4Var.setText(org.telegram.messenger.cd.L0(2131749206, null));
        this.f40550x.addView(this.f40548s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f40543b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f40543b;
        int i12 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f40543b;
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor3, i13, null);
        this.f40543b.setMaxLines(1);
        this.f40543b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f40543b;
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f40543b.setBackgroundDrawable(null);
        this.f40543b.setPadding(0, 0, 0, 0);
        this.f40543b.setSingleLine(true);
        this.f40543b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f40543b.setInputType(163872);
        this.f40543b.setImeOptions(6);
        this.f40543b.setHint(org.telegram.messenger.cd.L0(2131744201, null));
        org.telegram.ui.ActionBar.a7.w(this.f40543b, i13, null);
        this.f40543b.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.f40543b.setCursorWidth(1.5f);
        this.f40550x.addView(this.f40543b, w7.b6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f40543b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final p91 f39884b;

            {
                this.f39884b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.t0 t0Var;
                switch (r2) {
                    case 0:
                        p91 p91Var = this.f39884b;
                        if (i14 == 6) {
                            org.telegram.messenger.i0.v1(p91Var.f40543b);
                            return true;
                        }
                        p91Var.getClass();
                        return false;
                    default:
                        if (i14 == 6 && (t0Var = this.f39884b.f40544c) != null) {
                            t0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f40550x.addView(new org.telegram.ui.Components.bn(context, 23), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f40550x.addView(linearLayout5, w7.b6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f40549w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().U2 + "/addtheme/");
        this.f40549w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.f40549w, i12, null);
        org.telegram.ui.ActionBar.a7.V(this.f40549w, i13, null);
        this.f40549w.setMaxLines(1);
        this.f40549w.setLines(1);
        this.f40549w.setEnabled(false);
        this.f40549w.setBackgroundDrawable(null);
        this.f40549w.setPadding(0, 0, 0, 0);
        this.f40549w.setSingleLine(true);
        this.f40549w.setInputType(163840);
        this.f40549w.setImeOptions(6);
        linearLayout5.addView(this.f40549w, w7.b6.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f40542a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.f40542a, i12, null);
        org.telegram.ui.ActionBar.a7.V(this.f40542a, i13, null);
        this.f40542a.setMaxLines(1);
        this.f40542a.setLines(1);
        this.f40542a.setBackgroundDrawable(null);
        this.f40542a.setPadding(0, 0, 0, 0);
        this.f40542a.setSingleLine(true);
        this.f40542a.setInputType(163872);
        this.f40542a.setImeOptions(6);
        this.f40542a.setHint(org.telegram.messenger.cd.L0(2131745518, null));
        org.telegram.ui.ActionBar.a7.w(this.f40542a, i13, null);
        this.f40542a.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.f40542a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f40542a, w7.b6.o(-1, 50));
        this.f40542a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final p91 f39884b;

            {
                this.f39884b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.t0 t0Var;
                switch (r2) {
                    case 0:
                        p91 p91Var = this.f39884b;
                        if (i14 == 6) {
                            org.telegram.messenger.i0.v1(p91Var.f40543b);
                            return true;
                        }
                        p91Var.getClass();
                        return false;
                    default:
                        if (i14 == 6 && (t0Var = this.f39884b.f40544c) != null) {
                            t0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f40542a.addTextChangedListener(new n0(this, 16));
        if (z10) {
            this.f40542a.setOnFocusChangeListener(new od(this, 11));
        }
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.e = b9Var;
        int i14 = org.telegram.ui.ActionBar.t6.f20892b7;
        org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231231, i14);
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
        this.d = b9Var2;
        b9Var2.getTextView().setMovementMethod(new org.telegram.messenger.e0(3));
        org.telegram.ui.ActionBar.a7.D(this.d.getTextView(), org.telegram.ui.ActionBar.t6.K6, null);
        if (z10) {
            this.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744210, null)));
        } else {
            org.telegram.ui.Cells.b9 b9Var3 = this.d;
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744169, null));
            this.G = W2;
            b9Var3.setText(W2);
        }
        linearLayout2.addView(this.d, w7.b6.o(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.a7.a0(this.d, context, 2131231230, i14);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f40545f = z9Var;
            linearLayout2.addView(z9Var, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.h = x9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21020i6);
            x9Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(x9Var, N0, N, N2, null);
            this.h.b(org.telegram.messenger.cd.L0(2131743825, null), false);
            linearLayout2.addView(this.h, w7.b6.o(-1, -2));
            this.h.setOnClickListener(new rv0(8, this, context));
            org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context);
            this.f40546n = b9Var4;
            b9Var4.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131743824, null)));
            org.telegram.ui.ActionBar.a7.a0(this.f40546n, context, 2131231231, i14);
            linearLayout2.addView(this.f40546n, w7.b6.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.a7.a0(this.d, context, 2131231231, i14);
        }
        TLRPC.TL_theme tL_theme = this.K;
        if (tL_theme != null) {
            this.F = true;
            this.f40543b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f40543b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f40542a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f40542a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.F = false;
        }
        return this.fragmentView;
    }

    public final boolean d0(String str, boolean z10) {
        t11 t11Var = this.E;
        if (t11Var != null) {
            org.telegram.messenger.i0.r(t11Var);
            this.E = null;
            this.D = null;
            if (this.f40551y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f40551y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131745519, null), null);
                            return false;
                        }
                        e0(org.telegram.ui.ActionBar.t6.f21153p7, org.telegram.messenger.cd.L0(2131745519, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131745522, null), null);
                            return false;
                        }
                        e0(org.telegram.ui.ActionBar.t6.f21153p7, org.telegram.messenger.cd.L0(2131745522, null));
                        return false;
                    }
                }
            } else {
                e0(org.telegram.ui.ActionBar.t6.f21153p7, org.telegram.messenger.cd.L0(2131745522, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131745521, null), null);
                    return false;
                }
                e0(org.telegram.ui.ActionBar.t6.f21153p7, org.telegram.messenger.cd.L0(2131745521, null));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.K;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    e0(org.telegram.ui.ActionBar.t6.f21277w6, org.telegram.messenger.cd.a0("SetUrlAvailable", null, 2131745525, str));
                    return true;
                }
                e0(org.telegram.ui.ActionBar.t6.F6, org.telegram.messenger.cd.L0(2131745524, null));
                this.D = str;
                t11 t11Var2 = new t11(8, this, str);
                this.E = t11Var2;
                org.telegram.messenger.i0.h3(t11Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131745520, null), null);
            return false;
        } else {
            e0(org.telegram.ui.ActionBar.t6.f21153p7, org.telegram.messenger.cd.L0(2131745520, null));
            return false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.x1 x1Var;
        org.telegram.ui.ActionBar.x1 x1Var2;
        int i12 = org.telegram.messenger.zs.M2;
        org.telegram.ui.ActionBar.r6 r6Var = this.J;
        org.telegram.ui.ActionBar.s6 s6Var = this.I;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) objArr[0];
            org.telegram.ui.ActionBar.r6 r6Var2 = (org.telegram.ui.ActionBar.r6) objArr[1];
            if (s6Var2 == s6Var && r6Var2 == r6Var && (x1Var2 = this.f40547r) != null) {
                try {
                    x1Var2.dismiss();
                    this.f40547r = null;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                org.telegram.ui.ActionBar.t6.u(s6Var, true, false);
                finishFragment();
            }
        } else if (i10 == org.telegram.messenger.zs.N2) {
            org.telegram.ui.ActionBar.s6 s6Var3 = (org.telegram.ui.ActionBar.s6) objArr[0];
            org.telegram.ui.ActionBar.r6 r6Var3 = (org.telegram.ui.ActionBar.r6) objArr[1];
            if (s6Var3 == s6Var && r6Var3 == r6Var && (x1Var = this.f40547r) != null) {
                try {
                    x1Var.dismiss();
                    this.f40547r = null;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
        }
    }

    public final void e0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.H;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                org.telegram.ui.ActionBar.a7.a0(this.d, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.t6.f20892b7);
                return;
            } else {
                org.telegram.ui.ActionBar.a7.a0(this.d, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.t6.f20892b7);
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            org.telegram.ui.ActionBar.a7.a0(this.d, getParentActivity(), 2131231232, org.telegram.ui.ActionBar.t6.f20892b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40542a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40542a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21076l6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20899be));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20918ce));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40545f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20897bc));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.zs.N2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.zs.N2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.vp.d1().getBoolean("view_animations", true) && this.H) {
            this.f40542a.requestFocus();
            org.telegram.messenger.i0.J3(this.f40542a);
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f40543b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f40542a;
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
            this.f40542a.requestFocus();
            org.telegram.messenger.i0.J3(this.f40542a);
        }
    }
}
