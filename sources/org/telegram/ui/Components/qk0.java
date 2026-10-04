package org.telegram.ui.Components;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qk0 extends FrameLayout {
    public boolean E;
    public yh.j8 F;
    public final nk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final nk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final sk0 P;
    public final pk0 f30057a;
    public final pk0 f30058b;
    public final pk0 f30059c;
    public final ImageReceiver d;
    public zg.o0 f30060e;
    public rg.c1 f30061f;
    public float h;
    public boolean f30062n;
    public boolean f30063r;
    public boolean f30064s;
    public boolean v;
    public boolean f30065w;
    public boolean f30066x;
    public int f30067y;

    public qk0(sk0 sk0Var, Context context) {
        super(context);
        this.P = sk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f30066x = true;
        this.G = new nk0(this, 0);
        this.I = 1.0f;
        this.K = new nk0(this, 1);
        this.O = true;
        pk0 pk0Var = new pk0(this, context, 0);
        this.f30057a = pk0Var;
        pk0 pk0Var2 = new pk0(this, context, 1);
        this.f30058b = pk0Var2;
        pk0Var.getImageReceiver().setAutoRepeat(0);
        pk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        pk0 pk0Var3 = new pk0(this, context, 2);
        this.f30059c = pk0Var3;
        addView(pk0Var, w7.z5.e(34, 34, 17));
        addView(pk0Var3, w7.z5.e(34, 34, 17));
        addView(pk0Var2, w7.z5.e(34, 34, 17));
        if (sk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        pk0Var.setLayerNum(Integer.MAX_VALUE);
        pk0Var2.setLayerNum(Integer.MAX_VALUE);
        pk0Var2.f32486a.setAutoRepeat(0);
        pk0Var2.f32486a.setAllowStartAnimation(false);
        pk0Var2.f32486a.setAllowStartLottieAnimation(false);
        pk0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(qk0 qk0Var, zg.o0 o0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        pk0 pk0Var = qk0Var.f30059c;
        pk0 pk0Var2 = qk0Var.f30057a;
        pk0 pk0Var3 = qk0Var.f30058b;
        sk0 sk0Var = qk0Var.P;
        qk0Var.f(o0Var, false);
        zg.o0 o0Var2 = qk0Var.f30060e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            qk0Var.f30067y = i10;
            qk0Var.e(o0Var);
            return;
        }
        int i12 = sk0Var.J;
        org.telegram.ui.ActionBar.d6 d6Var = sk0Var.f30778k0;
        int i13 = sk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && o0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        qk0Var.H = z10;
        if (z10 && qk0Var.f30061f == null) {
            rg.c1 c1Var = new rg.c1(qk0Var.getContext(), 1, null);
            qk0Var.f30061f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            qk0Var.f30061f.setImageReceiver(pk0Var3.getImageReceiver());
            qk0Var.addView(qk0Var.f30061f, w7.z5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        rg.c1 c1Var2 = qk0Var.f30061f;
        if (c1Var2 != null) {
            if (qk0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        qk0Var.d();
        qk0Var.f30060e = o0Var;
        if (!o0Var.f53475a && (o0Var.f53479f == null || ((!sk0Var.q() && !sk0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        qk0Var.f30063r = z11;
        if (i13 == 4 || qk0Var.f30060e.f53476b) {
            qk0Var.f30063r = false;
        }
        zg.o0 o0Var3 = qk0Var.f30060e;
        if (!o0Var3.f53475a && o0Var3.f53479f == null) {
            pk0Var.getImageReceiver().clearImage();
            pk0Var3.getImageReceiver().clearImage();
            q5 q5Var = new q5(4, sk0Var.J, qk0Var.f30060e.f53480g);
            q5 q5Var2 = new q5(3, sk0Var.J, qk0Var.f30060e.f53480g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.i6.f21152v6;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i14, d6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                q5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i14, d6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                q5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            pk0Var.setAnimatedEmojiDrawable(q5Var);
            pk0Var3.setAnimatedEmojiDrawable(q5Var2);
            rg.c1 c1Var3 = qk0Var.f30061f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(q5Var2);
            }
        } else {
            qk0Var.e(o0Var);
            pk0Var.setAnimatedEmojiDrawable(null);
            if (pk0Var2.getImageReceiver().getLottieAnimation() != null) {
                pk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.c1 c1Var4 = qk0Var.f30061f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        qk0Var.setFocusable(true);
        boolean z12 = qk0Var.f30063r;
        qk0Var.f30064s = z12;
        if (!z12) {
            pk0Var2.setVisibility(8);
            pk0Var3.setVisibility(0);
            qk0Var.v = true;
        } else {
            qk0Var.v = false;
            pk0Var2.setVisibility(0);
            pk0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = pk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = pk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = pk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = pk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        pk0 pk0Var = this.f30058b;
        q5 q5Var = pk0Var.f32489e;
        if (q5Var != null) {
            imageReceiver = q5Var.f29908k;
        } else {
            imageReceiver = pk0Var.f32486a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            sk0 sk0Var = this.P;
            if (sk0Var.f30795x0 == null && !this.N && sk0Var.G0) {
                if (imageReceiver.getLottieAnimation().f28118a0 <= 2) {
                    imageReceiver.getLottieAnimation().stop();
                    return;
                }
                return;
            }
            imageReceiver.getLottieAnimation().start();
        }
    }

    public final void c(int i10) {
        float f7;
        float f10;
        float f11 = 0.76f;
        if (!this.P.f30776j0) {
            d();
            this.f30062n = true;
            if (!this.f30063r) {
                this.f30058b.setVisibility(0);
                pk0 pk0Var = this.f30058b;
                float f12 = this.I;
                if (this.f30065w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                pk0Var.setScaleY(f12 * f10);
                pk0 pk0Var2 = this.f30058b;
                float f13 = this.I;
                if (!this.f30065w) {
                    f11 = 1.0f;
                }
                pk0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f30063r) {
            if (this.f30057a.getImageReceiver().getLottieAnimation() != null && !this.f30057a.getImageReceiver().getLottieAnimation().y() && !this.f30062n) {
                this.f30062n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f30057a.getImageReceiver().getLottieAnimation().stop();
                    this.f30057a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f30057a.getImageReceiver().getLottieAnimation().stop();
                this.f30057a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f30057a.getImageReceiver().getLottieAnimation() != null && this.f30062n && !this.f30057a.getImageReceiver().getLottieAnimation().f28132k0 && !this.f30057a.getImageReceiver().getLottieAnimation().y()) {
                this.f30057a.getImageReceiver().getLottieAnimation().N(this.f30057a.getImageReceiver().getLottieAnimation().f28124e[0] - 1, false, false);
            }
            pk0 pk0Var3 = this.f30058b;
            float f14 = this.I;
            if (this.f30065w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            pk0Var3.setScaleY(f14 * f7);
            pk0 pk0Var4 = this.f30058b;
            float f15 = this.I;
            if (!this.f30065w) {
                f11 = 1.0f;
            }
            pk0Var4.setScaleX(f15 * f11);
        } else if (!this.f30062n) {
            this.I = 0.0f;
            this.f30058b.setScaleX(0.0f);
            this.f30058b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new v70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(tr.h);
            this.J.setStartDelay(i10 * this.P.f30759c);
            this.J.start();
            this.f30062n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f30063r;
        sk0 sk0Var = this.P;
        float f11 = 1.0f;
        pk0 pk0Var = this.f30058b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            pk0 pk0Var2 = this.f30057a;
            if (pk0Var2.getImageReceiver().getLottieAnimation() != null && !pk0Var2.getImageReceiver().getLottieAnimation().y()) {
                pk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (sk0Var.f30776j0) {
                    pk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    pk0Var2.getImageReceiver().getLottieAnimation().N(pk0Var2.getImageReceiver().getLottieAnimation().f28124e[0] - 1, false, true);
                }
            }
            pk0Var.setVisibility(4);
            pk0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f30065w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            pk0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f30065w) {
                f11 = 0.76f;
            }
            pk0Var.setScaleX(f13 * f11);
        } else {
            pk0Var.animate().cancel();
            if (sk0Var.N0) {
                float f14 = this.I;
                if (this.f30065w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                pk0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f30065w) {
                    f11 = 0.76f;
                }
                pk0Var.setScaleX(f15 * f11);
            } else {
                pk0Var.setScaleY(0.0f);
                pk0Var.setScaleX(0.0f);
            }
        }
        this.f30062n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.l4 l4Var;
        Paint paint;
        if (this.f30065w && this.f30066x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.o0 o0Var = this.f30060e;
            sk0 sk0Var = this.P;
            if (o0Var != null && o0Var.f53475a) {
                paint = sk0Var.I0;
            } else {
                paint = sk0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        q5 q5Var = this.f30058b.f32489e;
        if (q5Var != null && (l4Var = q5Var.f29908k) != null) {
            int i11 = 0;
            if (this.f30067y == 0) {
                l4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f30065w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                l4Var.setRoundRadius(i11);
            }
        }
        zg.o0 o0Var2 = this.f30060e;
        if (o0Var2 != null && o0Var2.f53475a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            kj0 lottieAnimation = this.f30057a.getImageReceiver().getLottieAnimation();
            yh.j8 j8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f28118a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            j8Var.f51492j = (int) (j8Var.f51486b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(zg.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        sk0 sk0Var = this.P;
        int i11 = sk0Var.M0;
        pk0 pk0Var = this.f30057a;
        pk0 pk0Var2 = this.f30058b;
        if (o0Var != null && o0Var.f53475a) {
            pk0Var.getImageReceiver().setImageBitmap(new kj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            pk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.j8(1, i10);
            }
        } else if (i11 == 4 && o0Var != null && o0Var.f53479f != null) {
            pk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f53479f));
            pk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f53479f));
        } else {
            zg.o0 o0Var2 = this.f30060e;
            if (o0Var2.f53476b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(sk0Var.J).getEffectDocument(this.f30060e.f53480g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.i6.f20983m6, 0.2f);
                ImageReceiver imageReceiver = pk0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f30063r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.f30060e, 0);
            } else if (o0Var2.f53479f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(sk0Var.J).getReactionsMap().get(this.f30060e.f53479f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.i6.f20983m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            pk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                            ImageReceiver imageReceiver2 = pk0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f30063r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.f30060e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = pk0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f30063r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.f30060e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        pk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                        ImageReceiver imageReceiver4 = pk0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f30063r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.f30060e, 0);
                    }
                    if (pk0Var.getImageReceiver().getLottieAnimation() != null) {
                        pk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f30059c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(sk0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
                }
                rg.c1 c1Var = this.f30061f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(pk0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(zg.o0 o0Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f30065w;
        boolean contains = this.P.f30762d0.contains(o0Var);
        this.f30065w = contains;
        if (contains != z11) {
            pk0 pk0Var = this.f30057a;
            pk0 pk0Var2 = this.f30058b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                pk0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f30065w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                pk0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f30065w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                pk0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f30065w) {
                    f15 = 0.76f;
                }
                pk0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = pk0Var2.animate();
                float f20 = this.I;
                if (this.f30065w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f30065w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                tr trVar = tr.h;
                duration.setInterpolator(trVar).start();
                ViewPropertyAnimator animate2 = pk0Var.animate();
                float f22 = this.I;
                if (this.f30065w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f30065w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(trVar).start();
            }
            requestLayout();
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        zg.o0 o0Var = this.f30060e;
        if (o0Var != null) {
            String str = o0Var.f53479f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrCustomEmoji));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        rk0 rk0Var;
        if (this.O) {
            sk0 sk0Var = this.P;
            if (sk0Var.Q == null) {
                int action = motionEvent.getAction();
                nk0 nk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = sk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((rk0Var = sk0Var.f30770g0) == null || rk0Var.j())) {
                        AndroidUtilities.runOnUIThread(nk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((sk0Var.f30779l0 == null || sk0Var.f30781n0 > 0.8f) && sk0Var.f30770g0 != null)) {
                    sk0Var.f30786r0 = true;
                    if (System.currentTimeMillis() - sk0Var.f30788s0 > 300) {
                        sk0Var.f30788s0 = System.currentTimeMillis();
                        rk0 rk0Var2 = sk0Var.f30770g0;
                        zg.o0 o0Var = this.f30060e;
                        if (sk0Var.f30781n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        rk0Var2.h(this, o0Var, z10, false);
                    }
                }
                if (!sk0Var.f30786r0 && sk0Var.f30779l0 != null) {
                    sk0Var.f30782o0 = 0.0f;
                    float f7 = sk0Var.f30781n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    sk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new gk0(sk0Var, f7));
                    sk0Var.Q.addListener(new ci.u5(sk0Var, 2));
                    sk0Var.Q.setDuration(150L);
                    sk0Var.Q.setInterpolator(tr.f31140f);
                    sk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(nk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
