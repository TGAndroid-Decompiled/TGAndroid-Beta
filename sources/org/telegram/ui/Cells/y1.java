package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import ei.kb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.x90;
import org.telegram.ui.od;
public final class y1 extends x90 {
    public final int L;
    public final Object M;

    public y1(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).f24403a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((d9) this.M).d;
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
                ((a2) this.M).f();
                return;
            case 1:
                d9 d9Var = (d9) this.M;
                d9Var.b();
                super.onDraw(canvas);
                d9Var.a();
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.ta) this.M).e.getThemedColor(org.telegram.ui.ActionBar.h6.f21207p7)), 0, indexOf, 33);
                    }
                    c61[] c61VarArr = (c61[]) charSequence.getSpans(0, charSequence.length(), c61.class);
                    for (int i10 = 0; i10 < c61VarArr.length; i10++) {
                        charSequence.setSpan(new kb(this, 2), charSequence.getSpanStart(c61VarArr[i10]), charSequence.getSpanEnd(c61VarArr[i10]), 33);
                        charSequence.removeSpan(c61VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                od odVar = (od) this.M;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(odVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21207p7)), 0, indexOf2, 33);
                    }
                    c61[] c61VarArr2 = (c61[]) charSequence.getSpans(0, charSequence.length(), c61.class);
                    EditTextBoldCursor editTextBoldCursor = odVar.f39751w;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = odVar.f39751w.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i11 = 0; i11 < c61VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, str), charSequence.getSpanStart(c61VarArr2[i11]), charSequence.getSpanEnd(c61VarArr2[i11]), 33);
                        charSequence.removeSpan(c61VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public y1(d9 d9Var, Context context, u90 u90Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, u90Var, d6Var);
        this.L = 1;
        this.M = d9Var;
    }

    public y1(UndoView undoView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.L = 4;
        this.M = undoView;
    }
}
