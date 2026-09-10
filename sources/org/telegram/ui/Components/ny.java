package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ny implements View.OnClickListener {
    public final boolean[] f25616a;
    public final org.telegram.ui.ActionBar.c3 f25617b;
    public final oy f25618c;

    public ny(oy oyVar, boolean[] zArr, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f25618c = oyVar;
        this.f25616a = zArr;
        this.f25617b = c3Var;
    }

    @Override
    public final void onClick(View view) {
        ry ryVar = this.f25618c.f25939a;
        boolean[] zArr = this.f25616a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(ryVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        rz rzVar = ryVar.F;
        String str = ryVar.f26783w;
        if (str == null) {
            str = rzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new my(this, d2VarArr, ConnectionsManager.getInstance(rzVar.f26805c1).sendRequest(tL_messages_getEmojiURL, new bi.wa(this, d2VarArr, this.f25617b, 7)), 0), 1000L);
    }
}
