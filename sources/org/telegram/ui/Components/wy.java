package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class wy implements View.OnClickListener {
    public final boolean[] f32759a;
    public final org.telegram.ui.ActionBar.z2 f32760b;
    public final xy f32761c;

    public wy(xy xyVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f32761c = xyVar;
        this.f32759a = zArr;
        this.f32760b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        az azVar = this.f32761c.f33043a;
        boolean[] zArr = this.f32759a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(azVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        b00 b00Var = azVar.F;
        String str = azVar.f24642w;
        if (str == null) {
            str = b00Var.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new zk(this, a2VarArr, ConnectionsManager.getInstance(b00Var.f24662c1).sendRequest(tL_messages_getEmojiURL, new ai.t5(this, a2VarArr, this.f32760b, 8)), 3), 1000L);
    }
}
