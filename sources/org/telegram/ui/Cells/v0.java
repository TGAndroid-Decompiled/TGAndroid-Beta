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
public final class v0 {
    public TextPaint f22550a;
    public float f22551b;
    public final ArrayList f22552c;
    public int d;
    public float e;
    public Object f22553f;
    public final Object f22554g;
    public Object h;
    public final Object f22555i;

    public v0() {
        TextPaint textPaint = new TextPaint(1);
        this.f22550a = textPaint;
        this.f22551b = 1.0f;
        this.f22553f = new HashMap();
        this.f22554g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f22555i = paint;
        this.f22552c = new ArrayList();
        this.e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f22551b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f22551b = 0.75f;
        } else {
            this.f22551b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f22551b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        x0 x0Var;
        this.f22550a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f22553f = staticLayout;
        x0 x0Var2 = (x0) this.f22555i;
        MessageObject messageObject = x0Var2.P0;
        ArrayList arrayList = this.f22552c;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            x0Var = x0Var2;
        } else {
            x0Var = x0Var2;
            wh.g.b(x0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = org.telegram.ui.Components.b6.update(0, (View) x0Var, false, (org.telegram.ui.Components.x5) this.h, (StaticLayout) this.f22553f);
    }

    public v0(x0 x0Var) {
        this.f22555i = x0Var;
        this.f22552c = new ArrayList();
        this.f22554g = new AtomicReference();
    }
}
