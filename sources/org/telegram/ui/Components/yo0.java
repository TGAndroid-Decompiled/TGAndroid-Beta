package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class yo0 implements NotificationCenter.NotificationCenterDelegate {

    public final TLRPC.Dialog f34937a;

    public final AtomicReference f34938b;

    public final View f34939c;
    public final sp0 d;

    public yo0(sp0 sp0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = sp0Var;
        this.f34937a = dialog;
        this.f34938b = atomicReference;
        this.f34939c = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        sp0 sp0Var = this.d;
        zk0 zk0Var = sp0Var.A;
        pp0 pp0Var = sp0Var.H;
        org.telegram.ui.ActionBar.k kVar = sp0Var.f32546v0;
        long jLongValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f34937a;
        if (jLongValue == (-dialog.f22384id)) {
            ArrayList arrayList = pp0Var.f31649f;
            AtomicReference atomicReference = this.f34938b;
            boolean z10 = (arrayList == null && MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getTopicsController().getTopics(-dialog.f22384id) != null) || atomicReference.get() == null;
            pp0Var.f31649f = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getTopicsController().getTopics(-dialog.f22384id);
            pp0Var.d = UserObject.isBotForum(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount, dialog.f22384id);
            pp0Var.f31648e = UserObject.isBotForumWithEditableTopics(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount, dialog.f22384id);
            if (z10) {
                pp0Var.l();
            }
            if (pp0Var.f31649f != null) {
                NotificationCenter.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
            }
            if (z10) {
                zk0Var.setVisibility(0);
                zk0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (UserObject.isBotForum(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount, dialog.f22384id)) {
                    kVar.setTitle(DialogObject.getShortName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getUser(Long.valueOf(dialog.f22384id))));
                    kVar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                } else if (ChatObject.isMonoForum(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount, dialog.f22384id)) {
                    kVar.setTitle(wf.c.i(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getChat(Long.valueOf(-dialog.f22384id)), ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount, false));
                    kVar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                } else {
                    kVar.setTitle(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getChat(Long.valueOf(-dialog.f22384id)).title);
                    kVar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                }
                sp0Var.I0 = sp0Var.H0;
                o1.j jVar = sp0Var.f32550x0;
                if (jVar != null) {
                    jVar.c();
                }
                int[] iArr = new int[2];
                o1.j jVar2 = new o1.j(new hb.a(0.0f));
                o1.k kVar2 = new o1.k(1000.0f);
                org.telegram.ui.rn rnVar = sp0Var.f32521b0;
                kVar2.b((rnVar == null || !rnVar.f41986b) ? 800.0f : 10.0f);
                kVar2.a(1.0f);
                jVar2.f19147u = kVar2;
                sp0Var.f32550x0 = jVar2;
                jVar2.b(new jo0(this, this.f34939c, iArr, 1));
                sp0Var.f32550x0.a(new wa(this, 5));
                sp0Var.f32550x0.f();
                if (atomicReference.get() != null) {
                    AndroidUtilities.cancelRunOnUIThread((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
