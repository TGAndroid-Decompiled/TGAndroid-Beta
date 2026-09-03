package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.ui.e60;
import org.telegram.ui.k60;
public abstract class l extends FrameLayout {
    public int f29727a;
    public k60 f29728b;
    public t f29729c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f29730f;

    public l(Context context, boolean z4) {
        super(context);
        this.f29730f = z4;
    }

    public float getItemHeight() {
        int measuredHeight;
        k60 k60Var = this.f29728b;
        if (k60Var != null) {
            measuredHeight = k60Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public t getRenderer() {
        return this.f29729c;
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
        float f10;
        int i12;
        float f11;
        if (this.f29730f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f29728b.F(), 1073741824));
            return;
        }
        if (e60.C3) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int z4 = org.telegram.ui.b.z(14.0f, 2, AndroidUtilities.displaySize.x);
        if (e60.C3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f12 = z4 + i12;
        if (e60.D3) {
            f11 = f12 / 2.0f;
        } else {
            f11 = f12 / f10;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f11 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(t tVar) {
        this.f29729c = tVar;
    }
}
