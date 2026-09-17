package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class sg extends View {
    public float f27854a;
    public long f27855b;
    public boolean f27856c;
    public boolean d;
    public boolean e;
    public final yi0 f27857f;
    public boolean h;
    public final ChatActivityEnterView f27858n;

    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f27858n = chatActivityEnterView;
        yi0 yi0Var = new yi0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f27857f = yi0Var;
        yi0Var.f30237p0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.f18979jf;
        int i11 = ChatActivityEnterView.f21741m5;
        ChatActivityEnterView chatActivityEnterView = this.f27858n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Sd);
        chatActivityEnterView.f21864v3.setColor(i02);
        yi0 yi0Var = this.f27857f;
        yi0Var.f30219a0 = true;
        yi0Var.Q(i02, "Cup Red");
        yi0Var.Q(i02, "Box");
        yi0Var.Q(i03, "Line 1");
        yi0Var.Q(i03, "Line 2");
        yi0Var.Q(i03, "Line 3");
        yi0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        yi0 yi0Var = this.f27857f;
        if (z10) {
            yi0Var.start();
        }
        yi0Var.f30245v0 = this;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        yi0 yi0Var = this.f27857f;
        yi0Var.stop();
        yi0Var.f30245v0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f27858n.f21864v3;
        boolean z10 = this.e;
        yi0 yi0Var = this.f27857f;
        if (z10) {
            yi0Var.setAlpha((int) (this.f27854a * 255.0f));
        }
        paint.setAlpha((int) (this.f27854a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f27855b;
        if (this.h) {
            this.f27854a = 1.0f;
        } else if (!this.f27856c && !this.e) {
            float f7 = this.f27854a - (((float) currentTimeMillis) / 600.0f);
            this.f27854a = f7;
            if (f7 <= 0.0f) {
                this.f27854a = 0.0f;
                this.f27856c = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f27854a;
            this.f27854a = f10;
            if (f10 >= 1.0f) {
                this.f27854a = 1.0f;
                this.f27856c = false;
            }
        }
        this.f27855b = System.currentTimeMillis();
        if (this.e) {
            yi0Var.draw(canvas);
        }
        if (!this.e || !yi0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f27857f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
