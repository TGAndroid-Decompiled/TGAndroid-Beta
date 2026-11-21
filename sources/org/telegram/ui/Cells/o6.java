package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.m80;
public final class o6 extends FrameLayout {
    public final n2.o0 f31207a;
    public final m80 f31208b;
    public final CheckBoxSquare f31209c;

    public o6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f31209c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (gd.f24241a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(checkBoxSquare, c8.ma.d(18, 18.0f, i7 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        n2.o0 o0Var = new n2.o0(this);
        this.f31207a = o0Var;
        m80 m80Var = new m80(context, o0Var, h6Var);
        this.f31208b = m80Var;
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, h6Var);
        m80Var.setTextSize(1, 15.0f);
        m80Var.setMaxLines(2);
        if (gd.f24241a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        m80Var.setGravity(i10 | 16);
        m80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = gd.f24241a0;
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
        addView(m80Var, c8.ma.d(-1, -1.0f, i11, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f31209c;
    }

    public TextView getTextView() {
        return this.f31208b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n2.o0 o0Var = this.f31207a;
        if (o0Var != null) {
            canvas.save();
            m80 m80Var = this.f31208b;
            canvas.translate(m80Var.getLeft(), m80Var.getTop());
            if (o0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f31209c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f31208b.setText(charSequence);
    }
}
