package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.d90;
public final class p6 extends FrameLayout {
    public final a90 f20563a;
    public final d90 f20564b;
    public final CheckBoxSquare f20565c;

    public p6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f20565c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, w7.x5.d(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        a90 a90Var = new a90(this);
        this.f20563a = a90Var;
        d90 d90Var = new d90(context, a90Var, d6Var);
        this.f20564b = d90Var;
        d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        d90Var.setTextSize(1, 15.0f);
        d90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        d90Var.setGravity(i11 | 16);
        d90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(d90Var, w7.x5.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f20565c;
    }

    public TextView getTextView() {
        return this.f20564b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a90 a90Var = this.f20563a;
        if (a90Var != null) {
            canvas.save();
            d90 d90Var = this.f20564b;
            canvas.translate(d90Var.getLeft(), d90Var.getTop());
            if (a90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f20565c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f20564b.setText(charSequence);
    }
}
