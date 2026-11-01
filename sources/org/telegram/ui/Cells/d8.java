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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.gj;
import org.telegram.messenger.kz;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
public class d8 extends FrameLayout implements vs, hg.d {
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
    public final org.telegram.ui.ActionBar.p6 M;
    public final c8 f21819a;
    public final kg.l1 f21820b;
    public TLRPC.Document f21821c;
    public kz d;
    public Object e;
    public String f21822f;
    public final TextView h;
    public float f21823n;
    public boolean f21824r;
    public long f21825s;
    public boolean f21826w;
    public float f21827x;
    public long f21828y;

    public d8(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.f21823n = 1.0f;
        this.E = e20.f15506s0;
        this.H = 1.0f;
        this.M = p6Var;
        this.F = z10;
        c8 c8Var = new c8(this, p6Var);
        this.f21819a = c8Var;
        c8Var.R0 = true;
        c8Var.f14425z1 = true;
        c8Var.E0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
        kg.l1 l1Var = new kg.l1(1, context, null);
        this.f21820b = l1Var;
        l1Var.setImageReceiver(c8Var);
        l1Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        l1Var.setImageReceiver(c8Var);
        addView(l1Var, w7.b6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setImageResource(2131231964);
        imageView.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        int L = org.telegram.messenger.i0.L(12.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21170q5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(imageView, d02, N2, null, p6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.b6.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.J;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(gr.f26523f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = this.f21824r;
        float f7 = this.H;
        c8 c8Var = this.f21819a;
        if (z11 || (((z10 = this.f21826w) && this.f21827x != 0.8f) || (!z10 && this.f21827x != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f21825s;
            this.f21825s = currentTimeMillis;
            if (this.f21824r) {
                long j11 = this.f21828y + j10;
                this.f21828y = j11;
                if (j11 > 1050) {
                    this.f21828y = 1050L;
                }
                float interpolation = (N.getInterpolation(((float) this.f21828y) / 150.0f) * 0.5f) + 0.5f;
                this.f21823n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f21824r = false;
                    this.f21823n = 1.0f;
                }
                c8Var.setAlpha(this.f21823n * f7);
            } else {
                if (this.f21826w) {
                    float f10 = this.f21827x;
                    if (f10 != 0.8f) {
                        float f11 = f10 - (((float) j10) / 400.0f);
                        this.f21827x = f11;
                        if (f11 < 0.8f) {
                            this.f21827x = 0.8f;
                        }
                    }
                }
                float f12 = (((float) j10) / 400.0f) + this.f21827x;
                this.f21827x = f12;
                if (f12 > 1.0f) {
                    this.f21827x = 1.0f;
                }
            }
            viewGroup.invalidate();
        }
        int min = Math.min(org.telegram.messenger.i0.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f13 = min;
        float f14 = f13 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        c8Var.y0(measuredWidth - f14, measuredHeight - f14, f13, f13);
        c8Var.setAlpha(this.f21823n * f7);
        if (this.f21827x != 1.0f) {
            canvas.save();
            float f15 = this.f21827x;
            canvas.scale(f15, f15, measuredWidth, measuredHeight);
            c8Var.h(canvas, null);
            canvas.restore();
            return;
        }
        c8Var.h(canvas, null);
    }

    public final void c(boolean z10) {
        ImageView imageView = this.J;
        if (z10) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(gr.f26523f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(org.telegram.tgnet.TLRPC.Document r29, org.telegram.messenger.kz r30, java.lang.Object r31, java.lang.String r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d8.d(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.kz, java.lang.Object, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14709f5) {
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

    public final void e(boolean z10) {
        if (this.G) {
            this.I = true;
        } else {
            this.I = false;
        }
        kg.l1 l1Var = this.f21820b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l1Var.getLayoutParams();
        int i10 = this.E;
        if (!e20.i(i10).q()) {
            int L = org.telegram.messenger.i0.L(24.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = org.telegram.messenger.i0.L(8.0f);
            l1Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        } else {
            int L2 = org.telegram.messenger.i0.L(16.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = org.telegram.messenger.i0.L(8.0f);
            layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
            l1Var.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
        }
        l1Var.setLocked(!e20.i(i10).q());
        org.telegram.messenger.i0.Y3(l1Var, this.I, 0.9f, true, z10);
        invalidate();
    }

    public String getEmoji() {
        return this.f21822f;
    }

    public ImageReceiver getImageView() {
        return this.f21819a;
    }

    public Object getParentObject() {
        return this.e;
    }

    public gj getSendAnimationData() {
        c8 c8Var = this.f21819a;
        if (!c8Var.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        obj.f15918a = c8Var.r() + iArr[0];
        obj.f15919b = c8Var.s() + iArr[1];
        obj.f15920c = c8Var.M0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f21821c;
    }

    public kz getStickerPath() {
        kz kzVar = this.d;
        if (kzVar != null && kzVar.f16848c) {
            return kzVar;
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
        boolean z10 = this.L;
        c8 c8Var = this.f21819a;
        if (z10) {
            c8Var.J0 = true;
            c8Var.H0((View) getParent());
        } else {
            c8Var.H0(this);
        }
        c8Var.P();
        at.f(this.E).c(this, at.f14709f5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21819a.R();
        at.f(this.E).n(this, at.f14709f5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String L0 = dd.L0(2131753936, null);
        if (this.f21821c != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f21821c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f21821c.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(org.telegram.messenger.k6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        L0 = a1.g.o(documentAttribute.alt, " ", L0, new StringBuilder());
                    }
                } else {
                    i10++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(L0);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z10) {
        this.D = z10;
    }

    public void setScaled(boolean z10) {
        this.f21826w = z10;
        this.f21825s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(kz kzVar) {
        boolean z10;
        String str = kzVar.f16847b;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d(null, kzVar, null, str, z10, false);
    }
}
