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
public final class dk0 extends FrameLayout {
    public boolean E;
    public zh.h8 F;
    public final ak0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final ak0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final fk0 P;
    public final ck0 f25407a;
    public final ck0 f25408b;
    public final ck0 f25409c;
    public final ImageReceiver d;
    public ah.j1 f25410e;
    public sg.e1 f25411f;
    public float h;
    public boolean f25412n;
    public boolean f25413r;
    public boolean f25414s;
    public boolean v;
    public boolean f25415w;
    public boolean f25416x;
    public int f25417y;

    public dk0(fk0 fk0Var, Context context) {
        super(context);
        this.P = fk0Var;
        this.d = new ImageReceiver();
        this.h = 1.0f;
        this.f25416x = true;
        this.G = new ak0(this, 0);
        this.I = 1.0f;
        this.K = new ak0(this, 1);
        this.O = true;
        ck0 ck0Var = new ck0(this, context, 0);
        this.f25407a = ck0Var;
        ck0 ck0Var2 = new ck0(this, context, 1);
        this.f25408b = ck0Var2;
        ck0Var.getImageReceiver().setAutoRepeat(0);
        ck0Var.getImageReceiver().setAllowStartLottieAnimation(false);
        ck0 ck0Var3 = new ck0(this, context, 2);
        this.f25409c = ck0Var3;
        addView(ck0Var, w7.x5.e(34, 34, 17));
        addView(ck0Var3, w7.x5.e(34, 34, 17));
        addView(ck0Var2, w7.x5.e(34, 34, 17));
        if (fk0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ck0Var.setLayerNum(Integer.MAX_VALUE);
        ck0Var2.setLayerNum(Integer.MAX_VALUE);
        ck0Var2.f32476a.setAutoRepeat(0);
        ck0Var2.f32476a.setAllowStartAnimation(false);
        ck0Var2.f32476a.setAllowStartLottieAnimation(false);
        ck0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(dk0 dk0Var, ah.j1 j1Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        ck0 ck0Var = dk0Var.f25409c;
        ck0 ck0Var2 = dk0Var.f25407a;
        ck0 ck0Var3 = dk0Var.f25408b;
        fk0 fk0Var = dk0Var.P;
        dk0Var.f(j1Var, false);
        ah.j1 j1Var2 = dk0Var.f25410e;
        if (j1Var2 != null && j1Var2.equals(j1Var)) {
            dk0Var.f25417y = i10;
            dk0Var.e(j1Var);
            return;
        }
        int i12 = fk0Var.J;
        org.telegram.ui.ActionBar.f6 f6Var = fk0Var.f26102k0;
        int i13 = fk0Var.M0;
        boolean isPremium = UserConfig.getInstance(i12).isPremium();
        if ((i13 == 3 && !isPremium) || (i13 == 5 && j1Var.d && !isPremium)) {
            z10 = true;
        } else {
            z10 = false;
        }
        dk0Var.H = z10;
        if (z10 && dk0Var.f25411f == null) {
            sg.e1 e1Var = new sg.e1(dk0Var.getContext(), 1, null);
            dk0Var.f25411f = e1Var;
            e1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            dk0Var.f25411f.setImageReceiver(ck0Var3.getImageReceiver());
            dk0Var.addView(dk0Var.f25411f, w7.x5.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        sg.e1 e1Var2 = dk0Var.f25411f;
        if (e1Var2 != null) {
            if (dk0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            e1Var2.setVisibility(i11);
        }
        dk0Var.d();
        dk0Var.f25410e = j1Var;
        if (!j1Var.f593a && (j1Var.f597f == null || ((!fk0Var.q() && !fk0Var.G0) || !LiteMode.isEnabled(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        dk0Var.f25413r = z11;
        if (i13 == 4 || dk0Var.f25410e.f594b) {
            dk0Var.f25413r = false;
        }
        ah.j1 j1Var3 = dk0Var.f25410e;
        if (!j1Var3.f593a && j1Var3.f597f == null) {
            ck0Var.getImageReceiver().clearImage();
            ck0Var3.getImageReceiver().clearImage();
            q5 q5Var = new q5(4, fk0Var.J, dk0Var.f25410e.f598g);
            q5 q5Var2 = new q5(3, fk0Var.J, dk0Var.f25410e.f598g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.j6.f20990v6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
                q5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), mode));
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                q5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                q5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            ck0Var.setAnimatedEmojiDrawable(q5Var);
            ck0Var3.setAnimatedEmojiDrawable(q5Var2);
            sg.e1 e1Var3 = dk0Var.f25411f;
            if (e1Var3 != null) {
                e1Var3.setAnimatedEmojiDrawable(q5Var2);
            }
        } else {
            dk0Var.e(j1Var);
            ck0Var.setAnimatedEmojiDrawable(null);
            if (ck0Var2.getImageReceiver().getLottieAnimation() != null) {
                ck0Var2.getImageReceiver().getLottieAnimation().L(0, false, false);
            }
            sg.e1 e1Var4 = dk0Var.f25411f;
            if (e1Var4 != null) {
                e1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        dk0Var.setFocusable(true);
        boolean z12 = dk0Var.f25413r;
        dk0Var.f25414s = z12;
        if (!z12) {
            ck0Var2.setVisibility(8);
            ck0Var3.setVisibility(0);
            dk0Var.v = true;
        } else {
            dk0Var.v = false;
            ck0Var2.setVisibility(0);
            ck0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = ck0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = ck0Var3.getLayoutParams();
        int dp = AndroidUtilities.dp(34.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        ViewGroup.LayoutParams layoutParams3 = ck0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = ck0Var2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(34.0f);
        layoutParams4.height = dp2;
        layoutParams3.width = dp2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        ck0 ck0Var = this.f25408b;
        q5 q5Var = ck0Var.f32479e;
        if (q5Var != null) {
            imageReceiver = q5Var.f29584k;
        } else {
            imageReceiver = ck0Var.f32476a;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            fk0 fk0Var = this.P;
            if (fk0Var.f26119x0 == null && !this.N && fk0Var.G0) {
                if (imageReceiver.getLottieAnimation().f32553b0 <= 2) {
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
        if (!this.P.f26100j0) {
            d();
            this.f25412n = true;
            if (!this.f25413r) {
                this.f25408b.setVisibility(0);
                ck0 ck0Var = this.f25408b;
                float f12 = this.I;
                if (this.f25415w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ck0Var.setScaleY(f12 * f10);
                ck0 ck0Var2 = this.f25408b;
                float f13 = this.I;
                if (!this.f25415w) {
                    f11 = 1.0f;
                }
                ck0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (this.f25413r) {
            if (this.f25407a.getImageReceiver().getLottieAnimation() != null && !this.f25407a.getImageReceiver().getLottieAnimation().w() && !this.f25412n) {
                this.f25412n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f25407a.getImageReceiver().getLottieAnimation().stop();
                    this.f25407a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f25407a.getImageReceiver().getLottieAnimation().stop();
                this.f25407a.getImageReceiver().getLottieAnimation().L(0, false, false);
                AndroidUtilities.runOnUIThread(this.G, i10);
                return;
            }
            if (this.f25407a.getImageReceiver().getLottieAnimation() != null && this.f25412n && !this.f25407a.getImageReceiver().getLottieAnimation().f32566l0 && !this.f25407a.getImageReceiver().getLottieAnimation().w()) {
                this.f25407a.getImageReceiver().getLottieAnimation().L(this.f25407a.getImageReceiver().getLottieAnimation().f32557e[0] - 1, false, false);
            }
            ck0 ck0Var3 = this.f25408b;
            float f14 = this.I;
            if (this.f25415w) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            ck0Var3.setScaleY(f14 * f7);
            ck0 ck0Var4 = this.f25408b;
            float f15 = this.I;
            if (!this.f25415w) {
                f11 = 1.0f;
            }
            ck0Var4.setScaleX(f15 * f11);
        } else if (!this.f25412n) {
            this.I = 0.0f;
            this.f25408b.setScaleX(0.0f);
            this.f25408b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new h70(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(pr.h);
            this.J.setStartDelay(i10 * this.P.f26083c);
            this.J.start();
            this.f25412n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f25413r;
        fk0 fk0Var = this.P;
        float f11 = 1.0f;
        ck0 ck0Var = this.f25408b;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.G);
            ck0 ck0Var2 = this.f25407a;
            if (ck0Var2.getImageReceiver().getLottieAnimation() != null && !ck0Var2.getImageReceiver().getLottieAnimation().w()) {
                ck0Var2.getImageReceiver().getLottieAnimation().stop();
                if (fk0Var.f26100j0) {
                    ck0Var2.getImageReceiver().getLottieAnimation().L(0, false, true);
                } else {
                    ck0Var2.getImageReceiver().getLottieAnimation().L(ck0Var2.getImageReceiver().getLottieAnimation().f32557e[0] - 1, false, true);
                }
            }
            ck0Var.setVisibility(4);
            ck0Var2.setVisibility(0);
            this.v = false;
            float f12 = this.I;
            if (this.f25415w) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            ck0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f25415w) {
                f11 = 0.76f;
            }
            ck0Var.setScaleX(f13 * f11);
        } else {
            ck0Var.animate().cancel();
            if (fk0Var.N0) {
                float f14 = this.I;
                if (this.f25415w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ck0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f25415w) {
                    f11 = 0.76f;
                }
                ck0Var.setScaleX(f15 * f11);
            } else {
                ck0Var.setScaleY(0.0f);
                ck0Var.setScaleX(0.0f);
            }
        }
        this.f25412n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        bi.y3 y3Var;
        Paint paint;
        if (this.f25415w && this.f25416x) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
            ah.j1 j1Var = this.f25410e;
            fk0 fk0Var = this.P;
            if (j1Var != null && j1Var.f593a) {
                paint = fk0Var.I0;
            } else {
                paint = fk0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        q5 q5Var = this.f25408b.f32479e;
        if (q5Var != null && (y3Var = q5Var.f29584k) != null) {
            int i11 = 0;
            if (this.f25417y == 0) {
                y3Var.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
            } else {
                if (this.f25415w) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                y3Var.setRoundRadius(i11);
            }
        }
        ah.j1 j1Var2 = this.f25410e;
        if (j1Var2 != null && j1Var2.f593a && this.F != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
            RectF rectF = AndroidUtilities.rectTmp;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            xi0 lottieAnimation = this.f25407a.getImageReceiver().getLottieAnimation();
            zh.h8 h8Var = this.F;
            if (lottieAnimation != null && (i10 = lottieAnimation.f32553b0) > 30) {
                f7 = Utilities.clamp01((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            h8Var.f51998j = (int) (h8Var.f51992b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ah.j1 j1Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        SvgHelper.SvgDrawable svgDrawable3;
        SvgHelper.SvgDrawable svgDrawable4;
        int i10;
        fk0 fk0Var = this.P;
        int i11 = fk0Var.M0;
        ck0 ck0Var = this.f25407a;
        ck0 ck0Var2 = this.f25408b;
        if (j1Var != null && j1Var.f593a) {
            ck0Var.getImageReceiver().setImageBitmap(new xi0(R.raw.star_reaction, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
            ck0Var2.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.F == null) {
                if (SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new zh.h8(1, i10);
            }
        } else if (i11 == 4 && j1Var != null && j1Var.f597f != null) {
            ck0Var.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(j1Var.f597f));
            ck0Var2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(j1Var.f597f));
        } else {
            ah.j1 j1Var2 = this.f25410e;
            if (j1Var2.f594b) {
                TLRPC.Document effectDocument = MessagesController.getInstance(fk0Var.J).getEffectDocument(this.f25410e.f598g);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(effectDocument, org.telegram.ui.ActionBar.j6.f20827m6, 0.2f);
                ImageReceiver imageReceiver = ck0Var2.getImageReceiver();
                ImageLocation forDocument = ImageLocation.getForDocument(effectDocument);
                if (this.f25413r) {
                    svgDrawable4 = null;
                } else {
                    svgDrawable4 = svgThumb;
                }
                imageReceiver.setImage(forDocument, "60_60_firstframe", null, null, svgDrawable4, 0L, "tgs", this.f25410e, 0);
            } else if (j1Var2.f597f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(fk0Var.J).getReactionsMap().get(this.f25410e.f597f);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.f20827m6, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() > 0 && i11 != 4) {
                            ck0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", j1Var, 0);
                            ImageReceiver imageReceiver2 = ck0Var2.getImageReceiver();
                            ImageLocation forDocument2 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f25413r) {
                                svgDrawable2 = null;
                            } else {
                                svgDrawable2 = svgThumb2;
                            }
                            imageReceiver2.setImage(forDocument2, "60_60_firstframe", null, null, svgDrawable2, 0L, "tgs", this.f25410e, 0);
                        } else {
                            ImageReceiver imageReceiver3 = ck0Var2.getImageReceiver();
                            ImageLocation forDocument3 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                            if (this.f25413r) {
                                svgDrawable = null;
                            } else {
                                svgDrawable = svgThumb2;
                            }
                            imageReceiver3.setImage(forDocument3, "60_60_firstframe", null, null, svgDrawable, 0L, "tgs", this.f25410e, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        ck0Var.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb2, 0L, "tgs", j1Var, 0);
                        ImageReceiver imageReceiver4 = ck0Var2.getImageReceiver();
                        ImageLocation forDocument4 = ImageLocation.getForDocument(tL_availableReaction.select_animation);
                        if (this.f25413r) {
                            svgDrawable3 = null;
                        } else {
                            svgDrawable3 = svgThumb2;
                        }
                        imageReceiver4.setImage(forDocument4, "60_60_pcache", null, null, svgDrawable3, 0L, "tgs", this.f25410e, 0);
                    }
                    if (ck0Var.getImageReceiver().getLottieAnimation() != null) {
                        ck0Var.getImageReceiver().getLottieAnimation().L(0, false, true);
                    }
                    this.f25409c.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb2, 0L, "tgs", j1Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(fk0Var.J).preloadImage(imageReceiver5, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.e1.a());
                }
                sg.e1 e1Var = this.f25411f;
                if (e1Var != null) {
                    e1Var.setImageReceiver(ck0Var2.getImageReceiver());
                }
            }
        }
    }

    public final void f(ah.j1 j1Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f25415w;
        boolean contains = this.P.f26086d0.contains(j1Var);
        this.f25415w = contains;
        if (contains != z11) {
            ck0 ck0Var = this.f25407a;
            ck0 ck0Var2 = this.f25408b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ck0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f25415w) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                ck0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f25415w) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                ck0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f25415w) {
                    f15 = 0.76f;
                }
                ck0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = ck0Var2.animate();
                float f20 = this.I;
                if (this.f25415w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f25415w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                pr prVar = pr.h;
                duration.setInterpolator(prVar).start();
                ViewPropertyAnimator animate2 = ck0Var.animate();
                float f22 = this.I;
                if (this.f25415w) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f25415w) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(prVar).start();
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
        ah.j1 j1Var = this.f25410e;
        if (j1Var != null) {
            String str = j1Var.f597f;
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
        ek0 ek0Var;
        if (this.O) {
            fk0 fk0Var = this.P;
            if (fk0Var.Q == null) {
                int action = motionEvent.getAction();
                ak0 ak0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = fk0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((ek0Var = fk0Var.f26094g0) == null || ek0Var.n())) {
                        AndroidUtilities.runOnUIThread(ak0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((fk0Var.f26103l0 == null || fk0Var.f26105n0 > 0.8f) && fk0Var.f26094g0 != null)) {
                    fk0Var.f26110r0 = true;
                    if (System.currentTimeMillis() - fk0Var.f26112s0 > 300) {
                        fk0Var.f26112s0 = System.currentTimeMillis();
                        ek0 ek0Var2 = fk0Var.f26094g0;
                        ah.j1 j1Var = this.f25410e;
                        if (fk0Var.f26105n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ek0Var2.B(this, j1Var, z10, false);
                    }
                }
                if (!fk0Var.f26110r0 && fk0Var.f26103l0 != null) {
                    fk0Var.f26106o0 = 0.0f;
                    float f7 = fk0Var.f26105n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fk0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new tj0(fk0Var, f7));
                    fk0Var.Q.addListener(new di.v5(fk0Var, 2));
                    fk0Var.Q.setDuration(150L);
                    fk0Var.Q.setInterpolator(pr.f29466f);
                    fk0Var.Q.start();
                }
                AndroidUtilities.cancelRunOnUIThread(ak0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
