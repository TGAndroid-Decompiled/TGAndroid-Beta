package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f28875a;
    public long f28876b;
    public boolean f28877c;
    public boolean d;
    public boolean e;
    public final kj0 f28878f;
    public boolean h;
    public boolean f28879n;
    public long f28880r;
    public final ChatActivityEnterView f28881s;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f28881s = chatActivityEnterView;
        this.f28880r = -1L;
        kj0 kj0Var = new kj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f28878f = kj0Var;
        kj0Var.f25763o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.i6.f19174jf;
        int i11 = ChatActivityEnterView.f21955n5;
        ChatActivityEnterView chatActivityEnterView = this.f28881s;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.i6.Sd);
        int i04 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.i6.f19066df);
        chatActivityEnterView.f22085w3.setColor(i02);
        kj0 kj0Var = this.f28878f;
        kj0Var.Z = true;
        kj0Var.Q(i02, "Cup Red");
        kj0Var.Q(i02, "Box Red");
        kj0Var.Q(i04, "Cup Grey");
        kj0Var.Q(i04, "Box Grey");
        kj0Var.Q(i04, "Box_Grey 2");
        kj0Var.Q(i04, "Line 1");
        kj0Var.Q(i04, "Line 2");
        kj0Var.Q(i04, "Line 3");
        kj0Var.Q(i03, "Line 1 Dup");
        kj0Var.Q(i03, "Line 2 Dup");
        kj0Var.Q(i03, "Line 3 Dup");
        kj0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        kj0 kj0Var = this.f28878f;
        if (z10) {
            kj0Var.start();
        }
        kj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        kj0 kj0Var = this.f28878f;
        kj0Var.stop();
        kj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28881s.f22085w3;
        boolean z10 = this.e;
        kj0 kj0Var = this.f28878f;
        if (z10) {
            kj0Var.setAlpha((int) (this.f28875a * 255.0f));
        }
        paint.setAlpha((int) (this.f28875a * 255.0f));
        if (!this.f28879n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f28876b;
            if (this.h) {
                this.f28875a = 1.0f;
            } else if (!this.f28877c && !this.e) {
                float f7 = this.f28875a - (((float) j3) / 600.0f);
                this.f28875a = f7;
                if (f7 <= 0.0f) {
                    this.f28875a = 0.0f;
                    this.f28877c = true;
                }
            } else {
                float f10 = (((float) j3) / 600.0f) + this.f28875a;
                this.f28875a = f10;
                if (f10 >= 1.0f) {
                    this.f28875a = 1.0f;
                    this.f28877c = false;
                }
            }
            this.f28876b = currentTimeMillis;
        }
        if (this.e) {
            kj0Var.draw(canvas);
        }
        if (!this.e || !kj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f28879n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28878f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
