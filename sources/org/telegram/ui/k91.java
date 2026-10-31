package org.telegram.ui;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class k91 extends org.telegram.ui.Components.sk0 {
    public final Context f38728c;
    public final m91 d;

    public k91(Context context, m91 m91Var) {
        this.d = m91Var;
        this.f38728c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d.V0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final int d(int i10) {
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) c1Var.f47898a;
        m91 m91Var = this.d;
        n5Var.setPattern((TLRPC.TL_wallPaper) m91Var.V0.get(i10));
        n5Var.getImageReceiver().f14397o1 = new PorterDuffColorFilter(m91Var.f39571k1, m91Var.f39591t1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (m91Var.f39540b == 1) {
                int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                long j10 = m91Var.f39596w.f20738l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : E0;
                }
            } else if (m91Var.C1 instanceof me1) {
                i11 = m91Var.f39549d1;
            }
            if (i11 != 0 && m91Var.f39574m1 >= 0.0f) {
                ImageReceiver imageReceiver = m91Var.f39603y0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.Z(blendMode);
                return;
            }
            n5Var.getImageReceiver().Z(null);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        int i11 = this.d.I1;
        j91 j91Var = new j91(this);
        ?? g9Var = new org.telegram.ui.Components.g9(this.f38728c);
        g9Var.G = new RectF();
        int i12 = org.telegram.messenger.d20.f15147s0;
        g9Var.J = i12;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(6.0f));
        g9Var.U = i11;
        g9Var.T = j91Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(g9Var, null);
        g9Var.H = radialProgress2;
        radialProgress2.r(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(70.0f), org.telegram.messenger.i0.L(70.0f));
        g9Var.Q = new Paint(3);
        g9Var.S = org.telegram.messenger.b6.q(i12).k();
        g9Var.setOutlineProvider(new bi.d2(6));
        g9Var.setClipToOutline(true);
        return new s4.c1(g9Var);
    }
}
