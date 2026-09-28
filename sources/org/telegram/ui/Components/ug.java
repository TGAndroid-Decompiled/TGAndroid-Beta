package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f28804a;
    public long f28805b;
    public boolean f28806c;
    public boolean d;
    public boolean e;
    public final kj0 f28807f;
    public boolean h;
    public boolean f28808n;
    public long f28809r;
    public final ChatActivityEnterView f28810s;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f28810s = chatActivityEnterView;
        this.f28809r = -1L;
        kj0 kj0Var = new kj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f28807f = kj0Var;
        kj0Var.f25733o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f19175jf;
        int i11 = ChatActivityEnterView.f21952n5;
        ChatActivityEnterView chatActivityEnterView = this.f28810s;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.Sd);
        int i04 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.f19068df);
        chatActivityEnterView.f22082w3.setColor(i02);
        kj0 kj0Var = this.f28807f;
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
        kj0 kj0Var = this.f28807f;
        if (z10) {
            kj0Var.start();
        }
        kj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        kj0 kj0Var = this.f28807f;
        kj0Var.stop();
        kj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28810s.f22082w3;
        boolean z10 = this.e;
        kj0 kj0Var = this.f28807f;
        if (z10) {
            kj0Var.setAlpha((int) (this.f28804a * 255.0f));
        }
        paint.setAlpha((int) (this.f28804a * 255.0f));
        if (!this.f28808n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f28805b;
            if (this.h) {
                this.f28804a = 1.0f;
            } else if (!this.f28806c && !this.e) {
                float f7 = this.f28804a - (((float) j3) / 600.0f);
                this.f28804a = f7;
                if (f7 <= 0.0f) {
                    this.f28804a = 0.0f;
                    this.f28806c = true;
                }
            } else {
                float f10 = (((float) j3) / 600.0f) + this.f28804a;
                this.f28804a = f10;
                if (f10 >= 1.0f) {
                    this.f28804a = 1.0f;
                    this.f28806c = false;
                }
            }
            this.f28805b = currentTimeMillis;
        }
        if (this.e) {
            kj0Var.draw(canvas);
        }
        if (!this.e || !kj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f28808n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28807f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
