package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.tz;
public final class u3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public float I;
    public final org.telegram.ui.ActionBar.e6 J;
    public boolean K;
    public int L;
    public int M;
    public final boolean f30638a;
    public final TextView f30639b;
    public final TextView f30640c;
    public final dg0 d;
    public final TextView f30641e;
    public TLRPC.StickerSetCovered f30642f;
    public AnimatorSet h;
    public boolean f30643n;
    public boolean f30644r;
    public boolean f30645s;
    public boolean f30646w;
    public final int f30647x;
    public final Paint f30648y;

    public u3(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        ViewGroup.LayoutParams d12;
        this.f30647x = h10.f22829t0;
        this.f30648y = new Paint(1);
        this.f30638a = z11;
        this.J = e6Var;
        TextView textView = new TextView(context);
        this.f30639b = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.Hf, e6Var, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            d = mf.i(-2.0f, -2.0f, 8388659, i3, 8.0f, 40.0f, 0.0f);
        } else {
            d = mf.d(-2, -2.0f, 51, i3, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.f30640c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Lf, e6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            d10 = mf.i(-2.0f, -2.0f, 8388659, i3, 30.0f, 100.0f, 0.0f);
        } else {
            d10 = mf.d(-2, -2.0f, 51, i3, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d10);
        if (z11) {
            dg0 dg0Var = new dg0(context);
            this.d = dg0Var;
            org.telegram.ui.ActionBar.r6.V(dg0Var, org.telegram.ui.ActionBar.k6.Gi, e6Var);
            dg0Var.setText(bd.M0(2131754486, null));
            if (z10) {
                d11 = mf.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = mf.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(dg0Var, d11);
            TextView textView3 = new TextView(context);
            this.f30641e = textView3;
            textView3.setGravity(17);
            org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.k6.Fi, e6Var, 1, 14.0f);
            textView3.setText(bd.M0(2131744865, null));
            if (z10) {
                d12 = mf.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d12 = mf.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d12);
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, org.telegram.ui.ActionBar.s6 s6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.f28121q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Lf));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f30638a) {
            this.d.a(z10, z11);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, int i3, int i10, boolean z12) {
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
        if (this.f30642f != stickerSetCovered) {
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            this.I = f15;
            invalidate();
        }
        this.f30642f = stickerSetCovered;
        this.E = i3;
        this.F = i10;
        TextView textView = this.f30639b;
        if (i10 != 0) {
            if (i10 != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f30642f.set.title);
                try {
                    tz tzVar = new tz(org.telegram.ui.ActionBar.k6.f28121q6, this.J);
                    int i11 = this.E;
                    spannableStringBuilder.setSpan(tzVar, i11, this.F + i11, 33);
                } catch (Exception unused) {
                }
                textView.setText(spannableStringBuilder);
            }
        } else {
            textView.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView2 = this.f30640c;
        if (z14) {
            textView2.setText(bd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(bd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        this.f30646w = z10;
        if (this.f30638a) {
            boolean z15 = this.f30645s;
            dg0 dg0Var = this.d;
            if (z15) {
                dg0Var.setVisibility(0);
                if (!z12 && !li.b0(this.f30647x).B0(stickerSetCovered.set.f27028id, true)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f30644r = z13;
                TextView textView3 = this.f30641e;
                if (z11) {
                    if (z13) {
                        textView3.setVisibility(0);
                    } else {
                        dg0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f30644r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr = {f10};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView3, property, fArr);
                    if (this.f30644r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr2 = {f11};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, fArr2);
                    if (this.f30644r) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    float[] fArr3 = {f12};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView3, property3, fArr3);
                    if (this.f30644r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(dg0Var, property, f13);
                    if (this.f30644r) {
                        f14 = 0.0f;
                    } else {
                        f14 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dg0Var, property2, f14);
                    if (!this.f30644r) {
                        f16 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(dg0Var, property3, f16));
                    this.h.addListener(new s3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    dg0Var.setVisibility(4);
                    dg0Var.setAlpha(0.0f);
                    dg0Var.setScaleX(0.0f);
                    dg0Var.setScaleY(0.0f);
                    return;
                } else {
                    dg0Var.setVisibility(0);
                    dg0Var.setAlpha(1.0f);
                    dg0Var.setScaleX(1.0f);
                    dg0Var.setScaleY(1.0f);
                    textView3.setVisibility(4);
                    textView3.setAlpha(0.0f);
                    textView3.setScaleX(0.0f);
                    textView3.setScaleY(0.0f);
                    return;
                }
            }
            dg0Var.setVisibility(8);
        }
    }

    public final void d(int i3, CharSequence charSequence) {
        this.G = charSequence;
        this.H = i3;
        org.telegram.ui.ActionBar.e6 e6Var = this.J;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.G);
            try {
                spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.f28121q6, e6Var), 0, this.H, 33);
                spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.Lf, e6Var), this.H, this.G.length(), 33);
            } catch (Exception unused) {
            }
            this.f30640c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f30642f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f30646w;
        org.telegram.ui.ActionBar.e6 e6Var = this.J;
        if (z10 || this.I != 0.0f) {
            if (z10) {
                float f10 = this.I;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.16f;
                    this.I = f11;
                    if (f11 > 1.0f) {
                        this.I = 1.0f;
                    } else {
                        invalidate();
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Hi, e6Var);
                    Paint paint = this.f30648y;
                    paint.setColor(w02);
                    canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.f30639b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.I, paint);
                }
            }
            if (!z10) {
                float f12 = this.I;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.16f;
                    this.I = f13;
                    if (f13 < 0.0f) {
                        this.I = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int w022 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Hi, e6Var);
            Paint paint2 = this.f30648y;
            paint2.setColor(w022);
            canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.f30639b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.I, paint2);
        }
        if (this.f30643n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        if (this.f30638a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.f30641e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = k2.p1.e(measuredWidth, measuredWidth2, 2, org.telegram.messenger.g0.L(14.0f));
            } else {
                layoutParams.rightMargin = org.telegram.messenger.g0.L(14.0f);
            }
            measureChildWithMargins(this.f30639b, i3, measuredWidth, i10, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f30638a) {
            this.f30645s = true;
            this.d.setOnClickListener(onClickListener);
            this.f30641e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f30643n = z10;
    }

    @Override
    public final void updateColors() {
        dg0 dg0Var;
        if (this.f30638a && (dg0Var = this.d) != null) {
            int i3 = org.telegram.ui.ActionBar.k6.Bi;
            org.telegram.ui.ActionBar.e6 e6Var = this.J;
            dg0Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ei, e6Var);
            if (!this.K || this.L != w02 || this.M != w03) {
                this.K = true;
                this.L = w02;
                this.M = w03;
                dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(w02, 14.0f));
            }
            dg0Var.invalidate();
        }
        TextView textView = this.f30639b;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f30640c;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }
}
