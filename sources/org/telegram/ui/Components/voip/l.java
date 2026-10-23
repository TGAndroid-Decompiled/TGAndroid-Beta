package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.sl;
import org.telegram.ui.a60;
import org.telegram.ui.u50;
public abstract class l extends FrameLayout {
    public int f31694a;
    public a60 f31695b;
    public t f31696c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f31697f;

    public l(Context context, boolean z10) {
        super(context);
        this.f31697f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        a60 a60Var = this.f31695b;
        if (a60Var != null) {
            measuredHeight = a60Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public t getRenderer() {
        return this.f31696c;
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
        if (this.f31697f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f31695b.F(), 1073741824));
            return;
        }
        if (u50.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int B = sl.B(14.0f, 2, AndroidUtilities.displaySize.x);
        if (u50.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = B + i12;
        if (u50.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(t tVar) {
        this.f31696c = tVar;
    }
}
