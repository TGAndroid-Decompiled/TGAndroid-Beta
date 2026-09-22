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
import org.telegram.ui.fg1;
public final class gr0 implements v10, org.telegram.ui.oy {
    public final lv0 f24613a;

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.uy uyVar) {
        return false;
    }

    public void a(boolean z10) {
        lv0 lv0Var = this.f24613a;
        if (!z10) {
            lv0Var.requestLayout();
        }
        lv0Var.setVisibleHeight(lv0Var.M1);
    }

    @Override
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        UndoView undoView;
        lv0 lv0Var = this.f24613a;
        SparseArray[] sparseArrayArr = lv0Var.Z0;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.f26234v1;
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
        lv0Var.f26186a1 = 0;
        lv0Var.b1(false);
        vu0 vu0Var = lv0Var.R;
        if (vu0Var != null) {
            vu0Var.f29811w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != n2Var.getUserConfig().getClientUserId() && charSequence == null) {
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
                if (!n2Var.getMessagesController().checkCanOpenChat(i15, uyVar)) {
                    return true;
                }
            }
            n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i15);
            ng.d.a(znVar, (MessagesStorage.TopicKey) arrayList.get(0));
            uyVar.presentFragment(znVar, true);
            znVar.Ab(arrayList2);
            return true;
        }
        lv0Var.r1(true);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(i16)).dialogId;
            if (charSequence != null) {
                n2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            n2Var.getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
        }
        uyVar.finishFragment();
        if (n2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) n2Var).M;
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
