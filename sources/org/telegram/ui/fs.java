package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class fs extends ks {
    public final int M;
    public final int N;
    public final hs O;

    public fs(hs hsVar, Context context, int i10, int i11) {
        super(context);
        this.O = hsVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f37502f = new o1.k(this, ks.I);
        this.h = new o1.k(this, ks.J);
        this.f37503n = new o1.k(this, ks.K);
        this.f37504r = new o1.k(this, ks.L);
        this.f37505s = true;
        this.v = 1.0f;
        this.f37506w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new n0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        hs hsVar = this.O;
        int length = hsVar.f36645f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && hsVar.f36645f[i10].length() == 1) {
                hsVar.f36645f[i10].m();
                hsVar.f36645f[i10].setText("");
                return true;
            } else if (keyCode == 67 && hsVar.f36645f[i10].length() == 0 && i10 > 0) {
                ks[] ksVarArr = hsVar.f36645f;
                ksVarArr[i10 - 1].setSelection(ksVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        hsVar.f36645f[i10 - 1].requestFocus();
                    } else {
                        hsVar.f36645f[i11].clearFocus();
                    }
                }
                hsVar.f36645f[i10 - 1].m();
                hsVar.f36645f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (hsVar.f36645f[i10].getText() != null && num.equals(hsVar.f36645f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            hsVar.a();
                        } else {
                            hsVar.f36645f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (hsVar.f36645f[i10].length() > 0) {
                        hsVar.f36645f[i10].m();
                    }
                    hsVar.f36645f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
