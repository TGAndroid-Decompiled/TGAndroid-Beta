package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ea0;
public final class p6 extends FrameLayout {
    public final ba0 f22684a;
    public final ea0 f22685b;
    public final CheckBoxSquare f22686c;

    public p6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f22686c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, w7.x5.a(18.0f, 21.0f, 0.0f, 21.0f, 0.0f, 18, i10 | 16));
        ba0 ba0Var = new ba0(this);
        this.f22684a = ba0Var;
        ea0 ea0Var = new ea0(context, ba0Var, d6Var);
        this.f22685b = ea0Var;
        ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        ea0Var.setTextSize(1, 15.0f);
        ea0Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        ea0Var.setGravity(i11 | 16);
        ea0Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(ea0Var, w7.x5.a(-1.0f, f7, 21.0f, f10, 21.0f, -1, i12));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f22686c;
    }

    public TextView getTextView() {
        return this.f22685b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ba0 ba0Var = this.f22684a;
        if (ba0Var != null) {
            canvas.save();
            ea0 ea0Var = this.f22685b;
            canvas.translate(ea0Var.getLeft(), ea0Var.getTop());
            if (ba0Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f22686c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f22685b.setText(charSequence);
    }
}
