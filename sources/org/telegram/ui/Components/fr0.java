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
import org.telegram.ui.wf1;
public final class fr0 implements x10, org.telegram.ui.ky {
    public final kv0 f24309a;

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.qy qyVar) {
        return false;
    }

    public void a(boolean z10) {
        kv0 kv0Var = this.f24309a;
        if (!z10) {
            kv0Var.requestLayout();
        }
        kv0Var.setVisibleHeight(kv0Var.M1);
    }

    @Override
    public boolean u(org.telegram.ui.qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        UndoView undoView;
        kv0 kv0Var = this.f24309a;
        SparseArray[] sparseArrayArr = kv0Var.Z0;
        org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
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
        kv0Var.f25818a1 = 0;
        kv0Var.b1(false);
        uu0 uu0Var = kv0Var.R;
        if (uu0Var != null) {
            uu0Var.f28909w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != m2Var.getUserConfig().getClientUserId() && charSequence == null) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i15 = a4.a.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j3)) {
                i15.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
            } else {
                if (DialogObject.isUserDialog(j3)) {
                    i15.putLong("user_id", j3);
                } else {
                    i15.putLong("chat_id", -j3);
                }
                if (!m2Var.getMessagesController().checkCanOpenChat(i15, qyVar)) {
                    return true;
                }
            }
            m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.wn wnVar = new org.telegram.ui.wn(i15);
            ng.d.a(wnVar, (MessagesStorage.TopicKey) arrayList.get(0));
            qyVar.presentFragment(wnVar, true);
            wnVar.Ab(arrayList2);
            return true;
        }
        kv0Var.r1(true);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(i16)).dialogId;
            if (charSequence != null) {
                m2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            m2Var.getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
        }
        qyVar.finishFragment();
        if (m2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) m2Var).M;
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
