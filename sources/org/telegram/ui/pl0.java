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
public final class pl0 extends View implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public int F;
    public final int f50290a;
    public final boolean f50291b;
    public final boolean f50292c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final Drawable f50293e;
    public final org.telegram.ui.Components.oy0 f50294f;
    public final org.telegram.ui.ActionBar.t2 h;
    public final Paint f50295n;
    public org.telegram.ui.Components.oy0 f50296r;
    public int f50297s;
    public boolean f50298w;
    public em0 f50299x;
    public em0 f50300y;

    public pl0(int i7, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        this.f50295n = new Paint(1);
        this.f50297s = -1;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        this.f50290a = i7;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50291b = z10;
        if (z10 && !org.telegram.messenger.t3.V(M0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f50292c = z11;
        this.d = e6Var;
        Drawable g10 = i5.c.g(context, 2131231790);
        this.f50293e = g10;
        org.telegram.ui.ActionBar.q6.x(this, g10, org.telegram.ui.ActionBar.j6.f29089q6, e6Var, PorterDuff.Mode.SRC_IN);
        if (z10) {
            if (z11) {
                i10 = 2131752546;
            } else {
                i10 = 2131752551;
            }
        } else {
            i10 = 2131752530;
        }
        String M02 = org.telegram.messenger.hd.M0(i10, null);
        if (z10 && !z11 && org.telegram.messenger.np.s1(i7).f25283f7.getInt("boostingappearance", 0) < 3) {
            org.telegram.messenger.dp dpVar = s12.f25383r4;
            int i12 = Integer.MAX_VALUE;
            if (dpVar != null) {
                int min = Math.min(Integer.MAX_VALUE, dpVar.e(false));
                int max = Math.max(0, s12.f25383r4.e(false));
                int min2 = Math.min(min, s12.f25383r4.f());
                int max2 = Math.max(max, s12.f25383r4.f());
                i12 = min2;
                i11 = max2;
            } else {
                i11 = 0;
            }
            int min3 = Math.min(i12, s12.f25384r5);
            int min4 = Math.min(i11, s12.f25384r5);
            org.telegram.messenger.dp dpVar2 = s12.f25393s4;
            if (dpVar2 != null) {
                int min5 = Math.min(min3, dpVar2.e(false));
                int max3 = Math.max(min4, s12.f25393s4.e(false));
                min3 = Math.min(min5, s12.f25393s4.f());
                min4 = Math.max(max3, s12.f25393s4.f());
            }
            int min6 = Math.min(min3, s12.s5);
            int max4 = Math.max(min4, s12.s5);
            int min7 = Math.min(min6, s12.f25402t5);
            int max5 = Math.max(max4, s12.f25402t5);
            int min8 = Math.min(min7, s12.f25410u5);
            int max6 = Math.max(max5, s12.f25410u5);
            int min9 = Math.min(min8, s12.f25419v5);
            int max7 = Math.max(max6, s12.f25419v5);
            int i13 = M0 != null ? M0.level : 0;
            if (i13 < max7) {
                this.h = new org.telegram.ui.ActionBar.t2(Math.max(i13, min9), context, e6Var, true);
            }
        }
        setContentDescription(M02);
        this.f50294f = new org.telegram.ui.Components.oy0(M02, 16.0f, null);
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
        if (org.telegram.messenger.hd.f24104a0) {
            L4 = getMeasuredWidth() - L4;
        }
        Drawable drawable = this.f50293e;
        bg.s.d(drawable, L4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - org.telegram.messenger.g0.L(171.0f);
        int i10 = 0;
        org.telegram.ui.ActionBar.t2 t2Var = this.h;
        if (t2Var != null) {
            i7 = org.telegram.messenger.g0.L(8.0f) + t2Var.getIntrinsicWidth();
        } else {
            i7 = 0;
        }
        org.telegram.ui.Components.oy0 oy0Var = this.f50294f;
        oy0Var.f38114p = measuredWidth4 - i7;
        if (org.telegram.messenger.hd.f24104a0) {
            L = (getMeasuredWidth() - oy0Var.k()) - org.telegram.messenger.g0.L(71.0f);
        } else {
            L = org.telegram.messenger.g0.L(71.0f);
        }
        oy0Var.e(canvas, L, getMeasuredHeight() / 2.0f);
        if (t2Var != null) {
            int k10 = (int) (oy0Var.k() + L + org.telegram.messenger.g0.L(6.0f));
            t2Var.setBounds(k10, 0, k10, getHeight());
            t2Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        boolean z12 = this.f50292c;
        if (z12 && this.f50300y != null) {
            if (org.telegram.messenger.hd.f24104a0) {
                measuredWidth3 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f50300y.setBounds(measuredWidth3 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.i20.y(11.0f, getMeasuredHeight(), 2), measuredWidth3, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f50300y.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var));
            this.f50300y.draw(canvas);
        } else if (this.f50299x != null && this.f50300y != null) {
            if (org.telegram.messenger.hd.f24104a0) {
                measuredWidth2 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f50300y.setBounds(measuredWidth2 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.i20.y(11.0f, getMeasuredHeight(), 2), measuredWidth2, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            em0 em0Var = this.f50300y;
            float N = org.telegram.messenger.g0.N(3.0f);
            int i11 = org.telegram.ui.ActionBar.j6.f28849d6;
            em0Var.f(N, org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            this.f50300y.draw(canvas);
            int L5 = measuredWidth2 - org.telegram.messenger.g0.L(18.0f);
            this.f50299x.setBounds(L5 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.i20.y(11.0f, getMeasuredHeight(), 2), L5, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f50299x.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            this.f50299x.draw(canvas);
        } else if (this.f50296r != null && !z12) {
            float measuredWidth5 = getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f);
            float k11 = oy0Var.k();
            if (t2Var == null) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(12.0f) + t2Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(k11 + L2, getMeasuredWidth() - org.telegram.messenger.g0.L(164.0f)));
            int min2 = (int) Math.min(this.f50296r.k(), min);
            RectF rectF = org.telegram.messenger.g0.P;
            if (org.telegram.messenger.hd.f24104a0) {
                z10 = org.telegram.messenger.g0.L(15.0f);
            } else {
                z10 = org.telegram.messenger.k5.z(33.0f, getMeasuredWidth(), min2);
            }
            float f10 = z10;
            float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f)) / 2.0f;
            if (org.telegram.messenger.hd.f24104a0) {
                measuredWidth = org.telegram.messenger.g0.L(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(15.0f);
            }
            rectF.set(f10, measuredHeight, measuredWidth, (org.telegram.messenger.g0.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f50295n);
            org.telegram.ui.Components.oy0 oy0Var2 = this.f50296r;
            oy0Var2.f38114p = min;
            if (org.telegram.messenger.hd.f24104a0) {
                z11 = org.telegram.messenger.g0.L(24.0f);
            } else {
                z11 = org.telegram.messenger.k5.z(24.0f, getMeasuredWidth(), min2);
            }
            oy0Var2.e(canvas, z11, getMeasuredHeight() / 2.0f);
        }
        if (this.f50298w) {
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            Paint paint2 = paint;
            if (org.telegram.messenger.hd.f24104a0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (org.telegram.messenger.hd.f24104a0) {
                i10 = org.telegram.messenger.g0.L(71.0f);
            }
            canvas.drawLine(L3, measuredHeight2, measuredWidth6 - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f50298w ? 1 : 0), 1073741824));
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
        org.telegram.messenger.cp cpVar = null;
        this.f50296r = new org.telegram.ui.Components.oy0(org.telegram.messenger.j6.m(trim, org.telegram.ui.ActionBar.j6.f29046o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
        em0 em0Var2 = this.f50299x;
        if (em0Var2 != null) {
            em0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i12 = this.f50290a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i13 = em0.f46860j;
            int i14 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f50299x = new em0(i14, i14, i14, tL_emojiStatusCollectible.document_id);
        } else {
            if (org.telegram.messenger.q10.l(user) >= 0) {
                em0Var = em0.c(i12, org.telegram.messenger.q10.l(user));
                em0Var.f46861a = org.telegram.messenger.g0.L(11.0f);
                em0Var.d();
            } else {
                em0Var = null;
            }
            this.f50299x = em0Var;
        }
        em0 em0Var3 = this.f50299x;
        if (em0Var3 != null) {
            em0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f50295n;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            if (e6Var != null) {
                q10 = e6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.j6.I.q();
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
            this.f50296r.n(i7);
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, i7));
            em0 em0Var4 = new em0(intValue, i10, i11, tL_peerColorCollectible.gift_emoji_id);
            em0Var4.f46861a = org.telegram.messenger.g0.L(11.0f);
            em0Var4.d();
            this.f50300y = em0Var4;
            em0Var4.e(this);
            return;
        }
        int e10 = org.telegram.messenger.q10.e(user);
        if (e10 < 7) {
            int i15 = org.telegram.ui.ActionBar.j6.f29110r8[e10];
            this.f50297s = i15;
            w02 = org.telegram.ui.ActionBar.j6.w0(i15, e6Var);
        } else {
            org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25383r4;
            if (dpVar != null) {
                cpVar = dpVar.d(e10);
            }
            if (cpVar != null) {
                this.f50297s = -1;
                w02 = cpVar.f();
            } else {
                int i16 = org.telegram.ui.ActionBar.j6.f29110r8[0];
                this.f50297s = i16;
                w02 = org.telegram.ui.ActionBar.j6.w0(i16, e6Var);
            }
        }
        this.f50296r.n(w02);
        paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
        em0 a10 = em0.a(i12, e10);
        a10.f46861a = org.telegram.messenger.g0.L(11.0f);
        a10.d();
        this.f50300y = a10;
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10;
        Paint paint;
        int i11;
        boolean z10 = this.f50291b;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.j6.f29014m6;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f29089q6;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        if (!this.E || this.F != w02) {
            this.E = true;
            this.F = w02;
            this.f50293e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f29089q6;
        }
        this.f50294f.n(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        if (this.f50296r != null && (paint = this.f50295n) != null && (i11 = this.f50297s) != -1) {
            int w03 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
            this.f50296r.n(w03);
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, w03));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
