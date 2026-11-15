package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.z70;
import org.telegram.ui.ad;
public final class b2 extends z70 {
    public final int M;
    public final Object N;

    public b2(int i7, Context context, Object obj) {
        super(context, null);
        this.M = i7;
        this.N = obj;
    }

    @Override
    public int a() {
        switch (this.M) {
            case 4:
                return ((UndoView) this.N).f32775a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.M) {
            case 1:
                Integer num = ((y8) this.N).d;
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
        switch (this.M) {
            case 0:
                super.onDraw(canvas);
                ((c2) this.N).f();
                return;
            case 1:
                y8 y8Var = (y8) this.N;
                y8Var.b();
                super.onDraw(canvas);
                y8Var.a();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        String str;
        switch (this.M) {
            case 0:
                super.setText(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
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
                        charSequence.setSpan(new b00(org.telegram.ui.ActionBar.j6.f29070p7, ((org.telegram.ui.ka) this.N).f48657e.getResourceProvider()), 0, indexOf, 33);
                    }
                    y31[] y31VarArr = (y31[]) charSequence.getSpans(0, charSequence.length(), y31.class);
                    for (int i7 = 0; i7 < y31VarArr.length; i7++) {
                        charSequence.setSpan(new hi.ha(this, 2), charSequence.getSpanStart(y31VarArr[i7]), charSequence.getSpanEnd(y31VarArr[i7]), 33);
                        charSequence.removeSpan(y31VarArr[i7]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                ad adVar = (ad) this.N;
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new b00(org.telegram.ui.ActionBar.j6.f29070p7, adVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    y31[] y31VarArr2 = (y31[]) charSequence.getSpans(0, charSequence.length(), y31.class);
                    EditTextBoldCursor editTextBoldCursor = adVar.f45028y;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = adVar.f45028y.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i10 = 0; i10 < y31VarArr2.length; i10++) {
                        charSequence.setSpan(new h(4, (Object) this, str), charSequence.getSpanStart(y31VarArr2[i10]), charSequence.getSpanEnd(y31VarArr2[i10]), 33);
                        charSequence.removeSpan(y31VarArr2[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public b2(y8 y8Var, Context context, n2.o0 o0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, o0Var, e6Var);
        this.M = 1;
        this.N = y8Var;
    }

    public b2(UndoView undoView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.M = 4;
        this.N = undoView;
    }
}
