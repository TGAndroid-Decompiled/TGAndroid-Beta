package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.kk;
import org.telegram.ui.q50;
import org.telegram.ui.w50;
public abstract class l extends FrameLayout {
    public int f31557a;
    public w50 f31558b;
    public t f31559c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f31560f;

    public l(Context context, boolean z10) {
        super(context);
        this.f31560f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        w50 w50Var = this.f31558b;
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
        return this.f31559c;
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
        if (this.f31560f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f31558b.F(), 1073741824));
            return;
        }
        if (q50.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int B = kk.B(14.0f, 2, AndroidUtilities.displaySize.x);
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
        this.f31559c = tVar;
    }
}
