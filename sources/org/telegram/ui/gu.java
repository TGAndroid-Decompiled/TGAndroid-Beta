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
    public final int f33977a = 1;
    public final int f33978b;
    public final Object f33979c;
    public final Object d;
    public final KeyEvent.Callback[] e;
    public final Object f33980f;
    public final Object h;
    public final Object f33981n;

    public gu(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.f6 f6Var, boolean[] zArr, Activity activity) {
        this.f33979c = dVar;
        this.d = starsSubscription;
        this.f33978b = i10;
        this.e = f3VarArr;
        this.f33980f = f6Var;
        this.h = zArr;
        this.f33981n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33977a) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f33979c, (org.telegram.ui.Cells.t8) this.d, (org.telegram.ui.Cells.t8[]) this.e, this.f33978b, (org.telegram.ui.Cells.e5[]) this.f33980f, (org.telegram.ui.Cells.x8[]) this.h, (AnimatorSet[]) this.f33981n, view);
                return;
            default:
                ci.d dVar = (ci.d) this.f33979c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f33980f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f33981n;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f33978b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new ai.ya(dVar, f3VarArr, f6Var, i10, tL_messages_checkChatInvite, 14));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        nf.f.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new yh.v6(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public gu(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.t8 t8Var, org.telegram.ui.Cells.t8[] t8VarArr, int i10, org.telegram.ui.Cells.e5[] e5VarArr, org.telegram.ui.Cells.x8[] x8VarArr, AnimatorSet[] animatorSetArr) {
        this.f33979c = dataAutoDownloadActivity;
        this.d = t8Var;
        this.e = t8VarArr;
        this.f33978b = i10;
        this.f33980f = e5VarArr;
        this.h = x8VarArr;
        this.f33981n = animatorSetArr;
    }
}
