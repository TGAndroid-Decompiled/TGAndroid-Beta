package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.n90;
public final class p6 extends FrameLayout {
    public final k90 f20800a;
    public final n90 f20801b;
    public final CheckBoxSquare f20802c;

    public p6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f20802c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, w7.y5.d(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        k90 k90Var = new k90(this);
        this.f20800a = k90Var;
        n90 n90Var = new n90(context, k90Var, d6Var);
        this.f20801b = n90Var;
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        n90Var.setTextSize(1, 15.0f);
        n90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        n90Var.setGravity(i11 | 16);
        n90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(n90Var, w7.y5.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f20802c;
    }

    public TextView getTextView() {
        return this.f20801b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        k90 k90Var = this.f20800a;
        if (k90Var != null) {
            canvas.save();
            n90 n90Var = this.f20801b;
            canvas.translate(n90Var.getLeft(), n90Var.getTop());
            if (k90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f20802c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f20801b.setText(charSequence);
    }
}
