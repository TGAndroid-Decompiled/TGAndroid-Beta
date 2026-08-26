package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.UnsupportedBlockDrawable;

public final class ChatMessageUnsupportedCell extends View implements Theme.Colorable {
    public ChatMessageCell.ChatMessageCellDelegate delegate;
    public int mParentH;
    public float mViewTop;
    public final Theme.ResourcesProvider resourcesProvider;
    public final UnsupportedBlockDrawable unsupportedBlockDrawable;
    public int unsupportedBlockHeight;
    public int unsupportedBlockWidth;

    public ChatMessageUnsupportedCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        UnsupportedBlockDrawable unsupportedBlockDrawable = new UnsupportedBlockDrawable(resourcesProvider);
        this.unsupportedBlockDrawable = unsupportedBlockDrawable;
        unsupportedBlockDrawable.setCallback(this);
        unsupportedBlockDrawable.setTitle(LocaleController.getString(R.string.UnsupportedMessageTitle));
        unsupportedBlockDrawable.setSubtitle(LocaleController.getString(R.string.UnsupportedMessageMessage));
        unsupportedBlockDrawable.setButtonText(LocaleController.getString(R.string.UnsupportedUpdate));
        unsupportedBlockDrawable.setOnClickListener(new ChatbotSheet$$ExternalSyntheticLambda0(this, 7));
    }

    public final void drawBackground(Canvas canvas) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.mParentH, 0.0f, this.mViewTop);
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.mParentH, 0.0f, this.mViewTop);
        }
        float fDp = AndroidUtilities.dp(18.0f);
        float fDp2 = AndroidUtilities.dp(6.0f);
        float fDp3 = AndroidUtilities.dp(18.0f) + this.unsupportedBlockWidth;
        float fDp4 = AndroidUtilities.dp(6.0f) + this.unsupportedBlockHeight;
        float fDp5 = AndroidUtilities.dp(18.0f);
        float fDp6 = AndroidUtilities.dp(18.0f);
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintChatActionBackground") : null;
        if (paint == null) {
            paint = Theme.getThemePaint("paintChatActionBackground");
        }
        canvas.drawRoundRect(fDp, fDp2, fDp3, fDp4, fDp5, fDp6, paint);
        if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.unsupportedBlockWidth, AndroidUtilities.dp(6.0f) + this.unsupportedBlockHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(18.0f);
        int iDp2 = AndroidUtilities.dp(6.0f);
        int iDp3 = AndroidUtilities.dp(18.0f) + this.unsupportedBlockWidth;
        int iDp4 = AndroidUtilities.dp(6.0f) + this.unsupportedBlockHeight;
        UnsupportedBlockDrawable unsupportedBlockDrawable = this.unsupportedBlockDrawable;
        unsupportedBlockDrawable.setBounds(iDp, iDp2, iDp3, iDp4);
        unsupportedBlockDrawable.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iDp = size - AndroidUtilities.dp(36.0f);
        this.unsupportedBlockWidth = iDp;
        int iMeasure = this.unsupportedBlockDrawable.measure(iDp);
        this.unsupportedBlockHeight = iMeasure;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + iMeasure);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.unsupportedBlockDrawable.onTouchEvent(this, motionEvent);
    }

    public void setDelegate(ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate) {
        this.delegate = chatMessageCellDelegate;
    }

    public final void setVisiblePart(float f, int i) {
        this.mViewTop = f;
        this.mParentH = i;
    }

    @Override
    public final void updateColors() {
        this.unsupportedBlockDrawable.updateColors();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.unsupportedBlockDrawable;
    }
}
