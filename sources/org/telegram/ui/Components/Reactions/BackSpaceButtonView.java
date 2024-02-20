package org.telegram.ui.Components.Reactions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.RoundRectOutlineProvider;
@SuppressLint({"ViewConstructor"})
public class BackSpaceButtonView extends FrameLayout {
    private final ImageView backspaceButton;
    private boolean backspaceOnce;
    private boolean backspacePressed;
    private Utilities.Callback<Boolean> onBackspace;
    private final Theme.ResourcesProvider resourcesProvider;

    public static void lambda$new$0(View view) {
    }

    public BackSpaceButtonView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        ImageView imageView = new ImageView(context) {
            private long lastClick = 0;

            @Override
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    if (System.currentTimeMillis() < this.lastClick + 350) {
                        return false;
                    }
                    this.lastClick = System.currentTimeMillis();
                    BackSpaceButtonView.this.backspacePressed = true;
                    BackSpaceButtonView.this.backspaceOnce = false;
                    BackSpaceButtonView.this.postBackspaceRunnable(350);
                } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    BackSpaceButtonView.this.backspacePressed = false;
                    if (!BackSpaceButtonView.this.backspaceOnce && BackSpaceButtonView.this.onBackspace != null) {
                        BackSpaceButtonView.this.onBackspace.run(Boolean.FALSE);
                        BackSpaceButtonView.this.backspaceButton.performHapticFeedback(3);
                    }
                }
                super.onTouchEvent(motionEvent);
                return true;
            }
        };
        this.backspaceButton = imageView;
        imageView.setHapticFeedbackEnabled(true);
        imageView.setImageResource(R.drawable.smiles_tab_clear);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_emojiPanelBackspace), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString("AccDescrBackspace", R.string.AccDescrBackspace));
        imageView.setFocusable(true);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BackSpaceButtonView.lambda$new$0(view);
            }
        });
        addView(imageView, LayoutHelper.createFrame(36, 36, 17));
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(36.0f), getThemedColor(Theme.key_windowBackgroundWhite), Theme.getColor(Theme.key_listSelector));
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setBackground(createSimpleSelectorCircleDrawable);
            imageView.setOutlineProvider(new RoundRectOutlineProvider(18));
            imageView.setElevation(AndroidUtilities.dp(1.0f));
            imageView.setClipToOutline(true);
        } else {
            Drawable mutate = context.getResources().getDrawable(R.drawable.floating_shadow).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            imageView.setBackground(combinedDrawable);
        }
        setClickable(true);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
    }

    public void setOnBackspace(Utilities.Callback<Boolean> callback) {
        this.onBackspace = callback;
    }

    public void postBackspaceRunnable(final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BackSpaceButtonView.this.lambda$postBackspaceRunnable$1(i);
            }
        }, i);
    }

    public void lambda$postBackspaceRunnable$1(int i) {
        if (this.backspacePressed) {
            Utilities.Callback<Boolean> callback = this.onBackspace;
            if (callback != null) {
                callback.run(Boolean.valueOf(i < 300));
                this.backspaceButton.performHapticFeedback(3);
            }
            this.backspaceOnce = true;
            postBackspaceRunnable(Math.max(50, i - 100));
        }
    }

    private int getThemedColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }
}
