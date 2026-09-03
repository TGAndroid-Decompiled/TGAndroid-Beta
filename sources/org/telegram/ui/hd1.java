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
public final class hd1 extends org.telegram.ui.Components.rl0 {
    public final Context f37334c;
    public final jd1 d;

    public hd1(Context context, jd1 jd1Var) {
        this.d = jd1Var;
        this.f37334c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
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
    public final void v(f2.m1 m1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) m1Var.f5875a;
        jd1 jd1Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) jd1Var.R0.get(i10));
        k5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(jd1Var.f37984g1, jd1Var.f38002p1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (jd1Var.f37964b == 1) {
                int B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Pd);
                long j10 = jd1Var.f38008s.f21478l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (jd1Var.f38025y1 instanceof vi1) {
                i11 = jd1Var.Z0;
            }
            if (i11 != 0 && jd1Var.f37989i1 >= 0.0f) {
                ImageReceiver imageReceiver = jd1Var.f38013u0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
                return;
            }
            k5Var.getImageReceiver().setBlendMode(null);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.E1;
        gd1 gd1Var = new gd1(this);
        ?? p9Var = new org.telegram.ui.Components.p9(this.f37334c);
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
        p9Var.setOutlineProvider(new hg.j1(5));
        p9Var.setClipToOutline(true);
        return new f2.m1(p9Var);
    }
}
