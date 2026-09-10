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
public final class od1 extends org.telegram.ui.ActionBar.k {
    public final ae1 f35470a;

    public od1(ae1 ae1Var) {
        this.f35470a = ae1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.h6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        ae1 ae1Var = this.f35470a;
        org.telegram.ui.ActionBar.h6 h6Var = ae1Var.f30963s;
        int i12 = 0;
        if (i10 == -1) {
            if (ae1Var.Q0(true)) {
                ae1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            ae1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (ae1Var.v) {
                org.telegram.ui.ActionBar.j6.p1(false);
            }
            File d = h6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = ae1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            h6Var.f17803o = str2;
            h6Var.f17804p = ae1Var.l1;
            h6Var.f17805q = ae1Var.E1;
            if (((int) h6Var.f17798j) == 0) {
                h6Var.f17798j = 4294967296L;
            }
            if (((int) h6Var.f17799k) == 0) {
                h6Var.f17799k = 4294967296L;
            }
            if (((int) h6Var.f17800l) == 0) {
                h6Var.f17800l = 4294967296L;
            }
            if (((int) h6Var.f17801m) == 0) {
                h6Var.f17801m = 4294967296L;
            }
            ae1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(ae1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.j6.t1(ae1Var.f30928e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ae1Var.f30928e0, Boolean.valueOf(ae1Var.f30932f0), null, -1);
            ae1Var.finishFragment();
        } else if (i10 == 5) {
            if (ae1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (ae1Var.F1) {
                    sb2.append("blur");
                }
                if (ae1Var.E1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = ae1Var.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.p2) ae1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder g10 = w.f.g(b10, "?mode=");
                        g10.append(sb2.toString());
                        b10 = g10.toString();
                    }
                } else if (obj instanceof kj1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = ae1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    kj1 kj1Var = new kj1(str, ae1Var.Z0, ae1Var.f30919b1, ae1Var.f30923c1, ae1Var.f30926d1, ae1Var.f30939h1, ae1Var.l1, ae1Var.E1, null);
                    kj1Var.f34403g = tL_wallPaper2;
                    b10 = kj1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.j6.I.k(false)) != null) {
                    kj1 kj1Var2 = new kj1(k10.f17803o, (int) k10.f17798j, (int) k10.f17799k, (int) k10.f17800l, (int) k10.f17801m, k10.f17802n, k10.f17804p, k10.f17805q, null);
                    int size = ae1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) ae1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f17803o.equals(tL_wallPaper3.slug)) {
                            kj1Var2.f34403g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = kj1Var2.b();
                } else {
                    return;
                }
                ae1Var.showDialog(new md1(this, ae1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = ae1Var.f30957p1.a();
            rd1 rd1Var = ae1Var.f30957p1;
            if (rd1Var != null) {
                if (!rd1Var.Y0()) {
                    ae1Var.g1();
                    return;
                }
                ae1Var.f30957p1.n1(true);
                org.telegram.ui.Components.hj0 hj0Var = ae1Var.N1;
                hj0Var.h = true;
                if (a2) {
                    hj0Var.P(0);
                } else {
                    hj0Var.P(36);
                }
                ae1Var.N1.start();
                if (ae1Var.M1) {
                    rd1 rd1Var2 = ae1Var.f30957p1;
                    float f7 = 0.0f;
                    if (rd1Var2 != null && rd1Var2.a()) {
                        ae1Var.R1.setVisibility(0);
                        ae1Var.R1.a(ae1Var.f30953n1);
                    } else {
                        ae1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = ae1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ae1Var.P1.cancel();
                    }
                    float f10 = ae1Var.f30955o1;
                    if (ae1Var.f30957p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    ae1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new f21(this, 14));
                    ae1Var.P1.addListener(new mv0(this, 12));
                    ae1Var.P1.setDuration(250L);
                    ae1Var.P1.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                    ae1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = ae1Var.B1;
            if ((obj2 instanceof lj1) && (file = ((lj1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(ae1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new nd1(this, photoEntry), null);
            }
        }
    }
}
