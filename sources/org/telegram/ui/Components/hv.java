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
    public Long f35985a;
    public boolean f35986b;
    public final boolean f35987c;
    public final q9 d;
    public final mh0 f35988e;
    public final ug.c1 f35989f;
    public final boolean h;
    public final boolean f35990n;
    public Long f35991r;
    public TLRPC.Document f35992s;
    public fx f35993w;
    public o5 f35994x;
    public boolean f35995y;

    public hv(lv lvVar, Context context, int i7) {
        super(context);
        this.O = lvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.f35990n = false;
        setBackground(org.telegram.ui.ActionBar.n6.O(lvVar.k(), 0, 0));
        mh0 mh0Var = new mh0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.f35988e = mh0Var;
        mh0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        mh0Var.R(this);
        mh0Var.J(true);
        mh0Var.start();
        d();
    }

    private void setColor(int i7) {
        lv lvVar = this.O;
        int i10 = lvVar.U;
        if (i10 == 5 || i10 == 7) {
            i7 = lvVar.R;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        q9 q9Var = this.d;
        if (q9Var != null && !this.f35987c) {
            q9Var.setColorFilter(porterDuffColorFilter);
            q9Var.invalidate();
        }
        mh0 mh0Var = this.f35988e;
        if (mh0Var != null) {
            mh0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        ug.c1 c1Var = this.f35989f;
        if (c1Var == null) {
            return;
        }
        this.F = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            c1Var.setImageResource(2131232246);
            return;
        }
        Drawable mutate = getResources().getDrawable(2131232228).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        c1Var.setImageDrawable(mutate);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Nl));
    }

    public final void b() {
        fi.s2 s2Var;
        o5 o5Var = this.f35994x;
        if (o5Var != null && (s2Var = o5Var.f37976k) != null) {
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
        org.telegram.messenger.fc h;
        q9 q9Var = this.d;
        if (q9Var == null) {
            return;
        }
        if (this.f35995y && this.E) {
            o5 o5Var = this.f35994x;
            if (o5Var == null && (this.f35992s != null || this.f35991r != null)) {
                q9Var.b();
                TLRPC.Document document = this.f35992s;
                lv lvVar = this.O;
                if (document != null) {
                    this.f35994x = o5.l(org.telegram.messenger.j10.f24773t0, lvVar.T, document);
                } else {
                    this.f35994x = o5.m(org.telegram.messenger.j10.f24773t0, this.f35991r.longValue(), null, lvVar.T);
                }
                this.f35994x.a(q9Var);
                q9Var.setImageDrawable(this.f35994x);
            } else {
                if (o5Var != null) {
                    o5Var.n(q9Var);
                    this.f35994x = null;
                }
                q9Var.b();
                fx fxVar = this.f35993w;
                if (fxVar != null) {
                    TLRPC.StickerSet stickerSet = fxVar.f35172b;
                    if (stickerSet == null || (w10 = org.telegram.messenger.w7.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                        h = null;
                    } else {
                        if (stickerSet.access_hash != 0) {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetShortName.f28425id = stickerSet.f28432id;
                            tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
                        } else {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                        }
                        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                        TLRPC.FileLocation fileLocation = w10.location;
                        h = org.telegram.messenger.fc.h(fileLocation, w10.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w10.type);
                    }
                    this.d.k(h, "24_24", null, null, this.f35993w);
                    if (this.f35993w.d != null) {
                        org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).o0(this.f35993w.d, false);
                        this.f35993w.d = null;
                    }
                }
            }
        } else {
            o5 o5Var2 = this.f35994x;
            if (o5Var2 != null) {
                o5Var2.n(q9Var);
                this.f35994x = null;
            }
            q9Var.b();
        }
        if (this.f35995y && this.E) {
            q9Var.onAttachedToWindow();
        } else {
            q9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        lv lvVar = this.O;
        int k10 = lvVar.k();
        org.telegram.ui.ActionBar.i6 i6Var = lvVar.f37253w;
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
        mh0 mh0Var = this.f35988e;
        if (mh0Var != null && this.E) {
            mh0Var.draw(canvas);
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
        ug.c1 c1Var = this.f35989f;
        c1Var.setScaleX(f12);
        c1Var.setScaleY(this.G);
        c1Var.setAlpha(this.G);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        c1Var.setVisibility(i7);
    }

    public final void f() {
        ug.c1 c1Var = this.f35989f;
        if (c1Var != null && !c1Var.h && (getDrawable() instanceof o5)) {
            if (((o5) getDrawable()).c()) {
                c1Var.setImageReceiver(null);
                c1Var.setColor(this.O.R);
                return;
            }
            fi.s2 s2Var = ((o5) getDrawable()).f37976k;
            if (s2Var != null) {
                c1Var.setImageReceiver(s2Var);
                c1Var.invalidate();
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
            ofFloat.addUpdateListener(new w(this, 20));
            this.J.addListener(new org.telegram.ui.on(8, this, z10));
            ValueAnimator valueAnimator2 = this.J;
            if (ch.f0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.J.setInterpolator(lr.h);
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
        this.f35995y = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35995y = false;
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
            fx fxVar = this.f35993w;
            if (fxVar != null && (stickerSet = fxVar.f35172b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f35992s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.fj.V(document, null, null);
                } else {
                    Long l10 = this.f35991r;
                    if (l10 != null && (e10 = o5.e(org.telegram.messenger.j10.f24773t0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.fj.V(e10, null, null);
                    }
                }
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String M0 = org.telegram.messenger.gd.M0(2131750820, null);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        q9 q9Var = this.d;
        if (q9Var != null) {
            int i13 = (i11 - i7) / 2;
            int i14 = (i12 - i10) / 2;
            q9Var.layout(i13 - (q9Var.getMeasuredWidth() / 2), i14 - (q9Var.getMeasuredHeight() / 2), (q9Var.getMeasuredWidth() / 2) + i13, (q9Var.getMeasuredHeight() / 2) + i14);
        }
        ug.c1 c1Var = this.f35989f;
        if (c1Var != null) {
            int i15 = i11 - i7;
            int i16 = i12 - i10;
            c1Var.layout(i15 - c1Var.getMeasuredWidth(), i16 - c1Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        q9 q9Var = this.d;
        if (q9Var != null) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        ug.c1 c1Var = this.f35989f;
        if (c1Var != null) {
            c1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        fi.s2 s2Var;
        o5 o5Var = this.f35994x;
        if (o5Var != null && (s2Var = o5Var.f37976k) != null) {
            if (s2Var.m() != null) {
                s2Var.m().y(0L, true, false);
            }
            s2Var.P0(false);
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f35992s;
        if ((document2 != null || this.f35991r != null) && document != null) {
            Long l10 = this.f35991r;
            if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = document2.f28411id;
            }
            if (j3 == document.f28411id) {
                return;
            }
        }
        o5 o5Var = this.f35994x;
        q9 q9Var = this.d;
        if (o5Var != null) {
            o5Var.n(q9Var);
            this.f35994x = null;
        }
        q9Var.b();
        this.f35992s = document;
        this.f35991r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f35992s;
        if ((document != null || this.f35991r != null) && j3 != 0) {
            Long l10 = this.f35991r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document.f28411id;
            }
            if (j10 == j3) {
                return;
            }
        }
        o5 o5Var = this.f35994x;
        q9 q9Var = this.d;
        Long l11 = null;
        if (o5Var != null) {
            o5Var.n(q9Var);
            this.f35994x = null;
        }
        q9Var.b();
        this.f35992s = null;
        if (j3 != 0) {
            l11 = Long.valueOf(j3);
        }
        this.f35991r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(fx fxVar) {
        if (fxVar != null && fxVar.f35172b == null) {
            fxVar = null;
        }
        fx fxVar2 = this.f35993w;
        if (fxVar2 != null && fxVar != null && fxVar2.f35172b.f28432id == fxVar.f35172b.f28432id) {
            return;
        }
        o5 o5Var = this.f35994x;
        q9 q9Var = this.d;
        if (o5Var != null && this.f35992s == null && this.f35991r == null) {
            o5Var.n(q9Var);
            this.f35994x = null;
        }
        q9Var.b();
        this.f35993w = fxVar;
        c();
    }

    @Override
    public final void updateColors() {
        lv lvVar = this.O;
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, lvVar.f37253w);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gf, lvVar.f37253w);
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
        this.f35990n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.n6.a0(lvVar.k(), 8, 8));
        }
        q9 q9Var = new q9(context);
        this.d = q9Var;
        q9Var.f38751x = false;
        q9Var.setImageDrawable(context.getResources().getDrawable(i7).mutate());
        d();
        addView(q9Var);
    }

    public hv(lv lvVar, Context context, TLRPC.Document document) {
        super(context);
        this.O = lvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.f35986b = true;
        this.h = false;
        this.f35990n = false;
        ev evVar = new ev(this, context);
        this.d = evVar;
        evVar.f38751x = false;
        this.f35992s = document;
        this.f35987c = true;
        evVar.setColorFilter(lvVar.getEmojiColorFilter());
        addView(evVar);
        int i7 = ug.c1.M;
        ug.c1 c1Var = new ug.c1(1, context, lvVar.f37253w);
        this.f35989f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }

    public hv(lv lvVar, Context context, long j3) {
        super(context);
        this.O = lvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.f35986b = true;
        this.h = false;
        this.f35990n = false;
        fi.t3 t3Var = new fi.t3(8, context, this);
        this.d = t3Var;
        t3Var.f38751x = false;
        this.f35991r = Long.valueOf(j3);
        this.f35987c = true;
        t3Var.setColorFilter(lvVar.getEmojiColorFilter());
        addView(t3Var);
        int i7 = ug.c1.M;
        ug.c1 c1Var = new ug.c1(1, context, lvVar.f37253w);
        this.f35989f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }
}
