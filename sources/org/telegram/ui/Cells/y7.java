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
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.ry;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
public class y7 extends FrameLayout implements cs, sg.c {
    public static final AccelerateInterpolator O = new AccelerateInterpolator(0.5f);
    public boolean E;
    public final int F;
    public final boolean G;
    public boolean H;
    public final float I;
    public boolean J;
    public final ImageView K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.e6 N;
    public final x7 f30992a;
    public final vg.y0 f30993b;
    public TLRPC.Document f30994c;
    public ry d;
    public Object f30995e;
    public String f30996f;
    public final TextView h;
    public float f30997n;
    public boolean f30998r;
    public long f30999s;
    public boolean f31000w;
    public float f31001x;
    public long f31002y;

    public y7(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f30997n = 1.0f;
        this.F = h10.f22829t0;
        this.I = 1.0f;
        this.N = e6Var;
        this.G = z10;
        x7 x7Var = new x7(this, e6Var);
        this.f30992a = x7Var;
        x7Var.S0 = true;
        x7Var.A1 = true;
        x7Var.E0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        vg.y0 y0Var = new vg.y0(1, context, null);
        this.f30993b = y0Var;
        y0Var.setImageReceiver(x7Var);
        y0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        y0Var.setImageReceiver(x7Var);
        addView(y0Var, mf.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(2131231965);
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f28120q5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(imageView, d02, N, null, e6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, mf.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.K;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(xq.f40452f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = this.f30998r;
        float f10 = this.I;
        x7 x7Var = this.f30992a;
        if (z11 || (((z10 = this.f31000w) && this.f31001x != 0.8f) || (!z10 && this.f31001x != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f30999s;
            this.f30999s = currentTimeMillis;
            if (this.f30998r) {
                long j11 = this.f31002y + j10;
                this.f31002y = j11;
                if (j11 > 1050) {
                    this.f31002y = 1050L;
                }
                float interpolation = (O.getInterpolation(((float) this.f31002y) / 150.0f) * 0.5f) + 0.5f;
                this.f30997n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f30998r = false;
                    this.f30997n = 1.0f;
                }
                x7Var.setAlpha(this.f30997n * f10);
            } else {
                if (this.f31000w) {
                    float f11 = this.f31001x;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (((float) j10) / 400.0f);
                        this.f31001x = f12;
                        if (f12 < 0.8f) {
                            this.f31001x = 0.8f;
                        }
                    }
                }
                float f13 = (((float) j10) / 400.0f) + this.f31001x;
                this.f31001x = f13;
                if (f13 > 1.0f) {
                    this.f31001x = 1.0f;
                }
            }
            viewGroup.invalidate();
        }
        int min = Math.min(org.telegram.messenger.g0.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f14 = min;
        float f15 = f14 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        x7Var.y0(measuredWidth - f15, measuredHeight - f15, f14, f14);
        x7Var.setAlpha(this.f30997n * f10);
        if (this.f31001x != 1.0f) {
            canvas.save();
            float f16 = this.f31001x;
            canvas.scale(f16, f16, measuredWidth, measuredHeight);
            x7Var.h(canvas, null);
            canvas.restore();
            return;
        }
        x7Var.h(canvas, null);
    }

    public final void c(boolean z10) {
        ImageView imageView = this.K;
        if (z10) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(xq.f40452f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(org.telegram.tgnet.TLRPC.Document r29, org.telegram.messenger.ry r30, java.lang.Object r31, java.lang.String r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.y7.d(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ry, java.lang.Object, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23230f5) {
            e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.M) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10) {
        if (this.H) {
            this.J = true;
        } else {
            this.J = false;
        }
        vg.y0 y0Var = this.f30993b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y0Var.getLayoutParams();
        int i3 = this.F;
        if (!h10.i(i3).q()) {
            int L = org.telegram.messenger.g0.L(24.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            y0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
            y0Var.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        }
        y0Var.setLocked(!h10.i(i3).q());
        org.telegram.messenger.g0.Z3(y0Var, this.J, 0.9f, true, z10);
        invalidate();
    }

    public String getEmoji() {
        return this.f30996f;
    }

    public ImageReceiver getImageView() {
        return this.f30992a;
    }

    public Object getParentObject() {
        return this.f30995e;
    }

    public vi getSendAnimationData() {
        x7 x7Var = this.f30992a;
        if (!x7Var.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        obj.f25882a = x7Var.r() + iArr[0];
        obj.f25883b = x7Var.s() + iArr[1];
        obj.f25884c = x7Var.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f30994c;
    }

    public ry getStickerPath() {
        ry ryVar = this.d;
        if (ryVar != null && ryVar.f25251c) {
            return ryVar;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (this.M && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.M;
        x7 x7Var = this.f30992a;
        if (z10) {
            x7Var.K0 = true;
            x7Var.H0((View) getParent());
        } else {
            x7Var.H0(this);
        }
        x7Var.P();
        hs.f(this.F).c(this, hs.f23230f5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30992a.R();
        hs.f(this.F).n(this, hs.f23230f5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = bd.M0(2131753936, null);
        if (this.f30994c != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f30994c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f30994c.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(org.telegram.messenger.i6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = f1.r(documentAttribute.alt, " ", M0, new StringBuilder());
                    }
                } else {
                    i3++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(M0);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z10) {
        this.E = z10;
    }

    public void setScaled(boolean z10) {
        this.f31000w = z10;
        this.f30999s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(ry ryVar) {
        boolean z10;
        String str = ryVar.f25250b;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d(null, ryVar, null, str, z10, false);
    }
}
