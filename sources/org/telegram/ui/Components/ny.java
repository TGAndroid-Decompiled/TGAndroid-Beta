package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ny implements View.OnClickListener {
    public final boolean[] f28845a;
    public final org.telegram.ui.ActionBar.a3 f28846b;
    public final oy f28847c;

    public ny(oy oyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f28847c = oyVar;
        this.f28845a = zArr;
        this.f28846b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        ty tyVar = this.f28847c.f29085a;
        boolean[] zArr = this.f28845a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(tyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        tz tzVar = tyVar.F;
        String str = tyVar.f30742w;
        if (str == null) {
            str = tzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(this, b2VarArr, ConnectionsManager.getInstance(tzVar.f30754c1).sendRequest(tL_messages_getEmojiURL, new ai.q2(this, b2VarArr, this.f28846b, 13)), 8), 1000L);
    }
}
