package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o9 implements View.OnClickListener {
    public final int f34688a;
    public final t9 f34689b;

    public o9(t9 t9Var, int i10) {
        this.f34688a = i10;
        this.f34689b = t9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34688a) {
            case 0:
                t9 t9Var = this.f34689b;
                if (t9Var.f34913w != null) {
                    AndroidUtilities.hideKeyboard(t9Var.M);
                    t9Var.f0(t9Var.f34913w, null);
                    return;
                }
                return;
            case 1:
                t9 t9Var2 = this.f34689b;
                if (t9Var2.f34913w != null) {
                    AndroidUtilities.hideKeyboard(t9Var2.M);
                    t9Var2.f0(t9Var2.f34913w, null);
                    return;
                }
                return;
            case 2:
                t9 t9Var3 = this.f34689b;
                ClipboardManager clipboardManager = (ClipboardManager) t9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(t9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            t9Var3.M.setText(coerceToText.toString().trim());
                            ei.e2 e2Var = t9Var3.M;
                            e2Var.setSelection(e2Var.length());
                            return;
                        }
                        t9Var3.R = false;
                        t9Var3.i0(true);
                        return;
                    }
                    t9Var3.R = false;
                    t9Var3.i0(true);
                    return;
                }
                t9Var3.R = false;
                t9Var3.i0(true);
                return;
            default:
                this.f34689b.c0();
                return;
        }
    }
}
