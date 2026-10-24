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
public final class dl0 extends FrameLayout {
    public boolean E;
    public ai.ee F;
    public final al0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final al0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final fl0 P;
    public final cl0 f25779a;
    public final cl0 f25780b;
    public final cl0 f25781c;
    public final ImageReceiver d;
    public ah.i1 e;
    public sg.c1 f25782f;
    public float h;
    public boolean f25783n;
    public boolean f25784r;
    public boolean f25785s;
    public boolean v;
    public boolean f25786w;
    public boolean f25787x;
    public int f25788y;

    public dl0(fl0 fl0Var, Context context) {
        super(context);
        this.P = fl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f25787x = true;
        this.G = new al0(this, 0);
        this.I = 1.0f;
        this.K = new al0(this, 1);
        this.O = true;
        cl0 cl0Var = new cl0(this, context, 0);
        this.f25779a = cl0Var;
        cl0 cl0Var2 = new cl0(this, context, 1);
        this.f25780b = cl0Var2;
        cl0Var.getImageReceiver().setAutoRepeat(0);
        cl0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        cl0 cl0Var3 = new cl0(this, context, 2);
        this.f25781c = cl0Var3;
        addView(cl0Var, w7.z5.e(34, 34, 17));
        addView(cl0Var3, w7.z5.e(34, 34, 17));
        addView(cl0Var2, w7.z5.e(34, 34, 17));
        if (fl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        cl0Var.setLayerNum(Integer.MAX_VALUE);
        cl0Var2.setLayerNum(Integer.MAX_VALUE);
        cl0Var2.f31064a.setAutoRepeat(0);
        cl0Var2.f31064a.setAllowStartAnimation(false);
        cl0Var2.f31064a.setAllowStartLottieAnimation(false);
        cl0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(dl0 dl0Var, ah.i1 i1Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        cl0 cl0Var = dl0Var.f25781c;
        cl0 cl0Var2 = dl0Var.f25779a;
        cl0 cl0Var3 = dl0Var.f25780b;
        fl0 fl0Var = dl0Var.P;
        dl0Var.f(i1Var, false);
        ah.i1 i1Var2 = dl0Var.e;
        if (i1Var2 != null && i1Var2.equals(i1Var)) {
            dl0Var.f25788y = i10;
            dl0Var.e(i1Var);
            return;
        }
        int i12 = fl0Var.J;
        org.telegram.ui.ActionBar.g6 g6Var = fl0Var.f26370k0;
        int i13 = fl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && i1Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        dl0Var.H = z10;
        if (z10 && dl0Var.f25782f == null) {
            sg.c1 c1Var = new sg.c1(dl0Var.getContext(), 1, null);
            dl0Var.f25782f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            dl0Var.f25782f.setImageReceiver(cl0Var3.getImageReceiver());
            dl0Var.addView(dl0Var.f25782f, w7.z5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        sg.c1 c1Var2 = dl0Var.f25782f;
        if (c1Var2 != null) {
            if (dl0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        dl0Var.d();
        dl0Var.e = i1Var;
        if (!i1Var.f781a && (i1Var.f784f == null || ((!fl0Var.q() && !fl0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        dl0Var.f25784r = z11;
        if (i13 == 4 || dl0Var.e.f782b) {
            dl0Var.f25784r = false;
        }
        ah.i1 i1Var3 = dl0Var.e;
        if (!i1Var3.f781a && i1Var3.f784f == null) {
            cl0Var.getImageReceiver().clearImage();
            cl0Var3.getImageReceiver().clearImage();
            p5 p5Var = new p5(4, fl0Var.J, dl0Var.e.f785g);
            p5 p5Var2 = new p5(3, fl0Var.J, dl0Var.e.f785g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.k6.f21517v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.r6.z(dl0Var, p5Var, i14, g6Var, mode);
                org.telegram.ui.ActionBar.r6.z(dl0Var, p5Var2, i14, g6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                p5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                p5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            cl0Var.setAnimatedEmojiDrawable(p5Var);
            cl0Var3.setAnimatedEmojiDrawable(p5Var2);
            sg.c1 c1Var3 = dl0Var.f25782f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(p5Var2);
            }
        } else {
            dl0Var.e(i1Var);
            cl0Var.setAnimatedEmojiDrawable(null);
            if (cl0Var2.getImageReceiver().getLottieAnimation() != null) {
                cl0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            sg.c1 c1Var4 = dl0Var.f25782f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        dl0Var.setFocusable(true);
        boolean z12 = dl0Var.f25784r;
        dl0Var.f25785s = z12;
        if (!z12) {
            cl0Var2.setVisibility(8);
            cl0Var3.setVisibility(0);
            dl0Var.v = true;
        } else {
            dl0Var.v = false;
            cl0Var2.setVisibility(0);
            cl0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = cl0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = cl0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = cl0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = cl0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        cl0 cl0Var = this.f25780b;
        p5 p5Var = cl0Var.e;
        if (p5Var != null) {
            imageReceiver = p5Var.f29484k;
        } else {
            imageReceiver = cl0Var.f31064a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            fl0 fl0Var = this.P;
            if (fl0Var.f26388x0 == null && !this.N && fl0Var.G0) {
                if (imageReceiver.getLottieAnimation().f32594a0 <= 2) {
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
        if (!this.P.f26368j0) {
            d();
            this.f25783n = true;
            if (!this.f25784r) {
                this.f25780b.setVisibility(0);
                cl0 cl0Var = this.f25780b;
                float f12 = this.I;
                if (this.f25786w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                cl0Var.setScaleY(f12 * f10);
                cl0 cl0Var2 = this.f25780b;
                float f13 = this.I;
                if (!this.f25786w) {
                    f11 = 1.0f;
                }
                cl0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f25784r) {
            if (this.f25779a.getImageReceiver().getLottieAnimation() != null && !this.f25779a.getImageReceiver().getLottieAnimation().y() && !this.f25783n) {
                this.f25783n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f25779a.getImageReceiver().getLottieAnimation().stop();
                    this.f25779a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f25779a.getImageReceiver().getLottieAnimation().stop();
                this.f25779a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f25779a.getImageReceiver().getLottieAnimation() != null && this.f25783n && !this.f25779a.getImageReceiver().getLottieAnimation().f32607k0 && !this.f25779a.getImageReceiver().getLottieAnimation().y()) {
                this.f25779a.getImageReceiver().getLottieAnimation().N(this.f25779a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            cl0 cl0Var3 = this.f25780b;
            float f14 = this.I;
            if (this.f25786w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            cl0Var3.setScaleY(f14 * f7);
            cl0 cl0Var4 = this.f25780b;
            float f15 = this.I;
            if (!this.f25786w) {
                f11 = 1.0f;
            }
            cl0Var4.setScaleX(f15 * f11);
        } else if (!this.f25783n) {
            this.I = 0.0f;
            this.f25780b.setScaleX(0.0f);
            this.f25780b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new b80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(zr.h);
            this.J.setStartDelay(i10 * this.P.f26352c);
            this.J.start();
            this.f25783n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f25784r;
        fl0 fl0Var = this.P;
        float f11 = 1.0f;
        cl0 cl0Var = this.f25780b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            cl0 cl0Var2 = this.f25779a;
            if (cl0Var2.getImageReceiver().getLottieAnimation() != null && !cl0Var2.getImageReceiver().getLottieAnimation().y()) {
                cl0Var2.getImageReceiver().getLottieAnimation().stop();
                if (fl0Var.f26368j0) {
                    cl0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    cl0Var2.getImageReceiver().getLottieAnimation().N(cl0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            cl0Var.setVisibility(4);
            cl0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f25786w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            cl0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f25786w) {
                f11 = 0.76f;
            }
            cl0Var.setScaleX(f13 * f11);
        } else {
            cl0Var.animate().cancel();
            if (fl0Var.N0) {
                float f14 = this.I;
                if (this.f25786w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                cl0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f25786w) {
                    f11 = 0.76f;
                }
                cl0Var.setScaleX(f15 * f11);
            } else {
                cl0Var.setScaleY(0.0f);
                cl0Var.setScaleX(0.0f);
            }
        }
        this.f25783n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ci.f3 f3Var;
        Paint paint;
        if (this.f25786w && this.f25787x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ah.i1 i1Var = this.e;
            fl0 fl0Var = this.P;
            if (i1Var != null && i1Var.f781a) {
                paint = fl0Var.I0;
            } else {
                paint = fl0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        p5 p5Var = this.f25780b.e;
        if (p5Var != null && (f3Var = p5Var.f29484k) != null) {
            int i11 = 0;
            if (this.f25788y == 0) {
                f3Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f25786w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                f3Var.setRoundRadius(i11);
            }
        }
        ah.i1 i1Var2 = this.e;
        if (i1Var2 != null && i1Var2.f781a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            xj0 lottieAnimation = this.f25779a.getImageReceiver().getLottieAnimation();
            ai.ee eeVar = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f32594a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            eeVar.f1239j = (int) (eeVar.f1234b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ah.i1 i1Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        fl0 fl0Var = this.P;
        int i11 = fl0Var.M0;
        cl0 cl0Var = this.f25779a;
        cl0 cl0Var2 = this.f25780b;
        if (i1Var != null && i1Var.f781a) {
            cl0Var.getImageReceiver().setImageBitmap(new xj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            cl0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new ai.ee(1, i10);
            }
        } else if (i11 == 4 && i1Var != null && i1Var.f784f != null) {
            cl0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f784f));
            cl0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f784f));
        } else {
            ah.i1 i1Var2 = this.e;
            if (i1Var2.f782b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(fl0Var.J).getEffectDocument(this.e.f785g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.k6.f21347m6, 0.2f);
                ImageReceiver imageReceiver = cl0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f25784r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (i1Var2.f784f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(fl0Var.J).getReactionsMap().get(this.e.f784f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.k6.f21347m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            cl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                            ImageReceiver imageReceiver2 = cl0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f25784r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = cl0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f25784r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        cl0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                        ImageReceiver imageReceiver4 = cl0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f25784r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (cl0Var.getImageReceiver().getLottieAnimation() != null) {
                        cl0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f25781c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(fl0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                }
                sg.c1 c1Var = this.f25782f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(cl0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(ah.i1 i1Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f25786w;
        boolean contains = this.P.f26355d0.contains(i1Var);
        this.f25786w = contains;
        if (contains != z11) {
            cl0 cl0Var = this.f25779a;
            cl0 cl0Var2 = this.f25780b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                cl0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f25786w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                cl0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f25786w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                cl0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f25786w) {
                    f15 = 0.76f;
                }
                cl0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = cl0Var2.animate();
                float f20 = this.I;
                if (this.f25786w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f25786w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                zr zrVar = zr.h;
                duration.setInterpolator(zrVar).start();
                ViewPropertyAnimator animate2 = cl0Var.animate();
                float f22 = this.I;
                if (this.f25786w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f25786w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(zrVar).start();
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
        ah.i1 i1Var = this.e;
        if (i1Var != null) {
            String str = i1Var.f784f;
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
        el0 el0Var;
        if (this.O) {
            fl0 fl0Var = this.P;
            if (fl0Var.Q == null) {
                int action = motionEvent.getAction();
                al0 al0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = fl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((el0Var = fl0Var.f26362g0) == null || el0Var.i())) {
                        AndroidUtilities.runOnUIThread(al0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((fl0Var.f26372l0 == null || fl0Var.f26374n0 > 0.8f) && fl0Var.f26362g0 != null)) {
                    fl0Var.f26379r0 = true;
                    if (System.currentTimeMillis() - fl0Var.f26381s0 > 300) {
                        fl0Var.f26381s0 = System.currentTimeMillis();
                        el0 el0Var2 = fl0Var.f26362g0;
                        ah.i1 i1Var = this.e;
                        if (fl0Var.f26374n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        el0Var2.m(this, i1Var, z10, false);
                    }
                }
                if (!fl0Var.f26379r0 && fl0Var.f26372l0 != null) {
                    fl0Var.f26375o0 = 0.0f;
                    float f7 = fl0Var.f26374n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new tk0(fl0Var, f7));
                    fl0Var.Q.addListener(new ei.k5(fl0Var, 2));
                    fl0Var.Q.setDuration(150L);
                    fl0Var.Q.setInterpolator(zr.f33337f);
                    fl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(al0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
