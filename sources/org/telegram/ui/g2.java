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
public final class g2 extends View {
    public final t70 f32972a;
    public final h4 f32973b;
    public final h2 f32974c;

    public g2(h2 h2Var, Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.f32974c = h2Var;
        this.f32972a = t70Var;
        this.f32973b = h4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h2 h2Var = this.f32974c;
        if (h2Var.f33246c != null) {
            canvas.save();
            j4.v(this.f32972a, canvas, h2Var, 0);
            h2Var.f33246c.draw(canvas, this);
            canvas.restore();
            h2Var.f33246c.f31515s = (int) getX();
            h2Var.f33246c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        h2 h2Var = this.f32974c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = h2Var.f33247f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = h2Var.h;
            h4 h4Var = this.f32973b;
            t70 t70Var = this.f32972a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = j4.f33876b1;
                h2Var.h = j4.C(t70Var, h4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(h2Var.f33247f.language)) {
                    h2Var.h = CodeHighlighting.getHighlighted(h2Var.h, h2Var.f33247f.language);
                }
            }
            c3 q6 = j4.q(t70Var, this, h2Var.h, null, AndroidUtilities.dp(5000.0f), 0, h2Var.f33247f, h4Var);
            h2Var.f33246c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = h2Var.f33246c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(h2Var.f33246c.d.getLineWidth(i14)), i13);
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
        h2 h2Var = this.f32974c;
        if (!j4.l(this.f32972a, this.f32973b, motionEvent, h2Var, h2Var.f33246c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
