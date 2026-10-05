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
public final class cg1 extends org.telegram.ui.ActionBar.n2 {
    public ag1 f35452a;
    public org.telegram.ui.Components.zl0 f35453b;
    public long f35454c;
    public ArrayList d;
    public HashSet f35455e;

    public static void S(cg1 cg1Var, int i10) {
        cg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(cg1Var.f35454c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = cg1Var.getMessagesController().getInputPeer(cg1Var.f35454c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        cg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ai.u7(8));
    }

    public final void T() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f35452a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new bg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f35454c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.f35455e.contains(Integer.valueOf(topics.get(i10).f20099id))) {
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
        ag1 ag1Var = this.f35452a;
        if (ag1Var != null) {
            ag1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.c.u(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f35453b = new org.telegram.ui.Components.zl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f46577m = false;
        this.f35453b.setItemAnimator(jVar);
        this.f35453b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var = this.f35453b;
        ag1 ag1Var = new ag1(this);
        this.f35452a = ag1Var;
        zl0Var.setAdapter(ag1Var);
        this.f35453b.setOnItemClickListener(new zf1(this));
        frameLayout.addView(this.f35453b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20771a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35454c = this.arguments.getLong("dialog_id");
        T();
        return super.onFragmentCreate();
    }
}
