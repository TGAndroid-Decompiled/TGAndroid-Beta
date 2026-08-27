package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.rl;
import org.telegram.ui.s50;
import org.telegram.ui.y50;

public abstract class l extends FrameLayout {

    public int f33692a;

    public y50 f33693b;

    public t f33694c;
    public ChatObject.VideoParticipant d;

    public boolean f33695e;

    public final boolean f33696f;

    public l(Context context, boolean z10) {
        super(context);
        this.f33696f = z10;
    }

    public float getItemHeight() {
        y50 y50Var = this.f33693b;
        return y50Var != null ? y50Var.F() : getMeasuredHeight();
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.d;
    }

    public t getRenderer() {
        return this.f33694c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33695e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33695e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f33696f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f33693b.F(), 1073741824));
        } else {
            float f10 = s50.B3 ? 3.0f : 2.0f;
            float fZ = rl.z(14.0f, 2, AndroidUtilities.displaySize.x) + (s50.B3 ? -AndroidUtilities.dp(90.0f) : 0);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) ((s50.C3 ? fZ / 2.0f : fZ / f10) + AndroidUtilities.dp(4.0f)), 1073741824));
        }
    }

    public void setRenderer(t tVar) {
        this.f33694c = tVar;
    }
}
