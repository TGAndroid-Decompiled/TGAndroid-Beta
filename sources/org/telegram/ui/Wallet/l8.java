package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l8 implements TextView.OnEditorActionListener {
    public final int f34444a;
    public final Object f34445b;

    public l8(Object obj, int i10) {
        this.f34444a = i10;
        this.f34445b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f34444a) {
            case 0:
                n8 n8Var = (n8) this.f34445b;
                if (i10 != 3) {
                    n8Var.getClass();
                    return false;
                }
                AndroidUtilities.hideKeyboard(n8Var.f34616b);
                return true;
            case 1:
                i9 i9Var = (i9) this.f34445b;
                if (i10 == 6) {
                    ei.d dVar = i9Var.f34317a0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    i9Var.getClass();
                }
                return false;
            default:
                ga gaVar = (ga) this.f34445b;
                EditText editText = gaVar.f34241a;
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
                    if (!lowerCase.isEmpty() && gaVar.b()) {
                        gaVar.setError(false);
                        gaVar.a();
                        Runnable runnable = gaVar.f34246r;
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
                            gaVar.setError(false);
                            gaVar.a();
                            Runnable runnable2 = gaVar.f34246r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            gaVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
