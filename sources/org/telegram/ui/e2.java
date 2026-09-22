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
public final class e2 extends View {
    public final u70 f33220a;
    public final f4 f33221b;
    public final f2 f33222c;

    public e2(f2 f2Var, Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f33222c = f2Var;
        this.f33220a = u70Var;
        this.f33221b = f4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f2 f2Var = this.f33222c;
        if (f2Var.f33474c != null) {
            canvas.save();
            h4.v(this.f33220a, canvas, f2Var, 0);
            f2Var.f33474c.draw(canvas, this);
            canvas.restore();
            f2Var.f33474c.f31996s = (int) getX();
            f2Var.f33474c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        f2 f2Var = this.f33222c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = f2Var.f33475f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = f2Var.h;
            f4 f4Var = this.f33221b;
            u70 u70Var = this.f33220a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = h4.f34086b1;
                f2Var.h = h4.C(u70Var, f4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(f2Var.f33475f.language)) {
                    f2Var.h = CodeHighlighting.getHighlighted(f2Var.h, f2Var.f33475f.language);
                }
            }
            a3 q6 = h4.q(u70Var, this, f2Var.h, null, AndroidUtilities.dp(5000.0f), 0, f2Var.f33475f, f4Var);
            f2Var.f33474c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = f2Var.f33474c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(f2Var.f33474c.d.getLineWidth(i14)), i13);
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
        f2 f2Var = this.f33222c;
        if (!h4.l(this.f33220a, this.f33221b, motionEvent, f2Var, f2Var.f33474c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
