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
public final class pl0 extends View implements org.telegram.ui.ActionBar.b6 {
    public boolean D;
    public int E;
    public final int f48737a;
    public final boolean f48738b;
    public final boolean f48739c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final Drawable f48740e;
    public final org.telegram.ui.Components.ny0 f48741f;
    public final org.telegram.ui.ActionBar.u2 h;
    public final Paint f48742n;
    public org.telegram.ui.Components.ny0 f48743r;
    public int f48744s;
    public boolean f48745w;
    public em0 f48746x;
    public em0 f48747y;

    public pl0(int i7, long j3, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        boolean z9;
        boolean z10;
        int i10;
        int i11;
        this.f48742n = new Paint(1);
        this.f48744s = -1;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        this.f48737a = i7;
        if (j3 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f48738b = z9;
        if (z9 && !org.telegram.messenger.t3.V(M0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48739c = z10;
        this.d = g6Var;
        Drawable h = jg.g.h(context, 2131231790);
        this.f48740e = h;
        org.telegram.ui.ActionBar.s6.x(this, h, org.telegram.ui.ActionBar.l6.f28105q6, g6Var, PorterDuff.Mode.SRC_IN);
        if (z9) {
            if (z10) {
                i10 = 2131752546;
            } else {
                i10 = 2131752551;
            }
        } else {
            i10 = 2131752530;
        }
        String M02 = org.telegram.messenger.id.M0(i10, null);
        if (z9 && !z10 && org.telegram.messenger.qp.s1(i7).f24774e7.getInt("boostingappearance", 0) < 3) {
            org.telegram.messenger.gp gpVar = s12.f24874q4;
            int i12 = Integer.MAX_VALUE;
            if (gpVar != null) {
                int min = Math.min(Integer.MAX_VALUE, gpVar.e(false));
                int max = Math.max(0, s12.f24874q4.e(false));
                int min2 = Math.min(min, s12.f24874q4.f());
                int max2 = Math.max(max, s12.f24874q4.f());
                i12 = min2;
                i11 = max2;
            } else {
                i11 = 0;
            }
            int min3 = Math.min(i12, s12.f24875q5);
            int min4 = Math.min(i11, s12.f24875q5);
            org.telegram.messenger.gp gpVar2 = s12.f24884r4;
            if (gpVar2 != null) {
                int min5 = Math.min(min3, gpVar2.e(false));
                int max3 = Math.max(min4, s12.f24884r4.e(false));
                min3 = Math.min(min5, s12.f24884r4.f());
                min4 = Math.max(max3, s12.f24884r4.f());
            }
            int min6 = Math.min(min3, s12.f24885r5);
            int max4 = Math.max(min4, s12.f24885r5);
            int min7 = Math.min(min6, s12.s5);
            int max5 = Math.max(max4, s12.s5);
            int min8 = Math.min(min7, s12.f24903t5);
            int max6 = Math.max(max5, s12.f24903t5);
            int min9 = Math.min(min8, s12.f24911u5);
            int max7 = Math.max(max6, s12.f24911u5);
            int i13 = M0 != null ? M0.level : 0;
            if (i13 < max7) {
                this.h = new org.telegram.ui.ActionBar.u2(Math.max(i13, min9), context, g6Var, true);
            }
        }
        setContentDescription(M02);
        this.f48741f = new org.telegram.ui.Components.ny0(M02, 16.0f, null);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        float L;
        int L2;
        int z9;
        int measuredWidth;
        int z10;
        int measuredWidth2;
        Paint paint;
        float L3;
        int measuredWidth3;
        int L4 = org.telegram.messenger.g0.L(64.0f) / 2;
        if (org.telegram.messenger.id.f23157a0) {
            L4 = getMeasuredWidth() - L4;
        }
        Drawable drawable = this.f48740e;
        bg.s.d(drawable, L4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - org.telegram.messenger.g0.L(171.0f);
        int i10 = 0;
        org.telegram.ui.ActionBar.u2 u2Var = this.h;
        if (u2Var != null) {
            i7 = org.telegram.messenger.g0.L(8.0f) + u2Var.getIntrinsicWidth();
        } else {
            i7 = 0;
        }
        org.telegram.ui.Components.ny0 ny0Var = this.f48741f;
        ny0Var.f36552p = measuredWidth4 - i7;
        if (org.telegram.messenger.id.f23157a0) {
            L = (getMeasuredWidth() - ny0Var.k()) - org.telegram.messenger.g0.L(71.0f);
        } else {
            L = org.telegram.messenger.g0.L(71.0f);
        }
        ny0Var.e(canvas, L, getMeasuredHeight() / 2.0f);
        if (u2Var != null) {
            int k10 = (int) (ny0Var.k() + L + org.telegram.messenger.g0.L(6.0f));
            u2Var.setBounds(k10, 0, k10, getHeight());
            u2Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        boolean z11 = this.f48739c;
        if (z11 && this.f48747y != null) {
            if (org.telegram.messenger.id.f23157a0) {
                measuredWidth3 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f48747y.setBounds(measuredWidth3 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.camera.q.y(11.0f, getMeasuredHeight(), 2), measuredWidth3, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f48747y.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, g6Var));
            this.f48747y.draw(canvas);
        } else if (this.f48746x != null && this.f48747y != null) {
            if (org.telegram.messenger.id.f23157a0) {
                measuredWidth2 = org.telegram.messenger.g0.L(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            }
            this.f48747y.setBounds(measuredWidth2 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.camera.q.y(11.0f, getMeasuredHeight(), 2), measuredWidth2, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            em0 em0Var = this.f48747y;
            float N = org.telegram.messenger.g0.N(3.0f);
            int i11 = org.telegram.ui.ActionBar.l6.f27865d6;
            em0Var.f(N, org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
            this.f48747y.draw(canvas);
            int L5 = measuredWidth2 - org.telegram.messenger.g0.L(18.0f);
            this.f48746x.setBounds(L5 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.camera.q.y(11.0f, getMeasuredHeight(), 2), L5, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.f48746x.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
            this.f48746x.draw(canvas);
        } else if (this.f48743r != null && !z11) {
            float measuredWidth5 = getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f);
            float k11 = ny0Var.k();
            if (u2Var == null) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(12.0f) + u2Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(k11 + L2, getMeasuredWidth() - org.telegram.messenger.g0.L(164.0f)));
            int min2 = (int) Math.min(this.f48743r.k(), min);
            RectF rectF = org.telegram.messenger.g0.P;
            if (org.telegram.messenger.id.f23157a0) {
                z9 = org.telegram.messenger.g0.L(15.0f);
            } else {
                z9 = org.telegram.messenger.k5.z(33.0f, getMeasuredWidth(), min2);
            }
            float f10 = z9;
            float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f)) / 2.0f;
            if (org.telegram.messenger.id.f23157a0) {
                measuredWidth = org.telegram.messenger.g0.L(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(15.0f);
            }
            rectF.set(f10, measuredHeight, measuredWidth, (org.telegram.messenger.g0.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f48742n);
            org.telegram.ui.Components.ny0 ny0Var2 = this.f48743r;
            ny0Var2.f36552p = min;
            if (org.telegram.messenger.id.f23157a0) {
                z10 = org.telegram.messenger.g0.L(24.0f);
            } else {
                z10 = org.telegram.messenger.k5.z(24.0f, getMeasuredWidth(), min2);
            }
            ny0Var2.e(canvas, z10, getMeasuredHeight() / 2.0f);
        }
        if (this.f48745w) {
            if (g6Var != null) {
                paint = g6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.l6.f27988k0;
            }
            Paint paint2 = paint;
            if (org.telegram.messenger.id.f23157a0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (org.telegram.messenger.id.f23157a0) {
                i10 = org.telegram.messenger.g0.L(71.0f);
            }
            canvas.drawLine(L3, measuredHeight2, measuredWidth6 - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f48745w ? 1 : 0), 1073741824));
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
        org.telegram.messenger.fp fpVar = null;
        this.f48743r = new org.telegram.ui.Components.ny0(org.telegram.messenger.i6.m(trim, org.telegram.ui.ActionBar.l6.f28062o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
        em0 em0Var2 = this.f48746x;
        if (em0Var2 != null) {
            em0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z9 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i12 = this.f48737a;
        if (z9) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i13 = em0.f45463j;
            int i14 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f48746x = new em0(i14, i14, i14, tL_emojiStatusCollectible.document_id);
        } else {
            if (org.telegram.messenger.t10.l(user) >= 0) {
                em0Var = em0.c(i12, org.telegram.messenger.t10.l(user));
                em0Var.f45464a = org.telegram.messenger.g0.L(11.0f);
                em0Var.d();
            } else {
                em0Var = null;
            }
            this.f48746x = em0Var;
        }
        em0 em0Var3 = this.f48746x;
        if (em0Var3 != null) {
            em0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z10 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f48742n;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (z10) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            if (g6Var != null) {
                q10 = g6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.l6.I.q();
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
            this.f48743r.n(i7);
            paint.setColor(org.telegram.ui.ActionBar.l6.r1(0.1f, i7));
            em0 em0Var4 = new em0(intValue, i10, i11, tL_peerColorCollectible.gift_emoji_id);
            em0Var4.f45464a = org.telegram.messenger.g0.L(11.0f);
            em0Var4.d();
            this.f48747y = em0Var4;
            em0Var4.e(this);
            return;
        }
        int e10 = org.telegram.messenger.t10.e(user);
        if (e10 < 7) {
            int i15 = org.telegram.ui.ActionBar.l6.f28126r8[e10];
            this.f48744s = i15;
            w02 = org.telegram.ui.ActionBar.l6.w0(i15, g6Var);
        } else {
            org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24874q4;
            if (gpVar != null) {
                fpVar = gpVar.d(e10);
            }
            if (fpVar != null) {
                this.f48744s = -1;
                w02 = fpVar.f();
            } else {
                int i16 = org.telegram.ui.ActionBar.l6.f28126r8[0];
                this.f48744s = i16;
                w02 = org.telegram.ui.ActionBar.l6.w0(i16, g6Var);
            }
        }
        this.f48743r.n(w02);
        paint.setColor(org.telegram.ui.ActionBar.l6.r1(0.1f, w02));
        em0 a10 = em0.a(i12, e10);
        a10.f45464a = org.telegram.messenger.g0.L(11.0f);
        a10.d();
        this.f48747y = a10;
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10;
        Paint paint;
        int i11;
        boolean z9 = this.f48738b;
        if (z9) {
            i7 = org.telegram.ui.ActionBar.l6.f28030m6;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.f28105q6;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        if (!this.D || this.E != w02) {
            this.D = true;
            this.E = w02;
            this.f48740e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        if (z9) {
            i10 = org.telegram.ui.ActionBar.l6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.l6.f28105q6;
        }
        this.f48741f.n(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        if (this.f48743r != null && (paint = this.f48742n) != null && (i11 = this.f48744s) != -1) {
            int w03 = org.telegram.ui.ActionBar.l6.w0(i11, g6Var);
            this.f48743r.n(w03);
            paint.setColor(org.telegram.ui.ActionBar.l6.r1(0.1f, w03));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
