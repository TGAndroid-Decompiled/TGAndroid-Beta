package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.rk;
import org.telegram.ui.i60;
import org.telegram.ui.o60;
public abstract class l extends FrameLayout {
    public int f29407a;
    public o60 f29408b;
    public u f29409c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f29410f;

    public l(Context context, boolean z10) {
        super(context);
        this.f29410f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        o60 o60Var = this.f29408b;
        if (o60Var != null) {
            measuredHeight = o60Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public u getRenderer() {
        return this.f29409c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        float f10;
        if (this.f29410f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f29408b.F(), 1073741824));
            return;
        }
        if (i60.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int B = rk.B(14.0f, 2, AndroidUtilities.displaySize.x);
        if (i60.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = B + i12;
        if (i60.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(u uVar) {
        this.f29409c = uVar;
    }
}
