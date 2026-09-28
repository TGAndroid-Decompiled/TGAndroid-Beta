package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class iy implements View.OnClickListener {
    public final boolean[] f25247a;
    public final org.telegram.ui.ActionBar.z2 f25248b;
    public final jy f25249c;

    public iy(jy jyVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f25249c = jyVar;
        this.f25247a = zArr;
        this.f25248b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        my myVar = this.f25249c.f25530a;
        boolean[] zArr = this.f25247a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(myVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        mz mzVar = myVar.F;
        String str = myVar.f26518w;
        if (str == null) {
            str = mzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new ym(this, a2VarArr, ConnectionsManager.getInstance(mzVar.f26532c1).sendRequest(tL_messages_getEmojiURL, new ai.s5(this, a2VarArr, this.f25248b, 8)), 2), 1000L);
    }
}
