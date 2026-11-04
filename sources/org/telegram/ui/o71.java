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
public final class o71 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public String E;
    public qv0 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.j6 J;
    public final org.telegram.ui.ActionBar.g6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f48219a;
    public EditTextBoldCursor f48220b;
    public org.telegram.ui.ActionBar.q0 f48221c;
    public org.telegram.ui.Cells.y8 d;
    public org.telegram.ui.Cells.y8 f48222e;
    public org.telegram.ui.Cells.z9 f48223f;
    public org.telegram.ui.Cells.v9 h;
    public org.telegram.ui.Cells.y8 f48224n;
    public org.telegram.ui.ActionBar.s1 f48225r;
    public org.telegram.ui.Cells.n4 f48226s;
    public EditTextBoldCursor f48227w;
    public LinearLayout f48228x;
    public int f48229y;

    public o71(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i3;
        this.J = j6Var;
        this.K = g6Var;
        if (g6Var != null) {
            tL_theme = g6Var.f27540r;
        } else {
            tL_theme = j6Var.G;
        }
        this.L = tL_theme;
        if (g6Var != null) {
            i3 = g6Var.f27542t;
        } else {
            i3 = j6Var.F;
        }
        this.currentAccount = i3;
        this.I = z10;
    }

    public static void Z(o71 o71Var, int i3) {
        ConnectionsManager.getInstance(o71Var.currentAccount).cancelRequest(i3, true);
    }

    public static void a0(o71 o71Var, TLRPC.TL_theme tL_theme) {
        try {
            o71Var.f48225r.dismiss();
            o71Var.f48225r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.k6.I1(o71Var.J, o71Var.K, tL_theme, o71Var.currentAccount, false);
        o71Var.finishFragment();
    }

    public static void b0(o71 o71Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            o71Var.f48225r.dismiss();
            o71Var.f48225r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.t4.e0(o71Var.currentAccount, tL_error, o71Var, updatetheme, new Object[0]);
    }

    public static void c0(o71 o71Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        o71Var.f48229y = ConnectionsManager.getInstance(o71Var.currentAccount).sendRequest(createtheme, new m21(4, o71Var, str), 2);
    }

    public static void d0(o71 o71Var) {
        org.telegram.ui.ActionBar.j6 j6Var = o71Var.J;
        TLRPC.TL_theme tL_theme = o71Var.L;
        if (!o71Var.e0(o71Var.f48219a.getText().toString(), true) || o71Var.getParentActivity() == null) {
            return;
        }
        if (o71Var.f48220b.length() == 0) {
            org.telegram.ui.Components.t4.t0(o71Var, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131744187, null), null);
        } else if (o71Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, o71Var.getParentActivity(), null);
            o71Var.f48225r = s1Var;
            s1Var.setOnCancelListener(new Object());
            o71Var.f48225r.show();
            String obj = o71Var.f48220b.getText().toString();
            tL_theme.title = obj;
            j6Var.f27675a = obj;
            j6Var.G.slug = o71Var.f48219a.getText().toString();
            org.telegram.ui.ActionBar.k6.x1(j6Var, true, true, true);
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
            String obj2 = o71Var.f48219a.getText().toString();
            String obj3 = o71Var.f48220b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                o71Var.finishFragment();
                return;
            }
            o71Var.f48225r = new org.telegram.ui.ActionBar.s1(3, o71Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f27072id = tL_theme.f27140id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i3 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i3 | 3;
            int sendRequest = ConnectionsManager.getInstance(o71Var.currentAccount).sendRequest(updatetheme, new m21(5, o71Var, updatetheme), 2);
            ConnectionsManager.getInstance(o71Var.currentAccount).bindRequestToGuid(sendRequest, o71Var.classGuid);
            o71Var.f48225r.setOnCancelListener(new ci.b0(o71Var, sendRequest, 8));
            o71Var.f48225r.show();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27943gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28295zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28277yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28126qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28106pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28182tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28163sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28144rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28086ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28181ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28143ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28234w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28102p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        int i3;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748260, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131751219, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 15));
        this.f48221c = this.actionBar.q().e(1, org.telegram.messenger.bd.M0(2131751355, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new fi.a(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f48228x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f48228x;
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.r6.i(i10, linearLayout4, null);
        linearLayout2.addView(this.f48228x, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f48226s = n4Var;
        n4Var.setText(org.telegram.messenger.bd.M0(2131749205, null));
        this.f48228x.addView(this.f48226s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f48220b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f48220b;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f48220b;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor3, i12, null);
        this.f48220b.setMaxLines(1);
        this.f48220b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f48220b;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        editTextBoldCursor4.setGravity(i3 | 16);
        this.f48220b.setBackgroundDrawable(null);
        this.f48220b.setPadding(0, 0, 0, 0);
        this.f48220b.setSingleLine(true);
        this.f48220b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f48220b.setInputType(163872);
        this.f48220b.setImeOptions(6);
        this.f48220b.setHint(org.telegram.messenger.bd.M0(2131744186, null));
        org.telegram.ui.ActionBar.r6.w(this.f48220b, i12, null);
        this.f48220b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f48220b.setCursorWidth(1.5f);
        this.f48228x.addView(this.f48220b, b8.mf.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f48220b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final o71 f47559b;

            {
                this.f47559b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (r2) {
                    case 0:
                        o71 o71Var = this.f47559b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(o71Var.f48220b);
                            return true;
                        }
                        o71Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (q0Var = this.f47559b.f48221c) != null) {
                            q0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f48228x.addView(new org.telegram.ui.Components.sm(context, 27), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f48228x.addView(linearLayout5, b8.mf.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f48227w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().V2 + "/addtheme/");
        this.f48227w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.f48227w, i11, null);
        org.telegram.ui.ActionBar.r6.V(this.f48227w, i12, null);
        this.f48227w.setMaxLines(1);
        this.f48227w.setLines(1);
        this.f48227w.setEnabled(false);
        this.f48227w.setBackgroundDrawable(null);
        this.f48227w.setPadding(0, 0, 0, 0);
        this.f48227w.setSingleLine(true);
        this.f48227w.setInputType(163840);
        this.f48227w.setImeOptions(6);
        linearLayout5.addView(this.f48227w, b8.mf.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f48219a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.f48219a, i11, null);
        org.telegram.ui.ActionBar.r6.V(this.f48219a, i12, null);
        this.f48219a.setMaxLines(1);
        this.f48219a.setLines(1);
        this.f48219a.setBackgroundDrawable(null);
        this.f48219a.setPadding(0, 0, 0, 0);
        this.f48219a.setSingleLine(true);
        this.f48219a.setInputType(163872);
        this.f48219a.setImeOptions(6);
        this.f48219a.setHint(org.telegram.messenger.bd.M0(2131745511, null));
        org.telegram.ui.ActionBar.r6.w(this.f48219a, i12, null);
        this.f48219a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f48219a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f48219a, b8.mf.o(-1, 50));
        this.f48219a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final o71 f47559b;

            {
                this.f47559b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (r2) {
                    case 0:
                        o71 o71Var = this.f47559b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(o71Var.f48220b);
                            return true;
                        }
                        o71Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (q0Var = this.f47559b.f48221c) != null) {
                            q0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f48219a.addTextChangedListener(new n0(this, 16));
        if (z10) {
            this.f48219a.setOnFocusChangeListener(new ed(this, 11));
        }
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.f48222e = y8Var;
        int i13 = org.telegram.ui.ActionBar.k6.f27843b7;
        org.telegram.ui.ActionBar.r6.a0(y8Var, context, 2131231230, i13);
        this.f48222e.setVisibility(8);
        this.f48222e.setBottomPadding(0);
        linearLayout2.addView(this.f48222e, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
        this.d = y8Var2;
        y8Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.r6.D(this.d.getTextView(), org.telegram.ui.ActionBar.k6.K6, null);
        if (z10) {
            this.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744195, null)));
        } else {
            org.telegram.ui.Cells.y8 y8Var3 = this.d;
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744154, null));
            this.H = X2;
            y8Var3.setText(X2);
        }
        linearLayout2.addView(this.d, b8.mf.o(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.r6.a0(this.d, context, 2131231229, i13);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f48223f = z9Var;
            linearLayout2.addView(z9Var, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
            this.h = v9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27972i6);
            v9Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(v9Var, N0, N, N2, null);
            this.h.b(org.telegram.messenger.bd.M0(2131743809, null), false);
            linearLayout2.addView(this.h, b8.mf.o(-1, -2));
            this.h.setOnClickListener(new hb0(20, this, context));
            org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context);
            this.f48224n = y8Var4;
            y8Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131743808, null)));
            org.telegram.ui.ActionBar.r6.a0(this.f48224n, context, 2131231230, i13);
            linearLayout2.addView(this.f48224n, b8.mf.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.r6.a0(this.d, context, 2131231230, i13);
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f48220b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f48220b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f48219a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f48219a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.s1 s1Var;
        org.telegram.ui.ActionBar.s1 s1Var2;
        int i11 = org.telegram.messenger.hs.M2;
        org.telegram.ui.ActionBar.g6 g6Var = this.K;
        org.telegram.ui.ActionBar.j6 j6Var = this.J;
        if (i3 == i11) {
            org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (j6Var2 == j6Var && g6Var2 == g6Var && (s1Var2 = this.f48225r) != null) {
                try {
                    s1Var2.dismiss();
                    this.f48225r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.k6.u(j6Var, true, false);
                finishFragment();
            }
        } else if (i3 == org.telegram.messenger.hs.N2) {
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (j6Var3 == j6Var && g6Var3 == g6Var && (s1Var = this.f48225r) != null) {
                try {
                    s1Var.dismiss();
                    this.f48225r = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final boolean e0(String str, boolean z10) {
        qv0 qv0Var = this.F;
        if (qv0Var != null) {
            org.telegram.messenger.g0.r(qv0Var);
            this.F = null;
            this.E = null;
            if (this.f48229y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f48229y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    if (i3 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.t4.t0(this, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131745512, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.k6.f28102p7, org.telegram.messenger.bd.M0(2131745512, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.t4.t0(this, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131745515, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.k6.f28102p7, org.telegram.messenger.bd.M0(2131745515, null));
                        return false;
                    }
                }
            } else {
                f0(org.telegram.ui.ActionBar.k6.f28102p7, org.telegram.messenger.bd.M0(2131745515, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.t4.t0(this, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131745514, null), null);
                    return false;
                }
                f0(org.telegram.ui.ActionBar.k6.f28102p7, org.telegram.messenger.bd.M0(2131745514, null));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    f0(org.telegram.ui.ActionBar.k6.f28234w6, org.telegram.messenger.bd.a0("SetUrlAvailable", null, 2131745518, str));
                    return true;
                }
                f0(org.telegram.ui.ActionBar.k6.F6, org.telegram.messenger.bd.M0(2131745517, null));
                this.E = str;
                qv0 qv0Var2 = new qv0(20, this, str);
                this.F = qv0Var2;
                org.telegram.messenger.g0.i3(qv0Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.t4.t0(this, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131745513, null), null);
            return false;
        } else {
            f0(org.telegram.ui.ActionBar.k6.f28102p7, org.telegram.messenger.bd.M0(2131745513, null));
            return false;
        }
    }

    public final void f0(int i3, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.f48222e.setVisibility(8);
            if (z10) {
                org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.k6.f27843b7);
                return;
            } else {
                org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
                return;
            }
        }
        this.f48222e.setVisibility(0);
        this.f48222e.setText(str);
        this.f48222e.setTag(Integer.valueOf(i3));
        this.f48222e.setTextColorByKey(i3);
        if (z10) {
            org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.k6.f27843b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48219a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28007k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48219a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28026l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27850be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27942gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48223f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848bc));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.hs.N2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.hs.N2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.hp.e1().getBoolean("view_animations", true) && this.I) {
            this.f48219a.requestFocus();
            org.telegram.messenger.g0.K3(this.f48219a);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f48220b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f48219a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f48219a.requestFocus();
            org.telegram.messenger.g0.K3(this.f48219a);
        }
    }
}
