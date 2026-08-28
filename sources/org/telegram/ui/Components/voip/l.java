package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ll;
import org.telegram.ui.o50;
import org.telegram.ui.u50;
public abstract class l extends FrameLayout {
    public int f33642a;
    public u50 f33643b;
    public t f33644c;
    public ChatObject.VideoParticipant d;
    public boolean f33645e;
    public final boolean f33646f;

    public l(Context context, boolean z10) {
        super(context);
        this.f33646f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        u50 u50Var = this.f33643b;
        if (u50Var != null) {
            measuredHeight = u50Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public t getRenderer() {
        return this.f33644c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33645e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33645e = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int i11;
        float f11;
        if (this.f33646f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(this.f33643b.F(), 1073741824));
            return;
        }
        if (o50.B3) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int A = ll.A(14.0f, 2, AndroidUtilities.displaySize.x);
        if (o50.B3) {
            i11 = -AndroidUtilities.dp(90.0f);
        } else {
            i11 = 0;
        }
        float f12 = A + i11;
        if (o50.C3) {
            f11 = f12 / 2.0f;
        } else {
            f11 = f12 / f10;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (f11 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(t tVar) {
        this.f33644c = tVar;
    }
}
