package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.yz;
import org.telegram.ui.bd;
public final class b2 extends w70 {
    public final int L;
    public final Object M;

    public b2(int i7, Context context, Object obj) {
        super(context, null);
        this.L = i7;
        this.M = obj;
    }

    @Override
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).f31597a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((z8) this.M).d;
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
                z8 z8Var = (z8) this.M;
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
        switch (this.L) {
            case 0:
                super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 1:
            default:
                super.setText(charSequence, bufferType);
                return;
            case 2:
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new yz(org.telegram.ui.ActionBar.k6.f28073p7, ((org.telegram.ui.ka) this.M).f47153e.getResourceProvider()), 0, indexOf, 33);
                    }
                    u31[] u31VarArr = (u31[]) charSequence.getSpans(0, charSequence.length(), u31.class);
                    for (int i7 = 0; i7 < u31VarArr.length; i7++) {
                        charSequence.setSpan(new fi.ka(this, 2), charSequence.getSpanStart(u31VarArr[i7]), charSequence.getSpanEnd(u31VarArr[i7]), 33);
                        charSequence.removeSpan(u31VarArr[i7]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                bd bdVar = (bd) this.M;
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new yz(org.telegram.ui.ActionBar.k6.f28073p7, bdVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    u31[] u31VarArr2 = (u31[]) charSequence.getSpans(0, charSequence.length(), u31.class);
                    EditTextBoldCursor editTextBoldCursor = bdVar.f44286y;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = bdVar.f44286y.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i10 = 0; i10 < u31VarArr2.length; i10++) {
                        charSequence.setSpan(new h(4, (Object) this, str), charSequence.getSpanStart(u31VarArr2[i10]), charSequence.getSpanEnd(u31VarArr2[i10]), 33);
                        charSequence.removeSpan(u31VarArr2[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public b2(z8 z8Var, Context context, n2.n0 n0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n0Var, f6Var);
        this.L = 1;
        this.M = z8Var;
    }

    public b2(UndoView undoView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.L = 4;
        this.M = undoView;
    }
}
