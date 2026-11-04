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
public class hc extends s70 {
    public final Path M;
    public final RectF N;
    public ic O;
    public ic P;

    public hc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.M = new Path();
        this.N = new RectF();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
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
        ic icVar;
        Runnable runnable;
        ic icVar2;
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX() - getPaddingLeft();
        int y9 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null && y9 >= 0 && y9 < layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(y9);
            Spanned spanned = (Spanned) getText();
            ic[] icVarArr = (ic[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), ic.class);
            for (int i3 = 0; i3 < icVarArr.length; i3++) {
                icVar = icVarArr[i3];
                int spanStart = spanned.getSpanStart(icVar);
                int spanEnd = spanned.getSpanEnd(icVar);
                Path path = this.M;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = this.N;
                path.computeBounds(rectF, true);
                if (rectF.contains(x10, y9)) {
                    break;
                }
            }
        }
        icVar = null;
        if (action == 0) {
            this.O = icVar;
            if (icVar != null) {
                icVar.c(this, true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (icVar2 = this.O) != null && icVar2 != icVar) {
                icVar2.c(this, false);
                this.O = null;
            }
        } else {
            ic icVar3 = this.O;
            if (icVar3 != null) {
                icVar3.c(this, false);
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

    public hc(Context context) {
        super(context, null);
        this.M = new Path();
        this.N = new RectF();
    }
}
