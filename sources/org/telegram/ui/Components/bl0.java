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
public final class bl0 extends FrameLayout {
    public boolean E;
    public ai.de F;
    public final yk0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final yk0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final dl0 P;
    public final al0 f24975a;
    public final al0 f24976b;
    public final al0 f24977c;
    public final ImageReceiver d;
    public ah.i1 e;
    public sg.c1 f24978f;
    public float h;
    public boolean f24979n;
    public boolean f24980r;
    public boolean f24981s;
    public boolean v;
    public boolean f24982w;
    public boolean f24983x;
    public int f24984y;

    public bl0(dl0 dl0Var, Context context) {
        super(context);
        this.P = dl0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f24983x = true;
        this.G = new yk0(this, 0);
        this.I = 1.0f;
        this.K = new yk0(this, 1);
        this.O = true;
        al0 al0Var = new al0(this, context, 0);
        this.f24975a = al0Var;
        al0 al0Var2 = new al0(this, context, 1);
        this.f24976b = al0Var2;
        al0Var.getImageReceiver().setAutoRepeat(0);
        al0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        al0 al0Var3 = new al0(this, context, 2);
        this.f24977c = al0Var3;
        addView(al0Var, w7.z5.e(34, 34, 17));
        addView(al0Var3, w7.z5.e(34, 34, 17));
        addView(al0Var2, w7.z5.e(34, 34, 17));
        if (dl0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        al0Var.setLayerNum(Integer.MAX_VALUE);
        al0Var2.setLayerNum(Integer.MAX_VALUE);
        al0Var2.f31992a.setAutoRepeat(0);
        al0Var2.f31992a.setAllowStartAnimation(false);
        al0Var2.f31992a.setAllowStartLottieAnimation(false);
        al0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(bl0 bl0Var, ah.i1 i1Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        al0 al0Var = bl0Var.f24977c;
        al0 al0Var2 = bl0Var.f24975a;
        al0 al0Var3 = bl0Var.f24976b;
        dl0 dl0Var = bl0Var.P;
        bl0Var.f(i1Var, false);
        ah.i1 i1Var2 = bl0Var.e;
        if (i1Var2 != null && i1Var2.equals(i1Var)) {
            bl0Var.f24984y = i10;
            bl0Var.e(i1Var);
            return;
        }
        int i12 = dl0Var.J;
        org.telegram.ui.ActionBar.d6 d6Var = dl0Var.f25546k0;
        int i13 = dl0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && i1Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        bl0Var.H = z10;
        if (z10 && bl0Var.f24978f == null) {
            sg.c1 c1Var = new sg.c1(bl0Var.getContext(), 1, null);
            bl0Var.f24978f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            bl0Var.f24978f.setImageReceiver(al0Var3.getImageReceiver());
            bl0Var.addView(bl0Var.f24978f, w7.z5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        sg.c1 c1Var2 = bl0Var.f24978f;
        if (c1Var2 != null) {
            if (bl0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var2.setVisibility(i11);
        }
        bl0Var.d();
        bl0Var.e = i1Var;
        if (!i1Var.f780a && (i1Var.f783f == null || ((!dl0Var.q() && !dl0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        bl0Var.f24980r = z11;
        if (i13 == 4 || bl0Var.e.f781b) {
            bl0Var.f24980r = false;
        }
        ah.i1 i1Var3 = bl0Var.e;
        if (!i1Var3.f780a && i1Var3.f783f == null) {
            al0Var.getImageReceiver().clearImage();
            al0Var3.getImageReceiver().clearImage();
            r5 r5Var = new r5(4, dl0Var.J, bl0Var.e.f784g);
            r5 r5Var2 = new r5(3, dl0Var.J, bl0Var.e.f784g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.h6.f21323v6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i14, d6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                r5Var.setColorFilter(new PorterDuffColorFilter(w02, mode));
                r5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                r5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                r5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            al0Var.setAnimatedEmojiDrawable(r5Var);
            al0Var3.setAnimatedEmojiDrawable(r5Var2);
            sg.c1 c1Var3 = bl0Var.f24978f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(r5Var2);
            }
        } else {
            bl0Var.e(i1Var);
            al0Var.setAnimatedEmojiDrawable(null);
            if (al0Var2.getImageReceiver().getLottieAnimation() != null) {
                al0Var2.getImageReceiver().getLottieAnimation().N(0, false, false);
            }
            sg.c1 c1Var4 = bl0Var.f24978f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        bl0Var.setFocusable(true);
        boolean z12 = bl0Var.f24980r;
        bl0Var.f24981s = z12;
        if (!z12) {
            al0Var2.setVisibility(8);
            al0Var3.setVisibility(0);
            bl0Var.v = true;
        } else {
            bl0Var.v = false;
            al0Var2.setVisibility(0);
            al0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = al0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = al0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = al0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = al0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        al0 al0Var = this.f24976b;
        r5 r5Var = al0Var.e;
        if (r5Var != null) {
            imageReceiver = r5Var.f29837k;
        } else {
            imageReceiver = al0Var.f31992a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            dl0 dl0Var = this.P;
            if (dl0Var.f25563x0 == null && !this.N && dl0Var.G0) {
                if (imageReceiver.getLottieAnimation().f31264a0 <= 2) {
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
        if (!this.P.f25544j0) {
            d();
            this.f24979n = true;
            if (!this.f24980r) {
                this.f24976b.setVisibility(0);
                al0 al0Var = this.f24976b;
                float f12 = this.I;
                if (this.f24982w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                al0Var.setScaleY(f12 * f10);
                al0 al0Var2 = this.f24976b;
                float f13 = this.I;
                if (!this.f24982w) {
                    f11 = 1.0f;
                }
                al0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f24980r) {
            if (this.f24975a.getImageReceiver().getLottieAnimation() != null && !this.f24975a.getImageReceiver().getLottieAnimation().y() && !this.f24979n) {
                this.f24979n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f24975a.getImageReceiver().getLottieAnimation().stop();
                    this.f24975a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f24975a.getImageReceiver().getLottieAnimation().stop();
                this.f24975a.getImageReceiver().getLottieAnimation().N(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f24975a.getImageReceiver().getLottieAnimation() != null && this.f24979n && !this.f24975a.getImageReceiver().getLottieAnimation().f31277k0 && !this.f24975a.getImageReceiver().getLottieAnimation().y()) {
                this.f24975a.getImageReceiver().getLottieAnimation().N(this.f24975a.getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
            al0 al0Var3 = this.f24976b;
            float f14 = this.I;
            if (this.f24982w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            al0Var3.setScaleY(f14 * f7);
            al0 al0Var4 = this.f24976b;
            float f15 = this.I;
            if (!this.f24982w) {
                f11 = 1.0f;
            }
            al0Var4.setScaleX(f15 * f11);
        } else if (!this.f24979n) {
            this.I = 0.0f;
            this.f24976b.setScaleX(0.0f);
            this.f24976b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new b80(this, 10));
            this.J.setDuration(150L);
            this.J.setInterpolator(bs.h);
            this.J.setStartDelay(i10 * this.P.f25528c);
            this.J.start();
            this.f24979n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f24980r;
        dl0 dl0Var = this.P;
        float f11 = 1.0f;
        al0 al0Var = this.f24976b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            al0 al0Var2 = this.f24975a;
            if (al0Var2.getImageReceiver().getLottieAnimation() != null && !al0Var2.getImageReceiver().getLottieAnimation().y()) {
                al0Var2.getImageReceiver().getLottieAnimation().stop();
                if (dl0Var.f25544j0) {
                    al0Var2.getImageReceiver().getLottieAnimation().N(0, false, true);
                } else {
                    al0Var2.getImageReceiver().getLottieAnimation().N(al0Var2.getImageReceiver().getLottieAnimation().e[0] - 1, false, true);
                }
            }
            al0Var.setVisibility(4);
            al0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f24982w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            al0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f24982w) {
                f11 = 0.76f;
            }
            al0Var.setScaleX(f13 * f11);
        } else {
            al0Var.animate().cancel();
            if (dl0Var.N0) {
                float f14 = this.I;
                if (this.f24982w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                al0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f24982w) {
                    f11 = 0.76f;
                }
                al0Var.setScaleX(f15 * f11);
            } else {
                al0Var.setScaleY(0.0f);
                al0Var.setScaleX(0.0f);
            }
        }
        this.f24979n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ci.g3 g3Var;
        Paint paint;
        if (this.f24982w && this.f24983x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ah.i1 i1Var = this.e;
            dl0 dl0Var = this.P;
            if (i1Var != null && i1Var.f780a) {
                paint = dl0Var.I0;
            } else {
                paint = dl0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        r5 r5Var = this.f24976b.e;
        if (r5Var != null && (g3Var = r5Var.f29837k) != null) {
            int i11 = 0;
            if (this.f24984y == 0) {
                g3Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f24982w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                g3Var.setRoundRadius(i11);
            }
        }
        ah.i1 i1Var2 = this.e;
        if (i1Var2 != null && i1Var2.f780a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            vj0 lottieAnimation = this.f24975a.getImageReceiver().getLottieAnimation();
            ai.de deVar = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f31264a0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            deVar.f1172j = (int) (deVar.f1167b.size() * f7);
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
        dl0 dl0Var = this.P;
        int i11 = dl0Var.M0;
        al0 al0Var = this.f24975a;
        al0 al0Var2 = this.f24976b;
        if (i1Var != null && i1Var.f780a) {
            al0Var.getImageReceiver().setImageBitmap(new vj0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            al0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new ai.de(1, i10);
            }
        } else if (i11 == 4 && i1Var != null && i1Var.f783f != null) {
            al0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f783f));
            al0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(i1Var.f783f));
        } else {
            ah.i1 i1Var2 = this.e;
            if (i1Var2.f781b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(dl0Var.J).getEffectDocument(this.e.f784g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.h6.f21153m6, 0.2f);
                ImageReceiver imageReceiver = al0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f24980r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.e, 0);
            } else if (i1Var2.f783f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(dl0Var.J).getReactionsMap().get(this.e.f783f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.h6.f21153m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            al0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                            ImageReceiver imageReceiver2 = al0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f24980r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = al0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f24980r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        al0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                        ImageReceiver imageReceiver4 = al0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f24980r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.e, 0);
                    }
                    if (al0Var.getImageReceiver().getLottieAnimation() != null) {
                        al0Var.getImageReceiver().getLottieAnimation().N(0, false, true);
                    }
                    this.f24977c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", i1Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(dl0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                }
                sg.c1 c1Var = this.f24978f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(al0Var2.getImageReceiver());
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
        boolean z11 = this.f24982w;
        boolean contains = this.P.f25531d0.contains(i1Var);
        this.f24982w = contains;
        if (contains != z11) {
            al0 al0Var = this.f24975a;
            al0 al0Var2 = this.f24976b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                al0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f24982w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                al0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f24982w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                al0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f24982w) {
                    f15 = 0.76f;
                }
                al0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = al0Var2.animate();
                float f20 = this.I;
                if (this.f24982w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f24982w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                bs bsVar = bs.h;
                duration.setInterpolator(bsVar).start();
                ViewPropertyAnimator animate2 = al0Var.animate();
                float f22 = this.I;
                if (this.f24982w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f24982w) {
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
            String str = i1Var.f783f;
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
        cl0 cl0Var;
        if (this.O) {
            dl0 dl0Var = this.P;
            if (dl0Var.Q == null) {
                int action = motionEvent.getAction();
                yk0 yk0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = dl0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((cl0Var = dl0Var.f25538g0) == null || cl0Var.i())) {
                        AndroidUtilities.runOnUIThread(yk0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((dl0Var.f25547l0 == null || dl0Var.f25549n0 > 0.8f) && dl0Var.f25538g0 != null)) {
                    dl0Var.f25554r0 = true;
                    if (System.currentTimeMillis() - dl0Var.f25556s0 > 300) {
                        dl0Var.f25556s0 = System.currentTimeMillis();
                        cl0 cl0Var2 = dl0Var.f25538g0;
                        ah.i1 i1Var = this.e;
                        if (dl0Var.f25549n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        cl0Var2.o(this, i1Var, z10, false);
                    }
                }
                if (!dl0Var.f25554r0 && dl0Var.f25547l0 != null) {
                    dl0Var.f25550o0 = 0.0f;
                    float f7 = dl0Var.f25549n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    dl0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new rk0(dl0Var, f7));
                    dl0Var.Q.addListener(new ei.k5(dl0Var, 2));
                    dl0Var.Q.setDuration(150L);
                    dl0Var.Q.setInterpolator(bs.f25021f);
                    dl0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(yk0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
