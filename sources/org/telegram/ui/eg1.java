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
public final class eg1 extends org.telegram.ui.ActionBar.n2 {
    public cg1 f36025a;
    public org.telegram.ui.Components.zl0 f36026b;
    public long f36027c;
    public ArrayList d;
    public HashSet f36028e;

    public static void S(eg1 eg1Var, int i10) {
        eg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(eg1Var.f36027c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = eg1Var.getMessagesController().getInputPeer(eg1Var.f36027c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        eg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ai.u7(8));
    }

    public final void T() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f36025a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new dg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f36027c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.f36028e.contains(Integer.valueOf(topics.get(i10).f20094id))) {
                    arrayList2.add(new dg1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new dg1(3, null));
            arrayList2.add(new dg1(4, null));
        }
        arrayList2.add(new dg1(3, null));
        cg1 cg1Var = this.f36025a;
        if (cg1Var != null) {
            cg1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.c.u(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new h81(this, 6));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f36026b = new org.telegram.ui.Components.zl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f46570m = false;
        this.f36026b.setItemAnimator(jVar);
        this.f36026b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var = this.f36026b;
        cg1 cg1Var = new cg1(this);
        this.f36025a = cg1Var;
        zl0Var.setAdapter(cg1Var);
        this.f36026b.setOnItemClickListener(new bg1(this));
        frameLayout.addView(this.f36026b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36027c = this.arguments.getLong("dialog_id");
        T();
        return super.onFragmentCreate();
    }
}
