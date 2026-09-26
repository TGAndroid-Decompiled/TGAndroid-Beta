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
public final class md1 extends org.telegram.ui.Components.vl0 {
    public final Context f35538c;
    public final od1 d;

    public md1(Context context, od1 od1Var) {
        this.d = od1Var;
        this.f35538c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
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
    public final void v(s4.c1 c1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) c1Var.f42960a;
        od1 od1Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) od1Var.U0.get(i10));
        k5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(od1Var.f36183j1, od1Var.f36203s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (od1Var.f36155b == 1) {
                int B0 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Pd);
                long j3 = od1Var.f36201s.f18893l;
                int i12 = (int) j3;
                if (i12 != 0 || j3 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (od1Var.B1 instanceof yi1) {
                i11 = od1Var.f36161c1;
            }
            if (i11 != 0 && od1Var.l1 >= 0.0f) {
                ImageReceiver imageReceiver = od1Var.f36214x0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            k5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        ld1 ld1Var = new ld1(this);
        ?? w9Var = new org.telegram.ui.Components.w9(this.f35538c);
        w9Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        w9Var.J = i12;
        w9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        w9Var.U = i11;
        w9Var.T = ld1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(w9Var, null);
        w9Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        w9Var.Q = new Paint(3);
        w9Var.S = DownloadController.getInstance(i12).generateObserverTag();
        w9Var.setOutlineProvider(new ai.k2(7));
        w9Var.setClipToOutline(true);
        return new s4.c1(w9Var);
    }
}
