package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m3 extends View implements p6 {
    public final o3 f22865a;

    public m3(o3 o3Var, Context context) {
        super(context);
        this.f22865a = o3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f22865a.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
        setTranslationY(AndroidUtilities.navigationBarHeight);
    }

    @Override
    public final void updateColors() {
        o3 o3Var = this.f22865a;
        try {
            y3 y3Var = o3Var.f22914a;
            if (y3Var != null) {
                boolean z10 = false;
                int navigationBarColor = y3Var.getNavigationBarColor(y6.x0(null, y6.f23299a7, false));
                if (o3Var.d.getColor() != navigationBarColor) {
                    o3Var.d.setColor(navigationBarColor);
                    invalidate();
                    AndroidUtilities.setNavigationBarColor(o3Var, navigationBarColor);
                    if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                        z10 = true;
                    }
                    AndroidUtilities.setLightNavigationBar(o3Var, z10);
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
