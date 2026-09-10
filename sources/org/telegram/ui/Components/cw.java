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
public class cw extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final gw J;
    public Long f22232a;
    public boolean f22233b;
    public final boolean f22234c;
    public final w9 d;
    public final hj0 e;
    public final qg.e1 f22235f;
    public final boolean h;
    public final boolean f22236n;
    public Long f22237r;
    public TLRPC.Document f22238s;
    public dy v;
    public p5 f22239w;
    public boolean f22240x;
    public boolean f22241y;

    public cw(gw gwVar, Context context, int i10, int i11) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.h = true;
        this.f22236n = false;
        setBackground(org.telegram.ui.ActionBar.j6.M(gwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            hj0 hj0Var = new hj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = hj0Var;
            hj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            hj0Var.f23672v0 = this;
            hj0Var.J(true);
            hj0Var.start();
        } else {
            w9 w9Var = new w9(context);
            this.d = w9Var;
            w9Var.f28735w = false;
            w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(w9Var);
        }
        d();
    }

    private void setColor(int i10) {
        gw gwVar = this.J;
        int i11 = gwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = gwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        w9 w9Var = this.d;
        if (w9Var != null && !this.f22234c) {
            w9Var.setColorFilter(porterDuffColorFilter);
            w9Var.invalidate();
        }
        hj0 hj0Var = this.e;
        if (hj0Var != null) {
            hj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        qg.e1 e1Var = this.f22235f;
        if (e1Var == null) {
            return;
        }
        this.E = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            e1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        e1Var.setImageDrawable(mutate);
    }

    public final void b() {
        gg.h1 h1Var;
        p5 p5Var = this.f22239w;
        if (p5Var != null && (h1Var = p5Var.f26033k) != null) {
            if (h1Var.getLottieAnimation() != null) {
                h1Var.getLottieAnimation().M(0);
                h1Var.getLottieAnimation().stop();
            } else if (h1Var.getAnimation() != null) {
                h1Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        w9 w9Var = this.d;
        if (w9Var == null) {
            return;
        }
        if (this.f22240x && this.f22241y) {
            p5 p5Var = this.f22239w;
            if (p5Var == null && (this.f22238s != null || this.f22237r != null)) {
                w9Var.b();
                TLRPC.Document document = this.f22238s;
                gw gwVar = this.J;
                if (document != null) {
                    this.f22239w = p5.m(UserConfig.selectedAccount, gwVar.S, document);
                } else {
                    this.f22239w = p5.n(UserConfig.selectedAccount, this.f22237r.longValue(), null, gwVar.S);
                }
                this.f22239w.a(w9Var);
                w9Var.setImageDrawable(this.f22239w);
            } else {
                if (p5Var != null) {
                    p5Var.o(w9Var);
                    this.f22239w = null;
                }
                w9Var.b();
                dy dyVar = this.v;
                if (dyVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(dyVar.f22499b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            p5 p5Var2 = this.f22239w;
            if (p5Var2 != null) {
                p5Var2.o(w9Var);
                this.f22239w = null;
            }
            w9Var.b();
        }
        if (this.f22240x && this.f22241y) {
            w9Var.onAttachedToWindow();
        } else {
            w9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        gw gwVar = this.J;
        int k10 = gwVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = gwVar.v;
        org.telegram.ui.ActionBar.j6.B1(background, k10, false);
        if (gwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hj0 hj0Var = this.e;
        if (hj0Var != null && this.f22241y) {
            hj0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f22241y) {
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
        qg.e1 e1Var = this.f22235f;
        e1Var.setScaleX(f11);
        e1Var.setScaleY(this.F);
        e1Var.setAlpha(this.F);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        e1Var.setVisibility(i10);
    }

    public final void f() {
        qg.e1 e1Var = this.f22235f;
        if (e1Var != null && !e1Var.h && (getDrawable() instanceof p5)) {
            if (((p5) getDrawable()).c()) {
                e1Var.setImageReceiver(null);
                e1Var.setColor(this.J.Q);
                return;
            }
            gg.h1 h1Var = ((p5) getDrawable()).f26033k;
            if (h1Var != null) {
                e1Var.setImageReceiver(h1Var);
                e1Var.invalidate();
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
            ofFloat.addUpdateListener(new j6(this, 19));
            this.I.addListener(new yo(3, this, z10));
            ValueAnimator valueAnimator2 = this.I;
            if (yg.f0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.I.setInterpolator(wr.h);
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
        if (yg.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22240x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22240x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f22241y) {
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
            dy dyVar = this.v;
            if (dyVar != null && (stickerSet = dyVar.f22499b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f22238s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f22237r;
                    if (l4 != null && (f7 = p5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
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
        qg.e1 e1Var = this.f22235f;
        if (e1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            e1Var.layout(i16 - e1Var.getMeasuredWidth(), i17 - e1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        w9 w9Var = this.d;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        qg.e1 e1Var = this.f22235f;
        if (e1Var != null) {
            e1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        gg.h1 h1Var;
        p5 p5Var = this.f22239w;
        if (p5Var != null && (h1Var = p5Var.f26033k) != null) {
            if (h1Var.getAnimation() != null) {
                h1Var.getAnimation().y(0L, true, false);
            }
            h1Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f22238s;
        if ((document2 != null || this.f22237r != null) && document != null) {
            Long l4 = this.f22237r;
            if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = document2.f17201id;
            }
            if (j3 == document.f17201id) {
                return;
            }
        }
        p5 p5Var = this.f22239w;
        w9 w9Var = this.d;
        if (p5Var != null) {
            p5Var.o(w9Var);
            this.f22239w = null;
        }
        w9Var.b();
        this.f22238s = document;
        this.f22237r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f22238s;
        if ((document != null || this.f22237r != null) && j3 != 0) {
            Long l4 = this.f22237r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document.f17201id;
            }
            if (j10 == j3) {
                return;
            }
        }
        p5 p5Var = this.f22239w;
        w9 w9Var = this.d;
        Long l10 = null;
        if (p5Var != null) {
            p5Var.o(w9Var);
            this.f22239w = null;
        }
        w9Var.b();
        this.f22238s = null;
        if (j3 != 0) {
            l10 = Long.valueOf(j3);
        }
        this.f22237r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(dy dyVar) {
        if (dyVar != null && dyVar.f22499b == null) {
            dyVar = null;
        }
        dy dyVar2 = this.v;
        if (dyVar2 != null && dyVar != null && dyVar2.f22499b.f17222id == dyVar.f22499b.f17222id) {
            return;
        }
        p5 p5Var = this.f22239w;
        w9 w9Var = this.d;
        if (p5Var != null && this.f22238s == null && this.f22237r == null) {
            p5Var.o(w9Var);
            this.f22239w = null;
        }
        w9Var.b();
        this.v = dyVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (yg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public cw(gw gwVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.h = false;
        this.f22236n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.Y(gwVar.k(), 8, 8));
        }
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.f28735w = false;
        w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(w9Var);
    }

    public cw(gw gwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.f22233b = true;
        this.h = false;
        this.f22236n = false;
        zv zvVar = new zv(this, context);
        this.d = zvVar;
        zvVar.f28735w = false;
        this.f22238s = document;
        this.f22234c = true;
        zvVar.setColorFilter(gwVar.getEmojiColorFilter());
        addView(zvVar);
        int i10 = qg.e1.L;
        qg.e1 e1Var = new qg.e1(context, 1, gwVar.v);
        this.f22235f = e1Var;
        e1Var.setAlpha(0.0f);
        e1Var.setScaleX(0.0f);
        e1Var.setScaleY(0.0f);
        f();
        addView(e1Var);
        d();
    }

    public cw(gw gwVar, Context context, long j3) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.f22233b = true;
        this.h = false;
        this.f22236n = false;
        gg.i1 i1Var = new gg.i1(this, context, 7);
        this.d = i1Var;
        i1Var.f28735w = false;
        this.f22237r = Long.valueOf(j3);
        this.f22234c = true;
        i1Var.setColorFilter(gwVar.getEmojiColorFilter());
        addView(i1Var);
        int i10 = qg.e1.L;
        qg.e1 e1Var = new qg.e1(context, 1, gwVar.v);
        this.f22235f = e1Var;
        e1Var.setAlpha(0.0f);
        e1Var.setScaleX(0.0f);
        e1Var.setScaleY(0.0f);
        f();
        addView(e1Var);
        d();
    }
}
