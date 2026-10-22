package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class or extends tr {
    public final int M;
    public final int N;
    public final qr O;

    public or(qr qrVar, Context context, int i10, int i11) {
        super(context);
        this.O = qrVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f41735f = new o1.k(this, tr.I);
        this.h = new o1.k(this, tr.J);
        this.f41736n = new o1.k(this, tr.K);
        this.f41737r = new o1.k(this, tr.L);
        this.f41738s = true;
        this.v = 1.0f;
        this.f41739w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new o0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        qr qrVar = this.O;
        int length = qrVar.f40962f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && qrVar.f40962f[i10].length() == 1) {
                qrVar.f40962f[i10].m();
                qrVar.f40962f[i10].setText("");
                return true;
            } else if (keyCode == 67 && qrVar.f40962f[i10].length() == 0 && i10 > 0) {
                tr[] trVarArr = qrVar.f40962f;
                trVarArr[i10 - 1].setSelection(trVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        qrVar.f40962f[i10 - 1].requestFocus();
                    } else {
                        qrVar.f40962f[i11].clearFocus();
                    }
                }
                qrVar.f40962f[i10 - 1].m();
                qrVar.f40962f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (qrVar.f40962f[i10].getText() != null && num.equals(qrVar.f40962f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            qrVar.a();
                        } else {
                            qrVar.f40962f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (qrVar.f40962f[i10].length() > 0) {
                        qrVar.f40962f[i10].m();
                    }
                    qrVar.f40962f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
