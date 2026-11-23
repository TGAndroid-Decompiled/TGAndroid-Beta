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
public class kv extends ViewGroup implements org.telegram.ui.ActionBar.b6 {
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
    public final ov O;
    public Long f36992a;
    public boolean f36993b;
    public final boolean f36994c;
    public final q9 d;
    public final oh0 f36995e;
    public final ug.b1 f36996f;
    public final boolean h;
    public final boolean f36997n;
    public Long f36998r;
    public TLRPC.Document f36999s;
    public hx f37000w;
    public p5 f37001x;
    public boolean f37002y;

    public kv(ov ovVar, Context context, int i7) {
        super(context);
        this.O = ovVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.f36997n = false;
        setBackground(org.telegram.ui.ActionBar.m6.O(ovVar.k(), 0, 0));
        oh0 oh0Var = new oh0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.f36995e = oh0Var;
        oh0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        oh0Var.R(this);
        oh0Var.J(true);
        oh0Var.start();
        d();
    }

    private void setColor(int i7) {
        ov ovVar = this.O;
        int i10 = ovVar.U;
        if (i10 == 5 || i10 == 7) {
            i7 = ovVar.R;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        q9 q9Var = this.d;
        if (q9Var != null && !this.f36994c) {
            q9Var.setColorFilter(porterDuffColorFilter);
            q9Var.invalidate();
        }
        oh0 oh0Var = this.f36995e;
        if (oh0Var != null) {
            oh0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        ug.b1 b1Var = this.f36996f;
        if (b1Var == null) {
            return;
        }
        this.F = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            b1Var.setImageResource(2131232246);
            return;
        }
        Drawable mutate = getResources().getDrawable(2131232228).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        b1Var.setImageDrawable(mutate);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Nl));
    }

    public final void b() {
        fi.s2 s2Var;
        p5 p5Var = this.f37001x;
        if (p5Var != null && (s2Var = p5Var.f38500k) != null) {
            if (s2Var.B() != null) {
                s2Var.B().M(0);
                s2Var.B().stop();
            } else if (s2Var.m() != null) {
                s2Var.m().stop();
            }
        }
    }

    public final void c() {
        TLRPC.PhotoSize w10;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        org.telegram.messenger.gc h;
        q9 q9Var = this.d;
        if (q9Var == null) {
            return;
        }
        if (this.f37002y && this.E) {
            p5 p5Var = this.f37001x;
            if (p5Var == null && (this.f36999s != null || this.f36998r != null)) {
                q9Var.b();
                TLRPC.Document document = this.f36999s;
                ov ovVar = this.O;
                if (document != null) {
                    this.f37001x = p5.l(org.telegram.messenger.k10.f24968t0, ovVar.T, document);
                } else {
                    this.f37001x = p5.m(org.telegram.messenger.k10.f24968t0, this.f36998r.longValue(), null, ovVar.T);
                }
                this.f37001x.a(q9Var);
                q9Var.setImageDrawable(this.f37001x);
            } else {
                if (p5Var != null) {
                    p5Var.n(q9Var);
                    this.f37001x = null;
                }
                q9Var.b();
                hx hxVar = this.f37000w;
                if (hxVar != null) {
                    TLRPC.StickerSet stickerSet = hxVar.f35982b;
                    if (stickerSet == null || (w10 = org.telegram.messenger.w7.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                        h = null;
                    } else {
                        if (stickerSet.access_hash != 0) {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetShortName.f28454id = stickerSet.f28461id;
                            tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
                        } else {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                        }
                        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                        TLRPC.FileLocation fileLocation = w10.location;
                        h = org.telegram.messenger.gc.h(fileLocation, w10.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w10.type);
                    }
                    this.d.k(h, "24_24", null, null, this.f37000w);
                    if (this.f37000w.d != null) {
                        org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24968t0).o0(this.f37000w.d, false);
                        this.f37000w.d = null;
                    }
                }
            }
        } else {
            p5 p5Var2 = this.f37001x;
            if (p5Var2 != null) {
                p5Var2.n(q9Var);
                this.f37001x = null;
            }
            q9Var.b();
        }
        if (this.f37002y && this.E) {
            q9Var.onAttachedToWindow();
        } else {
            q9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        ov ovVar = this.O;
        int k10 = ovVar.k();
        org.telegram.ui.ActionBar.h6 h6Var = ovVar.f38377w;
        org.telegram.ui.ActionBar.m6.H1(background, k10, false);
        if (ovVar.Q) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nl, h6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, this.H) * 255.0f)));
            return;
        }
        setColor(i0.a.f(this.H, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ef, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gf, h6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        oh0 oh0Var = this.f36995e;
        if (oh0Var != null && this.E) {
            oh0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.E) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean z10) {
        float f10;
        int i7;
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
        ug.b1 b1Var = this.f36996f;
        b1Var.setScaleX(f12);
        b1Var.setScaleY(this.G);
        b1Var.setAlpha(this.G);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        b1Var.setVisibility(i7);
    }

    public final void f() {
        ug.b1 b1Var = this.f36996f;
        if (b1Var != null && !b1Var.h && (getDrawable() instanceof p5)) {
            if (((p5) getDrawable()).c()) {
                b1Var.setImageReceiver(null);
                b1Var.setColor(this.O.R);
                return;
            }
            fi.s2 s2Var = ((p5) getDrawable()).f38500k;
            if (s2Var != null) {
                b1Var.setImageReceiver(s2Var);
                b1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j3;
        q9 q9Var = this.d;
        if ((q9Var != null && q9Var.getImageReceiver().T == null && !this.O.Q) || this.I == z10) {
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
            ofFloat.addUpdateListener(new x(this, 20));
            this.J.addListener(new org.telegram.ui.on(8, this, z10));
            ValueAnimator valueAnimator2 = this.J;
            if (ch.f0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.J.setInterpolator(nr.h);
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
        q9 q9Var = this.d;
        if (q9Var != null) {
            return q9Var.getImageReceiver().T;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37002y = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37002y = false;
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
            hx hxVar = this.f37000w;
            if (hxVar != null && (stickerSet = hxVar.f35982b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f36999s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.gj.V(document, null, null);
                } else {
                    Long l10 = this.f36998r;
                    if (l10 != null && (e10 = p5.e(org.telegram.messenger.k10.f24968t0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.gj.V(e10, null, null);
                    }
                }
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String N0 = org.telegram.messenger.hd.N0(2131750819, null);
            if (contentDescription == null) {
                contentDescription = N0;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + N0;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.I);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        q9 q9Var = this.d;
        if (q9Var != null) {
            int i13 = (i11 - i7) / 2;
            int i14 = (i12 - i10) / 2;
            q9Var.layout(i13 - (q9Var.getMeasuredWidth() / 2), i14 - (q9Var.getMeasuredHeight() / 2), (q9Var.getMeasuredWidth() / 2) + i13, (q9Var.getMeasuredHeight() / 2) + i14);
        }
        ug.b1 b1Var = this.f36996f;
        if (b1Var != null) {
            int i15 = i11 - i7;
            int i16 = i12 - i10;
            b1Var.layout(i15 - b1Var.getMeasuredWidth(), i16 - b1Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        q9 q9Var = this.d;
        if (q9Var != null) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        ug.b1 b1Var = this.f36996f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        fi.s2 s2Var;
        p5 p5Var = this.f37001x;
        if (p5Var != null && (s2Var = p5Var.f38500k) != null) {
            if (s2Var.m() != null) {
                s2Var.m().y(0L, true, false);
            }
            s2Var.P0(false);
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f36999s;
        if ((document2 != null || this.f36998r != null) && document != null) {
            Long l10 = this.f36998r;
            if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = document2.f28440id;
            }
            if (j3 == document.f28440id) {
                return;
            }
        }
        p5 p5Var = this.f37001x;
        q9 q9Var = this.d;
        if (p5Var != null) {
            p5Var.n(q9Var);
            this.f37001x = null;
        }
        q9Var.b();
        this.f36999s = document;
        this.f36998r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f36999s;
        if ((document != null || this.f36998r != null) && j3 != 0) {
            Long l10 = this.f36998r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document.f28440id;
            }
            if (j10 == j3) {
                return;
            }
        }
        p5 p5Var = this.f37001x;
        q9 q9Var = this.d;
        Long l11 = null;
        if (p5Var != null) {
            p5Var.n(q9Var);
            this.f37001x = null;
        }
        q9Var.b();
        this.f36999s = null;
        if (j3 != 0) {
            l11 = Long.valueOf(j3);
        }
        this.f36998r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(hx hxVar) {
        if (hxVar != null && hxVar.f35982b == null) {
            hxVar = null;
        }
        hx hxVar2 = this.f37000w;
        if (hxVar2 != null && hxVar != null && hxVar2.f35982b.f28461id == hxVar.f35982b.f28461id) {
            return;
        }
        p5 p5Var = this.f37001x;
        q9 q9Var = this.d;
        if (p5Var != null && this.f36999s == null && this.f36998r == null) {
            p5Var.n(q9Var);
            this.f37001x = null;
        }
        q9Var.b();
        this.f37000w = hxVar;
        c();
    }

    @Override
    public final void updateColors() {
        ov ovVar = this.O;
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ef, ovVar.f38377w);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gf, ovVar.f38377w);
            int k10 = ovVar.k();
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
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }

    public kv(ov ovVar, Context context, int i7, boolean z10) {
        super(context);
        this.O = ovVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.f36997n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.m6.a0(ovVar.k(), 8, 8));
        }
        q9 q9Var = new q9(context);
        this.d = q9Var;
        q9Var.f38845x = false;
        q9Var.setImageDrawable(context.getResources().getDrawable(i7).mutate());
        d();
        addView(q9Var);
    }

    public kv(ov ovVar, Context context, TLRPC.Document document) {
        super(context);
        this.O = ovVar;
        setFocusable(true);
        this.N = -1.0f;
        this.f36993b = true;
        this.h = false;
        this.f36997n = false;
        hv hvVar = new hv(this, context);
        this.d = hvVar;
        hvVar.f38845x = false;
        this.f36999s = document;
        this.f36994c = true;
        hvVar.setColorFilter(ovVar.getEmojiColorFilter());
        addView(hvVar);
        int i7 = ug.b1.M;
        ug.b1 b1Var = new ug.b1(1, context, ovVar.f38377w);
        this.f36996f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }

    public kv(ov ovVar, Context context, long j3) {
        super(context);
        this.O = ovVar;
        setFocusable(true);
        this.N = -1.0f;
        this.f36993b = true;
        this.h = false;
        this.f36997n = false;
        fi.t3 t3Var = new fi.t3(8, context, this);
        this.d = t3Var;
        t3Var.f38845x = false;
        this.f36998r = Long.valueOf(j3);
        this.f36994c = true;
        t3Var.setColorFilter(ovVar.getEmojiColorFilter());
        addView(t3Var);
        int i7 = ug.b1.M;
        ug.b1 b1Var = new ug.b1(1, context, ovVar.f38377w);
        this.f36996f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }
}
