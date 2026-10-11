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
import org.telegram.ui.eg1;
public final class xr0 implements n20, org.telegram.ui.my {
    public final cw0 f33059a;

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.sy syVar) {
        return false;
    }

    public void a(boolean z10) {
        cw0 cw0Var = this.f33059a;
        if (!z10) {
            cw0Var.requestLayout();
        }
        cw0Var.setVisibleHeight(cw0Var.M1);
    }

    @Override
    public boolean w(org.telegram.ui.sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        int i12;
        UndoView undoView;
        cw0 cw0Var = this.f33059a;
        SparseArray[] sparseArrayArr = cw0Var.Z0;
        org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
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
        cw0Var.f25487a1 = 0;
        cw0Var.b1(false);
        mv0 mv0Var = cw0Var.R;
        if (mv0Var != null) {
            mv0Var.f28958w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != m2Var.getUserConfig().getClientUserId() && charSequence == null) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i15 = a1.g.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j3)) {
                i15.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
            } else {
                if (DialogObject.isUserDialog(j3)) {
                    i15.putLong("user_id", j3);
                } else {
                    i15.putLong("chat_id", -j3);
                }
                if (!m2Var.getMessagesController().checkCanOpenChat(i15, syVar)) {
                    return true;
                }
            }
            m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i15);
            ng.d.a(znVar, (MessagesStorage.TopicKey) arrayList.get(0));
            syVar.presentFragment(znVar, true);
            znVar.Eb(arrayList2);
            return true;
        }
        cw0Var.r1(true);
        int i16 = 0;
        while (i16 < arrayList.size()) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(i16)).dialogId;
            if (charSequence != null) {
                m2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            m2Var.getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
            i16++;
            z12 = z12;
            i12 = 0;
        }
        boolean z13 = z12;
        syVar.finishFragment();
        if (m2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) m2Var).M;
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
