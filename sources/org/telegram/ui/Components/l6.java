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
public final class l6 extends FrameLayout implements org.telegram.messenger.us {
    public final int f28017a;
    public final p80 f28018b;
    public final Runnable f28019c;

    public l6(Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable, org.telegram.ui.rh rhVar) {
        super(context);
        int i11;
        this.f28017a = i10;
        this.f28019c = runnable;
        org.telegram.messenger.i5.r(i10).B();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int L = org.telegram.messenger.i0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.t6.K7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(imageView, L2, N, null, p6Var);
        imageView.setImageResource(2131231602);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (rhVar != null) {
            i11 = 14;
        } else {
            i11 = 0;
        }
        linearLayout.addView(imageView, w7.b6.t(80, 80, 49, 0, i11, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.cd.L0(2131754167, null));
        linearLayout.addView(textView, w7.b6.t(-1, -2, 1, 32, 0, 32, 9));
        p80 p80Var = new p80(context, null);
        this.f28018b = p80Var;
        p80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
        p80Var.setGravity(1);
        b();
        linearLayout.addView(p80Var, w7.b6.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(2131232051, org.telegram.messenger.cd.M0("ArchiveHintSection1"), org.telegram.messenger.cd.M0("ArchiveHintSection1Info"), p6Var), w7.b6.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(2131232052, org.telegram.messenger.cd.M0("ArchiveHintSection2"), org.telegram.messenger.cd.M0("ArchiveHintSection2Info"), p6Var), w7.b6.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(2131232054, org.telegram.messenger.cd.M0("ArchiveHintSection3"), org.telegram.messenger.cd.M0("ArchiveHintSection3Info"), p6Var), w7.b6.t(-1, -2, 7, 32, 0, 32, 16));
        if (rhVar != null) {
            vh.d i13 = org.telegram.messenger.z20.i(24, context, p6Var, true);
            i13.i(org.telegram.messenger.cd.M0("GotIt"), false, true);
            i13.setOnClickListener(new k6(0, rhVar));
            linearLayout.addView(i13, w7.b6.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i10, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i10);
        frameLayout.addView(imageView, w7.b6.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(0, org.telegram.messenger.i0.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, w7.b6.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
        textView2.setTextSize(0, org.telegram.messenger.i0.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, w7.b6.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.b6.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        boolean z10;
        String str;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(this.f28017a).X;
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
        String M0 = org.telegram.messenger.cd.M0(str);
        int i10 = org.telegram.ui.ActionBar.t6.Uc;
        SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(M0, i10, 0, this.f28019c, null);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(2131232058).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        dq dqVar = new dq(0, mutate);
        dqVar.a(i10);
        dqVar.c(org.telegram.messenger.i0.L(18.0f));
        dqVar.E = org.telegram.messenger.i0.L(11.0f);
        dqVar.f25508r = -org.telegram.messenger.i0.L(5.0f);
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        this.f28018b.setText(org.telegram.messenger.i0.J2(R2, spannableString, ">"));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19638k0) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.f(this.f28017a).c(this, org.telegram.messenger.zs.f19638k0);
        b();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.f28017a).n(this, org.telegram.messenger.zs.f19638k0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(400.0f), View.MeasureSpec.getSize(i10)), 1073741824), i11);
    }
}
