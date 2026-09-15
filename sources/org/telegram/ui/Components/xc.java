package org.telegram.ui.Components;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public class xc extends c90 {
    public yc L;
    public yc M;

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.M != null && getMeasuredWidth() > 0) {
            SpannableString spannableString = new SpannableString(" btn");
            spannableString.setSpan(this.M, 1, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.M.a()) - AndroidUtilities.dp(4.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.append((CharSequence) spannableString);
            setText(spannableStringBuilder);
            this.M = null;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        yc ycVar;
        Runnable runnable;
        yc ycVar2;
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX() - getPaddingLeft();
        int y3 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null) {
            int lineForVertical = layout.getLineForVertical(y3);
            Spanned spanned = (Spanned) getText();
            yc[] ycVarArr = (yc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), yc.class);
            for (int i10 = 0; i10 < ycVarArr.length; i10++) {
                ycVar = ycVarArr[i10];
                float primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(ycVar));
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanned.getSpanEnd(ycVar));
                if (primaryHorizontal2 < primaryHorizontal) {
                    primaryHorizontal2 = primaryHorizontal;
                    primaryHorizontal = primaryHorizontal2;
                }
                if (x10 >= primaryHorizontal && x10 <= primaryHorizontal2) {
                    break;
                }
            }
        }
        ycVar = null;
        if (action == 0) {
            this.L = ycVar;
            if (ycVar != null) {
                ycVar.c(this, true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (ycVar2 = this.L) != null && ycVar2 != ycVar) {
                ycVar2.c(this, false);
                this.L = null;
            }
        } else {
            yc ycVar3 = this.L;
            if (ycVar3 != null) {
                ycVar3.c(this, false);
                if (action == 1 && (runnable = this.L.d) != null) {
                    runnable.run();
                }
            }
            this.L = null;
        }
        if (this.L == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
