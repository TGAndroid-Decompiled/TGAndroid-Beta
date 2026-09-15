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
public final class jg1 extends org.telegram.ui.ActionBar.n2 {
    public hg1 f34900a;
    public org.telegram.ui.Components.ll0 f34901b;
    public long f34902c;
    public ArrayList d;
    public HashSet e;

    public static void U(jg1 jg1Var, int i10) {
        jg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(jg1Var.f34902c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = jg1Var.getMessagesController().getInputPeer(jg1Var.f34902c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        jg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ai.t7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f34900a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new ig1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f34902c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f18164id))) {
                    arrayList2.add(new ig1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new ig1(3, null));
            arrayList2.add(new ig1(4, null));
        }
        arrayList2.add(new ig1(3, null));
        hg1 hg1Var = this.f34900a;
        if (hg1Var != null) {
            hg1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.k0.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new v81(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f34901b = new org.telegram.ui.Components.ll0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f42710m = false;
        this.f34901b.setItemAnimator(jVar);
        this.f34901b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var = this.f34901b;
        hg1 hg1Var = new hg1(this);
        this.f34900a = hg1Var;
        ll0Var.setAdapter(hg1Var);
        this.f34901b.setOnItemClickListener(new gg1(this));
        frameLayout.addView(this.f34901b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34902c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
