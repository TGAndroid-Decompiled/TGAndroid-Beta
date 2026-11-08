package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.w70;
public final class n6 extends FrameLayout {
    public final n2.n0 f29619a;
    public final w70 f29620b;
    public final CheckBoxSquare f29621c;

    public n6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f29621c = checkBoxSquare;
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
        this.f29619a = n0Var;
        w70 w70Var = new w70(context, n0Var, f6Var);
        this.f29620b = w70Var;
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.J6, f6Var);
        w70Var.setTextSize(1, 15.0f);
        w70Var.setMaxLines(2);
        if (id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        w70Var.setGravity(i10 | 16);
        w70Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(w70Var, c8.ha.d(-1, -1.0f, i11, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f29621c;
    }

    public TextView getTextView() {
        return this.f29620b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n2.n0 n0Var = this.f29619a;
        if (n0Var != null) {
            canvas.save();
            w70 w70Var = this.f29620b;
            canvas.translate(w70Var.getLeft(), w70Var.getTop());
            if (n0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z9) {
        this.f29621c.a(z9, true);
    }

    public void setText(CharSequence charSequence) {
        this.f29620b.setText(charSequence);
    }
}
