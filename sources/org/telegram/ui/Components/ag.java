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
public final class ag extends FrameLayout {
    public final int f24391a = 0;
    public boolean f24392b;
    public final View f24393c;
    public final Object d;
    public final Object e;
    public final Object f24394f;

    public ag(Activity activity, boolean z10) {
        super(activity);
        this.f24392b = false;
        ImageView imageView = new ImageView(activity);
        this.f24393c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        linearLayout.addView(textView, w7.b6.t(-1, -2, 0, 0, 0, z10 ? 64 : 0, 0));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21312y6, null);
        linearLayout.addView(textView2, w7.b6.t(-1, -2, 0, 0, 4, z10 ? 64 : 0, 0));
        setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        if (z10) {
            Switch r22 = new Switch(activity, null);
            this.f24394f = r22;
            r22.setDrawIconType(1);
            addView(r22, w7.b6.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f24391a) {
            case 1:
                super.dispatchDraw(canvas);
                if (this.f24392b) {
                    canvas.drawRect(org.telegram.messenger.i0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21053k0);
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
        switch (this.f24391a) {
            case 0:
                if ((view instanceof org.telegram.ui.ActionBar.u5) && this.f24392b) {
                    org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) view;
                    canvas.save();
                    canvas.scale(0.8f, 0.8f);
                    canvas.translate(-org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f));
                    int color = u5Var.getTextPaint().getColor();
                    u5Var.getTextPaint().setColor(-1);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    u5Var.getTextPaint().setColor(color);
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
        switch (this.f24391a) {
            case 0:
                Drawable drawable = (Drawable) this.f24394f;
                RectF rectF = (RectF) this.d;
                if (this.f24392b) {
                    canvas.save();
                    int L = org.telegram.messenger.i0.L(26.0f);
                    canvas.translate(org.telegram.messenger.i0.L(5.0f), (getMeasuredHeight() - L) / 2.0f);
                    float f7 = L;
                    rectF.set(-org.telegram.messenger.i0.L(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f7);
                    float f10 = f7 / 2.0f;
                    canvas.drawRoundRect(rectF, f10, f10, (Paint) this.e);
                    canvas.translate(((getMeasuredWidth() - getPaddingEnd()) - org.telegram.messenger.i0.L(6.0f)) - drawable.getIntrinsicWidth(), org.telegram.messenger.i0.L(5.0f));
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
        int i10;
        switch (this.f24391a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                Switch r02 = (Switch) this.f24394f;
                if (r02 != null) {
                    accessibilityNodeInfo.setClassName("android.widget.Switch");
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(r02.h);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) ((TextView) this.d).getText());
                    sb2.append("\n");
                    sb2.append((Object) ((TextView) this.e).getText());
                    sb2.append("\n");
                    if (r02.h) {
                        i10 = 2131747908;
                    } else {
                        i10 = 2131747910;
                    }
                    sb2.append(org.telegram.messenger.dd.L0(i10, null));
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f24391a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                ((Paint) this.e).setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    public ag(Activity activity) {
        super(activity);
        this.d = new RectF();
        this.e = new Paint(1);
        this.f24392b = false;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(activity);
        this.f24393c = u5Var;
        addView(u5Var, w7.b6.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(2131232234);
        this.f24394f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        w7.e6.a(this);
    }
}
