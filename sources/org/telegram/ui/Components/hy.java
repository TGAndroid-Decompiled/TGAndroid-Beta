package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hy implements View.OnClickListener {
    public final boolean[] f27598a;
    public final org.telegram.ui.ActionBar.c3 f27599b;
    public final iy f27600c;

    public hy(iy iyVar, boolean[] zArr, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f27600c = iyVar;
        this.f27598a = zArr;
        this.f27599b = c3Var;
    }

    @Override
    public final void onClick(View view) {
        ly lyVar = this.f27600c.f27920a;
        boolean[] zArr = this.f27598a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(lyVar.C.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        mz mzVar = lyVar.C;
        String str = lyVar.f28848w;
        if (str == null) {
            str = mzVar.T0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new gy(this, d2VarArr, ConnectionsManager.getInstance(mzVar.Z0).sendRequest(tL_messages_getEmojiURL, new hg.y(this, d2VarArr, this.f27599b, 13)), 0), 1000L);
    }
}
