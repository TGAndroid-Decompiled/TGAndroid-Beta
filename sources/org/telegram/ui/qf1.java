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
public final class qf1 extends org.telegram.ui.ActionBar.p2 {
    public of1 f37747a;
    public org.telegram.ui.Components.sl0 f37748b;
    public long f37749c;
    public ArrayList d;
    public HashSet e;

    public static void U(qf1 qf1Var, int i10) {
        qf1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(qf1Var.f37749c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = qf1Var.getMessagesController().getInputPeer(qf1Var.f37749c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        qf1Var.getConnectionsManager().sendRequest(updatenotifysettings, new nh.p5(4));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f37747a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new pf1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f37749c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f19236id))) {
                    arrayList2.add(new pf1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new pf1(3, null));
            arrayList2.add(new pf1(4, null));
        }
        arrayList2.add(new pf1(3, null));
        of1 of1Var = this.f37747a;
        if (of1Var != null) {
            of1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 22));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f37748b = new org.telegram.ui.Components.sl0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5818m = false;
        this.f37748b.setItemAnimator(lVar);
        this.f37748b.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.sl0 sl0Var = this.f37748b;
        of1 of1Var = new of1(this);
        this.f37747a = of1Var;
        sl0Var.setAdapter(of1Var);
        this.f37748b.setOnItemClickListener(new nf1(this));
        frameLayout.addView(this.f37748b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f37749c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
