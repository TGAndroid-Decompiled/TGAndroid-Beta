package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class sg extends View {
    public float f27857a;
    public long f27858b;
    public boolean f27859c;
    public boolean d;
    public boolean e;
    public final yi0 f27860f;
    public boolean h;
    public final ChatActivityEnterView f27861n;

    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f27861n = chatActivityEnterView;
        yi0 yi0Var = new yi0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f27860f = yi0Var;
        yi0Var.f30239o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.f18980jf;
        int i11 = ChatActivityEnterView.f21743n5;
        ChatActivityEnterView chatActivityEnterView = this.f27861n;
        int j02 = chatActivityEnterView.j0(i10);
        int j03 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.j6.Sd);
        chatActivityEnterView.f21867v3.setColor(j02);
        yi0 yi0Var = this.f27860f;
        yi0Var.Z = true;
        yi0Var.Q(j02, "Cup Red");
        yi0Var.Q(j02, "Box");
        yi0Var.Q(j03, "Line 1");
        yi0Var.Q(j03, "Line 2");
        yi0Var.Q(j03, "Line 3");
        yi0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        yi0 yi0Var = this.f27860f;
        if (z10) {
            yi0Var.start();
        }
        yi0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        yi0 yi0Var = this.f27860f;
        yi0Var.stop();
        yi0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f27861n.f21867v3;
        boolean z10 = this.e;
        yi0 yi0Var = this.f27860f;
        if (z10) {
            yi0Var.setAlpha((int) (this.f27857a * 255.0f));
        }
        paint.setAlpha((int) (this.f27857a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f27858b;
        if (this.h) {
            this.f27857a = 1.0f;
        } else if (!this.f27859c && !this.e) {
            float f7 = this.f27857a - (((float) currentTimeMillis) / 600.0f);
            this.f27857a = f7;
            if (f7 <= 0.0f) {
                this.f27857a = 0.0f;
                this.f27859c = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f27857a;
            this.f27857a = f10;
            if (f10 >= 1.0f) {
                this.f27857a = 1.0f;
                this.f27859c = false;
            }
        }
        this.f27858b = System.currentTimeMillis();
        if (this.e) {
            yi0Var.draw(canvas);
        }
        if (!this.e || !yi0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f27860f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
