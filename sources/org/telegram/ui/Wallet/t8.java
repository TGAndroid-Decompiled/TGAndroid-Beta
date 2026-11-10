package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class t8 implements TextView.OnEditorActionListener {
    public final int f43191a;
    public final Object f43192b;

    public t8(Object obj, int i7) {
        this.f43191a = i7;
        this.f43192b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        boolean z9;
        switch (this.f43191a) {
            case 0:
                u8 u8Var = (u8) this.f43192b;
                if (i7 != 3) {
                    u8Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(u8Var.f43234b);
                return true;
            case 1:
                o9 o9Var = (o9) this.f43192b;
                if (i7 == 6) {
                    fi.d dVar = o9Var.f42919d0;
                    if (dVar.f11756c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    o9Var.getClass();
                }
                return false;
            default:
                pa paVar = (pa) this.f43192b;
                EditText editText = paVar.f43024a;
                if (keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i7 != 5 && !z9) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (!lowerCase.isEmpty() && paVar.b()) {
                        paVar.setError(false);
                        paVar.a();
                        Runnable runnable = paVar.f43030r;
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
                            Runnable runnable2 = paVar.f43030r;
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
