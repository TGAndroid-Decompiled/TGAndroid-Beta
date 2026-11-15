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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.pz;
public final class v4 extends FrameLayout {
    public static pz f31797y;
    public final org.telegram.ui.Components.h6 f31798a;
    public final org.telegram.ui.Components.h6 f31799b;
    public final org.telegram.ui.Components.i9 f31800c;
    public final ShapeDrawable d;
    public boolean f31801e;
    public final org.telegram.ui.ActionBar.e6 f31802f;
    public boolean h;
    public CharSequence f31803n;
    public String f31804r;
    public String f31805s;
    public float f31806w;
    public ValueAnimator f31807x;

    public v4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.f31806w = 0.0f;
        this.f31802f = e6Var;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f31800c = i9Var;
        ShapeDrawable L = org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(42.0f), -1);
        this.d = L;
        i9Var.setBackground(L);
        i9Var.u(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        boolean z10 = hd.f24104a0;
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
        addView(i9Var, c8.ja.d(42, 42.0f, i16, f10, 11.0f, f11, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, true);
        this.f31798a = h6Var;
        er erVar = er.h;
        h6Var.b(0.4f, 350L, erVar);
        h6Var.setScaleProperty(0.6f);
        h6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        h6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        if (hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h6Var.setGravity(i10);
        h6Var.getDrawable().N = org.telegram.messenger.g0.f23611q.x;
        ns.i(h6Var);
        boolean z11 = hd.f24104a0;
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
        addView(h6Var, c8.ja.d(-1, 22.0f, i17, f12, 10.0f, i13, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.f31799b = h6Var2;
        h6Var2.setScaleProperty(0.6f);
        h6Var2.b(0.4f, 350L, erVar);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.A6, e6Var);
        if (hd.f24104a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        h6Var2.setGravity(i14);
        boolean z12 = hd.f24104a0;
        int i18 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i15 = 16;
        } else {
            i15 = 73;
        }
        addView(h6Var2, c8.ja.d(-1, 20.0f, i18, i15, 35.0f, z12 ? 73 : 16, 0.0f));
        i9Var.setAlpha(this.f31806w);
        h6Var.setAlpha(this.f31806w);
        h6Var2.setAlpha(this.f31806w);
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
        this.f31801e = z10;
        org.telegram.ui.Components.h6 h6Var = this.f31798a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f31804r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f31805s, tL_messageMediaVenue.title)) {
                charSequence = this.f31803n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = org.telegram.messenger.j6.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), h6Var.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.f31804r = tL_messageMediaVenue.emoji;
                this.f31805s = tL_messageMediaVenue.title;
                this.f31803n = charSequence;
            }
            if (this.h && !hd.f24104a0 && z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            h6Var.c(charSequence, z15, true);
        }
        org.telegram.ui.Components.h6 h6Var2 = this.f31799b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !hd.f24104a0 && z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            h6Var2.c(str4, z14, true);
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
        org.telegram.ui.Components.i9 i9Var = this.f31800c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !"city".equals(tL_messageMediaVenue.icon) && !"country".equals(tL_messageMediaVenue.icon) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                i9Var.h(tL_messageMediaVenue.icon, null, null);
            } else {
                if ("city".equals(tL_messageMediaVenue.icon)) {
                    i11 = 2131231638;
                } else if ("country".equals(tL_messageMediaVenue.icon)) {
                    i11 = 2131231639;
                } else {
                    i11 = 2131232540;
                }
                Drawable mutate = getResources().getDrawable(i11).mutate();
                org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.ej, this.f31802f, PorterDuff.Mode.MULTIPLY);
                fq fqVar = new fq(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(42.0f), 0), mutate);
                int L = org.telegram.messenger.g0.L(42.0f);
                int L2 = org.telegram.messenger.g0.L(42.0f);
                fqVar.h = L;
                fqVar.f34678n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                fqVar.f34676e = L3;
                fqVar.f34677f = L4;
                i9Var.setImageDrawable(fqVar);
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
        ValueAnimator valueAnimator = this.f31807x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (tL_messageMediaVenue == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        final float f11 = this.f31806w;
        if (z13) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final float f12 = f10;
        final long abs = Math.abs(f11 - f12) * 150.0f;
        this.f31807x = ValueAnimator.ofFloat(f11, f12);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f31807x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                v4Var.f31806w = T1;
                v4Var.f31800c.setAlpha(T1);
                v4Var.f31798a.setAlpha(v4Var.f31806w);
                v4Var.f31799b.setAlpha(v4Var.f31806w);
                v4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f31807x;
        if (z13) {
            j3 = Long.MAX_VALUE;
        } else {
            j3 = abs;
        }
        valueAnimator2.setDuration(j3);
        this.f31807x.start();
        i9Var.setAlpha(f11);
        h6Var.setAlpha(f11);
        h6Var2.setAlpha(f11);
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

    public org.telegram.ui.Components.i9 getImageView() {
        return this.f31800c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Paint d;
        float L;
        float width;
        pz pzVar = f31797y;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31802f;
        if (pzVar == null) {
            pz pzVar2 = new pz(getContext(), e6Var);
            f31797y = pzVar2;
            pzVar2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i7 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i7 = 0;
        }
        pz pzVar3 = f31797y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L2 = org.telegram.messenger.g0.L(56.0f);
        pzVar3.P = measuredWidth;
        pzVar3.Q = measuredHeight;
        pzVar3.R = L2 * (-i7);
        f31797y.setViewType(4);
        f31797y.updateColors();
        f31797y.g();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f31806w) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(2.0f), i20.y(56.0f, getMeasuredHeight(), 2));
        f31797y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.f31801e) {
            if (e6Var == null) {
                d = null;
            } else {
                d = e6Var.d("paintDivider");
            }
            if (d == null) {
                d = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            Paint paint = d;
            if (hd.f24104a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float height = getHeight() - 1;
            if (hd.f24104a0) {
                width = getWidth() - org.telegram.messenger.g0.L(72.0f);
            } else {
                width = getWidth();
            }
            canvas.drawLine(L, height, width, getHeight() - 1, paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f31801e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
