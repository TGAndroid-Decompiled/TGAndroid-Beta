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
    public final v70 f36261a;
    public final g4 f36262b;
    public final g2 f36263c;

    public f2(g2 g2Var, Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f36263c = g2Var;
        this.f36261a = v70Var;
        this.f36262b = g4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g2 g2Var = this.f36263c;
        if (g2Var.f36555c != null) {
            canvas.save();
            i4.v(this.f36261a, canvas, g2Var, 0);
            g2Var.f36555c.draw(canvas, this);
            canvas.restore();
            g2Var.f36555c.f34644s = (int) getX();
            g2Var.f36555c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        g2 g2Var = this.f36263c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = g2Var.f36557f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = g2Var.h;
            g4 g4Var = this.f36262b;
            v70 v70Var = this.f36261a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = i4.f37215b1;
                g2Var.h = i4.C(v70Var, g4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(g2Var.f36557f.language)) {
                    g2Var.h = CodeHighlighting.getHighlighted(g2Var.h, g2Var.f36557f.language);
                }
            }
            b3 q6 = i4.q(v70Var, this, g2Var.h, null, AndroidUtilities.dp(5000.0f), 0, g2Var.f36557f, g4Var);
            g2Var.f36555c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = g2Var.f36555c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(g2Var.f36555c.d.getLineWidth(i14)), i13);
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
        g2 g2Var = this.f36263c;
        if (!i4.l(this.f36261a, this.f36262b, motionEvent, g2Var, g2Var.f36555c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
