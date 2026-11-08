package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public final class r8 implements TextView.OnEditorActionListener {
    public final int f43102a;
    public final Object f43103b;

    public r8(Object obj, int i7) {
        this.f43102a = i7;
        this.f43103b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        boolean z9;
        switch (this.f43102a) {
            case 0:
                s8 s8Var = (s8) this.f43103b;
                if (i7 != 3) {
                    s8Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(s8Var.f43142b);
                return true;
            case 1:
                m9 m9Var = (m9) this.f43103b;
                if (i7 == 6) {
                    fi.d dVar = m9Var.f42817d0;
                    if (dVar.f11752c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    m9Var.getClass();
                }
                return false;
            default:
                na naVar = (na) this.f43103b;
                EditText editText = naVar.f42911a;
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
                    if (!lowerCase.isEmpty() && naVar.b()) {
                        naVar.setError(false);
                        naVar.a();
                        Runnable runnable = naVar.f42917r;
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
                            naVar.setError(false);
                            naVar.a();
                            Runnable runnable2 = naVar.f42917r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            naVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
