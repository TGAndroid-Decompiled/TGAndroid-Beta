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
    public TextPaint f31890a;
    public float f31891b;
    public final ArrayList f31892c;
    public int d;
    public float f31893e;
    public Object f31894f;
    public final Object f31895g;
    public Object h;
    public final Object f31896i;

    public t0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31890a = textPaint;
        this.f31891b = 1.0f;
        this.f31894f = new HashMap();
        this.f31895g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f31896i = paint;
        this.f31892c = new ArrayList();
        this.f31893e = 1000.0f / org.telegram.messenger.g0.f24227r;
        this.d = 25;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(-1);
        int o4 = bz.o();
        if (o4 == 0) {
            this.f31891b = 0.25f;
        } else if (o4 != 1) {
            this.f31891b = 0.75f;
        } else {
            this.f31891b = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.f31891b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i7) {
        v0 v0Var;
        this.f31890a = textPaint;
        this.d = i7;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f31894f = staticLayout;
        v0 v0Var2 = (v0) this.f31896i;
        fj fjVar = v0Var2.Q0;
        ArrayList arrayList = this.f31892c;
        if (fjVar != null && fjVar.N0) {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        } else {
            v0Var = v0Var2;
            xh.f.b(v0Var, staticLayout, -1, i7, null, arrayList);
        }
        this.h = org.telegram.ui.Components.x5.update(0, (View) v0Var, false, (org.telegram.ui.Components.t5) this.h, (StaticLayout) this.f31894f);
    }

    public t0(v0 v0Var) {
        this.f31896i = v0Var;
        this.f31892c = new ArrayList();
        this.f31895g = new AtomicReference();
    }
}
