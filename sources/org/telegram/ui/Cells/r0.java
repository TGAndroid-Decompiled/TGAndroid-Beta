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
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
public final class r0 {
    public TextPaint f31323a;
    public float f31324b;
    public final ArrayList f31325c;
    public int d;
    public float f31326e;
    public Object f31327f;
    public final Object f31328g;
    public Object h;
    public final Object f31329i;

    public r0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31323a = textPaint;
        this.f31324b = 1.0f;
        this.f31327f = new HashMap();
        this.f31328g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f31329i = paint;
        this.f31325c = new ArrayList();
        this.f31326e = 1000.0f / org.telegram.messenger.g0.f23610r;
        this.d = 25;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(-1);
        int o4 = gz.o();
        if (o4 == 0) {
            this.f31324b = 0.25f;
        } else if (o4 != 1) {
            this.f31324b = 0.75f;
        } else {
            this.f31324b = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.f31324b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i7) {
        t0 t0Var;
        this.f31323a = textPaint;
        this.d = i7;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f31327f = staticLayout;
        t0 t0Var2 = (t0) this.f31329i;
        gj gjVar = t0Var2.Q0;
        ArrayList arrayList = this.f31325c;
        if (gjVar != null && gjVar.N0) {
            if (arrayList != null) {
                arrayList.clear();
            }
            t0Var = t0Var2;
        } else {
            t0Var = t0Var2;
            xh.f.b(t0Var, staticLayout, -1, i7, null, arrayList);
        }
        this.h = org.telegram.ui.Components.p5.update(0, (View) t0Var, false, (org.telegram.ui.Components.l5) this.h, (StaticLayout) this.f31327f);
    }

    public r0(t0 t0Var) {
        this.f31329i = t0Var;
        this.f31325c = new ArrayList();
        this.f31328g = new AtomicReference();
    }
}
