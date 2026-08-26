package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.StaticLayout;
import androidx.recyclerview.widget.DiffUtil;
import com.android.billingclient.api.zzbv;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import com.google.mlkit.vision.label.defaults.thin.zzc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;

public final class ForwardBackground {
    public final Object bounce;
    public final Object bounds;
    public Object loadingDrawable;
    public final Object path;
    public final Object r;
    public Object rippleDrawable;
    public int rippleDrawableColor;
    public final Object view;

    public ForwardBackground() {
        Paint paint = new Paint();
        this.view = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.path = new zzc(tileMode);
        this.bounds = new zzc(tileMode);
        this.bounce = new zzc(Shader.TileMode.REPEAT);
        this.r = new zzbv((char) 0, 13);
        this.rippleDrawable = new zzbv((char) 0, 13);
        this.loadingDrawable = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public void draw(Canvas canvas, boolean z) {
        canvas.save();
        Path path = (Path) this.path;
        canvas.clipPath(path);
        BaseCell.RippleDrawableSafe rippleDrawableSafe = (BaseCell.RippleDrawableSafe) this.rippleDrawable;
        Rect rect = (Rect) this.bounds;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.setBounds(rect);
            ((BaseCell.RippleDrawableSafe) this.rippleDrawable).draw(canvas);
        }
        if (z) {
            LoadingDrawable loadingDrawable = (LoadingDrawable) this.loadingDrawable;
            if (loadingDrawable == null) {
                LoadingDrawable loadingDrawable2 = new LoadingDrawable();
                this.loadingDrawable = loadingDrawable2;
                loadingDrawable2.appearByGradient = true;
            } else if (loadingDrawable.isDisappeared() || ((LoadingDrawable) this.loadingDrawable).isDisappearing()) {
                LoadingDrawable loadingDrawable3 = (LoadingDrawable) this.loadingDrawable;
                loadingDrawable3.start = -1L;
                loadingDrawable3.disappearStart = -1L;
            }
        } else {
            LoadingDrawable loadingDrawable4 = (LoadingDrawable) this.loadingDrawable;
            if (loadingDrawable4 != null && !loadingDrawable4.isDisappearing() && !((LoadingDrawable) this.loadingDrawable).isDisappeared()) {
                ((LoadingDrawable) this.loadingDrawable).disappear();
            }
        }
        canvas.restore();
        LoadingDrawable loadingDrawable5 = (LoadingDrawable) this.loadingDrawable;
        if (loadingDrawable5 == null || loadingDrawable5.isDisappeared()) {
            return;
        }
        LoadingDrawable loadingDrawable6 = (LoadingDrawable) this.loadingDrawable;
        loadingDrawable6.usePath = path;
        loadingDrawable6.setColors(Theme.multAlpha(0.7f, this.rippleDrawableColor), Theme.multAlpha(1.3f, this.rippleDrawableColor), Theme.multAlpha(1.5f, this.rippleDrawableColor), Theme.multAlpha(2.0f, this.rippleDrawableColor));
        ((LoadingDrawable) this.loadingDrawable).setBounds(rect);
        canvas.save();
        ((LoadingDrawable) this.loadingDrawable).draw(canvas);
        canvas.restore();
        ((ChatMessageCell) this.view).invalidate();
    }

    public void set(StaticLayout[] staticLayoutArr, boolean z) {
        float fDp;
        int textSize = (((int) Theme.chat_forwardNamePaint.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float fMax = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float fMin = Math.min(9, SharedConfig.bubbleRadius);
        float fMin2 = Math.min(3, SharedConfig.bubbleRadius);
        float fM = zzjd.m(fMin, 9.0f, 2.66f, 4.0f);
        float f = -AndroidUtilities.dp(fM);
        float f2 = -AndroidUtilities.dp(3.0f);
        float fDp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(fM);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(fM);
        Path path = (Path) this.path;
        path.rewind();
        if (!z) {
            fMax = SharedConfig.bubbleRadius / 2.0f;
        }
        float fDp3 = AndroidUtilities.dp(fMax) * 2;
        RectF rectF = (RectF) this.r;
        rectF.set(f, f2, f + fDp3, fDp3 + f2);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f3 = lineWidth - lineWidth2;
        float f4 = fMin2 + fMin;
        float fMax2 = Math.abs(f3) < ((float) AndroidUtilities.dp(f4)) ? Math.max(lineWidth, lineWidth2) : lineWidth;
        if (Math.abs(f3) > AndroidUtilities.dp(f4)) {
            float fDp4 = AndroidUtilities.dp(fMin2) * 2;
            if (lineWidth < lineWidth2) {
                float fM2 = DiffUtil.m(fDp2, f2, 0.45f, f2);
                fDp = AndroidUtilities.dp(fMin) * 2;
                rectF.set(fMax2 - fDp, f2, fMax2, f2 + fDp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, fM2 - fDp4, fDp4 + lineWidth, fM2);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f5 = lineWidth2 - (fDp2 - fM2);
                rectF.set(f5, fM2, lineWidth2, fDp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f5, fM2, lineWidth2, fDp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float fM3 = DiffUtil.m(fDp2, f2, 0.55f, f2);
                float f6 = fM3 - f2;
                rectF.set(fMax2 - f6, f2, fMax2, fM3);
                path.arcTo(rectF, 270.0f, 90.0f);
                fDp = AndroidUtilities.dp(fMin) * 2;
                rectF.set(lineWidth - f6, f2, lineWidth, fM3);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, fM3, lineWidth2 + fDp4, fDp4 + fM3);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - fDp, fDp2 - fDp, lineWidth2, fDp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            fDp = AndroidUtilities.dp(fMin) * 2;
            float f7 = fMax2 - fDp;
            rectF.set(f7, f2, fMax2, f2 + fDp);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f7, fDp2 - fDp, fMax2, fDp2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f, fDp2 - fDp, fDp + f, fDp2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.bounds).set((int) f, (int) f2, (int) Math.max(lineWidth, lineWidth2), (int) fDp2);
    }

    public void setPressed(boolean z) {
        BaseCell.RippleDrawableSafe rippleDrawableSafe;
        Rect rect = (Rect) this.bounds;
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        ((ButtonBounce) this.bounce).setPressed(z);
        if (z && (rippleDrawableSafe = (BaseCell.RippleDrawableSafe) this.rippleDrawable) != null) {
            rippleDrawableSafe.setHotspot(fCenterX, fCenterY);
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe2 = (BaseCell.RippleDrawableSafe) this.rippleDrawable;
        if (rippleDrawableSafe2 != null) {
            rippleDrawableSafe2.setState(z ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((ChatMessageCell) this.view).invalidate();
    }

    public ForwardBackground(ChatMessageCell chatMessageCell) {
        this.path = new Path();
        this.bounds = new Rect();
        this.r = new RectF();
        this.view = chatMessageCell;
        this.bounce = new ButtonBounce(chatMessageCell, 0.8f, 1.4f);
    }
}
