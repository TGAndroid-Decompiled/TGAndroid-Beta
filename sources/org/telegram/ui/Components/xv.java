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
public class xv extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final bw J;
    public Long f32738a;
    public boolean f32739b;
    public final boolean f32740c;
    public final x9 d;
    public final xi0 f32741e;
    public final sg.e1 f32742f;
    public final boolean h;
    public final boolean f32743n;
    public Long f32744r;
    public TLRPC.Document f32745s;
    public xx v;
    public q5 f32746w;
    public boolean f32747x;
    public boolean f32748y;

    public xv(bw bwVar, Context context, int i10, int i11) {
        super(context);
        this.J = bwVar;
        setFocusable(true);
        this.h = true;
        this.f32743n = false;
        setBackground(org.telegram.ui.ActionBar.j6.M(bwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.f32741e = xi0Var;
            xi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            xi0Var.f32578v0 = this;
            xi0Var.H(true);
            xi0Var.start();
        } else {
            x9 x9Var = new x9(context);
            this.d = x9Var;
            x9Var.f32484w = false;
            x9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(x9Var);
        }
        d();
    }

    private void setColor(int i10) {
        bw bwVar = this.J;
        int i11 = bwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = bwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        x9 x9Var = this.d;
        if (x9Var != null && !this.f32740c) {
            x9Var.setColorFilter(porterDuffColorFilter);
            x9Var.invalidate();
        }
        xi0 xi0Var = this.f32741e;
        if (xi0Var != null) {
            xi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        sg.e1 e1Var = this.f32742f;
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
        bi.y3 y3Var;
        q5 q5Var = this.f32746w;
        if (q5Var != null && (y3Var = q5Var.f29584k) != null) {
            if (y3Var.getLottieAnimation() != null) {
                y3Var.getLottieAnimation().K(0);
                y3Var.getLottieAnimation().stop();
            } else if (y3Var.getAnimation() != null) {
                y3Var.getAnimation().stop();
            }
        }
    }

    public final void c() {
        x9 x9Var = this.d;
        if (x9Var == null) {
            return;
        }
        if (this.f32747x && this.f32748y) {
            q5 q5Var = this.f32746w;
            if (q5Var == null && (this.f32745s != null || this.f32744r != null)) {
                x9Var.b();
                TLRPC.Document document = this.f32745s;
                bw bwVar = this.J;
                if (document != null) {
                    this.f32746w = q5.m(UserConfig.selectedAccount, bwVar.S, document);
                } else {
                    this.f32746w = q5.n(UserConfig.selectedAccount, this.f32744r.longValue(), null, bwVar.S);
                }
                this.f32746w.a(x9Var);
                x9Var.setImageDrawable(this.f32746w);
            } else {
                if (q5Var != null) {
                    q5Var.o(x9Var);
                    this.f32746w = null;
                }
                x9Var.b();
                xx xxVar = this.v;
                if (xxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(xxVar.f32764b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            }
        } else {
            q5 q5Var2 = this.f32746w;
            if (q5Var2 != null) {
                q5Var2.o(x9Var);
                this.f32746w = null;
            }
            x9Var.b();
        }
        if (this.f32747x && this.f32748y) {
            x9Var.onAttachedToWindow();
        } else {
            x9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        bw bwVar = this.J;
        int k10 = bwVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = bwVar.v;
        org.telegram.ui.ActionBar.j6.B1(background, k10, false);
        if (bwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
            return;
        }
        setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xi0 xi0Var = this.f32741e;
        if (xi0Var != null && this.f32748y) {
            xi0Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f32748y) {
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
        sg.e1 e1Var = this.f32742f;
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
        sg.e1 e1Var = this.f32742f;
        if (e1Var != null && !e1Var.h && (getDrawable() instanceof q5)) {
            if (((q5) getDrawable()).c()) {
                e1Var.setImageReceiver(null);
                e1Var.setColor(this.J.Q);
                return;
            }
            bi.y3 y3Var = ((q5) getDrawable()).f29584k;
            if (y3Var != null) {
                e1Var.setImageReceiver(y3Var);
                e1Var.invalidate();
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        long j3;
        x9 x9Var = this.d;
        if ((x9Var != null && x9Var.getImageReceiver().getImageDrawable() == null && !this.J.P) || this.H == z10) {
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
            ofFloat.addUpdateListener(new l6(this, 19));
            this.I.addListener(new org.telegram.ui.to(8, this, z10));
            ValueAnimator valueAnimator2 = this.I;
            if (ah.y0.d()) {
                j3 = 0;
            } else {
                j3 = 350;
            }
            valueAnimator2.setDuration(j3);
            this.I.setInterpolator(pr.h);
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
        x9 x9Var = this.d;
        if (x9Var != null) {
            return x9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (ah.y0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32747x = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32747x = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f32748y) {
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
            if (xxVar != null && (stickerSet = xxVar.f32764b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.f32745s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.f32744r;
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
        x9 x9Var = this.d;
        if (x9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            x9Var.layout(i14 - (x9Var.getMeasuredWidth() / 2), i15 - (x9Var.getMeasuredHeight() / 2), (x9Var.getMeasuredWidth() / 2) + i14, (x9Var.getMeasuredHeight() / 2) + i15);
        }
        sg.e1 e1Var = this.f32742f;
        if (e1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            e1Var.layout(i16 - e1Var.getMeasuredWidth(), i17 - e1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        x9 x9Var = this.d;
        if (x9Var != null) {
            x9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        sg.e1 e1Var = this.f32742f;
        if (e1Var != null) {
            e1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        bi.y3 y3Var;
        q5 q5Var = this.f32746w;
        if (q5Var != null && (y3Var = q5Var.f29584k) != null) {
            if (y3Var.getAnimation() != null) {
                y3Var.getAnimation().y(0L, true, false);
            }
            y3Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j3;
        TLRPC.Document document2 = this.f32745s;
        if ((document2 != null || this.f32744r != null) && document != null) {
            Long l4 = this.f32744r;
            if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = document2.f19875id;
            }
            if (j3 == document.f19875id) {
                return;
            }
        }
        q5 q5Var = this.f32746w;
        x9 x9Var = this.d;
        if (q5Var != null) {
            q5Var.o(x9Var);
            this.f32746w = null;
        }
        x9Var.b();
        this.f32745s = document;
        this.f32744r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        long j10;
        TLRPC.Document document = this.f32745s;
        if ((document != null || this.f32744r != null) && j3 != 0) {
            Long l4 = this.f32744r;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = document.f19875id;
            }
            if (j10 == j3) {
                return;
            }
        }
        q5 q5Var = this.f32746w;
        x9 x9Var = this.d;
        Long l10 = null;
        if (q5Var != null) {
            q5Var.o(x9Var);
            this.f32746w = null;
        }
        x9Var.b();
        this.f32745s = null;
        if (j3 != 0) {
            l10 = Long.valueOf(j3);
        }
        this.f32744r = l10;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(xx xxVar) {
        if (xxVar != null && xxVar.f32764b == null) {
            xxVar = null;
        }
        xx xxVar2 = this.v;
        if (xxVar2 != null && xxVar != null && xxVar2.f32764b.f19896id == xxVar.f32764b.f19896id) {
            return;
        }
        q5 q5Var = this.f32746w;
        x9 x9Var = this.d;
        if (q5Var != null && this.f32745s == null && this.f32744r == null) {
            q5Var.o(x9Var);
            this.f32746w = null;
        }
        x9Var.b();
        this.v = xxVar;
        c();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.y0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    public xv(bw bwVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = bwVar;
        setFocusable(true);
        this.h = false;
        this.f32743n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.Y(bwVar.k(), 8, 8));
        }
        x9 x9Var = new x9(context);
        this.d = x9Var;
        x9Var.f32484w = false;
        x9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(x9Var);
    }

    public xv(bw bwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = bwVar;
        setFocusable(true);
        this.f32739b = true;
        this.h = false;
        this.f32743n = false;
        uv uvVar = new uv(this, context);
        this.d = uvVar;
        uvVar.f32484w = false;
        this.f32745s = document;
        this.f32740c = true;
        uvVar.setColorFilter(bwVar.getEmojiColorFilter());
        addView(uvVar);
        int i10 = sg.e1.L;
        sg.e1 e1Var = new sg.e1(context, 1, bwVar.v);
        this.f32742f = e1Var;
        e1Var.setAlpha(0.0f);
        e1Var.setScaleX(0.0f);
        e1Var.setScaleY(0.0f);
        f();
        addView(e1Var);
        d();
    }

    public xv(bw bwVar, Context context, long j3) {
        super(context);
        this.J = bwVar;
        setFocusable(true);
        this.f32739b = true;
        this.h = false;
        this.f32743n = false;
        bi.i5 i5Var = new bi.i5(this, context, 8);
        this.d = i5Var;
        i5Var.f32484w = false;
        this.f32744r = Long.valueOf(j3);
        this.f32740c = true;
        i5Var.setColorFilter(bwVar.getEmojiColorFilter());
        addView(i5Var);
        int i10 = sg.e1.L;
        sg.e1 e1Var = new sg.e1(context, 1, bwVar.v);
        this.f32742f = e1Var;
        e1Var.setAlpha(0.0f);
        e1Var.setScaleX(0.0f);
        e1Var.setScaleY(0.0f);
        f();
        addView(e1Var);
        d();
    }
}
