package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.we1;

public final class cq0 implements j10, org.telegram.ui.zx {

    public final hu0 f27532a;

    public cq0(hu0 hu0Var) {
        this.f27532a = hu0Var;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.gy gyVar) {
        return false;
    }

    public void a(boolean z10) {
        hu0 hu0Var = this.f27532a;
        if (!z10) {
            hu0Var.requestLayout();
        }
        hu0Var.setVisibleHeight(hu0Var.I1);
    }

    @Override
    public boolean w(org.telegram.ui.gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        hu0 hu0Var = this.f27532a;
        SparseArray[] sparseArrayArr = hu0Var.V0;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        int i12 = 1;
        while (true) {
            int i13 = 0;
            if (i12 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < sparseArrayArr[i12].size(); i14++) {
                arrayList3.add(Integer.valueOf(sparseArrayArr[i12].keyAt(i14)));
            }
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    arrayList2.add((MessageObject) sparseArrayArr[i12].get(num.intValue()));
                }
            }
            sparseArrayArr[i12].clear();
            i12--;
        }
        hu0Var.W0 = 0;
        hu0Var.b1(false);
        qt0 qt0Var = hu0Var.N;
        if (qt0Var != null) {
            qt0Var.f31979w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != n2Var.getUserConfig().getClientUserId() && charSequence == null) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                bundleH.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else {
                if (DialogObject.isUserDialog(j10)) {
                    bundleH.putLong("user_id", j10);
                } else {
                    bundleH.putLong("chat_id", -j10);
                }
                if (!n2Var.getMessagesController().checkCanOpenChat(bundleH, gyVar)) {
                    return true;
                }
            }
            n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.rn rnVar = new org.telegram.ui.rn(bundleH);
            wf.c.a(rnVar, (MessagesStorage.TopicKey) arrayList.get(0));
            gyVar.presentFragment(rnVar, true);
            rnVar.Ab(arrayList2);
            return true;
        }
        hu0Var.r1(true);
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i15)).dialogId;
            if (charSequence != null) {
                n2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            n2Var.getSendMessagesHelper().sendMessage(arrayList2, j11, false, false, true, 0, 0L);
        }
        gyVar.finishFragment();
        UndoView undoView = n2Var instanceof ProfileActivity ? ((ProfileActivity) n2Var).I : null;
        if (undoView == null) {
            return true;
        }
        if (arrayList.size() == 1) {
            undoView.m(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, Integer.valueOf(arrayList2.size()), 53);
            return true;
        }
        undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
        return true;
    }
}
