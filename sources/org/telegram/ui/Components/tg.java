package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class tg extends View {
    public float f28185a;
    public long f28186b;
    public boolean f28187c;
    public boolean d;
    public boolean e;
    public final yi0 f28188f;
    public boolean h;
    public final ChatActivityEnterView f28189n;

    public tg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f28189n = chatActivityEnterView;
        yi0 yi0Var = new yi0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f28188f = yi0Var;
        yi0Var.f30275o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f18905jf;
        int i11 = ChatActivityEnterView.f21701n5;
        ChatActivityEnterView chatActivityEnterView = this.f28189n;
        int j02 = chatActivityEnterView.j0(i10);
        int j03 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.Sd);
        int j04 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f18798df);
        chatActivityEnterView.f21825v3.setColor(j02);
        yi0 yi0Var = this.f28188f;
        yi0Var.Z = true;
        yi0Var.Q(j02, "Cup Red");
        yi0Var.Q(j02, "Box Red");
        yi0Var.Q(j04, "Cup Grey");
        yi0Var.Q(j04, "Box Grey");
        yi0Var.Q(j04, "Box_Grey 2");
        yi0Var.Q(j04, "Line 1");
        yi0Var.Q(j04, "Line 2");
        yi0Var.Q(j04, "Line 3");
        yi0Var.Q(j03, "Line 1 Dup");
        yi0Var.Q(j03, "Line 2 Dup");
        yi0Var.Q(j03, "Line 3 Dup");
        yi0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        yi0 yi0Var = this.f28188f;
        if (z10) {
            yi0Var.start();
        }
        yi0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        yi0 yi0Var = this.f28188f;
        yi0Var.stop();
        yi0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28189n.f21825v3;
        boolean z10 = this.e;
        yi0 yi0Var = this.f28188f;
        if (z10) {
            yi0Var.setAlpha((int) (this.f28185a * 255.0f));
        }
        paint.setAlpha((int) (this.f28185a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f28186b;
        if (this.h) {
            this.f28185a = 1.0f;
        } else if (!this.f28187c && !this.e) {
            float f7 = this.f28185a - (((float) currentTimeMillis) / 600.0f);
            this.f28185a = f7;
            if (f7 <= 0.0f) {
                this.f28185a = 0.0f;
                this.f28187c = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f28185a;
            this.f28185a = f10;
            if (f10 >= 1.0f) {
                this.f28185a = 1.0f;
                this.f28187c = false;
            }
        }
        this.f28186b = System.currentTimeMillis();
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
        this.f28188f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
