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
public final class f2 extends View {
    public final p70 f33516a;
    public final g4 f33517b;
    public final g2 f33518c;

    public f2(g2 g2Var, Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f33518c = g2Var;
        this.f33516a = p70Var;
        this.f33517b = g4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g2 g2Var = this.f33518c;
        if (g2Var.f33800c != null) {
            canvas.save();
            i4.v(this.f33516a, canvas, g2Var, 0);
            g2Var.f33800c.draw(canvas, this);
            canvas.restore();
            g2Var.f33800c.f32303s = (int) getX();
            g2Var.f33800c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        g2 g2Var = this.f33518c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = g2Var.f33801f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = g2Var.h;
            g4 g4Var = this.f33517b;
            p70 p70Var = this.f33516a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = i4.f34362b1;
                g2Var.h = i4.C(p70Var, g4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(g2Var.f33801f.language)) {
                    g2Var.h = CodeHighlighting.getHighlighted(g2Var.h, g2Var.f33801f.language);
                }
            }
            b3 q6 = i4.q(p70Var, this, g2Var.h, null, AndroidUtilities.dp(5000.0f), 0, g2Var.f33801f, g4Var);
            g2Var.f33800c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = g2Var.f33800c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(g2Var.f33800c.d.getLineWidth(i14)), i13);
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
        g2 g2Var = this.f33518c;
        if (!i4.l(this.f33516a, this.f33517b, motionEvent, g2Var, g2Var.f33800c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
