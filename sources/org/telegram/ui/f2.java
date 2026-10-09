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
    public final t70 f37423a;
    public final g4 f37424b;
    public final g2 f37425c;

    public f2(g2 g2Var, Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f37425c = g2Var;
        this.f37423a = t70Var;
        this.f37424b = g4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g2 g2Var = this.f37425c;
        if (g2Var.f37751c != null) {
            canvas.save();
            i4.v(this.f37423a, canvas, g2Var, 0);
            g2Var.f37751c.draw(canvas, this);
            canvas.restore();
            g2Var.f37751c.f36115s = (int) getX();
            g2Var.f37751c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        g2 g2Var = this.f37425c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = g2Var.f37753f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = g2Var.h;
            g4 g4Var = this.f37424b;
            t70 t70Var = this.f37423a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = i4.f38469b1;
                g2Var.h = i4.C(t70Var, g4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(g2Var.f37753f.language)) {
                    g2Var.h = CodeHighlighting.getHighlighted(g2Var.h, g2Var.f37753f.language);
                }
            }
            b3 q6 = i4.q(t70Var, this, g2Var.h, null, AndroidUtilities.dp(5000.0f), 0, g2Var.f37753f, g4Var);
            g2Var.f37751c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = g2Var.f37751c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(g2Var.f37751c.d.getLineWidth(i14)), i13);
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
        g2 g2Var = this.f37425c;
        if (!i4.l(this.f37423a, this.f37424b, motionEvent, g2Var, g2Var.f37751c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
