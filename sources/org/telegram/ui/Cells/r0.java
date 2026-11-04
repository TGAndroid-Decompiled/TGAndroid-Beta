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
import org.telegram.messenger.az;
import org.telegram.messenger.zi;
public final class r0 {
    public TextPaint f30247a;
    public float f30248b;
    public final ArrayList f30249c;
    public int d;
    public float f30250e;
    public Object f30251f;
    public final Object f30252g;
    public Object h;
    public final Object f30253i;

    public r0() {
        TextPaint textPaint = new TextPaint(1);
        this.f30247a = textPaint;
        this.f30248b = 1.0f;
        this.f30251f = new HashMap();
        this.f30252g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f30253i = paint;
        this.f30249c = new ArrayList();
        this.f30250e = 1000.0f / org.telegram.messenger.g0.f22609r;
        this.d = 25;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(-1);
        int o10 = az.o();
        if (o10 == 0) {
            this.f30248b = 0.25f;
        } else if (o10 != 1) {
            this.f30248b = 0.75f;
        } else {
            this.f30248b = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.f30248b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i3) {
        t0 t0Var;
        this.f30247a = textPaint;
        this.d = i3;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i3, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f30251f = staticLayout;
        t0 t0Var2 = (t0) this.f30253i;
        zi ziVar = t0Var2.Q0;
        ArrayList arrayList = this.f30249c;
        if (ziVar != null && ziVar.L0) {
            if (arrayList != null) {
                arrayList.clear();
            }
            t0Var = t0Var2;
        } else {
            t0Var = t0Var2;
            yh.f.b(t0Var, staticLayout, -1, i3, null, arrayList);
        }
        this.h = org.telegram.ui.Components.p5.update(0, (View) t0Var, false, (org.telegram.ui.Components.l5) this.h, (StaticLayout) this.f30251f);
    }

    public r0(t0 t0Var) {
        this.f30253i = t0Var;
        this.f30249c = new ArrayList();
        this.f30252g = new AtomicReference();
    }
}
