package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.x90;
public final class t6 extends FrameLayout {
    public final x90 f25451a;
    public final aa0 f25452b;
    public final CheckBoxSquare f25453c;

    public t6(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f25453c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, kb1.h(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        x90 x90Var = new x90(this);
        this.f25451a = x90Var;
        aa0 aa0Var = new aa0(context, x90Var, u6Var);
        this.f25452b = aa0Var;
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.J6, u6Var);
        aa0Var.setTextSize(1, 15.0f);
        aa0Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        aa0Var.setGravity(i11 | 16);
        aa0Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(aa0Var, kb1.h(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f25453c;
    }

    public TextView getTextView() {
        return this.f25452b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        x90 x90Var = this.f25451a;
        if (x90Var != null) {
            canvas.save();
            aa0 aa0Var = this.f25452b;
            canvas.translate(aa0Var.getLeft(), aa0Var.getTop());
            if (x90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f25453c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f25452b.setText(charSequence);
    }
}
