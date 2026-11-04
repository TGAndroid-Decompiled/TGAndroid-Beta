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
public final class dy0 extends LinearLayout {
    public float E;
    public final int f33208a;
    public final long f33209b;
    public final org.telegram.ui.ActionBar.e6 f33210c;
    public final es0 d;
    public final u8 f33211e;
    public final k9 f33212f;
    public final org.telegram.ui.Cells.z5 h;
    public final h6 f33213n;
    public org.telegram.messenger.zi f33214r;
    public boolean f33215s;
    public boolean f33216w;
    public org.telegram.messenger.u10 f33217x;
    public boolean f33218y;

    public dy0(int i3, long j10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = -6.0f;
        this.f33208a = i3;
        this.f33209b = j10;
        this.f33210c = e6Var;
        setOrientation(1);
        ai.h5 h5Var = new ai.h5(3, context, this);
        h5Var.U(gi.y5.e(null, i3, j10, org.telegram.ui.ActionBar.k6.I.q()));
        es0 es0Var = new es0(context, i3);
        this.d = es0Var;
        h5Var.addView(es0Var, b8.mf.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.f33211e = new u8((org.telegram.ui.ActionBar.e6) null);
        k9 k9Var = new k9(context);
        this.f33212f = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        h5Var.addView(k9Var, b8.mf.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(h5Var, b8.mf.r(-1, -2, 7));
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, 0, null, e6Var);
        this.h = z5Var;
        EditTextBoldCursor textView = z5Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        z5Var.setTextRight(114);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231785);
        org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.f28273y6, e6Var, PorterDuff.Mode.SRC_IN);
        z5Var.addView(e10, b8.mf.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        b8.pf.a(e10);
        e10.setOnClickListener(new ga0(textView, 17));
        h6 h6Var = new h6(context, false, true, false);
        this.f33213n = h6Var;
        h6Var.f34310n = false;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.f28122q7, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setGravity(17);
        h6Var.setAllowCancel(true);
        h6Var.setScaleProperty(0.6f);
        z5Var.addView(h6Var, b8.mf.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new bh.h(this, 24));
        addView(z5Var, b8.mf.r(-1, -2, 7));
        es0Var.setDelegate(new m2.t(13, this, textView));
    }

    public static void b(final Context context, final int i3, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        String str2;
        org.telegram.ui.ActionBar.t2 t2Var;
        int i12;
        int i13;
        boolean z13;
        int i14;
        org.telegram.ui.ActionBar.t2 t2Var2;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        int i17;
        int i18 = i3;
        boolean z16 = z11;
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i18).M0(Long.valueOf(-j10));
        if (M0 == null) {
            return;
        }
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var2, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.O = f10;
        if (z16) {
            i10 = -6988581;
        } else if (z10) {
            i10 = -12539616;
        } else {
            i10 = -6905171;
        }
        k9 k9Var = new k9(context);
        k9Var.setImageResource(2131231618);
        k9Var.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(80.0f), i10));
        f10.addView(k9Var, b8.mf.t(80, 80, 49, 0, 18, 0, 0));
        int i19 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = b8.rf.b(context, 20.0f, i19, true, null);
        b10.setGravity(17);
        if (z16) {
            i11 = 2131744287;
        } else if (z10) {
            i11 = 2131744295;
        } else {
            i11 = 2131744289;
        }
        b10.setText(org.telegram.messenger.bd.M0(i11, null));
        f10.addView(b10, b8.mf.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = b8.rf.b(context, 14.0f, i19, false, null);
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
            str2 = org.telegram.messenger.bd.M0(i17, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z16 || z10) {
            t2Var = l10;
            if (z16) {
                i12 = -6988581;
            } else {
                i12 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i12));
            spannableStringBuilder.setSpan(new yx0(i12, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            t2Var = l10;
            spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.f27850be, null), 0, spannableStringBuilder.length(), 33);
        }
        if (z16) {
            i13 = 2131744288;
        } else if (z10) {
            i13 = 2131744296;
        } else {
            i13 = 2131744290;
        }
        int i20 = 2;
        b11.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, i13, org.telegram.messenger.l10.j(user, true), M0.title)), spannableStringBuilder, "un1"));
        f10.addView(b11, b8.mf.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        f10.addView(linearLayout, b8.mf.t(-1, -2, 7, 16, 0, 16, 16));
        int i21 = 0;
        while (i21 < i20) {
            ?? q1Var = new org.telegram.ui.Cells.q1(context, i18);
            if (i21 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            q1Var.setDelegate(new ay0(z14, z16));
            by0 by0Var = new by0(context, e6Var2, q1Var);
            by0Var.U(gi.y5.e(null, i18, j10, org.telegram.ui.ActionBar.k6.I.q()));
            by0Var.addView((View) q1Var, b8.mf.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
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
            linearLayout.addView(by0Var, b8.mf.q(0, -1, 1.0f, 119, i15, 0, i16, 0));
            by0Var.setClipToOutline(true);
            by0Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.from_id = org.telegram.messenger.hp.s1(i18).z1(user.f27150id);
            tL_message.peer_id = org.telegram.messenger.hp.s1(i18).z1(j10);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i18).getCurrentTime();
            tL_message.out = false;
            org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(i18, tL_message, true, false);
            ziVar.f26866j2 = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new cy0(org.telegram.messenger.g0.L(200.0f)), 0, 1, 33);
            i20 = 2;
            spannableStringBuilder2.setSpan(new cy0(org.telegram.messenger.g0.L(160.0f)), 2, 3, 33);
            ziVar.v = spannableStringBuilder2;
            q1Var.f29900e6 = true;
            if (org.telegram.messenger.t3.T(M0) && M0.megagroup) {
                z15 = true;
            } else {
                z15 = false;
            }
            q1Var.f29964j6 = z15;
            ziVar.n0(null);
            q1Var.u3(ziVar, null, false, false, false, false);
            q1Var.setTranslationX(-org.telegram.messenger.g0.L(140.0f));
            i21++;
            i18 = i3;
            z16 = z11;
            e6Var2 = e6Var;
        }
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        if ((org.telegram.messenger.t3.w(25, M0) && (!z10 || ((!z11 && z12) || org.telegram.messenger.l10.B(user)))) || (org.telegram.messenger.t3.h(M0) && org.telegram.messenger.l10.B(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !org.telegram.messenger.t3.w(25, M0) && !M0.creator && M0.admin_rights == null && !z11) {
            TextView b12 = b8.rf.b(context, 12.0f, org.telegram.ui.ActionBar.k6.f28273y6, false, null);
            org.telegram.messenger.k5.m(b12, 1, null, 2131752563);
            f10.addView(b12, b8.mf.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        f10.addView(h, b8.mf.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            h.setText(ci.l6.g2(org.telegram.messenger.bd.M0(2131743898, null)));
            org.telegram.ui.ActionBar.t2 t2Var3 = t2Var;
            h.setOnClickListener(new ux0(0, (Object) t2Var3, (Object) zArr));
            t2Var2 = t2Var3;
        } else {
            final org.telegram.ui.ActionBar.t2 t2Var4 = t2Var;
            if (org.telegram.messenger.l10.B(user)) {
                if (TextUtils.isEmpty(str)) {
                    i14 = 2131744294;
                } else {
                    i14 = 2131744292;
                }
            } else if (TextUtils.isEmpty(str)) {
                i14 = 2131744293;
            } else {
                i14 = 2131744291;
            }
            h.setText(org.telegram.messenger.bd.M0(i14, null));
            t2Var2 = t2Var4;
            h.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.t2.this.dismiss();
                    dy0.c(context, i3, j10, user, str, z10, z11, e6Var);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        org.telegram.messenger.hp.e1().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            });
        }
        t2Var2.Q0 = true;
        t2Var2.w0(org.telegram.ui.ActionBar.k6.f27878d6);
        t2Var2.n(new sp0(zArr, 13));
        if (org.telegram.messenger.hp.e1().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i3, j10, user, str, z10, z11, e6Var);
        } else {
            t2Var2.show();
        }
    }

    public static void c(Context context, int i3, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z12;
        int i10;
        String str2;
        String a02;
        boolean z13;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        s12.M0(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.O = f10;
        LinearLayout linearLayout = new LinearLayout(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = b8.rf.b(context, 20.0f, i11, true, null);
        b10.setText(org.telegram.messenger.bd.M0(2131748635, null));
        linearLayout.addView(b10, b8.mf.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        org.telegram.ui.ActionBar.r6.t(imageView, i11, e6Var, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var);
        linearLayout.addView(imageView, b8.mf.t(32, 32, 21, 0, 0, 10, 0));
        f10.addView(linearLayout, b8.mf.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        if (TextUtils.isEmpty(str) && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(str) && !z10 && z12) {
            i10 = 2131748640;
        } else if (z12) {
            i10 = 2131748641;
        } else {
            i10 = 2131748642;
        }
        h.setText(org.telegram.messenger.bd.M0(i10, null));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        final boolean z14 = z12;
        dy0 dy0Var = new dy0(i3, j10, context, e6Var);
        dy0Var.setClipToOutline(true);
        dy0Var.setOutlineProvider(new ViewOutlineProvider());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, dy0Var, e6Var);
        dy0Var.a(user, str, z10, z11, new org.telegram.messenger.u10() {
            @Override
            public final void a(Object obj) {
                int i13;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z15 = z14;
                if (isEmpty && !z10 && z15) {
                    i13 = 2131748640;
                } else if (z15) {
                    i13 = 2131748641;
                } else {
                    i13 = 2131748642;
                }
                h.i(org.telegram.messenger.bd.M0(i13, null), true, true);
            }
        });
        f10.addView(dy0Var, b8.mf.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(22, context, e6Var);
        if (org.telegram.messenger.l10.B(user)) {
            a02 = org.telegram.messenger.bd.M0(2131748637, null);
        } else {
            a02 = org.telegram.messenger.bd.a0(null, null, 2131748636, org.telegram.messenger.l10.p(user));
        }
        y8Var.setText(a02);
        f10.addView(y8Var, b8.mf.t(-1, -2, 7, 0, 0, 0, 0));
        f10.addView(h, b8.mf.t(-1, 48, 7, 14, 19, 14, 12));
        l10.Q0 = true;
        l10.w0(org.telegram.ui.ActionBar.k6.f27824a7);
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        h.setOnClickListener(new ii.i3(h, dy0Var, s12, j10, user, strArr, i3, l10, z13, e6Var));
        imageView.setOnClickListener(new w2(l10, 3));
        l10.show();
        EditTextBoldCursor textView = dy0Var.h.getTextView();
        textView.post(new zs(textView, 8));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, org.telegram.messenger.u10 u10Var) {
        boolean z12;
        boolean z13;
        int i3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = this.f33208a;
        tL_message.from_id = org.telegram.messenger.hp.s1(i10).z1(user.f27150id);
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i10);
        long j10 = this.f33209b;
        tL_message.peer_id = s12.z1(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.out = false;
        this.f33215s = z10;
        this.f33216w = z11;
        org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(i10, tL_message, true, false);
        this.f33214r = ziVar;
        ziVar.f26866j2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = org.telegram.messenger.g0.f22608q;
        spannableStringBuilder.setSpan(new cy0((int) Math.min(point.x * 0.5f, org.telegram.messenger.g0.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new cy0((int) Math.min(point.x * 0.44f, org.telegram.messenger.g0.L(160.0f))), 2, 3, 33);
        this.f33214r.v = spannableStringBuilder;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-j10));
        if (M0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        es0 es0Var = this.d;
        es0Var.f29900e6 = z12;
        if (org.telegram.messenger.t3.T(M0) && M0.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        es0Var.f29964j6 = z13;
        this.f33214r.n0(null);
        es0Var.u3(this.f33214r, null, false, false, false, false);
        u8 u8Var = this.f33211e;
        u8Var.r(user);
        this.f33212f.e(user, u8Var);
        this.f33217x = u10Var;
        this.f33218y = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i3 = 2131748639;
        } else {
            i3 = 2131748638;
        }
        this.h.n(str, org.telegram.messenger.bd.M0(i3, null), false);
        this.f33218y = false;
    }
}
