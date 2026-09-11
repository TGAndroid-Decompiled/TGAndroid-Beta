package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class gy implements View.OnClickListener {
    public final boolean[] f26521a;
    public final org.telegram.ui.ActionBar.a3 f26522b;
    public final hy f26523c;

    public gy(hy hyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f26523c = hyVar;
        this.f26521a = zArr;
        this.f26522b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        ky kyVar = this.f26523c.f26889a;
        boolean[] zArr = this.f26521a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(kyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        kz kzVar = kyVar.F;
        String str = kyVar.f27920w;
        if (str == null) {
            str = kzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.dm(this, b2VarArr, ConnectionsManager.getInstance(kzVar.f27932c1).sendRequest(tL_messages_getEmojiURL, new bi.c5(this, b2VarArr, this.f26522b, 8)), 3), 1000L);
    }
}
