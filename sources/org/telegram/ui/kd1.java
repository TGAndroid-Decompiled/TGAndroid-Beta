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
public final class kd1 extends org.telegram.ui.ActionBar.j {
    public final wd1 f35129a;

    public kd1(wd1 wd1Var) {
        this.f35129a = wd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.g6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        wd1 wd1Var = this.f35129a;
        org.telegram.ui.ActionBar.g6 g6Var = wd1Var.f38835s;
        int i12 = 0;
        if (i10 == -1) {
            if (wd1Var.Q0(true)) {
                wd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            wd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (wd1Var.v) {
                org.telegram.ui.ActionBar.i6.p1(false);
            }
            File d = g6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = wd1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            g6Var.f18701o = str2;
            g6Var.f18702p = wd1Var.l1;
            g6Var.f18703q = wd1Var.E1;
            if (((int) g6Var.f18696j) == 0) {
                g6Var.f18696j = 4294967296L;
            }
            if (((int) g6Var.f18697k) == 0) {
                g6Var.f18697k = 4294967296L;
            }
            if (((int) g6Var.f18698l) == 0) {
                g6Var.f18698l = 4294967296L;
            }
            if (((int) g6Var.f18699m) == 0) {
                g6Var.f18699m = 4294967296L;
            }
            wd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(wd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.i6.t1(wd1Var.f38800e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.i6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, wd1Var.f38800e0, Boolean.valueOf(wd1Var.f38804f0), null, -1);
            wd1Var.finishFragment();
        } else if (i10 == 5) {
            if (wd1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (wd1Var.F1) {
                    sb2.append("blur");
                }
                if (wd1Var.E1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = wd1Var.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.n2) wd1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder h = w.c.h(b10, "?mode=");
                        h.append(sb2.toString());
                        b10 = h.toString();
                    }
                } else if (obj instanceof gj1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = wd1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    gj1 gj1Var = new gj1(str, wd1Var.Z0, wd1Var.f38791b1, wd1Var.f38795c1, wd1Var.f38798d1, wd1Var.f38811h1, wd1Var.l1, wd1Var.E1, null);
                    gj1Var.f33871g = tL_wallPaper2;
                    b10 = gj1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.i6.I.k(false)) != null) {
                    gj1 gj1Var2 = new gj1(k10.f18701o, (int) k10.f18696j, (int) k10.f18697k, (int) k10.f18698l, (int) k10.f18699m, k10.f18700n, k10.f18702p, k10.f18703q, null);
                    int size = wd1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) wd1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f18701o.equals(tL_wallPaper3.slug)) {
                            gj1Var2.f33871g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = gj1Var2.b();
                } else {
                    return;
                }
                wd1Var.showDialog(new id1(this, wd1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = wd1Var.f38829p1.a();
            nd1 nd1Var = wd1Var.f38829p1;
            if (nd1Var != null) {
                if (!nd1Var.Y0()) {
                    wd1Var.g1();
                    return;
                }
                wd1Var.f38829p1.o1(true);
                org.telegram.ui.Components.xi0 xi0Var = wd1Var.N1;
                xi0Var.h = true;
                if (a2) {
                    xi0Var.P(0);
                } else {
                    xi0Var.P(36);
                }
                wd1Var.N1.start();
                if (wd1Var.M1) {
                    nd1 nd1Var2 = wd1Var.f38829p1;
                    float f7 = 0.0f;
                    if (nd1Var2 != null && nd1Var2.a()) {
                        wd1Var.R1.setVisibility(0);
                        wd1Var.R1.a(wd1Var.f38825n1);
                    } else {
                        wd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = wd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        wd1Var.P1.cancel();
                    }
                    float f10 = wd1Var.f38827o1;
                    if (wd1Var.f38829p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    wd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new a21(this, 14));
                    wd1Var.P1.addListener(new cr0(this, 22));
                    wd1Var.P1.setDuration(250L);
                    wd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f27420f);
                    wd1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = wd1Var.B1;
            if ((obj2 instanceof hj1) && (file = ((hj1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().J2(wd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new jd1(this, photoEntry), null);
            }
        }
    }
}
