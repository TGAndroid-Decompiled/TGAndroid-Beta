package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class i9 implements TextView.OnEditorActionListener {
    public final int f44487a;
    public final Object f44488b;

    public i9(Object obj, int i7) {
        this.f44487a = i7;
        this.f44488b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f44487a) {
            case 0:
                k9 k9Var = (k9) this.f44488b;
                if (i7 != 3) {
                    k9Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(k9Var.f44587b);
                return true;
            case 1:
                ea eaVar = (ea) this.f44488b;
                if (i7 == 6) {
                    hi.e eVar = eaVar.f44230e0;
                    if (eVar.f14340e0) {
                        eVar.performClick();
                        return true;
                    }
                } else {
                    eaVar.getClass();
                }
                return false;
            default:
                eb ebVar = (eb) this.f44488b;
                EditText editText = ebVar.f44256a;
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
                    if (!lowerCase.isEmpty() && ebVar.b()) {
                        ebVar.setError(false);
                        ebVar.a();
                        Runnable runnable = ebVar.f44262r;
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
                            ebVar.setError(false);
                            ebVar.a();
                            Runnable runnable2 = ebVar.f44262r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            ebVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
