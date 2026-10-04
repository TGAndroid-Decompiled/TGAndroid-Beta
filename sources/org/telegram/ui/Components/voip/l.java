package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.bi;
import org.telegram.ui.h60;
import org.telegram.ui.n60;
public abstract class l extends FrameLayout {
    public int f31962a;
    public n60 f31963b;
    public u f31964c;
    public ChatObject.VideoParticipant d;
    public boolean f31965e;
    public final boolean f31966f;

    public l(Context context, boolean z10) {
        super(context);
        this.f31966f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        n60 n60Var = this.f31963b;
        if (n60Var != null) {
            measuredHeight = n60Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public u getRenderer() {
        return this.f31964c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31965e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31965e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        float f10;
        if (this.f31966f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f31963b.F(), 1073741824));
            return;
        }
        if (h60.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int A = bi.A(14.0f, 2, AndroidUtilities.displaySize.x);
        if (h60.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = A + i12;
        if (h60.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(u uVar) {
        this.f31964c = uVar;
    }
}
