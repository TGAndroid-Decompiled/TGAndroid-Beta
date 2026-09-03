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
public final class hd1 extends org.telegram.ui.Components.ql0 {
    public final Context f34649c;
    public final jd1 d;

    public hd1(Context context, jd1 jd1Var) {
        this.d = jd1Var;
        this.f34649c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d.R0;
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
    public final void v(f2.l1 l1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) l1Var.f5774a;
        jd1 jd1Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) jd1Var.R0.get(i10));
        j5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(jd1Var.f35201g1, jd1Var.f35219p1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (jd1Var.f35182b == 1) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j10 = jd1Var.f35225s.f19744l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (jd1Var.f35242y1 instanceof ui1) {
                i11 = jd1Var.Z0;
            }
            if (i11 != 0 && jd1Var.f35206i1 >= 0.0f) {
                ImageReceiver imageReceiver = jd1Var.f35230u0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            j5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.E1;
        gd1 gd1Var = new gd1(this);
        ?? p9Var = new org.telegram.ui.Components.p9(this.f34649c);
        p9Var.D = new RectF();
        int i12 = UserConfig.selectedAccount;
        p9Var.G = i12;
        p9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        p9Var.R = i11;
        p9Var.Q = gd1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(p9Var, null);
        p9Var.E = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        p9Var.N = new Paint(3);
        p9Var.P = DownloadController.getInstance(i12).generateObserverTag();
        p9Var.setOutlineProvider(new gg.j1(5));
        p9Var.setClipToOutline(true);
        return new f2.l1(p9Var);
    }
}
