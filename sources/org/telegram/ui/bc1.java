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

public final class bc1 extends org.telegram.ui.ActionBar.j {

    public final nc1 f36778a;

    public bc1(nc1 nc1Var) {
        this.f36778a = nc1Var;
    }

    @Override
    public final void b(int i10) throws Throwable {
        File file;
        org.telegram.ui.ActionBar.e6 e6VarK;
        String strB;
        nc1 nc1Var = this.f36778a;
        org.telegram.ui.ActionBar.e6 e6Var = nc1Var.f40781s;
        if (i10 == -1) {
            if (nc1Var.Q0(true)) {
                nc1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            nc1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (nc1Var.v) {
                org.telegram.ui.ActionBar.g6.p1(false);
            }
            File fileD = e6Var.d();
            if (fileD != null) {
                fileD.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = nc1Var.S0;
            e6Var.f22895o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            e6Var.f22896p = nc1Var.f40760h1;
            e6Var.f22897q = nc1Var.A1;
            if (((int) e6Var.f22890j) == 0) {
                e6Var.f22890j = 4294967296L;
            }
            if (((int) e6Var.f22891k) == 0) {
                e6Var.f22891k = 4294967296L;
            }
            if (((int) e6Var.f22892l) == 0) {
                e6Var.f22892l = 4294967296L;
            }
            if (((int) e6Var.f22893m) == 0) {
                e6Var.f22893m = 4294967296L;
            }
            nc1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(nc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.g6.t1(nc1Var.f40736a0, true, false, false, true, false);
            org.telegram.ui.ActionBar.g6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, nc1Var.f40736a0, Boolean.valueOf(nc1Var.f40739b0), null, -1);
            nc1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (nc1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (nc1Var.B1) {
                sb2.append("blur");
            }
            if (nc1Var.A1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = nc1Var.f40795x1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                strB = "https://" + MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) nc1Var).currentAccount).linkPrefix + "/bg/" + ((TLRPC.TL_wallPaper) obj).slug;
                if (sb2.length() > 0) {
                    StringBuilder sbF = s3.c.f(strB, "?mode=");
                    sbF.append(sb2.toString());
                    strB = sbF.toString();
                }
            } else if (obj instanceof wh1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.S0;
                wh1 wh1Var = new wh1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", nc1Var.V0, nc1Var.X0, nc1Var.Y0, nc1Var.Z0, nc1Var.f40747d1, nc1Var.f40760h1, nc1Var.A1, null);
                wh1Var.f44125g = tL_wallPaper2;
                strB = wh1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (e6VarK = org.telegram.ui.ActionBar.g6.I.k(false)) == null) {
                    return;
                }
                wh1 wh1Var2 = new wh1(e6VarK.f22895o, (int) e6VarK.f22890j, (int) e6VarK.f22891k, (int) e6VarK.f22892l, (int) e6VarK.f22893m, e6VarK.f22894n, e6VarK.f22896p, e6VarK.f22897q, null);
                int size = nc1Var.Q0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) nc1Var.Q0.get(i11);
                    if (tL_wallPaper3.pattern && e6VarK.f22895o.equals(tL_wallPaper3.slug)) {
                        wh1Var2.f44125g = tL_wallPaper3;
                        break;
                    }
                }
                strB = wh1Var2.b();
            }
            nc1Var.showDialog(new yb1(this, nc1Var.getParentActivity(), strB, strB));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = nc1Var.f40795x1;
                if (!(obj2 instanceof xh1) || (file = ((xh1) obj2).f44470e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(nc1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new ac1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean zA = nc1Var.l1.a();
        ec1 ec1Var = nc1Var.l1;
        if (ec1Var != null) {
            if (!ec1Var.X0()) {
                nc1Var.g1();
                return;
            }
            nc1Var.l1.n1(true);
            org.telegram.ui.Components.oi0 oi0Var = nc1Var.J1;
            oi0Var.h = true;
            if (zA) {
                oi0Var.N(0);
            } else {
                oi0Var.N(36);
            }
            nc1Var.J1.start();
            if (nc1Var.I1) {
                ec1 ec1Var2 = nc1Var.l1;
                if (ec1Var2 == null || !ec1Var2.a()) {
                    nc1Var.N1.a(0.0f);
                } else {
                    nc1Var.N1.setVisibility(0);
                    nc1Var.N1.a(nc1Var.f40764j1);
                }
                ValueAnimator valueAnimator = nc1Var.L1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nc1Var.L1.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(nc1Var.f40766k1, nc1Var.l1.a() ? 1.0f : 0.0f);
                nc1Var.L1 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new w01(this, 14));
                nc1Var.L1.addListener(new zb1(this, 0));
                nc1Var.L1.setDuration(250L);
                nc1Var.L1.setInterpolator(org.telegram.ui.Components.er.f28122f);
                nc1Var.L1.start();
            }
        }
    }
}
