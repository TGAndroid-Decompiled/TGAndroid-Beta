package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.y80;
import org.telegram.ui.hd;
public final class w1 extends y80 {
    public final int H;
    public final Object I;

    public w1(Object obj, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = obj;
    }

    @Override
    public int a() {
        switch (this.H) {
            case 4:
                return ((UndoView) this.I).f26587a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.H) {
            case 1:
                Integer num = ((y8) this.I).d;
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
                ((y1) this.I).f();
                return;
            case 1:
                y8 y8Var = (y8) this.I;
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.ka) this.I).f39819e.getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7)), 0, indexOf, 33);
                    }
                    t41[] t41VarArr = (t41[]) charSequence.getSpans(0, charSequence.length(), t41.class);
                    for (int i10 = 0; i10 < t41VarArr.length; i10++) {
                        charSequence.setSpan(new cg.l0(this, 3), charSequence.getSpanStart(t41VarArr[i10]), charSequence.getSpanEnd(t41VarArr[i10]), 33);
                        charSequence.removeSpan(t41VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                hd hdVar = (hd) this.I;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7)), 0, indexOf2, 33);
                    }
                    t41[] t41VarArr2 = (t41[]) charSequence.getSpans(0, charSequence.length(), t41.class);
                    EditTextBoldCursor editTextBoldCursor = hdVar.f38875w;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = hdVar.f38875w.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i11 = 0; i11 < t41VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, str), charSequence.getSpanStart(t41VarArr2[i11]), charSequence.getSpanEnd(t41VarArr2[i11]), 33);
                        charSequence.removeSpan(t41VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public w1(y8 y8Var, Context context, v80 v80Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, v80Var, c6Var);
        this.H = 1;
        this.I = y8Var;
    }

    public w1(UndoView undoView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.H = 4;
        this.I = undoView;
    }
}
