package org.telegram.p009ui.Components;

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
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$TL_availableReaction;

public class ReactionTabHolderView extends FrameLayout {
    private Paint bgPaint;
    private int count;
    private TextView counterView;
    Drawable drawable;
    private ImageView iconView;
    private Paint outlinePaint;
    private float outlineProgress;
    View overlaySelectorView;
    private float radius;
    private BackupImageView reactView;
    private ReactionsLayoutInBubble.VisibleReaction reaction;
    private RectF rect;

    public ReactionTabHolderView(Context context) {
        super(context);
        this.outlinePaint = new Paint(1);
        this.bgPaint = new Paint(1);
        new Path();
        this.rect = new RectF();
        this.radius = AndroidUtilities.m35dp(32.0f);
        View view = new View(context);
        this.overlaySelectorView = view;
        addView(view, LayoutHelper.createFrame(-1, -1.0f));
        this.iconView = new ImageView(context);
        Drawable mutate = ContextCompat.getDrawable(context, C1072R.C1073drawable.msg_reactions_filled).mutate();
        this.drawable = mutate;
        this.iconView.setImageDrawable(mutate);
        addView(this.iconView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.reactView = backupImageView;
        addView(backupImageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.counterView = textView;
        textView.setImportantForAccessibility(2);
        this.counterView.setTextColor(Theme.getColor("avatar_nameInMessageBlue"));
        this.counterView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        addView(this.counterView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        this.outlinePaint.setStyle(Paint.Style.STROKE);
        this.outlinePaint.setStrokeWidth(AndroidUtilities.m35dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.outlineProgress);
    }

    public void setOutlineProgress(float f) {
        this.outlineProgress = f;
        int color = Theme.getColor("chat_inReactionButtonBackground");
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor("chat_inReactionButtonBackground"), 16);
        int blendARGB = ColorUtils.blendARGB(Theme.getColor("chat_inReactionButtonText"), Theme.getColor("chat_inReactionButtonTextSelected"), f);
        this.bgPaint.setColor(ColorUtils.blendARGB(alphaComponent, color, f));
        this.counterView.setTextColor(blendARGB);
        this.drawable.setColorFilter(new PorterDuffColorFilter(blendARGB, PorterDuff.Mode.MULTIPLY));
        if (f == 1.0f) {
            this.overlaySelectorView.setBackground(Theme.createSimpleSelectorRoundRectDrawable((int) this.radius, 0, ColorUtils.setAlphaComponent(Theme.getColor("chat_inReactionButtonTextSelected"), 76)));
        } else if (f == 0.0f) {
            this.overlaySelectorView.setBackground(Theme.createSimpleSelectorRoundRectDrawable((int) this.radius, 0, ColorUtils.setAlphaComponent(color, 76)));
        }
        invalidate();
    }

    public void setCounter(int i) {
        this.count = i;
        this.counterView.setText(String.format("%s", LocaleController.formatShortNumber(i, null)));
        this.iconView.setVisibility(0);
        this.reactView.setVisibility(8);
    }

    public void setCounter(int i, TLRPC$ReactionCount tLRPC$ReactionCount) {
        int i2 = tLRPC$ReactionCount.count;
        this.count = i2;
        this.counterView.setText(String.format("%s", LocaleController.formatShortNumber(i2, null)));
        ReactionsLayoutInBubble.VisibleReaction fromTLReaction = ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(tLRPC$ReactionCount.reaction);
        this.reaction = fromTLReaction;
        if (fromTLReaction.emojicon != null) {
            for (TLRPC$TL_availableReaction tLRPC$TL_availableReaction : MediaDataController.getInstance(i).getReactionsList()) {
                if (tLRPC$TL_availableReaction.reaction.equals(this.reaction.emojicon)) {
                    this.reactView.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.center_icon), "40_40_lastframe", "webp", DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.static_icon, "windowBackgroundGray", 1.0f), tLRPC$TL_availableReaction);
                    this.reactView.setVisibility(0);
                    this.iconView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        this.reactView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(0, i, this.reaction.documentId));
        this.reactView.setVisibility(0);
        this.iconView.setVisibility(8);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF = this.rect;
        float f = this.radius;
        canvas.drawRoundRect(rectF, f, f, this.bgPaint);
        super.dispatchDraw(canvas);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfReactions", this.count, new Object[0]));
        }
    }
}
