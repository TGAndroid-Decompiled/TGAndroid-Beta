package org.telegram.ui.Components;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public class vc extends y80 {
    public wc H;
    public wc I;

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.I != null && getMeasuredWidth() > 0) {
            SpannableString spannableString = new SpannableString(" btn");
            spannableString.setSpan(this.I, 1, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.I.a()) - AndroidUtilities.dp(4.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.append((CharSequence) spannableString);
            setText(spannableStringBuilder);
            this.I = null;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        wc wcVar;
        Runnable runnable;
        wc wcVar2;
        int action = motionEvent.getAction();
        float x4 = motionEvent.getX() - getPaddingLeft();
        int y8 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null) {
            int lineForVertical = layout.getLineForVertical(y8);
            Spanned spanned = (Spanned) getText();
            wc[] wcVarArr = (wc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), wc.class);
            for (int i10 = 0; i10 < wcVarArr.length; i10++) {
                wcVar = wcVarArr[i10];
                float primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(wcVar));
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanned.getSpanEnd(wcVar));
                if (primaryHorizontal2 < primaryHorizontal) {
                    primaryHorizontal2 = primaryHorizontal;
                    primaryHorizontal = primaryHorizontal2;
                }
                if (x4 >= primaryHorizontal && x4 <= primaryHorizontal2) {
                    break;
                }
            }
        }
        wcVar = null;
        if (action == 0) {
            this.H = wcVar;
            if (wcVar != null) {
                wcVar.c(this, true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (wcVar2 = this.H) != null && wcVar2 != wcVar) {
                wcVar2.c(this, false);
                this.H = null;
            }
        } else {
            wc wcVar3 = this.H;
            if (wcVar3 != null) {
                wcVar3.c(this, false);
                if (action == 1 && (runnable = this.H.d) != null) {
                    runnable.run();
                }
            }
            this.H = null;
        }
        if (this.H == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
