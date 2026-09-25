package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ok;
import org.telegram.ui.d60;
import org.telegram.ui.j60;
public abstract class l extends FrameLayout {
    public int f29444a;
    public j60 f29445b;
    public u f29446c;
    public ChatObject.VideoParticipant d;
    public boolean e;
    public final boolean f29447f;

    public l(Context context, boolean z10) {
        super(context);
        this.f29447f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        j60 j60Var = this.f29445b;
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
        return this.f29446c;
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
        if (this.f29447f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f29445b.F(), 1073741824));
            return;
        }
        if (d60.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int B = ok.B(14.0f, 2, AndroidUtilities.displaySize.x);
        if (d60.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = B + i12;
        if (d60.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(u uVar) {
        this.f29446c = uVar;
    }
}
