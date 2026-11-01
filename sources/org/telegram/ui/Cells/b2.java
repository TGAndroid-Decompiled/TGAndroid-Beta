package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.y41;
import org.telegram.ui.kd;
public final class b2 extends p80 {
    public final int L;
    public final Object M;

    public b2(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).f24239a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((b9) this.M).d;
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
                ((c2) this.M).f();
                return;
            case 1:
                b9 b9Var = (b9) this.M;
                b9Var.b();
                super.onDraw(canvas);
                b9Var.a();
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
                super.setText(org.telegram.messenger.k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 1:
            default:
                super.setText(charSequence, bufferType);
                return;
            case 2:
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.i0.W2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new l00(org.telegram.ui.ActionBar.t6.f21154p7, ((org.telegram.ui.na) this.M).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    y41[] y41VarArr = (y41[]) charSequence.getSpans(0, charSequence.length(), y41.class);
                    for (int i10 = 0; i10 < y41VarArr.length; i10++) {
                        charSequence.setSpan(new dh.a(this, 3), charSequence.getSpanStart(y41VarArr[i10]), charSequence.getSpanEnd(y41VarArr[i10]), 33);
                        charSequence.removeSpan(y41VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                kd kdVar = (kd) this.M;
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.i0.W2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new l00(org.telegram.ui.ActionBar.t6.f21154p7, kdVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    y41[] y41VarArr2 = (y41[]) charSequence.getSpans(0, charSequence.length(), y41.class);
                    EditTextBoldCursor editTextBoldCursor = kdVar.f38838y;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = kdVar.f38838y.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i11 = 0; i11 < y41VarArr2.length; i11++) {
                        charSequence.setSpan(new h(4, (Object) this, str), charSequence.getSpanStart(y41VarArr2[i11]), charSequence.getSpanEnd(y41VarArr2[i11]), 33);
                        charSequence.removeSpan(y41VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public b2(b9 b9Var, Context context, ji.a aVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, aVar, p6Var);
        this.L = 1;
        this.M = b9Var;
    }

    public b2(UndoView undoView, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.L = 4;
        this.M = undoView;
    }
}
