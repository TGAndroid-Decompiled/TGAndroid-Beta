package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.lambda.Destroyable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.LayoutHelper;

public abstract class ActionBarAnimatedSubtitleOverlayContainer extends FrameLayout implements ReplaceAnimator.Callback {
    public final EllipsizeSpanAnimator ellipsizeSpanAnimator;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ReplaceAnimator titleOverlayAnimator;

    public final class SimpleTextViewReplaceable extends TextView implements Destroyable {
        public SimpleTextViewReplaceable(Context context) {
            super(context);
        }

        @Override
        public final void performDestroy() {
            AndroidUtilities.removeFromParent(this);
            ActionBarAnimatedSubtitleOverlayContainer.this.ellipsizeSpanAnimator.removeView(this);
        }
    }

    public ActionBarAnimatedSubtitleOverlayContainer(Context context, Theme.ResourcesProvider resourcesProvider, EllipsizeSpanAnimator ellipsizeSpanAnimator) {
        super(context);
        this.titleOverlayAnimator = new ReplaceAnimator(this, CubicBezierInterpolator.EASE_OUT_QUINT, 350L);
        this.resourcesProvider = resourcesProvider;
        this.ellipsizeSpanAnimator = ellipsizeSpanAnimator;
    }

    public float getTotalVisibility() {
        return this.titleOverlayAnimator.list.metadata.totalVisibility.now;
    }

    @Override
    public final boolean hasChanges(ReplaceAnimator replaceAnimator) {
        return false;
    }

    @Override
    public final boolean onApplyMetadataAnimation(ReplaceAnimator replaceAnimator, float f) {
        return false;
    }

    @Override
    public final void onFinishMetadataAnimation(ReplaceAnimator replaceAnimator, boolean z) {
    }

    @Override
    public final void onForceApplyChanges(ReplaceAnimator replaceAnimator) {
    }

    public void onItemChanged(ReplaceAnimator replaceAnimator) {
        ArrayList arrayList = this.titleOverlayAnimator.list.entries;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAnimator.Entry entry = (ListAnimator.Entry) obj;
            float visibility = entry.getVisibility();
            float fLerp = AndroidUtilities.lerp(0.85f, 1.0f, visibility);
            SimpleTextViewReplaceable simpleTextViewReplaceable = (SimpleTextViewReplaceable) entry.item;
            simpleTextViewReplaceable.setAlpha(visibility);
            simpleTextViewReplaceable.setScaleX(fLerp);
            simpleTextViewReplaceable.setScaleY(fLerp);
            simpleTextViewReplaceable.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(!entry.isBeingRemoved ? 9.0f : -9.0f), 0, visibility));
        }
    }

    @Override
    public final void onPrepareMetadataAnimation(ReplaceAnimator replaceAnimator) {
    }

    public final void setText(CharSequence charSequence, boolean z) {
        boolean z2;
        CharSequence charSequence2;
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        ReplaceAnimator replaceAnimator = this.titleOverlayAnimator;
        if (zIsEmpty) {
            replaceAnimator.list.reset(null, true);
            return;
        }
        int iIndexOf = TextUtils.indexOf(charSequence, "...");
        EllipsizeSpanAnimator ellipsizeSpanAnimator = this.ellipsizeSpanAnimator;
        if (iIndexOf >= 0) {
            SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
            ellipsizeSpanAnimator.wrap(spannableStringValueOf, iIndexOf);
            z2 = true;
            charSequence2 = spannableStringValueOf;
        } else {
            z2 = false;
            charSequence2 = charSequence;
        }
        SimpleTextViewReplaceable simpleTextViewReplaceable = new SimpleTextViewReplaceable(getContext());
        int i = Theme.key_telegram_color_dialogsLogo;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        simpleTextViewReplaceable.setTextColor(Theme.getColor(i, resourcesProvider));
        simpleTextViewReplaceable.setLinkTextColor(Theme.getColor(i, resourcesProvider));
        simpleTextViewReplaceable.setTextSize(1, 14.0f);
        simpleTextViewReplaceable.setAlpha(0.0f);
        simpleTextViewReplaceable.setText(charSequence2);
        if (z2) {
            ellipsizeSpanAnimator.addView(simpleTextViewReplaceable);
        }
        addView(simpleTextViewReplaceable, LayoutHelper.createFrame(-2, -2.0f));
        replaceAnimator.replace(simpleTextViewReplaceable, true);
    }
}
