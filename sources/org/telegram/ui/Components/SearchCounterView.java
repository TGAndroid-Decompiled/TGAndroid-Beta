package org.telegram.ui.Components;

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
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;

public class SearchCounterView extends View {
    private static final int ANIMATION_TYPE_REPLACE = 2;
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
    float dx;
    int gravity;
    public float horizontalPadding;
    int lastH;
    RectF rectF;
    private final Theme.ResourcesProvider resourcesProvider;
    private int textColor;
    private int textColorKey;
    TextPaint textPaint;
    float x;

    public SearchCounterView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.animationType = -1;
        this.textPaint = new TextPaint(1);
        this.rectF = new RectF();
        this.countChangeProgress = 1.0f;
        this.textColorKey = Theme.key_chat_searchPanelText;
        this.gravity = 17;
        this.dx = 0.0f;
        this.resourcesProvider = resourcesProvider;
        this.textPaint.setTypeface(AndroidUtilities.bold());
        this.textPaint.setTextSize(AndroidUtilities.dp(15.0f));
    }

    private void drawInternal(Canvas canvas) {
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(23.0f)) / 2.0f;
        updateX(this.countWidth);
        if (this.countLayout != null) {
            canvas.save();
            canvas.translate(this.countLeft, measuredHeight + AndroidUtilities.dp(2.0f));
            this.countLayout.draw(canvas);
            canvas.restore();
        }
    }

    public void lambda$setCount$0(ValueAnimator valueAnimator) {
        this.countChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private void updateX(float f) {
        int i = this.gravity;
        if (i == 5) {
            float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(5.5f);
            this.countLeft = measuredWidth;
            float f2 = this.horizontalPadding;
            if (f2 != 0.0f) {
                this.countLeft = measuredWidth - Math.max((f / 2.0f) + f2, f);
            } else {
                this.countLeft = measuredWidth - f;
            }
        } else if (i == 3) {
            this.countLeft = AndroidUtilities.dp(5.5f);
        } else {
            this.countLeft = (int) ((getMeasuredWidth() - f) / 2.0f);
        }
        this.x = this.countLeft - AndroidUtilities.dp(5.5f);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float fM;
        super.onDraw(canvas);
        int color = Theme.getColor(this.textColorKey, this.resourcesProvider);
        if (this.textColor != color) {
            this.textColor = color;
            this.textPaint.setColor(color);
        }
        if (this.countChangeProgress == 1.0f) {
            drawInternal(canvas);
            return;
        }
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(23.0f)) / 2.0f;
        int i = this.countWidth;
        int i2 = this.countWidthOld;
        if (i == i2) {
            fM = i;
        } else {
            float f = this.countChangeProgress;
            fM = DiffUtil.m(1.0f, f, i2, i * f);
        }
        updateX(fM);
        RectF rectF = this.rectF;
        float f2 = this.x;
        rectF.set(f2, measuredHeight, fM + f2 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + measuredHeight);
        boolean z = this.countAnimationIncrement;
        if (this.countAnimationInLayout != null) {
            canvas.save();
            float f3 = this.countLeft;
            float fDp = AndroidUtilities.dp(2.0f) + measuredHeight;
            int iDp = AndroidUtilities.dp(13.0f);
            if (!z) {
                iDp = -iDp;
            }
            canvas.translate(f3, DiffUtil.m(1.0f, this.countChangeProgress, iDp, fDp));
            this.textPaint.setAlpha((int) (this.countChangeProgress * 255.0f));
            this.countAnimationInLayout.draw(canvas);
            canvas.restore();
        } else if (this.countLayout != null) {
            canvas.save();
            float f4 = this.countLeft;
            float fDp2 = AndroidUtilities.dp(2.0f) + measuredHeight;
            int iDp2 = AndroidUtilities.dp(13.0f);
            if (!z) {
                iDp2 = -iDp2;
            }
            canvas.translate(f4, DiffUtil.m(1.0f, this.countChangeProgress, iDp2, fDp2));
            this.textPaint.setAlpha((int) (this.countChangeProgress * 255.0f));
            this.countLayout.draw(canvas);
            canvas.restore();
        }
        if (this.countOldLayout != null) {
            canvas.save();
            canvas.translate(this.countLeft, ((z ? -AndroidUtilities.dp(13.0f) : AndroidUtilities.dp(13.0f)) * this.countChangeProgress) + AndroidUtilities.dp(2.0f) + measuredHeight);
            this.textPaint.setAlpha((int) ((1.0f - this.countChangeProgress) * 255.0f));
            this.countOldLayout.draw(canvas);
            canvas.restore();
        }
        if (this.countAnimationStableLayout != null) {
            canvas.save();
            canvas.translate(DiffUtil.m(1.0f, this.countChangeProgress, this.dx, this.countLeft), AndroidUtilities.dp(2.0f) + measuredHeight);
            this.textPaint.setAlpha(255);
            this.countAnimationStableLayout.draw(canvas);
            canvas.restore();
        }
        if (this.countAnimationStableLayout2 != null) {
            canvas.save();
            canvas.translate(this.countLeft, measuredHeight + AndroidUtilities.dp(2.0f));
            this.textPaint.setAlpha(255);
            this.countAnimationStableLayout2.draw(canvas);
            canvas.restore();
        }
        this.textPaint.setAlpha(255);
    }

    @Override
    public void onMeasure(int i, int i2) {
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
        String strReplaceAll;
        float f;
        String strReplaceAll2 = str;
        String str2 = this.currentString;
        if (str2 == null || !str2.equals(strReplaceAll2)) {
            ValueAnimator valueAnimator = this.countAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z2 = (this.currentCount == 0 || i <= 0 || strReplaceAll2 == null || LocaleController.isRTL || TextUtils.isEmpty(strReplaceAll2)) ? false : z;
            if (z2 && strReplaceAll2 != null && !strReplaceAll2.contains("**")) {
                z2 = false;
            }
            if (z2) {
                strReplaceAll = strReplaceAll2;
            } else {
                if (strReplaceAll2 != null) {
                    strReplaceAll2 = strReplaceAll2.replaceAll("\\*\\*", "");
                }
                strReplaceAll = strReplaceAll2;
                this.currentCount = i;
                if (strReplaceAll == null) {
                    this.countWidth = 0;
                    this.countLayout = null;
                } else {
                    this.countWidth = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.textPaint.measureText(strReplaceAll)));
                    this.countLayout = new StaticLayout(strReplaceAll, this.textPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                invalidate();
            }
            this.dx = 0.0f;
            if (z2) {
                ValueAnimator valueAnimator2 = this.countAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.countChangeProgress = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.countAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 23));
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
                this.animationType = 2;
                this.countAnimator.setDuration(200L);
                this.countAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                if (this.countLayout != null) {
                    String str3 = this.currentString;
                    int iIndexOf = strReplaceAll.indexOf("**");
                    if (iIndexOf >= 0) {
                        strReplaceAll = strReplaceAll.replaceAll("\\*\\*", "");
                    } else {
                        iIndexOf = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strReplaceAll);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(strReplaceAll);
                    boolean z3 = Integer.toString(this.currentCount).length() != Integer.toString(i).length();
                    int iMin = Math.min(str3.length(), strReplaceAll.length());
                    if (iIndexOf > 0) {
                        spannableStringBuilder.setSpan(new EmptyStubSpan(), 0, Math.min(spannableStringBuilder.length(), iIndexOf), 33);
                        spannableStringBuilder2.setSpan(new EmptyStubSpan(), 0, Math.min(spannableStringBuilder2.length(), iIndexOf), 33);
                        spannableStringBuilder3.setSpan(new EmptyStubSpan(), 0, Math.min(spannableStringBuilder3.length(), iIndexOf), 33);
                    }
                    int i2 = iIndexOf;
                    f = 12.0f;
                    int i3 = 0;
                    boolean z4 = false;
                    boolean z5 = false;
                    int i4 = 0;
                    while (i2 < iMin) {
                        if (!z4 && !z5) {
                            if (!z3 && str3.charAt(i2) == strReplaceAll.charAt(i2)) {
                                int i5 = i2 + 1;
                                spannableStringBuilder.setSpan(new EmptyStubSpan(), i2, i5, 33);
                                spannableStringBuilder2.setSpan(new EmptyStubSpan(), i2, i5, 33);
                            } else {
                                spannableStringBuilder3.setSpan(new EmptyStubSpan(), i2, i2 + 1, 33);
                            }
                        }
                        if (!Character.isDigit(strReplaceAll.charAt(i2))) {
                            spannableStringBuilder2.setSpan(new EmptyStubSpan(), i2, strReplaceAll.length(), 33);
                            i4 = i2;
                            z4 = true;
                        }
                        if (!Character.isDigit(str3.charAt(i2))) {
                            spannableStringBuilder.setSpan(new EmptyStubSpan(), i2, str3.length(), 33);
                            i3 = i2;
                            z5 = true;
                        }
                        i2++;
                    }
                    int iMax = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.textPaint.measureText(str3)));
                    int iMax2 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.textPaint.measureText(strReplaceAll)));
                    TextPaint textPaint = this.textPaint;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    this.countOldLayout = new StaticLayout(spannableStringBuilder, textPaint, iMax, alignment, 1.0f, 0.0f, false);
                    this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, this.textPaint, iMax2, alignment, 1.0f, 0.0f, false);
                    this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, iMax2, alignment, 1.0f, 0.0f, false);
                    if (iIndexOf > 0) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(strReplaceAll);
                        spannableStringBuilder4.setSpan(new EmptyStubSpan(), iIndexOf, strReplaceAll.length(), 0);
                        this.countAnimationStableLayout2 = new StaticLayout(spannableStringBuilder4, this.textPaint, iMax2, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.countAnimationStableLayout2 = null;
                    }
                    this.dx = this.countOldLayout.getPrimaryHorizontal(i3) - this.countAnimationStableLayout.getPrimaryHorizontal(i4);
                } else {
                    f = 12.0f;
                }
                this.countWidthOld = this.countWidth;
                this.countAnimationIncrement = i < this.currentCount;
                this.countAnimator.start();
            } else {
                f = 12.0f;
            }
            String str4 = strReplaceAll;
            if (i > 0) {
                this.countWidth = Math.max(AndroidUtilities.dp(f), (int) Math.ceil(this.textPaint.measureText(str4)));
                this.countLayout = new StaticLayout(str4, this.textPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            }
            this.currentCount = i;
            invalidate();
            this.currentString = str4;
        }
    }

    public void setGravity(int i) {
        this.gravity = i;
    }
}
