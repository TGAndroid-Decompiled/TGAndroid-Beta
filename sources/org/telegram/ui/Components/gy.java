package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class gy implements View.OnClickListener {
    public final boolean[] f24439a;
    public final org.telegram.ui.ActionBar.a3 f24440b;
    public final hy f24441c;

    public gy(hy hyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f24441c = hyVar;
        this.f24439a = zArr;
        this.f24440b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        ky kyVar = this.f24441c.f24829a;
        boolean[] zArr = this.f24439a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(kyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        lz lzVar = kyVar.F;
        String str = kyVar.f25719w;
        if (str == null) {
            str = lzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new xm(this, b2VarArr, ConnectionsManager.getInstance(lzVar.f25968c1).sendRequest(tL_messages_getEmojiURL, new ai.s5(this, b2VarArr, this.f24440b, 8)), 2), 1000L);
    }
}
