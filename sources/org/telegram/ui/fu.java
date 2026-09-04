package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fu implements View.OnClickListener {
    public final int f36468a = 1;
    public final int f36469b;
    public final Object f36470c;
    public final Object d;
    public final KeyEvent.Callback[] f36471e;
    public final Object f36472f;
    public final Object h;
    public final Object f36473n;

    public fu(di.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.f6 f6Var, boolean[] zArr, Activity activity) {
        this.f36470c = dVar;
        this.d = starsSubscription;
        this.f36469b = i10;
        this.f36471e = f3VarArr;
        this.f36472f = f6Var;
        this.h = zArr;
        this.f36473n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36468a) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f36470c, (org.telegram.ui.Cells.s8) this.d, (org.telegram.ui.Cells.s8[]) this.f36471e, this.f36469b, (org.telegram.ui.Cells.c5[]) this.f36472f, (org.telegram.ui.Cells.w8[]) this.h, (AnimatorSet[]) this.f36473n, view);
                return;
            default:
                di.d dVar = (di.d) this.f36470c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f36471e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f36472f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f36473n;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f36469b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new bi.fa(dVar, f3VarArr, f6Var, i10, tL_messages_checkChatInvite, 14));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        of.f.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new zh.u6(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public fu(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        this.f36470c = dataAutoDownloadActivity;
        this.d = s8Var;
        this.f36471e = s8VarArr;
        this.f36469b = i10;
        this.f36472f = c5VarArr;
        this.h = w8VarArr;
        this.f36473n = animatorSetArr;
    }
}
