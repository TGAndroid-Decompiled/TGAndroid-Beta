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
    public TextPaint f25425a;
    public float f25426b;
    public final ArrayList f25427c;
    public int d;
    public float e;
    public Object f25428f;
    public final Object f25429g;
    public Object h;
    public final Object f25430i;

    public t0() {
        TextPaint textPaint = new TextPaint(1);
        this.f25425a = textPaint;
        this.f25426b = 1.0f;
        this.f25428f = new HashMap();
        this.f25429g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f25430i = paint;
        this.f25427c = new ArrayList();
        this.e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f25426b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f25426b = 0.75f;
        } else {
            this.f25426b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f25426b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        v0 v0Var;
        this.f25425a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f25428f = staticLayout;
        v0 v0Var2 = (v0) this.f25430i;
        MessageObject messageObject = v0Var2.P0;
        ArrayList arrayList = this.f25427c;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        } else {
            v0Var = v0Var2;
            xh.g.b(v0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = org.telegram.ui.Components.c6.update(0, (View) v0Var, false, (org.telegram.ui.Components.y5) this.h, (StaticLayout) this.f25428f);
    }

    public t0(v0 v0Var) {
        this.f25430i = v0Var;
        this.f25427c = new ArrayList();
        this.f25429g = new AtomicReference();
    }
}
