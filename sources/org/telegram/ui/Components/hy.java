package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hy implements View.OnClickListener {
    public final boolean[] f24859a;
    public final org.telegram.ui.ActionBar.z2 f24860b;
    public final iy f24861c;

    public hy(iy iyVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f24861c = iyVar;
        this.f24859a = zArr;
        this.f24860b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        ly lyVar = this.f24861c.f25173a;
        boolean[] zArr = this.f24859a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(lyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        lz lzVar = lyVar.F;
        String str = lyVar.f26217w;
        if (str == null) {
            str = lzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new xm(this, a2VarArr, ConnectionsManager.getInstance(lzVar.f26229c1).sendRequest(tL_messages_getEmojiURL, new ai.s5(this, a2VarArr, this.f24860b, 8)), 2), 1000L);
    }
}
