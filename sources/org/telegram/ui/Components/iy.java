package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class iy implements View.OnClickListener {
    public final boolean[] f25227a;
    public final org.telegram.ui.ActionBar.z2 f25228b;
    public final jy f25229c;

    public iy(jy jyVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f25229c = jyVar;
        this.f25227a = zArr;
        this.f25228b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        my myVar = this.f25229c.f25530a;
        boolean[] zArr = this.f25227a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(myVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        mz mzVar = myVar.F;
        String str = myVar.f26517w;
        if (str == null) {
            str = mzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new ym(this, a2VarArr, ConnectionsManager.getInstance(mzVar.f26531c1).sendRequest(tL_messages_getEmojiURL, new ai.s5(this, a2VarArr, this.f25228b, 8)), 2), 1000L);
    }
}
