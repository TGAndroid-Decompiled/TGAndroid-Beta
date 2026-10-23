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
    public TextPaint f23302a;
    public float f23303b;
    public final ArrayList f23304c;
    public int d;
    public float e;
    public Object f23305f;
    public final Object f23306g;
    public Object h;
    public final Object f23307i;

    public t0() {
        TextPaint textPaint = new TextPaint(1);
        this.f23302a = textPaint;
        this.f23303b = 1.0f;
        this.f23305f = new HashMap();
        this.f23306g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f23307i = paint;
        this.f23304c = new ArrayList();
        this.e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f23303b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f23303b = 0.75f;
        } else {
            this.f23303b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f23303b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        v0 v0Var;
        this.f23302a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f23305f = staticLayout;
        v0 v0Var2 = (v0) this.f23307i;
        MessageObject messageObject = v0Var2.P0;
        ArrayList arrayList = this.f23304c;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        } else {
            v0Var = v0Var2;
            wh.g.b(v0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = org.telegram.ui.Components.a6.update(0, (View) v0Var, false, (org.telegram.ui.Components.w5) this.h, (StaticLayout) this.f23305f);
    }

    public t0(v0 v0Var) {
        this.f23307i = v0Var;
        this.f23304c = new ArrayList();
        this.f23306g = new AtomicReference();
    }
}
