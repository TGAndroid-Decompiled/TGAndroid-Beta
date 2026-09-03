package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.f90;
import org.telegram.ui.pd;
public final class w1 extends f90 {
    public final int I;
    public final Object J;

    public w1(Object obj, Context context, int i10) {
        super(context, null);
        this.I = i10;
        this.J = obj;
    }

    @Override
    public int a() {
        switch (this.I) {
            case 4:
                return ((UndoView) this.J).f23186a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.I) {
            case 1:
                Integer num = ((z8) this.J).d;
                if (num != null) {
                    return num.intValue();
                }
                return super.c();
            default:
                return super.c();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.I) {
            case 0:
                super.onDraw(canvas);
                ((y1) this.J).f();
                return;
            case 1:
                z8 z8Var = (z8) this.J;
                z8Var.b();
                super.onDraw(canvas);
                z8Var.a();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        String str;
        switch (this.I) {
            case 0:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                return;
            case 1:
            default:
                super.setText(charSequence, bufferType);
                return;
            case 2:
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.qa) this.J).e.getThemedColor(org.telegram.ui.ActionBar.j6.f20097p7)), 0, indexOf, 33);
                    }
                    f51[] f51VarArr = (f51[]) charSequence.getSpans(0, charSequence.length(), f51.class);
                    for (int i10 = 0; i10 < f51VarArr.length; i10++) {
                        charSequence.setSpan(new eg.l0(this, 2), charSequence.getSpanStart(f51VarArr[i10]), charSequence.getSpanEnd(f51VarArr[i10]), 33);
                        charSequence.removeSpan(f51VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                pd pdVar = (pd) this.J;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(pdVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20097p7)), 0, indexOf2, 33);
                    }
                    f51[] f51VarArr2 = (f51[]) charSequence.getSpans(0, charSequence.length(), f51.class);
                    EditTextBoldCursor editTextBoldCursor = pdVar.f37101w;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = pdVar.f37101w.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i11 = 0; i11 < f51VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, str), charSequence.getSpanStart(f51VarArr2[i11]), charSequence.getSpanEnd(f51VarArr2[i11]), 33);
                        charSequence.removeSpan(f51VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public w1(z8 z8Var, Context context, c90 c90Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, c90Var, f6Var);
        this.I = 1;
        this.J = z8Var;
    }

    public w1(UndoView undoView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.I = 4;
        this.J = undoView;
    }
}
