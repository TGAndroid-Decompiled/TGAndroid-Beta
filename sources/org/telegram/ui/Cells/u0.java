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
    public TextPaint f20464a;
    public float f20465b;
    public final ArrayList f20466c;
    public int d;
    public float e;
    public Object f20467f;
    public final Object f20468g;
    public Object h;
    public final Object f20469i;

    public u0() {
        TextPaint textPaint = new TextPaint(1);
        this.f20464a = textPaint;
        this.f20465b = 1.0f;
        this.f20467f = new HashMap();
        this.f20468g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f20469i = paint;
        this.f20466c = new ArrayList();
        this.e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f20465b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f20465b = 0.75f;
        } else {
            this.f20465b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f20465b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        w0 w0Var;
        this.f20464a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f20467f = staticLayout;
        w0 w0Var2 = (w0) this.f20469i;
        MessageObject messageObject = w0Var2.H0;
        ArrayList arrayList = this.f20466c;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            w0Var = w0Var2;
        } else {
            w0Var = w0Var2;
            uh.h.b(w0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = org.telegram.ui.Components.y5.update(0, (View) w0Var, false, (org.telegram.ui.Components.u5) this.h, (StaticLayout) this.f20467f);
    }

    public u0(w0 w0Var) {
        this.f20469i = w0Var;
        this.f20466c = new ArrayList();
        this.f20468g = new AtomicReference();
    }
}
