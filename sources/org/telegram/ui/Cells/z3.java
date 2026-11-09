package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.id;
public abstract class z3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.ActionBar.l5 f30969a;
    public org.telegram.ui.ActionBar.l5 f30970b;
    public ImageView f30971c;
    public ImageView d;
    public int f30972e;
    public boolean f30973f;
    public int h;
    public int f30974n;
    public Paint f30975r;

    public final void a(int i7, int i10) {
        org.telegram.ui.ActionBar.l5 l5Var = this.f30969a;
        org.telegram.ui.ActionBar.s6.q(l5Var);
        ImageView imageView = this.f30971c;
        org.telegram.ui.ActionBar.s6.q(imageView);
        l5Var.setTextColor(i10);
        l5Var.setTag(null);
        imageView.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i7, String str, boolean z9) {
        this.f30969a.l(str, false);
        org.telegram.ui.ActionBar.l5 l5Var = this.f30970b;
        l5Var.l(null, false);
        ImageView imageView = this.f30971c;
        imageView.setImageResource(i7);
        imageView.setVisibility(0);
        l5Var.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f30973f = z9;
        setWillNotDraw(!z9);
    }

    public org.telegram.ui.ActionBar.l5 getTextView() {
        return this.f30969a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.l5 getValueTextView() {
        return this.f30970b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        int i7;
        ImageView imageView = this.f30971c;
        if (this.f30973f) {
            float f11 = 20.0f;
            if (id.f23157a0) {
                L = 0.0f;
            } else {
                if (imageView.getVisibility() == 0) {
                    f10 = 68.0f;
                } else {
                    f10 = 20.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
            float f12 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23157a0) {
                if (imageView.getVisibility() == 0) {
                    f11 = 68.0f;
                }
                i7 = org.telegram.messenger.g0.L(f11);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, this.f30975r);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f30969a.getText();
        if (!TextUtils.isEmpty(text)) {
            CharSequence text2 = this.f30970b.getText();
            if (!TextUtils.isEmpty(text2)) {
                accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
                return;
            }
            accessibilityNodeInfo.setText(text);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        int L;
        int measuredWidth;
        int measuredWidth2;
        int i14 = this.f30974n;
        int i15 = this.f30972e;
        org.telegram.ui.ActionBar.l5 l5Var = this.f30969a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.f30971c;
        int i16 = i12 - i10;
        int i17 = i11 - i7;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f30970b;
        int textHeight = (i16 - l5Var2.getTextHeight()) / 2;
        if (id.f23157a0) {
            i13 = org.telegram.messenger.g0.L(i15);
        } else {
            i13 = 0;
        }
        l5Var2.layout(i13, textHeight, l5Var2.getMeasuredWidth() + i13, l5Var2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i16 - l5Var.getTextHeight()) / 2;
        if (id.f23157a0) {
            int measuredWidth3 = getMeasuredWidth() - l5Var.getMeasuredWidth();
            if (imageView2.getVisibility() == 0) {
                i15 = this.h;
            }
            L = measuredWidth3 - org.telegram.messenger.g0.L(i15);
        } else {
            if (imageView2.getVisibility() == 0) {
                f10 = this.h;
            } else {
                f10 = i15;
            }
            L = org.telegram.messenger.g0.L(f10);
        }
        l5Var.layout(L, textHeight2, l5Var.getMeasuredWidth() + L, l5Var.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int L2 = org.telegram.messenger.g0.L(5.0f);
            if (!id.f23157a0) {
                measuredWidth2 = org.telegram.messenger.g0.L(i14);
            } else {
                measuredWidth2 = (i17 - imageView2.getMeasuredWidth()) - org.telegram.messenger.g0.L(i14);
            }
            imageView2.layout(measuredWidth2, L2, imageView2.getMeasuredWidth() + measuredWidth2, imageView2.getMeasuredHeight() + L2);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i16 - imageView.getMeasuredHeight()) / 2;
            if (id.f23157a0) {
                measuredWidth = org.telegram.messenger.g0.L(23.0f);
            } else {
                measuredWidth = (i17 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(23.0f);
            }
            imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(48.0f);
        org.telegram.ui.ActionBar.l5 l5Var = this.f30970b;
        int i11 = this.f30972e;
        l5Var.measure(org.telegram.messenger.camera.q.c(i11, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30969a.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(i11 + 71)) - l5Var.getTextWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        ImageView imageView2 = this.f30971c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f) + (this.f30973f ? 1 : 0));
    }

    public void setOffsetFromImage(int i7) {
        this.h = i7;
    }

    public void setTextColor(int i7) {
        org.telegram.ui.ActionBar.l5 l5Var = this.f30969a;
        org.telegram.ui.ActionBar.s6.q(l5Var);
        l5Var.setTextColor(i7);
    }

    @Override
    public final void updateColors() {
        try {
            this.f30975r.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ug, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
