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
public final class lg1 extends org.telegram.ui.ActionBar.o2 {
    public jg1 f35544a;
    public org.telegram.ui.Components.ml0 f35545b;
    public long f35546c;
    public ArrayList d;
    public HashSet e;

    public static void U(lg1 lg1Var, int i10) {
        lg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(lg1Var.f35546c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = lg1Var.getMessagesController().getInputPeer(lg1Var.f35546c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        lg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ai.t7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f35544a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new kg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f35546c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f18173id))) {
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
        jg1 jg1Var = this.f35544a;
        if (jg1Var != null) {
            jg1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.k0.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new x81(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f35545b = new org.telegram.ui.Components.ml0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f42732m = false;
        this.f35545b.setItemAnimator(jVar);
        this.f35545b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ml0 ml0Var = this.f35545b;
        jg1 jg1Var = new jg1(this);
        this.f35544a = jg1Var;
        ml0Var.setAdapter(jg1Var);
        this.f35545b.setOnItemClickListener(new ig1(this));
        frameLayout.addView(this.f35545b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18806a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35546c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
