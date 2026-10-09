package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class p7 implements TextView.OnEditorActionListener {
    public final int f35371a;
    public final Object f35372b;

    public p7(Object obj, int i10) {
        this.f35371a = i10;
        this.f35372b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f35371a) {
            case 0:
                i8 i8Var = (i8) this.f35372b;
                if (i10 == 6) {
                    ci.d dVar = i8Var.f35018a0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    i8Var.getClass();
                }
                return false;
            default:
                g9 g9Var = (g9) this.f35372b;
                EditText editText = g9Var.f34945a;
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
                    if (!lowerCase.isEmpty() && g9Var.b()) {
                        g9Var.setError(false);
                        g9Var.a();
                        Runnable runnable = g9Var.f34951r;
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
                            g9Var.setError(false);
                            g9Var.a();
                            Runnable runnable2 = g9Var.f34951r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            g9Var.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
