package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class kd0 extends org.telegram.ui.Components.xt0 {
    public final ImageView f48633a;
    public final hi.d f48634b;
    public final di.h0[] f48635c;
    public Bundle d;
    public String f48636e;
    public boolean f48637f;
    public String h;
    public String f48638n;
    public long f48639r;
    public int f48640s;
    public final ce0 f48641w;

    public kd0(ce0 ce0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.f48641w = ce0Var;
        this.f48635c = r4;
        this.f48640s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, org.telegram.messenger.g0.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, c8.ja.o(-1, 200));
        ki.f fVar = new ki.f(context, 3);
        frameLayout.addView(fVar, c8.ja.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.f48633a = imageView;
        imageView.setImageResource(2131231244);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        e6Var = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
        org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.SRC_IN);
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i10, false), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, null);
        frameLayout.addView(imageView, c8.ja.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        di.xb xbVar = new di.xb(context, 1, 1, 1);
        xbVar.setStarParticlesView(fVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.j6.Dk;
        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.j6.x0(null, i11, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false)));
        xbVar.setBackgroundBitmap(createBitmap);
        vg.f fVar2 = xbVar.f58893b;
        fVar2.f58877z = i11;
        fVar2.A = org.telegram.ui.ActionBar.j6.Ck;
        fVar2.b();
        frameLayout.addView(xbVar, c8.ja.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131745966, null));
        org.telegram.messenger.k5.m(textView, i7, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        e6Var2 = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
        di.h0 h0Var = new di.h0(1, context, e6Var2);
        h0Var.a(2131231833, org.telegram.messenger.hd.M0(2131745980, null), org.telegram.messenger.hd.M0(2131745982, null));
        addView(r4[0], c8.ja.t(-1, -2, 55, 0, 0, 0, 6));
        e6Var3 = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
        di.h0 h0Var2 = new di.h0(1, context, e6Var3);
        h0Var2.a(2131231796, org.telegram.messenger.hd.M0(2131745978, null), org.telegram.messenger.hd.M0(2131745979, null));
        addView(r4[1], c8.ja.t(-1, -2, 55, 0, 0, 0, 6));
        e6Var4 = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
        di.h0 h0Var3 = new di.h0(1, context, e6Var4);
        di.h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        h0Var3.a(2131231802, org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131745973, null), new fd0(this, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)), org.telegram.messenger.hd.M0(2131745977, null));
        addView(h0VarArr[2], c8.ja.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), c8.ja.p(0, 0, 1.0f, 119));
        hi.d g10 = org.telegram.messenger.i20.g(24, context, null, true);
        this.f48634b = g10;
        g10.setLoading(true);
        addView(g10, c8.ja.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static void n(org.telegram.ui.kd0 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kd0.n(org.telegram.ui.kd0, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override
    public final void g() {
        int i7;
        if (this.f48640s >= 0) {
            i7 = ((org.telegram.ui.ActionBar.e2) this.f48641w).currentAccount;
            ConnectionsManager.getInstance(i7).cancelRequest(this.f48640s, true);
            this.f48640s = -1;
        }
        this.f48637f = false;
        this.f48634b.setLoading(false);
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        long j3;
        int i7;
        boolean z11;
        String H;
        String H2;
        this.d = bundle;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("country");
        }
        String i02 = org.telegram.messenger.hd.i0(2131750521, string);
        if (bundle == null) {
            string2 = null;
        } else {
            string2 = bundle.getString("product");
        }
        if (bundle == null) {
            string3 = null;
        } else {
            string3 = bundle.getString("phoneFormated");
        }
        if (bundle == null) {
            string4 = null;
        } else {
            string4 = bundle.getString("phoneHash");
        }
        if (bundle == null) {
            string5 = null;
        } else {
            string5 = bundle.getString("support_email_email");
        }
        if (bundle == null) {
            string6 = null;
        } else {
            string6 = bundle.getString("support_email_subject");
        }
        if (bundle == null) {
            string7 = null;
        } else {
            string7 = bundle.getString("currency");
        }
        if (bundle == null) {
            j3 = 0;
        } else {
            j3 = bundle.getLong("amount");
        }
        if (bundle == null) {
            i7 = 0;
        } else {
            i7 = bundle.getInt("premium_days");
        }
        boolean isEmpty = TextUtils.isEmpty(i02);
        di.h0[] h0VarArr = this.f48635c;
        if (isEmpty) {
            h0VarArr[0].f8679c.setText(org.telegram.messenger.hd.M0(2131745982, null));
            z11 = false;
        } else {
            z11 = false;
            h0VarArr[0].f8679c.setText(org.telegram.messenger.hd.a0(null, null, 2131745981, i02));
        }
        di.h0 h0Var = h0VarArr[2];
        if (i7 == 7) {
            H = org.telegram.messenger.hd.M0(2131745977, null);
        } else {
            H = org.telegram.messenger.hd.H(',', "SMSFee3TextDays", i7);
        }
        h0Var.setSubtitle(H);
        this.f48633a.setOnClickListener(new bi.f4(this, string5, string6, string3, 15));
        hi.d dVar = this.f48634b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (org.telegram.messenger.r2.b()) {
            if (!TextUtils.isEmpty(string7) && j3 > 0) {
                boolean z12 = z11;
                dVar.setVisibility(z12 ? 1 : 0);
                dVar.setLoading(z12);
                Object[] objArr = new Object[1];
                objArr[z12 ? 1 : 0] = org.telegram.messenger.r1.i().f(j3, string7);
                dVar.i(org.telegram.messenger.hd.a0(null, null, 2131745967, objArr), z12, true);
                if (i7 == 7) {
                    H2 = org.telegram.messenger.hd.M0(2131745971, null);
                } else {
                    H2 = org.telegram.messenger.hd.H(',', "SMSFeePurchaseTextDays", i7);
                }
                dVar.g(H2, z12);
                dVar.setOnClickListener(new di.r0(this, string7, j3, string4, string3, i7));
                return;
            }
            boolean z13 = z11;
            dVar.setVisibility(z13 ? 1 : 0);
            dVar.setLoading(z13);
            dVar.setEnabled(z13);
            dVar.i(org.telegram.messenger.hd.M0(2131743913, null), z13, true);
            return;
        }
        int i10 = z11;
        String str = string4;
        int i11 = i7;
        if (TextUtils.isEmpty(string2)) {
            dVar.setVisibility(8);
            return;
        }
        dVar.setVisibility(i10);
        dVar.setLoading(true);
        ai.g1 g1Var = new ai.g1(this, string2, str, string3, i11, 24);
        if (!org.telegram.messenger.r1.i().k()) {
            org.telegram.messenger.r1.i().f26204i.add(g1Var);
        } else {
            g1Var.run();
        }
    }

    public final void o() {
        int i7;
        if (!this.f48637f) {
            return;
        }
        TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
        tL_checkPaidAuth.form_id = this.f48639r;
        tL_checkPaidAuth.phone_number = this.h;
        tL_checkPaidAuth.phone_code_hash = this.f48638n;
        i7 = ((org.telegram.ui.ActionBar.e2) this.f48641w).currentAccount;
        this.f48640s = ConnectionsManager.getInstance(i7).sendRequest(tL_checkPaidAuth, new l(this, 14), 1096);
    }
}
