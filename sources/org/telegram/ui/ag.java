package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ag implements or0, ww {
    public final boolean f45580a;
    public final int f45581b;
    public final Object f45582c;
    public final Object d;

    public ag(bn bnVar, boolean z10, org.telegram.messenger.fj fjVar, int i7) {
        this.f45582c = bnVar;
        this.f45580a = z10;
        this.d = fjVar;
        this.f45581b = i7;
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
        bn bnVar = (bn) this.f45582c;
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.d;
        if (this.f45580a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = bnVar.getMessagesController().l1(org.telegram.messenger.fj.B0(fjVar.f23965k));
            tL_messages_appendTodoList.msg_id = fjVar.e1();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    i7 = this.f45581b;
                    if (i10 >= i7) {
                        break;
                    }
                    i11 = Math.max(i11, tL_messageMediaToDo.todo.list.get(i10).f28550id);
                    i10++;
                }
                while (i7 < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i7);
                    if (todoItem.f28550id <= i11) {
                        todoItem.f28550id = i11 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i11 = Math.max(i11, todoItem.f28550id);
                    i7++;
                }
                TLRPC.MessageMedia messageMedia2 = fjVar.f23965k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            fjVar.f23965k.media = messageMedia;
            bnVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = fjVar.f23965k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        fjVar.f23965k.media = messageMedia;
        bnVar.getSendMessagesHelper().t(fjVar, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f45582c;
        String str = (String) this.d;
        String str2 = LaunchActivity.C1;
        long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).f26845a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f45580a);
        if (org.telegram.messenger.n5.C(j3)) {
            bundle.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.n5.E(j3)) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        int i11 = this.f45581b;
        if (!org.telegram.messenger.mp.u1(i11).E(bundle, cxVar, null, null)) {
            return true;
        }
        org.telegram.messenger.ks.f(i11).k(org.telegram.messenger.ks.f25190t, new Object[0]);
        org.telegram.messenger.ri.d0(i11).V1(j3, 0, str, null, null, null, null, 0L, false, false, null);
        ((ActionBarLayout) launchActivity.M()).V(new bn(bundle), true, false);
        return true;
    }

    public ag(LaunchActivity launchActivity, boolean z10, int i7, String str) {
        this.f45582c = launchActivity;
        this.f45580a = z10;
        this.f45581b = i7;
        this.d = str;
    }
}
