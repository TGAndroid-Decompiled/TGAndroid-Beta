package org.telegram.ui.Wallet;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
public class j2 extends bb implements org.telegram.ui.ActionBar.p6 {
    public k71 X;
    public final ViewGroup Y;
    public final Paint Z;
    public float f36756a0;

    public j2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, true, false, u6Var);
        this.Z = new Paint();
        this.v = 0.1f;
        this.Y = viewGroup;
        nm0 nm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i10, 0, i10, 0);
        updateColors();
        this.X.O(false);
    }

    @Override
    public void F(float f7) {
        this.f36756a0 = f7;
        if (this.topBulletinContainer != null) {
            this.topBulletinContainer.setTranslationY(Math.max((this.containerView.getY() + f7) + this.backgroundPaddingTop, this.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - this.topBulletinContainer.getBottom());
        }
    }

    public int P() {
        return getThemedColor(org.telegram.ui.ActionBar.y6.f23300a7);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23300a7));
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float width;
        float height = getContainer().getHeight();
        float max = Math.max(height - AndroidUtilities.navigationBarHeight, this.containerView.getY() + this.f36756a0 + this.backgroundPaddingTop);
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
        int P = P();
        setOverlayNavBarColor(P);
        if (AndroidUtilities.computePerceivedBrightness(P) > 0.721f) {
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
    public final void updateColors() {
        int P = P();
        this.Z.setColor(P);
        setBackgroundColor(P);
        fixNavigationBar(P);
        ViewGroup viewGroup = this.Y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(nm0Var, getContext(), this.currentAccount, 0, true, new d(this, 5), this.resourcesProvider);
        this.X = k71Var;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
