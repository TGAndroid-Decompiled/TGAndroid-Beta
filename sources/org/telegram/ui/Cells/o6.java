package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.e90;
public final class o6 extends FrameLayout {
    public final b90 f21518a;
    public final e90 f21519b;
    public final CheckBoxSquare f21520c;

    public o6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f21520c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, k7.b6.d(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        b90 b90Var = new b90(this);
        this.f21518a = b90Var;
        e90 e90Var = new e90(context, b90Var, f6Var);
        this.f21519b = e90Var;
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        e90Var.setTextSize(1, 15.0f);
        e90Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        e90Var.setGravity(i11 | 16);
        e90Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z4 = LocaleController.isRTL;
        int i12 = (z4 ? 5 : 3) | 48;
        if (z4) {
            f10 = 16.0f;
        } else {
            f10 = 58.0f;
        }
        if (z4) {
            f11 = 58.0f;
        } else {
            f11 = 16.0f;
        }
        addView(e90Var, k7.b6.d(-1, -1.0f, i12, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f21520c;
    }

    public TextView getTextView() {
        return this.f21519b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b90 b90Var = this.f21518a;
        if (b90Var != null) {
            canvas.save();
            e90 e90Var = this.f21519b;
            canvas.translate(e90Var.getLeft(), e90Var.getTop());
            if (b90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z4) {
        this.f21520c.a(z4, true);
    }

    public void setText(CharSequence charSequence) {
        this.f21519b.setText(charSequence);
    }
}
