package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ej;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
public class z7 extends FrameLayout implements ls, rg.c {
    public static final AccelerateInterpolator N = new AccelerateInterpolator(0.5f);
    public boolean D;
    public final int E;
    public final boolean F;
    public boolean G;
    public final float H;
    public boolean I;
    public final ImageView J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.f6 M;
    public final y7 f30967a;
    public final ug.z0 f30968b;
    public TLRPC.Document f30969c;
    public zy d;
    public Object f30970e;
    public String f30971f;
    public final TextView h;
    public float f30972n;
    public boolean f30973r;
    public long f30974s;
    public boolean f30975w;
    public float f30976x;
    public long f30977y;

    public z7(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.f30972n = 1.0f;
        this.E = p10.f24459s0;
        this.H = 1.0f;
        this.M = f6Var;
        this.F = z9;
        y7 y7Var = new y7(this, f6Var);
        this.f30967a = y7Var;
        y7Var.R0 = true;
        y7Var.f21233z1 = true;
        y7Var.E0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        ug.z0 z0Var = new ug.z0(1, context, null);
        this.f30968b = z0Var;
        z0Var.setImageReceiver(y7Var);
        z0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        z0Var.setImageReceiver(y7Var);
        addView(z0Var, c8.ha.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setImageResource(2131231965);
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.k6.f28087q5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i7);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(imageView, d02, N2, null, f6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.ha.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z9) {
        ImageView imageView = this.J;
        if (z9) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(xq.f40329f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z9;
        boolean z10 = this.f30973r;
        float f10 = this.H;
        y7 y7Var = this.f30967a;
        if (z10 || (((z9 = this.f30975w) && this.f30976x != 0.8f) || (!z9 && this.f30976x != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f30974s;
            this.f30974s = currentTimeMillis;
            if (this.f30973r) {
                long j10 = this.f30977y + j3;
                this.f30977y = j10;
                if (j10 > 1050) {
                    this.f30977y = 1050L;
                }
                float interpolation = (N.getInterpolation(((float) this.f30977y) / 150.0f) * 0.5f) + 0.5f;
                this.f30972n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f30973r = false;
                    this.f30972n = 1.0f;
                }
                y7Var.setAlpha(this.f30972n * f10);
            } else {
                if (this.f30975w) {
                    float f11 = this.f30976x;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (((float) j3) / 400.0f);
                        this.f30976x = f12;
                        if (f12 < 0.8f) {
                            this.f30976x = 0.8f;
                        }
                    }
                }
                float f13 = (((float) j3) / 400.0f) + this.f30976x;
                this.f30976x = f13;
                if (f13 > 1.0f) {
                    this.f30976x = 1.0f;
                }
            }
            viewGroup.invalidate();
        }
        int min = Math.min(org.telegram.messenger.g0.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f14 = min;
        float f15 = f14 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        y7Var.y0(measuredWidth - f15, measuredHeight - f15, f14, f14);
        y7Var.setAlpha(this.f30972n * f10);
        if (this.f30976x != 1.0f) {
            canvas.save();
            float f16 = this.f30976x;
            canvas.scale(f16, f16, measuredWidth, measuredHeight);
            y7Var.h(canvas, null);
            canvas.restore();
            return;
        }
        y7Var.h(canvas, null);
    }

    public final void c(boolean z9) {
        ImageView imageView = this.J;
        if (z9) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(xq.f40329f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(org.telegram.tgnet.TLRPC.Document r29, org.telegram.messenger.zy r30, java.lang.Object r31, java.lang.String r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z7.d(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.zy, java.lang.Object, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24984f5) {
            e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.L) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z9) {
        if (this.G) {
            this.I = true;
        } else {
            this.I = false;
        }
        ug.z0 z0Var = this.f30968b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z0Var.getLayoutParams();
        int i7 = this.E;
        if (!p10.i(i7).q()) {
            int L = org.telegram.messenger.g0.L(24.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            z0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
            z0Var.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        }
        z0Var.setLocked(!p10.i(i7).q());
        org.telegram.messenger.g0.Z3(z0Var, this.I, 0.9f, true, z9);
        invalidate();
    }

    public String getEmoji() {
        return this.f30971f;
    }

    public ImageReceiver getImageView() {
        return this.f30967a;
    }

    public Object getParentObject() {
        return this.f30970e;
    }

    public ej getSendAnimationData() {
        y7 y7Var = this.f30967a;
        if (!y7Var.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        obj.f22213a = y7Var.r() + iArr[0];
        obj.f22214b = y7Var.s() + iArr[1];
        obj.f22215c = y7Var.M0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f30969c;
    }

    public zy getStickerPath() {
        zy zyVar = this.d;
        if (zyVar != null && zyVar.f26940c) {
            return zyVar;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (this.L && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z9 = this.L;
        y7 y7Var = this.f30967a;
        if (z9) {
            y7Var.J0 = true;
            y7Var.H0((View) getParent());
        } else {
            y7Var.H0(this);
        }
        y7Var.P();
        qs.f(this.E).c(this, qs.f24984f5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30967a.R();
        qs.f(this.E).n(this, qs.f24984f5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = hd.M0(2131753936, null);
        if (this.f30969c != null) {
            int i7 = 0;
            while (true) {
                if (i7 >= this.f30969c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f30969c.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(org.telegram.messenger.i6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = f1.n(documentAttribute.alt, " ", M0, new StringBuilder());
                    }
                } else {
                    i7++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(M0);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z9) {
        this.D = z9;
    }

    public void setScaled(boolean z9) {
        this.f30975w = z9;
        this.f30974s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(zy zyVar) {
        boolean z9;
        String str = zyVar.f26939b;
        if (str != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        d(null, zyVar, null, str, z9, false);
    }
}
