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
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
public abstract class b4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.ActionBar.u5 f21718a;
    public org.telegram.ui.ActionBar.u5 f21719b;
    public ImageView f21720c;
    public ImageView d;
    public int e;
    public boolean f21721f;
    public int h;
    public int f21722n;
    public Paint f21723r;

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.u5 u5Var = this.f21718a;
        org.telegram.ui.ActionBar.a7.r(u5Var);
        ImageView imageView = this.f21720c;
        org.telegram.ui.ActionBar.a7.r(imageView);
        u5Var.setTextColor(i11);
        u5Var.setTag(null);
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i10, String str, boolean z10) {
        this.f21718a.l(str, false);
        org.telegram.ui.ActionBar.u5 u5Var = this.f21719b;
        u5Var.l(null, false);
        ImageView imageView = this.f21720c;
        imageView.setImageResource(i10);
        imageView.setVisibility(0);
        u5Var.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        this.f21721f = z10;
        setWillNotDraw(!z10);
    }

    public org.telegram.ui.ActionBar.u5 getTextView() {
        return this.f21718a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.u5 getValueTextView() {
        return this.f21719b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float L;
        int i10;
        ImageView imageView = this.f21720c;
        if (this.f21721f) {
            float f10 = 20.0f;
            if (cd.X) {
                L = 0.0f;
            } else {
                if (imageView.getVisibility() == 0) {
                    f7 = 68.0f;
                } else {
                    f7 = 20.0f;
                }
                L = org.telegram.messenger.i0.L(f7);
            }
            float f11 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                if (imageView.getVisibility() == 0) {
                    f10 = 68.0f;
                }
                i10 = org.telegram.messenger.i0.L(f10);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, this.f21723r);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f21718a.getText();
        if (!TextUtils.isEmpty(text)) {
            CharSequence text2 = this.f21719b.getText();
            if (!TextUtils.isEmpty(text2)) {
                accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
                return;
            }
            accessibilityNodeInfo.setText(text);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        int L;
        int measuredWidth;
        int measuredWidth2;
        int i15 = this.f21722n;
        int i16 = this.e;
        org.telegram.ui.ActionBar.u5 u5Var = this.f21718a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.f21720c;
        int i17 = i13 - i11;
        int i18 = i12 - i10;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f21719b;
        int textHeight = (i17 - u5Var2.getTextHeight()) / 2;
        if (cd.X) {
            i14 = org.telegram.messenger.i0.L(i16);
        } else {
            i14 = 0;
        }
        u5Var2.layout(i14, textHeight, u5Var2.getMeasuredWidth() + i14, u5Var2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i17 - u5Var.getTextHeight()) / 2;
        if (cd.X) {
            int measuredWidth3 = getMeasuredWidth() - u5Var.getMeasuredWidth();
            if (imageView2.getVisibility() == 0) {
                i16 = this.h;
            }
            L = measuredWidth3 - org.telegram.messenger.i0.L(i16);
        } else {
            if (imageView2.getVisibility() == 0) {
                f7 = this.h;
            } else {
                f7 = i16;
            }
            L = org.telegram.messenger.i0.L(f7);
        }
        u5Var.layout(L, textHeight2, u5Var.getMeasuredWidth() + L, u5Var.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int L2 = org.telegram.messenger.i0.L(5.0f);
            if (!cd.X) {
                measuredWidth2 = org.telegram.messenger.i0.L(i15);
            } else {
                measuredWidth2 = (i18 - imageView2.getMeasuredWidth()) - org.telegram.messenger.i0.L(i15);
            }
            imageView2.layout(measuredWidth2, L2, imageView2.getMeasuredWidth() + measuredWidth2, imageView2.getMeasuredHeight() + L2);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i17 - imageView.getMeasuredHeight()) / 2;
            if (cd.X) {
                measuredWidth = org.telegram.messenger.i0.L(23.0f);
            } else {
                measuredWidth = (i18 - imageView.getMeasuredWidth()) - org.telegram.messenger.i0.L(23.0f);
            }
            imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(48.0f);
        org.telegram.ui.ActionBar.u5 u5Var = this.f21719b;
        int i12 = this.e;
        u5Var.measure(z20.c(i12, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        this.f21718a.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.i0.L(i12 + 71)) - u5Var.getTextWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        ImageView imageView2 = this.f21720c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, org.telegram.messenger.i0.L(50.0f) + (this.f21721f ? 1 : 0));
    }

    public void setOffsetFromImage(int i10) {
        this.h = i10;
    }

    public void setTextColor(int i10) {
        org.telegram.ui.ActionBar.u5 u5Var = this.f21718a;
        org.telegram.ui.ActionBar.a7.r(u5Var);
        u5Var.setTextColor(i10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f21723r.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
