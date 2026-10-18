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
public final class kc1 extends org.telegram.ui.Components.hm0 {
    public final Context f38478c;
    public final mc1 d;

    public kc1(Context context, mc1 mc1Var) {
        this.d = mc1Var;
        this.f38478c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d.U0;
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
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) b1Var.f45958a;
        mc1 mc1Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) mc1Var.U0.get(i10));
        j5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(mc1Var.f39153j1, mc1Var.f39173s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (mc1Var.f39125b == 1) {
                int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                long j10 = mc1Var.f39171s.f20843l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : C0;
                }
            } else if (mc1Var.B1 instanceof uh1) {
                i11 = mc1Var.f39131c1;
            }
            if (i11 != 0 && mc1Var.l1 >= 0.0f) {
                ImageReceiver imageReceiver = mc1Var.f39184x0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            j5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        jc1 jc1Var = new jc1(this);
        ?? w9Var = new org.telegram.ui.Components.w9(this.f38478c);
        w9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        w9Var.J = i12;
        w9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        w9Var.U = i11;
        w9Var.T = jc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(w9Var, null);
        w9Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        w9Var.Q = new Paint(3);
        w9Var.S = DownloadController.getInstance(i12).generateObserverTag();
        w9Var.setOutlineProvider(new ci.o1(7));
        w9Var.setClipToOutline(true);
        return new s4.b1(w9Var);
    }
}
