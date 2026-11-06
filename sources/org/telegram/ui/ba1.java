package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ba1 extends org.telegram.ui.ActionBar.f2 {
    public z91 f44237a;
    public org.telegram.ui.Components.pj0 f44238b;
    public long f44239c;
    public ArrayList d;
    public HashSet f44240e;

    public static void Z(ba1 ba1Var, int i7) {
        org.telegram.messenger.et etVar = ba1Var.getNotificationsController().f22069g0;
        etVar.getClass();
        String v = org.telegram.messenger.dt.v(ba1Var.f44239c, i7, true);
        SharedPreferences.Editor edit = etVar.b().edit();
        SharedPreferences.Editor remove = edit.remove("notify2_" + v);
        SharedPreferences.Editor remove2 = remove.remove("custom_" + v);
        SharedPreferences.Editor remove3 = remove2.remove("notifyuntil_" + v);
        SharedPreferences.Editor remove4 = remove3.remove("content_preview_" + v);
        SharedPreferences.Editor remove5 = remove4.remove("silent_" + v);
        remove5.remove("stories_" + v).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = ba1Var.getMessagesController().j1(ba1Var.f44239c);
        tL_inputNotifyForumTopic.top_msg_id = i7;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        ba1Var.getConnectionsManager().sendRequest(updatenotifysettings, new di.u5(9));
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f44237a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new aa1(1, null));
        ArrayList l10 = getMessagesController().f24862q7.l(-this.f44239c);
        int i7 = 0;
        if (l10 != null) {
            int i10 = 0;
            while (i7 < l10.size()) {
                if (this.f44240e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).f27004id))) {
                    arrayList2.add(new aa1(2, (TLRPC.TL_forumTopic) l10.get(i7)));
                    i10 = 1;
                }
                i7++;
            }
            i7 = i10;
        }
        if (i7 != 0) {
            arrayList2.add(new aa1(3, null));
            arrayList2.add(new aa1(4, null));
        }
        arrayList2.add(new aa1(3, null));
        z91 z91Var = this.f44237a;
        if (z91Var != null) {
            z91Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 16));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747911, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f44238b = pj0Var;
        pj0Var.r1();
        this.f44238b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f56979m = false;
        this.f44238b.setItemAnimator(kVar);
        this.f44238b.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.f44238b;
        z91 z91Var = new z91(this);
        this.f44237a = z91Var;
        pj0Var2.setAdapter(z91Var);
        this.f44238b.setOnItemClickListener(new y91(this));
        frameLayout.addView(this.f44238b);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f44238b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f44239c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
