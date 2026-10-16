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
public final class qg1 extends org.telegram.ui.ActionBar.m2 {
    public og1 f39158a;
    public org.telegram.ui.Components.mm0 f39159b;
    public long f39160c;
    public ArrayList d;
    public HashSet e;

    public static void U(qg1 qg1Var, int i10) {
        qg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(qg1Var.f39160c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = qg1Var.getMessagesController().getInputPeer(qg1Var.f39160c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        qg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new bi.g7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f39158a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new pg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f39160c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f18968id))) {
                    arrayList2.add(new pg1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new pg1(3, null));
            arrayList2.add(new pg1(4, null));
        }
        arrayList2.add(new pg1(3, null));
        og1 og1Var = this.f39158a;
        if (og1Var != null) {
            og1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.d.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new w41(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f39159b = new org.telegram.ui.Components.mm0(context, null);
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f44872m = false;
        this.f39159b.setItemAnimator(kVar);
        this.f39159b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var = this.f39159b;
        og1 og1Var = new og1(this);
        this.f39158a = og1Var;
        mm0Var.setAdapter(og1Var);
        this.f39159b.setOnItemClickListener(new ng1(this));
        frameLayout.addView(this.f39159b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f39160c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
