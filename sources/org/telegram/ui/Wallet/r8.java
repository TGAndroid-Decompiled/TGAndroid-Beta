package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r8 implements TextView.OnEditorActionListener {
    public final int f34851a;
    public final Object f34852b;

    public r8(Object obj, int i10) {
        this.f34851a = i10;
        this.f34852b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f34851a) {
            case 0:
                t8 t8Var = (t8) this.f34852b;
                if (i10 != 3) {
                    t8Var.getClass();
                    return false;
                }
                AndroidUtilities.hideKeyboard(t8Var.f34946b);
                return true;
            case 1:
                o9 o9Var = (o9) this.f34852b;
                if (i10 == 6) {
                    ei.d dVar = o9Var.f34689a0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    o9Var.getClass();
                }
                return false;
            default:
                la laVar = (la) this.f34852b;
                EditText editText = laVar.f34517a;
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
                    if (!lowerCase.isEmpty() && laVar.b()) {
                        laVar.setError(false);
                        laVar.a();
                        Runnable runnable = laVar.f34522r;
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
                            laVar.setError(false);
                            laVar.a();
                            Runnable runnable2 = laVar.f34522r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            laVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
