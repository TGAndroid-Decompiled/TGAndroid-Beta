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
public final class vg extends FrameLayout {
    public final int f40817a = 0;
    public boolean f40818b;
    public final View f40819c;
    public final Object d;
    public final Object f40820e;
    public final Object f40821f;

    public vg(Activity activity, boolean z10) {
        super(activity);
        this.f40818b = false;
        ImageView imageView = new ImageView(activity);
        this.f40819c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ma.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        linearLayout.addView(textView, c8.ma.t(-1, -2, 0, 0, 0, z10 ? 64 : 0, 0));
        TextView textView2 = new TextView(activity);
        this.f40820e = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29770y6, null);
        linearLayout.addView(textView2, c8.ma.t(-1, -2, 0, 0, 4, z10 ? 64 : 0, 0));
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        if (z10) {
            Switch r22 = new Switch(activity, null);
            this.f40821f = r22;
            r22.setDrawIconType(1);
            addView(r22, c8.ma.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f40817a) {
            case 1:
                super.dispatchDraw(canvas);
                if (this.f40818b) {
                    canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f29501k0);
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
        switch (this.f40817a) {
            case 0:
                if ((view instanceof org.telegram.ui.ActionBar.m5) && this.f40818b) {
                    org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) view;
                    canvas.save();
                    canvas.scale(0.8f, 0.8f);
                    canvas.translate(-org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                    int color = m5Var.getTextPaint().getColor();
                    m5Var.getTextPaint().setColor(-1);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    m5Var.getTextPaint().setColor(color);
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
        switch (this.f40817a) {
            case 0:
                Drawable drawable = (Drawable) this.f40821f;
                RectF rectF = (RectF) this.d;
                if (this.f40818b) {
                    canvas.save();
                    int L = org.telegram.messenger.g0.L(26.0f);
                    canvas.translate(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - L) / 2.0f);
                    float f10 = L;
                    rectF.set(-org.telegram.messenger.g0.L(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f10);
                    float f11 = f10 / 2.0f;
                    canvas.drawRoundRect(rectF, f11, f11, (Paint) this.f40820e);
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
        switch (this.f40817a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                Switch r02 = (Switch) this.f40821f;
                if (r02 != null) {
                    accessibilityNodeInfo.setClassName("android.widget.Switch");
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(r02.h);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) ((TextView) this.d).getText());
                    sb2.append("\n");
                    sb2.append((Object) ((TextView) this.f40820e).getText());
                    sb2.append("\n");
                    if (r02.h) {
                        i7 = 2131747698;
                    } else {
                        i7 = 2131747700;
                    }
                    sb2.append(org.telegram.messenger.gd.N0(i7, null));
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f40817a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                ((Paint) this.f40820e).setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    public vg(Activity activity) {
        super(activity);
        this.d = new RectF();
        this.f40820e = new Paint(1);
        this.f40818b = false;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(activity);
        this.f40819c = m5Var;
        addView(m5Var, c8.ma.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(2131232237);
        this.f40821f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        c8.ra.a(this);
    }
}
