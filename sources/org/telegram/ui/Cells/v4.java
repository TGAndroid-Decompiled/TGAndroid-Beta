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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public final class v4 extends FrameLayout {
    public static mz f30627y;
    public final org.telegram.ui.Components.j6 f30628a;
    public final org.telegram.ui.Components.j6 f30629b;
    public final org.telegram.ui.Components.l9 f30630c;
    public final ShapeDrawable d;
    public boolean f30631e;
    public final org.telegram.ui.ActionBar.f6 f30632f;
    public boolean h;
    public CharSequence f30633n;
    public String f30634r;
    public String f30635s;
    public float f30636w;
    public ValueAnimator f30637x;

    public v4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.f30636w = 0.0f;
        this.f30632f = f6Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f30630c = l9Var;
        ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(42.0f), -1);
        this.d = L;
        l9Var.setBackground(L);
        l9Var.u(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        boolean z9 = id.f23157a0;
        if (z9) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i16 = i7 | 48;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 15.0f;
        }
        if (z9) {
            f11 = 15.0f;
        } else {
            f11 = 0.0f;
        }
        addView(l9Var, c8.ha.d(42, 42.0f, i16, f10, 11.0f, f11, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f30628a = j6Var;
        xq xqVar = xq.h;
        j6Var.b(0.4f, 350L, xqVar);
        j6Var.setScaleProperty(0.6f);
        j6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        j6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        if (id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j6Var.setGravity(i10);
        j6Var.getDrawable().M = org.telegram.messenger.g0.f22563q.x;
        qs.i(j6Var);
        boolean z10 = id.f23157a0;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i17 = i11 | 48;
        if (z10) {
            i12 = 16;
        } else {
            i12 = 73;
        }
        float f12 = i12;
        if (z10) {
            i13 = 73;
        } else {
            i13 = 16;
        }
        addView(j6Var, c8.ha.d(-1, 22.0f, i17, f12, 10.0f, i13, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f30629b = j6Var2;
        j6Var2.setScaleProperty(0.6f);
        j6Var2.b(0.4f, 350L, xqVar);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.r6.Z(j6Var2, org.telegram.ui.ActionBar.k6.A6, f6Var);
        if (id.f23157a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        j6Var2.setGravity(i14);
        boolean z11 = id.f23157a0;
        int i18 = (z11 ? 5 : 3) | 48;
        if (z11) {
            i15 = 16;
        } else {
            i15 = 73;
        }
        addView(j6Var2, c8.ha.d(-1, 20.0f, i18, i15, 35.0f, z11 ? 73 : 16, 0.0f));
        l9Var.setAlpha(this.f30636w);
        j6Var.setAlpha(this.f30636w);
        j6Var2.setAlpha(this.f30636w);
    }

    public final void a(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7, boolean z9, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        float f10;
        long j3;
        String str;
        String str2;
        String str3;
        int i11;
        boolean z13;
        CharSequence charSequence;
        boolean z14;
        this.f30631e = z9;
        org.telegram.ui.Components.j6 j6Var = this.f30628a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f30634r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f30635s, tL_messageMediaVenue.title)) {
                charSequence = this.f30633n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = org.telegram.messenger.i6.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), j6Var.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.f30634r = tL_messageMediaVenue.emoji;
                this.f30635s = tL_messageMediaVenue.title;
                this.f30633n = charSequence;
            }
            if (this.h && !id.f23157a0 && z10) {
                z14 = true;
            } else {
                z14 = false;
            }
            j6Var.c(charSequence, z14, true);
        }
        org.telegram.ui.Components.j6 j6Var2 = this.f30629b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !id.f23157a0 && z10) {
                z13 = true;
            } else {
                z13 = false;
            }
            j6Var2.c(str4, z13, true);
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
        org.telegram.ui.Components.l9 l9Var = this.f30630c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !"city".equals(tL_messageMediaVenue.icon) && !"country".equals(tL_messageMediaVenue.icon) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                l9Var.h(tL_messageMediaVenue.icon, null, null);
            } else {
                if ("city".equals(tL_messageMediaVenue.icon)) {
                    i11 = 2131231638;
                } else if ("country".equals(tL_messageMediaVenue.icon)) {
                    i11 = 2131231639;
                } else {
                    i11 = 2131232539;
                }
                Drawable mutate = getResources().getDrawable(i11).mutate();
                org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.bj, this.f30632f, PorterDuff.Mode.MULTIPLY);
                xp xpVar = new xp(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(42.0f), 0), mutate);
                int L = org.telegram.messenger.g0.L(42.0f);
                int L2 = org.telegram.messenger.g0.L(42.0f);
                xpVar.h = L;
                xpVar.f40357n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                xpVar.f40355e = L3;
                xpVar.f40356f = L4;
                l9Var.setImageDrawable(xpVar);
            }
        }
        this.d.getPaint().setColor(i10);
        setWillNotDraw(false);
        if (tL_messageMediaVenue == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        setClickable(z11);
        ValueAnimator valueAnimator = this.f30637x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (tL_messageMediaVenue == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        final float f11 = this.f30636w;
        if (z12) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final float f12 = f10;
        final long abs = Math.abs(f11 - f12) * 150.0f;
        this.f30637x = ValueAnimator.ofFloat(f11, f12);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f30637x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                v4Var.f30636w = T1;
                v4Var.f30630c.setAlpha(T1);
                v4Var.f30628a.setAlpha(v4Var.f30636w);
                v4Var.f30629b.setAlpha(v4Var.f30636w);
                v4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f30637x;
        if (z12) {
            j3 = Long.MAX_VALUE;
        } else {
            j3 = abs;
        }
        valueAnimator2.setDuration(j3);
        this.f30637x.start();
        l9Var.setAlpha(f11);
        j6Var.setAlpha(f11);
        j6Var2.setAlpha(f11);
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

    public org.telegram.ui.Components.l9 getImageView() {
        return this.f30630c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Paint d;
        float L;
        float width;
        mz mzVar = f30627y;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30632f;
        if (mzVar == null) {
            mz mzVar2 = new mz(getContext(), f6Var);
            f30627y = mzVar2;
            mzVar2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i7 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i7 = 0;
        }
        mz mzVar3 = f30627y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L2 = org.telegram.messenger.g0.L(56.0f);
        mzVar3.O = measuredWidth;
        mzVar3.P = measuredHeight;
        mzVar3.Q = L2 * (-i7);
        f30627y.setViewType(4);
        f30627y.updateColors();
        f30627y.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f30636w) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.camera.q.y(56.0f, getMeasuredHeight(), 2));
        f30627y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.f30631e) {
            if (f6Var == null) {
                d = null;
            } else {
                d = f6Var.d("paintDivider");
            }
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.f27975k0;
            }
            Paint paint = d;
            if (id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float height = getHeight() - 1;
            if (id.f23157a0) {
                width = getWidth() - org.telegram.messenger.g0.L(72.0f);
            } else {
                width = getWidth();
            }
            canvas.drawLine(L, height, width, getHeight() - 1, paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f30631e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z9) {
        this.h = z9;
    }
}
