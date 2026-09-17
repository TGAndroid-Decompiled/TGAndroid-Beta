package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.vl;
import org.telegram.ui.j60;
import org.telegram.ui.p60;
public abstract class l extends FrameLayout {
    public int f31591a;
    public p60 f31592b;
    public t f31593c;
    public ChatObject.VideoParticipant d;
    public boolean f31594e;
    public final boolean f31595f;

    public l(Context context, boolean z10) {
        super(context);
        this.f31595f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        p60 p60Var = this.f31592b;
        if (p60Var != null) {
            measuredHeight = p60Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public t getRenderer() {
        return this.f31593c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31594e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31594e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        float f10;
        if (this.f31595f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f31592b.F(), 1073741824));
            return;
        }
        if (j60.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int A = vl.A(14.0f, 2, AndroidUtilities.displaySize.x);
        if (j60.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = A + i12;
        if (j60.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(t tVar) {
        this.f31593c = tVar;
    }
}
