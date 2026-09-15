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
    public final vd1 f34857a;

    public jd1(vd1 vd1Var) {
        this.f34857a = vd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.g6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        vd1 vd1Var = this.f34857a;
        org.telegram.ui.ActionBar.g6 g6Var = vd1Var.f38562s;
        int i12 = 0;
        if (i10 == -1) {
            if (vd1Var.Q0(true)) {
                vd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            vd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (vd1Var.v) {
                org.telegram.ui.ActionBar.i6.p1(false);
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
            g6Var.f18703o = str2;
            g6Var.f18704p = vd1Var.l1;
            g6Var.f18705q = vd1Var.E1;
            if (((int) g6Var.f18698j) == 0) {
                g6Var.f18698j = 4294967296L;
            }
            if (((int) g6Var.f18699k) == 0) {
                g6Var.f18699k = 4294967296L;
            }
            if (((int) g6Var.f18700l) == 0) {
                g6Var.f18700l = 4294967296L;
            }
            if (((int) g6Var.f18701m) == 0) {
                g6Var.f18701m = 4294967296L;
            }
            vd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(vd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.i6.t1(vd1Var.f38527e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.i6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, vd1Var.f38527e0, Boolean.valueOf(vd1Var.f38531f0), null, -1);
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
                        StringBuilder g10 = w.f.g(b10, "?mode=");
                        g10.append(sb2.toString());
                        b10 = g10.toString();
                    }
                } else if (obj instanceof fj1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = vd1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    fj1 fj1Var = new fj1(str, vd1Var.Z0, vd1Var.f38518b1, vd1Var.f38522c1, vd1Var.f38525d1, vd1Var.f38538h1, vd1Var.l1, vd1Var.E1, null);
                    fj1Var.f33598g = tL_wallPaper2;
                    b10 = fj1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.i6.I.k(false)) != null) {
                    fj1 fj1Var2 = new fj1(k10.f18703o, (int) k10.f18698j, (int) k10.f18699k, (int) k10.f18700l, (int) k10.f18701m, k10.f18702n, k10.f18704p, k10.f18705q, null);
                    int size = vd1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) vd1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f18703o.equals(tL_wallPaper3.slug)) {
                            fj1Var2.f33598g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = fj1Var2.b();
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
            boolean a2 = vd1Var.f38556p1.a();
            md1 md1Var = vd1Var.f38556p1;
            if (md1Var != null) {
                if (!md1Var.Y0()) {
                    vd1Var.g1();
                    return;
                }
                vd1Var.f38556p1.o1(true);
                org.telegram.ui.Components.xi0 xi0Var = vd1Var.N1;
                xi0Var.h = true;
                if (a2) {
                    xi0Var.P(0);
                } else {
                    xi0Var.P(36);
                }
                vd1Var.N1.start();
                if (vd1Var.M1) {
                    md1 md1Var2 = vd1Var.f38556p1;
                    float f7 = 0.0f;
                    if (md1Var2 != null && md1Var2.a()) {
                        vd1Var.R1.setVisibility(0);
                        vd1Var.R1.a(vd1Var.f38552n1);
                    } else {
                        vd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = vd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        vd1Var.P1.cancel();
                    }
                    float f10 = vd1Var.f38554o1;
                    if (vd1Var.f38556p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    vd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new z11(this, 14));
                    vd1Var.P1.addListener(new cr0(this, 22));
                    vd1Var.P1.setDuration(250L);
                    vd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f27423f);
                    vd1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = vd1Var.B1;
            if ((obj2 instanceof gj1) && (file = ((gj1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(vd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new id1(this, photoEntry), null);
            }
        }
    }
}
