package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hy implements View.OnClickListener {
    public final boolean[] f24927a;
    public final org.telegram.ui.ActionBar.b3 f24928b;
    public final iy f24929c;

    public hy(iy iyVar, boolean[] zArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f24929c = iyVar;
        this.f24927a = zArr;
        this.f24928b = b3Var;
    }

    @Override
    public final void onClick(View view) {
        my myVar = this.f24929c.f25264a;
        boolean[] zArr = this.f24927a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(myVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        mz mzVar = myVar.F;
        String str = myVar.f26560w;
        if (str == null) {
            str = mzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new ym(this, c2VarArr, ConnectionsManager.getInstance(mzVar.f26574c1).sendRequest(tL_messages_getEmojiURL, new ai.s5(this, c2VarArr, this.f24928b, 8)), 2), 1000L);
    }
}
