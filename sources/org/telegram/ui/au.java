package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class au implements View.OnClickListener {
    public final int f32233a = 1;
    public final int f32234b;
    public final Object f32235c;
    public final Object d;
    public final KeyEvent.Callback[] e;
    public final Object f32236f;
    public final Object h;
    public final Object f32237n;

    public au(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.d6 d6Var, boolean[] zArr, Activity activity) {
        this.f32235c = dVar;
        this.d = starsSubscription;
        this.f32234b = i10;
        this.e = e3VarArr;
        this.f32236f = d6Var;
        this.h = zArr;
        this.f32237n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32233a) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f32235c, (org.telegram.ui.Cells.s8) this.d, (org.telegram.ui.Cells.s8[]) this.e, this.f32234b, (org.telegram.ui.Cells.d5[]) this.f32236f, (org.telegram.ui.Cells.w8[]) this.h, (AnimatorSet[]) this.f32237n, view);
                return;
            default:
                ci.d dVar = (ci.d) this.f32235c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.e;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f32236f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f32237n;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f32234b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new ai.ya(dVar, e3VarArr, d6Var, i10, tL_messages_checkChatInvite, 14));
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

    public au(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        this.f32235c = dataAutoDownloadActivity;
        this.d = s8Var;
        this.e = s8VarArr;
        this.f32234b = i10;
        this.f32236f = d5VarArr;
        this.h = w8VarArr;
        this.f32237n = animatorSetArr;
    }
}
