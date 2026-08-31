package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class kg extends View {
    public float f28385a;
    public long f28386b;
    public boolean f28387c;
    public boolean d;
    public boolean f28388e;
    public final ij0 f28389f;
    public boolean h;
    public final ChatActivityEnterView f28390n;

    public kg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f28390n = chatActivityEnterView;
        int i10 = R.raw.chat_audio_record_delete_2;
        ij0 ij0Var = new ij0(i10, l.d.j(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f28389f = ij0Var;
        ij0Var.m0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.k6.f21775jf;
        int i11 = ChatActivityEnterView.f24568j5;
        ChatActivityEnterView chatActivityEnterView = this.f28390n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.k6.Sd);
        chatActivityEnterView.f24675s3.setColor(i02);
        ij0 ij0Var = this.f28389f;
        ij0Var.X = true;
        ij0Var.O(i02, "Cup Red");
        ij0Var.O(i02, "Box");
        ij0Var.O(i03, "Line 1");
        ij0Var.O(i03, "Line 2");
        ij0Var.O(i03, "Line 3");
        ij0Var.m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z4 = this.f28388e;
        ij0 ij0Var = this.f28389f;
        if (z4) {
            ij0Var.start();
        }
        ij0Var.f27835s0 = this;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ij0 ij0Var = this.f28389f;
        ij0Var.stop();
        ij0Var.f27835s0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28390n.f24675s3;
        boolean z4 = this.f28388e;
        ij0 ij0Var = this.f28389f;
        if (z4) {
            ij0Var.setAlpha((int) (this.f28385a * 255.0f));
        }
        paint.setAlpha((int) (this.f28385a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f28386b;
        if (this.h) {
            this.f28385a = 1.0f;
        } else if (!this.f28387c && !this.f28388e) {
            float f10 = this.f28385a - (((float) currentTimeMillis) / 600.0f);
            this.f28385a = f10;
            if (f10 <= 0.0f) {
                this.f28385a = 0.0f;
                this.f28387c = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f28385a;
            this.f28385a = f11;
            if (f11 >= 1.0f) {
                this.f28385a = 1.0f;
                this.f28387c = false;
            }
        }
        this.f28386b = System.currentTimeMillis();
        if (this.f28388e) {
            ij0Var.draw(canvas);
        }
        if (!this.f28388e || !ij0Var.s()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28389f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
