package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class sg extends View {
    public float f27850a;
    public long f27851b;
    public boolean f27852c;
    public boolean d;
    public boolean e;
    public final xi0 f27853f;
    public boolean h;
    public final ChatActivityEnterView f27854n;

    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f27854n = chatActivityEnterView;
        xi0 xi0Var = new xi0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f27853f = xi0Var;
        xi0Var.f29964p0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.i6.f18953jf;
        int i11 = ChatActivityEnterView.f21731m5;
        ChatActivityEnterView chatActivityEnterView = this.f27854n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.i6.Sd);
        chatActivityEnterView.f21854v3.setColor(i02);
        xi0 xi0Var = this.f27853f;
        xi0Var.f29946a0 = true;
        xi0Var.Q(i02, "Cup Red");
        xi0Var.Q(i02, "Box");
        xi0Var.Q(i03, "Line 1");
        xi0Var.Q(i03, "Line 2");
        xi0Var.Q(i03, "Line 3");
        xi0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        xi0 xi0Var = this.f27853f;
        if (z10) {
            xi0Var.start();
        }
        xi0Var.f29972v0 = this;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        xi0 xi0Var = this.f27853f;
        xi0Var.stop();
        xi0Var.f29972v0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f27854n.f21854v3;
        boolean z10 = this.e;
        xi0 xi0Var = this.f27853f;
        if (z10) {
            xi0Var.setAlpha((int) (this.f27850a * 255.0f));
        }
        paint.setAlpha((int) (this.f27850a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f27851b;
        if (this.h) {
            this.f27850a = 1.0f;
        } else if (!this.f27852c && !this.e) {
            float f7 = this.f27850a - (((float) currentTimeMillis) / 600.0f);
            this.f27850a = f7;
            if (f7 <= 0.0f) {
                this.f27850a = 0.0f;
                this.f27852c = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f27850a;
            this.f27850a = f10;
            if (f10 >= 1.0f) {
                this.f27850a = 1.0f;
                this.f27852c = false;
            }
        }
        this.f27851b = System.currentTimeMillis();
        if (this.e) {
            xi0Var.draw(canvas);
        }
        if (!this.e || !xi0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f27853f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
