package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class gy0 extends LinearLayout {
    public float E;
    public final int f35092a;
    public final long f35093b;
    public final org.telegram.ui.ActionBar.e6 f35094c;
    public final gs0 d;
    public final t8 f35095e;
    public final i9 f35096f;
    public final org.telegram.ui.Cells.z5 h;
    public final h6 f35097n;
    public org.telegram.messenger.gj f35098r;
    public boolean f35099s;
    public boolean f35100w;
    public org.telegram.messenger.z10 f35101x;
    public boolean f35102y;

    public gy0(int i7, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = -6.0f;
        this.f35092a = i7;
        this.f35093b = j3;
        this.f35094c = e6Var;
        setOrientation(1);
        org.telegram.ui.v8 v8Var = new org.telegram.ui.v8(2, context, this);
        v8Var.U(hi.x5.e(null, i7, j3, org.telegram.ui.ActionBar.j6.I.q()));
        gs0 gs0Var = new gs0(context, i7);
        this.d = gs0Var;
        v8Var.addView(gs0Var, c8.ja.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.f35095e = new t8((org.telegram.ui.ActionBar.e6) null);
        i9 i9Var = new i9(context);
        this.f35096f = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        v8Var.addView(i9Var, c8.ja.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(v8Var, c8.ja.r(-1, -2, 7));
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, 0, null, e6Var);
        this.h = z5Var;
        EditTextBoldCursor textView = z5Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        z5Var.setTextRight(114);
        ImageView e10 = org.telegram.messenger.i20.e(context, 2131231785);
        org.telegram.ui.ActionBar.q6.s(e10, org.telegram.ui.ActionBar.j6.f29241y6, e6Var, PorterDuff.Mode.SRC_IN);
        z5Var.addView(e10, c8.ja.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        c8.na.a(e10);
        e10.setOnClickListener(new y60(textView, 17));
        h6 h6Var = new h6(context, false, true, false);
        this.f35097n = h6Var;
        h6Var.f35178n = false;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.f29090q7, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setGravity(17);
        h6Var.setAllowCancel(true);
        h6Var.setScaleProperty(0.6f);
        z5Var.addView(h6Var, c8.ja.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new ah.j(this, 26));
        addView(z5Var, c8.ja.r(-1, -2, 7));
        gs0Var.setDelegate(new k8.a(16, this, textView));
    }

    public static void b(final Context context, final int i7, final long j3, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        String str2;
        org.telegram.ui.ActionBar.u2 u2Var;
        int i12;
        int i13;
        boolean z13;
        int i14;
        org.telegram.ui.ActionBar.u2 u2Var2;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        int i17;
        int i18 = i7;
        boolean z16 = z11;
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(i18).M0(Long.valueOf(-j3));
        if (M0 == null) {
            return;
        }
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var2, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        k10.O = f10;
        if (z16) {
            i10 = -6988581;
        } else if (z10) {
            i10 = -12539616;
        } else {
            i10 = -6905171;
        }
        i9 i9Var = new i9(context);
        i9Var.setImageResource(2131231618);
        i9Var.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(80.0f), i10));
        f10.addView(i9Var, c8.ja.t(80, 80, 49, 0, 18, 0, 0));
        int i19 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = c8.sa.b(context, 20.0f, i19, true, null);
        b10.setGravity(17);
        if (z16) {
            i11 = 2131744277;
        } else if (z10) {
            i11 = 2131744285;
        } else {
            i11 = 2131744279;
        }
        b10.setText(org.telegram.messenger.hd.M0(i11, null));
        f10.addView(b10, c8.ja.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = c8.sa.b(context, 14.0f, i19, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (str == null) {
            if (z16) {
                i17 = 2131752207;
            } else if (!z10) {
                str2 = "";
            } else {
                i17 = 2131752208;
            }
            str2 = org.telegram.messenger.hd.M0(i17, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z16 || z10) {
            u2Var = k10;
            if (z16) {
                i12 = -6988581;
            } else {
                i12 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, i12));
            spannableStringBuilder.setSpan(new by0(i12, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            u2Var = k10;
            spannableStringBuilder.setSpan(new b00(org.telegram.ui.ActionBar.j6.f28875ee, null), 0, spannableStringBuilder.length(), 33);
        }
        if (z16) {
            i13 = 2131744278;
        } else if (z10) {
            i13 = 2131744286;
        } else {
            i13 = 2131744280;
        }
        b11.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i13, org.telegram.messenger.q10.j(user, true), M0.title)), spannableStringBuilder, "un1"));
        f10.addView(b11, c8.ja.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        f10.addView(linearLayout, c8.ja.t(-1, -2, 7, 16, 0, 16, 16));
        int i20 = 0;
        for (int i21 = 2; i20 < i21; i21 = 2) {
            ?? q1Var = new org.telegram.ui.Cells.q1(context, i18);
            if (i20 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            q1Var.setDelegate(new dy0(z14, z16));
            ey0 ey0Var = new ey0(context, e6Var2, q1Var);
            ey0Var.U(hi.x5.e(null, i18, j3, org.telegram.ui.ActionBar.j6.I.q()));
            ey0Var.addView((View) q1Var, c8.ja.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            if (i20 == 1) {
                i15 = 6;
            } else {
                i15 = 0;
            }
            if (i20 == 0) {
                i16 = 6;
            } else {
                i16 = 0;
            }
            linearLayout.addView(ey0Var, c8.ja.q(0, -1, 1.0f, 119, i15, 0, i16, 0));
            ey0Var.setClipToOutline(true);
            ey0Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.from_id = org.telegram.messenger.np.s1(i18).z1(user.f28200id);
            tL_message.peer_id = org.telegram.messenger.np.s1(i18).z1(j3);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i18).getCurrentTime();
            tL_message.out = false;
            org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i18, tL_message, true, false);
            gjVar.f23826l2 = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new fy0(org.telegram.messenger.g0.L(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new fy0(org.telegram.messenger.g0.L(160.0f)), 2, 3, 33);
            gjVar.v = spannableStringBuilder2;
            q1Var.f30975f6 = true;
            if (org.telegram.messenger.t3.T(M0) && M0.megagroup) {
                z15 = true;
            } else {
                z15 = false;
            }
            q1Var.f31040k6 = z15;
            gjVar.n0(null);
            q1Var.x3(gjVar, null, false, false, false, false);
            q1Var.setTranslationX(-org.telegram.messenger.g0.L(140.0f));
            i20++;
            i18 = i7;
            z16 = z11;
            e6Var2 = e6Var;
        }
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        if ((org.telegram.messenger.t3.w(25, M0) && (!z10 || ((!z11 && z12) || org.telegram.messenger.q10.B(user)))) || (org.telegram.messenger.t3.h(M0) && org.telegram.messenger.q10.B(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !org.telegram.messenger.t3.w(25, M0) && !M0.creator && M0.admin_rights == null && !z11) {
            TextView b12 = c8.sa.b(context, 12.0f, org.telegram.ui.ActionBar.j6.f29241y6, false, null);
            org.telegram.messenger.k5.l(b12, 1, null, 2131752563);
            f10.addView(b12, c8.ja.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        f10.addView(g10, c8.ja.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            g10.setText(di.c6.h2(org.telegram.messenger.hd.M0(2131743888, null)));
            org.telegram.ui.ActionBar.u2 u2Var3 = u2Var;
            g10.setOnClickListener(new vv0(2, u2Var3, zArr));
            u2Var2 = u2Var3;
        } else {
            final org.telegram.ui.ActionBar.u2 u2Var4 = u2Var;
            if (org.telegram.messenger.q10.B(user)) {
                if (TextUtils.isEmpty(str)) {
                    i14 = 2131744284;
                } else {
                    i14 = 2131744282;
                }
            } else if (TextUtils.isEmpty(str)) {
                i14 = 2131744283;
            } else {
                i14 = 2131744281;
            }
            g10.setText(org.telegram.messenger.hd.M0(i14, null));
            u2Var2 = u2Var4;
            g10.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.u2.this.dismiss();
                    gy0.c(context, i7, j3, user, str, z10, z11, e6Var);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        org.telegram.messenger.np.e1().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            });
        }
        u2Var2.Q0 = true;
        u2Var2.w0(org.telegram.ui.ActionBar.j6.f28849d6);
        u2Var2.n(new ro0(zArr, 14));
        if (org.telegram.messenger.np.e1().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i7, j3, user, str, z10, z11, e6Var);
        } else {
            u2Var2.show();
        }
    }

    public static void c(Context context, int i7, long j3, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z12;
        int i10;
        String str2;
        String a02;
        boolean z13;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        s12.M0(Long.valueOf(-j3));
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        k10.O = f10;
        LinearLayout linearLayout = new LinearLayout(context);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = c8.sa.b(context, 20.0f, i11, true, null);
        b10.setText(org.telegram.messenger.hd.M0(2131748627, null));
        linearLayout.addView(b10, c8.ja.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        org.telegram.ui.ActionBar.q6.s(imageView, i11, e6Var, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, e6Var), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, e6Var);
        linearLayout.addView(imageView, c8.ja.t(32, 32, 21, 0, 0, 10, 0));
        f10.addView(linearLayout, c8.ja.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        if (TextUtils.isEmpty(str) && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(str) && !z10 && z12) {
            i10 = 2131748632;
        } else if (z12) {
            i10 = 2131748633;
        } else {
            i10 = 2131748634;
        }
        g10.setText(org.telegram.messenger.hd.M0(i10, null));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        final boolean z14 = z12;
        gy0 gy0Var = new gy0(i7, j3, context, e6Var);
        gy0Var.setClipToOutline(true);
        gy0Var.setOutlineProvider(new ViewOutlineProvider());
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, gy0Var, e6Var);
        gy0Var.a(user, str, z10, z11, new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj) {
                int i13;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z15 = z14;
                if (isEmpty && !z10 && z15) {
                    i13 = 2131748632;
                } else if (z15) {
                    i13 = 2131748633;
                } else {
                    i13 = 2131748634;
                }
                g10.i(org.telegram.messenger.hd.M0(i13, null), true, true);
            }
        });
        f10.addView(gy0Var, c8.ja.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(22, context, e6Var);
        if (org.telegram.messenger.q10.B(user)) {
            a02 = org.telegram.messenger.hd.M0(2131748629, null);
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131748628, org.telegram.messenger.q10.p(user));
        }
        y8Var.setText(a02);
        f10.addView(y8Var, c8.ja.t(-1, -2, 7, 0, 0, 0, 0));
        f10.addView(g10, c8.ja.t(-1, 48, 7, 14, 19, 14, 12));
        k10.Q0 = true;
        k10.w0(org.telegram.ui.ActionBar.j6.f28792a7);
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        g10.setOnClickListener(new ki.f3(g10, gy0Var, s12, j3, user, strArr, i7, k10, z13, e6Var));
        imageView.setOnClickListener(new w2(k10, 3));
        k10.show();
        EditTextBoldCursor textView = gy0Var.h.getTextView();
        textView.post(new ht(textView, 8));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, org.telegram.messenger.z10 z10Var) {
        boolean z12;
        boolean z13;
        int i7;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = this.f35092a;
        tL_message.from_id = org.telegram.messenger.np.s1(i10).z1(user.f28200id);
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i10);
        long j3 = this.f35093b;
        tL_message.peer_id = s12.z1(j3);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.out = false;
        this.f35099s = z10;
        this.f35100w = z11;
        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i10, tL_message, true, false);
        this.f35098r = gjVar;
        gjVar.f23826l2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = org.telegram.messenger.g0.f23611q;
        spannableStringBuilder.setSpan(new fy0((int) Math.min(point.x * 0.5f, org.telegram.messenger.g0.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new fy0((int) Math.min(point.x * 0.44f, org.telegram.messenger.g0.L(160.0f))), 2, 3, 33);
        this.f35098r.v = spannableStringBuilder;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-j3));
        if (M0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        gs0 gs0Var = this.d;
        gs0Var.f30975f6 = z12;
        if (org.telegram.messenger.t3.T(M0) && M0.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        gs0Var.f31040k6 = z13;
        this.f35098r.n0(null);
        gs0Var.x3(this.f35098r, null, false, false, false, false);
        t8 t8Var = this.f35095e;
        t8Var.r(user);
        this.f35096f.f(user, t8Var);
        this.f35101x = z10Var;
        this.f35102y = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i7 = 2131748631;
        } else {
            i7 = 2131748630;
        }
        this.h.o(str, org.telegram.messenger.hd.M0(i7, null), false);
        this.f35102y = false;
    }
}
