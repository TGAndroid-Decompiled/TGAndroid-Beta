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
public final class c20 extends View implements org.telegram.ui.ActionBar.a6 {
    public static final TextPaint M = new TextPaint(1);
    public static final Paint N = new Paint(1);
    public boolean D;
    public long E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.f6 G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public boolean K;
    public int L;
    public final String f32385a;
    public final long f32386b;
    public final String f32387c;
    public final boolean d;
    public final Drawable f32388e;
    public final RectF f32389f;
    public final ImageReceiver h;
    public final StaticLayout f32390n;
    public final w8 f32391r;
    public final org.telegram.messenger.d5 f32392s;
    public final int f32393w;
    public final float f32394x;
    public float f32395y;

    public c20(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (!this.D) {
            return;
        }
        this.D = false;
        this.E = System.currentTimeMillis();
        invalidate();
    }

    public final void b() {
        if (this.D) {
            return;
        }
        this.D = true;
        this.E = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b10 = this.f32391r.b();
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.05f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ri, f6Var);
        int red = Color.red(r12);
        int[] iArr = this.F;
        iArr[0] = red;
        iArr[1] = Color.red(b10);
        iArr[2] = Color.green(r12);
        iArr[3] = Color.green(b10);
        iArr[4] = Color.blue(r12);
        iArr[5] = Color.blue(b10);
        iArr[6] = Color.alpha(r12);
        iArr[7] = Color.alpha(b10);
        if (!this.K || w02 != this.L) {
            this.K = true;
            this.L = w02;
            this.f32388e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        N.setColor(r12);
    }

    public org.telegram.messenger.d5 getContact() {
        return this.f32392s;
    }

    public String getCountryIso2() {
        return this.f32385a;
    }

    public String getKey() {
        return this.f32387c;
    }

    public long getUid() {
        return this.f32386b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i7;
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
        boolean z9 = this.D;
        if ((z9 && this.f32395y != 1.0f) || (!z9 && this.f32395y != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.E;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.D) {
                float f18 = (((float) currentTimeMillis) / 120.0f) + this.f32395y;
                this.f32395y = f18;
                if (f18 >= 1.0f) {
                    this.f32395y = 1.0f;
                }
            } else {
                float f19 = this.f32395y - (((float) currentTimeMillis) / 120.0f);
                this.f32395y = f19;
                if (f19 < 0.0f) {
                    this.f32395y = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z10 = this.H;
        if (z10) {
            f10 = 28.0f;
        } else {
            f10 = 32.0f;
        }
        RectF rectF = this.f32389f;
        rectF.set(0.0f, 0.0f, measuredWidth, org.telegram.messenger.g0.L(f10));
        int[] iArr = this.F;
        int i13 = iArr[6];
        float f20 = this.f32395y;
        int argb = Color.argb(i13 + ((int) ((iArr[7] - i13) * f20)), iArr[0] + ((int) ((iArr[1] - i7) * f20)), iArr[2] + ((int) ((iArr[3] - i10) * f20)), iArr[4] + ((int) ((iArr[5] - i11) * f20)));
        Paint paint = N;
        paint.setColor(argb);
        float f21 = 14.0f;
        if (z10) {
            f11 = 14.0f;
        } else {
            f11 = 16.0f;
        }
        float L = org.telegram.messenger.g0.L(f11);
        if (z10) {
            f12 = 14.0f;
        } else {
            f12 = 16.0f;
        }
        canvas.drawRoundRect(rectF, L, org.telegram.messenger.g0.L(f12), paint);
        if (this.f32395y != 1.0f) {
            this.h.h(canvas, null);
        }
        if (this.f32395y != 0.0f) {
            paint.setColor(this.f32391r.b());
            paint.setAlpha((int) (this.f32395y * 255.0f * (Color.alpha(b10) / 255.0f)));
            if (z10) {
                f14 = 14.0f;
            } else {
                f14 = 16.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f14);
            if (z10) {
                f15 = 14.0f;
            } else {
                f15 = 16.0f;
            }
            float L3 = org.telegram.messenger.g0.L(f15);
            if (!z10) {
                f21 = 16.0f;
            }
            canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(f21), paint);
            canvas.save();
            canvas.rotate((1.0f - this.f32395y) * 45.0f, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            float f22 = 11.0f;
            if (z10) {
                f16 = 9.0f;
            } else {
                f16 = 11.0f;
            }
            int L4 = org.telegram.messenger.g0.L(f16);
            if (z10) {
                f22 = 9.0f;
            }
            int L5 = org.telegram.messenger.g0.L(f22);
            float f23 = 21.0f;
            if (z10) {
                f17 = 19.0f;
            } else {
                f17 = 21.0f;
            }
            int L6 = org.telegram.messenger.g0.L(f17);
            if (z10) {
                f23 = 19.0f;
            }
            int L7 = org.telegram.messenger.g0.L(f23);
            Drawable drawable = this.f32388e;
            drawable.setBounds(L4, L5, L6, L7);
            drawable.setAlpha((int) (this.f32395y * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z10) {
            i12 = 26;
        } else {
            i12 = 32;
        }
        float L8 = this.f32394x + org.telegram.messenger.g0.L(i12 + 9);
        if (z10) {
            f13 = 6.0f;
        } else {
            f13 = 8.0f;
        }
        canvas.translate(L8, org.telegram.messenger.g0.L(f13));
        int i14 = org.telegram.ui.ActionBar.k6.Pi;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        M.setColor(i0.a.f(this.f32395y, org.telegram.ui.ActionBar.k6.w0(i14, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J7, f6Var)));
        this.f32390n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f32390n.getText());
        if (this.D) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.hd.M0(2131751599, null)));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        boolean z9 = this.H;
        if (z9) {
            i11 = 20;
        } else {
            i11 = 32;
        }
        int L = org.telegram.messenger.g0.L(i11 + 25) + this.f32393w;
        if (z9) {
            f10 = 28.0f;
        } else {
            f10 = 32.0f;
        }
        setMeasuredDimension(L, org.telegram.messenger.g0.L(f10));
    }

    @Override
    public final void updateColors() {
        try {
            w8 w8Var = this.f32391r;
            if (w8Var != null) {
                int i7 = this.J;
                org.telegram.ui.ActionBar.f6 f6Var = this.G;
                if (i7 == 1) {
                    w8Var.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ek, f6Var));
                } else if (i7 == 2) {
                    w8Var.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T7, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27794a8, f6Var));
                } else if (i7 == 3) {
                    w8Var.h(org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28070p7, f6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public c20(Context context, Object obj, org.telegram.messenger.d5 d5Var, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        char c10;
        int i7;
        String str;
        w8 w8Var;
        String str2;
        org.telegram.messenger.hc hcVar;
        org.telegram.messenger.hc hcVar2;
        TLRPC.Chat chat;
        org.telegram.messenger.hc m10;
        int y10;
        int i10;
        this.f32389f = new RectF();
        this.F = new int[8];
        this.I = true;
        this.G = f6Var;
        this.H = z9;
        this.d = false;
        this.f32392s = d5Var;
        this.f32388e = getResources().getDrawable(2131231032);
        float f10 = z9 ? 13.0f : 14.0f;
        TextPaint textPaint = M;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        w8 w8Var2 = new w8((org.telegram.ui.ActionBar.f6) null);
        this.f32391r = w8Var2;
        w8Var2.u(org.telegram.messenger.g0.L(20.0f));
        boolean z10 = obj instanceof String;
        if (z10) {
            String str3 = (String) obj;
            w8Var2.f39920p = 0.8f;
            switch (str3.hashCode()) {
                case -1716307998:
                    i10 = 2;
                    str3.equals("archived");
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case -1359418551:
                    if (str3.equals("miniapps")) {
                        this.d = true;
                        w8Var2.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T7, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27794a8, f6Var));
                        i10 = 2;
                        this.J = 2;
                        str2 = org.telegram.messenger.hd.M0(2131746805, null);
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        w8Var2.g(6);
                        this.f32386b = -9223372036854775806L;
                        str2 = org.telegram.messenger.hd.M0(2131750775, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        w8Var2.g(5);
                        this.f32386b = -9223372036854775807L;
                        str2 = org.telegram.messenger.hd.M0(2131750721, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        w8Var2.g(4);
                        this.f32386b = Long.MIN_VALUE;
                        str2 = org.telegram.messenger.hd.M0(2131750792, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case -318452137:
                    if (str3.equals("premium")) {
                        this.d = true;
                        w8Var2.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ek, f6Var));
                        this.J = 1;
                        str2 = org.telegram.messenger.hd.M0(2131746779, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        w8Var2.g(24);
                        this.f32386b = -9223372036854775799L;
                        str2 = org.telegram.messenger.hd.M0(2131750728, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        w8Var2.g(8);
                        this.f32386b = -9223372036854775804L;
                        str2 = org.telegram.messenger.hd.M0(2131750802, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        w8Var2.g(10);
                        this.f32386b = -9223372036854775802L;
                        str2 = org.telegram.messenger.hd.M0(2131750720, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        w8Var2.g(9);
                        this.f32386b = -9223372036854775803L;
                        str2 = org.telegram.messenger.hd.M0(2131750737, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        w8Var2.g(23);
                        this.f32386b = -9223372036854775800L;
                        str2 = org.telegram.messenger.hd.M0(2131750777, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        w8Var2.g(7);
                        this.f32386b = -9223372036854775805L;
                        str2 = org.telegram.messenger.hd.M0(2131750801, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
                default:
                    i10 = 2;
                    w8Var2.g(11);
                    this.f32386b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750805, null);
                    break;
            }
            i7 = i10;
            hcVar = null;
            hcVar2 = null;
            w8Var = w8Var2;
            str = "premium";
            c10 = ' ';
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.f32386b = user.f27102id;
                if (org.telegram.messenger.t10.z(user)) {
                    str2 = org.telegram.messenger.hd.M0(2131746265, null);
                    w8Var2.f39920p = 0.8f;
                    w8Var2.g(12);
                } else if (org.telegram.messenger.t10.B(user)) {
                    str2 = org.telegram.messenger.hd.M0(2131745902, null);
                    w8Var2.f39920p = 0.8f;
                    w8Var2.g(1);
                } else {
                    w8Var2.r(user);
                    String j3 = org.telegram.messenger.t10.j(user, true);
                    c10 = ' ';
                    int indexOf = j3.indexOf(32);
                    j3 = indexOf >= 0 ? j3.substring(0, indexOf) : j3;
                    m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24467s0, 1, user);
                    String str4 = j3;
                    chat = user;
                    str2 = str4;
                }
                chat = null;
                m10 = null;
                c10 = ' ';
            } else {
                c10 = ' ';
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    w8Var2.q(chat);
                    this.f32386b = -chat.f26953id;
                    str2 = chat.title;
                    m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24467s0, 1, chat);
                } else {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String F0 = org.telegram.messenger.hd.F0(tL_help_country.iso2);
                        String str5 = tL_help_country.default_name;
                        w8Var2.g(17);
                        w8Var2.u(org.telegram.messenger.g0.L(24.0f));
                        i7 = 2;
                        str = "premium";
                        w8Var2.k(0L, F0, null, null);
                        w8Var2.h(org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28070p7, f6Var)));
                        this.J = 3;
                        this.I = false;
                        w8Var2.f39926w = false;
                        this.f32386b = tL_help_country.default_name.hashCode();
                        this.f32385a = tL_help_country.iso2;
                        hcVar = null;
                        w8Var = w8Var2;
                        str2 = str5;
                    } else {
                        i7 = 2;
                        str = "premium";
                        w8Var2.k(d5Var.f21963a, d5Var.f21969i, d5Var.f21970j, null);
                        w8Var = w8Var2;
                        this.f32386b = d5Var.f21963a;
                        this.f32387c = d5Var.f21964b;
                        if (!TextUtils.isEmpty(d5Var.f21969i)) {
                            str2 = d5Var.f21969i;
                        } else {
                            str2 = d5Var.f21970j;
                        }
                        hcVar = null;
                    }
                    hcVar2 = hcVar;
                }
            }
            hcVar2 = chat;
            i7 = 2;
            w8Var = w8Var2;
            str = "premium";
            hcVar = m10;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        imageReceiver.H0(this);
        imageReceiver.y0(this.I ? 0.0f : org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(z9 ? 28.0f : 32.0f), org.telegram.messenger.g0.L(z9 ? 28.0f : 32.0f));
        if (org.telegram.messenger.g0.Q1()) {
            y10 = org.telegram.messenger.g0.L(398 - (z9 ? (char) 28 : c10)) / i7;
        } else {
            Point point = org.telegram.messenger.g0.f22544q;
            y10 = org.telegram.messenger.camera.q.y((z9 ? (char) 28 : c10) + 132, Math.min(point.x, point.y), i7);
        }
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i6.m(str2.replace('\n', c10), textPaint.getFontMetricsInt(), false, null, 0), textPaint, y10, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f32390n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.f32393w = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f32394x = -staticLayout.getLineLeft(0);
        }
        if (z10 && str.equals((String) obj)) {
            imageReceiver.w0(org.telegram.ui.Cells.h4.b(getContext(), true));
        } else if (z10 && "miniapps".equals((String) obj)) {
            getContext();
            imageReceiver.w0(org.telegram.ui.Cells.h4.a(true));
        } else {
            imageReceiver.p0(hcVar, "50_50", w8Var, 0L, null, hcVar2, 1);
        }
        c();
        org.telegram.messenger.qs.i(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
