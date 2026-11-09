package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class q8 implements TextView.OnEditorActionListener {
    public final int f43020a;
    public final Object f43021b;

    public q8(Object obj, int i7) {
        this.f43020a = i7;
        this.f43021b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        boolean z9;
        switch (this.f43020a) {
            case 0:
                r8 r8Var = (r8) this.f43021b;
                if (i7 != 3) {
                    r8Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(r8Var.f43060b);
                return true;
            case 1:
                l9 l9Var = (l9) this.f43021b;
                if (i7 == 6) {
                    fi.d dVar = l9Var.f42735d0;
                    if (dVar.f11752c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    l9Var.getClass();
                }
                return false;
            default:
                ma maVar = (ma) this.f43021b;
                EditText editText = maVar.f42829a;
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
                    if (!lowerCase.isEmpty() && maVar.b()) {
                        maVar.setError(false);
                        maVar.a();
                        Runnable runnable = maVar.f42835r;
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
                            maVar.setError(false);
                            maVar.a();
                            Runnable runnable2 = maVar.f42835r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            maVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
