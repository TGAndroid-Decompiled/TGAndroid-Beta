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
public final class oy0 extends LinearLayout {
    public float E;
    public final int f38278a;
    public final long f38279b;
    public final org.telegram.ui.ActionBar.i6 f38280c;
    public final qs0 d;
    public final a9 f38281e;
    public final p9 f38282f;
    public final org.telegram.ui.Cells.a6 h;
    public final n6 f38283n;
    public org.telegram.messenger.fj f38284r;
    public boolean f38285s;
    public boolean f38286w;
    public org.telegram.messenger.w10 f38287x;
    public boolean f38288y;

    public oy0(int i7, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.E = -6.0f;
        this.f38278a = i7;
        this.f38279b = j3;
        this.f38280c = i6Var;
        setOrientation(1);
        org.telegram.ui.w8 w8Var = new org.telegram.ui.w8(2, context, this);
        w8Var.U(hi.f6.e(null, i7, j3, org.telegram.ui.ActionBar.n6.I.q()));
        qs0 qs0Var = new qs0(context, i7);
        this.d = qs0Var;
        w8Var.addView(qs0Var, c8.na.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.f38281e = new a9((org.telegram.ui.ActionBar.i6) null);
        p9 p9Var = new p9(context);
        this.f38282f = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        w8Var.addView(p9Var, c8.na.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(w8Var, c8.na.r(-1, -2, 7));
        org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, 0, null, i6Var);
        this.h = a6Var;
        EditTextBoldCursor textView = a6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        a6Var.setTextRight(114);
        ImageView e10 = org.telegram.messenger.m10.e(context, 2131231789);
        org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.f29843y6, i6Var, PorterDuff.Mode.SRC_IN);
        a6Var.addView(e10, c8.na.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        c8.sa.a(e10);
        e10.setOnClickListener(new h(textView, 1));
        n6 n6Var = new n6(context, false, true, false);
        this.f38283n = n6Var;
        n6Var.f37685n = false;
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.f29692q7, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setGravity(17);
        n6Var.setAllowCancel(true);
        n6Var.setScaleProperty(0.6f);
        a6Var.addView(n6Var, c8.na.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new ah.j(this, 27));
        addView(a6Var, c8.na.r(-1, -2, 7));
        qs0Var.setDelegate(new jb.m(this, textView, false, 17));
    }

    public static void b(final Context context, final int i7, final long j3, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        int i11;
        String str2;
        org.telegram.ui.ActionBar.w2 w2Var;
        int i12;
        int i13;
        boolean z13;
        int i14;
        org.telegram.ui.ActionBar.w2 w2Var2;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        int i17;
        int i18 = i7;
        boolean z16 = z11;
        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i18).O0(Long.valueOf(-j3));
        if (O0 == null) {
            return;
        }
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, i6Var2, true);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        j10.O = g10;
        if (z16) {
            i10 = -6988581;
        } else if (z10) {
            i10 = -12539616;
        } else {
            i10 = -6905171;
        }
        p9 p9Var = new p9(context);
        p9Var.setImageResource(2131231622);
        p9Var.setBackground(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(80.0f), i10));
        g10.addView(p9Var, c8.na.t(80, 80, 49, 0, 18, 0, 0));
        int i19 = org.telegram.ui.ActionBar.n6.G6;
        TextView b10 = c8.wa.b(context, 20.0f, i19, true, null);
        b10.setGravity(17);
        if (z16) {
            i11 = 2131744032;
        } else if (z10) {
            i11 = 2131744040;
        } else {
            i11 = 2131744034;
        }
        b10.setText(org.telegram.messenger.gd.N0(i11, null));
        g10.addView(b10, c8.na.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = c8.wa.b(context, 14.0f, i19, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (str == null) {
            if (z16) {
                i17 = 2131752195;
            } else if (!z10) {
                str2 = "";
            } else {
                i17 = 2131752196;
            }
            str2 = org.telegram.messenger.gd.N0(i17, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z16 || z10) {
            w2Var = j10;
            if (z16) {
                i12 = -6988581;
            } else {
                i12 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, i12));
            spannableStringBuilder.setSpan(new jy0(i12, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            w2Var = j10;
            spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.f29477ee, null), 0, spannableStringBuilder.length(), 33);
        }
        if (z16) {
            i13 = 2131744033;
        } else if (z10) {
            i13 = 2131744041;
        } else {
            i13 = 2131744035;
        }
        int i20 = 2;
        b11.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i13, org.telegram.messenger.n10.k(user, true), O0.title)), spannableStringBuilder, "un1"));
        g10.addView(b11, c8.na.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        g10.addView(linearLayout, c8.na.t(-1, -2, 7, 16, 0, 16, 16));
        int i21 = 0;
        while (i21 < i20) {
            ?? r1Var = new org.telegram.ui.Cells.r1(context, i18);
            if (i21 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            r1Var.setDelegate(new ly0(z14, z16));
            my0 my0Var = new my0(context, i6Var2, r1Var);
            my0Var.U(hi.f6.e(null, i18, j3, org.telegram.ui.ActionBar.n6.I.q()));
            my0Var.addView((View) r1Var, c8.na.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            if (i21 == 1) {
                i15 = 6;
            } else {
                i15 = 0;
            }
            if (i21 == 0) {
                i16 = 6;
            } else {
                i16 = 0;
            }
            linearLayout.addView(my0Var, c8.na.q(0, -1, 1.0f, 119, i15, 0, i16, 0));
            my0Var.setClipToOutline(true);
            my0Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.from_id = org.telegram.messenger.mp.u1(i18).B1(user.f28641id);
            tL_message.peer_id = org.telegram.messenger.mp.u1(i18).B1(j3);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i18).getCurrentTime();
            tL_message.out = false;
            org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(i18, tL_message, true, false);
            fjVar.f24080l2 = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new ny0(org.telegram.messenger.g0.L(200.0f)), 0, 1, 33);
            i20 = 2;
            spannableStringBuilder2.setSpan(new ny0(org.telegram.messenger.g0.L(160.0f)), 2, 3, 33);
            fjVar.v = spannableStringBuilder2;
            r1Var.f31478f6 = true;
            if (org.telegram.messenger.v3.T(O0) && O0.megagroup) {
                z15 = true;
            } else {
                z15 = false;
            }
            r1Var.f31543k6 = z15;
            fjVar.n0(null);
            r1Var.y3(fjVar, null, false, false, false, false);
            r1Var.setTranslationX(-org.telegram.messenger.g0.L(140.0f));
            i21++;
            i18 = i7;
            z16 = z11;
            i6Var2 = i6Var;
        }
        hi.e g11 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        if ((org.telegram.messenger.v3.w(25, O0) && (!z10 || ((!z11 && z12) || org.telegram.messenger.n10.C(user)))) || (org.telegram.messenger.v3.h(O0) && org.telegram.messenger.n10.C(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !org.telegram.messenger.v3.w(25, O0) && !O0.creator && O0.admin_rights == null && !z11) {
            TextView b12 = c8.wa.b(context, 12.0f, org.telegram.ui.ActionBar.n6.f29843y6, false, null);
            org.telegram.messenger.f3.k(b12, 1, null, 2131752551);
            g10.addView(b12, c8.na.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        g10.addView(g11, c8.na.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            g11.setText(di.f6.t2(org.telegram.messenger.gd.N0(2131743641, null)));
            org.telegram.ui.ActionBar.w2 w2Var3 = w2Var;
            g11.setOnClickListener(new l8(26, w2Var3, zArr));
            w2Var2 = w2Var3;
        } else {
            final org.telegram.ui.ActionBar.w2 w2Var4 = w2Var;
            if (org.telegram.messenger.n10.C(user)) {
                if (TextUtils.isEmpty(str)) {
                    i14 = 2131744039;
                } else {
                    i14 = 2131744037;
                }
            } else if (TextUtils.isEmpty(str)) {
                i14 = 2131744038;
            } else {
                i14 = 2131744036;
            }
            g11.setText(org.telegram.messenger.gd.N0(i14, null));
            w2Var2 = w2Var4;
            g11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w2.this.dismiss();
                    oy0.c(context, i7, j3, user, str, z10, z11, i6Var);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        org.telegram.messenger.mp.g1().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            });
        }
        w2Var2.Q0 = true;
        w2Var2.w0(org.telegram.ui.ActionBar.n6.f29451d6);
        w2Var2.n(new bp0(zArr, 14));
        if (org.telegram.messenger.mp.g1().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i7, j3, user, str, z10, z11, i6Var);
        } else {
            w2Var2.show();
        }
    }

    public static void c(Context context, int i7, long j3, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var) {
        boolean z12;
        int i10;
        String str2;
        String a02;
        boolean z13;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        u12.O0(Long.valueOf(-j3));
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, true);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        j10.O = g10;
        LinearLayout linearLayout = new LinearLayout(context);
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        TextView b10 = c8.wa.b(context, 20.0f, i11, true, null);
        b10.setText(org.telegram.messenger.gd.N0(2131748434, null));
        linearLayout.addView(b10, c8.na.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231272);
        org.telegram.ui.ActionBar.u6.s(imageView, i11, i6Var, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var);
        linearLayout.addView(imageView, c8.na.t(32, 32, 21, 0, 0, 10, 0));
        g10.addView(linearLayout, c8.na.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final hi.e g11 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        if (TextUtils.isEmpty(str) && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(str) && !z10 && z12) {
            i10 = 2131748439;
        } else if (z12) {
            i10 = 2131748440;
        } else {
            i10 = 2131748441;
        }
        g11.setText(org.telegram.messenger.gd.N0(i10, null));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        final boolean z14 = z12;
        oy0 oy0Var = new oy0(i7, j3, context, i6Var);
        oy0Var.setClipToOutline(true);
        oy0Var.setOutlineProvider(new ViewOutlineProvider());
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, oy0Var, i6Var);
        oy0Var.a(user, str, z10, z11, new org.telegram.messenger.w10() {
            @Override
            public final void a(Object obj) {
                int i13;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z15 = z14;
                if (isEmpty && !z10 && z15) {
                    i13 = 2131748439;
                } else if (z15) {
                    i13 = 2131748440;
                } else {
                    i13 = 2131748441;
                }
                g11.i(org.telegram.messenger.gd.N0(i13, null), true, true);
            }
        });
        g10.addView(oy0Var, c8.na.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(22, context, i6Var);
        if (org.telegram.messenger.n10.C(user)) {
            a02 = org.telegram.messenger.gd.N0(2131748436, null);
        } else {
            a02 = org.telegram.messenger.gd.a0(null, null, 2131748435, org.telegram.messenger.n10.q(user));
        }
        z8Var.setText(a02);
        g10.addView(z8Var, c8.na.t(-1, -2, 7, 0, 0, 0, 0));
        g10.addView(g11, c8.na.t(-1, 48, 7, 14, 19, 14, 12));
        j10.Q0 = true;
        j10.w0(org.telegram.ui.ActionBar.n6.f29394a7);
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        g11.setOnClickListener(new ki.a3(g11, oy0Var, u12, j3, user, strArr, i7, j10, z13, i6Var));
        imageView.setOnClickListener(new e3(j10, 3));
        j10.show();
        EditTextBoldCursor textView = oy0Var.h.getTextView();
        textView.post(new i(textView, 9));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, org.telegram.messenger.w10 w10Var) {
        boolean z12;
        boolean z13;
        int i7;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = this.f38278a;
        tL_message.from_id = org.telegram.messenger.mp.u1(i10).B1(user.f28641id);
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
        long j3 = this.f38279b;
        tL_message.peer_id = u12.B1(j3);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.out = false;
        this.f38285s = z10;
        this.f38286w = z11;
        org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(i10, tL_message, true, false);
        this.f38284r = fjVar;
        fjVar.f24080l2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = org.telegram.messenger.g0.f24226q;
        spannableStringBuilder.setSpan(new ny0((int) Math.min(point.x * 0.5f, org.telegram.messenger.g0.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new ny0((int) Math.min(point.x * 0.44f, org.telegram.messenger.g0.L(160.0f))), 2, 3, 33);
        this.f38284r.v = spannableStringBuilder;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-j3));
        if (O0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        qs0 qs0Var = this.d;
        qs0Var.f31478f6 = z12;
        if (org.telegram.messenger.v3.T(O0) && O0.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        qs0Var.f31543k6 = z13;
        this.f38284r.n0(null);
        qs0Var.y3(this.f38284r, null, false, false, false, false);
        a9 a9Var = this.f38281e;
        a9Var.r(user);
        this.f38282f.f(user, a9Var);
        this.f38287x = w10Var;
        this.f38288y = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i7 = 2131748438;
        } else {
            i7 = 2131748437;
        }
        this.h.o(str, org.telegram.messenger.gd.N0(i7, null), false);
        this.f38288y = false;
    }
}
