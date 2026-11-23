package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class oc1 implements org.telegram.ui.ActionBar.q1, ww {
    public final pc1 f50543a;

    public oc1(pc1 pc1Var) {
        this.f50543a = pc1Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        char c10;
        int i10;
        String str;
        pc1 pc1Var = this.f50543a;
        WallpapersListActivity wallpapersListActivity = pc1Var.f50832a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f45398f0;
        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, parentActivity, null);
        wallpapersListActivity.M = t1Var2;
        char c11 = 0;
        t1Var2.f29999j0 = false;
        t1Var2.show();
        new ArrayList();
        int[] iArr = new int[1];
        iArr[0] = 0;
        int i11 = 0;
        while (i11 < longSparseArray.size()) {
            Object valueAt = longSparseArray.valueAt(i11);
            if (valueAt instanceof rc1) {
                rc1 rc1Var = (rc1) valueAt;
                TLRPC.WallPaper wallPaper = rc1Var.f51586l;
                if (wallPaper != null && wallPaper.f28552id < 0) {
                    org.telegram.messenger.ur messagesStorage = wallpapersListActivity.getMessagesStorage();
                    c10 = c11;
                    messagesStorage.f27214a.c(new org.telegram.messenger.qp(messagesStorage, rc1Var.f51586l.f28552id, 1));
                    wallpapersListActivity.f45393c0.remove(rc1Var);
                    wallpapersListActivity.f45389a0.remove(rc1Var.a());
                } else {
                    c10 = c11;
                    valueAt = wallPaper;
                }
            } else {
                c10 = c11;
            }
            if (valueAt instanceof TLRPC.WallPaper) {
                iArr[c10] = iArr[c10] + 1;
                TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) valueAt;
                TL_account.saveWallPaper savewallpaper = new TL_account.saveWallPaper();
                savewallpaper.settings = new TLRPC.TL_wallPaperSettings();
                savewallpaper.unsave = true;
                if (valueAt instanceof TLRPC.TL_wallPaperNoFile) {
                    TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                    tL_inputWallPaperNoFile.f28471id = wallPaper2.f28552id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.f28470id = wallPaper2.f28552id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.P)) {
                    if (org.telegram.ui.ActionBar.m6.g1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.P = str;
                    org.telegram.ui.ActionBar.m6.I.v(null);
                    org.telegram.ui.ActionBar.m6.u1(true);
                }
                i10 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(savewallpaper, new e31(8, pc1Var, iArr));
            }
            i11++;
            c11 = c10;
        }
        if (iArr[c11] == 0) {
            wallpapersListActivity.G0(true);
        }
        longSparseArray.clear();
        z4Var = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
        z4Var.w();
        z4Var2 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
        z4Var2.o(true);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String b10;
        WallpapersListActivity wallpapersListActivity = this.f50543a.f50832a;
        StringBuilder sb2 = new StringBuilder();
        int i17 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f45398f0;
            if (i17 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i17);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                Typeface typeface = org.telegram.messenger.g0.f23982a;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) valueAt;
                b10 = "https://" + org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).X2 + "/bg/" + tL_wallPaper.slug;
                StringBuilder sb3 = new StringBuilder();
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                if (wallPaperSettings != null) {
                    if (wallPaperSettings.blur) {
                        sb3.append("blur");
                    }
                    if (tL_wallPaper.settings.motion) {
                        if (sb3.length() > 0) {
                            sb3.append("+");
                        }
                        sb3.append("motion");
                    }
                }
                if (sb3.length() > 0) {
                    StringBuilder n10 = p5.c.n(b10, "?mode=");
                    n10.append(sb3.toString());
                    b10 = n10.toString();
                }
            } else if (valueAt instanceof rc1) {
                b10 = ((rc1) valueAt).b();
            } else {
                i17++;
            }
            if (!TextUtils.isEmpty(b10)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(b10);
            }
            i17++;
        }
        longSparseArray.clear();
        z4Var = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
        z4Var.w();
        z4Var2 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
        z4Var2.o(true);
        if (arrayList.size() <= 1) {
            long j3 = ((org.telegram.messenger.tr) arrayList.get(0)).f27037a;
            i13 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
            if (j3 != org.telegram.messenger.k10.i(i13).e() && charSequence == null) {
                long j10 = ((org.telegram.messenger.tr) arrayList.get(0)).f27037a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.n5.C(j10)) {
                    k10.putInt("enc_id", (int) (4294967295L & j10));
                } else {
                    if (org.telegram.messenger.n5.E(j10)) {
                        k10.putLong("user_id", j10);
                    } else if (org.telegram.messenger.n5.z(j10)) {
                        k10.putLong("chat_id", -j10);
                    }
                    i14 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                    if (!org.telegram.messenger.np.u1(i14).E(k10, cxVar, null, null)) {
                        return true;
                    }
                }
                i15 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.ls.f(i15).k(org.telegram.messenger.ls.f25348t, new Object[0]);
                wallpapersListActivity.presentFragment(new bn(k10), true);
                i16 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.az.C(i16).r0(org.telegram.messenger.yy.b(sb2.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.I0();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            long j11 = ((org.telegram.messenger.tr) arrayList.get(i18)).f27037a;
            if (charSequence != null) {
                i12 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.az.C(i12).r0(org.telegram.messenger.yy.b(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i11 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.az.C(i11).r0(org.telegram.messenger.yy.b(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        cxVar.finishFragment();
        return true;
    }
}
