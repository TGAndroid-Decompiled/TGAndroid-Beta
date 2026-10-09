package org.telegram.ui.Wallet;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
public class i2 extends eb implements org.telegram.ui.ActionBar.z5 {
    public c71 X;
    public final ViewGroup Y;
    public final Paint Z;
    public float f35028a0;

    public i2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, e6Var);
        this.Z = new Paint();
        this.v = 0.1f;
        this.Y = viewGroup;
        qm0 qm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i10, 0, i10, 0);
        e();
        this.X.N(false);
    }

    @Override
    public final CharSequence B() {
        return null;
    }

    @Override
    public void G(float f7) {
        this.f35028a0 = f7;
        if (this.topBulletinContainer != null) {
            this.topBulletinContainer.setTranslationY(Math.max((this.containerView.getY() + f7) + this.backgroundPaddingTop, this.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - this.topBulletinContainer.getBottom());
        }
    }

    public int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.i6.f20741a7);
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
        float max = Math.max(height - AndroidUtilities.navigationBarHeight, this.containerView.getY() + this.f35028a0 + this.backgroundPaddingTop);
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
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(qm0Var, getContext(), this.currentAccount, 0, true, new d(this, 6), this.resourcesProvider);
        this.X = c71Var;
        return c71Var;
    }
}
