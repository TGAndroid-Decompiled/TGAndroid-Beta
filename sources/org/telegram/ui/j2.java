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

    public final d70 f39234a;

    public final k4 f39235b;

    public final k2 f39236c;

    public j2(k2 k2Var, Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f39236c = k2Var;
        this.f39234a = d70Var;
        this.f39235b = k4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k2 k2Var = this.f39236c;
        if (k2Var.f39575c != null) {
            canvas.save();
            m4.v(this.f39234a, canvas, k2Var, 0);
            k2Var.f39575c.draw(canvas, this);
            canvas.restore();
            k2Var.f39575c.f37923s = (int) getX();
            k2Var.f39575c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int height;
        k2 k2Var = this.f39236c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = k2Var.f39577f;
        int iMax = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = k2Var.h;
            k4 k4Var = this.f39235b;
            d70 d70Var = this.f39234a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int iDp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = m4.X0;
                k2Var.h = m4.C(d70Var, k4Var.A, this, richText, richText, pageblockpreformatted, iDp);
                if (!TextUtils.isEmpty(k2Var.f39577f.language)) {
                    k2Var.h = CodeHighlighting.getHighlighted(k2Var.h, k2Var.f39577f.language);
                }
            }
            f3 f3VarQ = m4.q(d70Var, this, k2Var.h, null, AndroidUtilities.dp(5000.0f), 0, k2Var.f39577f, k4Var);
            k2Var.f39575c = f3VarQ;
            if (f3VarQ != null) {
                height = f3VarQ.d.getHeight();
                int lineCount = k2Var.f39575c.d.getLineCount();
                for (int i12 = 0; i12 < lineCount; i12++) {
                    iMax = Math.max((int) Math.ceil(k2Var.f39575c.d.getLineWidth(i12)), iMax);
                }
            } else {
                height = 0;
            }
        } else {
            height = 1;
        }
        setMeasuredDimension(AndroidUtilities.dp(32.0f) + iMax, height);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k2 k2Var = this.f39236c;
        return m4.l(this.f39234a, this.f39235b, motionEvent, k2Var, k2Var.f39575c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
