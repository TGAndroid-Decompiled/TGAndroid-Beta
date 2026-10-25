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
public final class hc1 extends org.telegram.ui.ActionBar.j {
    public final tc1 f39979a;

    public hc1(tc1 tc1Var) {
        this.f39979a = tc1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.w6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        tc1 tc1Var = this.f39979a;
        org.telegram.ui.ActionBar.w6 w6Var = tc1Var.v;
        int i12 = 0;
        if (i10 == -1) {
            if (tc1Var.Q0(true)) {
                tc1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            tc1Var.Z0(i10, true);
        } else if (i10 == 4) {
            if (tc1Var.f43792w) {
                org.telegram.ui.ActionBar.y6.s1(false);
            }
            File d = w6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = tc1Var.X0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            w6Var.f23224o = str2;
            w6Var.f23225p = tc1Var.f43770m1;
            w6Var.f23226q = tc1Var.F1;
            if (((int) w6Var.f23219j) == 0) {
                w6Var.f23219j = 4294967296L;
            }
            if (((int) w6Var.f23220k) == 0) {
                w6Var.f23220k = 4294967296L;
            }
            if (((int) w6Var.f23221l) == 0) {
                w6Var.f23221l = 4294967296L;
            }
            if (((int) w6Var.f23222m) == 0) {
                w6Var.f23222m = 4294967296L;
            }
            tc1Var.X0();
            NotificationCenter.getGlobalInstance().removeObserver(tc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.y6.w1(tc1Var.f43751f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.y6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, tc1Var.f43751f0, Boolean.valueOf(tc1Var.f43754g0), null, -1);
            tc1Var.finishFragment();
        } else if (i10 == 5) {
            if (tc1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (tc1Var.G1) {
                    sb2.append("blur");
                }
                if (tc1Var.F1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = tc1Var.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.r2) tc1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder l4 = org.telegram.ui.Components.b10.l(b10, "?mode=");
                        l4.append(sb2.toString());
                        b10 = l4.toString();
                    }
                } else if (obj instanceof bi1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = tc1Var.X0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    bi1 bi1Var = new bi1(str, tc1Var.f43735a1, tc1Var.f43742c1, tc1Var.f43745d1, tc1Var.f43748e1, tc1Var.f43761i1, tc1Var.f43770m1, tc1Var.F1, null);
                    bi1Var.f38104g = tL_wallPaper2;
                    b10 = bi1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.y6.I.k(false)) != null) {
                    bi1 bi1Var2 = new bi1(k10.f23224o, (int) k10.f23219j, (int) k10.f23220k, (int) k10.f23221l, (int) k10.f23222m, k10.f23223n, k10.f23225p, k10.f23226q, null);
                    int size = tc1Var.V0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tc1Var.V0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f23224o.equals(tL_wallPaper3.slug)) {
                            bi1Var2.f38104g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = bi1Var2.b();
                } else {
                    return;
                }
                tc1Var.showDialog(new ec1(this, tc1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = tc1Var.f43779q1.a();
            kc1 kc1Var = tc1Var.f43779q1;
            if (kc1Var != null) {
                if (!kc1Var.X0()) {
                    tc1Var.h1();
                    return;
                }
                tc1Var.f43779q1.j1(true);
                org.telegram.ui.Components.xj0 xj0Var = tc1Var.O1;
                xj0Var.h = true;
                if (a2) {
                    xj0Var.P(0);
                } else {
                    xj0Var.P(36);
                }
                tc1Var.O1.start();
                if (tc1Var.N1) {
                    kc1 kc1Var2 = tc1Var.f43779q1;
                    float f7 = 0.0f;
                    if (kc1Var2 != null && kc1Var2.a()) {
                        tc1Var.S1.setVisibility(0);
                        tc1Var.S1.a(tc1Var.f43775o1);
                    } else {
                        tc1Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = tc1Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        tc1Var.Q1.cancel();
                    }
                    float f10 = tc1Var.f43777p1;
                    if (tc1Var.f43779q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    tc1Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new v11(this, 11));
                    tc1Var.Q1.addListener(new fc1(this, 0));
                    tc1Var.Q1.setDuration(250L);
                    tc1Var.Q1.setInterpolator(org.telegram.ui.Components.ds.f27584f);
                    tc1Var.Q1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = tc1Var.C1;
            if ((obj2 instanceof ci1) && (file = ((ci1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.u1().M2(tc1Var.getParentActivity(), null, null);
                PhotoViewer.u1().i2(arrayList, 0, 3, false, new gc1(this, photoEntry), null);
            }
        }
    }
}
