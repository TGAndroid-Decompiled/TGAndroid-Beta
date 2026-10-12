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
public final class ng1 extends org.telegram.ui.ActionBar.m2 {
    public lg1 f40409a;
    public org.telegram.ui.Components.wm0 f40410b;
    public long f40411c;
    public ArrayList d;
    public HashSet f40412e;

    public static void U(ng1 ng1Var, int i10) {
        ng1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(ng1Var.f40411c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = ng1Var.getMessagesController().getInputPeer(ng1Var.f40411c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        ng1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ai.v7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f40409a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new mg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f40411c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.f40412e.contains(Integer.valueOf(topics.get(i10).f19854id))) {
                    arrayList2.add(new mg1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new mg1(3, null));
            arrayList2.add(new mg1(4, null));
        }
        arrayList2.add(new mg1(3, null));
        lg1 lg1Var = this.f40409a;
        if (lg1Var != null) {
            lg1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.c.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new f51(this, 7));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f40410b = new org.telegram.ui.Components.wm0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47929m = false;
        this.f40410b.setItemAnimator(jVar);
        this.f40410b.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.wm0 wm0Var = this.f40410b;
        lg1 lg1Var = new lg1(this);
        this.f40409a = lg1Var;
        wm0Var.setAdapter(lg1Var);
        this.f40410b.setOnItemClickListener(new kg1(this));
        frameLayout.addView(this.f40410b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f40411c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
