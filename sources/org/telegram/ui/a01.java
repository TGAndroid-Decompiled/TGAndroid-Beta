package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class a01 implements Runnable {
    public final int f36388a;
    public final Object f36389b;
    public final Object f36390c;
    public final Object d;
    public final Object f36391e;
    public final Object f36392f;

    public a01(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f36388a = i10;
        this.f36389b = obj;
        this.f36390c = obj2;
        this.d = obj3;
        this.f36391e = obj4;
        this.f36392f = obj5;
    }

    @Override
    public final void run() {
        switch (this.f36388a) {
            case 0:
                g01 g01Var = (g01) this.f36389b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f36391e;
                ArrayList arrayList3 = (ArrayList) this.f36392f;
                org.telegram.ui.ActionBar.o2 o2Var = g01Var.f38411e;
                if (((String) this.f36390c).equals(g01Var.f38418y)) {
                    if (!g01Var.f38416w && (o2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) o2Var).L.f32120b.getImageReceiver().startAnimation();
                            ((ProfileActivity) o2Var).L.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    g01Var.f38416w = true;
                    g01Var.f38414r = arrayList;
                    g01Var.f38415s = arrayList2;
                    g01Var.f38413n = arrayList3;
                    g01Var.l();
                    if (o2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) o2Var).L.f32120b.getImageReceiver().startAnimation();
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                d61 d61Var = (d61) this.f36389b;
                View view = (View) this.f36390c;
                d61Var.getClass();
                d61Var.p(view, Long.valueOf(((org.telegram.ui.Components.y5) this.d).documentId), (TLRPC.Document) this.f36391e, ((m51) this.f36392f).v, null);
                return;
            case 2:
                n61 n61Var = (n61) this.f36389b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f36390c;
                TLObject tLObject = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f36391e;
                TLRPC.User user = (TLRPC.User) this.f36392f;
                n61Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    n61Var.T(user, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 3:
                rf.l1 l1Var = (rf.l1) this.f36389b;
                TLObject tLObject2 = (TLObject) this.f36391e;
                ArrayList arrayList4 = (ArrayList) this.d;
                LongSparseArray longSparseArray = (LongSparseArray) this.f36392f;
                l1Var.getClass();
                String str = ((TLRPC.TL_messages_getStickers) this.f36390c).emoticon;
                rf.m1 m1Var = l1Var.f47304a;
                if (str.equals(m1Var.N)) {
                    m1Var.K = 0;
                    if (tLObject2 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                        int size = arrayList4.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                            if (longSparseArray.indexOfKey(document.f22398id) < 0) {
                                arrayList4.add(document);
                            }
                        }
                        if (size != arrayList4.size()) {
                            m1Var.E.put(arrayList4, m1Var.N);
                            if (size == 0) {
                                m1Var.F.add(arrayList4);
                            }
                            m1Var.l();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                sf.s1 s1Var = (sf.s1) this.f36389b;
                Runnable runnable = (Runnable) this.f36390c;
                s1Var.f47951e = false;
                int i11 = s1Var.f47948a;
                MessagesController.getInstance(i11).putUsers((ArrayList) this.d, true);
                MessagesController.getInstance(i11).putChats((ArrayList) this.f36391e, true);
                ArrayList arrayList5 = s1Var.f47949b;
                arrayList5.clear();
                arrayList5.addAll((ArrayList) this.f36392f);
                if (runnable != null) {
                    runnable.run();
                } else {
                    s1Var.i(null, false);
                }
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 5:
                sf.s1 s1Var2 = (sf.s1) this.f36389b;
                sf.r1 r1Var = (sf.r1) this.f36390c;
                MessageObject messageObject = (MessageObject) this.f36392f;
                int i12 = s1Var2.f47948a;
                MessagesController.getInstance(i12).putUsers((ArrayList) this.d, true);
                MessagesController.getInstance(i12).putChats((ArrayList) this.f36391e, true);
                r1Var.f47938e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(r1Var.f47936b, r1Var.f47935a);
                }
                s1Var2.l();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            default:
                sf.s1 s1Var3 = (sf.s1) this.f36389b;
                TLObject tLObject3 = (TLObject) this.f36390c;
                ArrayList<Integer> arrayList6 = (ArrayList) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f36391e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f36392f;
                s1Var3.getClass();
                if (tLObject3 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList7 = ((TLRPC.TL_messages_messages) tLObject3).messages;
                    arrayList6.clear();
                    int size3 = arrayList7.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TLRPC.Message message = arrayList7.get(i13);
                        i13++;
                        arrayList6.add(Integer.valueOf(message.f22413id));
                    }
                    tL_messages_sendQuickReplyMessages.f22507id = arrayList6;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(s1Var3.f47948a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    return;
                }
                FileLog.e("received " + tLObject3 + " " + tL_error2 + " on getQuickReplyMessages when trying to send quick reply");
                return;
        }
    }

    public a01(rf.l1 l1Var, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
        this.f36388a = 3;
        this.f36389b = l1Var;
        this.f36390c = tL_messages_getStickers;
        this.f36391e = tLObject;
        this.d = arrayList;
        this.f36392f = longSparseArray;
    }

    public a01(sf.s1 s1Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Runnable runnable) {
        this.f36388a = 4;
        this.f36389b = s1Var;
        this.d = arrayList;
        this.f36391e = arrayList2;
        this.f36392f = arrayList3;
        this.f36390c = runnable;
    }

    public a01(sf.s1 s1Var, ArrayList arrayList, ArrayList arrayList2, sf.r1 r1Var, MessageObject messageObject) {
        this.f36388a = 5;
        this.f36389b = s1Var;
        this.d = arrayList;
        this.f36391e = arrayList2;
        this.f36390c = r1Var;
        this.f36392f = messageObject;
    }
}
