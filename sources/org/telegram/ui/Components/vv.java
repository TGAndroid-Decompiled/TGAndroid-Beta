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
public class vv extends ViewGroup {
    public Boolean B;
    public float C;
    public float D;
    public boolean E;
    public ValueAnimator F;
    public final zv G;
    public Long f32544a;
    public boolean f32545b;
    public final boolean f32546c;
    public final p9 d;
    public final ij0 f32547e;
    public final fg.r1 f32548f;
    public final boolean h;
    public final boolean f32549n;
    public Long f32550r;
    public TLRPC.Document f32551s;
    public xx v;
    public l5 f32552w;
    public boolean f32553x;
    public boolean f32554y;

    public vv(zv zvVar, Context context, int i10, int i11) {
        super(context);
        this.G = zvVar;
        setFocusable(true);
        this.h = true;
        this.f32549n = false;
        setBackground(org.telegram.ui.ActionBar.k6.M(zvVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            ij0 ij0Var = new ij0(i11, l.d.j(i11, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.f32547e = ij0Var;
            ij0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            ij0Var.f27835s0 = this;
            ij0Var.H(true);
            ij0Var.start();
        } else {
            p9 p9Var = new p9(context);
            this.d = p9Var;
            p9Var.f30006w = false;
            p9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(p9Var);
        }
        d();
    }

    private void setColor(int i10) {
        zv zvVar = this.G;
        int i11 = zvVar.Q;
        if (i11 == 5 || i11 == 7) {
            i10 = zvVar.N;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        p9 p9Var = this.d;
        if (p9Var != null && !this.f32546c) {
            p9Var.setColorFilter(porterDuffColorFilter);
            p9Var.invalidate();
        }
        ij0 ij0Var = this.f32547e;
        if (ij0Var != null) {
            ij0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        fg.r1 r1Var = this.f32548f;
        if (r1Var == null) {
            return;
        }
        this.B = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            r1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        r1Var.setImageDrawable(mutate);
    }

    public final void b() {
        oh.z2 z2Var;
        l5 l5Var = this.f32552w;
        if (l5Var != null && (z2Var = l5Var.f28604k) != null) {
            if (z2Var.getLottieAnimation() != null) {
                z2Var.getLottieAnimation().K(0);
                z2Var.getLottieAnimation().stop();
            } else if (z2Var.getAnimation() != null) {
                z2Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        p9 p9Var = this.d;
        if (p9Var == null) {
            return;
        }
        if (this.f32553x && this.f32554y) {
            l5 l5Var = this.f32552w;
            if (l5Var == null && (this.f32551s != null || this.f32550r != null)) {
                p9Var.b();
                TLRPC.Document document = this.f32551s;
                zv zvVar = this.G;
                if (document != null) {
                    this.f32552w = l5.m(UserConfig.selectedAccount, zvVar.P, document);
                } else {
                    this.f32552w = l5.n(UserConfig.selectedAccount, this.f32550r.longValue(), null, zvVar.P);
                }
                this.f32552w.a(p9Var);
                p9Var.setImageDrawable(this.f32552w);
            } else {
                if (l5Var != null) {
                    l5Var.o(p9Var);
                    this.f32552w = null;
                }
                p9Var.b();
                xx xxVar = this.v;
                if (xxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(xxVar.f33189b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            l5 l5Var2 = this.f32552w;
            if (l5Var2 != null) {
                l5Var2.o(p9Var);
                this.f32552w = null;
            }
            p9Var.b();
        }
        if (this.f32553x && this.f32554y) {
            p9Var.onAttachedToWindow();
        } else {
            p9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        zv zvVar = this.G;
        int k10 = zvVar.k();
        org.telegram.ui.ActionBar.g6 g6Var = zvVar.v;
        org.telegram.ui.ActionBar.k6.B1(background, k10, false);
        if (zvVar.M) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.D) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.D, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Me, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oe, g6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ij0 ij0Var = this.f32547e;
        if (ij0Var != null && this.f32554y) {
            ij0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f32554y) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z4) {
        float f10;
        int i10;
        float f11 = this.C;
        float f12 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(f11 - f10) < 0.01f) {
            return;
        }
        if (z4) {
            f12 = 1.0f;
        }
        this.C = f12;
        fg.r1 r1Var = this.f32548f;
        r1Var.setScaleX(f12);
        r1Var.setScaleY(this.C);
        r1Var.setAlpha(this.C);
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        r1Var.setVisibility(i10);
    }

    public final void f() {
        fg.r1 r1Var = this.f32548f;
        if (r1Var != null && !r1Var.h && (getDrawable() instanceof l5)) {
            if (((l5) getDrawable()).c()) {
                r1Var.setImageReceiver(null);
                r1Var.setColor(this.G.N);
                return;
            }
            oh.z2 z2Var = ((l5) getDrawable()).f28604k;
            if (z2Var != null) {
                r1Var.setImageReceiver(z2Var);
                r1Var.invalidate();
            }
        }
    }

    public final void g(boolean z4, boolean z10) {
        long j10;
        p9 p9Var = this.d;
        if ((p9Var != null && p9Var.getImageReceiver().getImageDrawable() == null && !this.G.M) || this.E == z4) {
            return;
        }
        this.E = z4;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        if (!z4) {
            b();
        }
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.D;
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new f6(this, 19));
            this.F.addListener(new eg.u2(27, this, z4));
            ValueAnimator valueAnimator2 = this.F;
            if (ng.g0.d()) {
                j10 = 0;
            } else {
                j10 = 350;
            }
            valueAnimator2.setDuration(j10);
            this.F.setInterpolator(pr.h);
            this.F.start();
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        this.D = f10;
        d();
    }

    public Drawable getDrawable() {
        p9 p9Var = this.d;
        if (p9Var != null) {
            return p9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (ng.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32553x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32553x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f32554y) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TLRPC.Document f10;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            xx xxVar = this.v;
            if (xxVar != null && (stickerSet = xxVar.f33189b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f32551s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l10 = this.f32550r;
                    if (l10 != null && (f10 = l5.f(UserConfig.selectedAccount, l10.longValue())) != null) {
                        contentDescription = MessageObject.findAnimatedEmojiEmoticon(f10, null);
                    }
                }
            }
        }
        Boolean bool = this.B;
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
        accessibilityNodeInfo.setSelected(this.E);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        p9 p9Var = this.d;
        if (p9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            p9Var.layout(i14 - (p9Var.getMeasuredWidth() / 2), i15 - (p9Var.getMeasuredHeight() / 2), (p9Var.getMeasuredWidth() / 2) + i14, (p9Var.getMeasuredHeight() / 2) + i15);
        }
        fg.r1 r1Var = this.f32548f;
        if (r1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            r1Var.layout(i16 - r1Var.getMeasuredWidth(), i17 - r1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        p9 p9Var = this.d;
        if (p9Var != null) {
            p9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        fg.r1 r1Var = this.f32548f;
        if (r1Var != null) {
            r1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        oh.z2 z2Var;
        l5 l5Var = this.f32552w;
        if (l5Var != null && (z2Var = l5Var.f28604k) != null) {
            if (z2Var.getAnimation() != null) {
                z2Var.getAnimation().y(0L, true, false);
            }
            z2Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f32551s;
        if ((document2 != null || this.f32550r != null) && document != null) {
            Long l10 = this.f32550r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document2.f20849id;
            }
            if (j10 == document.f20849id) {
                return;
            }
        }
        l5 l5Var = this.f32552w;
        p9 p9Var = this.d;
        if (l5Var != null) {
            l5Var.o(p9Var);
            this.f32552w = null;
        }
        p9Var.b();
        this.f32551s = document;
        this.f32550r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f32551s;
        if ((document != null || this.f32550r != null) && j10 != 0) {
            Long l10 = this.f32550r;
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = document.f20849id;
            }
            if (j11 == j10) {
                return;
            }
        }
        l5 l5Var = this.f32552w;
        p9 p9Var = this.d;
        Long l11 = null;
        if (l5Var != null) {
            l5Var.o(p9Var);
            this.f32552w = null;
        }
        p9Var.b();
        this.f32551s = null;
        if (j10 != 0) {
            l11 = Long.valueOf(j10);
        }
        this.f32550r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(xx xxVar) {
        if (xxVar != null && xxVar.f33189b == null) {
            xxVar = null;
        }
        xx xxVar2 = this.v;
        if (xxVar2 != null && xxVar != null && xxVar2.f33189b.f20870id == xxVar.f33189b.f20870id) {
            return;
        }
        l5 l5Var = this.f32552w;
        p9 p9Var = this.d;
        if (l5Var != null && this.f32551s == null && this.f32550r == null) {
            l5Var.o(p9Var);
            this.f32552w = null;
        }
        p9Var.b();
        this.v = xxVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ng.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public vv(zv zvVar, Context context, int i10, boolean z4) {
        super(context);
        this.G = zvVar;
        setFocusable(true);
        this.h = false;
        this.f32549n = z4;
        if (z4) {
            setBackground(org.telegram.ui.ActionBar.k6.Y(zvVar.k(), 8, 8));
        }
        p9 p9Var = new p9(context);
        this.d = p9Var;
        p9Var.f30006w = false;
        p9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(p9Var);
    }

    public vv(zv zvVar, Context context, TLRPC.Document document) {
        super(context);
        this.G = zvVar;
        setFocusable(true);
        this.f32545b = true;
        this.h = false;
        this.f32549n = false;
        sv svVar = new sv(this, context);
        this.d = svVar;
        svVar.f30006w = false;
        this.f32551s = document;
        this.f32546c = true;
        svVar.setColorFilter(zvVar.getEmojiColorFilter());
        addView(svVar);
        int i10 = fg.r1.I;
        fg.r1 r1Var = new fg.r1(context, 1, zvVar.v);
        this.f32548f = r1Var;
        r1Var.setAlpha(0.0f);
        r1Var.setScaleX(0.0f);
        r1Var.setScaleY(0.0f);
        f();
        addView(r1Var);
        d();
    }

    public vv(zv zvVar, Context context, long j10) {
        super(context);
        this.G = zvVar;
        setFocusable(true);
        this.f32545b = true;
        this.h = false;
        this.f32549n = false;
        oh.a4 a4Var = new oh.a4(this, context, 7);
        this.d = a4Var;
        a4Var.f30006w = false;
        this.f32550r = Long.valueOf(j10);
        this.f32546c = true;
        a4Var.setColorFilter(zvVar.getEmojiColorFilter());
        addView(a4Var);
        int i10 = fg.r1.I;
        fg.r1 r1Var = new fg.r1(context, 1, zvVar.v);
        this.f32548f = r1Var;
        r1Var.setAlpha(0.0f);
        r1Var.setScaleX(0.0f);
        r1Var.setScaleY(0.0f);
        f();
        addView(r1Var);
        d();
    }
}
