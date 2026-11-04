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
public final class il0 extends View implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public int F;
    public final int f46286a;
    public final boolean f46287b;
    public final boolean f46288c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final Drawable f46289e;
    public final org.telegram.ui.Components.ly0 f46290f;
    public final org.telegram.ui.ActionBar.s2 h;
    public final Paint f46291n;
    public org.telegram.ui.Components.ly0 f46292r;
    public int f46293s;
    public boolean f46294w;
    public xl0 f46295x;
    public xl0 f46296y;

    public il0(int i3, long j10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        this.f46291n = new Paint(1);
        this.f46293s = -1;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j10));
        this.f46286a = i3;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46287b = z10;
        if (z10 && !org.telegram.messenger.t3.V(M0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46288c = z11;
        this.d = e6Var;
        Drawable g7 = k2.p1.g(context, 2131231790);
        this.f46289e = g7;
        org.telegram.ui.ActionBar.r6.y(this, g7, org.telegram.ui.ActionBar.k6.f28121q6, e6Var, PorterDuff.Mode.SRC_IN);
        if (z10) {
            if (z11) {
                i10 = 2131752546;
            } else {
                i10 = 2131752551;
            }
        } else {
            i10 = 2131752530;
        }
        String M02 = org.telegram.messenger.bd.M0(i10, null);
        if (z10 && !z11 && org.telegram.messenger.hp.s1(i3).f22999e7.getInt("boostingappearance", 0) < 3) {
            org.telegram.messenger.xo xoVar = s12.f23099q4;
            int i12 = Integer.MAX_VALUE;
            if (xoVar != null) {
                int min = Math.min(Integer.MAX_VALUE, xoVar.e(false));
                int max = Math.max(0, s12.f23099q4.e(false));
                int min2 = Math.min(min, s12.f23099q4.f());
                int max2 = Math.max(max, s12.f23099q4.f());
                i12 = min2;
                i11 = max2;
            } else {
                i11 = 0;
            }
            int min3 = Math.min(i12, s12.f23100q5);
            int min4 = Math.min(i11, s12.f23100q5);
            org.telegram.messenger.xo xoVar2 = s12.f23109r4;
            if (xoVar2 != null) {
                int min5 = Math.min(min3, xoVar2.e(false));
                int max3 = Math.max(min4, s12.f23109r4.e(false));
                min3 = Math.min(min5, s12.f23109r4.f());
                min4 = Math.max(max3, s12.f23109r4.f());
            }
            int min6 = Math.min(min3, s12.r5);
            int max4 = Math.max(min4, s12.r5);
            int min7 = Math.min(min6, s12.f23119s5);
            int max5 = Math.max(max4, s12.f23119s5);
            int min8 = Math.min(min7, s12.f23127t5);
            int max6 = Math.max(max5, s12.f23127t5);
            int min9 = Math.min(min8, s12.f23136u5);
            int max7 = Math.max(max6, s12.f23136u5);
            int i13 = M0 != null ? M0.level : 0;
            if (i13 < max7) {
                this.h = new org.telegram.ui.ActionBar.s2(Math.max(i13, min9), context, e6Var, true);
            }
        }
        setContentDescription(M02);
        this.f46290f = new org.telegram.ui.Components.ly0(M02, 16.0f, null);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
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
        if (org.telegram.messenger.bd.f21784a0) {
            L4 = getMeasuredWidth() - L4;
        }
        Drawable drawable = this.f46289e;
        cg.r.d(drawable, L4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - org.telegram.messenger.g0.L(171.0f);
        int i10 = 0;
        org.telegram.ui.ActionBar.s2 s2Var = this.h;
        if (s2Var != null) {
            i3 = org.telegram.messenger.g0.L(8.0f) + s2Var.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        org.telegram.ui.Components.ly0 ly0Var = this.f46290f;
        ly0Var.f35929p = measuredWidth4 - i3;
        if (org.telegram.messenger.bd.f21784a0) {
            L = (getMeasuredWidth() - ly0Var.k()) - org.telegram.messenger.g0.L(71.0f);
        } else {
            L = org.telegram.messenger.g0.L(71.0f);
        }
        ly0Var.e(canvas, L, getMeasuredHeight() / 2.0f);
        if (s2Var != null) {
            int k10 = (int) (ly0Var.k() + L + org.telegram.messenger.g0.L(6.0f));
            s2Var.setBounds(k10, 0, k10, getHeight());
            s2Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        boolean z12 = this.f46288c;
        if (z12 && this.f46296y != null) {
            if (org.telegram.messenger.bd.f21784a0) {
                measuredWidth3 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f46296y.setBounds(measuredWidth3 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.camera.q.y(11.0f, getMeasuredHeight(), 2), measuredWidth3, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f46296y.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
            this.f46296y.draw(canvas);
        } else if (this.f46295x != null && this.f46296y != null) {
            if (org.telegram.messenger.bd.f21784a0) {
                measuredWidth2 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f46296y.setBounds(measuredWidth2 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.camera.q.y(11.0f, getMeasuredHeight(), 2), measuredWidth2, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            xl0 xl0Var = this.f46296y;
            float N = org.telegram.messenger.g0.N(3.0f);
            int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
            xl0Var.f(N, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            this.f46296y.draw(canvas);
            int L5 = measuredWidth2 - org.telegram.messenger.g0.L(18.0f);
            this.f46295x.setBounds(L5 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.camera.q.y(11.0f, getMeasuredHeight(), 2), L5, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f46295x.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            this.f46295x.draw(canvas);
        } else if (this.f46292r != null && !z12) {
            float measuredWidth5 = getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f);
            float k11 = ly0Var.k();
            if (s2Var == null) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(12.0f) + s2Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(k11 + L2, getMeasuredWidth() - org.telegram.messenger.g0.L(164.0f)));
            int min2 = (int) Math.min(this.f46292r.k(), min);
            RectF rectF = org.telegram.messenger.g0.P;
            if (org.telegram.messenger.bd.f21784a0) {
                z10 = org.telegram.messenger.g0.L(15.0f);
            } else {
                z10 = org.telegram.messenger.k5.z(33.0f, getMeasuredWidth(), min2);
            }
            float f10 = z10;
            float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f)) / 2.0f;
            if (org.telegram.messenger.bd.f21784a0) {
                measuredWidth = org.telegram.messenger.g0.L(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(15.0f);
            }
            rectF.set(f10, measuredHeight, measuredWidth, (org.telegram.messenger.g0.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f46291n);
            org.telegram.ui.Components.ly0 ly0Var2 = this.f46292r;
            ly0Var2.f35929p = min;
            if (org.telegram.messenger.bd.f21784a0) {
                z11 = org.telegram.messenger.g0.L(24.0f);
            } else {
                z11 = org.telegram.messenger.k5.z(24.0f, getMeasuredWidth(), min2);
            }
            ly0Var2.e(canvas, z11, getMeasuredHeight() / 2.0f);
        }
        if (this.f46294w) {
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint2 = paint;
            if (org.telegram.messenger.bd.f21784a0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (org.telegram.messenger.bd.f21784a0) {
                i10 = org.telegram.messenger.g0.L(71.0f);
            }
            canvas.drawLine(L3, measuredHeight2, measuredWidth6 - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f46294w ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        xl0 xl0Var;
        int w02;
        boolean q10;
        int i3;
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
        org.telegram.messenger.wo woVar = null;
        this.f46292r = new org.telegram.ui.Components.ly0(org.telegram.messenger.i6.m(trim, org.telegram.ui.ActionBar.k6.f28077o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
        xl0 xl0Var2 = this.f46295x;
        if (xl0Var2 != null) {
            xl0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i12 = this.f46286a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i13 = xl0.f52042j;
            int i14 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f46295x = new xl0(i14, i14, i14, tL_emojiStatusCollectible.document_id);
        } else {
            if (org.telegram.messenger.l10.l(user) >= 0) {
                xl0Var = xl0.c(i12, org.telegram.messenger.l10.l(user));
                xl0Var.f52043a = org.telegram.messenger.g0.L(11.0f);
                xl0Var.d();
            } else {
                xl0Var = null;
            }
            this.f46295x = xl0Var;
        }
        xl0 xl0Var3 = this.f46295x;
        if (xl0Var3 != null) {
            xl0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f46291n;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            if (e6Var != null) {
                q10 = e6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
                i3 = tL_peerColorCollectible.dark_accent_color;
            } else {
                i3 = tL_peerColorCollectible.accent_color;
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
            this.f46292r.n(i3);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i3));
            xl0 xl0Var4 = new xl0(intValue, i10, i11, tL_peerColorCollectible.gift_emoji_id);
            xl0Var4.f52043a = org.telegram.messenger.g0.L(11.0f);
            xl0Var4.d();
            this.f46296y = xl0Var4;
            xl0Var4.e(this);
            return;
        }
        int e10 = org.telegram.messenger.l10.e(user);
        if (e10 < 7) {
            int i15 = org.telegram.ui.ActionBar.k6.f28142r8[e10];
            this.f46293s = i15;
            w02 = org.telegram.ui.ActionBar.k6.w0(i15, e6Var);
        } else {
            org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23099q4;
            if (xoVar != null) {
                woVar = xoVar.d(e10);
            }
            if (woVar != null) {
                this.f46293s = -1;
                w02 = woVar.f();
            } else {
                int i16 = org.telegram.ui.ActionBar.k6.f28142r8[0];
                this.f46293s = i16;
                w02 = org.telegram.ui.ActionBar.k6.w0(i16, e6Var);
            }
        }
        this.f46292r.n(w02);
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
        xl0 a10 = xl0.a(i12, e10);
        a10.f52043a = org.telegram.messenger.g0.L(11.0f);
        a10.d();
        this.f46296y = a10;
    }

    @Override
    public final void updateColors() {
        int i3;
        int i10;
        Paint paint;
        int i11;
        boolean z10 = this.f46287b;
        if (z10) {
            i3 = org.telegram.ui.ActionBar.k6.f28043m6;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f28121q6;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        if (!this.E || this.F != w02) {
            this.E = true;
            this.F = w02;
            this.f46289e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f28121q6;
        }
        this.f46290f.n(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        if (this.f46292r != null && (paint = this.f46291n) != null && (i11 = this.f46293s) != -1) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
            this.f46292r.n(w03);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w03));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
