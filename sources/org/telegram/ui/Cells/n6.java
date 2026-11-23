package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.j80;
public final class n6 extends FrameLayout {
    public final n2.p0 f31213a;
    public final j80 f31214b;
    public final CheckBoxSquare f31215c;

    public n6(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f31215c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(checkBoxSquare, c8.na.d(18, 18.0f, i7 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        n2.p0 p0Var = new n2.p0(this);
        this.f31213a = p0Var;
        j80 j80Var = new j80(context, p0Var, i6Var);
        this.f31214b = j80Var;
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.J6, i6Var);
        j80Var.setTextSize(1, 15.0f);
        j80Var.setMaxLines(2);
        if (gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j80Var.setGravity(i10 | 16);
        j80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = gd.f24314a0;
        int i11 = (z10 ? 5 : 3) | 48;
        if (z10) {
            f10 = 16.0f;
        } else {
            f10 = 58.0f;
        }
        if (z10) {
            f11 = 58.0f;
        } else {
            f11 = 16.0f;
        }
        addView(j80Var, c8.na.d(-1, -1.0f, i11, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f31215c;
    }

    public TextView getTextView() {
        return this.f31214b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n2.p0 p0Var = this.f31213a;
        if (p0Var != null) {
            canvas.save();
            j80 j80Var = this.f31214b;
            canvas.translate(j80Var.getLeft(), j80Var.getTop());
            if (p0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f31215c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f31214b.setText(charSequence);
    }
}
