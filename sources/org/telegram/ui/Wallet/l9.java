package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l9 implements View.OnClickListener {
    public final int f34446a;
    public final r9 f34447b;

    public l9(r9 r9Var, int i10) {
        this.f34446a = i10;
        this.f34447b = r9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34446a) {
            case 0:
                r9 r9Var = this.f34447b;
                if (r9Var.f34794w != null) {
                    AndroidUtilities.hideKeyboard(r9Var.M);
                    r9Var.f0(r9Var.f34794w, null);
                    return;
                }
                return;
            case 1:
                r9 r9Var2 = this.f34447b;
                if (r9Var2.f34794w != null) {
                    AndroidUtilities.hideKeyboard(r9Var2.M);
                    r9Var2.f0(r9Var2.f34794w, null);
                    return;
                }
                return;
            case 2:
                r9 r9Var3 = this.f34447b;
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
                        r9Var3.i0(true);
                        return;
                    }
                    r9Var3.R = false;
                    r9Var3.i0(true);
                    return;
                }
                r9Var3.R = false;
                r9Var3.i0(true);
                return;
            default:
                this.f34447b.c0();
                return;
        }
    }
}
