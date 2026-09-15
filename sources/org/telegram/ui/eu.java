package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class eu implements View.OnClickListener {
    public final int f33402a = 1;
    public final int f33403b;
    public final Object f33404c;
    public final Object d;
    public final KeyEvent.Callback[] e;
    public final Object f33405f;
    public final Object h;
    public final Object f33406n;

    public eu(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.e6 e6Var, boolean[] zArr, Activity activity) {
        this.f33404c = dVar;
        this.d = starsSubscription;
        this.f33403b = i10;
        this.e = f3VarArr;
        this.f33405f = e6Var;
        this.h = zArr;
        this.f33406n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33402a) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f33404c, (org.telegram.ui.Cells.s8) this.d, (org.telegram.ui.Cells.s8[]) this.e, this.f33403b, (org.telegram.ui.Cells.c5[]) this.f33405f, (org.telegram.ui.Cells.w8[]) this.h, (AnimatorSet[]) this.f33406n, view);
                return;
            default:
                ci.d dVar = (ci.d) this.f33404c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.e;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f33405f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f33406n;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f33403b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new ai.ya(dVar, f3VarArr, e6Var, i10, tL_messages_checkChatInvite, 14));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        nf.f.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new yh.x6(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public eu(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        this.f33404c = dataAutoDownloadActivity;
        this.d = s8Var;
        this.e = s8VarArr;
        this.f33403b = i10;
        this.f33405f = c5VarArr;
        this.h = w8VarArr;
        this.f33406n = animatorSetArr;
    }
}
