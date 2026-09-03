package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f90;
public final class n6 extends FrameLayout {
    public final c90 f21428a;
    public final f90 f21429b;
    public final CheckBoxSquare f21430c;

    public n6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f21430c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, k7.b6.d(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        c90 c90Var = new c90(this);
        this.f21428a = c90Var;
        f90 f90Var = new f90(context, c90Var, f6Var);
        this.f21429b = f90Var;
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        f90Var.setTextSize(1, 15.0f);
        f90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        f90Var.setGravity(i11 | 16);
        f90Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z4 = LocaleController.isRTL;
        int i12 = (z4 ? 5 : 3) | 48;
        if (z4) {
            f10 = 16.0f;
        } else {
            f10 = 58.0f;
        }
        if (z4) {
            f11 = 58.0f;
        } else {
            f11 = 16.0f;
        }
        addView(f90Var, k7.b6.d(-1, -1.0f, i12, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f21430c;
    }

    public TextView getTextView() {
        return this.f21429b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c90 c90Var = this.f21428a;
        if (c90Var != null) {
            canvas.save();
            f90 f90Var = this.f21429b;
            canvas.translate(f90Var.getLeft(), f90Var.getTop());
            if (c90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z4) {
        this.f21430c.a(z4, true);
    }

    public void setText(CharSequence charSequence) {
        this.f21429b.setText(charSequence);
    }
}
