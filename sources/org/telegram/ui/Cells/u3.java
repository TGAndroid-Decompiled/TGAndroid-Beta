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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.yz;
public final class u3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int D;
    public int E;
    public CharSequence F;
    public int G;
    public float H;
    public final org.telegram.ui.ActionBar.g6 I;
    public boolean J;
    public int K;
    public int L;
    public final boolean f30570a;
    public final TextView f30571b;
    public final TextView f30572c;
    public final bg0 d;
    public final TextView f30573e;
    public TLRPC.StickerSetCovered f30574f;
    public AnimatorSet h;
    public boolean f30575n;
    public boolean f30576r;
    public boolean f30577s;
    public boolean f30578w;
    public final int f30579x;
    public final Paint f30580y;

    public u3(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, boolean z10) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d2;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        this.f30579x = p10.f24470s0;
        this.f30580y = new Paint(1);
        this.f30570a = z10;
        this.I = g6Var;
        TextView textView = new TextView(context);
        this.f30571b = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.l6.Hf, g6Var, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z9) {
            d = c8.ha.i(-2.0f, -2.0f, 8388659, i7, 8.0f, 40.0f, 0.0f);
        } else {
            d = c8.ha.d(-2, -2.0f, 51, i7, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.f30572c = textView2;
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.Lf, g6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z9) {
            d2 = c8.ha.i(-2.0f, -2.0f, 8388659, i7, 30.0f, 100.0f, 0.0f);
        } else {
            d2 = c8.ha.d(-2, -2.0f, 51, i7, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d2);
        if (z10) {
            bg0 bg0Var = new bg0(context);
            this.d = bg0Var;
            org.telegram.ui.ActionBar.s6.U(bg0Var, org.telegram.ui.ActionBar.l6.Gi, g6Var);
            bg0Var.setText(id.M0(2131754486, null));
            if (z9) {
                d10 = c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d10 = c8.ha.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(bg0Var, d10);
            TextView textView3 = new TextView(context);
            this.f30573e = textView3;
            textView3.setGravity(17);
            org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.l6.Fi, g6Var, 1, 14.0f);
            textView3.setText(id.M0(2131744855, null));
            if (z9) {
                d11 = c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = c8.ha.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d11);
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, org.telegram.ui.ActionBar.t6 t6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.f28105q6));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.Lf));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Hi));
    }

    public final void b(boolean z9, boolean z10) {
        if (this.f30570a) {
            this.d.a(z9, z10);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z9, boolean z10, int i7, int i10, boolean z11) {
        boolean z12;
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
        if (this.f30574f != stickerSetCovered) {
            if (z9) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            this.H = f15;
            invalidate();
        }
        this.f30574f = stickerSetCovered;
        this.D = i7;
        this.E = i10;
        TextView textView = this.f30571b;
        if (i10 != 0) {
            if (i10 != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f30574f.set.title);
                try {
                    yz yzVar = new yz(org.telegram.ui.ActionBar.l6.f28105q6, this.I);
                    int i11 = this.D;
                    spannableStringBuilder.setSpan(yzVar, i11, this.E + i11, 33);
                } catch (Exception unused) {
                }
                textView.setText(spannableStringBuilder);
            }
        } else {
            textView.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z13 = stickerSet.emojis;
        TextView textView2 = this.f30572c;
        if (z13) {
            textView2.setText(id.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(id.G(stickerSet.count, "Stickers", new Object[0]));
        }
        this.f30578w = z9;
        if (this.f30570a) {
            boolean z14 = this.f30577s;
            bg0 bg0Var = this.d;
            if (z14) {
                bg0Var.setVisibility(0);
                if (!z11 && !ui.b0(this.f30579x).B0(stickerSetCovered.set.f26983id, true)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                this.f30576r = z12;
                TextView textView3 = this.f30573e;
                if (z10) {
                    if (z12) {
                        textView3.setVisibility(0);
                    } else {
                        bg0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f30576r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr = {f10};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView3, property, fArr);
                    if (this.f30576r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr2 = {f11};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, fArr2);
                    if (this.f30576r) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    float[] fArr3 = {f12};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView3, property3, fArr3);
                    if (this.f30576r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bg0Var, property, f13);
                    if (this.f30576r) {
                        f14 = 0.0f;
                    } else {
                        f14 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(bg0Var, property2, f14);
                    if (!this.f30576r) {
                        f16 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(bg0Var, property3, f16));
                    this.h.addListener(new s3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z12) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    bg0Var.setVisibility(4);
                    bg0Var.setAlpha(0.0f);
                    bg0Var.setScaleX(0.0f);
                    bg0Var.setScaleY(0.0f);
                    return;
                } else {
                    bg0Var.setVisibility(0);
                    bg0Var.setAlpha(1.0f);
                    bg0Var.setScaleX(1.0f);
                    bg0Var.setScaleY(1.0f);
                    textView3.setVisibility(4);
                    textView3.setAlpha(0.0f);
                    textView3.setScaleX(0.0f);
                    textView3.setScaleY(0.0f);
                    return;
                }
            }
            bg0Var.setVisibility(8);
        }
    }

    public final void d(int i7, CharSequence charSequence) {
        this.F = charSequence;
        this.G = i7;
        org.telegram.ui.ActionBar.g6 g6Var = this.I;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F);
            try {
                spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.l6.f28105q6, g6Var), 0, this.G, 33);
                spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.l6.Lf, g6Var), this.G, this.F.length(), 33);
            } catch (Exception unused) {
            }
            this.f30572c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f30574f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9 = this.f30578w;
        org.telegram.ui.ActionBar.g6 g6Var = this.I;
        if (z9 || this.H != 0.0f) {
            if (z9) {
                float f10 = this.H;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.16f;
                    this.H = f11;
                    if (f11 > 1.0f) {
                        this.H = 1.0f;
                    } else {
                        invalidate();
                    }
                    int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Hi, g6Var);
                    Paint paint = this.f30580y;
                    paint.setColor(w02);
                    canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.f30571b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.H, paint);
                }
            }
            if (!z9) {
                float f12 = this.H;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.16f;
                    this.H = f13;
                    if (f13 < 0.0f) {
                        this.H = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int w022 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Hi, g6Var);
            Paint paint2 = this.f30580y;
            paint2.setColor(w022);
            canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.f30571b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.H, paint2);
        }
        if (this.f30575n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.l6.W0("paintDivider", g6Var));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        if (this.f30570a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.f30573e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = jg.g.D(measuredWidth, measuredWidth2, 2, org.telegram.messenger.g0.L(14.0f));
            } else {
                layoutParams.rightMargin = org.telegram.messenger.g0.L(14.0f);
            }
            measureChildWithMargins(this.f30571b, i7, measuredWidth, i10, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f30570a) {
            this.f30577s = true;
            this.d.setOnClickListener(onClickListener);
            this.f30573e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z9) {
        this.f30575n = z9;
    }

    @Override
    public final void updateColors() {
        bg0 bg0Var;
        if (this.f30570a && (bg0Var = this.d) != null) {
            int i7 = org.telegram.ui.ActionBar.l6.Bi;
            org.telegram.ui.ActionBar.g6 g6Var = this.I;
            bg0Var.setProgressColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var);
            int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ei, g6Var);
            if (!this.J || this.K != w02 || this.L != w03) {
                this.J = true;
                this.K = w02;
                this.L = w03;
                bg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(w02, 14.0f));
            }
            bg0Var.invalidate();
        }
        TextView textView = this.f30571b;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f30572c;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }
}
