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
public class cv extends ViewGroup implements org.telegram.ui.ActionBar.z5 {
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
    public final gv O;
    public Long f33693a;
    public boolean f33694b;
    public final boolean f33695c;
    public final i9 d;
    public final ch0 f33696e;
    public final ug.a1 f33697f;
    public final boolean h;
    public final boolean f33698n;
    public Long f33699r;
    public TLRPC.Document f33700s;
    public zw f33701w;
    public g5 f33702x;
    public boolean f33703y;

    public cv(gv gvVar, Context context, int i7) {
        super(context);
        this.O = gvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.f33698n = false;
        setBackground(org.telegram.ui.ActionBar.j6.O(gvVar.k(), 0, 0));
        ch0 ch0Var = new ch0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.f33696e = ch0Var;
        ch0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        ch0Var.R(this);
        ch0Var.J(true);
        ch0Var.start();
        d();
    }

    private void setColor(int i7) {
        gv gvVar = this.O;
        int i10 = gvVar.U;
        if (i10 == 5 || i10 == 7) {
            i7 = gvVar.R;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        i9 i9Var = this.d;
        if (i9Var != null && !this.f33695c) {
            i9Var.setColorFilter(porterDuffColorFilter);
            i9Var.invalidate();
        }
        ch0 ch0Var = this.f33696e;
        if (ch0Var != null) {
            ch0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        ug.a1 a1Var = this.f33697f;
        if (a1Var == null) {
            return;
        }
        this.F = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            a1Var.setImageResource(2131232245);
            return;
        }
        Drawable mutate = getResources().getDrawable(2131232227).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        a1Var.setImageDrawable(mutate);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Nl));
    }

    public final void b() {
        fi.u2 u2Var;
        g5 g5Var = this.f33702x;
        if (g5Var != null && (u2Var = g5Var.f34809k) != null) {
            if (u2Var.B() != null) {
                u2Var.B().M(0);
                u2Var.B().stop();
            } else if (u2Var.m() != null) {
                u2Var.m().stop();
            }
        }
    }

    public final void c() {
        TLRPC.PhotoSize w10;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        org.telegram.messenger.gc h;
        i9 i9Var = this.d;
        if (i9Var == null) {
            return;
        }
        if (this.f33703y && this.E) {
            g5 g5Var = this.f33702x;
            if (g5Var == null && (this.f33700s != null || this.f33699r != null)) {
                i9Var.b();
                TLRPC.Document document = this.f33700s;
                gv gvVar = this.O;
                if (document != null) {
                    this.f33702x = g5.l(org.telegram.messenger.m10.f24934t0, gvVar.T, document);
                } else {
                    this.f33702x = g5.m(org.telegram.messenger.m10.f24934t0, this.f33699r.longValue(), null, gvVar.T);
                }
                this.f33702x.a(i9Var);
                i9Var.setImageDrawable(this.f33702x);
            } else {
                if (g5Var != null) {
                    g5Var.n(i9Var);
                    this.f33702x = null;
                }
                i9Var.b();
                zw zwVar = this.f33701w;
                if (zwVar != null) {
                    TLRPC.StickerSet stickerSet = zwVar.f42431b;
                    if (stickerSet == null || (w10 = org.telegram.messenger.w7.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                        h = null;
                    } else {
                        if (stickerSet.access_hash != 0) {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetShortName.f28071id = stickerSet.f28078id;
                            tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
                        } else {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                        }
                        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                        TLRPC.FileLocation fileLocation = w10.location;
                        h = org.telegram.messenger.gc.h(fileLocation, w10.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w10.type);
                    }
                    this.d.k(h, "24_24", null, null, this.f33701w);
                    if (this.f33701w.d != null) {
                        org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24934t0).m0(this.f33701w.d, false);
                        this.f33701w.d = null;
                    }
                }
            }
        } else {
            g5 g5Var2 = this.f33702x;
            if (g5Var2 != null) {
                g5Var2.n(i9Var);
                this.f33702x = null;
            }
            i9Var.b();
        }
        if (this.f33703y && this.E) {
            i9Var.onAttachedToWindow();
        } else {
            i9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        gv gvVar = this.O;
        int k10 = gvVar.k();
        org.telegram.ui.ActionBar.e6 e6Var = gvVar.f35071w;
        org.telegram.ui.ActionBar.j6.H1(background, k10, false);
        if (gvVar.Q) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nl, e6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, this.H) * 255.0f)));
            return;
        }
        setColor(i0.a.f(this.H, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ef, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Gf, e6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ch0 ch0Var = this.f33696e;
        if (ch0Var != null && this.E) {
            ch0Var.draw(canvas);
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
        ug.a1 a1Var = this.f33697f;
        a1Var.setScaleX(f12);
        a1Var.setScaleY(this.G);
        a1Var.setAlpha(this.G);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        a1Var.setVisibility(i7);
    }

    public final void f() {
        ug.a1 a1Var = this.f33697f;
        if (a1Var != null && !a1Var.h && (getDrawable() instanceof g5)) {
            if (((g5) getDrawable()).c()) {
                a1Var.setImageReceiver(null);
                a1Var.setColor(this.O.R);
                return;
            }
            fi.u2 u2Var = ((g5) getDrawable()).f34809k;
            if (u2Var != null) {
                a1Var.setImageReceiver(u2Var);
                a1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j3;
        i9 i9Var = this.d;
        if ((i9Var != null && i9Var.getImageReceiver().T == null && !this.O.Q) || this.I == z10) {
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
            this.J.addListener(new org.telegram.ui.nn(8, this, z10));
            ValueAnimator valueAnimator2 = this.J;
            if (ch.f0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.J.setInterpolator(er.h);
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
        i9 i9Var = this.d;
        if (i9Var != null) {
            return i9Var.getImageReceiver().T;
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
        this.f33703y = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33703y = false;
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
            zw zwVar = this.f33701w;
            if (zwVar != null && (stickerSet = zwVar.f42431b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f33700s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.gj.V(document, null, null);
                } else {
                    Long l10 = this.f33699r;
                    if (l10 != null && (e10 = g5.e(org.telegram.messenger.m10.f24934t0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.gj.V(e10, null, null);
                    }
                }
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String M0 = org.telegram.messenger.hd.M0(2131750831, null);
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
        i9 i9Var = this.d;
        if (i9Var != null) {
            int i13 = (i11 - i7) / 2;
            int i14 = (i12 - i10) / 2;
            i9Var.layout(i13 - (i9Var.getMeasuredWidth() / 2), i14 - (i9Var.getMeasuredHeight() / 2), (i9Var.getMeasuredWidth() / 2) + i13, (i9Var.getMeasuredHeight() / 2) + i14);
        }
        ug.a1 a1Var = this.f33697f;
        if (a1Var != null) {
            int i15 = i11 - i7;
            int i16 = i12 - i10;
            a1Var.layout(i15 - a1Var.getMeasuredWidth(), i16 - a1Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        i9 i9Var = this.d;
        if (i9Var != null) {
            i9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        ug.a1 a1Var = this.f33697f;
        if (a1Var != null) {
            a1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        fi.u2 u2Var;
        g5 g5Var = this.f33702x;
        if (g5Var != null && (u2Var = g5Var.f34809k) != null) {
            if (u2Var.m() != null) {
                u2Var.m().y(0L, true, false);
            }
            u2Var.P0(false);
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f33700s;
        if ((document2 != null || this.f33699r != null) && document != null) {
            Long l10 = this.f33699r;
            if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = document2.f28057id;
            }
            if (j3 == document.f28057id) {
                return;
            }
        }
        g5 g5Var = this.f33702x;
        i9 i9Var = this.d;
        if (g5Var != null) {
            g5Var.n(i9Var);
            this.f33702x = null;
        }
        i9Var.b();
        this.f33700s = document;
        this.f33699r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f33700s;
        if ((document != null || this.f33699r != null) && j3 != 0) {
            Long l10 = this.f33699r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document.f28057id;
            }
            if (j10 == j3) {
                return;
            }
        }
        g5 g5Var = this.f33702x;
        i9 i9Var = this.d;
        Long l11 = null;
        if (g5Var != null) {
            g5Var.n(i9Var);
            this.f33702x = null;
        }
        i9Var.b();
        this.f33700s = null;
        if (j3 != 0) {
            l11 = Long.valueOf(j3);
        }
        this.f33699r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(zw zwVar) {
        if (zwVar != null && zwVar.f42431b == null) {
            zwVar = null;
        }
        zw zwVar2 = this.f33701w;
        if (zwVar2 != null && zwVar != null && zwVar2.f42431b.f28078id == zwVar.f42431b.f28078id) {
            return;
        }
        g5 g5Var = this.f33702x;
        i9 i9Var = this.d;
        if (g5Var != null && this.f33700s == null && this.f33699r == null) {
            g5Var.n(i9Var);
            this.f33702x = null;
        }
        i9Var.b();
        this.f33701w = zwVar;
        c();
    }

    @Override
    public final void updateColors() {
        gv gvVar = this.O;
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ef, gvVar.f35071w);
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Gf, gvVar.f35071w);
            int k10 = gvVar.k();
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

    public cv(gv gvVar, Context context, int i7, boolean z10) {
        super(context);
        this.O = gvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.f33698n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.a0(gvVar.k(), 8, 8));
        }
        i9 i9Var = new i9(context);
        this.d = i9Var;
        i9Var.f35517x = false;
        i9Var.setImageDrawable(context.getResources().getDrawable(i7).mutate());
        d();
        addView(i9Var);
    }

    public cv(gv gvVar, Context context, TLRPC.Document document) {
        super(context);
        this.O = gvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.f33694b = true;
        this.h = false;
        this.f33698n = false;
        zu zuVar = new zu(this, context);
        this.d = zuVar;
        zuVar.f35517x = false;
        this.f33700s = document;
        this.f33695c = true;
        zuVar.setColorFilter(gvVar.getEmojiColorFilter());
        addView(zuVar);
        int i7 = ug.a1.M;
        ug.a1 a1Var = new ug.a1(1, context, gvVar.f35071w);
        this.f33697f = a1Var;
        a1Var.setAlpha(0.0f);
        a1Var.setScaleX(0.0f);
        a1Var.setScaleY(0.0f);
        f();
        addView(a1Var);
        d();
    }

    public cv(gv gvVar, Context context, long j3) {
        super(context);
        this.O = gvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.f33694b = true;
        this.h = false;
        this.f33698n = false;
        fi.v3 v3Var = new fi.v3(8, context, this);
        this.d = v3Var;
        v3Var.f35517x = false;
        this.f33699r = Long.valueOf(j3);
        this.f33695c = true;
        v3Var.setColorFilter(gvVar.getEmojiColorFilter());
        addView(v3Var);
        int i7 = ug.a1.M;
        ug.a1 a1Var = new ug.a1(1, context, gvVar.f35071w);
        this.f33697f = a1Var;
        a1Var.setAlpha(0.0f);
        a1Var.setScaleX(0.0f);
        a1Var.setScaleY(0.0f);
        f();
        addView(a1Var);
        d();
    }
}
