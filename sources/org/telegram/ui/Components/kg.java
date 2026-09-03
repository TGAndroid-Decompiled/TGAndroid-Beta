package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class kg extends View {
    public float f28407a;
    public long f28408b;
    public boolean f28409c;
    public boolean d;
    public boolean f28410e;
    public final hj0 f28411f;
    public boolean h;
    public final ChatActivityEnterView f28412n;

    public kg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f28412n = chatActivityEnterView;
        hj0 hj0Var = new hj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f28411f = hj0Var;
        hj0Var.m0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.k6.f21777jf;
        int i11 = ChatActivityEnterView.f24570j5;
        ChatActivityEnterView chatActivityEnterView = this.f28412n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.k6.Sd);
        chatActivityEnterView.f24677s3.setColor(i02);
        hj0 hj0Var = this.f28411f;
        hj0Var.X = true;
        hj0Var.O(i02, "Cup Red");
        hj0Var.O(i02, "Box");
        hj0Var.O(i03, "Line 1");
        hj0Var.O(i03, "Line 2");
        hj0Var.O(i03, "Line 3");
        hj0Var.m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z4 = this.f28410e;
        hj0 hj0Var = this.f28411f;
        if (z4) {
            hj0Var.start();
        }
        hj0Var.f27542s0 = this;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        hj0 hj0Var = this.f28411f;
        hj0Var.stop();
        hj0Var.f27542s0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28412n.f24677s3;
        boolean z4 = this.f28410e;
        hj0 hj0Var = this.f28411f;
        if (z4) {
            hj0Var.setAlpha((int) (this.f28407a * 255.0f));
        }
        paint.setAlpha((int) (this.f28407a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f28408b;
        if (this.h) {
            this.f28407a = 1.0f;
        } else if (!this.f28409c && !this.f28410e) {
            float f10 = this.f28407a - (((float) currentTimeMillis) / 600.0f);
            this.f28407a = f10;
            if (f10 <= 0.0f) {
                this.f28407a = 0.0f;
                this.f28409c = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f28407a;
            this.f28407a = f11;
            if (f11 >= 1.0f) {
                this.f28407a = 1.0f;
                this.f28409c = false;
            }
        }
        this.f28408b = System.currentTimeMillis();
        if (this.f28410e) {
            hj0Var.draw(canvas);
        }
        if (!this.f28410e || !hj0Var.s()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28411f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
