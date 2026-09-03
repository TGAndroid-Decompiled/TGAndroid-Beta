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
import org.telegram.ui.sf1;
public final class vq0 implements w10, org.telegram.ui.jy {
    public final yu0 f32530a;

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(org.telegram.ui.py pyVar) {
        return false;
    }

    public void a(boolean z4) {
        yu0 yu0Var = this.f32530a;
        if (!z4) {
            yu0Var.requestLayout();
        }
        yu0Var.setVisibleHeight(yu0Var.J1);
    }

    @Override
    public boolean v(org.telegram.ui.py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        UndoView undoView;
        yu0 yu0Var = this.f32530a;
        SparseArray[] sparseArrayArr = yu0Var.W0;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f33649s1;
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
        yu0Var.X0 = 0;
        yu0Var.b1(false);
        hu0 hu0Var = yu0Var.O;
        if (hu0Var != null) {
            hu0Var.f27635w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != p2Var.getUserConfig().getClientUserId() && charSequence == null) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i15 = android.support.v4.media.a.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i15.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else {
                if (DialogObject.isUserDialog(j10)) {
                    i15.putLong("user_id", j10);
                } else {
                    i15.putLong("chat_id", -j10);
                }
                if (!p2Var.getMessagesController().checkCanOpenChat(i15, pyVar)) {
                    return true;
                }
            }
            p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.xn xnVar = new org.telegram.ui.xn(i15);
            bg.e.a(xnVar, (MessagesStorage.TopicKey) arrayList.get(0));
            pyVar.presentFragment(xnVar, true);
            xnVar.Ab(arrayList2);
            return true;
        }
        yu0Var.r1(true);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i16)).dialogId;
            if (charSequence != null) {
                p2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            p2Var.getSendMessagesHelper().sendMessage(arrayList2, j11, false, false, true, 0, 0L);
        }
        pyVar.finishFragment();
        if (p2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) p2Var).J;
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
