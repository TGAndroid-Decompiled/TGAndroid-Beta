package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

public class FadingTextViewLayout extends FrameLayout {
    private final ValueAnimator animator;
    private TextView currentView;
    private TextView foregroundView;
    private TextView nextView;
    private CharSequence text;

    protected int getStaticCharsCount() {
        return 0;
    }

    public FadingTextViewLayout(Context context) {
        this(context, false);
    }

    public FadingTextViewLayout(Context context, boolean z) {
        super(context);
        for (int i = 0; i < (z ? 1 : 0) + 2; i++) {
            TextView textView = new TextView(context);
            onTextViewCreated(textView);
            addView(textView);
            if (i == 0) {
                this.currentView = textView;
            } else {
                textView.setVisibility(8);
                if (i == 1) {
                    textView.setAlpha(0.0f);
                    this.nextView = textView;
                } else {
                    this.foregroundView = textView;
                }
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = ofFloat;
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(null);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FadingTextViewLayout.this.lambda$new$0(valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                FadingTextViewLayout.this.currentView.setLayerType(0, null);
                FadingTextViewLayout.this.nextView.setLayerType(0, null);
                FadingTextViewLayout.this.nextView.setVisibility(8);
                if (FadingTextViewLayout.this.foregroundView != null) {
                    FadingTextViewLayout.this.currentView.setText(FadingTextViewLayout.this.text);
                    FadingTextViewLayout.this.foregroundView.setVisibility(8);
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                FadingTextViewLayout.this.currentView.setLayerType(2, null);
                FadingTextViewLayout.this.nextView.setLayerType(2, null);
                if (ViewCompat.isAttachedToWindow(FadingTextViewLayout.this.currentView)) {
                    FadingTextViewLayout.this.currentView.buildLayer();
                }
                if (ViewCompat.isAttachedToWindow(FadingTextViewLayout.this.nextView)) {
                    FadingTextViewLayout.this.nextView.buildLayer();
                }
            }
        });
    }

    public void lambda$new$0(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        TextView textView = this.currentView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        textView.setAlpha(cubicBezierInterpolator.getInterpolation(animatedFraction));
        this.nextView.setAlpha(cubicBezierInterpolator.getInterpolation(1.0f - animatedFraction));
    }

    public void setText(CharSequence charSequence) {
        setText(charSequence, true, true);
    }

    public void setText(CharSequence charSequence, boolean z) {
        setText(charSequence, z, true);
    }

    public void setText(CharSequence charSequence, boolean z, boolean z2) {
        int staticCharsCount;
        if (!TextUtils.equals(charSequence, this.currentView.getText())) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            this.text = charSequence;
            if (z) {
                if (z2 && this.foregroundView != null && (staticCharsCount = getStaticCharsCount()) > 0) {
                    CharSequence text = this.currentView.getText();
                    int min = Math.min(staticCharsCount, Math.min(charSequence.length(), text.length()));
                    ArrayList arrayList = new ArrayList();
                    int i = -1;
                    for (int i2 = 0; i2 < min; i2++) {
                        if (charSequence.charAt(i2) == text.charAt(i2)) {
                            if (i >= 0) {
                                arrayList.add(new Point(i, i2));
                                i = -1;
                            }
                        } else if (i == -1) {
                            i = i2;
                        }
                    }
                    if (i != 0) {
                        if (i > 0) {
                            arrayList.add(new Point(i, min));
                        } else {
                            arrayList.add(new Point(min, 0));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        SpannableString spannableString = new SpannableString(charSequence.subSequence(0, min));
                        SpannableString spannableString2 = new SpannableString(text);
                        SpannableString spannableString3 = new SpannableString(charSequence);
                        int size = arrayList.size();
                        int i3 = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            Point point = (Point) arrayList.get(i4);
                            if (point.y > point.x) {
                                spannableString.setSpan(new ForegroundColorSpan(0), point.x, point.y, 17);
                            }
                            if (point.x > i3) {
                                spannableString2.setSpan(new ForegroundColorSpan(0), i3, point.x, 17);
                                spannableString3.setSpan(new ForegroundColorSpan(0), i3, point.x, 17);
                            }
                            i3 = point.y;
                        }
                        this.foregroundView.setVisibility(0);
                        this.foregroundView.setText(spannableString);
                        this.currentView.setText(spannableString2);
                        charSequence = spannableString3;
                    }
                }
                this.nextView.setVisibility(0);
                this.nextView.setText(charSequence);
                showNext();
                return;
            }
            this.currentView.setText(charSequence);
        }
    }

    public CharSequence getText() {
        return this.text;
    }

    public TextView getCurrentView() {
        return this.currentView;
    }

    public TextView getNextView() {
        return this.nextView;
    }

    private void showNext() {
        TextView textView = this.currentView;
        this.currentView = this.nextView;
        this.nextView = textView;
        this.animator.start();
    }

    public void onTextViewCreated(TextView textView) {
        textView.setSingleLine(true);
        textView.setMaxLines(1);
    }
}
