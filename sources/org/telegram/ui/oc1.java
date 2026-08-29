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
public final class oc1 extends org.telegram.ui.Components.il0 {
    public final Context f41091c;
    public final qc1 d;

    public oc1(Context context, qc1 qc1Var) {
        this.d = qc1Var;
        this.f41091c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d.Q0;
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
    public final void v(f2.n1 n1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) n1Var.f6432a;
        qc1 qc1Var = this.d;
        i5Var.setPattern((TLRPC.TL_wallPaper) qc1Var.Q0.get(i10));
        i5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(qc1Var.f41643f1, qc1Var.f41661o1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (qc1Var.f41626b == 1) {
                int B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                long j10 = qc1Var.f41669s.f22911l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (qc1Var.f41683x1 instanceof zh1) {
                i11 = qc1Var.Y0;
            }
            if (i11 != 0 && qc1Var.f41648h1 >= 0.0f) {
                ImageReceiver imageReceiver = qc1Var.f41672t0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            i5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.D1;
        nc1 nc1Var = new nc1(this);
        ?? t9Var = new org.telegram.ui.Components.t9(this.f41091c);
        t9Var.C = new RectF();
        int i12 = UserConfig.selectedAccount;
        t9Var.F = i12;
        t9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        t9Var.Q = i11;
        t9Var.P = nc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(t9Var, null);
        t9Var.D = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        t9Var.M = new Paint(3);
        t9Var.O = DownloadController.getInstance(i12).generateObserverTag();
        t9Var.setOutlineProvider(new eg.k1(7));
        t9Var.setClipToOutline(true);
        return new f2.n1(t9Var);
    }
}
