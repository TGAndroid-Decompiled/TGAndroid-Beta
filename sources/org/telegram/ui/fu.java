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
    public final int f32915a = 1;
    public final int f32916b;
    public final Object f32917c;
    public final Object d;
    public final KeyEvent.Callback[] e;
    public final Object f32918f;
    public final Object h;
    public final Object f32919n;

    public fu(bi.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.h3[] h3VarArr, org.telegram.ui.ActionBar.f6 f6Var, boolean[] zArr, Activity activity) {
        this.f32917c = dVar;
        this.d = starsSubscription;
        this.f32916b = i10;
        this.e = h3VarArr;
        this.f32918f = f6Var;
        this.h = zArr;
        this.f32919n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32915a) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f32917c, (org.telegram.ui.Cells.t8) this.d, (org.telegram.ui.Cells.t8[]) this.e, this.f32916b, (org.telegram.ui.Cells.d5[]) this.f32918f, (org.telegram.ui.Cells.x8[]) this.h, (AnimatorSet[]) this.f32919n, view);
                return;
            default:
                bi.d dVar = (bi.d) this.f32917c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f32918f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f32919n;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f32916b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new fg.e1(dVar, h3VarArr, f6Var, i10, tL_messages_checkChatInvite, 13));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        nf.f.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new xh.x6(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public fu(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.t8 t8Var, org.telegram.ui.Cells.t8[] t8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.x8[] x8VarArr, AnimatorSet[] animatorSetArr) {
        this.f32917c = dataAutoDownloadActivity;
        this.d = t8Var;
        this.e = t8VarArr;
        this.f32916b = i10;
        this.f32918f = d5VarArr;
        this.h = x8VarArr;
        this.f32919n = animatorSetArr;
    }
}
