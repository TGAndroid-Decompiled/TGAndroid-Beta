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
    public jg1 f35442a;
    public org.telegram.ui.Components.vl0 f35443b;
    public long f35444c;
    public ArrayList d;
    public HashSet e;

    public static void U(lg1 lg1Var, int i10) {
        lg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(lg1Var.f35444c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = lg1Var.getMessagesController().getInputPeer(lg1Var.f35444c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        lg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ai.t7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f35442a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new kg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f35444c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f18380id))) {
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
        jg1 jg1Var = this.f35442a;
        if (jg1Var != null) {
            jg1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.k0.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 6));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f35443b = new org.telegram.ui.Components.vl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f43009m = false;
        this.f35443b.setItemAnimator(jVar);
        this.f35443b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var = this.f35443b;
        jg1 jg1Var = new jg1(this);
        this.f35442a = jg1Var;
        vl0Var.setAdapter(jg1Var);
        this.f35443b.setOnItemClickListener(new ig1(this));
        frameLayout.addView(this.f35443b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35444c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
