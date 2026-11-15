package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class t8 implements TextView.OnEditorActionListener {
    public final int f44526a;
    public final Object f44527b;

    public t8(Object obj, int i7) {
        this.f44526a = i7;
        this.f44527b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f44526a) {
            case 0:
                u8 u8Var = (u8) this.f44527b;
                if (i7 != 3) {
                    u8Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(u8Var.f44566b);
                return true;
            case 1:
                p9 p9Var = (p9) this.f44527b;
                if (i7 == 6) {
                    hi.d dVar = p9Var.f44338e0;
                    if (dVar.f14056d0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    p9Var.getClass();
                }
                return false;
            default:
                pa paVar = (pa) this.f44527b;
                EditText editText = paVar.f44364a;
                if (keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i7 != 5 && !z10) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (!lowerCase.isEmpty() && paVar.b()) {
                        paVar.setError(false);
                        paVar.a();
                        Runnable runnable = paVar.f44370r;
                        if (runnable != null) {
                            editText.post(runnable);
                        }
                    } else {
                        String str = null;
                        if (!lowerCase.isEmpty()) {
                            String[] mnemonicWordlist = WalletEngine2.getMnemonicWordlist();
                            int length = mnemonicWordlist.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 < length) {
                                    String str2 = mnemonicWordlist[i10];
                                    if (str2.startsWith(lowerCase)) {
                                        str = str2;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                        if (str != null) {
                            editText.setText(str);
                            editText.setSelection(str.length());
                            paVar.setError(false);
                            paVar.a();
                            Runnable runnable2 = paVar.f44370r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            paVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
