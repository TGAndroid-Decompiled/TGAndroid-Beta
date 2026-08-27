package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.p80;

public final class l6 extends FrameLayout {

    public final m80 f24618a;

    public final p80 f24619b;

    public final CheckBoxSquare f24620c;

    public l6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f24620c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, h7.z5.d(18, 18.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        m80 m80Var = new m80(this);
        this.f24618a = m80Var;
        p80 p80Var = new p80(context, m80Var, c6Var);
        this.f24619b = p80Var;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, c6Var));
        p80Var.setTextSize(1, 15.0f);
        p80Var.setMaxLines(2);
        p80Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(p80Var, h7.z5.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f24620c;
    }

    public TextView getTextView() {
        return this.f24619b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m80 m80Var = this.f24618a;
        if (m80Var != null) {
            canvas.save();
            p80 p80Var = this.f24619b;
            canvas.translate(p80Var.getLeft(), p80Var.getTop());
            if (m80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f24620c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f24619b.setText(charSequence);
    }
}
