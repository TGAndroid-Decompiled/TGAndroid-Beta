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
public final class dc1 extends org.telegram.ui.ActionBar.j {
    public final pc1 f36583a;

    public dc1(pc1 pc1Var) {
        this.f36583a = pc1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.i6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        pc1 pc1Var = this.f36583a;
        org.telegram.ui.ActionBar.i6 i6Var = pc1Var.v;
        int i12 = 0;
        if (i10 == -1) {
            if (pc1Var.P0(true)) {
                pc1Var.N0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            pc1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (pc1Var.f40501w) {
                org.telegram.ui.ActionBar.k6.s1(false);
            }
            File d = i6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = pc1Var.X0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            i6Var.f20976o = str2;
            i6Var.f20977p = pc1Var.f40479m1;
            i6Var.f20978q = pc1Var.F1;
            if (((int) i6Var.f20971j) == 0) {
                i6Var.f20971j = 4294967296L;
            }
            if (((int) i6Var.f20972k) == 0) {
                i6Var.f20972k = 4294967296L;
            }
            if (((int) i6Var.f20973l) == 0) {
                i6Var.f20973l = 4294967296L;
            }
            if (((int) i6Var.f20974m) == 0) {
                i6Var.f20974m = 4294967296L;
            }
            pc1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(pc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.k6.w1(pc1Var.f40460f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.k6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, pc1Var.f40460f0, Boolean.valueOf(pc1Var.f40463g0), null, -1);
            pc1Var.finishFragment();
        } else if (i10 == 5) {
            if (pc1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (pc1Var.G1) {
                    sb2.append("blur");
                }
                if (pc1Var.F1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = pc1Var.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.o2) pc1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder i13 = si.o0.i(b10, "?mode=");
                        i13.append(sb2.toString());
                        b10 = i13.toString();
                    }
                } else if (obj instanceof yh1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = pc1Var.X0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    yh1 yh1Var = new yh1(str, pc1Var.f40444a1, pc1Var.f40451c1, pc1Var.f40454d1, pc1Var.f40457e1, pc1Var.f40470i1, pc1Var.f40479m1, pc1Var.F1, null);
                    yh1Var.f43867g = tL_wallPaper2;
                    b10 = yh1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.k6.I.k(false)) != null) {
                    yh1 yh1Var2 = new yh1(k10.f20976o, (int) k10.f20971j, (int) k10.f20972k, (int) k10.f20973l, (int) k10.f20974m, k10.f20975n, k10.f20977p, k10.f20978q, null);
                    int size = pc1Var.V0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) pc1Var.V0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f20976o.equals(tL_wallPaper3.slug)) {
                            yh1Var2.f43867g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = yh1Var2.b();
                } else {
                    return;
                }
                pc1Var.showDialog(new bc1(this, pc1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = pc1Var.f40488q1.a();
            gc1 gc1Var = pc1Var.f40488q1;
            if (gc1Var != null) {
                if (!gc1Var.I0()) {
                    pc1Var.g1();
                    return;
                }
                pc1Var.f40488q1.c1(true);
                org.telegram.ui.Components.xj0 xj0Var = pc1Var.O1;
                xj0Var.h = true;
                if (a2) {
                    xj0Var.P(0);
                } else {
                    xj0Var.P(36);
                }
                pc1Var.O1.start();
                if (pc1Var.N1) {
                    gc1 gc1Var2 = pc1Var.f40488q1;
                    float f7 = 0.0f;
                    if (gc1Var2 != null && gc1Var2.a()) {
                        pc1Var.S1.setVisibility(0);
                        pc1Var.S1.a(pc1Var.f40484o1);
                    } else {
                        pc1Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = pc1Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pc1Var.Q1.cancel();
                    }
                    float f10 = pc1Var.f40486p1;
                    if (pc1Var.f40488q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    pc1Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new f11(this, 12));
                    pc1Var.Q1.addListener(new v70(this, 28));
                    pc1Var.Q1.setDuration(250L);
                    pc1Var.Q1.setInterpolator(org.telegram.ui.Components.zr.f33337f);
                    pc1Var.Q1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = pc1Var.C1;
            if ((obj2 instanceof zh1) && (file = ((zh1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.u1().M2(pc1Var.getParentActivity(), null, null);
                PhotoViewer.u1().i2(arrayList, 0, 3, false, new cc1(this, photoEntry), null);
            }
        }
    }
}
