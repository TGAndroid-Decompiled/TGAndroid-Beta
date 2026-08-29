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
public final class ec1 extends org.telegram.ui.ActionBar.k {
    public final qc1 f37790a;

    public ec1(qc1 qc1Var) {
        this.f37790a = qc1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.e6 k9;
        String b10;
        String str;
        int i11;
        String str2;
        qc1 qc1Var = this.f37790a;
        org.telegram.ui.ActionBar.e6 e6Var = qc1Var.f41669s;
        int i12 = 0;
        if (i10 == -1) {
            if (qc1Var.Q0(true)) {
                qc1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            qc1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (qc1Var.v) {
                org.telegram.ui.ActionBar.g6.p1(false);
            }
            File d = e6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = qc1Var.S0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            e6Var.f22914o = str2;
            e6Var.f22915p = qc1Var.f41648h1;
            e6Var.f22916q = qc1Var.A1;
            if (((int) e6Var.f22909j) == 0) {
                e6Var.f22909j = 4294967296L;
            }
            if (((int) e6Var.f22910k) == 0) {
                e6Var.f22910k = 4294967296L;
            }
            if (((int) e6Var.f22911l) == 0) {
                e6Var.f22911l = 4294967296L;
            }
            if (((int) e6Var.f22912m) == 0) {
                e6Var.f22912m = 4294967296L;
            }
            qc1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(qc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.g6.t1(qc1Var.f41624a0, true, false, false, true, false);
            org.telegram.ui.ActionBar.g6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, qc1Var.f41624a0, Boolean.valueOf(qc1Var.f41627b0), null, -1);
            qc1Var.finishFragment();
        } else if (i10 == 5) {
            if (qc1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (qc1Var.B1) {
                    sb2.append("blur");
                }
                if (qc1Var.A1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = qc1Var.f41683x1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder f9 = u3.c.f(b10, "?mode=");
                        f9.append(sb2.toString());
                        b10 = f9.toString();
                    }
                } else if (obj instanceof zh1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = qc1Var.S0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    zh1 zh1Var = new zh1(str, qc1Var.V0, qc1Var.X0, qc1Var.Y0, qc1Var.Z0, qc1Var.f41635d1, qc1Var.f41648h1, qc1Var.A1, null);
                    zh1Var.f45230g = tL_wallPaper2;
                    b10 = zh1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k9 = org.telegram.ui.ActionBar.g6.I.k(false)) != null) {
                    zh1 zh1Var2 = new zh1(k9.f22914o, (int) k9.f22909j, (int) k9.f22910k, (int) k9.f22911l, (int) k9.f22912m, k9.f22913n, k9.f22915p, k9.f22916q, null);
                    int size = qc1Var.Q0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) qc1Var.Q0.get(i12);
                        if (tL_wallPaper3.pattern && k9.f22914o.equals(tL_wallPaper3.slug)) {
                            zh1Var2.f45230g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = zh1Var2.b();
                } else {
                    return;
                }
                qc1Var.showDialog(new bc1(this, qc1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = qc1Var.l1.a();
            hc1 hc1Var = qc1Var.l1;
            if (hc1Var != null) {
                if (!hc1Var.U0()) {
                    qc1Var.g1();
                    return;
                }
                qc1Var.l1.j1(true);
                org.telegram.ui.Components.xi0 xi0Var = qc1Var.J1;
                xi0Var.h = true;
                if (a2) {
                    xi0Var.N(0);
                } else {
                    xi0Var.N(36);
                }
                qc1Var.J1.start();
                if (qc1Var.I1) {
                    hc1 hc1Var2 = qc1Var.l1;
                    float f10 = 0.0f;
                    if (hc1Var2 != null && hc1Var2.a()) {
                        qc1Var.N1.setVisibility(0);
                        qc1Var.N1.a(qc1Var.f41652j1);
                    } else {
                        qc1Var.N1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = qc1Var.L1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        qc1Var.L1.cancel();
                    }
                    float f11 = qc1Var.f41654k1;
                    if (qc1Var.l1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    qc1Var.L1 = ofFloat;
                    ofFloat.addUpdateListener(new w01(this, 14));
                    qc1Var.L1.addListener(new cc1(this, 0));
                    qc1Var.L1.setDuration(250L);
                    qc1Var.L1.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                    qc1Var.L1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = qc1Var.f41683x1;
            if ((obj2 instanceof ai1) && (file = ((ai1) obj2).f36560e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(qc1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new dc1(this, photoEntry), null);
            }
        }
    }
}
