package org.telegram.p009ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.FlickerLoadingView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;

public class LocationCell extends FrameLayout {
    private static FlickerLoadingView globalGradientView;
    private TextView addressTextView;
    private ShapeDrawable circleDrawable;
    private float enterAlpha;
    private ValueAnimator enterAnimator;
    private BackupImageView imageView;
    private TextView nameTextView;
    private boolean needDivider;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean wrapContent;

    public LocationCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.enterAlpha = 0.0f;
        this.resourcesProvider = resourcesProvider;
        this.wrapContent = z;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        ShapeDrawable createCircleDrawable = Theme.createCircleDrawable(AndroidUtilities.m35dp(42.0f), -1);
        this.circleDrawable = createCircleDrawable;
        backupImageView.setBackground(createCircleDrawable);
        this.imageView.setSize(AndroidUtilities.m35dp(30.0f), AndroidUtilities.m35dp(30.0f));
        BackupImageView backupImageView2 = this.imageView;
        boolean z2 = LocaleController.isRTL;
        addView(backupImageView2, LayoutHelper.createFrame(42, 42.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 15.0f, 11.0f, z2 ? 15.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextSize(1, 16.0f);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.nameTextView.setSingleLine(true);
        this.nameTextView.setTextColor(getThemedColor("windowBackgroundWhiteBlackText"));
        this.nameTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.nameTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView2 = this.nameTextView;
        boolean z3 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 16 : 73, 10.0f, z3 ? 73 : 16, 0.0f));
        TextView textView3 = new TextView(context);
        this.addressTextView = textView3;
        textView3.setTextSize(1, 14.0f);
        this.addressTextView.setMaxLines(1);
        this.addressTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.addressTextView.setSingleLine(true);
        this.addressTextView.setTextColor(getThemedColor("windowBackgroundWhiteGrayText3"));
        this.addressTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView4 = this.addressTextView;
        boolean z4 = LocaleController.isRTL;
        addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 16 : 73, 35.0f, z4 ? 73 : 16, 0.0f));
        this.imageView.setAlpha(this.enterAlpha);
        this.nameTextView.setAlpha(this.enterAlpha);
        this.addressTextView.setAlpha(this.enterAlpha);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.wrapContent) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }
    }

    public BackupImageView getImageView() {
        return this.imageView;
    }

    public void setLocation(TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue, String str, int i, boolean z) {
        setLocation(tLRPC$TL_messageMediaVenue, str, null, i, z);
    }

    public static int getColorForIndex(int i) {
        int i2 = i % 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return i2 != 5 ? -1285237 : -12338729;
                        }
                        return -7900675;
                    }
                    return -13187226;
                }
                return -12214795;
            }
            return -868277;
        }
        return -1351584;
    }

    public void setLocation(TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue, String str, String str2, int i, boolean z) {
        this.needDivider = z;
        this.circleDrawable.getPaint().setColor(getColorForIndex(i));
        if (tLRPC$TL_messageMediaVenue != null) {
            this.nameTextView.setText(tLRPC$TL_messageMediaVenue.title);
        }
        if (str2 != null) {
            this.addressTextView.setText(str2);
        } else if (tLRPC$TL_messageMediaVenue != null) {
            this.addressTextView.setText(tLRPC$TL_messageMediaVenue.address);
        }
        if (str != null) {
            this.imageView.setImage(str, null, null);
        }
        setWillNotDraw(false);
        setClickable(tLRPC$TL_messageMediaVenue == null);
        ValueAnimator valueAnimator = this.enterAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z2 = tLRPC$TL_messageMediaVenue == null;
        final float f = this.enterAlpha;
        final float f2 = z2 ? 0.0f : 1.0f;
        final long abs = Math.abs(f - f2) * 150.0f;
        this.enterAnimator = ValueAnimator.ofFloat(f, f2);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.enterAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LocationCell.this.lambda$setLocation$0(elapsedRealtime, abs, f, f2, valueAnimator2);
            }
        });
        ValueAnimator valueAnimator2 = this.enterAnimator;
        if (z2) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.enterAnimator.start();
        this.imageView.setAlpha(f);
        this.nameTextView.setAlpha(f);
        this.addressTextView.setAlpha(f);
        invalidate();
    }

    public void lambda$setLocation$0(long j, long j2, float f, float f2, ValueAnimator valueAnimator) {
        float lerp = AndroidUtilities.lerp(f, f2, j2 > 0 ? Math.min(Math.max(((float) (SystemClock.elapsedRealtime() - j)) / ((float) j2), 0.0f), 1.0f) : 1.0f);
        this.enterAlpha = lerp;
        this.imageView.setAlpha(lerp);
        this.nameTextView.setAlpha(this.enterAlpha);
        this.addressTextView.setAlpha(this.enterAlpha);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (globalGradientView == null) {
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext());
            globalGradientView = flickerLoadingView;
            flickerLoadingView.setIsSingleCell(true);
        }
        globalGradientView.setParentSize(getMeasuredWidth(), getMeasuredHeight(), (-(getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0)) * AndroidUtilities.m35dp(56.0f));
        globalGradientView.setViewType(4);
        globalGradientView.updateColors();
        globalGradientView.updateGradient();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.enterAlpha) * 255.0f), 31);
        canvas.translate(AndroidUtilities.m35dp(2.0f), (getMeasuredHeight() - AndroidUtilities.m35dp(56.0f)) / 2);
        globalGradientView.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.m35dp(72.0f), getHeight() - 1, LocaleController.isRTL ? getWidth() - AndroidUtilities.m35dp(72.0f) : getWidth(), getHeight() - 1, Theme.dividerPaint);
        }
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
