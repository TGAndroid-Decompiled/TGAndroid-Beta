package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class i2 extends View {
    public final a70 f38988a;
    public final j4 f38989b;
    public final j2 f38990c;

    public i2(j2 j2Var, Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f38990c = j2Var;
        this.f38988a = a70Var;
        this.f38989b = j4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        j2 j2Var = this.f38990c;
        if (j2Var.f39343c != null) {
            canvas.save();
            l4.v(this.f38988a, canvas, j2Var, 0);
            j2Var.f39343c.draw(canvas, this);
            canvas.restore();
            j2Var.f39343c.f37805s = (int) getX();
            j2Var.f39343c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        j2 j2Var = this.f38990c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = j2Var.f39345f;
        int i12 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = j2Var.h;
            j4 j4Var = this.f38989b;
            a70 a70Var = this.f38988a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = l4.X0;
                j2Var.h = l4.C(a70Var, j4Var.A, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(j2Var.f39345f.language)) {
                    j2Var.h = CodeHighlighting.getHighlighted(j2Var.h, j2Var.f39345f.language);
                }
            }
            e3 q10 = l4.q(a70Var, this, j2Var.h, null, AndroidUtilities.dp(5000.0f), 0, j2Var.f39345f, j4Var);
            j2Var.f39343c = q10;
            if (q10 != null) {
                i11 = q10.d.getHeight();
                int lineCount = j2Var.f39343c.d.getLineCount();
                for (int i13 = 0; i13 < lineCount; i13++) {
                    i12 = Math.max((int) Math.ceil(j2Var.f39343c.d.getLineWidth(i13)), i12);
                }
            } else {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(AndroidUtilities.dp(32.0f) + i12, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j2 j2Var = this.f38990c;
        if (!l4.l(this.f38988a, this.f38989b, motionEvent, j2Var, j2Var.f39343c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
