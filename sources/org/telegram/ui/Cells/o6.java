package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.k80;
public final class o6 extends FrameLayout {
    public final n2.o0 f31179a;
    public final k80 f31180b;
    public final CheckBoxSquare f31181c;

    public o6(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f31181c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(checkBoxSquare, c8.ma.d(18, 18.0f, i7 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        n2.o0 o0Var = new n2.o0(this);
        this.f31179a = o0Var;
        k80 k80Var = new k80(context, o0Var, i6Var);
        this.f31180b = k80Var;
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.J6, i6Var);
        k80Var.setTextSize(1, 15.0f);
        k80Var.setMaxLines(2);
        if (gd.f24213a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k80Var.setGravity(i10 | 16);
        k80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = gd.f24213a0;
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
        addView(k80Var, c8.ma.d(-1, -1.0f, i11, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f31181c;
    }

    public TextView getTextView() {
        return this.f31180b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n2.o0 o0Var = this.f31179a;
        if (o0Var != null) {
            canvas.save();
            k80 k80Var = this.f31180b;
            canvas.translate(k80Var.getLeft(), k80Var.getTop());
            if (o0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f31181c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f31180b.setText(charSequence);
    }
}
