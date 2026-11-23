package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ae0 extends AnimatedPhoneNumberEditText {
    public final int f45617b2;
    public final ce0 f45618c2;

    public ae0(ce0 ce0Var, Context context, int i7) {
        super(context);
        this.f45617b2 = i7;
        this.f45618c2 = ce0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        int i10 = this.f45617b2;
        float f10 = 1.0f;
        ce0 ce0Var = this.f45618c2;
        switch (i10) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                org.telegram.ui.Components.yb0 yb0Var = ce0Var.f46539f;
                if (!z10 && !ce0Var.f46532b.isFocused()) {
                    f10 = 0.0f;
                }
                yb0Var.b(f10, f10, true);
                if (z10) {
                    ce0Var.f46542h0.f46930c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z10, i7, rect);
                de0 de0Var = ce0Var.f46542h0;
                org.telegram.ui.Components.yb0 yb0Var2 = ce0Var.f46539f;
                if (!z10 && !ce0Var.f46530a.isFocused()) {
                    f10 = 0.0f;
                }
                yb0Var2.b(f10, f10, true);
                if (z10) {
                    de0Var.f46930c.setEditText(this);
                    de0Var.f46930c.setDispatchBackWhenEmpty(true);
                    if (ce0Var.F == 2) {
                        ce0.n(ce0Var, org.telegram.messenger.hd.N0(2131742593, null));
                        return;
                    }
                    return;
                } else if (ce0Var.F == 2) {
                    ce0.n(ce0Var, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.f45617b2) {
            case 1:
                ce0 ce0Var = this.f45618c2;
                ae0 ae0Var = ce0Var.f46530a;
                if (i7 == 67 && ce0Var.f46532b.length() == 0) {
                    ae0Var.requestFocus();
                    ae0Var.setSelection(ae0Var.length());
                    ae0Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f45617b2) {
            case 1:
                if (motionEvent.getAction() == 0 && !de0.b1(this.f45618c2.f46542h0, this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
