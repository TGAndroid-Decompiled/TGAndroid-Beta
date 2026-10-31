package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qg implements zs0, ux {
    public final boolean f40974a;
    public final int f40975b;
    public final Object f40976c;
    public final Object d;

    public qg(un unVar, boolean z10, org.telegram.messenger.jj jjVar, int i10) {
        this.f40976c = unVar;
        this.f40974a = z10;
        this.d = jjVar;
        this.f40975b = i10;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        int i10;
        un unVar = (un) this.f40976c;
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.d;
        if (this.f40974a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = unVar.getMessagesController().i1(org.telegram.messenger.jj.B0(jjVar.f16337k));
            tL_messages_appendTodoList.msg_id = jjVar.f1();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i10 = this.f40975b;
                    if (i11 >= i10) {
                        break;
                    }
                    i12 = Math.max(i12, tL_messageMediaToDo.todo.list.get(i11).f19940id);
                    i11++;
                }
                while (i10 < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i10);
                    if (todoItem.f19940id <= i12) {
                        todoItem.f19940id = i12 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i12 = Math.max(i12, todoItem.f19940id);
                    i10++;
                }
                TLRPC.MessageMedia messageMedia2 = jjVar.f16337k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            jjVar.f16337k.media = messageMedia;
            unVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = jjVar.f16337k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        jjVar.f16337k.media = messageMedia;
        unVar.getSendMessagesHelper().t(jjVar, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f40976c;
        String str = (String) this.d;
        Pattern pattern = LaunchActivity.D1;
        long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).f15760a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f40974a);
        if (org.telegram.messenger.o5.C(j10)) {
            bundle.putInt("enc_id", (int) (4294967295L & j10));
        } else if (org.telegram.messenger.o5.E(j10)) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        int i12 = this.f40975b;
        if (!org.telegram.messenger.vp.r1(i12).E(bundle, ayVar, null, null)) {
            return true;
        }
        org.telegram.messenger.zs.f(i12).k(org.telegram.messenger.zs.f19690t, new Object[0]);
        org.telegram.messenger.ui.b0(i12).Q1(j10, 0, str, null, null, null, null, 0L, false, false, null);
        ((ActionBarLayout) launchActivity.M()).U(new un(bundle), true, false);
        return true;
    }

    public qg(LaunchActivity launchActivity, boolean z10, int i10, String str) {
        this.f40976c = launchActivity;
        this.f40974a = z10;
        this.f40975b = i10;
        this.d = str;
    }
}
