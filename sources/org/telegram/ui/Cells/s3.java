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
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.yh0;
public final class s3 extends FrameLayout {
    public int E;
    public CharSequence F;
    public int G;
    public float H;
    public final org.telegram.ui.ActionBar.d6 I;
    public final boolean f20908a;
    public final TextView f20909b;
    public final TextView f20910c;
    public final yh0 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f20911f;
    public AnimatorSet h;
    public boolean f20912n;
    public boolean f20913r;
    public boolean f20914s;
    public boolean v;
    public final int f20915w;
    public final Paint f20916x;
    public int f20917y;

    public s3(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        ViewGroup.LayoutParams d12;
        this.f20915w = UserConfig.selectedAccount;
        this.f20916x = new Paint(1);
        this.f20908a = z11;
        this.I = d6Var;
        TextView textView = new TextView(context);
        this.f20909b = textView;
        q3.p(org.telegram.ui.ActionBar.h6.Se, d6Var, textView, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            d = w7.x5.i(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f);
        } else {
            d = w7.x5.d(-2, -2.0f, 51, i10, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.f20910c = textView2;
        ul.o(org.telegram.ui.ActionBar.h6.We, d6Var, textView2, 1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            d10 = w7.x5.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f);
        } else {
            d10 = w7.x5.d(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d10);
        if (z11) {
            yh0 yh0Var = new yh0(context);
            this.d = yh0Var;
            yh0Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
            yh0Var.setText(LocaleController.getString(R.string.Add));
            if (z10) {
                d11 = w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = w7.x5.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(yh0Var, d11);
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            q3.p(org.telegram.ui.ActionBar.h6.Rh, d6Var, textView3, 1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            if (z10) {
                d12 = w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d12 = w7.x5.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d12);
        }
        setWillNotDraw(false);
        d();
    }

    public static void a(ArrayList arrayList, ml0 ml0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.j6(ml0Var, 4, new Class[]{s3.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Se));
        int i10 = org.telegram.ui.ActionBar.h6.We;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ml0Var, 4, new Class[]{s3.class}, new String[]{"infoTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ml0Var, 4, new Class[]{s3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ml0Var, 4, new Class[]{s3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ml0Var, 0, new Class[]{s3.class}, null, null, null, org.telegram.ui.ActionBar.h6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ml0Var, 0, new Class[]{s3.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, i10));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f20908a) {
            this.d.a(z10, z11);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        boolean z13;
        float f7;
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
        if (this.f20911f != stickerSetCovered) {
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            this.H = f14;
            invalidate();
        }
        this.f20911f = stickerSetCovered;
        this.f20917y = i10;
        this.E = i11;
        if (i11 != 0) {
            e();
        } else {
            this.f20909b.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView = this.f20910c;
        if (z14) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z10;
        if (this.f20908a) {
            boolean z15 = this.f20914s;
            yh0 yh0Var = this.d;
            if (z15) {
                yh0Var.setVisibility(0);
                if (!z12 && !MediaDataController.getInstance(this.f20915w).isStickerPackInstalled(stickerSetCovered.set.f18110id)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f20913r = z13;
                TextView textView2 = this.e;
                if (z11) {
                    if (z13) {
                        textView2.setVisibility(0);
                    } else {
                        yh0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f20913r) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    float[] fArr = {f7};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
                    if (this.f20913r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr2 = {f10};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
                    if (this.f20913r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr3 = {f11};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
                    if (this.f20913r) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(yh0Var, property, f12);
                    if (this.f20913r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(yh0Var, property2, f13);
                    if (!this.f20913r) {
                        f15 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(yh0Var, property3, f15));
                    this.h.addListener(new r3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView2.setVisibility(0);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    yh0Var.setVisibility(4);
                    yh0Var.setAlpha(0.0f);
                    yh0Var.setScaleX(0.0f);
                    yh0Var.setScaleY(0.0f);
                    return;
                } else {
                    yh0Var.setVisibility(0);
                    yh0Var.setAlpha(1.0f);
                    yh0Var.setScaleX(1.0f);
                    yh0Var.setScaleY(1.0f);
                    textView2.setVisibility(4);
                    textView2.setAlpha(0.0f);
                    textView2.setScaleX(0.0f);
                    textView2.setScaleY(0.0f);
                    return;
                }
            }
            yh0Var.setVisibility(8);
        }
    }

    public final void d() {
        if (this.f20908a) {
            int i10 = org.telegram.ui.ActionBar.h6.Nh;
            org.telegram.ui.ActionBar.d6 d6Var = this.I;
            int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
            yh0 yh0Var = this.d;
            yh0Var.setProgressColor(v02);
            int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
            org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Qh, d6Var);
            yh0Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{14.0f}, v03));
        }
        e();
        f();
    }

    public final void e() {
        if (this.E != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f20911f.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q6, this.I));
                int i10 = this.f20917y;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.E + i10, 33);
            } catch (Exception unused) {
            }
            this.f20909b.setText(spannableStringBuilder);
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.d6 d6Var = this.I;
        if (this.F != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q6, d6Var)), 0, this.G, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.We, d6Var)), this.G, this.F.length(), 33);
            } catch (Exception unused) {
            }
            this.f20910c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f20911f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.v;
        org.telegram.ui.ActionBar.d6 d6Var = this.I;
        if (z10 || this.H != 0.0f) {
            if (z10) {
                float f7 = this.H;
                if (f7 != 1.0f) {
                    float f10 = f7 + 0.16f;
                    this.H = f10;
                    if (f10 > 1.0f) {
                        this.H = 1.0f;
                    } else {
                        invalidate();
                    }
                    int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Th, d6Var);
                    Paint paint = this.f20916x;
                    paint.setColor(v02);
                    canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f20909b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint);
                }
            }
            if (!z10) {
                float f11 = this.H;
                if (f11 != 0.0f) {
                    float f12 = f11 - 0.16f;
                    this.H = f12;
                    if (f12 < 0.0f) {
                        this.H = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int v022 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Th, d6Var);
            Paint paint2 = this.f20916x;
            paint2.setColor(v022);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f20909b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint2);
        }
        if (this.f20912n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.h6.T0("paintDivider", d6Var));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.f20908a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = hg.c.C(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.f20909b, i10, measuredWidth, i11, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f20908a) {
            this.f20914s = true;
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f20912n = z10;
    }
}
