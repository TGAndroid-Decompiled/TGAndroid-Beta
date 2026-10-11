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
    public TextPaint f23130a;
    public float f23131b;
    public final ArrayList f23132c;
    public int d;
    public float f23133e;
    public Object f23134f;
    public final Object f23135g;
    public Object h;
    public final Object f23136i;

    public u0() {
        TextPaint textPaint = new TextPaint(1);
        this.f23130a = textPaint;
        this.f23131b = 1.0f;
        this.f23134f = new HashMap();
        this.f23135g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f23136i = paint;
        this.f23132c = new ArrayList();
        this.f23133e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f23131b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f23131b = 0.75f;
        } else {
            this.f23131b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f23131b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        w0 w0Var;
        this.f23130a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f23134f = staticLayout;
        w0 w0Var2 = (w0) this.f23136i;
        MessageObject messageObject = w0Var2.P0;
        ArrayList arrayList = this.f23132c;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            w0Var = w0Var2;
        } else {
            w0Var = w0Var2;
            vh.g.b(w0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = org.telegram.ui.Components.b6.update(0, (View) w0Var, false, (org.telegram.ui.Components.x5) this.h, (StaticLayout) this.f23134f);
    }

    public u0(w0 w0Var) {
        this.f23136i = w0Var;
        this.f23132c = new ArrayList();
        this.f23135g = new AtomicReference();
    }
}
