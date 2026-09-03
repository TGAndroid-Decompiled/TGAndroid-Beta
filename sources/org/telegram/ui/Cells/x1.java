package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g90;
import org.telegram.ui.nd;
public final class x1 extends g90 {
    public final int I;
    public final Object J;

    public x1(Object obj, Context context, int i10) {
        super(context, null);
        this.I = i10;
        this.J = obj;
    }

    @Override
    public int a() {
        switch (this.I) {
            case 4:
                return ((UndoView) this.J).f25077a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.I) {
            case 1:
                Integer num = ((a9) this.J).d;
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
                ((z1) this.J).f();
                return;
            case 1:
                a9 a9Var = (a9) this.J;
                a9Var.b();
                super.onDraw(canvas);
                a9Var.a();
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.oa) this.J).f39631e.getThemedColor(org.telegram.ui.ActionBar.k6.f21878p7)), 0, indexOf, 33);
                    }
                    e51[] e51VarArr = (e51[]) charSequence.getSpans(0, charSequence.length(), e51.class);
                    for (int i10 = 0; i10 < e51VarArr.length; i10++) {
                        charSequence.setSpan(new fg.l0(this, 2), charSequence.getSpanStart(e51VarArr[i10]), charSequence.getSpanEnd(e51VarArr[i10]), 33);
                        charSequence.removeSpan(e51VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                nd ndVar = (nd) this.J;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(ndVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21878p7)), 0, indexOf2, 33);
                    }
                    e51[] e51VarArr2 = (e51[]) charSequence.getSpans(0, charSequence.length(), e51.class);
                    EditTextBoldCursor editTextBoldCursor = ndVar.f39324w;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = ndVar.f39324w.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i11 = 0; i11 < e51VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, str), charSequence.getSpanStart(e51VarArr2[i11]), charSequence.getSpanEnd(e51VarArr2[i11]), 33);
                        charSequence.removeSpan(e51VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public x1(a9 a9Var, Context context, d90 d90Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, d90Var, g6Var);
        this.I = 1;
        this.J = a9Var;
    }

    public x1(UndoView undoView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.I = 4;
        this.J = undoView;
    }
}
