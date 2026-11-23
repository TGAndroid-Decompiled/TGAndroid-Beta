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
public class hv extends ViewGroup implements org.telegram.ui.ActionBar.c6 {
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
    public final lv O;
    public Long f35831a;
    public boolean f35832b;
    public final boolean f35833c;
    public final p9 d;
    public final nh0 f35834e;
    public final ug.b1 f35835f;
    public final boolean h;
    public final boolean f35836n;
    public Long f35837r;
    public TLRPC.Document f35838s;
    public ex f35839w;
    public o5 f35840x;
    public boolean f35841y;

    public hv(lv lvVar, Context context, int i7) {
        super(context);
        this.O = lvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.f35836n = false;
        setBackground(org.telegram.ui.ActionBar.n6.O(lvVar.k(), 0, 0));
        nh0 nh0Var = new nh0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.f35834e = nh0Var;
        nh0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        nh0Var.R(this);
        nh0Var.J(true);
        nh0Var.start();
        d();
    }

    private void setColor(int i7) {
        lv lvVar = this.O;
        int i10 = lvVar.U;
        if (i10 == 5 || i10 == 7) {
            i7 = lvVar.R;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        p9 p9Var = this.d;
        if (p9Var != null && !this.f35833c) {
            p9Var.setColorFilter(porterDuffColorFilter);
            p9Var.invalidate();
        }
        nh0 nh0Var = this.f35834e;
        if (nh0Var != null) {
            nh0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        ug.b1 b1Var = this.f35835f;
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
            b1Var.setImageResource(2131232249);
            return;
        }
        Drawable mutate = getResources().getDrawable(2131232231).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        b1Var.setImageDrawable(mutate);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Nl));
    }

    public final void b() {
        fi.s2 s2Var;
        o5 o5Var = this.f35840x;
        if (o5Var != null && (s2Var = o5Var.f38028k) != null) {
            if (s2Var.C() != null) {
                s2Var.C().M(0);
                s2Var.C().stop();
            } else if (s2Var.m() != null) {
                s2Var.m().stop();
            }
        }
    }

    public final void c() {
        TLRPC.PhotoSize w10;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        org.telegram.messenger.fc h;
        p9 p9Var = this.d;
        if (p9Var == null) {
            return;
        }
        if (this.f35841y && this.E) {
            o5 o5Var = this.f35840x;
            if (o5Var == null && (this.f35838s != null || this.f35837r != null)) {
                p9Var.b();
                TLRPC.Document document = this.f35838s;
                lv lvVar = this.O;
                if (document != null) {
                    this.f35840x = o5.l(org.telegram.messenger.i10.f24637t0, lvVar.T, document);
                } else {
                    this.f35840x = o5.m(org.telegram.messenger.i10.f24637t0, this.f35837r.longValue(), null, lvVar.T);
                }
                this.f35840x.a(p9Var);
                p9Var.setImageDrawable(this.f35840x);
            } else {
                if (o5Var != null) {
                    o5Var.n(p9Var);
                    this.f35840x = null;
                }
                p9Var.b();
                ex exVar = this.f35839w;
                if (exVar != null) {
                    TLRPC.StickerSet stickerSet = exVar.f34856b;
                    if (stickerSet == null || (w10 = org.telegram.messenger.w7.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                        h = null;
                    } else {
                        if (stickerSet.access_hash != 0) {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetShortName.f28512id = stickerSet.f28519id;
                            tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
                        } else {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                        }
                        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                        TLRPC.FileLocation fileLocation = w10.location;
                        h = org.telegram.messenger.fc.h(fileLocation, w10.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w10.type);
                    }
                    this.d.k(h, "24_24", null, null, this.f35839w);
                    if (this.f35839w.d != null) {
                        org.telegram.messenger.ri.d0(org.telegram.messenger.i10.f24637t0).o0(this.f35839w.d, false);
                        this.f35839w.d = null;
                    }
                }
            }
        } else {
            o5 o5Var2 = this.f35840x;
            if (o5Var2 != null) {
                o5Var2.n(p9Var);
                this.f35840x = null;
            }
            p9Var.b();
        }
        if (this.f35841y && this.E) {
            p9Var.onAttachedToWindow();
        } else {
            p9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        lv lvVar = this.O;
        int k10 = lvVar.k();
        org.telegram.ui.ActionBar.i6 i6Var = lvVar.f37239w;
        org.telegram.ui.ActionBar.n6.H1(background, k10, false);
        if (lvVar.Q) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, i6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, this.H) * 255.0f)));
            return;
        }
        setColor(i0.a.f(this.H, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gf, i6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        nh0 nh0Var = this.f35834e;
        if (nh0Var != null && this.E) {
            nh0Var.draw(canvas);
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
        ug.b1 b1Var = this.f35835f;
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
        ug.b1 b1Var = this.f35835f;
        if (b1Var != null && !b1Var.h && (getDrawable() instanceof o5)) {
            if (((o5) getDrawable()).c()) {
                b1Var.setImageReceiver(null);
                b1Var.setColor(this.O.R);
                return;
            }
            fi.s2 s2Var = ((o5) getDrawable()).f38028k;
            if (s2Var != null) {
                b1Var.setImageReceiver(s2Var);
                b1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j3;
        p9 p9Var = this.d;
        if ((p9Var != null && p9Var.getImageReceiver().T == null && !this.O.Q) || this.I == z10) {
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
            ofFloat.addUpdateListener(new w(this, 20));
            this.J.addListener(new org.telegram.ui.on(8, this, z10));
            ValueAnimator valueAnimator2 = this.J;
            if (ch.f0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.J.setInterpolator(kr.h);
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
        p9 p9Var = this.d;
        if (p9Var != null) {
            return p9Var.getImageReceiver().T;
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
        this.f35841y = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35841y = false;
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
            ex exVar = this.f35839w;
            if (exVar != null && (stickerSet = exVar.f34856b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f35838s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.fj.V(document, null, null);
                } else {
                    Long l10 = this.f35837r;
                    if (l10 != null && (e10 = o5.e(org.telegram.messenger.i10.f24637t0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.fj.V(e10, null, null);
                    }
                }
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String N0 = org.telegram.messenger.gd.N0(2131750819, null);
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
        p9 p9Var = this.d;
        if (p9Var != null) {
            int i13 = (i11 - i7) / 2;
            int i14 = (i12 - i10) / 2;
            p9Var.layout(i13 - (p9Var.getMeasuredWidth() / 2), i14 - (p9Var.getMeasuredHeight() / 2), (p9Var.getMeasuredWidth() / 2) + i13, (p9Var.getMeasuredHeight() / 2) + i14);
        }
        ug.b1 b1Var = this.f35835f;
        if (b1Var != null) {
            int i15 = i11 - i7;
            int i16 = i12 - i10;
            b1Var.layout(i15 - b1Var.getMeasuredWidth(), i16 - b1Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        p9 p9Var = this.d;
        if (p9Var != null) {
            p9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        ug.b1 b1Var = this.f35835f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        fi.s2 s2Var;
        o5 o5Var = this.f35840x;
        if (o5Var != null && (s2Var = o5Var.f38028k) != null) {
            if (s2Var.m() != null) {
                s2Var.m().y(0L, true, false);
            }
            s2Var.Q0(false);
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f35838s;
        if ((document2 != null || this.f35837r != null) && document != null) {
            Long l10 = this.f35837r;
            if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = document2.f28498id;
            }
            if (j3 == document.f28498id) {
                return;
            }
        }
        o5 o5Var = this.f35840x;
        p9 p9Var = this.d;
        if (o5Var != null) {
            o5Var.n(p9Var);
            this.f35840x = null;
        }
        p9Var.b();
        this.f35838s = document;
        this.f35837r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f35838s;
        if ((document != null || this.f35837r != null) && j3 != 0) {
            Long l10 = this.f35837r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document.f28498id;
            }
            if (j10 == j3) {
                return;
            }
        }
        o5 o5Var = this.f35840x;
        p9 p9Var = this.d;
        Long l11 = null;
        if (o5Var != null) {
            o5Var.n(p9Var);
            this.f35840x = null;
        }
        p9Var.b();
        this.f35838s = null;
        if (j3 != 0) {
            l11 = Long.valueOf(j3);
        }
        this.f35837r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(ex exVar) {
        if (exVar != null && exVar.f34856b == null) {
            exVar = null;
        }
        ex exVar2 = this.f35839w;
        if (exVar2 != null && exVar != null && exVar2.f34856b.f28519id == exVar.f34856b.f28519id) {
            return;
        }
        o5 o5Var = this.f35840x;
        p9 p9Var = this.d;
        if (o5Var != null && this.f35838s == null && this.f35837r == null) {
            o5Var.n(p9Var);
            this.f35840x = null;
        }
        p9Var.b();
        this.f35839w = exVar;
        c();
    }

    @Override
    public final void updateColors() {
        lv lvVar = this.O;
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, lvVar.f37239w);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gf, lvVar.f37239w);
            int k10 = lvVar.k();
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

    public hv(lv lvVar, Context context, int i7, boolean z10) {
        super(context);
        this.O = lvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.f35836n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.n6.a0(lvVar.k(), 8, 8));
        }
        p9 p9Var = new p9(context);
        this.d = p9Var;
        p9Var.f38438x = false;
        p9Var.setImageDrawable(context.getResources().getDrawable(i7).mutate());
        d();
        addView(p9Var);
    }

    public hv(lv lvVar, Context context, TLRPC.Document document) {
        super(context);
        this.O = lvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.f35832b = true;
        this.h = false;
        this.f35836n = false;
        ev evVar = new ev(this, context);
        this.d = evVar;
        evVar.f38438x = false;
        this.f35838s = document;
        this.f35833c = true;
        evVar.setColorFilter(lvVar.getEmojiColorFilter());
        addView(evVar);
        int i7 = ug.b1.M;
        ug.b1 b1Var = new ug.b1(1, context, lvVar.f37239w);
        this.f35835f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }

    public hv(lv lvVar, Context context, long j3) {
        super(context);
        this.O = lvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.f35832b = true;
        this.h = false;
        this.f35836n = false;
        fi.t3 t3Var = new fi.t3(8, context, this);
        this.d = t3Var;
        t3Var.f38438x = false;
        this.f35837r = Long.valueOf(j3);
        this.f35833c = true;
        t3Var.setColorFilter(lvVar.getEmojiColorFilter());
        addView(t3Var);
        int i7 = ug.b1.M;
        ug.b1 b1Var = new ug.b1(1, context, lvVar.f37239w);
        this.f35835f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }
}
