package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class kg extends View {
    public float f30070a;
    public long f30071b;
    public boolean f30072c;
    public boolean d;
    public boolean f30073e;
    public final mi0 f30074f;
    public boolean h;
    public final ChatActivityEnterView f30075n;

    public kg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f30075n = chatActivityEnterView;
        int i9 = R.raw.chat_audio_record_delete_2;
        mi0 mi0Var = new mi0(i9, j3.r0.l(i9, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f30074f = mi0Var;
        mi0Var.f30856l0 = true;
        a();
    }

    public final void a() {
        int i9 = org.telegram.ui.ActionBar.f6.f23117jf;
        int i10 = ChatActivityEnterView.f26074i5;
        ChatActivityEnterView chatActivityEnterView = this.f30075n;
        int h02 = chatActivityEnterView.h0(i9);
        int h03 = chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.Sd);
        chatActivityEnterView.f26174r3.setColor(h02);
        mi0 mi0Var = this.f30074f;
        mi0Var.W = true;
        mi0Var.O(h02, "Cup Red");
        mi0Var.O(h02, "Box");
        mi0Var.O(h03, "Line 1");
        mi0Var.O(h03, "Line 2");
        mi0Var.O(h03, "Line 3");
        mi0Var.m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.f30073e;
        mi0 mi0Var = this.f30074f;
        if (z10) {
            mi0Var.start();
        }
        mi0Var.f30863r0 = this;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        mi0 mi0Var = this.f30074f;
        mi0Var.stop();
        mi0Var.f30863r0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f30075n.f26174r3;
        boolean z10 = this.f30073e;
        mi0 mi0Var = this.f30074f;
        if (z10) {
            mi0Var.setAlpha((int) (this.f30070a * 255.0f));
        }
        paint.setAlpha((int) (this.f30070a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f30071b;
        if (this.h) {
            this.f30070a = 1.0f;
        } else if (!this.f30072c && !this.f30073e) {
            float f10 = this.f30070a - (((float) currentTimeMillis) / 600.0f);
            this.f30070a = f10;
            if (f10 <= 0.0f) {
                this.f30070a = 0.0f;
                this.f30072c = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f30070a;
            this.f30070a = f11;
            if (f11 >= 1.0f) {
                this.f30070a = 1.0f;
                this.f30072c = false;
            }
        }
        this.f30071b = System.currentTimeMillis();
        if (this.f30073e) {
            mi0Var.draw(canvas);
        }
        if (!this.f30073e || !mi0Var.s()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.f30074f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
