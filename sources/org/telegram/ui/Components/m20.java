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
public final class m20 extends View implements org.telegram.ui.ActionBar.c6 {
    public static final TextPaint N = new TextPaint(1);
    public static final Paint O = new Paint(1);
    public boolean E;
    public long F;
    public final int[] G;
    public final org.telegram.ui.ActionBar.i6 H;
    public final boolean I;
    public final boolean J;
    public final int K;
    public boolean L;
    public int M;
    public final String f37331a;
    public final long f37332b;
    public final String f37333c;
    public final boolean d;
    public final Drawable f37334e;
    public final RectF f37335f;
    public final ImageReceiver h;
    public final StaticLayout f37336n;
    public final b9 f37337r;
    public final org.telegram.messenger.f5 f37338s;
    public final int f37339w;
    public final float f37340x;
    public float f37341y;

    public m20(Context context, Object obj) {
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
        int b10 = this.f37337r.b();
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.H;
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.05f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ui, i6Var);
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
            this.f37334e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        O.setColor(r12);
    }

    public org.telegram.messenger.f5 getContact() {
        return this.f37338s;
    }

    public String getCountryIso2() {
        return this.f37331a;
    }

    public String getKey() {
        return this.f37333c;
    }

    public long getUid() {
        return this.f37332b;
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
        boolean z10 = this.E;
        if ((z10 && this.f37341y != 1.0f) || (!z10 && this.f37341y != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.F;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.E) {
                float f18 = (((float) currentTimeMillis) / 120.0f) + this.f37341y;
                this.f37341y = f18;
                if (f18 >= 1.0f) {
                    this.f37341y = 1.0f;
                }
            } else {
                float f19 = this.f37341y - (((float) currentTimeMillis) / 120.0f);
                this.f37341y = f19;
                if (f19 < 0.0f) {
                    this.f37341y = 0.0f;
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
        RectF rectF = this.f37335f;
        rectF.set(0.0f, 0.0f, measuredWidth, org.telegram.messenger.g0.L(f10));
        int[] iArr = this.G;
        int i13 = iArr[6];
        float f20 = this.f37341y;
        int argb = Color.argb(i13 + ((int) ((iArr[7] - i13) * f20)), iArr[0] + ((int) ((iArr[1] - i7) * f20)), iArr[2] + ((int) ((iArr[3] - i10) * f20)), iArr[4] + ((int) ((iArr[5] - i11) * f20)));
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
        if (this.f37341y != 1.0f) {
            this.h.h(canvas, null);
        }
        if (this.f37341y != 0.0f) {
            paint.setColor(this.f37337r.b());
            paint.setAlpha((int) (this.f37341y * 255.0f * (Color.alpha(b10) / 255.0f)));
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
            canvas.rotate((1.0f - this.f37341y) * 45.0f, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
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
            Drawable drawable = this.f37334e;
            drawable.setBounds(L4, L5, L6, L7);
            drawable.setAlpha((int) (this.f37341y * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z11) {
            i12 = 26;
        } else {
            i12 = 32;
        }
        float L8 = this.f37340x + org.telegram.messenger.g0.L(i12 + 9);
        if (z11) {
            f13 = 6.0f;
        } else {
            f13 = 8.0f;
        }
        canvas.translate(L8, org.telegram.messenger.g0.L(f13));
        int i14 = org.telegram.ui.ActionBar.n6.Si;
        org.telegram.ui.ActionBar.i6 i6Var = this.H;
        N.setColor(i0.a.f(this.f37341y, org.telegram.ui.ActionBar.n6.w0(i14, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.J7, i6Var)));
        this.f37336n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f37336n.getText());
        if (this.E) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.gd.M0(2131751587, null)));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        boolean z10 = this.I;
        if (z10) {
            i11 = 20;
        } else {
            i11 = 32;
        }
        int L = org.telegram.messenger.g0.L(i11 + 25) + this.f37339w;
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
            b9 b9Var = this.f37337r;
            if (b9Var != null) {
                int i7 = this.K;
                org.telegram.ui.ActionBar.i6 i6Var = this.H;
                if (i7 == 1) {
                    b9Var.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Hk, i6Var));
                } else if (i7 == 2) {
                    b9Var.i(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.T7, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29338a8, i6Var));
                } else if (i7 == 3) {
                    b9Var.h(org.telegram.ui.ActionBar.n6.r1(0.7f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29615p7, i6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public m20(Context context, Object obj, org.telegram.messenger.f5 f5Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        char c10;
        int i7;
        String str;
        b9 b9Var;
        String str2;
        org.telegram.messenger.fc fcVar;
        org.telegram.messenger.fc fcVar2;
        TLRPC.Chat chat;
        org.telegram.messenger.fc m10;
        int z11;
        int i10;
        this.f37335f = new RectF();
        this.G = new int[8];
        this.J = true;
        this.H = i6Var;
        this.I = z10;
        this.d = false;
        this.f37338s = f5Var;
        this.f37334e = getResources().getDrawable(2131231032);
        float f10 = z10 ? 13.0f : 14.0f;
        TextPaint textPaint = N;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        b9 b9Var2 = new b9((org.telegram.ui.ActionBar.i6) null);
        this.f37337r = b9Var2;
        b9Var2.u(org.telegram.messenger.g0.L(20.0f));
        boolean z12 = obj instanceof String;
        if (z12) {
            String str3 = (String) obj;
            b9Var2.f33601p = 0.8f;
            switch (str3.hashCode()) {
                case -1716307998:
                    i10 = 2;
                    str3.equals("archived");
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case -1359418551:
                    if (str3.equals("miniapps")) {
                        this.d = true;
                        b9Var2.i(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.T7, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29338a8, i6Var));
                        i10 = 2;
                        this.K = 2;
                        str2 = org.telegram.messenger.gd.M0(2131746613, null);
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        b9Var2.g(6);
                        this.f37332b = -9223372036854775806L;
                        str2 = org.telegram.messenger.gd.M0(2131750763, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        b9Var2.g(5);
                        this.f37332b = -9223372036854775807L;
                        str2 = org.telegram.messenger.gd.M0(2131750707, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        b9Var2.g(4);
                        this.f37332b = Long.MIN_VALUE;
                        str2 = org.telegram.messenger.gd.M0(2131750780, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case -318452137:
                    if (str3.equals("premium")) {
                        this.d = true;
                        b9Var2.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Hk, i6Var));
                        this.K = 1;
                        str2 = org.telegram.messenger.gd.M0(2131746587, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        b9Var2.g(24);
                        this.f37332b = -9223372036854775799L;
                        str2 = org.telegram.messenger.gd.M0(2131750716, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        b9Var2.g(8);
                        this.f37332b = -9223372036854775804L;
                        str2 = org.telegram.messenger.gd.M0(2131750790, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        b9Var2.g(10);
                        this.f37332b = -9223372036854775802L;
                        str2 = org.telegram.messenger.gd.M0(2131750706, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        b9Var2.g(9);
                        this.f37332b = -9223372036854775803L;
                        str2 = org.telegram.messenger.gd.M0(2131750725, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        b9Var2.g(23);
                        this.f37332b = -9223372036854775800L;
                        str2 = org.telegram.messenger.gd.M0(2131750765, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        b9Var2.g(7);
                        this.f37332b = -9223372036854775805L;
                        str2 = org.telegram.messenger.gd.M0(2131750789, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
                default:
                    i10 = 2;
                    b9Var2.g(11);
                    this.f37332b = -9223372036854775801L;
                    str2 = org.telegram.messenger.gd.M0(2131750793, null);
                    break;
            }
            i7 = i10;
            fcVar = null;
            fcVar2 = null;
            b9Var = b9Var2;
            str = "premium";
            c10 = ' ';
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.f37332b = user.f28552id;
                if (org.telegram.messenger.o10.A(user)) {
                    str2 = org.telegram.messenger.gd.M0(2131746071, null);
                    b9Var2.f33601p = 0.8f;
                    b9Var2.g(12);
                } else if (org.telegram.messenger.o10.C(user)) {
                    str2 = org.telegram.messenger.gd.M0(2131745706, null);
                    b9Var2.f33601p = 0.8f;
                    b9Var2.g(1);
                } else {
                    b9Var2.r(user);
                    String k10 = org.telegram.messenger.o10.k(user, true);
                    c10 = ' ';
                    int indexOf = k10.indexOf(32);
                    k10 = indexOf >= 0 ? k10.substring(0, indexOf) : k10;
                    m10 = org.telegram.messenger.fc.m(org.telegram.messenger.j10.f24770t0, 1, user);
                    String str4 = k10;
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
                    b9Var2.q(chat);
                    this.f37332b = -chat.f28403id;
                    str2 = chat.title;
                    m10 = org.telegram.messenger.fc.m(org.telegram.messenger.j10.f24770t0, 1, chat);
                } else {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String F0 = org.telegram.messenger.gd.F0(tL_help_country.iso2);
                        String str5 = tL_help_country.default_name;
                        b9Var2.g(17);
                        b9Var2.u(org.telegram.messenger.g0.L(24.0f));
                        i7 = 2;
                        str = "premium";
                        b9Var2.k(0L, F0, null, null);
                        b9Var2.h(org.telegram.ui.ActionBar.n6.r1(0.7f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29615p7, i6Var)));
                        this.K = 3;
                        this.J = false;
                        b9Var2.f33607w = false;
                        this.f37332b = tL_help_country.default_name.hashCode();
                        this.f37331a = tL_help_country.iso2;
                        fcVar = null;
                        b9Var = b9Var2;
                        str2 = str5;
                    } else {
                        i7 = 2;
                        str = "premium";
                        b9Var2.k(f5Var.f23837a, f5Var.f23843i, f5Var.f23844j, null);
                        b9Var = b9Var2;
                        this.f37332b = f5Var.f23837a;
                        this.f37333c = f5Var.f23838b;
                        if (!TextUtils.isEmpty(f5Var.f23843i)) {
                            str2 = f5Var.f23843i;
                        } else {
                            str2 = f5Var.f23844j;
                        }
                        fcVar = null;
                    }
                    fcVar2 = fcVar;
                }
            }
            fcVar2 = chat;
            i7 = 2;
            b9Var = b9Var2;
            str = "premium";
            fcVar = m10;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        imageReceiver.H0(this);
        imageReceiver.y0(this.J ? 0.0f : org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f), org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f));
        if (org.telegram.messenger.g0.Q1()) {
            z11 = org.telegram.messenger.g0.L(398 - (z10 ? (char) 28 : c10)) / i7;
        } else {
            Point point = org.telegram.messenger.g0.f24118q;
            z11 = org.telegram.messenger.n10.z((z10 ? (char) 28 : c10) + 132, Math.min(point.x, point.y), i7);
        }
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.j6.m(str2.replace('\n', c10), textPaint.getFontMetricsInt(), false, null, 0), textPaint, z11, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f37336n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.f37339w = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f37340x = -staticLayout.getLineLeft(0);
        }
        if (z12 && str.equals((String) obj)) {
            imageReceiver.w0(org.telegram.ui.Cells.i4.b(getContext(), true));
        } else if (z12 && "miniapps".equals((String) obj)) {
            getContext();
            imageReceiver.w0(org.telegram.ui.Cells.i4.a(true));
        } else {
            imageReceiver.p0(fcVar, "50_50", b9Var, 0L, null, fcVar2, 1);
        }
        c();
        org.telegram.messenger.ks.i(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
