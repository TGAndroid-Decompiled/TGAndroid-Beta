package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
public class ec extends p80 {
    public final Path L;
    public final RectF M;
    public fc N;
    public fc O;

    public ec(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.L = new Path();
        this.M = new RectF();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.O != null && getMeasuredWidth() > 0) {
            SpannableString spannableString = new SpannableString(" btn");
            spannableString.setSpan(this.O, 1, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.O.a()) - org.telegram.messenger.i0.L(4.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.append((CharSequence) spannableString);
            setText(spannableStringBuilder);
            this.O = null;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        fc fcVar;
        Runnable runnable;
        fc fcVar2;
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX() - getPaddingLeft();
        int y3 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null && y3 >= 0 && y3 < layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(y3);
            Spanned spanned = (Spanned) getText();
            fc[] fcVarArr = (fc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), fc.class);
            for (int i10 = 0; i10 < fcVarArr.length; i10++) {
                fcVar = fcVarArr[i10];
                int spanStart = spanned.getSpanStart(fcVar);
                int spanEnd = spanned.getSpanEnd(fcVar);
                Path path = this.L;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = this.M;
                path.computeBounds(rectF, true);
                if (rectF.contains(x10, y3)) {
                    break;
                }
            }
        }
        fcVar = null;
        if (action == 0) {
            this.N = fcVar;
            if (fcVar != null) {
                fcVar.c(this, true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (fcVar2 = this.N) != null && fcVar2 != fcVar) {
                fcVar2.c(this, false);
                this.N = null;
            }
        } else {
            fc fcVar3 = this.N;
            if (fcVar3 != null) {
                fcVar3.c(this, false);
                if (action == 1 && (runnable = this.N.d) != null) {
                    runnable.run();
                }
            }
            this.N = null;
        }
        if (this.N == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public ec(Context context) {
        super(context, null);
        this.L = new Path();
        this.M = new RectF();
    }
}
