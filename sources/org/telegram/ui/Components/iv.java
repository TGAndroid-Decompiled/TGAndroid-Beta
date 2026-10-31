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
public class iv extends ViewGroup implements org.telegram.ui.ActionBar.k6 {
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
    public final mv N;
    public Long f27095a;
    public boolean f27096b;
    public final boolean f27097c;
    public final g9 d;
    public final bi0 e;
    public final kg.l1 f27098f;
    public final boolean h;
    public final boolean f27099n;
    public Long f27100r;
    public TLRPC.Document f27101s;
    public ix f27102w;
    public f5 f27103x;
    public boolean f27104y;

    public iv(mv mvVar, Context context, int i10) {
        super(context);
        this.N = mvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = true;
        this.f27099n = false;
        setBackground(org.telegram.ui.ActionBar.t6.O(mvVar.k(), 0, 0));
        bi0 bi0Var = new bi0(i10, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), false, null);
        this.e = bi0Var;
        bi0Var.setBounds(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(27.0f), org.telegram.messenger.i0.L(27.0f));
        bi0Var.R(this);
        bi0Var.J(true);
        bi0Var.start();
        d();
    }

    private void setColor(int i10) {
        mv mvVar = this.N;
        int i11 = mvVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = mvVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        g9 g9Var = this.d;
        if (g9Var != null && !this.f27097c) {
            g9Var.setColorFilter(porterDuffColorFilter);
            g9Var.invalidate();
        }
        bi0 bi0Var = this.e;
        if (bi0Var != null) {
            bi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        kg.l1 l1Var = this.f27098f;
        if (l1Var == null) {
            return;
        }
        this.E = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            l1Var.setImageResource(2131232243);
            return;
        }
        Drawable mutate = getResources().getDrawable(2131232225).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        l1Var.setImageDrawable(mutate);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Df));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Kl));
    }

    public final void b() {
        ag.c2 c2Var;
        f5 f5Var = this.f27103x;
        if (f5Var != null && (c2Var = f5Var.f25975k) != null) {
            if (c2Var.B() != null) {
                c2Var.B().M(0);
                c2Var.B().stop();
            } else if (c2Var.m() != null) {
                c2Var.m().stop();
            }
        }
    }

    public final void c() {
        TLRPC.PhotoSize w9;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        org.telegram.messenger.ic h;
        g9 g9Var = this.d;
        if (g9Var == null) {
            return;
        }
        if (this.f27104y && this.D) {
            f5 f5Var = this.f27103x;
            if (f5Var == null && (this.f27101s != null || this.f27100r != null)) {
                g9Var.b();
                TLRPC.Document document = this.f27101s;
                mv mvVar = this.N;
                if (document != null) {
                    this.f27103x = f5.l(org.telegram.messenger.d20.f15147s0, mvVar.S, document);
                } else {
                    this.f27103x = f5.m(org.telegram.messenger.d20.f15147s0, this.f27100r.longValue(), null, mvVar.S);
                }
                this.f27103x.a(g9Var);
                g9Var.setImageDrawable(this.f27103x);
            } else {
                if (f5Var != null) {
                    f5Var.n(g9Var);
                    this.f27103x = null;
                }
                g9Var.b();
                ix ixVar = this.f27102w;
                if (ixVar != null) {
                    TLRPC.StickerSet stickerSet = ixVar.f27113b;
                    if (stickerSet == null || (w9 = org.telegram.messenger.b8.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                        h = null;
                    } else {
                        if (stickerSet.access_hash != 0) {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetShortName.f19813id = stickerSet.f19820id;
                            tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
                        } else {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                        }
                        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                        TLRPC.FileLocation fileLocation = w9.location;
                        h = org.telegram.messenger.ic.h(fileLocation, w9.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w9.type);
                    }
                    this.d.k(h, "24_24", null, null, this.f27102w);
                    if (this.f27102w.d != null) {
                        org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).m0(this.f27102w.d, false);
                        this.f27102w.d = null;
                    }
                }
            }
        } else {
            f5 f5Var2 = this.f27103x;
            if (f5Var2 != null) {
                f5Var2.n(g9Var);
                this.f27103x = null;
            }
            g9Var.b();
        }
        if (this.f27104y && this.D) {
            g9Var.onAttachedToWindow();
        } else {
            g9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        mv mvVar = this.N;
        int k10 = mvVar.k();
        org.telegram.ui.ActionBar.p6 p6Var = mvVar.f28607w;
        org.telegram.ui.ActionBar.t6.H1(background, k10, false);
        if (mvVar.P) {
            setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) (org.telegram.messenger.i0.T1(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.b.f(this.G, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Df, p6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        bi0 bi0Var = this.e;
        if (bi0Var != null && this.D) {
            bi0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.D) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        float f7;
        int i10;
        float f10 = this.F;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (Math.abs(f10 - f7) < 0.01f) {
            return;
        }
        if (z10) {
            f11 = 1.0f;
        }
        this.F = f11;
        kg.l1 l1Var = this.f27098f;
        l1Var.setScaleX(f11);
        l1Var.setScaleY(this.F);
        l1Var.setAlpha(this.F);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        l1Var.setVisibility(i10);
    }

    public final void f() {
        kg.l1 l1Var = this.f27098f;
        if (l1Var != null && !l1Var.h && (getDrawable() instanceof f5)) {
            if (((f5) getDrawable()).c()) {
                l1Var.setImageReceiver(null);
                l1Var.setColor(this.N.Q);
                return;
            }
            ag.c2 c2Var = ((f5) getDrawable()).f25975k;
            if (c2Var != null) {
                l1Var.setImageReceiver(c2Var);
                l1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j10;
        g9 g9Var = this.d;
        if ((g9Var != null && g9Var.getImageReceiver().S == null && !this.N.P) || this.H == z10) {
            return;
        }
        this.H = z10;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
        }
        if (!z10) {
            b();
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.G;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new a6(this, 19));
            this.I.addListener(new eg.m(23, this, z10));
            ValueAnimator valueAnimator2 = this.I;
            if (sg.e0.d()) {
                j10 = 0;
            } else {
                j10 = 350;
            }
            valueAnimator2.setDuration(j10);
            this.I.setInterpolator(gr.h);
            this.I.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.G = f7;
        d();
    }

    public Drawable getDrawable() {
        g9 g9Var = this.d;
        if (g9Var != null) {
            return g9Var.getImageReceiver().S;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27104y = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27104y = false;
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
        TLRPC.Document e;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            ix ixVar = this.f27102w;
            if (ixVar != null && (stickerSet = ixVar.f27113b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f27101s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.jj.V(document, null, null);
                } else {
                    Long l4 = this.f27100r;
                    if (l4 != null && (e = f5.e(org.telegram.messenger.d20.f15147s0, l4.longValue())) != null) {
                        contentDescription = org.telegram.messenger.jj.V(e, null, null);
                    }
                }
            }
        }
        Boolean bool = this.E;
        if (bool != null && !bool.booleanValue()) {
            String L0 = org.telegram.messenger.cd.L0(2131750832, null);
            if (contentDescription == null) {
                contentDescription = L0;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + L0;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.H);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g9 g9Var = this.d;
        if (g9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            g9Var.layout(i14 - (g9Var.getMeasuredWidth() / 2), i15 - (g9Var.getMeasuredHeight() / 2), (g9Var.getMeasuredWidth() / 2) + i14, (g9Var.getMeasuredHeight() / 2) + i15);
        }
        kg.l1 l1Var = this.f27098f;
        if (l1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            l1Var.layout(i16 - l1Var.getMeasuredWidth(), i17 - l1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f));
        g9 g9Var = this.d;
        if (g9Var != null) {
            g9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), 1073741824));
        }
        kg.l1 l1Var = this.f27098f;
        if (l1Var != null) {
            l1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ag.c2 c2Var;
        f5 f5Var = this.f27103x;
        if (f5Var != null && (c2Var = f5Var.f25975k) != null) {
            if (c2Var.m() != null) {
                c2Var.m().y(0L, true, false);
            }
            c2Var.P0(false);
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f27101s;
        if ((document2 != null || this.f27100r != null) && document != null) {
            Long l4 = this.f27100r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document2.f19799id;
            }
            if (j10 == document.f19799id) {
                return;
            }
        }
        f5 f5Var = this.f27103x;
        g9 g9Var = this.d;
        if (f5Var != null) {
            f5Var.n(g9Var);
            this.f27103x = null;
        }
        g9Var.b();
        this.f27101s = document;
        this.f27100r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f27101s;
        if ((document != null || this.f27100r != null) && j10 != 0) {
            Long l4 = this.f27100r;
            if (l4 != null) {
                j11 = l4.longValue();
            } else {
                j11 = document.f19799id;
            }
            if (j11 == j10) {
                return;
            }
        }
        f5 f5Var = this.f27103x;
        g9 g9Var = this.d;
        Long l10 = null;
        if (f5Var != null) {
            f5Var.n(g9Var);
            this.f27103x = null;
        }
        g9Var.b();
        this.f27101s = null;
        if (j10 != 0) {
            l10 = Long.valueOf(j10);
        }
        this.f27100r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(ix ixVar) {
        if (ixVar != null && ixVar.f27113b == null) {
            ixVar = null;
        }
        ix ixVar2 = this.f27102w;
        if (ixVar2 != null && ixVar != null && ixVar2.f27113b.f19820id == ixVar.f27113b.f19820id) {
            return;
        }
        f5 f5Var = this.f27103x;
        g9 g9Var = this.d;
        if (f5Var != null && this.f27101s == null && this.f27100r == null) {
            f5Var.n(g9Var);
            this.f27103x = null;
        }
        g9Var.b();
        this.f27102w = ixVar;
        c();
    }

    @Override
    public final void updateColors() {
        mv mvVar = this.N;
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, mvVar.f28607w);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Df, mvVar.f28607w);
            int k10 = mvVar.k();
            if (w02 == this.J && w03 == this.K && k10 == this.L && this.M == this.G) {
                return;
            }
            this.J = w02;
            this.K = w03;
            this.L = k10;
            this.M = this.G;
            d();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public iv(mv mvVar, Context context, int i10, boolean z10) {
        super(context);
        this.N = mvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = false;
        this.f27099n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.t6.a0(mvVar.k(), 8, 8));
        }
        g9 g9Var = new g9(context);
        this.d = g9Var;
        g9Var.f26300x = false;
        g9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(g9Var);
    }

    public iv(mv mvVar, Context context, TLRPC.Document document) {
        super(context);
        this.N = mvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.f27096b = true;
        this.h = false;
        this.f27099n = false;
        fv fvVar = new fv(this, context);
        this.d = fvVar;
        fvVar.f26300x = false;
        this.f27101s = document;
        this.f27097c = true;
        fvVar.setColorFilter(mvVar.getEmojiColorFilter());
        addView(fvVar);
        int i10 = kg.l1.L;
        kg.l1 l1Var = new kg.l1(1, context, mvVar.f28607w);
        this.f27098f = l1Var;
        l1Var.setAlpha(0.0f);
        l1Var.setScaleX(0.0f);
        l1Var.setScaleY(0.0f);
        f();
        addView(l1Var);
        d();
    }

    public iv(mv mvVar, Context context, long j10) {
        super(context);
        this.N = mvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.f27096b = true;
        this.h = false;
        this.f27099n = false;
        ag.d2 d2Var = new ag.d2(this, context, 7);
        this.d = d2Var;
        d2Var.f26300x = false;
        this.f27100r = Long.valueOf(j10);
        this.f27097c = true;
        d2Var.setColorFilter(mvVar.getEmojiColorFilter());
        addView(d2Var);
        int i10 = kg.l1.L;
        kg.l1 l1Var = new kg.l1(1, context, mvVar.f28607w);
        this.f27098f = l1Var;
        l1Var.setAlpha(0.0f);
        l1Var.setScaleX(0.0f);
        l1Var.setScaleY(0.0f);
        f();
        addView(l1Var);
        d();
    }
}
