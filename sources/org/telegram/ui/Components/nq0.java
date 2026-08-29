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
import org.telegram.ui.ze1;
public final class nq0 implements r10, org.telegram.ui.yx {
    public final qu0 f31125a;

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(org.telegram.ui.fy fyVar) {
        return false;
    }

    public void a(boolean z10) {
        qu0 qu0Var = this.f31125a;
        if (!z10) {
            qu0Var.requestLayout();
        }
        qu0Var.setVisibleHeight(qu0Var.I1);
    }

    @Override
    public boolean v(org.telegram.ui.fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        UndoView undoView;
        qu0 qu0Var = this.f31125a;
        SparseArray[] sparseArrayArr = qu0Var.V0;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
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
        qu0Var.W0 = 0;
        qu0Var.b1(false);
        zt0 zt0Var = qu0Var.N;
        if (zt0Var != null) {
            zt0Var.f35420w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != o2Var.getUserConfig().getClientUserId() && charSequence == null) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i15 = a4.w.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i15.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else {
                if (DialogObject.isUserDialog(j10)) {
                    i15.putLong("user_id", j10);
                } else {
                    i15.putLong("chat_id", -j10);
                }
                if (!o2Var.getMessagesController().checkCanOpenChat(i15, fyVar)) {
                    return true;
                }
            }
            o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.tn tnVar = new org.telegram.ui.tn(i15);
            yf.d.a(tnVar, (MessagesStorage.TopicKey) arrayList.get(0));
            fyVar.presentFragment(tnVar, true);
            tnVar.Ab(arrayList2);
            return true;
        }
        qu0Var.r1(true);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i16)).dialogId;
            if (charSequence != null) {
                o2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            o2Var.getSendMessagesHelper().sendMessage(arrayList2, j11, false, false, true, 0, 0L);
        }
        fyVar.finishFragment();
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
