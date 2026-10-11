package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class s7 implements TextView.OnEditorActionListener {
    public final int f35585a;
    public final Object f35586b;

    public s7(Object obj, int i10) {
        this.f35585a = i10;
        this.f35586b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f35585a) {
            case 0:
                l8 l8Var = (l8) this.f35586b;
                if (i10 == 6) {
                    ci.d dVar = l8Var.f35264a0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    l8Var.getClass();
                }
                return false;
            default:
                j9 j9Var = (j9) this.f35586b;
                EditText editText = j9Var.f35160a;
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
                    if (!lowerCase.isEmpty() && j9Var.b()) {
                        j9Var.setError(false);
                        j9Var.a();
                        Runnable runnable = j9Var.f35166r;
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
                            j9Var.setError(false);
                            j9Var.a();
                            Runnable runnable2 = j9Var.f35166r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            j9Var.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
