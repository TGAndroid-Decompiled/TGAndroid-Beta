package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f31146a;
    public long f31147b;
    public boolean f31148c;
    public boolean d;
    public boolean e;
    public final yj0 f31149f;
    public boolean h;
    public boolean f31150n;
    public long f31151r;
    public final ChatActivityEnterView f31152s;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f31152s = chatActivityEnterView;
        this.f31151r = -1L;
        yj0 yj0Var = new yj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f31149f = yj0Var;
        yj0Var.f32950o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.k6.f21299jf;
        int i11 = ChatActivityEnterView.f24050r5;
        ChatActivityEnterView chatActivityEnterView = this.f31152s;
        int f02 = chatActivityEnterView.f0(i10);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Sd);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f21190df);
        chatActivityEnterView.f24184w3.setColor(f02);
        yj0 yj0Var = this.f31149f;
        yj0Var.Z = true;
        yj0Var.Q(f02, "Cup Red");
        yj0Var.Q(f02, "Box Red");
        yj0Var.Q(f04, "Cup Grey");
        yj0Var.Q(f04, "Box Grey");
        yj0Var.Q(f04, "Box_Grey 2");
        yj0Var.Q(f04, "Line 1");
        yj0Var.Q(f04, "Line 2");
        yj0Var.Q(f04, "Line 3");
        yj0Var.Q(f03, "Line 1 Dup");
        yj0Var.Q(f03, "Line 2 Dup");
        yj0Var.Q(f03, "Line 3 Dup");
        yj0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        yj0 yj0Var = this.f31149f;
        if (z10) {
            yj0Var.start();
        }
        yj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        yj0 yj0Var = this.f31149f;
        yj0Var.stop();
        yj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f31152s.f24184w3;
        boolean z10 = this.e;
        yj0 yj0Var = this.f31149f;
        if (z10) {
            yj0Var.setAlpha((int) (this.f31146a * 255.0f));
        }
        paint.setAlpha((int) (this.f31146a * 255.0f));
        if (!this.f31150n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f31147b;
            if (this.h) {
                this.f31146a = 1.0f;
            } else if (!this.f31148c && !this.e) {
                float f7 = this.f31146a - (((float) j10) / 600.0f);
                this.f31146a = f7;
                if (f7 <= 0.0f) {
                    this.f31146a = 0.0f;
                    this.f31148c = true;
                }
            } else {
                float f10 = (((float) j10) / 600.0f) + this.f31146a;
                this.f31146a = f10;
                if (f10 >= 1.0f) {
                    this.f31146a = 1.0f;
                    this.f31148c = false;
                }
            }
            this.f31147b = currentTimeMillis;
        }
        if (this.e) {
            yj0Var.draw(canvas);
        }
        if (!this.e || !yj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f31150n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31149f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
