package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;

public class StarGiftUniqueActionView extends View {
    Drawable background;
    private final StarGiftUniqueActionLayout layout;
    private float layoutX;
    private float layoutY;
    private final Theme.ResourcesProvider resourcesProvider;

    public StarGiftUniqueActionView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = new StarGiftUniqueActionLayout(i, this, resourcesProvider);
        this.layout = starGiftUniqueActionLayout;
        starGiftUniqueActionLayout.getMessageDrawable().setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.layout.getMessageDrawable();
    }

    public void set(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z) {
        this.layout.set(tL_starGiftUnique, j, tL_textWithEntities, str, z);
        requestLayout();
        invalidate();
    }

    public StarGiftUniqueActionLayout getLayout() {
        return this.layout;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int width = (int) this.layout.getWidth();
        int height = (int) this.layout.getHeight();
        this.layoutX = (size - width) / 2.0f;
        float paddingTop = getPaddingTop();
        this.layoutY = paddingTop;
        setMeasuredDimension(size, ((int) paddingTop) + height + getPaddingBottom());
    }

    public void setLayoutBackground(Drawable drawable) {
        this.background = drawable;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), height, 0.0f, getY());
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), height, 0.0f, getY());
        }
        this.layoutX = (getWidth() - ((int) this.layout.getWidth())) / 2.0f;
        float width = this.layout.getWidth() + AndroidUtilities.dp(8.0f);
        float width2 = (getWidth() - width) / 2.0f;
        float fDp = this.layoutY - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width2, fDp, width + width2, this.layout.getHeight() + fDp + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.background.setBounds(rect);
        this.background.draw(canvas);
        canvas.save();
        canvas.translate(this.layoutX, this.layoutY);
        this.layout.draw(canvas);
        this.layout.drawOutbounds(canvas);
        canvas.restore();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.layout.attach();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.layout.onTouchEvent(this.layoutX, this.layoutY, motionEvent);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.layout.detach();
    }
}
