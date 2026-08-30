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
public class tv extends ViewGroup {
    public Boolean B;
    public float C;
    public float D;
    public boolean E;
    public ValueAnimator F;
    public final xv G;
    public Long f29048a;
    public boolean f29049b;
    public final boolean f29050c;
    public final p9 d;
    public final gj0 e;
    public final eg.s1 f29051f;
    public final boolean h;
    public final boolean f29052n;
    public Long f29053r;
    public TLRPC.Document f29054s;
    public vx v;
    public l5 f29055w;
    public boolean f29056x;
    public boolean f29057y;

    public tv(xv xvVar, Context context, int i10, int i11) {
        super(context);
        this.G = xvVar;
        setFocusable(true);
        this.h = true;
        this.f29052n = false;
        setBackground(org.telegram.ui.ActionBar.j6.M(xvVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            gj0 gj0Var = new gj0(i11, kh.a2.j(i11, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = gj0Var;
            gj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            gj0Var.f25170s0 = this;
            gj0Var.H(true);
            gj0Var.start();
        } else {
            p9 p9Var = new p9(context);
            this.d = p9Var;
            p9Var.f27792w = false;
            p9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(p9Var);
        }
        d();
    }

    private void setColor(int i10) {
        xv xvVar = this.G;
        int i11 = xvVar.Q;
        if (i11 == 5 || i11 == 7) {
            i10 = xvVar.N;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        p9 p9Var = this.d;
        if (p9Var != null && !this.f29050c) {
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
        eg.s1 s1Var = this.f29051f;
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
        l5 l5Var = this.f29055w;
        if (l5Var != null && (y2Var = l5Var.f26569k) != null) {
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
        if (this.f29056x && this.f29057y) {
            l5 l5Var = this.f29055w;
            if (l5Var == null && (this.f29054s != null || this.f29053r != null)) {
                p9Var.b();
                TLRPC.Document document = this.f29054s;
                xv xvVar = this.G;
                if (document != null) {
                    this.f29055w = l5.m(UserConfig.selectedAccount, xvVar.P, document);
                } else {
                    this.f29055w = l5.n(UserConfig.selectedAccount, this.f29053r.longValue(), null, xvVar.P);
                }
                this.f29055w.a(p9Var);
                p9Var.setImageDrawable(this.f29055w);
            } else {
                if (l5Var != null) {
                    l5Var.o(p9Var);
                    this.f29055w = null;
                }
                p9Var.b();
                vx vxVar = this.v;
                if (vxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(vxVar.f30100b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            l5 l5Var2 = this.f29055w;
            if (l5Var2 != null) {
                l5Var2.o(p9Var);
                this.f29055w = null;
            }
            p9Var.b();
        }
        if (this.f29056x && this.f29057y) {
            p9Var.onAttachedToWindow();
        } else {
            p9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        xv xvVar = this.G;
        int k10 = xvVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = xvVar.v;
        org.telegram.ui.ActionBar.j6.B1(background, k10, false);
        if (xvVar.M) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.D) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.D, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        gj0 gj0Var = this.e;
        if (gj0Var != null && this.f29057y) {
            gj0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f29057y) {
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
        eg.s1 s1Var = this.f29051f;
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
        eg.s1 s1Var = this.f29051f;
        if (s1Var != null && !s1Var.h && (getDrawable() instanceof l5)) {
            if (((l5) getDrawable()).c()) {
                s1Var.setImageReceiver(null);
                s1Var.setColor(this.G.N);
                return;
            }
            nh.y2 y2Var = ((l5) getDrawable()).f26569k;
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
            this.F.setInterpolator(nr.h);
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
        this.f29056x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29056x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f29057y) {
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
            if (vxVar != null && (stickerSet = vxVar.f30100b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f29054s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l10 = this.f29053r;
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
        eg.s1 s1Var = this.f29051f;
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
        eg.s1 s1Var = this.f29051f;
        if (s1Var != null) {
            s1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        nh.y2 y2Var;
        l5 l5Var = this.f29055w;
        if (l5Var != null && (y2Var = l5Var.f26569k) != null) {
            if (y2Var.getAnimation() != null) {
                y2Var.getAnimation().y(0L, true, false);
            }
            y2Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j10;
        TLRPC.Document document2 = this.f29054s;
        if ((document2 != null || this.f29053r != null) && document != null) {
            Long l10 = this.f29053r;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = document2.f19190id;
            }
            if (j10 == document.f19190id) {
                return;
            }
        }
        l5 l5Var = this.f29055w;
        p9 p9Var = this.d;
        if (l5Var != null) {
            l5Var.o(p9Var);
            this.f29055w = null;
        }
        p9Var.b();
        this.f29054s = document;
        this.f29053r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        long j11;
        TLRPC.Document document = this.f29054s;
        if ((document != null || this.f29053r != null) && j10 != 0) {
            Long l10 = this.f29053r;
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = document.f19190id;
            }
            if (j11 == j10) {
                return;
            }
        }
        l5 l5Var = this.f29055w;
        p9 p9Var = this.d;
        Long l11 = null;
        if (l5Var != null) {
            l5Var.o(p9Var);
            this.f29055w = null;
        }
        p9Var.b();
        this.f29054s = null;
        if (j10 != 0) {
            l11 = Long.valueOf(j10);
        }
        this.f29053r = l11;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(vx vxVar) {
        if (vxVar != null && vxVar.f30100b == null) {
            vxVar = null;
        }
        vx vxVar2 = this.v;
        if (vxVar2 != null && vxVar != null && vxVar2.f30100b.f19211id == vxVar.f30100b.f19211id) {
            return;
        }
        l5 l5Var = this.f29055w;
        p9 p9Var = this.d;
        if (l5Var != null && this.f29054s == null && this.f29053r == null) {
            l5Var.o(p9Var);
            this.f29055w = null;
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

    public tv(xv xvVar, Context context, int i10, boolean z4) {
        super(context);
        this.G = xvVar;
        setFocusable(true);
        this.h = false;
        this.f29052n = z4;
        if (z4) {
            setBackground(org.telegram.ui.ActionBar.j6.Y(xvVar.k(), 8, 8));
        }
        p9 p9Var = new p9(context);
        this.d = p9Var;
        p9Var.f27792w = false;
        p9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(p9Var);
    }

    public tv(xv xvVar, Context context, TLRPC.Document document) {
        super(context);
        this.G = xvVar;
        setFocusable(true);
        this.f29049b = true;
        this.h = false;
        this.f29052n = false;
        qv qvVar = new qv(this, context);
        this.d = qvVar;
        qvVar.f27792w = false;
        this.f29054s = document;
        this.f29050c = true;
        qvVar.setColorFilter(xvVar.getEmojiColorFilter());
        addView(qvVar);
        int i10 = eg.s1.I;
        eg.s1 s1Var = new eg.s1(context, 1, xvVar.v);
        this.f29051f = s1Var;
        s1Var.setAlpha(0.0f);
        s1Var.setScaleX(0.0f);
        s1Var.setScaleY(0.0f);
        f();
        addView(s1Var);
        d();
    }

    public tv(xv xvVar, Context context, long j10) {
        super(context);
        this.G = xvVar;
        setFocusable(true);
        this.f29049b = true;
        this.h = false;
        this.f29052n = false;
        nh.y3 y3Var = new nh.y3(this, context, 7);
        this.d = y3Var;
        y3Var.f27792w = false;
        this.f29053r = Long.valueOf(j10);
        this.f29050c = true;
        y3Var.setColorFilter(xvVar.getEmojiColorFilter());
        addView(y3Var);
        int i10 = eg.s1.I;
        eg.s1 s1Var = new eg.s1(context, 1, xvVar.v);
        this.f29051f = s1Var;
        s1Var.setAlpha(0.0f);
        s1Var.setScaleX(0.0f);
        s1Var.setScaleY(0.0f);
        f();
        addView(s1Var);
        d();
    }
}
