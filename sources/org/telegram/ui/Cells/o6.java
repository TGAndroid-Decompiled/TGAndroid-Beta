package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.l80;
public final class o6 extends FrameLayout {
    public final i80 f24829a;
    public final l80 f24830b;
    public final CheckBoxSquare f24831c;

    public o6(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        int i10;
        float f10;
        float f11;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f24831c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView(checkBoxSquare, g7.e6.d(18, 18.0f, i9 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        i80 i80Var = new i80(this);
        this.f24829a = i80Var;
        l80 l80Var = new l80(context, i80Var, b6Var);
        this.f24830b = l80Var;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, b6Var));
        l80Var.setTextSize(1, 15.0f);
        l80Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l80Var.setGravity(i10 | 16);
        l80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        int i11 = (z10 ? 5 : 3) | 48;
        if (z10) {
            f10 = 16.0f;
        } else {
            f10 = 58.0f;
        }
        if (z10) {
            f11 = 58.0f;
        } else {
            f11 = 16.0f;
        }
        addView(l80Var, g7.e6.d(-1, -1.0f, i11, f10, 21.0f, f11, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f24831c;
    }

    public TextView getTextView() {
        return this.f24830b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i80 i80Var = this.f24829a;
        if (i80Var != null) {
            canvas.save();
            l80 l80Var = this.f24830b;
            canvas.translate(l80Var.getLeft(), l80Var.getTop());
            if (i80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f24831c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f24830b.setText(charSequence);
    }
}
