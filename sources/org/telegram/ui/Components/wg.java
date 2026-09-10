package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class wg extends View {
    public float f28766a;
    public long f28767b;
    public boolean f28768c;
    public boolean d;
    public boolean e;
    public final hj0 f28769f;
    public boolean h;
    public final ChatActivityEnterView f28770n;

    public wg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f28770n = chatActivityEnterView;
        hj0 hj0Var = new hj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f28769f = hj0Var;
        hj0Var.f23664p0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.f18044jf;
        int i11 = ChatActivityEnterView.f20816m5;
        ChatActivityEnterView chatActivityEnterView = this.f28770n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Sd);
        chatActivityEnterView.f20939v3.setColor(i02);
        hj0 hj0Var = this.f28769f;
        hj0Var.f23646a0 = true;
        hj0Var.Q(i02, "Cup Red");
        hj0Var.Q(i02, "Box");
        hj0Var.Q(i03, "Line 1");
        hj0Var.Q(i03, "Line 2");
        hj0Var.Q(i03, "Line 3");
        hj0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        hj0 hj0Var = this.f28769f;
        if (z10) {
            hj0Var.start();
        }
        hj0Var.f23672v0 = this;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        hj0 hj0Var = this.f28769f;
        hj0Var.stop();
        hj0Var.f23672v0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28770n.f20939v3;
        boolean z10 = this.e;
        hj0 hj0Var = this.f28769f;
        if (z10) {
            hj0Var.setAlpha((int) (this.f28766a * 255.0f));
        }
        paint.setAlpha((int) (this.f28766a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f28767b;
        if (this.h) {
            this.f28766a = 1.0f;
        } else if (!this.f28768c && !this.e) {
            float f7 = this.f28766a - (((float) currentTimeMillis) / 600.0f);
            this.f28766a = f7;
            if (f7 <= 0.0f) {
                this.f28766a = 0.0f;
                this.f28768c = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f28766a;
            this.f28766a = f10;
            if (f10 >= 1.0f) {
                this.f28766a = 1.0f;
                this.f28768c = false;
            }
        }
        this.f28767b = System.currentTimeMillis();
        if (this.e) {
            hj0Var.draw(canvas);
        }
        if (!this.e || !hj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28769f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
