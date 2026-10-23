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
public class gw extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final kw J;
    public Long f26677a;
    public boolean f26678b;
    public final boolean f26679c;
    public final w9 d;
    public final vj0 e;
    public final sg.c1 f26680f;
    public final boolean h;
    public final boolean f26681n;
    public Long f26682r;
    public TLRPC.Document f26683s;
    public fy v;
    public r5 f26684w;
    public boolean f26685x;
    public boolean f26686y;

    public gw(kw kwVar, Context context, int i10) {
        super(context);
        this.J = kwVar;
        setFocusable(true);
        this.h = true;
        this.f26681n = false;
        setBackground(org.telegram.ui.ActionBar.h6.N(kwVar.k(), 0, 0));
        vj0 vj0Var = new vj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
        this.e = vj0Var;
        vj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
        vj0Var.R(this);
        vj0Var.J(true);
        vj0Var.start();
        d();
    }

    private void setColor(int i10) {
        kw kwVar = this.J;
        int i11 = kwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = kwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        w9 w9Var = this.d;
        if (w9Var != null && !this.f26679c) {
            w9Var.setColorFilter(porterDuffColorFilter);
            w9Var.invalidate();
        }
        vj0 vj0Var = this.e;
        if (vj0Var != null) {
            vj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        sg.c1 c1Var = this.f26680f;
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
        ci.g3 g3Var;
        r5 r5Var = this.f26684w;
        if (r5Var != null && (g3Var = r5Var.f29842k) != null) {
            if (g3Var.getLottieAnimation() != null) {
                g3Var.getLottieAnimation().M(0);
                g3Var.getLottieAnimation().stop();
            } else if (g3Var.getAnimation() != null) {
                g3Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        w9 w9Var = this.d;
        if (w9Var == null) {
            return;
        }
        if (this.f26685x && this.f26686y) {
            r5 r5Var = this.f26684w;
            if (r5Var == null && (this.f26683s != null || this.f26682r != null)) {
                w9Var.b();
                TLRPC.Document document = this.f26683s;
                kw kwVar = this.J;
                if (document != null) {
                    this.f26684w = r5.m(UserConfig.selectedAccount, kwVar.S, document);
                } else {
                    this.f26684w = r5.n(UserConfig.selectedAccount, this.f26682r.longValue(), null, kwVar.S);
                }
                this.f26684w.a(w9Var);
                w9Var.setImageDrawable(this.f26684w);
            } else {
                if (r5Var != null) {
                    r5Var.o(w9Var);
                    this.f26684w = null;
                }
                w9Var.b();
                fy fyVar = this.v;
                if (fyVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(fyVar.f26439b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            r5 r5Var2 = this.f26684w;
            if (r5Var2 != null) {
                r5Var2.o(w9Var);
                this.f26684w = null;
            }
            w9Var.b();
        }
        if (this.f26685x && this.f26686y) {
            w9Var.onAttachedToWindow();
        } else {
            w9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        kw kwVar = this.J;
        int k10 = kwVar.k();
        org.telegram.ui.ActionBar.d6 d6Var = kwVar.v;
        org.telegram.ui.ActionBar.h6.C1(background, k10, false);
        if (kwVar.P) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, d6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.f(this.G, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Me, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oe, d6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vj0 vj0Var = this.e;
        if (vj0Var != null && this.f26686y) {
            vj0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f26686y) {
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
        sg.c1 c1Var = this.f26680f;
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
        sg.c1 c1Var = this.f26680f;
        if (c1Var != null && !c1Var.h && (getDrawable() instanceof r5)) {
            if (((r5) getDrawable()).c()) {
                c1Var.setImageReceiver(null);
                c1Var.setColor(this.J.Q);
                return;
            }
            ci.g3 g3Var = ((r5) getDrawable()).f29842k;
            if (g3Var != null) {
                c1Var.setImageReceiver(g3Var);
                c1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j10;
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
            ofFloat.addUpdateListener(new l6(this, 20));
            this.I.addListener(new org.telegram.ui.fo(8, this, z10));
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
        this.f26685x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26685x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f26686y) {
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
            if (fyVar != null && (stickerSet = fyVar.f26439b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f26683s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f26682r;
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
        sg.c1 c1Var = this.f26680f;
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
        sg.c1 c1Var = this.f26680f;
        if (c1Var != null) {
            c1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ci.g3 g3Var;
        r5 r5Var = this.f26684w;
        if (r5Var != null && (g3Var = r5Var.f29842k) != null) {
            if (g3Var.getAnimation() != null) {
                g3Var.getAnimation().y(0L, true, false);
            }
            g3Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f26683s;
        if ((document2 != null || this.f26682r != null) && document != null) {
            Long l4 = this.f26682r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document2.f20286id;
            }
            if (j10 == document.f20286id) {
                return;
            }
        }
        r5 r5Var = this.f26684w;
        w9 w9Var = this.d;
        if (r5Var != null) {
            r5Var.o(w9Var);
            this.f26684w = null;
        }
        w9Var.b();
        this.f26683s = document;
        this.f26682r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f26683s;
        if ((document != null || this.f26682r != null) && j10 != 0) {
            Long l4 = this.f26682r;
            if (l4 != null) {
                j11 = l4.longValue();
            } else {
                j11 = document.f20286id;
            }
            if (j11 == j10) {
                return;
            }
        }
        r5 r5Var = this.f26684w;
        w9 w9Var = this.d;
        Long l10 = null;
        if (r5Var != null) {
            r5Var.o(w9Var);
            this.f26684w = null;
        }
        w9Var.b();
        this.f26683s = null;
        if (j10 != 0) {
            l10 = Long.valueOf(j10);
        }
        this.f26682r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(fy fyVar) {
        if (fyVar != null && fyVar.f26439b == null) {
            fyVar = null;
        }
        fy fyVar2 = this.v;
        if (fyVar2 != null && fyVar != null && fyVar2.f26439b.f20307id == fyVar.f26439b.f20307id) {
            return;
        }
        r5 r5Var = this.f26684w;
        w9 w9Var = this.d;
        if (r5Var != null && this.f26683s == null && this.f26682r == null) {
            r5Var.o(w9Var);
            this.f26684w = null;
        }
        w9Var.b();
        this.v = fyVar;
        c();
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
        this.J = kwVar;
        setFocusable(true);
        this.h = false;
        this.f26681n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.h6.Z(kwVar.k(), 8, 8));
        }
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.f32004w = false;
        w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(w9Var);
    }

    public gw(kw kwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = kwVar;
        setFocusable(true);
        this.f26678b = true;
        this.h = false;
        this.f26681n = false;
        dw dwVar = new dw(this, context);
        this.d = dwVar;
        dwVar.f32004w = false;
        this.f26683s = document;
        this.f26679c = true;
        dwVar.setColorFilter(kwVar.getEmojiColorFilter());
        addView(dwVar);
        int i10 = sg.c1.L;
        sg.c1 c1Var = new sg.c1(context, 1, kwVar.v);
        this.f26680f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }

    public gw(kw kwVar, Context context, long j10) {
        super(context);
        this.J = kwVar;
        setFocusable(true);
        this.f26678b = true;
        this.h = false;
        this.f26681n = false;
        ci.k4 k4Var = new ci.k4(this, context, 8);
        this.d = k4Var;
        k4Var.f32004w = false;
        this.f26682r = Long.valueOf(j10);
        this.f26679c = true;
        k4Var.setColorFilter(kwVar.getEmojiColorFilter());
        addView(k4Var);
        int i10 = sg.c1.L;
        sg.c1 c1Var = new sg.c1(context, 1, kwVar.v);
        this.f26680f = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setScaleX(0.0f);
        c1Var.setScaleY(0.0f);
        f();
        addView(c1Var);
        d();
    }
}
