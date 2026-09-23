package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bu implements View.OnClickListener {
    public final int f32178a = 1;
    public final int f32179b;
    public final Object f32180c;
    public final Object d;
    public final KeyEvent.Callback[] e;
    public final Object f32181f;
    public final Object h;
    public final Object f32182n;

    public bu(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.d6 d6Var, boolean[] zArr, Activity activity) {
        this.f32180c = dVar;
        this.d = starsSubscription;
        this.f32179b = i10;
        this.e = f3VarArr;
        this.f32181f = d6Var;
        this.h = zArr;
        this.f32182n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32178a) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f32180c, (org.telegram.ui.Cells.t8) this.d, (org.telegram.ui.Cells.t8[]) this.e, this.f32179b, (org.telegram.ui.Cells.d5[]) this.f32181f, (org.telegram.ui.Cells.x8[]) this.h, (AnimatorSet[]) this.f32182n, view);
                return;
            default:
                ci.d dVar = (ci.d) this.f32180c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.e;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f32181f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f32182n;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f32179b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new ai.ya(dVar, f3VarArr, d6Var, i10, tL_messages_checkChatInvite, 14));
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

    public bu(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.t8 t8Var, org.telegram.ui.Cells.t8[] t8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.x8[] x8VarArr, AnimatorSet[] animatorSetArr) {
        this.f32180c = dataAutoDownloadActivity;
        this.d = t8Var;
        this.e = t8VarArr;
        this.f32179b = i10;
        this.f32181f = d5VarArr;
        this.h = x8VarArr;
        this.f32182n = animatorSetArr;
    }
}
