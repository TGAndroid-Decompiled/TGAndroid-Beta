package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.s70;
public final class m6 extends FrameLayout {
    public final m2.p0 f29629a;
    public final s70 f29630b;
    public final CheckBoxSquare f29631c;

    public m6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        int i10;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f29631c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(checkBoxSquare, mf.d(18, 18.0f, i3 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        m2.p0 p0Var = new m2.p0(this);
        this.f29629a = p0Var;
        s70 s70Var = new s70(context, p0Var, e6Var);
        this.f29630b = s70Var;
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.J6, e6Var);
        s70Var.setTextSize(1, 15.0f);
        s70Var.setMaxLines(2);
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        s70Var.setGravity(i10 | 16);
        s70Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = bd.f21784a0;
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
        addView(s70Var, mf.d(-1, -1.0f, i11, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f29631c;
    }

    public TextView getTextView() {
        return this.f29630b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m2.p0 p0Var = this.f29629a;
        if (p0Var != null) {
            canvas.save();
            s70 s70Var = this.f29630b;
            canvas.translate(s70Var.getLeft(), s70Var.getTop());
            if (p0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f29631c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f29630b.setText(charSequence);
    }
}
