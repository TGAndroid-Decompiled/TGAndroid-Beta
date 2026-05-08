package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.spoilers.SpoilerEffect;

public class ChatReplyContainer extends FrameLayout {
    public Layout[] layouts;
    private final Theme.ResourcesProvider resourcesProvider;

    public ChatReplyContainer(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.layouts = new Layout[2];
        this.resourcesProvider = resourcesProvider;
        int i = 0;
        while (true) {
            Layout[] layoutArr = this.layouts;
            if (i < layoutArr.length) {
                layoutArr[i] = new Layout(context, resourcesProvider);
                addView(this.layouts[i], LayoutHelper.createFrame(-1, -1, 119));
                i++;
            } else {
                layoutArr[0].setVisibility(0);
                this.layouts[1].setVisibility(8);
                return;
            }
        }
    }

    public Layout current() {
        return this.layouts[0];
    }

    public void switchLayouts() {
        switchLayouts(true);
    }

    public void switchLayouts(boolean z) {
        Layout[] layoutArr = this.layouts;
        Layout layout = layoutArr[0];
        Layout layout2 = layoutArr[1];
        layoutArr[0] = layout2;
        layoutArr[1] = layout;
        if (z) {
            layout2.active = true;
            layout2.setVisibility(0);
            this.layouts[0].setScaleX(0.8f);
            this.layouts[0].setScaleY(0.8f);
            this.layouts[0].setAlpha(0.0f);
            this.layouts[0].setTranslationY(AndroidUtilities.dp(20.0f));
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.layouts[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            viewPropertyAnimatorTranslationY.setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
            final Layout layout3 = this.layouts[1];
            layout3.active = false;
            layout3.setVisibility(0);
            this.layouts[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(cubicBezierInterpolator).setDuration(320L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    layout3.setVisibility(8);
                }
            }).start();
            return;
        }
        layout.setVisibility(8);
        Layout[] layoutArr2 = this.layouts;
        layoutArr2[1].active = false;
        layoutArr2[0].setVisibility(0);
        this.layouts[0].setScaleX(1.0f);
        this.layouts[0].setScaleY(1.0f);
        this.layouts[0].setAlpha(1.0f);
        this.layouts[0].setTranslationY(0.0f);
        this.layouts[0].active = true;
    }

    public class Layout extends FrameLayout implements Theme.Colorable {
        public boolean active;
        public boolean hasSpoiler;
        public ImageView icon;
        public BackupImageView image;
        public SimpleTextView name;
        public SimpleTextView obj;
        public SimpleTextView objHint;
        private final Theme.ResourcesProvider resourcesProvider;

        public Layout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            ImageView imageView = new ImageView(context);
            this.icon = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.icon, LayoutHelper.createFrame(52, 46, 51));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.name = simpleTextView;
            simpleTextView.setTextSize(14);
            this.name.setTypeface(AndroidUtilities.bold());
            addView(this.name, LayoutHelper.createFrame(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.obj = simpleTextView2;
            simpleTextView2.setTextSize(14);
            NotificationCenter.listenEmojiLoading(this.obj);
            addView(this.obj, LayoutHelper.createFrame(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
            SimpleTextView simpleTextView3 = new SimpleTextView(context);
            this.objHint = simpleTextView3;
            simpleTextView3.setTextSize(14);
            this.objHint.setText(LocaleController.getString(R.string.TapForForwardingOptions));
            this.objHint.setAlpha(0.0f);
            addView(this.objHint, LayoutHelper.createFrame(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
            final SpoilerEffect spoilerEffect = new SpoilerEffect();
            BackupImageView backupImageView = new BackupImageView(context) {
                Path path = new Path();

                @Override
                public void draw(Canvas canvas) {
                    super.draw(canvas);
                    if (Layout.this.hasSpoiler) {
                        this.path.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(this.imageReceiver.getImageX(), this.imageReceiver.getImageY(), this.imageReceiver.getImageX2(), this.imageReceiver.getImageY2());
                        this.path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(this.path);
                        spoilerEffect.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(-1) * 0.325f)));
                        spoilerEffect.setBounds((int) this.imageReceiver.getImageX(), (int) this.imageReceiver.getImageY(), (int) this.imageReceiver.getImageX2(), (int) this.imageReceiver.getImageY2());
                        spoilerEffect.draw(canvas);
                        invalidate();
                        canvas.restore();
                    }
                }
            };
            this.image = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(this.image, LayoutHelper.createFrame(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
            updateColors();
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (this.active) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        }

        @Override
        public void updateColors() {
            this.icon.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_replyPanelIcons, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.name.setTextColor(Theme.getColor(Theme.key_chat_replyPanelName, this.resourcesProvider));
            SimpleTextView simpleTextView = this.obj;
            int i = Theme.key_glass_defaultText;
            simpleTextView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.obj.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
            this.objHint.setTextColor(Theme.getColor(i, this.resourcesProvider));
        }
    }
}
