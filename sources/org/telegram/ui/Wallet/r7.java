package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class r7 implements TextView.OnEditorActionListener {
    public final int f35521a;
    public final Object f35522b;

    public r7(Object obj, int i10) {
        this.f35521a = i10;
        this.f35522b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f35521a) {
            case 0:
                k8 k8Var = (k8) this.f35522b;
                if (i10 == 6) {
                    ci.d dVar = k8Var.f35200a0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    k8Var.getClass();
                }
                return false;
            default:
                i9 i9Var = (i9) this.f35522b;
                EditText editText = i9Var.f35096a;
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
                    if (!lowerCase.isEmpty() && i9Var.b()) {
                        i9Var.setError(false);
                        i9Var.a();
                        Runnable runnable = i9Var.f35102r;
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
                            i9Var.setError(false);
                            i9Var.a();
                            Runnable runnable2 = i9Var.f35102r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            i9Var.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
