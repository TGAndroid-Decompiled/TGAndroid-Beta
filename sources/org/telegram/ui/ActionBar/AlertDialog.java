package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AttachableDrawable;
import org.telegram.ui.Components.EffectsTextView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.BalanceCloud;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.iv.RichEditor;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public class AlertDialog extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public View aboveMessageView;
    public int additioanalHorizontalPadding;
    public float aspectRatio;
    public int backgroundColor;
    public final Rect backgroundPaddings;
    public Bitmap blurBitmap;
    public Matrix blurMatrix;
    public final float blurOpacity;
    public Paint blurPaint;
    public BitmapShader blurShader;
    public boolean blurredBackground;
    public View bottomView;
    public boolean buttonsInTwoRows;
    public ViewGroup buttonsLayout;
    public boolean canCacnel;
    public AlertDialog cancelDialog;
    public boolean checkFocusable;
    public AlertDialogView containerView;
    public final int[] containerViewLocation;
    public AnonymousClass3 contentScrollView;
    public int currentProgress;
    public View customView;
    public int customViewHeight;
    public int customViewOffset;
    public int customWidth;
    public int dialogButtonColorKey;
    public float dimAlpha;
    public Paint dimBlurPaint;
    public boolean dimEnabled;
    public boolean dismissDialogByButtons;
    public final AlertDialog$$ExternalSyntheticLambda1 dismissRunnable;
    public boolean dismissed;
    public boolean drawBackground;
    public boolean focusable;
    public FrameLayout fullscreenContainerView;
    public int[] itemIcons;
    public final ArrayList itemViews;
    public CharSequence[] items;
    public int lastScreenWidth;
    public LineProgressView lineProgressView;
    public TextView lineProgressViewPercent;
    public CharSequence message;
    public EffectsTextView messageTextView;
    public boolean messageTextViewClickable;
    public boolean needStarsBalance;
    public OnButtonClickListener negative2ButtonListener;
    public CharSequence negative2ButtonText;
    public OnButtonClickListener negativeButtonListener;
    public CharSequence negativeButtonText;
    public OnButtonClickListener neutralButtonListener;
    public CharSequence neutralButtonText;
    public boolean notDrawBackgroundOnTopView;
    public OnButtonClickListener onBackButtonListener;
    public DialogInterface.OnCancelListener onCancelListener;
    public DialogInterface.OnClickListener onClickListener;
    public DialogInterface.OnDismissListener onDismissListener;
    public AlertDialog$AlertDialogView$$ExternalSyntheticLambda0 onScrollChangedListener;
    public Utilities.Callback overridenDissmissListener;
    public OnButtonClickListener positiveButtonListener;
    public CharSequence positiveButtonText;
    public FrameLayout progressViewContainer;
    public final int progressViewStyle;
    public final Theme.ResourcesProvider resourcesProvider;
    public LinearLayout scrollContainer;
    public final BitmapDrawable[] shadow;
    public final AnimatorSet[] shadowAnimation;
    public final Drawable shadowDrawable;
    public final boolean[] shadowVisibility;
    public final AlertDialog$$ExternalSyntheticLambda1 showRunnable;
    public long shownAt;
    public BalanceCloud starsBalanceCloud;
    public CharSequence subtitle;
    public TextView subtitleTextView;
    public CharSequence title;
    public FrameLayout titleContainer;
    public SpoilersTextView titleTextView;
    public boolean topAnimationAutoRepeat;
    public int topAnimationId;
    public boolean topAnimationIsNew;
    public Map topAnimationLayerColors;
    public int topAnimationSize;
    public int topBackgroundColor;
    public Drawable topDrawable;
    public int topHeight;
    public RLottieImageView topImageView;
    public int topResId;
    public View topView;
    public boolean twoRowsButtonsWhenNeeded;
    public boolean verticalButtons;
    public boolean withCancelDialog;

    public final class AnonymousClass5 extends TextViewWithLoading {
        @Override
        public final void setEnabled(boolean z) {
            super.setEnabled(z);
            setAlpha(z ? 1.0f : 0.5f);
        }

        @Override
        public final void setTextColor(int i) {
            super.setTextColor(i);
            setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(20.0f), i));
        }
    }

    public final class AnonymousClass6 extends TextViewWithLoading {
        @Override
        public final void setEnabled(boolean z) {
            super.setEnabled(z);
            setAlpha(z ? 1.0f : 0.5f);
        }

        @Override
        public final void setTextColor(int i) {
            super.setTextColor(i);
            setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(20.0f), i));
        }
    }

    public final class AnonymousClass7 extends TextViewWithLoading {
        @Override
        public final void setEnabled(boolean z) {
            super.setEnabled(z);
            setAlpha(z ? 1.0f : 0.5f);
        }

        @Override
        public final void setTextColor(int i) {
            super.setTextColor(i);
            setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(20.0f), i));
        }
    }

    public final class AnonymousClass8 extends TextViewWithLoading {
        @Override
        public final void setEnabled(boolean z) {
            super.setEnabled(z);
            setAlpha(z ? 1.0f : 0.5f);
        }

        @Override
        public final void setTextColor(int i) {
            super.setTextColor(i);
            setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(20.0f), i));
        }
    }

    public final class AlertDialogCell extends FrameLayout {
        public final ImageView imageView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView textView;

        public AlertDialogCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider), 2, -1));
            setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setGravity(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 16.0f);
            addView(textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public void setGravity(int i) {
            this.textView.setGravity(i);
        }

        public final void setTextAndIcon(CharSequence charSequence, int i) {
            TextView textView = this.textView;
            textView.setText(charSequence);
            ImageView imageView = this.imageView;
            if (i == 0) {
                imageView.setVisibility(4);
                textView.setPadding(0, 0, 0, 0);
            } else {
                imageView.setImageResource(i);
                imageView.setVisibility(0);
                textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(56.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(56.0f) : 0, 0);
            }
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }
    }

    public final class AlertDialogView extends LinearLayout {
        public final Paint backgroundPaint;
        public final AnimatedFloat blurPaintAlpha;
        public boolean inLayout;
        public final AlertDialog this$0;

        public AlertDialogView(Context context, AlertDialog alertDialog) {
            super(context);
            this.this$0 = alertDialog;
            this.blurPaintAlpha = new AnimatedFloat(0.0f, this);
            this.backgroundPaint = new Paint(1);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            AlertDialog alertDialog = this.this$0;
            if (alertDialog.drawBackground && !alertDialog.blurredBackground) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Drawable drawable = alertDialog.shadowDrawable;
                drawable.setBounds(0, 0, measuredWidth, measuredHeight);
                View view = alertDialog.topView;
                if (view == null || !alertDialog.notDrawBackgroundOnTopView) {
                    drawable.draw(canvas);
                } else {
                    int bottom = view.getBottom();
                    canvas.save();
                    canvas.clipRect(0, bottom, getMeasuredWidth(), getMeasuredHeight());
                    drawable.draw(canvas);
                    canvas.restore();
                }
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public final void draw(Canvas canvas) {
            float fDp;
            AlertDialog alertDialog = this.this$0;
            if (alertDialog.blurredBackground) {
                if (alertDialog.progressViewStyle != 3 || alertDialog.progressViewContainer == null) {
                    fDp = AndroidUtilities.dp(20.0f);
                    AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                } else {
                    fDp = AndroidUtilities.dp(18.0f);
                    float scaleX = alertDialog.progressViewContainer.getScaleX() * alertDialog.progressViewContainer.getWidth();
                    float scaleY = alertDialog.progressViewContainer.getScaleY() * alertDialog.progressViewContainer.getHeight();
                    AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
                }
                float f = this.blurPaintAlpha.set(alertDialog.blurPaint != null ? 1.0f : 0.0f);
                Paint paint = alertDialog.blurPaint;
                if (paint != null) {
                    paint.setAlpha((int) (f * 255.0f));
                    canvas.drawRoundRect(AndroidUtilities.rectTmp, fDp, fDp, alertDialog.blurPaint);
                }
                if (alertDialog.dimBlurPaint == null) {
                    alertDialog.dimBlurPaint = new Paint(1);
                    alertDialog.dimBlurPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (alertDialog.dimAlpha * 255.0f)));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                canvas.drawRoundRect(rectF, fDp, fDp, alertDialog.dimBlurPaint);
                Paint paint2 = this.backgroundPaint;
                paint2.setColor(alertDialog.backgroundColor);
                paint2.setAlpha((int) ((((alertDialog.blurOpacity - 1.0f) * f) + 1.0f) * paint2.getAlpha()));
                canvas.drawRoundRect(rectF, fDp, fDp, paint2);
            }
            super.draw(canvas);
        }

        @Override
        public final boolean hasOverlappingRendering() {
            return false;
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            AlertDialog alertDialog = this.this$0;
            if (!alertDialog.withCancelDialog) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            alertDialog.showCancelAlert();
            return false;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            AlertDialog alertDialog = this.this$0;
            if (alertDialog.progressViewStyle == 3) {
                int measuredWidth = ((i3 - i) - alertDialog.progressViewContainer.getMeasuredWidth()) / 2;
                int measuredHeight = ((i4 - i2) - alertDialog.progressViewContainer.getMeasuredHeight()) / 2;
                FrameLayout frameLayout = alertDialog.progressViewContainer;
                frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, alertDialog.progressViewContainer.getMeasuredHeight() + measuredHeight);
            } else {
                AnonymousClass3 anonymousClass3 = alertDialog.contentScrollView;
                if (anonymousClass3 != null) {
                    if (alertDialog.onScrollChangedListener == null) {
                        alertDialog.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() {
                            @Override
                            public final void onScrollChanged() {
                                AlertDialog alertDialog2 = this.f$0.this$0;
                                boolean z2 = false;
                                AlertDialog.access$3600(alertDialog2.titleTextView != null && alertDialog2.contentScrollView.getScrollY() > alertDialog2.scrollContainer.getTop(), alertDialog2, 0);
                                if (alertDialog2.buttonsLayout != null) {
                                    if (alertDialog2.contentScrollView.getHeight() + alertDialog2.contentScrollView.getScrollY() < alertDialog2.scrollContainer.getBottom()) {
                                        z2 = true;
                                    }
                                }
                                AlertDialog.access$3600(z2, alertDialog2, 1);
                                alertDialog2.contentScrollView.invalidate();
                            }
                        };
                        anonymousClass3.getViewTreeObserver().addOnScrollChangedListener(alertDialog.onScrollChangedListener);
                    }
                    alertDialog.onScrollChangedListener.onScrollChanged();
                }
            }
            int[] iArr = alertDialog.containerViewLocation;
            getLocationOnScreen(iArr);
            Matrix matrix = alertDialog.blurMatrix;
            if (matrix == null || alertDialog.blurShader == null) {
                return;
            }
            matrix.reset();
            alertDialog.blurMatrix.postScale(8.0f, 8.0f);
            alertDialog.blurMatrix.postTranslate(-iArr[0], -iArr[1]);
            alertDialog.blurShader.setLocalMatrix(alertDialog.blurMatrix);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int measuredHeight;
            int measuredHeight2;
            int i3;
            LineProgressView lineProgressView;
            AlertDialog alertDialog = this.this$0;
            if (alertDialog.progressViewStyle == 3) {
                alertDialog.progressViewContainer.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                return;
            }
            this.inLayout = true;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i4 = alertDialog.customWidth;
            if (i4 > 0) {
                Rect rect = alertDialog.backgroundPaddings;
                size = rect.right + i4 + rect.left;
            }
            int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int iM = OKLCH.m(48.0f, paddingLeft, 1073741824);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
            ViewGroup viewGroup = alertDialog.buttonsLayout;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = alertDialog.buttonsLayout.getChildAt(i5);
                    if (childAt instanceof TextView) {
                        ((TextView) childAt).setMaxWidth(AndroidUtilities.dp(OKLCH.m$2(24.0f, paddingLeft, 2)));
                    }
                }
                alertDialog.buttonsLayout.measure(iMakeMeasureSpec, i2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) alertDialog.buttonsLayout.getLayoutParams();
                measuredHeight = paddingTop - ((alertDialog.buttonsLayout.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
            } else {
                measuredHeight = paddingTop;
            }
            SpoilersTextView spoilersTextView = alertDialog.titleTextView;
            if (spoilersTextView != null) {
                spoilersTextView.measure(iM, i2);
            }
            FrameLayout frameLayout = alertDialog.titleContainer;
            if (frameLayout != null) {
                frameLayout.measure(iM, i2);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) alertDialog.titleContainer.getLayoutParams();
                measuredHeight -= (alertDialog.titleContainer.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
            }
            TextView textView = alertDialog.subtitleTextView;
            if (textView != null) {
                textView.measure(iM, i2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) alertDialog.subtitleTextView.getLayoutParams();
                measuredHeight -= (alertDialog.subtitleTextView.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
            }
            RLottieImageView rLottieImageView = alertDialog.topImageView;
            if (rLottieImageView != null) {
                rLottieImageView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(alertDialog.topHeight), 1073741824));
                measuredHeight -= alertDialog.topImageView.getMeasuredHeight();
            }
            View view = alertDialog.topView;
            if (view != null) {
                float f = alertDialog.aspectRatio;
                if (f >= 0.0f) {
                    float f2 = size;
                    if (f == 0.0f) {
                        f2 /= 936.0f;
                        f = 354.0f;
                    }
                    int i6 = (int) (f2 * f);
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                    alertDialog.topView.getLayoutParams().height = i6;
                } else {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
                }
                measuredHeight -= alertDialog.topView.getMeasuredHeight();
            }
            if (alertDialog.progressViewStyle == 0) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) alertDialog.contentScrollView.getLayoutParams();
                if (alertDialog.customView != null) {
                    layoutParams4.topMargin = (alertDialog.titleTextView == null && alertDialog.messageTextView.getVisibility() == 8 && alertDialog.items == null) ? AndroidUtilities.dp(16.0f) : 0;
                    layoutParams4.bottomMargin = alertDialog.buttonsLayout == null ? AndroidUtilities.dp(8.0f) : 0;
                } else if (alertDialog.items != null) {
                    layoutParams4.topMargin = (alertDialog.titleTextView == null && alertDialog.messageTextView.getVisibility() == 8) ? AndroidUtilities.dp(8.0f) : 0;
                    layoutParams4.bottomMargin = AndroidUtilities.dp(8.0f);
                } else if (alertDialog.messageTextView.getVisibility() == 0) {
                    layoutParams4.topMargin = alertDialog.titleTextView == null ? AndroidUtilities.dp(19.0f) : 0;
                    layoutParams4.bottomMargin = AndroidUtilities.dp(20.0f);
                }
                int i7 = measuredHeight - (layoutParams4.bottomMargin + layoutParams4.topMargin);
                alertDialog.contentScrollView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                measuredHeight = i7 - alertDialog.contentScrollView.getMeasuredHeight();
            } else {
                FrameLayout frameLayout2 = alertDialog.progressViewContainer;
                if (frameLayout2 != null) {
                    frameLayout2.measure(iM, View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) alertDialog.progressViewContainer.getLayoutParams();
                    measuredHeight2 = alertDialog.progressViewContainer.getMeasuredHeight() + layoutParams5.bottomMargin;
                    i3 = layoutParams5.topMargin;
                } else {
                    EffectsTextView effectsTextView = alertDialog.messageTextView;
                    if (effectsTextView != null) {
                        effectsTextView.measure(iM, View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
                        if (alertDialog.messageTextView.getVisibility() != 8) {
                            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) alertDialog.messageTextView.getLayoutParams();
                            measuredHeight2 = alertDialog.messageTextView.getMeasuredHeight() + layoutParams6.bottomMargin;
                            i3 = layoutParams6.topMargin;
                        }
                    }
                    lineProgressView = alertDialog.lineProgressView;
                    if (lineProgressView != null) {
                        lineProgressView.measure(iM, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), 1073741824));
                        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) alertDialog.lineProgressView.getLayoutParams();
                        int measuredHeight3 = measuredHeight - ((alertDialog.lineProgressView.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                        alertDialog.lineProgressViewPercent.measure(iM, View.MeasureSpec.makeMeasureSpec(measuredHeight3, Integer.MIN_VALUE));
                        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) alertDialog.lineProgressViewPercent.getLayoutParams();
                        measuredHeight = measuredHeight3 - ((alertDialog.lineProgressViewPercent.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                    }
                }
                measuredHeight -= measuredHeight2 + i3;
                lineProgressView = alertDialog.lineProgressView;
                if (lineProgressView != null) {
                    lineProgressView.measure(iM, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), 1073741824));
                    LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) alertDialog.lineProgressView.getLayoutParams();
                    int measuredHeight4 = measuredHeight - ((alertDialog.lineProgressView.getMeasuredHeight() + layoutParams9.bottomMargin) + layoutParams9.topMargin);
                    alertDialog.lineProgressViewPercent.measure(iM, View.MeasureSpec.makeMeasureSpec(measuredHeight4, Integer.MIN_VALUE));
                    LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) alertDialog.lineProgressViewPercent.getLayoutParams();
                    measuredHeight = measuredHeight4 - ((alertDialog.lineProgressViewPercent.getMeasuredHeight() + layoutParams10.bottomMargin) + layoutParams10.topMargin);
                }
            }
            setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - measuredHeight))) - (alertDialog.topAnimationIsNew ? AndroidUtilities.dp(8.0f) : 0));
            this.inLayout = false;
            if (alertDialog.lastScreenWidth != AndroidUtilities.displaySize.x) {
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda8(this, 7));
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            AlertDialog alertDialog = this.this$0;
            if (alertDialog.withCancelDialog) {
                alertDialog.showCancelAlert();
                return false;
            }
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override
        public final void requestLayout() {
            if (this.inLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public class Builder {
        private AlertDialog alertDialog;
        private final boolean[] red;

        public Builder(DarkAlertDialog darkAlertDialog) {
            this.red = new boolean[3];
            this.alertDialog = darkAlertDialog;
        }

        public Builder aboveMessageView(View view) {
            this.alertDialog.aboveMessageView = view;
            return this;
        }

        public Builder addBottomView(View view) {
            this.alertDialog.bottomView = view;
            return this;
        }

        public AlertDialog create() {
            return this.alertDialog;
        }

        public AlertDialog createAlertDialog(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            return new AlertDialog(context, i, resourcesProvider);
        }

        public Builder forceVerticalButtons() {
            this.alertDialog.verticalButtons = true;
            return this;
        }

        public Context getContext() {
            return this.alertDialog.getContext();
        }

        public Runnable getDismissRunnable() {
            return this.alertDialog.dismissRunnable;
        }

        public Builder makeCustomMaxHeight() {
            AlertDialog alertDialog = this.alertDialog;
            int i = AlertDialog.$r8$clinit;
            alertDialog.getClass();
            return this;
        }

        public Builder makeRed(int i) {
            int i2 = (-i) - 1;
            if (i2 >= 0) {
                boolean[] zArr = this.red;
                if (i2 < zArr.length) {
                    zArr[i2] = true;
                }
            }
            return this;
        }

        public void notDrawBackgroundOnTopView(boolean z) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.notDrawBackgroundOnTopView = z;
            alertDialog.blurredBackground = false;
        }

        public Builder overrideDismissListener(Utilities.Callback<Runnable> callback) {
            this.alertDialog.overridenDissmissListener = callback;
            return this;
        }

        public Builder setAdditionalHorizontalPadding(int i) {
            this.alertDialog.additioanalHorizontalPadding = i;
            return this;
        }

        public Builder setBlurredBackground(boolean z) {
            this.alertDialog.blurredBackground = z;
            return this;
        }

        public Builder setButton(int i, CharSequence charSequence, OnButtonClickListener onButtonClickListener) {
            if (i == -4) {
                AlertDialog alertDialog = this.alertDialog;
                alertDialog.negative2ButtonText = charSequence;
                alertDialog.negative2ButtonListener = onButtonClickListener;
                return this;
            }
            if (i == -3) {
                setNeutralButton(charSequence, onButtonClickListener);
                return this;
            }
            if (i == -2) {
                setNegativeButton(charSequence, onButtonClickListener);
                return this;
            }
            if (i != -1) {
                return this;
            }
            setPositiveButton(charSequence, onButtonClickListener);
            return this;
        }

        public void setButtonsVertical(boolean z) {
            this.alertDialog.verticalButtons = z;
        }

        public Builder setCheckFocusable(boolean z) {
            this.alertDialog.checkFocusable = z;
            return this;
        }

        public Builder setCustomViewOffset(int i) {
            this.alertDialog.customViewOffset = i;
            return this;
        }

        public Builder setDialogButtonColorKey(int i) {
            this.alertDialog.dialogButtonColorKey = i;
            return this;
        }

        public Builder setDimAlpha(float f) {
            this.alertDialog.dimAlpha = f;
            return this;
        }

        public Builder setDimEnabled(boolean z) {
            this.alertDialog.dimEnabled = z;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.items = charSequenceArr;
            alertDialog.onClickListener = onClickListener;
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.alertDialog.message = charSequence;
            return this;
        }

        public Builder setMessageTextViewClickable(boolean z) {
            this.alertDialog.messageTextViewClickable = z;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, OnButtonClickListener onButtonClickListener) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.negativeButtonText = charSequence;
            alertDialog.negativeButtonListener = onButtonClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, OnButtonClickListener onButtonClickListener) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.neutralButtonText = charSequence;
            alertDialog.neutralButtonListener = onButtonClickListener;
            return this;
        }

        public Builder setOnBackButtonListener(OnButtonClickListener onButtonClickListener) {
            this.alertDialog.onBackButtonListener = onButtonClickListener;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.alertDialog.setOnCancelListener(onCancelListener);
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.alertDialog.setOnDismissListener(onDismissListener);
            return this;
        }

        public Builder setOnPreDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.alertDialog.onDismissListener = onDismissListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, OnButtonClickListener onButtonClickListener) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.positiveButtonText = charSequence;
            alertDialog.positiveButtonListener = onButtonClickListener;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            this.alertDialog.subtitle = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.alertDialog.title = charSequence;
            return this;
        }

        public Builder setTopAnimation(int i, int i2, boolean z, int i3) {
            return setTopAnimation(i, i2, z, i3, null);
        }

        public Builder setTopAnimationIsNew(boolean z) {
            this.alertDialog.topAnimationIsNew = z;
            return this;
        }

        public Builder setTopImage(int i, int i2) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.topResId = i;
            alertDialog.topBackgroundColor = i2;
            return this;
        }

        public Builder setTopView(View view) {
            this.alertDialog.topView = view;
            return this;
        }

        public void setTopViewAspectRatio(float f) {
            this.alertDialog.aspectRatio = f;
        }

        public Builder setView(View view) {
            return setView(view, -2);
        }

        public Builder setWidth(int i) {
            this.alertDialog.customWidth = i;
            return this;
        }

        public AlertDialog show() {
            TextView textView;
            this.alertDialog.show();
            int i = 0;
            while (true) {
                boolean[] zArr = this.red;
                if (i >= zArr.length) {
                    return this.alertDialog;
                }
                if (zArr[i] && (textView = (TextView) this.alertDialog.getButton(-(i + 1))) != null) {
                    textView.setTextColor(this.alertDialog.getThemedColor(Theme.key_text_RedBold));
                }
                i++;
            }
        }

        public Builder twoRowsButtonsWhenNeeded() {
            this.alertDialog.twoRowsButtonsWhenNeeded = true;
            return this;
        }

        public Builder setTopAnimation(int i, int i2, boolean z, int i3, Map<String, Integer> map) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.topAnimationId = i;
            alertDialog.topAnimationSize = i2;
            alertDialog.topAnimationAutoRepeat = z;
            alertDialog.topBackgroundColor = i3;
            alertDialog.topAnimationLayerColors = map;
            return this;
        }

        public Builder setView(View view, int i) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.customView = view;
            alertDialog.customViewHeight = i;
            return this;
        }

        public Builder(Context context) {
            this(context, 0, null);
        }

        public Builder setItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnClickListener onClickListener) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.items = charSequenceArr;
            alertDialog.itemIcons = iArr;
            alertDialog.onClickListener = onClickListener;
            return this;
        }

        public Builder setTopImage(Drawable drawable, int i) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.topDrawable = drawable;
            alertDialog.topBackgroundColor = i;
            return this;
        }

        public Builder(Context context, Theme.ResourcesProvider resourcesProvider) {
            this(context, 0, resourcesProvider);
        }

        public Builder(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            this.red = new boolean[3];
            if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.instance)) == null) {
                context = ApplicationLoader.applicationContext;
            }
            this.alertDialog = createAlertDialog(context, i, resourcesProvider);
        }

        public Builder setTopAnimation(int i, int i2) {
            return setTopAnimation(i, 94, true, i2);
        }
    }

    public interface OnButtonClickListener {
        void onClick(AlertDialog alertDialog, int i);
    }

    public AlertDialog(Context context) {
        this(context, 3, null);
    }

    public static void access$3600(boolean z, AlertDialog alertDialog, int i) {
        int i2 = 1;
        if (!z || alertDialog.shadowVisibility[i]) {
            if (z) {
                alertDialog.getClass();
                return;
            } else if (!alertDialog.shadowVisibility[i]) {
                return;
            }
        }
        alertDialog.shadowVisibility[i] = z;
        AnimatorSet[] animatorSetArr = alertDialog.shadowAnimation;
        AnimatorSet animatorSet = animatorSetArr[i];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i] = animatorSet2;
        BitmapDrawable bitmapDrawable = alertDialog.shadow[i];
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z ? 255 : 0));
        }
        animatorSetArr[i].setDuration(150L);
        animatorSetArr[i].addListener(new BottomSheet.AnonymousClass6(alertDialog, i, i2));
        try {
            animatorSetArr[i].start();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static boolean canTextInput(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (canTextInput(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        EffectsTextView effectsTextView;
        if (i != NotificationCenter.emojiLoaded || (effectsTextView = this.messageTextView) == null) {
            return;
        }
        effectsTextView.invalidate();
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.overridenDissmissListener;
        if (callback != null) {
            this.overridenDissmissListener = null;
            callback.run(new AlertDialog$$ExternalSyntheticLambda1(this, 0));
            return;
        }
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        DialogInterface.OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        AlertDialog alertDialog = this.cancelDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        if (this.blurShader == null || (bitmap = this.blurBitmap) == null) {
            return;
        }
        bitmap.recycle();
        this.blurShader = null;
        this.blurPaint = null;
        this.blurBitmap = null;
    }

    public final void dismissUnless(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.shownAt;
        if (jCurrentTimeMillis < j) {
            AndroidUtilities.runOnUIThread(new AlertDialog$$ExternalSyntheticLambda1(this, 0), jCurrentTimeMillis - j);
        } else {
            dismiss();
        }
    }

    public final View getButton(int i) {
        ViewGroup viewGroup = this.buttonsLayout;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i));
        }
        return null;
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public final ViewGroup inflateContent(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        AlertDialogView alertDialogView = new AlertDialogView(getContext(), this);
        this.containerView = alertDialogView;
        final int i2 = 1;
        alertDialogView.setOrientation(1);
        boolean z2 = this.blurredBackground;
        int i3 = this.progressViewStyle;
        final int i4 = 0;
        if ((z2 || i3 == 3) && i3 != 2) {
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            if (this.blurredBackground) {
                this.containerView.setWillNotDraw(false);
            }
            this.drawBackground = false;
        } else {
            boolean z3 = this.notDrawBackgroundOnTopView;
            Drawable drawable = this.shadowDrawable;
            if (z3) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.containerView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.drawBackground = true;
            } else {
                this.containerView.setBackground(null);
                this.containerView.setPadding(0, 0, 0, 0);
                this.containerView.setBackground(drawable);
                AlertDialogView alertDialogView2 = this.containerView;
                int iDp = AndroidUtilities.dp(8.0f);
                float fDp = AndroidUtilities.dp(20.0f);
                RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
                alertDialogView2.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(iDp, fDp));
                this.containerView.setClipToOutline(true);
                this.drawBackground = false;
            }
        }
        ViewGroup viewGroup = this.containerView;
        boolean z4 = this.needStarsBalance;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z4) {
            if (this.fullscreenContainerView == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.fullscreenContainerView = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final AlertDialog f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i4) {
                            case 0:
                                this.f$0.dismiss();
                                break;
                            case 1:
                                AlertDialog alertDialog = this.f$0;
                                new StarsIntroActivity.StarsOptionsSheet(alertDialog.getContext(), alertDialog.resourcesProvider).show();
                                break;
                            default:
                                AlertDialog alertDialog2 = this.f$0;
                                DialogInterface.OnClickListener onClickListener = alertDialog2.onClickListener;
                                if (onClickListener != null) {
                                    onClickListener.onClick(alertDialog2, ((Integer) view.getTag()).intValue());
                                }
                                alertDialog2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.starsBalanceCloud == null) {
                f = 8.0f;
                BalanceCloud balanceCloud = new BalanceCloud(getContext(), UserConfig.selectedAccount, AmountUtils$Currency.STARS, resourcesProvider);
                this.starsBalanceCloud = balanceCloud;
                ScaleStateListAnimator.apply(balanceCloud);
                this.starsBalanceCloud.setOnClickListener(new View.OnClickListener(this) {
                    public final AlertDialog f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                this.f$0.dismiss();
                                break;
                            case 1:
                                AlertDialog alertDialog = this.f$0;
                                new StarsIntroActivity.StarsOptionsSheet(alertDialog.getContext(), alertDialog.resourcesProvider).show();
                                break;
                            default:
                                AlertDialog alertDialog2 = this.f$0;
                                DialogInterface.OnClickListener onClickListener = alertDialog2.onClickListener;
                                if (onClickListener != null) {
                                    onClickListener.onClick(alertDialog2, ((Integer) view.getTag()).intValue());
                                }
                                alertDialog2.dismiss();
                                break;
                        }
                    }
                });
            } else {
                f = 8.0f;
            }
            AndroidUtilities.removeFromParent(this.containerView);
            AndroidUtilities.removeFromParent(this.starsBalanceCloud);
            this.fullscreenContainerView.addView(this.containerView, LayoutHelper.createFrame(-2, -2, 17));
            this.fullscreenContainerView.addView(this.starsBalanceCloud, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.fullscreenContainerView;
        } else {
            f = 8.0f;
        }
        if (z) {
            if (this.needStarsBalance) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.customWidth > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        boolean z5 = (this.positiveButtonText == null && this.negativeButtonText == null && this.negative2ButtonText == null && this.neutralButtonText == null) ? false : true;
        if (this.topResId == 0 && this.topAnimationId == 0 && this.topDrawable == null) {
            View view = this.topView;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                this.containerView.addView(this.topView, LayoutHelper.createLinear(-1, this.topHeight, 51, 0, 0, 0, 0));
            }
        } else {
            RLottieImageView rLottieImageView = new RLottieImageView(getContext());
            this.topImageView = rLottieImageView;
            Drawable drawable2 = this.topDrawable;
            if (drawable2 != null) {
                rLottieImageView.setImageDrawable(drawable2);
                Drawable drawable3 = this.topDrawable;
                if (drawable3 instanceof AttachableDrawable) {
                    final AttachableDrawable attachableDrawable = (AttachableDrawable) drawable3;
                    this.topImageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                        @Override
                        public final void onViewAttachedToWindow(View view2) {
                            attachableDrawable.onAttachedToWindow(null);
                        }

                        @Override
                        public final void onViewDetachedFromWindow(View view2) {
                            attachableDrawable.onDetachedFromWindow(null);
                        }
                    });
                    attachableDrawable.setParent(this.topImageView);
                }
            } else {
                int i5 = this.topResId;
                if (i5 != 0) {
                    rLottieImageView.setImageResource(i5);
                } else {
                    rLottieImageView.setAutoRepeat(this.topAnimationAutoRepeat);
                    RLottieImageView rLottieImageView2 = this.topImageView;
                    int i6 = this.topAnimationId;
                    int i7 = this.topAnimationSize;
                    rLottieImageView2.setAnimation(i6, i7, i7);
                    if (this.topAnimationLayerColors != null) {
                        RLottieDrawable animatedDrawable = this.topImageView.getAnimatedDrawable();
                        for (Map.Entry entry : this.topAnimationLayerColors.entrySet()) {
                            animatedDrawable.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                        }
                    }
                    this.topImageView.playAnimation();
                }
            }
            this.topImageView.setScaleType(ImageView.ScaleType.CENTER);
            if (this.topAnimationIsNew) {
                final GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.topBackgroundColor);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.topImageView.setBackground(new Drawable() {
                    public final int size;

                    {
                        this.size = AndroidUtilities.dp(52.0f) + AlertDialog.this.topAnimationSize;
                    }

                    @Override
                    public final void draw(Canvas canvas) {
                        AlertDialog alertDialog = AlertDialog.this;
                        int width = alertDialog.topImageView.getWidth();
                        int i8 = this.size;
                        int i9 = (int) ((width - i8) / 2.0f);
                        int height = (int) ((alertDialog.topImageView.getHeight() - i8) / 2.0f);
                        int width2 = (int) ((alertDialog.topImageView.getWidth() + i8) / 2.0f);
                        int height2 = (int) ((alertDialog.topImageView.getHeight() + i8) / 2.0f);
                        GradientDrawable gradientDrawable2 = gradientDrawable;
                        gradientDrawable2.setBounds(i9, height, width2, height2);
                        gradientDrawable2.draw(canvas);
                    }

                    @Override
                    public final int getOpacity() {
                        return gradientDrawable.getOpacity();
                    }

                    @Override
                    public final void setAlpha(int i8) {
                        gradientDrawable.setAlpha(i8);
                    }

                    @Override
                    public final void setColorFilter(ColorFilter colorFilter) {
                        gradientDrawable.setColorFilter(colorFilter);
                    }
                });
                this.topHeight = 92;
            } else {
                this.topImageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), 0, this.topBackgroundColor));
            }
            if (this.topAnimationIsNew) {
                this.topImageView.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.topImageView.setTranslationY(0.0f);
            }
            this.topImageView.setPadding(0, 0, 0, 0);
            this.containerView.addView(this.topImageView, LayoutHelper.createLinear(-1, this.topHeight, 51, 0, 0, 0, 0));
        }
        if (this.title != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.titleContainer = frameLayout2;
            this.containerView.addView(frameLayout2, LayoutHelper.createLinear(-2, -2, this.topAnimationIsNew ? 1 : 0, 24, 0, 24, 0));
            SpoilersTextView spoilersTextView = new SpoilersTextView(getContext(), false, null);
            this.titleTextView = spoilersTextView;
            NotificationCenter.listenEmojiLoading(spoilersTextView);
            SpoilersTextView spoilersTextView2 = this.titleTextView;
            spoilersTextView2.cacheType = 3;
            spoilersTextView2.setText(this.title);
            this.titleTextView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            this.titleTextView.setTextSize(1, 20.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setGravity((this.topAnimationIsNew ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.titleContainer;
            SpoilersTextView spoilersTextView3 = this.titleTextView;
            boolean z6 = this.topAnimationIsNew;
            int i8 = (z6 ? 1 : LocaleController.isRTL ? 5 : 3) | 48;
            if (z6) {
                f5 = 4.0f;
            } else {
                f5 = this.subtitle != null ? 2 : this.items != null ? 14 : 10;
            }
            frameLayout3.addView(spoilersTextView3, LayoutHelper.createFrame(-2, -2.0f, i8, 0.0f, 19.0f, 0.0f, f5));
        }
        if (this.subtitle != null) {
            TextView textView = new TextView(getContext());
            this.subtitleTextView = textView;
            textView.setText(this.subtitle);
            this.subtitleTextView.setTextColor(getThemedColor(Theme.key_dialogIcon));
            this.subtitleTextView.setTextSize(1, 14.0f);
            this.subtitleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.containerView.addView(this.subtitleTextView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, this.items != null ? 14 : 10));
        }
        if (i3 == 0) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            BitmapDrawable[] bitmapDrawableArr = this.shadow;
            bitmapDrawableArr[0] = bitmapDrawable;
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            ?? r2 = new ScrollView(getContext()) {
                @Override
                public final boolean drawChild(Canvas canvas, View view2, long j) {
                    boolean zDrawChild = super.drawChild(canvas, view2, j);
                    AlertDialog alertDialog = this;
                    if (alertDialog.shadow[0].getPaint().getAlpha() != 0) {
                        alertDialog.shadow[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                        alertDialog.shadow[0].draw(canvas);
                    }
                    if (alertDialog.shadow[1].getPaint().getAlpha() != 0) {
                        alertDialog.shadow[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                        alertDialog.shadow[1].draw(canvas);
                    }
                    return zDrawChild;
                }
            };
            this.contentScrollView = r2;
            r2.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.contentScrollView, getThemedColor(Theme.key_dialogScrollGlow));
            this.containerView.addView(this.contentScrollView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.scrollContainer = linearLayout;
            linearLayout.setOrientation(1);
            f2 = 20.0f;
            addView(this.scrollContainer, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f2 = 20.0f;
        }
        EffectsTextView effectsTextView = new EffectsTextView(getContext());
        this.messageTextView = effectsTextView;
        NotificationCenter.listenEmojiLoading(effectsTextView);
        this.messageTextView.setTextColor(getThemedColor(this.topAnimationIsNew ? Theme.key_windowBackgroundWhiteGrayText : Theme.key_dialogTextBlack));
        this.messageTextView.setTextSize(1, 16.0f);
        this.messageTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.messageTextView.setLinkTextColor(getThemedColor(Theme.key_dialogTextLink));
        if (!this.messageTextViewClickable) {
            this.messageTextView.setClickable(false);
            this.messageTextView.setEnabled(false);
        }
        this.messageTextView.setGravity((this.topAnimationIsNew ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
        if (i3 == 2) {
            this.containerView.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, this.title == null ? 19 : 0, 24, 20));
            LineProgressView lineProgressView = new LineProgressView(getContext());
            this.lineProgressView = lineProgressView;
            lineProgressView.setProgress(this.currentProgress / 100.0f, false);
            this.lineProgressView.setProgressColor(getThemedColor(Theme.key_dialogLineProgress));
            this.lineProgressView.setBackColor(getThemedColor(Theme.key_dialogLineProgressBackground));
            this.containerView.addView(this.lineProgressView, LayoutHelper.createLinear(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.lineProgressViewPercent = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            this.lineProgressViewPercent.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.lineProgressViewPercent.setTextColor(getThemedColor(Theme.key_dialogTextGray2));
            this.lineProgressViewPercent.setTextSize(1, 14.0f);
            this.containerView.addView(this.lineProgressViewPercent, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 23, 4, 23, 24));
            this.lineProgressViewPercent.setText(String.format("%d%%", Integer.valueOf(this.currentProgress)));
        } else if (i3 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.progressViewContainer = new FrameLayout(getContext());
            this.backgroundColor = getThemedColor(Theme.key_dialog_inlineProgressBackground);
            if (!this.blurredBackground) {
                this.progressViewContainer.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), this.backgroundColor));
            }
            this.containerView.addView(this.progressViewContainer, LayoutHelper.createLinear(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), resourcesProvider);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(getThemedColor(Theme.key_dialog_inlineProgress));
            this.progressViewContainer.addView(radialProgressView, LayoutHelper.createFrame(86, 86, 17));
        } else {
            View view2 = this.aboveMessageView;
            if (view2 != null) {
                this.scrollContainer.addView(view2, LayoutHelper.createLinear(-1, -2, 22.0f, 4.0f, 22.0f, 12.0f));
            }
            this.scrollContainer.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, (this.topAnimationIsNew ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, (this.customView == null && this.items == null) ? 0 : this.customViewOffset));
            View view3 = this.bottomView;
            if (view3 != null) {
                this.scrollContainer.addView(view3, LayoutHelper.createLinear(-1, -2, 22.0f, 12.0f, 22.0f, 0.0f));
            }
        }
        if (TextUtils.isEmpty(this.message)) {
            this.messageTextView.setVisibility(8);
        } else {
            this.messageTextView.setText(this.message);
            this.messageTextView.setVisibility(0);
        }
        if (this.items != null) {
            int i9 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i9 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i9] != null) {
                    AlertDialogCell alertDialogCell = new AlertDialogCell(getContext(), resourcesProvider);
                    CharSequence charSequence = this.items[i9];
                    int[] iArr = this.itemIcons;
                    alertDialogCell.setTextAndIcon(charSequence, iArr != null ? iArr[i9] : 0);
                    alertDialogCell.setTag(Integer.valueOf(i9));
                    this.itemViews.add(alertDialogCell);
                    this.scrollContainer.addView(alertDialogCell, LayoutHelper.createLinear(-1, 50));
                    final int i10 = 2;
                    alertDialogCell.setOnClickListener(new View.OnClickListener(this) {
                        public final AlertDialog f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view4) {
                            switch (i10) {
                                case 0:
                                    this.f$0.dismiss();
                                    break;
                                case 1:
                                    AlertDialog alertDialog = this.f$0;
                                    new StarsIntroActivity.StarsOptionsSheet(alertDialog.getContext(), alertDialog.resourcesProvider).show();
                                    break;
                                default:
                                    AlertDialog alertDialog2 = this.f$0;
                                    DialogInterface.OnClickListener onClickListener = alertDialog2.onClickListener;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(alertDialog2, ((Integer) view4.getTag()).intValue());
                                    }
                                    alertDialog2.dismiss();
                                    break;
                            }
                        }
                    });
                }
                i9++;
            }
        }
        View view4 = this.customView;
        if (view4 != null) {
            if (view4.getParent() != null) {
                ((ViewGroup) this.customView.getParent()).removeView(this.customView);
            }
            this.scrollContainer.addView(this.customView, LayoutHelper.createLinear(-1, this.customViewHeight));
        }
        if (z5) {
            if (!this.verticalButtons) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.positiveButtonText;
                int iMeasureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0) : 0;
                if (this.negativeButtonText != null) {
                    if (iMeasureText > 0) {
                        iMeasureText += AndroidUtilities.dp(f);
                    }
                    CharSequence charSequence3 = this.negativeButtonText;
                    iMeasureText = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + iMeasureText);
                }
                if (this.negative2ButtonText != null) {
                    if (iMeasureText > 0) {
                        iMeasureText += AndroidUtilities.dp(f);
                    }
                    CharSequence charSequence4 = this.negative2ButtonText;
                    iMeasureText = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + iMeasureText);
                }
                if (this.neutralButtonText != null) {
                    if (iMeasureText > 0) {
                        iMeasureText += AndroidUtilities.dp(f);
                    }
                    CharSequence charSequence5 = this.neutralButtonText;
                    iMeasureText = (int) (textPaint.measureText(charSequence5, 0, charSequence5.length()) + AndroidUtilities.dp(24.0f) + iMeasureText);
                }
                if (iMeasureText > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (!this.twoRowsButtonsWhenNeeded || this.positiveButtonText == null || this.negativeButtonText == null || this.negative2ButtonText == null || this.neutralButtonText == null) {
                        this.verticalButtons = true;
                    } else {
                        this.buttonsInTwoRows = true;
                    }
                }
            }
            if (this.verticalButtons) {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                this.buttonsLayout = linearLayout2;
            } else {
                this.buttonsLayout = new TONIntroActivity.AnonymousClass2(this, getContext(), i2);
            }
            if (this.bottomView != null) {
                this.buttonsLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
                this.buttonsLayout.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.buttonsLayout.setPadding(AndroidUtilities.dp(f), AndroidUtilities.dp(f), AndroidUtilities.dp(f), AndroidUtilities.dp(f));
            }
            this.containerView.addView(this.buttonsLayout, LayoutHelper.createLinear(-1, this.buttonsInTwoRows ? 96 : 52));
            if (this.topAnimationIsNew) {
                this.buttonsLayout.setTranslationY(-AndroidUtilities.dp(f));
            }
            if (this.positiveButtonText != null) {
                AnonymousClass5 anonymousClass6 = new AnonymousClass5(getContext());
                anonymousClass6.setMinWidth(AndroidUtilities.dp(64.0f));
                anonymousClass6.setTag(-1);
                anonymousClass6.setTextSize(1, 16.0f);
                anonymousClass6.setTextColor(getThemedColor(this.dialogButtonColorKey));
                anonymousClass6.setGravity(17);
                anonymousClass6.setTypeface(AndroidUtilities.bold());
                anonymousClass6.setText(this.positiveButtonText);
                anonymousClass6.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(f2), getThemedColor(this.dialogButtonColorKey)));
                anonymousClass6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.verticalButtons) {
                    f3 = 64.0f;
                    f4 = 6.0f;
                    this.buttonsLayout.addView(anonymousClass6, LayoutHelper.createLinear(-1, 40, 7));
                } else {
                    f3 = 64.0f;
                    f4 = 6.0f;
                    this.buttonsLayout.addView(anonymousClass6, LayoutHelper.createFrame(-2, 40, 53));
                }
                anonymousClass6.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(i4, this, anonymousClass6));
            } else {
                f3 = 64.0f;
                f4 = 6.0f;
            }
            if (this.negativeButtonText != null) {
                AnonymousClass6 anonymousClass7 = new AnonymousClass6(getContext());
                anonymousClass7.setMinWidth(AndroidUtilities.dp(f3));
                anonymousClass7.setTag(-2);
                anonymousClass7.setTextSize(1, 16.0f);
                anonymousClass7.setTextColor(getThemedColor(this.dialogButtonColorKey));
                anonymousClass7.setGravity(17);
                anonymousClass7.setTypeface(AndroidUtilities.bold());
                anonymousClass7.setEllipsize(TextUtils.TruncateAt.END);
                anonymousClass7.setSingleLine(true);
                anonymousClass7.setText(this.negativeButtonText.toString());
                anonymousClass7.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(f2), getThemedColor(this.dialogButtonColorKey)));
                anonymousClass7.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.verticalButtons) {
                    this.buttonsLayout.addView(anonymousClass7, 0, LayoutHelper.createLinear(-1, 40, 7));
                } else {
                    this.buttonsLayout.addView(anonymousClass7, LayoutHelper.createFrame(-2, 40, 53));
                }
                anonymousClass7.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(5, this, anonymousClass7));
            }
            if (this.neutralButtonText != null) {
                AnonymousClass7 anonymousClass8 = new AnonymousClass7(getContext());
                anonymousClass8.setMinWidth(AndroidUtilities.dp(f3));
                anonymousClass8.setTag(-3);
                anonymousClass8.setTextSize(1, 16.0f);
                anonymousClass8.setTextColor(getThemedColor(this.dialogButtonColorKey));
                anonymousClass8.setGravity(17);
                anonymousClass8.setTypeface(AndroidUtilities.bold());
                anonymousClass8.setEllipsize(TextUtils.TruncateAt.END);
                anonymousClass8.setSingleLine(true);
                anonymousClass8.setText(this.neutralButtonText.toString());
                anonymousClass8.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(f2), getThemedColor(this.dialogButtonColorKey)));
                anonymousClass8.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.verticalButtons) {
                    this.buttonsLayout.addView(anonymousClass8, 1, LayoutHelper.createLinear(-1, 40, 7));
                } else {
                    this.buttonsLayout.addView(anonymousClass8, LayoutHelper.createFrame(-2, 40, 51));
                }
                anonymousClass8.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(6, this, anonymousClass8));
            }
            if (this.negative2ButtonText != null) {
                AnonymousClass8 anonymousClass9 = new AnonymousClass8(getContext());
                anonymousClass9.setMinWidth(AndroidUtilities.dp(f3));
                anonymousClass9.setTag(-4);
                anonymousClass9.setTextSize(1, 16.0f);
                anonymousClass9.setTextColor(getThemedColor(this.dialogButtonColorKey));
                anonymousClass9.setGravity(17);
                anonymousClass9.setTypeface(AndroidUtilities.bold());
                anonymousClass9.setEllipsize(TextUtils.TruncateAt.END);
                anonymousClass9.setSingleLine(true);
                anonymousClass9.setText(this.negative2ButtonText.toString());
                anonymousClass9.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(f2), getThemedColor(this.dialogButtonColorKey)));
                anonymousClass9.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.verticalButtons) {
                    i = 7;
                    this.buttonsLayout.addView(anonymousClass9, 0, LayoutHelper.createLinear(-1, 40, 7));
                } else {
                    i = 7;
                    this.buttonsLayout.addView(anonymousClass9, LayoutHelper.createFrame(-2, 40, 53));
                }
                anonymousClass9.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(i, this, anonymousClass9));
            }
            if (this.verticalButtons) {
                for (int i11 = 1; i11 < this.buttonsLayout.getChildCount(); i11++) {
                    ((ViewGroup.MarginLayoutParams) this.buttonsLayout.getChildAt(i11).getLayoutParams()).topMargin = AndroidUtilities.dp(f4);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.needStarsBalance) {
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i3 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.dimEnabled) {
                layoutParams3.dimAmount = this.dimAlpha;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            int i12 = AndroidUtilities.displaySize.x;
            this.lastScreenWidth = i12;
            int iDp2 = (i12 - AndroidUtilities.dp(48.0f)) - (this.additioanalHorizontalPadding * 2);
            int iMin = Math.min(AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f), iDp2);
            Rect rect2 = this.backgroundPaddings;
            layoutParams3.width = iMin + rect2.left + rect2.right;
        }
        View view5 = this.customView;
        if (view5 != null && this.checkFocusable && canTextInput(view5)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.blurredBackground) {
            AndroidUtilities.makeGlobalBlurBitmap(new AlertDialog$$ExternalSyntheticLambda9(this, i4), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
        this.scrollContainer.invalidate();
    }

    public final Browser.Progress makeButtonLoading(int i, boolean z, boolean z2) {
        View button = getButton(i);
        if (z2) {
            this.dismissDialogByButtons = false;
        }
        return new Browser.Progress(new Theme$$ExternalSyntheticLambda8(button, 6), new EglRenderer$$ExternalSyntheticLambda8(this, button, z, 4));
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        OnButtonClickListener onButtonClickListener = this.onBackButtonListener;
        if (onButtonClickListener != null) {
            onButtonClickListener.onClick(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        inflateContent(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void redPositive() {
        TextView textView = (TextView) getButton(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass3 anonymousClass3 = this.contentScrollView;
        if (anonymousClass3 != null) {
            anonymousClass3.postDelayed(runnable, j);
        }
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void setCanCancel() {
        this.canCacnel = false;
    }

    public final void setFocusable(boolean z) {
        if (this.focusable) {
            return;
        }
        this.focusable = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.focusable) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void setMessage(String str) {
        this.message = str;
        if (this.messageTextView != null) {
            if (TextUtils.isEmpty(str)) {
                this.messageTextView.setVisibility(8);
            } else {
                this.messageTextView.setText(this.message);
                this.messageTextView.setVisibility(0);
            }
        }
    }

    @Override
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.onCancelListener = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    public final void setProgress(int i) {
        this.currentProgress = i;
        LineProgressView lineProgressView = this.lineProgressView;
        if (lineProgressView != null) {
            lineProgressView.setProgress(i / 100.0f, true);
            this.lineProgressViewPercent.setText(String.format("%d%%", Integer.valueOf(this.currentProgress)));
        }
    }

    public final void setTextColor(int i) {
        SpoilersTextView spoilersTextView = this.titleTextView;
        if (spoilersTextView != null) {
            spoilersTextView.setTextColor(i);
        }
        EffectsTextView effectsTextView = this.messageTextView;
        if (effectsTextView != null) {
            effectsTextView.setTextColor(i);
        }
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.title = charSequence;
        SpoilersTextView spoilersTextView = this.titleTextView;
        if (spoilersTextView != null) {
            spoilersTextView.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            this.dismissed = false;
            super.show();
            FrameLayout frameLayout = this.progressViewContainer;
            if (frameLayout != null && this.progressViewStyle == 3) {
                frameLayout.setScaleX(0.0f);
                this.progressViewContainer.setScaleY(0.0f);
                this.progressViewContainer.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.shownAt = System.currentTimeMillis();
        }
    }

    public final void showCancelAlert() {
        if (this.canCacnel && this.cancelDialog == null) {
            Builder builder = new Builder(getContext(), 0, this.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.StopLoadingTitle));
            builder.setMessage(LocaleController.getString(R.string.StopLoading));
            builder.setPositiveButton(LocaleController.getString(R.string.WaitMore), null);
            builder.setNegativeButton(LocaleController.getString(R.string.Stop), new AlertDialog$$ExternalSyntheticLambda13(this, 0));
            builder.setOnDismissListener(new BottomSheet$$ExternalSyntheticLambda4(this, 1));
            try {
                this.cancelDialog = builder.show();
            } catch (Exception unused) {
            }
        }
    }

    public void showDelayed(long j) {
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = this.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, j);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass3 anonymousClass3 = this.contentScrollView;
        if (anonymousClass3 != null) {
            anonymousClass3.removeCallbacks(runnable);
        }
    }

    public AlertDialog(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        float f;
        super(context, R.style.TransparentDialog);
        this.customWidth = -1;
        this.customViewHeight = -2;
        this.shadow = new BitmapDrawable[2];
        this.shadowVisibility = new boolean[2];
        this.shadowAnimation = new AnimatorSet[2];
        this.customViewOffset = 12;
        this.dialogButtonColorKey = Theme.key_dialogButton;
        this.topHeight = 132;
        this.messageTextViewClickable = true;
        this.canCacnel = true;
        this.dismissDialogByButtons = true;
        this.containerViewLocation = new int[2];
        this.checkFocusable = true;
        this.dismissRunnable = new AlertDialog$$ExternalSyntheticLambda1(this, 0);
        this.showRunnable = new AlertDialog$$ExternalSyntheticLambda1(this, 1);
        this.itemViews = new ArrayList();
        this.dimEnabled = true;
        this.dimAlpha = 0.5f;
        this.topAnimationAutoRepeat = true;
        this.resourcesProvider = resourcesProvider;
        this.progressViewStyle = i;
        int themedColor = getThemedColor(Theme.key_dialogBackground);
        this.backgroundColor = themedColor;
        boolean z = AndroidUtilities.computePerceivedBrightness(themedColor) < 0.721f;
        this.blurredBackground = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z;
        Rect rect = new Rect();
        this.backgroundPaddings = rect;
        if (i != 3 || this.blurredBackground) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.shadowDrawable = drawableMutate;
            if (i == 3) {
                f = 0.55f;
            } else {
                f = z ? 0.8f : 0.985f;
            }
            this.blurOpacity = f;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.MULTIPLY));
            drawableMutate.getPadding(rect);
        }
        this.withCancelDialog = i == 3;
    }
}
