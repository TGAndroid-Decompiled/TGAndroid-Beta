package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.y90;
public final class p6 extends FrameLayout {
    public final v90 f22890a;
    public final y90 f22891b;
    public final CheckBoxSquare f22892c;

    public p6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f22892c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, w7.z5.d(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        v90 v90Var = new v90(this);
        this.f22890a = v90Var;
        y90 y90Var = new y90(context, v90Var, g6Var);
        this.f22891b = y90Var;
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.J6, g6Var);
        y90Var.setTextSize(1, 15.0f);
        y90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        y90Var.setGravity(i11 | 16);
        y90Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        int i12 = (z10 ? 5 : 3) | 48;
        if (z10) {
            f7 = 16.0f;
        } else {
            f7 = 58.0f;
        }
        if (z10) {
            f10 = 58.0f;
        } else {
            f10 = 16.0f;
        }
        addView(y90Var, w7.z5.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f22892c;
    }

    public TextView getTextView() {
        return this.f22891b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        v90 v90Var = this.f22890a;
        if (v90Var != null) {
            canvas.save();
            y90 y90Var = this.f22891b;
            canvas.translate(y90Var.getLeft(), y90Var.getTop());
            if (v90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f22892c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f22891b.setText(charSequence);
    }
}
