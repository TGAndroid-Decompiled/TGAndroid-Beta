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
public final class mc1 extends org.telegram.ui.Components.vk0 {
    public final Context f40392c;
    public final oc1 d;

    public mc1(Context context, oc1 oc1Var) {
        this.d = oc1Var;
        this.f40392c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
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
    public final int j(int i9) {
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        BlendMode blendMode;
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) q1Var.f5501a;
        oc1 oc1Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) oc1Var.Q0.get(i9));
        k5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(oc1Var.f41076f1, oc1Var.f41094o1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (oc1Var.f41059b == 1) {
                int B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Pd);
                long j10 = oc1Var.f41102s.f22875l;
                int i11 = (int) j10;
                if (i11 != 0 || j10 == 0) {
                    i10 = i11 != 0 ? i11 : B0;
                }
            } else if (oc1Var.f41116x1 instanceof xh1) {
                i10 = oc1Var.Y0;
            }
            if (i10 != 0 && oc1Var.f41081h1 >= 0.0f) {
                ImageReceiver imageReceiver = oc1Var.f41105t0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            k5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10 = this.d.D1;
        lc1 lc1Var = new lc1(this);
        ?? o9Var = new org.telegram.ui.Components.o9(this.f40392c);
        o9Var.C = new RectF();
        int i11 = UserConfig.selectedAccount;
        o9Var.F = i11;
        o9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        o9Var.Q = i10;
        o9Var.P = lc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(o9Var, null);
        o9Var.D = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        o9Var.M = new Paint(3);
        o9Var.O = DownloadController.getInstance(i11).generateObserverTag();
        o9Var.setOutlineProvider(new bg.q1(7));
        o9Var.setClipToOutline(true);
        return new f2.q1(o9Var);
    }
}
