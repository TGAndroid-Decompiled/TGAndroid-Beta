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
    public TextPaint f23215a;
    public float f23216b;
    public final ArrayList f23217c;
    public int d;
    public float e;
    public Object f23218f;
    public final Object f23219g;
    public Object h;
    public final Object f23220i;

    public u0() {
        TextPaint textPaint = new TextPaint(1);
        this.f23215a = textPaint;
        this.f23216b = 1.0f;
        this.f23218f = new HashMap();
        this.f23219g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.f23220i = paint;
        this.f23217c = new ArrayList();
        this.e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.f23216b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.f23216b = 0.75f;
        } else {
            this.f23216b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.f23216b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        w0 w0Var;
        this.f23215a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f23218f = staticLayout;
        w0 w0Var2 = (w0) this.f23220i;
        MessageObject messageObject = w0Var2.P0;
        ArrayList arrayList = this.f23217c;
        if (messageObject != null && messageObject.isSpoilersRevealed) {
            if (arrayList != null) {
                arrayList.clear();
            }
            w0Var = w0Var2;
        } else {
            w0Var = w0Var2;
            wh.g.b(w0Var, staticLayout, -1, i10, null, arrayList);
        }
        this.h = org.telegram.ui.Components.a6.update(0, (View) w0Var, false, (org.telegram.ui.Components.w5) this.h, (StaticLayout) this.f23218f);
    }

    public u0(w0 w0Var) {
        this.f23220i = w0Var;
        this.f23217c = new ArrayList();
        this.f23219g = new AtomicReference();
    }
}
