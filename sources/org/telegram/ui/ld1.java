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
public final class ld1 extends org.telegram.ui.ActionBar.j {
    public final xd1 f39590a;

    public ld1(xd1 xd1Var) {
        this.f39590a = xd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.g6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        xd1 xd1Var = this.f39590a;
        org.telegram.ui.ActionBar.g6 g6Var = xd1Var.f44031s;
        int i12 = 0;
        if (i10 == -1) {
            if (xd1Var.Q0(true)) {
                xd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            xd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (xd1Var.v) {
                org.telegram.ui.ActionBar.i6.q1(false);
            }
            File d = g6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = xd1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            g6Var.f20669o = str2;
            g6Var.f20670p = xd1Var.l1;
            g6Var.f20671q = xd1Var.E1;
            if (((int) g6Var.f20664j) == 0) {
                g6Var.f20664j = 4294967296L;
            }
            if (((int) g6Var.f20665k) == 0) {
                g6Var.f20665k = 4294967296L;
            }
            if (((int) g6Var.f20666l) == 0) {
                g6Var.f20666l = 4294967296L;
            }
            if (((int) g6Var.f20667m) == 0) {
                g6Var.f20667m = 4294967296L;
            }
            xd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(xd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.i6.u1(xd1Var.f43996e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.i6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, xd1Var.f43996e0, Boolean.valueOf(xd1Var.f44000f0), null, -1);
            xd1Var.finishFragment();
        } else if (i10 == 5) {
            if (xd1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (xd1Var.F1) {
                    sb2.append("blur");
                }
                if (xd1Var.E1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = xd1Var.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.n2) xd1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder j3 = sc.v.j(b10, "?mode=");
                        j3.append(sb2.toString());
                        b10 = j3.toString();
                    }
                } else if (obj instanceof ij1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = xd1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    ij1 ij1Var = new ij1(str, xd1Var.Z0, xd1Var.f43986b1, xd1Var.f43990c1, xd1Var.f43993d1, xd1Var.f44007h1, xd1Var.l1, xd1Var.E1, null);
                    ij1Var.f38724g = tL_wallPaper2;
                    b10 = ij1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.i6.I.k(false)) != null) {
                    ij1 ij1Var2 = new ij1(k10.f20669o, (int) k10.f20664j, (int) k10.f20665k, (int) k10.f20666l, (int) k10.f20667m, k10.f20668n, k10.f20670p, k10.f20671q, null);
                    int size = xd1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) xd1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f20669o.equals(tL_wallPaper3.slug)) {
                            ij1Var2.f38724g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = ij1Var2.b();
                } else {
                    return;
                }
                xd1Var.showDialog(new jd1(this, xd1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = xd1Var.f44025p1.a();
            od1 od1Var = xd1Var.f44025p1;
            if (od1Var != null) {
                if (!od1Var.T0()) {
                    xd1Var.g1();
                    return;
                }
                xd1Var.f44025p1.l1(true);
                org.telegram.ui.Components.dk0 dk0Var = xd1Var.N1;
                dk0Var.h = true;
                if (a2) {
                    dk0Var.P(0);
                } else {
                    dk0Var.P(36);
                }
                xd1Var.N1.start();
                if (xd1Var.M1) {
                    od1 od1Var2 = xd1Var.f44025p1;
                    float f7 = 0.0f;
                    if (od1Var2 != null && od1Var2.a()) {
                        xd1Var.R1.setVisibility(0);
                        xd1Var.R1.a(xd1Var.f44021n1);
                    } else {
                        xd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = xd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        xd1Var.P1.cancel();
                    }
                    float f10 = xd1Var.f44023o1;
                    if (xd1Var.f44025p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    xd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new y11(this, 14));
                    xd1Var.P1.addListener(new ep0(this, 23));
                    xd1Var.P1.setDuration(250L);
                    xd1Var.P1.setInterpolator(org.telegram.ui.Components.is.f27443f);
                    xd1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = xd1Var.B1;
            if ((obj2 instanceof jj1) && (file = ((jj1) obj2).f39009e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(xd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new kd1(this, photoEntry), null);
            }
        }
    }
}
