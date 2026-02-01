package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Iterator;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.lambda.Destroyable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.LayoutHelper;

public abstract class ActionBarAnimatedSubtitleOverlayContainer extends FrameLayout implements ReplaceAnimator.Callback {
    private final EllipsizeSpanAnimator ellipsizeSpanAnimator;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ReplaceAnimator titleOverlayAnimator;

    @Override
    public boolean hasChanges(ReplaceAnimator replaceAnimator) {
        return ReplaceAnimator.Callback.CC.$default$hasChanges(this, replaceAnimator);
    }

    @Override
    public boolean onApplyMetadataAnimation(ReplaceAnimator replaceAnimator, float f) {
        return ReplaceAnimator.Callback.CC.$default$onApplyMetadataAnimation(this, replaceAnimator, f);
    }

    @Override
    public void onFinishMetadataAnimation(ReplaceAnimator replaceAnimator, boolean z) {
        ReplaceAnimator.Callback.CC.$default$onFinishMetadataAnimation(this, replaceAnimator, z);
    }

    @Override
    public void onForceApplyChanges(ReplaceAnimator replaceAnimator) {
        ReplaceAnimator.Callback.CC.$default$onForceApplyChanges(this, replaceAnimator);
    }

    @Override
    public void onPrepareMetadataAnimation(ReplaceAnimator replaceAnimator) {
        ReplaceAnimator.Callback.CC.$default$onPrepareMetadataAnimation(this, replaceAnimator);
    }

    public ActionBarAnimatedSubtitleOverlayContainer(Context context, Theme.ResourcesProvider resourcesProvider, EllipsizeSpanAnimator ellipsizeSpanAnimator) {
        super(context);
        this.titleOverlayAnimator = new ReplaceAnimator(this, CubicBezierInterpolator.EASE_OUT_QUINT, 350L);
        this.resourcesProvider = resourcesProvider;
        this.ellipsizeSpanAnimator = ellipsizeSpanAnimator;
    }

    public void setText(CharSequence charSequence, boolean z) {
        boolean z2;
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            this.titleOverlayAnimator.clear(z);
            return;
        }
        int iIndexOf = TextUtils.indexOf(charSequence, "...");
        if (iIndexOf >= 0) {
            SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
            this.ellipsizeSpanAnimator.wrap(spannableStringValueOf, iIndexOf);
            z2 = true;
            charSequence2 = spannableStringValueOf;
        } else {
            z2 = false;
            charSequence2 = charSequence;
        }
        SimpleTextViewReplaceable simpleTextViewReplaceable = new SimpleTextViewReplaceable(getContext());
        int i = Theme.key_telegram_color_dialogsLogo;
        simpleTextViewReplaceable.setTextColor(Theme.getColor(i, this.resourcesProvider));
        simpleTextViewReplaceable.setLinkTextColor(Theme.getColor(i, this.resourcesProvider));
        simpleTextViewReplaceable.setTextSize(1, 14.0f);
        simpleTextViewReplaceable.setAlpha(0.0f);
        simpleTextViewReplaceable.setText(charSequence2);
        if (z2) {
            this.ellipsizeSpanAnimator.addView(simpleTextViewReplaceable);
        }
        addView(simpleTextViewReplaceable, LayoutHelper.createFrame(-2, -2.0f));
        this.titleOverlayAnimator.replace(simpleTextViewReplaceable, z);
    }

    private void checkUi_titleOverlayTextAnimation() {
        Iterator it = this.titleOverlayAnimator.iterator();
        while (it.hasNext()) {
            ListAnimator.Entry entry = (ListAnimator.Entry) it.next();
            float visibility = entry.getVisibility();
            float fLerp = AndroidUtilities.lerp(0.85f, 1.0f, visibility);
            ((SimpleTextViewReplaceable) entry.item).setAlpha(visibility);
            ((SimpleTextViewReplaceable) entry.item).setScaleX(fLerp);
            ((SimpleTextViewReplaceable) entry.item).setScaleY(fLerp);
            ((SimpleTextViewReplaceable) entry.item).setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(entry.isAffectingList() ? 9.0f : -9.0f), 0, visibility));
        }
    }

    public void updateColors() {
        Iterator it = this.titleOverlayAnimator.iterator();
        while (it.hasNext()) {
            ListAnimator.Entry entry = (ListAnimator.Entry) it.next();
            SimpleTextViewReplaceable simpleTextViewReplaceable = (SimpleTextViewReplaceable) entry.item;
            int i = Theme.key_telegram_color_dialogsLogo;
            simpleTextViewReplaceable.setTextColor(Theme.getColor(i, this.resourcesProvider));
            ((SimpleTextViewReplaceable) entry.item).setLinkTextColor(Theme.getColor(i, this.resourcesProvider));
        }
    }

    public void onItemChanged(ReplaceAnimator replaceAnimator) {
        checkUi_titleOverlayTextAnimation();
    }

    public float getTotalVisibility() {
        return this.titleOverlayAnimator.getMetadata().getTotalVisibility();
    }

    private class SimpleTextViewReplaceable extends TextView implements Destroyable {
        public SimpleTextViewReplaceable(Context context) {
            super(context);
        }

        @Override
        public void performDestroy() {
            AndroidUtilities.removeFromParent(this);
            ActionBarAnimatedSubtitleOverlayContainer.this.ellipsizeSpanAnimator.removeView(this);
        }
    }
}
