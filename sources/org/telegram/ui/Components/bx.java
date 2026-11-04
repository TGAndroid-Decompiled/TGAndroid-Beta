package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class bx implements View.OnClickListener {
    public final boolean[] f32415a;
    public final hi.d f32416b;
    public final androidx.mediarouter.app.w f32417c;

    public bx(androidx.mediarouter.app.w wVar, boolean[] zArr, hi.d dVar) {
        this.f32417c = wVar;
        this.f32415a = zArr;
        this.f32416b = dVar;
    }

    @Override
    public final void onClick(View view) {
        ex exVar = (ex) this.f32417c.f2266b;
        boolean[] zArr = this.f32415a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, exVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        ey eyVar = exVar.G;
        String str = exVar.f33498x;
        if (str == null) {
            str = eyVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.i3(new org.telegram.ui.f4(this, s1VarArr, ConnectionsManager.getInstance(eyVar.f33529d1).sendRequest(tL_messages_getEmojiURL, new ai.r6(this, s1VarArr, this.f32416b, 14)), 8), 1000L);
    }
}
