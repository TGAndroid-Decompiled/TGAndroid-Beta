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
    public final int f36388a = 1;
    public final int f36389b;
    public final Object f36390c;
    public final Object d;
    public final KeyEvent.Callback[] f36391e;
    public final Object f36392f;
    public final Object h;
    public final Object f36393n;

    public fu(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.d6 d6Var, boolean[] zArr, Activity activity) {
        this.f36390c = dVar;
        this.d = starsSubscription;
        this.f36389b = i10;
        this.f36391e = f3VarArr;
        this.f36392f = d6Var;
        this.h = zArr;
        this.f36393n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36388a) {
            case 0:
                DataAutoDownloadActivity.S((DataAutoDownloadActivity) this.f36390c, (org.telegram.ui.Cells.s8) this.d, (org.telegram.ui.Cells.s8[]) this.f36391e, this.f36389b, (org.telegram.ui.Cells.d5[]) this.f36392f, (org.telegram.ui.Cells.w8[]) this.h, (AnimatorSet[]) this.f36393n, view);
                return;
            default:
                ci.d dVar = (ci.d) this.f36390c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f36391e;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f36392f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f36393n;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f36389b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new ai.ya(dVar, f3VarArr, d6Var, i10, tL_messages_checkChatInvite, 13));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        nf.f.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new yh.y6(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public fu(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        this.f36390c = dataAutoDownloadActivity;
        this.d = s8Var;
        this.f36391e = s8VarArr;
        this.f36389b = i10;
        this.f36392f = d5VarArr;
        this.h = w8VarArr;
        this.f36393n = animatorSetArr;
    }
}
