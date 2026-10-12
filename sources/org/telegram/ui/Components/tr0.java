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
import org.telegram.ui.lg1;
public final class tr0 implements i20, org.telegram.ui.sy {
    public final xv0 f29480a;

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean L(org.telegram.ui.yy yyVar) {
        return false;
    }

    public void a(boolean z10) {
        xv0 xv0Var = this.f29480a;
        if (!z10) {
            xv0Var.requestLayout();
        }
        xv0Var.setVisibleHeight(xv0Var.M1);
    }

    @Override
    public boolean w(org.telegram.ui.yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        int i12;
        UndoView undoView;
        xv0 xv0Var = this.f29480a;
        SparseArray[] sparseArrayArr = xv0Var.Z0;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
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
        xv0Var.f31340a1 = 0;
        xv0Var.b1(false);
        hv0 hv0Var = xv0Var.R;
        if (hv0Var != null) {
            hv0Var.f25765w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != m2Var.getUserConfig().getClientUserId() && charSequence == null) {
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
                if (!m2Var.getMessagesController().checkCanOpenChat(h, yyVar)) {
                    return true;
                }
            }
            m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.fo foVar = new org.telegram.ui.fo(h);
            og.d.a(foVar, (MessagesStorage.TopicKey) arrayList.get(0));
            yyVar.presentFragment(foVar, true);
            foVar.Eb(arrayList2);
            return true;
        }
        xv0Var.r1(true);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i15)).dialogId;
            if (charSequence != null) {
                m2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            m2Var.getSendMessagesHelper().sendMessage(arrayList2, j11, false, false, true, 0, 0L);
            i15++;
            z12 = z12;
            i12 = 0;
        }
        boolean z13 = z12;
        yyVar.finishFragment();
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
