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
                this.f31796b.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.H6, false));
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
                org.telegram.ui.Components.sd0 sd0Var = qj0Var.f42733r;
                if (!z10 && !qj0Var.P.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                sd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                qj0 qj0Var2 = (qj0) this.H;
                org.telegram.ui.Components.sd0 sd0Var2 = qj0Var2.f42733r;
                if (!z10 && !qj0Var2.N.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                sd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                hg0 hg0Var = (hg0) this.H;
                org.telegram.ui.Components.sd0 sd0Var3 = hg0Var.f39885f;
                if (!z10 && !hg0Var.f39883b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                sd0Var3.b(f11, f11, true);
                if (z10) {
                    hg0Var.f39882a0.f40144c.setEditText(this);
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
