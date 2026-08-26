package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ShareLocationDrawable;

public final class SendLocationCell extends FrameLayout {
    public final SimpleTextView accurateTextView;
    public final int currentAccount;
    public long dialogId;
    public final ImageView imageView;
    public final BubbleActivity.AnonymousClass1 invalidateRunnable;
    public final boolean live;
    public final boolean liveDisable;
    public final AnimatedFloat progress;
    public final AnimatedFloat progressAlpha;
    public final AnimatedFloat progressScale;
    public final RectF rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnimatedTextView.AnimatedTextDrawable textDrawable;
    public final SimpleTextView titleTextView;
    public boolean useDivider;

    public SendLocationCell(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable;
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        BubbleActivity.AnonymousClass1 anonymousClass1 = new BubbleActivity.AnonymousClass1(this, 6);
        this.invalidateRunnable = anonymousClass1;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.progress = new AnimatedFloat(350L, this, cubicBezierInterpolator);
        this.progressAlpha = new AnimatedFloat(350L, this, cubicBezierInterpolator);
        this.progressScale = new AnimatedFloat(350L, this, cubicBezierInterpolator);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, false, false);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.moveAmplitude = 0.3f;
        animatedTextDrawable.animateDuration = 320L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable.textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        animatedTextDrawable.gravity = 17;
        animatedTextDrawable.setCallback(this);
        this.resourcesProvider = resourcesProvider;
        this.live = z;
        this.liveDisable = z2;
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        boolean z3 = LocaleController.isRTL;
        addView(imageView, LayoutHelper.createFrame(46, 46.0f, (z3 ? 5 : 3) | 16, z3 ? 0.0f : 13.0f, 0.0f, z3 ? 13.0f : 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.titleTextView = simpleTextView;
        simpleTextView.setTextSize(16);
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        boolean z4 = LocaleController.isRTL;
        addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 16.0f : 73.0f, 9.33f, z4 ? 73.0f : 16.0f, 0.0f));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.accurateTextView = simpleTextView2;
        simpleTextView2.setTextSize(14);
        simpleTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
        simpleTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z5 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 16.0f : 73.0f, 33.0f, z5 ? 73.0f : 16.0f, 0.0f));
        if (z) {
            i = z2 ? Theme.key_text_RedBold : Theme.key_location_sendLiveLocationText;
        } else {
            i = Theme.key_location_sendLocationText;
        }
        simpleTextView.setTag(Integer.valueOf(i));
        if (z) {
            i2 = z2 ? Theme.key_text_RedBold : Theme.key_location_sendLiveLocationText;
        } else {
            i2 = Theme.key_location_sendLocationText;
        }
        simpleTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        if (z) {
            if (z2) {
                i5 = Theme.key_color_red;
            } else {
                i3 = Theme.key_location_sendLiveLocationBackground;
                i4 = Theme.key_location_sendLiveLocationIcon;
            }
            imageView.setTag(Integer.valueOf(i5));
            int iDp = AndroidUtilities.dp(46.0f);
            if (z) {
                i6 = Theme.key_location_sendLocationBackground;
            } else if (z2) {
                i6 = Theme.key_color_red;
            } else {
                i6 = Theme.key_location_sendLiveLocationBackground;
            }
            int color = Theme.getColor(i6, resourcesProvider);
            if (z) {
                i7 = Theme.key_location_sendLocationBackground;
            } else if (z2) {
                i7 = Theme.key_color_red;
            } else {
                i7 = Theme.key_location_sendLiveLocationBackground;
            }
            rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(iDp, color, Theme.getColor(i7, resourcesProvider));
            if (z) {
                this.rect = new RectF();
                ShareLocationDrawable shareLocationDrawable = new ShareLocationDrawable(getContext(), z2 ? 5 : 4);
                shareLocationDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_location_sendLiveLocationIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                CombinedDrawable combinedDrawable = new CombinedDrawable(rippleDrawableSafeCreateSimpleSelectorCircleDrawable, shareLocationDrawable);
                int iDp2 = AndroidUtilities.dp(46.0f);
                int iDp3 = AndroidUtilities.dp(46.0f);
                combinedDrawable.backWidth = iDp2;
                combinedDrawable.backHeight = iDp3;
                imageView.setBackgroundDrawable(combinedDrawable);
                if (!z2) {
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                    AndroidUtilities.runOnUIThread(anonymousClass1, 1000L);
                }
            } else {
                Drawable drawableMutate = getResources().getDrawable(R.drawable.pin).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_location_sendLocationIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                CombinedDrawable combinedDrawable2 = new CombinedDrawable(rippleDrawableSafeCreateSimpleSelectorCircleDrawable, drawableMutate);
                int iDp4 = AndroidUtilities.dp(46.0f);
                int iDp5 = AndroidUtilities.dp(46.0f);
                combinedDrawable2.backWidth = iDp4;
                combinedDrawable2.backHeight = iDp5;
                int iDp6 = AndroidUtilities.dp(24.0f);
                int iDp7 = AndroidUtilities.dp(24.0f);
                combinedDrawable2.iconWidth = iDp6;
                combinedDrawable2.iconHeight = iDp7;
                imageView.setBackgroundDrawable(combinedDrawable2);
            }
            setWillNotDraw(false);
        }
        i3 = Theme.key_location_sendLocationBackground;
        i4 = Theme.key_location_sendLocationIcon;
        i5 = i3 + i4;
        imageView.setTag(Integer.valueOf(i5));
        int iDp8 = AndroidUtilities.dp(46.0f);
        if (z) {
            i6 = Theme.key_location_sendLocationBackground;
        } else if (z2) {
            i6 = Theme.key_color_red;
        } else {
            i6 = Theme.key_location_sendLiveLocationBackground;
        }
        int color2 = Theme.getColor(i6, resourcesProvider);
        if (z) {
            i7 = Theme.key_location_sendLocationBackground;
        } else if (z2) {
            i7 = Theme.key_color_red;
        } else {
            i7 = Theme.key_location_sendLiveLocationBackground;
        }
        rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(iDp8, color2, Theme.getColor(i7, resourcesProvider));
        if (z) {
            this.rect = new RectF();
            ShareLocationDrawable shareLocationDrawable2 = new ShareLocationDrawable(getContext(), z2 ? 5 : 4);
            shareLocationDrawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_location_sendLiveLocationIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable3 = new CombinedDrawable(rippleDrawableSafeCreateSimpleSelectorCircleDrawable, shareLocationDrawable2);
            int iDp9 = AndroidUtilities.dp(46.0f);
            int iDp10 = AndroidUtilities.dp(46.0f);
            combinedDrawable3.backWidth = iDp9;
            combinedDrawable3.backHeight = iDp10;
            imageView.setBackgroundDrawable(combinedDrawable3);
            if (!z2) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                AndroidUtilities.runOnUIThread(anonymousClass1, 1000L);
            }
        } else {
            Drawable drawableMutate2 = getResources().getDrawable(R.drawable.pin).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_location_sendLocationIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable4 = new CombinedDrawable(rippleDrawableSafeCreateSimpleSelectorCircleDrawable, drawableMutate2);
            int iDp11 = AndroidUtilities.dp(46.0f);
            int iDp12 = AndroidUtilities.dp(46.0f);
            combinedDrawable4.backWidth = iDp11;
            combinedDrawable4.backHeight = iDp12;
            int iDp13 = AndroidUtilities.dp(24.0f);
            int iDp14 = AndroidUtilities.dp(24.0f);
            combinedDrawable4.iconWidth = iDp13;
            combinedDrawable4.iconHeight = iDp14;
            imageView.setBackgroundDrawable(combinedDrawable4);
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.imageView;
    }

    public final void checkText() {
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId);
        if (sharingLocationInfo == null) {
            setText(LocaleController.getString(R.string.SendLiveLocation), LocaleController.getString(R.string.SendLiveLocationInfo));
            return;
        }
        if (!this.liveDisable) {
            setText(LocaleController.getString(R.string.SharingLiveLocation), LocaleController.getString(R.string.SharingLiveLocationAdd));
            return;
        }
        String string = LocaleController.getString(R.string.StopLiveLocation);
        TLRPC.Message message = sharingLocationInfo.messageObject.messageOwner;
        int i = message.edit_date;
        setText(string, LocaleController.formatLocationUpdateDate(i != 0 ? i : message.date));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.rect != null) {
            BubbleActivity.AnonymousClass1 anonymousClass1 = this.invalidateRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            AndroidUtilities.runOnUIThread(anonymousClass1, 1000L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.invalidateRunnable);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        int i;
        Paint themePaint;
        boolean z = this.useDivider;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (!z || (themePaint = Theme.getThemePaint("paintDivider", resourcesProvider)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(73.0f) : 0), getMeasuredHeight(), themePaint);
        }
        if (this.liveDisable) {
            return;
        }
        int i2 = this.currentAccount;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i2).getSharingLocationInfo(this.dialogId);
        AnimatedFloat animatedFloat = this.progress;
        float fAbs = animatedFloat.value;
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        AnimatedFloat animatedFloat2 = this.progressAlpha;
        if (sharingLocationInfo == null || (i = sharingLocationInfo.stopTime) < currentTime || sharingLocationInfo.period == Integer.MAX_VALUE) {
            animatedFloat2.getClass();
            f = animatedFloat2.set(0.0f, false);
        } else {
            fAbs = Math.abs(i - currentTime) / sharingLocationInfo.period;
            f = animatedFloat2.set(true);
        }
        float f4 = f;
        float f5 = fAbs;
        if (f4 <= 0.0f) {
            return;
        }
        boolean z2 = LocaleController.isRTL;
        RectF rectF = this.rect;
        if (z2) {
            f2 = 13.0f;
            rectF.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        } else {
            f2 = 13.0f;
            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        }
        canvas2.save();
        float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, f4);
        canvas2.scale(fLerp, fLerp, rectF.centerX(), rectF.centerY());
        int color = Theme.getColor(Theme.key_location_liveLocationProgress, resourcesProvider);
        Theme.chat_radialProgress2Paint.setColor(color);
        int alpha = Theme.chat_radialProgress2Paint.getAlpha();
        float f6 = alpha;
        Theme.chat_radialProgress2Paint.setAlpha((int) (0.2f * f6 * f4));
        canvas2.drawArc(rectF, -90.0f, 360.0f, false, Theme.chat_radialProgress2Paint);
        Theme.chat_radialProgress2Paint.setAlpha((int) (f6 * f4));
        canvas.drawArc(rectF, -90.0f, animatedFloat.set(f5, false) * (-360.0f), false, Theme.chat_radialProgress2Paint);
        Theme.chat_radialProgress2Paint.setAlpha(alpha);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        if (sharingLocationInfo != null) {
            animatedTextDrawable.setText(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
        }
        int length = animatedTextDrawable.currentText.length();
        if (length > 4) {
            f3 = 0.75f;
        } else {
            f3 = length > 3 ? 0.85f : 1.0f;
        }
        float f7 = this.progressScale.set(f3, false);
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        animatedTextDrawable.textPaint.setColor(color);
        Color.alpha(color);
        animatedTextDrawable.alpha = (int) (f4 * 255.0f);
        animatedTextDrawable.setBounds((int) rectF.left, (int) (rectF.centerY() - AndroidUtilities.dp(f2)), (int) rectF.right, (int) (rectF.centerY() + AndroidUtilities.dp(12.0f)));
        animatedTextDrawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setDialogId(long j) {
        this.dialogId = j;
        if (this.live) {
            checkText();
        }
    }

    public void setHasLocation(boolean z) {
        if (LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId) == null) {
            this.titleTextView.setAlpha(z ? 1.0f : 0.5f);
            this.accurateTextView.setAlpha(z ? 1.0f : 0.5f);
            this.imageView.setAlpha(z ? 1.0f : 0.5f);
        }
        if (this.live) {
            checkText();
        }
    }

    public final void setText(String str, String str2) {
        this.titleTextView.setText(str, false);
        this.accurateTextView.setText(str2, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.textDrawable || super.verifyDrawable(drawable);
    }
}
