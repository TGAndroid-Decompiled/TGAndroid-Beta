package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.k90;
public final class q6 extends FrameLayout {
    public final h90 f20849a;
    public final k90 f20850b;
    public final CheckBoxSquare f20851c;

    public q6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f20851c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, w7.y5.d(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        h90 h90Var = new h90(this);
        this.f20849a = h90Var;
        k90 k90Var = new k90(context, h90Var, f6Var);
        this.f20850b = k90Var;
        k90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        k90Var.setTextSize(1, 15.0f);
        k90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k90Var.setGravity(i11 | 16);
        k90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(k90Var, w7.y5.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f20851c;
    }

    public TextView getTextView() {
        return this.f20850b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        h90 h90Var = this.f20849a;
        if (h90Var != null) {
            canvas.save();
            k90 k90Var = this.f20850b;
            canvas.translate(k90Var.getLeft(), k90Var.getTop());
            if (h90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f20851c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f20850b.setText(charSequence);
    }
}
