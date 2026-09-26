package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ug extends View {
    public float f28783a;
    public long f28784b;
    public boolean f28785c;
    public boolean d;
    public boolean e;
    public final ij0 f28786f;
    public boolean h;
    public boolean f28787n;
    public long f28788r;
    public final ChatActivityEnterView f28789s;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f28789s = chatActivityEnterView;
        this.f28788r = -1L;
        ij0 ij0Var = new ij0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f28786f = ij0Var;
        ij0Var.f25085o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f19175jf;
        int i11 = ChatActivityEnterView.f21952n5;
        ChatActivityEnterView chatActivityEnterView = this.f28789s;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.Sd);
        int i04 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.f19068df);
        chatActivityEnterView.f22082w3.setColor(i02);
        ij0 ij0Var = this.f28786f;
        ij0Var.Z = true;
        ij0Var.Q(i02, "Cup Red");
        ij0Var.Q(i02, "Box Red");
        ij0Var.Q(i04, "Cup Grey");
        ij0Var.Q(i04, "Box Grey");
        ij0Var.Q(i04, "Box_Grey 2");
        ij0Var.Q(i04, "Line 1");
        ij0Var.Q(i04, "Line 2");
        ij0Var.Q(i04, "Line 3");
        ij0Var.Q(i03, "Line 1 Dup");
        ij0Var.Q(i03, "Line 2 Dup");
        ij0Var.Q(i03, "Line 3 Dup");
        ij0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        ij0 ij0Var = this.f28786f;
        if (z10) {
            ij0Var.start();
        }
        ij0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ij0 ij0Var = this.f28786f;
        ij0Var.stop();
        ij0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28789s.f22082w3;
        boolean z10 = this.e;
        ij0 ij0Var = this.f28786f;
        if (z10) {
            ij0Var.setAlpha((int) (this.f28783a * 255.0f));
        }
        paint.setAlpha((int) (this.f28783a * 255.0f));
        if (!this.f28787n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f28784b;
            if (this.h) {
                this.f28783a = 1.0f;
            } else if (!this.f28785c && !this.e) {
                float f7 = this.f28783a - (((float) j3) / 600.0f);
                this.f28783a = f7;
                if (f7 <= 0.0f) {
                    this.f28783a = 0.0f;
                    this.f28785c = true;
                }
            } else {
                float f10 = (((float) j3) / 600.0f) + this.f28783a;
                this.f28783a = f10;
                if (f10 >= 1.0f) {
                    this.f28783a = 1.0f;
                    this.f28785c = false;
                }
            }
            this.f28784b = currentTimeMillis;
        }
        if (this.e) {
            ij0Var.draw(canvas);
        }
        if (!this.e || !ij0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        if (!this.f28787n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28786f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
