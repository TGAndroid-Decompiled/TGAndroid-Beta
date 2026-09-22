package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class fy implements View.OnClickListener {
    public final boolean[] f24106a;
    public final org.telegram.ui.ActionBar.a3 f24107b;
    public final gy f24108c;

    public fy(gy gyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f24108c = gyVar;
        this.f24106a = zArr;
        this.f24107b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        jy jyVar = this.f24108c.f24469a;
        boolean[] zArr = this.f24106a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(jyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        kz kzVar = jyVar.F;
        String str = jyVar.f25452w;
        if (str == null) {
            str = kzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new wm(this, b2VarArr, ConnectionsManager.getInstance(kzVar.f25700c1).sendRequest(tL_messages_getEmojiURL, new ai.t5(this, b2VarArr, this.f24107b, 8)), 2), 1000L);
    }
}
