package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.ui.d60;
import org.telegram.ui.j60;
public abstract class l extends FrameLayout {
    public int f32138a;
    public j60 f32139b;
    public u f32140c;
    public ChatObject.VideoParticipant d;
    public boolean f32141e;
    public final boolean f32142f;

    public l(Context context, boolean z4) {
        super(context);
        this.f32142f = z4;
    }

    public float getItemHeight() {
        int measuredHeight;
        j60 j60Var = this.f32139b;
        if (j60Var != null) {
            measuredHeight = j60Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public u getRenderer() {
        return this.f32140c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32141e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32141e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int i12;
        float f11;
        if (this.f32142f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f32139b.F(), 1073741824));
            return;
        }
        if (d60.C3) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int z4 = org.telegram.ui.b.z(14.0f, 2, AndroidUtilities.displaySize.x);
        if (d60.C3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f12 = z4 + i12;
        if (d60.D3) {
            f11 = f12 / 2.0f;
        } else {
            f11 = f12 / f10;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f11 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(u uVar) {
        this.f32140c = uVar;
    }
}
