package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m8 implements TextView.OnEditorActionListener {
    public final int f34882a;
    public final Object f34883b;

    public m8(Object obj, int i10) {
        this.f34882a = i10;
        this.f34883b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f34882a) {
            case 0:
                o8 o8Var = (o8) this.f34883b;
                if (i10 != 3) {
                    o8Var.getClass();
                    return false;
                }
                AndroidUtilities.hideKeyboard(o8Var.f34971b);
                return true;
            case 1:
                j9 j9Var = (j9) this.f34883b;
                if (i10 == 6) {
                    ei.d dVar = j9Var.f34661c0;
                    if (dVar.f8862c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    j9Var.getClass();
                }
                return false;
            default:
                ia iaVar = (ia) this.f34883b;
                EditText editText = iaVar.f34621a;
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
                    if (!lowerCase.isEmpty() && iaVar.b()) {
                        iaVar.setError(false);
                        iaVar.a();
                        Runnable runnable = iaVar.f34626r;
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
                            iaVar.setError(false);
                            iaVar.a();
                            Runnable runnable2 = iaVar.f34626r;
                            if (runnable2 != null) {
                                editText.post(runnable2);
                            }
                        } else {
                            iaVar.setError(true);
                        }
                    }
                }
                return true;
        }
    }
}
