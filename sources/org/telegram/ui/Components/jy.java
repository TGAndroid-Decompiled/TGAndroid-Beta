package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class jy implements View.OnClickListener {
    public final boolean[] f25584a;
    public final org.telegram.ui.ActionBar.z2 f25585b;
    public final ky f25586c;

    public jy(ky kyVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f25586c = kyVar;
        this.f25584a = zArr;
        this.f25585b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        ny nyVar = this.f25586c.f25838a;
        boolean[] zArr = this.f25584a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(nyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        nz nzVar = nyVar.F;
        String str = nyVar.f26804w;
        if (str == null) {
            str = nzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new zm(this, a2VarArr, ConnectionsManager.getInstance(nzVar.f26818c1).sendRequest(tL_messages_getEmojiURL, new ai.s5(this, a2VarArr, this.f25585b, 8)), 2), 1000L);
    }
}
