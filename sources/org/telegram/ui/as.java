package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class as extends es {
    public final int M;
    public final int N;
    public final cs O;

    public as(cs csVar, Context context, int i10, int i11) {
        super(context);
        this.O = csVar;
        this.M = i10;
        this.N = i11;
        this.f36075e = 1.0f;
        this.f36076f = new o1.k(this, es.I);
        this.h = new o1.k(this, es.J);
        this.f36077n = new o1.k(this, es.K);
        this.f36078r = new o1.k(this, es.L);
        this.f36079s = true;
        this.v = 1.0f;
        this.f36080w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        cs csVar = this.O;
        int length = csVar.f35543f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && csVar.f35543f[i10].length() == 1) {
                csVar.f35543f[i10].m();
                csVar.f35543f[i10].setText("");
                return true;
            } else if (keyCode == 67 && csVar.f35543f[i10].length() == 0 && i10 > 0) {
                es[] esVarArr = csVar.f35543f;
                esVarArr[i10 - 1].setSelection(esVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        csVar.f35543f[i10 - 1].requestFocus();
                    } else {
                        csVar.f35543f[i11].clearFocus();
                    }
                }
                csVar.f35543f[i10 - 1].m();
                csVar.f35543f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (csVar.f35543f[i10].getText() != null && num.equals(csVar.f35543f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            csVar.a();
                        } else {
                            csVar.f35543f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (csVar.f35543f[i10].length() > 0) {
                        csVar.f35543f[i10].m();
                    }
                    csVar.f35543f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
