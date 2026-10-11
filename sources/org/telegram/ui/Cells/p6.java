package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.fa0;
public final class p6 extends FrameLayout {
    public final ca0 f22648a;
    public final fa0 f22649b;
    public final CheckBoxSquare f22650c;

    public p6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f22650c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, w7.x5.a(18.0f, 21.0f, 0.0f, 21.0f, 0.0f, 18, i10 | 16));
        ca0 ca0Var = new ca0(this);
        this.f22648a = ca0Var;
        fa0 fa0Var = new fa0(context, ca0Var, d6Var);
        this.f22649b = fa0Var;
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        fa0Var.setTextSize(1, 15.0f);
        fa0Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        fa0Var.setGravity(i11 | 16);
        fa0Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(fa0Var, w7.x5.a(-1.0f, f7, 21.0f, f10, 21.0f, -1, i12));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f22650c;
    }

    public TextView getTextView() {
        return this.f22649b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ca0 ca0Var = this.f22648a;
        if (ca0Var != null) {
            canvas.save();
            fa0 fa0Var = this.f22649b;
            canvas.translate(fa0Var.getLeft(), fa0Var.getTop());
            if (ca0Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f22650c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f22649b.setText(charSequence);
    }
}
