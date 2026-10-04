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
public final class fd1 extends org.telegram.ui.ActionBar.j {
    public final rd1 f36281a;

    public fd1(rd1 rd1Var) {
        this.f36281a = rd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.f6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        rd1 rd1Var = this.f36281a;
        org.telegram.ui.ActionBar.f6 f6Var = rd1Var.f40087s;
        int i12 = 0;
        if (i10 == -1) {
            if (rd1Var.Q0(true)) {
                rd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            rd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (rd1Var.v) {
                org.telegram.ui.ActionBar.i6.p1(false);
            }
            File d = f6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = rd1Var.W0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            f6Var.f20627o = str2;
            f6Var.f20628p = rd1Var.l1;
            f6Var.f20629q = rd1Var.E1;
            if (((int) f6Var.f20622j) == 0) {
                f6Var.f20622j = 4294967296L;
            }
            if (((int) f6Var.f20623k) == 0) {
                f6Var.f20623k = 4294967296L;
            }
            if (((int) f6Var.f20624l) == 0) {
                f6Var.f20624l = 4294967296L;
            }
            if (((int) f6Var.f20625m) == 0) {
                f6Var.f20625m = 4294967296L;
            }
            rd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(rd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.i6.t1(rd1Var.f40052e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.i6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, rd1Var.f40052e0, Boolean.valueOf(rd1Var.f40056f0), null, -1);
            rd1Var.finishFragment();
        } else if (i10 == 5) {
            if (rd1Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (rd1Var.F1) {
                    sb2.append("blur");
                }
                if (rd1Var.E1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = rd1Var.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.n2) rd1Var).currentAccount;
                    sb3.append(MessagesController.getInstance(i11).linkPrefix);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder j3 = sa.e.j(b10, "?mode=");
                        j3.append(sb2.toString());
                        b10 = j3.toString();
                    }
                } else if (obj instanceof yi1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = rd1Var.W0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    yi1 yi1Var = new yi1(str, rd1Var.Z0, rd1Var.f40042b1, rd1Var.f40046c1, rd1Var.f40049d1, rd1Var.f40063h1, rd1Var.l1, rd1Var.E1, null);
                    yi1Var.f43244g = tL_wallPaper2;
                    b10 = yi1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.i6.I.k(false)) != null) {
                    yi1 yi1Var2 = new yi1(k10.f20627o, (int) k10.f20622j, (int) k10.f20623k, (int) k10.f20624l, (int) k10.f20625m, k10.f20626n, k10.f20628p, k10.f20629q, null);
                    int size = rd1Var.U0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) rd1Var.U0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f20627o.equals(tL_wallPaper3.slug)) {
                            yi1Var2.f43244g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = yi1Var2.b();
                } else {
                    return;
                }
                rd1Var.showDialog(new dd1(this, rd1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = rd1Var.f40081p1.a();
            id1 id1Var = rd1Var.f40081p1;
            if (id1Var != null) {
                if (!id1Var.a1()) {
                    rd1Var.g1();
                    return;
                }
                rd1Var.f40081p1.q1(true);
                org.telegram.ui.Components.kj0 kj0Var = rd1Var.N1;
                kj0Var.h = true;
                if (a2) {
                    kj0Var.P(0);
                } else {
                    kj0Var.P(36);
                }
                rd1Var.N1.start();
                if (rd1Var.M1) {
                    id1 id1Var2 = rd1Var.f40081p1;
                    float f7 = 0.0f;
                    if (id1Var2 != null && id1Var2.a()) {
                        rd1Var.R1.setVisibility(0);
                        rd1Var.R1.a(rd1Var.f40077n1);
                    } else {
                        rd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = rd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        rd1Var.P1.cancel();
                    }
                    float f10 = rd1Var.f40079o1;
                    if (rd1Var.f40081p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    rd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new b21(this, 13));
                    rd1Var.P1.addListener(new ap0(this, 23));
                    rd1Var.P1.setDuration(250L);
                    rd1Var.P1.setInterpolator(org.telegram.ui.Components.tr.f31147f);
                    rd1Var.P1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = rd1Var.B1;
            if ((obj2 instanceof zi1) && (file = ((zi1) obj2).f43838e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(rd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new ed1(this, photoEntry), null);
            }
        }
    }
}
