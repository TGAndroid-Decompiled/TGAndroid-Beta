package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.yh;
import org.telegram.ui.n60;
import org.telegram.ui.s60;
public abstract class l extends FrameLayout {
    public int f30275a;
    public s60 f30276b;
    public t f30277c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f30278f;

    public l(Context context, boolean z10) {
        super(context);
        this.f30278f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        s60 s60Var = this.f30276b;
        if (s60Var != null) {
            measuredHeight = s60Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public t getRenderer() {
        return this.f30277c;
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
        if (this.f30278f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f30276b.F(), 1073741824));
            return;
        }
        if (n60.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int C = yh.C(14.0f, 2, AndroidUtilities.displaySize.x);
        if (n60.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = C + i12;
        if (n60.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(t tVar) {
        this.f30277c = tVar;
    }
}
