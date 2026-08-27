package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class zz extends FrameLayout {

    public final int f35410a = 0;

    public boolean f35411b;

    public final Object f35412c;
    public Object d;

    public final KeyEvent.Callback f35413e;

    public zz(b00 b00Var, Activity activity) {
        super(activity);
        this.f35413e = b00Var;
        this.f35412c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((k70) this.f35413e).A = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(er.f28123g);
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new sz(this, 3));
        animatorSet.start();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float fMin;
        int iMin;
        boolean z10;
        Boolean bool;
        boolean z11;
        boolean z12;
        switch (this.f35410a) {
            case 0:
                RectF rectF = (RectF) this.f35412c;
                b00 b00Var = (b00) this.f35413e;
                int iDp = (b00Var.h - ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop) - AndroidUtilities.dp(8.0f);
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int i10 = iDp + AndroidUtilities.statusBarHeight;
                if (this.f35411b) {
                    int i11 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop + i10;
                    int i12 = AndroidUtilities.statusBarHeight;
                    int i13 = i12 * 2;
                    if (i11 < i13) {
                        int iMin2 = Math.min(i12, (i13 - i10) - ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop);
                        i10 -= iMin2;
                        fMin = 1.0f - Math.min(1.0f, (iMin2 * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        fMin = 1.0f;
                    }
                    int i14 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop + i10;
                    int i15 = AndroidUtilities.statusBarHeight;
                    iMin = i14 < i15 ? Math.min(i15, (i15 - i10) - ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop) : 0;
                    ((org.telegram.ui.ActionBar.e3) b00Var).shadowDrawable.setBounds(0, i10, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.ActionBar.e3) b00Var).shadowDrawable.draw(canvas);
                    if (fMin != 1.0f) {
                        org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                        rectF.set(((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop + i10, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop + i10);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, org.telegram.ui.ActionBar.g6.f23333t0);
                    }
                    if (iMin > 0) {
                        org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                        canvas.drawRect(((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f23333t0);
                    }
                    if (iMin > AndroidUtilities.statusBarHeight / 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bool = (Boolean) this.d;
                    if (bool != null || bool.booleanValue() != z10) {
                        if (AndroidUtilities.computePerceivedBrightness(b00Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(b00Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f;
                        this.d = Boolean.valueOf(z10);
                        if (!z10) {
                            z11 = z12;
                        }
                        AndroidUtilities.setLightStatusBar(b00Var.getWindow(), z11);
                    }
                } else {
                    fMin = 1.0f;
                }
                ((org.telegram.ui.ActionBar.e3) b00Var).shadowDrawable.setBounds(0, i10, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.ActionBar.e3) b00Var).shadowDrawable.draw(canvas);
                if (fMin != 1.0f) {
                    org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                    rectF.set(((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop + i10, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, org.telegram.ui.ActionBar.g6.f23333t0);
                }
                if (iMin > 0) {
                    org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                    canvas.drawRect(((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f23333t0);
                }
                if (iMin > AndroidUtilities.statusBarHeight / 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bool = (Boolean) this.d;
                if (bool != null) {
                }
                if (AndroidUtilities.computePerceivedBrightness(b00Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(b00Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f) {
                }
                this.d = Boolean.valueOf(z10);
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(b00Var.getWindow(), z11);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f35410a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f35410a) {
            case 0:
                b00 b00Var = (b00) this.f35413e;
                if (motionEvent.getAction() != 0 || b00Var.h == 0 || motionEvent.getY() >= b00Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                b00Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f35410a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                b00.G((b00) this.f35413e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f35410a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                b00 b00Var = (b00) this.f35413e;
                hh.f1 f1Var = b00Var.f26865b;
                b00Var.f26869n = true;
                setPadding(((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft, 0);
                b00Var.f26869n = false;
                int iH = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop + (b00Var.f26866c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f) + AndroidUtilities.statusBarHeight;
                int i12 = size / 5;
                int i13 = ((double) iH) < ((double) i12) * 3.2d ? 0 : i12 * 2;
                if (i13 != 0 && iH < size) {
                    i13 -= size - iH;
                }
                if (i13 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop;
                }
                if (f1Var.getPaddingTop() != i13) {
                    b00Var.f26869n = true;
                    f1Var.setPadding(AndroidUtilities.dp(10.0f), i13, AndroidUtilities.dp(10.0f), 0);
                    b00Var.f26869n = false;
                }
                this.f35411b = iH >= size;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(iH, size), 1073741824));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f35411b ? 80.0f : 50.0f), 1073741824));
                break;
            default:
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.f35412c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f35411b = true;
                h5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                h5Var.setVisibility(0);
                h5Var.getLayoutParams().width = getMeasuredWidth();
                this.f35411b = false;
                ((org.telegram.ui.y70) this.f35413e).f();
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35410a) {
            case 0:
                return !((b00) this.f35413e).isDismissed() && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f35410a) {
            case 0:
                if (!((b00) this.f35413e).f26869n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 1:
            default:
                super.requestLayout();
                break;
            case 2:
                if (!this.f35411b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    public zz(k70 k70Var, Context context, boolean z10) {
        super(context);
        this.f35413e = k70Var;
        this.d = new TextView[2];
        this.f35411b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f35412c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        }
        addView(view, h7.z5.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f35411b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f35411b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], h7.z5.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public zz(org.telegram.ui.y70 y70Var, Context context) {
        super(context);
        this.f35413e = y70Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f35412c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        addView(h5Var, h7.z5.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        b9 b9Var = new b9(context, false);
        this.d = b9Var;
        b9Var.f27049a.f26662a = true;
        b9Var.setStyle(11);
        b9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(b9Var, h7.z5.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 0, 4));
    }
}
