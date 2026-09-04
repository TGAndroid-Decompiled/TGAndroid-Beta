package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import di.ec;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e51;
import org.telegram.ui.md;
public final class x1 extends d90 {
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
                return ((UndoView) this.M).f24182a;
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.pa) this.M).f39452e.getThemedColor(org.telegram.ui.ActionBar.j6.f20880p7)), 0, indexOf, 33);
                    }
                    e51[] e51VarArr = (e51[]) charSequence.getSpans(0, charSequence.length(), e51.class);
                    for (int i10 = 0; i10 < e51VarArr.length; i10++) {
                        charSequence.setSpan(new ec(this, 2), charSequence.getSpanStart(e51VarArr[i10]), charSequence.getSpanEnd(e51VarArr[i10]), 33);
                        charSequence.removeSpan(e51VarArr[i10]);
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
                        charSequence.setSpan(new ForegroundColorSpan(mdVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20880p7)), 0, indexOf2, 33);
                    }
                    e51[] e51VarArr2 = (e51[]) charSequence.getSpans(0, charSequence.length(), e51.class);
                    EditTextBoldCursor editTextBoldCursor = mdVar.f38662w;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = mdVar.f38662w.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i11 = 0; i11 < e51VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, str), charSequence.getSpanStart(e51VarArr2[i11]), charSequence.getSpanEnd(e51VarArr2[i11]), 33);
                        charSequence.removeSpan(e51VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public x1(e9 e9Var, Context context, a90 a90Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, a90Var, f6Var);
        this.L = 1;
        this.M = e9Var;
    }

    public x1(UndoView undoView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.L = 4;
        this.M = undoView;
    }
}
