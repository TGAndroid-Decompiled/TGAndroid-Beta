package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class my implements View.OnClickListener {
    public final boolean[] f30772a;
    public final org.telegram.ui.ActionBar.e3 f30773b;
    public final ny f30774c;

    public my(ny nyVar, boolean[] zArr, org.telegram.ui.ActionBar.e3 e3Var) {
        this.f30774c = nyVar;
        this.f30772a = zArr;
        this.f30773b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        sy syVar = this.f30774c.f31088a;
        boolean[] zArr = this.f30772a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(syVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        sz szVar = syVar.F;
        String str = syVar.f32704w;
        if (str == null) {
            str = szVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(this, e2VarArr, ConnectionsManager.getInstance(szVar.f32716c1).sendRequest(tL_messages_getEmojiURL, new bi.h2(this, e2VarArr, this.f30773b, 13)), 8), 1000L);
    }
}
