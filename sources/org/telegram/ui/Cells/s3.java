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
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.yl0;
public final class s3 extends FrameLayout {
    public int E;
    public CharSequence F;
    public int G;
    public float H;
    public final org.telegram.ui.ActionBar.e6 I;
    public final boolean f21054a;
    public final TextView f21055b;
    public final TextView f21056c;
    public final ki0 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f21057f;
    public AnimatorSet h;
    public boolean f21058n;
    public boolean f21059r;
    public boolean f21060s;
    public boolean v;
    public final int f21061w;
    public final Paint f21062x;
    public int f21063y;

    public s3(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        ViewGroup.LayoutParams d12;
        this.f21061w = UserConfig.selectedAccount;
        this.f21062x = new Paint(1);
        this.f21054a = z11;
        this.I = e6Var;
        TextView textView = new TextView(context);
        this.f21055b = textView;
        c1.q(org.telegram.ui.ActionBar.i6.Se, e6Var, textView, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            d = w7.y5.i(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f);
        } else {
            d = w7.y5.d(-2, -2.0f, 51, i10, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.f21056c = textView2;
        qk.n(org.telegram.ui.ActionBar.i6.We, e6Var, textView2, 1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            d10 = w7.y5.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f);
        } else {
            d10 = w7.y5.d(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d10);
        if (z11) {
            ki0 ki0Var = new ki0(context);
            this.d = ki0Var;
            ki0Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
            ki0Var.setText(LocaleController.getString(R.string.Add));
            if (z10) {
                d11 = w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = w7.y5.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(ki0Var, d11);
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            c1.q(org.telegram.ui.ActionBar.i6.Rh, e6Var, textView3, 1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            if (z10) {
                d12 = w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d12 = w7.y5.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d12);
        }
        setWillNotDraw(false);
        d();
    }

    public static void a(ArrayList arrayList, yl0 yl0Var, org.telegram.ui.ActionBar.j6 j6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.k6(yl0Var, 4, new Class[]{s3.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Se));
        int i10 = org.telegram.ui.ActionBar.i6.We;
        arrayList.add(new org.telegram.ui.ActionBar.k6(yl0Var, 4, new Class[]{s3.class}, new String[]{"infoTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(yl0Var, 4, new Class[]{s3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(yl0Var, 4, new Class[]{s3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(yl0Var, 0, new Class[]{s3.class}, null, null, null, org.telegram.ui.ActionBar.i6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.k6(yl0Var, 0, new Class[]{s3.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i10));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f21054a) {
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
        if (this.f21057f != stickerSetCovered) {
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            this.H = f14;
            invalidate();
        }
        this.f21057f = stickerSetCovered;
        this.f21063y = i10;
        this.E = i11;
        if (i11 != 0) {
            e();
        } else {
            this.f21055b.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView = this.f21056c;
        if (z14) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z10;
        if (this.f21054a) {
            boolean z15 = this.f21060s;
            ki0 ki0Var = this.d;
            if (z15) {
                ki0Var.setVisibility(0);
                if (!z12 && !MediaDataController.getInstance(this.f21061w).isStickerPackInstalled(stickerSetCovered.set.f18356id)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f21059r = z13;
                TextView textView2 = this.e;
                if (z11) {
                    if (z13) {
                        textView2.setVisibility(0);
                    } else {
                        ki0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f21059r) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    float[] fArr = {f7};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
                    if (this.f21059r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr2 = {f10};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
                    if (this.f21059r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr3 = {f11};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
                    if (this.f21059r) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ki0Var, property, f12);
                    if (this.f21059r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ki0Var, property2, f13);
                    if (!this.f21059r) {
                        f15 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(ki0Var, property3, f15));
                    this.h.addListener(new r3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView2.setVisibility(0);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    ki0Var.setVisibility(4);
                    ki0Var.setAlpha(0.0f);
                    ki0Var.setScaleX(0.0f);
                    ki0Var.setScaleY(0.0f);
                    return;
                } else {
                    ki0Var.setVisibility(0);
                    ki0Var.setAlpha(1.0f);
                    ki0Var.setScaleX(1.0f);
                    ki0Var.setScaleY(1.0f);
                    textView2.setVisibility(4);
                    textView2.setAlpha(0.0f);
                    textView2.setScaleX(0.0f);
                    textView2.setScaleY(0.0f);
                    return;
                }
            }
            ki0Var.setVisibility(8);
        }
    }

    public final void d() {
        if (this.f21054a) {
            int i10 = org.telegram.ui.ActionBar.i6.Nh;
            org.telegram.ui.ActionBar.e6 e6Var = this.I;
            int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
            ki0 ki0Var = this.d;
            ki0Var.setProgressColor(v02);
            int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
            org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Qh, e6Var);
            ki0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, v03));
        }
        e();
        f();
    }

    public final void e() {
        if (this.E != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21057f.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q6, this.I));
                int i10 = this.f21063y;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.E + i10, 33);
            } catch (Exception unused) {
            }
            this.f21055b.setText(spannableStringBuilder);
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.e6 e6Var = this.I;
        if (this.F != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q6, e6Var)), 0, this.G, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.We, e6Var)), this.G, this.F.length(), 33);
            } catch (Exception unused) {
            }
            this.f21056c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f21057f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.v;
        org.telegram.ui.ActionBar.e6 e6Var = this.I;
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
                    int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Th, e6Var);
                    Paint paint = this.f21062x;
                    paint.setColor(v02);
                    canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f21055b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint);
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
            int v022 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Th, e6Var);
            Paint paint2 = this.f21062x;
            paint2.setColor(v022);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f21055b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint2);
        }
        if (this.f21058n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.i6.T0("paintDivider", e6Var));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.f21054a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = hg.k0.z(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.f21055b, i10, measuredWidth, i11, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f21054a) {
            this.f21060s = true;
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f21058n = z10;
    }
}
