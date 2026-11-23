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
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
public final class t0 {
    public TextPaint f31794a;
    public float f31795b;
    public final ArrayList f31796c;
    public int d;
    public float f31797e;
    public Object f31798f;
    public final Object f31799g;
    public Object h;
    public final Object f31800i;

    public t0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31794a = textPaint;
        this.f31795b = 1.0f;
        this.f31798f = new HashMap();
        this.f31799g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f31800i = paint;
        this.f31796c = new ArrayList();
        this.f31797e = 1000.0f / org.telegram.messenger.g0.f24011r;
        this.d = 25;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(-1);
        int o4 = cz.o();
        if (o4 == 0) {
            this.f31795b = 0.25f;
        } else if (o4 != 1) {
            this.f31795b = 0.75f;
        } else {
            this.f31795b = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.f31795b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i7) {
        v0 v0Var;
        this.f31794a = textPaint;
        this.d = i7;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f31798f = staticLayout;
        v0 v0Var2 = (v0) this.f31800i;
        gj gjVar = v0Var2.Q0;
        ArrayList arrayList = this.f31796c;
        if (gjVar != null && gjVar.N0) {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        } else {
            v0Var = v0Var2;
            xh.f.b(v0Var, staticLayout, -1, i7, null, arrayList);
        }
        this.h = org.telegram.ui.Components.y5.update(0, (View) v0Var, false, (org.telegram.ui.Components.u5) this.h, (StaticLayout) this.f31798f);
    }

    public t0(v0 v0Var) {
        this.f31800i = v0Var;
        this.f31796c = new ArrayList();
        this.f31799g = new AtomicReference();
    }
}
