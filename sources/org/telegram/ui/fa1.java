package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class fa1 extends org.telegram.ui.ActionBar.f2 {
    public da1 f45669a;
    public org.telegram.ui.Components.pj0 f45670b;
    public long f45671c;
    public ArrayList d;
    public HashSet f45672e;

    public static void Z(fa1 fa1Var, int i7) {
        org.telegram.messenger.et etVar = fa1Var.getNotificationsController().f22098g0;
        etVar.getClass();
        String v = org.telegram.messenger.dt.v(fa1Var.f45671c, i7, true);
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
        tL_inputNotifyForumTopic.peer = fa1Var.getMessagesController().j1(fa1Var.f45671c);
        tL_inputNotifyForumTopic.top_msg_id = i7;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        fa1Var.getConnectionsManager().sendRequest(updatenotifysettings, new di.v5(9));
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.f45669a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new ea1(1, null));
        ArrayList l10 = getMessagesController().f24881q7.l(-this.f45671c);
        int i7 = 0;
        if (l10 != null) {
            int i10 = 0;
            while (i7 < l10.size()) {
                if (this.f45672e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).f27012id))) {
                    arrayList2.add(new ea1(2, (TLRPC.TL_forumTopic) l10.get(i7)));
                    i10 = 1;
                }
                i7++;
            }
            i7 = i10;
        }
        if (i7 != 0) {
            arrayList2.add(new ea1(3, null));
            arrayList2.add(new ea1(4, null));
        }
        arrayList2.add(new ea1(3, null));
        da1 da1Var = this.f45669a;
        if (da1Var != null) {
            da1Var.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 16));
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747912, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f45670b = pj0Var;
        pj0Var.r1();
        this.f45670b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f57079m = false;
        this.f45670b.setItemAnimator(kVar);
        this.f45670b.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.f45670b;
        da1 da1Var = new da1(this);
        this.f45669a = da1Var;
        pj0Var2.setAdapter(da1Var);
        this.f45670b.setOnItemClickListener(new ca1(this));
        frameLayout.addView(this.f45670b);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f45670b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f45671c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
