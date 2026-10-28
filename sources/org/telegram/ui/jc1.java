package org.telegram.ui;

import android.animation.ValueAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public final class jc1 extends org.telegram.ui.ActionBar.j {
    public final vc1 f40509a;

    public jc1(vc1 vc1Var) {
        this.f40509a = vc1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.w6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        vc1 vc1Var = this.f40509a;
        org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
        int i12 = 0;
        if (i10 == -1) {
            if (vc1Var.Q0(true)) {
                vc1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            vc1Var.Z0(i10, true);
        } else if (i10 == 4) {
            if (vc1Var.f44305w) {
                org.telegram.ui.ActionBar.y6.s1(false);
            }
            File d = w6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = vc1Var.X0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            w6Var.f23227o = str2;
            w6Var.f23228p = vc1Var.f44283m1;
            w6Var.f23229q = vc1Var.F1;
            if (((int) w6Var.f23222j) == 0) {
                w6Var.f23222j = 4294967296L;
            }
            if (((int) w6Var.f23223k) == 0) {
                w6Var.f23223k = 4294967296L;
            }
            if (((int) w6Var.f23224l) == 0) {
                w6Var.f23224l = 4294967296L;
            }
            if (((int) w6Var.f23225m) == 0) {
                w6Var.f23225m = 4294967296L;
            }
            vc1Var.X0();
            NotificationCenter.getGlobalInstance().removeObserver(vc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.y6.w1(vc1Var.f44264f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.y6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, vc1Var.f44264f0, Boolean.valueOf(vc1Var.f44267g0), null, -1);
            vc1Var.finishFragment();
        } else if (i10 == 5) {
            if (vc1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (vc1Var.G1) {
                    sb2.append("blur");
                }
                if (vc1Var.F1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = vc1Var.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.r2) vc1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder l4 = org.telegram.ui.Components.b10.l(b10, "?mode=");
                        l4.append(sb2.toString());
                        b10 = l4.toString();
                    }
                } else if (obj instanceof di1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = vc1Var.X0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    di1 di1Var = new di1(str, vc1Var.f44248a1, vc1Var.f44255c1, vc1Var.f44258d1, vc1Var.f44261e1, vc1Var.f44274i1, vc1Var.f44283m1, vc1Var.F1, null);
                    di1Var.f38626g = tL_wallPaper2;
                    b10 = di1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.y6.I.k(false)) != null) {
                    di1 di1Var2 = new di1(k10.f23227o, (int) k10.f23222j, (int) k10.f23223k, (int) k10.f23224l, (int) k10.f23225m, k10.f23226n, k10.f23228p, k10.f23229q, null);
                    int size = vc1Var.V0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) vc1Var.V0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f23227o.equals(tL_wallPaper3.slug)) {
                            di1Var2.f38626g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = di1Var2.b();
                } else {
                    return;
                }
                vc1Var.showDialog(new gc1(this, vc1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = vc1Var.f44292q1.a();
            mc1 mc1Var = vc1Var.f44292q1;
            if (mc1Var != null) {
                if (!mc1Var.X0()) {
                    vc1Var.h1();
                    return;
                }
                vc1Var.f44292q1.j1(true);
                org.telegram.ui.Components.yj0 yj0Var = vc1Var.O1;
                yj0Var.h = true;
                if (a2) {
                    yj0Var.P(0);
                } else {
                    yj0Var.P(36);
                }
                vc1Var.O1.start();
                if (vc1Var.N1) {
                    mc1 mc1Var2 = vc1Var.f44292q1;
                    float f7 = 0.0f;
                    if (mc1Var2 != null && mc1Var2.a()) {
                        vc1Var.S1.setVisibility(0);
                        vc1Var.S1.a(vc1Var.f44288o1);
                    } else {
                        vc1Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = vc1Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        vc1Var.Q1.cancel();
                    }
                    float f10 = vc1Var.f44290p1;
                    if (vc1Var.f44292q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    vc1Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new x11(this, 11));
                    vc1Var.Q1.addListener(new hc1(this, 0));
                    vc1Var.Q1.setDuration(250L);
                    vc1Var.Q1.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                    vc1Var.Q1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = vc1Var.C1;
            if ((obj2 instanceof ei1) && (file = ((ei1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.v1().N2(vc1Var.getParentActivity(), null, null);
                PhotoViewer.v1().j2(arrayList, 0, 3, false, new ic1(this, photoEntry), null);
            }
        }
    }
}
