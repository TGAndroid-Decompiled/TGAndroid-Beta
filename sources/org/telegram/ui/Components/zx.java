package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class zx implements View.OnClickListener {
    public final boolean[] f35440a;
    public final org.telegram.ui.ActionBar.a3 f35441b;
    public final ay f35442c;

    public zx(ay ayVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f35442c = ayVar;
        this.f35440a = zArr;
        this.f35441b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        ey eyVar = this.f35442c.f26911a;
        boolean[] zArr = this.f35440a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(eyVar.B.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        fz fzVar = eyVar.B;
        String str = eyVar.f28201w;
        if (str == null) {
            str = fzVar.S0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new rm(this, c2VarArr, ConnectionsManager.getInstance(fzVar.Y0).sendRequest(tL_messages_getEmojiURL, new eg.z(this, c2VarArr, this.f35441b, 14)), 2), 1000L);
    }
}
