package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.w90;
public final class p6 extends FrameLayout {
    public final t90 f22891a;
    public final w90 f22892b;
    public final CheckBoxSquare f22893c;

    public p6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f22893c = checkBoxSquare;
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
        t90 t90Var = new t90(this);
        this.f22891a = t90Var;
        w90 w90Var = new w90(context, t90Var, g6Var);
        this.f22892b = w90Var;
        org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.J6, g6Var);
        w90Var.setTextSize(1, 15.0f);
        w90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        w90Var.setGravity(i11 | 16);
        w90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(w90Var, w7.z5.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f22893c;
    }

    public TextView getTextView() {
        return this.f22892b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        t90 t90Var = this.f22891a;
        if (t90Var != null) {
            canvas.save();
            w90 w90Var = this.f22892b;
            canvas.translate(w90Var.getLeft(), w90Var.getTop());
            if (t90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f22893c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f22892b.setText(charSequence);
    }
}
