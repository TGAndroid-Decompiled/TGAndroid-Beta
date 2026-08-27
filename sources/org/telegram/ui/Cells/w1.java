package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.id;

public final class w1 extends p80 {
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
                return ((UndoView) this.I).f26572a;
            default:
                return super.a();
        }
    }

    @Override
    public int c() {
        switch (this.H) {
            case 1:
                Integer num = ((x8) this.I).d;
                return num != null ? num.intValue() : super.c();
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
                break;
            case 1:
                x8 x8Var = (x8) this.I;
                x8Var.b();
                super.onDraw(canvas);
                x8Var.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.H) {
            case 0:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 1:
            default:
                super.setText(charSequence, bufferType);
                break;
            case 2:
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int iIndexOf = charSequence.toString().indexOf(10);
                    if (iIndexOf >= 0) {
                        charSequence.replace(iIndexOf, iIndexOf + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.ma) this.I).f40423e.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7)), 0, iIndexOf, 33);
                    }
                    k41[] k41VarArr = (k41[]) charSequence.getSpans(0, charSequence.length(), k41.class);
                    for (int i10 = 0; i10 < k41VarArr.length; i10++) {
                        charSequence.setSpan(new ag.x0(this, 3), charSequence.getSpanStart(k41VarArr[i10]), charSequence.getSpanEnd(k41VarArr[i10]), 33);
                        charSequence.removeSpan(k41VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 3:
                id idVar = (id) this.I;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int iIndexOf2 = charSequence.toString().indexOf(10);
                    if (iIndexOf2 >= 0) {
                        charSequence.replace(iIndexOf2, iIndexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(idVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7)), 0, iIndexOf2, 33);
                    }
                    k41[] k41VarArr2 = (k41[]) charSequence.getSpans(0, charSequence.length(), k41.class);
                    EditTextBoldCursor editTextBoldCursor = idVar.f39055w;
                    String string = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : idVar.f39055w.getText().toString();
                    for (int i11 = 0; i11 < k41VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, string), charSequence.getSpanStart(k41VarArr2[i11]), charSequence.getSpanEnd(k41VarArr2[i11]), 33);
                        charSequence.removeSpan(k41VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    public w1(x8 x8Var, Context context, m80 m80Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, m80Var, c6Var);
        this.H = 1;
        this.I = x8Var;
    }

    public w1(UndoView undoView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.H = 4;
        this.I = undoView;
    }
}
