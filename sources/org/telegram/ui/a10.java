package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class a10 extends View implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.r6 f37640a;
    public eh.d f37641b;
    public String f37642c;

    public a10(Activity activity) {
        super(activity);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, false, false);
        this.f37640a = r6Var;
        r6Var.u(-1);
        r6Var.f32142b = 17;
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.r6 r6Var = this.f37640a;
        int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + r6Var.c());
        int width = (getWidth() - dpf2) / 2;
        int i10 = dpf2 + width;
        eh.d dVar = this.f37641b;
        if (dVar != null) {
            dVar.setBounds(width, 0, i10, getHeight());
            this.f37641b.draw(canvas);
        }
        r6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f37640a.setBounds(0, 0, i10, i11);
    }

    @Override
    public final void updateColors() {
        eh.d dVar = this.f37641b;
        if (dVar != null) {
            dVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f37640a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
