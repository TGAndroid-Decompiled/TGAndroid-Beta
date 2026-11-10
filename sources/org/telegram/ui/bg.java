package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class bg implements rr0, tw {
    public final boolean f44054a;
    public final int f44055b;
    public final Object f44056c;
    public final Object d;

    public bg(cn cnVar, boolean z9, org.telegram.messenger.ij ijVar, int i7) {
        this.f44056c = cnVar;
        this.f44054a = z9;
        this.d = ijVar;
        this.f44055b = i7;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(zw zwVar) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        int i7;
        cn cnVar = (cn) this.f44056c;
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
        if (this.f44054a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = cnVar.getMessagesController().j1(org.telegram.messenger.ij.B0(ijVar.f23266k));
            tL_messages_appendTodoList.msg_id = ijVar.e1();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    i7 = this.f44055b;
                    if (i10 >= i7) {
                        break;
                    }
                    i11 = Math.max(i11, tL_messageMediaToDo.todo.list.get(i10).f27107id);
                    i10++;
                }
                while (i7 < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i7);
                    if (todoItem.f27107id <= i11) {
                        todoItem.f27107id = i11 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i11 = Math.max(i11, todoItem.f27107id);
                    i7++;
                }
                TLRPC.MessageMedia messageMedia2 = ijVar.f23266k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            ijVar.f23266k.media = messageMedia;
            cnVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = ijVar.f23266k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        ijVar.f23266k.media = messageMedia;
        cnVar.getSendMessagesHelper().t(ijVar, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f44056c;
        String str = (String) this.d;
        String str2 = LaunchActivity.B1;
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26524a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f44054a);
        if (org.telegram.messenger.m5.C(j3)) {
            bundle.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.m5.E(j3)) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        int i11 = this.f44055b;
        if (!org.telegram.messenger.qp.s1(i11).E(bundle, zwVar, null, null)) {
            return true;
        }
        org.telegram.messenger.qs.f(i11).k(org.telegram.messenger.qs.f25080t, new Object[0]);
        org.telegram.messenger.ui.b0(i11).Q1(j3, 0, str, null, null, null, null, 0L, false, false, null);
        ((ActionBarLayout) launchActivity.M()).V(new cn(bundle), true, false);
        return true;
    }

    public bg(LaunchActivity launchActivity, boolean z9, int i7, String str) {
        this.f44056c = launchActivity;
        this.f44054a = z9;
        this.f44055b = i7;
        this.d = str;
    }
}
