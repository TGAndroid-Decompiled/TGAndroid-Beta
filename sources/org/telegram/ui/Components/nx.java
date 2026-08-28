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
public final class nx extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final wy A;
    public final pi0 f31193a;
    public final org.telegram.ui.ActionBar.h5 f31194b;
    public final TextView f31195c;
    public final FrameLayout d;
    public final TextView f31196e;
    public final TextView f31197f;
    public final zf.p0 h;
    public TLRPC.TL_inputStickerSetID f31198n;
    public TLRPC.TL_inputStickerSetID f31199r;
    public jx f31200s;
    public boolean v;
    public Paint f31201w;
    public int f31202x;
    public AnimatorSet f31203y;

    public nx(wy wyVar, Context context) {
        super(context);
        this.A = wyVar;
        ?? imageView = new ImageView(context);
        this.f31193a = imageView;
        imageView.f(R.raw.unlock_icon, 24, 24, null);
        int i9 = org.telegram.ui.ActionBar.f6.Te;
        imageView.setColorFilter(wyVar.z(i9));
        addView((View) imageView, g7.e6.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f31194b = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTextColor(wyVar.z(i9));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setOnClickListener(new mx(this, 0));
        TextView textView = new TextView(context);
        this.f31195c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(wyVar.z(i9));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.f6.l1(0.12f, wyVar.z(org.telegram.ui.ActionBar.f6.Me))));
        textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
        textView.setText(LocaleController.getString(R.string.GroupEmoji));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, g7.e6.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, g7.e6.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new mx(this, 1));
        addView(frameLayout, g7.e6.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.f31196e = textView2;
        j3.r0.u(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.Add));
        textView2.setTextColor(wyVar.z(org.telegram.ui.ActionBar.f6.Sh));
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        textView2.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{16.0f}, wyVar.z(i10), wyVar.z(org.telegram.ui.ActionBar.f6.Qh)));
        textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new mx(this, 2));
        frameLayout.addView(textView2, g7.e6.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f31197f = textView3;
        j3.r0.u(14.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        textView3.setTextColor(wyVar.z(org.telegram.ui.ActionBar.f6.Rh));
        textView3.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{16.0f}, 0, wyVar.z(i10) & 452984831));
        textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(AndroidUtilities.dp(4.0f));
        textView3.setOnClickListener(new mx(this, 3));
        frameLayout.addView(textView3, g7.e6.h(-2.0f, 26.0f, 8388661));
        zf.p0 p0Var = new zf.p0(AndroidUtilities.dp(16.0f), context, wyVar.V1, false);
        this.h = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new mx(this, 4), false);
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
        this.d.addView(this.h, g7.e6.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        boolean z11;
        int i9;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        float f16;
        float f17;
        float f18;
        int i11;
        float f19;
        float f20;
        float f21;
        int i12;
        char c10;
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
        float f33;
        jx jxVar = this.f31200s;
        if (jxVar == null) {
            return;
        }
        boolean z17 = jxVar.f29868f;
        wy wyVar = this.A;
        if (!z17 && !wyVar.l1.contains(Long.valueOf(jxVar.f29865b.f22407id))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.f31200s.f29867e && !UserConfig.getInstance(wyVar.Y0).isPremium() && !wyVar.Q0) {
            i9 = 1;
        } else if (this.f31200s.f29869g) {
            if (z11) {
                i9 = 3;
            } else {
                i9 = 2;
            }
        } else {
            i9 = 0;
        }
        if (i9 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f31202x == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            requestLayout();
        }
        this.f31202x = i9;
        AnimatorSet animatorSet = this.f31203y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31203y = null;
        }
        if (i9 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        zf.p0 p0Var = this.h;
        p0Var.setEnabled(z14);
        if (i9 == 2) {
            z15 = true;
        } else {
            z15 = false;
        }
        TextView textView = this.f31196e;
        textView.setEnabled(z15);
        if (i9 == 3) {
            z16 = true;
        } else {
            z16 = false;
        }
        TextView textView2 = this.f31197f;
        textView2.setEnabled(z16);
        org.telegram.ui.ActionBar.h5 h5Var = this.f31194b;
        pi0 pi0Var = this.f31193a;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31203y = animatorSet2;
            if (i9 == 1) {
                f22 = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                f22 = -AndroidUtilities.dp(16.0f);
            }
            float[] fArr = new float[1];
            fArr[c10] = f22;
            Property property = FrameLayout.TRANSLATION_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pi0Var, property, fArr);
            if (i9 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            float[] fArr2 = new float[1];
            fArr2[c10] = f23;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pi0Var, property2, fArr2);
            if (i9 == 1) {
                f24 = AndroidUtilities.dp(16.0f);
            } else {
                f24 = 0.0f;
            }
            float[] fArr3 = new float[1];
            fArr3[c10] = f24;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h5Var, property, fArr3);
            if (i9 == 1) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            float[] fArr4 = new float[1];
            fArr4[c10] = f25;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(p0Var, property2, fArr4);
            if (i9 == 1) {
                f26 = 1.0f;
            } else {
                f26 = 0.6f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f26;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(p0Var, property3, fArr5);
            if (i9 == 1) {
                f27 = 1.0f;
            } else {
                f27 = 0.6f;
            }
            float[] fArr6 = new float[1];
            fArr6[c10] = f27;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(p0Var, property4, fArr6);
            if (i9 == 2) {
                f28 = 1.0f;
            } else {
                f28 = 0.0f;
            }
            float[] fArr7 = new float[1];
            fArr7[c10] = f28;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, property2, fArr7);
            if (i9 == 2) {
                f29 = 1.0f;
            } else {
                f29 = 0.6f;
            }
            float[] fArr8 = new float[1];
            fArr8[c10] = f29;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, property3, fArr8);
            if (i9 == 2) {
                f30 = 1.0f;
            } else {
                f30 = 0.6f;
            }
            float[] fArr9 = new float[1];
            fArr9[c10] = f30;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, property4, fArr9);
            if (i9 == 3) {
                f31 = 1.0f;
            } else {
                f31 = 0.0f;
            }
            float[] fArr10 = new float[1];
            fArr10[c10] = f31;
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, property2, fArr10);
            if (i9 == 3) {
                f32 = 1.0f;
            } else {
                f32 = 0.6f;
            }
            float[] fArr11 = new float[1];
            fArr11[c10] = f32;
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, property3, fArr11);
            if (i9 == 3) {
                f33 = 1.0f;
            } else {
                f33 = 0.6f;
            }
            float[] fArr12 = new float[1];
            fArr12[c10] = f33;
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
            this.f31203y.addListener(new mh.o2(this, i9, 6));
            this.f31203y.setDuration(250L);
            this.f31203y.setInterpolator(new OvershootInterpolator(1.02f));
            this.f31203y.start();
            return;
        }
        if (i9 == 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        pi0Var.setAlpha(f10);
        if (i9 == 1) {
            f11 = 0.0f;
        } else {
            f11 = -AndroidUtilities.dp(16.0f);
        }
        pi0Var.setTranslationX(f11);
        if (i9 == 1) {
            f12 = AndroidUtilities.dp(16.0f);
        } else {
            f12 = 0.0f;
        }
        h5Var.setTranslationX(f12);
        if (i9 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        p0Var.setAlpha(f13);
        if (i9 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        p0Var.setScaleX(f14);
        if (i9 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        p0Var.setScaleY(f15);
        if (i9 == 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        p0Var.setVisibility(i10);
        if (i9 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        textView.setAlpha(f16);
        if (i9 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.6f;
        }
        textView.setScaleX(f17);
        if (i9 == 2) {
            f18 = 1.0f;
        } else {
            f18 = 0.6f;
        }
        textView.setScaleY(f18);
        if (i9 == 2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        if (i9 == 3) {
            f19 = 1.0f;
        } else {
            f19 = 0.0f;
        }
        textView2.setAlpha(f19);
        if (i9 == 3) {
            f20 = 1.0f;
        } else {
            f20 = 0.6f;
        }
        textView2.setScaleX(f20);
        if (i9 == 3) {
            f21 = 1.0f;
        } else {
            f21 = 0.6f;
        }
        textView2.setScaleY(f21);
        if (i9 == 3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView2.setVisibility(i12);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet stickerSetById;
        TLRPC.TL_messages_stickerSet stickerSetById2;
        wy wyVar = this.A;
        int i11 = wyVar.Y0;
        if (i9 == NotificationCenter.groupStickersDidLoad) {
            if (this.f31198n != null && (stickerSetById2 = MediaDataController.getInstance(i11).getStickerSetById(this.f31198n.f22400id)) != null && stickerSetById2.set != null) {
                org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
                if (o2Var == null) {
                    o2Var = new bg.i1(this, 9);
                }
                dv.V(o2Var, stickerSetById2, true, null, new np(this, 14));
                this.f31198n = null;
            }
            if (this.f31199r != null && (stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(this.f31199r.f22400id)) != null && stickerSetById.set != null) {
                org.telegram.ui.ActionBar.o2 o2Var2 = wyVar.U1;
                if (o2Var2 == null) {
                    o2Var2 = new bg.i1(this, 9);
                }
                org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                zq zqVar = new zq(9, this, stickerSetById);
                Pattern pattern = dv.R;
                if (o2Var3.getFragmentView() != null) {
                    MediaDataController.getInstance(o2Var3.getCurrentAccount()).toggleStickerSet(o2Var3.getFragmentView().getContext(), stickerSetById, 0, o2Var3, true, true, zqVar, false);
                }
                this.f31199r = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.A.Y0).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v) {
            if (this.f31201w == null) {
                Paint paint = new Paint(1);
                this.f31201w = paint;
                paint.setStrokeWidth(1.0f);
                this.f31201w.setColor(this.A.z(org.telegram.ui.ActionBar.f6.f23002d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.f31201w);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        int dp = AndroidUtilities.dp(11.0f) + this.d.getWidth();
        TextView textView = this.f31195c;
        if (textView.getVisibility() == 0) {
            i13 = textView.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        int i14 = dp + i13;
        org.telegram.ui.ActionBar.h5 h5Var = this.f31194b;
        h5Var.setRightPadding(i14);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(AndroidUtilities.dp(4.0f) + h5Var.getTextWidth());
            float dp2 = AndroidUtilities.dp(4.0f) + (h5Var.getMaxTextWidth() - i14);
            if (textView.getTranslationX() > dp2) {
                textView.setTranslationX(dp2);
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        float f11;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31194b.getLayoutParams();
        if (this.f31202x == 0) {
            f10 = 10.0f;
        } else {
            f10 = 15.0f;
        }
        marginLayoutParams.topMargin = AndroidUtilities.dp(f10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.f31202x == 0) {
            f11 = 32.0f;
        } else {
            f11 = 42.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
    }
}
