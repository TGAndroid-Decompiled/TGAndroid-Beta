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
public final class df1 extends org.telegram.ui.ActionBar.o2 {
    public bf1 f36619a;
    public org.telegram.ui.Components.lm0 f36620b;
    public long f36621c;
    public ArrayList d;
    public HashSet e;

    public static void U(df1 df1Var, int i10) {
        df1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(df1Var.f36621c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = df1Var.getMessagesController().getInputPeer(df1Var.f36621c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        df1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ci.d6(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f36619a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new cf1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f36621c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f20396id))) {
                    arrayList2.add(new cf1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new cf1(3, null));
            arrayList2.add(new cf1(4, null));
        }
        arrayList2.add(new cf1(3, null));
        bf1 bf1Var = this.f36619a;
        if (bf1Var != null) {
            bf1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.o1.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new b31(this, 9));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f36620b = new org.telegram.ui.Components.lm0(context, null);
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f46376m = false;
        this.f36620b.setItemAnimator(kVar);
        this.f36620b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.lm0 lm0Var = this.f36620b;
        bf1 bf1Var = new bf1(this);
        this.f36619a = bf1Var;
        lm0Var.setAdapter(bf1Var);
        this.f36620b.setOnItemClickListener(new af1(this));
        frameLayout.addView(this.f36620b);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36621c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
