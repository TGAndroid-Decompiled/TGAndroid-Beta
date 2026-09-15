package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class fy implements View.OnClickListener {
    public final boolean[] f24109a;
    public final org.telegram.ui.ActionBar.a3 f24110b;
    public final gy f24111c;

    public fy(gy gyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f24111c = gyVar;
        this.f24109a = zArr;
        this.f24110b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        jy jyVar = this.f24111c.f24466a;
        boolean[] zArr = this.f24109a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(jyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        kz kzVar = jyVar.F;
        String str = jyVar.f25455w;
        if (str == null) {
            str = kzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new wm(this, b2VarArr, ConnectionsManager.getInstance(kzVar.f25703c1).sendRequest(tL_messages_getEmojiURL, new ai.t5(this, b2VarArr, this.f24110b, 8)), 2), 1000L);
    }
}
