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

public class iv extends ViewGroup {
    public Boolean A;
    public float B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public final mv F;

    public Long f29489a;

    public boolean f29490b;

    public final boolean f29491c;
    public final n9 d;

    public final oi0 f29492e;

    public final ag.k2 f29493f;
    public final boolean h;

    public final boolean f29494n;

    public Long f29495r;

    public TLRPC.Document f29496s;
    public kx v;

    public k5 f29497w;

    public boolean f29498x;

    public boolean f29499y;

    public iv(mv mvVar, Context context, int i10, int i11) {
        super(context);
        this.F = mvVar;
        setFocusable(true);
        this.h = true;
        this.f29494n = false;
        setBackground(org.telegram.ui.ActionBar.g6.M(mvVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            oi0 oi0Var = new oi0(i11, i0.a.k(i11, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.f29492e = oi0Var;
            oi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            oi0Var.f31328r0 = this;
            oi0Var.H(true);
            oi0Var.start();
        } else {
            n9 n9Var = new n9(context);
            this.d = n9Var;
            n9Var.f30906w = false;
            n9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(n9Var);
        }
        d();
    }

    private void setColor(int i10) {
        mv mvVar = this.F;
        int i11 = mvVar.Q;
        if (i11 == 5 || i11 == 7) {
            i10 = mvVar.M;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        n9 n9Var = this.d;
        if (n9Var != null && !this.f29491c) {
            n9Var.setColorFilter(porterDuffColorFilter);
            n9Var.invalidate();
        }
        oi0 oi0Var = this.f29492e;
        if (oi0Var != null) {
            oi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        ag.k2 k2Var = this.f29493f;
        if (k2Var == null) {
            return;
        }
        this.A = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            k2Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable drawableMutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        k2Var.setImageDrawable(drawableMutate);
    }

    public final void b() {
        jh.y2 y2Var;
        k5 k5Var = this.f29497w;
        if (k5Var == null || (y2Var = k5Var.f29961k) == null) {
            return;
        }
        if (y2Var.getLottieAnimation() != null) {
            y2Var.getLottieAnimation().K(0);
            y2Var.getLottieAnimation().stop();
        } else if (y2Var.getAnimation() != null) {
            y2Var.getAnimation().stop();
        }
    }

    public final void c() {
        n9 n9Var = this.d;
        if (n9Var == null) {
            return;
        }
        if (this.f29498x && this.f29499y) {
            k5 k5Var = this.f29497w;
            if (k5Var != null || (this.f29496s == null && this.f29495r == null)) {
                if (k5Var != null) {
                    k5Var.o(n9Var);
                    this.f29497w = null;
                }
                n9Var.b();
                kx kxVar = this.v;
                if (kxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(kxVar.f30205b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            } else {
                n9Var.b();
                TLRPC.Document document = this.f29496s;
                mv mvVar = this.F;
                if (document != null) {
                    this.f29497w = k5.m(UserConfig.selectedAccount, mvVar.P, document);
                } else {
                    this.f29497w = k5.n(UserConfig.selectedAccount, this.f29495r.longValue(), null, mvVar.P);
                }
                this.f29497w.a(n9Var);
                n9Var.setImageDrawable(this.f29497w);
            }
        } else {
            k5 k5Var2 = this.f29497w;
            if (k5Var2 != null) {
                k5Var2.o(n9Var);
                this.f29497w = null;
            }
            n9Var.b();
        }
        if (this.f29498x && this.f29499y) {
            n9Var.onAttachedToWindow();
        } else {
            n9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        mv mvVar = this.F;
        int iK = mvVar.k();
        org.telegram.ui.ActionBar.c6 c6Var = mvVar.v;
        org.telegram.ui.ActionBar.g6.B1(background, iK, false);
        if (mvVar.L) {
            setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.C) * 255.0f)));
        } else {
            setColor(i0.b.d(this.C, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oe, c6Var)));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        oi0 oi0Var = this.f29492e;
        if (oi0Var == null || !this.f29499y) {
            return;
        }
        oi0Var.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f29499y) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    public final void e(boolean z10) {
        if (Math.abs(this.B - (z10 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        this.B = f10;
        ag.k2 k2Var = this.f29493f;
        k2Var.setScaleX(f10);
        k2Var.setScaleY(this.B);
        k2Var.setAlpha(this.B);
        k2Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        ag.k2 k2Var = this.f29493f;
        if (k2Var == null || k2Var.h || !(getDrawable() instanceof k5)) {
            return;
        }
        if (((k5) getDrawable()).c()) {
            k2Var.setImageReceiver(null);
            k2Var.setColor(this.F.M);
            return;
        }
        jh.y2 y2Var = ((k5) getDrawable()).f29961k;
        if (y2Var != null) {
            k2Var.setImageReceiver(y2Var);
            k2Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        n9 n9Var = this.d;
        if ((n9Var == null || n9Var.getImageReceiver().getImageDrawable() != null || this.F.L) && this.D != z10) {
            this.D = z10;
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            if (!z10) {
                b();
            }
            if (!z11) {
                this.C = z10 ? 1.0f : 0.0f;
                d();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.C, z10 ? 1.0f : 0.0f);
            this.E = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new e6(this, 19));
            this.E.addListener(new org.telegram.ui.go(8, this, z10));
            this.E.setDuration(ig.g0.d() ? 0L : 350L);
            this.E.setInterpolator(er.h);
            this.E.start();
        }
    }

    public Drawable getDrawable() {
        n9 n9Var = this.d;
        if (n9Var != null) {
            return n9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (ig.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29498x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29498x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f29499y) {
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TLRPC.Document documentF;
        TLRPC.StickerSet stickerSet;
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            kx kxVar = this.v;
            if (kxVar == null || (stickerSet = kxVar.f30205b) == null || (charSequence = stickerSet.title) == null) {
                TLRPC.Document document = this.f29496s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l10 = this.f29495r;
                    if (l10 != null && (documentF = k5.f(UserConfig.selectedAccount, l10.longValue())) != null) {
                        contentDescription = MessageObject.findAnimatedEmojiEmoticon(documentF, null);
                    }
                }
            } else {
                contentDescription = charSequence;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n9 n9Var = this.d;
        if (n9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            n9Var.layout(i14 - (n9Var.getMeasuredWidth() / 2), i15 - (n9Var.getMeasuredHeight() / 2), (n9Var.getMeasuredWidth() / 2) + i14, (n9Var.getMeasuredHeight() / 2) + i15);
        }
        ag.k2 k2Var = this.f29493f;
        if (k2Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            k2Var.layout(i16 - k2Var.getMeasuredWidth(), i17 - k2Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        n9 n9Var = this.d;
        if (n9Var != null) {
            n9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        ag.k2 k2Var = this.f29493f;
        if (k2Var != null) {
            k2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        jh.y2 y2Var;
        k5 k5Var = this.f29497w;
        if (k5Var != null && (y2Var = k5Var.f29961k) != null) {
            if (y2Var.getAnimation() != null) {
                y2Var.getAnimation().y(0L, true, false);
            }
            y2Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        TLRPC.Document document2 = this.f29496s;
        if ((document2 != null || this.f29495r != null) && document != null) {
            Long l10 = this.f29495r;
            if ((l10 != null ? l10.longValue() : document2.f22386id) == document.f22386id) {
                return;
            }
        }
        k5 k5Var = this.f29497w;
        n9 n9Var = this.d;
        if (k5Var != null) {
            k5Var.o(n9Var);
            this.f29497w = null;
        }
        n9Var.b();
        this.f29496s = document;
        this.f29495r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        TLRPC.Document document = this.f29496s;
        if ((document != null || this.f29495r != null) && j10 != 0) {
            Long l10 = this.f29495r;
            if ((l10 != null ? l10.longValue() : document.f22386id) == j10) {
                return;
            }
        }
        k5 k5Var = this.f29497w;
        n9 n9Var = this.d;
        if (k5Var != null) {
            k5Var.o(n9Var);
            this.f29497w = null;
        }
        n9Var.b();
        this.f29496s = null;
        this.f29495r = j10 != 0 ? Long.valueOf(j10) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(kx kxVar) {
        if (kxVar != null && kxVar.f30205b == null) {
            kxVar = null;
        }
        kx kxVar2 = this.v;
        if (kxVar2 == null || kxVar == null || kxVar2.f30205b.f22407id != kxVar.f30205b.f22407id) {
            k5 k5Var = this.f29497w;
            n9 n9Var = this.d;
            if (k5Var != null && this.f29496s == null && this.f29495r == null) {
                k5Var.o(n9Var);
                this.f29497w = null;
            }
            n9Var.b();
            this.v = kxVar;
            c();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ig.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public iv(mv mvVar, Context context, int i10, boolean z10) {
        super(context);
        this.F = mvVar;
        setFocusable(true);
        this.h = false;
        this.f29494n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.g6.Y(mvVar.k(), 8, 8));
        }
        n9 n9Var = new n9(context);
        this.d = n9Var;
        n9Var.f30906w = false;
        n9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(n9Var);
    }

    public iv(mv mvVar, Context context, TLRPC.Document document) {
        super(context);
        this.F = mvVar;
        setFocusable(true);
        this.f29490b = true;
        this.h = false;
        this.f29494n = false;
        fv fvVar = new fv(this, context);
        this.d = fvVar;
        fvVar.f30906w = false;
        this.f29496s = document;
        this.f29491c = true;
        fvVar.setColorFilter(mvVar.getEmojiColorFilter());
        addView(fvVar);
        int i10 = ag.k2.H;
        gv gvVar = new gv(context, 1, mvVar.v);
        this.f29493f = gvVar;
        gvVar.setAlpha(0.0f);
        gvVar.setScaleX(0.0f);
        gvVar.setScaleY(0.0f);
        f();
        addView(gvVar);
        d();
    }

    public iv(mv mvVar, Context context, long j10) {
        super(context);
        this.F = mvVar;
        setFocusable(true);
        this.f29490b = true;
        this.h = false;
        this.f29494n = false;
        jh.z3 z3Var = new jh.z3(this, context, 7);
        this.d = z3Var;
        z3Var.f30906w = false;
        this.f29495r = Long.valueOf(j10);
        this.f29491c = true;
        z3Var.setColorFilter(mvVar.getEmojiColorFilter());
        addView(z3Var);
        int i10 = ag.k2.H;
        hv hvVar = new hv(context, 1, mvVar.v);
        this.f29493f = hvVar;
        hvVar.setAlpha(0.0f);
        hvVar.setScaleX(0.0f);
        hvVar.setScaleY(0.0f);
        f();
        addView(hvVar);
        d();
    }
}
