package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.bp;

public final class p7 extends FrameLayout {

    public l7[] f24992a;

    public MessageObject[] f24993b;

    public int[] f24994c;
    public m7 d;

    public int f24995e;

    public boolean f24996f;
    public boolean h;

    public Paint f24997n;

    public int f24998r;

    public int f24999s;

    public static int a(int i10) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
    }

    public final void b(int i10, boolean z10) {
        l7 l7Var = this.f24992a[i10];
        FrameLayout frameLayout = l7Var.f24625f;
        bp bpVar = l7Var.f24624e;
        if (bpVar.getVisibility() != 0) {
            bpVar.setVisibility(0);
        }
        bpVar.a(z10, true);
        AnimatorSet animatorSet = l7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            l7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        l7Var.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z10 ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z10 ? 0.81f : 1.0f));
        l7Var.h.setDuration(200L);
        l7Var.h.addListener(new lh.h9(l7Var, 19));
        l7Var.h.start();
    }

    public final void c(int i10, int i11, MessageObject messageObject) {
        l7[] l7VarArr = this.f24992a;
        MessageObject[] messageObjectArr = this.f24993b;
        messageObjectArr[i10] = messageObject;
        this.f24994c[i10] = i11;
        if (messageObject != null) {
            l7VarArr[i10].setVisibility(0);
            l7VarArr[i10].setMessageObject(messageObject);
        } else {
            l7VarArr[i10].clearAnimation();
            l7VarArr[i10].setVisibility(4);
            messageObjectArr[i10] = null;
        }
    }

    public m7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f24992a[i10].invalidate();
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.f24992a;
        int iZ = this.f24998r == 1 ? rl.z(2.0f, this.f24995e - 1, View.MeasureSpec.getSize(i10)) / this.f24995e : a(this.f24995e);
        this.h = true;
        for (int i12 = 0; i12 < this.f24995e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = this.f24996f ? 0 : AndroidUtilities.dp(2.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(2.0f) + iZ) * i12;
            if (i12 != this.f24995e - 1) {
                layoutParams.width = iZ;
            } else if (AndroidUtilities.isTablet()) {
                layoutParams.width = AndroidUtilities.dp(490.0f) - ((AndroidUtilities.dp(2.0f) + iZ) * (this.f24995e - 1));
            } else {
                layoutParams.width = AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(2.0f) + iZ) * (this.f24995e - 1));
            }
            layoutParams.height = iZ;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((this.f24996f ? 0 : AndroidUtilities.dp(2.0f)) + iZ, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(m7 m7Var) {
        this.d = m7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f24996f = z10;
    }

    public void setItemsCount(int i10) {
        l7[] l7VarArr = this.f24992a;
        int i11 = 0;
        while (i11 < l7VarArr.length) {
            l7VarArr[i11].clearAnimation();
            l7VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
            i11++;
        }
        this.f24995e = i10;
    }
}
