package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class px implements View.OnClickListener {
    public final boolean[] f38624a;
    public final hi.x4 f38625b;
    public final androidx.mediarouter.app.w f38626c;

    public px(androidx.mediarouter.app.w wVar, boolean[] zArr, hi.x4 x4Var) {
        this.f38626c = wVar;
        this.f38624a = zArr;
        this.f38625b = x4Var;
    }

    @Override
    public final void onClick(View view) {
        sx sxVar = (sx) this.f38626c.f2752b;
        boolean[] zArr = this.f38624a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, sxVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        ty tyVar = sxVar.G;
        String str = sxVar.f39671x;
        if (str == null) {
            str = tyVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.h3(new org.telegram.ui.f0(this, t1VarArr, ConnectionsManager.getInstance(tyVar.f40074d1).sendRequest(tL_messages_getEmojiURL, new bi.q1(this, t1VarArr, this.f38625b, 16)), 10), 1000L);
    }
}
