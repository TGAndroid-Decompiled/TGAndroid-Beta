package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g90;
public final class o6 extends FrameLayout {
    public final d90 f23300a;
    public final g90 f23301b;
    public final CheckBoxSquare f23302c;

    public o6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f23302c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, k7.c6.d(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        d90 d90Var = new d90(this);
        this.f23300a = d90Var;
        g90 g90Var = new g90(context, d90Var, g6Var);
        this.f23301b = g90Var;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J6, g6Var));
        g90Var.setTextSize(1, 15.0f);
        g90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        g90Var.setGravity(i11 | 16);
        g90Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z4 = LocaleController.isRTL;
        int i12 = (z4 ? 5 : 3) | 48;
        if (z4) {
            f10 = 16.0f;
        } else {
            f10 = 58.0f;
        }
        if (z4) {
            f11 = 58.0f;
        } else {
            f11 = 16.0f;
        }
        addView(g90Var, k7.c6.d(-1, -1.0f, i12, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f23302c;
    }

    public TextView getTextView() {
        return this.f23301b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d90 d90Var = this.f23300a;
        if (d90Var != null) {
            canvas.save();
            g90 g90Var = this.f23301b;
            canvas.translate(g90Var.getLeft(), g90Var.getTop());
            if (d90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z4) {
        this.f23302c.a(z4, true);
    }

    public void setText(CharSequence charSequence) {
        this.f23301b.setText(charSequence);
    }
}
