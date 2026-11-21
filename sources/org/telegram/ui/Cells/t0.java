package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
public final class t0 {
    public TextPaint f31825a;
    public float f31826b;
    public final ArrayList f31827c;
    public int d;
    public float f31828e;
    public Object f31829f;
    public final Object f31830g;
    public Object h;
    public final Object f31831i;

    public t0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31825a = textPaint;
        this.f31826b = 1.0f;
        this.f31829f = new HashMap();
        this.f31830g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f31831i = paint;
        this.f31827c = new ArrayList();
        this.f31828e = 1000.0f / org.telegram.messenger.g0.f24147r;
        this.d = 25;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(-1);
        int o4 = bz.o();
        if (o4 == 0) {
            this.f31826b = 0.25f;
        } else if (o4 != 1) {
            this.f31826b = 0.75f;
        } else {
            this.f31826b = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.f31826b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i7) {
        v0 v0Var;
        this.f31825a = textPaint;
        this.d = i7;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f31829f = staticLayout;
        v0 v0Var2 = (v0) this.f31831i;
        fj fjVar = v0Var2.Q0;
        ArrayList arrayList = this.f31827c;
        if (fjVar != null && fjVar.N0) {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        } else {
            v0Var = v0Var2;
            xh.f.b(v0Var, staticLayout, -1, i7, null, arrayList);
        }
        this.h = org.telegram.ui.Components.y5.update(0, (View) v0Var, false, (org.telegram.ui.Components.u5) this.h, (StaticLayout) this.f31829f);
    }

    public t0(v0 v0Var) {
        this.f31831i = v0Var;
        this.f31827c = new ArrayList();
        this.f31830g = new AtomicReference();
    }
}
