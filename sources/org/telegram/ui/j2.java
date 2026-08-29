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
public final class j2 extends View {
    public final d70 f39407a;
    public final k4 f39408b;
    public final k2 f39409c;

    public j2(k2 k2Var, Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f39409c = k2Var;
        this.f39407a = d70Var;
        this.f39408b = k4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k2 k2Var = this.f39409c;
        if (k2Var.f39731c != null) {
            canvas.save();
            m4.v(this.f39407a, canvas, k2Var, 0);
            k2Var.f39731c.draw(canvas, this);
            canvas.restore();
            k2Var.f39731c.f37974s = (int) getX();
            k2Var.f39731c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        k2 k2Var = this.f39409c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = k2Var.f39733f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = k2Var.h;
            k4 k4Var = this.f39408b;
            d70 d70Var = this.f39407a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = m4.X0;
                k2Var.h = m4.C(d70Var, k4Var.A, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(k2Var.f39733f.language)) {
                    k2Var.h = CodeHighlighting.getHighlighted(k2Var.h, k2Var.f39733f.language);
                }
            }
            f3 q6 = m4.q(d70Var, this, k2Var.h, null, AndroidUtilities.dp(5000.0f), 0, k2Var.f39733f, k4Var);
            k2Var.f39731c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = k2Var.f39731c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(k2Var.f39731c.d.getLineWidth(i14)), i13);
                }
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(AndroidUtilities.dp(32.0f) + i13, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k2 k2Var = this.f39409c;
        if (!m4.l(this.f39407a, this.f39408b, motionEvent, k2Var, k2Var.f39731c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
