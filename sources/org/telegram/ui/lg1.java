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
public final class lg1 extends org.telegram.ui.ActionBar.n2 {
    public jg1 f39574a;
    public org.telegram.ui.Components.qm0 f39575b;
    public long f39576c;
    public ArrayList d;
    public HashSet f39577e;

    public static void U(lg1 lg1Var, int i10) {
        lg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(lg1Var.f39576c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = lg1Var.getMessagesController().getInputPeer(lg1Var.f39576c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        lg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ai.v7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f39574a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new kg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f39576c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.f39577e.contains(Integer.valueOf(topics.get(i10).f20090id))) {
                    arrayList2.add(new kg1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new kg1(3, null));
            arrayList2.add(new kg1(4, null));
        }
        arrayList2.add(new kg1(3, null));
        jg1 jg1Var = this.f39574a;
        if (jg1Var != null) {
            jg1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.c.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 6));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f39575b = new org.telegram.ui.Components.qm0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47698m = false;
        this.f39575b.setItemAnimator(jVar);
        this.f39575b.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.qm0 qm0Var = this.f39575b;
        jg1 jg1Var = new jg1(this);
        this.f39574a = jg1Var;
        qm0Var.setAdapter(jg1Var);
        this.f39575b.setOnItemClickListener(new ig1(this));
        frameLayout.addView(this.f39575b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f39576c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
