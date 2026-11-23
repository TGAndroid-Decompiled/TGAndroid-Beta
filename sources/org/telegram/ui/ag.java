package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ag implements pr0, ww {
    public final boolean f45591a;
    public final int f45592b;
    public final Object f45593c;
    public final Object d;

    public ag(bn bnVar, boolean z10, org.telegram.messenger.gj gjVar, int i7) {
        this.f45593c = bnVar;
        this.f45591a = z10;
        this.d = gjVar;
        this.f45592b = i7;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        int i7;
        bn bnVar = (bn) this.f45593c;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.d;
        if (this.f45591a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = bnVar.getMessagesController().l1(org.telegram.messenger.gj.B0(gjVar.f24177k));
            tL_messages_appendTodoList.msg_id = gjVar.e1();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    i7 = this.f45592b;
                    if (i10 >= i7) {
                        break;
                    }
                    i11 = Math.max(i11, tL_messageMediaToDo.todo.list.get(i10).f28545id);
                    i10++;
                }
                while (i7 < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i7);
                    if (todoItem.f28545id <= i11) {
                        todoItem.f28545id = i11 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i11 = Math.max(i11, todoItem.f28545id);
                    i7++;
                }
                TLRPC.MessageMedia messageMedia2 = gjVar.f24177k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            gjVar.f24177k.media = messageMedia;
            bnVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = gjVar.f24177k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        gjVar.f24177k.media = messageMedia;
        bnVar.getSendMessagesHelper().t(gjVar, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f45593c;
        String str = (String) this.d;
        String str2 = LaunchActivity.C1;
        long j3 = ((org.telegram.messenger.tr) arrayList.get(0)).f27037a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f45591a);
        if (org.telegram.messenger.n5.C(j3)) {
            bundle.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.n5.E(j3)) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        int i11 = this.f45592b;
        if (!org.telegram.messenger.np.u1(i11).E(bundle, cxVar, null, null)) {
            return true;
        }
        org.telegram.messenger.ls.f(i11).k(org.telegram.messenger.ls.f25348t, new Object[0]);
        org.telegram.messenger.si.d0(i11).V1(j3, 0, str, null, null, null, null, 0L, false, false, null);
        ((ActionBarLayout) launchActivity.M()).V(new bn(bundle), true, false);
        return true;
    }

    public ag(LaunchActivity launchActivity, boolean z10, int i7, String str) {
        this.f45593c = launchActivity;
        this.f45591a = z10;
        this.f45592b = i7;
        this.d = str;
    }
}
