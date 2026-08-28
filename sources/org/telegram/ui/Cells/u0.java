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
    public TextPaint f25720a;
    public float f25721b;
    public final ArrayList f25722c;
    public int d;
    public float f25723e;
    public Object f25724f;
    public final Object f25725g;
    public Object h;
    public final Object f25726i;

    public u0() {
        TextPaint textPaint = new TextPaint(1);
        this.f25720a = textPaint;
        this.f25721b = 1.0f;
        this.f25724f = new HashMap();
        this.f25725g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f25726i = paint;
        this.f25722c = new ArrayList();
        this.f25723e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f25721b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f25721b = 0.75f;
        } else {
            this.f25721b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f25721b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i9) {
        w0 w0Var;
        this.f25720a = textPaint;
        this.d = i9;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i9, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f25724f = staticLayout;
        w0 w0Var2 = (w0) this.f25726i;
        MessageObject messageObject = w0Var2.D0;
        ArrayList arrayList = this.f25722c;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            w0Var = w0Var2;
        } else {
            w0Var = w0Var2;
            dh.l.b(w0Var, staticLayout, -1, i9, null, arrayList);
        }
        this.h = org.telegram.ui.Components.t5.update(0, (View) w0Var, false, (org.telegram.ui.Components.p5) this.h, (StaticLayout) this.f25724f);
    }

    public u0(w0 w0Var) {
        this.f25726i = w0Var;
        this.f25722c = new ArrayList();
        this.f25725g = new AtomicReference();
    }
}
