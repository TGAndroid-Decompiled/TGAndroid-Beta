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
public final class jd1 extends org.telegram.ui.ActionBar.j {
    public final vd1 f34846a;

    public jd1(vd1 vd1Var) {
        this.f34846a = vd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.g6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        vd1 vd1Var = this.f34846a;
        org.telegram.ui.ActionBar.g6 g6Var = vd1Var.f38516s;
        int i12 = 0;
        if (i10 == -1) {
            if (vd1Var.Q0(true)) {
                vd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            vd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (vd1Var.v) {
                org.telegram.ui.ActionBar.j6.p1(false);
            }
            File d = g6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = vd1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            g6Var.f18888o = str2;
            g6Var.f18889p = vd1Var.l1;
            g6Var.f18890q = vd1Var.E1;
            if (((int) g6Var.f18883j) == 0) {
                g6Var.f18883j = 4294967296L;
            }
            if (((int) g6Var.f18884k) == 0) {
                g6Var.f18884k = 4294967296L;
            }
            if (((int) g6Var.f18885l) == 0) {
                g6Var.f18885l = 4294967296L;
            }
            if (((int) g6Var.f18886m) == 0) {
                g6Var.f18886m = 4294967296L;
            }
            vd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(vd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.j6.t1(vd1Var.f38481e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, vd1Var.f38481e0, Boolean.valueOf(vd1Var.f38485f0), null, -1);
            vd1Var.finishFragment();
        } else if (i10 == 5) {
            if (vd1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (vd1Var.F1) {
                    sb2.append("blur");
                }
                if (vd1Var.E1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = vd1Var.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.n2) vd1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder j3 = t8.b.j(b10, "?mode=");
                        j3.append(sb2.toString());
                        b10 = j3.toString();
                    }
                } else if (obj instanceof ej1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = vd1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    ej1 ej1Var = new ej1(str, vd1Var.Z0, vd1Var.f38472b1, vd1Var.f38476c1, vd1Var.f38479d1, vd1Var.f38492h1, vd1Var.l1, vd1Var.E1, null);
                    ej1Var.f33297g = tL_wallPaper2;
                    b10 = ej1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.j6.I.k(false)) != null) {
                    ej1 ej1Var2 = new ej1(k10.f18888o, (int) k10.f18883j, (int) k10.f18884k, (int) k10.f18885l, (int) k10.f18886m, k10.f18887n, k10.f18889p, k10.f18890q, null);
                    int size = vd1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) vd1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f18888o.equals(tL_wallPaper3.slug)) {
                            ej1Var2.f33297g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = ej1Var2.b();
                } else {
                    return;
                }
                vd1Var.showDialog(new hd1(this, vd1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = vd1Var.f38510p1.a();
            md1 md1Var = vd1Var.f38510p1;
            if (md1Var != null) {
                if (!md1Var.Y0()) {
                    vd1Var.g1();
                    return;
                }
                vd1Var.f38510p1.o1(true);
                org.telegram.ui.Components.ij0 ij0Var = vd1Var.N1;
                ij0Var.h = true;
                if (a2) {
                    ij0Var.P(0);
                } else {
                    ij0Var.P(36);
                }
                vd1Var.N1.start();
                if (vd1Var.M1) {
                    md1 md1Var2 = vd1Var.f38510p1;
                    float f7 = 0.0f;
                    if (md1Var2 != null && md1Var2.a()) {
                        vd1Var.R1.setVisibility(0);
                        vd1Var.R1.a(vd1Var.f38506n1);
                    } else {
                        vd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = vd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        vd1Var.P1.cancel();
                    }
                    float f10 = vd1Var.f38508o1;
                    if (vd1Var.f38510p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    vd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new i21(this, 13));
                    vd1Var.P1.addListener(new gp0(this, 23));
                    vd1Var.P1.setDuration(250L);
                    vd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f27715f);
                    vd1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = vd1Var.B1;
            if ((obj2 instanceof fj1) && (file = ((fj1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().J2(vd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new id1(this, photoEntry), null);
            }
        }
    }
}
