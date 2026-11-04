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
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.e20;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.e51;
public final class ha extends h41 implements cs {
    public static void d0(ha haVar, TL_wallet.tonConnectSession tonconnectsession, u10 u10Var) {
        c2 c2Var = k0.x(haVar.currentAccount).f42723g;
        c2Var.getClass();
        org.telegram.messenger.g0.h3(new g(c2Var, tonconnectsession, u10Var, 4));
    }

    @Override
    public final void Z(ArrayList arrayList, f41 f41Var) {
        c2 c2Var = k0.x(this.currentAccount).f42723g;
        if (!c2Var.d.isEmpty()) {
            arrayList.add(r31.u(bd.M0(2131743216, null)));
        }
        ArrayList arrayList2 = c2Var.d;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            int i10 = fa.f42552b;
            r31 K = r31.K(fa.class);
            K.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        arrayList.add(r31.C(bd.M0(2131743165, null)));
    }

    @Override
    public final CharSequence a0() {
        return bd.M0(2131743166, null);
    }

    @Override
    public final void b0(r31 r31Var, View view) {
        String M0;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = r31Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            e51 e51Var = new e51(15, this, tonconnectsession);
            LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231241);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i3, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.t(imageView, i10, resourceProvider, PorterDuff.Mode.SRC_IN);
            pf.a(imageView);
            frameLayout.addView(imageView, mf.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                k9Var.p(ac.p(e20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(k9Var, mf.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            e10.addView(frameLayout, mf.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                M0 = tonconnectmanifest2.name;
            } else {
                M0 = bd.M0(2131743168, null);
            }
            textView.setText(M0);
            org.telegram.ui.ActionBar.r6.V(textView, i10, resourceProvider);
            e10.addView(textView, mf.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            } else {
                str = null;
            }
            String K0 = org.telegram.messenger.g0.K0(str, false);
            if (!TextUtils.isEmpty(K0)) {
                TextView textView2 = new TextView(parentActivity);
                org.telegram.messenger.camera.q.m(textView2, 1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Ci, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) K0);
                textView2.setText(spannableStringBuilder);
                e10.addView(textView2, mf.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(bd.M0(2131743167, null));
            org.telegram.ui.ActionBar.r6.V(textView3, i10, resourceProvider);
            e10.addView(textView3, mf.t(-2, -2, 49, 36, 16, 36, 28));
            gi.d dVar = new gi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(bd.M0(2131743140, null));
            int i11 = org.telegram.ui.ActionBar.k6.f28122q7;
            dVar.setColor(org.telegram.ui.ActionBar.k6.w0(i11, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(dVar, background, N2, null, resourceProvider);
            }
            e10.addView(dVar, mf.t(-1, 44, 1, 16, 0, 16, 16));
            y2 y2Var = new y2(parentActivity, e10, resourceProvider);
            y2Var.show();
            imageView.setOnClickListener(new p1(y2Var, 1));
            dVar.setOnClickListener(new h8(dVar, e51Var, y2Var, resourceProvider, 3));
        }
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f34298a);
        this.f34298a.r1();
        this.f34298a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ai.h4 h4Var;
        if (i3 == hs.f23200a4 && (h4Var = this.f34298a) != null) {
            h4Var.f35594g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.f23200a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.f23200a4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f34298a.setPadding(0, 0, 0, i12);
        this.f34298a.setClipToPadding(false);
    }
}
