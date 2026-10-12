package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class yy implements View.OnClickListener {
    public final boolean[] f33225a;
    public final org.telegram.ui.ActionBar.z2 f33226b;
    public final zy f33227c;

    public yy(zy zyVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f33227c = zyVar;
        this.f33225a = zArr;
        this.f33226b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        cz czVar = this.f33227c.f33521a;
        boolean[] zArr = this.f33225a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(czVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        d00 d00Var = czVar.F;
        String str = czVar.f25049w;
        if (str == null) {
            str = d00Var.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new bl(this, a2VarArr, ConnectionsManager.getInstance(d00Var.f25072c1).sendRequest(tL_messages_getEmojiURL, new ai.t5(this, a2VarArr, this.f33226b, 8)), 3), 1000L);
    }
}
