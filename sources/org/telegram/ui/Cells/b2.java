package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tz;
import org.telegram.ui.ad;
public final class b2 extends s70 {
    public final int M;
    public final Object N;

    public b2(int i3, Context context, Object obj) {
        super(context, null);
        this.M = i3;
        this.N = obj;
    }

    @Override
    public int a() {
        switch (this.M) {
            case 4:
                return ((UndoView) this.N).f31670a;
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
                        charSequence.setSpan(new tz(org.telegram.ui.ActionBar.k6.f28102p7, ((org.telegram.ui.ja) this.N).f46580e.getResourceProvider()), 0, indexOf, 33);
                    }
                    o31[] o31VarArr = (o31[]) charSequence.getSpans(0, charSequence.length(), o31.class);
                    for (int i3 = 0; i3 < o31VarArr.length; i3++) {
                        charSequence.setSpan(new gi.ka(this, 2), charSequence.getSpanStart(o31VarArr[i3]), charSequence.getSpanEnd(o31VarArr[i3]), 33);
                        charSequence.removeSpan(o31VarArr[i3]);
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
                        charSequence.setSpan(new tz(org.telegram.ui.ActionBar.k6.f28102p7, adVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    o31[] o31VarArr2 = (o31[]) charSequence.getSpans(0, charSequence.length(), o31.class);
                    EditTextBoldCursor editTextBoldCursor = adVar.f43758y;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = adVar.f43758y.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i10 = 0; i10 < o31VarArr2.length; i10++) {
                        charSequence.setSpan(new h(4, (Object) this, str), charSequence.getSpanStart(o31VarArr2[i10]), charSequence.getSpanEnd(o31VarArr2[i10]), 33);
                        charSequence.removeSpan(o31VarArr2[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public b2(y8 y8Var, Context context, m2.p0 p0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, p0Var, e6Var);
        this.M = 1;
        this.N = y8Var;
    }

    public b2(UndoView undoView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.M = 4;
        this.N = undoView;
    }
}
