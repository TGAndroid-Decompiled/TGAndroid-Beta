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
public final class nk0 extends FrameLayout {
    public boolean E;
    public yh.i8 F;
    public final kk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final kk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final pk0 P;
    public final mk0 f26670a;
    public final mk0 f26671b;
    public final mk0 f26672c;
    public final ImageReceiver d;
    public zg.o0 e;
    public rg.b1 f26673f;
    public float h;
    public boolean f26674n;
    public boolean f26675r;
    public boolean f26676s;
    public boolean v;
    public boolean f26677w;
    public boolean f26678x;
    public int f26679y;

    public nk0(pk0 pk0Var, Context context) {
        super(context);
        this.P = pk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f26678x = true;
        this.G = new kk0(this, 0);
        this.I = 1.0f;
        this.K = new kk0(this, 1);
        this.O = true;
        mk0 mk0Var = new mk0(this, context, 0);
        this.f26670a = mk0Var;
        mk0 mk0Var2 = new mk0(this, context, 1);
        this.f26671b = mk0Var2;
        mk0Var.getImageReceiver().setAutoRepeat(0);
        mk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        mk0 mk0Var3 = new mk0(this, context, 2);
        this.f26672c = mk0Var3;
        addView(mk0Var, w7.y5.e(34, 34, 17));
        addView(mk0Var3, w7.y5.e(34, 34, 17));
        addView(mk0Var2, w7.y5.e(34, 34, 17));
        if (pk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        mk0Var.setLayerNum(Integer.MAX_VALUE);
        mk0Var2.setLayerNum(Integer.MAX_VALUE);
        mk0Var2.f29029a.setAutoRepeat(0);
        mk0Var2.f29029a.setAllowStartAnimation(false);
        mk0Var2.f29029a.setAllowStartLottieAnimation(false);
        mk0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(nk0 nk0Var, zg.o0 o0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        mk0 mk0Var = nk0Var.f26672c;
        mk0 mk0Var2 = nk0Var.f26670a;
        mk0 mk0Var3 = nk0Var.f26671b;
        pk0 pk0Var = nk0Var.P;
        nk0Var.f(o0Var, false);
        zg.o0 o0Var2 = nk0Var.e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            nk0Var.f26679y = i10;
            nk0Var.e(o0Var);
            return;
        }
        int i12 = pk0Var.J;
        org.telegram.ui.ActionBar.f6 f6Var = pk0Var.f27359k0;
        int i13 = pk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && o0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        nk0Var.H = z10;
        if (z10 && nk0Var.f26673f == null) {
            rg.b1 b1Var = new rg.b1(nk0Var.getContext(), 1, null);
            nk0Var.f26673f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            nk0Var.f26673f.setImageReceiver(mk0Var3.getImageReceiver());
            nk0Var.addView(nk0Var.f26673f, w7.y5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        rg.b1 b1Var2 = nk0Var.f26673f;
        if (b1Var2 != null) {
            if (nk0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b1Var2.setVisibility(i11);
        }
        nk0Var.d();
        nk0Var.e = o0Var;
        if (!o0Var.f49420a && (o0Var.f49423f == null || ((!pk0Var.q() && !pk0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        nk0Var.f26675r = z11;
        if (i13 == 4 || nk0Var.e.f49421b) {
            nk0Var.f26675r = false;
        }
        zg.o0 o0Var3 = nk0Var.e;
        if (!o0Var3.f49420a && o0Var3.f49423f == null) {
            mk0Var.getImageReceiver().clearImage();
            mk0Var3.getImageReceiver().clearImage();
            p5 p5Var = new p5(4, pk0Var.J, nk0Var.e.f49424g);
            p5 p5Var2 = new p5(3, pk0Var.J, nk0Var.e.f49424g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.j6.f19425v6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                p5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                p5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                p5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            mk0Var.setAnimatedEmojiDrawable(p5Var);
            mk0Var3.setAnimatedEmojiDrawable(p5Var2);
            rg.b1 b1Var3 = nk0Var.f26673f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(p5Var2);
            }
        } else {
            nk0Var.e(o0Var);
            mk0Var.setAnimatedEmojiDrawable(null);
            if (mk0Var2.getImageReceiver().getLottieAnimation() != null) {
                mk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            rg.b1 b1Var4 = nk0Var.f26673f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        nk0Var.setFocusable(true);
        boolean z12 = nk0Var.f26675r;
        nk0Var.f26676s = z12;
        if (!z12) {
            mk0Var2.setVisibility(8);
            mk0Var3.setVisibility(0);
            nk0Var.v = true;
        } else {
            nk0Var.v = false;
            mk0Var2.setVisibility(0);
            mk0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = mk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = mk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = mk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = mk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        mk0 mk0Var = this.f26671b;
        p5 p5Var = mk0Var.e;
        if (p5Var != null) {
            imageReceiver = p5Var.f27162k;
        } else {
            imageReceiver = mk0Var.f29029a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            pk0 pk0Var = this.P;
            if (pk0Var.f27376x0 == null && !this.N && pk0Var.G0) {
                if (imageReceiver.getLottieAnimation().f24678a0 <= 2) {
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
        if (!this.P.f27357j0) {
            d();
            this.f26674n = true;
            if (!this.f26675r) {
                this.f26671b.setVisibility(0);
                mk0 mk0Var = this.f26671b;
                float f12 = this.I;
                if (this.f26677w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                mk0Var.setScaleY(f12 * f10);
                mk0 mk0Var2 = this.f26671b;
                float f13 = this.I;
                if (!this.f26677w) {
                    f11 = 1.0f;
                }
                mk0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f26675r) {
            if (this.f26670a.getImageReceiver().getLottieAnimation() != null && !this.f26670a.getImageReceiver().getLottieAnimation().y() && !this.f26674n) {
                this.f26674n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f26670a.getImageReceiver().getLottieAnimation().stop();
                    this.f26670a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f26670a.getImageReceiver().getLottieAnimation().stop();
                this.f26670a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f26670a.getImageReceiver().getLottieAnimation() != null && this.f26674n && !this.f26670a.getImageReceiver().getLottieAnimation().f24691k0 && !this.f26670a.getImageReceiver().getLottieAnimation().y()) {
                this.f26670a.getImageReceiver().getLottieAnimation().N(this.f26670a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            mk0 mk0Var3 = this.f26671b;
            float f14 = this.I;
            if (this.f26677w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            mk0Var3.setScaleY(f14 * f7);
            mk0 mk0Var4 = this.f26671b;
            float f15 = this.I;
            if (!this.f26677w) {
                f11 = 1.0f;
            }
            mk0Var4.setScaleX(f15 * f11);
        } else if (!this.f26674n) {
            this.I = 0.0f;
            this.f26671b.setScaleX(0.0f);
            this.f26671b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new p70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(qr.h);
            this.J.setStartDelay(i10 * this.P.f27341c);
            this.J.start();
            this.f26674n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f26675r;
        pk0 pk0Var = this.P;
        float f11 = 1.0f;
        mk0 mk0Var = this.f26671b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            mk0 mk0Var2 = this.f26670a;
            if (mk0Var2.getImageReceiver().getLottieAnimation() != null && !mk0Var2.getImageReceiver().getLottieAnimation().y()) {
                mk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (pk0Var.f27357j0) {
                    mk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    mk0Var2.getImageReceiver().getLottieAnimation().N(mk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            mk0Var.setVisibility(4);
            mk0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f26677w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            mk0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f26677w) {
                f11 = 0.76f;
            }
            mk0Var.setScaleX(f13 * f11);
        } else {
            mk0Var.animate().cancel();
            if (pk0Var.N0) {
                float f14 = this.I;
                if (this.f26677w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                mk0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f26677w) {
                    f11 = 0.76f;
                }
                mk0Var.setScaleX(f15 * f11);
            } else {
                mk0Var.setScaleY(0.0f);
                mk0Var.setScaleX(0.0f);
            }
        }
        this.f26674n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ai.l4 l4Var;
        Paint paint;
        if (this.f26677w && this.f26678x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            zg.o0 o0Var = this.e;
            pk0 pk0Var = this.P;
            if (o0Var != null && o0Var.f49420a) {
                paint = pk0Var.I0;
            } else {
                paint = pk0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        p5 p5Var = this.f26671b.e;
        if (p5Var != null && (l4Var = p5Var.f27162k) != null) {
            int i11 = 0;
            if (this.f26679y == 0) {
                l4Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f26677w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                l4Var.setRoundRadius(i11);
            }
        }
        zg.o0 o0Var2 = this.e;
        if (o0Var2 != null && o0Var2.f49420a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            hj0 lottieAnimation = this.f26670a.getImageReceiver().getLottieAnimation();
            yh.i8 i8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f24678a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            i8Var.f47573j = (int) (i8Var.f47568b.size() * f7);
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
        pk0 pk0Var = this.P;
        int i11 = pk0Var.M0;
        mk0 mk0Var = this.f26670a;
        mk0 mk0Var2 = this.f26671b;
        if (o0Var != null && o0Var.f49420a) {
            mk0Var.getImageReceiver().setImageBitmap(new hj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            mk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new yh.i8(1, i10);
            }
        } else if (i11 == 4 && o0Var != null && o0Var.f49423f != null) {
            mk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f49423f));
            mk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(o0Var.f49423f));
        } else {
            zg.o0 o0Var2 = this.e;
            if (o0Var2.f49421b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(pk0Var.J).getEffectDocument(this.e.f49424g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.j6.f19259m6, 0.2f);
                ImageReceiver imageReceiver = mk0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f26675r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (o0Var2.f49423f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(pk0Var.J).getReactionsMap().get(this.e.f49423f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.f19259m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            mk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                            ImageReceiver imageReceiver2 = mk0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f26675r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = mk0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f26675r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        mk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                        ImageReceiver imageReceiver4 = mk0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f26675r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (mk0Var.getImageReceiver().getLottieAnimation() != null) {
                        mk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f26672c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", o0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(pk0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
                }
                rg.b1 b1Var = this.f26673f;
                if (b1Var != null) {
                    b1Var.setImageReceiver(mk0Var2.getImageReceiver());
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
        boolean z11 = this.f26677w;
        boolean contains = this.P.f27344d0.contains(o0Var);
        this.f26677w = contains;
        if (contains != z11) {
            mk0 mk0Var = this.f26670a;
            mk0 mk0Var2 = this.f26671b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                mk0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f26677w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                mk0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f26677w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                mk0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f26677w) {
                    f15 = 0.76f;
                }
                mk0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = mk0Var2.animate();
                float f20 = this.I;
                if (this.f26677w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f26677w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                qr qrVar = qr.h;
                duration.setInterpolator(qrVar).start();
                ViewPropertyAnimator animate2 = mk0Var.animate();
                float f22 = this.I;
                if (this.f26677w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f26677w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(qrVar).start();
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
        zg.o0 o0Var = this.e;
        if (o0Var != null) {
            String str = o0Var.f49423f;
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
        ok0 ok0Var;
        if (this.O) {
            pk0 pk0Var = this.P;
            if (pk0Var.Q == null) {
                int action = motionEvent.getAction();
                kk0 kk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = pk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((ok0Var = pk0Var.f27351g0) == null || ok0Var.j())) {
                        AndroidUtilities.runOnUIThread(kk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((pk0Var.f27360l0 == null || pk0Var.f27362n0 > 0.8f) && pk0Var.f27351g0 != null)) {
                    pk0Var.f27367r0 = true;
                    if (System.currentTimeMillis() - pk0Var.f27369s0 > 300) {
                        pk0Var.f27369s0 = System.currentTimeMillis();
                        ok0 ok0Var2 = pk0Var.f27351g0;
                        zg.o0 o0Var = this.e;
                        if (pk0Var.f27362n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ok0Var2.h(this, o0Var, z10, false);
                    }
                }
                if (!pk0Var.f27367r0 && pk0Var.f27360l0 != null) {
                    pk0Var.f27363o0 = 0.0f;
                    float f7 = pk0Var.f27362n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new dk0(pk0Var, f7));
                    pk0Var.Q.addListener(new ci.v5(pk0Var, 2));
                    pk0Var.Q.setDuration(150L);
                    pk0Var.Q.setInterpolator(qr.f27642f);
                    pk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(kk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
