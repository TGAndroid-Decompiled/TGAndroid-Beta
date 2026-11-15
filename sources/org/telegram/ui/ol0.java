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
public final class ol0 extends View implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public int F;
    public final int f50003a;
    public final boolean f50004b;
    public final boolean f50005c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final Drawable f50006e;
    public final org.telegram.ui.Components.oy0 f50007f;
    public final org.telegram.ui.ActionBar.t2 h;
    public final Paint f50008n;
    public org.telegram.ui.Components.oy0 f50009r;
    public int f50010s;
    public boolean f50011w;
    public dm0 f50012x;
    public dm0 f50013y;

    public ol0(int i7, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        this.f50008n = new Paint(1);
        this.f50010s = -1;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        this.f50003a = i7;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50004b = z10;
        if (z10 && !org.telegram.messenger.t3.V(M0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f50005c = z11;
        this.d = e6Var;
        Drawable g10 = i5.c.g(context, 2131231790);
        this.f50006e = g10;
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
        if (z10 && !z11 && org.telegram.messenger.np.s1(i7).f25280f7.getInt("boostingappearance", 0) < 3) {
            org.telegram.messenger.dp dpVar = s12.f25380r4;
            int i12 = Integer.MAX_VALUE;
            if (dpVar != null) {
                int min = Math.min(Integer.MAX_VALUE, dpVar.e(false));
                int max = Math.max(0, s12.f25380r4.e(false));
                int min2 = Math.min(min, s12.f25380r4.f());
                int max2 = Math.max(max, s12.f25380r4.f());
                i12 = min2;
                i11 = max2;
            } else {
                i11 = 0;
            }
            int min3 = Math.min(i12, s12.f25381r5);
            int min4 = Math.min(i11, s12.f25381r5);
            org.telegram.messenger.dp dpVar2 = s12.f25390s4;
            if (dpVar2 != null) {
                int min5 = Math.min(min3, dpVar2.e(false));
                int max3 = Math.max(min4, s12.f25390s4.e(false));
                min3 = Math.min(min5, s12.f25390s4.f());
                min4 = Math.max(max3, s12.f25390s4.f());
            }
            int min6 = Math.min(min3, s12.s5);
            int max4 = Math.max(min4, s12.s5);
            int min7 = Math.min(min6, s12.f25399t5);
            int max5 = Math.max(max4, s12.f25399t5);
            int min8 = Math.min(min7, s12.f25407u5);
            int max6 = Math.max(max5, s12.f25407u5);
            int min9 = Math.min(min8, s12.f25416v5);
            int max7 = Math.max(max6, s12.f25416v5);
            int i13 = M0 != null ? M0.level : 0;
            if (i13 < max7) {
                this.h = new org.telegram.ui.ActionBar.t2(Math.max(i13, min9), context, e6Var, true);
            }
        }
        setContentDescription(M02);
        this.f50007f = new org.telegram.ui.Components.oy0(M02, 16.0f, null);
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
        if (org.telegram.messenger.hd.f24101a0) {
            L4 = getMeasuredWidth() - L4;
        }
        Drawable drawable = this.f50006e;
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
        org.telegram.ui.Components.oy0 oy0Var = this.f50007f;
        oy0Var.f38116p = measuredWidth4 - i7;
        if (org.telegram.messenger.hd.f24101a0) {
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
        boolean z12 = this.f50005c;
        if (z12 && this.f50013y != null) {
            if (org.telegram.messenger.hd.f24101a0) {
                measuredWidth3 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f50013y.setBounds(measuredWidth3 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.i20.y(11.0f, getMeasuredHeight(), 2), measuredWidth3, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f50013y.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var));
            this.f50013y.draw(canvas);
        } else if (this.f50012x != null && this.f50013y != null) {
            if (org.telegram.messenger.hd.f24101a0) {
                measuredWidth2 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f50013y.setBounds(measuredWidth2 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.i20.y(11.0f, getMeasuredHeight(), 2), measuredWidth2, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            dm0 dm0Var = this.f50013y;
            float N = org.telegram.messenger.g0.N(3.0f);
            int i11 = org.telegram.ui.ActionBar.j6.f28849d6;
            dm0Var.f(N, org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            this.f50013y.draw(canvas);
            int L5 = measuredWidth2 - org.telegram.messenger.g0.L(18.0f);
            this.f50012x.setBounds(L5 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.i20.y(11.0f, getMeasuredHeight(), 2), L5, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f50012x.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            this.f50012x.draw(canvas);
        } else if (this.f50009r != null && !z12) {
            float measuredWidth5 = getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f);
            float k11 = oy0Var.k();
            if (t2Var == null) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(12.0f) + t2Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(k11 + L2, getMeasuredWidth() - org.telegram.messenger.g0.L(164.0f)));
            int min2 = (int) Math.min(this.f50009r.k(), min);
            RectF rectF = org.telegram.messenger.g0.P;
            if (org.telegram.messenger.hd.f24101a0) {
                z10 = org.telegram.messenger.g0.L(15.0f);
            } else {
                z10 = org.telegram.messenger.k5.z(33.0f, getMeasuredWidth(), min2);
            }
            float f10 = z10;
            float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f)) / 2.0f;
            if (org.telegram.messenger.hd.f24101a0) {
                measuredWidth = org.telegram.messenger.g0.L(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(15.0f);
            }
            rectF.set(f10, measuredHeight, measuredWidth, (org.telegram.messenger.g0.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f50008n);
            org.telegram.ui.Components.oy0 oy0Var2 = this.f50009r;
            oy0Var2.f38116p = min;
            if (org.telegram.messenger.hd.f24101a0) {
                z11 = org.telegram.messenger.g0.L(24.0f);
            } else {
                z11 = org.telegram.messenger.k5.z(24.0f, getMeasuredWidth(), min2);
            }
            oy0Var2.e(canvas, z11, getMeasuredHeight() / 2.0f);
        }
        if (this.f50011w) {
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            Paint paint2 = paint;
            if (org.telegram.messenger.hd.f24101a0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (org.telegram.messenger.hd.f24101a0) {
                i10 = org.telegram.messenger.g0.L(71.0f);
            }
            canvas.drawLine(L3, measuredHeight2, measuredWidth6 - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f50011w ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        dm0 dm0Var;
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
        this.f50009r = new org.telegram.ui.Components.oy0(org.telegram.messenger.j6.m(trim, org.telegram.ui.ActionBar.j6.f29046o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
        dm0 dm0Var2 = this.f50012x;
        if (dm0Var2 != null) {
            dm0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i12 = this.f50003a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i13 = dm0.f46427j;
            int i14 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f50012x = new dm0(i14, i14, i14, tL_emojiStatusCollectible.document_id);
        } else {
            if (org.telegram.messenger.q10.l(user) >= 0) {
                dm0Var = dm0.c(i12, org.telegram.messenger.q10.l(user));
                dm0Var.f46428a = org.telegram.messenger.g0.L(11.0f);
                dm0Var.d();
            } else {
                dm0Var = null;
            }
            this.f50012x = dm0Var;
        }
        dm0 dm0Var3 = this.f50012x;
        if (dm0Var3 != null) {
            dm0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f50008n;
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
            this.f50009r.n(i7);
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, i7));
            dm0 dm0Var4 = new dm0(intValue, i10, i11, tL_peerColorCollectible.gift_emoji_id);
            dm0Var4.f46428a = org.telegram.messenger.g0.L(11.0f);
            dm0Var4.d();
            this.f50013y = dm0Var4;
            dm0Var4.e(this);
            return;
        }
        int e10 = org.telegram.messenger.q10.e(user);
        if (e10 < 7) {
            int i15 = org.telegram.ui.ActionBar.j6.f29110r8[e10];
            this.f50010s = i15;
            w02 = org.telegram.ui.ActionBar.j6.w0(i15, e6Var);
        } else {
            org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25380r4;
            if (dpVar != null) {
                cpVar = dpVar.d(e10);
            }
            if (cpVar != null) {
                this.f50010s = -1;
                w02 = cpVar.f();
            } else {
                int i16 = org.telegram.ui.ActionBar.j6.f29110r8[0];
                this.f50010s = i16;
                w02 = org.telegram.ui.ActionBar.j6.w0(i16, e6Var);
            }
        }
        this.f50009r.n(w02);
        paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
        dm0 a10 = dm0.a(i12, e10);
        a10.f46428a = org.telegram.messenger.g0.L(11.0f);
        a10.d();
        this.f50013y = a10;
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10;
        Paint paint;
        int i11;
        boolean z10 = this.f50004b;
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
            this.f50006e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f29089q6;
        }
        this.f50007f.n(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        if (this.f50009r != null && (paint = this.f50008n) != null && (i11 = this.f50010s) != -1) {
            int w03 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
            this.f50009r.n(w03);
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, w03));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
