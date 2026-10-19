package org.telegram.ui.Wallet;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public class k2 extends bb implements org.telegram.ui.ActionBar.y5 {
    public t61 X;
    public final ViewGroup Y;
    public final Paint Z;
    public float f34413a0;

    public k2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, true, false, d6Var);
        this.Z = new Paint();
        this.v = 0.1f;
        this.Y = viewGroup;
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        im0Var.setPadding(i10, 0, i10, 0);
        d();
        this.X.N(false);
    }

    @Override
    public final CharSequence A() {
        return null;
    }

    @Override
    public void F(float f7) {
        this.f34413a0 = f7;
        if (this.topBulletinContainer != null) {
            this.topBulletinContainer.setTranslationY(Math.max((this.containerView.getY() + f7) + this.backgroundPaddingTop, this.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - this.topBulletinContainer.getBottom());
        }
    }

    public int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.h6.f20929a7);
    }

    @Override
    public final void d() {
        int Q = Q();
        this.Z.setColor(Q);
        setBackgroundColor(Q);
        fixNavigationBar(Q);
        ViewGroup viewGroup = this.Y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float width;
        float height = getContainer().getHeight();
        float max = Math.max(height - AndroidUtilities.navigationBarHeight, this.containerView.getY() + this.f34413a0 + this.backgroundPaddingTop);
        if (max >= height) {
            return;
        }
        if (this.containerView.getWidth() < getContainer().getWidth()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f7 = this.containerView.getX() + this.backgroundPaddingLeft;
        } else {
            f7 = 0.0f;
        }
        float f10 = f7;
        if (z10) {
            width = (this.containerView.getX() + this.containerView.getWidth()) - this.backgroundPaddingLeft;
        } else {
            width = getContainer().getWidth();
        }
        canvas.drawRect(f10, max, width, height, this.Z);
    }

    @Override
    public final void setOverlayNavBarColor(int i10) {
        super.setOverlayNavBarColor(i10);
        AndroidUtilities.setNavigationBarColor((Dialog) this, 0, false);
    }

    @Override
    public void show() {
        boolean z10;
        if (getWindow() != null) {
            AndroidUtilities.enableEdgeToEdge(getWindow());
        }
        super.show();
        int Q = Q();
        setOverlayNavBarColor(Q);
        if (AndroidUtilities.computePerceivedBrightness(Q) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(this, z10);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(im0Var, getContext(), this.currentAccount, 0, true, new d(this, 5), this.resourcesProvider);
        this.X = t61Var;
        return t61Var;
    }
}
