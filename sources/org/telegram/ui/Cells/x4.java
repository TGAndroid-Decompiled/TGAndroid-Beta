package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.zz;
public final class x4 extends FrameLayout {
    public static zz f23572y;
    public final org.telegram.ui.Components.f6 f23573a;
    public final org.telegram.ui.Components.f6 f23574b;
    public final org.telegram.ui.Components.g9 f23575c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.p6 f23576f;
    public boolean h;
    public CharSequence f23577n;
    public String f23578r;
    public String f23579s;
    public float f23580w;
    public ValueAnimator f23581x;

    public x4(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f23580w = 0.0f;
        this.f23576f = p6Var;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f23575c = g9Var;
        ShapeDrawable L = org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(42.0f), -1);
        this.d = L;
        g9Var.setBackground(L);
        g9Var.u(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f));
        boolean z10 = dd.X;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 15.0f;
        }
        if (z10) {
            f10 = 15.0f;
        } else {
            f10 = 0.0f;
        }
        addView(g9Var, w7.b6.d(42, 42.0f, i17, f7, 11.0f, f10, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, true);
        this.f23573a = f6Var;
        gr grVar = gr.h;
        f6Var.b(0.4f, 350L, grVar);
        f6Var.setScaleProperty(0.6f);
        f6Var.setTextSize(org.telegram.messenger.i0.L(16.0f));
        f6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        if (dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        f6Var.setGravity(i11);
        f6Var.getDrawable().M = org.telegram.messenger.i0.f16172q.x;
        at.i(f6Var);
        boolean z11 = dd.X;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i18 = i12 | 48;
        if (z11) {
            i13 = 16;
        } else {
            i13 = 73;
        }
        float f11 = i13;
        if (z11) {
            i14 = 73;
        } else {
            i14 = 16;
        }
        addView(f6Var, w7.b6.d(-1, 22.0f, i18, f11, 10.0f, i14, 0.0f));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, true, true, true);
        this.f23574b = f6Var2;
        f6Var2.setScaleProperty(0.6f);
        f6Var2.b(0.4f, 350L, grVar);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.A6, p6Var);
        if (dd.X) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        f6Var2.setGravity(i15);
        boolean z12 = dd.X;
        int i19 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i16 = 16;
        } else {
            i16 = 73;
        }
        addView(f6Var2, w7.b6.d(-1, 20.0f, i19, i16, 35.0f, z12 ? 73 : 16, 0.0f));
        g9Var.setAlpha(this.f23580w);
        f6Var.setAlpha(this.f23580w);
        f6Var2.setAlpha(this.f23580w);
    }

    public static int a(int i10) {
        int i11 = i10 % 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                return -1285237;
                            }
                            return -12338729;
                        }
                        return -7900675;
                    }
                    return -13187226;
                }
                return -12214795;
            }
            return -868277;
        }
        return -1351584;
    }

    public final void b(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        float f7;
        String str;
        String str2;
        String str3;
        boolean z14;
        CharSequence charSequence;
        boolean z15;
        this.e = z10;
        org.telegram.ui.Components.f6 f6Var = this.f23573a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f23578r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f23579s, tL_messageMediaVenue.title)) {
                charSequence = this.f23577n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = org.telegram.messenger.k6.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), f6Var.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.f23578r = tL_messageMediaVenue.emoji;
                this.f23579s = tL_messageMediaVenue.title;
                this.f23577n = charSequence;
            }
            if (this.h && !dd.X && z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            f6Var.c(charSequence, z15, true);
        }
        org.telegram.ui.Components.f6 f6Var2 = this.f23574b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !dd.X && z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            f6Var2.c(str4, z14, true);
        }
        int a2 = a(i10);
        org.telegram.ui.Components.g9 g9Var = this.f23575c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                g9Var.h(tL_messageMediaVenue.icon, null, null);
            } else {
                Drawable mutate = getResources().getDrawable(2131232538).mutate();
                org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.bj, this.f23576f, PorterDuff.Mode.MULTIPLY);
                eq eqVar = new eq(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(42.0f), 0), mutate);
                int L = org.telegram.messenger.i0.L(42.0f);
                int L2 = org.telegram.messenger.i0.L(42.0f);
                eqVar.h = L;
                eqVar.f25905n = L2;
                int L3 = org.telegram.messenger.i0.L(24.0f);
                int L4 = org.telegram.messenger.i0.L(24.0f);
                eqVar.e = L3;
                eqVar.f25904f = L4;
                g9Var.setImageDrawable(eqVar);
            }
        }
        this.d.getPaint().setColor(a2);
        setWillNotDraw(false);
        if (tL_messageMediaVenue == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        setClickable(z12);
        ValueAnimator valueAnimator = this.f23581x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (tL_messageMediaVenue == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        final float f10 = this.f23580w;
        if (z13) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        final float f11 = f7;
        final long abs = Math.abs(f10 - f11) * 150.0f;
        this.f23581x = ValueAnimator.ofFloat(f10, f11);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f23581x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                x4 x4Var = x4.this;
                x4Var.getClass();
                long j10 = abs;
                float f12 = 1.0f;
                float min = Math.min(Math.max(((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) / ((float) j10), 0.0f), 1.0f);
                if (j10 > 0) {
                    f12 = min;
                }
                float T1 = org.telegram.messenger.i0.T1(f10, f11, f12);
                x4Var.f23580w = T1;
                x4Var.f23575c.setAlpha(T1);
                x4Var.f23573a.setAlpha(x4Var.f23580w);
                x4Var.f23574b.setAlpha(x4Var.f23580w);
                x4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f23581x;
        if (z13) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.f23581x.start();
        g9Var.setAlpha(f10);
        f6Var.setAlpha(f10);
        f6Var2.setAlpha(f10);
        if (tL_messageMediaVenue == null) {
            try {
            } catch (Exception unused) {
                setContentDescription(null);
            }
            if (TextUtils.isEmpty(null)) {
                setContentDescription(null);
                invalidate();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (tL_messageMediaVenue != null && !TextUtils.isEmpty(tL_messageMediaVenue.title)) {
            sb2.append(tL_messageMediaVenue.title);
        }
        if (!TextUtils.isEmpty(null) || tL_messageMediaVenue == null) {
            str = null;
        } else {
            str = tL_messageMediaVenue.address;
        }
        if (!TextUtils.isEmpty(str)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append((CharSequence) str);
        }
        if (sb2.length() > 0) {
            str2 = sb2.toString();
        } else {
            str2 = null;
        }
        setContentDescription(str2);
        invalidate();
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.f23575c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint d;
        float L;
        float width;
        zz zzVar = f23572y;
        org.telegram.ui.ActionBar.p6 p6Var = this.f23576f;
        if (zzVar == null) {
            zz zzVar2 = new zz(getContext(), p6Var);
            f23572y = zzVar2;
            zzVar2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i10 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i10 = 0;
        }
        zz zzVar3 = f23572y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L2 = org.telegram.messenger.i0.L(56.0f);
        zzVar3.O = measuredWidth;
        zzVar3.P = measuredHeight;
        zzVar3.Q = L2 * (-i10);
        f23572y.setViewType(4);
        f23572y.updateColors();
        f23572y.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f23580w) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.i0.L(2.0f), a30.y(56.0f, getMeasuredHeight(), 2));
        f23572y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            if (p6Var == null) {
                d = null;
            } else {
                d = p6Var.d("paintDivider");
            }
            if (d == null) {
                d = org.telegram.ui.ActionBar.t6.f21053k0;
            }
            Paint paint = d;
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(72.0f);
            }
            float height = getHeight() - 1;
            if (dd.X) {
                width = getWidth() - org.telegram.messenger.i0.L(72.0f);
            } else {
                width = getWidth();
            }
            canvas.drawLine(L, height, width, getHeight() - 1, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
