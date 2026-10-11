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
    public final wd1 f39306a;

    public kd1(wd1 wd1Var) {
        this.f39306a = wd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.f6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        wd1 wd1Var = this.f39306a;
        org.telegram.ui.ActionBar.f6 f6Var = wd1Var.f43375s;
        int i12 = 0;
        if (i10 == -1) {
            if (wd1Var.Q0(true)) {
                wd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            wd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (wd1Var.v) {
                org.telegram.ui.ActionBar.h6.q1(false);
            }
            File d = f6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = wd1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            f6Var.f20618o = str2;
            f6Var.f20619p = wd1Var.l1;
            f6Var.f20620q = wd1Var.E1;
            if (((int) f6Var.f20613j) == 0) {
                f6Var.f20613j = 4294967296L;
            }
            if (((int) f6Var.f20614k) == 0) {
                f6Var.f20614k = 4294967296L;
            }
            if (((int) f6Var.f20615l) == 0) {
                f6Var.f20615l = 4294967296L;
            }
            if (((int) f6Var.f20616m) == 0) {
                f6Var.f20616m = 4294967296L;
            }
            wd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(wd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.h6.u1(wd1Var.f43340e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.h6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, wd1Var.f43340e0, Boolean.valueOf(wd1Var.f43344f0), null, -1);
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
                    i11 = ((org.telegram.ui.ActionBar.m2) wd1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder j3 = sc.v.j(b10, "?mode=");
                        j3.append(sb2.toString());
                        b10 = j3.toString();
                    }
                } else if (obj instanceof gj1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = wd1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    gj1 gj1Var = new gj1(str, wd1Var.Z0, wd1Var.f43330b1, wd1Var.f43334c1, wd1Var.f43337d1, wd1Var.f43351h1, wd1Var.l1, wd1Var.E1, null);
                    gj1Var.f38116g = tL_wallPaper2;
                    b10 = gj1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.h6.I.k(false)) != null) {
                    gj1 gj1Var2 = new gj1(k10.f20618o, (int) k10.f20613j, (int) k10.f20614k, (int) k10.f20615l, (int) k10.f20616m, k10.f20617n, k10.f20619p, k10.f20620q, null);
                    int size = wd1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) wd1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f20618o.equals(tL_wallPaper3.slug)) {
                            gj1Var2.f38116g = tL_wallPaper3;
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
            boolean a2 = wd1Var.f43369p1.a();
            nd1 nd1Var = wd1Var.f43369p1;
            if (nd1Var != null) {
                if (!nd1Var.T0()) {
                    wd1Var.g1();
                    return;
                }
                wd1Var.f43369p1.l1(true);
                org.telegram.ui.Components.ek0 ek0Var = wd1Var.N1;
                ek0Var.h = true;
                if (a2) {
                    ek0Var.P(0);
                } else {
                    ek0Var.P(36);
                }
                wd1Var.N1.start();
                if (wd1Var.M1) {
                    nd1 nd1Var2 = wd1Var.f43369p1;
                    float f7 = 0.0f;
                    if (nd1Var2 != null && nd1Var2.a()) {
                        wd1Var.R1.setVisibility(0);
                        wd1Var.R1.a(wd1Var.f43365n1);
                    } else {
                        wd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = wd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        wd1Var.P1.cancel();
                    }
                    float f10 = wd1Var.f43367o1;
                    if (wd1Var.f43369p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    wd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new x11(this, 14));
                    wd1Var.P1.addListener(new dp0(this, 23));
                    wd1Var.P1.setDuration(250L);
                    wd1Var.P1.setInterpolator(org.telegram.ui.Components.is.f27451f);
                    wd1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = wd1Var.B1;
            if ((obj2 instanceof hj1) && (file = ((hj1) obj2).f38464e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(wd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new jd1(this, photoEntry), null);
            }
        }
    }
}
