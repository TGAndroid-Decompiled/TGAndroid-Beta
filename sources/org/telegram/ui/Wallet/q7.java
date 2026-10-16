package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class q7 implements TextView.OnEditorActionListener {
    public final int f33384a;
    public final Object f33385b;

    public q7(Object obj, int i10) {
        this.f33384a = i10;
        this.f33385b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f33384a) {
            case 0:
                j8 j8Var = (j8) this.f33385b;
                if (i10 == 6) {
                    di.d dVar = j8Var.f33066a0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    j8Var.getClass();
                }
                return false;
            default:
                h9 h9Var = (h9) this.f33385b;
                EditText editText = h9Var.f32990a;
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
                    if (!lowerCase.isEmpty() && h9Var.b()) {
                        h9Var.setError(false);
                        h9Var.a();
                        Runnable runnable = h9Var.f32995r;
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
                            h9Var.setError(false);
                            h9Var.a();
                            Runnable runnable2 = h9Var.f32995r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            h9Var.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
