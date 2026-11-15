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
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.xy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
public class y7 extends FrameLayout implements is, rg.c {
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
    public final x7 f32067a;
    public final ug.a1 f32068b;
    public TLRPC.Document f32069c;
    public xy d;
    public Object f32070e;
    public String f32071f;
    public final TextView h;
    public float f32072n;
    public boolean f32073r;
    public long f32074s;
    public boolean f32075w;
    public float f32076x;
    public long f32077y;

    public y7(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f32072n = 1.0f;
        this.F = m10.f24940t0;
        this.I = 1.0f;
        this.N = e6Var;
        this.G = z10;
        x7 x7Var = new x7(this, e6Var);
        this.f32067a = x7Var;
        x7Var.S0 = true;
        x7Var.A1 = true;
        x7Var.E0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false));
        ug.a1 a1Var = new ug.a1(1, context, null);
        this.f32068b = a1Var;
        a1Var.setImageReceiver(x7Var);
        a1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        a1Var.setImageReceiver(x7Var);
        addView(a1Var, c8.ja.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(2131231965);
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f29088q5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(imageView, d02, M, null, e6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.ja.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.K;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(er.f34419f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = this.f32073r;
        float f10 = this.I;
        x7 x7Var = this.f32067a;
        if (z11 || (((z10 = this.f32075w) && this.f32076x != 0.8f) || (!z10 && this.f32076x != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32074s;
            this.f32074s = currentTimeMillis;
            if (this.f32073r) {
                long j10 = this.f32077y + j3;
                this.f32077y = j10;
                if (j10 > 1050) {
                    this.f32077y = 1050L;
                }
                float interpolation = (O.getInterpolation(((float) this.f32077y) / 150.0f) * 0.5f) + 0.5f;
                this.f32072n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f32073r = false;
                    this.f32072n = 1.0f;
                }
                x7Var.setAlpha(this.f32072n * f10);
            } else {
                if (this.f32075w) {
                    float f11 = this.f32076x;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (((float) j3) / 400.0f);
                        this.f32076x = f12;
                        if (f12 < 0.8f) {
                            this.f32076x = 0.8f;
                        }
                    }
                }
                float f13 = (((float) j3) / 400.0f) + this.f32076x;
                this.f32076x = f13;
                if (f13 > 1.0f) {
                    this.f32076x = 1.0f;
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
        x7Var.setAlpha(this.f32072n * f10);
        if (this.f32076x != 1.0f) {
            canvas.save();
            float f16 = this.f32076x;
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
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(er.f34419f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(org.telegram.tgnet.TLRPC.Document r29, org.telegram.messenger.xy r30, java.lang.Object r31, java.lang.String r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.y7.d(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.xy, java.lang.Object, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25498f5) {
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
        ug.a1 a1Var = this.f32068b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a1Var.getLayoutParams();
        int i7 = this.F;
        if (!m10.i(i7).q()) {
            int L = org.telegram.messenger.g0.L(24.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            a1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
            a1Var.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        }
        a1Var.setLocked(!m10.i(i7).q());
        org.telegram.messenger.g0.Y3(a1Var, this.J, 0.9f, true, z10);
        invalidate();
    }

    public String getEmoji() {
        return this.f32071f;
    }

    public ImageReceiver getImageView() {
        return this.f32067a;
    }

    public Object getParentObject() {
        return this.f32070e;
    }

    public cj getSendAnimationData() {
        x7 x7Var = this.f32067a;
        if (!x7Var.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        obj.f22889a = x7Var.r() + iArr[0];
        obj.f22890b = x7Var.s() + iArr[1];
        obj.f22891c = x7Var.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f32069c;
    }

    public xy getStickerPath() {
        xy xyVar = this.d;
        if (xyVar != null && xyVar.f27626c) {
            return xyVar;
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
        x7 x7Var = this.f32067a;
        if (z10) {
            x7Var.K0 = true;
            x7Var.H0((View) getParent());
        } else {
            x7Var.H0(this);
        }
        x7Var.P();
        ns.f(this.F).c(this, ns.f25498f5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32067a.R();
        ns.f(this.F).n(this, ns.f25498f5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = hd.M0(2131753936, null);
        if (this.f32069c != null) {
            int i7 = 0;
            while (true) {
                if (i7 >= this.f32069c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f32069c.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(org.telegram.messenger.j6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = y0.m(documentAttribute.alt, " ", M0, new StringBuilder());
                    }
                } else {
                    i7++;
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
        this.f32075w = z10;
        this.f32074s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(xy xyVar) {
        boolean z10;
        String str = xyVar.f27625b;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d(null, xyVar, null, str, z10, false);
    }
}
