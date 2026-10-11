package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class wg extends View {
    public float f32692a;
    public long f32693b;
    public boolean f32694c;
    public boolean d;
    public boolean f32695e;
    public final dk0 f32696f;
    public boolean h;
    public boolean f32697n;
    public long f32698r;
    public final ChatActivityEnterView f32699s;

    public wg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32699s = chatActivityEnterView;
        this.f32698r = -1L;
        dk0 dk0Var = new dk0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f32696f = dk0Var;
        dk0Var.f25822o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.jf;
        int i11 = ChatActivityEnterView.f23878n5;
        ChatActivityEnterView chatActivityEnterView = this.f32699s;
        int g02 = chatActivityEnterView.g0(i10);
        int g03 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.Sd);
        int g04 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f20831df);
        chatActivityEnterView.f24009w3.setColor(g02);
        dk0 dk0Var = this.f32696f;
        dk0Var.Z = true;
        dk0Var.Q(g02, "Cup Red");
        dk0Var.Q(g02, "Box Red");
        dk0Var.Q(g04, "Cup Grey");
        dk0Var.Q(g04, "Box Grey");
        dk0Var.Q(g04, "Box_Grey 2");
        dk0Var.Q(g04, "Line 1");
        dk0Var.Q(g04, "Line 2");
        dk0Var.Q(g04, "Line 3");
        dk0Var.Q(g03, "Line 1 Dup");
        dk0Var.Q(g03, "Line 2 Dup");
        dk0Var.Q(g03, "Line 3 Dup");
        dk0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.f32695e;
        dk0 dk0Var = this.f32696f;
        if (z10) {
            dk0Var.start();
        }
        dk0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        dk0 dk0Var = this.f32696f;
        dk0Var.stop();
        dk0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32699s.f24009w3;
        boolean z10 = this.f32695e;
        dk0 dk0Var = this.f32696f;
        if (z10) {
            dk0Var.setAlpha((int) (this.f32692a * 255.0f));
        }
        paint.setAlpha((int) (this.f32692a * 255.0f));
        if (!this.f32697n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32693b;
            if (this.h) {
                this.f32692a = 1.0f;
            } else if (!this.f32694c && !this.f32695e) {
                float f7 = this.f32692a - (((float) j3) / 600.0f);
                this.f32692a = f7;
                if (f7 <= 0.0f) {
                    this.f32692a = 0.0f;
                    this.f32694c = true;
                }
            } else {
                float f10 = (((float) j3) / 600.0f) + this.f32692a;
                this.f32692a = f10;
                if (f10 >= 1.0f) {
                    this.f32692a = 1.0f;
                    this.f32694c = false;
                }
            }
            this.f32693b = currentTimeMillis;
        }
        if (this.f32695e) {
            dk0Var.draw(canvas);
        }
        if (!this.f32695e || !dk0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f32697n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32696f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
