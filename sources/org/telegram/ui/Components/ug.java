package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f30881a;
    public long f30882b;
    public boolean f30883c;
    public boolean d;
    public boolean f30884e;
    public final xi0 f30885f;
    public boolean h;
    public final ChatActivityEnterView f30886n;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f30886n = chatActivityEnterView;
        xi0 xi0Var = new xi0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f30885f = xi0Var;
        xi0Var.f32570p0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.f20780jf;
        int i11 = ChatActivityEnterView.f23661m5;
        ChatActivityEnterView chatActivityEnterView = this.f30886n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Sd);
        chatActivityEnterView.f23785v3.setColor(i02);
        xi0 xi0Var = this.f30885f;
        xi0Var.f32551a0 = true;
        xi0Var.O(i02, "Cup Red");
        xi0Var.O(i02, "Box");
        xi0Var.O(i03, "Line 1");
        xi0Var.O(i03, "Line 2");
        xi0Var.O(i03, "Line 3");
        xi0Var.m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.f30884e;
        xi0 xi0Var = this.f30885f;
        if (z10) {
            xi0Var.start();
        }
        xi0Var.f32578v0 = this;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        xi0 xi0Var = this.f30885f;
        xi0Var.stop();
        xi0Var.f32578v0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f30886n.f23785v3;
        boolean z10 = this.f30884e;
        xi0 xi0Var = this.f30885f;
        if (z10) {
            xi0Var.setAlpha((int) (this.f30881a * 255.0f));
        }
        paint.setAlpha((int) (this.f30881a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f30882b;
        if (this.h) {
            this.f30881a = 1.0f;
        } else if (!this.f30883c && !this.f30884e) {
            float f7 = this.f30881a - (((float) currentTimeMillis) / 600.0f);
            this.f30881a = f7;
            if (f7 <= 0.0f) {
                this.f30881a = 0.0f;
                this.f30883c = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f30881a;
            this.f30881a = f10;
            if (f10 >= 1.0f) {
                this.f30881a = 1.0f;
                this.f30883c = false;
            }
        }
        this.f30882b = System.currentTimeMillis();
        if (this.f30884e) {
            xi0Var.draw(canvas);
        }
        if (!this.f30884e || !xi0Var.s()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f30885f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
