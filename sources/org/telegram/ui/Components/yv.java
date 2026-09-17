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
public class yv extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final cw J;
    public Long f30328a;
    public boolean f30329b;
    public final boolean f30330c;
    public final u9 d;
    public final yi0 e;
    public final rg.b1 f30331f;
    public final boolean h;
    public final boolean f30332n;
    public Long f30333r;
    public TLRPC.Document f30334s;
    public wx v;
    public o5 f30335w;
    public boolean f30336x;
    public boolean f30337y;

    public yv(cw cwVar, Context context, int i10, int i11) {
        super(context);
        this.J = cwVar;
        setFocusable(true);
        this.h = true;
        this.f30332n = false;
        setBackground(org.telegram.ui.ActionBar.j6.M(cwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            yi0 yi0Var = new yi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = yi0Var;
            yi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            yi0Var.f30245v0 = this;
            yi0Var.J(true);
            yi0Var.start();
        } else {
            u9 u9Var = new u9(context);
            this.d = u9Var;
            u9Var.f28308w = false;
            u9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(u9Var);
        }
        d();
    }

    private void setColor(int i10) {
        cw cwVar = this.J;
        int i11 = cwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = cwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        u9 u9Var = this.d;
        if (u9Var != null && !this.f30330c) {
            u9Var.setColorFilter(porterDuffColorFilter);
            u9Var.invalidate();
        }
        yi0 yi0Var = this.e;
        if (yi0Var != null) {
            yi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        rg.b1 b1Var = this.f30331f;
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
        o5 o5Var = this.f30335w;
        if (o5Var != null && (l4Var = o5Var.f26636k) != null) {
            if (l4Var.getLottieAnimation() != null) {
                l4Var.getLottieAnimation().M(0);
                l4Var.getLottieAnimation().stop();
            } else if (l4Var.getAnimation() != null) {
                l4Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        u9 u9Var = this.d;
        if (u9Var == null) {
            return;
        }
        if (this.f30336x && this.f30337y) {
            o5 o5Var = this.f30335w;
            if (o5Var == null && (this.f30334s != null || this.f30333r != null)) {
                u9Var.b();
                TLRPC.Document document = this.f30334s;
                cw cwVar = this.J;
                if (document != null) {
                    this.f30335w = o5.m(UserConfig.selectedAccount, cwVar.S, document);
                } else {
                    this.f30335w = o5.n(UserConfig.selectedAccount, this.f30333r.longValue(), null, cwVar.S);
                }
                this.f30335w.a(u9Var);
                u9Var.setImageDrawable(this.f30335w);
            } else {
                if (o5Var != null) {
                    o5Var.o(u9Var);
                    this.f30335w = null;
                }
                u9Var.b();
                wx wxVar = this.v;
                if (wxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(wxVar.f29759b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            o5 o5Var2 = this.f30335w;
            if (o5Var2 != null) {
                o5Var2.o(u9Var);
                this.f30335w = null;
            }
            u9Var.b();
        }
        if (this.f30336x && this.f30337y) {
            u9Var.onAttachedToWindow();
        } else {
            u9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        cw cwVar = this.J;
        int k10 = cwVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = cwVar.v;
        org.telegram.ui.ActionBar.j6.B1(background, k10, false);
        if (cwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yi0 yi0Var = this.e;
        if (yi0Var != null && this.f30337y) {
            yi0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f30337y) {
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
        rg.b1 b1Var = this.f30331f;
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
        rg.b1 b1Var = this.f30331f;
        if (b1Var != null && !b1Var.h && (getDrawable() instanceof o5)) {
            if (((o5) getDrawable()).c()) {
                b1Var.setImageReceiver(null);
                b1Var.setColor(this.J.Q);
                return;
            }
            ai.l4 l4Var = ((o5) getDrawable()).f26636k;
            if (l4Var != null) {
                b1Var.setImageReceiver(l4Var);
                b1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j3;
        u9 u9Var = this.d;
        if ((u9Var != null && u9Var.getImageReceiver().getImageDrawable() == null && !this.J.P) || this.H == z10) {
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
            ofFloat.addUpdateListener(new i6(this, 19));
            this.I.addListener(new aa(7, this, z10));
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
        u9 u9Var = this.d;
        if (u9Var != null) {
            return u9Var.getImageReceiver().getImageDrawable();
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
        this.f30336x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30336x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f30337y) {
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
            wx wxVar = this.v;
            if (wxVar != null && (stickerSet = wxVar.f29759b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f30334s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f30333r;
                    if (l4 != null && (f7 = o5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
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
        u9 u9Var = this.d;
        if (u9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            u9Var.layout(i14 - (u9Var.getMeasuredWidth() / 2), i15 - (u9Var.getMeasuredHeight() / 2), (u9Var.getMeasuredWidth() / 2) + i14, (u9Var.getMeasuredHeight() / 2) + i15);
        }
        rg.b1 b1Var = this.f30331f;
        if (b1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            b1Var.layout(i16 - b1Var.getMeasuredWidth(), i17 - b1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        u9 u9Var = this.d;
        if (u9Var != null) {
            u9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        rg.b1 b1Var = this.f30331f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ai.l4 l4Var;
        o5 o5Var = this.f30335w;
        if (o5Var != null && (l4Var = o5Var.f26636k) != null) {
            if (l4Var.getAnimation() != null) {
                l4Var.getAnimation().y(0L, true, false);
            }
            l4Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f30334s;
        if ((document2 != null || this.f30333r != null) && document != null) {
            Long l4 = this.f30333r;
            if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = document2.f18127id;
            }
            if (j3 == document.f18127id) {
                return;
            }
        }
        o5 o5Var = this.f30335w;
        u9 u9Var = this.d;
        if (o5Var != null) {
            o5Var.o(u9Var);
            this.f30335w = null;
        }
        u9Var.b();
        this.f30334s = document;
        this.f30333r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f30334s;
        if ((document != null || this.f30333r != null) && j3 != 0) {
            Long l4 = this.f30333r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document.f18127id;
            }
            if (j10 == j3) {
                return;
            }
        }
        o5 o5Var = this.f30335w;
        u9 u9Var = this.d;
        Long l10 = null;
        if (o5Var != null) {
            o5Var.o(u9Var);
            this.f30335w = null;
        }
        u9Var.b();
        this.f30334s = null;
        if (j3 != 0) {
            l10 = Long.valueOf(j3);
        }
        this.f30333r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(wx wxVar) {
        if (wxVar != null && wxVar.f29759b == null) {
            wxVar = null;
        }
        wx wxVar2 = this.v;
        if (wxVar2 != null && wxVar != null && wxVar2.f29759b.f18148id == wxVar.f29759b.f18148id) {
            return;
        }
        o5 o5Var = this.f30335w;
        u9 u9Var = this.d;
        if (o5Var != null && this.f30334s == null && this.f30333r == null) {
            o5Var.o(u9Var);
            this.f30335w = null;
        }
        u9Var.b();
        this.v = wxVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public yv(cw cwVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = cwVar;
        setFocusable(true);
        this.h = false;
        this.f30332n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.Y(cwVar.k(), 8, 8));
        }
        u9 u9Var = new u9(context);
        this.d = u9Var;
        u9Var.f28308w = false;
        u9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(u9Var);
    }

    public yv(cw cwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = cwVar;
        setFocusable(true);
        this.f30329b = true;
        this.h = false;
        this.f30332n = false;
        vv vvVar = new vv(this, context);
        this.d = vvVar;
        vvVar.f28308w = false;
        this.f30334s = document;
        this.f30330c = true;
        vvVar.setColorFilter(cwVar.getEmojiColorFilter());
        addView(vvVar);
        int i10 = rg.b1.L;
        rg.b1 b1Var = new rg.b1(context, 1, cwVar.v);
        this.f30331f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }

    public yv(cw cwVar, Context context, long j3) {
        super(context);
        this.J = cwVar;
        setFocusable(true);
        this.f30329b = true;
        this.h = false;
        this.f30332n = false;
        ai.z5 z5Var = new ai.z5(this, context, 8);
        this.d = z5Var;
        z5Var.f28308w = false;
        this.f30333r = Long.valueOf(j3);
        this.f30330c = true;
        z5Var.setColorFilter(cwVar.getEmojiColorFilter());
        addView(z5Var);
        int i10 = rg.b1.L;
        rg.b1 b1Var = new rg.b1(context, 1, cwVar.v);
        this.f30331f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }
}
