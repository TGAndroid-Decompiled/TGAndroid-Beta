package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class pl0 extends View implements org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public int F;
    public final int f51057a;
    public final boolean f51058b;
    public final boolean f51059c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final Drawable f51060e;
    public final org.telegram.ui.Components.wy0 f51061f;
    public final org.telegram.ui.ActionBar.v2 h;
    public final Paint f51062n;
    public org.telegram.ui.Components.wy0 f51063r;
    public int f51064s;
    public boolean f51065w;
    public em0 f51066x;
    public em0 f51067y;

    public pl0(int i7, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        this.f51062n = new Paint(1);
        this.f51064s = -1;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
        this.f51057a = i7;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51058b = z10;
        if (z10 && !org.telegram.messenger.v3.V(O0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f51059c = z11;
        this.d = i6Var;
        Drawable g10 = i5.c.g(context, 2131231794);
        this.f51060e = g10;
        org.telegram.ui.ActionBar.u6.x(this, g10, org.telegram.ui.ActionBar.n6.f29691q6, i6Var, PorterDuff.Mode.SRC_IN);
        if (z10) {
            if (z11) {
                i10 = 2131752534;
            } else {
                i10 = 2131752539;
            }
        } else {
            i10 = 2131752518;
        }
        String N0 = org.telegram.messenger.gd.N0(i10, null);
        if (z10 && !z11 && org.telegram.messenger.mp.u1(i7).h7.getInt("boostingappearance", 0) < 3) {
            org.telegram.messenger.cp cpVar = u12.f25862t4;
            int i12 = Integer.MAX_VALUE;
            if (cpVar != null) {
                int min = Math.min(Integer.MAX_VALUE, cpVar.e(false));
                int max = Math.max(0, u12.f25862t4.e(false));
                int min2 = Math.min(min, u12.f25862t4.f());
                int max2 = Math.max(max, u12.f25862t4.f());
                i12 = min2;
                i11 = max2;
            } else {
                i11 = 0;
            }
            int min3 = Math.min(i12, u12.f25863t5);
            int min4 = Math.min(i11, u12.f25863t5);
            org.telegram.messenger.cp cpVar2 = u12.f25870u4;
            if (cpVar2 != null) {
                int min5 = Math.min(min3, cpVar2.e(false));
                int max3 = Math.max(min4, u12.f25870u4.e(false));
                min3 = Math.min(min5, u12.f25870u4.f());
                min4 = Math.max(max3, u12.f25870u4.f());
            }
            int min6 = Math.min(min3, u12.f25871u5);
            int max4 = Math.max(min4, u12.f25871u5);
            int min7 = Math.min(min6, u12.f25880v5);
            int max5 = Math.max(max4, u12.f25880v5);
            int min8 = Math.min(min7, u12.f25890w5);
            int max6 = Math.max(max5, u12.f25890w5);
            int min9 = Math.min(min8, u12.f25900x5);
            int max7 = Math.max(max6, u12.f25900x5);
            int i13 = O0 != null ? O0.level : 0;
            if (i13 < max7) {
                this.h = new org.telegram.ui.ActionBar.v2(Math.max(i13, min9), context, i6Var, true);
            }
        }
        setContentDescription(N0);
        this.f51061f = new org.telegram.ui.Components.wy0(N0, 16.0f, null);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        float L;
        int L2;
        int z10;
        int measuredWidth;
        int z11;
        int measuredWidth2;
        Paint paint;
        float L3;
        int measuredWidth3;
        int L4 = org.telegram.messenger.g0.L(64.0f) / 2;
        if (org.telegram.messenger.gd.f24314a0) {
            L4 = getMeasuredWidth() - L4;
        }
        Drawable drawable = this.f51060e;
        bg.t.d(drawable, L4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - org.telegram.messenger.g0.L(171.0f);
        int i10 = 0;
        org.telegram.ui.ActionBar.v2 v2Var = this.h;
        if (v2Var != null) {
            i7 = org.telegram.messenger.g0.L(8.0f) + v2Var.getIntrinsicWidth();
        } else {
            i7 = 0;
        }
        org.telegram.ui.Components.wy0 wy0Var = this.f51061f;
        wy0Var.f41774p = measuredWidth4 - i7;
        if (org.telegram.messenger.gd.f24314a0) {
            L = (getMeasuredWidth() - wy0Var.k()) - org.telegram.messenger.g0.L(71.0f);
        } else {
            L = org.telegram.messenger.g0.L(71.0f);
        }
        wy0Var.e(canvas, L, getMeasuredHeight() / 2.0f);
        if (v2Var != null) {
            int k10 = (int) (wy0Var.k() + L + org.telegram.messenger.g0.L(6.0f));
            v2Var.setBounds(k10, 0, k10, getHeight());
            v2Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        boolean z12 = this.f51059c;
        if (z12 && this.f51067y != null) {
            if (org.telegram.messenger.gd.f24314a0) {
                measuredWidth3 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f51067y.setBounds(measuredWidth3 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.m10.z(11.0f, getMeasuredHeight(), 2), measuredWidth3, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f51067y.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, i6Var));
            this.f51067y.draw(canvas);
        } else if (this.f51066x != null && this.f51067y != null) {
            if (org.telegram.messenger.gd.f24314a0) {
                measuredWidth2 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f51067y.setBounds(measuredWidth2 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.m10.z(11.0f, getMeasuredHeight(), 2), measuredWidth2, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            em0 em0Var = this.f51067y;
            float N = org.telegram.messenger.g0.N(3.0f);
            int i11 = org.telegram.ui.ActionBar.n6.f29451d6;
            em0Var.f(N, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            this.f51067y.draw(canvas);
            int L5 = measuredWidth2 - org.telegram.messenger.g0.L(18.0f);
            this.f51066x.setBounds(L5 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.m10.z(11.0f, getMeasuredHeight(), 2), L5, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f51066x.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            this.f51066x.draw(canvas);
        } else if (this.f51063r != null && !z12) {
            float measuredWidth5 = getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f);
            float k11 = wy0Var.k();
            if (v2Var == null) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(12.0f) + v2Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(k11 + L2, getMeasuredWidth() - org.telegram.messenger.g0.L(164.0f)));
            int min2 = (int) Math.min(this.f51063r.k(), min);
            RectF rectF = org.telegram.messenger.g0.P;
            if (org.telegram.messenger.gd.f24314a0) {
                z10 = org.telegram.messenger.g0.L(15.0f);
            } else {
                z10 = org.telegram.messenger.f3.z(33.0f, getMeasuredWidth(), min2);
            }
            float f10 = z10;
            float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f)) / 2.0f;
            if (org.telegram.messenger.gd.f24314a0) {
                measuredWidth = org.telegram.messenger.g0.L(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(15.0f);
            }
            rectF.set(f10, measuredHeight, measuredWidth, (org.telegram.messenger.g0.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f51062n);
            org.telegram.ui.Components.wy0 wy0Var2 = this.f51063r;
            wy0Var2.f41774p = min;
            if (org.telegram.messenger.gd.f24314a0) {
                z11 = org.telegram.messenger.g0.L(24.0f);
            } else {
                z11 = org.telegram.messenger.f3.z(24.0f, getMeasuredWidth(), min2);
            }
            wy0Var2.e(canvas, z11, getMeasuredHeight() / 2.0f);
        }
        if (this.f51065w) {
            if (i6Var != null) {
                paint = i6Var.e("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.n6.f29574k0;
            }
            Paint paint2 = paint;
            if (org.telegram.messenger.gd.f24314a0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (org.telegram.messenger.gd.f24314a0) {
                i10 = org.telegram.messenger.g0.L(71.0f);
            }
            canvas.drawLine(L3, measuredHeight2, measuredWidth6 - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f51065w ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        em0 em0Var;
        int w02;
        boolean q10;
        int i7;
        ArrayList<Integer> arrayList;
        int i10;
        int i11;
        if (user == null) {
            return;
        }
        String str = user.first_name;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        org.telegram.messenger.bp bpVar = null;
        this.f51063r = new org.telegram.ui.Components.wy0(org.telegram.messenger.j6.m(trim, org.telegram.ui.ActionBar.n6.f29648o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
        em0 em0Var2 = this.f51066x;
        if (em0Var2 != null) {
            em0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i12 = this.f51057a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i13 = em0.f47578j;
            int i14 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f51066x = new em0(i14, i14, i14, tL_emojiStatusCollectible.document_id);
        } else {
            if (org.telegram.messenger.n10.m(user) >= 0) {
                em0Var = em0.c(i12, org.telegram.messenger.n10.m(user));
                em0Var.f47579a = org.telegram.messenger.g0.L(11.0f);
                em0Var.d();
            } else {
                em0Var = null;
            }
            this.f51066x = em0Var;
        }
        em0 em0Var3 = this.f51066x;
        if (em0Var3 != null) {
            em0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f51062n;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            if (i6Var != null) {
                q10 = i6Var.b();
            } else {
                q10 = org.telegram.ui.ActionBar.n6.I.q();
            }
            if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
                i7 = tL_peerColorCollectible.dark_accent_color;
            } else {
                i7 = tL_peerColorCollectible.accent_color;
            }
            if (!q10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            if (arrayList.size() >= 2) {
                i10 = arrayList.get(1).intValue() | (-16777216);
            } else {
                i10 = intValue;
            }
            if (arrayList.size() >= 3) {
                i11 = arrayList.get(2).intValue() | (-16777216);
            } else {
                i11 = intValue;
            }
            this.f51063r.n(i7);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, i7));
            em0 em0Var4 = new em0(intValue, i10, i11, tL_peerColorCollectible.gift_emoji_id);
            em0Var4.f47579a = org.telegram.messenger.g0.L(11.0f);
            em0Var4.d();
            this.f51067y = em0Var4;
            em0Var4.e(this);
            return;
        }
        int f10 = org.telegram.messenger.n10.f(user);
        if (f10 < 7) {
            int i15 = org.telegram.ui.ActionBar.n6.f29712r8[f10];
            this.f51064s = i15;
            w02 = org.telegram.ui.ActionBar.n6.w0(i15, i6Var);
        } else {
            org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25862t4;
            if (cpVar != null) {
                bpVar = cpVar.d(f10);
            }
            if (bpVar != null) {
                this.f51064s = -1;
                w02 = bpVar.f();
            } else {
                int i16 = org.telegram.ui.ActionBar.n6.f29712r8[0];
                this.f51064s = i16;
                w02 = org.telegram.ui.ActionBar.n6.w0(i16, i6Var);
            }
        }
        this.f51063r.n(w02);
        paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
        em0 a10 = em0.a(i12, f10);
        a10.f47579a = org.telegram.messenger.g0.L(11.0f);
        a10.d();
        this.f51067y = a10;
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10;
        Paint paint;
        int i11;
        boolean z10 = this.f51058b;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.n6.f29616m6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29691q6;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        if (!this.E || this.F != w02) {
            this.E = true;
            this.F = w02;
            this.f51060e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            i10 = org.telegram.ui.ActionBar.n6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29691q6;
        }
        this.f51061f.n(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        if (this.f51063r != null && (paint = this.f51062n) != null && (i11 = this.f51064s) != -1) {
            int w03 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            this.f51063r.n(w03);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w03));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
