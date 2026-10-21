package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f30923a;
    public long f30924b;
    public boolean f30925c;
    public boolean d;
    public boolean e;
    public final vj0 f30926f;
    public boolean h;
    public boolean f30927n;
    public long f30928r;
    public final ChatActivityEnterView f30929s;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f30929s = chatActivityEnterView;
        this.f30928r = -1L;
        vj0 vj0Var = new vj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f30926f = vj0Var;
        vj0Var.f31282o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f21106jf;
        int i11 = ChatActivityEnterView.f23908n5;
        ChatActivityEnterView chatActivityEnterView = this.f30929s;
        int g02 = chatActivityEnterView.g0(i10);
        int g03 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.Sd);
        int g04 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f20997df);
        chatActivityEnterView.f24039w3.setColor(g02);
        vj0 vj0Var = this.f30926f;
        vj0Var.Z = true;
        vj0Var.Q(g02, "Cup Red");
        vj0Var.Q(g02, "Box Red");
        vj0Var.Q(g04, "Cup Grey");
        vj0Var.Q(g04, "Box Grey");
        vj0Var.Q(g04, "Box_Grey 2");
        vj0Var.Q(g04, "Line 1");
        vj0Var.Q(g04, "Line 2");
        vj0Var.Q(g04, "Line 3");
        vj0Var.Q(g03, "Line 1 Dup");
        vj0Var.Q(g03, "Line 2 Dup");
        vj0Var.Q(g03, "Line 3 Dup");
        vj0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        vj0 vj0Var = this.f30926f;
        if (z10) {
            vj0Var.start();
        }
        vj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        vj0 vj0Var = this.f30926f;
        vj0Var.stop();
        vj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f30929s.f24039w3;
        boolean z10 = this.e;
        vj0 vj0Var = this.f30926f;
        if (z10) {
            vj0Var.setAlpha((int) (this.f30923a * 255.0f));
        }
        paint.setAlpha((int) (this.f30923a * 255.0f));
        if (!this.f30927n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f30924b;
            if (this.h) {
                this.f30923a = 1.0f;
            } else if (!this.f30925c && !this.e) {
                float f7 = this.f30923a - (((float) j10) / 600.0f);
                this.f30923a = f7;
                if (f7 <= 0.0f) {
                    this.f30923a = 0.0f;
                    this.f30925c = true;
                }
            } else {
                float f10 = (((float) j10) / 600.0f) + this.f30923a;
                this.f30923a = f10;
                if (f10 >= 1.0f) {
                    this.f30923a = 1.0f;
                    this.f30925c = false;
                }
            }
            this.f30924b = currentTimeMillis;
        }
        if (this.e) {
            vj0Var.draw(canvas);
        }
        if (!this.e || !vj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f30927n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f30926f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
