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
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
public final class r0 {
    public TextPaint f30166a;
    public float f30167b;
    public final ArrayList f30168c;
    public int d;
    public float f30169e;
    public Object f30170f;
    public final Object f30171g;
    public Object h;
    public final Object f30172i;

    public r0() {
        TextPaint textPaint = new TextPaint(1);
        this.f30166a = textPaint;
        this.f30167b = 1.0f;
        this.f30170f = new HashMap();
        this.f30171g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f30172i = paint;
        this.f30168c = new ArrayList();
        this.f30169e = 1000.0f / org.telegram.messenger.g0.f22545r;
        this.d = 25;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(-1);
        int o4 = iz.o();
        if (o4 == 0) {
            this.f30167b = 0.25f;
        } else if (o4 != 1) {
            this.f30167b = 0.75f;
        } else {
            this.f30167b = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.f30167b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i7) {
        t0 t0Var;
        this.f30166a = textPaint;
        this.d = i7;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f30170f = staticLayout;
        t0 t0Var2 = (t0) this.f30172i;
        ij ijVar = t0Var2.P0;
        ArrayList arrayList = this.f30168c;
        if (ijVar != null && ijVar.L0) {
            if (arrayList != null) {
                arrayList.clear();
            }
            t0Var = t0Var2;
        } else {
            t0Var = t0Var2;
            xh.f.b(t0Var, staticLayout, -1, i7, null, arrayList);
        }
        this.h = org.telegram.ui.Components.r5.update(0, (View) t0Var, false, (org.telegram.ui.Components.n5) this.h, (StaticLayout) this.f30170f);
    }

    public r0(t0 t0Var) {
        this.f30172i = t0Var;
        this.f30168c = new ArrayList();
        this.f30171g = new AtomicReference();
    }
}
