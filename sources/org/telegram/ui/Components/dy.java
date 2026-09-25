package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class dy extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final lz E;
    public final lj0 f23754a;
    public final org.telegram.ui.ActionBar.h5 f23755b;
    public final TextView f23756c;
    public final FrameLayout d;
    public final TextView e;
    public final TextView f23757f;
    public final rg.p0 h;
    public TLRPC.TL_inputStickerSetID f23758n;
    public TLRPC.TL_inputStickerSetID f23759r;
    public yx f23760s;
    public boolean v;
    public Paint f23761w;
    public int f23762x;
    public AnimatorSet f23763y;

    public dy(lz lzVar, Context context) {
        super(context);
        this.E = lzVar;
        ?? imageView = new ImageView(context);
        this.f23754a = imageView;
        imageView.f(R.raw.unlock_icon, 24, 24, null);
        int i10 = org.telegram.ui.ActionBar.h6.Te;
        imageView.setColorFilter(lzVar.z(i10));
        addView((View) imageView, w7.y5.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f23755b = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTextColor(lzVar.z(i10));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setOnClickListener(new cy(this, 0));
        TextView textView = new TextView(context);
        this.f23756c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(lzVar.z(i10));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.l1(0.12f, lzVar.z(org.telegram.ui.ActionBar.h6.Me))));
        textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
        textView.setText(LocaleController.getString(R.string.GroupEmoji));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, w7.y5.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, w7.y5.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new cy(this, 1));
        addView(frameLayout, w7.y5.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.Add));
        textView2.setTextColor(lzVar.z(org.telegram.ui.ActionBar.h6.Sh));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{16.0f}, lzVar.z(i11), lzVar.z(org.telegram.ui.ActionBar.h6.Qh)));
        textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new cy(this, 2));
        frameLayout.addView(textView2, w7.y5.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f23757f = textView3;
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        textView3.setTextColor(lzVar.z(org.telegram.ui.ActionBar.h6.Rh));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{16.0f}, 0, lzVar.z(i11) & 452984831));
        textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(AndroidUtilities.dp(4.0f));
        textView3.setOnClickListener(new cy(this, 3));
        frameLayout.addView(textView3, w7.y5.h(-2.0f, 26.0f, 8388661));
        rg.p0 p0Var = new rg.p0(AndroidUtilities.dp(16.0f), context, lzVar.Z1, false);
        this.h = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new cy(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
            marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
            p0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.d.addView(this.h, w7.y5.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i11;
        float f15;
        float f16;
        float f17;
        int i12;
        float f18;
        float f19;
        float f20;
        int i13;
        char c10;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        yx yxVar = this.f23760s;
        if (yxVar == null) {
            return;
        }
        boolean z17 = yxVar.f30718f;
        lz lzVar = this.E;
        if (!z17 && !lzVar.f26276p1.contains(Long.valueOf(yxVar.f30716b.f18363id))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.f23760s.e && !UserConfig.getInstance(lzVar.f26237c1).isPremium() && !lzVar.U0) {
            i10 = 1;
        } else if (this.f23760s.f30719g) {
            if (z11) {
                i10 = 3;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f23762x == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            requestLayout();
        }
        this.f23762x = i10;
        AnimatorSet animatorSet = this.f23763y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f23763y = null;
        }
        if (i10 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        rg.p0 p0Var = this.h;
        p0Var.setEnabled(z14);
        if (i10 == 2) {
            z15 = true;
        } else {
            z15 = false;
        }
        TextView textView = this.e;
        textView.setEnabled(z15);
        if (i10 == 3) {
            z16 = true;
        } else {
            z16 = false;
        }
        TextView textView2 = this.f23757f;
        textView2.setEnabled(z16);
        org.telegram.ui.ActionBar.h5 h5Var = this.f23755b;
        lj0 lj0Var = this.f23754a;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23763y = animatorSet2;
            if (i10 == 1) {
                f21 = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                f21 = -AndroidUtilities.dp(16.0f);
            }
            float[] fArr = new float[1];
            fArr[c10] = f21;
            Property property = FrameLayout.TRANSLATION_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lj0Var, property, fArr);
            if (i10 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            float[] fArr2 = new float[1];
            fArr2[c10] = f22;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(lj0Var, property2, fArr2);
            if (i10 == 1) {
                f23 = AndroidUtilities.dp(16.0f);
            } else {
                f23 = 0.0f;
            }
            float[] fArr3 = new float[1];
            fArr3[c10] = f23;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h5Var, property, fArr3);
            if (i10 == 1) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            float[] fArr4 = new float[1];
            fArr4[c10] = f24;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(p0Var, property2, fArr4);
            if (i10 == 1) {
                f25 = 1.0f;
            } else {
                f25 = 0.6f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f25;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(p0Var, property3, fArr5);
            if (i10 == 1) {
                f26 = 1.0f;
            } else {
                f26 = 0.6f;
            }
            float[] fArr6 = new float[1];
            fArr6[c10] = f26;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(p0Var, property4, fArr6);
            if (i10 == 2) {
                f27 = 1.0f;
            } else {
                f27 = 0.0f;
            }
            float[] fArr7 = new float[1];
            fArr7[c10] = f27;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, property2, fArr7);
            if (i10 == 2) {
                f28 = 1.0f;
            } else {
                f28 = 0.6f;
            }
            float[] fArr8 = new float[1];
            fArr8[c10] = f28;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, property3, fArr8);
            if (i10 == 2) {
                f29 = 1.0f;
            } else {
                f29 = 0.6f;
            }
            float[] fArr9 = new float[1];
            fArr9[c10] = f29;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, property4, fArr9);
            if (i10 == 3) {
                f30 = 1.0f;
            } else {
                f30 = 0.0f;
            }
            float[] fArr10 = new float[1];
            fArr10[c10] = f30;
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, property2, fArr10);
            if (i10 == 3) {
                f31 = 1.0f;
            } else {
                f31 = 0.6f;
            }
            float[] fArr11 = new float[1];
            fArr11[c10] = f31;
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, property3, fArr11);
            if (i10 == 3) {
                f32 = 1.0f;
            } else {
                f32 = 0.6f;
            }
            float[] fArr12 = new float[1];
            fArr12[c10] = f32;
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, property4, fArr12);
            Animator[] animatorArr = new Animator[12];
            animatorArr[c10] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofFloat4;
            animatorArr[4] = ofFloat5;
            animatorArr[5] = ofFloat6;
            animatorArr[6] = ofFloat7;
            animatorArr[7] = ofFloat8;
            animatorArr[8] = ofFloat9;
            animatorArr[9] = ofFloat10;
            animatorArr[10] = ofFloat11;
            animatorArr[11] = ofFloat12;
            animatorSet2.playTogether(animatorArr);
            this.f23763y.addListener(new ei.v2(this, i10, 7));
            this.f23763y.setDuration(250L);
            this.f23763y.setInterpolator(new OvershootInterpolator(1.02f));
            this.f23763y.start();
            return;
        }
        if (i10 == 1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        lj0Var.setAlpha(f7);
        if (i10 == 1) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(16.0f);
        }
        lj0Var.setTranslationX(f10);
        if (i10 == 1) {
            f11 = AndroidUtilities.dp(16.0f);
        } else {
            f11 = 0.0f;
        }
        h5Var.setTranslationX(f11);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        p0Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.6f;
        }
        p0Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        p0Var.setScaleY(f14);
        if (i10 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        p0Var.setVisibility(i11);
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        textView.setAlpha(f15);
        if (i10 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.6f;
        }
        textView.setScaleX(f16);
        if (i10 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.6f;
        }
        textView.setScaleY(f17);
        if (i10 == 2) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        if (i10 == 3) {
            f18 = 1.0f;
        } else {
            f18 = 0.0f;
        }
        textView2.setAlpha(f18);
        if (i10 == 3) {
            f19 = 1.0f;
        } else {
            f19 = 0.6f;
        }
        textView2.setScaleX(f19);
        if (i10 == 3) {
            f20 = 1.0f;
        } else {
            f20 = 0.6f;
        }
        textView2.setScaleY(f20);
        if (i10 == 3) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        textView2.setVisibility(i13);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet stickerSetById;
        TLRPC.TL_messages_stickerSet stickerSetById2;
        lz lzVar = this.E;
        int i12 = lzVar.f26237c1;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            if (this.f23758n != null && (stickerSetById2 = MediaDataController.getInstance(i12).getStickerSetById(this.f23758n.f18356id)) != null && stickerSetById2.set != null) {
                org.telegram.ui.ActionBar.m2 m2Var = lzVar.Y1;
                if (m2Var == null) {
                    m2Var = new ai.y3(this, 6);
                }
                tv.W(m2Var, stickerSetById2, true, null, new yp(this, 14));
                this.f23758n = null;
            }
            if (this.f23759r != null && (stickerSetById = MediaDataController.getInstance(i12).getStickerSetById(this.f23759r.f18356id)) != null && stickerSetById.set != null) {
                org.telegram.ui.ActionBar.m2 m2Var2 = lzVar.Y1;
                if (m2Var2 == null) {
                    m2Var2 = new ai.y3(this, 6);
                }
                org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                vw vwVar = new vw(2, this, stickerSetById);
                Pattern pattern = tv.V;
                if (m2Var3.getFragmentView() != null) {
                    MediaDataController.getInstance(m2Var3.getCurrentAccount()).toggleStickerSet(m2Var3.getFragmentView().getContext(), stickerSetById, 0, m2Var3, true, true, vwVar, false);
                }
                this.f23759r = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.E.f26237c1).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v) {
            if (this.f23761w == null) {
                Paint paint = new Paint(1);
                this.f23761w = paint;
                paint.setStrokeWidth(1.0f);
                this.f23761w.setColor(this.E.z(org.telegram.ui.ActionBar.h6.f19061d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.f23761w);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(11.0f) + this.d.getWidth();
        TextView textView = this.f23756c;
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        int i15 = dp + i14;
        org.telegram.ui.ActionBar.h5 h5Var = this.f23755b;
        h5Var.setRightPadding(i15);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(AndroidUtilities.dp(4.0f) + h5Var.getTextWidth());
            float dp2 = AndroidUtilities.dp(4.0f) + (h5Var.getMaxTextWidth() - i15);
            if (textView.getTranslationX() > dp2) {
                textView.setTranslationX(dp2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f23755b.getLayoutParams();
        if (this.f23762x == 0) {
            f7 = 10.0f;
        } else {
            f7 = 15.0f;
        }
        marginLayoutParams.topMargin = AndroidUtilities.dp(f7);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f23762x == 0) {
            f10 = 32.0f;
        } else {
            f10 = 42.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
