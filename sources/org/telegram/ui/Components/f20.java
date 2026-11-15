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
public final class f20 extends View implements org.telegram.ui.ActionBar.z5 {
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
    public final String f34478a;
    public final long f34479b;
    public final String f34480c;
    public final boolean d;
    public final Drawable f34481e;
    public final RectF f34482f;
    public final ImageReceiver h;
    public final StaticLayout f34483n;
    public final t8 f34484r;
    public final org.telegram.messenger.d5 f34485s;
    public final int f34486w;
    public final float f34487x;
    public float f34488y;

    public f20(Context context, Object obj) {
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
        int b10 = this.f34484r.b();
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.H;
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.05f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ui, e6Var);
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
            this.f34481e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        O.setColor(r12);
    }

    public org.telegram.messenger.d5 getContact() {
        return this.f34485s;
    }

    public String getCountryIso2() {
        return this.f34478a;
    }

    public String getKey() {
        return this.f34480c;
    }

    public long getUid() {
        return this.f34479b;
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
        if ((z10 && this.f34488y != 1.0f) || (!z10 && this.f34488y != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.F;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.E) {
                float f18 = (((float) currentTimeMillis) / 120.0f) + this.f34488y;
                this.f34488y = f18;
                if (f18 >= 1.0f) {
                    this.f34488y = 1.0f;
                }
            } else {
                float f19 = this.f34488y - (((float) currentTimeMillis) / 120.0f);
                this.f34488y = f19;
                if (f19 < 0.0f) {
                    this.f34488y = 0.0f;
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
        RectF rectF = this.f34482f;
        rectF.set(0.0f, 0.0f, measuredWidth, org.telegram.messenger.g0.L(f10));
        int[] iArr = this.G;
        int i13 = iArr[6];
        float f20 = this.f34488y;
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
        if (this.f34488y != 1.0f) {
            this.h.h(canvas, null);
        }
        if (this.f34488y != 0.0f) {
            paint.setColor(this.f34484r.b());
            paint.setAlpha((int) (this.f34488y * 255.0f * (Color.alpha(b10) / 255.0f)));
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
            canvas.rotate((1.0f - this.f34488y) * 45.0f, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
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
            Drawable drawable = this.f34481e;
            drawable.setBounds(L4, L5, L6, L7);
            drawable.setAlpha((int) (this.f34488y * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z11) {
            i12 = 26;
        } else {
            i12 = 32;
        }
        float L8 = this.f34487x + org.telegram.messenger.g0.L(i12 + 9);
        if (z11) {
            f13 = 6.0f;
        } else {
            f13 = 8.0f;
        }
        canvas.translate(L8, org.telegram.messenger.g0.L(f13));
        int i14 = org.telegram.ui.ActionBar.j6.Si;
        org.telegram.ui.ActionBar.e6 e6Var = this.H;
        N.setColor(i0.a.f(this.f34488y, org.telegram.ui.ActionBar.j6.w0(i14, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.J7, e6Var)));
        this.f34483n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f34483n.getText());
        if (this.E) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.hd.M0(2131751598, null)));
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
        int L = org.telegram.messenger.g0.L(i11 + 25) + this.f34486w;
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
            t8 t8Var = this.f34484r;
            if (t8Var != null) {
                int i7 = this.K;
                org.telegram.ui.ActionBar.e6 e6Var = this.H;
                if (i7 == 1) {
                    t8Var.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Hk, e6Var));
                } else if (i7 == 2) {
                    t8Var.i(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.T7, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28793a8, e6Var));
                } else if (i7 == 3) {
                    t8Var.h(org.telegram.ui.ActionBar.j6.r1(0.7f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29070p7, e6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public f20(Context context, Object obj, org.telegram.messenger.d5 d5Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        char c10;
        int i7;
        String str;
        t8 t8Var;
        String str2;
        org.telegram.messenger.gc gcVar;
        org.telegram.messenger.gc gcVar2;
        TLRPC.Chat chat;
        org.telegram.messenger.gc m10;
        int y10;
        int i10;
        this.f34482f = new RectF();
        this.G = new int[8];
        this.J = true;
        this.H = e6Var;
        this.I = z10;
        this.d = false;
        this.f34485s = d5Var;
        this.f34481e = getResources().getDrawable(2131231032);
        float f10 = z10 ? 13.0f : 14.0f;
        TextPaint textPaint = N;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        t8 t8Var2 = new t8((org.telegram.ui.ActionBar.e6) null);
        this.f34484r = t8Var2;
        t8Var2.u(org.telegram.messenger.g0.L(20.0f));
        boolean z11 = obj instanceof String;
        if (z11) {
            String str3 = (String) obj;
            t8Var2.f39600p = 0.8f;
            switch (str3.hashCode()) {
                case -1716307998:
                    i10 = 2;
                    str3.equals("archived");
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case -1359418551:
                    if (str3.equals("miniapps")) {
                        this.d = true;
                        t8Var2.i(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.T7, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28793a8, e6Var));
                        i10 = 2;
                        this.K = 2;
                        str2 = org.telegram.messenger.hd.M0(2131746806, null);
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        t8Var2.g(6);
                        this.f34479b = -9223372036854775806L;
                        str2 = org.telegram.messenger.hd.M0(2131750774, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        t8Var2.g(5);
                        this.f34479b = -9223372036854775807L;
                        str2 = org.telegram.messenger.hd.M0(2131750720, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        t8Var2.g(4);
                        this.f34479b = Long.MIN_VALUE;
                        str2 = org.telegram.messenger.hd.M0(2131750791, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case -318452137:
                    if (str3.equals("premium")) {
                        this.d = true;
                        t8Var2.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Hk, e6Var));
                        this.K = 1;
                        str2 = org.telegram.messenger.hd.M0(2131746780, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        t8Var2.g(24);
                        this.f34479b = -9223372036854775799L;
                        str2 = org.telegram.messenger.hd.M0(2131750727, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        t8Var2.g(8);
                        this.f34479b = -9223372036854775804L;
                        str2 = org.telegram.messenger.hd.M0(2131750801, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        t8Var2.g(10);
                        this.f34479b = -9223372036854775802L;
                        str2 = org.telegram.messenger.hd.M0(2131750719, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        t8Var2.g(9);
                        this.f34479b = -9223372036854775803L;
                        str2 = org.telegram.messenger.hd.M0(2131750736, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        t8Var2.g(23);
                        this.f34479b = -9223372036854775800L;
                        str2 = org.telegram.messenger.hd.M0(2131750776, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        t8Var2.g(7);
                        this.f34479b = -9223372036854775805L;
                        str2 = org.telegram.messenger.hd.M0(2131750800, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
                default:
                    i10 = 2;
                    t8Var2.g(11);
                    this.f34479b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.M0(2131750804, null);
                    break;
            }
            i7 = i10;
            gcVar = null;
            gcVar2 = null;
            t8Var = t8Var2;
            str = "premium";
            c10 = ' ';
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.f34479b = user.f28200id;
                if (org.telegram.messenger.q10.z(user)) {
                    str2 = org.telegram.messenger.hd.M0(2131746266, null);
                    t8Var2.f39600p = 0.8f;
                    t8Var2.g(12);
                } else if (org.telegram.messenger.q10.B(user)) {
                    str2 = org.telegram.messenger.hd.M0(2131745901, null);
                    t8Var2.f39600p = 0.8f;
                    t8Var2.g(1);
                } else {
                    t8Var2.r(user);
                    String j3 = org.telegram.messenger.q10.j(user, true);
                    c10 = ' ';
                    int indexOf = j3.indexOf(32);
                    j3 = indexOf >= 0 ? j3.substring(0, indexOf) : j3;
                    m10 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.f24934t0, 1, user);
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
                    t8Var2.q(chat);
                    this.f34479b = -chat.f28051id;
                    str2 = chat.title;
                    m10 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.f24934t0, 1, chat);
                } else {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String F0 = org.telegram.messenger.hd.F0(tL_help_country.iso2);
                        String str5 = tL_help_country.default_name;
                        t8Var2.g(17);
                        t8Var2.u(org.telegram.messenger.g0.L(24.0f));
                        i7 = 2;
                        str = "premium";
                        t8Var2.k(0L, F0, null, null);
                        t8Var2.h(org.telegram.ui.ActionBar.j6.r1(0.7f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29070p7, e6Var)));
                        this.K = 3;
                        this.J = false;
                        t8Var2.f39606w = false;
                        this.f34479b = tL_help_country.default_name.hashCode();
                        this.f34478a = tL_help_country.iso2;
                        gcVar = null;
                        t8Var = t8Var2;
                        str2 = str5;
                    } else {
                        i7 = 2;
                        str = "premium";
                        t8Var2.k(d5Var.f23031a, d5Var.f23037i, d5Var.f23038j, null);
                        t8Var = t8Var2;
                        this.f34479b = d5Var.f23031a;
                        this.f34480c = d5Var.f23032b;
                        if (!TextUtils.isEmpty(d5Var.f23037i)) {
                            str2 = d5Var.f23037i;
                        } else {
                            str2 = d5Var.f23038j;
                        }
                        gcVar = null;
                    }
                    gcVar2 = gcVar;
                }
            }
            gcVar2 = chat;
            i7 = 2;
            t8Var = t8Var2;
            str = "premium";
            gcVar = m10;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        imageReceiver.H0(this);
        imageReceiver.y0(this.J ? 0.0f : org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f), org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f));
        if (org.telegram.messenger.g0.Q1()) {
            y10 = org.telegram.messenger.g0.L(398 - (z10 ? (char) 28 : c10)) / i7;
        } else {
            Point point = org.telegram.messenger.g0.f23609q;
            y10 = org.telegram.messenger.i20.y((z10 ? (char) 28 : c10) + 132, Math.min(point.x, point.y), i7);
        }
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.j6.m(str2.replace('\n', c10), textPaint.getFontMetricsInt(), false, null, 0), textPaint, y10, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f34483n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.f34486w = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f34487x = -staticLayout.getLineLeft(0);
        }
        if (z11 && str.equals((String) obj)) {
            imageReceiver.w0(org.telegram.ui.Cells.h4.b(getContext(), true));
        } else if (z11 && "miniapps".equals((String) obj)) {
            getContext();
            imageReceiver.w0(org.telegram.ui.Cells.h4.a(true));
        } else {
            imageReceiver.p0(gcVar, "50_50", t8Var, 0L, null, gcVar2, 1);
        }
        c();
        org.telegram.messenger.ns.i(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
