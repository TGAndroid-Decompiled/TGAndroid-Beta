package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class sx implements View.OnClickListener {

    public final boolean[] f32595a;

    public final org.telegram.ui.ActionBar.z2 f32596b;

    public final tx f32597c;

    public sx(tx txVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f32597c = txVar;
        this.f32595a = zArr;
        this.f32596b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        wx wxVar = this.f32597c.f32904a;
        boolean[] zArr = this.f32595a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(wxVar.B.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        yy yyVar = wxVar.B;
        String str = wxVar.f34360w;
        if (str == null) {
            str = yyVar.S0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new km(this, b2VarArr, ConnectionsManager.getInstance(yyVar.Y0).sendRequest(tL_messages_getEmojiURL, new cg.y(this, b2VarArr, this.f32596b, 16)), 2), 1000L);
    }
}
