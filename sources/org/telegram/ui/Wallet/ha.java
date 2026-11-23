package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class ha implements View.OnClickListener {
    public final int f44451a;
    public final oa f44452b;

    public ha(oa oaVar, int i7) {
        this.f44451a = i7;
        this.f44452b = oaVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44451a) {
            case 0:
                oa oaVar = this.f44452b;
                if (oaVar.f44847y != null) {
                    org.telegram.messenger.g0.v1(oaVar.O);
                    oaVar.m0(oaVar.f44847y, null);
                    return;
                }
                return;
            case 1:
                oa oaVar2 = this.f44452b;
                if (oaVar2.f44847y != null) {
                    org.telegram.messenger.g0.v1(oaVar2.O);
                    oaVar2.m0(oaVar2.f44847y, null);
                    return;
                }
                return;
            case 2:
                oa oaVar3 = this.f44452b;
                ClipboardManager clipboardManager = (ClipboardManager) oaVar3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(oaVar3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            oaVar3.O.setText(coerceToText.toString().trim());
                            ah.i iVar = oaVar3.O;
                            iVar.setSelection(iVar.length());
                            return;
                        }
                        oaVar3.T = false;
                        oaVar3.p0(true);
                        return;
                    }
                    oaVar3.T = false;
                    oaVar3.p0(true);
                    return;
                }
                oaVar3.T = false;
                oaVar3.p0(true);
                return;
            default:
                this.f44452b.i0();
                return;
        }
    }
}
