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
    public xh.l8 F;
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
    public final mk0 f25540a;
    public final mk0 f25541b;
    public final mk0 f25542c;
    public final ImageReceiver d;
    public yg.p0 e;
    public qg.e1 f25543f;
    public float h;
    public boolean f25544n;
    public boolean f25545r;
    public boolean f25546s;
    public boolean v;
    public boolean f25547w;
    public boolean f25548x;
    public int f25549y;

    public nk0(pk0 pk0Var, Context context) {
        super(context);
        this.P = pk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f25548x = true;
        this.G = new kk0(this, 0);
        this.I = 1.0f;
        this.K = new kk0(this, 1);
        this.O = true;
        mk0 mk0Var = new mk0(this, context, 0);
        this.f25540a = mk0Var;
        mk0 mk0Var2 = new mk0(this, context, 1);
        this.f25541b = mk0Var2;
        mk0Var.getImageReceiver().setAutoRepeat(0);
        mk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        mk0 mk0Var3 = new mk0(this, context, 2);
        this.f25542c = mk0Var3;
        addView(mk0Var, w7.a6.e(34, 34, 17));
        addView(mk0Var3, w7.a6.e(34, 34, 17));
        addView(mk0Var2, w7.a6.e(34, 34, 17));
        if (pk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        mk0Var.setLayerNum(Integer.MAX_VALUE);
        mk0Var2.setLayerNum(Integer.MAX_VALUE);
        mk0Var2.f28728a.setAutoRepeat(0);
        mk0Var2.f28728a.setAllowStartAnimation(false);
        mk0Var2.f28728a.setAllowStartLottieAnimation(false);
        mk0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(nk0 nk0Var, yg.p0 p0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        mk0 mk0Var = nk0Var.f25542c;
        mk0 mk0Var2 = nk0Var.f25540a;
        mk0 mk0Var3 = nk0Var.f25541b;
        pk0 pk0Var = nk0Var.P;
        nk0Var.f(p0Var, false);
        yg.p0 p0Var2 = nk0Var.e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            nk0Var.f25549y = i10;
            nk0Var.e(p0Var);
            return;
        }
        int i12 = pk0Var.J;
        org.telegram.ui.ActionBar.f6 f6Var = pk0Var.f26182k0;
        int i13 = pk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && p0Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        nk0Var.H = z10;
        if (z10 && nk0Var.f25543f == null) {
            qg.e1 e1Var = new qg.e1(nk0Var.getContext(), 1, null);
            nk0Var.f25543f = e1Var;
            e1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            nk0Var.f25543f.setImageReceiver(mk0Var3.getImageReceiver());
            nk0Var.addView(nk0Var.f25543f, w7.a6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        qg.e1 e1Var2 = nk0Var.f25543f;
        if (e1Var2 != null) {
            if (nk0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            e1Var2.setVisibility(i11);
        }
        nk0Var.d();
        nk0Var.e = p0Var;
        if (!p0Var.f47098a && (p0Var.f47101f == null || ((!pk0Var.q() && !pk0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        nk0Var.f25545r = z11;
        if (i13 == 4 || nk0Var.e.f47099b) {
            nk0Var.f25545r = false;
        }
        yg.p0 p0Var3 = nk0Var.e;
        if (!p0Var3.f47098a && p0Var3.f47101f == null) {
            mk0Var.getImageReceiver().clearImage();
            mk0Var3.getImageReceiver().clearImage();
            p5 p5Var = new p5(4, pk0Var.J, nk0Var.e.f47102g);
            p5 p5Var2 = new p5(3, pk0Var.J, nk0Var.e.f47102g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.j6.f18254v6;
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
            qg.e1 e1Var3 = nk0Var.f25543f;
            if (e1Var3 != null) {
                e1Var3.setAnimatedEmojiDrawable(p5Var2);
            }
        } else {
            nk0Var.e(p0Var);
            mk0Var.setAnimatedEmojiDrawable(null);
            if (mk0Var2.getImageReceiver().getLottieAnimation() != null) {
                mk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            qg.e1 e1Var4 = nk0Var.f25543f;
            if (e1Var4 != null) {
                e1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        nk0Var.setFocusable(true);
        boolean z12 = nk0Var.f25545r;
        nk0Var.f25546s = z12;
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
        mk0 mk0Var = this.f25541b;
        p5 p5Var = mk0Var.e;
        if (p5Var != null) {
            imageReceiver = p5Var.f26033k;
        } else {
            imageReceiver = mk0Var.f28728a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            pk0 pk0Var = this.P;
            if (pk0Var.f26199x0 == null && !this.N && pk0Var.G0) {
                if (imageReceiver.getLottieAnimation().f23648b0 <= 2) {
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
        if (!this.P.f26180j0) {
            d();
            this.f25544n = true;
            if (!this.f25545r) {
                this.f25541b.setVisibility(0);
                mk0 mk0Var = this.f25541b;
                float f12 = this.I;
                if (this.f25547w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                mk0Var.setScaleY(f12 * f10);
                mk0 mk0Var2 = this.f25541b;
                float f13 = this.I;
                if (!this.f25547w) {
                    f11 = 1.0f;
                }
                mk0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f25545r) {
            if (this.f25540a.getImageReceiver().getLottieAnimation() != null && !this.f25540a.getImageReceiver().getLottieAnimation().y() && !this.f25544n) {
                this.f25544n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f25540a.getImageReceiver().getLottieAnimation().stop();
                    this.f25540a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f25540a.getImageReceiver().getLottieAnimation().stop();
                this.f25540a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f25540a.getImageReceiver().getLottieAnimation() != null && this.f25544n && !this.f25540a.getImageReceiver().getLottieAnimation().f23660l0 && !this.f25540a.getImageReceiver().getLottieAnimation().y()) {
                this.f25540a.getImageReceiver().getLottieAnimation().N(this.f25540a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            mk0 mk0Var3 = this.f25541b;
            float f14 = this.I;
            if (this.f25547w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            mk0Var3.setScaleY(f14 * f7);
            mk0 mk0Var4 = this.f25541b;
            float f15 = this.I;
            if (!this.f25547w) {
                f11 = 1.0f;
            }
            mk0Var4.setScaleX(f15 * f11);
        } else if (!this.f25544n) {
            this.I = 0.0f;
            this.f25541b.setScaleX(0.0f);
            this.f25541b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new q70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(wr.h);
            this.J.setStartDelay(i10 * this.P.f26164c);
            this.J.start();
            this.f25544n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f25545r;
        pk0 pk0Var = this.P;
        float f11 = 1.0f;
        mk0 mk0Var = this.f25541b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            mk0 mk0Var2 = this.f25540a;
            if (mk0Var2.getImageReceiver().getLottieAnimation() != null && !mk0Var2.getImageReceiver().getLottieAnimation().y()) {
                mk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (pk0Var.f26180j0) {
                    mk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    mk0Var2.getImageReceiver().getLottieAnimation().N(mk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            mk0Var.setVisibility(4);
            mk0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f25547w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            mk0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f25547w) {
                f11 = 0.76f;
            }
            mk0Var.setScaleX(f13 * f11);
        } else {
            mk0Var.animate().cancel();
            if (pk0Var.N0) {
                float f14 = this.I;
                if (this.f25547w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                mk0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f25547w) {
                    f11 = 0.76f;
                }
                mk0Var.setScaleX(f15 * f11);
            } else {
                mk0Var.setScaleY(0.0f);
                mk0Var.setScaleX(0.0f);
            }
        }
        this.f25544n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        gg.h1 h1Var;
        Paint paint;
        if (this.f25547w && this.f25548x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            yg.p0 p0Var = this.e;
            pk0 pk0Var = this.P;
            if (p0Var != null && p0Var.f47098a) {
                paint = pk0Var.I0;
            } else {
                paint = pk0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        p5 p5Var = this.f25541b.e;
        if (p5Var != null && (h1Var = p5Var.f26033k) != null) {
            int i11 = 0;
            if (this.f25549y == 0) {
                h1Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f25547w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                h1Var.setRoundRadius(i11);
            }
        }
        yg.p0 p0Var2 = this.e;
        if (p0Var2 != null && p0Var2.f47098a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            hj0 lottieAnimation = this.f25540a.getImageReceiver().getLottieAnimation();
            xh.l8 l8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f23648b0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            l8Var.f45681j = (int) (l8Var.f45676b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(yg.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        pk0 pk0Var = this.P;
        int i11 = pk0Var.M0;
        mk0 mk0Var = this.f25540a;
        mk0 mk0Var2 = this.f25541b;
        if (p0Var != null && p0Var.f47098a) {
            mk0Var.getImageReceiver().setImageBitmap(new hj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            mk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new xh.l8(1, i10);
            }
        } else if (i11 == 4 && p0Var != null && p0Var.f47101f != null) {
            mk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(p0Var.f47101f));
            mk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(p0Var.f47101f));
        } else {
            yg.p0 p0Var2 = this.e;
            if (p0Var2.f47099b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(pk0Var.J).getEffectDocument(this.e.f47102g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.j6.f18091m6, 0.2f);
                ImageReceiver imageReceiver = mk0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f25545r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (p0Var2.f47101f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(pk0Var.J).getReactionsMap().get(this.e.f47101f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.f18091m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            mk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", p0Var, 0);
                            ImageReceiver imageReceiver2 = mk0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f25545r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = mk0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f25545r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        mk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", p0Var, 0);
                        ImageReceiver imageReceiver4 = mk0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f25545r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (mk0Var.getImageReceiver().getLottieAnimation() != null) {
                        mk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f25542c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", p0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(pk0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), yg.l0.a());
                }
                qg.e1 e1Var = this.f25543f;
                if (e1Var != null) {
                    e1Var.setImageReceiver(mk0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(yg.p0 p0Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f25547w;
        boolean contains = this.P.f26167d0.contains(p0Var);
        this.f25547w = contains;
        if (contains != z11) {
            mk0 mk0Var = this.f25540a;
            mk0 mk0Var2 = this.f25541b;
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
                if (this.f25547w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                mk0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f25547w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                mk0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f25547w) {
                    f15 = 0.76f;
                }
                mk0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = mk0Var2.animate();
                float f20 = this.I;
                if (this.f25547w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f25547w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                wr wrVar = wr.h;
                duration.setInterpolator(wrVar).start();
                ViewPropertyAnimator animate2 = mk0Var.animate();
                float f22 = this.I;
                if (this.f25547w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f25547w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(wrVar).start();
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
        yg.p0 p0Var = this.e;
        if (p0Var != null) {
            String str = p0Var.f47101f;
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
                    if (this.h == 1.0f && !this.H && (i10 = pk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((ok0Var = pk0Var.f26174g0) == null || ok0Var.j())) {
                        AndroidUtilities.runOnUIThread(kk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((pk0Var.f26183l0 == null || pk0Var.f26185n0 > 0.8f) && pk0Var.f26174g0 != null)) {
                    pk0Var.f26190r0 = true;
                    if (System.currentTimeMillis() - pk0Var.f26192s0 > 300) {
                        pk0Var.f26192s0 = System.currentTimeMillis();
                        ok0 ok0Var2 = pk0Var.f26174g0;
                        yg.p0 p0Var = this.e;
                        if (pk0Var.f26185n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ok0Var2.l(this, p0Var, z10, false);
                    }
                }
                if (!pk0Var.f26190r0 && pk0Var.f26183l0 != null) {
                    pk0Var.f26186o0 = 0.0f;
                    float f7 = pk0Var.f26185n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new dk0(pk0Var, f7));
                    pk0Var.Q.addListener(new bi.t6(pk0Var, 2));
                    pk0Var.Q.setDuration(150L);
                    pk0Var.Q.setInterpolator(wr.f28819f);
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
