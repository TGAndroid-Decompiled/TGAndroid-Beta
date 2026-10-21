package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l8 implements TextView.OnEditorActionListener {
    public final int f34470a;
    public final Object f34471b;

    public l8(Object obj, int i10) {
        this.f34470a = i10;
        this.f34471b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f34470a) {
            case 0:
                n8 n8Var = (n8) this.f34471b;
                if (i10 != 3) {
                    n8Var.getClass();
                    return false;
                }
                AndroidUtilities.hideKeyboard(n8Var.f34611b);
                return true;
            case 1:
                i9 i9Var = (i9) this.f34471b;
                if (i10 == 6) {
                    ei.d dVar = i9Var.f34345a0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    i9Var.getClass();
                }
                return false;
            default:
                ha haVar = (ha) this.f34471b;
                EditText editText = haVar.f34303a;
                if (keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 != 5 && !z10) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (!lowerCase.isEmpty() && haVar.b()) {
                        haVar.setError(false);
                        haVar.a();
                        Runnable runnable = haVar.f34308r;
                        if (runnable != null) {
                            editText.post(runnable);
                        }
                    } else {
                        String str = null;
                        if (!lowerCase.isEmpty()) {
                            String[] mnemonicWordlist = WalletEngine2.getMnemonicWordlist();
                            int length = mnemonicWordlist.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 < length) {
                                    String str2 = mnemonicWordlist[i11];
                                    if (str2.startsWith(lowerCase)) {
                                        str = str2;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                        if (str != null) {
                            editText.setText(str);
                            editText.setSelection(str.length());
                            haVar.setError(false);
                            haVar.a();
                            Runnable runnable2 = haVar.f34308r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            haVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
