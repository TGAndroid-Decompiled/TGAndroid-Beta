package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.wh;
import org.telegram.ui.s50;
import org.telegram.ui.x50;
public abstract class l extends FrameLayout {
    public int f31548a;
    public x50 f31549b;
    public t f31550c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f31551f;

    public l(Context context, boolean z10) {
        super(context);
        this.f31551f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        x50 x50Var = this.f31549b;
        if (x50Var != null) {
            measuredHeight = x50Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public t getRenderer() {
        return this.f31550c;
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
        if (this.f31551f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f31549b.F(), 1073741824));
            return;
        }
        if (s50.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int C = wh.C(14.0f, 2, AndroidUtilities.displaySize.x);
        if (s50.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = C + i12;
        if (s50.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(t tVar) {
        this.f31550c = tVar;
    }
}
