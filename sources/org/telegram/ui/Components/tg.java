package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class tg extends View {
    public float f28381a;
    public long f28382b;
    public boolean f28383c;
    public boolean d;
    public boolean e;
    public final ij0 f28384f;
    public boolean h;
    public final ChatActivityEnterView f28385n;

    public tg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f28385n = chatActivityEnterView;
        ij0 ij0Var = new ij0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f28384f = ij0Var;
        ij0Var.f24989o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.f19179jf;
        int i11 = ChatActivityEnterView.f21917m5;
        ChatActivityEnterView chatActivityEnterView = this.f28385n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Sd);
        chatActivityEnterView.f22040v3.setColor(i02);
        ij0 ij0Var = this.f28384f;
        ij0Var.Z = true;
        ij0Var.Q(i02, "Cup Red");
        ij0Var.Q(i02, "Box");
        ij0Var.Q(i03, "Line 1");
        ij0Var.Q(i03, "Line 2");
        ij0Var.Q(i03, "Line 3");
        ij0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        ij0 ij0Var = this.f28384f;
        if (z10) {
            ij0Var.start();
        }
        ij0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ij0 ij0Var = this.f28384f;
        ij0Var.stop();
        ij0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28385n.f22040v3;
        boolean z10 = this.e;
        ij0 ij0Var = this.f28384f;
        if (z10) {
            ij0Var.setAlpha((int) (this.f28381a * 255.0f));
        }
        paint.setAlpha((int) (this.f28381a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f28382b;
        if (this.h) {
            this.f28381a = 1.0f;
        } else if (!this.f28383c && !this.e) {
            float f7 = this.f28381a - (((float) currentTimeMillis) / 600.0f);
            this.f28381a = f7;
            if (f7 <= 0.0f) {
                this.f28381a = 0.0f;
                this.f28383c = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f28381a;
            this.f28381a = f10;
            if (f10 >= 1.0f) {
                this.f28381a = 1.0f;
                this.f28383c = false;
            }
        }
        this.f28382b = System.currentTimeMillis();
        if (this.e) {
            ij0Var.draw(canvas);
        }
        if (!this.e || !ij0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28384f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
