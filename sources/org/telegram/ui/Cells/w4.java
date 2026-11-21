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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.yz;
public final class w4 extends FrameLayout {
    public static yz f32248y;
    public final org.telegram.ui.Components.o6 f32249a;
    public final org.telegram.ui.Components.o6 f32250b;
    public final org.telegram.ui.Components.q9 f32251c;
    public final ShapeDrawable d;
    public boolean f32252e;
    public final org.telegram.ui.ActionBar.h6 f32253f;
    public boolean h;
    public CharSequence f32254n;
    public String f32255r;
    public String f32256s;
    public float f32257w;
    public ValueAnimator f32258x;

    public w4(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
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
        this.f32257w = 0.0f;
        this.f32253f = h6Var;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f32251c = q9Var;
        ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(42.0f), -1);
        this.d = L;
        q9Var.setBackground(L);
        q9Var.u(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        boolean z10 = gd.f24241a0;
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
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f32249a = o6Var;
        nr nrVar = nr.h;
        o6Var.b(0.4f, 350L, nrVar);
        o6Var.setScaleProperty(0.6f);
        o6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        o6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        if (gd.f24241a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        o6Var.setGravity(i10);
        o6Var.getDrawable().N = org.telegram.messenger.g0.f24146q.x;
        ks.i(o6Var);
        boolean z11 = gd.f24241a0;
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
        addView(o6Var, c8.ma.d(-1, 22.0f, i17, f12, 10.0f, i13, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f32250b = o6Var2;
        o6Var2.setScaleProperty(0.6f);
        o6Var2.b(0.4f, 350L, nrVar);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.A6, h6Var);
        if (gd.f24241a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        o6Var2.setGravity(i14);
        boolean z12 = gd.f24241a0;
        int i18 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i15 = 16;
        } else {
            i15 = 73;
        }
        addView(o6Var2, c8.ma.d(-1, 20.0f, i18, i15, 35.0f, z12 ? 73 : 16, 0.0f));
        q9Var.setAlpha(this.f32257w);
        o6Var.setAlpha(this.f32257w);
        o6Var2.setAlpha(this.f32257w);
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
        this.f32252e = z10;
        org.telegram.ui.Components.o6 o6Var = this.f32249a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f32255r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f32256s, tL_messageMediaVenue.title)) {
                charSequence = this.f32254n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = org.telegram.messenger.j6.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), o6Var.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.f32255r = tL_messageMediaVenue.emoji;
                this.f32256s = tL_messageMediaVenue.title;
                this.f32254n = charSequence;
            }
            if (this.h && !gd.f24241a0 && z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            o6Var.c(charSequence, z15, true);
        }
        org.telegram.ui.Components.o6 o6Var2 = this.f32250b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !gd.f24241a0 && z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            o6Var2.c(str4, z14, true);
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
        org.telegram.ui.Components.q9 q9Var = this.f32251c;
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
                org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.ej, this.f32253f, PorterDuff.Mode.MULTIPLY);
                oq oqVar = new oq(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(42.0f), 0), mutate);
                int L = org.telegram.messenger.g0.L(42.0f);
                int L2 = org.telegram.messenger.g0.L(42.0f);
                oqVar.h = L;
                oqVar.f38341n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                oqVar.f38339e = L3;
                oqVar.f38340f = L4;
                q9Var.setImageDrawable(oqVar);
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
        ValueAnimator valueAnimator = this.f32258x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (tL_messageMediaVenue == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        final float f11 = this.f32257w;
        if (z13) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final float f12 = f10;
        final long abs = Math.abs(f11 - f12) * 150.0f;
        this.f32258x = ValueAnimator.ofFloat(f11, f12);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f32258x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                w4 w4Var = w4.this;
                w4Var.getClass();
                long j10 = abs;
                float f13 = 1.0f;
                float min = Math.min(Math.max(((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) / ((float) j10), 0.0f), 1.0f);
                if (j10 > 0) {
                    f13 = min;
                }
                float T1 = org.telegram.messenger.g0.T1(f11, f12, f13);
                w4Var.f32257w = T1;
                w4Var.f32251c.setAlpha(T1);
                w4Var.f32249a.setAlpha(w4Var.f32257w);
                w4Var.f32250b.setAlpha(w4Var.f32257w);
                w4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f32258x;
        if (z13) {
            j3 = Long.MAX_VALUE;
        } else {
            j3 = abs;
        }
        valueAnimator2.setDuration(j3);
        this.f32258x.start();
        q9Var.setAlpha(f11);
        o6Var.setAlpha(f11);
        o6Var2.setAlpha(f11);
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
        return this.f32251c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Paint g10;
        float L;
        float width;
        yz yzVar = f32248y;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32253f;
        if (yzVar == null) {
            yz yzVar2 = new yz(getContext(), h6Var);
            f32248y = yzVar2;
            yzVar2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i7 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i7 = 0;
        }
        yz yzVar3 = f32248y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L2 = org.telegram.messenger.g0.L(56.0f);
        yzVar3.P = measuredWidth;
        yzVar3.Q = measuredHeight;
        yzVar3.R = L2 * (-i7);
        f32248y.setViewType(4);
        f32248y.updateColors();
        f32248y.g();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f32257w) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(2.0f), n10.z(56.0f, getMeasuredHeight(), 2));
        f32248y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.f32252e) {
            if (h6Var == null) {
                g10 = null;
            } else {
                g10 = h6Var.g("paintDivider");
            }
            if (g10 == null) {
                g10 = org.telegram.ui.ActionBar.m6.f29501k0;
            }
            Paint paint = g10;
            if (gd.f24241a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float height = getHeight() - 1;
            if (gd.f24241a0) {
                width = getWidth() - org.telegram.messenger.g0.L(72.0f);
            } else {
                width = getWidth();
            }
            canvas.drawLine(L, height, width, getHeight() - 1, paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f32252e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
