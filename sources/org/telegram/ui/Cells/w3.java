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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.l00;
public final class w3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public CharSequence F;
    public int G;
    public float H;
    public final org.telegram.ui.ActionBar.p6 I;
    public boolean J;
    public int K;
    public int L;
    public final boolean f23381a;
    public final TextView f23382b;
    public final TextView f23383c;
    public final ch0 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f23384f;
    public AnimatorSet h;
    public boolean f23385n;
    public boolean f23386r;
    public boolean f23387s;
    public boolean f23388w;
    public final int f23389x;
    public final Paint f23390y;

    public w3(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        ViewGroup.LayoutParams d12;
        this.f23389x = d20.f15147s0;
        this.f23390y = new Paint(1);
        this.f23381a = z11;
        this.I = p6Var;
        TextView textView = new TextView(context);
        this.f23382b = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.Hf, p6Var, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            d = w7.b6.i(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f);
        } else {
            d = w7.b6.d(-2, -2.0f, 51, i10, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.f23383c = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Lf, p6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            d10 = w7.b6.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f);
        } else {
            d10 = w7.b6.d(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d10);
        if (z11) {
            ch0 ch0Var = new ch0(context);
            this.d = ch0Var;
            org.telegram.ui.ActionBar.a7.V(ch0Var, org.telegram.ui.ActionBar.t6.Gi, p6Var);
            ch0Var.setText(cd.L0(2131754486, null));
            if (z10) {
                d11 = w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = w7.b6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(ch0Var, d11);
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            org.telegram.messenger.m5.m(textView3, org.telegram.ui.ActionBar.t6.Fi, p6Var, 1, 14.0f);
            textView3.setText(cd.L0(2131744873, null));
            if (z10) {
                d12 = w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d12 = w7.b6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d12);
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, org.telegram.ui.ActionBar.b7 b7Var) {
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Lf));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Hi));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f23381a) {
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
        if (this.f23384f != stickerSetCovered) {
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            this.H = f14;
            invalidate();
        }
        this.f23384f = stickerSetCovered;
        this.D = i10;
        this.E = i11;
        TextView textView = this.f23382b;
        if (i11 != 0) {
            if (i11 != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f23384f.set.title);
                try {
                    l00 l00Var = new l00(org.telegram.ui.ActionBar.t6.q6, this.I);
                    int i12 = this.D;
                    spannableStringBuilder.setSpan(l00Var, i12, this.E + i12, 33);
                } catch (Exception unused) {
                }
                textView.setText(spannableStringBuilder);
            }
        } else {
            textView.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView2 = this.f23383c;
        if (z14) {
            textView2.setText(cd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(cd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        this.f23388w = z10;
        if (this.f23381a) {
            boolean z15 = this.f23387s;
            ch0 ch0Var = this.d;
            if (z15) {
                ch0Var.setVisibility(0);
                if (!z12 && !ui.b0(this.f23389x).B0(stickerSetCovered.set.f19820id, true)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f23386r = z13;
                TextView textView3 = this.e;
                if (z11) {
                    if (z13) {
                        textView3.setVisibility(0);
                    } else {
                        ch0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f23386r) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    float[] fArr = {f7};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView3, property, fArr);
                    if (this.f23386r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr2 = {f10};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, fArr2);
                    if (this.f23386r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr3 = {f11};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView3, property3, fArr3);
                    if (this.f23386r) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ch0Var, property, f12);
                    if (this.f23386r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ch0Var, property2, f13);
                    if (!this.f23386r) {
                        f15 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(ch0Var, property3, f15));
                    this.h.addListener(new u3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    ch0Var.setVisibility(4);
                    ch0Var.setAlpha(0.0f);
                    ch0Var.setScaleX(0.0f);
                    ch0Var.setScaleY(0.0f);
                    return;
                } else {
                    ch0Var.setVisibility(0);
                    ch0Var.setAlpha(1.0f);
                    ch0Var.setScaleX(1.0f);
                    ch0Var.setScaleY(1.0f);
                    textView3.setVisibility(4);
                    textView3.setAlpha(0.0f);
                    textView3.setScaleX(0.0f);
                    textView3.setScaleY(0.0f);
                    return;
                }
            }
            ch0Var.setVisibility(8);
        }
    }

    public final void d(int i10, CharSequence charSequence) {
        this.F = charSequence;
        this.G = i10;
        org.telegram.ui.ActionBar.p6 p6Var = this.I;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F);
            try {
                spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.q6, p6Var), 0, this.G, 33);
                spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.Lf, p6Var), this.G, this.F.length(), 33);
            } catch (Exception unused) {
            }
            this.f23383c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f23384f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f23388w;
        org.telegram.ui.ActionBar.p6 p6Var = this.I;
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
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Hi, p6Var);
                    Paint paint = this.f23390y;
                    paint.setColor(w02);
                    canvas.drawCircle(org.telegram.messenger.i0.L(12.0f) + this.f23382b.getRight(), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(4.0f) * this.H, paint);
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
            int w022 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Hi, p6Var);
            Paint paint2 = this.f23390y;
            paint2.setColor(w022);
            canvas.drawCircle(org.telegram.messenger.i0.L(12.0f) + this.f23382b.getRight(), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(4.0f) * this.H, paint2);
        }
        if (this.f23385n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824));
        if (this.f23381a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = i0.a.u(measuredWidth, measuredWidth2, 2, org.telegram.messenger.i0.L(14.0f));
            } else {
                layoutParams.rightMargin = org.telegram.messenger.i0.L(14.0f);
            }
            measureChildWithMargins(this.f23382b, i10, measuredWidth, i11, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f23381a) {
            this.f23387s = true;
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f23385n = z10;
    }

    @Override
    public final void updateColors() {
        ch0 ch0Var;
        if (this.f23381a && (ch0Var = this.d) != null) {
            int i10 = org.telegram.ui.ActionBar.t6.Bi;
            org.telegram.ui.ActionBar.p6 p6Var = this.I;
            ch0Var.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ei, p6Var);
            if (!this.J || this.K != w02 || this.L != w03) {
                this.J = true;
                this.K = w02;
                this.L = w03;
                ch0Var.setBackground(org.telegram.ui.ActionBar.j6.e(w02, 14.0f));
            }
            ch0Var.invalidate();
        }
        TextView textView = this.f23382b;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f23383c;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }
}
