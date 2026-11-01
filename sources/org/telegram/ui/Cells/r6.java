package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.p80;
public final class r6 extends FrameLayout {
    public final ji.a f22871a;
    public final p80 f22872b;
    public final CheckBoxSquare f22873c;

    public r6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.f22873c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(checkBoxSquare, w7.b6.d(18, 18.0f, i10 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        ji.a aVar = new ji.a(this);
        this.f22871a = aVar;
        p80 p80Var = new p80(context, aVar, p6Var);
        this.f22872b = p80Var;
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.J6, p6Var);
        p80Var.setTextSize(1, 15.0f);
        p80Var.setMaxLines(2);
        if (dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        p80Var.setGravity(i11 | 16);
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = dd.X;
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
        addView(p80Var, w7.b6.d(-1, -1.0f, i12, f7, 21.0f, f10, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.f22873c;
    }

    public TextView getTextView() {
        return this.f22872b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ji.a aVar = this.f22871a;
        if (aVar != null) {
            canvas.save();
            p80 p80Var = this.f22872b;
            canvas.translate(p80Var.getLeft(), p80Var.getTop());
            if (aVar.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.f22873c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.f22872b.setText(charSequence);
    }
}
