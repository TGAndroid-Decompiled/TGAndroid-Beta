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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public class pw extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final tw J;
    public Long f29870a;
    public boolean f29871b;
    public final boolean f29872c;
    public final y9 d;
    public final dk0 f29873e;
    public final rg.c1 f29874f;
    public final boolean h;
    public final boolean f29875n;
    public Long f29876r;
    public TLRPC.Document f29877s;
    public oy v;
    public s5 f29878w;
    public boolean f29879x;
    public boolean f29880y;

    public pw(tw twVar, Context context, int i10) {
        super(context);
        this.J = twVar;
        setFocusable(true);
        this.h = true;
        this.f29875n = false;
        setBackground(org.telegram.ui.ActionBar.i6.N(twVar.k(), 0, 0));
        dk0 dk0Var = new dk0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
        this.f29873e = dk0Var;
        dk0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
        dk0Var.R(this);
        dk0Var.J(true);
        dk0Var.start();
        d();
    }

    private void setColor(int i10) {
        tw twVar = this.J;
        int i11 = twVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = twVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        y9 y9Var = this.d;
        if (y9Var != null && !this.f29872c) {
            y9Var.setColorFilter(porterDuffColorFilter);
            y9Var.invalidate();
        }
        dk0 dk0Var = this.f29873e;
        if (dk0Var != null) {
            dk0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        rg.c1 c1Var = this.f29874f;
        if (c1Var == null) {
            return;
        }
        this.E = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            c1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        c1Var.setImageDrawable(mutate);
    }

    public final void b() {
        ai.m4 m4Var;
        s5 s5Var = this.f29878w;
        if (s5Var != null && (m4Var = s5Var.f30680k) != null) {
            if (m4Var.getLottieAnimation() != null) {
                m4Var.getLottieAnimation().M(0);
                m4Var.getLottieAnimation().stop();
            } else if (m4Var.getAnimation() != null) {
                m4Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        y9 y9Var = this.d;
        if (y9Var == null) {
            return;
        }
        if (this.f29879x && this.f29880y) {
            s5 s5Var = this.f29878w;
            if (s5Var == null && (this.f29877s != null || this.f29876r != null)) {
                y9Var.b();
                TLRPC.Document document = this.f29877s;
                tw twVar = this.J;
                if (document != null) {
                    this.f29878w = s5.m(UserConfig.selectedAccount, twVar.S, document);
                } else {
                    this.f29878w = s5.n(UserConfig.selectedAccount, this.f29876r.longValue(), null, twVar.S);
                }
                this.f29878w.a(y9Var);
                y9Var.setImageDrawable(this.f29878w);
            } else {
                if (s5Var != null) {
                    s5Var.o(y9Var);
                    this.f29878w = null;
                }
                y9Var.b();
                oy oyVar = this.v;
                if (oyVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(oyVar.f29619b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            s5 s5Var2 = this.f29878w;
            if (s5Var2 != null) {
                s5Var2.o(y9Var);
                this.f29878w = null;
            }
            y9Var.b();
        }
        if (this.f29879x && this.f29880y) {
            y9Var.onAttachedToWindow();
        } else {
            y9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        tw twVar = this.J;
        int k10 = twVar.k();
        org.telegram.ui.ActionBar.e6 e6Var = twVar.v;
        org.telegram.ui.ActionBar.i6.C1(background, k10, false);
        if (twVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Wk, e6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Me, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oe, e6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dk0 dk0Var = this.f29873e;
        if (dk0Var != null && this.f29880y) {
            dk0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f29880y) {
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
        rg.c1 c1Var = this.f29874f;
        c1Var.setScaleX(f11);
        c1Var.setScaleY(this.F);
        c1Var.setAlpha(this.F);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        c1Var.setVisibility(i10);
    }

    public final void f() {
        rg.c1 c1Var = this.f29874f;
        if (c1Var != null && !c1Var.h && (getDrawable() instanceof s5)) {
            if (((s5) getDrawable()).c()) {
                c1Var.setImageReceiver(null);
                c1Var.setColor(this.J.Q);
                return;
            }
            ai.m4 m4Var = ((s5) getDrawable()).f30680k;
            if (m4Var != null) {
                c1Var.setImageReceiver(m4Var);
                c1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j3;
        y9 y9Var = this.d;
        if ((y9Var != null && y9Var.getImageReceiver().getImageDrawable() == null && !this.J.P) || this.H == z10) {
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
            ofFloat.addUpdateListener(new m6(this, 20));
            this.I.addListener(new fa(7, this, z10));
            ValueAnimator valueAnimator2 = this.I;
            if (zg.d0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.I.setInterpolator(is.h);
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
        y9 y9Var = this.d;
        if (y9Var != null) {
            return y9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29879x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29879x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f29880y) {
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
            oy oyVar = this.v;
            if (oyVar != null && (stickerSet = oyVar.f29619b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f29877s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f29876r;
                    if (l4 != null && (f7 = s5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
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
        y9 y9Var = this.d;
        if (y9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            y9Var.layout(i14 - (y9Var.getMeasuredWidth() / 2), i15 - (y9Var.getMeasuredHeight() / 2), (y9Var.getMeasuredWidth() / 2) + i14, (y9Var.getMeasuredHeight() / 2) + i15);
        }
        rg.c1 c1Var = this.f29874f;
        if (c1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            c1Var.layout(i16 - c1Var.getMeasuredWidth(), i17 - c1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        y9 y9Var = this.d;
        if (y9Var != null) {
            y9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        rg.c1 c1Var = this.f29874f;
        if (c1Var != null) {
            c1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ai.m4 m4Var;
        s5 s5Var = this.f29878w;
        if (s5Var != null && (m4Var = s5Var.f30680k) != null) {
            if (m4Var.getAnimation() != null) {
                m4Var.getAnimation().y(0L, true, false);
            }
            m4Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f29877s;
        if ((document2 != null || this.f29876r != null) && document != null) {
            Long l4 = this.f29876r;
            if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = document2.f20048id;
            }
            if (j3 == document.f20048id) {
                return;
            }
        }
        s5 s5Var = this.f29878w;
        y9 y9Var = this.d;
        if (s5Var != null) {
            s5Var.o(y9Var);
            this.f29878w = null;
        }
        y9Var.b();
        this.f29877s = document;
        this.f29876r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f29877s;
        if ((document != null || this.f29876r != null) && j3 != 0) {
            Long l4 = this.f29876r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document.f20048id;
            }
            if (j10 == j3) {
                return;
            }
        }
        s5 s5Var = this.f29878w;
        y9 y9Var = this.d;
        Long l10 = null;
        if (s5Var != null) {
            s5Var.o(y9Var);
            this.f29878w = null;
        }
        y9Var.b();
        this.f29877s = null;
        if (j3 != 0) {
            l10 = Long.valueOf(j3);
        }
        this.f29876r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(oy oyVar) {
        if (oyVar != null && oyVar.f29619b == null) {
            oyVar = null;
        }
        oy oyVar2 = this.v;
        if (oyVar2 != null && oyVar != null && oyVar2.f29619b.f20069id == oyVar.f29619b.f20069id) {
            return;
        }
        s5 s5Var = this.f29878w;
        y9 y9Var = this.d;
        if (s5Var != null && this.f29877s == null && this.f29876r == null) {
            s5Var.o(y9Var);
            this.f29878w = null;
        }
        y9Var.b();
        this.v = oyVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public pw(tw twVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = twVar;
        setFocusable(true);
        this.h = false;
        this.f29875n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.i6.Z(twVar.k(), 8, 8));
        }
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.f33143w = false;
        y9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(y9Var);
    }

    public pw(tw twVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = twVar;
        setFocusable(true);
        this.f29871b = true;
        this.h = false;
        this.f29875n = false;
        mw mwVar = new mw(this, context);
        this.d = mwVar;
        mwVar.f33143w = false;
        this.f29877s = document;
        this.f29872c = true;
        mwVar.setColorFilter(twVar.getEmojiColorFilter());
        addView(mwVar);
        int i10 = rg.c1.L;
        rg.c1 c1Var = new rg.c1(context, 1, twVar.v);
        this.f29874f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }

    public pw(tw twVar, Context context, long j3) {
        super(context);
        this.J = twVar;
        setFocusable(true);
        this.f29871b = true;
        this.h = false;
        this.f29875n = false;
        ai.z5 z5Var = new ai.z5(this, context, 8);
        this.d = z5Var;
        z5Var.f33143w = false;
        this.f29876r = Long.valueOf(j3);
        this.f29872c = true;
        z5Var.setColorFilter(twVar.getEmojiColorFilter());
        addView(z5Var);
        int i10 = rg.c1.L;
        rg.c1 c1Var = new rg.c1(context, 1, twVar.v);
        this.f29874f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }
}
