package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f33386a;
    public long f33387b;
    public boolean f33388c;
    public boolean d;
    public boolean e;
    public final yj0 f33389f;
    public boolean h;
    public boolean f33390n;
    public long f33391r;
    public final ChatActivityEnterView f33392s;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f33392s = chatActivityEnterView;
        this.f33391r = -1L;
        yj0 yj0Var = new yj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f33389f = yj0Var;
        yj0Var.f35084o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.y6.f23474jf;
        int i11 = ChatActivityEnterView.f25845r5;
        ChatActivityEnterView chatActivityEnterView = this.f33392s;
        int e02 = chatActivityEnterView.e0(i10);
        int e03 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.y6.Sd);
        int e04 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.y6.f23366df);
        chatActivityEnterView.f25979w3.setColor(e02);
        yj0 yj0Var = this.f33389f;
        yj0Var.Z = true;
        yj0Var.Q(e02, "Cup Red");
        yj0Var.Q(e02, "Box Red");
        yj0Var.Q(e04, "Cup Grey");
        yj0Var.Q(e04, "Box Grey");
        yj0Var.Q(e04, "Box_Grey 2");
        yj0Var.Q(e04, "Line 1");
        yj0Var.Q(e04, "Line 2");
        yj0Var.Q(e04, "Line 3");
        yj0Var.Q(e03, "Line 1 Dup");
        yj0Var.Q(e03, "Line 2 Dup");
        yj0Var.Q(e03, "Line 3 Dup");
        yj0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        yj0 yj0Var = this.f33389f;
        if (z10) {
            yj0Var.start();
        }
        yj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        yj0 yj0Var = this.f33389f;
        yj0Var.stop();
        yj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f33392s.f25979w3;
        boolean z10 = this.e;
        yj0 yj0Var = this.f33389f;
        if (z10) {
            yj0Var.setAlpha((int) (this.f33386a * 255.0f));
        }
        paint.setAlpha((int) (this.f33386a * 255.0f));
        if (!this.f33390n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f33387b;
            if (this.h) {
                this.f33386a = 1.0f;
            } else if (!this.f33388c && !this.e) {
                float f7 = this.f33386a - (((float) j10) / 600.0f);
                this.f33386a = f7;
                if (f7 <= 0.0f) {
                    this.f33386a = 0.0f;
                    this.f33388c = true;
                }
            } else {
                float f10 = (((float) j10) / 600.0f) + this.f33386a;
                this.f33386a = f10;
                if (f10 >= 1.0f) {
                    this.f33386a = 1.0f;
                    this.f33388c = false;
                }
            }
            this.f33387b = currentTimeMillis;
        }
        if (this.e) {
            yj0Var.draw(canvas);
        }
        if (!this.e || !yj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f33390n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f33389f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
