package org.telegram.ui.Components;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public class zc extends k90 {
    public ad L;
    public ad M;

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
        ad adVar;
        Runnable runnable;
        ad adVar2;
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX() - getPaddingLeft();
        int y3 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null) {
            int lineForVertical = layout.getLineForVertical(y3);
            Spanned spanned = (Spanned) getText();
            ad[] adVarArr = (ad[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), ad.class);
            for (int i10 = 0; i10 < adVarArr.length; i10++) {
                adVar = adVarArr[i10];
                float primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(adVar));
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanned.getSpanEnd(adVar));
                if (primaryHorizontal2 < primaryHorizontal) {
                    primaryHorizontal2 = primaryHorizontal;
                    primaryHorizontal = primaryHorizontal2;
                }
                if (x10 >= primaryHorizontal && x10 <= primaryHorizontal2) {
                    break;
                }
            }
        }
        adVar = null;
        if (action == 0) {
            this.L = adVar;
            if (adVar != null) {
                adVar.c(this, true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (adVar2 = this.L) != null && adVar2 != adVar) {
                adVar2.c(this, false);
                this.L = null;
            }
        } else {
            ad adVar3 = this.L;
            if (adVar3 != null) {
                adVar3.c(this, false);
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
