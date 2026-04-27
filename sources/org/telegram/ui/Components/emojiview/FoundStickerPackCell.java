package org.telegram.ui.Components.emojiview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
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

public class FoundStickerPackCell extends FrameLayout implements FactorAnimator.Target, Theme.Colorable {
    private Drawable bgSelected;
    private final BoolAnimator isSelected;
    private final Theme.ResourcesProvider resourcesProvider;
    private final StickerEmojiCell stickerView;
    private final TextView textView;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public FoundStickerPackCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.isSelected = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.resourcesProvider = resourcesProvider;
        StickerEmojiCell stickerEmojiCell = new StickerEmojiCell(context, false, resourcesProvider);
        this.stickerView = stickerEmojiCell;
        addView(stickerEmojiCell, LayoutHelper.createFrame(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.textView.setText(tL_messages_stickerSet.set.short_name);
        this.stickerView.setSticker(!tL_messages_stickerSet.documents.isEmpty() ? tL_messages_stickerSet.documents.get(0) : null, null, null, null, false);
    }

    public void setPack(TLRPC.StickerSetCovered stickerSetCovered, TLRPC.Document document) {
        this.textView.setText(stickerSetCovered.set.short_name);
        this.stickerView.setSticker(document, null, null, null, false);
    }

    @Override
    public boolean isSelected() {
        return this.isSelected.getValue();
    }

    public void setSelected(boolean z, boolean z2) {
        if (z && this.bgSelected == null) {
            this.bgSelected = Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), 25));
        }
        if (this.isSelected.getValue() != z || z2) {
            this.isSelected.setValue(z, z2);
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        Drawable drawable = this.bgSelected;
        if (drawable != null) {
            drawable.setAlpha((int) (f * 255.0f));
        }
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.bgSelected != null && this.isSelected.getFloatValue() > 0.0f) {
            this.bgSelected.setBounds(0, 0, getWidth(), getHeight());
            DrawableUtils.drawWithScale(canvas, this.bgSelected, AndroidUtilities.lerp(0.9f, 1.0f, this.isSelected.getFloatValue()));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void updateColors() {
        if (this.bgSelected != null) {
            ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), 25));
            this.bgSelected = shapeDrawableCreateRoundRectDrawable;
            shapeDrawableCreateRoundRectDrawable.setAlpha((int) (this.isSelected.getFloatValue() * 255.0f));
        }
        this.textView.setTextColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), 229));
    }
}
