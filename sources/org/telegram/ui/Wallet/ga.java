package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class ga implements View.OnClickListener {
    public final int f44323a;
    public final na f44324b;

    public ga(na naVar, int i7) {
        this.f44323a = i7;
        this.f44324b = naVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44323a) {
            case 0:
                na naVar = this.f44324b;
                if (naVar.f44719y != null) {
                    org.telegram.messenger.g0.v1(naVar.O);
                    naVar.m0(naVar.f44719y, null);
                    return;
                }
                return;
            case 1:
                na naVar2 = this.f44324b;
                if (naVar2.f44719y != null) {
                    org.telegram.messenger.g0.v1(naVar2.O);
                    naVar2.m0(naVar2.f44719y, null);
                    return;
                }
                return;
            case 2:
                na naVar3 = this.f44324b;
                ClipboardManager clipboardManager = (ClipboardManager) naVar3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(naVar3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            naVar3.O.setText(coerceToText.toString().trim());
                            ah.i iVar = naVar3.O;
                            iVar.setSelection(iVar.length());
                            return;
                        }
                        naVar3.T = false;
                        naVar3.p0(true);
                        return;
                    }
                    naVar3.T = false;
                    naVar3.p0(true);
                    return;
                }
                naVar3.T = false;
                naVar3.p0(true);
                return;
            default:
                this.f44324b.i0();
                return;
        }
    }
}
