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
import org.telegram.messenger.cj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.ty;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
public class a8 extends FrameLayout implements gs, rg.c {
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
    public final org.telegram.ui.ActionBar.h6 N;
    public final z7 f30417a;
    public final ug.b1 f30418b;
    public TLRPC.Document f30419c;
    public ty d;
    public Object f30420e;
    public String f30421f;
    public final TextView h;
    public float f30422n;
    public boolean f30423r;
    public long f30424s;
    public boolean f30425w;
    public float f30426x;
    public long f30427y;

    public a8(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        this.f30422n = 1.0f;
        this.F = k10.f24968t0;
        this.I = 1.0f;
        this.N = h6Var;
        this.G = z10;
        z7 z7Var = new z7(this, h6Var);
        this.f30417a = z7Var;
        z7Var.S0 = true;
        z7Var.A1 = true;
        z7Var.E0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false));
        ug.b1 b1Var = new ug.b1(1, context, null);
        this.f30418b = b1Var;
        b1Var.setImageReceiver(z7Var);
        b1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        b1Var.setImageReceiver(z7Var);
        addView(b1Var, c8.ma.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(2131231966);
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f29620q5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(imageView, d02, M, null, h6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.ma.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.K;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(nr.f37960f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = this.f30423r;
        float f10 = this.I;
        z7 z7Var = this.f30417a;
        if (z11 || (((z10 = this.f30425w) && this.f30426x != 0.8f) || (!z10 && this.f30426x != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f30424s;
            this.f30424s = currentTimeMillis;
            if (this.f30423r) {
                long j10 = this.f30427y + j3;
                this.f30427y = j10;
                if (j10 > 1050) {
                    this.f30427y = 1050L;
                }
                float interpolation = (O.getInterpolation(((float) this.f30427y) / 150.0f) * 0.5f) + 0.5f;
                this.f30422n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f30423r = false;
                    this.f30422n = 1.0f;
                }
                z7Var.setAlpha(this.f30422n * f10);
            } else {
                if (this.f30425w) {
                    float f11 = this.f30426x;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (((float) j3) / 400.0f);
                        this.f30426x = f12;
                        if (f12 < 0.8f) {
                            this.f30426x = 0.8f;
                        }
                    }
                }
                float f13 = (((float) j3) / 400.0f) + this.f30426x;
                this.f30426x = f13;
                if (f13 > 1.0f) {
                    this.f30426x = 1.0f;
                }
            }
            viewGroup.invalidate();
        }
        int min = Math.min(org.telegram.messenger.g0.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f14 = min;
        float f15 = f14 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        z7Var.y0(measuredWidth - f15, measuredHeight - f15, f14, f14);
        z7Var.setAlpha(this.f30422n * f10);
        if (this.f30426x != 1.0f) {
            canvas.save();
            float f16 = this.f30426x;
            canvas.scale(f16, f16, measuredWidth, measuredHeight);
            z7Var.h(canvas, null);
            canvas.restore();
            return;
        }
        z7Var.h(canvas, null);
    }

    public final void c(boolean z10) {
        ImageView imageView = this.K;
        if (z10) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(nr.f37960f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(org.telegram.tgnet.TLRPC.Document r29, org.telegram.messenger.ty r30, java.lang.Object r31, java.lang.String r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.a8.d(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ty, java.lang.Object, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25327i5) {
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
        ug.b1 b1Var = this.f30418b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
        int i7 = this.F;
        if (!k10.i(i7).q()) {
            int L = org.telegram.messenger.g0.L(24.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            b1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
            b1Var.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        }
        b1Var.setLocked(!k10.i(i7).q());
        org.telegram.messenger.g0.X3(b1Var, this.J, 0.9f, true, z10);
        invalidate();
    }

    public String getEmoji() {
        return this.f30421f;
    }

    public ImageReceiver getImageView() {
        return this.f30417a;
    }

    public Object getParentObject() {
        return this.f30420e;
    }

    public cj getSendAnimationData() {
        z7 z7Var = this.f30417a;
        if (!z7Var.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        obj.f23321a = z7Var.r() + iArr[0];
        obj.f23322b = z7Var.s() + iArr[1];
        obj.f23323c = z7Var.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f30419c;
    }

    public ty getStickerPath() {
        ty tyVar = this.d;
        if (tyVar != null && tyVar.f27130c) {
            return tyVar;
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
        z7 z7Var = this.f30417a;
        if (z10) {
            z7Var.K0 = true;
            z7Var.H0((View) getParent());
        } else {
            z7Var.H0(this);
        }
        z7Var.P();
        ls.f(this.F).c(this, ls.f25327i5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30417a.R();
        ls.f(this.F).n(this, ls.f25327i5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String N0 = hd.N0(2131753933, null);
        if (this.f30419c != null) {
            int i7 = 0;
            while (true) {
                if (i7 >= this.f30419c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f30419c.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(org.telegram.messenger.j6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        N0 = p5.c.m(documentAttribute.alt, " ", N0, new StringBuilder());
                    }
                } else {
                    i7++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(N0);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z10) {
        this.E = z10;
    }

    public void setScaled(boolean z10) {
        this.f30425w = z10;
        this.f30424s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(ty tyVar) {
        boolean z10;
        String str = tyVar.f27129b;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d(null, tyVar, null, str, z10, false);
    }
}
