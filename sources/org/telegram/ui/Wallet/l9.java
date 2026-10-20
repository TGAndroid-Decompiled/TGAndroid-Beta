package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l9 implements View.OnClickListener {
    public final int f34471a;
    public final r9 f34472b;

    public l9(r9 r9Var, int i10) {
        this.f34471a = i10;
        this.f34472b = r9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34471a) {
            case 0:
                r9 r9Var = this.f34472b;
                if (r9Var.f34818w != null) {
                    AndroidUtilities.hideKeyboard(r9Var.M);
                    r9Var.h0(r9Var.f34818w, null);
                    return;
                }
                return;
            case 1:
                r9 r9Var2 = this.f34472b;
                if (r9Var2.f34818w != null) {
                    AndroidUtilities.hideKeyboard(r9Var2.M);
                    r9Var2.h0(r9Var2.f34818w, null);
                    return;
                }
                return;
            case 2:
                r9 r9Var3 = this.f34472b;
                ClipboardManager clipboardManager = (ClipboardManager) r9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(r9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            r9Var3.M.setText(coerceToText.toString().trim());
                            ei.e2 e2Var = r9Var3.M;
                            e2Var.setSelection(e2Var.length());
                            return;
                        }
                        r9Var3.R = false;
                        r9Var3.k0(true);
                        return;
                    }
                    r9Var3.R = false;
                    r9Var3.k0(true);
                    return;
                }
                r9Var3.R = false;
                r9Var3.k0(true);
                return;
            default:
                this.f34472b.d0();
                return;
        }
    }
}
