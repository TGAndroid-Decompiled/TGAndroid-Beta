package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.y80;
public final class m6 extends FrameLayout {
    public final v80 f24698a;
    public final y80 f24699b;
    public final CheckBoxSquare f24700c;

    public m6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        float f9;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f24700c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, i7.f6.d(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        v80 v80Var = new v80(this);
        this.f24698a = v80Var;
        y80 y80Var = new y80(context, v80Var, c6Var);
        this.f24699b = y80Var;
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, c6Var));
        y80Var.setTextSize(1, 15.0f);
        y80Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        y80Var.setGravity(i11 | 16);
        y80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        int i12 = (z10 ? 5 : 3) | 48;
        if (z10) {
            f9 = 16.0f;
        } else {
            f9 = 58.0f;
        }
        if (z10) {
            f10 = 58.0f;
        } else {
            f10 = 16.0f;
        }
        addView(y80Var, i7.f6.d(-1, -1.0f, i12, f9, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f24700c;
    }

    public TextView getTextView() {
        return this.f24699b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        v80 v80Var = this.f24698a;
        if (v80Var != null) {
            canvas.save();
            y80 y80Var = this.f24699b;
            canvas.translate(y80Var.getLeft(), y80Var.getTop());
            if (v80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f24700c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f24699b.setText(charSequence);
    }
}
