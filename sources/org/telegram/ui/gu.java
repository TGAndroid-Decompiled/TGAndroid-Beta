package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gu implements View.OnClickListener {
    public final int f33941a = 1;
    public final int f33942b;
    public final Object f33943c;
    public final Object d;
    public final KeyEvent.Callback[] e;
    public final Object f33944f;
    public final Object h;
    public final Object f33945n;

    public gu(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.e6 e6Var, boolean[] zArr, Activity activity) {
        this.f33943c = dVar;
        this.d = starsSubscription;
        this.f33942b = i10;
        this.e = f3VarArr;
        this.f33944f = e6Var;
        this.h = zArr;
        this.f33945n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33941a) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f33943c, (org.telegram.ui.Cells.s8) this.d, (org.telegram.ui.Cells.s8[]) this.e, this.f33942b, (org.telegram.ui.Cells.d5[]) this.f33944f, (org.telegram.ui.Cells.w8[]) this.h, (AnimatorSet[]) this.f33945n, view);
                return;
            default:
                ci.d dVar = (ci.d) this.f33943c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.e;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f33944f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f33945n;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f33942b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new ai.ya(dVar, f3VarArr, e6Var, i10, tL_messages_checkChatInvite, 14));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        nf.f.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new yh.u6(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public gu(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        this.f33943c = dataAutoDownloadActivity;
        this.d = s8Var;
        this.e = s8VarArr;
        this.f33942b = i10;
        this.f33944f = d5VarArr;
        this.h = w8VarArr;
        this.f33945n = animatorSetArr;
    }
}
