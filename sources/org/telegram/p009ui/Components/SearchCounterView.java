package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;

public class SearchCounterView extends View {
    int animationType;
    private StaticLayout countAnimationInLayout;
    private boolean countAnimationIncrement;
    private StaticLayout countAnimationStableLayout;
    private StaticLayout countAnimationStableLayout2;
    private ValueAnimator countAnimator;
    private float countChangeProgress;
    private StaticLayout countLayout;
    float countLeft;
    private StaticLayout countOldLayout;
    private int countWidth;
    private int countWidthOld;
    int currentCount;
    String currentString;
    float f1123dx;
    int gravity;
    public float horizontalPadding;
    int lastH;
    RectF rectF;
    private final Theme.ResourcesProvider resourcesProvider;
    private int textColor;
    private String textColorKey;
    TextPaint textPaint;
    float f1124x;

    public SearchCounterView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.textPaint = new TextPaint(1);
        this.rectF = new RectF();
        this.countChangeProgress = 1.0f;
        this.textColorKey = "chat_searchPanelText";
        this.gravity = 17;
        this.f1123dx = 0.0f;
        this.resourcesProvider = resourcesProvider;
        this.textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.textPaint.setTextSize(AndroidUtilities.m35dp(15.0f));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() != this.lastH) {
            int i3 = this.currentCount;
            String str = this.currentString;
            this.currentString = null;
            setCount(str, i3, false);
            this.lastH = getMeasuredHeight();
        }
    }

    public void setCount(String str, int i, boolean z) {
        String str2 = str;
        String str3 = this.currentString;
        if (str3 == null || !str3.equals(str2)) {
            ValueAnimator valueAnimator = this.countAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z2 = (this.currentCount == 0 || i <= 0 || str2 == null || LocaleController.isRTL || TextUtils.isEmpty(str)) ? false : z;
            if (z2 && str2 != null && !str2.contains("**")) {
                z2 = false;
            }
            if (!z2) {
                if (str2 != null) {
                    str2 = str2.replaceAll("\\*\\*", BuildConfig.APP_CENTER_HASH);
                }
                this.currentCount = i;
                if (str2 == null) {
                    this.countWidth = 0;
                    this.countLayout = null;
                } else {
                    this.countWidth = Math.max(AndroidUtilities.m35dp(12.0f), (int) Math.ceil(this.textPaint.measureText(str2)));
                    this.countLayout = new StaticLayout(str2, this.textPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                invalidate();
            }
            this.f1123dx = 0.0f;
            if (z2) {
                ValueAnimator valueAnimator2 = this.countAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.countChangeProgress = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.countAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        SearchCounterView.this.lambda$setCount$0(valueAnimator3);
                    }
                });
                this.countAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SearchCounterView searchCounterView = SearchCounterView.this;
                        searchCounterView.animationType = -1;
                        searchCounterView.countChangeProgress = 1.0f;
                        SearchCounterView.this.countOldLayout = null;
                        SearchCounterView.this.countAnimationStableLayout = null;
                        SearchCounterView.this.countAnimationInLayout = null;
                        SearchCounterView.this.invalidate();
                    }
                });
                this.countAnimator.setDuration(200L);
                this.countAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                if (this.countLayout != null) {
                    String str4 = this.currentString;
                    int indexOf = str2.indexOf("**");
                    if (indexOf >= 0) {
                        str2 = str2.replaceAll("\\*\\*", BuildConfig.APP_CENTER_HASH);
                    } else {
                        indexOf = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str2);
                    boolean z3 = Integer.toString(this.currentCount).length() != Integer.toString(i).length();
                    int min = Math.min(str4.length(), str2.length());
                    if (indexOf > 0) {
                        spannableStringBuilder.setSpan(new EmptyStubSpan(), 0, indexOf, 33);
                        spannableStringBuilder2.setSpan(new EmptyStubSpan(), 0, indexOf, 33);
                        spannableStringBuilder3.setSpan(new EmptyStubSpan(), 0, indexOf, 33);
                    }
                    int i2 = 0;
                    boolean z4 = false;
                    boolean z5 = false;
                    int i3 = 0;
                    for (int i4 = indexOf; i4 < min; i4++) {
                        if (!z4 && !z5) {
                            if (z3) {
                                spannableStringBuilder3.setSpan(new EmptyStubSpan(), i4, i4 + 1, 33);
                            } else if (str4.charAt(i4) == str2.charAt(i4)) {
                                int i5 = i4 + 1;
                                spannableStringBuilder.setSpan(new EmptyStubSpan(), i4, i5, 33);
                                spannableStringBuilder2.setSpan(new EmptyStubSpan(), i4, i5, 33);
                            } else {
                                spannableStringBuilder3.setSpan(new EmptyStubSpan(), i4, i4 + 1, 33);
                            }
                        }
                        if (!Character.isDigit(str2.charAt(i4))) {
                            spannableStringBuilder2.setSpan(new EmptyStubSpan(), i4, str2.length(), 33);
                            i3 = i4;
                            z4 = true;
                        }
                        if (!Character.isDigit(str4.charAt(i4))) {
                            spannableStringBuilder.setSpan(new EmptyStubSpan(), i4, str4.length(), 33);
                            i2 = i4;
                            z5 = true;
                        }
                    }
                    int max = Math.max(AndroidUtilities.m35dp(12.0f), (int) Math.ceil(this.textPaint.measureText(str4)));
                    int max2 = Math.max(AndroidUtilities.m35dp(12.0f), (int) Math.ceil(this.textPaint.measureText(str2)));
                    this.countOldLayout = new StaticLayout(spannableStringBuilder, this.textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, this.textPaint, max2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, max2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    if (indexOf > 0) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(str2);
                        spannableStringBuilder4.setSpan(new EmptyStubSpan(), indexOf, str2.length(), 0);
                        this.countAnimationStableLayout2 = new StaticLayout(spannableStringBuilder4, this.textPaint, max2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    } else {
                        this.countAnimationStableLayout2 = null;
                    }
                    this.f1123dx = this.countOldLayout.getPrimaryHorizontal(i2) - this.countAnimationStableLayout.getPrimaryHorizontal(i3);
                }
                this.countWidthOld = this.countWidth;
                this.countAnimationIncrement = i < this.currentCount;
                this.countAnimator.start();
            }
            if (i > 0) {
                this.countWidth = Math.max(AndroidUtilities.m35dp(12.0f), (int) Math.ceil(this.textPaint.measureText(str2)));
                this.countLayout = new StaticLayout(str2, this.textPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            }
            this.currentCount = i;
            invalidate();
            this.currentString = str2;
        }
    }

    public void lambda$setCount$0(ValueAnimator valueAnimator) {
        this.countChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        int color = Theme.getColor(this.textColorKey, this.resourcesProvider);
        if (this.textColor != color) {
            this.textColor = color;
            this.textPaint.setColor(color);
        }
        if (this.countChangeProgress != 1.0f) {
            float measuredHeight = (getMeasuredHeight() - AndroidUtilities.m35dp(23.0f)) / 2.0f;
            int i = this.countWidth;
            int i2 = this.countWidthOld;
            if (i == i2) {
                f = i;
            } else {
                float f2 = this.countChangeProgress;
                f = (i * f2) + (i2 * (1.0f - f2));
            }
            updateX(f);
            RectF rectF = this.rectF;
            float f3 = this.f1124x;
            rectF.set(f3, measuredHeight, f + f3 + AndroidUtilities.m35dp(11.0f), AndroidUtilities.m35dp(23.0f) + measuredHeight);
            boolean z = this.countAnimationIncrement;
            if (this.countAnimationInLayout != null) {
                canvas.save();
                float f4 = this.countLeft;
                float m35dp = AndroidUtilities.m35dp(2.0f) + measuredHeight;
                int m35dp2 = AndroidUtilities.m35dp(13.0f);
                if (!z) {
                    m35dp2 = -m35dp2;
                }
                canvas.translate(f4, m35dp + (m35dp2 * (1.0f - this.countChangeProgress)));
                this.textPaint.setAlpha((int) (this.countChangeProgress * 255.0f));
                this.countAnimationInLayout.draw(canvas);
                canvas.restore();
            } else if (this.countLayout != null) {
                canvas.save();
                float f5 = this.countLeft;
                float m35dp3 = AndroidUtilities.m35dp(2.0f) + measuredHeight;
                int m35dp4 = AndroidUtilities.m35dp(13.0f);
                if (!z) {
                    m35dp4 = -m35dp4;
                }
                canvas.translate(f5, m35dp3 + (m35dp4 * (1.0f - this.countChangeProgress)));
                this.textPaint.setAlpha((int) (this.countChangeProgress * 255.0f));
                this.countLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countOldLayout != null) {
                canvas.save();
                canvas.translate(this.countLeft, AndroidUtilities.m35dp(2.0f) + measuredHeight + ((z ? -AndroidUtilities.m35dp(13.0f) : AndroidUtilities.m35dp(13.0f)) * this.countChangeProgress));
                this.textPaint.setAlpha((int) ((1.0f - this.countChangeProgress) * 255.0f));
                this.countOldLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countAnimationStableLayout != null) {
                canvas.save();
                canvas.translate(this.countLeft + (this.f1123dx * (1.0f - this.countChangeProgress)), AndroidUtilities.m35dp(2.0f) + measuredHeight);
                this.textPaint.setAlpha(255);
                this.countAnimationStableLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countAnimationStableLayout2 != null) {
                canvas.save();
                canvas.translate(this.countLeft, measuredHeight + AndroidUtilities.m35dp(2.0f));
                this.textPaint.setAlpha(255);
                this.countAnimationStableLayout2.draw(canvas);
                canvas.restore();
            }
            this.textPaint.setAlpha(255);
            return;
        }
        drawInternal(canvas);
    }

    private void updateX(float f) {
        int i = this.gravity;
        if (i == 5) {
            float measuredWidth = getMeasuredWidth() - AndroidUtilities.m35dp(5.5f);
            this.countLeft = measuredWidth;
            float f2 = this.horizontalPadding;
            if (f2 != 0.0f) {
                this.countLeft = measuredWidth - Math.max(f2 + (f / 2.0f), f);
            } else {
                this.countLeft = measuredWidth - f;
            }
        } else if (i == 3) {
            this.countLeft = AndroidUtilities.m35dp(5.5f);
        } else {
            this.countLeft = (int) ((getMeasuredWidth() - f) / 2.0f);
        }
        this.f1124x = this.countLeft - AndroidUtilities.m35dp(5.5f);
    }

    private void drawInternal(Canvas canvas) {
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.m35dp(23.0f)) / 2.0f;
        updateX(this.countWidth);
        if (this.countLayout != null) {
            canvas.save();
            canvas.translate(this.countLeft, measuredHeight + AndroidUtilities.m35dp(2.0f));
            this.countLayout.draw(canvas);
            canvas.restore();
        }
    }

    public void setGravity(int i) {
        this.gravity = i;
    }
}
