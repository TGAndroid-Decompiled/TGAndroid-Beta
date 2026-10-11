package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class wy implements View.OnClickListener {
    public final boolean[] f32808a;
    public final org.telegram.ui.ActionBar.z2 f32809b;
    public final xy f32810c;

    public wy(xy xyVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f32810c = xyVar;
        this.f32808a = zArr;
        this.f32809b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        az azVar = this.f32810c.f33087a;
        boolean[] zArr = this.f32808a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(azVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        b00 b00Var = azVar.F;
        String str = azVar.f24710w;
        if (str == null) {
            str = b00Var.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new zk(this, a2VarArr, ConnectionsManager.getInstance(b00Var.f24731c1).sendRequest(tL_messages_getEmojiURL, new ai.t5(this, a2VarArr, this.f32809b, 8)), 3), 1000L);
    }
}
