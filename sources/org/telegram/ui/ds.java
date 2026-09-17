package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class ds extends is {
    public final int M;
    public final int N;
    public final fs O;

    public ds(fs fsVar, Context context, int i10, int i11) {
        super(context);
        this.O = fsVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f34668f = new o1.k(this, is.I);
        this.h = new o1.k(this, is.J);
        this.f34669n = new o1.k(this, is.K);
        this.f34670r = new o1.k(this, is.L);
        this.f34671s = true;
        this.v = 1.0f;
        this.f34672w = 1.0f;
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
        fs fsVar = this.O;
        int length = fsVar.f33749f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && fsVar.f33749f[i10].length() == 1) {
                fsVar.f33749f[i10].m();
                fsVar.f33749f[i10].setText("");
                return true;
            } else if (keyCode == 67 && fsVar.f33749f[i10].length() == 0 && i10 > 0) {
                is[] isVarArr = fsVar.f33749f;
                isVarArr[i10 - 1].setSelection(isVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        fsVar.f33749f[i10 - 1].requestFocus();
                    } else {
                        fsVar.f33749f[i11].clearFocus();
                    }
                }
                fsVar.f33749f[i10 - 1].m();
                fsVar.f33749f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (fsVar.f33749f[i10].getText() != null && num.equals(fsVar.f33749f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            fsVar.a();
                        } else {
                            fsVar.f33749f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (fsVar.f33749f[i10].length() > 0) {
                        fsVar.f33749f[i10].m();
                    }
                    fsVar.f33749f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
