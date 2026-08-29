package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.th0;
public final class p3 extends FrameLayout {
    public int A;
    public CharSequence B;
    public int C;
    public float D;
    public final org.telegram.ui.ActionBar.c6 E;
    public final boolean f24960a;
    public final TextView f24961b;
    public final TextView f24962c;
    public final th0 d;
    public final TextView f24963e;
    public TLRPC.StickerSetCovered f24964f;
    public AnimatorSet h;
    public boolean f24965n;
    public boolean f24966r;
    public boolean f24967s;
    public boolean v;
    public final int f24968w;
    public final Paint f24969x;
    public int f24970y;

    public p3(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        ViewGroup.LayoutParams d12;
        this.f24968w = UserConfig.selectedAccount;
        this.f24969x = new Paint(1);
        this.f24960a = z11;
        this.E = c6Var;
        TextView textView = new TextView(context);
        this.f24961b = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.Se, c6Var, textView, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            d = i7.f6.i(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f);
        } else {
            d = i7.f6.d(-2, -2.0f, 51, i10, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.f24962c = textView2;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.We, c6Var, textView2, 1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            d10 = i7.f6.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f);
        } else {
            d10 = i7.f6.d(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d10);
        if (z11) {
            th0 th0Var = new th0(context);
            this.d = th0Var;
            th0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
            th0Var.setText(LocaleController.getString(R.string.Add));
            if (z10) {
                d11 = i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = i7.f6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(th0Var, d11);
            TextView textView3 = new TextView(context);
            this.f24963e = textView3;
            textView3.setGravity(17);
            org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.Rh, c6Var, textView3, 1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            if (z10) {
                d12 = i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d12 = i7.f6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d12);
        }
        setWillNotDraw(false);
        d();
    }

    public static void a(ArrayList arrayList, jl0 jl0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 4, new Class[]{p3.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Se));
        int i10 = org.telegram.ui.ActionBar.g6.We;
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 4, new Class[]{p3.class}, new String[]{"infoTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 4, new Class[]{p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 4, new Class[]{p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{p3.class}, null, null, null, org.telegram.ui.ActionBar.g6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{p3.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i10));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f24960a) {
            this.d.a(z10, z11);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        boolean z13;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        float f15 = 0.0f;
        if (this.f24964f != stickerSetCovered) {
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            this.D = f14;
            invalidate();
        }
        this.f24964f = stickerSetCovered;
        this.f24970y = i10;
        this.A = i11;
        if (i11 != 0) {
            e();
        } else {
            this.f24961b.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView = this.f24962c;
        if (z14) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z10;
        if (this.f24960a) {
            boolean z15 = this.f24967s;
            th0 th0Var = this.d;
            if (z15) {
                th0Var.setVisibility(0);
                if (!z12 && !MediaDataController.getInstance(this.f24968w).isStickerPackInstalled(stickerSetCovered.set.f22419id)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f24966r = z13;
                TextView textView2 = this.f24963e;
                if (z11) {
                    if (z13) {
                        textView2.setVisibility(0);
                    } else {
                        th0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f24966r) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    float[] fArr = {f9};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
                    if (this.f24966r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr2 = {f10};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
                    if (this.f24966r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr3 = {f11};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
                    if (this.f24966r) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(th0Var, property, f12);
                    if (this.f24966r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(th0Var, property2, f13);
                    if (!this.f24966r) {
                        f15 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(th0Var, property3, f15));
                    this.h.addListener(new o3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView2.setVisibility(0);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    th0Var.setVisibility(4);
                    th0Var.setAlpha(0.0f);
                    th0Var.setScaleX(0.0f);
                    th0Var.setScaleY(0.0f);
                    return;
                } else {
                    th0Var.setVisibility(0);
                    th0Var.setAlpha(1.0f);
                    th0Var.setScaleX(1.0f);
                    th0Var.setScaleY(1.0f);
                    textView2.setVisibility(4);
                    textView2.setAlpha(0.0f);
                    textView2.setScaleX(0.0f);
                    textView2.setScaleY(0.0f);
                    return;
                }
            }
            th0Var.setVisibility(8);
        }
    }

    public final void d() {
        if (this.f24960a) {
            int i10 = org.telegram.ui.ActionBar.g6.Nh;
            org.telegram.ui.ActionBar.c6 c6Var = this.E;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            th0 th0Var = this.d;
            th0Var.setProgressColor(v02);
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
            org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
            th0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, v03));
        }
        e();
        f();
    }

    public final void e() {
        if (this.A != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24964f.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, this.E));
                int i10 = this.f24970y;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.A + i10, 33);
            } catch (Exception unused) {
            }
            this.f24961b.setText(spannableStringBuilder);
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.c6 c6Var = this.E;
        if (this.B != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.B);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var)), 0, this.C, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.We, c6Var)), this.C, this.B.length(), 33);
            } catch (Exception unused) {
            }
            this.f24962c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f24964f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.v;
        org.telegram.ui.ActionBar.c6 c6Var = this.E;
        if (z10 || this.D != 0.0f) {
            if (z10) {
                float f9 = this.D;
                if (f9 != 1.0f) {
                    float f10 = f9 + 0.16f;
                    this.D = f10;
                    if (f10 > 1.0f) {
                        this.D = 1.0f;
                    } else {
                        invalidate();
                    }
                    int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Th, c6Var);
                    Paint paint = this.f24969x;
                    paint.setColor(v02);
                    canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f24961b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.D, paint);
                }
            }
            if (!z10) {
                float f11 = this.D;
                if (f11 != 0.0f) {
                    float f12 = f11 - 0.16f;
                    this.D = f12;
                    if (f12 < 0.0f) {
                        this.D = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int v022 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Th, c6Var);
            Paint paint2 = this.f24969x;
            paint2.setColor(v022);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f24961b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.D, paint2);
        }
        if (this.f24965n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.f24960a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.f24963e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = j7.l1.e(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.f24961b, i10, measuredWidth, i11, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f24960a) {
            this.f24967s = true;
            this.d.setOnClickListener(onClickListener);
            this.f24963e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f24965n = z10;
    }
}
