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
public final class al0 extends FrameLayout {
    public boolean E;
    public ai.de F;
    public final xk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final xk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final cl0 P;
    public final zk0 f24649a;
    public final zk0 f24650b;
    public final zk0 f24651c;
    public final ImageReceiver d;
    public ah.i1 e;
    public sg.c1 f24652f;
    public float h;
    public boolean f24653n;
    public boolean f24654r;
    public boolean f24655s;
    public boolean v;
    public boolean f24656w;
    public boolean f24657x;
    public int f24658y;

    public al0(cl0 cl0Var, Context context) {
        super(context);
        this.P = cl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f24657x = true;
        this.G = new xk0(this, 0);
        this.I = 1.0f;
        this.K = new xk0(this, 1);
        this.O = true;
        zk0 zk0Var = new zk0(this, context, 0);
        this.f24649a = zk0Var;
        zk0 zk0Var2 = new zk0(this, context, 1);
        this.f24650b = zk0Var2;
        zk0Var.getImageReceiver().setAutoRepeat(0);
        zk0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        zk0 zk0Var3 = new zk0(this, context, 2);
        this.f24651c = zk0Var3;
        addView(zk0Var, w7.z5.e(34, 34, 17));
        addView(zk0Var3, w7.z5.e(34, 34, 17));
        addView(zk0Var2, w7.z5.e(34, 34, 17));
        if (cl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        zk0Var.setLayerNum(Integer.MAX_VALUE);
        zk0Var2.setLayerNum(Integer.MAX_VALUE);
        zk0Var2.f32033a.setAutoRepeat(0);
        zk0Var2.f32033a.setAllowStartAnimation(false);
        zk0Var2.f32033a.setAllowStartLottieAnimation(false);
        zk0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(al0 al0Var, ah.i1 i1Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        zk0 zk0Var = al0Var.f24651c;
        zk0 zk0Var2 = al0Var.f24649a;
        zk0 zk0Var3 = al0Var.f24650b;
        cl0 cl0Var = al0Var.P;
        al0Var.f(i1Var, false);
        ah.i1 i1Var2 = al0Var.e;
        if (i1Var2 != null && i1Var2.equals(i1Var)) {
            al0Var.f24658y = i10;
            al0Var.e(i1Var);
            return;
        }
        int i12 = cl0Var.J;
        org.telegram.ui.ActionBar.d6 d6Var = cl0Var.f25281k0;
        int i13 = cl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && i1Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        al0Var.H = z10;
        if (z10 && al0Var.f24652f == null) {
            sg.c1 c1Var = new sg.c1(al0Var.getContext(), 1, null);
            al0Var.f24652f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            al0Var.f24652f.setImageReceiver(zk0Var3.getImageReceiver());
            al0Var.addView(al0Var.f24652f, w7.z5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        sg.c1 c1Var2 = al0Var.f24652f;
        if (c1Var2 != null) {
            if (al0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        al0Var.d();
        al0Var.e = i1Var;
        if (!i1Var.f782a && (i1Var.f785f == null || ((!cl0Var.q() && !cl0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        al0Var.f24654r = z11;
        if (i13 == 4 || al0Var.e.f783b) {
            al0Var.f24654r = false;
        }
        ah.i1 i1Var3 = al0Var.e;
        if (!i1Var3.f782a && i1Var3.f785f == null) {
            zk0Var.getImageReceiver().clearImage();
            zk0Var3.getImageReceiver().clearImage();
            r5 r5Var = new r5(4, cl0Var.J, al0Var.e.f786g);
            r5 r5Var2 = new r5(3, cl0Var.J, al0Var.e.f786g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.h6.f21319v6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i14, d6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                r5Var.setColorFilter(new PorterDuffColorFilter(w02, mode));
                r5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                r5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                r5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            zk0Var.setAnimatedEmojiDrawable(r5Var);
            zk0Var3.setAnimatedEmojiDrawable(r5Var2);
            sg.c1 c1Var3 = al0Var.f24652f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(r5Var2);
            }
        } else {
            al0Var.e(i1Var);
            zk0Var.setAnimatedEmojiDrawable(null);
            if (zk0Var2.getImageReceiver().getLottieAnimation() != null) {
                zk0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            sg.c1 c1Var4 = al0Var.f24652f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        al0Var.setFocusable(true);
        boolean z12 = al0Var.f24654r;
        al0Var.f24655s = z12;
        if (!z12) {
            zk0Var2.setVisibility(8);
            zk0Var3.setVisibility(0);
            al0Var.v = true;
        } else {
            al0Var.v = false;
            zk0Var2.setVisibility(0);
            zk0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = zk0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = zk0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = zk0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = zk0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        zk0 zk0Var = this.f24650b;
        r5 r5Var = zk0Var.e;
        if (r5Var != null) {
            imageReceiver = r5Var.f29842k;
        } else {
            imageReceiver = zk0Var.f32033a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            cl0 cl0Var = this.P;
            if (cl0Var.f25298x0 == null && !this.N && cl0Var.G0) {
                if (imageReceiver.getLottieAnimation().f31001a0 <= 2) {
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
        if (!this.P.f25279j0) {
            d();
            this.f24653n = true;
            if (!this.f24654r) {
                this.f24650b.setVisibility(0);
                zk0 zk0Var = this.f24650b;
                float f12 = this.I;
                if (this.f24656w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                zk0Var.setScaleY(f12 * f10);
                zk0 zk0Var2 = this.f24650b;
                float f13 = this.I;
                if (!this.f24656w) {
                    f11 = 1.0f;
                }
                zk0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f24654r) {
            if (this.f24649a.getImageReceiver().getLottieAnimation() != null && !this.f24649a.getImageReceiver().getLottieAnimation().y() && !this.f24653n) {
                this.f24653n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f24649a.getImageReceiver().getLottieAnimation().stop();
                    this.f24649a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f24649a.getImageReceiver().getLottieAnimation().stop();
                this.f24649a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f24649a.getImageReceiver().getLottieAnimation() != null && this.f24653n && !this.f24649a.getImageReceiver().getLottieAnimation().f31014k0 && !this.f24649a.getImageReceiver().getLottieAnimation().y()) {
                this.f24649a.getImageReceiver().getLottieAnimation().N(this.f24649a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            zk0 zk0Var3 = this.f24650b;
            float f14 = this.I;
            if (this.f24656w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            zk0Var3.setScaleY(f14 * f7);
            zk0 zk0Var4 = this.f24650b;
            float f15 = this.I;
            if (!this.f24656w) {
                f11 = 1.0f;
            }
            zk0Var4.setScaleX(f15 * f11);
        } else if (!this.f24653n) {
            this.I = 0.0f;
            this.f24650b.setScaleX(0.0f);
            this.f24650b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new b80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(bs.h);
            this.J.setStartDelay(i10 * this.P.f25263c);
            this.J.start();
            this.f24653n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f24654r;
        cl0 cl0Var = this.P;
        float f11 = 1.0f;
        zk0 zk0Var = this.f24650b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            zk0 zk0Var2 = this.f24649a;
            if (zk0Var2.getImageReceiver().getLottieAnimation() != null && !zk0Var2.getImageReceiver().getLottieAnimation().y()) {
                zk0Var2.getImageReceiver().getLottieAnimation().stop();
                if (cl0Var.f25279j0) {
                    zk0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    zk0Var2.getImageReceiver().getLottieAnimation().N(zk0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            zk0Var.setVisibility(4);
            zk0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f24656w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            zk0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f24656w) {
                f11 = 0.76f;
            }
            zk0Var.setScaleX(f13 * f11);
        } else {
            zk0Var.animate().cancel();
            if (cl0Var.N0) {
                float f14 = this.I;
                if (this.f24656w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                zk0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f24656w) {
                    f11 = 0.76f;
                }
                zk0Var.setScaleX(f15 * f11);
            } else {
                zk0Var.setScaleY(0.0f);
                zk0Var.setScaleX(0.0f);
            }
        }
        this.f24653n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ci.f3 f3Var;
        Paint paint;
        if (this.f24656w && this.f24657x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ah.i1 i1Var = this.e;
            cl0 cl0Var = this.P;
            if (i1Var != null && i1Var.f782a) {
                paint = cl0Var.I0;
            } else {
                paint = cl0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        r5 r5Var = this.f24650b.e;
        if (r5Var != null && (f3Var = r5Var.f29842k) != null) {
            int i11 = 0;
            if (this.f24658y == 0) {
                f3Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f24656w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                f3Var.setRoundRadius(i11);
            }
        }
        ah.i1 i1Var2 = this.e;
        if (i1Var2 != null && i1Var2.f782a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            uj0 lottieAnimation = this.f24649a.getImageReceiver().getLottieAnimation();
            ai.de deVar = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f31001a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            deVar.f1184j = (int) (deVar.f1179b.size() * f7);
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
        cl0 cl0Var = this.P;
        int i11 = cl0Var.M0;
        zk0 zk0Var = this.f24649a;
        zk0 zk0Var2 = this.f24650b;
        if (i1Var != null && i1Var.f782a) {
            zk0Var.getImageReceiver().setImageBitmap(new uj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            zk0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new ai.de(1, i10);
            }
        } else if (i11 == 4 && i1Var != null && i1Var.f785f != null) {
            zk0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f785f));
            zk0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f785f));
        } else {
            ah.i1 i1Var2 = this.e;
            if (i1Var2.f783b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(cl0Var.J).getEffectDocument(this.e.f786g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.h6.f21149m6, 0.2f);
                ImageReceiver imageReceiver = zk0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f24654r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (i1Var2.f785f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(cl0Var.J).getReactionsMap().get(this.e.f785f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.h6.f21149m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            zk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                            ImageReceiver imageReceiver2 = zk0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f24654r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = zk0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f24654r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        zk0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                        ImageReceiver imageReceiver4 = zk0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f24654r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (zk0Var.getImageReceiver().getLottieAnimation() != null) {
                        zk0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f24651c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(cl0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                }
                sg.c1 c1Var = this.f24652f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(zk0Var2.getImageReceiver());
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
        boolean z11 = this.f24656w;
        boolean contains = this.P.f25266d0.contains(i1Var);
        this.f24656w = contains;
        if (contains != z11) {
            zk0 zk0Var = this.f24649a;
            zk0 zk0Var2 = this.f24650b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                zk0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f24656w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                zk0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f24656w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                zk0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f24656w) {
                    f15 = 0.76f;
                }
                zk0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = zk0Var2.animate();
                float f20 = this.I;
                if (this.f24656w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f24656w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                bs bsVar = bs.h;
                duration.setInterpolator(bsVar).start();
                ViewPropertyAnimator animate2 = zk0Var.animate();
                float f22 = this.I;
                if (this.f24656w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f24656w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(bsVar).start();
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
            String str = i1Var.f785f;
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
        bl0 bl0Var;
        if (this.O) {
            cl0 cl0Var = this.P;
            if (cl0Var.Q == null) {
                int action = motionEvent.getAction();
                xk0 xk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = cl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((bl0Var = cl0Var.f25273g0) == null || bl0Var.j())) {
                        AndroidUtilities.runOnUIThread(xk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((cl0Var.f25282l0 == null || cl0Var.f25284n0 > 0.8f) && cl0Var.f25273g0 != null)) {
                    cl0Var.f25289r0 = true;
                    if (System.currentTimeMillis() - cl0Var.f25291s0 > 300) {
                        cl0Var.f25291s0 = System.currentTimeMillis();
                        bl0 bl0Var2 = cl0Var.f25273g0;
                        ah.i1 i1Var = this.e;
                        if (cl0Var.f25284n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        bl0Var2.l(this, i1Var, z10, false);
                    }
                }
                if (!cl0Var.f25289r0 && cl0Var.f25282l0 != null) {
                    cl0Var.f25285o0 = 0.0f;
                    float f7 = cl0Var.f25284n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    cl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new qk0(cl0Var, f7));
                    cl0Var.Q.addListener(new ei.k5(cl0Var, 2));
                    cl0Var.Q.setDuration(150L);
                    cl0Var.Q.setInterpolator(bs.f25030f);
                    cl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(xk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
