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
public class cw extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final gw J;
    public Long f25462a;
    public boolean f25463b;
    public final boolean f25464c;
    public final w9 d;
    public final kj0 f25465e;
    public final rg.c1 f25466f;
    public final boolean h;
    public final boolean f25467n;
    public Long f25468r;
    public TLRPC.Document f25469s;
    public ay v;
    public q5 f25470w;
    public boolean f25471x;
    public boolean f25472y;

    public cw(gw gwVar, Context context, int i10, int i11) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.h = true;
        this.f25467n = false;
        setBackground(org.telegram.ui.ActionBar.i6.M(gwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            kj0 kj0Var = new kj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.f25465e = kj0Var;
            kj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            kj0Var.R(this);
            kj0Var.J(true);
            kj0Var.start();
        } else {
            w9 w9Var = new w9(context);
            this.d = w9Var;
            w9Var.f32501w = false;
            w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(w9Var);
        }
        d();
    }

    private void setColor(int i10) {
        gw gwVar = this.J;
        int i11 = gwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = gwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        w9 w9Var = this.d;
        if (w9Var != null && !this.f25464c) {
            w9Var.setColorFilter(porterDuffColorFilter);
            w9Var.invalidate();
        }
        kj0 kj0Var = this.f25465e;
        if (kj0Var != null) {
            kj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        rg.c1 c1Var = this.f25466f;
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
        ai.l4 l4Var;
        q5 q5Var = this.f25470w;
        if (q5Var != null && (l4Var = q5Var.f29914k) != null) {
            if (l4Var.getLottieAnimation() != null) {
                l4Var.getLottieAnimation().M(0);
                l4Var.getLottieAnimation().stop();
            } else if (l4Var.getAnimation() != null) {
                l4Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        w9 w9Var = this.d;
        if (w9Var == null) {
            return;
        }
        if (this.f25471x && this.f25472y) {
            q5 q5Var = this.f25470w;
            if (q5Var == null && (this.f25469s != null || this.f25468r != null)) {
                w9Var.b();
                TLRPC.Document document = this.f25469s;
                gw gwVar = this.J;
                if (document != null) {
                    this.f25470w = q5.m(UserConfig.selectedAccount, gwVar.S, document);
                } else {
                    this.f25470w = q5.n(UserConfig.selectedAccount, this.f25468r.longValue(), null, gwVar.S);
                }
                this.f25470w.a(w9Var);
                w9Var.setImageDrawable(this.f25470w);
            } else {
                if (q5Var != null) {
                    q5Var.o(w9Var);
                    this.f25470w = null;
                }
                w9Var.b();
                ay ayVar = this.v;
                if (ayVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(ayVar.f24708b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            q5 q5Var2 = this.f25470w;
            if (q5Var2 != null) {
                q5Var2.o(w9Var);
                this.f25470w = null;
            }
            w9Var.b();
        }
        if (this.f25471x && this.f25472y) {
            w9Var.onAttachedToWindow();
        } else {
            w9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        gw gwVar = this.J;
        int k10 = gwVar.k();
        org.telegram.ui.ActionBar.d6 d6Var = gwVar.v;
        org.telegram.ui.ActionBar.i6.B1(background, k10, false);
        if (gwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Wk, d6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Me, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oe, d6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        kj0 kj0Var = this.f25465e;
        if (kj0Var != null && this.f25472y) {
            kj0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f25472y) {
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
        rg.c1 c1Var = this.f25466f;
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
        rg.c1 c1Var = this.f25466f;
        if (c1Var != null && !c1Var.h && (getDrawable() instanceof q5)) {
            if (((q5) getDrawable()).c()) {
                c1Var.setImageReceiver(null);
                c1Var.setColor(this.J.Q);
                return;
            }
            ai.l4 l4Var = ((q5) getDrawable()).f29914k;
            if (l4Var != null) {
                c1Var.setImageReceiver(l4Var);
                c1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j3;
        w9 w9Var = this.d;
        if ((w9Var != null && w9Var.getImageReceiver().getImageDrawable() == null && !this.J.P) || this.H == z10) {
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
            ofFloat.addUpdateListener(new k6(this, 19));
            this.I.addListener(new da(7, this, z10));
            ValueAnimator valueAnimator2 = this.I;
            if (zg.e0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.I.setInterpolator(tr.h);
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
        w9 w9Var = this.d;
        if (w9Var != null) {
            return w9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25471x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25471x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f25472y) {
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
            ay ayVar = this.v;
            if (ayVar != null && (stickerSet = ayVar.f24708b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f25469s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f25468r;
                    if (l4 != null && (f7 = q5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
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
        w9 w9Var = this.d;
        if (w9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            w9Var.layout(i14 - (w9Var.getMeasuredWidth() / 2), i15 - (w9Var.getMeasuredHeight() / 2), (w9Var.getMeasuredWidth() / 2) + i14, (w9Var.getMeasuredHeight() / 2) + i15);
        }
        rg.c1 c1Var = this.f25466f;
        if (c1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            c1Var.layout(i16 - c1Var.getMeasuredWidth(), i17 - c1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        w9 w9Var = this.d;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        rg.c1 c1Var = this.f25466f;
        if (c1Var != null) {
            c1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ai.l4 l4Var;
        q5 q5Var = this.f25470w;
        if (q5Var != null && (l4Var = q5Var.f29914k) != null) {
            if (l4Var.getAnimation() != null) {
                l4Var.getAnimation().y(0L, true, false);
            }
            l4Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f25469s;
        if ((document2 != null || this.f25468r != null) && document != null) {
            Long l4 = this.f25468r;
            if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = document2.f20048id;
            }
            if (j3 == document.f20048id) {
                return;
            }
        }
        q5 q5Var = this.f25470w;
        w9 w9Var = this.d;
        if (q5Var != null) {
            q5Var.o(w9Var);
            this.f25470w = null;
        }
        w9Var.b();
        this.f25469s = document;
        this.f25468r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f25469s;
        if ((document != null || this.f25468r != null) && j3 != 0) {
            Long l4 = this.f25468r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document.f20048id;
            }
            if (j10 == j3) {
                return;
            }
        }
        q5 q5Var = this.f25470w;
        w9 w9Var = this.d;
        Long l10 = null;
        if (q5Var != null) {
            q5Var.o(w9Var);
            this.f25470w = null;
        }
        w9Var.b();
        this.f25469s = null;
        if (j3 != 0) {
            l10 = Long.valueOf(j3);
        }
        this.f25468r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(ay ayVar) {
        if (ayVar != null && ayVar.f24708b == null) {
            ayVar = null;
        }
        ay ayVar2 = this.v;
        if (ayVar2 != null && ayVar != null && ayVar2.f24708b.f20069id == ayVar.f24708b.f20069id) {
            return;
        }
        q5 q5Var = this.f25470w;
        w9 w9Var = this.d;
        if (q5Var != null && this.f25469s == null && this.f25468r == null) {
            q5Var.o(w9Var);
            this.f25470w = null;
        }
        w9Var.b();
        this.v = ayVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public cw(gw gwVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.h = false;
        this.f25467n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.i6.Y(gwVar.k(), 8, 8));
        }
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.f32501w = false;
        w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(w9Var);
    }

    public cw(gw gwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.f25463b = true;
        this.h = false;
        this.f25467n = false;
        zv zvVar = new zv(this, context);
        this.d = zvVar;
        zvVar.f32501w = false;
        this.f25469s = document;
        this.f25464c = true;
        zvVar.setColorFilter(gwVar.getEmojiColorFilter());
        addView(zvVar);
        int i10 = rg.c1.L;
        rg.c1 c1Var = new rg.c1(context, 1, gwVar.v);
        this.f25466f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }

    public cw(gw gwVar, Context context, long j3) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.f25463b = true;
        this.h = false;
        this.f25467n = false;
        ai.y5 y5Var = new ai.y5(this, context, 8);
        this.d = y5Var;
        y5Var.f32501w = false;
        this.f25468r = Long.valueOf(j3);
        this.f25464c = true;
        y5Var.setColorFilter(gwVar.getEmojiColorFilter());
        addView(y5Var);
        int i10 = rg.c1.L;
        rg.c1 c1Var = new rg.c1(context, 1, gwVar.v);
        this.f25466f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }
}
