package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class rx implements View.OnClickListener {
    public final boolean[] f32297a;
    public final org.telegram.ui.ActionBar.a3 f32298b;
    public final sx f32299c;

    public rx(sx sxVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f32299c = sxVar;
        this.f32297a = zArr;
        this.f32298b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        vx vxVar = this.f32299c.f32564a;
        boolean[] zArr = this.f32297a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(vxVar.B.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        wy wyVar = vxVar.B;
        String str = vxVar.f34018w;
        if (str == null) {
            str = wyVar.S0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(this, c2VarArr, ConnectionsManager.getInstance(wyVar.Y0).sendRequest(tL_messages_getEmojiURL, new bg.b0(this, c2VarArr, this.f32298b, 16)), 3), 1000L);
    }
}
