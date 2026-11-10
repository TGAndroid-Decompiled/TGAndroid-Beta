package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class cx implements View.OnClickListener {
    public final boolean[] f32775a;
    public final h9.f1 f32776b;
    public final androidx.mediarouter.app.w f32777c;

    public cx(androidx.mediarouter.app.w wVar, boolean[] zArr, h9.f1 f1Var) {
        this.f32777c = wVar;
        this.f32775a = zArr;
        this.f32776b = f1Var;
    }

    @Override
    public final void onClick(View view) {
        gx gxVar = (gx) this.f32777c.f2833b;
        boolean[] zArr = this.f32775a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, gxVar.F.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        gy gyVar = gxVar.F;
        String str = gxVar.f34002x;
        if (str == null) {
            str = gyVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.i3(new org.telegram.ui.q8(this, u1VarArr, ConnectionsManager.getInstance(gyVar.f34016c1).sendRequest(tL_messages_getEmojiURL, new bi.f2(this, u1VarArr, this.f32776b, 13)), 7), 1000L);
    }
}
