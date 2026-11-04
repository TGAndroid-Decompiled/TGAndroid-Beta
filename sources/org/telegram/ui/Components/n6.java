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
public final class n6 extends FrameLayout implements org.telegram.messenger.cs {
    public final int f36379a;
    public final s70 f36380b;
    public final Runnable f36381c;

    public n6(Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, org.telegram.ui.xg xgVar) {
        super(context);
        int i10;
        this.f36379a = i3;
        this.f36381c = runnable;
        org.telegram.messenger.g5.r(i3).B();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.k6.K7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, e6Var);
        imageView.setImageResource(2131231601);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (xgVar != null) {
            i10 = 14;
        } else {
            i10 = 0;
        }
        linearLayout.addView(imageView, b8.mf.t(80, 80, 49, 0, i10, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.bd.M0(2131754167, null));
        linearLayout.addView(textView, b8.mf.t(-1, -2, 1, 32, 0, 32, 9));
        s70 s70Var = new s70(context, null);
        this.f36380b = s70Var;
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        s70Var.setGravity(1);
        b();
        linearLayout.addView(s70Var, b8.mf.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(2131232052, org.telegram.messenger.bd.N0("ArchiveHintSection1"), org.telegram.messenger.bd.N0("ArchiveHintSection1Info"), e6Var), b8.mf.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(2131232053, org.telegram.messenger.bd.N0("ArchiveHintSection2"), org.telegram.messenger.bd.N0("ArchiveHintSection2Info"), e6Var), b8.mf.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(2131232055, org.telegram.messenger.bd.N0("ArchiveHintSection3"), org.telegram.messenger.bd.N0("ArchiveHintSection3Info"), e6Var), b8.mf.t(-1, -2, 7, 32, 0, 32, 16));
        if (xgVar != null) {
            gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
            h.i(org.telegram.messenger.bd.N0("GotIt"), false, true);
            h.setOnClickListener(new m6(0, xgVar));
            linearLayout.addView(h, b8.mf.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i3, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i3);
        frameLayout.addView(imageView, b8.mf.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(0, org.telegram.messenger.g0.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, b8.mf.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        textView2.setTextSize(0, org.telegram.messenger.g0.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, b8.mf.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, b8.mf.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        boolean z10;
        String str;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(this.f36379a).Y;
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
        String N0 = org.telegram.messenger.bd.N0(str);
        int i3 = org.telegram.ui.ActionBar.k6.Uc;
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(N0, i3, 0, this.f36381c, null);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(2131232059).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        wp wpVar = new wp(0, mutate);
        wpVar.a(i3);
        wpVar.c(org.telegram.messenger.g0.L(18.0f));
        wpVar.F = org.telegram.messenger.g0.L(11.0f);
        wpVar.f40045r = -org.telegram.messenger.g0.L(5.0f);
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        this.f36380b.setText(org.telegram.messenger.g0.K2(S2, spannableString, ">"));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23254k0) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.f(this.f36379a).c(this, org.telegram.messenger.hs.f23254k0);
        b();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.f36379a).n(this, org.telegram.messenger.hs.f23254k0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(400.0f), View.MeasureSpec.getSize(i3)), 1073741824), i10);
    }
}
