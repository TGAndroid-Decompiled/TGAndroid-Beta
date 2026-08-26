package org.telegram.ui.Components.Reactions;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.RoundRectOutlineProvider;

public final class BackSpaceButtonView extends FrameLayout {
    public static final int $r8$clinit = 0;
    public final AnonymousClass1 backspaceButton;
    public boolean backspaceOnce;
    public boolean backspacePressed;
    public Utilities.Callback onBackspace;

    public BackSpaceButtonView(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        ?? r0 = new ImageView(activity) {
            public long lastClick = 0;

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                Utilities.Callback callback;
                int action = motionEvent.getAction();
                BackSpaceButtonView backSpaceButtonView = BackSpaceButtonView.this;
                if (action == 0) {
                    if (System.currentTimeMillis() < this.lastClick + 350) {
                        return false;
                    }
                    this.lastClick = System.currentTimeMillis();
                    backSpaceButtonView.backspacePressed = true;
                    backSpaceButtonView.backspaceOnce = false;
                    AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda17(backSpaceButtonView, 350, 3), 350);
                } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    backSpaceButtonView.backspacePressed = false;
                    if (!backSpaceButtonView.backspaceOnce && (callback = backSpaceButtonView.onBackspace) != null) {
                        callback.run(Boolean.FALSE);
                        try {
                            backSpaceButtonView.backspaceButton.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                super.onTouchEvent(motionEvent);
                return true;
            }
        };
        this.backspaceButton = r0;
        r0.setHapticFeedbackEnabled(true);
        r0.setImageResource(R.drawable.smiles_tab_clear);
        int i = Theme.key_chat_emojiPanelBackspace;
        r0.setColorFilter(new PorterDuffColorFilter(resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        r0.setScaleType(ImageView.ScaleType.CENTER);
        r0.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        r0.setFocusable(true);
        r0.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(9));
        addView((View) r0, LayoutHelper.createFrame(36, 36, 17));
        int color = Theme.getColor(null, Theme.key_listSelector, false);
        int iDp = AndroidUtilities.dp(36.0f);
        int i2 = Theme.key_windowBackgroundWhite;
        r0.setBackground(Theme.createSimpleSelectorCircleDrawable(iDp, resourcesProvider != null ? resourcesProvider.getColor(i2) : Theme.getColor(null, i2, false), color));
        r0.setOutlineProvider(new RoundRectOutlineProvider(18));
        r0.setElevation(AndroidUtilities.dp(1.0f));
        r0.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
    }

    public void setOnBackspace(Utilities.Callback<Boolean> callback) {
        this.onBackspace = callback;
    }
}
