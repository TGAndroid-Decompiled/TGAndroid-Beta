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
public final class ey0 extends LinearLayout {
    public float D;
    public final int f33398a;
    public final long f33399b;
    public final org.telegram.ui.ActionBar.f6 f33400c;
    public final fs0 d;
    public final w8 f33401e;
    public final l9 f33402f;
    public final org.telegram.ui.Cells.a6 h;
    public final j6 f33403n;
    public org.telegram.messenger.ij f33404r;
    public boolean f33405s;
    public boolean f33406w;
    public org.telegram.messenger.c20 f33407x;
    public boolean f33408y;

    public ey0(int i7, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.D = -6.0f;
        this.f33398a = i7;
        this.f33399b = j3;
        this.f33400c = f6Var;
        setOrientation(1);
        org.telegram.ui.v8 v8Var = new org.telegram.ui.v8(2, context, this);
        v8Var.U(fi.y5.e(null, i7, j3, org.telegram.ui.ActionBar.k6.I.q()));
        fs0 fs0Var = new fs0(context, i7);
        this.d = fs0Var;
        v8Var.addView(fs0Var, c8.ha.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.f33401e = new w8((org.telegram.ui.ActionBar.f6) null);
        l9 l9Var = new l9(context);
        this.f33402f = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        v8Var.addView(l9Var, c8.ha.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(v8Var, c8.ha.r(-1, -2, 7));
        org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, 0, null, f6Var);
        this.h = a6Var;
        EditTextBoldCursor textView = a6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        a6Var.setTextRight(114);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231785);
        org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.f28244y6, f6Var, PorterDuff.Mode.SRC_IN);
        a6Var.addView(e10, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        c8.ka.a(e10);
        e10.setOnClickListener(new la0(textView, 16));
        j6 j6Var = new j6(context, false, true, false);
        this.f33403n = j6Var;
        j6Var.f34922n = false;
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.f28093q7, f6Var);
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setGravity(17);
        j6Var.setAllowCancel(true);
        j6Var.setScaleProperty(0.6f);
        a6Var.addView(j6Var, c8.ha.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new ah.j(this, 24));
        addView(a6Var, c8.ha.r(-1, -2, 7));
        fs0Var.setDelegate(new m4.d0(this, textView, false));
    }

    public static void b(final Context context, final int i7, final long j3, final TLRPC.User user, final String str, final boolean z9, final boolean z10, boolean z11, final org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int i11;
        String str2;
        org.telegram.ui.ActionBar.v2 v2Var;
        int i12;
        int i13;
        boolean z12;
        int i14;
        org.telegram.ui.ActionBar.v2 v2Var2;
        boolean z13;
        int i15;
        int i16;
        boolean z14;
        int i17;
        int i18 = i7;
        boolean z15 = z10;
        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i18).M0(Long.valueOf(-j3));
        if (M0 == null) {
            return;
        }
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var2, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.N = f10;
        if (z15) {
            i10 = -6988581;
        } else if (z9) {
            i10 = -12539616;
        } else {
            i10 = -6905171;
        }
        l9 l9Var = new l9(context);
        l9Var.setImageResource(2131231618);
        l9Var.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(80.0f), i10));
        f10.addView(l9Var, c8.ha.t(80, 80, 49, 0, 18, 0, 0));
        int i19 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = c8.qa.b(context, 20.0f, i19, true, null);
        b10.setGravity(17);
        if (z15) {
            i11 = 2131744280;
        } else if (z9) {
            i11 = 2131744288;
        } else {
            i11 = 2131744282;
        }
        b10.setText(org.telegram.messenger.id.M0(i11, null));
        f10.addView(b10, c8.ha.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = c8.qa.b(context, 14.0f, i19, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (str == null) {
            if (z15) {
                i17 = 2131752207;
            } else if (!z9) {
                str2 = "";
            } else {
                i17 = 2131752208;
            }
            str2 = org.telegram.messenger.id.M0(i17, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z15 || z9) {
            v2Var = l10;
            if (z15) {
                i12 = -6988581;
            } else {
                i12 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i12));
            spannableStringBuilder.setSpan(new zx0(i12, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            v2Var = l10;
            spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.k6.f27822be, null), 0, spannableStringBuilder.length(), 33);
        }
        if (z15) {
            i13 = 2131744281;
        } else if (z9) {
            i13 = 2131744289;
        } else {
            i13 = 2131744283;
        }
        int i20 = 2;
        b11.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i13, org.telegram.messenger.t10.j(user, true), M0.title)), spannableStringBuilder, "un1"));
        f10.addView(b11, c8.ha.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        f10.addView(linearLayout, c8.ha.t(-1, -2, 7, 16, 0, 16, 16));
        int i21 = 0;
        while (i21 < i20) {
            ?? q1Var = new org.telegram.ui.Cells.q1(context, i18);
            if (i21 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            q1Var.setDelegate(new by0(z13, z15));
            cy0 cy0Var = new cy0(context, f6Var2, q1Var);
            cy0Var.U(fi.y5.e(null, i18, j3, org.telegram.ui.ActionBar.k6.I.q()));
            cy0Var.addView((View) q1Var, c8.ha.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
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
            linearLayout.addView(cy0Var, c8.ha.q(0, -1, 1.0f, 119, i15, 0, i16, 0));
            cy0Var.setClipToOutline(true);
            cy0Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.from_id = org.telegram.messenger.qp.s1(i18).z1(user.f27105id);
            tL_message.peer_id = org.telegram.messenger.qp.s1(i18).z1(j3);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i18).getCurrentTime();
            tL_message.out = false;
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i18, tL_message, true, false);
            ijVar.f23261j2 = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new dy0(org.telegram.messenger.g0.L(200.0f)), 0, 1, 33);
            i20 = 2;
            spannableStringBuilder2.setSpan(new dy0(org.telegram.messenger.g0.L(160.0f)), 2, 3, 33);
            ijVar.v = spannableStringBuilder2;
            q1Var.f29828e6 = true;
            if (org.telegram.messenger.t3.T(M0) && M0.megagroup) {
                z14 = true;
            } else {
                z14 = false;
            }
            q1Var.f29892j6 = z14;
            ijVar.n0(null);
            q1Var.w3(ijVar, null, false, false, false, false);
            q1Var.setTranslationX(-org.telegram.messenger.g0.L(140.0f));
            i21++;
            i18 = i7;
            z15 = z10;
            f6Var2 = f6Var;
        }
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        if ((org.telegram.messenger.t3.w(25, M0) && (!z9 || ((!z10 && z11) || org.telegram.messenger.t10.B(user)))) || (org.telegram.messenger.t3.h(M0) && org.telegram.messenger.t10.B(user))) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && !org.telegram.messenger.t3.w(25, M0) && !M0.creator && M0.admin_rights == null && !z10) {
            TextView b12 = c8.qa.b(context, 12.0f, org.telegram.ui.ActionBar.k6.f28244y6, false, null);
            org.telegram.messenger.k5.m(b12, 1, null, 2131752563);
            f10.addView(b12, c8.ha.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        f10.addView(h, c8.ha.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z12) {
            h.setText(bi.k7.g2(org.telegram.messenger.id.M0(2131743891, null)));
            org.telegram.ui.ActionBar.v2 v2Var3 = v2Var;
            h.setOnClickListener(new lk(24, v2Var3, zArr));
            v2Var2 = v2Var3;
        } else {
            final org.telegram.ui.ActionBar.v2 v2Var4 = v2Var;
            if (org.telegram.messenger.t10.B(user)) {
                if (TextUtils.isEmpty(str)) {
                    i14 = 2131744287;
                } else {
                    i14 = 2131744285;
                }
            } else if (TextUtils.isEmpty(str)) {
                i14 = 2131744286;
            } else {
                i14 = 2131744284;
            }
            h.setText(org.telegram.messenger.id.M0(i14, null));
            v2Var2 = v2Var4;
            h.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.v2.this.dismiss();
                    ey0.c(context, i7, j3, user, str, z9, z10, f6Var);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        org.telegram.messenger.qp.e1().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            });
        }
        v2Var2.P0 = true;
        v2Var2.w0(org.telegram.ui.ActionBar.k6.f27852d6);
        v2Var2.n(new ir0(zArr, 11));
        if (org.telegram.messenger.qp.e1().getInt("showchattagsinfo", 3) <= 0 && z12) {
            c(context, i7, j3, user, str, z9, z10, f6Var);
        } else {
            v2Var2.show();
        }
    }

    public static void c(Context context, int i7, long j3, TLRPC.User user, String str, final boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean z11;
        int i10;
        String str2;
        String a02;
        boolean z12;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        s12.M0(Long.valueOf(-j3));
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.N = f10;
        LinearLayout linearLayout = new LinearLayout(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = c8.qa.b(context, 20.0f, i11, true, null);
        b10.setText(org.telegram.messenger.id.M0(2131748628, null));
        linearLayout.addView(b10, c8.ha.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        org.telegram.ui.ActionBar.r6.t(imageView, i11, f6Var, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, f6Var);
        linearLayout.addView(imageView, c8.ha.t(32, 32, 21, 0, 0, 10, 0));
        f10.addView(linearLayout, c8.ha.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        if (TextUtils.isEmpty(str) && !z9) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (TextUtils.isEmpty(str) && !z9 && z11) {
            i10 = 2131748633;
        } else if (z11) {
            i10 = 2131748634;
        } else {
            i10 = 2131748635;
        }
        h.setText(org.telegram.messenger.id.M0(i10, null));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        final boolean z13 = z11;
        ey0 ey0Var = new ey0(i7, j3, context, f6Var);
        ey0Var.setClipToOutline(true);
        ey0Var.setOutlineProvider(new ViewOutlineProvider());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, ey0Var, f6Var);
        ey0Var.a(user, str, z9, z10, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                int i13;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z14 = z13;
                if (isEmpty && !z9 && z14) {
                    i13 = 2131748633;
                } else if (z14) {
                    i13 = 2131748634;
                } else {
                    i13 = 2131748635;
                }
                h.i(org.telegram.messenger.id.M0(i13, null), true, true);
            }
        });
        f10.addView(ey0Var, c8.ha.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(22, context, f6Var);
        if (org.telegram.messenger.t10.B(user)) {
            a02 = org.telegram.messenger.id.M0(2131748630, null);
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131748629, org.telegram.messenger.t10.p(user));
        }
        z8Var.setText(a02);
        f10.addView(z8Var, c8.ha.t(-1, -2, 7, 0, 0, 0, 0));
        f10.addView(h, c8.ha.t(-1, 48, 7, 14, 19, 14, 12));
        l10.P0 = true;
        l10.w0(org.telegram.ui.ActionBar.k6.f27796a7);
        if (TextUtils.isEmpty(str) && !z9 && !z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        h.setOnClickListener(new hi.i3(h, ey0Var, s12, j3, user, strArr, i7, l10, z12, f6Var));
        imageView.setOnClickListener(new y2(l10, 3));
        l10.show();
        EditTextBoldCursor textView = ey0Var.h.getTextView();
        textView.post(new bt(textView, 8));
    }

    public final void a(TLRPC.User user, String str, boolean z9, boolean z10, org.telegram.messenger.c20 c20Var) {
        boolean z11;
        boolean z12;
        int i7;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = this.f33398a;
        tL_message.from_id = org.telegram.messenger.qp.s1(i10).z1(user.f27105id);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
        long j3 = this.f33399b;
        tL_message.peer_id = s12.z1(j3);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.out = false;
        this.f33405s = z9;
        this.f33406w = z10;
        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i10, tL_message, true, false);
        this.f33404r = ijVar;
        ijVar.f23261j2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = org.telegram.messenger.g0.f22563q;
        spannableStringBuilder.setSpan(new dy0((int) Math.min(point.x * 0.5f, org.telegram.messenger.g0.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new dy0((int) Math.min(point.x * 0.44f, org.telegram.messenger.g0.L(160.0f))), 2, 3, 33);
        this.f33404r.v = spannableStringBuilder;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-j3));
        if (M0 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        fs0 fs0Var = this.d;
        fs0Var.f29828e6 = z11;
        if (org.telegram.messenger.t3.T(M0) && M0.megagroup) {
            z12 = true;
        } else {
            z12 = false;
        }
        fs0Var.f29892j6 = z12;
        this.f33404r.n0(null);
        fs0Var.w3(this.f33404r, null, false, false, false, false);
        w8 w8Var = this.f33401e;
        w8Var.r(user);
        this.f33402f.e(user, w8Var);
        this.f33407x = c20Var;
        this.f33408y = true;
        if (TextUtils.isEmpty(str) && !z9) {
            i7 = 2131748632;
        } else {
            i7 = 2131748631;
        }
        this.h.n(str, org.telegram.messenger.id.M0(i7, null), false);
        this.f33408y = false;
    }
}
