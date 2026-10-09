package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.z6;
import org.telegram.ui.y80;
import yh.f7;
public class b2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final int f20406c1 = 0;
    public final Rect A0;
    public final float B0;
    public Bitmap C0;
    public Matrix D0;
    public final boolean[] E;
    public BitmapShader E0;
    public final AnimatorSet[] F;
    public Paint F0;
    public int G;
    public Paint G0;
    public boolean H;
    public boolean H0;
    public int I;
    public boolean I0;
    public DialogInterface.OnCancelListener J;
    public boolean J0;
    public b2 K;
    public boolean K0;
    public int L;
    public final q1 L0;
    public DialogInterface.OnClickListener M;
    public final q1 M0;
    public DialogInterface.OnDismissListener N;
    public final ArrayList N0;
    public Utilities.Callback O;
    public float O0;
    public CharSequence[] P;
    public boolean P0;
    public int[] Q;
    public float Q0;
    public CharSequence R;
    public final e6 R0;
    public String S;
    public boolean S0;
    public CharSequence T;
    public boolean T0;
    public int U;
    public int U0;
    public View V;
    public int V0;
    public boolean W;
    public long W0;
    public int X;
    public boolean X0;
    public int Y;
    public FrameLayout Y0;
    public Map Z;
    public yh.a Z0;
    public int f20407a;
    public int f20408a0;
    public z1 f20409a1;
    public View f20410b;
    public Drawable f20411b0;
    public boolean f20412b1;
    public TextView f20413c;
    public int f20414c0;
    public av d;
    public final int f20415d0;
    public int f20416e;
    public int f20417e0;
    public vh.n f20418f;
    public boolean f20419f0;
    public boolean f20420g0;
    public TextView h;
    public boolean f20421h0;
    public boolean f20422i0;
    public boolean f20423j0;
    public fk0 f20424k0;
    public CharSequence f20425l0;
    public a2 m0;
    public av f20426n;
    public CharSequence f20427n0;
    public a2 f20428o0;
    public String f20429p0;
    public ii.g4 f20430q0;
    public FrameLayout f20431r;
    public CharSequence f20432r0;
    public FrameLayout f20433s;
    public a2 f20434s0;
    public ViewGroup f20435t0;
    public o90 f20436u0;
    public v1 v;
    public TextView f20437v0;
    public LinearLayout f20438w;
    public y80 f20439w0;
    public y1 f20440x;
    public final int[] f20441x0;
    public final BitmapDrawable[] f20442y;
    public boolean f20443y0;
    public final Drawable f20444z0;

    public b2(Context context) {
        this(context, 3, null);
    }

    public static void a(b2 b2Var, int i10, boolean z10) {
        int i11;
        boolean[] zArr = b2Var.E;
        AnimatorSet[] animatorSetArr = b2Var.F;
        if ((z10 && !zArr[i10]) || (!z10 && zArr[i10])) {
            zArr[i10] = z10;
            AnimatorSet animatorSet = animatorSetArr[i10];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i10] = animatorSet2;
            BitmapDrawable bitmapDrawable = b2Var.f20442y[i10];
            if (bitmapDrawable != null) {
                if (z10) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i11));
            }
            animatorSetArr[i10].setDuration(150L);
            animatorSetArr[i10].addListener(new x2(b2Var, i10, 1));
            try {
                animatorSetArr[i10].start();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public static boolean b(View view) {
        if (!view.onCheckIsTextEditor()) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                while (childCount > 0) {
                    childCount--;
                    if (b(viewGroup.getChildAt(childCount))) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void c(long j3) {
        long currentTimeMillis = System.currentTimeMillis() - this.W0;
        if (currentTimeMillis < j3) {
            AndroidUtilities.runOnUIThread(new q1(this, 0), currentTimeMillis - j3);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.f20435t0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        av avVar;
        if (i10 == NotificationCenter.emojiLoaded && (avVar = this.f20426n) != null) {
            avVar.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.O;
        if (callback != null) {
            this.O = null;
            callback.run(new q1(this, 0));
        } else if (!this.f20412b1) {
            this.f20412b1 = true;
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            DialogInterface.OnDismissListener onDismissListener = this.N;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            b2 b2Var = this.K;
            if (b2Var != null) {
                b2Var.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(this.M0);
            if (this.E0 != null && (bitmap = this.C0) != null) {
                bitmap.recycle();
                this.E0 = null;
                this.F0 = null;
                this.C0 = null;
            }
        }
    }

    public int e(int i10) {
        return i6.w0(i10, this.R0);
    }

    public final ViewGroup f(boolean z10) {
        Object[] objArr;
        float f7;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int dp;
        int i13;
        float f12;
        float f13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        float f14;
        z1 z1Var = new z1(getContext(), this);
        this.f20409a1 = z1Var;
        z1Var.setOrientation(1);
        boolean z11 = this.T0;
        int i25 = this.f20415d0;
        if ((z11 || i25 == 3) && i25 != 2) {
            this.f20409a1.setBackground(null);
            this.f20409a1.setPadding(0, 0, 0, 0);
            if (this.T0) {
                this.f20409a1.setWillNotDraw(false);
            }
            this.f20422i0 = false;
        } else {
            boolean z12 = this.f20423j0;
            Drawable drawable = this.f20444z0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.f20409a1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f20422i0 = true;
            } else {
                this.f20409a1.setBackground(null);
                this.f20409a1.setPadding(0, 0, 0, 0);
                this.f20409a1.setBackground(drawable);
                z1 z1Var2 = this.f20409a1;
                ai.l2 l2Var = yf.i0.f52169a;
                z1Var2.setOutlineProvider(new yf.h0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f)));
                this.f20409a1.setClipToOutline(true);
                this.f20422i0 = false;
            }
        }
        ViewGroup viewGroup = this.f20409a1;
        boolean z13 = this.X0;
        e6 e6Var = this.R0;
        if (z13) {
            if (this.Y0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.Y0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final b2 f21507b;

                    {
                        this.f21507b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f21507b.dismiss();
                                return;
                            case 1:
                                b2 b2Var = this.f21507b;
                                new f7(b2Var.getContext(), b2Var.R0).show();
                                return;
                            default:
                                b2 b2Var2 = this.f21507b;
                                DialogInterface.OnClickListener onClickListener = b2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(b2Var2, ((Integer) view.getTag()).intValue());
                                }
                                b2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.Z0 == null) {
                yh.a aVar = new yh.a(getContext(), UserConfig.selectedAccount, e6Var);
                this.Z0 = aVar;
                w7.z5.a(aVar);
                this.Z0.setOnClickListener(new View.OnClickListener(this) {
                    public final b2 f21507b;

                    {
                        this.f21507b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f21507b.dismiss();
                                return;
                            case 1:
                                b2 b2Var = this.f21507b;
                                new f7(b2Var.getContext(), b2Var.R0).show();
                                return;
                            default:
                                b2 b2Var2 = this.f21507b;
                                DialogInterface.OnClickListener onClickListener = b2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(b2Var2, ((Integer) view.getTag()).intValue());
                                }
                                b2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.f20409a1);
            AndroidUtilities.removeFromParent(this.Z0);
            this.Y0.addView(this.f20409a1, w7.x5.e(-2, -2, 17));
            this.Y0.addView(this.Z0, w7.x5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
            viewGroup = this.Y0;
        }
        if (z10) {
            if (this.X0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f20407a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.f20425l0 == null && this.f20427n0 == null && this.f20429p0 == null && this.f20432r0 == null) {
            objArr = null;
        } else {
            objArr = 1;
        }
        if (this.U != 0 || this.X != 0 || this.f20411b0 != null) {
            f7 = 16.0f;
            ?? imageView = new ImageView(getContext());
            this.f20424k0 = imageView;
            Drawable drawable2 = this.f20411b0;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
                Drawable drawable3 = this.f20411b0;
                if (drawable3 instanceof z6) {
                    z6 z6Var = (z6) drawable3;
                    this.f20424k0.addOnAttachStateChangeListener(new t1(z6Var));
                    z6Var.a(this.f20424k0);
                }
            } else {
                int i26 = this.U;
                if (i26 != 0) {
                    imageView.setImageResource(i26);
                } else {
                    imageView.setAutoRepeat(this.S0);
                    fk0 fk0Var = this.f20424k0;
                    int i27 = this.X;
                    int i28 = this.Y;
                    fk0Var.f(i27, i28, i28, null);
                    if (this.Z != null) {
                        ck0 animatedDrawable = this.f20424k0.getAnimatedDrawable();
                        for (Map.Entry entry : this.Z.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f25418s.put((String) entry.getKey(), num);
                            animatedDrawable.G();
                        }
                    }
                    this.f20424k0.d();
                }
            }
            this.f20424k0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.W) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.f20414c0);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.f20424k0.setBackground(new u1(this, gradientDrawable));
                this.f20408a0 = 92;
            } else {
                this.f20424k0.setBackground(i6.d0(AndroidUtilities.dp(10.0f), 0, this.f20414c0));
            }
            if (this.W) {
                this.f20424k0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.f20424k0.setTranslationY(0.0f);
            }
            this.f20424k0.setPadding(0, 0, 0, 0);
            this.f20409a1.addView(this.f20424k0, w7.x5.t(-1, this.f20408a0, 51, 0, 0, 0, 0));
        } else {
            View view = this.V;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f7 = 16.0f;
                this.f20409a1.addView(this.V, w7.x5.t(-1, this.f20408a0, 51, 0, 0, 0, 0));
            } else {
                f7 = 16.0f;
            }
        }
        int i29 = 5;
        if (this.R != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f20433s = frameLayout2;
            this.f20409a1.addView(frameLayout2, w7.x5.t(-2, -2, this.W ? 1 : 0, 24, 0, 24, 0));
            vh.n nVar = new vh.n(getContext(), null, false);
            this.f20418f = nVar;
            NotificationCenter.listenEmojiLoading(nVar);
            vh.n nVar2 = this.f20418f;
            nVar2.f49735s = 3;
            nVar2.setText(this.R);
            this.f20418f.setTextColor(e(i6.f20905j5));
            this.f20418f.setTextSize(1, 20.0f);
            this.f20418f.setTypeface(AndroidUtilities.bold());
            vh.n nVar3 = this.f20418f;
            if (this.W) {
                i22 = 1;
            } else if (LocaleController.isRTL) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            nVar3.setGravity(i22 | 48);
            FrameLayout frameLayout3 = this.f20433s;
            vh.n nVar4 = this.f20418f;
            boolean z14 = this.W;
            if (z14) {
                i23 = 1;
            } else if (LocaleController.isRTL) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            int i30 = i23 | 48;
            if (z14) {
                f14 = 4.0f;
            } else {
                if (this.S != null) {
                    i24 = 2;
                } else if (this.P != null) {
                    i24 = 14;
                } else {
                    i24 = 10;
                }
                f14 = i24;
            }
            frameLayout3.addView(nVar4, w7.x5.a(-2.0f, 0.0f, 19.0f, 0.0f, f14, -2, i30));
        }
        if (this.S != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.S);
            this.h.setTextColor(e(i6.J5));
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19 | 48);
            z1 z1Var3 = this.f20409a1;
            TextView textView3 = this.h;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            int i31 = i20 | 48;
            if (this.P != null) {
                i21 = 14;
            } else {
                i21 = 10;
            }
            z1Var3.addView(textView3, w7.x5.t(-2, -2, i31, 24, 0, 24, i21));
        }
        if (i25 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.f20442y;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            v1 v1Var = new v1(this, getContext(), 0);
            this.v = v1Var;
            v1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, e(i6.A5));
            this.f20409a1.addView(this.v, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f20438w = linearLayout;
            linearLayout.setOrientation(1);
            f10 = 20.0f;
            f11 = 4.0f;
            this.v.addView(this.f20438w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f10 = 20.0f;
            f11 = 4.0f;
        }
        av avVar = new av(getContext());
        this.f20426n = avVar;
        NotificationCenter.listenEmojiLoading(avVar);
        av avVar2 = this.f20426n;
        if (this.W) {
            i10 = i6.f21181y6;
        } else {
            i10 = i6.f20905j5;
        }
        avVar2.setTextColor(e(i10));
        this.f20426n.setTextSize(1, f7);
        this.f20426n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.f20426n.setLinkTextColor(e(i6.f20924k5));
        if (!this.f20419f0) {
            this.f20426n.setClickable(false);
            this.f20426n.setEnabled(false);
        }
        av avVar3 = this.f20426n;
        if (this.W) {
            i11 = 1;
        } else if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        avVar3.setGravity(i11 | 48);
        if (i25 == 2) {
            z1 z1Var4 = this.f20409a1;
            av avVar4 = this.f20426n;
            if (LocaleController.isRTL) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i32 = i16 | 48;
            if (this.R == null) {
                i17 = 19;
            } else {
                i17 = 0;
            }
            z1Var4.addView(avVar4, w7.x5.t(-2, -2, i32, 24, i17, 24, 20));
            o90 o90Var = new o90(getContext());
            this.f20436u0 = o90Var;
            o90Var.a(this.f20417e0 / 100.0f, false);
            this.f20436u0.setProgressColor(e(i6.F5));
            this.f20436u0.setBackColor(e(i6.G5));
            this.f20409a1.addView(this.f20436u0, w7.x5.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f20437v0 = textView4;
            textView4.setTypeface(AndroidUtilities.bold());
            TextView textView5 = this.f20437v0;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView5.setGravity(i18 | 48);
            this.f20437v0.setTextColor(e(i6.f21036q5));
            this.f20437v0.setTextSize(1, 14.0f);
            z1 z1Var5 = this.f20409a1;
            TextView textView6 = this.f20437v0;
            if (!LocaleController.isRTL) {
                i29 = 3;
            }
            z1Var5.addView(textView6, w7.x5.t(-2, -2, i29 | 48, 23, 4, 23, 24));
            this.f20437v0.setText(String.format("%d%%", Integer.valueOf(this.f20417e0)));
        } else if (i25 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f20431r = new FrameLayout(getContext());
            this.U0 = e(i6.M5);
            if (!this.T0) {
                this.f20431r.setBackgroundDrawable(i6.c0(AndroidUtilities.dp(18.0f), this.U0));
            }
            this.f20409a1.addView(this.f20431r, w7.x5.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), e6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(e(i6.N5));
            this.f20431r.addView(radialProgressView, w7.x5.e(86, 86, 17));
        } else {
            av avVar5 = this.d;
            if (avVar5 != null) {
                this.f20438w.addView(avVar5, w7.x5.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f20438w;
            av avVar6 = this.f20426n;
            if (this.W) {
                i29 = 1;
            } else if (!LocaleController.isRTL) {
                i29 = 3;
            }
            int i33 = i29 | 48;
            if (this.f20410b == null && this.P == null) {
                i12 = 0;
            } else {
                i12 = this.G;
            }
            linearLayout2.addView(avVar6, w7.x5.t(-2, -2, i33, 24, 0, 24, i12));
            TextView textView7 = this.f20413c;
            if (textView7 != null) {
                this.f20438w.addView(textView7, w7.x5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.T)) {
            this.f20426n.setText(this.T);
            this.f20426n.setVisibility(0);
        } else {
            this.f20426n.setVisibility(8);
        }
        if (this.P != null) {
            int i34 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.P;
                if (i34 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i34] != null) {
                    x1 x1Var = new x1(getContext(), e6Var);
                    CharSequence charSequence = this.P[i34];
                    int[] iArr = this.Q;
                    if (iArr != null) {
                        i15 = iArr[i34];
                    } else {
                        i15 = 0;
                    }
                    x1Var.a(i15, charSequence);
                    x1Var.setTag(Integer.valueOf(i34));
                    this.N0.add(x1Var);
                    this.f20438w.addView(x1Var, w7.x5.n(-1, 50));
                    x1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final b2 f21507b;

                        {
                            this.f21507b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f21507b.dismiss();
                                    return;
                                case 1:
                                    b2 b2Var = this.f21507b;
                                    new f7(b2Var.getContext(), b2Var.R0).show();
                                    return;
                                default:
                                    b2 b2Var2 = this.f21507b;
                                    DialogInterface.OnClickListener onClickListener = b2Var2.M;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(b2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    b2Var2.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i34++;
            }
        }
        View view2 = this.f20410b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f20410b.getParent()).removeView(this.f20410b);
            }
            this.f20438w.addView(this.f20410b, w7.x5.n(-1, this.f20416e));
        }
        if (objArr != null) {
            if (!this.I0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.f20425l0;
                if (charSequence2 != null) {
                    i14 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0);
                } else {
                    i14 = 0;
                }
                if (this.f20427n0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.f20427n0;
                    i14 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (this.f20429p0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    String str = this.f20429p0;
                    i14 = (int) (textPaint.measureText((CharSequence) str, 0, str.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (this.f20432r0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.f20432r0;
                    i14 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (i14 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (this.J0 && this.f20425l0 != null && this.f20427n0 != null && this.f20429p0 != null && this.f20432r0 != null) {
                        this.K0 = true;
                    } else {
                        this.I0 = true;
                    }
                }
            }
            if (this.I0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f20435t0 = linearLayout3;
            } else {
                this.f20435t0 = new t2(this, getContext(), 1);
            }
            if (this.f20413c != null) {
                this.f20435t0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f11));
                this.f20435t0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.f20435t0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            z1 z1Var6 = this.f20409a1;
            ViewGroup viewGroup2 = this.f20435t0;
            if (this.K0) {
                i13 = 96;
            } else {
                i13 = 52;
            }
            z1Var6.addView(viewGroup2, w7.x5.n(-1, i13));
            if (this.W) {
                this.f20435t0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.f20425l0 != null) {
                w1 w1Var = new w1(getContext(), 0);
                w1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                w1Var.setTag(-1);
                w1Var.setTextSize(1, 16.0f);
                w1Var.setTextColor(e(this.I));
                w1Var.setGravity(17);
                w1Var.setTypeface(AndroidUtilities.bold());
                w1Var.setText(this.f20425l0);
                f12 = 64.0f;
                w1Var.setBackground(i6.H0(AndroidUtilities.dp(f10), e(this.I)));
                w1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    f13 = 6.0f;
                    this.f20435t0.addView(w1Var, w7.x5.q(-1, 40, 7));
                } else {
                    f13 = 6.0f;
                    this.f20435t0.addView(w1Var, w7.x5.e(-2, 40, 53));
                }
                w1Var.setOnClickListener(new ai.f2(18, this, w1Var));
            } else {
                f12 = 64.0f;
                f13 = 6.0f;
            }
            if (this.f20427n0 != null) {
                w1 w1Var2 = new w1(getContext(), 1);
                w1Var2.setMinWidth(AndroidUtilities.dp(f12));
                w1Var2.setTag(-2);
                w1Var2.setTextSize(1, 16.0f);
                w1Var2.setTextColor(e(this.I));
                w1Var2.setGravity(17);
                w1Var2.setTypeface(AndroidUtilities.bold());
                w1Var2.setEllipsize(TextUtils.TruncateAt.END);
                w1Var2.setSingleLine(true);
                w1Var2.setText(this.f20427n0.toString());
                w1Var2.setBackground(i6.H0(AndroidUtilities.dp(f10), e(this.I)));
                w1Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    this.f20435t0.addView(w1Var2, 0, w7.x5.q(-1, 40, 7));
                } else {
                    this.f20435t0.addView(w1Var2, w7.x5.e(-2, 40, 53));
                }
                w1Var2.setOnClickListener(new ai.f2(19, this, w1Var2));
            }
            if (this.f20432r0 != null) {
                w1 w1Var3 = new w1(getContext(), 2);
                w1Var3.setMinWidth(AndroidUtilities.dp(f12));
                w1Var3.setTag(-3);
                w1Var3.setTextSize(1, 16.0f);
                w1Var3.setTextColor(e(this.I));
                w1Var3.setGravity(17);
                w1Var3.setTypeface(AndroidUtilities.bold());
                w1Var3.setEllipsize(TextUtils.TruncateAt.END);
                w1Var3.setSingleLine(true);
                w1Var3.setText(this.f20432r0.toString());
                w1Var3.setBackground(i6.H0(AndroidUtilities.dp(f10), e(this.I)));
                w1Var3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    this.f20435t0.addView(w1Var3, 1, w7.x5.q(-1, 40, 7));
                } else {
                    this.f20435t0.addView(w1Var3, w7.x5.e(-2, 40, 51));
                }
                w1Var3.setOnClickListener(new ai.f2(20, this, w1Var3));
            }
            if (this.f20429p0 != null) {
                w1 w1Var4 = new w1(getContext(), 3);
                w1Var4.setMinWidth(AndroidUtilities.dp(f12));
                w1Var4.setTag(-4);
                w1Var4.setTextSize(1, 16.0f);
                w1Var4.setTextColor(e(this.I));
                w1Var4.setGravity(17);
                w1Var4.setTypeface(AndroidUtilities.bold());
                w1Var4.setEllipsize(TextUtils.TruncateAt.END);
                w1Var4.setSingleLine(true);
                w1Var4.setText(this.f20429p0.toString());
                w1Var4.setBackground(i6.H0(AndroidUtilities.dp(f10), e(this.I)));
                w1Var4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    this.f20435t0.addView(w1Var4, 0, w7.x5.q(-1, 40, 7));
                } else {
                    this.f20435t0.addView(w1Var4, w7.x5.e(-2, 40, 53));
                }
                w1Var4.setOnClickListener(new ai.f2(21, this, w1Var4));
            }
            if (this.I0) {
                for (int i35 = 1; i35 < this.f20435t0.getChildCount(); i35++) {
                    ((ViewGroup.MarginLayoutParams) this.f20435t0.getChildAt(i35).getLayoutParams()).topMargin = AndroidUtilities.dp(f13);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.X0) {
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i25 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.P0) {
                layoutParams3.dimAmount = this.Q0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            int i36 = AndroidUtilities.displaySize.x;
            this.L = i36;
            int dp2 = (i36 - AndroidUtilities.dp(48.0f)) - (this.V0 * 2);
            if (AndroidUtilities.isTablet()) {
                if (AndroidUtilities.isSmallTablet()) {
                    dp = AndroidUtilities.dp(446.0f);
                } else {
                    dp = AndroidUtilities.dp(496.0f);
                }
            } else {
                dp = AndroidUtilities.dp(356.0f);
            }
            int min = Math.min(dp, dp2);
            Rect rect2 = this.A0;
            layoutParams3.width = min + rect2.left + rect2.right;
        }
        View view3 = this.f20410b;
        if (view3 != null && this.f20443y0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.T0) {
            AndroidUtilities.makeGlobalBlurBitmap(new x0(this, 1), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final of.e g(int i10, boolean z10, boolean z11) {
        View d = d(i10);
        if (z11) {
            this.f20421h0 = false;
        }
        return new of.e(new q(d, 5), new ci.x0(this, d, z10, 10));
    }

    public final void h() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            textView.setTextColor(e(i6.f21037q7));
        }
    }

    public final void i(int i10) {
        this.U0 = i10;
        Drawable drawable = this.f20444z0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.U0, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.f20438w.invalidate();
    }

    public final void j() {
        this.f20420g0 = false;
    }

    public final void k(boolean z10) {
        if (this.H0) {
            return;
        }
        this.H0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.H0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void l(int i10, int i11, int i12) {
        if (i10 >= 0) {
            ArrayList arrayList = this.N0;
            if (i10 < arrayList.size()) {
                x1 x1Var = (x1) arrayList.get(i10);
                x1Var.f21693a.setTextColor(i11);
                x1Var.f21694b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void m(String str) {
        this.T = str;
        if (this.f20426n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f20426n.setText(this.T);
                this.f20426n.setVisibility(0);
                return;
            }
            this.f20426n.setVisibility(8);
        }
    }

    public final void n(int i10) {
        this.f20417e0 = i10;
        o90 o90Var = this.f20436u0;
        if (o90Var != null) {
            o90Var.a(i10 / 100.0f, true);
            this.f20437v0.setText(String.format("%d%%", Integer.valueOf(this.f20417e0)));
        }
    }

    public final void o(int i10) {
        vh.n nVar = this.f20418f;
        if (nVar != null) {
            nVar.setTextColor(i10);
        }
        av avVar = this.f20426n;
        if (avVar != null) {
            avVar.setTextColor(i10);
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        y80 y80Var = this.f20439w0;
        if (y80Var != null) {
            y80Var.f(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p() {
        if (this.f20420g0 && this.K == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.R0);
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new n(this, 3));
            alertDialog$Builder.j(new r1(this, 0));
            try {
                this.K = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j3) {
        q1 q1Var = this.M0;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, j3);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        v1 v1Var = this.v;
        if (v1Var != null) {
            v1Var.postDelayed(runnable, j3);
        }
    }

    @Override
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.J = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.R = charSequence;
        vh.n nVar = this.f20418f;
        if (nVar != null) {
            nVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        this.f20412b1 = false;
        super.show();
        FrameLayout frameLayout = this.f20431r;
        if (frameLayout != null && this.f20415d0 == 3) {
            frameLayout.setScaleX(0.0f);
            this.f20431r.setScaleY(0.0f);
            this.f20431r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.W0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        v1 v1Var = this.v;
        if (v1Var != null) {
            v1Var.removeCallbacks(runnable);
        }
    }

    public b2(Context context, int i10, e6 e6Var) {
        super(context, R.style.TransparentDialog);
        this.f20407a = -1;
        this.f20416e = -2;
        this.f20442y = new BitmapDrawable[2];
        this.E = new boolean[2];
        this.F = new AnimatorSet[2];
        this.G = 12;
        this.I = i6.H5;
        this.f20408a0 = 132;
        this.f20419f0 = true;
        this.f20420g0 = true;
        this.f20421h0 = true;
        this.f20441x0 = new int[2];
        this.f20443y0 = true;
        this.L0 = new q1(this, 0);
        this.M0 = new q1(this, 1);
        this.N0 = new ArrayList();
        this.P0 = true;
        this.Q0 = 0.5f;
        this.S0 = true;
        this.R0 = e6Var;
        this.f20415d0 = i10;
        int e7 = e(i6.f20868h5);
        this.U0 = e7;
        boolean z10 = AndroidUtilities.computePerceivedBrightness(e7) < 0.721f;
        this.T0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z10;
        Rect rect = new Rect();
        this.A0 = rect;
        if (i10 != 3 || this.T0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.f20444z0 = mutate;
            this.B0 = i10 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.U0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.H = i10 == 3;
    }
}
