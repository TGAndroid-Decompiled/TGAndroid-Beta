package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class u9 implements View.OnClickListener {
    public final int f35290a;
    public final ba f35291b;

    public u9(ba baVar, int i10) {
        this.f35290a = i10;
        this.f35291b = baVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35290a) {
            case 0:
                ba baVar = this.f35291b;
                if (baVar.f34289y != null) {
                    org.telegram.messenger.i0.v1(baVar.N);
                    baVar.l0(baVar.f34289y, null);
                    return;
                }
                return;
            case 1:
                ba baVar2 = this.f35291b;
                if (baVar2.f34289y != null) {
                    org.telegram.messenger.i0.v1(baVar2.N);
                    baVar2.l0(baVar2.f34289y, null);
                    return;
                }
                return;
            case 2:
                ba baVar3 = this.f35291b;
                ClipboardManager clipboardManager = (ClipboardManager) baVar3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(baVar3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            baVar3.N.setText(coerceToText.toString().trim());
                            org.telegram.ui.ActionBar.n0 n0Var = baVar3.N;
                            n0Var.setSelection(n0Var.length());
                            return;
                        }
                        baVar3.S = false;
                        baVar3.o0(true);
                        return;
                    }
                    baVar3.S = false;
                    baVar3.o0(true);
                    return;
                }
                baVar3.S = false;
                baVar3.o0(true);
                return;
            default:
                this.f35291b.h0();
                return;
        }
    }
}
