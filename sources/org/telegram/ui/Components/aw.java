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
public class aw extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final ew J;
    public Long f22768a;
    public boolean f22769b;
    public final boolean f22770c;
    public final w9 d;
    public final jj0 e;
    public final rg.b1 f22771f;
    public final boolean h;
    public final boolean f22772n;
    public Long f22773r;
    public TLRPC.Document f22774s;
    public zx v;
    public q5 f22775w;
    public boolean f22776x;
    public boolean f22777y;

    public aw(ew ewVar, Context context, int i10, int i11) {
        super(context);
        this.J = ewVar;
        setFocusable(true);
        this.h = true;
        this.f22772n = false;
        setBackground(org.telegram.ui.ActionBar.h6.M(ewVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            jj0 jj0Var = new jj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = jj0Var;
            jj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            jj0Var.R(this);
            jj0Var.J(true);
            jj0Var.start();
        } else {
            w9 w9Var = new w9(context);
            this.d = w9Var;
            w9Var.f29965w = false;
            w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(w9Var);
        }
        d();
    }

    private void setColor(int i10) {
        ew ewVar = this.J;
        int i11 = ewVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = ewVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        w9 w9Var = this.d;
        if (w9Var != null && !this.f22770c) {
            w9Var.setColorFilter(porterDuffColorFilter);
            w9Var.invalidate();
        }
        jj0 jj0Var = this.e;
        if (jj0Var != null) {
            jj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        rg.b1 b1Var = this.f22771f;
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
        q5 q5Var = this.f22775w;
        if (q5Var != null && (l4Var = q5Var.f27588k) != null) {
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
        if (this.f22776x && this.f22777y) {
            q5 q5Var = this.f22775w;
            if (q5Var == null && (this.f22774s != null || this.f22773r != null)) {
                w9Var.b();
                TLRPC.Document document = this.f22774s;
                ew ewVar = this.J;
                if (document != null) {
                    this.f22775w = q5.m(UserConfig.selectedAccount, ewVar.S, document);
                } else {
                    this.f22775w = q5.n(UserConfig.selectedAccount, this.f22773r.longValue(), null, ewVar.S);
                }
                this.f22775w.a(w9Var);
                w9Var.setImageDrawable(this.f22775w);
            } else {
                if (q5Var != null) {
                    q5Var.o(w9Var);
                    this.f22775w = null;
                }
                w9Var.b();
                zx zxVar = this.v;
                if (zxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(zxVar.f30992b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            q5 q5Var2 = this.f22775w;
            if (q5Var2 != null) {
                q5Var2.o(w9Var);
                this.f22775w = null;
            }
            w9Var.b();
        }
        if (this.f22776x && this.f22777y) {
            w9Var.onAttachedToWindow();
        } else {
            w9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        ew ewVar = this.J;
        int k10 = ewVar.k();
        org.telegram.ui.ActionBar.d6 d6Var = ewVar.v;
        org.telegram.ui.ActionBar.h6.B1(background, k10, false);
        if (ewVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Wk, d6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Me, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oe, d6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        jj0 jj0Var = this.e;
        if (jj0Var != null && this.f22777y) {
            jj0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f22777y) {
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
        rg.b1 b1Var = this.f22771f;
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
        rg.b1 b1Var = this.f22771f;
        if (b1Var != null && !b1Var.h && (getDrawable() instanceof q5)) {
            if (((q5) getDrawable()).c()) {
                b1Var.setImageReceiver(null);
                b1Var.setColor(this.J.Q);
                return;
            }
            ai.l4 l4Var = ((q5) getDrawable()).f27588k;
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
            if (zg.e0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.I.setInterpolator(sr.h);
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
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22776x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22776x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f22777y) {
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
            zx zxVar = this.v;
            if (zxVar != null && (stickerSet = zxVar.f30992b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f22774s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f22773r;
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
        rg.b1 b1Var = this.f22771f;
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
        rg.b1 b1Var = this.f22771f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        ai.l4 l4Var;
        q5 q5Var = this.f22775w;
        if (q5Var != null && (l4Var = q5Var.f27588k) != null) {
            if (l4Var.getAnimation() != null) {
                l4Var.getAnimation().y(0L, true, false);
            }
            l4Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f22774s;
        if ((document2 != null || this.f22773r != null) && document != null) {
            Long l4 = this.f22773r;
            if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = document2.f18341id;
            }
            if (j3 == document.f18341id) {
                return;
            }
        }
        q5 q5Var = this.f22775w;
        w9 w9Var = this.d;
        if (q5Var != null) {
            q5Var.o(w9Var);
            this.f22775w = null;
        }
        w9Var.b();
        this.f22774s = document;
        this.f22773r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f22774s;
        if ((document != null || this.f22773r != null) && j3 != 0) {
            Long l4 = this.f22773r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document.f18341id;
            }
            if (j10 == j3) {
                return;
            }
        }
        q5 q5Var = this.f22775w;
        w9 w9Var = this.d;
        Long l10 = null;
        if (q5Var != null) {
            q5Var.o(w9Var);
            this.f22775w = null;
        }
        w9Var.b();
        this.f22774s = null;
        if (j3 != 0) {
            l10 = Long.valueOf(j3);
        }
        this.f22773r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(zx zxVar) {
        if (zxVar != null && zxVar.f30992b == null) {
            zxVar = null;
        }
        zx zxVar2 = this.v;
        if (zxVar2 != null && zxVar != null && zxVar2.f30992b.f18362id == zxVar.f30992b.f18362id) {
            return;
        }
        q5 q5Var = this.f22775w;
        w9 w9Var = this.d;
        if (q5Var != null && this.f22774s == null && this.f22773r == null) {
            q5Var.o(w9Var);
            this.f22775w = null;
        }
        w9Var.b();
        this.v = zxVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public aw(ew ewVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = ewVar;
        setFocusable(true);
        this.h = false;
        this.f22772n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.h6.Y(ewVar.k(), 8, 8));
        }
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.f29965w = false;
        w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(w9Var);
    }

    public aw(ew ewVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = ewVar;
        setFocusable(true);
        this.f22769b = true;
        this.h = false;
        this.f22772n = false;
        xv xvVar = new xv(this, context);
        this.d = xvVar;
        xvVar.f29965w = false;
        this.f22774s = document;
        this.f22770c = true;
        xvVar.setColorFilter(ewVar.getEmojiColorFilter());
        addView(xvVar);
        int i10 = rg.b1.L;
        rg.b1 b1Var = new rg.b1(context, 1, ewVar.v);
        this.f22771f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }

    public aw(ew ewVar, Context context, long j3) {
        super(context);
        this.J = ewVar;
        setFocusable(true);
        this.f22769b = true;
        this.h = false;
        this.f22772n = false;
        ai.y5 y5Var = new ai.y5(this, context, 8);
        this.d = y5Var;
        y5Var.f29965w = false;
        this.f22773r = Long.valueOf(j3);
        this.f22770c = true;
        y5Var.setColorFilter(ewVar.getEmojiColorFilter());
        addView(y5Var);
        int i10 = rg.b1.L;
        rg.b1 b1Var = new rg.b1(context, 1, ewVar.v);
        this.f22771f = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setScaleX(0.0f);
        b1Var.setScaleY(0.0f);
        f();
        addView(b1Var);
        d();
    }
}
