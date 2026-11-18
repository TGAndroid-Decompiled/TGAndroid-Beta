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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.wz;
public final class v4 extends FrameLayout {
    public static wz f32162y;
    public final org.telegram.ui.Components.n6 f32163a;
    public final org.telegram.ui.Components.n6 f32164b;
    public final org.telegram.ui.Components.q9 f32165c;
    public final ShapeDrawable d;
    public boolean f32166e;
    public final org.telegram.ui.ActionBar.i6 f32167f;
    public boolean h;
    public CharSequence f32168n;
    public String f32169r;
    public String f32170s;
    public float f32171w;
    public ValueAnimator f32172x;

    public v4(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f32171w = 0.0f;
        this.f32167f = i6Var;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f32165c = q9Var;
        ShapeDrawable L = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(42.0f), -1);
        this.d = L;
        q9Var.setBackground(L);
        q9Var.u(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        boolean z10 = gd.f24216a0;
        if (z10) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i16 = i7 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 15.0f;
        }
        if (z10) {
            f11 = 15.0f;
        } else {
            f11 = 0.0f;
        }
        addView(q9Var, c8.ma.d(42, 42.0f, i16, f10, 11.0f, f11, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
        this.f32163a = n6Var;
        lr lrVar = lr.h;
        n6Var.b(0.4f, 350L, lrVar);
        n6Var.setScaleProperty(0.6f);
        n6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        n6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        if (gd.f24216a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n6Var.setGravity(i10);
        n6Var.getDrawable().N = org.telegram.messenger.g0.f24121q.x;
        ks.i(n6Var);
        boolean z11 = gd.f24216a0;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i17 = i11 | 48;
        if (z11) {
            i12 = 16;
        } else {
            i12 = 73;
        }
        float f12 = i12;
        if (z11) {
            i13 = 73;
        } else {
            i13 = 16;
        }
        addView(n6Var, c8.ma.d(-1, 22.0f, i17, f12, 10.0f, i13, 0.0f));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.f32164b = n6Var2;
        n6Var2.setScaleProperty(0.6f);
        n6Var2.b(0.4f, 350L, lrVar);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.A6, i6Var);
        if (gd.f24216a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        n6Var2.setGravity(i14);
        boolean z12 = gd.f24216a0;
        int i18 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i15 = 16;
        } else {
            i15 = 73;
        }
        addView(n6Var2, c8.ma.d(-1, 20.0f, i18, i15, 35.0f, z12 ? 73 : 16, 0.0f));
        q9Var.setAlpha(this.f32171w);
        n6Var.setAlpha(this.f32171w);
        n6Var2.setAlpha(this.f32171w);
    }

    public final void a(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        boolean z13;
        float f10;
        long j3;
        String str;
        String str2;
        String str3;
        int i11;
        boolean z14;
        CharSequence charSequence;
        boolean z15;
        this.f32166e = z10;
        org.telegram.ui.Components.n6 n6Var = this.f32163a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f32169r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f32170s, tL_messageMediaVenue.title)) {
                charSequence = this.f32168n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = org.telegram.messenger.j6.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), n6Var.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.f32169r = tL_messageMediaVenue.emoji;
                this.f32170s = tL_messageMediaVenue.title;
                this.f32168n = charSequence;
            }
            if (this.h && !gd.f24216a0 && z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            n6Var.c(charSequence, z15, true);
        }
        org.telegram.ui.Components.n6 n6Var2 = this.f32164b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !gd.f24216a0 && z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            n6Var2.c(str4, z14, true);
        }
        int i12 = i7 % 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                i10 = -1285237;
                            } else {
                                i10 = -12338729;
                            }
                        } else {
                            i10 = -7900675;
                        }
                    } else {
                        i10 = -13187226;
                    }
                } else {
                    i10 = -12214795;
                }
            } else {
                i10 = -868277;
            }
        } else {
            i10 = -1351584;
        }
        org.telegram.ui.Components.q9 q9Var = this.f32165c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !"city".equals(tL_messageMediaVenue.icon) && !"country".equals(tL_messageMediaVenue.icon) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                q9Var.h(tL_messageMediaVenue.icon, null, null);
            } else {
                if ("city".equals(tL_messageMediaVenue.icon)) {
                    i11 = 2131231639;
                } else if ("country".equals(tL_messageMediaVenue.icon)) {
                    i11 = 2131231640;
                } else {
                    i11 = 2131232541;
                }
                Drawable mutate = getResources().getDrawable(i11).mutate();
                org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.ej, this.f32167f, PorterDuff.Mode.MULTIPLY);
                mq mqVar = new mq(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(42.0f), 0), mutate);
                int L = org.telegram.messenger.g0.L(42.0f);
                int L2 = org.telegram.messenger.g0.L(42.0f);
                mqVar.h = L;
                mqVar.f37612n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                mqVar.f37610e = L3;
                mqVar.f37611f = L4;
                q9Var.setImageDrawable(mqVar);
            }
        }
        this.d.getPaint().setColor(i10);
        setWillNotDraw(false);
        if (tL_messageMediaVenue == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        setClickable(z12);
        ValueAnimator valueAnimator = this.f32172x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (tL_messageMediaVenue == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        final float f11 = this.f32171w;
        if (z13) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final float f12 = f10;
        final long abs = Math.abs(f11 - f12) * 150.0f;
        this.f32172x = ValueAnimator.ofFloat(f11, f12);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f32172x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                v4 v4Var = v4.this;
                v4Var.getClass();
                long j10 = abs;
                float f13 = 1.0f;
                float min = Math.min(Math.max(((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) / ((float) j10), 0.0f), 1.0f);
                if (j10 > 0) {
                    f13 = min;
                }
                float T1 = org.telegram.messenger.g0.T1(f11, f12, f13);
                v4Var.f32171w = T1;
                v4Var.f32165c.setAlpha(T1);
                v4Var.f32163a.setAlpha(v4Var.f32171w);
                v4Var.f32164b.setAlpha(v4Var.f32171w);
                v4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f32172x;
        if (z13) {
            j3 = Long.MAX_VALUE;
        } else {
            j3 = abs;
        }
        valueAnimator2.setDuration(j3);
        this.f32172x.start();
        q9Var.setAlpha(f11);
        n6Var.setAlpha(f11);
        n6Var2.setAlpha(f11);
        if (tL_messageMediaVenue == null) {
            try {
                try {
                } catch (Exception unused) {
                    setContentDescription(null);
                }
            } catch (Exception unused2) {
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

    public org.telegram.ui.Components.q9 getImageView() {
        return this.f32165c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Paint g10;
        float L;
        float width;
        wz wzVar = f32162y;
        org.telegram.ui.ActionBar.i6 i6Var = this.f32167f;
        if (wzVar == null) {
            wz wzVar2 = new wz(getContext(), i6Var);
            f32162y = wzVar2;
            wzVar2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i7 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i7 = 0;
        }
        wz wzVar3 = f32162y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L2 = org.telegram.messenger.g0.L(56.0f);
        wzVar3.P = measuredWidth;
        wzVar3.Q = measuredHeight;
        wzVar3.R = L2 * (-i7);
        f32162y.setViewType(4);
        f32162y.updateColors();
        f32162y.g();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f32171w) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(2.0f), n10.z(56.0f, getMeasuredHeight(), 2));
        f32162y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.f32166e) {
            if (i6Var == null) {
                g10 = null;
            } else {
                g10 = i6Var.g("paintDivider");
            }
            if (g10 == null) {
                g10 = org.telegram.ui.ActionBar.n6.f29519k0;
            }
            Paint paint = g10;
            if (gd.f24216a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float height = getHeight() - 1;
            if (gd.f24216a0) {
                width = getWidth() - org.telegram.messenger.g0.L(72.0f);
            } else {
                width = getWidth();
            }
            canvas.drawLine(L, height, width, getHeight() - 1, paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f32166e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
