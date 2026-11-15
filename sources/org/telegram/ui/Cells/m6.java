package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.z70;
public final class m6 extends FrameLayout {
    public final n2.o0 f30690a;
    public final z70 f30691b;
    public final CheckBoxSquare f30692c;

    public m6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f30692c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(checkBoxSquare, c8.ja.d(18, 18.0f, i7 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        n2.o0 o0Var = new n2.o0(this);
        this.f30690a = o0Var;
        z70 z70Var = new z70(context, o0Var, e6Var);
        this.f30691b = z70Var;
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.J6, e6Var);
        z70Var.setTextSize(1, 15.0f);
        z70Var.setMaxLines(2);
        if (hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z70Var.setGravity(i10 | 16);
        z70Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = hd.f24101a0;
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
        addView(z70Var, c8.ja.d(-1, -1.0f, i11, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f30692c;
    }

    public TextView getTextView() {
        return this.f30691b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n2.o0 o0Var = this.f30690a;
        if (o0Var != null) {
            canvas.save();
            z70 z70Var = this.f30691b;
            canvas.translate(z70Var.getLeft(), z70Var.getTop());
            if (o0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f30692c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f30691b.setText(charSequence);
    }
}
