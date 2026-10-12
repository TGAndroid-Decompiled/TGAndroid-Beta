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
public class kw extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final ow J;
    public Long f26811a;
    public boolean f26812b;
    public final boolean f26813c;
    public final z9 d;
    public final yj0 e;
    public final sg.c1 f26814f;
    public final boolean h;
    public final boolean f26815n;
    public Long f26816r;
    public TLRPC.Document f26817s;
    public jy v;
    public s5 f26818w;
    public boolean f26819x;
    public boolean f26820y;

    public kw(ow owVar, Context context, int i10) {
        super(context);
        this.J = owVar;
        setFocusable(true);
        this.h = true;
        this.f26815n = false;
        setBackground(org.telegram.ui.ActionBar.g6.N(owVar.k(), 0, 0));
        yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
        this.e = yj0Var;
        yj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
        yj0Var.R(this);
        yj0Var.J(true);
        yj0Var.start();
        d();
    }

    private void setColor(int i10) {
        ow owVar = this.J;
        int i11 = owVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = owVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        z9 z9Var = this.d;
        if (z9Var != null && !this.f26813c) {
            z9Var.setColorFilter(porterDuffColorFilter);
            z9Var.invalidate();
        }
        yj0 yj0Var = this.e;
        if (yj0Var != null) {
            yj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        sg.c1 c1Var = this.f26814f;
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
        bi.b4 b4Var;
        s5 s5Var = this.f26818w;
        if (s5Var != null && (b4Var = s5Var.f29031k) != null) {
            if (b4Var.getLottieAnimation() != null) {
                b4Var.getLottieAnimation().M(0);
                b4Var.getLottieAnimation().stop();
            } else if (b4Var.getAnimation() != null) {
                b4Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        z9 z9Var = this.d;
        if (z9Var == null) {
            return;
        }
        if (this.f26819x && this.f26820y) {
            s5 s5Var = this.f26818w;
            if (s5Var == null && (this.f26817s != null || this.f26816r != null)) {
                z9Var.b();
                TLRPC.Document document = this.f26817s;
                ow owVar = this.J;
                if (document != null) {
                    this.f26818w = s5.m(UserConfig.selectedAccount, owVar.S, document);
                } else {
                    this.f26818w = s5.n(UserConfig.selectedAccount, this.f26816r.longValue(), null, owVar.S);
                }
                this.f26818w.a(z9Var);
                z9Var.setImageDrawable(this.f26818w);
            } else {
                if (s5Var != null) {
                    s5Var.o(z9Var);
                    this.f26818w = null;
                }
                z9Var.b();
                jy jyVar = this.v;
                if (jyVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(jyVar.f26514b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            s5 s5Var2 = this.f26818w;
            if (s5Var2 != null) {
                s5Var2.o(z9Var);
                this.f26818w = null;
            }
            z9Var.b();
        }
        if (this.f26819x && this.f26820y) {
            z9Var.onAttachedToWindow();
        } else {
            z9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        ow owVar = this.J;
        int k10 = owVar.k();
        org.telegram.ui.ActionBar.c6 c6Var = owVar.v;
        org.telegram.ui.ActionBar.g6.C1(background, k10, false);
        if (owVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Me, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oe, c6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yj0 yj0Var = this.e;
        if (yj0Var != null && this.f26820y) {
            yj0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f26820y) {
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
        sg.c1 c1Var = this.f26814f;
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
        sg.c1 c1Var = this.f26814f;
        if (c1Var != null && !c1Var.h && (getDrawable() instanceof s5)) {
            if (((s5) getDrawable()).c()) {
                c1Var.setImageReceiver(null);
                c1Var.setColor(this.J.Q);
                return;
            }
            bi.b4 b4Var = ((s5) getDrawable()).f29031k;
            if (b4Var != null) {
                c1Var.setImageReceiver(b4Var);
                c1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j10;
        z9 z9Var = this.d;
        if ((z9Var != null && z9Var.getImageReceiver().getImageDrawable() == null && !this.J.P) || this.H == z10) {
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
            this.I.addListener(new org.telegram.ui.vo(8, this, z10));
            ValueAnimator valueAnimator2 = this.I;
            if (ah.x0.d()) {
                j10 = 0;
            } else {
                j10 = 350;
            }
            valueAnimator2.setDuration(j10);
            this.I.setInterpolator(es.h);
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
        z9 z9Var = this.d;
        if (z9Var != null) {
            return z9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26819x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26819x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f26820y) {
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
            jy jyVar = this.v;
            if (jyVar != null && (stickerSet = jyVar.f26514b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f26817s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f26816r;
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
        z9 z9Var = this.d;
        if (z9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            z9Var.layout(i14 - (z9Var.getMeasuredWidth() / 2), i15 - (z9Var.getMeasuredHeight() / 2), (z9Var.getMeasuredWidth() / 2) + i14, (z9Var.getMeasuredHeight() / 2) + i15);
        }
        sg.c1 c1Var = this.f26814f;
        if (c1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            c1Var.layout(i16 - c1Var.getMeasuredWidth(), i17 - c1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        z9 z9Var = this.d;
        if (z9Var != null) {
            z9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        sg.c1 c1Var = this.f26814f;
        if (c1Var != null) {
            c1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        bi.b4 b4Var;
        s5 s5Var = this.f26818w;
        if (s5Var != null && (b4Var = s5Var.f29031k) != null) {
            if (b4Var.getAnimation() != null) {
                b4Var.getAnimation().y(0L, true, false);
            }
            b4Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f26817s;
        if ((document2 != null || this.f26816r != null) && document != null) {
            Long l4 = this.f26816r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document2.f19222id;
            }
            if (j10 == document.f19222id) {
                return;
            }
        }
        s5 s5Var = this.f26818w;
        z9 z9Var = this.d;
        if (s5Var != null) {
            s5Var.o(z9Var);
            this.f26818w = null;
        }
        z9Var.b();
        this.f26817s = document;
        this.f26816r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f26817s;
        if ((document != null || this.f26816r != null) && j10 != 0) {
            Long l4 = this.f26816r;
            if (l4 != null) {
                j11 = l4.longValue();
            } else {
                j11 = document.f19222id;
            }
            if (j11 == j10) {
                return;
            }
        }
        s5 s5Var = this.f26818w;
        z9 z9Var = this.d;
        Long l10 = null;
        if (s5Var != null) {
            s5Var.o(z9Var);
            this.f26818w = null;
        }
        z9Var.b();
        this.f26817s = null;
        if (j10 != 0) {
            l10 = Long.valueOf(j10);
        }
        this.f26816r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(jy jyVar) {
        if (jyVar != null && jyVar.f26514b == null) {
            jyVar = null;
        }
        jy jyVar2 = this.v;
        if (jyVar2 != null && jyVar != null && jyVar2.f26514b.f19243id == jyVar.f26514b.f19243id) {
            return;
        }
        s5 s5Var = this.f26818w;
        z9 z9Var = this.d;
        if (s5Var != null && this.f26817s == null && this.f26816r == null) {
            s5Var.o(z9Var);
            this.f26818w = null;
        }
        z9Var.b();
        this.v = jyVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public kw(ow owVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = owVar;
        setFocusable(true);
        this.h = false;
        this.f26815n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.g6.Z(owVar.k(), 8, 8));
        }
        z9 z9Var = new z9(context);
        this.d = z9Var;
        z9Var.f31820w = false;
        z9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(z9Var);
    }

    public kw(ow owVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = owVar;
        setFocusable(true);
        this.f26812b = true;
        this.h = false;
        this.f26815n = false;
        hw hwVar = new hw(this, context);
        this.d = hwVar;
        hwVar.f31820w = false;
        this.f26817s = document;
        this.f26813c = true;
        hwVar.setColorFilter(owVar.getEmojiColorFilter());
        addView(hwVar);
        int i10 = sg.c1.L;
        sg.c1 c1Var = new sg.c1(context, 1, owVar.v);
        this.f26814f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }

    public kw(ow owVar, Context context, long j10) {
        super(context);
        this.J = owVar;
        setFocusable(true);
        this.f26812b = true;
        this.h = false;
        this.f26815n = false;
        bi.k5 k5Var = new bi.k5(this, context, 8);
        this.d = k5Var;
        k5Var.f31820w = false;
        this.f26816r = Long.valueOf(j10);
        this.f26813c = true;
        k5Var.setColorFilter(owVar.getEmojiColorFilter());
        addView(k5Var);
        int i10 = sg.c1.L;
        sg.c1 c1Var = new sg.c1(context, 1, owVar.v);
        this.f26814f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }
}
