package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.da0;
public final class p6 extends FrameLayout {
    public final aa0 f21398a;
    public final da0 f21399b;
    public final CheckBoxSquare f21400c;

    public p6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f21400c = checkBoxSquare;
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
        aa0 aa0Var = new aa0(this);
        this.f21398a = aa0Var;
        da0 da0Var = new da0(context, aa0Var, c6Var);
        this.f21399b = da0Var;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.J6, c6Var));
        da0Var.setTextSize(1, 15.0f);
        da0Var.setMaxLines(2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        da0Var.setGravity(i11 | 16);
        da0Var.setEllipsize(TextUtils.TruncateAt.END);
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
        addView(da0Var, w7.z5.a(-1.0f, f7, 21.0f, f10, 21.0f, -1, i12));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f21400c;
    }

    public TextView getTextView() {
        return this.f21399b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        aa0 aa0Var = this.f21398a;
        if (aa0Var != null) {
            canvas.save();
            da0 da0Var = this.f21399b;
            canvas.translate(da0Var.getLeft(), da0Var.getTop());
            if (aa0Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f21400c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f21399b.setText(charSequence);
    }
}
