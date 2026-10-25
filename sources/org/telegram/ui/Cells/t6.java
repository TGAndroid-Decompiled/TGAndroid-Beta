package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.z90;
public final class t6 extends FrameLayout {
    public final w90 f25447a;
    public final z90 f25448b;
    public final CheckBoxSquare f25449c;

    public t6(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f25449c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, gb1.h(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        w90 w90Var = new w90(this);
        this.f25447a = w90Var;
        z90 z90Var = new z90(context, w90Var, u6Var);
        this.f25448b = z90Var;
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.J6, u6Var);
        z90Var.setTextSize(1, 15.0f);
        z90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        z90Var.setGravity(i11 | 16);
        z90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(z90Var, gb1.h(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f25449c;
    }

    public TextView getTextView() {
        return this.f25448b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        w90 w90Var = this.f25447a;
        if (w90Var != null) {
            canvas.save();
            z90 z90Var = this.f25448b;
            canvas.translate(z90Var.getLeft(), z90Var.getTop());
            if (w90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f25449c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f25448b.setText(charSequence);
    }
}
