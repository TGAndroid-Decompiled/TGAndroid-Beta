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
public final class ef1 extends org.telegram.ui.ActionBar.o2 {
    public cf1 f36960a;
    public org.telegram.ui.Components.mm0 f36961b;
    public long f36962c;
    public ArrayList d;
    public HashSet e;

    public static void U(ef1 ef1Var, int i10) {
        ef1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(ef1Var.f36962c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = ef1Var.getMessagesController().getInputPeer(ef1Var.f36962c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        ef1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ci.d6(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f36960a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new df1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f36962c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f20395id))) {
                    arrayList2.add(new df1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new df1(3, null));
            arrayList2.add(new df1(4, null));
        }
        arrayList2.add(new df1(3, null));
        cf1 cf1Var = this.f36960a;
        if (cf1Var != null) {
            cf1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.o1.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new c31(this, 9));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f36961b = new org.telegram.ui.Components.mm0(context, null);
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f46377m = false;
        this.f36961b.setItemAnimator(kVar);
        this.f36961b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var = this.f36961b;
        cf1 cf1Var = new cf1(this);
        this.f36960a = cf1Var;
        mm0Var.setAdapter(cf1Var);
        this.f36961b.setOnItemClickListener(new bf1(this));
        frameLayout.addView(this.f36961b);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, null);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36962c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
