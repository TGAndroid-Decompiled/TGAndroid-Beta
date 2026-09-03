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
    public final p70 f35065a;
    public final l4 f35066b;
    public final k2 f35067c;

    public j2(k2 k2Var, Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f35067c = k2Var;
        this.f35065a = p70Var;
        this.f35066b = l4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k2 k2Var = this.f35067c;
        if (k2Var.f35406c != null) {
            canvas.save();
            n4.v(this.f35065a, canvas, k2Var, 0);
            k2Var.f35406c.draw(canvas, this);
            canvas.restore();
            k2Var.f35406c.f33933s = (int) getX();
            k2Var.f35406c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        k2 k2Var = this.f35067c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = k2Var.f35407f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = k2Var.h;
            l4 l4Var = this.f35066b;
            p70 p70Var = this.f35065a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = n4.Y0;
                k2Var.h = n4.C(p70Var, l4Var.B, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(k2Var.f35407f.language)) {
                    k2Var.h = CodeHighlighting.getHighlighted(k2Var.h, k2Var.f35407f.language);
                }
            }
            f3 q10 = n4.q(p70Var, this, k2Var.h, null, AndroidUtilities.dp(5000.0f), 0, k2Var.f35407f, l4Var);
            k2Var.f35406c = q10;
            if (q10 != null) {
                i12 = q10.d.getHeight();
                int lineCount = k2Var.f35406c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(k2Var.f35406c.d.getLineWidth(i14)), i13);
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
        k2 k2Var = this.f35067c;
        if (!n4.l(this.f35065a, this.f35066b, motionEvent, k2Var, k2Var.f35406c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
