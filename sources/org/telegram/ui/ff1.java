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
public final class ff1 extends org.telegram.ui.ActionBar.o2 {
    public df1 f38143a;
    public org.telegram.ui.Components.jl0 f38144b;
    public long f38145c;
    public ArrayList d;
    public HashSet f38146e;

    public static void U(ff1 ff1Var, int i10) {
        ff1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(ff1Var.f38145c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = ff1Var.getMessagesController().getInputPeer(ff1Var.f38145c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        ff1Var.getConnectionsManager().sendRequest(updatenotifysettings, new lh.o5(5));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f38143a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new ef1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f38145c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.f38146e.contains(Integer.valueOf(topics.get(i10).f22444id))) {
                    arrayList2.add(new ef1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new ef1(3, null));
            arrayList2.add(new ef1(4, null));
        }
        arrayList2.add(new ef1(3, null));
        df1 df1Var = this.f38143a;
        if (df1Var != null) {
            df1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        th.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 22));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f38144b = new org.telegram.ui.Components.jl0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f6463m = false;
        this.f38144b.setItemAnimator(lVar);
        this.f38144b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var = this.f38144b;
        df1 df1Var = new df1(this);
        this.f38143a = df1Var;
        jl0Var.setAdapter(df1Var);
        this.f38144b.setOnItemClickListener(new cf1(this));
        frameLayout.addView(this.f38144b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38145c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
