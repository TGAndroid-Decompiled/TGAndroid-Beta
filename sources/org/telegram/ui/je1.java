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
public final class je1 implements org.telegram.ui.ActionBar.u1, ux {
    public final ke1 f38509a;

    public je1(ke1 ke1Var) {
        this.f38509a = ke1Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        char c10;
        int i11;
        String str;
        ke1 ke1Var = this.f38509a;
        WallpapersListActivity wallpapersListActivity = ke1Var.f38786a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f35481e0;
        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, parentActivity, null);
        wallpapersListActivity.L = x1Var2;
        char c11 = 0;
        x1Var2.f21488i0 = false;
        x1Var2.show();
        new ArrayList();
        int[] iArr = new int[1];
        iArr[0] = 0;
        int i12 = 0;
        while (i12 < longSparseArray.size()) {
            Object valueAt = longSparseArray.valueAt(i12);
            if (valueAt instanceof me1) {
                me1 me1Var = (me1) valueAt;
                TLRPC.WallPaper wallPaper = me1Var.f39694l;
                if (wallPaper != null && wallPaper.f19947id < 0) {
                    org.telegram.messenger.hs messagesStorage = wallpapersListActivity.getMessagesStorage();
                    c10 = c11;
                    messagesStorage.f15938a.c(new org.telegram.messenger.cq(messagesStorage, me1Var.f39694l.f19947id, 1));
                    wallpapersListActivity.f35477b0.remove(me1Var);
                    wallpapersListActivity.Z.remove(me1Var.a());
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
                    tL_inputWallPaperNoFile.f19866id = wallPaper2.f19947id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.f19865id = wallPaper2.f19947id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.O)) {
                    if (org.telegram.ui.ActionBar.t6.g1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.O = str;
                    org.telegram.ui.ActionBar.t6.I.v(null);
                    org.telegram.ui.ActionBar.t6.u1(true);
                }
                i11 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(savewallpaper, new ul0(20, ke1Var, iArr));
            }
            i12++;
            c11 = c10;
        }
        if (iArr[c11] == 0) {
            wallpapersListActivity.F0(true);
        }
        longSparseArray.clear();
        i5Var = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
        i5Var.r();
        i5Var2 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
        i5Var2.j(true);
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String b10;
        WallpapersListActivity wallpapersListActivity = this.f38509a.f38786a;
        StringBuilder sb2 = new StringBuilder();
        int i18 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f35481e0;
            if (i18 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i18);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                Typeface typeface = org.telegram.messenger.i0.f15999a;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) valueAt;
                b10 = "https://" + org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).U2 + "/bg/" + tL_wallPaper.slug;
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
                    StringBuilder i19 = sc.e.i(b10, "?mode=");
                    i19.append(sb3.toString());
                    b10 = i19.toString();
                }
            } else if (valueAt instanceof me1) {
                b10 = ((me1) valueAt).b();
            } else {
                i18++;
            }
            if (!TextUtils.isEmpty(b10)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(b10);
            }
            i18++;
        }
        longSparseArray.clear();
        i5Var = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
        i5Var.r();
        i5Var2 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
        i5Var2.j(true);
        if (arrayList.size() <= 1) {
            long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).f15760a;
            i14 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
            if (j10 != org.telegram.messenger.d20.i(i14).e() && charSequence == null) {
                long j11 = ((org.telegram.messenger.gs) arrayList.get(0)).f15760a;
                Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                if (org.telegram.messenger.o5.C(j11)) {
                    g10.putInt("enc_id", (int) (4294967295L & j11));
                } else {
                    if (org.telegram.messenger.o5.E(j11)) {
                        g10.putLong("user_id", j11);
                    } else if (org.telegram.messenger.o5.z(j11)) {
                        g10.putLong("chat_id", -j11);
                    }
                    i15 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                    if (!org.telegram.messenger.vp.r1(i15).E(g10, ayVar, null, null)) {
                        return true;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.zs.f(i16).k(org.telegram.messenger.zs.f19690t, new Object[0]);
                wallpapersListActivity.presentFragment(new un(g10), true);
                i17 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.qz.C(i17).r0(org.telegram.messenger.oz.b(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.H0();
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            long j12 = ((org.telegram.messenger.gs) arrayList.get(i20)).f15760a;
            if (charSequence != null) {
                i13 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.qz.C(i13).r0(org.telegram.messenger.oz.b(charSequence.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i12 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.qz.C(i12).r0(org.telegram.messenger.oz.b(sb2.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        ayVar.finishFragment();
        return true;
    }
}
