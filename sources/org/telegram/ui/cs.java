package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class cs extends gs {
    public final int M;
    public final int N;
    public final es O;

    public cs(es esVar, Context context, int i10, int i11) {
        super(context);
        this.O = esVar;
        this.M = i10;
        this.N = i11;
        this.f36764e = 1.0f;
        this.f36765f = new o1.k(this, gs.I);
        this.h = new o1.k(this, gs.J);
        this.f36766n = new o1.k(this, gs.K);
        this.f36767r = new o1.k(this, gs.L);
        this.f36768s = true;
        this.v = 1.0f;
        this.f36769w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new l0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        es esVar = this.O;
        int length = esVar.f36163f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && esVar.f36163f[i10].length() == 1) {
                esVar.f36163f[i10].m();
                esVar.f36163f[i10].setText("");
                return true;
            } else if (keyCode == 67 && esVar.f36163f[i10].length() == 0 && i10 > 0) {
                gs[] gsVarArr = esVar.f36163f;
                gsVarArr[i10 - 1].setSelection(gsVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        esVar.f36163f[i10 - 1].requestFocus();
                    } else {
                        esVar.f36163f[i11].clearFocus();
                    }
                }
                esVar.f36163f[i10 - 1].m();
                esVar.f36163f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (esVar.f36163f[i10].getText() != null && num.equals(esVar.f36163f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            esVar.a();
                        } else {
                            esVar.f36163f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (esVar.f36163f[i10].length() > 0) {
                        esVar.f36163f[i10].m();
                    }
                    esVar.f36163f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
