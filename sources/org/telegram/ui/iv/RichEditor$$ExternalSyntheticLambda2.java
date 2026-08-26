package org.telegram.ui.iv;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class RichEditor$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final RichEditor f$0;

    public RichEditor$$ExternalSyntheticLambda2(RichEditor richEditor, int i) {
        this.$r8$classId = i;
        this.f$0 = richEditor;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                RichEditor richEditor = this.f$0;
                richEditor.getClass();
                richEditor.emojiSearchProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                richEditor.applyEmojiSearchOffset();
                break;
            default:
                RichEditor richEditor2 = this.f$0;
                richEditor2.getClass();
                richEditor2.animateOpenProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                richEditor2.updateAnimatingLocations();
                richEditor2.listView.setTranslationX(AndroidUtilities.lerp(richEditor2.animateEnterViewFrom[0] - richEditor2.animateEnterViewTo[0], 0, richEditor2.animateOpenProgress));
                richEditor2.listView.setTranslationY(AndroidUtilities.lerp(richEditor2.animateEnterViewFrom[1] - richEditor2.animateEnterViewTo[1], 0, richEditor2.animateOpenProgress));
                richEditor2.container.invalidate();
                break;
        }
    }
}
