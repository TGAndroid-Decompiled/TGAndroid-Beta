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
public final class bq0 implements g10, org.telegram.ui.wx {
    public final eu0 f27266a;

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(org.telegram.ui.dy dyVar) {
        return false;
    }

    public void a(boolean z10) {
        eu0 eu0Var = this.f27266a;
        if (!z10) {
            eu0Var.requestLayout();
        }
        eu0Var.setVisibleHeight(eu0Var.I1);
    }

    @Override
    public boolean v(org.telegram.ui.dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        UndoView undoView;
        eu0 eu0Var = this.f27266a;
        SparseArray[] sparseArrayArr = eu0Var.V0;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        int i11 = 1;
        while (true) {
            int i12 = 0;
            if (i11 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < sparseArrayArr[i11].size(); i13++) {
                arrayList3.add(Integer.valueOf(sparseArrayArr[i11].keyAt(i13)));
            }
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    arrayList2.add((MessageObject) sparseArrayArr[i11].get(num.intValue()));
                }
            }
            sparseArrayArr[i11].clear();
            i11--;
        }
        eu0Var.W0 = 0;
        eu0Var.b1(false);
        ot0 ot0Var = eu0Var.N;
        if (ot0Var != null) {
            ot0Var.f31445w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != o2Var.getUserConfig().getClientUserId() && charSequence == null) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i14 = aa.d.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i14.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else {
                if (DialogObject.isUserDialog(j10)) {
                    i14.putLong("user_id", j10);
                } else {
                    i14.putLong("chat_id", -j10);
                }
                if (!o2Var.getMessagesController().checkCanOpenChat(i14, dyVar)) {
                    return true;
                }
            }
            o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.qn qnVar = new org.telegram.ui.qn(i14);
            vf.c.a(qnVar, (MessagesStorage.TopicKey) arrayList.get(0));
            dyVar.presentFragment(qnVar, true);
            qnVar.Ab(arrayList2);
            return true;
        }
        eu0Var.r1(true);
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i15)).dialogId;
            if (charSequence != null) {
                o2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            o2Var.getSendMessagesHelper().sendMessage(arrayList2, j11, false, false, true, 0, 0L);
        }
        dyVar.finishFragment();
        if (o2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) o2Var).I;
        } else {
            undoView = null;
        }
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
