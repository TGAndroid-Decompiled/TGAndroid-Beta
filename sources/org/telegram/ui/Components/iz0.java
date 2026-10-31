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
public final class iz0 extends LinearLayout {
    public float D;
    public final int f27148a;
    public final long f27149b;
    public final org.telegram.ui.ActionBar.p6 f27150c;
    public final ft0 d;
    public final r8 e;
    public final g9 f27151f;
    public final org.telegram.ui.Cells.e6 h;
    public final f6 f27152n;
    public org.telegram.messenger.jj f27153r;
    public boolean f27154s;
    public boolean f27155w;
    public org.telegram.messenger.q20 f27156x;
    public boolean f27157y;

    public iz0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.D = -6.0f;
        this.f27148a = i10;
        this.f27149b = j10;
        this.f27150c = p6Var;
        setOrientation(1);
        org.telegram.ui.w8 w8Var = new org.telegram.ui.w8(this, context, 2);
        w8Var.U(vh.k4.e(null, i10, j10, org.telegram.ui.ActionBar.t6.I.q()));
        ft0 ft0Var = new ft0(context, i10);
        this.d = ft0Var;
        w8Var.addView(ft0Var, w7.b6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new r8((org.telegram.ui.ActionBar.p6) null);
        g9 g9Var = new g9(context);
        this.f27151f = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
        w8Var.addView(g9Var, w7.b6.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(w8Var, w7.b6.r(-1, -2, 7));
        org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, 0, null, p6Var);
        this.h = e6Var;
        EditTextBoldCursor textView = e6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        e6Var.setTextRight(114);
        ImageView e = org.telegram.messenger.z20.e(context, 2131231784);
        org.telegram.ui.ActionBar.a7.t(e, org.telegram.ui.ActionBar.t6.f21311y6, p6Var, PorterDuff.Mode.SRC_IN);
        e6Var.addView(e, w7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        w7.e6.a(e);
        e.setOnClickListener(new db0(textView, 17));
        f6 f6Var = new f6(context, false, true, false);
        this.f27152n = f6Var;
        f6Var.f25986n = false;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.f21170q7, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setGravity(17);
        f6Var.setAllowCancel(true);
        f6Var.setScaleProperty(0.6f);
        e6Var.addView(f6Var, w7.b6.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new ag.a1(this, 19));
        addView(e6Var, w7.b6.r(-1, -2, 7));
        ft0Var.setDelegate(new m4.c(16, this, textView));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        int i12;
        String str2;
        org.telegram.ui.ActionBar.z2 z2Var;
        int i13;
        int i14;
        boolean z13;
        int i15;
        org.telegram.ui.ActionBar.z2 z2Var2;
        boolean z14;
        int i16;
        int i17;
        boolean z15;
        int i18;
        int i19 = i10;
        boolean z16 = z11;
        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i19).L0(Long.valueOf(-j10));
        if (L0 == null) {
            return;
        }
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var2, true);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        k10.N = f7;
        if (z16) {
            i11 = -6988581;
        } else if (z10) {
            i11 = -12539616;
        } else {
            i11 = -6905171;
        }
        g9 g9Var = new g9(context);
        g9Var.setImageResource(2131231619);
        g9Var.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(80.0f), i11));
        f7.addView(g9Var, w7.b6.t(80, 80, 49, 0, 18, 0, 0));
        int i20 = org.telegram.ui.ActionBar.t6.G6;
        TextView b10 = w7.g6.b(context, 20.0f, i20, true, null);
        b10.setGravity(17);
        if (z16) {
            i12 = 2131744303;
        } else if (z10) {
            i12 = 2131744311;
        } else {
            i12 = 2131744305;
        }
        b10.setText(org.telegram.messenger.cd.L0(i12, null));
        f7.addView(b10, w7.b6.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = w7.g6.b(context, 14.0f, i20, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(org.telegram.messenger.i0.L(3.0f), 1.0f);
        if (str == null) {
            if (z16) {
                i18 = 2131752207;
            } else if (!z10) {
                str2 = "";
            } else {
                i18 = 2131752208;
            }
            str2 = org.telegram.messenger.cd.L0(i18, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z16 || z10) {
            z2Var = k10;
            if (z16) {
                i13 = -6988581;
            } else {
                i13 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, i13));
            spannableStringBuilder.setSpan(new dz0(i13, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            z2Var = k10;
            spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.f20899be, null), 0, spannableStringBuilder.length(), 33);
        }
        if (z16) {
            i14 = 2131744304;
        } else if (z10) {
            i14 = 2131744312;
        } else {
            i14 = 2131744306;
        }
        int i21 = 2;
        b11.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, i14, org.telegram.messenger.h20.j(user, true), L0.title)), spannableStringBuilder, "un1"));
        f7.addView(b11, w7.b6.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        f7.addView(linearLayout, w7.b6.t(-1, -2, 7, 16, 0, 16, 16));
        int i22 = 0;
        while (i22 < i21) {
            ?? q1Var = new org.telegram.ui.Cells.q1(context, i19);
            if (i22 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            q1Var.setDelegate(new fz0(z14, z16));
            gz0 gz0Var = new gz0(context, p6Var2, q1Var);
            gz0Var.U(vh.k4.e(null, i19, j10, org.telegram.ui.ActionBar.t6.I.q()));
            gz0Var.addView((View) q1Var, w7.b6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            if (i22 == 1) {
                i16 = 6;
            } else {
                i16 = 0;
            }
            if (i22 == 0) {
                i17 = 6;
            } else {
                i17 = 0;
            }
            linearLayout.addView(gz0Var, w7.b6.q(0, -1, 1.0f, 119, i16, 0, i17, 0));
            gz0Var.setClipToOutline(true);
            gz0Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.from_id = org.telegram.messenger.vp.r1(i19).y1(user.f19942id);
            tL_message.peer_id = org.telegram.messenger.vp.r1(i19).y1(j10);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i19).getCurrentTime();
            tL_message.out = false;
            org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(i19, tL_message, true, false);
            jjVar.f16336j2 = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new hz0(org.telegram.messenger.i0.L(200.0f)), 0, 1, 33);
            i21 = 2;
            spannableStringBuilder2.setSpan(new hz0(org.telegram.messenger.i0.L(160.0f)), 2, 3, 33);
            jjVar.v = spannableStringBuilder2;
            q1Var.f22532d6 = true;
            if (org.telegram.messenger.w3.T(L0) && L0.megagroup) {
                z15 = true;
            } else {
                z15 = false;
            }
            q1Var.f22593i6 = z15;
            jjVar.n0(null);
            q1Var.s3(jjVar, null, false, false, false, false);
            q1Var.setTranslationX(-org.telegram.messenger.i0.L(140.0f));
            i22++;
            i19 = i10;
            z16 = z11;
            p6Var2 = p6Var;
        }
        vh.d i23 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        if ((org.telegram.messenger.w3.w(25, L0) && (!z10 || ((!z11 && z12) || org.telegram.messenger.h20.B(user)))) || (org.telegram.messenger.w3.h(L0) && org.telegram.messenger.h20.B(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !org.telegram.messenger.w3.w(25, L0) && !L0.creator && L0.admin_rights == null && !z11) {
            TextView b12 = w7.g6.b(context, 12.0f, org.telegram.ui.ActionBar.t6.f21311y6, false, null);
            org.telegram.messenger.m5.l(b12, 1, null, 2131752563);
            f7.addView(b12, w7.b6.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        f7.addView(i23, w7.b6.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            i23.setText(rh.e4.g2(org.telegram.messenger.cd.L0(2131743913, null)));
            org.telegram.ui.ActionBar.z2 z2Var3 = z2Var;
            i23.setOnClickListener(new sr(17, z2Var3, zArr));
            z2Var2 = z2Var3;
        } else {
            final org.telegram.ui.ActionBar.z2 z2Var4 = z2Var;
            if (org.telegram.messenger.h20.B(user)) {
                if (TextUtils.isEmpty(str)) {
                    i15 = 2131744310;
                } else {
                    i15 = 2131744308;
                }
            } else if (TextUtils.isEmpty(str)) {
                i15 = 2131744309;
            } else {
                i15 = 2131744307;
            }
            i23.setText(org.telegram.messenger.cd.L0(i15, null));
            z2Var2 = z2Var4;
            i23.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.z2.this.dismiss();
                    iz0.c(context, i10, j10, user, str, z10, z11, p6Var);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        org.telegram.messenger.vp.d1().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            });
        }
        z2Var2.P0 = true;
        z2Var2.w0(org.telegram.ui.ActionBar.t6.f20929d6);
        z2Var2.o(new uo0(zArr, 16));
        if (org.telegram.messenger.vp.d1().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i10, j10, user, str, z10, z11, p6Var);
        } else {
            z2Var2.show();
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        boolean z12;
        int i11;
        String str2;
        String a02;
        boolean z13;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        r12.L0(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, true);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        k10.N = f7;
        LinearLayout linearLayout = new LinearLayout(context);
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        TextView b10 = w7.g6.b(context, 20.0f, i12, true, null);
        b10.setText(org.telegram.messenger.cd.L0(2131748642, null));
        linearLayout.addView(b10, w7.b6.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231270);
        org.telegram.ui.ActionBar.a7.t(imageView, i12, p6Var, PorterDuff.Mode.SRC_IN);
        int i13 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 1, org.telegram.messenger.i0.L(18.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        linearLayout.addView(imageView, w7.b6.t(32, 32, 21, 0, 0, 10, 0));
        f7.addView(linearLayout, w7.b6.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final vh.d i14 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        if (TextUtils.isEmpty(str) && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(str) && !z10 && z12) {
            i11 = 2131748647;
        } else if (z12) {
            i11 = 2131748648;
        } else {
            i11 = 2131748649;
        }
        i14.setText(org.telegram.messenger.cd.L0(i11, null));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        final boolean z14 = z12;
        iz0 iz0Var = new iz0(i10, j10, context, p6Var);
        iz0Var.setClipToOutline(true);
        iz0Var.setOutlineProvider(new ViewOutlineProvider());
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, iz0Var, p6Var);
        iz0Var.a(user, str, z10, z11, new org.telegram.messenger.q20() {
            @Override
            public final void a(Object obj) {
                int i15;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z15 = z14;
                if (isEmpty && !z10 && z15) {
                    i15 = 2131748647;
                } else if (z15) {
                    i15 = 2131748648;
                } else {
                    i15 = 2131748649;
                }
                i14.i(org.telegram.messenger.cd.L0(i15, null), true, true);
            }
        });
        f7.addView(iz0Var, w7.b6.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(22, context, p6Var);
        if (org.telegram.messenger.h20.B(user)) {
            a02 = org.telegram.messenger.cd.L0(2131748644, null);
        } else {
            a02 = org.telegram.messenger.cd.a0(null, null, 2131748643, org.telegram.messenger.h20.p(user));
        }
        b9Var.setText(a02);
        f7.addView(b9Var, w7.b6.t(-1, -2, 7, 0, 0, 0, 0));
        f7.addView(i14, w7.b6.t(-1, 48, 7, 14, 19, 14, 12));
        k10.P0 = true;
        k10.w0(org.telegram.ui.ActionBar.t6.f20872a7);
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        i14.setOnClickListener(new yy0(i14, iz0Var, r12, j10, user, strArr, i10, k10, z13, p6Var));
        imageView.setOnClickListener(new y2(k10, 3));
        k10.show();
        EditTextBoldCursor textView = iz0Var.h.getTextView();
        textView.post(new ot(textView, 8));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, org.telegram.messenger.q20 q20Var) {
        boolean z12;
        boolean z13;
        int i10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i11 = this.f27148a;
        tL_message.from_id = org.telegram.messenger.vp.r1(i11).y1(user.f19942id);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i11);
        long j10 = this.f27149b;
        tL_message.peer_id = r12.y1(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
        tL_message.out = false;
        this.f27154s = z10;
        this.f27155w = z11;
        org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(i11, tL_message, true, false);
        this.f27153r = jjVar;
        jjVar.f16336j2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = org.telegram.messenger.i0.f16026q;
        spannableStringBuilder.setSpan(new hz0((int) Math.min(point.x * 0.5f, org.telegram.messenger.i0.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new hz0((int) Math.min(point.x * 0.44f, org.telegram.messenger.i0.L(160.0f))), 2, 3, 33);
        this.f27153r.v = spannableStringBuilder;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-j10));
        if (L0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ft0 ft0Var = this.d;
        ft0Var.f22532d6 = z12;
        if (org.telegram.messenger.w3.T(L0) && L0.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        ft0Var.f22593i6 = z13;
        this.f27153r.n0(null);
        ft0Var.s3(this.f27153r, null, false, false, false, false);
        r8 r8Var = this.e;
        r8Var.r(user);
        this.f27151f.e(user, r8Var);
        this.f27156x = q20Var;
        this.f27157y = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i10 = 2131748646;
        } else {
            i10 = 2131748645;
        }
        this.h.n(str, org.telegram.messenger.cd.L0(i10, null), false);
        this.f27157y = false;
    }
}
