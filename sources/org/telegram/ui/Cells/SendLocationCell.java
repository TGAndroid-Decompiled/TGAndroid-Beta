package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
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
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ShareLocationDrawable;

public class SendLocationCell extends FrameLayout {
    private SimpleTextView accurateTextView;
    private int currentAccount;
    private long dialogId;
    private ImageView imageView;
    private Runnable invalidateRunnable;
    private boolean live;
    private boolean liveDisable;
    private final AnimatedFloat progress;
    private final AnimatedFloat progressAlpha;
    private final AnimatedFloat progressScale;
    private RectF rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private final AnimatedTextView.AnimatedTextDrawable textDrawable;
    private SimpleTextView titleTextView;
    public boolean useDivider;

    public SendLocationCell(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.invalidateRunnable = new Runnable() {
            @Override
            public void run() {
                SendLocationCell.this.checkText();
                SendLocationCell sendLocationCell = SendLocationCell.this;
                sendLocationCell.invalidate(((int) sendLocationCell.rect.left) - 5, ((int) SendLocationCell.this.rect.top) - 5, ((int) SendLocationCell.this.rect.right) + 5, ((int) SendLocationCell.this.rect.bottom) + 5);
                AndroidUtilities.runOnUIThread(SendLocationCell.this.invalidateRunnable, 1000L);
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.progress = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        this.progressAlpha = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        this.progressScale = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, false);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.3f, 0L, 320L, cubicBezierInterpolator);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable.setTypeface(Typeface.DEFAULT_BOLD);
        animatedTextDrawable.setGravity(17);
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
        this.titleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        View view = this.titleTextView;
        boolean z4 = LocaleController.isRTL;
        addView(view, LayoutHelper.createFrame(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 16.0f : 73.0f, 9.33f, z4 ? 73.0f : 16.0f, 0.0f));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.accurateTextView = simpleTextView2;
        simpleTextView2.setTextSize(14);
        this.accurateTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText3));
        this.accurateTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        View view2 = this.accurateTextView;
        boolean z5 = LocaleController.isRTL;
        addView(view2, LayoutHelper.createFrame(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 16.0f : 73.0f, 33.0f, z5 ? 73.0f : 16.0f, 0.0f));
        updateImage();
        setWillNotDraw(false);
    }

    private void updateImage() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Drawable drawableCreateSimpleSelectorCircleDrawable;
        int i8;
        SimpleTextView simpleTextView = this.titleTextView;
        if (this.live) {
            i = this.liveDisable ? Theme.key_text_RedBold : Theme.key_location_sendLiveLocationText;
        } else {
            i = Theme.key_location_sendLocationText;
        }
        simpleTextView.setTag(Integer.valueOf(i));
        SimpleTextView simpleTextView2 = this.titleTextView;
        if (this.live) {
            i2 = this.liveDisable ? Theme.key_text_RedBold : Theme.key_location_sendLiveLocationText;
        } else {
            i2 = Theme.key_location_sendLocationText;
        }
        simpleTextView2.setTextColor(getThemedColor(i2));
        ImageView imageView = this.imageView;
        if (this.live) {
            if (this.liveDisable) {
                i5 = Theme.key_color_red;
            } else {
                i3 = Theme.key_location_sendLiveLocationBackground;
                i4 = Theme.key_location_sendLiveLocationIcon;
            }
            imageView.setTag(Integer.valueOf(i5));
            int iDp = AndroidUtilities.dp(46.0f);
            if (this.live) {
                i6 = Theme.key_location_sendLocationBackground;
            } else if (this.liveDisable) {
                i6 = Theme.key_color_red;
            } else {
                i6 = Theme.key_location_sendLiveLocationBackground;
            }
            int themedColor = getThemedColor(i6);
            if (this.live) {
                i7 = Theme.key_location_sendLocationBackground;
            } else if (this.liveDisable) {
                i7 = Theme.key_color_red;
            } else {
                i7 = Theme.key_location_sendLiveLocationBackground;
            }
            drawableCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(iDp, themedColor, getThemedColor(i7));
            if (this.live) {
                this.rect = new RectF();
                Context context = getContext();
                if (this.liveDisable) {
                    i8 = 5;
                } else {
                    i8 = 4;
                }
                ShareLocationDrawable shareLocationDrawable = new ShareLocationDrawable(context, i8);
                shareLocationDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_location_sendLiveLocationIcon), PorterDuff.Mode.MULTIPLY));
                CombinedDrawable combinedDrawable = new CombinedDrawable(drawableCreateSimpleSelectorCircleDrawable, shareLocationDrawable);
                combinedDrawable.setCustomSize(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f));
                this.imageView.setBackgroundDrawable(combinedDrawable);
                if (this.liveDisable) {
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(this.invalidateRunnable);
                AndroidUtilities.runOnUIThread(this.invalidateRunnable, 1000L);
                return;
            }
            Drawable drawableMutate = getResources().getDrawable(R.drawable.pin).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_location_sendLocationIcon), PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(drawableCreateSimpleSelectorCircleDrawable, drawableMutate);
            combinedDrawable2.setCustomSize(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f));
            combinedDrawable2.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            this.imageView.setBackgroundDrawable(combinedDrawable2);
        }
        i3 = Theme.key_location_sendLocationBackground;
        i4 = Theme.key_location_sendLocationIcon;
        i5 = i3 + i4;
        imageView.setTag(Integer.valueOf(i5));
        int iDp2 = AndroidUtilities.dp(46.0f);
        if (this.live) {
            i6 = Theme.key_location_sendLocationBackground;
        } else if (this.liveDisable) {
            i6 = Theme.key_color_red;
        } else {
            i6 = Theme.key_location_sendLiveLocationBackground;
        }
        int themedColor2 = getThemedColor(i6);
        if (this.live) {
            i7 = Theme.key_location_sendLocationBackground;
        } else if (this.liveDisable) {
            i7 = Theme.key_color_red;
        } else {
            i7 = Theme.key_location_sendLiveLocationBackground;
        }
        drawableCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(iDp2, themedColor2, getThemedColor(i7));
        if (this.live) {
            this.rect = new RectF();
            Context context2 = getContext();
            if (this.liveDisable) {
                i8 = 5;
            } else {
                i8 = 4;
            }
            ShareLocationDrawable shareLocationDrawable2 = new ShareLocationDrawable(context2, i8);
            shareLocationDrawable2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_location_sendLiveLocationIcon), PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable3 = new CombinedDrawable(drawableCreateSimpleSelectorCircleDrawable, shareLocationDrawable2);
            combinedDrawable3.setCustomSize(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f));
            this.imageView.setBackgroundDrawable(combinedDrawable3);
            if (this.liveDisable) {
                AndroidUtilities.cancelRunOnUIThread(this.invalidateRunnable);
                AndroidUtilities.runOnUIThread(this.invalidateRunnable, 1000L);
                return;
            }
            return;
        }
        Drawable drawableMutate2 = getResources().getDrawable(R.drawable.pin).mutate();
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_location_sendLocationIcon), PorterDuff.Mode.MULTIPLY));
        CombinedDrawable combinedDrawable4 = new CombinedDrawable(drawableCreateSimpleSelectorCircleDrawable, drawableMutate2);
        combinedDrawable4.setCustomSize(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f));
        combinedDrawable4.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        this.imageView.setBackgroundDrawable(combinedDrawable4);
    }

    private ImageView getImageView() {
        return this.imageView;
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

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.invalidateRunnable);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.rect != null) {
            AndroidUtilities.cancelRunOnUIThread(this.invalidateRunnable);
            AndroidUtilities.runOnUIThread(this.invalidateRunnable, 1000L);
        }
    }

    public void setText(String str, String str2) {
        this.titleTextView.setText(str);
        this.accurateTextView.setText(str2);
    }

    public void setDialogId(long j) {
        this.dialogId = j;
        if (this.live) {
            checkText();
        }
    }

    public void checkText() {
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId);
        if (sharingLocationInfo != null) {
            if (this.liveDisable) {
                String string = LocaleController.getString(R.string.StopLiveLocation);
                TLRPC.Message message = sharingLocationInfo.messageObject.messageOwner;
                int i = message.edit_date;
                setText(string, LocaleController.formatLocationUpdateDate(i != 0 ? i : message.date));
                return;
            }
            setText(LocaleController.getString(R.string.SharingLiveLocation), LocaleController.getString(R.string.SharingLiveLocationAdd));
            return;
        }
        setText(LocaleController.getString(R.string.SendLiveLocation), LocaleController.getString(R.string.SendLiveLocationInfo));
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.textDrawable || super.verifyDrawable(drawable);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        int i;
        Paint themePaint;
        if (!this.useDivider || (themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(73.0f) : 0), getMeasuredHeight(), themePaint);
        }
        if (this.liveDisable) {
            return;
        }
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId);
        float fAbs = this.progress.get();
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        if (sharingLocationInfo != null && (i = sharingLocationInfo.stopTime) >= currentTime && sharingLocationInfo.period != Integer.MAX_VALUE) {
            fAbs = Math.abs(i - currentTime) / sharingLocationInfo.period;
            f = this.progressAlpha.set(true);
        } else {
            f = this.progressAlpha.set(false);
        }
        float f2 = fAbs;
        float f3 = f;
        if (f3 <= 0.0f) {
            return;
        }
        if (LocaleController.isRTL) {
            this.rect.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        } else {
            this.rect.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        }
        canvas2.save();
        float f4 = 1.0f;
        float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, f3);
        canvas2.scale(fLerp, fLerp, this.rect.centerX(), this.rect.centerY());
        int themedColor = getThemedColor(Theme.key_location_liveLocationProgress);
        Theme.chat_radialProgress2Paint.setColor(themedColor);
        int alpha = Theme.chat_radialProgress2Paint.getAlpha();
        float f5 = alpha;
        Theme.chat_radialProgress2Paint.setAlpha((int) (0.2f * f5 * f3));
        canvas2.drawArc(this.rect, -90.0f, 360.0f, false, Theme.chat_radialProgress2Paint);
        Theme.chat_radialProgress2Paint.setAlpha((int) (f5 * f3));
        canvas.drawArc(this.rect, -90.0f, this.progress.set(f2) * (-360.0f), false, Theme.chat_radialProgress2Paint);
        Theme.chat_radialProgress2Paint.setAlpha(alpha);
        if (sharingLocationInfo != null) {
            this.textDrawable.setText(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)));
        }
        int length = this.textDrawable.getText().length();
        AnimatedFloat animatedFloat = this.progressScale;
        if (length > 4) {
            f4 = 0.75f;
        } else if (length > 3) {
            f4 = 0.85f;
        }
        float f6 = animatedFloat.set(f4);
        canvas.scale(f6, f6, this.rect.centerX(), this.rect.centerY());
        this.textDrawable.setTextColor(themedColor);
        this.textDrawable.setAlpha((int) (f3 * 255.0f));
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        RectF rectF = this.rect;
        int i2 = (int) rectF.left;
        int iCenterY = (int) (rectF.centerY() - AndroidUtilities.dp(13.0f));
        RectF rectF2 = this.rect;
        animatedTextDrawable.setBounds(i2, iCenterY, (int) rectF2.right, (int) (rectF2.centerY() + AndroidUtilities.dp(12.0f)));
        this.textDrawable.draw(canvas);
        canvas.restore();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
