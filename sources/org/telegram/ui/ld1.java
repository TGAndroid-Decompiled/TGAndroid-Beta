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
    public final xd1 f35424a;

    public ld1(xd1 xd1Var) {
        this.f35424a = xd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.h6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        xd1 xd1Var = this.f35424a;
        org.telegram.ui.ActionBar.h6 h6Var = xd1Var.f39519s;
        int i12 = 0;
        if (i10 == -1) {
            if (xd1Var.Q0(true)) {
                xd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            xd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (xd1Var.v) {
                org.telegram.ui.ActionBar.j6.p1(false);
            }
            File d = h6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = xd1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            h6Var.f18938o = str2;
            h6Var.f18939p = xd1Var.l1;
            h6Var.f18940q = xd1Var.E1;
            if (((int) h6Var.f18933j) == 0) {
                h6Var.f18933j = 4294967296L;
            }
            if (((int) h6Var.f18934k) == 0) {
                h6Var.f18934k = 4294967296L;
            }
            if (((int) h6Var.f18935l) == 0) {
                h6Var.f18935l = 4294967296L;
            }
            if (((int) h6Var.f18936m) == 0) {
                h6Var.f18936m = 4294967296L;
            }
            xd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(xd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.j6.t1(xd1Var.f39484e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, xd1Var.f39484e0, Boolean.valueOf(xd1Var.f39488f0), null, -1);
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
                        StringBuilder h = v7.j0.h(b10, "?mode=");
                        h.append(sb2.toString());
                        b10 = h.toString();
                    }
                } else if (obj instanceof fj1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = xd1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    fj1 fj1Var = new fj1(str, xd1Var.Z0, xd1Var.f39475b1, xd1Var.f39479c1, xd1Var.f39482d1, xd1Var.f39495h1, xd1Var.l1, xd1Var.E1, null);
                    fj1Var.f33665g = tL_wallPaper2;
                    b10 = fj1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.j6.I.k(false)) != null) {
                    fj1 fj1Var2 = new fj1(k10.f18938o, (int) k10.f18933j, (int) k10.f18934k, (int) k10.f18935l, (int) k10.f18936m, k10.f18937n, k10.f18939p, k10.f18940q, null);
                    int size = xd1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) xd1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f18938o.equals(tL_wallPaper3.slug)) {
                            fj1Var2.f33665g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = fj1Var2.b();
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
            boolean a2 = xd1Var.f39513p1.a();
            od1 od1Var = xd1Var.f39513p1;
            if (od1Var != null) {
                if (!od1Var.V0()) {
                    xd1Var.g1();
                    return;
                }
                xd1Var.f39513p1.o1(true);
                org.telegram.ui.Components.hj0 hj0Var = xd1Var.N1;
                hj0Var.h = true;
                if (a2) {
                    hj0Var.P(0);
                } else {
                    hj0Var.P(36);
                }
                xd1Var.N1.start();
                if (xd1Var.M1) {
                    od1 od1Var2 = xd1Var.f39513p1;
                    float f7 = 0.0f;
                    if (od1Var2 != null && od1Var2.a()) {
                        xd1Var.R1.setVisibility(0);
                        xd1Var.R1.a(xd1Var.f39509n1);
                    } else {
                        xd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = xd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        xd1Var.P1.cancel();
                    }
                    float f10 = xd1Var.f39511o1;
                    if (xd1Var.f39513p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    xd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new i21(this, 13));
                    xd1Var.P1.addListener(new gp0(this, 23));
                    xd1Var.P1.setDuration(250L);
                    xd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f27642f);
                    xd1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = xd1Var.B1;
            if ((obj2 instanceof gj1) && (file = ((gj1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().J2(xd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new kd1(this, photoEntry), null);
            }
        }
    }
}
