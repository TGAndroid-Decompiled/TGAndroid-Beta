package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import ei.kb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.w90;
import org.telegram.ui.md;
public final class x1 extends w90 {
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
                return ((UndoView) this.M).f24556a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((e9) this.M).d;
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
                e9 e9Var = (e9) this.M;
                e9Var.b();
                super.onDraw(canvas);
                e9Var.a();
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
                        charSequence.setSpan(new k10(org.telegram.ui.ActionBar.k6.f21405p7, ((org.telegram.ui.ra) this.M).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    i61[] i61VarArr = (i61[]) charSequence.getSpans(0, charSequence.length(), i61.class);
                    for (int i10 = 0; i10 < i61VarArr.length; i10++) {
                        charSequence.setSpan(new kb(this, 2), charSequence.getSpanStart(i61VarArr[i10]), charSequence.getSpanEnd(i61VarArr[i10]), 33);
                        charSequence.removeSpan(i61VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                md mdVar = (md) this.M;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new k10(org.telegram.ui.ActionBar.k6.f21405p7, mdVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    i61[] i61VarArr2 = (i61[]) charSequence.getSpans(0, charSequence.length(), i61.class);
                    EditTextBoldCursor editTextBoldCursor = mdVar.f39564x;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = mdVar.f39564x.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i11 = 0; i11 < i61VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, str), charSequence.getSpanStart(i61VarArr2[i11]), charSequence.getSpanEnd(i61VarArr2[i11]), 33);
                        charSequence.removeSpan(i61VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public x1(e9 e9Var, Context context, t90 t90Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, t90Var, g6Var);
        this.L = 1;
        this.M = e9Var;
    }

    public x1(UndoView undoView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.L = 4;
        this.M = undoView;
    }
}
