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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.sm0;
public final class s3 extends FrameLayout {
    public int E;
    public CharSequence F;
    public int G;
    public float H;
    public final org.telegram.ui.ActionBar.d6 I;
    public final boolean f22889a;
    public final TextView f22890b;
    public final TextView f22891c;
    public final ej0 d;
    public final TextView f22892e;
    public TLRPC.StickerSetCovered f22893f;
    public AnimatorSet h;
    public boolean f22894n;
    public boolean f22895r;
    public boolean f22896s;
    public boolean v;
    public final int f22897w;
    public final Paint f22898x;
    public int f22899y;

    public s3(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams a2;
        ViewGroup.LayoutParams a10;
        ViewGroup.LayoutParams a11;
        ViewGroup.LayoutParams a12;
        this.f22897w = UserConfig.selectedAccount;
        this.f22898x = new Paint(1);
        this.f22889a = z11;
        this.I = d6Var;
        TextView textView = new TextView(context);
        this.f22890b = textView;
        c1.n(org.telegram.ui.ActionBar.h6.Se, d6Var, textView, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            a2 = w7.x5.i(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f);
        } else {
            a2 = w7.x5.a(-2.0f, i10, 8.0f, 40.0f, 0.0f, -2, 51);
        }
        addView(textView, a2);
        TextView textView2 = new TextView(context);
        this.f22891c = textView2;
        ai.o(org.telegram.ui.ActionBar.h6.We, d6Var, textView2, 1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            a10 = w7.x5.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f);
        } else {
            a10 = w7.x5.a(-2.0f, i10, 30.0f, 100.0f, 0.0f, -2, 51);
        }
        addView(textView2, a10);
        if (z11) {
            ej0 ej0Var = new ej0(context);
            this.d = ej0Var;
            ej0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
            ej0Var.setText(LocaleController.getString(R.string.Add));
            if (z10) {
                a11 = w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                a11 = w7.x5.a(28.0f, 0.0f, 16.0f, 14.0f, 0.0f, -2, 53);
            }
            addView(ej0Var, a11);
            TextView textView3 = new TextView(context);
            this.f22892e = textView3;
            textView3.setGravity(17);
            c1.n(org.telegram.ui.ActionBar.h6.Rh, d6Var, textView3, 1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            if (z10) {
                a12 = w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                a12 = w7.x5.a(28.0f, 0.0f, 16.0f, 14.0f, 0.0f, -2, 53);
            }
            addView(textView3, a12);
        }
        setWillNotDraw(false);
        d();
    }

    public static void a(ArrayList arrayList, sm0 sm0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.j6(sm0Var, 4, new Class[]{s3.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Se));
        int i10 = org.telegram.ui.ActionBar.h6.We;
        arrayList.add(new org.telegram.ui.ActionBar.j6(sm0Var, 4, new Class[]{s3.class}, new String[]{"infoTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sm0Var, 4, new Class[]{s3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sm0Var, 4, new Class[]{s3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sm0Var, 0, new Class[]{s3.class}, null, null, null, org.telegram.ui.ActionBar.h6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.j6(sm0Var, 0, new Class[]{s3.class}, org.telegram.ui.ActionBar.h6.f20908k0, null, null, org.telegram.ui.ActionBar.h6.f20787d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, i10));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f22889a) {
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
        if (this.f22893f != stickerSetCovered) {
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            this.H = f14;
            invalidate();
        }
        this.f22893f = stickerSetCovered;
        this.f22899y = i10;
        this.E = i11;
        if (i11 != 0) {
            e();
        } else {
            this.f22890b.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView = this.f22891c;
        if (z14) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z10;
        if (this.f22889a) {
            boolean z15 = this.f22896s;
            ej0 ej0Var = this.d;
            if (z15) {
                ej0Var.setVisibility(0);
                if (!z12 && !MediaDataController.getInstance(this.f22897w).isStickerPackInstalled(stickerSetCovered.set.f20059id)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f22895r = z13;
                TextView textView2 = this.f22892e;
                if (z11) {
                    if (z13) {
                        textView2.setVisibility(0);
                    } else {
                        ej0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f22895r) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    float[] fArr = {f7};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
                    if (this.f22895r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr2 = {f10};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
                    if (this.f22895r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr3 = {f11};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
                    if (this.f22895r) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ej0Var, property, f12);
                    if (this.f22895r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ej0Var, property2, f13);
                    if (!this.f22895r) {
                        f15 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(ej0Var, property3, f15));
                    this.h.addListener(new r3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView2.setVisibility(0);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    ej0Var.setVisibility(4);
                    ej0Var.setAlpha(0.0f);
                    ej0Var.setScaleX(0.0f);
                    ej0Var.setScaleY(0.0f);
                    return;
                } else {
                    ej0Var.setVisibility(0);
                    ej0Var.setAlpha(1.0f);
                    ej0Var.setScaleX(1.0f);
                    ej0Var.setScaleY(1.0f);
                    textView2.setVisibility(4);
                    textView2.setAlpha(0.0f);
                    textView2.setScaleX(0.0f);
                    textView2.setScaleY(0.0f);
                    return;
                }
            }
            ej0Var.setVisibility(8);
        }
    }

    public final void d() {
        if (this.f22889a) {
            int i10 = org.telegram.ui.ActionBar.h6.Nh;
            org.telegram.ui.ActionBar.d6 d6Var = this.I;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
            ej0 ej0Var = this.d;
            ej0Var.setProgressColor(w02);
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
            org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Qh, d6Var);
            ej0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w03));
        }
        e();
        f();
    }

    public final void e() {
        if (this.E != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22893f.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q6, this.I));
                int i10 = this.f22899y;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.E + i10, 33);
            } catch (Exception unused) {
            }
            this.f22890b.setText(spannableStringBuilder);
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.d6 d6Var = this.I;
        if (this.F != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q6, d6Var)), 0, this.G, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.We, d6Var)), this.G, this.F.length(), 33);
            } catch (Exception unused) {
            }
            this.f22891c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f22893f;
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
                    int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Th, d6Var);
                    Paint paint = this.f22898x;
                    paint.setColor(w02);
                    canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f22890b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint);
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
            int w022 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Th, d6Var);
            Paint paint2 = this.f22898x;
            paint2.setColor(w022);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f22890b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint2);
        }
        if (this.f22894n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.h6.U0("paintDivider", d6Var));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.f22889a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.f22892e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = hg.c.z(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.f22890b, i10, measuredWidth, i11, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f22889a) {
            this.f22896s = true;
            this.d.setOnClickListener(onClickListener);
            this.f22892e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f22894n = z10;
    }
}
