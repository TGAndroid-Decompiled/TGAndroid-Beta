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
import org.telegram.ui.Components.UnsupportedBlockDrawable;

public class ChatMessageUnsupportedCell extends View implements Theme.Colorable {
    private ChatMessageCell.ChatMessageCellDelegate delegate;
    private int mParentH;
    private float mViewTop;
    public final Theme.ResourcesProvider resourcesProvider;
    public final UnsupportedBlockDrawable unsupportedBlockDrawable;
    private int unsupportedBlockHeight;
    private int unsupportedBlockWidth;

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ChatMessageUnsupportedCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        UnsupportedBlockDrawable unsupportedBlockDrawable = new UnsupportedBlockDrawable(resourcesProvider);
        this.unsupportedBlockDrawable = unsupportedBlockDrawable;
        unsupportedBlockDrawable.setCallback(this);
        unsupportedBlockDrawable.setTitle(LocaleController.getString(R.string.UnsupportedMessageTitle));
        unsupportedBlockDrawable.setSubtitle(LocaleController.getString(R.string.UnsupportedMessageMessage));
        unsupportedBlockDrawable.setButtonText(LocaleController.getString(R.string.UnsupportedUpdate));
        unsupportedBlockDrawable.setOnClickListener(new Runnable() {
            @Override
            public final void run() {
                ChatMessageUnsupportedCell.$r8$lambda$9kWNZCd7_y2vHz1m5G2sNSX0N74(this.f$0);
            }
        });
    }

    public static void $r8$lambda$9kWNZCd7_y2vHz1m5G2sNSX0N74(ChatMessageUnsupportedCell chatMessageUnsupportedCell) {
        ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate = chatMessageUnsupportedCell.delegate;
        if (chatMessageCellDelegate != null) {
            chatMessageCellDelegate.didPressAppUpdateButton();
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.unsupportedBlockDrawable;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iDp = size - AndroidUtilities.dp(36.0f);
        this.unsupportedBlockWidth = iDp;
        int iMeasure = this.unsupportedBlockDrawable.measure(iDp);
        this.unsupportedBlockHeight = iMeasure;
        setMeasuredDimension(size, iMeasure + AndroidUtilities.dp(12.0f));
    }

    public void setDelegate(ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate) {
        this.delegate = chatMessageCellDelegate;
    }

    public void setVisiblePart(float f, int i) {
        this.mViewTop = f;
        this.mParentH = i;
    }

    public void drawBackground(Canvas canvas) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.mParentH, 0.0f, this.mViewTop);
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.mParentH, 0.0f, this.mViewTop);
        }
        canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.unsupportedBlockWidth, AndroidUtilities.dp(6.0f) + this.unsupportedBlockHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), getThemedPaint("paintChatActionBackground"));
        if (hasGradientService()) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.unsupportedBlockWidth, AndroidUtilities.dp(6.0f) + this.unsupportedBlockHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        this.unsupportedBlockDrawable.setBounds(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.unsupportedBlockWidth, AndroidUtilities.dp(6.0f) + this.unsupportedBlockHeight);
        this.unsupportedBlockDrawable.draw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.unsupportedBlockDrawable.onTouchEvent(this, motionEvent);
    }

    @Override
    public void updateColors() {
        this.unsupportedBlockDrawable.updateColors();
    }

    public boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService();
    }

    public Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }
}
