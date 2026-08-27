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

public final class cf1 extends org.telegram.ui.ActionBar.n2 {

    public af1 f37077a;

    public org.telegram.ui.Components.zk0 f37078b;

    public long f37079c;
    public ArrayList d;

    public HashSet f37080e;

    public static void U(cf1 cf1Var, int i10) {
        cf1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(cf1Var.f37079c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = cf1Var.getMessagesController().getInputPeer(cf1Var.f37079c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        cf1Var.getConnectionsManager().sendRequest(updatenotifysettings, new jh.m5(5));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (this.isPaused || this.f37077a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(new bf1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f37079c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.f37080e.contains(Integer.valueOf(topics.get(i10).f22432id))) {
                    arrayList2.add(new bf1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new bf1(3, null));
            arrayList2.add(new bf1(4, null));
        }
        arrayList2.add(new bf1(3, null));
        af1 af1Var = this.f37077a;
        if (af1Var != null) {
            af1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ed1(1, this));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f37078b = new org.telegram.ui.Components.zk0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5819m = false;
        this.f37078b.setItemAnimator(lVar);
        this.f37078b.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var = this.f37078b;
        af1 af1Var = new af1(this);
        this.f37077a = af1Var;
        zk0Var.setAdapter(af1Var);
        this.f37078b.setOnItemClickListener(new ze1(this));
        frameLayout.addView(this.f37078b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f37079c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
