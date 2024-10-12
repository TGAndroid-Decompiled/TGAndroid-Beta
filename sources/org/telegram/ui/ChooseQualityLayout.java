package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.PopupSwipeBackLayout;
import org.telegram.ui.Components.VideoPlayer;

public class ChooseQualityLayout {
    public final LinearLayout buttonsLayout;
    private final Callback callback;
    public final ActionBarPopupWindow.ActionBarPopupWindowLayout layout;

    public interface Callback {
        void onQualitySelected(int i, boolean z, boolean z2);
    }

    public static class QualityIcon extends Drawable {
        private final Drawable base;
        private final Paint bgPaint = new Paint(1);
        private final RectF rect = new RectF();
        private float rotation;
        public final AnimatedTextView.AnimatedTextDrawable text;

        public QualityIcon(Context context) {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
            this.text = animatedTextDrawable;
            this.base = context.getResources().getDrawable(R.drawable.msg_settings).mutate();
            animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            animatedTextDrawable.setTextColor(-1);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(8.0f));
            animatedTextDrawable.setCallback(new Drawable.Callback() {
                @Override
                public void invalidateDrawable(Drawable drawable) {
                    QualityIcon.this.invalidateSelf();
                }

                @Override
                public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                    QualityIcon.this.scheduleSelf(runnable, j);
                }

                @Override
                public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                    QualityIcon.this.unscheduleSelf(runnable);
                }
            });
            animatedTextDrawable.setGravity(17);
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        }

        @Override
        public void draw(Canvas canvas) {
            this.base.setBounds(getBounds());
            canvas.save();
            canvas.rotate(this.rotation * (-180.0f), r0.centerX(), r0.centerY());
            this.base.draw(canvas);
            canvas.restore();
            this.bgPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton));
            float width = r0.left + (r0.width() * 0.97f);
            float height = r0.top + (r0.height() * 0.75f);
            float dp = AndroidUtilities.dp(11.0f) / 2.0f;
            this.rect.set(width - ((AndroidUtilities.dp(5.0f) * this.text.isNotEmpty()) + this.text.getCurrentWidth()), height - dp, width, height + dp);
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.bgPaint);
            this.text.setBounds(this.rect);
            this.text.draw(canvas);
        }

        @Override
        public int getIntrinsicHeight() {
            return this.base.getIntrinsicHeight();
        }

        @Override
        public int getIntrinsicWidth() {
            return this.base.getIntrinsicWidth();
        }

        @Override
        public int getOpacity() {
            return this.base.getOpacity();
        }

        @Override
        public void setAlpha(int i) {
            this.base.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.base.setColorFilter(colorFilter);
        }

        public void setRotation(float f) {
            this.rotation = f;
            invalidateSelf();
        }
    }

    public ChooseQualityLayout(Context context, final PopupSwipeBackLayout popupSwipeBackLayout, Callback callback) {
        this.callback = callback;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, 0, null);
        this.layout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PopupSwipeBackLayout.this.closeForeground();
            }
        });
        addItem.setColors(-328966, -328966);
        addItem.setSelectorColor(268435455);
        View view = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
            }
        };
        view.setMinimumWidth(AndroidUtilities.dp(196.0f));
        view.setBackgroundColor(-15198184);
        actionBarPopupWindowLayout.addView(view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        view.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonsLayout = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindowLayout.addView(linearLayout);
    }

    public void lambda$update$1(int i, View view) {
        this.callback.onQualitySelected(i, true, true);
    }

    public boolean update(VideoPlayer videoPlayer) {
        String quality;
        if (videoPlayer == null || videoPlayer.getQualitiesCount() <= 1) {
            return false;
        }
        this.buttonsLayout.removeAllViews();
        final int i = -1;
        while (i < videoPlayer.getQualitiesCount()) {
            VideoPlayer.Quality quality2 = i == -1 ? null : videoPlayer.getQuality(i);
            String str = "";
            if (quality2 == null) {
                quality = LocaleController.getString(R.string.QualityAuto);
            } else {
                quality = quality2.toString();
                if (quality.contains("\n")) {
                    String substring = quality.substring(0, quality.indexOf("\n"));
                    str = quality.substring(quality.indexOf("\n") + 1);
                    quality = substring;
                }
            }
            ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(this.buttonsLayout, 0, quality, true, null);
            if (!TextUtils.isEmpty(str)) {
                addItem.setSubtext(str);
            }
            addItem.setChecked(i == videoPlayer.getSelectedQuality());
            addItem.setColors(-328966, -328966);
            addItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChooseQualityLayout.this.lambda$update$1(i, view);
                }
            });
            addItem.setSelectorColor(268435455);
            i++;
        }
        return true;
    }
}
