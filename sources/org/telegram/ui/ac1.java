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
public final class ac1 extends org.telegram.ui.ActionBar.j {
    public final mc1 f35391a;

    public ac1(mc1 mc1Var) {
        this.f35391a = mc1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.f6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        mc1 mc1Var = this.f35391a;
        org.telegram.ui.ActionBar.f6 f6Var = mc1Var.f39146s;
        int i12 = 0;
        if (i10 == -1) {
            if (mc1Var.Q0(true)) {
                mc1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            mc1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (mc1Var.v) {
                org.telegram.ui.ActionBar.h6.q1(false);
            }
            File d = f6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = mc1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            f6Var.f20839o = str2;
            f6Var.f20840p = mc1Var.l1;
            f6Var.f20841q = mc1Var.E1;
            if (((int) f6Var.f20834j) == 0) {
                f6Var.f20834j = 4294967296L;
            }
            if (((int) f6Var.f20835k) == 0) {
                f6Var.f20835k = 4294967296L;
            }
            if (((int) f6Var.f20836l) == 0) {
                f6Var.f20836l = 4294967296L;
            }
            if (((int) f6Var.f20837m) == 0) {
                f6Var.f20837m = 4294967296L;
            }
            mc1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(mc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.h6.u1(mc1Var.f39111e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.h6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, mc1Var.f39111e0, Boolean.valueOf(mc1Var.f39115f0), null, -1);
            mc1Var.finishFragment();
        } else if (i10 == 5) {
            if (mc1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (mc1Var.F1) {
                    sb2.append("blur");
                }
                if (mc1Var.E1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = mc1Var.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.n2) mc1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder i13 = r.c.i(b10, "?mode=");
                        i13.append(sb2.toString());
                        b10 = i13.toString();
                    }
                } else if (obj instanceof uh1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = mc1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    uh1 uh1Var = new uh1(str, mc1Var.Z0, mc1Var.f39102b1, mc1Var.f39106c1, mc1Var.f39109d1, mc1Var.f39122h1, mc1Var.l1, mc1Var.E1, null);
                    uh1Var.f41996g = tL_wallPaper2;
                    b10 = uh1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.h6.I.k(false)) != null) {
                    uh1 uh1Var2 = new uh1(k10.f20839o, (int) k10.f20834j, (int) k10.f20835k, (int) k10.f20836l, (int) k10.f20837m, k10.f20838n, k10.f20840p, k10.f20841q, null);
                    int size = mc1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) mc1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f20839o.equals(tL_wallPaper3.slug)) {
                            uh1Var2.f41996g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = uh1Var2.b();
                } else {
                    return;
                }
                mc1Var.showDialog(new yb1(this, mc1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = mc1Var.f39140p1.a();
            dc1 dc1Var = mc1Var.f39140p1;
            if (dc1Var != null) {
                if (!dc1Var.I0()) {
                    mc1Var.g1();
                    return;
                }
                mc1Var.f39140p1.c1(true);
                org.telegram.ui.Components.uj0 uj0Var = mc1Var.N1;
                uj0Var.h = true;
                if (a2) {
                    uj0Var.P(0);
                } else {
                    uj0Var.P(36);
                }
                mc1Var.N1.start();
                if (mc1Var.M1) {
                    dc1 dc1Var2 = mc1Var.f39140p1;
                    float f7 = 0.0f;
                    if (dc1Var2 != null && dc1Var2.a()) {
                        mc1Var.R1.setVisibility(0);
                        mc1Var.R1.a(mc1Var.f39136n1);
                    } else {
                        mc1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = mc1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        mc1Var.P1.cancel();
                    }
                    float f10 = mc1Var.f39138o1;
                    if (mc1Var.f39140p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    mc1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new e11(this, 12));
                    mc1Var.P1.addListener(new bc0(this, 27));
                    mc1Var.P1.setDuration(250L);
                    mc1Var.P1.setInterpolator(org.telegram.ui.Components.bs.f25030f);
                    mc1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = mc1Var.B1;
            if ((obj2 instanceof vh1) && (file = ((vh1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(mc1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new zb1(this, photoEntry), null);
            }
        }
    }
}
