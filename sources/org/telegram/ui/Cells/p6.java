package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.o90;
public final class p6 extends FrameLayout {
    public final l90 f20814a;
    public final o90 f20815b;
    public final CheckBoxSquare f20816c;

    public p6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f20816c = checkBoxSquare;
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
        l90 l90Var = new l90(this);
        this.f20814a = l90Var;
        o90 o90Var = new o90(context, l90Var, d6Var);
        this.f20815b = o90Var;
        o90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        o90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        o90Var.setTextSize(1, 15.0f);
        o90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        o90Var.setGravity(i11 | 16);
        o90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(o90Var, w7.y5.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f20816c;
    }

    public TextView getTextView() {
        return this.f20815b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        l90 l90Var = this.f20814a;
        if (l90Var != null) {
            canvas.save();
            o90 o90Var = this.f20815b;
            canvas.translate(o90Var.getLeft(), o90Var.getTop());
            if (l90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f20816c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f20815b.setText(charSequence);
    }
}
