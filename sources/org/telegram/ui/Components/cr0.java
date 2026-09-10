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
import org.telegram.ui.ig1;
public final class cr0 implements e20, org.telegram.ui.qy {
    public final iv0 f22216a;

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean J(org.telegram.ui.wy wyVar) {
        return false;
    }

    public void a(boolean z10) {
        iv0 iv0Var = this.f22216a;
        if (!z10) {
            iv0Var.requestLayout();
        }
        iv0Var.setVisibleHeight(iv0Var.M1);
    }

    @Override
    public boolean v(org.telegram.ui.wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        UndoView undoView;
        iv0 iv0Var = this.f22216a;
        SparseArray[] sparseArrayArr = iv0Var.Z0;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
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
        iv0Var.f24083a1 = 0;
        iv0Var.b1(false);
        ru0 ru0Var = iv0Var.R;
        if (ru0Var != null) {
            ru0Var.f26760w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != p2Var.getUserConfig().getClientUserId() && charSequence == null) {
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
                if (!p2Var.getMessagesController().checkCanOpenChat(i15, wyVar)) {
                    return true;
                }
            }
            p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.eo eoVar = new org.telegram.ui.eo(i15);
            mg.d.a(eoVar, (MessagesStorage.TopicKey) arrayList.get(0));
            wyVar.presentFragment(eoVar, true);
            eoVar.Ab(arrayList2);
            return true;
        }
        iv0Var.r1(true);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(i16)).dialogId;
            if (charSequence != null) {
                p2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            p2Var.getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
        }
        wyVar.finishFragment();
        if (p2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) p2Var).M;
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
