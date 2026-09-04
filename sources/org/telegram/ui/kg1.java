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
    public ig1 f38063a;
    public org.telegram.ui.Components.ll0 f38064b;
    public long f38065c;
    public ArrayList d;
    public HashSet f38066e;

    public static void U(kg1 kg1Var, int i10) {
        kg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(kg1Var.f38065c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = kg1Var.getMessagesController().getInputPeer(kg1Var.f38065c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        kg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new bi.c7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f38063a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new jg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f38065c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.f38066e.contains(Integer.valueOf(topics.get(i10).f19921id))) {
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
        ig1 ig1Var = this.f38063a;
        if (ig1Var != null) {
            ig1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.g.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 6));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f38064b = new org.telegram.ui.Components.ll0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f45777m = false;
        this.f38064b.setItemAnimator(jVar);
        this.f38064b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var = this.f38064b;
        ig1 ig1Var = new ig1(this);
        this.f38063a = ig1Var;
        ll0Var.setAdapter(ig1Var);
        this.f38064b.setOnItemClickListener(new hg1(this));
        frameLayout.addView(this.f38064b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38065c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
