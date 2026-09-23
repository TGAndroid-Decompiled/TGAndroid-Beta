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
public final class cd1 extends org.telegram.ui.ActionBar.j {
    public final od1 f32316a;

    public cd1(od1 od1Var) {
        this.f32316a = od1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.f6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        od1 od1Var = this.f32316a;
        org.telegram.ui.ActionBar.f6 f6Var = od1Var.f35829s;
        int i12 = 0;
        if (i10 == -1) {
            if (od1Var.Q0(true)) {
                od1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            od1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (od1Var.v) {
                org.telegram.ui.ActionBar.h6.p1(false);
            }
            File d = f6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = od1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            f6Var.f18647o = str2;
            f6Var.f18648p = od1Var.l1;
            f6Var.f18649q = od1Var.E1;
            if (((int) f6Var.f18642j) == 0) {
                f6Var.f18642j = 4294967296L;
            }
            if (((int) f6Var.f18643k) == 0) {
                f6Var.f18643k = 4294967296L;
            }
            if (((int) f6Var.f18644l) == 0) {
                f6Var.f18644l = 4294967296L;
            }
            if (((int) f6Var.f18645m) == 0) {
                f6Var.f18645m = 4294967296L;
            }
            od1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(od1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.h6.t1(od1Var.f35794e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.h6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, od1Var.f35794e0, Boolean.valueOf(od1Var.f35798f0), null, -1);
            od1Var.finishFragment();
        } else if (i10 == 5) {
            if (od1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (od1Var.F1) {
                    sb2.append("blur");
                }
                if (od1Var.E1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = od1Var.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.n2) od1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder h = w.c.h(b10, "?mode=");
                        h.append(sb2.toString());
                        b10 = h.toString();
                    }
                } else if (obj instanceof yi1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = od1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    yi1 yi1Var = new yi1(str, od1Var.Z0, od1Var.f35785b1, od1Var.f35789c1, od1Var.f35792d1, od1Var.f35805h1, od1Var.l1, od1Var.E1, null);
                    yi1Var.f39837g = tL_wallPaper2;
                    b10 = yi1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.h6.I.k(false)) != null) {
                    yi1 yi1Var2 = new yi1(k10.f18647o, (int) k10.f18642j, (int) k10.f18643k, (int) k10.f18644l, (int) k10.f18645m, k10.f18646n, k10.f18648p, k10.f18649q, null);
                    int size = od1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) od1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f18647o.equals(tL_wallPaper3.slug)) {
                            yi1Var2.f39837g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = yi1Var2.b();
                } else {
                    return;
                }
                od1Var.showDialog(new ad1(this, od1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = od1Var.f35823p1.a();
            fd1 fd1Var = od1Var.f35823p1;
            if (fd1Var != null) {
                if (!fd1Var.Y0()) {
                    od1Var.g1();
                    return;
                }
                od1Var.f35823p1.o1(true);
                org.telegram.ui.Components.yi0 yi0Var = od1Var.N1;
                yi0Var.h = true;
                if (a2) {
                    yi0Var.P(0);
                } else {
                    yi0Var.P(36);
                }
                od1Var.N1.start();
                if (od1Var.M1) {
                    fd1 fd1Var2 = od1Var.f35823p1;
                    float f7 = 0.0f;
                    if (fd1Var2 != null && fd1Var2.a()) {
                        od1Var.R1.setVisibility(0);
                        od1Var.R1.a(od1Var.f35819n1);
                    } else {
                        od1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = od1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        od1Var.P1.cancel();
                    }
                    float f10 = od1Var.f35821o1;
                    if (od1Var.f35823p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    od1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new s11(this, 14));
                    od1Var.P1.addListener(new wq0(this, 22));
                    od1Var.P1.setDuration(250L);
                    od1Var.P1.setInterpolator(org.telegram.ui.Components.rr.f27701f);
                    od1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = od1Var.B1;
            if ((obj2 instanceof zi1) && (file = ((zi1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().J2(od1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new bd1(this, photoEntry), null);
            }
        }
    }
}
