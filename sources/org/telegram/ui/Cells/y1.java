package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import ci.ac;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.s51;
import org.telegram.ui.ld;
public final class y1 extends n90 {
    public final int L;
    public final Object M;

    public y1(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).f22437a;
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
                ((a2) this.M).f();
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.pa) this.M).e.getThemedColor(org.telegram.ui.ActionBar.h6.f19265p7)), 0, indexOf, 33);
                    }
                    s51[] s51VarArr = (s51[]) charSequence.getSpans(0, charSequence.length(), s51.class);
                    for (int i10 = 0; i10 < s51VarArr.length; i10++) {
                        charSequence.setSpan(new ac(this, 2), charSequence.getSpanStart(s51VarArr[i10]), charSequence.getSpanEnd(s51VarArr[i10]), 33);
                        charSequence.removeSpan(s51VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 3:
                ld ldVar = (ld) this.M;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(ldVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19265p7)), 0, indexOf2, 33);
                    }
                    s51[] s51VarArr2 = (s51[]) charSequence.getSpans(0, charSequence.length(), s51.class);
                    EditTextBoldCursor editTextBoldCursor = ldVar.f35295w;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = ldVar.f35295w.getText().toString();
                    } else {
                        str = "";
                    }
                    for (int i11 = 0; i11 < s51VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, str), charSequence.getSpanStart(s51VarArr2[i11]), charSequence.getSpanEnd(s51VarArr2[i11]), 33);
                        charSequence.removeSpan(s51VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public y1(e9 e9Var, Context context, k90 k90Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, k90Var, d6Var);
        this.L = 1;
        this.M = e9Var;
    }

    public y1(UndoView undoView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.L = 4;
        this.M = undoView;
    }
}
