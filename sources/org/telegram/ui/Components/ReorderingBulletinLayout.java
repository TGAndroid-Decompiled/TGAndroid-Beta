package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

public final class ReorderingBulletinLayout extends Bulletin.SimpleLayout {
    public final ReorderingHintDrawable hintDrawable;

    public ReorderingBulletinLayout(Activity activity, String str) {
        super(activity, null);
        this.textView.setText(str);
        this.textView.setTranslationY(-1.0f);
        ImageView imageView = this.imageView;
        ReorderingHintDrawable reorderingHintDrawable = new ReorderingHintDrawable();
        this.hintDrawable = reorderingHintDrawable;
        imageView.setImageDrawable(reorderingHintDrawable);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        ReorderingHintDrawable reorderingHintDrawable = this.hintDrawable;
        reorderingHintDrawable.getClass();
        reorderingHintDrawable.startedTime = System.currentTimeMillis();
        reorderingHintDrawable.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        ReorderingHintDrawable reorderingHintDrawable = this.hintDrawable;
        reorderingHintDrawable.startedTime = -1L;
        reorderingHintDrawable.invalidateSelf();
    }
}
