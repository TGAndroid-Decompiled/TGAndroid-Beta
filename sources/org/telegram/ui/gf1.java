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
public final class gf1 extends org.telegram.ui.ActionBar.r2 {
    public ef1 f39641a;
    public org.telegram.ui.Components.mm0 f39642b;
    public long f39643c;
    public ArrayList d;
    public HashSet e;

    public static void V(gf1 gf1Var, int i10) {
        gf1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(gf1Var.f39643c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = gf1Var.getMessagesController().getInputPeer(gf1Var.f39643c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        gf1Var.getConnectionsManager().sendRequest(updatenotifysettings, new di.d6(8));
    }

    public final void W() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f39641a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new ff1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f39643c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f22079id))) {
                    arrayList2.add(new ff1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new ff1(3, null));
            arrayList2.add(new ff1(4, null));
        }
        arrayList2.add(new ff1(3, null));
        ef1 ef1Var = this.f39641a;
        if (ef1Var != null) {
            ef1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 12));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f39642b = mm0Var;
        mm0Var.u1();
        this.f39642b.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.C = false;
        lVar.f47760m = false;
        this.f39642b.setItemAnimator(lVar);
        this.f39642b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f39642b;
        ef1 ef1Var = new ef1(this);
        this.f39641a = ef1Var;
        mm0Var2.setAdapter(ef1Var);
        this.f39642b.setOnItemClickListener(new df1(this));
        frameLayout.addView(this.f39642b);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f39642b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f39643c = this.arguments.getLong("dialog_id");
        W();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
