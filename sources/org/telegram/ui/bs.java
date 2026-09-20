package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class bs extends gs {
    public final int M;
    public final int N;
    public final ds O;

    public bs(ds dsVar, Context context, int i10, int i11) {
        super(context);
        this.O = dsVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f33958f = new o1.k(this, gs.I);
        this.h = new o1.k(this, gs.J);
        this.f33959n = new o1.k(this, gs.K);
        this.f33960r = new o1.k(this, gs.L);
        this.f33961s = true;
        this.v = 1.0f;
        this.f33962w = 1.0f;
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
        ds dsVar = this.O;
        int length = dsVar.f33125f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && dsVar.f33125f[i10].length() == 1) {
                dsVar.f33125f[i10].m();
                dsVar.f33125f[i10].setText("");
                return true;
            } else if (keyCode == 67 && dsVar.f33125f[i10].length() == 0 && i10 > 0) {
                gs[] gsVarArr = dsVar.f33125f;
                gsVarArr[i10 - 1].setSelection(gsVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        dsVar.f33125f[i10 - 1].requestFocus();
                    } else {
                        dsVar.f33125f[i11].clearFocus();
                    }
                }
                dsVar.f33125f[i10 - 1].m();
                dsVar.f33125f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (dsVar.f33125f[i10].getText() != null && num.equals(dsVar.f33125f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            dsVar.a();
                        } else {
                            dsVar.f33125f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (dsVar.f33125f[i10].length() > 0) {
                        dsVar.f33125f[i10].m();
                    }
                    dsVar.f33125f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
