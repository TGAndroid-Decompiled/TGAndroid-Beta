package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ca1 extends org.telegram.ui.ActionBar.g2 {
    public aa1 f46752a;
    public org.telegram.ui.Components.ek0 f46753b;
    public long f46754c;
    public ArrayList d;
    public HashSet f46755e;

    public static void Z(ca1 ca1Var, int i7) {
        org.telegram.messenger.ys ysVar = ca1Var.getNotificationsController().f28092h0;
        ysVar.getClass();
        String v = org.telegram.messenger.xs.v(ca1Var.f46754c, i7, true);
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
        tL_inputNotifyForumTopic.peer = ca1Var.getMessagesController().l1(ca1Var.f46754c);
        tL_inputNotifyForumTopic.top_msg_id = i7;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        ca1Var.getConnectionsManager().sendRequest(updatenotifysettings, new fi.l5(9));
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f46752a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new ba1(1, null));
        ArrayList l10 = getMessagesController().f25864t7.l(-this.f46754c);
        int i7 = 0;
        if (l10 != null) {
            int i10 = 0;
            while (i7 < l10.size()) {
                if (this.f46755e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).f28544id))) {
                    arrayList2.add(new ba1(2, (TLRPC.TL_forumTopic) l10.get(i7)));
                    i10 = 1;
                }
                i7++;
            }
            i7 = i10;
        }
        if (i7 != 0) {
            arrayList2.add(new ba1(3, null));
            arrayList2.add(new ba1(4, null));
        }
        arrayList2.add(new ba1(3, null));
        aa1 aa1Var = this.f46752a;
        if (aa1Var != null) {
            aa1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 19));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747718, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f46753b = ek0Var;
        ek0Var.r1();
        this.f46753b.setSectionsDrawBackground(true);
        v4.l lVar = new v4.l();
        lVar.C = false;
        lVar.f59274m = false;
        this.f46753b.setItemAnimator(lVar);
        this.f46753b.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f46753b;
        aa1 aa1Var = new aa1(this);
        this.f46752a = aa1Var;
        ek0Var2.setAdapter(aa1Var);
        this.f46753b.setOnItemClickListener(new z91(this));
        frameLayout.addView(this.f46753b);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f46753b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f46754c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
