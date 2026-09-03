package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hy implements View.OnClickListener {
    public final boolean[] f27646a;
    public final org.telegram.ui.ActionBar.c3 f27647b;
    public final iy f27648c;

    public hy(iy iyVar, boolean[] zArr, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f27648c = iyVar;
        this.f27646a = zArr;
        this.f27647b = c3Var;
    }

    @Override
    public final void onClick(View view) {
        ly lyVar = this.f27648c.f27909a;
        boolean[] zArr = this.f27646a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(lyVar.C.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        mz mzVar = lyVar.C;
        String str = lyVar.f28900w;
        if (str == null) {
            str = mzVar.T0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new gy(this, d2VarArr, ConnectionsManager.getInstance(mzVar.Z0).sendRequest(tL_messages_getEmojiURL, new hg.y(this, d2VarArr, this.f27647b, 13)), 0), 1000L);
    }
}
