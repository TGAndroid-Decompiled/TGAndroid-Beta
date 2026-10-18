package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f30985a;
    public long f30986b;
    public boolean f30987c;
    public boolean d;
    public boolean e;
    public final uj0 f30988f;
    public boolean h;
    public boolean f30989n;
    public long f30990r;
    public final ChatActivityEnterView f30991s;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f30991s = chatActivityEnterView;
        this.f30990r = -1L;
        uj0 uj0Var = new uj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f30988f = uj0Var;
        uj0Var.f31025o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f21109jf;
        int i11 = ChatActivityEnterView.f23911n5;
        ChatActivityEnterView chatActivityEnterView = this.f30991s;
        int g02 = chatActivityEnterView.g0(i10);
        int g03 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.Sd);
        int g04 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f21000df);
        chatActivityEnterView.f24042w3.setColor(g02);
        uj0 uj0Var = this.f30988f;
        uj0Var.Z = true;
        uj0Var.Q(g02, "Cup Red");
        uj0Var.Q(g02, "Box Red");
        uj0Var.Q(g04, "Cup Grey");
        uj0Var.Q(g04, "Box Grey");
        uj0Var.Q(g04, "Box_Grey 2");
        uj0Var.Q(g04, "Line 1");
        uj0Var.Q(g04, "Line 2");
        uj0Var.Q(g04, "Line 3");
        uj0Var.Q(g03, "Line 1 Dup");
        uj0Var.Q(g03, "Line 2 Dup");
        uj0Var.Q(g03, "Line 3 Dup");
        uj0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        uj0 uj0Var = this.f30988f;
        if (z10) {
            uj0Var.start();
        }
        uj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        uj0 uj0Var = this.f30988f;
        uj0Var.stop();
        uj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f30991s.f24042w3;
        boolean z10 = this.e;
        uj0 uj0Var = this.f30988f;
        if (z10) {
            uj0Var.setAlpha((int) (this.f30985a * 255.0f));
        }
        paint.setAlpha((int) (this.f30985a * 255.0f));
        if (!this.f30989n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f30986b;
            if (this.h) {
                this.f30985a = 1.0f;
            } else if (!this.f30987c && !this.e) {
                float f7 = this.f30985a - (((float) j10) / 600.0f);
                this.f30985a = f7;
                if (f7 <= 0.0f) {
                    this.f30985a = 0.0f;
                    this.f30987c = true;
                }
            } else {
                float f10 = (((float) j10) / 600.0f) + this.f30985a;
                this.f30985a = f10;
                if (f10 >= 1.0f) {
                    this.f30985a = 1.0f;
                    this.f30987c = false;
                }
            }
            this.f30986b = currentTimeMillis;
        }
        if (this.e) {
            uj0Var.draw(canvas);
        }
        if (!this.e || !uj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f30989n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f30988f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
