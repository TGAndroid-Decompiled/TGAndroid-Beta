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
    public final p70 f33502a;
    public final g4 f33503b;
    public final g2 f33504c;

    public f2(g2 g2Var, Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f33504c = g2Var;
        this.f33502a = p70Var;
        this.f33503b = g4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g2 g2Var = this.f33504c;
        if (g2Var.f33786c != null) {
            canvas.save();
            i4.v(this.f33502a, canvas, g2Var, 0);
            g2Var.f33786c.draw(canvas, this);
            canvas.restore();
            g2Var.f33786c.f32291s = (int) getX();
            g2Var.f33786c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        g2 g2Var = this.f33504c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = g2Var.f33787f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = g2Var.h;
            g4 g4Var = this.f33503b;
            p70 p70Var = this.f33502a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = i4.f34350b1;
                g2Var.h = i4.C(p70Var, g4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(g2Var.f33787f.language)) {
                    g2Var.h = CodeHighlighting.getHighlighted(g2Var.h, g2Var.f33787f.language);
                }
            }
            b3 q6 = i4.q(p70Var, this, g2Var.h, null, AndroidUtilities.dp(5000.0f), 0, g2Var.f33787f, g4Var);
            g2Var.f33786c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = g2Var.f33786c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(g2Var.f33786c.d.getLineWidth(i14)), i13);
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
        g2 g2Var = this.f33504c;
        if (!i4.l(this.f33502a, this.f33503b, motionEvent, g2Var, g2Var.f33786c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
