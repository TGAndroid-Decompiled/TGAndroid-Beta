package org.telegram.ui.Wallet;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wm0;
public class k2 extends db implements org.telegram.ui.ActionBar.x5 {
    public h71 X;
    public final ViewGroup Y;
    public final Paint Z;
    public float f34962a0;

    public k2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, c6Var);
        this.Z = new Paint();
        this.v = 0.1f;
        this.Y = viewGroup;
        wm0 wm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i10, 0, i10, 0);
        e();
        this.X.N(false);
    }

    @Override
    public final CharSequence A() {
        return null;
    }

    @Override
    public void G(float f7) {
        this.f34962a0 = f7;
        if (this.topBulletinContainer != null) {
            this.topBulletinContainer.setTranslationY(Math.max((this.containerView.getY() + f7) + this.backgroundPaddingTop, this.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - this.topBulletinContainer.getBottom());
        }
    }

    public int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.h6.f20503a7);
    }

    @Override
    public final void e() {
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
        float max = Math.max(height - AndroidUtilities.navigationBarHeight, this.containerView.getY() + this.f34962a0 + this.backgroundPaddingTop);
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
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(wm0Var, getContext(), this.currentAccount, 0, true, new d(this, 6), this.resourcesProvider);
        this.X = h71Var;
        return h71Var;
    }
}
