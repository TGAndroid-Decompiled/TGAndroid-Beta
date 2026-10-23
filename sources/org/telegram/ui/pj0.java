package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class pj0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public pj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 1:
                this.f29094b.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
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
                rj0 rj0Var = (rj0) this.H;
                org.telegram.ui.Components.vd0 vd0Var = rj0Var.f41167r;
                if (!z10 && !rj0Var.P.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                vd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                rj0 rj0Var2 = (rj0) this.H;
                org.telegram.ui.Components.vd0 vd0Var2 = rj0Var2.f41167r;
                if (!z10 && !rj0Var2.N.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                vd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                hg0 hg0Var = (hg0) this.H;
                org.telegram.ui.Components.vd0 vd0Var3 = hg0Var.f37849f;
                if (!z10 && !hg0Var.f37847b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                vd0Var3.b(f11, f11, true);
                if (z10) {
                    hg0Var.f37846a0.f38196c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                rj0 rj0Var = (rj0) this.H;
                if (i10 == 67 && rj0Var.P.length() == 0) {
                    rj0Var.N.requestFocus();
                    pj0 pj0Var = rj0Var.N;
                    pj0Var.setSelection(pj0Var.length());
                    rj0Var.N.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
