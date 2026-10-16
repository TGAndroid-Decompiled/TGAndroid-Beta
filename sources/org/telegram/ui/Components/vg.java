package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class vg extends View {
    public float f29633a;
    public long f29634b;
    public boolean f29635c;
    public boolean d;
    public boolean e;
    public final yj0 f29636f;
    public boolean h;
    public boolean f29637n;
    public long f29638r;
    public final ChatActivityEnterView f29639s;

    public vg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f29639s = chatActivityEnterView;
        this.f29638r = -1L;
        yj0 yj0Var = new yj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f29636f = yj0Var;
        yj0Var.f31302o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.g6.f19717jf;
        int i11 = ChatActivityEnterView.f22549n5;
        ChatActivityEnterView chatActivityEnterView = this.f29639s;
        int g02 = chatActivityEnterView.g0(i10);
        int g03 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.g6.Sd);
        int g04 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.g6.f19608df);
        chatActivityEnterView.f22680w3.setColor(g02);
        yj0 yj0Var = this.f29636f;
        yj0Var.Z = true;
        yj0Var.Q(g02, "Cup Red");
        yj0Var.Q(g02, "Box Red");
        yj0Var.Q(g04, "Cup Grey");
        yj0Var.Q(g04, "Box Grey");
        yj0Var.Q(g04, "Box_Grey 2");
        yj0Var.Q(g04, "Line 1");
        yj0Var.Q(g04, "Line 2");
        yj0Var.Q(g04, "Line 3");
        yj0Var.Q(g03, "Line 1 Dup");
        yj0Var.Q(g03, "Line 2 Dup");
        yj0Var.Q(g03, "Line 3 Dup");
        yj0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        yj0 yj0Var = this.f29636f;
        if (z10) {
            yj0Var.start();
        }
        yj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        yj0 yj0Var = this.f29636f;
        yj0Var.stop();
        yj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f29639s.f22680w3;
        boolean z10 = this.e;
        yj0 yj0Var = this.f29636f;
        if (z10) {
            yj0Var.setAlpha((int) (this.f29633a * 255.0f));
        }
        paint.setAlpha((int) (this.f29633a * 255.0f));
        if (!this.f29637n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f29634b;
            if (this.h) {
                this.f29633a = 1.0f;
            } else if (!this.f29635c && !this.e) {
                float f7 = this.f29633a - (((float) j10) / 600.0f);
                this.f29633a = f7;
                if (f7 <= 0.0f) {
                    this.f29633a = 0.0f;
                    this.f29635c = true;
                }
            } else {
                float f10 = (((float) j10) / 600.0f) + this.f29633a;
                this.f29633a = f10;
                if (f10 >= 1.0f) {
                    this.f29633a = 1.0f;
                    this.f29635c = false;
                }
            }
            this.f29634b = currentTimeMillis;
        }
        if (this.e) {
            yj0Var.draw(canvas);
        }
        if (!this.e || !yj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f29637n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29636f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
