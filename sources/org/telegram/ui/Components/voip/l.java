package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.nk;
import org.telegram.ui.q50;
import org.telegram.ui.w50;
public abstract class l extends FrameLayout {
    public int f31513a;
    public w50 f31514b;
    public t f31515c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f31516f;

    public l(Context context, boolean z10) {
        super(context);
        this.f31516f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        w50 w50Var = this.f31514b;
        if (w50Var != null) {
            measuredHeight = w50Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public t getRenderer() {
        return this.f31515c;
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
        if (this.f31516f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f31514b.F(), 1073741824));
            return;
        }
        if (q50.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int B = nk.B(14.0f, 2, AndroidUtilities.displaySize.x);
        if (q50.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = B + i12;
        if (q50.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(t tVar) {
        this.f31515c = tVar;
    }
}
