package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class qj0 extends AnimatedPhoneNumberEditText {
    public final int D;
    public final Object E;

    public qj0(Object obj, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = obj;
    }

    @Override
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        float f10;
        float f11;
        float f12;
        switch (this.D) {
            case 0:
                super.onFocusChanged(z4, i10, rect);
                sj0 sj0Var = (sj0) this.E;
                org.telegram.ui.Components.ad0 ad0Var = sj0Var.f38391s;
                if (!z4 && !sj0Var.N.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ad0Var.b(f10, f10, true);
                return;
            case 1:
                super.onFocusChanged(z4, i10, rect);
                sj0 sj0Var2 = (sj0) this.E;
                org.telegram.ui.Components.ad0 ad0Var2 = sj0Var2.f38391s;
                if (!z4 && !sj0Var2.L.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ad0Var2.b(f11, f11, true);
                return;
            default:
                super.onFocusChanged(z4, i10, rect);
                mg0 mg0Var = (mg0) this.E;
                org.telegram.ui.Components.ad0 ad0Var3 = mg0Var.f36296f;
                if (!z4 && !mg0Var.f36294b.isFocused()) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                ad0Var3.b(f12, f12, true);
                if (z4) {
                    mg0Var.S.f36626c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.D) {
            case 1:
                sj0 sj0Var = (sj0) this.E;
                if (i10 == 67 && sj0Var.N.length() == 0) {
                    sj0Var.L.requestFocus();
                    qj0 qj0Var = sj0Var.L;
                    qj0Var.setSelection(qj0Var.length());
                    sj0Var.L.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
