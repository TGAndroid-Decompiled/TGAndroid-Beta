package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class rz extends vk0 {
    public final Context f32321c;
    public final vz d;

    public rz(vz vzVar, Context context) {
        this.d = vzVar;
        this.f32321c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final long i(int i9) {
        return this.d.f34041g0.get(i9);
    }

    @Override
    public final int j(int i9) {
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        boolean z10;
        float f10;
        int i11;
        int i12;
        int i13;
        tz tzVar = (tz) q1Var.f5501a;
        if (tzVar.f32841b != null) {
            i10 = tzVar.getId();
        } else {
            i10 = -1;
        }
        sz szVar = (sz) this.d.h.get(i9);
        tzVar.f32841b = szVar;
        tzVar.f32846e = i9;
        tzVar.setContentDescription(szVar.f32573b);
        tzVar.requestLayout();
        boolean z11 = tzVar.f32853n;
        sz szVar2 = tzVar.f32841b;
        if (szVar2 != null && szVar2.f32577g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            t5.release(tzVar, tzVar.f32854r);
            t5.release(tzVar, tzVar.K);
            t5.release(tzVar, tzVar.M);
            t5.release(tzVar, tzVar.O);
            if (tzVar.f32851h0) {
                int i14 = 26;
                if (tzVar.f32841b.f32577g) {
                    i11 = 26;
                } else {
                    i11 = 0;
                }
                tzVar.f32854r = t5.update(i11, tzVar, tzVar.f32854r, tzVar.f32855s);
                if (tzVar.f32841b.f32577g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                tzVar.K = t5.update(i12, tzVar, tzVar.K, tzVar.L);
                if (tzVar.f32841b.f32577g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                tzVar.M = t5.update(i13, tzVar, tzVar.M, tzVar.N);
                if (!tzVar.f32841b.f32577g) {
                    i14 = 0;
                }
                tzVar.O = t5.update(i14, tzVar, tzVar.O, tzVar.P);
            }
            tzVar.f32853n = tzVar.f32841b.f32577g;
        }
        if (i10 != tzVar.getId()) {
            if (tzVar.f32841b.f32576f) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            tzVar.f32850g0 = f10;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(new tz(this.d, this.f32321c));
    }
}
