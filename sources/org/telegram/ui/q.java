package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.ui.Components.RadioButton;
public final class q implements View.OnClickListener {
    public final int f40831a;
    public final h4 f40832b;

    public q(h4 h4Var, int i10) {
        this.f40831a = i10;
        this.f40832b = h4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        int i10 = 0;
        switch (this.f40831a) {
            case 0:
                h4 h4Var = this.f40832b;
                if (h4Var.f37746u0[0].f()) {
                    if (h4Var.f37746u0[0].getWebView() != null) {
                        h4Var.f37746u0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                h4Var.U(h4Var.G - 1);
                return;
            case 1:
                h4 h4Var2 = this.f40832b;
                if (h4Var2.f37746u0[0].f()) {
                    if (h4Var2.f37746u0[0].getWebView() != null) {
                        h4Var2.f37746u0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                h4Var2.U(h4Var2.G + 1);
                return;
            case 2:
                h4 h4Var3 = this.f40832b;
                m0 m0Var = h4Var3.f37734h0;
                if (m0Var.T) {
                    m0Var.h(false);
                    return;
                } else if (m0Var.W) {
                    m0Var.k(false);
                    return;
                } else {
                    if (h4Var3.H()) {
                        l3 l3Var = h4Var3.f37746u0[0];
                        if (l3Var.f39043s) {
                            if (l3Var.f() && l3Var.getWebView() != null) {
                                l3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (h4Var3.f37730d0.size() > 1) {
                        h4Var3.E();
                        return;
                    }
                    u3 u3Var = h4Var3.K;
                    if (u3Var != null) {
                        u3Var.a(false);
                        return;
                    } else {
                        h4Var3.m(true, true);
                        return;
                    }
                }
            case 3:
                u3 u3Var2 = this.f40832b.K;
                if (u3Var2 != null) {
                    u3Var2.a(true);
                    return;
                }
                return;
            case 4:
                h4 h4Var4 = this.f40832b;
                int intValue = ((Integer) view.getTag()).intValue();
                h4Var4.f39480a = intValue;
                for (int i11 = 0; i11 < 2; i11++) {
                    l0 l0Var = h4Var4.T0[i11];
                    if (i11 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) l0Var.f39006b).a(z10, true);
                }
                p3 p3Var = h4.f37706g1;
                int i12 = h4Var4.f39480a;
                p3Var.getClass();
                org.telegram.messenger.w0.f19025b.getSharedPreferences("articles", 0).edit().putInt("font_type", i12).commit();
                if (i12 == 0) {
                    typeface = Typeface.DEFAULT;
                } else {
                    typeface = Typeface.SERIF;
                }
                Typeface typeface2 = typeface;
                if (i12 == 0) {
                    create = org.telegram.messenger.i0.o1("fonts/ritalic.ttf");
                } else {
                    create = Typeface.create("serif", 2);
                }
                Typeface typeface3 = create;
                if (i12 == 0) {
                    create2 = org.telegram.messenger.i0.o();
                } else {
                    create2 = Typeface.create("serif", 1);
                }
                Typeface typeface4 = create2;
                if (i12 == 0) {
                    create3 = org.telegram.messenger.i0.o1("fonts/rmediumitalic.ttf");
                } else {
                    create3 = Typeface.create("serif", 3);
                }
                Typeface typeface5 = create3;
                for (int i13 = 0; i13 < p3Var.f40451t.size(); i13++) {
                    p3.b(p3Var.f40451t.keyAt(i13), (TextPaint) p3Var.f40451t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < p3Var.f40450s.size(); i14++) {
                    p3.b(p3Var.f40450s.keyAt(i14), (TextPaint) p3Var.f40450s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < p3Var.f40448q.size(); i15++) {
                    p3.b(p3Var.f40448q.keyAt(i15), (TextPaint) p3Var.f40448q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < p3Var.f40449r.size(); i16++) {
                    p3.b(p3Var.f40449r.keyAt(i16), (TextPaint) p3Var.f40449r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < p3Var.f40452u.size(); i17++) {
                    p3.b(p3Var.f40452u.keyAt(i17), (TextPaint) p3Var.f40452u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < p3Var.f40453w.size(); i18++) {
                    p3.b(p3Var.f40453w.keyAt(i18), (TextPaint) p3Var.f40453w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < p3Var.f40454x.size(); i19++) {
                    p3.b(p3Var.f40454x.keyAt(i19), (TextPaint) p3Var.f40454x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < p3Var.f40436b.size(); i20++) {
                    p3.b(p3Var.f40436b.keyAt(i20), (TextPaint) p3Var.f40436b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < p3Var.f40437c.size(); i21++) {
                    p3.b(p3Var.f40437c.keyAt(i21), (TextPaint) p3Var.f40437c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < p3Var.f40446o.size(); i22++) {
                    p3.b(p3Var.f40446o.keyAt(i22), (TextPaint) p3Var.f40446o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < p3Var.f40447p.size(); i23++) {
                    p3.b(p3Var.f40447p.keyAt(i23), (TextPaint) p3Var.f40447p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < p3Var.v.size(); i24++) {
                    p3.b(p3Var.v.keyAt(i24), (TextPaint) p3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < p3Var.f40455y.size(); i25++) {
                    p3.b(p3Var.f40455y.keyAt(i25), (TextPaint) p3Var.f40455y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < p3Var.f40456z.size(); i26++) {
                    p3.b(p3Var.f40456z.keyAt(i26), (TextPaint) p3Var.f40456z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < p3Var.A.size(); i27++) {
                    p3.b(p3Var.A.keyAt(i27), (TextPaint) p3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    l3[] l3VarArr = h4Var4.f37746u0;
                    if (i10 < l3VarArr.length) {
                        l3VarArr[i10].f39039c.f();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                h4 h4Var5 = this.f40832b;
                z2 z2Var = h4Var5.d;
                if (z2Var != null) {
                    org.telegram.messenger.i0.g(z2Var.d.getText());
                    if (org.telegram.messenger.i0.H3()) {
                        Toast.makeText(h4Var5.L, org.telegram.messenger.cd.L0(2131744219, null), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.k1 k1Var = h4Var5.H;
                if (k1Var != null && k1Var.isShowing()) {
                    h4Var5.H.d(true);
                    return;
                }
                return;
        }
    }
}
