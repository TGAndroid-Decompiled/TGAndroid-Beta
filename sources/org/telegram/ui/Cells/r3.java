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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.xh0;
public final class r3 extends FrameLayout {
    public int E;
    public CharSequence F;
    public int G;
    public float H;
    public final org.telegram.ui.ActionBar.f6 I;
    public final boolean f22665a;
    public final TextView f22666b;
    public final TextView f22667c;
    public final xh0 d;
    public final TextView f22668e;
    public TLRPC.StickerSetCovered f22669f;
    public AnimatorSet h;
    public boolean f22670n;
    public boolean f22671r;
    public boolean f22672s;
    public boolean v;
    public final int f22673w;
    public final Paint f22674x;
    public int f22675y;

    public r3(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        ViewGroup.LayoutParams d12;
        this.f22673w = UserConfig.selectedAccount;
        this.f22674x = new Paint(1);
        this.f22665a = z11;
        this.I = f6Var;
        TextView textView = new TextView(context);
        this.f22666b = textView;
        wl.x(org.telegram.ui.ActionBar.j6.Se, f6Var, textView, 1, 17.0f);
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
        this.f22667c = textView2;
        wl.n(org.telegram.ui.ActionBar.j6.We, f6Var, textView2, 1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            d10 = w7.x5.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f);
        } else {
            d10 = w7.x5.d(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d10);
        if (z11) {
            xh0 xh0Var = new xh0(context);
            this.d = xh0Var;
            xh0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
            xh0Var.setText(LocaleController.getString(R.string.Add));
            if (z10) {
                d11 = w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = w7.x5.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(xh0Var, d11);
            TextView textView3 = new TextView(context);
            this.f22668e = textView3;
            textView3.setGravity(17);
            wl.x(org.telegram.ui.ActionBar.j6.Rh, f6Var, textView3, 1, 14.0f);
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

    public static void a(ArrayList arrayList, ll0 ll0Var, org.telegram.ui.ActionBar.k6 k6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 4, new Class[]{r3.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Se));
        int i10 = org.telegram.ui.ActionBar.j6.We;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 4, new Class[]{r3.class}, new String[]{"infoTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 4, new Class[]{r3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 4, new Class[]{r3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 0, new Class[]{r3.class}, null, null, null, org.telegram.ui.ActionBar.j6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 0, new Class[]{r3.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i10));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f22665a) {
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
        if (this.f22669f != stickerSetCovered) {
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            this.H = f14;
            invalidate();
        }
        this.f22669f = stickerSetCovered;
        this.f22675y = i10;
        this.E = i11;
        if (i11 != 0) {
            e();
        } else {
            this.f22666b.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView = this.f22667c;
        if (z14) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z10;
        if (this.f22665a) {
            boolean z15 = this.f22672s;
            xh0 xh0Var = this.d;
            if (z15) {
                xh0Var.setVisibility(0);
                if (!z12 && !MediaDataController.getInstance(this.f22673w).isStickerPackInstalled(stickerSetCovered.set.f19896id)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f22671r = z13;
                TextView textView2 = this.f22668e;
                if (z11) {
                    if (z13) {
                        textView2.setVisibility(0);
                    } else {
                        xh0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f22671r) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    float[] fArr = {f7};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
                    if (this.f22671r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr2 = {f10};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
                    if (this.f22671r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr3 = {f11};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
                    if (this.f22671r) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(xh0Var, property, f12);
                    if (this.f22671r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(xh0Var, property2, f13);
                    if (!this.f22671r) {
                        f15 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(xh0Var, property3, f15));
                    this.h.addListener(new q3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView2.setVisibility(0);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    xh0Var.setVisibility(4);
                    xh0Var.setAlpha(0.0f);
                    xh0Var.setScaleX(0.0f);
                    xh0Var.setScaleY(0.0f);
                    return;
                } else {
                    xh0Var.setVisibility(0);
                    xh0Var.setAlpha(1.0f);
                    xh0Var.setScaleX(1.0f);
                    xh0Var.setScaleY(1.0f);
                    textView2.setVisibility(4);
                    textView2.setAlpha(0.0f);
                    textView2.setScaleX(0.0f);
                    textView2.setScaleY(0.0f);
                    return;
                }
            }
            xh0Var.setVisibility(8);
        }
    }

    public final void d() {
        if (this.f22665a) {
            int i10 = org.telegram.ui.ActionBar.j6.Nh;
            org.telegram.ui.ActionBar.f6 f6Var = this.I;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            xh0 xh0Var = this.d;
            xh0Var.setProgressColor(v02);
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
            org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
            xh0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, v03));
        }
        e();
        f();
    }

    public final void e() {
        if (this.E != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22669f.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, this.I));
                int i10 = this.f22675y;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.E + i10, 33);
            } catch (Exception unused) {
            }
            this.f22666b.setText(spannableStringBuilder);
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.f6 f6Var = this.I;
        if (this.F != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, f6Var)), 0, this.G, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, f6Var)), this.G, this.F.length(), 33);
            } catch (Exception unused) {
            }
            this.f22667c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f22669f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.v;
        org.telegram.ui.ActionBar.f6 f6Var = this.I;
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
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Th, f6Var);
                    Paint paint = this.f22674x;
                    paint.setColor(v02);
                    canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f22666b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint);
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
            int v022 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Th, f6Var);
            Paint paint2 = this.f22674x;
            paint2.setColor(v022);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.f22666b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint2);
        }
        if (this.f22670n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.f22665a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.f22668e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = i2.g.C(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.f22666b, i10, measuredWidth, i11, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f22665a) {
            this.f22672s = true;
            this.d.setOnClickListener(onClickListener);
            this.f22668e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f22670n = z10;
    }
}
