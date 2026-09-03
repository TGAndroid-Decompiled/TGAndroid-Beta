package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class fy implements View.OnClickListener {
    public final boolean[] f24985a;
    public final org.telegram.ui.ActionBar.b3 f24986b;
    public final gy f24987c;

    public fy(gy gyVar, boolean[] zArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f24987c = gyVar;
        this.f24985a = zArr;
        this.f24986b = b3Var;
    }

    @Override
    public final void onClick(View view) {
        jy jyVar = this.f24987c.f25252a;
        boolean[] zArr = this.f24985a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(jyVar.C.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        kz kzVar = jyVar.C;
        String str = jyVar.f26074w;
        if (str == null) {
            str = kzVar.T0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new ey(this, d2VarArr, ConnectionsManager.getInstance(kzVar.Z0).sendRequest(tL_messages_getEmojiURL, new gg.y(this, d2VarArr, this.f24986b, 13)), 0), 1000L);
    }
}
