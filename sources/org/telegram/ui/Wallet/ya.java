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
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.p51;
public final class ya extends e51 implements fs {
    public static void d0(ya yaVar, TL_wallet.tonConnectSession tonconnectsession, x10 x10Var) {
        l2 l2Var = u0.D(yaVar.currentAccount).f45128g;
        l2Var.getClass();
        org.telegram.messenger.g0.g3(new p(l2Var, tonconnectsession, x10Var, 5));
    }

    @Override
    public final void Z(ArrayList arrayList, c51 c51Var) {
        l2 l2Var = u0.D(this.currentAccount).f45128g;
        if (!l2Var.d.isEmpty()) {
            i5.c.s(2131742962, null, arrayList);
        }
        ArrayList arrayList2 = l2Var.d;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            int i10 = wa.f45267b;
            o41 K = o41.K(wa.class);
            K.H = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        l2Var.getClass();
        arrayList.add(o41.C(gd.N0(2131742911, null)));
    }

    @Override
    public final CharSequence a0() {
        return gd.N0(2131742912, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        String N0;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = o41Var.H;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
            p51 p51Var = new p51(16, this, tonconnectsession);
            LinearLayout f10 = org.telegram.messenger.f3.f(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231241);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i7 = org.telegram.ui.ActionBar.m6.f29470i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i7, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.s(imageView, i10, resourceProvider, PorterDuff.Mode.SRC_IN);
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
                N0 = tonconnectmanifest2.name;
            } else {
                N0 = gd.N0(2131742914, null);
            }
            textView.setText(N0);
            org.telegram.ui.ActionBar.t6.U(textView, i10, resourceProvider);
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
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Fi, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) K0);
                textView2.setText(spannableStringBuilder);
                f10.addView(textView2, c8.ma.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(gd.N0(2131742913, null));
            org.telegram.ui.ActionBar.t6.U(textView3, i10, resourceProvider);
            f10.addView(textView3, c8.ma.t(-2, -2, 49, 36, 16, 36, 28));
            hi.e eVar = new hi.e(parentActivity, resourceProvider, true);
            eVar.setRoundRadius(24);
            eVar.setText(gd.N0(2131742886, null));
            int i11 = org.telegram.ui.ActionBar.m6.f29619q7;
            eVar.setColor(org.telegram.ui.ActionBar.m6.w0(i11, resourceProvider));
            if (eVar.getBackground() != null) {
                Drawable background = eVar.getBackground();
                org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
                eVar.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(eVar, background, M2, null, resourceProvider);
            }
            f10.addView(eVar, c8.ma.t(-1, 44, 1, 16, 0, 16, 16));
            e3 e3Var = new e3(parentActivity, f10, resourceProvider);
            e3Var.show();
            imageView.setOnClickListener(new z1(e3Var, 1));
            eVar.setOnClickListener(new w8(eVar, p51Var, e3Var, resourceProvider, 3));
        }
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f34683a);
        this.f34683a.r1();
        this.f34683a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.g6 g6Var;
        if (i7 == ks.f25130d4 && (g6Var = this.f34683a) != null) {
            g6Var.f35796g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.f25130d4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.f25130d4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f34683a.setPadding(0, 0, 0, i12);
        this.f34683a.setClipToPadding(false);
    }
}
