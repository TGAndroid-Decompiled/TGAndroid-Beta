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

    public final int f36326a;

    public final Object f36327b;

    public final Object f36328c;
    public final Object d;

    public final Object f36329e;

    public final Object f36330f;

    public a01(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f36326a = i10;
        this.f36327b = obj;
        this.f36328c = obj2;
        this.d = obj3;
        this.f36329e = obj4;
        this.f36330f = obj5;
    }

    @Override
    public final void run() {
        switch (this.f36326a) {
            case 0:
                g01 g01Var = (g01) this.f36327b;
                String str = (String) this.f36328c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f36329e;
                ArrayList arrayList3 = (ArrayList) this.f36330f;
                org.telegram.ui.ActionBar.n2 n2Var = g01Var.f38253e;
                if (str.equals(g01Var.f38260y)) {
                    if (!g01Var.f38258w && (n2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) n2Var).L.f29504b.getImageReceiver().startAnimation();
                            ((ProfileActivity) n2Var).L.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    g01Var.f38258w = true;
                    g01Var.f38256r = arrayList;
                    g01Var.f38257s = arrayList2;
                    g01Var.f38255n = arrayList3;
                    g01Var.l();
                    if (n2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) n2Var).L.f29504b.getImageReceiver().startAnimation();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                    break;
                }
                break;
            case 1:
                a61 a61Var = (a61) this.f36327b;
                View view = (View) this.f36328c;
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.d;
                TLRPC.Document document = (TLRPC.Document) this.f36329e;
                j51 j51Var = (j51) this.f36330f;
                a61Var.getClass();
                a61Var.p(view, Long.valueOf(t5Var.documentId), document, j51Var.v, null);
                break;
            case 2:
                k61 k61Var = (k61) this.f36327b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f36328c;
                TLObject tLObject = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f36329e;
                TLRPC.User user = (TLRPC.User) this.f36330f;
                k61Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    k61Var.T(user, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                }
                break;
            case 3:
                pf.k1 k1Var = (pf.k1) this.f36327b;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.f36328c;
                TLObject tLObject2 = (TLObject) this.f36329e;
                ArrayList arrayList4 = (ArrayList) this.d;
                LongSparseArray longSparseArray = (LongSparseArray) this.f36330f;
                k1Var.getClass();
                String str2 = tL_messages_getStickers.emoticon;
                pf.l1 l1Var = k1Var.f45863a;
                if (str2.equals(l1Var.N)) {
                    l1Var.K = 0;
                    if (tLObject2 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                        int size = arrayList4.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i10);
                            if (longSparseArray.indexOfKey(document2.f22386id) < 0) {
                                arrayList4.add(document2);
                            }
                        }
                        if (size != arrayList4.size()) {
                            l1Var.E.put(arrayList4, l1Var.N);
                            if (size == 0) {
                                l1Var.F.add(arrayList4);
                            }
                            l1Var.l();
                        }
                        break;
                    }
                }
                break;
            case 4:
                qf.q1 q1Var = (qf.q1) this.f36327b;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList6 = (ArrayList) this.f36329e;
                ArrayList arrayList7 = (ArrayList) this.f36330f;
                Runnable runnable = (Runnable) this.f36328c;
                q1Var.f46436e = false;
                int i11 = q1Var.f46433a;
                MessagesController.getInstance(i11).putUsers(arrayList5, true);
                MessagesController.getInstance(i11).putChats(arrayList6, true);
                ArrayList arrayList8 = q1Var.f46434b;
                arrayList8.clear();
                arrayList8.addAll(arrayList7);
                if (runnable != null) {
                    runnable.run();
                } else {
                    q1Var.i(null, false);
                }
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 5:
                qf.q1 q1Var2 = (qf.q1) this.f36327b;
                ArrayList<TLRPC.User> arrayList9 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList10 = (ArrayList) this.f36329e;
                qf.p1 p1Var = (qf.p1) this.f36328c;
                MessageObject messageObject = (MessageObject) this.f36330f;
                int i12 = q1Var2.f46433a;
                MessagesController.getInstance(i12).putUsers(arrayList9, true);
                MessagesController.getInstance(i12).putChats(arrayList10, true);
                p1Var.f46421e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(p1Var.f46419b, p1Var.f46418a);
                }
                q1Var2.l();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            default:
                qf.q1 q1Var3 = (qf.q1) this.f36327b;
                TLObject tLObject3 = (TLObject) this.f36328c;
                ArrayList<Integer> arrayList11 = (ArrayList) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f36329e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f36330f;
                q1Var3.getClass();
                if (tLObject3 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList12 = ((TLRPC.TL_messages_messages) tLObject3).messages;
                    arrayList11.clear();
                    int size3 = arrayList12.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TLRPC.Message message = arrayList12.get(i13);
                        i13++;
                        arrayList11.add(Integer.valueOf(message.f22401id));
                    }
                    tL_messages_sendQuickReplyMessages.f22495id = arrayList11;
                    for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(q1Var3.f46433a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                } else {
                    FileLog.e("received " + tLObject3 + " " + tL_error2 + " on getQuickReplyMessages when trying to send quick reply");
                }
                break;
        }
    }

    public a01(pf.k1 k1Var, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
        this.f36326a = 3;
        this.f36327b = k1Var;
        this.f36328c = tL_messages_getStickers;
        this.f36329e = tLObject;
        this.d = arrayList;
        this.f36330f = longSparseArray;
    }

    public a01(qf.q1 q1Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Runnable runnable) {
        this.f36326a = 4;
        this.f36327b = q1Var;
        this.d = arrayList;
        this.f36329e = arrayList2;
        this.f36330f = arrayList3;
        this.f36328c = runnable;
    }

    public a01(qf.q1 q1Var, ArrayList arrayList, ArrayList arrayList2, qf.p1 p1Var, MessageObject messageObject) {
        this.f36326a = 5;
        this.f36327b = q1Var;
        this.d = arrayList;
        this.f36329e = arrayList2;
        this.f36328c = p1Var;
        this.f36330f = messageObject;
    }
}
