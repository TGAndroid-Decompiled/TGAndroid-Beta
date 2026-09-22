package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class sg extends View {
    public float f27847a;
    public long f27848b;
    public boolean f27849c;
    public boolean d;
    public boolean e;
    public final xi0 f27850f;
    public boolean h;
    public final ChatActivityEnterView f27851n;

    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f27851n = chatActivityEnterView;
        xi0 xi0Var = new xi0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f27850f = xi0Var;
        xi0Var.f29960o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.i6.f18950jf;
        int i11 = ChatActivityEnterView.f21727n5;
        ChatActivityEnterView chatActivityEnterView = this.f27851n;
        int j02 = chatActivityEnterView.j0(i10);
        int j03 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.i6.Sd);
        int j04 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.i6.f18843df);
        chatActivityEnterView.f21851v3.setColor(j02);
        xi0 xi0Var = this.f27850f;
        xi0Var.Z = true;
        xi0Var.Q(j02, "Cup Red");
        xi0Var.Q(j02, "Box Red");
        xi0Var.Q(j04, "Cup Grey");
        xi0Var.Q(j04, "Box Grey");
        xi0Var.Q(j04, "Box_Grey 2");
        xi0Var.Q(j04, "Line 1");
        xi0Var.Q(j04, "Line 2");
        xi0Var.Q(j04, "Line 3");
        xi0Var.Q(j03, "Line 1 Dup");
        xi0Var.Q(j03, "Line 2 Dup");
        xi0Var.Q(j03, "Line 3 Dup");
        xi0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        xi0 xi0Var = this.f27850f;
        if (z10) {
            xi0Var.start();
        }
        xi0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        xi0 xi0Var = this.f27850f;
        xi0Var.stop();
        xi0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f27851n.f21851v3;
        boolean z10 = this.e;
        xi0 xi0Var = this.f27850f;
        if (z10) {
            xi0Var.setAlpha((int) (this.f27847a * 255.0f));
        }
        paint.setAlpha((int) (this.f27847a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f27848b;
        if (this.h) {
            this.f27847a = 1.0f;
        } else if (!this.f27849c && !this.e) {
            float f7 = this.f27847a - (((float) currentTimeMillis) / 600.0f);
            this.f27847a = f7;
            if (f7 <= 0.0f) {
                this.f27847a = 0.0f;
                this.f27849c = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f27847a;
            this.f27847a = f10;
            if (f10 >= 1.0f) {
                this.f27847a = 1.0f;
                this.f27849c = false;
            }
        }
        this.f27848b = System.currentTimeMillis();
        if (this.e) {
            xi0Var.draw(canvas);
        }
        if (!this.e || !xi0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f27850f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
