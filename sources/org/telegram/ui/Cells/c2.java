package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m80;
import org.telegram.ui.ad;
public final class c2 extends m80 {
    public final int M;
    public final Object N;

    public c2(int i7, Context context, Object obj) {
        super(context, null);
        this.M = i7;
        this.N = obj;
    }

    @Override
    public int a() {
        switch (this.M) {
            case 4:
                return ((UndoView) this.N).f33208a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.M) {
            case 1:
                Integer num = ((a9) this.N).d;
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
                ((d2) this.N).f();
                return;
            case 1:
                a9 a9Var = (a9) this.N;
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
                    charSequence = org.telegram.messenger.g0.W2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new k00(org.telegram.ui.ActionBar.m6.f29602p7, ((org.telegram.ui.ka) this.N).f49265e.getResourceProvider()), 0, indexOf, 33);
                    }
                    l41[] l41VarArr = (l41[]) charSequence.getSpans(0, charSequence.length(), l41.class);
                    for (int i7 = 0; i7 < l41VarArr.length; i7++) {
                        charSequence.setSpan(new hi.ha(this, 2), charSequence.getSpanStart(l41VarArr[i7]), charSequence.getSpanEnd(l41VarArr[i7]), 33);
                        charSequence.removeSpan(l41VarArr[i7]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                ad adVar = (ad) this.N;
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.g0.W2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new k00(org.telegram.ui.ActionBar.m6.f29602p7, adVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    l41[] l41VarArr2 = (l41[]) charSequence.getSpans(0, charSequence.length(), l41.class);
                    EditTextBoldCursor editTextBoldCursor = adVar.f45608y;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = adVar.f45608y.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i10 = 0; i10 < l41VarArr2.length; i10++) {
                        charSequence.setSpan(new h(4, (Object) this, str), charSequence.getSpanStart(l41VarArr2[i10]), charSequence.getSpanEnd(l41VarArr2[i10]), 33);
                        charSequence.removeSpan(l41VarArr2[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public c2(a9 a9Var, Context context, n2.o0 o0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, o0Var, h6Var);
        this.M = 1;
        this.N = a9Var;
    }

    public c2(UndoView undoView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.M = 4;
        this.N = undoView;
    }
}
