package org.telegram.ui.Components.emojiview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;

public final class FoundStickerPackCell extends FrameLayout implements FactorAnimator.Target, Theme.Colorable {
    public ShapeDrawable bgSelected;
    public final BoolAnimator isSelected;
    public final Theme.ResourcesProvider resourcesProvider;
    public final StickerEmojiCell stickerView;
    public final TextView textView;

    public FoundStickerPackCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.isSelected = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.resourcesProvider = resourcesProvider;
        StickerEmojiCell stickerEmojiCell = new StickerEmojiCell(context, resourcesProvider, false);
        this.stickerView = stickerEmojiCell;
        addView(stickerEmojiCell, LayoutHelper.createFrame(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors$1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.bgSelected;
        if (shapeDrawable != null) {
            BoolAnimator boolAnimator = this.isSelected;
            if (boolAnimator.floatValue > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                DrawableUtils.drawWithScale(canvas, this.bgSelected, AndroidUtilities.lerp(0.9f, 1.0f, boolAnimator.floatValue));
            }
        }
        super.dispatchDraw(canvas);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.isSelected.value;
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        ShapeDrawable shapeDrawable = this.bgSelected;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f * 255.0f));
        }
        invalidate();
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.textView.setText(tL_messages_stickerSet.set.short_name);
        this.stickerView.setSticker(!tL_messages_stickerSet.documents.isEmpty() ? tL_messages_stickerSet.documents.get(0) : null, null, null, null, false, false);
    }

    public final void setSelected(boolean z, boolean z2) {
        if (z && this.bgSelected == null) {
            this.bgSelected = Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), 25));
        }
        BoolAnimator boolAnimator = this.isSelected;
        if (boolAnimator.value != z || z2) {
            boolAnimator.setValue(z, z2);
        }
    }

    @Override
    public final void updateColors$1() {
        ShapeDrawable shapeDrawable = this.bgSelected;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (shapeDrawable != null) {
            ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), 25));
            this.bgSelected = shapeDrawableCreateRoundRectDrawable;
            shapeDrawableCreateRoundRectDrawable.setAlpha((int) (this.isSelected.floatValue * 255.0f));
        }
        this.textView.setTextColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), 229));
    }
}
