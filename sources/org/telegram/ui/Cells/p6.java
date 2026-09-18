package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.l90;
public final class p6 extends FrameLayout {
    public final i90 f20778a;
    public final l90 f20779b;
    public final CheckBoxSquare f20780c;

    public p6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f20780c = checkBoxSquare;
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
        i90 i90Var = new i90(this);
        this.f20778a = i90Var;
        l90 l90Var = new l90(context, i90Var, e6Var);
        this.f20779b = l90Var;
        l90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, e6Var));
        l90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, e6Var));
        l90Var.setTextSize(1, 15.0f);
        l90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l90Var.setGravity(i11 | 16);
        l90Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(l90Var, w7.y5.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f20780c;
    }

    public TextView getTextView() {
        return this.f20779b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i90 i90Var = this.f20778a;
        if (i90Var != null) {
            canvas.save();
            l90 l90Var = this.f20779b;
            canvas.translate(l90Var.getLeft(), l90Var.getTop());
            if (i90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f20780c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f20779b.setText(charSequence);
    }
}
