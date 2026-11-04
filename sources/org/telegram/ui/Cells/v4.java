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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public final class v4 extends FrameLayout {
    public static iz f30721y;
    public final org.telegram.ui.Components.h6 f30722a;
    public final org.telegram.ui.Components.h6 f30723b;
    public final org.telegram.ui.Components.k9 f30724c;
    public final ShapeDrawable d;
    public boolean f30725e;
    public final org.telegram.ui.ActionBar.e6 f30726f;
    public boolean h;
    public CharSequence f30727n;
    public String f30728r;
    public String f30729s;
    public float f30730w;
    public ValueAnimator f30731x;

    public v4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f30730w = 0.0f;
        this.f30726f = e6Var;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f30724c = k9Var;
        ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(42.0f), -1);
        this.d = L;
        k9Var.setBackground(L);
        k9Var.u(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        boolean z10 = bd.f21784a0;
        if (z10) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i16 = i3 | 48;
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
        addView(k9Var, mf.d(42, 42.0f, i16, f10, 11.0f, f11, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, true);
        this.f30722a = h6Var;
        xq xqVar = xq.h;
        h6Var.b(0.4f, 350L, xqVar);
        h6Var.setScaleProperty(0.6f);
        h6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        h6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h6Var.setGravity(i10);
        h6Var.getDrawable().M = org.telegram.messenger.g0.f22608q.x;
        hs.i(h6Var);
        boolean z11 = bd.f21784a0;
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
        addView(h6Var, mf.d(-1, 22.0f, i17, f12, 10.0f, i13, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.f30723b = h6Var2;
        h6Var2.setScaleProperty(0.6f);
        h6Var2.b(0.4f, 350L, xqVar);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.A6, e6Var);
        if (bd.f21784a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        h6Var2.setGravity(i14);
        boolean z12 = bd.f21784a0;
        int i18 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i15 = 16;
        } else {
            i15 = 73;
        }
        addView(h6Var2, mf.d(-1, 20.0f, i18, i15, 35.0f, z12 ? 73 : 16, 0.0f));
        k9Var.setAlpha(this.f30730w);
        h6Var.setAlpha(this.f30730w);
        h6Var2.setAlpha(this.f30730w);
    }

    public final void a(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i3, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        boolean z13;
        float f10;
        long j10;
        String str;
        String str2;
        String str3;
        int i11;
        boolean z14;
        CharSequence charSequence;
        boolean z15;
        this.f30725e = z10;
        org.telegram.ui.Components.h6 h6Var = this.f30722a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f30728r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f30729s, tL_messageMediaVenue.title)) {
                charSequence = this.f30727n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = org.telegram.messenger.i6.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), h6Var.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.f30728r = tL_messageMediaVenue.emoji;
                this.f30729s = tL_messageMediaVenue.title;
                this.f30727n = charSequence;
            }
            if (this.h && !bd.f21784a0 && z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            h6Var.c(charSequence, z15, true);
        }
        org.telegram.ui.Components.h6 h6Var2 = this.f30723b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !bd.f21784a0 && z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            h6Var2.c(str4, z14, true);
        }
        int i12 = i3 % 7;
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
        org.telegram.ui.Components.k9 k9Var = this.f30724c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !"city".equals(tL_messageMediaVenue.icon) && !"country".equals(tL_messageMediaVenue.icon) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                k9Var.h(tL_messageMediaVenue.icon, null, null);
            } else {
                if ("city".equals(tL_messageMediaVenue.icon)) {
                    i11 = 2131231638;
                } else if ("country".equals(tL_messageMediaVenue.icon)) {
                    i11 = 2131231639;
                } else {
                    i11 = 2131232539;
                }
                Drawable mutate = getResources().getDrawable(i11).mutate();
                org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.bj, this.f30726f, PorterDuff.Mode.MULTIPLY);
                xp xpVar = new xp(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(42.0f), 0), mutate);
                int L = org.telegram.messenger.g0.L(42.0f);
                int L2 = org.telegram.messenger.g0.L(42.0f);
                xpVar.h = L;
                xpVar.f40443n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                xpVar.f40441e = L3;
                xpVar.f40442f = L4;
                k9Var.setImageDrawable(xpVar);
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
        ValueAnimator valueAnimator = this.f30731x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (tL_messageMediaVenue == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        final float f11 = this.f30730w;
        if (z13) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final float f12 = f10;
        final long abs = Math.abs(f11 - f12) * 150.0f;
        this.f30731x = ValueAnimator.ofFloat(f11, f12);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f30731x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                v4 v4Var = v4.this;
                v4Var.getClass();
                long j11 = abs;
                float f13 = 1.0f;
                float min = Math.min(Math.max(((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) / ((float) j11), 0.0f), 1.0f);
                if (j11 > 0) {
                    f13 = min;
                }
                float T1 = org.telegram.messenger.g0.T1(f11, f12, f13);
                v4Var.f30730w = T1;
                v4Var.f30724c.setAlpha(T1);
                v4Var.f30722a.setAlpha(v4Var.f30730w);
                v4Var.f30723b.setAlpha(v4Var.f30730w);
                v4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f30731x;
        if (z13) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = abs;
        }
        valueAnimator2.setDuration(j10);
        this.f30731x.start();
        k9Var.setAlpha(f11);
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

    public org.telegram.ui.Components.k9 getImageView() {
        return this.f30724c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        Paint d;
        float L;
        float width;
        iz izVar = f30721y;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30726f;
        if (izVar == null) {
            iz izVar2 = new iz(getContext(), e6Var);
            f30721y = izVar2;
            izVar2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i3 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i3 = 0;
        }
        iz izVar3 = f30721y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L2 = org.telegram.messenger.g0.L(56.0f);
        izVar3.P = measuredWidth;
        izVar3.Q = measuredHeight;
        izVar3.R = L2 * (-i3);
        f30721y.setViewType(4);
        f30721y.updateColors();
        f30721y.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f30730w) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.camera.q.y(56.0f, getMeasuredHeight(), 2));
        f30721y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.f30725e) {
            if (e6Var == null) {
                d = null;
            } else {
                d = e6Var.d("paintDivider");
            }
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint = d;
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float height = getHeight() - 1;
            if (bd.f21784a0) {
                width = getWidth() - org.telegram.messenger.g0.L(72.0f);
            } else {
                width = getWidth();
            }
            canvas.drawLine(L, height, width, getHeight() - 1, paint);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f30725e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
