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
public final class if1 extends org.telegram.ui.ActionBar.r2 {
    public gf1 f40134a;
    public org.telegram.ui.Components.nm0 f40135b;
    public long f40136c;
    public ArrayList d;
    public HashSet e;

    public static void V(if1 if1Var, int i10) {
        if1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(if1Var.f40136c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = if1Var.getMessagesController().getInputPeer(if1Var.f40136c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        if1Var.getConnectionsManager().sendRequest(updatenotifysettings, new di.d6(8));
    }

    public final void W() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f40134a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new hf1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.f40136c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).f22080id))) {
                    arrayList2.add(new hf1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new hf1(3, null));
            arrayList2.add(new hf1(4, null));
        }
        arrayList2.add(new hf1(3, null));
        gf1 gf1Var = this.f40134a;
        if (gf1Var != null) {
            gf1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r11(this, 12));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f40135b = nm0Var;
        nm0Var.u1();
        this.f40135b.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.C = false;
        lVar.f47798m = false;
        this.f40135b.setItemAnimator(lVar);
        this.f40135b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var2 = this.f40135b;
        gf1 gf1Var = new gf1(this);
        this.f40134a = gf1Var;
        nm0Var2.setAdapter(gf1Var);
        this.f40135b.setOnItemClickListener(new ff1(this));
        frameLayout.addView(this.f40135b);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f40135b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f40136c = this.arguments.getLong("dialog_id");
        W();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
