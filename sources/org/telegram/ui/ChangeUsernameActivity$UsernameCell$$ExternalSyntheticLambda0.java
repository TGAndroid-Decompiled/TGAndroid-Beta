package org.telegram.ui;

import android.animation.ValueAnimator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class ChangeUsernameActivity$UsernameCell$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChangeUsernameActivity.UsernameCell f$0;

    public ChangeUsernameActivity$UsernameCell$$ExternalSyntheticLambda0(ChangeUsernameActivity.UsernameCell usernameCell, int i) {
        this.$r8$classId = i;
        this.f$0 = usernameCell;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChangeUsernameActivity.UsernameCell usernameCell = this.f$0;
                usernameCell.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                usernameCell.loadingFloat = fFloatValue;
                usernameCell.activeView.setTranslationX(fFloatValue * AndroidUtilities.dp(16.0f));
                usernameCell.loadingView.setAlpha(usernameCell.loadingFloat);
                break;
            default:
                ChangeUsernameActivity.UsernameCell usernameCell2 = this.f$0;
                usernameCell2.getClass();
                usernameCell2.activeViewTextColorT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = Theme.key_windowBackgroundWhiteGrayText2;
                Theme.ResourcesProvider resourcesProvider = usernameCell2.resourcesProvider;
                int iBlendARGB = ColorUtils.blendARGB(usernameCell2.activeViewTextColorT, Theme.getColor(i, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider));
                usernameCell2.loadingDrawable.paint.setColor(iBlendARGB);
                usernameCell2.activeView.setTextColor(iBlendARGB);
                break;
        }
    }
}
