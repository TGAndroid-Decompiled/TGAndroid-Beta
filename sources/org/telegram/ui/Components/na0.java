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
public final class na0 extends FrameLayout {
    public final int D;
    public boolean E;
    public float F;
    public final int f36236a;
    public final int f36237b;
    public final org.telegram.ui.ActionBar.f6 f36238c;
    public final LinearLayout d;
    public final TextView f36239e;
    public final TextView f36240f;
    public final TextView h;
    public final long f36241n;
    public final int f36242r;
    public final int f36243s;
    public final int f36244w;
    public final int f36245x;
    public final Runnable f36246y;

    public na0(Context context, int i7, org.telegram.messenger.ij ijVar, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.E = false;
        this.F = -1.0f;
        this.f36237b = i7;
        int i14 = ijVar.I1;
        this.f36236a = i14;
        this.f36238c = f6Var;
        this.f36246y = runnable;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        TLRPC.Message message = ijVar.f23237k;
        this.D = currentTime - message.date;
        this.f36241n = org.telegram.messenger.ij.B0(message);
        this.f36242r = ijVar.f1();
        TLRPC.Message message2 = ijVar.f23237k;
        if (message2 == null) {
            i10 = 0;
        } else {
            i10 = message2.date;
        }
        this.f36243s = i10;
        if (message2 == null) {
            i11 = 0;
        } else {
            i11 = message2.edit_date;
        }
        this.f36244w = i11;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null) {
            i12 = messageFwdHeader.date;
        } else {
            i12 = 0;
        }
        this.f36245x = i12;
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 1) {
            if (((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i14).f24927x7.U.f13889b).f22767c) {
                i13 = 2131232487;
            } else {
                i13 = 2131231792;
            }
        } else if (i7 == 2) {
            i13 = 2131231826;
        } else if (org.telegram.messenger.ij.S4(ijVar.f23237k)) {
            i13 = 2131232298;
        } else {
            i13 = 2131232356;
        }
        Drawable mutate = context.getDrawable(i13).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.F8, f6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new b80(textView, org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(2.0f), f6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i15 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.r6.L(0.7f, i15), f6Var);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ha.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, c8.ha.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f36239e = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i15, f6Var);
        textView2.setTextSize(1, 14.0f);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView2, c8.ha.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f36240f = f10;
        int L = org.telegram.messenger.g0.L(20.0f);
        int i16 = org.telegram.ui.ActionBar.k6.f27849d7;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.75f, org.telegram.ui.ActionBar.k6.w0(i16, f6Var)));
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.75f, i16);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(f10, d02, L2, null, f6Var);
        org.telegram.ui.ActionBar.r6.V(f10, i15, f6Var);
        f10.setTextSize(1, 11.0f);
        f10.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.33f));
        linearLayout.addView(f10, c8.ha.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(final Context context, final int i7, long j3, final boolean z9, Runnable runnable, final Runnable runnable2, final org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(1, context, f6Var, false);
        p6Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, f6Var));
        boolean D3 = org.telegram.messenger.qp.s1(i7).D3();
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z9) {
            i10 = 2131624076;
        } else {
            i10 = 2131624078;
        }
        imageView.f(i10, 70, 70, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i17 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i17, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, f6Var);
        f10.addView((View) imageView, c8.ha.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i18 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.V(textView, i18, f6Var);
        textView.setTextSize(1, 20.0f);
        if (z9) {
            i11 = 2131747044;
        } else {
            i11 = 2131746954;
        }
        textView.setText(org.telegram.messenger.hd.M0(i11, null));
        f10.addView(textView, c8.ha.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView2, i18, f6Var);
        textView2.setTextSize(1, 14.0f);
        if (j3 > 0) {
            str = org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3)), true);
        } else {
            str = "";
        }
        String str2 = str;
        if (z9) {
            if (D3) {
                i12 = 2131747040;
            } else {
                i12 = 2131747041;
            }
        } else if (D3) {
            i12 = 2131746950;
        } else {
            i12 = 2131746951;
        }
        org.telegram.messenger.k5.r(null, null, i12, new Object[]{str2}, textView2);
        f10.addView(textView2, c8.ha.t(-1, -2, 1, 32, 9, 32, 19));
        final fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        if (z9) {
            i13 = 2131747046;
        } else {
            i13 = 2131746956;
        }
        h.i(org.telegram.messenger.hd.M0(i13, null), false, true);
        f10.addView(h, c8.ha.r(-1, 48, 1));
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                fi.d dVar = fi.d.this;
                dVar.setLoading(true);
                boolean z10 = z9;
                int i19 = i7;
                org.telegram.ui.p6 p6Var2 = p6Var;
                Runnable runnable3 = runnable2;
                if (z10) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i19).sendRequest(setprivacy, new bi.f2(dVar, p6Var2, runnable3, 16));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(i19).X;
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i19).sendRequest(setglobalprivacysettings, new bi.r8(context, f6Var, dVar, p6Var2, runnable3, 6));
            }
        });
        if (!D3) {
            ma0 ma0Var = new ma0(context, f6Var);
            ma0Var.setGravity(17);
            ma0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            org.telegram.ui.ActionBar.r6.Y(ma0Var, org.telegram.ui.ActionBar.k6.f28258z6, f6Var);
            ma0Var.l(" " + org.telegram.messenger.hd.M0(2131747028, null) + " ", false);
            ma0Var.setTextSize(14);
            f10.addView(ma0Var, c8.ha.t(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setGravity(17);
            org.telegram.ui.ActionBar.r6.V(textView3, i18, f6Var);
            textView3.setTextSize(1, 20.0f);
            if (z9) {
                i14 = 2131747043;
            } else {
                i14 = 2131746953;
            }
            textView3.setText(org.telegram.messenger.hd.M0(i14, null));
            f10.addView(textView3, c8.ha.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.ui.ActionBar.r6.V(textView4, i18, f6Var);
            textView4.setTextSize(1, 14.0f);
            if (z9) {
                i15 = 2131747039;
            } else {
                i15 = 2131746949;
            }
            org.telegram.messenger.k5.r(null, null, i15, new Object[]{str2}, textView4);
            f10.addView(textView4, c8.ha.t(-1, -2, 1, 32, 9, 32, 19));
            ug.p0 p0Var = new ug.p0(context, f6Var, true);
            p0Var.setOnClickListener(new ka0(z9, p6Var, runnable));
            if (z9) {
                i16 = 2131747045;
            } else {
                i16 = 2131746955;
            }
            p0Var.c(org.telegram.messenger.hd.M0(i16, null), false, false);
            f10.addView(p0Var, c8.ha.t(-1, 48, 1, 0, 0, 0, 4));
        }
        p6Var.N = f10;
        p6Var.show();
    }

    public final void a() {
        String str = "LOC_ERR";
        TextView textView = this.f36239e;
        int i7 = this.f36236a;
        TextView textView2 = this.f36240f;
        TextView textView3 = this.h;
        LinearLayout linearLayout = this.d;
        int i10 = this.f36237b;
        if (i10 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            if (((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i7).f24927x7.U.f13889b).f22767c) {
                long j3 = this.f36243s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i11 = calendar.get(6);
                    int i12 = calendar.get(1);
                    calendar.setTimeInMillis(j3);
                    int i13 = calendar.get(6);
                    int i14 = calendar.get(1);
                    if (i13 == i11 && i12 == i14) {
                        str = org.telegram.messenger.hd.a0(null, null, 2131747189, org.telegram.messenger.hd.E0().p0().format(new Date(j3)));
                    } else if (i13 + 1 == i11 && i12 == i14) {
                        str = org.telegram.messenger.hd.a0(null, null, 2131747188, org.telegram.messenger.hd.E0().p0().format(new Date(j3)));
                    } else if (Math.abs(System.currentTimeMillis() - j3) < 31536000000L) {
                        str = org.telegram.messenger.hd.a0(null, null, 2131747190, org.telegram.messenger.hd.E0().q0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3)));
                    } else {
                        str = org.telegram.messenger.hd.a0(null, null, 2131747190, org.telegram.messenger.hd.E0().C0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3)));
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                str = org.telegram.messenger.hd.L(this.f36244w);
            }
            textView.setText(str);
        } else if (i10 == 2) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            long j10 = this.f36245x * 1000;
            try {
                Calendar calendar2 = Calendar.getInstance();
                int i15 = calendar2.get(6);
                int i16 = calendar2.get(1);
                calendar2.setTimeInMillis(j10);
                int i17 = calendar2.get(6);
                int i18 = calendar2.get(1);
                if (i17 == i15 && i16 == i18) {
                    str = org.telegram.messenger.hd.a0(null, null, 2131747198, org.telegram.messenger.hd.E0().p0().format(new Date(j10)));
                } else if (i17 + 1 == i15 && i16 == i18) {
                    str = org.telegram.messenger.hd.a0(null, null, 2131747197, org.telegram.messenger.hd.E0().p0().format(new Date(j10)));
                } else if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    str = org.telegram.messenger.hd.a0(null, null, 2131747199, org.telegram.messenger.hd.E0().q0().format(new Date(j10)), org.telegram.messenger.hd.E0().p0().format(new Date(j10)));
                } else {
                    str = org.telegram.messenger.hd.a0(null, null, 2131747199, org.telegram.messenger.hd.E0().C0().format(new Date(j10)), org.telegram.messenger.hd.E0().p0().format(new Date(j10)));
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
            tL_messages_getOutboxReadDate.peer = org.telegram.messenger.qp.s1(i7).j1(this.f36241n);
            tL_messages_getOutboxReadDate.msg_id = this.f36242r;
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getOutboxReadDate, new x1(this, 7));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        gb gbVar;
        super.onDetachedFromWindow();
        cc ccVar = cc.f32519w;
        if (ccVar != null && (gbVar = ccVar.f32523e) != null && gbVar.getParent() != null && (ccVar.f32523e.getParent().getParent() instanceof wa)) {
            ccVar.b();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        if (this.F < 0.0f) {
            this.F = 0.0f;
            int i11 = this.f36237b;
            TextView textView = this.f36239e;
            if (i11 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.F, org.telegram.messenger.g0.L(144.0f));
                this.F = max;
                float max2 = Math.max(max, textView.getPaint().measureText(org.telegram.messenger.hd.M0(2131747192, null)) + org.telegram.messenger.g0.L(48.0f));
                this.F = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(org.telegram.messenger.hd.M0(2131747196, null) + this.f36240f.getPaint().measureText(org.telegram.messenger.hd.M0(2131747194, null))) + org.telegram.messenger.g0.L(64.0f));
                this.F = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(org.telegram.messenger.hd.a0(null, null, 2131747193, org.telegram.messenger.hd.E0().p0().format(new Date(currentTimeMillis)))) + ((float) org.telegram.messenger.g0.L(48.0f)));
                this.F = max4;
                int i12 = this.D;
                if (i12 > 86400) {
                    f10 = 48.0f;
                    this.F = Math.max(max4, textView.getPaint().measureText(org.telegram.messenger.hd.a0(null, null, 2131747191, org.telegram.messenger.hd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(48.0f));
                } else {
                    f10 = 48.0f;
                }
                if (i12 > 172800) {
                    float max5 = Math.max(this.F, textView.getPaint().measureText(org.telegram.messenger.hd.a0(null, null, 2131747195, org.telegram.messenger.hd.E0().q0().format(new Date(currentTimeMillis)), org.telegram.messenger.hd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(f10));
                    this.F = max5;
                    this.F = Math.max(max5, textView.getPaint().measureText(org.telegram.messenger.hd.a0(null, null, 2131747195, org.telegram.messenger.hd.E0().C0().format(new Date(currentTimeMillis)), org.telegram.messenger.hd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(f10));
                }
            } else {
                this.F = textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.g0.L(48.0f);
            }
        }
        int i13 = 1073741824;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f11 = this.F;
        if (size >= f11 && mode != Integer.MIN_VALUE) {
            i13 = mode;
        } else {
            size = (int) f11;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i13), i10);
    }
}
