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
    public TextPaint f25423a;
    public float f25424b;
    public final ArrayList f25425c;
    public int d;
    public float e;
    public Object f25426f;
    public final Object f25427g;
    public Object h;
    public final Object f25428i;

    public t0() {
        TextPaint textPaint = new TextPaint(1);
        this.f25423a = textPaint;
        this.f25424b = 1.0f;
        this.f25426f = new HashMap();
        this.f25427g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f25428i = paint;
        this.f25425c = new ArrayList();
        this.e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f25424b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f25424b = 0.75f;
        } else {
            this.f25424b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f25424b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        v0 v0Var;
        this.f25423a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f25426f = staticLayout;
        v0 v0Var2 = (v0) this.f25428i;
        MessageObject messageObject = v0Var2.P0;
        ArrayList arrayList = this.f25425c;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        } else {
            v0Var = v0Var2;
            xh.g.b(v0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = org.telegram.ui.Components.c6.update(0, (View) v0Var, false, (org.telegram.ui.Components.y5) this.h, (StaticLayout) this.f25426f);
    }

    public t0(v0 v0Var) {
        this.f25428i = v0Var;
        this.f25425c = new ArrayList();
        this.f25427g = new AtomicReference();
    }
}
