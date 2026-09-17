package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class hu implements View.OnClickListener {
    public final int f34342a = 1;
    public final int f34343b;
    public final Object f34344c;
    public final Object d;
    public final KeyEvent.Callback[] e;
    public final Object f34345f;
    public final Object h;
    public final Object f34346n;

    public hu(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.g3[] g3VarArr, org.telegram.ui.ActionBar.f6 f6Var, boolean[] zArr, Activity activity) {
        this.f34344c = dVar;
        this.d = starsSubscription;
        this.f34343b = i10;
        this.e = g3VarArr;
        this.f34345f = f6Var;
        this.h = zArr;
        this.f34346n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34342a) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f34344c, (org.telegram.ui.Cells.s8) this.d, (org.telegram.ui.Cells.s8[]) this.e, this.f34343b, (org.telegram.ui.Cells.c5[]) this.f34345f, (org.telegram.ui.Cells.w8[]) this.h, (AnimatorSet[]) this.f34346n, view);
                return;
            default:
                ci.d dVar = (ci.d) this.f34344c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f34345f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f34346n;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f34343b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new ai.ya(dVar, g3VarArr, f6Var, i10, tL_messages_checkChatInvite, 14));
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

    public hu(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        this.f34344c = dataAutoDownloadActivity;
        this.d = s8Var;
        this.e = s8VarArr;
        this.f34343b = i10;
        this.f34345f = c5VarArr;
        this.h = w8VarArr;
        this.f34346n = animatorSetArr;
    }
}
