package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ny implements View.OnClickListener {
    public final boolean[] f28855a;
    public final org.telegram.ui.ActionBar.a3 f28856b;
    public final oy f28857c;

    public ny(oy oyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f28857c = oyVar;
        this.f28855a = zArr;
        this.f28856b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        ty tyVar = this.f28857c.f29111a;
        boolean[] zArr = this.f28855a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(tyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        tz tzVar = tyVar.F;
        String str = tyVar.f30756w;
        if (str == null) {
            str = tzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(this, b2VarArr, ConnectionsManager.getInstance(tzVar.f30770c1).sendRequest(tL_messages_getEmojiURL, new ai.g2(this, b2VarArr, this.f28856b, 13)), 8), 1000L);
    }
}
