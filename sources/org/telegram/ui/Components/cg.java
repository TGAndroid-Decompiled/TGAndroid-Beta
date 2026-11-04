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
public final class cg extends FrameLayout {
    public final int f32700a = 0;
    public boolean f32701b;
    public final View f32702c;
    public final Object d;
    public final Object f32703e;
    public final Object f32704f;

    public cg(Activity activity, boolean z10) {
        super(activity);
        this.f32701b = false;
        ImageView imageView = new ImageView(activity);
        this.f32702c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, b8.mf.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        linearLayout.addView(textView, b8.mf.t(-1, -2, 0, 0, 0, z10 ? 64 : 0, 0));
        TextView textView2 = new TextView(activity);
        this.f32703e = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28273y6, null);
        linearLayout.addView(textView2, b8.mf.t(-1, -2, 0, 0, 4, z10 ? 64 : 0, 0));
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        if (z10) {
            Switch r22 = new Switch(activity, null);
            this.f32704f = r22;
            r22.setDrawIconType(1);
            addView(r22, b8.mf.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32700a) {
            case 1:
                super.dispatchDraw(canvas);
                if (this.f32701b) {
                    canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f32700a) {
            case 0:
                if ((view instanceof org.telegram.ui.ActionBar.k5) && this.f32701b) {
                    org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) view;
                    canvas.save();
                    canvas.scale(0.8f, 0.8f);
                    canvas.translate(-org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                    int color = k5Var.getTextPaint().getColor();
                    k5Var.getTextPaint().setColor(-1);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    k5Var.getTextPaint().setColor(color);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f32700a) {
            case 0:
                Drawable drawable = (Drawable) this.f32704f;
                RectF rectF = (RectF) this.d;
                if (this.f32701b) {
                    canvas.save();
                    int L = org.telegram.messenger.g0.L(26.0f);
                    canvas.translate(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - L) / 2.0f);
                    float f10 = L;
                    rectF.set(-org.telegram.messenger.g0.L(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f10);
                    float f11 = f10 / 2.0f;
                    canvas.drawRoundRect(rectF, f11, f11, (Paint) this.f32703e);
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
        int i3;
        switch (this.f32700a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                Switch r02 = (Switch) this.f32704f;
                if (r02 != null) {
                    accessibilityNodeInfo.setClassName("android.widget.Switch");
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(r02.h);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) ((TextView) this.d).getText());
                    sb2.append("\n");
                    sb2.append((Object) ((TextView) this.f32703e).getText());
                    sb2.append("\n");
                    if (r02.h) {
                        i3 = 2131747900;
                    } else {
                        i3 = 2131747902;
                    }
                    sb2.append(org.telegram.messenger.bd.M0(i3, null));
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
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f32700a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                ((Paint) this.f32703e).setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    public cg(Activity activity) {
        super(activity);
        this.d = new RectF();
        this.f32703e = new Paint(1);
        this.f32701b = false;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.f32702c = k5Var;
        addView(k5Var, b8.mf.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(2131232235);
        this.f32704f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        b8.pf.a(this);
    }
}
