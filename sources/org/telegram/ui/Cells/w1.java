package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import fi.hb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.z90;
import org.telegram.ui.nd;
public final class w1 extends z90 {
    public final int L;
    public final Object M;

    public w1(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).f26346a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((i9) this.M).d;
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
                ((y1) this.M).f();
                return;
            case 1:
                i9 i9Var = (i9) this.M;
                i9Var.b();
                super.onDraw(canvas);
                i9Var.a();
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
                        charSequence.setSpan(new p10(org.telegram.ui.ActionBar.y6.f23579p7, ((org.telegram.ui.sa) this.M).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    q61[] q61VarArr = (q61[]) charSequence.getSpans(0, charSequence.length(), q61.class);
                    for (int i10 = 0; i10 < q61VarArr.length; i10++) {
                        charSequence.setSpan(new hb(this, 2), charSequence.getSpanStart(q61VarArr[i10]), charSequence.getSpanEnd(q61VarArr[i10]), 33);
                        charSequence.removeSpan(q61VarArr[i10]);
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
                        charSequence.setSpan(new p10(org.telegram.ui.ActionBar.y6.f23579p7, ndVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    q61[] q61VarArr2 = (q61[]) charSequence.getSpans(0, charSequence.length(), q61.class);
                    EditTextBoldCursor editTextBoldCursor = ndVar.f41869x;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = ndVar.f41869x.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i11 = 0; i11 < q61VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, str), charSequence.getSpanStart(q61VarArr2[i11]), charSequence.getSpanEnd(q61VarArr2[i11]), 33);
                        charSequence.removeSpan(q61VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public w1(i9 i9Var, Context context, w90 w90Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, w90Var, u6Var);
        this.L = 1;
        this.M = i9Var;
    }

    public w1(UndoView undoView, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.L = 4;
        this.M = undoView;
    }
}
