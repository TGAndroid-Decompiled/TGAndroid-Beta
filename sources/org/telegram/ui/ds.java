package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class ds extends hs {
    public final int M;
    public final int N;
    public final fs O;

    public ds(fs fsVar, Context context, int i10, int i11) {
        super(context);
        this.O = fsVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f33447f = new o1.k(this, hs.I);
        this.h = new o1.k(this, hs.J);
        this.f33448n = new o1.k(this, hs.K);
        this.f33449r = new o1.k(this, hs.L);
        this.f33450s = true;
        this.v = 1.0f;
        this.f33451w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        fs fsVar = this.O;
        int length = fsVar.f32906f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && fsVar.f32906f[i10].length() == 1) {
                fsVar.f32906f[i10].m();
                fsVar.f32906f[i10].setText("");
                return true;
            } else if (keyCode == 67 && fsVar.f32906f[i10].length() == 0 && i10 > 0) {
                hs[] hsVarArr = fsVar.f32906f;
                hsVarArr[i10 - 1].setSelection(hsVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        fsVar.f32906f[i10 - 1].requestFocus();
                    } else {
                        fsVar.f32906f[i11].clearFocus();
                    }
                }
                fsVar.f32906f[i10 - 1].m();
                fsVar.f32906f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (fsVar.f32906f[i10].getText() != null && num.equals(fsVar.f32906f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            fsVar.a();
                        } else {
                            fsVar.f32906f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (fsVar.f32906f[i10].length() > 0) {
                        fsVar.f32906f[i10].m();
                    }
                    fsVar.f32906f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
