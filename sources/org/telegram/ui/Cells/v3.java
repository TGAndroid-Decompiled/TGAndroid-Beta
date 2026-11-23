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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.og0;
public final class v3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public float I;
    public final org.telegram.ui.ActionBar.i6 J;
    public boolean K;
    public int L;
    public int M;
    public final boolean f32236a;
    public final TextView f32237b;
    public final TextView f32238c;
    public final og0 d;
    public final TextView f32239e;
    public TLRPC.StickerSetCovered f32240f;
    public AnimatorSet h;
    public boolean f32241n;
    public boolean f32242r;
    public boolean f32243s;
    public boolean f32244w;
    public final int f32245x;
    public final Paint f32246y;

    public v3(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d2;
        ViewGroup.LayoutParams d10;
        ViewGroup.LayoutParams d11;
        this.f32245x = i10.f24637t0;
        this.f32246y = new Paint(1);
        this.f32236a = z11;
        this.J = i6Var;
        TextView textView = new TextView(context);
        this.f32237b = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.Kf, i6Var, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            d = c8.na.i(-2.0f, -2.0f, 8388659, i7, 8.0f, 40.0f, 0.0f);
        } else {
            d = c8.na.d(-2, -2.0f, 51, i7, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.f32238c = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Of, i6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z10) {
            d2 = c8.na.i(-2.0f, -2.0f, 8388659, i7, 30.0f, 100.0f, 0.0f);
        } else {
            d2 = c8.na.d(-2, -2.0f, 51, i7, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d2);
        if (z11) {
            og0 og0Var = new og0(context);
            this.d = og0Var;
            org.telegram.ui.ActionBar.u6.U(og0Var, org.telegram.ui.ActionBar.n6.Ji, i6Var);
            og0Var.setText(gd.N0(2131754483, null));
            if (z10) {
                d10 = c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d10 = c8.na.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(og0Var, d10);
            TextView textView3 = new TextView(context);
            this.f32239e = textView3;
            textView3.setGravity(17);
            org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.n6.Ii, i6Var, 1, 14.0f);
            textView3.setText(gd.N0(2131744614, null));
            if (z10) {
                d11 = c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d11 = c8.na.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d11);
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, org.telegram.ui.ActionBar.v6 v6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.Hi));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.f29691q6));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.Of));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ki));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f32236a) {
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
        if (this.f32240f != stickerSetCovered) {
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            this.I = f15;
            invalidate();
        }
        this.f32240f = stickerSetCovered;
        this.E = i7;
        this.F = i10;
        TextView textView = this.f32237b;
        if (i10 != 0) {
            if (i10 != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f32240f.set.title);
                try {
                    i00 i00Var = new i00(org.telegram.ui.ActionBar.n6.f29691q6, this.J);
                    int i11 = this.E;
                    spannableStringBuilder.setSpan(i00Var, i11, this.F + i11, 33);
                } catch (Exception unused) {
                }
                textView.setText(spannableStringBuilder);
            }
        } else {
            textView.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z14 = stickerSet.emojis;
        TextView textView2 = this.f32238c;
        if (z14) {
            textView2.setText(gd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(gd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        this.f32244w = z10;
        if (this.f32236a) {
            boolean z15 = this.f32243s;
            og0 og0Var = this.d;
            if (z15) {
                og0Var.setVisibility(0);
                if (!z12 && !ri.d0(this.f32245x).E0(stickerSetCovered.set.f28519id, true)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f32242r = z13;
                TextView textView3 = this.f32239e;
                if (z11) {
                    if (z13) {
                        textView3.setVisibility(0);
                    } else {
                        og0Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.f32242r) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr = {f10};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView3, property, fArr);
                    if (this.f32242r) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr2 = {f11};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, fArr2);
                    if (this.f32242r) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    float[] fArr3 = {f12};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView3, property3, fArr3);
                    if (this.f32242r) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(og0Var, property, f13);
                    if (this.f32242r) {
                        f14 = 0.0f;
                    } else {
                        f14 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(og0Var, property2, f14);
                    if (!this.f32242r) {
                        f16 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(og0Var, property3, f16));
                    this.h.addListener(new t3(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z13) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    og0Var.setVisibility(4);
                    og0Var.setAlpha(0.0f);
                    og0Var.setScaleX(0.0f);
                    og0Var.setScaleY(0.0f);
                    return;
                } else {
                    og0Var.setVisibility(0);
                    og0Var.setAlpha(1.0f);
                    og0Var.setScaleX(1.0f);
                    og0Var.setScaleY(1.0f);
                    textView3.setVisibility(4);
                    textView3.setAlpha(0.0f);
                    textView3.setScaleX(0.0f);
                    textView3.setScaleY(0.0f);
                    return;
                }
            }
            og0Var.setVisibility(8);
        }
    }

    public final void d(int i7, CharSequence charSequence) {
        this.G = charSequence;
        this.H = i7;
        org.telegram.ui.ActionBar.i6 i6Var = this.J;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.G);
            try {
                spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.f29691q6, i6Var), 0, this.H, 33);
                spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.Of, i6Var), this.H, this.G.length(), 33);
            } catch (Exception unused) {
            }
            this.f32238c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f32240f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f32244w;
        org.telegram.ui.ActionBar.i6 i6Var = this.J;
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
                    int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ki, i6Var);
                    Paint paint = this.f32246y;
                    paint.setColor(w02);
                    canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.f32237b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.I, paint);
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
            int w022 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ki, i6Var);
            Paint paint2 = this.f32246y;
            paint2.setColor(w022);
            canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.f32237b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.I, paint2);
        }
        if (this.f32241n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.n6.W0("paintDivider", i6Var));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        if (this.f32236a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.f32239e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = i5.c.e(measuredWidth, measuredWidth2, 2, org.telegram.messenger.g0.L(14.0f));
            } else {
                layoutParams.rightMargin = org.telegram.messenger.g0.L(14.0f);
            }
            measureChildWithMargins(this.f32237b, i7, measuredWidth, i10, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.f32236a) {
            this.f32243s = true;
            this.d.setOnClickListener(onClickListener);
            this.f32239e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f32241n = z10;
    }

    @Override
    public final void updateColors() {
        og0 og0Var;
        if (this.f32236a && (og0Var = this.d) != null) {
            int i7 = org.telegram.ui.ActionBar.n6.Ei;
            org.telegram.ui.ActionBar.i6 i6Var = this.J;
            og0Var.setProgressColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Hi, i6Var);
            if (!this.K || this.L != w02 || this.M != w03) {
                this.K = true;
                this.L = w02;
                this.M = w03;
                og0Var.setBackground(org.telegram.ui.ActionBar.b6.e(w02, 14.0f));
            }
            og0Var.invalidate();
        }
        TextView textView = this.f32237b;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f32238c;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }
}
