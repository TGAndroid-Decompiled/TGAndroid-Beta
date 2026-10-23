package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ny implements View.OnClickListener {
    public final boolean[] f29037a;
    public final org.telegram.ui.ActionBar.b3 f29038b;
    public final oy f29039c;

    public ny(oy oyVar, boolean[] zArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f29039c = oyVar;
        this.f29037a = zArr;
        this.f29038b = b3Var;
    }

    @Override
    public final void onClick(View view) {
        ty tyVar = this.f29039c.f29359a;
        boolean[] zArr = this.f29037a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(tyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        tz tzVar = tyVar.F;
        String str = tyVar.f30923w;
        if (str == null) {
            str = tzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.h4(this, c2VarArr, ConnectionsManager.getInstance(tzVar.f30966c1).sendRequest(tL_messages_getEmojiURL, new ai.j2(this, c2VarArr, this.f29038b, 13)), 8), 1000L);
    }
}
