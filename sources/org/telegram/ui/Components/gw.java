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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public class gw extends ViewGroup implements org.telegram.ui.ActionBar.p6 {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public int L;
    public float M;
    public final kw N;
    public Long f28723a;
    public boolean f28724b;
    public final boolean f28725c;
    public final y9 d;
    public final xj0 e;
    public final tg.c1 f28726f;
    public final boolean h;
    public final boolean f28727n;
    public Long f28728r;
    public TLRPC.Document f28729s;
    public ey v;
    public t5 f28730w;
    public boolean f28731x;
    public boolean f28732y;

    public gw(kw kwVar, Context context, int i10) {
        super(context);
        this.N = kwVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = true;
        this.f28727n = false;
        setBackground(org.telegram.ui.ActionBar.y6.N(kwVar.k(), 0, 0));
        xj0 xj0Var = new xj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
        this.e = xj0Var;
        xj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
        xj0Var.R(this);
        xj0Var.J(true);
        xj0Var.start();
        d();
    }

    private void setColor(int i10) {
        kw kwVar = this.N;
        int i11 = kwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = kwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        y9 y9Var = this.d;
        if (y9Var != null && !this.f28725c) {
            y9Var.setColorFilter(porterDuffColorFilter);
            y9Var.invalidate();
        }
        xj0 xj0Var = this.e;
        if (xj0Var != null) {
            xj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        tg.c1 c1Var = this.f28726f;
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

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Wk));
    }

    public final void b() {
        di.f3 f3Var;
        t5 t5Var = this.f28730w;
        if (t5Var != null && (f3Var = t5Var.f32852k) != null) {
            if (f3Var.getLottieAnimation() != null) {
                f3Var.getLottieAnimation().M(0);
                f3Var.getLottieAnimation().stop();
            } else if (f3Var.getAnimation() != null) {
                f3Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        y9 y9Var = this.d;
        if (y9Var == null) {
            return;
        }
        if (this.f28731x && this.f28732y) {
            t5 t5Var = this.f28730w;
            if (t5Var == null && (this.f28729s != null || this.f28728r != null)) {
                y9Var.b();
                TLRPC.Document document = this.f28729s;
                kw kwVar = this.N;
                if (document != null) {
                    this.f28730w = t5.m(UserConfig.selectedAccount, kwVar.S, document);
                } else {
                    this.f28730w = t5.n(UserConfig.selectedAccount, this.f28728r.longValue(), null, kwVar.S);
                }
                this.f28730w.a(y9Var);
                y9Var.setImageDrawable(this.f28730w);
            } else {
                if (t5Var != null) {
                    t5Var.o(y9Var);
                    this.f28730w = null;
                }
                y9Var.b();
                ey eyVar = this.v;
                if (eyVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(eyVar.f28008b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            t5 t5Var2 = this.f28730w;
            if (t5Var2 != null) {
                t5Var2.o(y9Var);
                this.f28730w = null;
            }
            y9Var.b();
        }
        if (this.f28731x && this.f28732y) {
            y9Var.onAttachedToWindow();
        } else {
            y9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        kw kwVar = this.N;
        int k10 = kwVar.k();
        org.telegram.ui.ActionBar.u6 u6Var = kwVar.v;
        org.telegram.ui.ActionBar.y6.E1(background, k10, false);
        if (kwVar.P) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.f(this.G, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Me, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oe, u6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xj0 xj0Var = this.e;
        if (xj0Var != null && this.f28732y) {
            xj0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f28732y) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
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
        tg.c1 c1Var = this.f28726f;
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
        tg.c1 c1Var = this.f28726f;
        if (c1Var != null && !c1Var.h && (getDrawable() instanceof t5)) {
            if (((t5) getDrawable()).c()) {
                c1Var.setImageReceiver(null);
                c1Var.setColor(this.N.Q);
                return;
            }
            di.f3 f3Var = ((t5) getDrawable()).f32852k;
            if (f3Var != null) {
                c1Var.setImageReceiver(f3Var);
                c1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j10;
        y9 y9Var = this.d;
        if ((y9Var != null && y9Var.getImageReceiver().getImageDrawable() == null && !this.N.P) || this.H == z10) {
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
            ofFloat.addUpdateListener(new n6(this, 20));
            this.I.addListener(new org.telegram.ui.jo(8, this, z10));
            ValueAnimator valueAnimator2 = this.I;
            if (bh.m0.d()) {
                j10 = 0;
            } else {
                j10 = 350;
            }
            valueAnimator2.setDuration(j10);
            this.I.setInterpolator(ds.h);
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
        if (bh.m0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28731x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28731x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f28732y) {
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
            ey eyVar = this.v;
            if (eyVar != null && (stickerSet = eyVar.f28008b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f28729s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f28728r;
                    if (l4 != null && (f7 = t5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
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
        tg.c1 c1Var = this.f28726f;
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
        tg.c1 c1Var = this.f28726f;
        if (c1Var != null) {
            c1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        di.f3 f3Var;
        t5 t5Var = this.f28730w;
        if (t5Var != null && (f3Var = t5Var.f32852k) != null) {
            if (f3Var.getAnimation() != null) {
                f3Var.getAnimation().y(0L, true, false);
            }
            f3Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f28729s;
        if ((document2 != null || this.f28728r != null) && document != null) {
            Long l4 = this.f28728r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document2.f22033id;
            }
            if (j10 == document.f22033id) {
                return;
            }
        }
        t5 t5Var = this.f28730w;
        y9 y9Var = this.d;
        if (t5Var != null) {
            t5Var.o(y9Var);
            this.f28730w = null;
        }
        y9Var.b();
        this.f28729s = document;
        this.f28728r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f28729s;
        if ((document != null || this.f28728r != null) && j10 != 0) {
            Long l4 = this.f28728r;
            if (l4 != null) {
                j11 = l4.longValue();
            } else {
                j11 = document.f22033id;
            }
            if (j11 == j10) {
                return;
            }
        }
        t5 t5Var = this.f28730w;
        y9 y9Var = this.d;
        Long l10 = null;
        if (t5Var != null) {
            t5Var.o(y9Var);
            this.f28730w = null;
        }
        y9Var.b();
        this.f28729s = null;
        if (j10 != 0) {
            l10 = Long.valueOf(j10);
        }
        this.f28728r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(ey eyVar) {
        if (eyVar != null && eyVar.f28008b == null) {
            eyVar = null;
        }
        ey eyVar2 = this.v;
        if (eyVar2 != null && eyVar != null && eyVar2.f28008b.f22054id == eyVar.f28008b.f22054id) {
            return;
        }
        t5 t5Var = this.f28730w;
        y9 y9Var = this.d;
        if (t5Var != null && this.f28729s == null && this.f28728r == null) {
            t5Var.o(y9Var);
            this.f28730w = null;
        }
        y9Var.b();
        this.v = eyVar;
        c();
    }

    @Override
    public final void updateColors() {
        kw kwVar = this.N;
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Me, kwVar.v);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oe, kwVar.v);
            int k10 = kwVar.k();
            if (w02 == this.J && w03 == this.K && k10 == this.L && this.M == this.G) {
                return;
            }
            this.J = w02;
            this.K = w03;
            this.L = k10;
            this.M = this.G;
            d();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (bh.m0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public gw(kw kwVar, Context context, int i10, boolean z10) {
        super(context);
        this.N = kwVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = false;
        this.f28727n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.y6.Z(kwVar.k(), 8, 8));
        }
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.f34991w = false;
        y9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(y9Var);
    }

    public gw(kw kwVar, Context context, TLRPC.Document document) {
        super(context);
        this.N = kwVar;
        setFocusable(true);
        this.M = -1.0f;
        this.f28724b = true;
        this.h = false;
        this.f28727n = false;
        dw dwVar = new dw(this, context);
        this.d = dwVar;
        dwVar.f34991w = false;
        this.f28729s = document;
        this.f28725c = true;
        dwVar.setColorFilter(kwVar.getEmojiColorFilter());
        addView(dwVar);
        int i10 = tg.c1.L;
        tg.c1 c1Var = new tg.c1(context, 1, kwVar.v);
        this.f28726f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }

    public gw(kw kwVar, Context context, long j10) {
        super(context);
        this.N = kwVar;
        setFocusable(true);
        this.M = -1.0f;
        this.f28724b = true;
        this.h = false;
        this.f28727n = false;
        di.k4 k4Var = new di.k4(this, context, 8);
        this.d = k4Var;
        k4Var.f34991w = false;
        this.f28728r = Long.valueOf(j10);
        this.f28725c = true;
        k4Var.setColorFilter(kwVar.getEmojiColorFilter());
        addView(k4Var);
        int i10 = tg.c1.L;
        tg.c1 c1Var = new tg.c1(context, 1, kwVar.v);
        this.f28726f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }
}
