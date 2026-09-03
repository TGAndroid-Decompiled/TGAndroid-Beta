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
public class sv extends ViewGroup {
    public Boolean B;
    public float C;
    public float D;
    public boolean E;
    public ValueAnimator F;
    public final wv G;
    public Long f28816a;
    public boolean f28817b;
    public final boolean f28818c;
    public final p9 d;
    public final gj0 e;
    public final eg.s1 f28819f;
    public final boolean h;
    public final boolean f28820n;
    public Long f28821r;
    public TLRPC.Document f28822s;
    public vx v;
    public l5 f28823w;
    public boolean f28824x;
    public boolean f28825y;

    public sv(wv wvVar, Context context, int i10, int i11) {
        super(context);
        this.G = wvVar;
        setFocusable(true);
        this.h = true;
        this.f28820n = false;
        setBackground(org.telegram.ui.ActionBar.j6.M(wvVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            gj0 gj0Var = new gj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = gj0Var;
            gj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            gj0Var.f25176s0 = this;
            gj0Var.H(true);
            gj0Var.start();
        } else {
            p9 p9Var = new p9(context);
            this.d = p9Var;
            p9Var.f27808w = false;
            p9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(p9Var);
        }
        d();
    }

    private void setColor(int i10) {
        wv wvVar = this.G;
        int i11 = wvVar.Q;
        if (i11 == 5 || i11 == 7) {
            i10 = wvVar.N;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        p9 p9Var = this.d;
        if (p9Var != null && !this.f28818c) {
            p9Var.setColorFilter(porterDuffColorFilter);
            p9Var.invalidate();
        }
        gj0 gj0Var = this.e;
        if (gj0Var != null) {
            gj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        eg.s1 s1Var = this.f28819f;
        if (s1Var == null) {
            return;
        }
        this.B = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            s1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        s1Var.setImageDrawable(mutate);
    }

    public final void b() {
        nh.y2 y2Var;
        l5 l5Var = this.f28823w;
        if (l5Var != null && (y2Var = l5Var.f26587k) != null) {
            if (y2Var.getLottieAnimation() != null) {
                y2Var.getLottieAnimation().K(0);
                y2Var.getLottieAnimation().stop();
            } else if (y2Var.getAnimation() != null) {
                y2Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        p9 p9Var = this.d;
        if (p9Var == null) {
            return;
        }
        if (this.f28824x && this.f28825y) {
            l5 l5Var = this.f28823w;
            if (l5Var == null && (this.f28822s != null || this.f28821r != null)) {
                p9Var.b();
                TLRPC.Document document = this.f28822s;
                wv wvVar = this.G;
                if (document != null) {
                    this.f28823w = l5.m(UserConfig.selectedAccount, wvVar.P, document);
                } else {
                    this.f28823w = l5.n(UserConfig.selectedAccount, this.f28821r.longValue(), null, wvVar.P);
                }
                this.f28823w.a(p9Var);
                p9Var.setImageDrawable(this.f28823w);
            } else {
                if (l5Var != null) {
                    l5Var.o(p9Var);
                    this.f28823w = null;
                }
                p9Var.b();
                vx vxVar = this.v;
                if (vxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(vxVar.f30064b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            l5 l5Var2 = this.f28823w;
            if (l5Var2 != null) {
                l5Var2.o(p9Var);
                this.f28823w = null;
            }
            p9Var.b();
        }
        if (this.f28824x && this.f28825y) {
            p9Var.onAttachedToWindow();
        } else {
            p9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        wv wvVar = this.G;
        int k10 = wvVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = wvVar.v;
        org.telegram.ui.ActionBar.j6.B1(background, k10, false);
        if (wvVar.M) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.D) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.D, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        gj0 gj0Var = this.e;
        if (gj0Var != null && this.f28825y) {
            gj0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f28825y) {
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
        eg.s1 s1Var = this.f28819f;
        s1Var.setScaleX(f12);
        s1Var.setScaleY(this.C);
        s1Var.setAlpha(this.C);
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        s1Var.setVisibility(i10);
    }

    public final void f() {
        eg.s1 s1Var = this.f28819f;
        if (s1Var != null && !s1Var.h && (getDrawable() instanceof l5)) {
            if (((l5) getDrawable()).c()) {
                s1Var.setImageReceiver(null);
                s1Var.setColor(this.G.N);
                return;
            }
            nh.y2 y2Var = ((l5) getDrawable()).f26587k;
            if (y2Var != null) {
                s1Var.setImageReceiver(y2Var);
                s1Var.invalidate();
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
            this.F.addListener(new dg.w2(29, this, z4));
            ValueAnimator valueAnimator2 = this.F;
            if (mg.g0.d()) {
                j10 = 0;
            } else {
                j10 = 350;
            }
            valueAnimator2.setDuration(j10);
            this.F.setInterpolator(mr.h);
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
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28824x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28824x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f28825y) {
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
            vx vxVar = this.v;
            if (vxVar != null && (stickerSet = vxVar.f30064b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f28822s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l10 = this.f28821r;
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
        eg.s1 s1Var = this.f28819f;
        if (s1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            s1Var.layout(i16 - s1Var.getMeasuredWidth(), i17 - s1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        p9 p9Var = this.d;
        if (p9Var != null) {
            p9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        eg.s1 s1Var = this.f28819f;
        if (s1Var != null) {
            s1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        nh.y2 y2Var;
        l5 l5Var = this.f28823w;
        if (l5Var != null && (y2Var = l5Var.f26587k) != null) {
            if (y2Var.getAnimation() != null) {
                y2Var.getAnimation().y(0L, true, false);
            }
            y2Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f28822s;
        if ((document2 != null || this.f28821r != null) && document != null) {
            Long l10 = this.f28821r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document2.f19165id;
            }
            if (j10 == document.f19165id) {
                return;
            }
        }
        l5 l5Var = this.f28823w;
        p9 p9Var = this.d;
        if (l5Var != null) {
            l5Var.o(p9Var);
            this.f28823w = null;
        }
        p9Var.b();
        this.f28822s = document;
        this.f28821r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f28822s;
        if ((document != null || this.f28821r != null) && j10 != 0) {
            Long l10 = this.f28821r;
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = document.f19165id;
            }
            if (j11 == j10) {
                return;
            }
        }
        l5 l5Var = this.f28823w;
        p9 p9Var = this.d;
        Long l11 = null;
        if (l5Var != null) {
            l5Var.o(p9Var);
            this.f28823w = null;
        }
        p9Var.b();
        this.f28822s = null;
        if (j10 != 0) {
            l11 = Long.valueOf(j10);
        }
        this.f28821r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(vx vxVar) {
        if (vxVar != null && vxVar.f30064b == null) {
            vxVar = null;
        }
        vx vxVar2 = this.v;
        if (vxVar2 != null && vxVar != null && vxVar2.f30064b.f19186id == vxVar.f30064b.f19186id) {
            return;
        }
        l5 l5Var = this.f28823w;
        p9 p9Var = this.d;
        if (l5Var != null && this.f28822s == null && this.f28821r == null) {
            l5Var.o(p9Var);
            this.f28823w = null;
        }
        p9Var.b();
        this.v = vxVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public sv(wv wvVar, Context context, int i10, boolean z4) {
        super(context);
        this.G = wvVar;
        setFocusable(true);
        this.h = false;
        this.f28820n = z4;
        if (z4) {
            setBackground(org.telegram.ui.ActionBar.j6.Y(wvVar.k(), 8, 8));
        }
        p9 p9Var = new p9(context);
        this.d = p9Var;
        p9Var.f27808w = false;
        p9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(p9Var);
    }

    public sv(wv wvVar, Context context, TLRPC.Document document) {
        super(context);
        this.G = wvVar;
        setFocusable(true);
        this.f28817b = true;
        this.h = false;
        this.f28820n = false;
        pv pvVar = new pv(this, context);
        this.d = pvVar;
        pvVar.f27808w = false;
        this.f28822s = document;
        this.f28818c = true;
        pvVar.setColorFilter(wvVar.getEmojiColorFilter());
        addView(pvVar);
        int i10 = eg.s1.I;
        eg.s1 s1Var = new eg.s1(context, 1, wvVar.v);
        this.f28819f = s1Var;
        s1Var.setAlpha(0.0f);
        s1Var.setScaleX(0.0f);
        s1Var.setScaleY(0.0f);
        f();
        addView(s1Var);
        d();
    }

    public sv(wv wvVar, Context context, long j10) {
        super(context);
        this.G = wvVar;
        setFocusable(true);
        this.f28817b = true;
        this.h = false;
        this.f28820n = false;
        nh.y3 y3Var = new nh.y3(this, context, 7);
        this.d = y3Var;
        y3Var.f27808w = false;
        this.f28821r = Long.valueOf(j10);
        this.f28818c = true;
        y3Var.setColorFilter(wvVar.getEmojiColorFilter());
        addView(y3Var);
        int i10 = eg.s1.I;
        eg.s1 s1Var = new eg.s1(context, 1, wvVar.v);
        this.f28819f = s1Var;
        s1Var.setAlpha(0.0f);
        s1Var.setScaleX(0.0f);
        s1Var.setScaleY(0.0f);
        f();
        addView(s1Var);
        d();
    }
}
