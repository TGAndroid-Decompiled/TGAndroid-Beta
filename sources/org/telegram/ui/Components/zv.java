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
    public Long f30660a;
    public boolean f30661b;
    public final boolean f30662c;
    public final w9 d;
    public final yi0 e;
    public final rg.b1 f30663f;
    public final boolean h;
    public final boolean f30664n;
    public Long f30665r;
    public TLRPC.Document f30666s;
    public xx v;
    public q5 f30667w;
    public boolean f30668x;
    public boolean f30669y;

    public zv(dw dwVar, Context context, int i10, int i11) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.h = true;
        this.f30664n = false;
        setBackground(org.telegram.ui.ActionBar.h6.M(dwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            yi0 yi0Var = new yi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = yi0Var;
            yi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            yi0Var.R(this);
            yi0Var.J(true);
            yi0Var.start();
        } else {
            w9 w9Var = new w9(context);
            this.d = w9Var;
            w9Var.f29586w = false;
            w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(w9Var);
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
        w9 w9Var = this.d;
        if (w9Var != null && !this.f30662c) {
            w9Var.setColorFilter(porterDuffColorFilter);
            w9Var.invalidate();
        }
        yi0 yi0Var = this.e;
        if (yi0Var != null) {
            yi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        rg.b1 b1Var = this.f30663f;
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
        q5 q5Var = this.f30667w;
        if (q5Var != null && (l4Var = q5Var.f27230k) != null) {
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
        if (this.f30668x && this.f30669y) {
            q5 q5Var = this.f30667w;
            if (q5Var == null && (this.f30666s != null || this.f30665r != null)) {
                w9Var.b();
                TLRPC.Document document = this.f30666s;
                dw dwVar = this.J;
                if (document != null) {
                    this.f30667w = q5.m(UserConfig.selectedAccount, dwVar.S, document);
                } else {
                    this.f30667w = q5.n(UserConfig.selectedAccount, this.f30665r.longValue(), null, dwVar.S);
                }
                this.f30667w.a(w9Var);
                w9Var.setImageDrawable(this.f30667w);
            } else {
                if (q5Var != null) {
                    q5Var.o(w9Var);
                    this.f30667w = null;
                }
                w9Var.b();
                xx xxVar = this.v;
                if (xxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(xxVar.f30088b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            q5 q5Var2 = this.f30667w;
            if (q5Var2 != null) {
                q5Var2.o(w9Var);
                this.f30667w = null;
            }
            w9Var.b();
        }
        if (this.f30668x && this.f30669y) {
            w9Var.onAttachedToWindow();
        } else {
            w9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        dw dwVar = this.J;
        int k10 = dwVar.k();
        org.telegram.ui.ActionBar.d6 d6Var = dwVar.v;
        org.telegram.ui.ActionBar.h6.B1(background, k10, false);
        if (dwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Wk, d6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Me, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oe, d6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yi0 yi0Var = this.e;
        if (yi0Var != null && this.f30669y) {
            yi0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f30669y) {
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
        rg.b1 b1Var = this.f30663f;
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
        rg.b1 b1Var = this.f30663f;
        if (b1Var != null && !b1Var.h && (getDrawable() instanceof q5)) {
            if (((q5) getDrawable()).c()) {
                b1Var.setImageReceiver(null);
                b1Var.setColor(this.J.Q);
                return;
            }
            ai.l4 l4Var = ((q5) getDrawable()).f27230k;
            if (l4Var != null) {
                b1Var.setImageReceiver(l4Var);
                b1Var.invalidate();
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
            this.I.addListener(new ca(7, this, z10));
            ValueAnimator valueAnimator2 = this.I;
            if (zg.f0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.I.setInterpolator(rr.h);
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
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30668x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30668x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f30669y) {
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
            if (xxVar != null && (stickerSet = xxVar.f30088b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f30666s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f30665r;
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
        rg.b1 b1Var = this.f30663f;
        if (b1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            b1Var.layout(i16 - b1Var.getMeasuredWidth(), i17 - b1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        w9 w9Var = this.d;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        rg.b1 b1Var = this.f30663f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ai.l4 l4Var;
        q5 q5Var = this.f30667w;
        if (q5Var != null && (l4Var = q5Var.f27230k) != null) {
            if (l4Var.getAnimation() != null) {
                l4Var.getAnimation().y(0L, true, false);
            }
            l4Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f30666s;
        if ((document2 != null || this.f30665r != null) && document != null) {
            Long l4 = this.f30665r;
            if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = document2.f18089id;
            }
            if (j3 == document.f18089id) {
                return;
            }
        }
        q5 q5Var = this.f30667w;
        w9 w9Var = this.d;
        if (q5Var != null) {
            q5Var.o(w9Var);
            this.f30667w = null;
        }
        w9Var.b();
        this.f30666s = document;
        this.f30665r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f30666s;
        if ((document != null || this.f30665r != null) && j3 != 0) {
            Long l4 = this.f30665r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document.f18089id;
            }
            if (j10 == j3) {
                return;
            }
        }
        q5 q5Var = this.f30667w;
        w9 w9Var = this.d;
        Long l10 = null;
        if (q5Var != null) {
            q5Var.o(w9Var);
            this.f30667w = null;
        }
        w9Var.b();
        this.f30666s = null;
        if (j3 != 0) {
            l10 = Long.valueOf(j3);
        }
        this.f30665r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(xx xxVar) {
        if (xxVar != null && xxVar.f30088b == null) {
            xxVar = null;
        }
        xx xxVar2 = this.v;
        if (xxVar2 != null && xxVar != null && xxVar2.f30088b.f18110id == xxVar.f30088b.f18110id) {
            return;
        }
        q5 q5Var = this.f30667w;
        w9 w9Var = this.d;
        if (q5Var != null && this.f30666s == null && this.f30665r == null) {
            q5Var.o(w9Var);
            this.f30667w = null;
        }
        w9Var.b();
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
        this.f30664n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.h6.Y(dwVar.k(), 8, 8));
        }
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.f29586w = false;
        w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(w9Var);
    }

    public zv(dw dwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.f30661b = true;
        this.h = false;
        this.f30664n = false;
        wv wvVar = new wv(this, context);
        this.d = wvVar;
        wvVar.f29586w = false;
        this.f30666s = document;
        this.f30662c = true;
        wvVar.setColorFilter(dwVar.getEmojiColorFilter());
        addView(wvVar);
        int i10 = rg.b1.L;
        rg.b1 b1Var = new rg.b1(context, 1, dwVar.v);
        this.f30663f = b1Var;
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
        this.f30661b = true;
        this.h = false;
        this.f30664n = false;
        ai.y5 y5Var = new ai.y5(this, context, 8);
        this.d = y5Var;
        y5Var.f29586w = false;
        this.f30665r = Long.valueOf(j3);
        this.f30662c = true;
        y5Var.setColorFilter(dwVar.getEmojiColorFilter());
        addView(y5Var);
        int i10 = rg.b1.L;
        rg.b1 b1Var = new rg.b1(context, 1, dwVar.v);
        this.f30663f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }
}
