package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o8 implements TextView.OnEditorActionListener {
    public final int f34686a;
    public final Object f34687b;

    public o8(Object obj, int i10) {
        this.f34686a = i10;
        this.f34687b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        switch (this.f34686a) {
            case 0:
                q8 q8Var = (q8) this.f34687b;
                if (i10 != 3) {
                    q8Var.getClass();
                    return false;
                }
                AndroidUtilities.hideKeyboard(q8Var.f34808b);
                return true;
            case 1:
                l9 l9Var = (l9) this.f34687b;
                if (i10 == 6) {
                    ei.d dVar = l9Var.f34524a0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    l9Var.getClass();
                }
                return false;
            default:
                ia iaVar = (ia) this.f34687b;
                EditText editText = iaVar.f34330a;
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
                        Runnable runnable = iaVar.f34335r;
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
                            Runnable runnable2 = iaVar.f34335r;
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
