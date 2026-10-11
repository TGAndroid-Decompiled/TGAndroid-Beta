package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class wg extends View {
    public float f32631a;
    public long f32632b;
    public boolean f32633c;
    public boolean d;
    public boolean f32634e;
    public final ek0 f32635f;
    public boolean h;
    public boolean f32636n;
    public long f32637r;
    public final ChatActivityEnterView f32638s;

    public wg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32638s = chatActivityEnterView;
        this.f32637r = -1L;
        ek0 ek0Var = new ek0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f32635f = ek0Var;
        ek0Var.f26055o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.jf;
        int i11 = ChatActivityEnterView.f23842n5;
        ChatActivityEnterView chatActivityEnterView = this.f32638s;
        int g02 = chatActivityEnterView.g0(i10);
        int g03 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.Sd);
        int g04 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f20795df);
        chatActivityEnterView.f23973w3.setColor(g02);
        ek0 ek0Var = this.f32635f;
        ek0Var.Z = true;
        ek0Var.Q(g02, "Cup Red");
        ek0Var.Q(g02, "Box Red");
        ek0Var.Q(g04, "Cup Grey");
        ek0Var.Q(g04, "Box Grey");
        ek0Var.Q(g04, "Box_Grey 2");
        ek0Var.Q(g04, "Line 1");
        ek0Var.Q(g04, "Line 2");
        ek0Var.Q(g04, "Line 3");
        ek0Var.Q(g03, "Line 1 Dup");
        ek0Var.Q(g03, "Line 2 Dup");
        ek0Var.Q(g03, "Line 3 Dup");
        ek0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.f32634e;
        ek0 ek0Var = this.f32635f;
        if (z10) {
            ek0Var.start();
        }
        ek0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ek0 ek0Var = this.f32635f;
        ek0Var.stop();
        ek0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32638s.f23973w3;
        boolean z10 = this.f32634e;
        ek0 ek0Var = this.f32635f;
        if (z10) {
            ek0Var.setAlpha((int) (this.f32631a * 255.0f));
        }
        paint.setAlpha((int) (this.f32631a * 255.0f));
        if (!this.f32636n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32632b;
            if (this.h) {
                this.f32631a = 1.0f;
            } else if (!this.f32633c && !this.f32634e) {
                float f7 = this.f32631a - (((float) j3) / 600.0f);
                this.f32631a = f7;
                if (f7 <= 0.0f) {
                    this.f32631a = 0.0f;
                    this.f32633c = true;
                }
            } else {
                float f10 = (((float) j3) / 600.0f) + this.f32631a;
                this.f32631a = f10;
                if (f10 >= 1.0f) {
                    this.f32631a = 1.0f;
                    this.f32633c = false;
                }
            }
            this.f32632b = currentTimeMillis;
        }
        if (this.f32634e) {
            ek0Var.draw(canvas);
        }
        if (!this.f32634e || !ek0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f32636n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32635f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
