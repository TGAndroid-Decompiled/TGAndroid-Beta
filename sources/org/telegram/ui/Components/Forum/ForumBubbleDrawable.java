package org.telegram.ui.Components.Forum;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.Theme;

public final class ForumBubbleDrawable extends Drawable {
    public static final SparseArray colorsMap;
    public static SvgHelper.SvgDrawable mainDrawable;
    public static final int[] serverSupportedColor = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public int colorIndex;
    public int[] currentColors;
    public LinearGradient gradient;
    public final Paint strokePaint;
    public final SvgHelper.SvgDrawable svgDrawable;
    public final Paint topPaint;
    public final Matrix gradientMatrix = new Matrix();
    public final ArrayList parents = new ArrayList();
    public int color = -1;

    static {
        SparseArray sparseArray = new SparseArray();
        colorsMap = sparseArray;
        sparseArray.put(7322096, new int[]{-16687423, -11814913});
        sparseArray.put(16766590, new int[]{-1419264, -9380});
        sparseArray.put(13338331, new int[]{-6014789, -1737985});
        sparseArray.put(9367192, new int[]{-15617007, -6823116});
        sparseArray.put(16749490, new int[]{-1826470, -34407});
        sparseArray.put(16478047, new int[]{-3795707, -36532});
    }

    public ForumBubbleDrawable(int i) {
        if (mainDrawable == null) {
            mainDrawable = SvgHelper.getDrawable(R.raw.topic_bubble, -1);
        }
        SvgHelper.SvgDrawable svgDrawableClone = mainDrawable.clone();
        this.svgDrawable = svgDrawableClone;
        svgDrawableClone.copyCommandFromPosition(0);
        Paint paint = new Paint(1);
        this.topPaint = paint;
        Paint paint2 = new Paint(1);
        this.strokePaint = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        svgDrawableClone.setPaint(paint, 1);
        svgDrawableClone.setPaint(paint2, 2);
        setColor(i);
    }

    @Override
    public final void draw(Canvas canvas) {
        Matrix matrix = this.gradientMatrix;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.gradient.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        SvgHelper.SvgDrawable svgDrawable = this.svgDrawable;
        svgDrawable.setBounds(bounds);
        svgDrawable.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.parents;
            if (i >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i)).invalidate();
            i++;
        }
    }

    @Override
    public final void setAlpha(int i) {
        this.svgDrawable.setAlpha(i);
    }

    public final void setColor(int i) {
        int i2 = this.color;
        if (i2 == i && i2 == -1) {
            return;
        }
        this.color = i;
        int[] iArr = serverSupportedColor;
        int i3 = iArr[0];
        int iAbs = Math.abs(Color.blue(i3) - Color.blue(i)) + Math.abs(Color.green(i3) - Color.green(i)) + Math.abs(Color.red(i3) - Color.red(i));
        this.colorIndex = 0;
        for (int i4 = 0; i4 < 6; i4++) {
            int i5 = iArr[i4];
            int iAbs2 = Math.abs(Color.blue(i5) - Color.blue(i)) + Math.abs(Color.green(i5) - Color.green(i)) + Math.abs(Color.red(i5) - Color.red(i));
            if (iAbs2 < iAbs) {
                this.colorIndex = i4;
                iAbs = iAbs2;
            }
        }
        int[] iArr2 = (int[]) colorsMap.get(iArr[this.colorIndex]);
        int[] iArr3 = Theme.currentTheme.isDark() ? new int[]{ColorUtils.blendARGB(0.2f, iArr2[0], -1), ColorUtils.blendARGB(0.2f, iArr2[1], -1)} : iArr2;
        this.currentColors = iArr3;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr3, (float[]) null, Shader.TileMode.CLAMP);
        this.gradient = linearGradient;
        linearGradient.setLocalMatrix(this.gradientMatrix);
        paint.setShader(this.gradient);
        this.svgDrawable.setPaint(paint, 0);
        this.topPaint.setColor(ColorUtils.blendARGB(0.1f, iArr3[1], -1));
        this.strokePaint.setColor(ColorUtils.blendARGB(0.1f, iArr3[0], -16777216));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
