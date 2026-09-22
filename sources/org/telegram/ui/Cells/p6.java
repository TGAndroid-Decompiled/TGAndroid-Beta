package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.z80;
public final class p6 extends FrameLayout {
    public final z80 f20583a;
    public final c90 f20584b;
    public final CheckBoxSquare f20585c;

    public p6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f20585c = checkBoxSquare;
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
        z80 z80Var = new z80(this);
        this.f20583a = z80Var;
        c90 c90Var = new c90(context, z80Var, e6Var);
        this.f20584b = c90Var;
        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.J6, e6Var));
        c90Var.setTextSize(1, 15.0f);
        c90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        c90Var.setGravity(i11 | 16);
        c90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(c90Var, w7.x5.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f20585c;
    }

    public TextView getTextView() {
        return this.f20584b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        z80 z80Var = this.f20583a;
        if (z80Var != null) {
            canvas.save();
            c90 c90Var = this.f20584b;
            canvas.translate(c90Var.getLeft(), c90Var.getTop());
            if (z80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f20585c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f20584b.setText(charSequence);
    }
}
