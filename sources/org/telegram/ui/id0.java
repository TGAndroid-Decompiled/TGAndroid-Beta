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
public final class id0 extends org.telegram.ui.Components.vt0 {
    public final ImageView f46244a;
    public final gi.d f46245b;
    public final ci.l0[] f46246c;
    public Bundle d;
    public String f46247e;
    public boolean f46248f;
    public String h;
    public String f46249n;
    public long f46250r;
    public int f46251s;
    public final xd0 f46252w;

    public id0(xd0 xd0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.f46252w = xd0Var;
        this.f46246c = r4;
        this.f46251s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, org.telegram.messenger.g0.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, b8.mf.o(-1, 200));
        ii.f fVar = new ii.f(context, 3);
        frameLayout.addView(fVar, b8.mf.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.f46244a = imageView;
        imageView.setImageResource(2131231244);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        e6Var = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.SRC_IN);
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        frameLayout.addView(imageView, b8.mf.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        ci.ic icVar = new ci.ic(context, 1, 1, 1);
        icVar.setStarParticlesView(fVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.k6.Ak;
        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false)));
        icVar.setBackgroundBitmap(createBitmap);
        wg.f fVar2 = icVar.f57666b;
        fVar2.f57650z = i11;
        fVar2.A = org.telegram.ui.ActionBar.k6.zk;
        fVar2.b();
        frameLayout.addView(icVar, b8.mf.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131745976, null));
        org.telegram.messenger.k5.n(textView, i3, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        e6Var2 = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        ci.l0 l0Var = new ci.l0(1, context, e6Var2);
        l0Var.a(2131231833, org.telegram.messenger.bd.M0(2131745990, null), org.telegram.messenger.bd.M0(2131745992, null));
        addView(r4[0], b8.mf.t(-1, -2, 55, 0, 0, 0, 6));
        e6Var3 = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        ci.l0 l0Var2 = new ci.l0(1, context, e6Var3);
        l0Var2.a(2131231796, org.telegram.messenger.bd.M0(2131745988, null), org.telegram.messenger.bd.M0(2131745989, null));
        addView(r4[1], b8.mf.t(-1, -2, 55, 0, 0, 0, 6));
        e6Var4 = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        ci.l0 l0Var3 = new ci.l0(1, context, e6Var4);
        ci.l0[] l0VarArr = {l0Var, l0Var2, l0Var3};
        l0Var3.a(2131231802, org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131745983, null), new ed0(this, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)), org.telegram.messenger.bd.M0(2131745987, null));
        addView(l0VarArr[2], b8.mf.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), b8.mf.p(0, 0, 1.0f, 119));
        gi.d h = org.telegram.messenger.k5.h(24, context, null, true);
        this.f46245b = h;
        h.setLoading(true);
        addView(h, b8.mf.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static void n(org.telegram.ui.id0 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.id0.n(org.telegram.ui.id0, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override
    public final void g() {
        int i3;
        if (this.f46251s >= 0) {
            i3 = ((org.telegram.ui.ActionBar.d2) this.f46252w).currentAccount;
            ConnectionsManager.getInstance(i3).cancelRequest(this.f46251s, true);
            this.f46251s = -1;
        }
        this.f46248f = false;
        this.f46245b.setLoading(false);
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
        long j10;
        int i3;
        boolean z11;
        String H;
        String H2;
        this.d = bundle;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("country");
        }
        String i02 = org.telegram.messenger.bd.i0(2131750529, string);
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
            j10 = 0;
        } else {
            j10 = bundle.getLong("amount");
        }
        if (bundle == null) {
            i3 = 0;
        } else {
            i3 = bundle.getInt("premium_days");
        }
        boolean isEmpty = TextUtils.isEmpty(i02);
        ci.l0[] l0VarArr = this.f46246c;
        if (isEmpty) {
            l0VarArr[0].f5429c.setText(org.telegram.messenger.bd.M0(2131745992, null));
            z11 = false;
        } else {
            z11 = false;
            l0VarArr[0].f5429c.setText(org.telegram.messenger.bd.a0(null, null, 2131745991, i02));
        }
        ci.l0 l0Var = l0VarArr[2];
        if (i3 == 7) {
            H = org.telegram.messenger.bd.M0(2131745987, null);
        } else {
            H = org.telegram.messenger.bd.H(',', "SMSFee3TextDays", i3);
        }
        l0Var.setSubtitle(H);
        this.f46244a.setOnClickListener(new ai.r4(this, string5, string6, string3, 15));
        gi.d dVar = this.f46245b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (org.telegram.messenger.r2.b()) {
            if (!TextUtils.isEmpty(string7) && j10 > 0) {
                boolean z12 = z11;
                dVar.setVisibility(z12 ? 1 : 0);
                dVar.setLoading(z12);
                Object[] objArr = new Object[1];
                objArr[z12 ? 1 : 0] = org.telegram.messenger.r1.i().f(j10, string7);
                dVar.i(org.telegram.messenger.bd.a0(null, null, 2131745977, objArr), z12, true);
                if (i3 == 7) {
                    H2 = org.telegram.messenger.bd.M0(2131745981, null);
                } else {
                    H2 = org.telegram.messenger.bd.H(',', "SMSFeePurchaseTextDays", i3);
                }
                dVar.g(H2, z12);
                dVar.setOnClickListener(new ci.w0(this, string7, j10, string4, string3, i3));
                return;
            }
            boolean z13 = z11;
            dVar.setVisibility(z13 ? 1 : 0);
            dVar.setLoading(z13);
            dVar.setEnabled(z13);
            dVar.i(org.telegram.messenger.bd.M0(2131743923, null), z13, true);
            return;
        }
        int i10 = z11;
        String str = string4;
        int i11 = i3;
        if (TextUtils.isEmpty(string2)) {
            dVar.setVisibility(8);
            return;
        }
        dVar.setVisibility(i10);
        dVar.setLoading(true);
        ai.p1 p1Var = new ai.p1(this, string2, str, string3, i11, 24);
        if (!org.telegram.messenger.r1.i().k()) {
            org.telegram.messenger.r1.i().f25038i.add(p1Var);
        } else {
            p1Var.run();
        }
    }

    public final void o() {
        int i3;
        if (!this.f46248f) {
            return;
        }
        TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
        tL_checkPaidAuth.form_id = this.f46250r;
        tL_checkPaidAuth.phone_number = this.h;
        tL_checkPaidAuth.phone_code_hash = this.f46249n;
        i3 = ((org.telegram.ui.ActionBar.d2) this.f46252w).currentAccount;
        this.f46251s = ConnectionsManager.getInstance(i3).sendRequest(tL_checkPaidAuth, new l(this, 15), 1096);
    }
}
