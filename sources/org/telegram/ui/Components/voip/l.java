package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.ui.r50;
import org.telegram.ui.x50;
public abstract class l extends FrameLayout {
    public int f33789a;
    public x50 f33790b;
    public u f33791c;
    public ChatObject.VideoParticipant d;
    public boolean f33792e;
    public final boolean f33793f;

    public l(Context context, boolean z10) {
        super(context);
        this.f33793f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        x50 x50Var = this.f33790b;
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

    public u getRenderer() {
        return this.f33791c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33792e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33792e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int i12;
        float f10;
        if (this.f33793f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f33790b.F(), 1073741824));
            return;
        }
        if (r50.B3) {
            f9 = 3.0f;
        } else {
            f9 = 2.0f;
        }
        int z10 = org.telegram.ui.b.z(14.0f, 2, AndroidUtilities.displaySize.x);
        if (r50.B3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = z10 + i12;
        if (r50.C3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f9;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(u uVar) {
        this.f33791c = uVar;
    }
}
