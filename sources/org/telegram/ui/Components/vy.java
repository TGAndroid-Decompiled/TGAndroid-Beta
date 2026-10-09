package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class vy implements View.OnClickListener {
    public final boolean[] f32474a;
    public final org.telegram.ui.ActionBar.a3 f32475b;
    public final wy f32476c;

    public vy(wy wyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f32476c = wyVar;
        this.f32474a = zArr;
        this.f32475b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        zy zyVar = this.f32476c.f32694a;
        boolean[] zArr = this.f32474a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(zyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        a00 a00Var = zyVar.F;
        String str = zyVar.f33680w;
        if (str == null) {
            str = a00Var.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new zk(this, b2VarArr, ConnectionsManager.getInstance(a00Var.f24401c1).sendRequest(tL_messages_getEmojiURL, new ai.t5(this, b2VarArr, this.f32475b, 8)), 3), 1000L);
    }
}
