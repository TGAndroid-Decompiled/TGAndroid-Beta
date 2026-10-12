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
public final class ae1 extends org.telegram.ui.Components.lm0 {
    public final Context f34193c;
    public final ce1 d;

    public ae1(Context context, ce1 ce1Var) {
        this.d = ce1Var;
        this.f34193c = context;
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
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) b1Var.f44838a;
        ce1 ce1Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) ce1Var.U0.get(i10));
        k5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(ce1Var.f34884j1, ce1Var.f34904s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (ce1Var.f34856b == 1) {
                int C0 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Pd);
                long j10 = ce1Var.f34902s.f19753l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : C0;
                }
            } else if (ce1Var.B1 instanceof pj1) {
                i11 = ce1Var.f34862c1;
            }
            if (i11 != 0 && ce1Var.l1 >= 0.0f) {
                ImageReceiver imageReceiver = ce1Var.f34915x0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            k5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        zd1 zd1Var = new zd1(this);
        ?? z9Var = new org.telegram.ui.Components.z9(this.f34193c);
        z9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        z9Var.J = i12;
        z9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        z9Var.U = i11;
        z9Var.T = zd1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(z9Var, null);
        z9Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        z9Var.Q = new Paint(3);
        z9Var.S = DownloadController.getInstance(i12).generateObserverTag();
        z9Var.setOutlineProvider(new bi.a2(7));
        z9Var.setClipToOutline(true);
        return new s4.b1(z9Var);
    }
}
