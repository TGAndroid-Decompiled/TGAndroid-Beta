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
public class xu extends ViewGroup implements org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public int L;
    public float M;
    public final bv N;
    public Long f40480a;
    public boolean f40481b;
    public final boolean f40482c;
    public final l9 d;
    public final zg0 f40483e;
    public final ug.z0 f40484f;
    public final boolean h;
    public final boolean f40485n;
    public Long f40486r;
    public TLRPC.Document f40487s;
    public uw f40488w;
    public i5 f40489x;
    public boolean f40490y;

    public xu(bv bvVar, Context context, int i7) {
        super(context);
        this.N = bvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = true;
        this.f40485n = false;
        setBackground(org.telegram.ui.ActionBar.k6.O(bvVar.k(), 0, 0));
        zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.f40483e = zg0Var;
        zg0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        zg0Var.R(this);
        zg0Var.J(true);
        zg0Var.start();
        d();
    }

    private void setColor(int i7) {
        bv bvVar = this.N;
        int i10 = bvVar.T;
        if (i10 == 5 || i10 == 7) {
            i7 = bvVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        l9 l9Var = this.d;
        if (l9Var != null && !this.f40482c) {
            l9Var.setColorFilter(porterDuffColorFilter);
            l9Var.invalidate();
        }
        zg0 zg0Var = this.f40483e;
        if (zg0Var != null) {
            zg0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        ug.z0 z0Var = this.f40484f;
        if (z0Var == null) {
            return;
        }
        this.E = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            z0Var.setImageResource(2131232244);
            return;
        }
        Drawable mutate = getResources().getDrawable(2131232226).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        z0Var.setImageDrawable(mutate);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Df));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kl));
    }

    public final void b() {
        di.z2 z2Var;
        i5 i5Var = this.f40489x;
        if (i5Var != null && (z2Var = i5Var.f34541k) != null) {
            if (z2Var.B() != null) {
                z2Var.B().M(0);
                z2Var.B().stop();
            } else if (z2Var.m() != null) {
                z2Var.m().stop();
            }
        }
    }

    public final void c() {
        TLRPC.PhotoSize w10;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        org.telegram.messenger.hc h;
        l9 l9Var = this.d;
        if (l9Var == null) {
            return;
        }
        if (this.f40490y && this.D) {
            i5 i5Var = this.f40489x;
            if (i5Var == null && (this.f40487s != null || this.f40486r != null)) {
                l9Var.b();
                TLRPC.Document document = this.f40487s;
                bv bvVar = this.N;
                if (document != null) {
                    this.f40489x = i5.l(org.telegram.messenger.p10.f24470s0, bvVar.S, document);
                } else {
                    this.f40489x = i5.m(org.telegram.messenger.p10.f24470s0, this.f40486r.longValue(), null, bvVar.S);
                }
                this.f40489x.a(l9Var);
                l9Var.setImageDrawable(this.f40489x);
            } else {
                if (i5Var != null) {
                    i5Var.n(l9Var);
                    this.f40489x = null;
                }
                l9Var.b();
                uw uwVar = this.f40488w;
                if (uwVar != null) {
                    TLRPC.StickerSet stickerSet = uwVar.f38747b;
                    if (stickerSet == null || (w10 = org.telegram.messenger.w7.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                        h = null;
                    } else {
                        if (stickerSet.access_hash != 0) {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetShortName.f26976id = stickerSet.f26983id;
                            tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
                        } else {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                        }
                        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                        TLRPC.FileLocation fileLocation = w10.location;
                        h = org.telegram.messenger.hc.h(fileLocation, w10.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w10.type);
                    }
                    this.d.k(h, "24_24", null, null, this.f40488w);
                    if (this.f40488w.d != null) {
                        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24470s0).m0(this.f40488w.d, false);
                        this.f40488w.d = null;
                    }
                }
            }
        } else {
            i5 i5Var2 = this.f40489x;
            if (i5Var2 != null) {
                i5Var2.n(l9Var);
                this.f40489x = null;
            }
            l9Var.b();
        }
        if (this.f40490y && this.D) {
            l9Var.onAttachedToWindow();
        } else {
            l9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        bv bvVar = this.N;
        int k10 = bvVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = bvVar.f32370w;
        org.telegram.ui.ActionBar.k6.H1(background, k10, false);
        if (bvVar.P) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, f6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.f(this.G, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Df, f6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        zg0 zg0Var = this.f40483e;
        if (zg0Var != null && this.D) {
            zg0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.D) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean z9) {
        float f10;
        int i7;
        float f11 = this.F;
        float f12 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(f11 - f10) < 0.01f) {
            return;
        }
        if (z9) {
            f12 = 1.0f;
        }
        this.F = f12;
        ug.z0 z0Var = this.f40484f;
        z0Var.setScaleX(f12);
        z0Var.setScaleY(this.F);
        z0Var.setAlpha(this.F);
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        z0Var.setVisibility(i7);
    }

    public final void f() {
        ug.z0 z0Var = this.f40484f;
        if (z0Var != null && !z0Var.h && (getDrawable() instanceof i5)) {
            if (((i5) getDrawable()).c()) {
                z0Var.setImageReceiver(null);
                z0Var.setColor(this.N.Q);
                return;
            }
            di.z2 z2Var = ((i5) getDrawable()).f34541k;
            if (z2Var != null) {
                z0Var.setImageReceiver(z2Var);
                z0Var.invalidate();
            }
        }
    }

    public final void g(boolean z9, boolean z10) {
        long j3;
        l9 l9Var = this.d;
        if ((l9Var != null && l9Var.getImageReceiver().S == null && !this.N.P) || this.H == z9) {
            return;
        }
        this.H = z9;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
        }
        if (!z9) {
            b();
        }
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.G;
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 19));
            this.I.addListener(new t9(7, this, z9));
            ValueAnimator valueAnimator2 = this.I;
            if (ch.e0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.I.setInterpolator(xq.h);
            this.I.start();
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        this.G = f10;
        d();
    }

    public Drawable getDrawable() {
        l9 l9Var = this.d;
        if (l9Var != null) {
            return l9Var.getImageReceiver().S;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (ch.e0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40490y = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40490y = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.D) {
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
            uw uwVar = this.f40488w;
            if (uwVar != null && (stickerSet = uwVar.f38747b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f40487s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.ij.V(document, null, null);
                } else {
                    Long l10 = this.f40486r;
                    if (l10 != null && (e10 = i5.e(org.telegram.messenger.p10.f24470s0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.ij.V(e10, null, null);
                    }
                }
            }
        }
        Boolean bool = this.E;
        if (bool != null && !bool.booleanValue()) {
            String M0 = org.telegram.messenger.id.M0(2131750832, null);
            if (contentDescription == null) {
                contentDescription = M0;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + M0;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.H);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        l9 l9Var = this.d;
        if (l9Var != null) {
            int i13 = (i11 - i7) / 2;
            int i14 = (i12 - i10) / 2;
            l9Var.layout(i13 - (l9Var.getMeasuredWidth() / 2), i14 - (l9Var.getMeasuredHeight() / 2), (l9Var.getMeasuredWidth() / 2) + i13, (l9Var.getMeasuredHeight() / 2) + i14);
        }
        ug.z0 z0Var = this.f40484f;
        if (z0Var != null) {
            int i15 = i11 - i7;
            int i16 = i12 - i10;
            z0Var.layout(i15 - z0Var.getMeasuredWidth(), i16 - z0Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        l9 l9Var = this.d;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        ug.z0 z0Var = this.f40484f;
        if (z0Var != null) {
            z0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        di.z2 z2Var;
        i5 i5Var = this.f40489x;
        if (i5Var != null && (z2Var = i5Var.f34541k) != null) {
            if (z2Var.m() != null) {
                z2Var.m().y(0L, true, false);
            }
            z2Var.P0(false);
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f40487s;
        if ((document2 != null || this.f40486r != null) && document != null) {
            Long l10 = this.f40486r;
            if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = document2.f26962id;
            }
            if (j3 == document.f26962id) {
                return;
            }
        }
        i5 i5Var = this.f40489x;
        l9 l9Var = this.d;
        if (i5Var != null) {
            i5Var.n(l9Var);
            this.f40489x = null;
        }
        l9Var.b();
        this.f40487s = document;
        this.f40486r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f40487s;
        if ((document != null || this.f40486r != null) && j3 != 0) {
            Long l10 = this.f40486r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document.f26962id;
            }
            if (j10 == j3) {
                return;
            }
        }
        i5 i5Var = this.f40489x;
        l9 l9Var = this.d;
        Long l11 = null;
        if (i5Var != null) {
            i5Var.n(l9Var);
            this.f40489x = null;
        }
        l9Var.b();
        this.f40487s = null;
        if (j3 != 0) {
            l11 = Long.valueOf(j3);
        }
        this.f40486r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(uw uwVar) {
        if (uwVar != null && uwVar.f38747b == null) {
            uwVar = null;
        }
        uw uwVar2 = this.f40488w;
        if (uwVar2 != null && uwVar != null && uwVar2.f38747b.f26983id == uwVar.f38747b.f26983id) {
            return;
        }
        i5 i5Var = this.f40489x;
        l9 l9Var = this.d;
        if (i5Var != null && this.f40487s == null && this.f40486r == null) {
            i5Var.n(l9Var);
            this.f40489x = null;
        }
        l9Var.b();
        this.f40488w = uwVar;
        c();
    }

    @Override
    public final void updateColors() {
        bv bvVar = this.N;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, bvVar.f32370w);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Df, bvVar.f32370w);
            int k10 = bvVar.k();
            if (w02 == this.J && w03 == this.K && k10 == this.L && this.M == this.G) {
                return;
            }
            this.J = w02;
            this.K = w03;
            this.L = k10;
            this.M = this.G;
            d();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.e0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }

    public xu(bv bvVar, Context context, int i7, boolean z9) {
        super(context);
        this.N = bvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = false;
        this.f40485n = z9;
        if (z9) {
            setBackground(org.telegram.ui.ActionBar.k6.a0(bvVar.k(), 8, 8));
        }
        l9 l9Var = new l9(context);
        this.d = l9Var;
        l9Var.f35609x = false;
        l9Var.setImageDrawable(context.getResources().getDrawable(i7).mutate());
        d();
        addView(l9Var);
    }

    public xu(bv bvVar, Context context, TLRPC.Document document) {
        super(context);
        this.N = bvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.f40481b = true;
        this.h = false;
        this.f40485n = false;
        uu uuVar = new uu(this, context);
        this.d = uuVar;
        uuVar.f35609x = false;
        this.f40487s = document;
        this.f40482c = true;
        uuVar.setColorFilter(bvVar.getEmojiColorFilter());
        addView(uuVar);
        int i7 = ug.z0.L;
        ug.z0 z0Var = new ug.z0(1, context, bvVar.f32370w);
        this.f40484f = z0Var;
        z0Var.setAlpha(0.0f);
        z0Var.setScaleX(0.0f);
        z0Var.setScaleY(0.0f);
        f();
        addView(z0Var);
        d();
    }

    public xu(bv bvVar, Context context, long j3) {
        super(context);
        this.N = bvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.f40481b = true;
        this.h = false;
        this.f40485n = false;
        di.c4 c4Var = new di.c4(8, context, this);
        this.d = c4Var;
        c4Var.f35609x = false;
        this.f40486r = Long.valueOf(j3);
        this.f40482c = true;
        c4Var.setColorFilter(bvVar.getEmojiColorFilter());
        addView(c4Var);
        int i7 = ug.z0.L;
        ug.z0 z0Var = new ug.z0(1, context, bvVar.f32370w);
        this.f40484f = z0Var;
        z0Var.setAlpha(0.0f);
        z0Var.setScaleX(0.0f);
        z0Var.setScaleY(0.0f);
        f();
        addView(z0Var);
        d();
    }
}
