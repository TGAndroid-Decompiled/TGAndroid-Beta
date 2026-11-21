package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ea1 extends org.telegram.ui.ActionBar.g2 {
    public ca1 f47214a;
    public org.telegram.ui.Components.ek0 f47215b;
    public long f47216c;
    public ArrayList d;
    public HashSet f47217e;

    public static void Z(ea1 ea1Var, int i7) {
        org.telegram.messenger.ys ysVar = ea1Var.getNotificationsController().f28004h0;
        ysVar.getClass();
        String v = org.telegram.messenger.xs.v(ea1Var.f47216c, i7, true);
        SharedPreferences.Editor edit = ysVar.b().edit();
        SharedPreferences.Editor remove = edit.remove("notify2_" + v);
        SharedPreferences.Editor remove2 = remove.remove("custom_" + v);
        SharedPreferences.Editor remove3 = remove2.remove("notifyuntil_" + v);
        SharedPreferences.Editor remove4 = remove3.remove("content_preview_" + v);
        SharedPreferences.Editor remove5 = remove4.remove("silent_" + v);
        remove5.remove("stories_" + v).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = ea1Var.getMessagesController().l1(ea1Var.f47216c);
        tL_inputNotifyForumTopic.top_msg_id = i7;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        ea1Var.getConnectionsManager().sendRequest(updatenotifysettings, new fi.l5(9));
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f47214a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new da1(1, null));
        ArrayList l10 = getMessagesController().f25797t7.l(-this.f47216c);
        int i7 = 0;
        if (l10 != null) {
            int i10 = 0;
            while (i7 < l10.size()) {
                if (this.f47217e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).f28483id))) {
                    arrayList2.add(new da1(2, (TLRPC.TL_forumTopic) l10.get(i7)));
                    i10 = 1;
                }
                i7++;
            }
            i7 = i10;
        }
        if (i7 != 0) {
            arrayList2.add(new da1(3, null));
            arrayList2.add(new da1(4, null));
        }
        arrayList2.add(new da1(3, null));
        ca1 ca1Var = this.f47214a;
        if (ca1Var != null) {
            ca1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 19));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747718, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f47215b = ek0Var;
        ek0Var.r1();
        this.f47215b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f59190m = false;
        this.f47215b.setItemAnimator(kVar);
        this.f47215b.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f47215b;
        ca1 ca1Var = new ca1(this);
        this.f47214a = ca1Var;
        ek0Var2.setAdapter(ca1Var);
        this.f47215b.setOnItemClickListener(new ba1(this));
        frameLayout.addView(this.f47215b);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f47215b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f47216c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
