package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.am;
import org.telegram.ui.i60;
import org.telegram.ui.n60;
public abstract class l extends FrameLayout {
    public int f31782a;
    public n60 f31783b;
    public u f31784c;
    public ChatObject.VideoParticipant d;
    public boolean f31785e;
    public final boolean f31786f;

    public l(Context context, boolean z10) {
        super(context);
        this.f31786f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        n60 n60Var = this.f31783b;
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
        return this.f31784c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31785e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31785e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        float f10;
        if (this.f31786f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f31783b.F(), 1073741824));
            return;
        }
        if (i60.F3) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int B = am.B(14.0f, 2, AndroidUtilities.displaySize.x);
        if (i60.F3) {
            i12 = -AndroidUtilities.dp(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = B + i12;
        if (i60.G3) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + AndroidUtilities.dp(4.0f)), 1073741824));
    }

    public void setRenderer(u uVar) {
        this.f31784c = uVar;
    }
}
