package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class u6 extends FrameLayout implements org.telegram.messenger.gs {
    public final int f40268a;
    public final m80 f40269b;
    public final Runnable f40270c;

    public u6(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable, org.telegram.ui.bh bhVar) {
        super(context);
        int i10;
        this.f40268a = i7;
        this.f40270c = runnable;
        org.telegram.messenger.i5.r(i7).B();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.m6.K7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(imageView, L2, M, null, h6Var);
        imageView.setImageResource(2131231602);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (bhVar != null) {
            i10 = 14;
        } else {
            i10 = 0;
        }
        linearLayout.addView(imageView, c8.ma.t(80, 80, 49, 0, i10, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.hd.N0(2131754164, null));
        linearLayout.addView(textView, c8.ma.t(-1, -2, 1, 32, 0, 32, 9));
        m80 m80Var = new m80(context, null);
        this.f40269b = m80Var;
        m80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.f29792z6, h6Var);
        m80Var.setGravity(1);
        b();
        linearLayout.addView(m80Var, c8.ma.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(2131232054, org.telegram.messenger.hd.O0("ArchiveHintSection1"), org.telegram.messenger.hd.O0("ArchiveHintSection1Info"), h6Var), c8.ma.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(2131232055, org.telegram.messenger.hd.O0("ArchiveHintSection2"), org.telegram.messenger.hd.O0("ArchiveHintSection2Info"), h6Var), c8.ma.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(2131232057, org.telegram.messenger.hd.O0("ArchiveHintSection3"), org.telegram.messenger.hd.O0("ArchiveHintSection3Info"), h6Var), c8.ma.t(-1, -2, 7, 32, 0, 32, 16));
        if (bhVar != null) {
            hi.e g10 = org.telegram.messenger.o10.g(24, context, h6Var, true);
            g10.i(org.telegram.messenger.hd.O0("GotIt"), false, true);
            g10.setOnClickListener(new t6(0, bhVar));
            linearLayout.addView(g10, c8.ma.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i7, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i10 = org.telegram.ui.ActionBar.m6.f29489j5;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i7);
        frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(0, org.telegram.messenger.g0.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, c8.ma.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29792z6, h6Var);
        textView2.setTextSize(0, org.telegram.messenger.g0.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, c8.ma.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, c8.ma.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        boolean z10;
        String str;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(this.f40268a).Y;
        if (globalPrivacySettings != null) {
            z10 = globalPrivacySettings.keep_archived_unmuted;
        } else {
            z10 = true;
        }
        if (z10) {
            str = "ArchiveHintSubtitle";
        } else {
            str = "ArchiveHintSubtitleUnmutedMove";
        }
        String O0 = org.telegram.messenger.hd.O0(str);
        int i7 = org.telegram.ui.ActionBar.m6.Xc;
        SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(O0, i7, 0, this.f40270c, null);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(2131232061).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        nq nqVar = new nq(0, mutate);
        nqVar.a(i7);
        nqVar.c(org.telegram.messenger.g0.L(18.0f));
        nqVar.F = org.telegram.messenger.g0.L(11.0f);
        nqVar.f37950r = -org.telegram.messenger.g0.L(5.0f);
        spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
        this.f40269b.setText(org.telegram.messenger.g0.K2(R2, spannableString, ">"));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25333k0) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.f(this.f40268a).c(this, org.telegram.messenger.ls.f25333k0);
        b();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.f(this.f40268a).n(this, org.telegram.messenger.ls.f25333k0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(400.0f), View.MeasureSpec.getSize(i7)), 1073741824), i10);
    }
}
