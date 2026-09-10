package org.telegram.ui.Components;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public class yc extends m90 {
    public zc L;
    public zc M;

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
        zc zcVar;
        Runnable runnable;
        zc zcVar2;
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX() - getPaddingLeft();
        int y3 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null) {
            int lineForVertical = layout.getLineForVertical(y3);
            Spanned spanned = (Spanned) getText();
            zc[] zcVarArr = (zc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), zc.class);
            for (int i10 = 0; i10 < zcVarArr.length; i10++) {
                zcVar = zcVarArr[i10];
                float primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(zcVar));
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanned.getSpanEnd(zcVar));
                if (primaryHorizontal2 < primaryHorizontal) {
                    primaryHorizontal2 = primaryHorizontal;
                    primaryHorizontal = primaryHorizontal2;
                }
                if (x10 >= primaryHorizontal && x10 <= primaryHorizontal2) {
                    break;
                }
            }
        }
        zcVar = null;
        if (action == 0) {
            this.L = zcVar;
            if (zcVar != null) {
                zcVar.c(this, true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (zcVar2 = this.L) != null && zcVar2 != zcVar) {
                zcVar2.c(this, false);
                this.L = null;
            }
        } else {
            zc zcVar3 = this.L;
            if (zcVar3 != null) {
                zcVar3.c(this, false);
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
