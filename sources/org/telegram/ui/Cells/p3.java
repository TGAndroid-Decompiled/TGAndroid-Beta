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
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.zk0;

public final class p3 extends FrameLayout {
    public int A;
    public CharSequence B;
    public int C;
    public float D;
    public final org.telegram.ui.ActionBar.c6 E;

    public final boolean f24969a;

    public final TextView f24970b;

    public final TextView f24971c;
    public final lh0 d;

    public final TextView f24972e;

    public TLRPC.StickerSetCovered f24973f;
    public AnimatorSet h;

    public boolean f24974n;

    public boolean f24975r;

    public boolean f24976s;
    public boolean v;

    public final int f24977w;

    public final Paint f24978x;

    public int f24979y;

    public p3(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f24977w = UserConfig.selectedAccount;
        this.f24978x = new Paint(1);
        this.f24969a = z11;
        this.E = c6Var;
        TextView textView = new TextView(context);
        this.f24970b = textView;
        rl.w(org.telegram.ui.ActionBar.g6.Se, c6Var, textView, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        addView(textView, z10 ? h7.z5.i(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f) : h7.z5.d(-2, -2.0f, 51, i10, 8.0f, 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24971c = textView2;
        rl.l(org.telegram.ui.ActionBar.g6.We, c6Var, textView2, 1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        addView(textView2, z10 ? h7.z5.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f) : h7.z5.d(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f));
        if (z11) {
            lh0 lh0Var = new lh0(context);
            this.d = lh0Var;
            lh0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
            lh0Var.setText(LocaleController.getString(R.string.Add));
            addView(lh0Var, z10 ? h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : h7.z5.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.f24972e = textView3;
            textView3.setGravity(17);
            rl.w(org.telegram.ui.ActionBar.g6.Rh, c6Var, textView3, 1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            addView(textView3, z10 ? h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : h7.z5.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
        }
        setWillNotDraw(false);
        d();
    }

    public static void a(ArrayList arrayList, zk0 zk0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 4, new Class[]{p3.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Se));
        int i10 = org.telegram.ui.ActionBar.g6.We;
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 4, new Class[]{p3.class}, new String[]{"infoTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 4, new Class[]{p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 4, new Class[]{p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{p3.class}, null, null, null, org.telegram.ui.ActionBar.g6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{p3.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i10));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f24969a) {
            this.d.a(z10, z11);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (this.f24973f != stickerSetCovered) {
            this.D = z10 ? 1.0f : 0.0f;
            invalidate();
        }
        this.f24973f = stickerSetCovered;
        this.f24979y = i10;
        this.A = i11;
        if (i11 != 0) {
            e();
        } else {
            this.f24970b.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z13 = stickerSet.emojis;
        TextView textView = this.f24971c;
        if (z13) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z10;
        if (this.f24969a) {
            boolean z14 = this.f24976s;
            lh0 lh0Var = this.d;
            if (!z14) {
                lh0Var.setVisibility(8);
                return;
            }
            lh0Var.setVisibility(0);
            boolean z15 = z12 || MediaDataController.getInstance(this.f24977w).isStickerPackInstalled(stickerSetCovered.set.f22407id);
            this.f24975r = z15;
            TextView textView2 = this.f24972e;
            if (!z11) {
                if (z15) {
                    textView2.setVisibility(0);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    lh0Var.setVisibility(4);
                    lh0Var.setAlpha(0.0f);
                    lh0Var.setScaleX(0.0f);
                    lh0Var.setScaleY(0.0f);
                    return;
                }
                lh0Var.setVisibility(0);
                lh0Var.setAlpha(1.0f);
                lh0Var.setScaleX(1.0f);
                lh0Var.setScaleY(1.0f);
                textView2.setVisibility(4);
                textView2.setAlpha(0.0f);
                textView2.setScaleX(0.0f);
                textView2.setScaleY(0.0f);
                return;
            }
            if (z15) {
                textView2.setVisibility(0);
            } else {
                lh0Var.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.h = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.h;
            float[] fArr = {this.f24975r ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr);
            float[] fArr2 = {this.f24975r ? 1.0f : 0.0f};
            Property property2 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr2);
            float[] fArr3 = {this.f24975r ? 1.0f : 0.0f};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(lh0Var, (Property<lh0, Float>) property, this.f24975r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(lh0Var, (Property<lh0, Float>) property2, this.f24975r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(lh0Var, (Property<lh0, Float>) property3, this.f24975r ? 0.0f : 1.0f));
            this.h.addListener(new o3(this));
            this.h.setInterpolator(new OvershootInterpolator(1.02f));
            this.h.start();
        }
    }

    public final void d() {
        if (this.f24969a) {
            int i10 = org.telegram.ui.ActionBar.g6.Nh;
            org.telegram.ui.ActionBar.c6 c6Var = this.E;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            lh0 lh0Var = this.d;
            lh0Var.setProgressColor(iV0);
            int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
            org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
            lh0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, iV1));
        }
        e();
        f();
    }

    public final void e() {
        if (this.A != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24973f.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, this.E));
                int i10 = this.f24979y;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.A + i10, 33);
            } catch (Exception unused) {
            }
            this.f24970b.setText(spannableStringBuilder);
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.c6 c6Var = this.E;
        if (this.B != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.B);
            try {
                spannableStringBuilder.setSpan(new bq(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var)), 0, this.C, 33);
                spannableStringBuilder.setSpan(new bq(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.We, c6Var)), this.C, this.B.length(), 33);
            } catch (Exception unused) {
            }
            this.f24971c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f24973f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10 = this.v;
        org.telegram.ui.ActionBar.c6 c6Var = this.E;
        if (z10 || this.D != 0.0f) {
            if (z10) {
                float f12 = this.D;
                if (f12 != 1.0f) {
                    float f13 = f12 + 0.16f;
                    this.D = f13;
                    if (f13 > 1.0f) {
                        this.D = 1.0f;
                    } else {
                        invalidate();
                    }
                } else if (!z10) {
                    f10 = this.D;
                    if (f10 != 0.0f) {
                        f11 = f10 - 0.16f;
                        this.D = f11;
                        if (f11 < 0.0f) {
                            this.D = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            } else if (!z10) {
                f10 = this.D;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.16f;
                    this.D = f11;
                    if (f11 < 0.0f) {
                        this.D = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Th, c6Var);
            Paint paint = this.f24978x;
            paint.setColor(iV0);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f24970b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.D, paint);
        }
        if (this.f24974n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.f24969a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.f24972e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = i0.a.B(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.f24970b, i10, measuredWidth, i11, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f24969a) {
            this.f24976s = true;
            this.d.setOnClickListener(onClickListener);
            this.f24972e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f24974n = z10;
    }
}
