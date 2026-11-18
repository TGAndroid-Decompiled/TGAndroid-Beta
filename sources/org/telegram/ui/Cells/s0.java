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
public final class s0 {
    public TextPaint f31746a;
    public float f31747b;
    public final ArrayList f31748c;
    public int d;
    public float f31749e;
    public Object f31750f;
    public final Object f31751g;
    public Object h;
    public final Object f31752i;

    public s0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31746a = textPaint;
        this.f31747b = 1.0f;
        this.f31750f = new HashMap();
        this.f31751g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f31752i = paint;
        this.f31748c = new ArrayList();
        this.f31749e = 1000.0f / org.telegram.messenger.g0.f24122r;
        this.d = 25;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(-1);
        int o4 = bz.o();
        if (o4 == 0) {
            this.f31747b = 0.25f;
        } else if (o4 != 1) {
            this.f31747b = 0.75f;
        } else {
            this.f31747b = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.f31747b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i7) {
        u0 u0Var;
        this.f31746a = textPaint;
        this.d = i7;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f31750f = staticLayout;
        u0 u0Var2 = (u0) this.f31752i;
        fj fjVar = u0Var2.Q0;
        ArrayList arrayList = this.f31748c;
        if (fjVar != null && fjVar.N0) {
            if (arrayList != null) {
                arrayList.clear();
            }
            u0Var = u0Var2;
        } else {
            u0Var = u0Var2;
            xh.f.b(u0Var, staticLayout, -1, i7, null, arrayList);
        }
        this.h = org.telegram.ui.Components.x5.update(0, (View) u0Var, false, (org.telegram.ui.Components.t5) this.h, (StaticLayout) this.f31750f);
    }

    public s0(u0 u0Var) {
        this.f31752i = u0Var;
        this.f31748c = new ArrayList();
        this.f31751g = new AtomicReference();
    }
}
