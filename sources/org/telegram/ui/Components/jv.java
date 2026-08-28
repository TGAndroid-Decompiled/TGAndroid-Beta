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
public class jv extends ViewGroup {
    public Boolean A;
    public float B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public final nv F;
    public Long f29845a;
    public boolean f29846b;
    public final boolean f29847c;
    public final o9 d;
    public final mi0 f29848e;
    public final zf.b1 f29849f;
    public final boolean h;
    public final boolean f29850n;
    public Long f29851r;
    public TLRPC.Document f29852s;
    public jx v;
    public k5 f29853w;
    public boolean f29854x;
    public boolean f29855y;

    public jv(nv nvVar, Context context, int i9, int i10) {
        super(context);
        this.F = nvVar;
        setFocusable(true);
        this.h = true;
        this.f29850n = false;
        setBackground(org.telegram.ui.ActionBar.f6.M(nvVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            mi0 mi0Var = new mi0(i10, j3.r0.l(i10, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.f29848e = mi0Var;
            mi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            mi0Var.f30863r0 = this;
            mi0Var.H(true);
            mi0Var.start();
        } else {
            o9 o9Var = new o9(context);
            this.d = o9Var;
            o9Var.f31336w = false;
            o9Var.setImageDrawable(context.getResources().getDrawable(i9).mutate());
            addView(o9Var);
        }
        d();
    }

    private void setColor(int i9) {
        nv nvVar = this.F;
        int i10 = nvVar.P;
        if (i10 == 5 || i10 == 7) {
            i9 = nvVar.M;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        o9 o9Var = this.d;
        if (o9Var != null && !this.f29847c) {
            o9Var.setColorFilter(porterDuffColorFilter);
            o9Var.invalidate();
        }
        mi0 mi0Var = this.f29848e;
        if (mi0Var != null) {
            mi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        zf.b1 b1Var = this.f29849f;
        if (b1Var == null) {
            return;
        }
        this.A = bool;
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
        ih.z2 z2Var;
        k5 k5Var = this.f29853w;
        if (k5Var != null && (z2Var = k5Var.f29951k) != null) {
            if (z2Var.getLottieAnimation() != null) {
                z2Var.getLottieAnimation().K(0);
                z2Var.getLottieAnimation().stop();
            } else if (z2Var.getAnimation() != null) {
                z2Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        o9 o9Var = this.d;
        if (o9Var == null) {
            return;
        }
        if (this.f29854x && this.f29855y) {
            k5 k5Var = this.f29853w;
            if (k5Var == null && (this.f29852s != null || this.f29851r != null)) {
                o9Var.b();
                TLRPC.Document document = this.f29852s;
                nv nvVar = this.F;
                if (document != null) {
                    this.f29853w = k5.m(UserConfig.selectedAccount, nvVar.O, document);
                } else {
                    this.f29853w = k5.n(UserConfig.selectedAccount, this.f29851r.longValue(), null, nvVar.O);
                }
                this.f29853w.a(o9Var);
                o9Var.setImageDrawable(this.f29853w);
            } else {
                if (k5Var != null) {
                    k5Var.o(o9Var);
                    this.f29853w = null;
                }
                o9Var.b();
                jx jxVar = this.v;
                if (jxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(jxVar.f29865b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            k5 k5Var2 = this.f29853w;
            if (k5Var2 != null) {
                k5Var2.o(o9Var);
                this.f29853w = null;
            }
            o9Var.b();
        }
        if (this.f29854x && this.f29855y) {
            o9Var.onAttachedToWindow();
        } else {
            o9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        nv nvVar = this.F;
        int k10 = nvVar.k();
        org.telegram.ui.ActionBar.b6 b6Var = nvVar.v;
        org.telegram.ui.ActionBar.f6.B1(background, k10, false);
        if (nvVar.L) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, b6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.C) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.C, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Me, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oe, b6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mi0 mi0Var = this.f29848e;
        if (mi0Var != null && this.f29855y) {
            mi0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f29855y) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        float f10;
        int i9;
        float f11 = this.B;
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
        this.B = f12;
        zf.b1 b1Var = this.f29849f;
        b1Var.setScaleX(f12);
        b1Var.setScaleY(this.B);
        b1Var.setAlpha(this.B);
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        b1Var.setVisibility(i9);
    }

    public final void f() {
        zf.b1 b1Var = this.f29849f;
        if (b1Var != null && !b1Var.h && (getDrawable() instanceof k5)) {
            if (((k5) getDrawable()).c()) {
                b1Var.setImageReceiver(null);
                b1Var.setColor(this.F.M);
                return;
            }
            ih.z2 z2Var = ((k5) getDrawable()).f29951k;
            if (z2Var != null) {
                b1Var.setImageReceiver(z2Var);
                b1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j10;
        o9 o9Var = this.d;
        if ((o9Var != null && o9Var.getImageReceiver().getImageDrawable() == null && !this.F.L) || this.D == z10) {
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
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.C;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 19));
            this.E.addListener(new u9(7, this, z10));
            ValueAnimator valueAnimator2 = this.E;
            if (hg.h0.d()) {
                j10 = 0;
            } else {
                j10 = 350;
            }
            valueAnimator2.setDuration(j10);
            this.E.setInterpolator(gr.h);
            this.E.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.C = f10;
        d();
    }

    public Drawable getDrawable() {
        o9 o9Var = this.d;
        if (o9Var != null) {
            return o9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (hg.h0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29854x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29854x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f29855y) {
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
            jx jxVar = this.v;
            if (jxVar != null && (stickerSet = jxVar.f29865b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f29852s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l10 = this.f29851r;
                    if (l10 != null && (f10 = k5.f(UserConfig.selectedAccount, l10.longValue())) != null) {
                        contentDescription = MessageObject.findAnimatedEmojiEmoticon(f10, null);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        o9 o9Var = this.d;
        if (o9Var != null) {
            int i13 = (i11 - i9) / 2;
            int i14 = (i12 - i10) / 2;
            o9Var.layout(i13 - (o9Var.getMeasuredWidth() / 2), i14 - (o9Var.getMeasuredHeight() / 2), (o9Var.getMeasuredWidth() / 2) + i13, (o9Var.getMeasuredHeight() / 2) + i14);
        }
        zf.b1 b1Var = this.f29849f;
        if (b1Var != null) {
            int i15 = i11 - i9;
            int i16 = i12 - i10;
            b1Var.layout(i15 - b1Var.getMeasuredWidth(), i16 - b1Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        o9 o9Var = this.d;
        if (o9Var != null) {
            o9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        zf.b1 b1Var = this.f29849f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ih.z2 z2Var;
        k5 k5Var = this.f29853w;
        if (k5Var != null && (z2Var = k5Var.f29951k) != null) {
            if (z2Var.getAnimation() != null) {
                z2Var.getAnimation().y(0L, true, false);
            }
            z2Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f29852s;
        if ((document2 != null || this.f29851r != null) && document != null) {
            Long l10 = this.f29851r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document2.f22386id;
            }
            if (j10 == document.f22386id) {
                return;
            }
        }
        k5 k5Var = this.f29853w;
        o9 o9Var = this.d;
        if (k5Var != null) {
            k5Var.o(o9Var);
            this.f29853w = null;
        }
        o9Var.b();
        this.f29852s = document;
        this.f29851r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f29852s;
        if ((document != null || this.f29851r != null) && j10 != 0) {
            Long l10 = this.f29851r;
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = document.f22386id;
            }
            if (j11 == j10) {
                return;
            }
        }
        k5 k5Var = this.f29853w;
        o9 o9Var = this.d;
        Long l11 = null;
        if (k5Var != null) {
            k5Var.o(o9Var);
            this.f29853w = null;
        }
        o9Var.b();
        this.f29852s = null;
        if (j10 != 0) {
            l11 = Long.valueOf(j10);
        }
        this.f29851r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(jx jxVar) {
        if (jxVar != null && jxVar.f29865b == null) {
            jxVar = null;
        }
        jx jxVar2 = this.v;
        if (jxVar2 != null && jxVar != null && jxVar2.f29865b.f22407id == jxVar.f29865b.f22407id) {
            return;
        }
        k5 k5Var = this.f29853w;
        o9 o9Var = this.d;
        if (k5Var != null && this.f29852s == null && this.f29851r == null) {
            k5Var.o(o9Var);
            this.f29853w = null;
        }
        o9Var.b();
        this.v = jxVar;
        c();
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (hg.h0.b(this)) {
            return;
        }
        super.invalidate(i9, i10, i11, i12);
    }

    public jv(nv nvVar, Context context, int i9, boolean z10) {
        super(context);
        this.F = nvVar;
        setFocusable(true);
        this.h = false;
        this.f29850n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.f6.Y(nvVar.k(), 8, 8));
        }
        o9 o9Var = new o9(context);
        this.d = o9Var;
        o9Var.f31336w = false;
        o9Var.setImageDrawable(context.getResources().getDrawable(i9).mutate());
        d();
        addView(o9Var);
    }

    public jv(nv nvVar, Context context, TLRPC.Document document) {
        super(context);
        this.F = nvVar;
        setFocusable(true);
        this.f29846b = true;
        this.h = false;
        this.f29850n = false;
        gv gvVar = new gv(this, context);
        this.d = gvVar;
        gvVar.f31336w = false;
        this.f29852s = document;
        this.f29847c = true;
        gvVar.setColorFilter(nvVar.getEmojiColorFilter());
        addView(gvVar);
        int i9 = zf.b1.H;
        zf.b1 b1Var = new zf.b1(context, 1, nvVar.v);
        this.f29849f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }

    public jv(nv nvVar, Context context, long j10) {
        super(context);
        this.F = nvVar;
        setFocusable(true);
        this.f29846b = true;
        this.h = false;
        this.f29850n = false;
        ih.d4 d4Var = new ih.d4(this, context, 7);
        this.d = d4Var;
        d4Var.f31336w = false;
        this.f29851r = Long.valueOf(j10);
        this.f29847c = true;
        d4Var.setColorFilter(nvVar.getEmojiColorFilter());
        addView(d4Var);
        int i9 = zf.b1.H;
        zf.b1 b1Var = new zf.b1(context, 1, nvVar.v);
        this.f29849f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }
}
