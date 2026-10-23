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
public final class oc1 extends org.telegram.ui.Components.lm0 {
    public final Context f40136c;
    public final qc1 d;

    public oc1(Context context, qc1 qc1Var) {
        this.d = qc1Var;
        this.f40136c = context;
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
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) b1Var.f46343a;
        qc1 qc1Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) qc1Var.V0.get(i10));
        j5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(qc1Var.f40747k1, qc1Var.f40767t1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (qc1Var.f40716b == 1) {
                int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                long j10 = qc1Var.v.f20972l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : D0;
                }
            } else if (qc1Var.C1 instanceof zh1) {
                i11 = qc1Var.f40725d1;
            }
            if (i11 != 0 && qc1Var.f40750m1 >= 0.0f) {
                ImageReceiver imageReceiver = qc1Var.f40779y0.getImageReceiver();
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
        nc1 nc1Var = new nc1(this);
        ?? w9Var = new org.telegram.ui.Components.w9(this.f40136c);
        w9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        w9Var.J = i12;
        w9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        w9Var.U = i11;
        w9Var.T = nc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(w9Var, null);
        w9Var.H = radialProgress2;
        radialProgress2.r(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        w9Var.Q = new Paint(3);
        w9Var.S = DownloadController.getInstance(i12).generateObserverTag();
        w9Var.setOutlineProvider(new ci.n1(7));
        w9Var.setClipToOutline(true);
        return new s4.b1(w9Var);
    }
}
