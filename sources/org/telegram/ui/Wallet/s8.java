package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class s8 implements TextView.OnEditorActionListener {
    public final int f43115a;
    public final Object f43116b;

    public s8(Object obj, int i7) {
        this.f43115a = i7;
        this.f43116b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        boolean z9;
        switch (this.f43115a) {
            case 0:
                t8 t8Var = (t8) this.f43116b;
                if (i7 != 3) {
                    t8Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(t8Var.f43148b);
                return true;
            case 1:
                n9 n9Var = (n9) this.f43116b;
                if (i7 == 6) {
                    fi.d dVar = n9Var.f42823d0;
                    if (dVar.f11752c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    n9Var.getClass();
                }
                return false;
            default:
                oa oaVar = (oa) this.f43116b;
                EditText editText = oaVar.f42917a;
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
                    if (!lowerCase.isEmpty() && oaVar.b()) {
                        oaVar.setError(false);
                        oaVar.a();
                        Runnable runnable = oaVar.f42923r;
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
                            oaVar.setError(false);
                            oaVar.a();
                            Runnable runnable2 = oaVar.f42923r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            oaVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
