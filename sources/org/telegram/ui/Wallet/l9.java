package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l9 implements View.OnClickListener {
    public final int f36869a;
    public final r9 f36870b;

    public l9(r9 r9Var, int i10) {
        this.f36869a = i10;
        this.f36870b = r9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36869a) {
            case 0:
                r9 r9Var = this.f36870b;
                if (r9Var.f37202x != null) {
                    AndroidUtilities.hideKeyboard(r9Var.N);
                    r9Var.i0(r9Var.f37202x, null);
                    return;
                }
                return;
            case 1:
                r9 r9Var2 = this.f36870b;
                if (r9Var2.f37202x != null) {
                    AndroidUtilities.hideKeyboard(r9Var2.N);
                    r9Var2.i0(r9Var2.f37202x, null);
                    return;
                }
                return;
            case 2:
                r9 r9Var3 = this.f36870b;
                ClipboardManager clipboardManager = (ClipboardManager) r9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(r9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            r9Var3.N.setText(coerceToText.toString().trim());
                            fi.c2 c2Var = r9Var3.N;
                            c2Var.setSelection(c2Var.length());
                            return;
                        }
                        r9Var3.S = false;
                        r9Var3.l0(true);
                        return;
                    }
                    r9Var3.S = false;
                    r9Var3.l0(true);
                    return;
                }
                r9Var3.S = false;
                r9Var3.l0(true);
                return;
            default:
                this.f36870b.e0();
                return;
        }
    }
}
