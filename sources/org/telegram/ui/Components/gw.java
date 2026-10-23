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
public class gw extends ViewGroup implements org.telegram.ui.ActionBar.b6 {
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
    public Long f26725a;
    public boolean f26726b;
    public final boolean f26727c;
    public final w9 d;
    public final yj0 e;
    public final sg.c1 f26728f;
    public final boolean h;
    public final boolean f26729n;
    public Long f26730r;
    public TLRPC.Document f26731s;
    public fy v;
    public r5 f26732w;
    public boolean f26733x;
    public boolean f26734y;

    public gw(kw kwVar, Context context, int i10) {
        super(context);
        this.N = kwVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = true;
        this.f26729n = false;
        setBackground(org.telegram.ui.ActionBar.k6.N(kwVar.k(), 0, 0));
        yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
        this.e = yj0Var;
        yj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
        yj0Var.R(this);
        yj0Var.J(true);
        yj0Var.start();
        d();
    }

    private void setColor(int i10) {
        kw kwVar = this.N;
        int i11 = kwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = kwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        w9 w9Var = this.d;
        if (w9Var != null && !this.f26727c) {
            w9Var.setColorFilter(porterDuffColorFilter);
            w9Var.invalidate();
        }
        yj0 yj0Var = this.e;
        if (yj0Var != null) {
            yj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        sg.c1 c1Var = this.f26728f;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wk));
    }

    public final void b() {
        ci.f3 f3Var;
        r5 r5Var = this.f26732w;
        if (r5Var != null && (f3Var = r5Var.f30098k) != null) {
            if (f3Var.getLottieAnimation() != null) {
                f3Var.getLottieAnimation().M(0);
                f3Var.getLottieAnimation().stop();
            } else if (f3Var.getAnimation() != null) {
                f3Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        w9 w9Var = this.d;
        if (w9Var == null) {
            return;
        }
        if (this.f26733x && this.f26734y) {
            r5 r5Var = this.f26732w;
            if (r5Var == null && (this.f26731s != null || this.f26730r != null)) {
                w9Var.b();
                TLRPC.Document document = this.f26731s;
                kw kwVar = this.N;
                if (document != null) {
                    this.f26732w = r5.m(UserConfig.selectedAccount, kwVar.S, document);
                } else {
                    this.f26732w = r5.n(UserConfig.selectedAccount, this.f26730r.longValue(), null, kwVar.S);
                }
                this.f26732w.a(w9Var);
                w9Var.setImageDrawable(this.f26732w);
            } else {
                if (r5Var != null) {
                    r5Var.o(w9Var);
                    this.f26732w = null;
                }
                w9Var.b();
                fy fyVar = this.v;
                if (fyVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(fyVar.f26469b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            r5 r5Var2 = this.f26732w;
            if (r5Var2 != null) {
                r5Var2.o(w9Var);
                this.f26732w = null;
            }
            w9Var.b();
        }
        if (this.f26733x && this.f26734y) {
            w9Var.onAttachedToWindow();
        } else {
            w9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        kw kwVar = this.N;
        int k10 = kwVar.k();
        org.telegram.ui.ActionBar.g6 g6Var = kwVar.v;
        org.telegram.ui.ActionBar.k6.E1(background, k10, false);
        if (kwVar.P) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.f(this.G, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oe, g6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yj0 yj0Var = this.e;
        if (yj0Var != null && this.f26734y) {
            yj0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f26734y) {
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
        sg.c1 c1Var = this.f26728f;
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
        sg.c1 c1Var = this.f26728f;
        if (c1Var != null && !c1Var.h && (getDrawable() instanceof r5)) {
            if (((r5) getDrawable()).c()) {
                c1Var.setImageReceiver(null);
                c1Var.setColor(this.N.Q);
                return;
            }
            ci.f3 f3Var = ((r5) getDrawable()).f30098k;
            if (f3Var != null) {
                c1Var.setImageReceiver(f3Var);
                c1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j10;
        w9 w9Var = this.d;
        if ((w9Var != null && w9Var.getImageReceiver().getImageDrawable() == null && !this.N.P) || this.H == z10) {
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
            ofFloat.addUpdateListener(new l6(this, 20));
            this.I.addListener(new org.telegram.ui.ho(8, this, z10));
            ValueAnimator valueAnimator2 = this.I;
            if (ah.x0.d()) {
                j10 = 0;
            } else {
                j10 = 350;
            }
            valueAnimator2.setDuration(j10);
            this.I.setInterpolator(bs.h);
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
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26733x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26733x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f26734y) {
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
            fy fyVar = this.v;
            if (fyVar != null && (stickerSet = fyVar.f26469b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f26731s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f26730r;
                    if (l4 != null && (f7 = r5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
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
        sg.c1 c1Var = this.f26728f;
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
        sg.c1 c1Var = this.f26728f;
        if (c1Var != null) {
            c1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ci.f3 f3Var;
        r5 r5Var = this.f26732w;
        if (r5Var != null && (f3Var = r5Var.f30098k) != null) {
            if (f3Var.getAnimation() != null) {
                f3Var.getAnimation().y(0L, true, false);
            }
            f3Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f26731s;
        if ((document2 != null || this.f26730r != null) && document != null) {
            Long l4 = this.f26730r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document2.f20349id;
            }
            if (j10 == document.f20349id) {
                return;
            }
        }
        r5 r5Var = this.f26732w;
        w9 w9Var = this.d;
        if (r5Var != null) {
            r5Var.o(w9Var);
            this.f26732w = null;
        }
        w9Var.b();
        this.f26731s = document;
        this.f26730r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f26731s;
        if ((document != null || this.f26730r != null) && j10 != 0) {
            Long l4 = this.f26730r;
            if (l4 != null) {
                j11 = l4.longValue();
            } else {
                j11 = document.f20349id;
            }
            if (j11 == j10) {
                return;
            }
        }
        r5 r5Var = this.f26732w;
        w9 w9Var = this.d;
        Long l10 = null;
        if (r5Var != null) {
            r5Var.o(w9Var);
            this.f26732w = null;
        }
        w9Var.b();
        this.f26731s = null;
        if (j10 != 0) {
            l10 = Long.valueOf(j10);
        }
        this.f26730r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(fy fyVar) {
        if (fyVar != null && fyVar.f26469b == null) {
            fyVar = null;
        }
        fy fyVar2 = this.v;
        if (fyVar2 != null && fyVar != null && fyVar2.f26469b.f20370id == fyVar.f26469b.f20370id) {
            return;
        }
        r5 r5Var = this.f26732w;
        w9 w9Var = this.d;
        if (r5Var != null && this.f26731s == null && this.f26730r == null) {
            r5Var.o(w9Var);
            this.f26732w = null;
        }
        w9Var.b();
        this.v = fyVar;
        c();
    }

    @Override
    public final void updateColors() {
        kw kwVar = this.N;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, kwVar.v);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oe, kwVar.v);
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
        if (ah.x0.b(this)) {
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
        this.f26729n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.k6.Z(kwVar.k(), 8, 8));
        }
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.f32202w = false;
        w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(w9Var);
    }

    public gw(kw kwVar, Context context, TLRPC.Document document) {
        super(context);
        this.N = kwVar;
        setFocusable(true);
        this.M = -1.0f;
        this.f26726b = true;
        this.h = false;
        this.f26729n = false;
        dw dwVar = new dw(this, context);
        this.d = dwVar;
        dwVar.f32202w = false;
        this.f26731s = document;
        this.f26727c = true;
        dwVar.setColorFilter(kwVar.getEmojiColorFilter());
        addView(dwVar);
        int i10 = sg.c1.L;
        sg.c1 c1Var = new sg.c1(context, 1, kwVar.v);
        this.f26728f = c1Var;
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
        this.f26726b = true;
        this.h = false;
        this.f26729n = false;
        ci.j4 j4Var = new ci.j4(this, context, 8);
        this.d = j4Var;
        j4Var.f32202w = false;
        this.f26730r = Long.valueOf(j10);
        this.f26727c = true;
        j4Var.setColorFilter(kwVar.getEmojiColorFilter());
        addView(j4Var);
        int i10 = sg.c1.L;
        sg.c1 c1Var = new sg.c1(context, 1, kwVar.v);
        this.f26728f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }
}
