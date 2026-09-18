package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class fy implements View.OnClickListener {
    public final boolean[] f24029a;
    public final org.telegram.ui.ActionBar.b3 f24030b;
    public final gy f24031c;

    public fy(gy gyVar, boolean[] zArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f24031c = gyVar;
        this.f24029a = zArr;
        this.f24030b = b3Var;
    }

    @Override
    public final void onClick(View view) {
        jy jyVar = this.f24031c.f24417a;
        boolean[] zArr = this.f24029a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(jyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        kz kzVar = jyVar.F;
        String str = jyVar.f25466w;
        if (str == null) {
            str = kzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new wm(this, c2VarArr, ConnectionsManager.getInstance(kzVar.f25716c1).sendRequest(tL_messages_getEmojiURL, new ai.t5(this, c2VarArr, this.f24030b, 8)), 2), 1000L);
    }
}
