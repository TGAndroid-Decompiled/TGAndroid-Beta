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
public final class qd1 extends org.telegram.ui.ActionBar.j {
    public final ce1 f39392a;

    public qd1(ce1 ce1Var) {
        this.f39392a = ce1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.e6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        ce1 ce1Var = this.f39392a;
        org.telegram.ui.ActionBar.e6 e6Var = ce1Var.f34902s;
        int i12 = 0;
        if (i10 == -1) {
            if (ce1Var.Q0(true)) {
                ce1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            ce1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (ce1Var.v) {
                org.telegram.ui.ActionBar.g6.q1(false);
            }
            File d = e6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = ce1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            e6Var.f19756o = str2;
            e6Var.f19757p = ce1Var.l1;
            e6Var.f19758q = ce1Var.E1;
            if (((int) e6Var.f19751j) == 0) {
                e6Var.f19751j = 4294967296L;
            }
            if (((int) e6Var.f19752k) == 0) {
                e6Var.f19752k = 4294967296L;
            }
            if (((int) e6Var.f19753l) == 0) {
                e6Var.f19753l = 4294967296L;
            }
            if (((int) e6Var.f19754m) == 0) {
                e6Var.f19754m = 4294967296L;
            }
            ce1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(ce1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.g6.u1(ce1Var.f34867e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.g6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ce1Var.f34867e0, Boolean.valueOf(ce1Var.f34871f0), null, -1);
            ce1Var.finishFragment();
        } else if (i10 == 5) {
            if (ce1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (ce1Var.F1) {
                    sb2.append("blur");
                }
                if (ce1Var.E1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = ce1Var.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.m2) ce1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder i13 = t8.b.i(b10, "?mode=");
                        i13.append(sb2.toString());
                        b10 = i13.toString();
                    }
                } else if (obj instanceof pj1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = ce1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    pj1 pj1Var = new pj1(str, ce1Var.Z0, ce1Var.f34858b1, ce1Var.f34862c1, ce1Var.f34865d1, ce1Var.f34878h1, ce1Var.l1, ce1Var.E1, null);
                    pj1Var.f39250g = tL_wallPaper2;
                    b10 = pj1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.g6.I.k(false)) != null) {
                    pj1 pj1Var2 = new pj1(k10.f19756o, (int) k10.f19751j, (int) k10.f19752k, (int) k10.f19753l, (int) k10.f19754m, k10.f19755n, k10.f19757p, k10.f19758q, null);
                    int size = ce1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) ce1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f19756o.equals(tL_wallPaper3.slug)) {
                            pj1Var2.f39250g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = pj1Var2.b();
                } else {
                    return;
                }
                ce1Var.showDialog(new od1(this, ce1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = ce1Var.f34896p1.a();
            td1 td1Var = ce1Var.f34896p1;
            if (td1Var != null) {
                if (!td1Var.Y0()) {
                    ce1Var.g1();
                    return;
                }
                ce1Var.f34896p1.o1(true);
                org.telegram.ui.Components.yj0 yj0Var = ce1Var.N1;
                yj0Var.h = true;
                if (a2) {
                    yj0Var.P(0);
                } else {
                    yj0Var.P(36);
                }
                ce1Var.N1.start();
                if (ce1Var.M1) {
                    td1 td1Var2 = ce1Var.f34896p1;
                    float f7 = 0.0f;
                    if (td1Var2 != null && td1Var2.a()) {
                        ce1Var.R1.setVisibility(0);
                        ce1Var.R1.a(ce1Var.f34892n1);
                    } else {
                        ce1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = ce1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ce1Var.P1.cancel();
                    }
                    float f10 = ce1Var.f34894o1;
                    if (ce1Var.f34896p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    ce1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new f21(this, 14));
                    ce1Var.P1.addListener(new lj0(this, 26));
                    ce1Var.P1.setDuration(250L);
                    ce1Var.P1.setInterpolator(org.telegram.ui.Components.es.f24771f);
                    ce1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = ce1Var.B1;
            if ((obj2 instanceof qj1) && (file = ((qj1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(ce1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new pd1(this, photoEntry), null);
            }
        }
    }
}
