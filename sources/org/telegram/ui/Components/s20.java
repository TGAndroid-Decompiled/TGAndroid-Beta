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
public final class s20 extends View implements org.telegram.ui.ActionBar.k6 {
    public static final TextPaint M = new TextPaint(1);
    public static final Paint N = new Paint(1);
    public boolean D;
    public long E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.p6 G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public boolean K;
    public int L;
    public final String f30100a;
    public final long f30101b;
    public final String f30102c;
    public final boolean d;
    public final Drawable e;
    public final RectF f30103f;
    public final ImageReceiver h;
    public final StaticLayout f30104n;
    public final r8 f30105r;
    public final org.telegram.messenger.f5 f30106s;
    public final int f30107w;
    public final float f30108x;
    public float f30109y;

    public s20(Context context, Object obj) {
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
        int b10 = this.f30105r.b();
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.G;
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.05f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ri, p6Var);
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
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        N.setColor(r12);
    }

    public org.telegram.messenger.f5 getContact() {
        return this.f30106s;
    }

    public String getCountryIso2() {
        return this.f30100a;
    }

    public String getKey() {
        return this.f30102c;
    }

    public long getUid() {
        return this.f30101b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        float f12;
        int b10;
        float f13;
        float f14;
        float f15;
        float f16;
        boolean z10 = this.D;
        if ((z10 && this.f30109y != 1.0f) || (!z10 && this.f30109y != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.E;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.D) {
                float f17 = (((float) currentTimeMillis) / 120.0f) + this.f30109y;
                this.f30109y = f17;
                if (f17 >= 1.0f) {
                    this.f30109y = 1.0f;
                }
            } else {
                float f18 = this.f30109y - (((float) currentTimeMillis) / 120.0f);
                this.f30109y = f18;
                if (f18 < 0.0f) {
                    this.f30109y = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z11 = this.H;
        if (z11) {
            f7 = 28.0f;
        } else {
            f7 = 32.0f;
        }
        RectF rectF = this.f30103f;
        rectF.set(0.0f, 0.0f, measuredWidth, org.telegram.messenger.i0.L(f7));
        int[] iArr = this.F;
        int i14 = iArr[6];
        float f19 = this.f30109y;
        int argb = Color.argb(i14 + ((int) ((iArr[7] - i14) * f19)), iArr[0] + ((int) ((iArr[1] - i10) * f19)), iArr[2] + ((int) ((iArr[3] - i11) * f19)), iArr[4] + ((int) ((iArr[5] - i12) * f19)));
        Paint paint = N;
        paint.setColor(argb);
        float f20 = 14.0f;
        if (z11) {
            f10 = 14.0f;
        } else {
            f10 = 16.0f;
        }
        float L = org.telegram.messenger.i0.L(f10);
        if (z11) {
            f11 = 14.0f;
        } else {
            f11 = 16.0f;
        }
        canvas.drawRoundRect(rectF, L, org.telegram.messenger.i0.L(f11), paint);
        if (this.f30109y != 1.0f) {
            this.h.h(canvas, null);
        }
        if (this.f30109y != 0.0f) {
            paint.setColor(this.f30105r.b());
            paint.setAlpha((int) (this.f30109y * 255.0f * (Color.alpha(b10) / 255.0f)));
            if (z11) {
                f13 = 14.0f;
            } else {
                f13 = 16.0f;
            }
            float L2 = org.telegram.messenger.i0.L(f13);
            if (z11) {
                f14 = 14.0f;
            } else {
                f14 = 16.0f;
            }
            float L3 = org.telegram.messenger.i0.L(f14);
            if (!z11) {
                f20 = 16.0f;
            }
            canvas.drawCircle(L2, L3, org.telegram.messenger.i0.L(f20), paint);
            canvas.save();
            canvas.rotate((1.0f - this.f30109y) * 45.0f, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
            float f21 = 11.0f;
            if (z11) {
                f15 = 9.0f;
            } else {
                f15 = 11.0f;
            }
            int L4 = org.telegram.messenger.i0.L(f15);
            if (z11) {
                f21 = 9.0f;
            }
            int L5 = org.telegram.messenger.i0.L(f21);
            float f22 = 21.0f;
            if (z11) {
                f16 = 19.0f;
            } else {
                f16 = 21.0f;
            }
            int L6 = org.telegram.messenger.i0.L(f16);
            if (z11) {
                f22 = 19.0f;
            }
            int L7 = org.telegram.messenger.i0.L(f22);
            Drawable drawable = this.e;
            drawable.setBounds(L4, L5, L6, L7);
            drawable.setAlpha((int) (this.f30109y * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z11) {
            i13 = 26;
        } else {
            i13 = 32;
        }
        float L8 = this.f30108x + org.telegram.messenger.i0.L(i13 + 9);
        if (z11) {
            f12 = 6.0f;
        } else {
            f12 = 8.0f;
        }
        canvas.translate(L8, org.telegram.messenger.i0.L(f12));
        int i15 = org.telegram.ui.ActionBar.t6.Pi;
        org.telegram.ui.ActionBar.p6 p6Var = this.G;
        M.setColor(i0.b.f(this.f30109y, org.telegram.ui.ActionBar.t6.w0(i15, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.J7, p6Var)));
        this.f30104n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f30104n.getText());
        if (this.D) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.cd.L0(2131751599, null)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        boolean z10 = this.H;
        if (z10) {
            i12 = 20;
        } else {
            i12 = 32;
        }
        int L = org.telegram.messenger.i0.L(i12 + 25) + this.f30107w;
        if (z10) {
            f7 = 28.0f;
        } else {
            f7 = 32.0f;
        }
        setMeasuredDimension(L, org.telegram.messenger.i0.L(f7));
    }

    @Override
    public final void updateColors() {
        try {
            r8 r8Var = this.f30105r;
            if (r8Var != null) {
                int i10 = this.J;
                org.telegram.ui.ActionBar.p6 p6Var = this.G;
                if (i10 == 1) {
                    r8Var.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ek, p6Var));
                } else if (i10 == 2) {
                    r8Var.i(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.T7, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a8, p6Var));
                } else if (i10 == 3) {
                    r8Var.h(org.telegram.ui.ActionBar.t6.r1(0.7f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21153p7, p6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public s20(Context context, Object obj, org.telegram.messenger.f5 f5Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        char c10;
        int i10;
        String str;
        r8 r8Var;
        String str2;
        org.telegram.messenger.ic icVar;
        org.telegram.messenger.ic icVar2;
        TLRPC.Chat chat;
        org.telegram.messenger.ic m10;
        int y3;
        int i11;
        this.f30103f = new RectF();
        this.F = new int[8];
        this.I = true;
        this.G = p6Var;
        this.H = z10;
        this.d = false;
        this.f30106s = f5Var;
        this.e = getResources().getDrawable(2131231032);
        float f7 = z10 ? 13.0f : 14.0f;
        TextPaint textPaint = M;
        textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
        r8 r8Var2 = new r8((org.telegram.ui.ActionBar.p6) null);
        this.f30105r = r8Var2;
        r8Var2.u(org.telegram.messenger.i0.L(20.0f));
        boolean z11 = obj instanceof String;
        if (z11) {
            String str3 = (String) obj;
            r8Var2.f29871p = 0.8f;
            switch (str3.hashCode()) {
                case -1716307998:
                    i11 = 2;
                    str3.equals("archived");
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -1359418551:
                    if (str3.equals("miniapps")) {
                        this.d = true;
                        r8Var2.i(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.T7, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a8, p6Var));
                        i11 = 2;
                        this.J = 2;
                        str2 = org.telegram.messenger.cd.L0(2131746821, null);
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        r8Var2.g(6);
                        this.f30101b = -9223372036854775806L;
                        str2 = org.telegram.messenger.cd.L0(2131750775, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        r8Var2.g(5);
                        this.f30101b = -9223372036854775807L;
                        str2 = org.telegram.messenger.cd.L0(2131750721, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        r8Var2.g(4);
                        this.f30101b = Long.MIN_VALUE;
                        str2 = org.telegram.messenger.cd.L0(2131750792, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -318452137:
                    if (str3.equals("premium")) {
                        this.d = true;
                        r8Var2.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ek, p6Var));
                        this.J = 1;
                        str2 = org.telegram.messenger.cd.L0(2131746795, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        r8Var2.g(24);
                        this.f30101b = -9223372036854775799L;
                        str2 = org.telegram.messenger.cd.L0(2131750728, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        r8Var2.g(8);
                        this.f30101b = -9223372036854775804L;
                        str2 = org.telegram.messenger.cd.L0(2131750802, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        r8Var2.g(10);
                        this.f30101b = -9223372036854775802L;
                        str2 = org.telegram.messenger.cd.L0(2131750720, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        r8Var2.g(9);
                        this.f30101b = -9223372036854775803L;
                        str2 = org.telegram.messenger.cd.L0(2131750737, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        r8Var2.g(23);
                        this.f30101b = -9223372036854775800L;
                        str2 = org.telegram.messenger.cd.L0(2131750777, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        r8Var2.g(7);
                        this.f30101b = -9223372036854775805L;
                        str2 = org.telegram.messenger.cd.L0(2131750801, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                default:
                    i11 = 2;
                    r8Var2.g(11);
                    this.f30101b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
            }
            i10 = i11;
            icVar = null;
            icVar2 = null;
            r8Var = r8Var2;
            str = "premium";
            c10 = ' ';
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.f30101b = user.f19942id;
                if (org.telegram.messenger.h20.z(user)) {
                    str2 = org.telegram.messenger.cd.L0(2131746281, null);
                    r8Var2.f29871p = 0.8f;
                    r8Var2.g(12);
                } else if (org.telegram.messenger.h20.B(user)) {
                    str2 = org.telegram.messenger.cd.L0(2131745918, null);
                    r8Var2.f29871p = 0.8f;
                    r8Var2.g(1);
                } else {
                    r8Var2.r(user);
                    String j10 = org.telegram.messenger.h20.j(user, true);
                    c10 = ' ';
                    int indexOf = j10.indexOf(32);
                    j10 = indexOf >= 0 ? j10.substring(0, indexOf) : j10;
                    m10 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.f15147s0, 1, user);
                    String str4 = j10;
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
                    r8Var2.q(chat);
                    this.f30101b = -chat.f19793id;
                    str2 = chat.title;
                    m10 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.f15147s0, 1, chat);
                } else {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String E0 = org.telegram.messenger.cd.E0(tL_help_country.iso2);
                        String str5 = tL_help_country.default_name;
                        r8Var2.g(17);
                        r8Var2.u(org.telegram.messenger.i0.L(24.0f));
                        i10 = 2;
                        str = "premium";
                        r8Var2.k(0L, E0, null, null);
                        r8Var2.h(org.telegram.ui.ActionBar.t6.r1(0.7f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21153p7, p6Var)));
                        this.J = 3;
                        this.I = false;
                        r8Var2.f29877w = false;
                        this.f30101b = tL_help_country.default_name.hashCode();
                        this.f30100a = tL_help_country.iso2;
                        icVar = null;
                        r8Var = r8Var2;
                        str2 = str5;
                    } else {
                        i10 = 2;
                        str = "premium";
                        r8Var2.k(f5Var.f15508a, f5Var.f15513i, f5Var.f15514j, null);
                        r8Var = r8Var2;
                        this.f30101b = f5Var.f15508a;
                        this.f30102c = f5Var.f15509b;
                        if (!TextUtils.isEmpty(f5Var.f15513i)) {
                            str2 = f5Var.f15513i;
                        } else {
                            str2 = f5Var.f15514j;
                        }
                        icVar = null;
                    }
                    icVar2 = icVar;
                }
            }
            icVar2 = chat;
            i10 = 2;
            r8Var = r8Var2;
            str = "premium";
            icVar = m10;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(16.0f));
        imageReceiver.H0(this);
        imageReceiver.y0(this.I ? 0.0f : org.telegram.messenger.i0.L(4.0f), 0.0f, org.telegram.messenger.i0.L(z10 ? 28.0f : 32.0f), org.telegram.messenger.i0.L(z10 ? 28.0f : 32.0f));
        if (org.telegram.messenger.i0.Q1()) {
            y3 = org.telegram.messenger.i0.L(398 - (z10 ? (char) 28 : c10)) / i10;
        } else {
            Point point = org.telegram.messenger.i0.f16026q;
            y3 = org.telegram.messenger.z20.y((z10 ? (char) 28 : c10) + 132, Math.min(point.x, point.y), i10);
        }
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.k6.m(str2.replace('\n', c10), textPaint.getFontMetricsInt(), false, null, 0), textPaint, y3, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f30104n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.f30107w = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f30108x = -staticLayout.getLineLeft(0);
        }
        if (z11 && str.equals((String) obj)) {
            imageReceiver.w0(org.telegram.ui.Cells.j4.b(getContext(), true));
        } else if (z11 && "miniapps".equals((String) obj)) {
            getContext();
            imageReceiver.w0(org.telegram.ui.Cells.j4.a(true));
        } else {
            imageReceiver.p0(icVar, "50_50", r8Var, 0L, null, icVar2, 1);
        }
        c();
        org.telegram.messenger.zs.i(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
