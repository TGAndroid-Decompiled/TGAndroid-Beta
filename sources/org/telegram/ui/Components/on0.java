package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class on0 extends pj0 {
    public final int f36671e3;
    public final mo0 f36672f3;

    public on0(mo0 mo0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.f36671e3 = i7;
        this.f36672f3 = mo0Var;
    }

    @Override
    public final boolean E0(float f10) {
        float f11;
        float f12;
        switch (this.f36671e3) {
            case 0:
                mo0 mo0Var = this.f36672f3;
                if (mo0Var.Z1 && mo0Var.f36041g2[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f11) + mo0Var.f36074y2.f15121b) {
                    return true;
                }
                return false;
            default:
                mo0 mo0Var2 = this.f36672f3;
                if (mo0Var2.Z1 && mo0Var2.f36041g2[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f12) + mo0Var2.f36074y2.f15121b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.f36671e3) {
            case 0:
                mo0 mo0Var = this.f36672f3;
                pj0 pj0Var = mo0Var.f36069w1;
                if (pj0Var.getVisibility() != 8) {
                    canvas.save();
                    int i7 = mo0Var.f36042h2;
                    if (mo0Var.Z1 && mo0Var.f36041g2[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f10) + i7, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (pj0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                mo0 mo0Var2 = this.f36672f3;
                pj0 pj0Var2 = mo0Var2.f36069w1;
                if (pj0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i10 = mo0Var2.f36042h2;
                    if (mo0Var2.Z1 && mo0Var2.f36041g2[1] != null) {
                        f11 = 111.0f;
                    } else {
                        f11 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f11) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (pj0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
