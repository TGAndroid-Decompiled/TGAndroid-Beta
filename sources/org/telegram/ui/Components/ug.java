package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f33393a;
    public long f33394b;
    public boolean f33395c;
    public boolean d;
    public boolean e;
    public final xj0 f33396f;
    public boolean h;
    public boolean f33397n;
    public long f33398r;
    public final ChatActivityEnterView f33399s;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f33399s = chatActivityEnterView;
        this.f33398r = -1L;
        xj0 xj0Var = new xj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f33396f = xj0Var;
        xj0Var.f34750o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.y6.f23471jf;
        int i11 = ChatActivityEnterView.f25841r5;
        ChatActivityEnterView chatActivityEnterView = this.f33399s;
        int f02 = chatActivityEnterView.f0(i10);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.Sd);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.f23363df);
        chatActivityEnterView.f25975w3.setColor(f02);
        xj0 xj0Var = this.f33396f;
        xj0Var.Z = true;
        xj0Var.Q(f02, "Cup Red");
        xj0Var.Q(f02, "Box Red");
        xj0Var.Q(f04, "Cup Grey");
        xj0Var.Q(f04, "Box Grey");
        xj0Var.Q(f04, "Box_Grey 2");
        xj0Var.Q(f04, "Line 1");
        xj0Var.Q(f04, "Line 2");
        xj0Var.Q(f04, "Line 3");
        xj0Var.Q(f03, "Line 1 Dup");
        xj0Var.Q(f03, "Line 2 Dup");
        xj0Var.Q(f03, "Line 3 Dup");
        xj0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        xj0 xj0Var = this.f33396f;
        if (z10) {
            xj0Var.start();
        }
        xj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        xj0 xj0Var = this.f33396f;
        xj0Var.stop();
        xj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f33399s.f25975w3;
        boolean z10 = this.e;
        xj0 xj0Var = this.f33396f;
        if (z10) {
            xj0Var.setAlpha((int) (this.f33393a * 255.0f));
        }
        paint.setAlpha((int) (this.f33393a * 255.0f));
        if (!this.f33397n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f33394b;
            if (this.h) {
                this.f33393a = 1.0f;
            } else if (!this.f33395c && !this.e) {
                float f7 = this.f33393a - (((float) j10) / 600.0f);
                this.f33393a = f7;
                if (f7 <= 0.0f) {
                    this.f33393a = 0.0f;
                    this.f33395c = true;
                }
            } else {
                float f10 = (((float) j10) / 600.0f) + this.f33393a;
                this.f33393a = f10;
                if (f10 >= 1.0f) {
                    this.f33393a = 1.0f;
                    this.f33395c = false;
                }
            }
            this.f33394b = currentTimeMillis;
        }
        if (this.e) {
            xj0Var.draw(canvas);
        }
        if (!this.e || !xj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f33397n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f33396f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
