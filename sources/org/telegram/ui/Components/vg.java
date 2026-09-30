package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class vg extends View {
    public float f29110a;
    public long f29111b;
    public boolean f29112c;
    public boolean d;
    public boolean e;
    public final lj0 f29113f;
    public boolean h;
    public boolean f29114n;
    public long f29115r;
    public final ChatActivityEnterView f29116s;

    public vg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f29116s = chatActivityEnterView;
        this.f29115r = -1L;
        lj0 lj0Var = new lj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f29113f = lj0Var;
        lj0Var.f26025o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f19192jf;
        int i11 = ChatActivityEnterView.f21974n5;
        ChatActivityEnterView chatActivityEnterView = this.f29116s;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.Sd);
        int i04 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.f19085df);
        chatActivityEnterView.f22104w3.setColor(i02);
        lj0 lj0Var = this.f29113f;
        lj0Var.Z = true;
        lj0Var.Q(i02, "Cup Red");
        lj0Var.Q(i02, "Box Red");
        lj0Var.Q(i04, "Cup Grey");
        lj0Var.Q(i04, "Box Grey");
        lj0Var.Q(i04, "Box_Grey 2");
        lj0Var.Q(i04, "Line 1");
        lj0Var.Q(i04, "Line 2");
        lj0Var.Q(i04, "Line 3");
        lj0Var.Q(i03, "Line 1 Dup");
        lj0Var.Q(i03, "Line 2 Dup");
        lj0Var.Q(i03, "Line 3 Dup");
        lj0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        lj0 lj0Var = this.f29113f;
        if (z10) {
            lj0Var.start();
        }
        lj0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        lj0 lj0Var = this.f29113f;
        lj0Var.stop();
        lj0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f29116s.f22104w3;
        boolean z10 = this.e;
        lj0 lj0Var = this.f29113f;
        if (z10) {
            lj0Var.setAlpha((int) (this.f29110a * 255.0f));
        }
        paint.setAlpha((int) (this.f29110a * 255.0f));
        if (!this.f29114n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f29111b;
            if (this.h) {
                this.f29110a = 1.0f;
            } else if (!this.f29112c && !this.e) {
                float f7 = this.f29110a - (((float) j3) / 600.0f);
                this.f29110a = f7;
                if (f7 <= 0.0f) {
                    this.f29110a = 0.0f;
                    this.f29112c = true;
                }
            } else {
                float f10 = (((float) j3) / 600.0f) + this.f29110a;
                this.f29110a = f10;
                if (f10 >= 1.0f) {
                    this.f29110a = 1.0f;
                    this.f29112c = false;
                }
            }
            this.f29111b = currentTimeMillis;
        }
        if (this.e) {
            lj0Var.draw(canvas);
        }
        if (!this.e || !lj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f29114n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29113f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
