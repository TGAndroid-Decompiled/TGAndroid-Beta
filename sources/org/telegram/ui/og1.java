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
public final class og1 extends org.telegram.ui.ActionBar.p2 {
    public mg1 f35492a;
    public org.telegram.ui.Components.vl0 f35493b;
    public long f35494c;
    public ArrayList d;
    public HashSet e;

    public static void U(og1 og1Var, int i10) {
        og1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(og1Var.f35494c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = og1Var.getMessagesController().getInputPeer(og1Var.f35494c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        og1Var.getConnectionsManager().sendRequest(updatenotifysettings, new bi.g1(4));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f35492a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new ng1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f35494c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f17247id))) {
                    arrayList2.add(new ng1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new ng1(3, null));
            arrayList2.add(new ng1(4, null));
        }
        arrayList2.add(new ng1(3, null));
        mg1 mg1Var = this.f35492a;
        if (mg1Var != null) {
            mg1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new b91(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f35493b = new org.telegram.ui.Components.vl0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f41645m = false;
        this.f35493b.setItemAnimator(jVar);
        this.f35493b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var = this.f35493b;
        mg1 mg1Var = new mg1(this);
        this.f35492a = mg1Var;
        vl0Var.setAdapter(mg1Var);
        this.f35493b.setOnItemClickListener(new lg1(this));
        frameLayout.addView(this.f35493b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f35494c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
