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
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.pg0;
public final class v3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public float I;
    public final org.telegram.ui.ActionBar.h6 J;
    public boolean K;
    public int L;
    public int M;
    public final boolean f32187a;
    public final TextView f32188b;
    public final TextView f32189c;
    public final pg0 d;
    public final TextView f32190e;
    public TLRPC.StickerSetCovered f32191f;
    public AnimatorSet h;
    public boolean f32192n;
    public boolean f32193r;
    public boolean f32194s;
    public boolean f32195w;
    public final int f32196x;
    public final Paint f32197y;

    public v3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d2;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        this.f32196x = k10.f24968t0;
        this.f32197y = new Paint(1);
        this.f32187a = z11;
        this.J = h6Var;
        TextView textView = new TextView(context);
        this.f32188b = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.Kf, h6Var, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            d = c8.ma.i(-2.0f, -2.0f, 8388659, i7, 8.0f, 40.0f, 0.0f);
        } else {
            d = c8.ma.d(-2, -2.0f, 51, i7, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.f32189c = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Of, h6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            d2 = c8.ma.i(-2.0f, -2.0f, 8388659, i7, 30.0f, 100.0f, 0.0f);
        } else {
            d2 = c8.ma.d(-2, -2.0f, 51, i7, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d2);
        if (z11) {
            pg0 pg0Var = new pg0(context);
            this.d = pg0Var;
            org.telegram.ui.ActionBar.t6.U(pg0Var, org.telegram.ui.ActionBar.m6.Ji, h6Var);
            pg0Var.setText(hd.N0(2131754483, null));
            if (z10) {
                d10 = c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d10 = c8.ma.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(pg0Var, d10);
            TextView textView3 = new TextView(context);
            this.f32190e = textView3;
            textView3.setGravity(17);
            org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.m6.Ii, h6Var, 1, 14.0f);
            textView3.setText(hd.N0(2131744612, null));
            if (z10) {
                d11 = c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = c8.ma.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d11);
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.Hi));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.f29621q6));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.Of));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ki));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f32187a) {
            this.d.a(z10, z11);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, int i7, int i10, boolean z12) {
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
        if (this.f32191f != stickerSetCovered) {
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            this.I = f15;
            invalidate();
        }
        this.f32191f = stickerSetCovered;
        this.E = i7;
        this.F = i10;
        TextView textView = this.f32188b;
        if (i10 != 0) {
            if (i10 != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f32191f.set.title);
                try {
                    k00 k00Var = new k00(org.telegram.ui.ActionBar.m6.f29621q6, this.J);
                    int i11 = this.E;
                    spannableStringBuilder.setSpan(k00Var, i11, this.F + i11, 33);
                } catch (Exception unused) {
                }
                textView.setText(spannableStringBuilder);
            }
        } else {
            textView.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView2 = this.f32189c;
        if (z14) {
            textView2.setText(hd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(hd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        this.f32195w = z10;
        if (this.f32187a) {
            boolean z15 = this.f32194s;
            pg0 pg0Var = this.d;
            if (z15) {
                pg0Var.setVisibility(0);
                if (!z12 && !si.d0(this.f32196x).E0(stickerSetCovered.set.f28461id, true)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f32193r = z13;
                TextView textView3 = this.f32190e;
                if (z11) {
                    if (z13) {
                        textView3.setVisibility(0);
                    } else {
                        pg0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f32193r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr = {f10};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView3, property, fArr);
                    if (this.f32193r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr2 = {f11};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, fArr2);
                    if (this.f32193r) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    float[] fArr3 = {f12};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView3, property3, fArr3);
                    if (this.f32193r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pg0Var, property, f13);
                    if (this.f32193r) {
                        f14 = 0.0f;
                    } else {
                        f14 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(pg0Var, property2, f14);
                    if (!this.f32193r) {
                        f16 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(pg0Var, property3, f16));
                    this.h.addListener(new t3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    pg0Var.setVisibility(4);
                    pg0Var.setAlpha(0.0f);
                    pg0Var.setScaleX(0.0f);
                    pg0Var.setScaleY(0.0f);
                    return;
                } else {
                    pg0Var.setVisibility(0);
                    pg0Var.setAlpha(1.0f);
                    pg0Var.setScaleX(1.0f);
                    pg0Var.setScaleY(1.0f);
                    textView3.setVisibility(4);
                    textView3.setAlpha(0.0f);
                    textView3.setScaleX(0.0f);
                    textView3.setScaleY(0.0f);
                    return;
                }
            }
            pg0Var.setVisibility(8);
        }
    }

    public final void d(int i7, CharSequence charSequence) {
        this.G = charSequence;
        this.H = i7;
        org.telegram.ui.ActionBar.h6 h6Var = this.J;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.G);
            try {
                spannableStringBuilder.setSpan(new k00(org.telegram.ui.ActionBar.m6.f29621q6, h6Var), 0, this.H, 33);
                spannableStringBuilder.setSpan(new k00(org.telegram.ui.ActionBar.m6.Of, h6Var), this.H, this.G.length(), 33);
            } catch (Exception unused) {
            }
            this.f32189c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f32191f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f32195w;
        org.telegram.ui.ActionBar.h6 h6Var = this.J;
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
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ki, h6Var);
                    Paint paint = this.f32197y;
                    paint.setColor(w02);
                    canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.f32188b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.I, paint);
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
            int w022 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ki, h6Var);
            Paint paint2 = this.f32197y;
            paint2.setColor(w022);
            canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.f32188b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.I, paint2);
        }
        if (this.f32192n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        if (this.f32187a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.f32190e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = i5.c.e(measuredWidth, measuredWidth2, 2, org.telegram.messenger.g0.L(14.0f));
            } else {
                layoutParams.rightMargin = org.telegram.messenger.g0.L(14.0f);
            }
            measureChildWithMargins(this.f32188b, i7, measuredWidth, i10, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f32187a) {
            this.f32194s = true;
            this.d.setOnClickListener(onClickListener);
            this.f32190e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f32192n = z10;
    }

    @Override
    public final void updateColors() {
        pg0 pg0Var;
        if (this.f32187a && (pg0Var = this.d) != null) {
            int i7 = org.telegram.ui.ActionBar.m6.Ei;
            org.telegram.ui.ActionBar.h6 h6Var = this.J;
            pg0Var.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Hi, h6Var);
            if (!this.K || this.L != w02 || this.M != w03) {
                this.K = true;
                this.L = w02;
                this.M = w03;
                pg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(w02, 14.0f));
            }
            pg0Var.invalidate();
        }
        TextView textView = this.f32188b;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f32189c;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }
}
