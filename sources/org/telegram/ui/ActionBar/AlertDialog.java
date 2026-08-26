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
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda77;
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
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda16;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;
import org.telegram.ui.Stars.BalanceCloud;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda0;

public class AlertDialog extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public EffectsTextView aboveMessageView;
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
    public TextView bottomView;
    public boolean buttonsInTwoRows;
    public ViewGroup buttonsLayout;
    public boolean canCacnel;
    public AlertDialog cancelDialog;
    public boolean checkFocusable;
    public AlertDialogView containerView;
    public final int[] containerViewLocation;
    public LoginActivity.AnonymousClass3 contentScrollView;
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
    public RichInlineButtonEditor$$ExternalSyntheticLambda0 negative2ButtonListener;
    public String negative2ButtonText;
    public OnButtonClickListener negativeButtonListener;
    public String negativeButtonText;
    public OnButtonClickListener neutralButtonListener;
    public String neutralButtonText;
    public boolean notDrawBackgroundOnTopView;
    public LaunchActivity$$ExternalSyntheticLambda16 onBackButtonListener;
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
    public String subtitle;
    public TextView subtitleTextView;
    public CharSequence title;
    public FrameLayout titleContainer;
    public SpoilersTextView titleTextView;
    public boolean topAnimationAutoRepeat;
    public int topAnimationId;
    public boolean topAnimationIsNew;
    public HashMap topAnimationLayerColors;
    public int topAnimationSize;
    public int topBackgroundColor;
    public Drawable topDrawable;
    public int topHeight;
    public RLottieImageView topImageView;
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
        public final TextView textView;

        public AlertDialogCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
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

        public final void setTextAndIcon(int i, CharSequence charSequence) {
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
            this.blurPaintAlpha = new AnimatedFloat(this);
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
                float f = this.blurPaintAlpha.set(alertDialog.blurPaint != null ? 1.0f : 0.0f, false);
                Paint paint = alertDialog.blurPaint;
                if (paint != null) {
                    paint.setAlpha((int) (f * 255.0f));
                    canvas.drawRoundRect(AndroidUtilities.rectTmp, fDp, fDp, alertDialog.blurPaint);
                }
                if (alertDialog.dimBlurPaint == null) {
                    Paint paint2 = new Paint(1);
                    alertDialog.dimBlurPaint = paint2;
                    paint2.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (alertDialog.dimAlpha * 255.0f)));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                canvas.drawRoundRect(rectF, fDp, fDp, alertDialog.dimBlurPaint);
                Paint paint3 = this.backgroundPaint;
                paint3.setColor(alertDialog.backgroundColor);
                paint3.setAlpha((int) ((((alertDialog.blurOpacity - 1.0f) * f) + 1.0f) * paint3.getAlpha()));
                canvas.drawRoundRect(rectF, fDp, fDp, paint3);
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
                LoginActivity.AnonymousClass3 anonymousClass3 = alertDialog.contentScrollView;
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
            int iM = OKLCH.m(paddingLeft, 48.0f, 1073741824);
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
        public final AlertDialog alertDialog;
        public final boolean[] red;

        public Builder(Context context) {
            this(context, 0, null);
        }

        public final AlertDialog create() {
            return this.alertDialog;
        }

        public AlertDialog createAlertDialog(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            return new AlertDialog(context, i, resourcesProvider);
        }

        public final void makeCustomMaxHeight() {
            int i = AlertDialog.$r8$clinit;
            this.alertDialog.getClass();
        }

        public final void makeRed(int i) {
            int i2 = (-i) - 1;
            if (i2 >= 0) {
                boolean[] zArr = this.red;
                if (i2 < zArr.length) {
                    zArr[i2] = true;
                }
            }
        }

        public final void setDimAlpha() {
            this.alertDialog.dimAlpha = 0.5f;
        }

        public final void setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.items = charSequenceArr;
            alertDialog.onClickListener = onClickListener;
        }

        public final void setMessage(CharSequence charSequence) {
            this.alertDialog.message = charSequence;
        }

        public final void setNegativeButton(String str, OnButtonClickListener onButtonClickListener) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.negativeButtonText = str;
            alertDialog.negativeButtonListener = onButtonClickListener;
        }

        public final void setNeutralButton(String str, OnButtonClickListener onButtonClickListener) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.neutralButtonText = str;
            alertDialog.neutralButtonListener = onButtonClickListener;
        }

        public final void setOnBackButtonListener(LaunchActivity$$ExternalSyntheticLambda16 launchActivity$$ExternalSyntheticLambda16) {
            this.alertDialog.onBackButtonListener = launchActivity$$ExternalSyntheticLambda16;
        }

        public final void setPositiveButton(CharSequence charSequence, OnButtonClickListener onButtonClickListener) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.positiveButtonText = charSequence;
            alertDialog.positiveButtonListener = onButtonClickListener;
        }

        public final void setTitle(CharSequence charSequence) {
            this.alertDialog.title = charSequence;
        }

        public final void setTopAnimation(int i, int i2) {
            setTopAnimation(i, 72, i2, null);
        }

        public final void setView(View view) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.customView = view;
            alertDialog.customViewHeight = -2;
        }

        public final AlertDialog show() {
            TextView textView;
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.show();
            int i = 0;
            while (true) {
                boolean[] zArr = this.red;
                if (i >= zArr.length) {
                    return alertDialog;
                }
                if (zArr[i] && (textView = (TextView) alertDialog.getButton(-(i + 1))) != null) {
                    textView.setTextColor(alertDialog.getThemedColor(Theme.key_text_RedBold));
                }
                i++;
            }
        }

        public Builder(Context context, Theme.ResourcesProvider resourcesProvider) {
            this(context, 0, resourcesProvider);
        }

        public final void setTopAnimation(int i, int i2, int i3, HashMap map) {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.topAnimationId = i;
            alertDialog.topAnimationSize = i2;
            alertDialog.topAnimationAutoRepeat = false;
            alertDialog.topBackgroundColor = i3;
            alertDialog.topAnimationLayerColors = map;
        }

        public Builder(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            this.red = new boolean[3];
            if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.instance)) == null) {
                context = ApplicationLoader.applicationContext;
            }
            this.alertDialog = createAlertDialog(context, i, resourcesProvider);
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
        int i;
        float f4;
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
            f = 8.0f;
        } else {
            boolean z3 = this.notDrawBackgroundOnTopView;
            Drawable drawable = this.shadowDrawable;
            if (z3) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                f = 8.0f;
                this.containerView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.drawBackground = true;
            } else {
                f = 8.0f;
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
                BalanceCloud balanceCloud = new BalanceCloud(getContext(), UserConfig.selectedAccount, AmountUtils$Currency.STARS, resourcesProvider);
                this.starsBalanceCloud = balanceCloud;
                ScaleStateListAnimator.apply(balanceCloud, 0.1f, 1.5f);
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
            }
            AndroidUtilities.removeFromParent(this.containerView);
            AndroidUtilities.removeFromParent(this.starsBalanceCloud);
            this.fullscreenContainerView.addView(this.containerView, LayoutHelper.createFrame(-2, -2, 17));
            this.fullscreenContainerView.addView(this.starsBalanceCloud, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.fullscreenContainerView;
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
        if (this.topAnimationId == 0 && this.topDrawable == null) {
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
                rLottieImageView.setAutoRepeat(this.topAnimationAutoRepeat);
                RLottieImageView rLottieImageView2 = this.topImageView;
                int i5 = this.topAnimationId;
                int i6 = this.topAnimationSize;
                rLottieImageView2.setAnimation(i5, i6, i6, null);
                if (this.topAnimationLayerColors != null) {
                    RLottieDrawable animatedDrawable = this.topImageView.getAnimatedDrawable();
                    for (Map.Entry entry : this.topAnimationLayerColors.entrySet()) {
                        String str = (String) entry.getKey();
                        Integer num = (Integer) entry.getValue();
                        num.getClass();
                        animatedDrawable.newColorUpdates.put(str, num);
                        animatedDrawable.requestRedrawColors();
                    }
                }
                this.topImageView.playAnimation();
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
                        int i7 = this.size;
                        int i8 = (int) ((width - i7) / 2.0f);
                        int height = (int) ((alertDialog.topImageView.getHeight() - i7) / 2.0f);
                        int width2 = (int) ((alertDialog.topImageView.getWidth() + i7) / 2.0f);
                        int height2 = (int) ((alertDialog.topImageView.getHeight() + i7) / 2.0f);
                        GradientDrawable gradientDrawable2 = gradientDrawable;
                        gradientDrawable2.setBounds(i8, height, width2, height2);
                        gradientDrawable2.draw(canvas);
                    }

                    @Override
                    public final int getOpacity() {
                        return gradientDrawable.getOpacity();
                    }

                    @Override
                    public final void setAlpha(int i7) {
                        gradientDrawable.setAlpha(i7);
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
            SpoilersTextView spoilersTextView = new SpoilersTextView(getContext(), null, false);
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
            int i7 = (z6 ? 1 : LocaleController.isRTL ? 5 : 3) | 48;
            if (z6) {
                f4 = 4.0f;
            } else {
                f4 = this.subtitle != null ? 2 : this.items != null ? 14 : 10;
            }
            frameLayout3.addView(spoilersTextView3, LayoutHelper.createFrame(-2, -2.0f, i7, 0.0f, 19.0f, 0.0f, f4));
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
            LoginActivity.AnonymousClass3 anonymousClass3 = new LoginActivity.AnonymousClass3(this, getContext(), i2);
            this.contentScrollView = anonymousClass3;
            anonymousClass3.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.contentScrollView, getThemedColor(Theme.key_dialogScrollGlow));
            this.containerView.addView(this.contentScrollView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.scrollContainer = linearLayout;
            linearLayout.setOrientation(1);
            f2 = 20.0f;
            this.contentScrollView.addView(this.scrollContainer, new FrameLayout.LayoutParams(-1, -2));
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
            EffectsTextView effectsTextView2 = this.aboveMessageView;
            if (effectsTextView2 != null) {
                this.scrollContainer.addView(effectsTextView2, LayoutHelper.createLinear(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            this.scrollContainer.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, (this.topAnimationIsNew ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, (this.customView == null && this.items == null) ? 0 : this.customViewOffset));
            TextView textView3 = this.bottomView;
            if (textView3 != null) {
                this.scrollContainer.addView(textView3, LayoutHelper.createLinear(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (TextUtils.isEmpty(this.message)) {
            this.messageTextView.setVisibility(8);
        } else {
            this.messageTextView.setText(this.message);
            this.messageTextView.setVisibility(0);
        }
        if (this.items != null) {
            int i8 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i8 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i8] != null) {
                    AlertDialogCell alertDialogCell = new AlertDialogCell(getContext(), resourcesProvider);
                    CharSequence charSequence = this.items[i8];
                    int[] iArr = this.itemIcons;
                    alertDialogCell.setTextAndIcon(iArr != null ? iArr[i8] : 0, charSequence);
                    alertDialogCell.setTag(Integer.valueOf(i8));
                    this.itemViews.add(alertDialogCell);
                    this.scrollContainer.addView(alertDialogCell, LayoutHelper.createLinear(-1, 50));
                    final int i9 = 2;
                    alertDialogCell.setOnClickListener(new View.OnClickListener(this) {
                        public final AlertDialog f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i9) {
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
                                        onClickListener.onClick(alertDialog2, ((Integer) view2.getTag()).intValue());
                                    }
                                    alertDialog2.dismiss();
                                    break;
                            }
                        }
                    });
                }
                i8++;
            }
        }
        View view2 = this.customView;
        if (view2 != null) {
            if (view2.getParent() != null) {
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
                    String str2 = this.negativeButtonText;
                    iMeasureText = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + AndroidUtilities.dp(24.0f) + iMeasureText);
                }
                if (this.negative2ButtonText != null) {
                    if (iMeasureText > 0) {
                        iMeasureText += AndroidUtilities.dp(f);
                    }
                    String str3 = this.negative2ButtonText;
                    iMeasureText = (int) (textPaint.measureText((CharSequence) str3, 0, str3.length()) + AndroidUtilities.dp(24.0f) + iMeasureText);
                }
                if (this.neutralButtonText != null) {
                    if (iMeasureText > 0) {
                        iMeasureText += AndroidUtilities.dp(f);
                    }
                    String str4 = this.neutralButtonText;
                    iMeasureText = (int) (textPaint.measureText((CharSequence) str4, 0, str4.length()) + AndroidUtilities.dp(24.0f) + iMeasureText);
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
                this.buttonsLayout = new ChatActivity.AnonymousClass60(this, getContext(), i2);
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
                    this.buttonsLayout.addView(anonymousClass6, LayoutHelper.createLinear(-1, 40, 7));
                } else {
                    f3 = 64.0f;
                    this.buttonsLayout.addView(anonymousClass6, LayoutHelper.createFrame(-2, 40, 53));
                }
                anonymousClass6.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(5, this, anonymousClass6));
            } else {
                f3 = 64.0f;
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
                anonymousClass7.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(6, this, anonymousClass7));
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
                    i = 7;
                    this.buttonsLayout.addView(anonymousClass8, 1, LayoutHelper.createLinear(-1, 40, 7));
                } else {
                    i = 7;
                    this.buttonsLayout.addView(anonymousClass8, LayoutHelper.createFrame(-2, 40, 51));
                }
                anonymousClass8.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(i, this, anonymousClass8));
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
                    this.buttonsLayout.addView(anonymousClass9, 0, LayoutHelper.createLinear(-1, 40, 7));
                } else {
                    this.buttonsLayout.addView(anonymousClass9, LayoutHelper.createFrame(-2, 40, 53));
                }
                anonymousClass9.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(8, this, anonymousClass9));
            }
            if (this.verticalButtons) {
                for (int i10 = 1; i10 < this.buttonsLayout.getChildCount(); i10++) {
                    ((ViewGroup.MarginLayoutParams) this.buttonsLayout.getChildAt(i10).getLayoutParams()).topMargin = AndroidUtilities.dp(6.0f);
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
            int i11 = AndroidUtilities.displaySize.x;
            this.lastScreenWidth = i11;
            int iDp2 = (i11 - AndroidUtilities.dp(48.0f)) - (this.additioanalHorizontalPadding * 2);
            int iMin = Math.min(AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f), iDp2);
            Rect rect2 = this.backgroundPaddings;
            layoutParams3.width = iMin + rect2.left + rect2.right;
        }
        View view3 = this.customView;
        if (view3 != null && this.checkFocusable && canTextInput(view3)) {
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
        this.contentScrollView.invalidate();
        this.scrollContainer.invalidate();
    }

    public final Browser.Progress makeButtonLoading(int i, boolean z, boolean z2) {
        View button = getButton(i);
        if (z2) {
            this.dismissDialogByButtons = false;
        }
        Theme$$ExternalSyntheticLambda8 theme$$ExternalSyntheticLambda8 = new Theme$$ExternalSyntheticLambda8(button, 6);
        PhotoViewer$$ExternalSyntheticLambda89 photoViewer$$ExternalSyntheticLambda89 = new PhotoViewer$$ExternalSyntheticLambda89(this, button, z, 4);
        Browser.Progress progress = new Browser.Progress();
        progress.onInitListener = theme$$ExternalSyntheticLambda8;
        progress.onEndListener = photoViewer$$ExternalSyntheticLambda89;
        return progress;
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        LaunchActivity$$ExternalSyntheticLambda16 launchActivity$$ExternalSyntheticLambda16 = this.onBackButtonListener;
        if (launchActivity$$ExternalSyntheticLambda16 != null) {
            launchActivity$$ExternalSyntheticLambda16.onClick(this, -2);
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
        LoginActivity.AnonymousClass3 anonymousClass3 = this.contentScrollView;
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
            String string = LocaleController.getString(R.string.StopLoadingTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.StopLoading);
            builder.setPositiveButton(LocaleController.getString(R.string.WaitMore), null);
            builder.setNegativeButton(LocaleController.getString(R.string.Stop), new AlertDialog$$ExternalSyntheticLambda11(this, 0));
            alertDialog.setOnDismissListener(new BottomSheet$$ExternalSyntheticLambda4(this, 1));
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
        LoginActivity.AnonymousClass3 anonymousClass3 = this.contentScrollView;
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
