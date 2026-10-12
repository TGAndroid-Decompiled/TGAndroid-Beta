package org.telegram.ui.Wallet;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public class i2 extends db implements org.telegram.ui.ActionBar.x5 {
    public z61 X;
    public final ViewGroup Y;
    public final Paint Z;
    public float f33285a0;

    public i2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, c6Var);
        this.Z = new Paint();
        this.v = 0.1f;
        this.Y = viewGroup;
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        d();
        this.X.N(false);
    }

    @Override
    public final CharSequence A() {
        return null;
    }

    @Override
    public void G(float f7) {
        this.f33285a0 = f7;
        if (this.topBulletinContainer != null) {
            this.topBulletinContainer.setTranslationY(Math.max((this.containerView.getY() + f7) + this.backgroundPaddingTop, this.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - this.topBulletinContainer.getBottom());
        }
    }

    public int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.g6.f19843a7);
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
        float height = getContainer().getHeight();
        float max = Math.max(height - AndroidUtilities.navigationBarHeight, this.containerView.getY() + this.f33285a0 + this.backgroundPaddingTop);
        if (max >= height) {
            return;
        }
        canvas.drawRect(0.0f, max, getContainer().getWidth(), height, this.Z);
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
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 6), this.resourcesProvider);
        this.X = z61Var;
        return z61Var;
    }
}
