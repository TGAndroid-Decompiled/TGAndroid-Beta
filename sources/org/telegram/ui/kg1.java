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
public final class kg1 extends org.telegram.ui.ActionBar.n2 {
    public ig1 f35156a;
    public org.telegram.ui.Components.ll0 f35157b;
    public long f35158c;
    public ArrayList d;
    public HashSet e;

    public static void U(kg1 kg1Var, int i10) {
        kg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(kg1Var.f35158c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = kg1Var.getMessagesController().getInputPeer(kg1Var.f35158c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        kg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ai.t7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f35156a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new jg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f35158c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f18161id))) {
                    arrayList2.add(new jg1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new jg1(3, null));
            arrayList2.add(new jg1(4, null));
        }
        arrayList2.add(new jg1(3, null));
        ig1 ig1Var = this.f35156a;
        if (ig1Var != null) {
            ig1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.c.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new w81(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f35157b = new org.telegram.ui.Components.ll0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f42706m = false;
        this.f35157b.setItemAnimator(jVar);
        this.f35157b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var = this.f35157b;
        ig1 ig1Var = new ig1(this);
        this.f35156a = ig1Var;
        ll0Var.setAdapter(ig1Var);
        this.f35157b.setOnItemClickListener(new hg1(this));
        frameLayout.addView(this.f35157b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18778a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35158c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
