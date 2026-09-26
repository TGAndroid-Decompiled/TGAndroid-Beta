package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cg1 extends org.telegram.ui.ActionBar.m2 {
    public ag1 f32716a;
    public org.telegram.ui.Components.wl0 f32717b;
    public long f32718c;
    public ArrayList d;
    public HashSet e;

    public static void U(cg1 cg1Var, int i10) {
        cg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(cg1Var.f32718c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = cg1Var.getMessagesController().getInputPeer(cg1Var.f32718c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        cg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ai.u7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f32716a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new bg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f32718c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f18387id))) {
                    arrayList2.add(new bg1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new bg1(3, null));
            arrayList2.add(new bg1(4, null));
        }
        arrayList2.add(new bg1(3, null));
        ag1 ag1Var = this.f32716a;
        if (ag1Var != null) {
            ag1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.c.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new f81(this, 6));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f32717b = new org.telegram.ui.Components.wl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f42995m = false;
        this.f32717b.setItemAnimator(jVar);
        this.f32717b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.wl0 wl0Var = this.f32717b;
        ag1 ag1Var = new ag1(this);
        this.f32716a = ag1Var;
        wl0Var.setAdapter(ag1Var);
        this.f32717b.setOnItemClickListener(new zf1(this));
        frameLayout.addView(this.f32717b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f32718c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
