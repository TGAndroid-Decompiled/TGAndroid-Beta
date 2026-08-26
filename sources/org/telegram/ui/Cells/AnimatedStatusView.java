package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Reactions.AnimatedEmojiEffect;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;

public final class AnimatedStatusView extends View {
    public int animationUniq;
    public final ArrayList animations;
    public Integer color;
    public final int effectsSize;
    public final int renderedEffectsSize;
    public final int stateSize;
    public float y1;
    public float y2;

    public AnimatedStatusView(Context context) {
        super(context);
        this.animations = new ArrayList();
        this.stateSize = 20;
        this.effectsSize = 60;
        this.renderedEffectsSize = 60;
    }

    public final void animateChange(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        TLRPC.TL_availableReaction tL_availableReaction;
        String strFindAnimatedEmojiEmoticon;
        TLRPC.Document document = null;
        TLRPC.TL_availableReaction tL_availableReaction2 = visibleReaction.emojicon != null ? MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(visibleReaction.emojicon) : null;
        if (tL_availableReaction2 == null) {
            TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, visibleReaction.documentId);
            if (documentFindDocument != null && (strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null)) != null) {
                tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(strFindAnimatedEmojiEmoticon);
            }
            tL_availableReaction = tL_availableReaction2;
            document = documentFindDocument;
        } else {
            tL_availableReaction = tL_availableReaction2;
        }
        ArrayList arrayList = this.animations;
        if (document != null || tL_availableReaction == null) {
            AnimatedEmojiDrawable animatedEmojiDrawableMake = document == null ? AnimatedEmojiDrawable.make(2, UserConfig.selectedAccount, visibleReaction.documentId) : AnimatedEmojiDrawable.make(2, UserConfig.selectedAccount, document);
            if (this.color != null) {
                animatedEmojiDrawableMake.setColorFilter(new PorterDuffColorFilter(this.color.intValue(), PorterDuff.Mode.MULTIPLY));
            }
            AnimatedEmojiEffect animatedEmojiEffect = new AnimatedEmojiEffect(animatedEmojiDrawableMake, UserConfig.selectedAccount, false, !animatedEmojiDrawableMake.canOverrideColor());
            animatedEmojiEffect.setView(this);
            arrayList.add(animatedEmojiEffect);
            invalidate();
            return;
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setParentView(this);
        int i = this.animationUniq;
        this.animationUniq = i + 1;
        imageReceiver.setUniqKeyPrefix(Integer.toString(i));
        ImageLocation forDocument = ImageLocation.getForDocument(tL_availableReaction.around_animation);
        StringBuilder sb = new StringBuilder();
        int i2 = this.effectsSize;
        sb.append(i2);
        sb.append("_");
        sb.append(i2);
        sb.append("_nolimit");
        imageReceiver.setImage(forDocument, sb.toString(), null, "tgs", tL_availableReaction, 1);
        imageReceiver.setAutoRepeat(0);
        imageReceiver.onAttachedToWindow();
        arrayList.add(imageReceiver);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(this.renderedEffectsSize);
        int iDp2 = AndroidUtilities.dp(this.effectsSize);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.animations;
            if (i >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i);
            if (obj instanceof ImageReceiver) {
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                float f = iDp2;
                imageReceiver.setImageCoords((getMeasuredWidth() - iDp2) / 2.0f, (getMeasuredHeight() - iDp2) / 2.0f, f, f);
                imageReceiver.draw(canvas);
            } else if (obj instanceof AnimatedEmojiEffect) {
                AnimatedEmojiEffect animatedEmojiEffect = (AnimatedEmojiEffect) obj;
                animatedEmojiEffect.bounds.set((int) ((getMeasuredWidth() - iDp) / 2.0f), (int) ((getMeasuredHeight() - iDp) / 2.0f), (int) ((getMeasuredWidth() + iDp) / 2.0f), (int) ((getMeasuredHeight() + iDp) / 2.0f));
                ImageReceiver imageReceiver2 = animatedEmojiEffect.effectImageReceiver;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(animatedEmojiEffect.bounds);
                }
                animatedEmojiEffect.draw(canvas);
                if (System.currentTimeMillis() - animatedEmojiEffect.startTime > 2500) {
                    animatedEmojiEffect.removeView(this);
                    arrayList.remove(animatedEmojiEffect);
                }
            }
            i++;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.animations;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).onDetachedFromWindow();
                } else if (obj instanceof AnimatedEmojiEffect) {
                    ((AnimatedEmojiEffect) obj).removeView(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.stateSize;
        int i4 = this.effectsSize;
        int iMax = Math.max(i3, i4);
        int i5 = this.renderedEffectsSize;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(i5, iMax)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(i5, Math.max(i3, i4))), 1073741824));
    }

    public void setColor(int i) {
        this.color = Integer.valueOf(i);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.animations;
            if (i2 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i2);
            if (obj instanceof ImageReceiver) {
                ((ImageReceiver) obj).setColorFilter(porterDuffColorFilter);
            } else if (obj instanceof AnimatedEmojiEffect) {
                ((AnimatedEmojiEffect) obj).animatedEmojiDrawable.setColorFilter(porterDuffColorFilter2);
            }
            i2++;
        }
    }
}
