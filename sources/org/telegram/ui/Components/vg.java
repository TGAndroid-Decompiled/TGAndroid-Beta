package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class vg extends View {
    public float f31752a;
    public long f31753b;
    public boolean f31754c;
    public boolean d;
    public boolean f31755e;
    public final kj0 f31756f;
    public boolean h;
    public boolean f31757n;
    public long f31758r;
    public final ChatActivityEnterView f31759s;

    public vg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f31759s = chatActivityEnterView;
        this.f31758r = -1L;
        kj0 kj0Var = new kj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f31756f = kj0Var;
        kj0Var.f28228o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.i6.f20945jf;
        int i11 = ChatActivityEnterView.f23854n5;
        ChatActivityEnterView chatActivityEnterView = this.f31759s;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.i6.Sd);
        int i04 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.i6.f20836df);
        chatActivityEnterView.f23985w3.setColor(i02);
        kj0 kj0Var = this.f31756f;
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
        boolean z10 = this.f31755e;
        kj0 kj0Var = this.f31756f;
        if (z10) {
            kj0Var.start();
        }
        kj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        kj0 kj0Var = this.f31756f;
        kj0Var.stop();
        kj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f31759s.f23985w3;
        boolean z10 = this.f31755e;
        kj0 kj0Var = this.f31756f;
        if (z10) {
            kj0Var.setAlpha((int) (this.f31752a * 255.0f));
        }
        paint.setAlpha((int) (this.f31752a * 255.0f));
        if (!this.f31757n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f31753b;
            if (this.h) {
                this.f31752a = 1.0f;
            } else if (!this.f31754c && !this.f31755e) {
                float f7 = this.f31752a - (((float) j3) / 600.0f);
                this.f31752a = f7;
                if (f7 <= 0.0f) {
                    this.f31752a = 0.0f;
                    this.f31754c = true;
                }
            } else {
                float f10 = (((float) j3) / 600.0f) + this.f31752a;
                this.f31752a = f10;
                if (f10 >= 1.0f) {
                    this.f31752a = 1.0f;
                    this.f31754c = false;
                }
            }
            this.f31753b = currentTimeMillis;
        }
        if (this.f31755e) {
            kj0Var.draw(canvas);
        }
        if (!this.f31755e || !kj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f31757n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31756f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
