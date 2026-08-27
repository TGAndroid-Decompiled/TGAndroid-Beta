package org.telegram.ui.Components;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

public class oc extends p80 {
    public pc H;
    public pc I;

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.I == null || getMeasuredWidth() <= 0) {
            return;
        }
        SpannableString spannableString = new SpannableString(" btn");
        spannableString.setSpan(this.I, 1, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.I.a()) - AndroidUtilities.dp(4.0f), TextUtils.TruncateAt.END));
        spannableStringBuilder.append((CharSequence) spannableString);
        setText(spannableStringBuilder);
        this.I = null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        pc pcVar;
        Runnable runnable;
        pc pcVar2;
        int action = motionEvent.getAction();
        float x8 = motionEvent.getX() - getPaddingLeft();
        int y10 = ((int) motionEvent.getY()) - getPaddingTop();
        if (!(getText() instanceof Spanned) || (layout = getLayout()) == null) {
            pcVar = null;
            break;
        }
        int lineForVertical = layout.getLineForVertical(y10);
        Spanned spanned = (Spanned) getText();
        pc[] pcVarArr = (pc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), pc.class);
        int i10 = 0;
        while (true) {
            if (i10 >= pcVarArr.length) {
                pcVar = null;
                break;
            }
            pcVar = pcVarArr[i10];
            float primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(pcVar));
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanned.getSpanEnd(pcVar));
            if (primaryHorizontal2 < primaryHorizontal) {
                primaryHorizontal2 = primaryHorizontal;
                primaryHorizontal = primaryHorizontal2;
            }
            if (x8 >= primaryHorizontal && x8 <= primaryHorizontal2) {
                break;
            }
            i10++;
        }
        if (action == 0) {
            this.H = pcVar;
            if (pcVar != null) {
                pcVar.c(this, true);
                return true;
            }
        } else if (action == 1 || action == 3) {
            pc pcVar3 = this.H;
            if (pcVar3 != null) {
                pcVar3.c(this, false);
                if (action == 1 && (runnable = this.H.d) != null) {
                    runnable.run();
                }
            }
            this.H = null;
        } else if (action == 2 && (pcVar2 = this.H) != null && pcVar2 != pcVar) {
            pcVar2.c(this, false);
            this.H = null;
        }
        return this.H != null || super.onTouchEvent(motionEvent);
    }
}
