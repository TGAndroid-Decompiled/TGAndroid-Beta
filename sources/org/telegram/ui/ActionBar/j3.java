package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class j3 extends View implements b6 {
    public final l3 f20991a;

    public j3(l3 l3Var, Context context) {
        super(context);
        this.f20991a = l3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f20991a.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
        setTranslationY(AndroidUtilities.navigationBarHeight);
    }

    @Override
    public final void updateColors() {
        l3 l3Var = this.f20991a;
        try {
            w3 w3Var = l3Var.f21603a;
            if (w3Var != null) {
                boolean z10 = false;
                int navigationBarColor = w3Var.getNavigationBarColor(k6.x0(null, k6.f21125a7, false));
                if (l3Var.d.getColor() != navigationBarColor) {
                    l3Var.d.setColor(navigationBarColor);
                    invalidate();
                    AndroidUtilities.setNavigationBarColor(l3Var, navigationBarColor);
                    if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                        z10 = true;
                    }
                    AndroidUtilities.setLightNavigationBar(l3Var, z10);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
