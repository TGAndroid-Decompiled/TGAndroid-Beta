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
import org.telegram.messenger.AndroidUtilities;
public class yc extends aa0 {
    public final Path L;
    public final RectF M;
    public zc N;
    public zc O;

    public yc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.L = new Path();
        this.M = new RectF();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.O != null && getMeasuredWidth() > 0) {
            SpannableString spannableString = new SpannableString(" btn");
            spannableString.setSpan(this.O, 1, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.O.a()) - AndroidUtilities.dp(4.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.append((CharSequence) spannableString);
            setText(spannableStringBuilder);
            this.O = null;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        zc zcVar;
        Runnable runnable;
        zc zcVar2;
        int action = motionEvent.getAction();
        float x9 = motionEvent.getX() - getPaddingLeft();
        int y3 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null && y3 >= 0 && y3 < layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(y3);
            Spanned spanned = (Spanned) getText();
            zc[] zcVarArr = (zc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), zc.class);
            for (int i10 = 0; i10 < zcVarArr.length; i10++) {
                zcVar = zcVarArr[i10];
                int spanStart = spanned.getSpanStart(zcVar);
                int spanEnd = spanned.getSpanEnd(zcVar);
                Path path = this.L;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = this.M;
                path.computeBounds(rectF, true);
                if (rectF.contains(x9, y3)) {
                    break;
                }
            }
        }
        zcVar = null;
        if (action == 0) {
            this.N = zcVar;
            if (zcVar != null) {
                zcVar.c(this, true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (zcVar2 = this.N) != null && zcVar2 != zcVar) {
                zcVar2.c(this, false);
                this.N = null;
            }
        } else {
            zc zcVar3 = this.N;
            if (zcVar3 != null) {
                zcVar3.c(this, false);
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

    public yc(Context context) {
        super(context, null);
        this.L = new Path();
        this.M = new RectF();
    }
}
