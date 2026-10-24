package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class oj0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public oj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 1:
                this.f28509b.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
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
                qj0 qj0Var = (qj0) this.H;
                org.telegram.ui.Components.td0 td0Var = qj0Var.f40855r;
                if (!z10 && !qj0Var.P.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                td0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                qj0 qj0Var2 = (qj0) this.H;
                org.telegram.ui.Components.td0 td0Var2 = qj0Var2.f40855r;
                if (!z10 && !qj0Var2.N.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                td0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                gg0 gg0Var = (gg0) this.H;
                org.telegram.ui.Components.td0 td0Var3 = gg0Var.f37565f;
                if (!z10 && !gg0Var.f37563b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                td0Var3.b(f11, f11, true);
                if (z10) {
                    gg0Var.f37562a0.f37837c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                qj0 qj0Var = (qj0) this.H;
                if (i10 == 67 && qj0Var.P.length() == 0) {
                    qj0Var.N.requestFocus();
                    oj0 oj0Var = qj0Var.N;
                    oj0Var.setSelection(oj0Var.length());
                    qj0Var.N.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
