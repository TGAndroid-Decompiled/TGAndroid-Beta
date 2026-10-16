package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ry implements View.OnClickListener {
    public final boolean[] f28661a;
    public final org.telegram.ui.ActionBar.z2 f28662b;
    public final sy f28663c;

    public ry(sy syVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f28663c = syVar;
        this.f28661a = zArr;
        this.f28662b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        vy vyVar = this.f28663c.f28929a;
        boolean[] zArr = this.f28661a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(vyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        wz wzVar = vyVar.F;
        String str = vyVar.f30345w;
        if (str == null) {
            str = wzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.gm(this, a2VarArr, ConnectionsManager.getInstance(wzVar.f30707c1).sendRequest(tL_messages_getEmojiURL, new bi.e5(this, a2VarArr, this.f28662b, 8)), 4), 1000L);
    }
}
