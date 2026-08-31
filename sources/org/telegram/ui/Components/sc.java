package org.telegram.ui.Components;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public class sc extends g90 {
    public tc I;
    public tc J;

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.J != null && getMeasuredWidth() > 0) {
            SpannableString spannableString = new SpannableString(" btn");
            spannableString.setSpan(this.J, 1, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.J.a()) - AndroidUtilities.dp(4.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.append((CharSequence) spannableString);
            setText(spannableStringBuilder);
            this.J = null;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        tc tcVar;
        Runnable runnable;
        tc tcVar2;
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX() - getPaddingLeft();
        int y10 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null) {
            int lineForVertical = layout.getLineForVertical(y10);
            Spanned spanned = (Spanned) getText();
            tc[] tcVarArr = (tc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), tc.class);
            for (int i10 = 0; i10 < tcVarArr.length; i10++) {
                tcVar = tcVarArr[i10];
                float primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(tcVar));
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanned.getSpanEnd(tcVar));
                if (primaryHorizontal2 < primaryHorizontal) {
                    primaryHorizontal2 = primaryHorizontal;
                    primaryHorizontal = primaryHorizontal2;
                }
                if (x10 >= primaryHorizontal && x10 <= primaryHorizontal2) {
                    break;
                }
            }
        }
        tcVar = null;
        if (action == 0) {
            this.I = tcVar;
            if (tcVar != null) {
                tcVar.c(this, true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (tcVar2 = this.I) != null && tcVar2 != tcVar) {
                tcVar2.c(this, false);
                this.I = null;
            }
        } else {
            tc tcVar3 = this.I;
            if (tcVar3 != null) {
                tcVar3.c(this, false);
                if (action == 1 && (runnable = this.I.d) != null) {
                    runnable.run();
                }
            }
            this.I = null;
        }
        if (this.I == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
