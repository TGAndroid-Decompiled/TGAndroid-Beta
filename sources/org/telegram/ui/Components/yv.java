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
    public Long f30401a;
    public boolean f30402b;
    public final boolean f30403c;
    public final u9 d;
    public final xi0 e;
    public final rg.b1 f30404f;
    public final boolean h;
    public final boolean f30405n;
    public Long f30406r;
    public TLRPC.Document f30407s;
    public wx v;
    public o5 f30408w;
    public boolean f30409x;
    public boolean f30410y;

    public yv(cw cwVar, Context context, int i10, int i11) {
        super(context);
        this.J = cwVar;
        setFocusable(true);
        this.h = true;
        this.f30405n = false;
        setBackground(org.telegram.ui.ActionBar.i6.M(cwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = xi0Var;
            xi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            xi0Var.R(this);
            xi0Var.J(true);
            xi0Var.start();
        } else {
            u9 u9Var = new u9(context);
            this.d = u9Var;
            u9Var.f28318w = false;
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
        if (u9Var != null && !this.f30403c) {
            u9Var.setColorFilter(porterDuffColorFilter);
            u9Var.invalidate();
        }
        xi0 xi0Var = this.e;
        if (xi0Var != null) {
            xi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        rg.b1 b1Var = this.f30404f;
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
        o5 o5Var = this.f30408w;
        if (o5Var != null && (l4Var = o5Var.f26689k) != null) {
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
        if (this.f30409x && this.f30410y) {
            o5 o5Var = this.f30408w;
            if (o5Var == null && (this.f30407s != null || this.f30406r != null)) {
                u9Var.b();
                TLRPC.Document document = this.f30407s;
                cw cwVar = this.J;
                if (document != null) {
                    this.f30408w = o5.m(UserConfig.selectedAccount, cwVar.S, document);
                } else {
                    this.f30408w = o5.n(UserConfig.selectedAccount, this.f30406r.longValue(), null, cwVar.S);
                }
                this.f30408w.a(u9Var);
                u9Var.setImageDrawable(this.f30408w);
            } else {
                if (o5Var != null) {
                    o5Var.o(u9Var);
                    this.f30408w = null;
                }
                u9Var.b();
                wx wxVar = this.v;
                if (wxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(wxVar.f29820b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            o5 o5Var2 = this.f30408w;
            if (o5Var2 != null) {
                o5Var2.o(u9Var);
                this.f30408w = null;
            }
            u9Var.b();
        }
        if (this.f30409x && this.f30410y) {
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
        org.telegram.ui.ActionBar.e6 e6Var = cwVar.v;
        org.telegram.ui.ActionBar.i6.B1(background, k10, false);
        if (cwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Wk, e6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Me, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oe, e6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xi0 xi0Var = this.e;
        if (xi0Var != null && this.f30410y) {
            xi0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f30410y) {
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
        rg.b1 b1Var = this.f30404f;
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
        rg.b1 b1Var = this.f30404f;
        if (b1Var != null && !b1Var.h && (getDrawable() instanceof o5)) {
            if (((o5) getDrawable()).c()) {
                b1Var.setImageReceiver(null);
                b1Var.setColor(this.J.Q);
                return;
            }
            ai.l4 l4Var = ((o5) getDrawable()).f26689k;
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
        this.f30409x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30409x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f30410y) {
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
            if (wxVar != null && (stickerSet = wxVar.f29820b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f30407s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f30406r;
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
        rg.b1 b1Var = this.f30404f;
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
        rg.b1 b1Var = this.f30404f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ai.l4 l4Var;
        o5 o5Var = this.f30408w;
        if (o5Var != null && (l4Var = o5Var.f26689k) != null) {
            if (l4Var.getAnimation() != null) {
                l4Var.getAnimation().y(0L, true, false);
            }
            l4Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f30407s;
        if ((document2 != null || this.f30406r != null) && document != null) {
            Long l4 = this.f30406r;
            if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = document2.f18115id;
            }
            if (j3 == document.f18115id) {
                return;
            }
        }
        o5 o5Var = this.f30408w;
        u9 u9Var = this.d;
        if (o5Var != null) {
            o5Var.o(u9Var);
            this.f30408w = null;
        }
        u9Var.b();
        this.f30407s = document;
        this.f30406r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f30407s;
        if ((document != null || this.f30406r != null) && j3 != 0) {
            Long l4 = this.f30406r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document.f18115id;
            }
            if (j10 == j3) {
                return;
            }
        }
        o5 o5Var = this.f30408w;
        u9 u9Var = this.d;
        Long l10 = null;
        if (o5Var != null) {
            o5Var.o(u9Var);
            this.f30408w = null;
        }
        u9Var.b();
        this.f30407s = null;
        if (j3 != 0) {
            l10 = Long.valueOf(j3);
        }
        this.f30406r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(wx wxVar) {
        if (wxVar != null && wxVar.f29820b == null) {
            wxVar = null;
        }
        wx wxVar2 = this.v;
        if (wxVar2 != null && wxVar != null && wxVar2.f29820b.f18136id == wxVar.f29820b.f18136id) {
            return;
        }
        o5 o5Var = this.f30408w;
        u9 u9Var = this.d;
        if (o5Var != null && this.f30407s == null && this.f30406r == null) {
            o5Var.o(u9Var);
            this.f30408w = null;
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
        this.f30405n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.i6.Y(cwVar.k(), 8, 8));
        }
        u9 u9Var = new u9(context);
        this.d = u9Var;
        u9Var.f28318w = false;
        u9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(u9Var);
    }

    public yv(cw cwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = cwVar;
        setFocusable(true);
        this.f30402b = true;
        this.h = false;
        this.f30405n = false;
        vv vvVar = new vv(this, context);
        this.d = vvVar;
        vvVar.f28318w = false;
        this.f30407s = document;
        this.f30403c = true;
        vvVar.setColorFilter(cwVar.getEmojiColorFilter());
        addView(vvVar);
        int i10 = rg.b1.L;
        rg.b1 b1Var = new rg.b1(context, 1, cwVar.v);
        this.f30404f = b1Var;
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
        this.f30402b = true;
        this.h = false;
        this.f30405n = false;
        ai.z5 z5Var = new ai.z5(this, context, 8);
        this.d = z5Var;
        z5Var.f28318w = false;
        this.f30406r = Long.valueOf(j3);
        this.f30403c = true;
        z5Var.setColorFilter(cwVar.getEmojiColorFilter());
        addView(z5Var);
        int i10 = rg.b1.L;
        rg.b1 b1Var = new rg.b1(context, 1, cwVar.v);
        this.f30404f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }
}
