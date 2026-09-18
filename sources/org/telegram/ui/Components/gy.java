package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class gy implements View.OnClickListener {
    public final boolean[] f24503a;
    public final org.telegram.ui.ActionBar.a3 f24504b;
    public final hy f24505c;

    public gy(hy hyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f24505c = hyVar;
        this.f24503a = zArr;
        this.f24504b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        ky kyVar = this.f24505c.f24750a;
        boolean[] zArr = this.f24503a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(kyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        kz kzVar = kyVar.F;
        String str = kyVar.f25879w;
        if (str == null) {
            str = kzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new wm(this, b2VarArr, ConnectionsManager.getInstance(kzVar.f25892c1).sendRequest(tL_messages_getEmojiURL, new ai.t5(this, b2VarArr, this.f24504b, 8)), 2), 1000L);
    }
}
