package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class h9 implements TextView.OnEditorActionListener {
    public final int f44360a;
    public final Object f44361b;

    public h9(Object obj, int i7) {
        this.f44360a = i7;
        this.f44361b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f44360a) {
            case 0:
                j9 j9Var = (j9) this.f44361b;
                if (i7 != 3) {
                    j9Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(j9Var.f44460b);
                return true;
            case 1:
                da daVar = (da) this.f44361b;
                if (i7 == 6) {
                    hi.e eVar = daVar.f44102e0;
                    if (eVar.f14567e0) {
                        eVar.performClick();
                        return true;
                    }
                } else {
                    daVar.getClass();
                }
                return false;
            default:
                db dbVar = (db) this.f44361b;
                EditText editText = dbVar.f44128a;
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
                    if (!lowerCase.isEmpty() && dbVar.b()) {
                        dbVar.setError(false);
                        dbVar.a();
                        Runnable runnable = dbVar.f44134r;
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
                            dbVar.setError(false);
                            dbVar.a();
                            Runnable runnable2 = dbVar.f44134r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            dbVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
