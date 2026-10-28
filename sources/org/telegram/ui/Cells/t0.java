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
public final class t0 {
    public TextPaint f25427a;
    public float f25428b;
    public final ArrayList f25429c;
    public int d;
    public float e;
    public Object f25430f;
    public final Object f25431g;
    public Object h;
    public final Object f25432i;

    public t0() {
        TextPaint textPaint = new TextPaint(1);
        this.f25427a = textPaint;
        this.f25428b = 1.0f;
        this.f25430f = new HashMap();
        this.f25431g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f25432i = paint;
        this.f25429c = new ArrayList();
        this.e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f25428b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f25428b = 0.75f;
        } else {
            this.f25428b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f25428b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        v0 v0Var;
        this.f25427a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f25430f = staticLayout;
        v0 v0Var2 = (v0) this.f25432i;
        MessageObject messageObject = v0Var2.P0;
        ArrayList arrayList = this.f25429c;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        } else {
            v0Var = v0Var2;
            xh.g.b(v0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = org.telegram.ui.Components.c6.update(0, (View) v0Var, false, (org.telegram.ui.Components.y5) this.h, (StaticLayout) this.f25430f);
    }

    public t0(v0 v0Var) {
        this.f25432i = v0Var;
        this.f25429c = new ArrayList();
        this.f25431g = new AtomicReference();
    }
}
