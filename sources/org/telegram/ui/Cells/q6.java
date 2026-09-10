package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.m90;
public final class q6 extends FrameLayout {
    public final j90 f19718a;
    public final m90 f19719b;
    public final CheckBoxSquare f19720c;

    public q6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f19720c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, w7.a6.d(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        j90 j90Var = new j90(this);
        this.f19718a = j90Var;
        m90 m90Var = new m90(context, j90Var, f6Var);
        this.f19719b = m90Var;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        m90Var.setTextSize(1, 15.0f);
        m90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        m90Var.setGravity(i11 | 16);
        m90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(m90Var, w7.a6.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f19720c;
    }

    public TextView getTextView() {
        return this.f19719b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        j90 j90Var = this.f19718a;
        if (j90Var != null) {
            canvas.save();
            m90 m90Var = this.f19719b;
            canvas.translate(m90Var.getLeft(), m90Var.getTop());
            if (j90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f19720c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f19719b.setText(charSequence);
    }
}
