package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public class zv extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final dw J;
    public Long f30961a;
    public boolean f30962b;
    public final boolean f30963c;
    public final v9 d;
    public final kj0 e;
    public final rg.b1 f30964f;
    public final boolean h;
    public final boolean f30965n;
    public Long f30966r;
    public TLRPC.Document f30967s;
    public xx v;
    public p5 f30968w;
    public boolean f30969x;
    public boolean f30970y;

    public zv(dw dwVar, Context context, int i10, int i11) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.h = true;
        this.f30965n = false;
        setBackground(org.telegram.ui.ActionBar.j6.M(dwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            kj0 kj0Var = new kj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = kj0Var;
            kj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            kj0Var.R(this);
            kj0Var.J(true);
            kj0Var.start();
        } else {
            v9 v9Var = new v9(context);
            this.d = v9Var;
            v9Var.f29041w = false;
            v9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(v9Var);
        }
        d();
    }

    private void setColor(int i10) {
        dw dwVar = this.J;
        int i11 = dwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = dwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        v9 v9Var = this.d;
        if (v9Var != null && !this.f30963c) {
            v9Var.setColorFilter(porterDuffColorFilter);
            v9Var.invalidate();
        }
        kj0 kj0Var = this.e;
        if (kj0Var != null) {
            kj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        rg.b1 b1Var = this.f30964f;
        if (b1Var == null) {
            return;
        }
        this.E = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            b1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        b1Var.setImageDrawable(mutate);
    }

    public final void b() {
        ai.l4 l4Var;
        p5 p5Var = this.f30968w;
        if (p5Var != null && (l4Var = p5Var.f27256k) != null) {
            if (l4Var.getLottieAnimation() != null) {
                l4Var.getLottieAnimation().M(0);
                l4Var.getLottieAnimation().stop();
            } else if (l4Var.getAnimation() != null) {
                l4Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        v9 v9Var = this.d;
        if (v9Var == null) {
            return;
        }
        if (this.f30969x && this.f30970y) {
            p5 p5Var = this.f30968w;
            if (p5Var == null && (this.f30967s != null || this.f30966r != null)) {
                v9Var.b();
                TLRPC.Document document = this.f30967s;
                dw dwVar = this.J;
                if (document != null) {
                    this.f30968w = p5.m(UserConfig.selectedAccount, dwVar.S, document);
                } else {
                    this.f30968w = p5.n(UserConfig.selectedAccount, this.f30966r.longValue(), null, dwVar.S);
                }
                this.f30968w.a(v9Var);
                v9Var.setImageDrawable(this.f30968w);
            } else {
                if (p5Var != null) {
                    p5Var.o(v9Var);
                    this.f30968w = null;
                }
                v9Var.b();
                xx xxVar = this.v;
                if (xxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(xxVar.f30422b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            p5 p5Var2 = this.f30968w;
            if (p5Var2 != null) {
                p5Var2.o(v9Var);
                this.f30968w = null;
            }
            v9Var.b();
        }
        if (this.f30969x && this.f30970y) {
            v9Var.onAttachedToWindow();
        } else {
            v9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        dw dwVar = this.J;
        int k10 = dwVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = dwVar.v;
        org.telegram.ui.ActionBar.j6.B1(background, k10, false);
        if (dwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        kj0 kj0Var = this.e;
        if (kj0Var != null && this.f30970y) {
            kj0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f30970y) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
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
        rg.b1 b1Var = this.f30964f;
        b1Var.setScaleX(f11);
        b1Var.setScaleY(this.F);
        b1Var.setAlpha(this.F);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        b1Var.setVisibility(i10);
    }

    public final void f() {
        rg.b1 b1Var = this.f30964f;
        if (b1Var != null && !b1Var.h && (getDrawable() instanceof p5)) {
            if (((p5) getDrawable()).c()) {
                b1Var.setImageReceiver(null);
                b1Var.setColor(this.J.Q);
                return;
            }
            ai.l4 l4Var = ((p5) getDrawable()).f27256k;
            if (l4Var != null) {
                b1Var.setImageReceiver(l4Var);
                b1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j3;
        v9 v9Var = this.d;
        if ((v9Var != null && v9Var.getImageReceiver().getImageDrawable() == null && !this.J.P) || this.H == z10) {
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
            ofFloat.addUpdateListener(new j6(this, 19));
            this.I.addListener(new ba(7, this, z10));
            ValueAnimator valueAnimator2 = this.I;
            if (zg.f0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.I.setInterpolator(qr.h);
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
        v9 v9Var = this.d;
        if (v9Var != null) {
            return v9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30969x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30969x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f30970y) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TLRPC.Document f7;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            xx xxVar = this.v;
            if (xxVar != null && (stickerSet = xxVar.f30422b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f30967s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f30966r;
                    if (l4 != null && (f7 = p5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
                        contentDescription = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    }
                }
            }
        }
        Boolean bool = this.E;
        if (bool != null && !bool.booleanValue()) {
            String string = LocaleController.getString(R.string.FeaturedStickersShort);
            if (contentDescription == null) {
                contentDescription = string;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + string;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.H);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        v9 v9Var = this.d;
        if (v9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            v9Var.layout(i14 - (v9Var.getMeasuredWidth() / 2), i15 - (v9Var.getMeasuredHeight() / 2), (v9Var.getMeasuredWidth() / 2) + i14, (v9Var.getMeasuredHeight() / 2) + i15);
        }
        rg.b1 b1Var = this.f30964f;
        if (b1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            b1Var.layout(i16 - b1Var.getMeasuredWidth(), i17 - b1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        v9 v9Var = this.d;
        if (v9Var != null) {
            v9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        rg.b1 b1Var = this.f30964f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ai.l4 l4Var;
        p5 p5Var = this.f30968w;
        if (p5Var != null && (l4Var = p5Var.f27256k) != null) {
            if (l4Var.getAnimation() != null) {
                l4Var.getAnimation().y(0L, true, false);
            }
            l4Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f30967s;
        if ((document2 != null || this.f30966r != null) && document != null) {
            Long l4 = this.f30966r;
            if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = document2.f18349id;
            }
            if (j3 == document.f18349id) {
                return;
            }
        }
        p5 p5Var = this.f30968w;
        v9 v9Var = this.d;
        if (p5Var != null) {
            p5Var.o(v9Var);
            this.f30968w = null;
        }
        v9Var.b();
        this.f30967s = document;
        this.f30966r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f30967s;
        if ((document != null || this.f30966r != null) && j3 != 0) {
            Long l4 = this.f30966r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document.f18349id;
            }
            if (j10 == j3) {
                return;
            }
        }
        p5 p5Var = this.f30968w;
        v9 v9Var = this.d;
        Long l10 = null;
        if (p5Var != null) {
            p5Var.o(v9Var);
            this.f30968w = null;
        }
        v9Var.b();
        this.f30967s = null;
        if (j3 != 0) {
            l10 = Long.valueOf(j3);
        }
        this.f30966r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(xx xxVar) {
        if (xxVar != null && xxVar.f30422b == null) {
            xxVar = null;
        }
        xx xxVar2 = this.v;
        if (xxVar2 != null && xxVar != null && xxVar2.f30422b.f18370id == xxVar.f30422b.f18370id) {
            return;
        }
        p5 p5Var = this.f30968w;
        v9 v9Var = this.d;
        if (p5Var != null && this.f30967s == null && this.f30966r == null) {
            p5Var.o(v9Var);
            this.f30968w = null;
        }
        v9Var.b();
        this.v = xxVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public zv(dw dwVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.h = false;
        this.f30965n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.Y(dwVar.k(), 8, 8));
        }
        v9 v9Var = new v9(context);
        this.d = v9Var;
        v9Var.f29041w = false;
        v9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(v9Var);
    }

    public zv(dw dwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.f30962b = true;
        this.h = false;
        this.f30965n = false;
        wv wvVar = new wv(this, context);
        this.d = wvVar;
        wvVar.f29041w = false;
        this.f30967s = document;
        this.f30963c = true;
        wvVar.setColorFilter(dwVar.getEmojiColorFilter());
        addView(wvVar);
        int i10 = rg.b1.L;
        rg.b1 b1Var = new rg.b1(context, 1, dwVar.v);
        this.f30964f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }

    public zv(dw dwVar, Context context, long j3) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.f30962b = true;
        this.h = false;
        this.f30965n = false;
        ai.z5 z5Var = new ai.z5(this, context, 8);
        this.d = z5Var;
        z5Var.f29041w = false;
        this.f30966r = Long.valueOf(j3);
        this.f30963c = true;
        z5Var.setColorFilter(dwVar.getEmojiColorFilter());
        addView(z5Var);
        int i10 = rg.b1.L;
        rg.b1 b1Var = new rg.b1(context, 1, dwVar.v);
        this.f30964f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }
}
