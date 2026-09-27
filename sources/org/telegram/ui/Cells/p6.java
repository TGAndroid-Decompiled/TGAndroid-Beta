package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.p90;
public final class p6 extends FrameLayout {
    public final m90 f20816a;
    public final p90 f20817b;
    public final CheckBoxSquare f20818c;

    public p6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f20818c = checkBoxSquare;
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
        m90 m90Var = new m90(this);
        this.f20816a = m90Var;
        p90 p90Var = new p90(context, m90Var, e6Var);
        this.f20817b = p90Var;
        p90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.J6, e6Var));
        p90Var.setTextSize(1, 15.0f);
        p90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        p90Var.setGravity(i11 | 16);
        p90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(p90Var, w7.y5.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f20818c;
    }

    public TextView getTextView() {
        return this.f20817b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m90 m90Var = this.f20816a;
        if (m90Var != null) {
            canvas.save();
            p90 p90Var = this.f20817b;
            canvas.translate(p90Var.getLeft(), p90Var.getTop());
            if (m90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f20818c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f20817b.setText(charSequence);
    }
}
