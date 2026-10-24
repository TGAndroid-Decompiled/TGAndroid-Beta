package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ly implements View.OnClickListener {
    public final boolean[] f28467a;
    public final org.telegram.ui.ActionBar.b3 f28468b;
    public final my f28469c;

    public ly(my myVar, boolean[] zArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f28469c = myVar;
        this.f28467a = zArr;
        this.f28468b = b3Var;
    }

    @Override
    public final void onClick(View view) {
        ry ryVar = this.f28469c.f28718a;
        boolean[] zArr = this.f28467a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(ryVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        rz rzVar = ryVar.F;
        String str = ryVar.f30295w;
        if (str == null) {
            str = rzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.h4(this, c2VarArr, ConnectionsManager.getInstance(rzVar.f30310c1).sendRequest(tL_messages_getEmojiURL, new ai.j2(this, c2VarArr, this.f28468b, 13)), 8), 1000L);
    }
}
