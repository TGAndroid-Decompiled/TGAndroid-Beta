package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class x8 implements TextView.OnEditorActionListener {
    public final int f35399a;
    public final Object f35400b;

    public x8(Object obj, int i10) {
        this.f35399a = i10;
        this.f35400b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f35399a) {
            case 0:
                y8 y8Var = (y8) this.f35400b;
                if (i10 != 3) {
                    y8Var.getClass();
                    return false;
                }
                org.telegram.messenger.i0.v1(y8Var.f35423b);
                return true;
            case 1:
                r9 r9Var = (r9) this.f35400b;
                if (i10 == 6) {
                    vh.d dVar = r9Var.f35133d0;
                    if (dVar.f51070c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    r9Var.getClass();
                }
                return false;
            default:
                ra raVar = (ra) this.f35400b;
                EditText editText = raVar.f35159a;
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
                    if (!lowerCase.isEmpty() && raVar.b()) {
                        raVar.setError(false);
                        raVar.a();
                        Runnable runnable = raVar.f35164r;
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
                            raVar.setError(false);
                            raVar.a();
                            Runnable runnable2 = raVar.f35164r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            raVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
