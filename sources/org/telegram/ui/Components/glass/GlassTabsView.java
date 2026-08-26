package org.telegram.ui.Components.glass;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.LayoutHelper;

public abstract class GlassTabsView extends FrameLayout {
    public final Rect lensBounds;
    public final Rect lensBoundsForeground;
    public final Paint lensPaint;
    public float lensVisibility;
    public final LinearLayout linearLayout;

    public GlassTabsView(Context context) {
        super(context);
        this.lensBounds = new Rect();
        this.lensBoundsForeground = new Rect();
        this.lensPaint = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f));
    }

    public void setLensVisibility(float f) {
        this.lensVisibility = f;
        int iDp = AndroidUtilities.dp(f * 7.0f);
        Rect rect = this.lensBounds;
        Rect rect2 = this.lensBoundsForeground;
        rect2.set(rect);
        int i = -iDp;
        rect2.inset(i, i);
    }
}
