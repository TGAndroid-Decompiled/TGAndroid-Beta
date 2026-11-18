package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.p51;
public final class ya extends b51 implements fs {
    public static void d0(ya yaVar, TL_wallet.tonConnectSession tonconnectsession, x10 x10Var) {
        l2 l2Var = u0.D(yaVar.currentAccount).f45088g;
        l2Var.getClass();
        org.telegram.messenger.g0.g3(new p(l2Var, tonconnectsession, x10Var, 5));
    }

    @Override
    public final void Z(ArrayList arrayList, z41 z41Var) {
        l2 l2Var = u0.D(this.currentAccount).f45088g;
        if (!l2Var.d.isEmpty()) {
            i5.c.s(2131742968, null, arrayList);
        }
        ArrayList arrayList2 = l2Var.d;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            int i10 = wa.f45227b;
            l41 K = l41.K(wa.class);
            K.H = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        l2Var.getClass();
        arrayList.add(l41.C(gd.M0(2131742917, null)));
    }

    @Override
    public final CharSequence a0() {
        return gd.M0(2131742918, null);
    }

    @Override
    public final void b0(l41 l41Var, View view) {
        String M0;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = l41Var.H;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
            p51 p51Var = new p51(16, this, tonconnectsession);
            LinearLayout f10 = org.telegram.messenger.f3.f(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231241);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i7 = org.telegram.ui.ActionBar.n6.f29488i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.s(imageView, i10, resourceProvider, PorterDuff.Mode.SRC_IN);
            c8.ra.a(imageView);
            frameLayout.addView(imageView, c8.ma.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(parentActivity);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                q9Var.p(fc.p(h20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(q9Var, c8.ma.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            f10.addView(frameLayout, c8.ma.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                M0 = tonconnectmanifest2.name;
            } else {
                M0 = gd.M0(2131742920, null);
            }
            textView.setText(M0);
            org.telegram.ui.ActionBar.u6.U(textView, i10, resourceProvider);
            f10.addView(textView, c8.ma.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            } else {
                str = null;
            }
            String K0 = org.telegram.messenger.g0.K0(str, false);
            if (!TextUtils.isEmpty(K0)) {
                TextView textView2 = new TextView(parentActivity);
                n10.p(textView2, 1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Fi, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) K0);
                textView2.setText(spannableStringBuilder);
                f10.addView(textView2, c8.ma.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(gd.M0(2131742919, null));
            org.telegram.ui.ActionBar.u6.U(textView3, i10, resourceProvider);
            f10.addView(textView3, c8.ma.t(-2, -2, 49, 36, 16, 36, 28));
            hi.d dVar = new hi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(gd.M0(2131742892, null));
            int i11 = org.telegram.ui.ActionBar.n6.f29637q7;
            dVar.setColor(org.telegram.ui.ActionBar.n6.w0(i11, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.u6.j(dVar, background, M2, null, resourceProvider);
            }
            f10.addView(dVar, c8.ma.t(-1, 44, 1, 16, 0, 16, 16));
            e3 e3Var = new e3(parentActivity, f10, resourceProvider);
            e3Var.show();
            imageView.setOnClickListener(new z1(e3Var, 1));
            dVar.setOnClickListener(new w8(dVar, p51Var, e3Var, resourceProvider, 3));
        }
    }

    @Override
    public final boolean c0(l41 l41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f33530a);
        this.f33530a.r1();
        this.f33530a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.d6 d6Var;
        if (i7 == ks.f25099c4 && (d6Var = this.f33530a) != null) {
            d6Var.f34607g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.f25099c4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.f25099c4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f33530a.setPadding(0, 0, 0, i12);
        this.f33530a.setClipToPadding(false);
    }
}
