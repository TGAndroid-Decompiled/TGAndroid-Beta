package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f30951a;
    public long f30952b;
    public boolean f30953c;
    public boolean d;
    public boolean e;
    public final uj0 f30954f;
    public boolean h;
    public boolean f30955n;
    public long f30956r;
    public final ChatActivityEnterView f30957s;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f30957s = chatActivityEnterView;
        this.f30956r = -1L;
        uj0 uj0Var = new uj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f30954f = uj0Var;
        uj0Var.f30991o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f21103jf;
        int i11 = ChatActivityEnterView.f23905n5;
        ChatActivityEnterView chatActivityEnterView = this.f30957s;
        int g02 = chatActivityEnterView.g0(i10);
        int g03 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.Sd);
        int g04 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f20994df);
        chatActivityEnterView.f24036w3.setColor(g02);
        uj0 uj0Var = this.f30954f;
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
        uj0 uj0Var = this.f30954f;
        if (z10) {
            uj0Var.start();
        }
        uj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        uj0 uj0Var = this.f30954f;
        uj0Var.stop();
        uj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f30957s.f24036w3;
        boolean z10 = this.e;
        uj0 uj0Var = this.f30954f;
        if (z10) {
            uj0Var.setAlpha((int) (this.f30951a * 255.0f));
        }
        paint.setAlpha((int) (this.f30951a * 255.0f));
        if (!this.f30955n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f30952b;
            if (this.h) {
                this.f30951a = 1.0f;
            } else if (!this.f30953c && !this.e) {
                float f7 = this.f30951a - (((float) j10) / 600.0f);
                this.f30951a = f7;
                if (f7 <= 0.0f) {
                    this.f30951a = 0.0f;
                    this.f30953c = true;
                }
            } else {
                float f10 = (((float) j10) / 600.0f) + this.f30951a;
                this.f30951a = f10;
                if (f10 >= 1.0f) {
                    this.f30951a = 1.0f;
                    this.f30953c = false;
                }
            }
            this.f30952b = currentTimeMillis;
        }
        if (this.e) {
            uj0Var.draw(canvas);
        }
        if (!this.e || !uj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f30955n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f30954f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
