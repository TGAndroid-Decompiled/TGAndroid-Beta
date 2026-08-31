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
public final class h2 extends View {
    public final o70 f37307a;
    public final j4 f37308b;
    public final i2 f37309c;

    public h2(i2 i2Var, Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f37309c = i2Var;
        this.f37307a = o70Var;
        this.f37308b = j4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i2 i2Var = this.f37309c;
        if (i2Var.f37723c != null) {
            canvas.save();
            l4.v(this.f37307a, canvas, i2Var, 0);
            i2Var.f37723c.draw(canvas, this);
            canvas.restore();
            i2Var.f37723c.f35986s = (int) getX();
            i2Var.f37723c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        i2 i2Var = this.f37309c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = i2Var.f37725f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = i2Var.h;
            j4 j4Var = this.f37308b;
            o70 o70Var = this.f37307a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = l4.Y0;
                i2Var.h = l4.C(o70Var, j4Var.B, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(i2Var.f37725f.language)) {
                    i2Var.h = CodeHighlighting.getHighlighted(i2Var.h, i2Var.f37725f.language);
                }
            }
            d3 q10 = l4.q(o70Var, this, i2Var.h, null, AndroidUtilities.dp(5000.0f), 0, i2Var.f37725f, j4Var);
            i2Var.f37723c = q10;
            if (q10 != null) {
                i12 = q10.d.getHeight();
                int lineCount = i2Var.f37723c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(i2Var.f37723c.d.getLineWidth(i14)), i13);
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
        i2 i2Var = this.f37309c;
        if (!l4.l(this.f37307a, this.f37308b, motionEvent, i2Var, i2Var.f37723c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
