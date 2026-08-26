package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;

public final class ReactionTabHolderView extends FrameLayout {
    public final Paint bgPaint;
    public int count;
    public final TextView counterView;
    public final Drawable drawable;
    public final ImageView iconView;
    public float outlineProgress;
    public final View overlaySelectorView;
    public final float radius;
    public final BackupImageView reactView;
    public ReactionsLayoutInBubble.VisibleReaction reaction;
    public final RectF rect;

    public ReactionTabHolderView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.bgPaint = new Paint(1);
        new Path();
        this.rect = new RectF();
        this.radius = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.overlaySelectorView = view;
        addView(view, LayoutHelper.createFrame(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.iconView = imageView;
        Drawable drawableMutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.drawable = drawableMutate;
        imageView.setImageDrawable(drawableMutate);
        addView(imageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.reactView = backupImageView;
        addView(backupImageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.counterView = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(Theme.getColor(null, Theme.key_avatar_nameInMessageBlue, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.outlineProgress);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.rect;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Paint paint = this.bgPaint;
        float f = this.radius;
        canvas.drawRoundRect(rectF, f, f, paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.outlineProgress > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.reaction;
        if (visibleReaction != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.count, visibleReaction));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.count, new Object[0]));
        }
    }

    public void setCounter(int i) {
        this.count = i;
        this.counterView.setText(LocaleController.formatShortNumber(i, null));
        this.iconView.setVisibility(0);
        this.reactView.setVisibility(8);
    }

    public void setOutlineProgress(float f) {
        this.outlineProgress = f;
        int i = Theme.key_chat_inReactionButtonBackground;
        int color = Theme.getColor(null, i, false);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 16);
        int i2 = Theme.key_chat_inReactionButtonTextSelected;
        int iBlendARGB = ColorUtils.blendARGB(f, Theme.getColor(null, Theme.key_chat_inReactionButtonText, false), Theme.getColor(null, i2, false));
        this.bgPaint.setColor(ColorUtils.blendARGB(f, alphaComponent, color));
        this.counterView.setTextColor(iBlendARGB);
        this.drawable.setColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.MULTIPLY));
        float f2 = this.radius;
        View view = this.overlaySelectorView;
        if (f == 1.0f) {
            int i3 = (int) f2;
            int alphaComponent2 = ColorUtils.setAlphaComponent(Theme.getColor(null, i2, false), 76);
            view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(i3, i3, i3, i3, 0, alphaComponent2, alphaComponent2));
        } else if (f == 0.0f) {
            int i4 = (int) f2;
            int alphaComponent3 = ColorUtils.setAlphaComponent(color, 76);
            view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(i4, i4, i4, i4, 0, alphaComponent3, alphaComponent3));
        }
        invalidate();
    }

    public final void setCounter(int i, TLRPC.ReactionCount reactionCount) {
        int i2 = reactionCount.count;
        this.count = i2;
        this.counterView.setText(LocaleController.formatShortNumber(i2, null));
        ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(reactionCount.reaction);
        this.reaction = visibleReactionFromTL;
        String str = visibleReactionFromTL.emojicon;
        ImageView imageView = this.iconView;
        BackupImageView backupImageView = this.reactView;
        if (str != null) {
            for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i).getReactionsList()) {
                if (tL_availableReaction.reaction.equals(this.reaction.emojicon)) {
                    backupImageView.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, null, DocumentObject.getSvgThumb(tL_availableReaction.static_icon, Theme.key_windowBackgroundGray, 1.0f), "webp", 0, tL_availableReaction);
                    backupImageView.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(0, i, this.reaction.documentId));
        backupImageView.setVisibility(0);
        imageView.setVisibility(8);
    }
}
