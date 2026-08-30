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
public final class qc1 extends org.telegram.ui.ActionBar.j {
    public final cd1 f37723a;

    public qc1(cd1 cd1Var) {
        this.f37723a = cd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.h6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        cd1 cd1Var = this.f37723a;
        org.telegram.ui.ActionBar.h6 h6Var = cd1Var.f33333s;
        int i12 = 0;
        if (i10 == -1) {
            if (cd1Var.Q0(true)) {
                cd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            cd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (cd1Var.v) {
                org.telegram.ui.ActionBar.j6.p1(false);
            }
            File d = h6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = cd1Var.T0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            h6Var.f19772o = str2;
            h6Var.f19773p = cd1Var.f33314i1;
            h6Var.f19774q = cd1Var.B1;
            if (((int) h6Var.f19767j) == 0) {
                h6Var.f19767j = 4294967296L;
            }
            if (((int) h6Var.f19768k) == 0) {
                h6Var.f19768k = 4294967296L;
            }
            if (((int) h6Var.f19769l) == 0) {
                h6Var.f19769l = 4294967296L;
            }
            if (((int) h6Var.f19770m) == 0) {
                h6Var.f19770m = 4294967296L;
            }
            cd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(cd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.j6.t1(cd1Var.f33291b0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, cd1Var.f33291b0, Boolean.valueOf(cd1Var.f33295c0), null, -1);
            cd1Var.finishFragment();
        } else if (i10 == 5) {
            if (cd1Var.getParentActivity() != null) {
                StringBuilder sb = new StringBuilder();
                if (cd1Var.C1) {
                    sb.append("blur");
                }
                if (cd1Var.B1) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
                Object obj = cd1Var.f33350y1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb2 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                    sb2.append(MessagesController.getInstance(i11).linkPrefix);
                    sb2.append("/bg/");
                    sb2.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb2.toString();
                    if (sb.length() > 0) {
                        StringBuilder f10 = vh.v2.f(b10, "?mode=");
                        f10.append(sb.toString());
                        b10 = f10.toString();
                    }
                } else if (obj instanceof mi1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = cd1Var.T0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    mi1 mi1Var = new mi1(str, cd1Var.W0, cd1Var.Y0, cd1Var.Z0, cd1Var.f33289a1, cd1Var.f33302e1, cd1Var.f33314i1, cd1Var.B1, null);
                    mi1Var.f36329g = tL_wallPaper2;
                    b10 = mi1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.j6.I.k(false)) != null) {
                    mi1 mi1Var2 = new mi1(k10.f19772o, (int) k10.f19767j, (int) k10.f19768k, (int) k10.f19769l, (int) k10.f19770m, k10.f19771n, k10.f19773p, k10.f19774q, null);
                    int size = cd1Var.R0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) cd1Var.R0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f19772o.equals(tL_wallPaper3.slug)) {
                            mi1Var2.f36329g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = mi1Var2.b();
                } else {
                    return;
                }
                cd1Var.showDialog(new oc1(this, cd1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = cd1Var.f33320m1.a();
            tc1 tc1Var = cd1Var.f33320m1;
            if (tc1Var != null) {
                if (!tc1Var.V0()) {
                    cd1Var.g1();
                    return;
                }
                cd1Var.f33320m1.n1(true);
                org.telegram.ui.Components.gj0 gj0Var = cd1Var.K1;
                gj0Var.h = true;
                if (a2) {
                    gj0Var.N(0);
                } else {
                    gj0Var.N(36);
                }
                cd1Var.K1.start();
                if (cd1Var.J1) {
                    tc1 tc1Var2 = cd1Var.f33320m1;
                    float f11 = 0.0f;
                    if (tc1Var2 != null && tc1Var2.a()) {
                        cd1Var.O1.setVisibility(0);
                        cd1Var.O1.a(cd1Var.f33318k1);
                    } else {
                        cd1Var.O1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = cd1Var.M1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        cd1Var.M1.cancel();
                    }
                    float f12 = cd1Var.l1;
                    if (cd1Var.f33320m1.a()) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    cd1Var.M1 = ofFloat;
                    ofFloat.addUpdateListener(new h11(this, 14));
                    cd1Var.M1.addListener(new ls0(this, 21));
                    cd1Var.M1.setDuration(250L);
                    cd1Var.M1.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                    cd1Var.M1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = cd1Var.f33350y1;
            if ((obj2 instanceof ni1) && (file = ((ni1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(cd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new pc1(this, photoEntry), null);
            }
        }
    }
}
