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
public final class jj1 implements org.telegram.ui.ActionBar.z1, sy {
    public final lj1 f37081a;

    public jj1(lj1 lj1Var) {
        this.f37081a = lj1Var;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean L(yy yyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        String str;
        lj1 lj1Var = this.f37081a;
        WallpapersListActivity wallpapersListActivity = lj1Var.f37773a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f33690i0;
        org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(parentActivity, 3, null);
        wallpapersListActivity.P = a2Var2;
        a2Var2.f19269g0 = false;
        a2Var2.show();
        new ArrayList();
        int[] iArr = {0};
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            Object valueAt = longSparseArray.valueAt(i12);
            if (valueAt instanceof oj1) {
                oj1 oj1Var = (oj1) valueAt;
                TLRPC.WallPaper wallPaper = oj1Var.f38695l;
                if (wallPaper != null && wallPaper.f19068id < 0) {
                    wallpapersListActivity.getMessagesStorage().deleteWallpaper(oj1Var.f38695l.f19068id);
                    wallpapersListActivity.f33687f0.remove(oj1Var);
                    wallpapersListActivity.f33684d0.remove(oj1Var.a());
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
                    tL_inputWallPaperNoFile.f18989id = wallPaper2.f19068id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.f18988id = wallPaper2.f19068id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.S)) {
                    if (org.telegram.ui.ActionBar.g6.e1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.S = str;
                    org.telegram.ui.ActionBar.g6.I.v(null);
                    org.telegram.ui.ActionBar.g6.p1(true);
                }
                i11 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(savewallpaper, new kj1(0, lj1Var, iArr));
            }
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.B0(true);
        }
        longSparseArray.clear();
        kVar = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).actionBar;
        kVar.s();
        kVar2 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).actionBar;
        kVar2.h(true);
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
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
        WallpapersListActivity wallpapersListActivity = this.f37081a.f37773a;
        StringBuilder sb2 = new StringBuilder();
        int i18 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f33690i0;
            if (i18 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i18);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                b10 = AndroidUtilities.getWallPaperUrl(valueAt);
            } else if (valueAt instanceof oj1) {
                b10 = ((oj1) valueAt).b();
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
        kVar = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).actionBar;
        kVar.s();
        kVar2 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).actionBar;
        kVar2.h(true);
        if (arrayList.size() <= 1) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            i14 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
            if (j10 != UserConfig.getInstance(i14).getClientUserId() && charSequence == null) {
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    h.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else {
                    if (DialogObject.isUserDialog(j11)) {
                        h.putLong("user_id", j11);
                    } else if (DialogObject.isChatDialog(j11)) {
                        h.putLong("chat_id", -j11);
                    }
                    i15 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                    if (!MessagesController.getInstance(i15).checkCanOpenChat(h, yyVar)) {
                        return true;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                wallpapersListActivity.presentFragment(new fo(h), true);
                i17 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i17).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.D0();
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            long j12 = ((MessagesStorage.TopicKey) arrayList.get(i19)).dialogId;
            if (charSequence != null) {
                i13 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i13).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i12 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i12).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        yyVar.finishFragment();
        return true;
    }
}
