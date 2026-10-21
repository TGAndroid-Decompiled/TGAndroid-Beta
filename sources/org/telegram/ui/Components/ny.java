package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ny implements View.OnClickListener {
    public final boolean[] f28896a;
    public final org.telegram.ui.ActionBar.a3 f28897b;
    public final oy f28898c;

    public ny(oy oyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f28898c = oyVar;
        this.f28896a = zArr;
        this.f28897b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        ty tyVar = this.f28898c.f29154a;
        boolean[] zArr = this.f28896a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(tyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        tz tzVar = tyVar.F;
        String str = tyVar.f30711w;
        if (str == null) {
            str = tzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(this, b2VarArr, ConnectionsManager.getInstance(tzVar.f30723c1).sendRequest(tL_messages_getEmojiURL, new ai.j2(this, b2VarArr, this.f28897b, 13)), 8), 1000L);
    }
}
