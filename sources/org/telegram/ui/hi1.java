package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hi1 implements org.telegram.ui.ActionBar.c2, iy {
    public final ji1 f34886a;

    public hi1(ji1 ji1Var) {
        this.f34886a = ji1Var;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(oy oyVar) {
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        String str;
        ji1 ji1Var = this.f34886a;
        WallpapersListActivity wallpapersListActivity = ji1Var.f35361a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f32411f0;
        org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(parentActivity, 3, null);
        wallpapersListActivity.M = d2Var2;
        d2Var2.f19590d0 = false;
        d2Var2.show();
        new ArrayList();
        int[] iArr = {0};
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            Object valueAt = longSparseArray.valueAt(i12);
            if (valueAt instanceof mi1) {
                mi1 mi1Var = (mi1) valueAt;
                TLRPC.WallPaper wallPaper = mi1Var.f36333l;
                if (wallPaper != null && wallPaper.f19336id < 0) {
                    wallpapersListActivity.getMessagesStorage().deleteWallpaper(mi1Var.f36333l.f19336id);
                    wallpapersListActivity.f32407c0.remove(mi1Var);
                    wallpapersListActivity.f32403a0.remove(mi1Var.a());
                } else {
                    valueAt = wallPaper;
                }
            }
            if (valueAt instanceof TLRPC.WallPaper) {
                iArr[0] = iArr[0] + 1;
                TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) valueAt;
                TL_account.saveWallPaper savewallpaper = new TL_account.saveWallPaper();
                savewallpaper.settings = new TLRPC.TL_wallPaperSettings();
                savewallpaper.unsave = true;
                if (valueAt instanceof TLRPC.TL_wallPaperNoFile) {
                    TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                    tL_inputWallPaperNoFile.f19257id = wallPaper2.f19336id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.f19256id = wallPaper2.f19336id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.P)) {
                    if (org.telegram.ui.ActionBar.j6.d1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.P = str;
                    org.telegram.ui.ActionBar.j6.I.v(null);
                    org.telegram.ui.ActionBar.j6.o1(true);
                }
                i11 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(savewallpaper, new ii1(0, ji1Var, iArr));
            }
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.B0(true);
        }
        longSparseArray.clear();
        kVar = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
        kVar.r();
        kVar2 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
        kVar2.h(true);
    }

    @Override
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String b10;
        WallpapersListActivity wallpapersListActivity = this.f34886a.f35361a;
        StringBuilder sb = new StringBuilder();
        int i18 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f32411f0;
            if (i18 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i18);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                b10 = AndroidUtilities.getWallPaperUrl(valueAt);
            } else if (valueAt instanceof mi1) {
                b10 = ((mi1) valueAt).b();
            } else {
                i18++;
            }
            if (!TextUtils.isEmpty(b10)) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(b10);
            }
            i18++;
        }
        longSparseArray.clear();
        kVar = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
        kVar.r();
        kVar2 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
        kVar2.h(true);
        if (arrayList.size() <= 1) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            i14 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
            if (j10 != UserConfig.getInstance(i14).getClientUserId() && charSequence == null) {
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i19 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i19.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else {
                    if (DialogObject.isUserDialog(j11)) {
                        i19.putLong("user_id", j11);
                    } else if (DialogObject.isChatDialog(j11)) {
                        i19.putLong("chat_id", -j11);
                    }
                    i15 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                    if (!MessagesController.getInstance(i15).checkCanOpenChat(i19, oyVar)) {
                        return true;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                wallpapersListActivity.presentFragment(new xn(i19), true);
                i17 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i17).sendMessage(SendMessagesHelper.SendMessageParams.of(sb.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.D0();
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            long j12 = ((MessagesStorage.TopicKey) arrayList.get(i20)).dialogId;
            if (charSequence != null) {
                i13 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i13).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb)) {
                i12 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i12).sendMessage(SendMessagesHelper.SendMessageParams.of(sb.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        oyVar.finishFragment();
        return true;
    }
}
