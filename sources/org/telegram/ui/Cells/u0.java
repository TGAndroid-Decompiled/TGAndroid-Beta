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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
public final class u0 {
    public TextPaint f23112a;
    public float f23113b;
    public final ArrayList f23114c;
    public int d;
    public float f23115e;
    public Object f23116f;
    public final Object f23117g;
    public Object h;
    public final Object f23118i;

    public u0() {
        TextPaint textPaint = new TextPaint(1);
        this.f23112a = textPaint;
        this.f23113b = 1.0f;
        this.f23116f = new HashMap();
        this.f23117g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f23118i = paint;
        this.f23114c = new ArrayList();
        this.f23115e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f23113b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f23113b = 0.75f;
        } else {
            this.f23113b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f23113b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        w0 w0Var;
        this.f23112a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f23116f = staticLayout;
        w0 w0Var2 = (w0) this.f23118i;
        MessageObject messageObject = w0Var2.H0;
        ArrayList arrayList = this.f23114c;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            w0Var = w0Var2;
        } else {
            w0Var = w0Var2;
            vh.g.b(w0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = org.telegram.ui.Components.z5.update(0, (View) w0Var, false, (org.telegram.ui.Components.v5) this.h, (StaticLayout) this.f23116f);
    }

    public u0(w0 w0Var) {
        this.f23118i = w0Var;
        this.f23114c = new ArrayList();
        this.f23117g = new AtomicReference();
    }
}
