package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ia0;
public final class p6 extends FrameLayout {
    public final fa0 f22420a;
    public final ia0 f22421b;
    public final CheckBoxSquare f22422c;

    public p6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f22422c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, w7.w5.a(18.0f, 21.0f, 0.0f, 21.0f, 0.0f, 18, i10 | 16));
        fa0 fa0Var = new fa0(this);
        this.f22420a = fa0Var;
        ia0 ia0Var = new ia0(context, fa0Var, c6Var);
        this.f22421b = ia0Var;
        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J6, c6Var));
        ia0Var.setTextSize(1, 15.0f);
        ia0Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        ia0Var.setGravity(i11 | 16);
        ia0Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(ia0Var, w7.w5.a(-1.0f, f7, 21.0f, f10, 21.0f, -1, i12));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f22422c;
    }

    public TextView getTextView() {
        return this.f22421b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fa0 fa0Var = this.f22420a;
        if (fa0Var != null) {
            canvas.save();
            ia0 ia0Var = this.f22421b;
            canvas.translate(ia0Var.getLeft(), ia0Var.getTop());
            if (fa0Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f22422c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f22421b.setText(charSequence);
    }
}
