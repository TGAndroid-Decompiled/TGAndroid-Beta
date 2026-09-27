package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.qk;
import org.telegram.ui.g60;
import org.telegram.ui.m60;
public abstract class l extends FrameLayout {
    public int f29386a;
    public m60 f29387b;
    public u f29388c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f29389f;

    public l(Context context, boolean z10) {
        super(context);
        this.f29389f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        m60 m60Var = this.f29387b;
        if (m60Var != null) {
            measuredHeight = m60Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public u getRenderer() {
        return this.f29388c;
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
        if (this.f29389f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f29387b.F(), 1073741824));
            return;
        }
        if (g60.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int B = qk.B(14.0f, 2, AndroidUtilities.displaySize.x);
        if (g60.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = B + i12;
        if (g60.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(u uVar) {
        this.f29388c = uVar;
    }
}
