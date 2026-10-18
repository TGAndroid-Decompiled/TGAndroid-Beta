package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.x90;
public final class o6 extends FrameLayout {
    public final u90 f22730a;
    public final x90 f22731b;
    public final CheckBoxSquare f22732c;

    public o6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f22732c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, w7.z5.a(18.0f, 21.0f, 0.0f, 21.0f, 0.0f, 18, i10 | 16));
        u90 u90Var = new u90(this);
        this.f22730a = u90Var;
        x90 x90Var = new x90(context, u90Var, d6Var);
        this.f22731b = x90Var;
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        x90Var.setTextSize(1, 15.0f);
        x90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        x90Var.setGravity(i11 | 16);
        x90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(x90Var, w7.z5.a(-1.0f, f7, 21.0f, f10, 21.0f, -1, i12));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f22732c;
    }

    public TextView getTextView() {
        return this.f22731b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        u90 u90Var = this.f22730a;
        if (u90Var != null) {
            canvas.save();
            x90 x90Var = this.f22731b;
            canvas.translate(x90Var.getLeft(), x90Var.getTop());
            if (u90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f22732c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f22731b.setText(charSequence);
    }
}
