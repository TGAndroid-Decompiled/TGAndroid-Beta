package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class kg extends View {
    public float f26264a;
    public long f26265b;
    public boolean f26266c;
    public boolean d;
    public boolean e;
    public final gj0 f26267f;
    public boolean h;
    public final ChatActivityEnterView f26268n;

    public kg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f26268n = chatActivityEnterView;
        int i10 = R.raw.chat_audio_record_delete_2;
        gj0 gj0Var = new gj0(i10, kh.a2.j(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f26267f = gj0Var;
        gj0Var.m0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.f20021jf;
        int i11 = ChatActivityEnterView.f22729j5;
        ChatActivityEnterView chatActivityEnterView = this.f26268n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Sd);
        chatActivityEnterView.f22835s3.setColor(i02);
        gj0 gj0Var = this.f26267f;
        gj0Var.X = true;
        gj0Var.O(i02, "Cup Red");
        gj0Var.O(i02, "Box");
        gj0Var.O(i03, "Line 1");
        gj0Var.O(i03, "Line 2");
        gj0Var.O(i03, "Line 3");
        gj0Var.m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z4 = this.e;
        gj0 gj0Var = this.f26267f;
        if (z4) {
            gj0Var.start();
        }
        gj0Var.f25170s0 = this;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        gj0 gj0Var = this.f26267f;
        gj0Var.stop();
        gj0Var.f25170s0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f26268n.f22835s3;
        boolean z4 = this.e;
        gj0 gj0Var = this.f26267f;
        if (z4) {
            gj0Var.setAlpha((int) (this.f26264a * 255.0f));
        }
        paint.setAlpha((int) (this.f26264a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f26265b;
        if (this.h) {
            this.f26264a = 1.0f;
        } else if (!this.f26266c && !this.e) {
            float f10 = this.f26264a - (((float) currentTimeMillis) / 600.0f);
            this.f26264a = f10;
            if (f10 <= 0.0f) {
                this.f26264a = 0.0f;
                this.f26266c = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f26264a;
            this.f26264a = f11;
            if (f11 >= 1.0f) {
                this.f26264a = 1.0f;
                this.f26266c = false;
            }
        }
        this.f26265b = System.currentTimeMillis();
        if (this.e) {
            gj0Var.draw(canvas);
        }
        if (!this.e || !gj0Var.s()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f26267f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
