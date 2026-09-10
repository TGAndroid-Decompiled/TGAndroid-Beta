package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import bi.pd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.s51;
import org.telegram.ui.nd;
public final class x1 extends m90 {
    public final int L;
    public final Object M;

    public x1(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).f21314a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((f9) this.M).d;
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
        switch (this.L) {
            case 0:
                super.onDraw(canvas);
                ((z1) this.M).f();
                return;
            case 1:
                f9 f9Var = (f9) this.M;
                f9Var.b();
                super.onDraw(canvas);
                f9Var.a();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        String str;
        switch (this.L) {
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.qa) this.M).e.getThemedColor(org.telegram.ui.ActionBar.j6.f18144p7)), 0, indexOf, 33);
                    }
                    s51[] s51VarArr = (s51[]) charSequence.getSpans(0, charSequence.length(), s51.class);
                    for (int i10 = 0; i10 < s51VarArr.length; i10++) {
                        charSequence.setSpan(new pd(this, 2), charSequence.getSpanStart(s51VarArr[i10]), charSequence.getSpanEnd(s51VarArr[i10]), 33);
                        charSequence.removeSpan(s51VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                nd ndVar = (nd) this.M;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(ndVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18144p7)), 0, indexOf2, 33);
                    }
                    s51[] s51VarArr2 = (s51[]) charSequence.getSpans(0, charSequence.length(), s51.class);
                    EditTextBoldCursor editTextBoldCursor = ndVar.f35246w;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = ndVar.f35246w.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i11 = 0; i11 < s51VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, str), charSequence.getSpanStart(s51VarArr2[i11]), charSequence.getSpanEnd(s51VarArr2[i11]), 33);
                        charSequence.removeSpan(s51VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public x1(f9 f9Var, Context context, j90 j90Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j90Var, f6Var);
        this.L = 1;
        this.M = f9Var;
    }

    public x1(UndoView undoView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.L = 4;
        this.M = undoView;
    }
}
