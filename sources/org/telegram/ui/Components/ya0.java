package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ya0 extends FrameLayout {
    public final int E;
    public boolean F;
    public float G;
    public final int f42435a;
    public final int f42436b;
    public final org.telegram.ui.ActionBar.i6 f42437c;
    public final LinearLayout d;
    public final TextView f42438e;
    public final TextView f42439f;
    public final TextView h;
    public final long f42440n;
    public final int f42441r;
    public final int f42442s;
    public final int f42443w;
    public final int f42444x;
    public final Runnable f42445y;

    public ya0(Context context, int i7, org.telegram.messenger.fj fjVar, Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.F = false;
        this.G = -1.0f;
        this.f42436b = i7;
        int i14 = fjVar.K1;
        this.f42435a = i14;
        this.f42437c = i6Var;
        this.f42445y = runnable;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        TLRPC.Message message = fjVar.f23968k;
        this.E = currentTime - message.date;
        this.f42440n = org.telegram.messenger.fj.B0(message);
        this.f42441r = fjVar.e1();
        TLRPC.Message message2 = fjVar.f23968k;
        if (message2 == null) {
            i10 = 0;
        } else {
            i10 = message2.date;
        }
        this.f42442s = i10;
        if (message2 == null) {
            i11 = 0;
        } else {
            i11 = message2.edit_date;
        }
        this.f42443w = i11;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null) {
            i12 = messageFwdHeader.date;
        } else {
            i12 = 0;
        }
        this.f42444x = i12;
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ma.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 1) {
            if (((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i14).A7.Z.f14001b).f24339c) {
                i13 = 2131232489;
            } else {
                i13 = 2131231793;
            }
        } else if (i7 == 2) {
            i13 = 2131231827;
        } else if (org.telegram.messenger.fj.R4(fjVar.f23968k)) {
            i13 = 2131232300;
        } else {
            i13 = 2131232358;
        }
        Drawable mutate = context.getDrawable(i13).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.F8, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new p80(textView, org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(2.0f), i6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i15 = org.telegram.ui.ActionBar.n6.f29504j5;
        org.telegram.ui.ActionBar.u6.V(textView, org.telegram.ui.ActionBar.u6.K(0.7f, i15), i6Var);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ma.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, c8.ma.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f42438e = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, i15, i6Var);
        textView2.setTextSize(1, 14.0f);
        TextView f10 = org.telegram.messenger.n10.f(linearLayout, textView2, c8.ma.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f42439f = f10;
        int L = org.telegram.messenger.g0.L(20.0f);
        int i16 = org.telegram.ui.ActionBar.n6.f29397d7;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.75f, org.telegram.ui.ActionBar.n6.w0(i16, i6Var)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.75f, i16);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(f10, d02, K, null, i6Var);
        org.telegram.ui.ActionBar.u6.U(f10, i15, i6Var);
        f10.setTextSize(1, 11.0f);
        f10.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.33f));
        linearLayout.addView(f10, c8.ma.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(final Context context, final int i7, long j3, final boolean z10, Runnable runnable, final Runnable runnable2, final org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final org.telegram.ui.o6 o6Var = new org.telegram.ui.o6(1, context, i6Var, false);
        o6Var.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, i6Var));
        boolean K3 = org.telegram.messenger.mp.u1(i7).K3();
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z10) {
            i10 = 2131624077;
        } else {
            i10 = 2131624079;
        }
        imageView.f(i10, 70, 70, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i17 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i17, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i17);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(imageView, L2, M, null, i6Var);
        g10.addView((View) imageView, c8.ma.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i18 = org.telegram.ui.ActionBar.n6.f29504j5;
        org.telegram.ui.ActionBar.u6.U(textView, i18, i6Var);
        textView.setTextSize(1, 20.0f);
        if (z10) {
            i11 = 2131746852;
        } else {
            i11 = 2131746762;
        }
        textView.setText(org.telegram.messenger.gd.M0(i11, null));
        g10.addView(textView, c8.ma.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(textView2, i18, i6Var);
        textView2.setTextSize(1, 14.0f);
        if (j3 > 0) {
            str = org.telegram.messenger.o10.k(org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3)), true);
        } else {
            str = "";
        }
        String str2 = str;
        if (z10) {
            if (K3) {
                i12 = 2131746848;
            } else {
                i12 = 2131746849;
            }
        } else if (K3) {
            i12 = 2131746758;
        } else {
            i12 = 2131746759;
        }
        org.telegram.messenger.f3.q(null, null, i12, new Object[]{str2}, textView2);
        g10.addView(textView2, c8.ma.t(-1, -2, 1, 32, 9, 32, 19));
        final hi.d g11 = org.telegram.messenger.n10.g(24, context, i6Var, true);
        if (z10) {
            i13 = 2131746854;
        } else {
            i13 = 2131746764;
        }
        g11.i(org.telegram.messenger.gd.M0(i13, null), false, true);
        g10.addView(g11, c8.ma.r(-1, 48, 1));
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                hi.d dVar = hi.d.this;
                dVar.setLoading(true);
                boolean z11 = z10;
                int i19 = i7;
                org.telegram.ui.o6 o6Var2 = o6Var;
                Runnable runnable3 = runnable2;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i19).sendRequest(setprivacy, new bi.m1(dVar, o6Var2, runnable3, 19));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(i19).Y;
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i19).sendRequest(setglobalprivacysettings, new di.m7(context, i6Var, dVar, o6Var2, runnable3, 6));
            }
        });
        if (!K3) {
            xa0 xa0Var = new xa0(context, i6Var);
            xa0Var.setGravity(17);
            xa0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            org.telegram.ui.ActionBar.u6.X(xa0Var, org.telegram.ui.ActionBar.n6.f29807z6, i6Var);
            xa0Var.l(" " + org.telegram.messenger.gd.M0(2131746836, null) + " ", false);
            xa0Var.setTextSize(14);
            g10.addView(xa0Var, c8.ma.t(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(textView3, i18, i6Var);
            textView3.setTextSize(1, 20.0f);
            if (z10) {
                i14 = 2131746851;
            } else {
                i14 = 2131746761;
            }
            textView3.setText(org.telegram.messenger.gd.M0(i14, null));
            g10.addView(textView3, c8.ma.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(textView4, i18, i6Var);
            textView4.setTextSize(1, 14.0f);
            if (z10) {
                i15 = 2131746847;
            } else {
                i15 = 2131746757;
            }
            org.telegram.messenger.f3.q(null, null, i15, new Object[]{str2}, textView4);
            g10.addView(textView4, c8.ma.t(-1, -2, 1, 32, 9, 32, 19));
            ug.s0 s0Var = new ug.s0(context, i6Var, true);
            s0Var.setOnClickListener(new wa0(z10, o6Var, runnable));
            if (z10) {
                i16 = 2131746853;
            } else {
                i16 = 2131746763;
            }
            s0Var.c(org.telegram.messenger.gd.M0(i16, null), false, false);
            g10.addView(s0Var, c8.ma.t(-1, 48, 1, 0, 0, 0, 4));
        }
        o6Var.O = g10;
        o6Var.show();
    }

    public final void a() {
        String str = "LOC_ERR";
        TextView textView = this.f42438e;
        int i7 = this.f42435a;
        TextView textView2 = this.f42439f;
        TextView textView3 = this.h;
        LinearLayout linearLayout = this.d;
        int i10 = this.f42436b;
        if (i10 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            if (((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i7).A7.Z.f14001b).f24339c) {
                long j3 = this.f42442s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i11 = calendar.get(6);
                    int i12 = calendar.get(1);
                    calendar.setTimeInMillis(j3);
                    int i13 = calendar.get(6);
                    int i14 = calendar.get(1);
                    if (i13 == i11 && i12 == i14) {
                        str = org.telegram.messenger.gd.a0(null, null, 2131746997, org.telegram.messenger.gd.E0().p0().format(new Date(j3)));
                    } else if (i13 + 1 == i11 && i12 == i14) {
                        str = org.telegram.messenger.gd.a0(null, null, 2131746996, org.telegram.messenger.gd.E0().p0().format(new Date(j3)));
                    } else if (Math.abs(System.currentTimeMillis() - j3) < 31536000000L) {
                        str = org.telegram.messenger.gd.a0(null, null, 2131746998, org.telegram.messenger.gd.E0().q0().format(new Date(j3)), org.telegram.messenger.gd.E0().p0().format(new Date(j3)));
                    } else {
                        str = org.telegram.messenger.gd.a0(null, null, 2131746998, org.telegram.messenger.gd.E0().C0().format(new Date(j3)), org.telegram.messenger.gd.E0().p0().format(new Date(j3)));
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                str = org.telegram.messenger.gd.L(this.f42443w);
            }
            textView.setText(str);
        } else if (i10 == 2) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            long j10 = this.f42444x * 1000;
            try {
                Calendar calendar2 = Calendar.getInstance();
                int i15 = calendar2.get(6);
                int i16 = calendar2.get(1);
                calendar2.setTimeInMillis(j10);
                int i17 = calendar2.get(6);
                int i18 = calendar2.get(1);
                if (i17 == i15 && i16 == i18) {
                    str = org.telegram.messenger.gd.a0(null, null, 2131747006, org.telegram.messenger.gd.E0().p0().format(new Date(j10)));
                } else if (i17 + 1 == i15 && i16 == i18) {
                    str = org.telegram.messenger.gd.a0(null, null, 2131747005, org.telegram.messenger.gd.E0().p0().format(new Date(j10)));
                } else if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    str = org.telegram.messenger.gd.a0(null, null, 2131747007, org.telegram.messenger.gd.E0().q0().format(new Date(j10)), org.telegram.messenger.gd.E0().p0().format(new Date(j10)));
                } else {
                    str = org.telegram.messenger.gd.a0(null, null, 2131747007, org.telegram.messenger.gd.E0().C0().format(new Date(j10)), org.telegram.messenger.gd.E0().p0().format(new Date(j10)));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            textView.setText(str);
        } else {
            setOnClickListener(null);
            linearLayout.setAlpha(0.0f);
            textView3.setAlpha(1.0f);
            textView2.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = org.telegram.messenger.mp.u1(i7).l1(this.f42440n);
            tL_messages_getOutboxReadDate.msg_id = this.f42441r;
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getOutboxReadDate, new e2(this, 7));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        lb lbVar;
        super.onDetachedFromWindow();
        gc gcVar = gc.f35453w;
        if (gcVar != null && (lbVar = gcVar.f35457e) != null && lbVar.getParent() != null && (gcVar.f35457e.getParent().getParent() instanceof bb)) {
            gcVar.b();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        if (this.G < 0.0f) {
            this.G = 0.0f;
            int i11 = this.f42436b;
            TextView textView = this.f42438e;
            if (i11 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.G, org.telegram.messenger.g0.L(144.0f));
                this.G = max;
                float max2 = Math.max(max, textView.getPaint().measureText(org.telegram.messenger.gd.M0(2131747000, null)) + org.telegram.messenger.g0.L(48.0f));
                this.G = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(org.telegram.messenger.gd.M0(2131747004, null) + this.f42439f.getPaint().measureText(org.telegram.messenger.gd.M0(2131747002, null))) + org.telegram.messenger.g0.L(64.0f));
                this.G = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(org.telegram.messenger.gd.a0(null, null, 2131747001, org.telegram.messenger.gd.E0().p0().format(new Date(currentTimeMillis)))) + ((float) org.telegram.messenger.g0.L(48.0f)));
                this.G = max4;
                int i12 = this.E;
                if (i12 > 86400) {
                    f10 = 48.0f;
                    this.G = Math.max(max4, textView.getPaint().measureText(org.telegram.messenger.gd.a0(null, null, 2131746999, org.telegram.messenger.gd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(48.0f));
                } else {
                    f10 = 48.0f;
                }
                if (i12 > 172800) {
                    float max5 = Math.max(this.G, textView.getPaint().measureText(org.telegram.messenger.gd.a0(null, null, 2131747003, org.telegram.messenger.gd.E0().q0().format(new Date(currentTimeMillis)), org.telegram.messenger.gd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(f10));
                    this.G = max5;
                    this.G = Math.max(max5, textView.getPaint().measureText(org.telegram.messenger.gd.a0(null, null, 2131747003, org.telegram.messenger.gd.E0().C0().format(new Date(currentTimeMillis)), org.telegram.messenger.gd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(f10));
                }
            } else {
                this.G = textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.g0.L(48.0f);
            }
        }
        int i13 = 1073741824;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f11 = this.G;
        if (size >= f11 && mode != Integer.MIN_VALUE) {
            i13 = mode;
        } else {
            size = (int) f11;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i13), i10);
    }
}
