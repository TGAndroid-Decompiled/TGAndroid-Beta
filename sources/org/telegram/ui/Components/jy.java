package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class jy implements View.OnClickListener {
    public final boolean[] f27910a;
    public final org.telegram.ui.ActionBar.a3 f27911b;
    public final ky f27912c;

    public jy(ky kyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f27912c = kyVar;
        this.f27910a = zArr;
        this.f27911b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        ny nyVar = this.f27912c.f28206a;
        boolean[] zArr = this.f27910a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(nyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        nz nzVar = nyVar.F;
        String str = nyVar.f29079w;
        if (str == null) {
            str = nzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new zm(this, b2VarArr, ConnectionsManager.getInstance(nzVar.f29091c1).sendRequest(tL_messages_getEmojiURL, new ai.s5(this, b2VarArr, this.f27911b, 8)), 2), 1000L);
    }
}
