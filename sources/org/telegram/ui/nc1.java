package org.telegram.ui;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class nc1 extends org.telegram.ui.Components.km0 {
    public final Context f39802c;
    public final pc1 d;

    public nc1(Context context, pc1 pc1Var) {
        this.d = pc1Var;
        this.f39802c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d.V0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) b1Var.f46342a;
        pc1 pc1Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) pc1Var.V0.get(i10));
        j5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(pc1Var.f40476k1, pc1Var.f40496t1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (pc1Var.f40445b == 1) {
                int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                long j10 = pc1Var.v.f20973l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : D0;
                }
            } else if (pc1Var.C1 instanceof yh1) {
                i11 = pc1Var.f40454d1;
            }
            if (i11 != 0 && pc1Var.f40479m1 >= 0.0f) {
                ImageReceiver imageReceiver = pc1Var.f40508y0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            j5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.I1;
        mc1 mc1Var = new mc1(this);
        ?? u9Var = new org.telegram.ui.Components.u9(this.f39802c);
        u9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        u9Var.J = i12;
        u9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        u9Var.U = i11;
        u9Var.T = mc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(u9Var, null);
        u9Var.H = radialProgress2;
        radialProgress2.r(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        u9Var.Q = new Paint(3);
        u9Var.S = DownloadController.getInstance(i12).generateObserverTag();
        u9Var.setOutlineProvider(new ci.n1(7));
        u9Var.setClipToOutline(true);
        return new s4.b1(u9Var);
    }
}
