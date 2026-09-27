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
public final class dd1 extends org.telegram.ui.ActionBar.j {
    public final pd1 f32940a;

    public dd1(pd1 pd1Var) {
        this.f32940a = pd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.g6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        pd1 pd1Var = this.f32940a;
        org.telegram.ui.ActionBar.g6 g6Var = pd1Var.f36439s;
        int i12 = 0;
        if (i10 == -1) {
            if (pd1Var.Q0(true)) {
                pd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            pd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (pd1Var.v) {
                org.telegram.ui.ActionBar.i6.p1(false);
            }
            File d = g6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = pd1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            g6Var.f18917o = str2;
            g6Var.f18918p = pd1Var.l1;
            g6Var.f18919q = pd1Var.E1;
            if (((int) g6Var.f18912j) == 0) {
                g6Var.f18912j = 4294967296L;
            }
            if (((int) g6Var.f18913k) == 0) {
                g6Var.f18913k = 4294967296L;
            }
            if (((int) g6Var.f18914l) == 0) {
                g6Var.f18914l = 4294967296L;
            }
            if (((int) g6Var.f18915m) == 0) {
                g6Var.f18915m = 4294967296L;
            }
            pd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(pd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.i6.t1(pd1Var.f36404e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.i6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, pd1Var.f36404e0, Boolean.valueOf(pd1Var.f36408f0), null, -1);
            pd1Var.finishFragment();
        } else if (i10 == 5) {
            if (pd1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (pd1Var.F1) {
                    sb2.append("blur");
                }
                if (pd1Var.E1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = pd1Var.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.o2) pd1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder h = v7.k0.h(b10, "?mode=");
                        h.append(sb2.toString());
                        b10 = h.toString();
                    }
                } else if (obj instanceof wi1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = pd1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    wi1 wi1Var = new wi1(str, pd1Var.Z0, pd1Var.f36395b1, pd1Var.f36399c1, pd1Var.f36402d1, pd1Var.f36415h1, pd1Var.l1, pd1Var.E1, null);
                    wi1Var.f39356g = tL_wallPaper2;
                    b10 = wi1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.i6.I.k(false)) != null) {
                    wi1 wi1Var2 = new wi1(k10.f18917o, (int) k10.f18912j, (int) k10.f18913k, (int) k10.f18914l, (int) k10.f18915m, k10.f18916n, k10.f18918p, k10.f18919q, null);
                    int size = pd1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) pd1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f18917o.equals(tL_wallPaper3.slug)) {
                            wi1Var2.f39356g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = wi1Var2.b();
                } else {
                    return;
                }
                pd1Var.showDialog(new bd1(this, pd1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = pd1Var.f36433p1.a();
            gd1 gd1Var = pd1Var.f36433p1;
            if (gd1Var != null) {
                if (!gd1Var.Y0()) {
                    pd1Var.g1();
                    return;
                }
                pd1Var.f36433p1.o1(true);
                org.telegram.ui.Components.kj0 kj0Var = pd1Var.N1;
                kj0Var.h = true;
                if (a2) {
                    kj0Var.P(0);
                } else {
                    kj0Var.P(36);
                }
                pd1Var.N1.start();
                if (pd1Var.M1) {
                    gd1 gd1Var2 = pd1Var.f36433p1;
                    float f7 = 0.0f;
                    if (gd1Var2 != null && gd1Var2.a()) {
                        pd1Var.R1.setVisibility(0);
                        pd1Var.R1.a(pd1Var.f36429n1);
                    } else {
                        pd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = pd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pd1Var.P1.cancel();
                    }
                    float f10 = pd1Var.f36431o1;
                    if (pd1Var.f36433p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    pd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new b21(this, 13));
                    pd1Var.P1.addListener(new ap0(this, 23));
                    pd1Var.P1.setDuration(250L);
                    pd1Var.P1.setInterpolator(org.telegram.ui.Components.sr.f28359f);
                    pd1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = pd1Var.B1;
            if ((obj2 instanceof xi1) && (file = ((xi1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().J2(pd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new cd1(this, photoEntry), null);
            }
        }
    }
}
