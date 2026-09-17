package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.wl;
import org.telegram.ui.k60;
import org.telegram.ui.q60;
public abstract class l extends FrameLayout {
    public int f29019a;
    public q60 f29020b;
    public u f29021c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f29022f;

    public l(Context context, boolean z10) {
        super(context);
        this.f29022f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        q60 q60Var = this.f29020b;
        if (q60Var != null) {
            measuredHeight = q60Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public u getRenderer() {
        return this.f29021c;
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
        if (this.f29022f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f29020b.F(), 1073741824));
            return;
        }
        if (k60.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int A = wl.A(14.0f, 2, AndroidUtilities.displaySize.x);
        if (k60.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = A + i12;
        if (k60.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(u uVar) {
        this.f29021c = uVar;
    }
}
