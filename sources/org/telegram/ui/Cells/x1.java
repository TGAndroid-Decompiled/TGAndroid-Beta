package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import kh.lb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.id;
public final class x1 extends l80 {
    public final int H;
    public final Object I;

    public x1(Object obj, Context context, int i9) {
        super(context, null);
        this.H = i9;
        this.I = obj;
    }

    @Override
    public int a() {
        switch (this.H) {
            case 4:
                return ((UndoView) this.I).f26576a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.H) {
            case 1:
                Integer num = ((b9) this.I).d;
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
        switch (this.H) {
            case 0:
                super.onDraw(canvas);
                ((z1) this.I).f();
                return;
            case 1:
                b9 b9Var = (b9) this.I;
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
        switch (this.H) {
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.la) this.I).f40092e.getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7)), 0, indexOf, 33);
                    }
                    i41[] i41VarArr = (i41[]) charSequence.getSpans(0, charSequence.length(), i41.class);
                    for (int i9 = 0; i9 < i41VarArr.length; i9++) {
                        charSequence.setSpan(new lb(this, 1), charSequence.getSpanStart(i41VarArr[i9]), charSequence.getSpanEnd(i41VarArr[i9]), 33);
                        charSequence.removeSpan(i41VarArr[i9]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                id idVar = (id) this.I;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(idVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7)), 0, indexOf2, 33);
                    }
                    i41[] i41VarArr2 = (i41[]) charSequence.getSpans(0, charSequence.length(), i41.class);
                    EditTextBoldCursor editTextBoldCursor = idVar.f39127w;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = idVar.f39127w.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i10 = 0; i10 < i41VarArr2.length; i10++) {
                        charSequence.setSpan(new i(4, (Object) this, str), charSequence.getSpanStart(i41VarArr2[i10]), charSequence.getSpanEnd(i41VarArr2[i10]), 33);
                        charSequence.removeSpan(i41VarArr2[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public x1(b9 b9Var, Context context, i80 i80Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i80Var, b6Var);
        this.H = 1;
        this.I = b9Var;
    }

    public x1(UndoView undoView, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.H = 4;
        this.I = undoView;
    }
}
