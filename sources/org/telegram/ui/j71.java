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
public final class j71 extends org.telegram.ui.Components.sj0 {
    public final Context f46552c;
    public final l71 d;

    public j71(Context context, l71 l71Var) {
        this.d = l71Var;
        this.f46552c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d.W0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final int d(int i3) {
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        BlendMode blendMode;
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) d1Var.f55540a;
        l71 l71Var = this.d;
        i5Var.setPattern((TLRPC.TL_wallPaper) l71Var.W0.get(i3));
        i5Var.getImageReceiver().f21261p1 = new PorterDuffColorFilter(l71Var.f47178l1, l71Var.f47198u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (l71Var.f47145b == 1) {
                int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                long j10 = l71Var.f47201w.f27534l;
                int i11 = (int) j10;
                if (i11 != 0 || j10 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (l71Var.D1 instanceof kc1) {
                i10 = l71Var.f47157e1;
            }
            if (i10 != 0 && l71Var.f47182n1 >= 0.0f) {
                ImageReceiver imageReceiver = l71Var.f47210z0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.Z(blendMode);
                return;
            }
            i5Var.getImageReceiver().Z(null);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        int i10 = this.d.J1;
        i71 i71Var = new i71(this);
        ?? k9Var = new org.telegram.ui.Components.k9(this.f46552c);
        k9Var.H = new RectF();
        int i11 = org.telegram.messenger.h10.f22829t0;
        k9Var.K = i11;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        k9Var.V = i10;
        k9Var.U = i71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(k9Var, null);
        k9Var.I = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        k9Var.R = new Paint(3);
        k9Var.T = org.telegram.messenger.z5.q(i11).k();
        k9Var.setOutlineProvider(new cg.p0(9));
        k9Var.setClipToOutline(true);
        return new u4.d1(k9Var);
    }
}
