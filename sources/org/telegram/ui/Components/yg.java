package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class yg extends View {
    public float f33093a;
    public long f33094b;
    public boolean f33095c;
    public boolean d;
    public boolean f33096e;
    public final fk0 f33097f;
    public boolean h;
    public boolean f33098n;
    public long f33099r;
    public final ChatActivityEnterView f33100s;

    public yg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f33100s = chatActivityEnterView;
        this.f33099r = -1L;
        fk0 fk0Var = new fk0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f33097f = fk0Var;
        fk0Var.f26121o0 = true;
        c();
    }

    public final void a() {
        this.f33096e = true;
        fk0 fk0Var = this.f33097f;
        fk0Var.T(0.0f, true);
        if (this.d) {
            fk0Var.start();
        }
    }

    public final void b() {
        this.f33093a = 1.0f;
        this.f33094b = System.currentTimeMillis();
        this.f33099r = -1L;
        this.f33095c = false;
        this.f33096e = false;
        this.f33097f.stop();
        invalidate();
    }

    public final void c() {
        int i10 = org.telegram.ui.ActionBar.h6.jf;
        int i11 = ChatActivityEnterView.S5;
        ChatActivityEnterView chatActivityEnterView = this.f33100s;
        int j02 = chatActivityEnterView.j0(i10);
        int j03 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.Sd);
        int j04 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20569df);
        chatActivityEnterView.Y3.setColor(j02);
        fk0 fk0Var = this.f33097f;
        fk0Var.Z = true;
        fk0Var.Q(j02, "Cup Red");
        fk0Var.Q(j02, "Box Red");
        fk0Var.Q(j04, "Cup Grey");
        fk0Var.Q(j04, "Box Grey");
        fk0Var.Q(j04, "Box_Grey 2");
        fk0Var.Q(j04, "Line 1");
        fk0Var.Q(j04, "Line 2");
        fk0Var.Q(j04, "Line 3");
        fk0Var.Q(j03, "Line 1 Dup");
        fk0Var.Q(j03, "Line 2 Dup");
        fk0Var.Q(j03, "Line 3 Dup");
        fk0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.f33096e;
        fk0 fk0Var = this.f33097f;
        if (z10) {
            fk0Var.start();
        }
        fk0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        fk0 fk0Var = this.f33097f;
        fk0Var.stop();
        fk0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f33100s.Y3;
        boolean z10 = this.f33096e;
        fk0 fk0Var = this.f33097f;
        if (z10) {
            fk0Var.setAlpha((int) (this.f33093a * 255.0f));
        }
        paint.setAlpha((int) (this.f33093a * 255.0f));
        if (!this.f33098n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f33094b;
            if (this.h) {
                this.f33093a = 1.0f;
            } else if (!this.f33095c && !this.f33096e) {
                float f7 = this.f33093a - (((float) j3) / 600.0f);
                this.f33093a = f7;
                if (f7 <= 0.0f) {
                    this.f33093a = 0.0f;
                    this.f33095c = true;
                }
            } else {
                float f10 = (((float) j3) / 600.0f) + this.f33093a;
                this.f33093a = f10;
                if (f10 >= 1.0f) {
                    this.f33093a = 1.0f;
                    this.f33095c = false;
                }
            }
            this.f33094b = currentTimeMillis;
        }
        if (this.f33096e) {
            fk0Var.draw(canvas);
        }
        if (!this.f33096e || !fk0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f33098n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f33097f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
