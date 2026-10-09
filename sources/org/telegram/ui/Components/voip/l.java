package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.bi;
import org.telegram.ui.g60;
import org.telegram.ui.l60;
public abstract class l extends FrameLayout {
    public int f32037a;
    public l60 f32038b;
    public u f32039c;
    public ChatObject.VideoParticipant d;
    public boolean f32040e;
    public final boolean f32041f;

    public l(Context context, boolean z10) {
        super(context);
        this.f32041f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        l60 l60Var = this.f32038b;
        if (l60Var != null) {
            measuredHeight = l60Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public u getRenderer() {
        return this.f32039c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32040e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32040e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        float f10;
        if (this.f32041f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f32038b.F(), 1073741824));
            return;
        }
        if (g60.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int B = bi.B(14.0f, 2, AndroidUtilities.displaySize.x);
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
        this.f32039c = uVar;
    }
}
