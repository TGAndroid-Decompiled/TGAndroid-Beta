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
public final class nd1 extends org.telegram.ui.ActionBar.j {
    public final zd1 f40390a;

    public nd1(zd1 zd1Var) {
        this.f40390a = zd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.e6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        zd1 zd1Var = this.f40390a;
        org.telegram.ui.ActionBar.e6 e6Var = zd1Var.f44784s;
        int i12 = 0;
        if (i10 == -1) {
            if (zd1Var.Q0(true)) {
                zd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            zd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (zd1Var.v) {
                org.telegram.ui.ActionBar.h6.q1(false);
            }
            File d = e6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = zd1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            e6Var.f20362o = str2;
            e6Var.f20363p = zd1Var.l1;
            e6Var.f20364q = zd1Var.E1;
            if (((int) e6Var.f20357j) == 0) {
                e6Var.f20357j = 4294967296L;
            }
            if (((int) e6Var.f20358k) == 0) {
                e6Var.f20358k = 4294967296L;
            }
            if (((int) e6Var.f20359l) == 0) {
                e6Var.f20359l = 4294967296L;
            }
            if (((int) e6Var.f20360m) == 0) {
                e6Var.f20360m = 4294967296L;
            }
            zd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(zd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.h6.u1(zd1Var.f44749e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.h6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, zd1Var.f44749e0, Boolean.valueOf(zd1Var.f44753f0), null, -1);
            zd1Var.finishFragment();
        } else if (i10 == 5) {
            if (zd1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (zd1Var.F1) {
                    sb2.append("blur");
                }
                if (zd1Var.E1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = zd1Var.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.m2) zd1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder j3 = sc.v.j(b10, "?mode=");
                        j3.append(sb2.toString());
                        b10 = j3.toString();
                    }
                } else if (obj instanceof jj1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = zd1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    jj1 jj1Var = new jj1(str, zd1Var.Z0, zd1Var.f44739b1, zd1Var.f44743c1, zd1Var.f44746d1, zd1Var.f44760h1, zd1Var.l1, zd1Var.E1, null);
                    jj1Var.f39232g = tL_wallPaper2;
                    b10 = jj1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.h6.I.k(false)) != null) {
                    jj1 jj1Var2 = new jj1(k10.f20362o, (int) k10.f20357j, (int) k10.f20358k, (int) k10.f20359l, (int) k10.f20360m, k10.f20361n, k10.f20363p, k10.f20364q, null);
                    int size = zd1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) zd1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f20362o.equals(tL_wallPaper3.slug)) {
                            jj1Var2.f39232g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = jj1Var2.b();
                } else {
                    return;
                }
                zd1Var.showDialog(new ld1(this, zd1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = zd1Var.f44778p1.a();
            qd1 qd1Var = zd1Var.f44778p1;
            if (qd1Var != null) {
                if (!qd1Var.T0()) {
                    zd1Var.g1();
                    return;
                }
                zd1Var.f44778p1.l1(true);
                org.telegram.ui.Components.fk0 fk0Var = zd1Var.N1;
                fk0Var.h = true;
                if (a2) {
                    fk0Var.P(0);
                } else {
                    fk0Var.P(36);
                }
                zd1Var.N1.start();
                if (zd1Var.M1) {
                    qd1 qd1Var2 = zd1Var.f44778p1;
                    float f7 = 0.0f;
                    if (qd1Var2 != null && qd1Var2.a()) {
                        zd1Var.R1.setVisibility(0);
                        zd1Var.R1.a(zd1Var.f44774n1);
                    } else {
                        zd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = zd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        zd1Var.P1.cancel();
                    }
                    float f10 = zd1Var.f44776o1;
                    if (zd1Var.f44778p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    zd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new a21(this, 14));
                    zd1Var.P1.addListener(new gp0(this, 23));
                    zd1Var.P1.setDuration(250L);
                    zd1Var.P1.setInterpolator(org.telegram.ui.Components.js.f27634f);
                    zd1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = zd1Var.B1;
            if ((obj2 instanceof kj1) && (file = ((kj1) obj2).f39531e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(zd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new md1(this, photoEntry), null);
            }
        }
    }
}
