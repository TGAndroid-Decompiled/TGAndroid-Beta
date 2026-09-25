package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hy implements View.OnClickListener {
    public final boolean[] f24885a;
    public final org.telegram.ui.ActionBar.z2 f24886b;
    public final iy f24887c;

    public hy(iy iyVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f24887c = iyVar;
        this.f24885a = zArr;
        this.f24886b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        ly lyVar = this.f24887c.f25199a;
        boolean[] zArr = this.f24885a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(lyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        lz lzVar = lyVar.F;
        String str = lyVar.f26225w;
        if (str == null) {
            str = lzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new xm(this, a2VarArr, ConnectionsManager.getInstance(lzVar.f26237c1).sendRequest(tL_messages_getEmojiURL, new ai.s5(this, a2VarArr, this.f24886b, 8)), 2), 1000L);
    }
}
