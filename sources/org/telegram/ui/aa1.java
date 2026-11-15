package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class aa1 extends org.telegram.ui.ActionBar.e2 {
    public y91 f44980a;
    public org.telegram.ui.Components.uj0 f44981b;
    public long f44982c;
    public ArrayList d;
    public HashSet f44983e;

    public static void Z(aa1 aa1Var, int i7) {
        org.telegram.messenger.bt btVar = aa1Var.getNotificationsController().f22577h0;
        btVar.getClass();
        String v = org.telegram.messenger.at.v(aa1Var.f44982c, i7, true);
        SharedPreferences.Editor edit = btVar.b().edit();
        SharedPreferences.Editor remove = edit.remove("notify2_" + v);
        SharedPreferences.Editor remove2 = remove.remove("custom_" + v);
        SharedPreferences.Editor remove3 = remove2.remove("notifyuntil_" + v);
        SharedPreferences.Editor remove4 = remove3.remove("content_preview_" + v);
        SharedPreferences.Editor remove5 = remove4.remove("silent_" + v);
        remove5.remove("stories_" + v).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = aa1Var.getMessagesController().j1(aa1Var.f44982c);
        tL_inputNotifyForumTopic.top_msg_id = i7;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        aa1Var.getConnectionsManager().sendRequest(updatenotifysettings, new fi.m5(9));
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f44980a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new z91(1, null));
        ArrayList l10 = getMessagesController().f25383r7.l(-this.f44982c);
        int i7 = 0;
        if (l10 != null) {
            int i10 = 0;
            while (i7 < l10.size()) {
                if (this.f44983e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).f28103id))) {
                    arrayList2.add(new z91(2, (TLRPC.TL_forumTopic) l10.get(i7)));
                    i10 = 1;
                }
                i7++;
            }
            i7 = i10;
        }
        if (i7 != 0) {
            arrayList2.add(new z91(3, null));
            arrayList2.add(new z91(4, null));
        }
        arrayList2.add(new z91(3, null));
        y91 y91Var = this.f44980a;
        if (y91Var != null) {
            y91Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 17));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747912, null));
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f44981b = uj0Var;
        uj0Var.r1();
        this.f44981b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f58564m = false;
        this.f44981b.setItemAnimator(kVar);
        this.f44981b.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.f44981b;
        y91 y91Var = new y91(this);
        this.f44980a = y91Var;
        uj0Var2.setAdapter(y91Var);
        this.f44981b.setOnItemClickListener(new x91(this));
        frameLayout.addView(this.f44981b);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f44981b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f44982c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
