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
import org.telegram.ui.re1;
public final class or0 implements e20, org.telegram.ui.vx {
    public final tv0 f29082a;

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(org.telegram.ui.cy cyVar) {
        return false;
    }

    public void a(boolean z10) {
        tv0 tv0Var = this.f29082a;
        if (!z10) {
            tv0Var.requestLayout();
        }
        tv0Var.setVisibleHeight(tv0Var.M1);
    }

    @Override
    public boolean w(org.telegram.ui.cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        int i12;
        UndoView undoView;
        tv0 tv0Var = this.f29082a;
        SparseArray[] sparseArrayArr = tv0Var.Z0;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30734v1;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        boolean z12 = true;
        int i13 = 1;
        while (true) {
            i12 = 0;
            if (i13 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < sparseArrayArr[i13].size(); i14++) {
                arrayList3.add(Integer.valueOf(sparseArrayArr[i13].keyAt(i14)));
            }
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    arrayList2.add((MessageObject) sparseArrayArr[i13].get(num.intValue()));
                }
            }
            sparseArrayArr[i13].clear();
            i13--;
        }
        tv0Var.f30686a1 = 0;
        tv0Var.d1(false);
        dv0 dv0Var = tv0Var.R;
        if (dv0Var != null) {
            dv0Var.f25657w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != n2Var.getUserConfig().getClientUserId() && charSequence == null) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle h = a1.g.h("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                h.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else {
                if (DialogObject.isUserDialog(j10)) {
                    h.putLong("user_id", j10);
                } else {
                    h.putLong("chat_id", -j10);
                }
                if (!n2Var.getMessagesController().checkCanOpenChat(h, cyVar)) {
                    return true;
                }
            }
            n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.qn qnVar = new org.telegram.ui.qn(h);
            og.d.a(qnVar, (MessagesStorage.TopicKey) arrayList.get(0));
            cyVar.presentFragment(qnVar, true);
            qnVar.Eb(arrayList2);
            return true;
        }
        tv0Var.u1(true);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i15)).dialogId;
            if (charSequence != null) {
                n2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            n2Var.getSendMessagesHelper().sendMessage(arrayList2, j11, false, false, true, 0, 0L);
            i15++;
            z12 = z12;
            i12 = 0;
        }
        boolean z13 = z12;
        cyVar.finishFragment();
        if (n2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) n2Var).M;
        } else {
            undoView = null;
        }
        if (undoView != null) {
            if (arrayList.size() == z13) {
                undoView.m(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, Integer.valueOf(arrayList2.size()), 53);
                return z13;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z13;
        }
        return z13;
    }
}
