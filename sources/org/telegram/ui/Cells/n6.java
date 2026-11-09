package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.x70;
public final class n6 extends FrameLayout {
    public final n2.n0 f29623a;
    public final x70 f29624b;
    public final CheckBoxSquare f29625c;

    public n6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f29625c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(checkBoxSquare, c8.ha.d(18, 18.0f, i7 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        n2.n0 n0Var = new n2.n0(this);
        this.f29623a = n0Var;
        x70 x70Var = new x70(context, n0Var, g6Var);
        this.f29624b = x70Var;
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.J6, g6Var);
        x70Var.setTextSize(1, 15.0f);
        x70Var.setMaxLines(2);
        if (id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        x70Var.setGravity(i10 | 16);
        x70Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z9 = id.f23157a0;
        int i11 = (z9 ? 5 : 3) | 48;
        if (z9) {
            f10 = 16.0f;
        } else {
            f10 = 58.0f;
        }
        if (z9) {
            f11 = 58.0f;
        } else {
            f11 = 16.0f;
        }
        addView(x70Var, c8.ha.d(-1, -1.0f, i11, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f29625c;
    }

    public TextView getTextView() {
        return this.f29624b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n2.n0 n0Var = this.f29623a;
        if (n0Var != null) {
            canvas.save();
            x70 x70Var = this.f29624b;
            canvas.translate(x70Var.getLeft(), x70Var.getTop());
            if (n0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z9) {
        this.f29625c.a(z9, true);
    }

    public void setText(CharSequence charSequence) {
        this.f29624b.setText(charSequence);
    }
}
