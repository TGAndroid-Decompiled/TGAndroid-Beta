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
public class ec extends z70 {
    public final Path M;
    public final RectF N;
    public fc O;
    public fc P;

    public ec(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.M = new Path();
        this.N = new RectF();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.P != null && getMeasuredWidth() > 0) {
            SpannableString spannableString = new SpannableString(" btn");
            spannableString.setSpan(this.P, 1, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.P.a()) - org.telegram.messenger.g0.L(4.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.append((CharSequence) spannableString);
            setText(spannableStringBuilder);
            this.P = null;
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
        int y10 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null && y10 >= 0 && y10 < layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(y10);
            Spanned spanned = (Spanned) getText();
            fc[] fcVarArr = (fc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), fc.class);
            for (int i7 = 0; i7 < fcVarArr.length; i7++) {
                fcVar = fcVarArr[i7];
                int spanStart = spanned.getSpanStart(fcVar);
                int spanEnd = spanned.getSpanEnd(fcVar);
                Path path = this.M;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = this.N;
                path.computeBounds(rectF, true);
                if (rectF.contains(x10, y10)) {
                    break;
                }
            }
        }
        fcVar = null;
        if (action == 0) {
            this.O = fcVar;
            if (fcVar != null) {
                fcVar.c(this, true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (fcVar2 = this.O) != null && fcVar2 != fcVar) {
                fcVar2.c(this, false);
                this.O = null;
            }
        } else {
            fc fcVar3 = this.O;
            if (fcVar3 != null) {
                fcVar3.c(this, false);
                if (action == 1 && (runnable = this.O.d) != null) {
                    runnable.run();
                }
            }
            this.O = null;
        }
        if (this.O == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public ec(Context context) {
        super(context, null);
        this.M = new Path();
        this.N = new RectF();
    }
}
