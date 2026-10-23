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
import org.telegram.ui.ye1;
public final class sr0 implements e20, org.telegram.ui.xx {
    public final xv0 f30543a;

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(org.telegram.ui.ey eyVar) {
        return false;
    }

    public void a(boolean z10) {
        xv0 xv0Var = this.f30543a;
        if (!z10) {
            xv0Var.requestLayout();
        }
        xv0Var.setVisibleHeight(xv0Var.N1);
    }

    @Override
    public boolean w(org.telegram.ui.ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        int i12;
        UndoView undoView;
        xv0 xv0Var = this.f30543a;
        SparseArray[] sparseArrayArr = xv0Var.Z0;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
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
        xv0Var.f32660a1 = 0;
        xv0Var.e1(false);
        hv0 hv0Var = xv0Var.R;
        if (hv0Var != null) {
            hv0Var.f27062w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != o2Var.getUserConfig().getClientUserId() && charSequence == null) {
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
                if (!o2Var.getMessagesController().checkCanOpenChat(h, eyVar)) {
                    return true;
                }
            }
            o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.sn snVar = new org.telegram.ui.sn(h);
            og.d.a(snVar, (MessagesStorage.TopicKey) arrayList.get(0));
            eyVar.presentFragment(snVar, true);
            snVar.Gb(arrayList2);
            return true;
        }
        xv0Var.w1(true);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i15)).dialogId;
            if (charSequence != null) {
                o2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            o2Var.getSendMessagesHelper().sendMessage(arrayList2, j11, false, false, true, 0, 0L);
            i15++;
            z12 = z12;
            i12 = 0;
        }
        boolean z13 = z12;
        eyVar.finishFragment();
        if (o2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) o2Var).M;
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
