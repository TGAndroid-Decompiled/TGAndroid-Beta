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
public final class c20 extends View implements org.telegram.ui.ActionBar.c6 {
    public static final TextPaint M = new TextPaint(1);
    public static final Paint N = new Paint(1);
    public boolean D;
    public long E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.h6 G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public boolean K;
    public int L;
    public final String f32422a;
    public final long f32423b;
    public final String f32424c;
    public final boolean d;
    public final Drawable f32425e;
    public final RectF f32426f;
    public final ImageReceiver h;
    public final StaticLayout f32427n;
    public final v8 f32428r;
    public final org.telegram.messenger.d5 f32429s;
    public final int f32430w;
    public final float f32431x;
    public float f32432y;

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
        int b10 = this.f32428r.b();
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.G;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.05f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ri, h6Var);
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
            this.f32425e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        N.setColor(r12);
    }

    public org.telegram.messenger.d5 getContact() {
        return this.f32429s;
    }

    public String getCountryIso2() {
        return this.f32422a;
    }

    public String getKey() {
        return this.f32424c;
    }

    public long getUid() {
        return this.f32423b;
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
        if ((z9 && this.f32432y != 1.0f) || (!z9 && this.f32432y != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.E;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.D) {
                float f18 = (((float) currentTimeMillis) / 120.0f) + this.f32432y;
                this.f32432y = f18;
                if (f18 >= 1.0f) {
                    this.f32432y = 1.0f;
                }
            } else {
                float f19 = this.f32432y - (((float) currentTimeMillis) / 120.0f);
                this.f32432y = f19;
                if (f19 < 0.0f) {
                    this.f32432y = 0.0f;
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
        RectF rectF = this.f32426f;
        rectF.set(0.0f, 0.0f, measuredWidth, org.telegram.messenger.g0.L(f10));
        int[] iArr = this.F;
        int i13 = iArr[6];
        float f20 = this.f32432y;
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
        if (this.f32432y != 1.0f) {
            this.h.h(canvas, null);
        }
        if (this.f32432y != 0.0f) {
            paint.setColor(this.f32428r.b());
            paint.setAlpha((int) (this.f32432y * 255.0f * (Color.alpha(b10) / 255.0f)));
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
            canvas.rotate((1.0f - this.f32432y) * 45.0f, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
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
            Drawable drawable = this.f32425e;
            drawable.setBounds(L4, L5, L6, L7);
            drawable.setAlpha((int) (this.f32432y * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z10) {
            i12 = 26;
        } else {
            i12 = 32;
        }
        float L8 = this.f32431x + org.telegram.messenger.g0.L(i12 + 9);
        if (z10) {
            f13 = 6.0f;
        } else {
            f13 = 8.0f;
        }
        canvas.translate(L8, org.telegram.messenger.g0.L(f13));
        int i14 = org.telegram.ui.ActionBar.m6.Pi;
        org.telegram.ui.ActionBar.h6 h6Var = this.G;
        M.setColor(i0.a.f(this.f32432y, org.telegram.ui.ActionBar.m6.w0(i14, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.J7, h6Var)));
        this.f32427n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f32427n.getText());
        if (this.D) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.id.M0(2131751598, null)));
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
        int L = org.telegram.messenger.g0.L(i11 + 25) + this.f32430w;
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
            v8 v8Var = this.f32428r;
            if (v8Var != null) {
                int i7 = this.J;
                org.telegram.ui.ActionBar.h6 h6Var = this.G;
                if (i7 == 1) {
                    v8Var.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ek, h6Var));
                } else if (i7 == 2) {
                    v8Var.i(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.T7, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27835a8, h6Var));
                } else if (i7 == 3) {
                    v8Var.h(org.telegram.ui.ActionBar.m6.r1(0.7f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28111p7, h6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public c20(Context context, Object obj, org.telegram.messenger.d5 d5Var, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        char c10;
        int i7;
        String str;
        v8 v8Var;
        String str2;
        org.telegram.messenger.hc hcVar;
        org.telegram.messenger.hc hcVar2;
        TLRPC.Chat chat;
        org.telegram.messenger.hc m10;
        int y10;
        int i10;
        this.f32426f = new RectF();
        this.F = new int[8];
        this.I = true;
        this.G = h6Var;
        this.H = z9;
        this.d = false;
        this.f32429s = d5Var;
        this.f32425e = getResources().getDrawable(2131231032);
        float f10 = z9 ? 13.0f : 14.0f;
        TextPaint textPaint = M;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        v8 v8Var2 = new v8((org.telegram.ui.ActionBar.h6) null);
        this.f32428r = v8Var2;
        v8Var2.u(org.telegram.messenger.g0.L(20.0f));
        boolean z10 = obj instanceof String;
        if (z10) {
            String str3 = (String) obj;
            v8Var2.f38925p = 0.8f;
            switch (str3.hashCode()) {
                case -1716307998:
                    i10 = 2;
                    str3.equals("archived");
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case -1359418551:
                    if (str3.equals("miniapps")) {
                        this.d = true;
                        v8Var2.i(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.T7, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27835a8, h6Var));
                        i10 = 2;
                        this.J = 2;
                        str2 = org.telegram.messenger.id.M0(2131746806, null);
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        v8Var2.g(6);
                        this.f32423b = -9223372036854775806L;
                        str2 = org.telegram.messenger.id.M0(2131750774, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        v8Var2.g(5);
                        this.f32423b = -9223372036854775807L;
                        str2 = org.telegram.messenger.id.M0(2131750720, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        v8Var2.g(4);
                        this.f32423b = Long.MIN_VALUE;
                        str2 = org.telegram.messenger.id.M0(2131750791, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case -318452137:
                    if (str3.equals("premium")) {
                        this.d = true;
                        v8Var2.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ek, h6Var));
                        this.J = 1;
                        str2 = org.telegram.messenger.id.M0(2131746780, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        v8Var2.g(24);
                        this.f32423b = -9223372036854775799L;
                        str2 = org.telegram.messenger.id.M0(2131750727, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        v8Var2.g(8);
                        this.f32423b = -9223372036854775804L;
                        str2 = org.telegram.messenger.id.M0(2131750801, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        v8Var2.g(10);
                        this.f32423b = -9223372036854775802L;
                        str2 = org.telegram.messenger.id.M0(2131750719, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        v8Var2.g(9);
                        this.f32423b = -9223372036854775803L;
                        str2 = org.telegram.messenger.id.M0(2131750736, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        v8Var2.g(23);
                        this.f32423b = -9223372036854775800L;
                        str2 = org.telegram.messenger.id.M0(2131750776, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        v8Var2.g(7);
                        this.f32423b = -9223372036854775805L;
                        str2 = org.telegram.messenger.id.M0(2131750800, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
                default:
                    i10 = 2;
                    v8Var2.g(11);
                    this.f32423b = -9223372036854775801L;
                    str2 = org.telegram.messenger.id.M0(2131750804, null);
                    break;
            }
            i7 = i10;
            hcVar = null;
            hcVar2 = null;
            v8Var = v8Var2;
            str = "premium";
            c10 = ' ';
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.f32423b = user.f27109id;
                if (org.telegram.messenger.t10.z(user)) {
                    str2 = org.telegram.messenger.id.M0(2131746266, null);
                    v8Var2.f38925p = 0.8f;
                    v8Var2.g(12);
                } else if (org.telegram.messenger.t10.B(user)) {
                    str2 = org.telegram.messenger.id.M0(2131745901, null);
                    v8Var2.f38925p = 0.8f;
                    v8Var2.g(1);
                } else {
                    v8Var2.r(user);
                    String j3 = org.telegram.messenger.t10.j(user, true);
                    c10 = ' ';
                    int indexOf = j3.indexOf(32);
                    j3 = indexOf >= 0 ? j3.substring(0, indexOf) : j3;
                    m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24474s0, 1, user);
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
                    v8Var2.q(chat);
                    this.f32423b = -chat.f26960id;
                    str2 = chat.title;
                    m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24474s0, 1, chat);
                } else {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String F0 = org.telegram.messenger.id.F0(tL_help_country.iso2);
                        String str5 = tL_help_country.default_name;
                        v8Var2.g(17);
                        v8Var2.u(org.telegram.messenger.g0.L(24.0f));
                        i7 = 2;
                        str = "premium";
                        v8Var2.k(0L, F0, null, null);
                        v8Var2.h(org.telegram.ui.ActionBar.m6.r1(0.7f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28111p7, h6Var)));
                        this.J = 3;
                        this.I = false;
                        v8Var2.f38931w = false;
                        this.f32423b = tL_help_country.default_name.hashCode();
                        this.f32422a = tL_help_country.iso2;
                        hcVar = null;
                        v8Var = v8Var2;
                        str2 = str5;
                    } else {
                        i7 = 2;
                        str = "premium";
                        v8Var2.k(d5Var.f21990a, d5Var.f21996i, d5Var.f21997j, null);
                        v8Var = v8Var2;
                        this.f32423b = d5Var.f21990a;
                        this.f32424c = d5Var.f21991b;
                        if (!TextUtils.isEmpty(d5Var.f21996i)) {
                            str2 = d5Var.f21996i;
                        } else {
                            str2 = d5Var.f21997j;
                        }
                        hcVar = null;
                    }
                    hcVar2 = hcVar;
                }
            }
            hcVar2 = chat;
            i7 = 2;
            v8Var = v8Var2;
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
            Point point = org.telegram.messenger.g0.f22567q;
            y10 = org.telegram.messenger.camera.q.y((z9 ? (char) 28 : c10) + 132, Math.min(point.x, point.y), i7);
        }
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i6.m(str2.replace('\n', c10), textPaint.getFontMetricsInt(), false, null, 0), textPaint, y10, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f32427n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.f32430w = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f32431x = -staticLayout.getLineLeft(0);
        }
        if (z10 && str.equals((String) obj)) {
            imageReceiver.w0(org.telegram.ui.Cells.h4.b(getContext(), true));
        } else if (z10 && "miniapps".equals((String) obj)) {
            getContext();
            imageReceiver.w0(org.telegram.ui.Cells.h4.a(true));
        } else {
            imageReceiver.p0(hcVar, "50_50", v8Var, 0L, null, hcVar2, 1);
        }
        c();
        org.telegram.messenger.qs.i(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
