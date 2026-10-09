package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class wg extends View {
    public float f32610a;
    public long f32611b;
    public boolean f32612c;
    public boolean d;
    public boolean f32613e;
    public final ck0 f32614f;
    public boolean h;
    public boolean f32615n;
    public long f32616r;
    public final ChatActivityEnterView f32617s;

    public wg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32617s = chatActivityEnterView;
        this.f32616r = -1L;
        ck0 ck0Var = new ck0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f32614f = ck0Var;
        ck0Var.f25413o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.i6.jf;
        int i11 = ChatActivityEnterView.f23850n5;
        ChatActivityEnterView chatActivityEnterView = this.f32617s;
        int g02 = chatActivityEnterView.g0(i10);
        int g03 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.Sd);
        int g04 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.f20806df);
        chatActivityEnterView.f23981w3.setColor(g02);
        ck0 ck0Var = this.f32614f;
        ck0Var.Z = true;
        ck0Var.Q(g02, "Cup Red");
        ck0Var.Q(g02, "Box Red");
        ck0Var.Q(g04, "Cup Grey");
        ck0Var.Q(g04, "Box Grey");
        ck0Var.Q(g04, "Box_Grey 2");
        ck0Var.Q(g04, "Line 1");
        ck0Var.Q(g04, "Line 2");
        ck0Var.Q(g04, "Line 3");
        ck0Var.Q(g03, "Line 1 Dup");
        ck0Var.Q(g03, "Line 2 Dup");
        ck0Var.Q(g03, "Line 3 Dup");
        ck0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.f32613e;
        ck0 ck0Var = this.f32614f;
        if (z10) {
            ck0Var.start();
        }
        ck0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ck0 ck0Var = this.f32614f;
        ck0Var.stop();
        ck0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32617s.f23981w3;
        boolean z10 = this.f32613e;
        ck0 ck0Var = this.f32614f;
        if (z10) {
            ck0Var.setAlpha((int) (this.f32610a * 255.0f));
        }
        paint.setAlpha((int) (this.f32610a * 255.0f));
        if (!this.f32615n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32611b;
            if (this.h) {
                this.f32610a = 1.0f;
            } else if (!this.f32612c && !this.f32613e) {
                float f7 = this.f32610a - (((float) j3) / 600.0f);
                this.f32610a = f7;
                if (f7 <= 0.0f) {
                    this.f32610a = 0.0f;
                    this.f32612c = true;
                }
            } else {
                float f10 = (((float) j3) / 600.0f) + this.f32610a;
                this.f32610a = f10;
                if (f10 >= 1.0f) {
                    this.f32610a = 1.0f;
                    this.f32612c = false;
                }
            }
            this.f32611b = currentTimeMillis;
        }
        if (this.f32613e) {
            ck0Var.draw(canvas);
        }
        if (!this.f32613e || !ck0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f32615n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32614f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
