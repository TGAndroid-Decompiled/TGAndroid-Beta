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
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

public final class lc1 extends org.telegram.ui.Components.yk0 {

    public final Context f40047c;
    public final nc1 d;

    public lc1(Context context, nc1 nc1Var) {
        this.d = nc1Var;
        this.f40047c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
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
    public final void v(f2.o1 o1Var, int i10) {
        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) o1Var.f5789a;
        nc1 nc1Var = this.d;
        h5Var.setPattern((TLRPC.TL_wallPaper) nc1Var.Q0.get(i10));
        h5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(nc1Var.f40755f1, nc1Var.f40773o1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (nc1Var.f40738b == 1) {
                int iB0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                long j10 = nc1Var.f40781s.f22892l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : iB0;
                }
            } else if (nc1Var.f40795x1 instanceof wh1) {
                i11 = nc1Var.Y0;
            }
            if (i11 == 0 || nc1Var.f40760h1 < 0.0f) {
                h5Var.getImageReceiver().setBlendMode(null);
            } else {
                nc1Var.f40784t0.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.D1;
        kc1 kc1Var = new kc1(this);
        org.telegram.ui.Cells.h5 h5Var = new org.telegram.ui.Cells.h5(this.f40047c);
        h5Var.C = new RectF();
        int i12 = UserConfig.selectedAccount;
        h5Var.F = i12;
        h5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        h5Var.Q = i11;
        h5Var.P = kc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(h5Var, null);
        h5Var.D = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        h5Var.M = new Paint(3);
        h5Var.O = DownloadController.getInstance(i12).generateObserverTag();
        h5Var.setOutlineProvider(new cg.l1(7));
        h5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.lk0(h5Var);
    }
}
