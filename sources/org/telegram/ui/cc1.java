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
public final class cc1 extends org.telegram.ui.ActionBar.j {
    public final oc1 f37167a;

    public cc1(oc1 oc1Var) {
        this.f37167a = oc1Var;
    }

    @Override
    public final void b(int i9) {
        File file;
        org.telegram.ui.ActionBar.d6 k10;
        String b10;
        String str;
        int i10;
        String str2;
        oc1 oc1Var = this.f37167a;
        org.telegram.ui.ActionBar.d6 d6Var = oc1Var.f41102s;
        int i11 = 0;
        if (i9 == -1) {
            if (oc1Var.Q0(true)) {
                oc1Var.O0(false);
            }
        } else if (i9 >= 1 && i9 <= 3) {
            oc1Var.Y0(i9, true);
        } else if (i9 == 4) {
            if (oc1Var.v) {
                org.telegram.ui.ActionBar.f6.p1(false);
            }
            File d = d6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = oc1Var.S0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            d6Var.f22878o = str2;
            d6Var.f22879p = oc1Var.f41081h1;
            d6Var.f22880q = oc1Var.A1;
            if (((int) d6Var.f22873j) == 0) {
                d6Var.f22873j = 4294967296L;
            }
            if (((int) d6Var.f22874k) == 0) {
                d6Var.f22874k = 4294967296L;
            }
            if (((int) d6Var.f22875l) == 0) {
                d6Var.f22875l = 4294967296L;
            }
            if (((int) d6Var.f22876m) == 0) {
                d6Var.f22876m = 4294967296L;
            }
            oc1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(oc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.f6.t1(oc1Var.f41057a0, true, false, false, true, false);
            org.telegram.ui.ActionBar.f6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, oc1Var.f41057a0, Boolean.valueOf(oc1Var.f41060b0), null, -1);
            oc1Var.finishFragment();
        } else if (i9 == 5) {
            if (oc1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (oc1Var.B1) {
                    sb2.append("blur");
                }
                if (oc1Var.A1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = oc1Var.f41116x1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i10 = ((org.telegram.ui.ActionBar.o2) oc1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i10).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder e10 = ta.b.e(b10, "?mode=");
                        e10.append(sb2.toString());
                        b10 = e10.toString();
                    }
                } else if (obj instanceof xh1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = oc1Var.S0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    xh1 xh1Var = new xh1(str, oc1Var.V0, oc1Var.X0, oc1Var.Y0, oc1Var.Z0, oc1Var.f41068d1, oc1Var.f41081h1, oc1Var.A1, null);
                    xh1Var.f44525g = tL_wallPaper2;
                    b10 = xh1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.f6.I.k(false)) != null) {
                    xh1 xh1Var2 = new xh1(k10.f22878o, (int) k10.f22873j, (int) k10.f22874k, (int) k10.f22875l, (int) k10.f22876m, k10.f22877n, k10.f22879p, k10.f22880q, null);
                    int size = oc1Var.Q0.size();
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) oc1Var.Q0.get(i11);
                        if (tL_wallPaper3.pattern && k10.f22878o.equals(tL_wallPaper3.slug)) {
                            xh1Var2.f44525g = tL_wallPaper3;
                            break;
                        }
                        i11++;
                    }
                    b10 = xh1Var2.b();
                } else {
                    return;
                }
                oc1Var.showDialog(new ac1(this, oc1Var.getParentActivity(), b10, b10));
            }
        } else if (i9 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = oc1Var.l1.a();
            fc1 fc1Var = oc1Var.l1;
            if (fc1Var != null) {
                if (!fc1Var.X0()) {
                    oc1Var.g1();
                    return;
                }
                oc1Var.l1.m1(true);
                org.telegram.ui.Components.mi0 mi0Var = oc1Var.J1;
                mi0Var.h = true;
                if (a2) {
                    mi0Var.N(0);
                } else {
                    mi0Var.N(36);
                }
                oc1Var.J1.start();
                if (oc1Var.I1) {
                    fc1 fc1Var2 = oc1Var.l1;
                    float f10 = 0.0f;
                    if (fc1Var2 != null && fc1Var2.a()) {
                        oc1Var.N1.setVisibility(0);
                        oc1Var.N1.a(oc1Var.f41085j1);
                    } else {
                        oc1Var.N1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = oc1Var.L1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        oc1Var.L1.cancel();
                    }
                    float f11 = oc1Var.f41087k1;
                    if (oc1Var.l1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    oc1Var.L1 = ofFloat;
                    ofFloat.addUpdateListener(new v01(this, 14));
                    oc1Var.L1.addListener(new bc0(this, 28));
                    oc1Var.L1.setDuration(250L);
                    oc1Var.L1.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                    oc1Var.L1.start();
                }
            }
        } else if (i9 == 7) {
            Object obj2 = oc1Var.f41116x1;
            if ((obj2 instanceof yh1) && (file = ((yh1) obj2).f44880e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(oc1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new bc1(this, photoEntry), null);
            }
        }
    }
}
