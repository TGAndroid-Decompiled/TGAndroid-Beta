package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class vu extends ViewGroup implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public Boolean F;
    public float G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public int K;
    public int L;
    public int M;
    public float N;
    public final zu O;
    public Long f39795a;
    public boolean f39796b;
    public final boolean f39797c;
    public final k9 d;
    public final ch0 f39798e;
    public final vg.y0 f39799f;
    public final boolean h;
    public final boolean f39800n;
    public Long f39801r;
    public TLRPC.Document f39802s;
    public sw f39803w;
    public g5 f39804x;
    public boolean f39805y;

    public vu(zu zuVar, Context context, int i3) {
        super(context);
        this.O = zuVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.f39800n = false;
        setBackground(org.telegram.ui.ActionBar.k6.O(zuVar.k(), 0, 0));
        ch0 ch0Var = new ch0(i3, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.f39798e = ch0Var;
        ch0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        ch0Var.R(this);
        ch0Var.J(true);
        ch0Var.start();
        d();
    }

    private void setColor(int i3) {
        zu zuVar = this.O;
        int i10 = zuVar.U;
        if (i10 == 5 || i10 == 7) {
            i3 = zuVar.R;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        k9 k9Var = this.d;
        if (k9Var != null && !this.f39797c) {
            k9Var.setColorFilter(porterDuffColorFilter);
            k9Var.invalidate();
        }
        ch0 ch0Var = this.f39798e;
        if (ch0Var != null) {
            ch0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        vg.y0 y0Var = this.f39799f;
        if (y0Var == null) {
            return;
        }
        this.F = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            y0Var.setImageResource(2131232244);
            return;
        }
        Drawable mutate = getResources().getDrawable(2131232226).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        y0Var.setImageDrawable(mutate);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Df));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kl));
    }

    public final void b() {
        ei.c3 c3Var;
        g5 g5Var = this.f39804x;
        if (g5Var != null && (c3Var = g5Var.f33971k) != null) {
            if (c3Var.B() != null) {
                c3Var.B().M(0);
                c3Var.B().stop();
            } else if (c3Var.m() != null) {
                c3Var.m().stop();
            }
        }
    }

    public final void c() {
        TLRPC.PhotoSize w10;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        org.telegram.messenger.ac h;
        k9 k9Var = this.d;
        if (k9Var == null) {
            return;
        }
        if (this.f39805y && this.E) {
            g5 g5Var = this.f39804x;
            if (g5Var == null && (this.f39802s != null || this.f39801r != null)) {
                k9Var.b();
                TLRPC.Document document = this.f39802s;
                zu zuVar = this.O;
                if (document != null) {
                    this.f39804x = g5.l(org.telegram.messenger.h10.f22829t0, zuVar.T, document);
                } else {
                    this.f39804x = g5.m(org.telegram.messenger.h10.f22829t0, this.f39801r.longValue(), null, zuVar.T);
                }
                this.f39804x.a(k9Var);
                k9Var.setImageDrawable(this.f39804x);
            } else {
                if (g5Var != null) {
                    g5Var.n(k9Var);
                    this.f39804x = null;
                }
                k9Var.b();
                sw swVar = this.f39803w;
                if (swVar != null) {
                    TLRPC.StickerSet stickerSet = swVar.f38125b;
                    if (stickerSet == null || (w10 = org.telegram.messenger.w7.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                        h = null;
                    } else {
                        if (stickerSet.access_hash != 0) {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetShortName.f27021id = stickerSet.f27028id;
                            tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
                        } else {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                        }
                        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                        TLRPC.FileLocation fileLocation = w10.location;
                        h = org.telegram.messenger.ac.h(fileLocation, w10.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w10.type);
                    }
                    this.d.k(h, "24_24", null, null, this.f39803w);
                    if (this.f39803w.d != null) {
                        org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).m0(this.f39803w.d, false);
                        this.f39803w.d = null;
                    }
                }
            }
        } else {
            g5 g5Var2 = this.f39804x;
            if (g5Var2 != null) {
                g5Var2.n(k9Var);
                this.f39804x = null;
            }
            k9Var.b();
        }
        if (this.f39805y && this.E) {
            k9Var.onAttachedToWindow();
        } else {
            k9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        zu zuVar = this.O;
        int k10 = zuVar.k();
        org.telegram.ui.ActionBar.e6 e6Var = zuVar.f41122w;
        org.telegram.ui.ActionBar.k6.H1(background, k10, false);
        if (zuVar.Q) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, this.H) * 255.0f)));
            return;
        }
        setColor(i0.a.f(this.H, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Df, e6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ch0 ch0Var = this.f39798e;
        if (ch0Var != null && this.E) {
            ch0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.E) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        float f10;
        int i3;
        float f11 = this.G;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(f11 - f10) < 0.01f) {
            return;
        }
        if (z10) {
            f12 = 1.0f;
        }
        this.G = f12;
        vg.y0 y0Var = this.f39799f;
        y0Var.setScaleX(f12);
        y0Var.setScaleY(this.G);
        y0Var.setAlpha(this.G);
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        y0Var.setVisibility(i3);
    }

    public final void f() {
        vg.y0 y0Var = this.f39799f;
        if (y0Var != null && !y0Var.h && (getDrawable() instanceof g5)) {
            if (((g5) getDrawable()).c()) {
                y0Var.setImageReceiver(null);
                y0Var.setColor(this.O.R);
                return;
            }
            ei.c3 c3Var = ((g5) getDrawable()).f33971k;
            if (c3Var != null) {
                y0Var.setImageReceiver(c3Var);
                y0Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j10;
        k9 k9Var = this.d;
        if ((k9Var != null && k9Var.getImageReceiver().T == null && !this.O.Q) || this.I == z10) {
            return;
        }
        this.I = z10;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        if (!z10) {
            b();
        }
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.H;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new c6(this, 19));
            this.J.addListener(new s9(7, this, z10));
            ValueAnimator valueAnimator2 = this.J;
            if (dh.d0.d()) {
                j10 = 0;
            } else {
                j10 = 350;
            }
            valueAnimator2.setDuration(j10);
            this.J.setInterpolator(xq.h);
            this.J.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.H = f10;
        d();
    }

    public Drawable getDrawable() {
        k9 k9Var = this.d;
        if (k9Var != null) {
            return k9Var.getImageReceiver().T;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39805y = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39805y = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.E) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TLRPC.Document e10;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            sw swVar = this.f39803w;
            if (swVar != null && (stickerSet = swVar.f38125b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f39802s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.zi.V(document, null, null);
                } else {
                    Long l10 = this.f39801r;
                    if (l10 != null && (e10 = g5.e(org.telegram.messenger.h10.f22829t0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.zi.V(e10, null, null);
                    }
                }
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String M0 = org.telegram.messenger.bd.M0(2131750832, null);
            if (contentDescription == null) {
                contentDescription = M0;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + M0;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.I);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        k9 k9Var = this.d;
        if (k9Var != null) {
            int i13 = (i11 - i3) / 2;
            int i14 = (i12 - i10) / 2;
            k9Var.layout(i13 - (k9Var.getMeasuredWidth() / 2), i14 - (k9Var.getMeasuredHeight() / 2), (k9Var.getMeasuredWidth() / 2) + i13, (k9Var.getMeasuredHeight() / 2) + i14);
        }
        vg.y0 y0Var = this.f39799f;
        if (y0Var != null) {
            int i15 = i11 - i3;
            int i16 = i12 - i10;
            y0Var.layout(i15 - y0Var.getMeasuredWidth(), i16 - y0Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        k9 k9Var = this.d;
        if (k9Var != null) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        vg.y0 y0Var = this.f39799f;
        if (y0Var != null) {
            y0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ei.c3 c3Var;
        g5 g5Var = this.f39804x;
        if (g5Var != null && (c3Var = g5Var.f33971k) != null) {
            if (c3Var.m() != null) {
                c3Var.m().y(0L, true, false);
            }
            c3Var.P0(false);
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f39802s;
        if ((document2 != null || this.f39801r != null) && document != null) {
            Long l10 = this.f39801r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document2.f27007id;
            }
            if (j10 == document.f27007id) {
                return;
            }
        }
        g5 g5Var = this.f39804x;
        k9 k9Var = this.d;
        if (g5Var != null) {
            g5Var.n(k9Var);
            this.f39804x = null;
        }
        k9Var.b();
        this.f39802s = document;
        this.f39801r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f39802s;
        if ((document != null || this.f39801r != null) && j10 != 0) {
            Long l10 = this.f39801r;
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = document.f27007id;
            }
            if (j11 == j10) {
                return;
            }
        }
        g5 g5Var = this.f39804x;
        k9 k9Var = this.d;
        Long l11 = null;
        if (g5Var != null) {
            g5Var.n(k9Var);
            this.f39804x = null;
        }
        k9Var.b();
        this.f39802s = null;
        if (j10 != 0) {
            l11 = Long.valueOf(j10);
        }
        this.f39801r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(sw swVar) {
        if (swVar != null && swVar.f38125b == null) {
            swVar = null;
        }
        sw swVar2 = this.f39803w;
        if (swVar2 != null && swVar != null && swVar2.f38125b.f27028id == swVar.f38125b.f27028id) {
            return;
        }
        g5 g5Var = this.f39804x;
        k9 k9Var = this.d;
        if (g5Var != null && this.f39802s == null && this.f39801r == null) {
            g5Var.n(k9Var);
            this.f39804x = null;
        }
        k9Var.b();
        this.f39803w = swVar;
        c();
    }

    @Override
    public final void updateColors() {
        zu zuVar = this.O;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, zuVar.f41122w);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Df, zuVar.f41122w);
            int k10 = zuVar.k();
            if (w02 == this.K && w03 == this.L && k10 == this.M && this.N == this.H) {
                return;
            }
            this.K = w02;
            this.L = w03;
            this.M = k10;
            this.N = this.H;
            d();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate(i3, i10, i11, i12);
    }

    public vu(zu zuVar, Context context, int i3, boolean z10) {
        super(context);
        this.O = zuVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.f39800n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.k6.a0(zuVar.k(), 8, 8));
        }
        k9 k9Var = new k9(context);
        this.d = k9Var;
        k9Var.f35351x = false;
        k9Var.setImageDrawable(context.getResources().getDrawable(i3).mutate());
        d();
        addView(k9Var);
    }

    public vu(zu zuVar, Context context, TLRPC.Document document) {
        super(context);
        this.O = zuVar;
        setFocusable(true);
        this.N = -1.0f;
        this.f39796b = true;
        this.h = false;
        this.f39800n = false;
        su suVar = new su(this, context);
        this.d = suVar;
        suVar.f35351x = false;
        this.f39802s = document;
        this.f39797c = true;
        suVar.setColorFilter(zuVar.getEmojiColorFilter());
        addView(suVar);
        int i3 = vg.y0.M;
        vg.y0 y0Var = new vg.y0(1, context, zuVar.f41122w);
        this.f39799f = y0Var;
        y0Var.setAlpha(0.0f);
        y0Var.setScaleX(0.0f);
        y0Var.setScaleY(0.0f);
        f();
        addView(y0Var);
        d();
    }

    public vu(zu zuVar, Context context, long j10) {
        super(context);
        this.O = zuVar;
        setFocusable(true);
        this.N = -1.0f;
        this.f39796b = true;
        this.h = false;
        this.f39800n = false;
        ei.d4 d4Var = new ei.d4(8, context, this);
        this.d = d4Var;
        d4Var.f35351x = false;
        this.f39801r = Long.valueOf(j10);
        this.f39797c = true;
        d4Var.setColorFilter(zuVar.getEmojiColorFilter());
        addView(d4Var);
        int i3 = vg.y0.M;
        vg.y0 y0Var = new vg.y0(1, context, zuVar.f41122w);
        this.f39799f = y0Var;
        y0Var.setAlpha(0.0f);
        y0Var.setScaleX(0.0f);
        y0Var.setScaleY(0.0f);
        f();
        addView(y0Var);
        d();
    }
}
