package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class mj0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public mj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 1:
                this.f31831b.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.H6, false));
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        float f10;
        float f11;
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                oj0 oj0Var = (oj0) this.H;
                org.telegram.ui.Components.rd0 rd0Var = oj0Var.f42229r;
                if (!z10 && !oj0Var.P.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                rd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                oj0 oj0Var2 = (oj0) this.H;
                org.telegram.ui.Components.rd0 rd0Var2 = oj0Var2.f42229r;
                if (!z10 && !oj0Var2.N.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                rd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                fg0 fg0Var = (fg0) this.H;
                org.telegram.ui.Components.rd0 rd0Var3 = fg0Var.f39362f;
                if (!z10 && !fg0Var.f39360b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                rd0Var3.b(f11, f11, true);
                if (z10) {
                    fg0Var.f39359a0.f39652c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                oj0 oj0Var = (oj0) this.H;
                if (i10 == 67 && oj0Var.P.length() == 0) {
                    oj0Var.N.requestFocus();
                    mj0 mj0Var = oj0Var.N;
                    mj0Var.setSelection(mj0Var.length());
                    oj0Var.N.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
