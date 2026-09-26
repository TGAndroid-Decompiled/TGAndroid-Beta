package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f28805a;
    public long f28806b;
    public boolean f28807c;
    public boolean d;
    public boolean e;
    public final jj0 f28808f;
    public boolean h;
    public boolean f28809n;
    public long f28810r;
    public final ChatActivityEnterView f28811s;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f28811s = chatActivityEnterView;
        this.f28810r = -1L;
        jj0 jj0Var = new jj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f28808f = jj0Var;
        jj0Var.f25439o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f19175jf;
        int i11 = ChatActivityEnterView.f21952n5;
        ChatActivityEnterView chatActivityEnterView = this.f28811s;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.Sd);
        int i04 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.f19068df);
        chatActivityEnterView.f22082w3.setColor(i02);
        jj0 jj0Var = this.f28808f;
        jj0Var.Z = true;
        jj0Var.Q(i02, "Cup Red");
        jj0Var.Q(i02, "Box Red");
        jj0Var.Q(i04, "Cup Grey");
        jj0Var.Q(i04, "Box Grey");
        jj0Var.Q(i04, "Box_Grey 2");
        jj0Var.Q(i04, "Line 1");
        jj0Var.Q(i04, "Line 2");
        jj0Var.Q(i04, "Line 3");
        jj0Var.Q(i03, "Line 1 Dup");
        jj0Var.Q(i03, "Line 2 Dup");
        jj0Var.Q(i03, "Line 3 Dup");
        jj0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        jj0 jj0Var = this.f28808f;
        if (z10) {
            jj0Var.start();
        }
        jj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        jj0 jj0Var = this.f28808f;
        jj0Var.stop();
        jj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28811s.f22082w3;
        boolean z10 = this.e;
        jj0 jj0Var = this.f28808f;
        if (z10) {
            jj0Var.setAlpha((int) (this.f28805a * 255.0f));
        }
        paint.setAlpha((int) (this.f28805a * 255.0f));
        if (!this.f28809n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f28806b;
            if (this.h) {
                this.f28805a = 1.0f;
            } else if (!this.f28807c && !this.e) {
                float f7 = this.f28805a - (((float) j3) / 600.0f);
                this.f28805a = f7;
                if (f7 <= 0.0f) {
                    this.f28805a = 0.0f;
                    this.f28807c = true;
                }
            } else {
                float f10 = (((float) j3) / 600.0f) + this.f28805a;
                this.f28805a = f10;
                if (f10 >= 1.0f) {
                    this.f28805a = 1.0f;
                    this.f28807c = false;
                }
            }
            this.f28806b = currentTimeMillis;
        }
        if (this.e) {
            jj0Var.draw(canvas);
        }
        if (!this.e || !jj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f28809n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28808f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
