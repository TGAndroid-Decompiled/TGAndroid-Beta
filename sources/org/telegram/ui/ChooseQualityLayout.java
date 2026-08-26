package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
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
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
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
        public final AnimatedFloat animatedCast;
        private final Drawable base;
        private final Paint bgLinePaint;
        private final Paint bgPaint = new Paint(1);
        public final AnimatedTextView.AnimatedTextDrawable bottomText;
        private final Drawable.Callback callback;
        public boolean cast;
        private final Paint castCutPaint;
        private final Path castCutPath;
        private final Drawable castFill;
        private int castFillColor;
        private final RectF rect;
        private final Theme.ResourcesProvider resourcesProvider;
        private float rotation;
        public final AnimatedTextView.AnimatedTextDrawable topText;

        public QualityIcon(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            Paint paint = new Paint(1);
            this.bgLinePaint = paint;
            this.rect = new RectF();
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
            this.topText = animatedTextDrawable;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable();
            this.bottomText = animatedTextDrawable2;
            Paint paint2 = new Paint(1);
            this.castCutPaint = paint2;
            Path path = new Path();
            this.castCutPath = path;
            this.animatedCast = new AnimatedFloat(new IntroActivity$$ExternalSyntheticLambda5(this, 12), 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            Drawable.Callback callback = new Drawable.Callback() {
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
            };
            this.callback = callback;
            this.resourcesProvider = resourcesProvider;
            this.base = context.getResources().getDrawable(i).mutate();
            this.castFill = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
            paint.setColor(-1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            animatedTextDrawable.setTextColor(-16777216);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(7.0f));
            animatedTextDrawable.setCallback(callback);
            animatedTextDrawable.setGravity(17);
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable2.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            animatedTextDrawable2.setTextColor(-16777216);
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(7.0f));
            animatedTextDrawable2.setCallback(callback);
            animatedTextDrawable2.setGravity(17);
            animatedTextDrawable2.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
            path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        @Override
        public void draw(Canvas canvas) {
            Canvas canvas2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5 = this.animatedCast.set(this.cast);
            float currentWidth = this.topText.getCurrentWidth() + (this.topText.isNotEmpty() * AndroidUtilities.dp(5.0f));
            float currentWidth2 = this.bottomText.getCurrentWidth() + (this.bottomText.isNotEmpty() * AndroidUtilities.dp(5.0f));
            int saveCount = canvas.getSaveCount();
            Rect bounds = getBounds();
            if (currentWidth > 0.0f || currentWidth2 > 0.0f || f5 > 0.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            } else {
                canvas2 = canvas;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), (bounds.width() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f), (bounds.height() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f));
            rect.offset(bounds.left, bounds.top);
            this.base.setBounds(rect);
            canvas2.save();
            canvas2.rotate(this.rotation * (-180.0f), bounds.centerX(), bounds.centerY());
            this.base.draw(canvas2);
            canvas2.restore();
            this.bgPaint.setColor(-1);
            float fWidth = (bounds.width() * 0.98f) + bounds.left;
            float fHeight = (bounds.height() * 0.18f) + bounds.top;
            float fHeight2 = (bounds.height() * 0.78f) + bounds.top;
            float fDp = AndroidUtilities.dp(10.0f);
            if (currentWidth > 0.0f) {
                float f6 = fDp / 2.0f;
                f = 2.0f;
                f2 = 3.0f;
                this.rect.set(fWidth - currentWidth, fHeight - f6, fWidth, fHeight + f6);
                canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.bgLinePaint);
            } else {
                f = 2.0f;
                f2 = 3.0f;
            }
            if (currentWidth2 > 0.0f) {
                float f7 = fDp / f;
                f3 = 0.0f;
                this.rect.set(fWidth - currentWidth2, fHeight2 - f7, fWidth, f7 + fHeight2);
                canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), this.bgLinePaint);
            } else {
                f3 = 0.0f;
            }
            float f8 = 1.0f - f5;
            if (currentWidth * f8 > f3) {
                f4 = 255.0f;
                this.bgPaint.setAlpha((int) (this.topText.isNotEmpty() * 255.0f * f8));
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.topText;
                animatedTextDrawable.setAlpha((int) (animatedTextDrawable.isNotEmpty() * 255.0f * f8));
                float f9 = fDp / f;
                this.rect.set(fWidth - currentWidth, fHeight - f9, fWidth, fHeight + f9);
                this.rect.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), this.bgPaint);
                this.rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
                this.topText.setBounds(this.rect);
                this.topText.draw(canvas2);
            } else {
                f4 = 255.0f;
            }
            if (f5 > f3) {
                canvas2.save();
                int color = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
                if (this.castFillColor != color) {
                    Drawable drawable = this.castFill;
                    this.castFillColor = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                Drawable drawable2 = this.castFill;
                drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(f2), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(f2), this.castFill.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
                this.castFill.setAlpha((int) (f5 * f4));
                float fLerp = AndroidUtilities.lerp(0.8f, 1.0f, f5);
                canvas2.scale(fLerp, fLerp, this.castFill.getBounds().centerX(), this.castFill.getBounds().centerY());
                if (f5 > 0.5f) {
                    canvas2.save();
                    canvas2.translate(this.castFill.getBounds().left, this.castFill.getBounds().top);
                    canvas2.drawPath(this.castCutPath, this.castCutPaint);
                    canvas2.restore();
                }
                this.castFill.draw(canvas2);
                canvas2.restore();
            }
            if (currentWidth2 > 0.0f) {
                this.bgPaint.setAlpha((int) (this.bottomText.isNotEmpty() * f4));
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.bottomText;
                animatedTextDrawable2.setAlpha((int) (animatedTextDrawable2.isNotEmpty() * f4));
                float f10 = fDp / f;
                this.rect.set(fWidth - currentWidth2, fHeight2 - f10, fWidth, fHeight2 + f10);
                this.rect.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), this.bgPaint);
                this.rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
                this.bottomText.setBounds(this.rect);
                this.bottomText.draw(canvas2);
            }
            canvas2.restoreToCount(saveCount);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(12.0f) + this.base.getIntrinsicHeight();
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(12.0f) + this.base.getIntrinsicWidth();
        }

        @Override
        public int getOpacity() {
            return this.base.getOpacity();
        }

        @Override
        public void setAlpha(int i) {
            this.base.setAlpha(i);
        }

        public void setCasting(boolean z, boolean z2) {
            if (this.cast == z) {
                return;
            }
            this.cast = z;
            if (!z2) {
                this.animatedCast.force(z);
            }
            invalidateSelf();
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

    public ChooseQualityLayout(Context context, PopupSwipeBackLayout popupSwipeBackLayout, Callback callback) {
        this.callback = callback;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, 0, null, 0);
        this.layout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        actionBarMenuSubItemAddItem.setOnClickListener(new ChooseSpeedLayout$$ExternalSyntheticLambda0(popupSwipeBackLayout, 2));
        actionBarMenuSubItemAddItem.setColors(-328966, -328966);
        actionBarMenuSubItemAddItem.setSelectorColor(268435455);
        View view = new FrameLayout(context) {
            @Override
            public void onMeasure(int i, int i2) {
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
        String string;
        if (videoPlayer == null || videoPlayer.getQualitiesCount() <= 1) {
            return false;
        }
        this.buttonsLayout.removeAllViews();
        int i = -1;
        while (i < videoPlayer.getQualitiesCount()) {
            VideoPlayer.Quality quality = i == -1 ? null : videoPlayer.getQuality(i);
            String strSubstring = "";
            if (quality == null) {
                string = LocaleController.getString(R.string.QualityAuto);
            } else {
                string = quality.toString();
                if (string.contains("\n")) {
                    String strSubstring2 = string.substring(0, string.indexOf("\n"));
                    strSubstring = string.substring(string.indexOf("\n") + 1);
                    string = strSubstring2;
                }
            }
            ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(this.buttonsLayout, 0, string, true, null);
            if (!TextUtils.isEmpty(strSubstring)) {
                actionBarMenuSubItemAddItem.setSubtext(strSubstring);
            }
            actionBarMenuSubItemAddItem.setChecked(i == videoPlayer.getSelectedQuality());
            actionBarMenuSubItemAddItem.setColors(-328966, -328966);
            actionBarMenuSubItemAddItem.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda323(this, i, 1));
            actionBarMenuSubItemAddItem.setSelectorColor(268435455);
            i++;
        }
        return true;
    }
}
