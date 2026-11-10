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
public final class qc1 implements org.telegram.ui.ActionBar.r1, tw {
    public final rc1 f49014a;

    public qc1(rc1 rc1Var) {
        this.f49014a = rc1Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(zw zwVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        char c10;
        int i10;
        String str;
        rc1 rc1Var = this.f49014a;
        WallpapersListActivity wallpapersListActivity = rc1Var.f49389a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f43498e0;
        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, parentActivity, null);
        wallpapersListActivity.L = u1Var2;
        char c11 = 0;
        u1Var2.f28558i0 = false;
        u1Var2.show();
        new ArrayList();
        int[] iArr = new int[1];
        iArr[0] = 0;
        int i11 = 0;
        while (i11 < longSparseArray.size()) {
            Object valueAt = longSparseArray.valueAt(i11);
            if (valueAt instanceof tc1) {
                tc1 tc1Var = (tc1) valueAt;
                TLRPC.WallPaper wallPaper = tc1Var.f50243l;
                if (wallPaper != null && wallPaper.f27114id < 0) {
                    org.telegram.messenger.yr messagesStorage = wallpapersListActivity.getMessagesStorage();
                    c10 = c11;
                    messagesStorage.f26723a.c(new org.telegram.messenger.xp(messagesStorage, tc1Var.f50243l.f27114id, 1));
                    wallpapersListActivity.f43493b0.remove(tc1Var);
                    wallpapersListActivity.Z.remove(tc1Var.a());
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
                    tL_inputWallPaperNoFile.f27033id = wallPaper2.f27114id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.f27032id = wallPaper2.f27114id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.O)) {
                    if (org.telegram.ui.ActionBar.m6.g1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.O = str;
                    org.telegram.ui.ActionBar.m6.I.v(null);
                    org.telegram.ui.ActionBar.m6.u1(true);
                }
                i10 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(savewallpaper, new p41(6, rc1Var, iArr));
            }
            i11++;
            c11 = c10;
        }
        if (iArr[c11] == 0) {
            wallpapersListActivity.G0(true);
        }
        longSparseArray.clear();
        z4Var = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
        z4Var.t();
        z4Var2 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
        z4Var2.l(true);
    }

    @Override
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
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
        WallpapersListActivity wallpapersListActivity = this.f49014a.f49389a;
        StringBuilder sb2 = new StringBuilder();
        int i17 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f43498e0;
            if (i17 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i17);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                Typeface typeface = org.telegram.messenger.g0.f22539a;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) valueAt;
                b10 = "https://" + org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).U2 + "/bg/" + tL_wallPaper.slug;
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
                    StringBuilder j3 = rf.b.j(b10, "?mode=");
                    j3.append(sb3.toString());
                    b10 = j3.toString();
                }
            } else if (valueAt instanceof tc1) {
                b10 = ((tc1) valueAt).b();
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
        z4Var = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
        z4Var.t();
        z4Var2 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
        z4Var2.l(true);
        if (arrayList.size() <= 1) {
            long j10 = ((org.telegram.messenger.xr) arrayList.get(0)).f26524a;
            i13 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
            if (j10 != org.telegram.messenger.p10.i(i13).e() && charSequence == null) {
                long j11 = ((org.telegram.messenger.xr) arrayList.get(0)).f26524a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j11)) {
                    k10.putInt("enc_id", (int) (4294967295L & j11));
                } else {
                    if (org.telegram.messenger.m5.E(j11)) {
                        k10.putLong("user_id", j11);
                    } else if (org.telegram.messenger.m5.z(j11)) {
                        k10.putLong("chat_id", -j11);
                    }
                    i14 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                    if (!org.telegram.messenger.qp.s1(i14).E(k10, zwVar, null, null)) {
                        return true;
                    }
                }
                i15 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.qs.f(i15).k(org.telegram.messenger.qs.f25080t, new Object[0]);
                wallpapersListActivity.presentFragment(new cn(k10), true);
                i16 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.gz.C(i16).r0(org.telegram.messenger.ez.b(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.I0();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            long j12 = ((org.telegram.messenger.xr) arrayList.get(i18)).f26524a;
            if (charSequence != null) {
                i12 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.gz.C(i12).r0(org.telegram.messenger.ez.b(charSequence.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i11 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.gz.C(i11).r0(org.telegram.messenger.ez.b(sb2.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        zwVar.finishFragment();
        return true;
    }
}
