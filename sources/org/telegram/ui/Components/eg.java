package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class eg extends FrameLayout {
    public final int f33248a = 0;
    public boolean f33249b;
    public final View f33250c;
    public final Object d;
    public final Object f33251e;
    public final Object f33252f;

    public eg(Activity activity, boolean z9) {
        super(activity);
        this.f33249b = false;
        ImageView imageView = new ImageView(activity);
        this.f33250c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        linearLayout.addView(textView, c8.ha.t(-1, -2, 0, 0, 0, z9 ? 64 : 0, 0));
        TextView textView2 = new TextView(activity);
        this.f33251e = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28241y6, null);
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 0, 0, 4, z9 ? 64 : 0, 0));
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        if (z9) {
            Switch r22 = new Switch(activity, null);
            this.f33252f = r22;
            r22.setDrawIconType(1);
            addView(r22, c8.ha.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f33248a) {
            case 1:
                super.dispatchDraw(canvas);
                if (this.f33249b) {
                    canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f27972k0);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f33248a) {
            case 0:
                if ((view instanceof org.telegram.ui.ActionBar.k5) && this.f33249b) {
                    org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) view;
                    canvas.save();
                    canvas.scale(0.8f, 0.8f);
                    canvas.translate(-org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                    int color = k5Var.getTextPaint().getColor();
                    k5Var.getTextPaint().setColor(-1);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    k5Var.getTextPaint().setColor(color);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f33248a) {
            case 0:
                Drawable drawable = (Drawable) this.f33252f;
                RectF rectF = (RectF) this.d;
                if (this.f33249b) {
                    canvas.save();
                    int L = org.telegram.messenger.g0.L(26.0f);
                    canvas.translate(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - L) / 2.0f);
                    float f10 = L;
                    rectF.set(-org.telegram.messenger.g0.L(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f10);
                    float f11 = f10 / 2.0f;
                    canvas.drawRoundRect(rectF, f11, f11, (Paint) this.f33251e);
                    canvas.translate(((getMeasuredWidth() - getPaddingEnd()) - org.telegram.messenger.g0.L(6.0f)) - drawable.getIntrinsicWidth(), org.telegram.messenger.g0.L(5.0f));
                    drawable.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        switch (this.f33248a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                Switch r02 = (Switch) this.f33252f;
                if (r02 != null) {
                    accessibilityNodeInfo.setClassName("android.widget.Switch");
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(r02.h);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) ((TextView) this.d).getText());
                    sb2.append("\n");
                    sb2.append((Object) ((TextView) this.f33251e).getText());
                    sb2.append("\n");
                    if (r02.h) {
                        i7 = 2131747891;
                    } else {
                        i7 = 2131747893;
                    }
                    sb2.append(org.telegram.messenger.hd.M0(i7, null));
                    accessibilityNodeInfo.setText(sb2.toString());
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f33248a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                ((Paint) this.f33251e).setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    public eg(Activity activity) {
        super(activity);
        this.d = new RectF();
        this.f33251e = new Paint(1);
        this.f33249b = false;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.f33250c = k5Var;
        addView(k5Var, c8.ha.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(2131232235);
        this.f33252f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        c8.ka.a(this);
    }
}
