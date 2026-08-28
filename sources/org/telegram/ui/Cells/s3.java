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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.wk0;
public final class s3 extends FrameLayout {
    public int A;
    public CharSequence B;
    public int C;
    public float D;
    public final org.telegram.ui.ActionBar.b6 E;
    public final boolean f25257a;
    public final TextView f25258b;
    public final TextView f25259c;
    public final jh0 d;
    public final TextView f25260e;
    public TLRPC.StickerSetCovered f25261f;
    public AnimatorSet h;
    public boolean f25262n;
    public boolean f25263r;
    public boolean f25264s;
    public boolean v;
    public final int f25265w;
    public final Paint f25266x;
    public int f25267y;

    public s3(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d9;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        this.f25265w = UserConfig.selectedAccount;
        this.f25266x = new Paint(1);
        this.f25257a = z11;
        this.E = b6Var;
        TextView textView = new TextView(context);
        this.f25258b = textView;
        j2.o(org.telegram.ui.ActionBar.f6.Se, b6Var, textView, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            d = g7.e6.i(-2.0f, -2.0f, 8388659, i9, 8.0f, 40.0f, 0.0f);
        } else {
            d = g7.e6.d(-2, -2.0f, 51, i9, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.f25259c = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.We, b6Var, textView2, 1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            d9 = g7.e6.i(-2.0f, -2.0f, 8388659, i9, 30.0f, 100.0f, 0.0f);
        } else {
            d9 = g7.e6.d(-2, -2.0f, 51, i9, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d9);
        if (z11) {
            jh0 jh0Var = new jh0(context);
            this.d = jh0Var;
            jh0Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, b6Var));
            jh0Var.setText(LocaleController.getString(R.string.Add));
            if (z10) {
                d10 = g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d10 = g7.e6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(jh0Var, d10);
            TextView textView3 = new TextView(context);
            this.f25260e = textView3;
            textView3.setGravity(17);
            j2.o(org.telegram.ui.ActionBar.f6.Rh, b6Var, textView3, 1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            if (z10) {
                d11 = g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = g7.e6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d11);
        }
        setWillNotDraw(false);
        d();
    }

    public static void a(ArrayList arrayList, wk0 wk0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 4, new Class[]{s3.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Se));
        int i9 = org.telegram.ui.ActionBar.f6.We;
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 4, new Class[]{s3.class}, new String[]{"infoTextView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 4, new Class[]{s3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 4, new Class[]{s3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{s3.class}, null, null, null, org.telegram.ui.ActionBar.f6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{s3.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.f23229q6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, i9));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f25257a) {
            this.d.a(z10, z11);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, int i9, int i10, boolean z12) {
        boolean z13;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        float f16 = 0.0f;
        if (this.f25261f != stickerSetCovered) {
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            this.D = f15;
            invalidate();
        }
        this.f25261f = stickerSetCovered;
        this.f25267y = i9;
        this.A = i10;
        if (i10 != 0) {
            e();
        } else {
            this.f25258b.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView = this.f25259c;
        if (z14) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z10;
        if (this.f25257a) {
            boolean z15 = this.f25264s;
            jh0 jh0Var = this.d;
            if (z15) {
                jh0Var.setVisibility(0);
                if (!z12 && !MediaDataController.getInstance(this.f25265w).isStickerPackInstalled(stickerSetCovered.set.f22407id)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f25263r = z13;
                TextView textView2 = this.f25260e;
                if (z11) {
                    if (z13) {
                        textView2.setVisibility(0);
                    } else {
                        jh0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f25263r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr = {f10};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
                    if (this.f25263r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr2 = {f11};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
                    if (this.f25263r) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    float[] fArr3 = {f12};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
                    if (this.f25263r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(jh0Var, property, f13);
                    if (this.f25263r) {
                        f14 = 0.0f;
                    } else {
                        f14 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(jh0Var, property2, f14);
                    if (!this.f25263r) {
                        f16 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(jh0Var, property3, f16));
                    this.h.addListener(new r3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView2.setVisibility(0);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    jh0Var.setVisibility(4);
                    jh0Var.setAlpha(0.0f);
                    jh0Var.setScaleX(0.0f);
                    jh0Var.setScaleY(0.0f);
                    return;
                } else {
                    jh0Var.setVisibility(0);
                    jh0Var.setAlpha(1.0f);
                    jh0Var.setScaleX(1.0f);
                    jh0Var.setScaleY(1.0f);
                    textView2.setVisibility(4);
                    textView2.setAlpha(0.0f);
                    textView2.setScaleX(0.0f);
                    textView2.setScaleY(0.0f);
                    return;
                }
            }
            jh0Var.setVisibility(8);
        }
    }

    public final void d() {
        if (this.f25257a) {
            int i9 = org.telegram.ui.ActionBar.f6.Nh;
            org.telegram.ui.ActionBar.b6 b6Var = this.E;
            int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
            jh0 jh0Var = this.d;
            jh0Var.setProgressColor(v02);
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
            org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Qh, b6Var);
            jh0Var.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{14.0f}, v03));
        }
        e();
        f();
    }

    public final void e() {
        if (this.A != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f25261f.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23229q6, this.E));
                int i9 = this.f25267y;
                spannableStringBuilder.setSpan(foregroundColorSpan, i9, this.A + i9, 33);
            } catch (Exception unused) {
            }
            this.f25258b.setText(spannableStringBuilder);
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.b6 b6Var = this.E;
        if (this.B != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.B);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23229q6, b6Var)), 0, this.C, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.We, b6Var)), this.C, this.B.length(), 33);
            } catch (Exception unused) {
            }
            this.f25259c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f25261f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.v;
        org.telegram.ui.ActionBar.b6 b6Var = this.E;
        if (z10 || this.D != 0.0f) {
            if (z10) {
                float f10 = this.D;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.16f;
                    this.D = f11;
                    if (f11 > 1.0f) {
                        this.D = 1.0f;
                    } else {
                        invalidate();
                    }
                    int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Th, b6Var);
                    Paint paint = this.f25266x;
                    paint.setColor(v02);
                    canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f25258b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.D, paint);
                }
            }
            if (!z10) {
                float f12 = this.D;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.16f;
                    this.D = f13;
                    if (f13 < 0.0f) {
                        this.D = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int v022 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Th, b6Var);
            Paint paint2 = this.f25266x;
            paint2.setColor(v022);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f25258b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.D, paint2);
        }
        if (this.f25262n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var));
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.f25257a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.f25260e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = j3.r0.d(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.f25258b, i9, measuredWidth, i10, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f25257a) {
            this.f25264s = true;
            this.d.setOnClickListener(onClickListener);
            this.f25260e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f25262n = z10;
    }
}
