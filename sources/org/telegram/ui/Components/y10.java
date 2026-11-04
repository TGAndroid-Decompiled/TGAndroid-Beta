package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class y10 extends View implements org.telegram.ui.ActionBar.z5 {
    public static final TextPaint N = new TextPaint(1);
    public static final Paint O = new Paint(1);
    public boolean E;
    public long F;
    public final int[] G;
    public final org.telegram.ui.ActionBar.e6 H;
    public final boolean I;
    public final boolean J;
    public final int K;
    public boolean L;
    public int M;
    public final String f40569a;
    public final long f40570b;
    public final String f40571c;
    public final boolean d;
    public final Drawable f40572e;
    public final RectF f40573f;
    public final ImageReceiver h;
    public final StaticLayout f40574n;
    public final u8 f40575r;
    public final org.telegram.messenger.d5 f40576s;
    public final int f40577w;
    public final float f40578x;
    public float f40579y;

    public y10(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (!this.E) {
            return;
        }
        this.E = false;
        this.F = System.currentTimeMillis();
        invalidate();
    }

    public final void b() {
        if (this.E) {
            return;
        }
        this.E = true;
        this.F = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b10 = this.f40575r.b();
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.H;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.05f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ri, e6Var);
        int red = Color.red(r12);
        int[] iArr = this.G;
        iArr[0] = red;
        iArr[1] = Color.red(b10);
        iArr[2] = Color.green(r12);
        iArr[3] = Color.green(b10);
        iArr[4] = Color.blue(r12);
        iArr[5] = Color.blue(b10);
        iArr[6] = Color.alpha(r12);
        iArr[7] = Color.alpha(b10);
        if (!this.L || w02 != this.M) {
            this.L = true;
            this.M = w02;
            this.f40572e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        O.setColor(r12);
    }

    public org.telegram.messenger.d5 getContact() {
        return this.f40576s;
    }

    public String getCountryIso2() {
        return this.f40569a;
    }

    public String getKey() {
        return this.f40571c;
    }

    public long getUid() {
        return this.f40570b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i3;
        int i10;
        int i11;
        float f11;
        float f12;
        int i12;
        float f13;
        int b10;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z10 = this.E;
        if ((z10 && this.f40579y != 1.0f) || (!z10 && this.f40579y != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.F;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.E) {
                float f18 = (((float) currentTimeMillis) / 120.0f) + this.f40579y;
                this.f40579y = f18;
                if (f18 >= 1.0f) {
                    this.f40579y = 1.0f;
                }
            } else {
                float f19 = this.f40579y - (((float) currentTimeMillis) / 120.0f);
                this.f40579y = f19;
                if (f19 < 0.0f) {
                    this.f40579y = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z11 = this.I;
        if (z11) {
            f10 = 28.0f;
        } else {
            f10 = 32.0f;
        }
        RectF rectF = this.f40573f;
        rectF.set(0.0f, 0.0f, measuredWidth, org.telegram.messenger.g0.L(f10));
        int[] iArr = this.G;
        int i13 = iArr[6];
        float f20 = this.f40579y;
        int argb = Color.argb(i13 + ((int) ((iArr[7] - i13) * f20)), iArr[0] + ((int) ((iArr[1] - i3) * f20)), iArr[2] + ((int) ((iArr[3] - i10) * f20)), iArr[4] + ((int) ((iArr[5] - i11) * f20)));
        Paint paint = O;
        paint.setColor(argb);
        float f21 = 14.0f;
        if (z11) {
            f11 = 14.0f;
        } else {
            f11 = 16.0f;
        }
        float L = org.telegram.messenger.g0.L(f11);
        if (z11) {
            f12 = 14.0f;
        } else {
            f12 = 16.0f;
        }
        canvas.drawRoundRect(rectF, L, org.telegram.messenger.g0.L(f12), paint);
        if (this.f40579y != 1.0f) {
            this.h.h(canvas, null);
        }
        if (this.f40579y != 0.0f) {
            paint.setColor(this.f40575r.b());
            paint.setAlpha((int) (this.f40579y * 255.0f * (Color.alpha(b10) / 255.0f)));
            if (z11) {
                f14 = 14.0f;
            } else {
                f14 = 16.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f14);
            if (z11) {
                f15 = 14.0f;
            } else {
                f15 = 16.0f;
            }
            float L3 = org.telegram.messenger.g0.L(f15);
            if (!z11) {
                f21 = 16.0f;
            }
            canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(f21), paint);
            canvas.save();
            canvas.rotate((1.0f - this.f40579y) * 45.0f, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            float f22 = 11.0f;
            if (z11) {
                f16 = 9.0f;
            } else {
                f16 = 11.0f;
            }
            int L4 = org.telegram.messenger.g0.L(f16);
            if (z11) {
                f22 = 9.0f;
            }
            int L5 = org.telegram.messenger.g0.L(f22);
            float f23 = 21.0f;
            if (z11) {
                f17 = 19.0f;
            } else {
                f17 = 21.0f;
            }
            int L6 = org.telegram.messenger.g0.L(f17);
            if (z11) {
                f23 = 19.0f;
            }
            int L7 = org.telegram.messenger.g0.L(f23);
            Drawable drawable = this.f40572e;
            drawable.setBounds(L4, L5, L6, L7);
            drawable.setAlpha((int) (this.f40579y * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z11) {
            i12 = 26;
        } else {
            i12 = 32;
        }
        float L8 = this.f40578x + org.telegram.messenger.g0.L(i12 + 9);
        if (z11) {
            f13 = 6.0f;
        } else {
            f13 = 8.0f;
        }
        canvas.translate(L8, org.telegram.messenger.g0.L(f13));
        int i14 = org.telegram.ui.ActionBar.k6.Pi;
        org.telegram.ui.ActionBar.e6 e6Var = this.H;
        N.setColor(i0.a.f(this.f40579y, org.telegram.ui.ActionBar.k6.w0(i14, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J7, e6Var)));
        this.f40574n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f40574n.getText());
        if (this.E) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.bd.M0(2131751599, null)));
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        float f10;
        boolean z10 = this.I;
        if (z10) {
            i11 = 20;
        } else {
            i11 = 32;
        }
        int L = org.telegram.messenger.g0.L(i11 + 25) + this.f40577w;
        if (z10) {
            f10 = 28.0f;
        } else {
            f10 = 32.0f;
        }
        setMeasuredDimension(L, org.telegram.messenger.g0.L(f10));
    }

    @Override
    public final void updateColors() {
        try {
            u8 u8Var = this.f40575r;
            if (u8Var != null) {
                int i3 = this.K;
                org.telegram.ui.ActionBar.e6 e6Var = this.H;
                if (i3 == 1) {
                    u8Var.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ek, e6Var));
                } else if (i3 == 2) {
                    u8Var.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T7, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27825a8, e6Var));
                } else if (i3 == 3) {
                    u8Var.h(org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28102p7, e6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public y10(Context context, Object obj, org.telegram.messenger.d5 d5Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        char c2;
        int i3;
        String str;
        u8 u8Var;
        String str2;
        org.telegram.messenger.ac acVar;
        org.telegram.messenger.ac acVar2;
        TLRPC.Chat chat;
        org.telegram.messenger.ac m10;
        int y9;
        int i10;
        this.f40573f = new RectF();
        this.G = new int[8];
        this.J = true;
        this.H = e6Var;
        this.I = z10;
        this.d = false;
        this.f40576s = d5Var;
        this.f40572e = getResources().getDrawable(2131231032);
        float f10 = z10 ? 13.0f : 14.0f;
        TextPaint textPaint = N;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        u8 u8Var2 = new u8((org.telegram.ui.ActionBar.e6) null);
        this.f40575r = u8Var2;
        u8Var2.u(org.telegram.messenger.g0.L(20.0f));
        boolean z11 = obj instanceof String;
        if (z11) {
            String str3 = (String) obj;
            u8Var2.f38691p = 0.8f;
            switch (str3.hashCode()) {
                case -1716307998:
                    i10 = 2;
                    str3.equals("archived");
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -1359418551:
                    if (str3.equals("miniapps")) {
                        this.d = true;
                        u8Var2.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T7, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27825a8, e6Var));
                        i10 = 2;
                        this.K = 2;
                        str2 = org.telegram.messenger.bd.M0(2131746814, null);
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        u8Var2.g(6);
                        this.f40570b = -9223372036854775806L;
                        str2 = org.telegram.messenger.bd.M0(2131750775, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        u8Var2.g(5);
                        this.f40570b = -9223372036854775807L;
                        str2 = org.telegram.messenger.bd.M0(2131750721, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        u8Var2.g(4);
                        this.f40570b = Long.MIN_VALUE;
                        str2 = org.telegram.messenger.bd.M0(2131750792, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -318452137:
                    if (str3.equals("premium")) {
                        this.d = true;
                        u8Var2.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ek, e6Var));
                        this.K = 1;
                        str2 = org.telegram.messenger.bd.M0(2131746788, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        u8Var2.g(24);
                        this.f40570b = -9223372036854775799L;
                        str2 = org.telegram.messenger.bd.M0(2131750728, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        u8Var2.g(8);
                        this.f40570b = -9223372036854775804L;
                        str2 = org.telegram.messenger.bd.M0(2131750802, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        u8Var2.g(10);
                        this.f40570b = -9223372036854775802L;
                        str2 = org.telegram.messenger.bd.M0(2131750720, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        u8Var2.g(9);
                        this.f40570b = -9223372036854775803L;
                        str2 = org.telegram.messenger.bd.M0(2131750737, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        u8Var2.g(23);
                        this.f40570b = -9223372036854775800L;
                        str2 = org.telegram.messenger.bd.M0(2131750777, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        u8Var2.g(7);
                        this.f40570b = -9223372036854775805L;
                        str2 = org.telegram.messenger.bd.M0(2131750801, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                default:
                    i10 = 2;
                    u8Var2.g(11);
                    this.f40570b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
            }
            i3 = i10;
            acVar = null;
            acVar2 = null;
            u8Var = u8Var2;
            str = "premium";
            c2 = ' ';
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.f40570b = user.f27150id;
                if (org.telegram.messenger.l10.z(user)) {
                    str2 = org.telegram.messenger.bd.M0(2131746274, null);
                    u8Var2.f38691p = 0.8f;
                    u8Var2.g(12);
                } else if (org.telegram.messenger.l10.B(user)) {
                    str2 = org.telegram.messenger.bd.M0(2131745911, null);
                    u8Var2.f38691p = 0.8f;
                    u8Var2.g(1);
                } else {
                    u8Var2.r(user);
                    String j10 = org.telegram.messenger.l10.j(user, true);
                    c2 = ' ';
                    int indexOf = j10.indexOf(32);
                    j10 = indexOf >= 0 ? j10.substring(0, indexOf) : j10;
                    m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.f22829t0, 1, user);
                    String str4 = j10;
                    chat = user;
                    str2 = str4;
                }
                chat = null;
                m10 = null;
                c2 = ' ';
            } else {
                c2 = ' ';
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    u8Var2.q(chat);
                    this.f40570b = -chat.f27001id;
                    str2 = chat.title;
                    m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.f22829t0, 1, chat);
                } else {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String F0 = org.telegram.messenger.bd.F0(tL_help_country.iso2);
                        String str5 = tL_help_country.default_name;
                        u8Var2.g(17);
                        u8Var2.u(org.telegram.messenger.g0.L(24.0f));
                        i3 = 2;
                        str = "premium";
                        u8Var2.k(0L, F0, null, null);
                        u8Var2.h(org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28102p7, e6Var)));
                        this.K = 3;
                        this.J = false;
                        u8Var2.f38697w = false;
                        this.f40570b = tL_help_country.default_name.hashCode();
                        this.f40569a = tL_help_country.iso2;
                        acVar = null;
                        u8Var = u8Var2;
                        str2 = str5;
                    } else {
                        i3 = 2;
                        str = "premium";
                        u8Var2.k(d5Var.f22147a, d5Var.f22153i, d5Var.f22154j, null);
                        u8Var = u8Var2;
                        this.f40570b = d5Var.f22147a;
                        this.f40571c = d5Var.f22148b;
                        if (!TextUtils.isEmpty(d5Var.f22153i)) {
                            str2 = d5Var.f22153i;
                        } else {
                            str2 = d5Var.f22154j;
                        }
                        acVar = null;
                    }
                    acVar2 = acVar;
                }
            }
            acVar2 = chat;
            i3 = 2;
            u8Var = u8Var2;
            str = "premium";
            acVar = m10;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        imageReceiver.H0(this);
        imageReceiver.y0(this.J ? 0.0f : org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f), org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f));
        if (org.telegram.messenger.g0.Q1()) {
            y9 = org.telegram.messenger.g0.L(398 - (z10 ? (char) 28 : c2)) / i3;
        } else {
            Point point = org.telegram.messenger.g0.f22608q;
            y9 = org.telegram.messenger.camera.q.y((z10 ? (char) 28 : c2) + 132, Math.min(point.x, point.y), i3);
        }
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i6.m(str2.replace('\n', c2), textPaint.getFontMetricsInt(), false, null, 0), textPaint, y9, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f40574n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.f40577w = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f40578x = -staticLayout.getLineLeft(0);
        }
        if (z11 && str.equals((String) obj)) {
            imageReceiver.w0(org.telegram.ui.Cells.h4.b(getContext(), true));
        } else if (z11 && "miniapps".equals((String) obj)) {
            getContext();
            imageReceiver.w0(org.telegram.ui.Cells.h4.a(true));
        } else {
            imageReceiver.p0(acVar, "50_50", u8Var, 0L, null, acVar2, 1);
        }
        c();
        org.telegram.messenger.hs.i(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
