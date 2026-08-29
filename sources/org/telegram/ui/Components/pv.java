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
public class pv extends ViewGroup {
    public Boolean A;
    public float B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public final tv F;
    public Long f31777a;
    public boolean f31778b;
    public final boolean f31779c;
    public final t9 d;
    public final xi0 f31780e;
    public final cg.t1 f31781f;
    public final boolean h;
    public final boolean f31782n;
    public Long f31783r;
    public TLRPC.Document f31784s;
    public rx v;
    public p5 f31785w;
    public boolean f31786x;
    public boolean f31787y;

    public pv(tv tvVar, Context context, int i10, int i11) {
        super(context);
        this.F = tvVar;
        setFocusable(true);
        this.h = true;
        this.f31782n = false;
        setBackground(org.telegram.ui.ActionBar.g6.M(tvVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            xi0 xi0Var = new xi0(i11, j7.l1.k(i11, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.f31780e = xi0Var;
            xi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            xi0Var.f34753r0 = this;
            xi0Var.H(true);
            xi0Var.start();
        } else {
            t9 t9Var = new t9(context);
            this.d = t9Var;
            t9Var.f32911w = false;
            t9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(t9Var);
        }
        d();
    }

    private void setColor(int i10) {
        tv tvVar = this.F;
        int i11 = tvVar.P;
        if (i11 == 5 || i11 == 7) {
            i10 = tvVar.M;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        t9 t9Var = this.d;
        if (t9Var != null && !this.f31779c) {
            t9Var.setColorFilter(porterDuffColorFilter);
            t9Var.invalidate();
        }
        xi0 xi0Var = this.f31780e;
        if (xi0Var != null) {
            xi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        cg.t1 t1Var = this.f31781f;
        if (t1Var == null) {
            return;
        }
        this.A = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            t1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        t1Var.setImageDrawable(mutate);
    }

    public final void b() {
        lh.x2 x2Var;
        p5 p5Var = this.f31785w;
        if (p5Var != null && (x2Var = p5Var.f31593k) != null) {
            if (x2Var.getLottieAnimation() != null) {
                x2Var.getLottieAnimation().K(0);
                x2Var.getLottieAnimation().stop();
            } else if (x2Var.getAnimation() != null) {
                x2Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        t9 t9Var = this.d;
        if (t9Var == null) {
            return;
        }
        if (this.f31786x && this.f31787y) {
            p5 p5Var = this.f31785w;
            if (p5Var == null && (this.f31784s != null || this.f31783r != null)) {
                t9Var.b();
                TLRPC.Document document = this.f31784s;
                tv tvVar = this.F;
                if (document != null) {
                    this.f31785w = p5.m(UserConfig.selectedAccount, tvVar.O, document);
                } else {
                    this.f31785w = p5.n(UserConfig.selectedAccount, this.f31783r.longValue(), null, tvVar.O);
                }
                this.f31785w.a(t9Var);
                t9Var.setImageDrawable(this.f31785w);
            } else {
                if (p5Var != null) {
                    p5Var.o(t9Var);
                    this.f31785w = null;
                }
                t9Var.b();
                rx rxVar = this.v;
                if (rxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(rxVar.f32402b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            p5 p5Var2 = this.f31785w;
            if (p5Var2 != null) {
                p5Var2.o(t9Var);
                this.f31785w = null;
            }
            t9Var.b();
        }
        if (this.f31786x && this.f31787y) {
            t9Var.onAttachedToWindow();
        } else {
            t9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        tv tvVar = this.F;
        int k9 = tvVar.k();
        org.telegram.ui.ActionBar.c6 c6Var = tvVar.v;
        org.telegram.ui.ActionBar.g6.B1(background, k9, false);
        if (tvVar.L) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.C) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.C, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oe, c6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xi0 xi0Var = this.f31780e;
        if (xi0Var != null && this.f31787y) {
            xi0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f31787y) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        float f9;
        int i10;
        float f10 = this.B;
        float f11 = 0.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        if (Math.abs(f10 - f9) < 0.01f) {
            return;
        }
        if (z10) {
            f11 = 1.0f;
        }
        this.B = f11;
        cg.t1 t1Var = this.f31781f;
        t1Var.setScaleX(f11);
        t1Var.setScaleY(this.B);
        t1Var.setAlpha(this.B);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        t1Var.setVisibility(i10);
    }

    public final void f() {
        cg.t1 t1Var = this.f31781f;
        if (t1Var != null && !t1Var.h && (getDrawable() instanceof p5)) {
            if (((p5) getDrawable()).c()) {
                t1Var.setImageReceiver(null);
                t1Var.setColor(this.F.M);
                return;
            }
            lh.x2 x2Var = ((p5) getDrawable()).f31593k;
            if (x2Var != null) {
                t1Var.setImageReceiver(x2Var);
                t1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j10;
        t9 t9Var = this.d;
        if ((t9Var != null && t9Var.getImageReceiver().getImageDrawable() == null && !this.F.L) || this.D == z10) {
            return;
        }
        this.D = z10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        if (!z10) {
            b();
        }
        float f9 = 0.0f;
        if (z11) {
            float f10 = this.C;
            if (z10) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new j6(this, 19));
            this.E.addListener(new z9(7, this, z10));
            ValueAnimator valueAnimator2 = this.E;
            if (kg.g0.d()) {
                j10 = 0;
            } else {
                j10 = 350;
            }
            valueAnimator2.setDuration(j10);
            this.E.setInterpolator(jr.h);
            this.E.start();
            return;
        }
        if (z10) {
            f9 = 1.0f;
        }
        this.C = f9;
        d();
    }

    public Drawable getDrawable() {
        t9 t9Var = this.d;
        if (t9Var != null) {
            return t9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (kg.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31786x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31786x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f31787y) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TLRPC.Document f9;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            rx rxVar = this.v;
            if (rxVar != null && (stickerSet = rxVar.f32402b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f31784s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l10 = this.f31783r;
                    if (l10 != null && (f9 = p5.f(UserConfig.selectedAccount, l10.longValue())) != null) {
                        contentDescription = MessageObject.findAnimatedEmojiEmoticon(f9, null);
                    }
                }
            }
        }
        Boolean bool = this.A;
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
        accessibilityNodeInfo.setSelected(this.D);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        t9 t9Var = this.d;
        if (t9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            t9Var.layout(i14 - (t9Var.getMeasuredWidth() / 2), i15 - (t9Var.getMeasuredHeight() / 2), (t9Var.getMeasuredWidth() / 2) + i14, (t9Var.getMeasuredHeight() / 2) + i15);
        }
        cg.t1 t1Var = this.f31781f;
        if (t1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            t1Var.layout(i16 - t1Var.getMeasuredWidth(), i17 - t1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        t9 t9Var = this.d;
        if (t9Var != null) {
            t9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        cg.t1 t1Var = this.f31781f;
        if (t1Var != null) {
            t1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        lh.x2 x2Var;
        p5 p5Var = this.f31785w;
        if (p5Var != null && (x2Var = p5Var.f31593k) != null) {
            if (x2Var.getAnimation() != null) {
                x2Var.getAnimation().y(0L, true, false);
            }
            x2Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f31784s;
        if ((document2 != null || this.f31783r != null) && document != null) {
            Long l10 = this.f31783r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document2.f22398id;
            }
            if (j10 == document.f22398id) {
                return;
            }
        }
        p5 p5Var = this.f31785w;
        t9 t9Var = this.d;
        if (p5Var != null) {
            p5Var.o(t9Var);
            this.f31785w = null;
        }
        t9Var.b();
        this.f31784s = document;
        this.f31783r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f31784s;
        if ((document != null || this.f31783r != null) && j10 != 0) {
            Long l10 = this.f31783r;
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = document.f22398id;
            }
            if (j11 == j10) {
                return;
            }
        }
        p5 p5Var = this.f31785w;
        t9 t9Var = this.d;
        Long l11 = null;
        if (p5Var != null) {
            p5Var.o(t9Var);
            this.f31785w = null;
        }
        t9Var.b();
        this.f31784s = null;
        if (j10 != 0) {
            l11 = Long.valueOf(j10);
        }
        this.f31783r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(rx rxVar) {
        if (rxVar != null && rxVar.f32402b == null) {
            rxVar = null;
        }
        rx rxVar2 = this.v;
        if (rxVar2 != null && rxVar != null && rxVar2.f32402b.f22419id == rxVar.f32402b.f22419id) {
            return;
        }
        p5 p5Var = this.f31785w;
        t9 t9Var = this.d;
        if (p5Var != null && this.f31784s == null && this.f31783r == null) {
            p5Var.o(t9Var);
            this.f31785w = null;
        }
        t9Var.b();
        this.v = rxVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (kg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public pv(tv tvVar, Context context, int i10, boolean z10) {
        super(context);
        this.F = tvVar;
        setFocusable(true);
        this.h = false;
        this.f31782n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.g6.Y(tvVar.k(), 8, 8));
        }
        t9 t9Var = new t9(context);
        this.d = t9Var;
        t9Var.f32911w = false;
        t9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(t9Var);
    }

    public pv(tv tvVar, Context context, TLRPC.Document document) {
        super(context);
        this.F = tvVar;
        setFocusable(true);
        this.f31778b = true;
        this.h = false;
        this.f31782n = false;
        mv mvVar = new mv(this, context);
        this.d = mvVar;
        mvVar.f32911w = false;
        this.f31784s = document;
        this.f31779c = true;
        mvVar.setColorFilter(tvVar.getEmojiColorFilter());
        addView(mvVar);
        int i10 = cg.t1.H;
        cg.t1 t1Var = new cg.t1(context, 1, tvVar.v);
        this.f31781f = t1Var;
        t1Var.setAlpha(0.0f);
        t1Var.setScaleX(0.0f);
        t1Var.setScaleY(0.0f);
        f();
        addView(t1Var);
        d();
    }

    public pv(tv tvVar, Context context, long j10) {
        super(context);
        this.F = tvVar;
        setFocusable(true);
        this.f31778b = true;
        this.h = false;
        this.f31782n = false;
        lh.y3 y3Var = new lh.y3(this, context, 7);
        this.d = y3Var;
        y3Var.f32911w = false;
        this.f31783r = Long.valueOf(j10);
        this.f31779c = true;
        y3Var.setColorFilter(tvVar.getEmojiColorFilter());
        addView(y3Var);
        int i10 = cg.t1.H;
        cg.t1 t1Var = new cg.t1(context, 1, tvVar.v);
        this.f31781f = t1Var;
        t1Var.setAlpha(0.0f);
        t1Var.setScaleX(0.0f);
        t1Var.setScaleY(0.0f);
        f();
        addView(t1Var);
        d();
    }
}
