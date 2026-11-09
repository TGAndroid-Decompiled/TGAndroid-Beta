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
public final class nd0 extends org.telegram.ui.Components.yt0 {
    public final ImageView f48165a;
    public final fi.d f48166b;
    public final bi.q0[] f48167c;
    public Bundle d;
    public String f48168e;
    public boolean f48169f;
    public String h;
    public String f48170n;
    public long f48171r;
    public int f48172s;
    public final ee0 f48173w;

    public nd0(ee0 ee0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        this.f48173w = ee0Var;
        this.f48167c = r4;
        this.f48172s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, org.telegram.messenger.g0.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, c8.ha.o(-1, 200));
        hi.e eVar = new hi.e(context, 3);
        frameLayout.addView(eVar, c8.ha.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.f48165a = imageView;
        imageView.setImageResource(2131231244);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        g6Var = ((org.telegram.ui.ActionBar.f2) ee0Var).resourceProvider;
        org.telegram.ui.ActionBar.s6.s(imageView, i7, g6Var, PorterDuff.Mode.SRC_IN);
        int i10 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i10, false), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, null);
        frameLayout.addView(imageView, c8.ha.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        bi.qd qdVar = new bi.qd(context, 1, 1, 1);
        qdVar.setStarParticlesView(eVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.l6.Ak;
        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.l6.x0(null, i11, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false)));
        qdVar.setBackgroundBitmap(createBitmap);
        vg.f fVar = qdVar.f57424b;
        fVar.f57408z = i11;
        fVar.A = org.telegram.ui.ActionBar.l6.zk;
        fVar.b();
        frameLayout.addView(qdVar, c8.ha.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.id.M0(2131745966, null));
        org.telegram.messenger.k5.n(textView, i7, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        g6Var2 = ((org.telegram.ui.ActionBar.f2) ee0Var).resourceProvider;
        bi.q0 q0Var = new bi.q0(1, context, g6Var2);
        q0Var.a(2131231833, org.telegram.messenger.id.M0(2131745980, null), org.telegram.messenger.id.M0(2131745982, null));
        addView(r4[0], c8.ha.t(-1, -2, 55, 0, 0, 0, 6));
        g6Var3 = ((org.telegram.ui.ActionBar.f2) ee0Var).resourceProvider;
        bi.q0 q0Var2 = new bi.q0(1, context, g6Var3);
        q0Var2.a(2131231796, org.telegram.messenger.id.M0(2131745978, null), org.telegram.messenger.id.M0(2131745979, null));
        addView(r4[1], c8.ha.t(-1, -2, 55, 0, 0, 0, 6));
        g6Var4 = ((org.telegram.ui.ActionBar.f2) ee0Var).resourceProvider;
        bi.q0 q0Var3 = new bi.q0(1, context, g6Var4);
        bi.q0[] q0VarArr = {q0Var, q0Var2, q0Var3};
        q0Var3.a(2131231802, org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131745973, null), new jd0(this, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)), org.telegram.messenger.id.M0(2131745977, null));
        addView(q0VarArr[2], c8.ha.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), c8.ha.p(0, 0, 1.0f, 119));
        fi.d h = org.telegram.messenger.k5.h(24, context, null, true);
        this.f48166b = h;
        h.setLoading(true);
        addView(h, c8.ha.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static void n(org.telegram.ui.nd0 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nd0.n(org.telegram.ui.nd0, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override
    public final void g() {
        int i7;
        if (this.f48172s >= 0) {
            i7 = ((org.telegram.ui.ActionBar.f2) this.f48173w).currentAccount;
            ConnectionsManager.getInstance(i7).cancelRequest(this.f48172s, true);
            this.f48172s = -1;
        }
        this.f48169f = false;
        this.f48166b.setLoading(false);
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        long j3;
        int i7;
        boolean z10;
        String H;
        String H2;
        this.d = bundle;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("country");
        }
        String i02 = org.telegram.messenger.id.i0(2131750521, string);
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
        bi.q0[] q0VarArr = this.f48167c;
        if (isEmpty) {
            q0VarArr[0].f4552c.setText(org.telegram.messenger.id.M0(2131745982, null));
            z10 = false;
        } else {
            z10 = false;
            q0VarArr[0].f4552c.setText(org.telegram.messenger.id.a0(null, null, 2131745981, i02));
        }
        bi.q0 q0Var = q0VarArr[2];
        if (i7 == 7) {
            H = org.telegram.messenger.id.M0(2131745977, null);
        } else {
            H = org.telegram.messenger.id.H(',', "SMSFee3TextDays", i7);
        }
        q0Var.setSubtitle(H);
        this.f48165a.setOnClickListener(new di.v3(this, string5, string6, string3, 14));
        fi.d dVar = this.f48166b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (org.telegram.messenger.r2.b()) {
            if (!TextUtils.isEmpty(string7) && j3 > 0) {
                boolean z11 = z10;
                dVar.setVisibility(z11 ? 1 : 0);
                dVar.setLoading(z11);
                Object[] objArr = new Object[1];
                objArr[z11 ? 1 : 0] = org.telegram.messenger.r1.i().f(j3, string7);
                dVar.i(org.telegram.messenger.id.a0(null, null, 2131745967, objArr), z11, true);
                if (i7 == 7) {
                    H2 = org.telegram.messenger.id.M0(2131745971, null);
                } else {
                    H2 = org.telegram.messenger.id.H(',', "SMSFeePurchaseTextDays", i7);
                }
                dVar.g(H2, z11);
                dVar.setOnClickListener(new bi.d1(this, string7, j3, string4, string3, i7));
                return;
            }
            boolean z12 = z10;
            dVar.setVisibility(z12 ? 1 : 0);
            dVar.setLoading(z12);
            dVar.setEnabled(z12);
            dVar.i(org.telegram.messenger.id.M0(2131743913, null), z12, true);
            return;
        }
        int i10 = z10;
        String str = string4;
        int i11 = i7;
        if (TextUtils.isEmpty(string2)) {
            dVar.setVisibility(8);
            return;
        }
        dVar.setVisibility(i10);
        dVar.setLoading(true);
        bi.ub ubVar = new bi.ub((Object) this, string2, str, string3, i11, 22);
        if (!org.telegram.messenger.r1.i().k()) {
            org.telegram.messenger.r1.i().f25208i.add(ubVar);
        } else {
            ubVar.run();
        }
    }

    public final void o() {
        int i7;
        if (!this.f48169f) {
            return;
        }
        TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
        tL_checkPaidAuth.form_id = this.f48171r;
        tL_checkPaidAuth.phone_number = this.h;
        tL_checkPaidAuth.phone_code_hash = this.f48170n;
        i7 = ((org.telegram.ui.ActionBar.f2) this.f48173w).currentAccount;
        this.f48172s = ConnectionsManager.getInstance(i7).sendRequest(tL_checkPaidAuth, new l(this, 14), 1096);
    }
}
