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
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.c30;
import org.telegram.messenger.dd;
import org.telegram.messenger.jc;
import org.telegram.messenger.r20;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.d01;
public final class ma extends s51 implements vs {
    public static void d0(ma maVar, TL_wallet.tonConnectSession tonconnectsession, r20 r20Var) {
        e2 e2Var = k0.x(maVar.currentAccount).f34785g;
        e2Var.getClass();
        org.telegram.messenger.i0.g3(new g(e2Var, tonconnectsession, r20Var, 4));
    }

    @Override
    public final void Z(ArrayList arrayList, q51 q51Var) {
        e2 e2Var = k0.x(this.currentAccount).f34785g;
        if (!e2Var.d.isEmpty()) {
            arrayList.add(b51.u(dd.L0(2131743232, null)));
        }
        ArrayList arrayList2 = e2Var.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            int i11 = ka.f34831b;
            b51 K = b51.K(ka.class);
            K.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        arrayList.add(b51.C(dd.L0(2131743181, null)));
    }

    @Override
    public final CharSequence a0() {
        return dd.L0(2131743182, null);
    }

    @Override
    public final void b0(b51 b51Var, View view) {
        String L0;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = b51Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
            d01 d01Var = new d01(19, this, tonconnectsession);
            LinearLayout e = org.telegram.messenger.m5.e(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231242);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i10, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, resourceProvider);
            int i11 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.t(imageView, i11, resourceProvider, PorterDuff.Mode.SRC_IN);
            w7.e6.a(imageView);
            frameLayout.addView(imageView, w7.b6.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(parentActivity);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                g9Var.p(jc.p(c30.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(g9Var, w7.b6.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            e.addView(frameLayout, w7.b6.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                L0 = tonconnectmanifest2.name;
            } else {
                L0 = dd.L0(2131743184, null);
            }
            textView.setText(L0);
            org.telegram.ui.ActionBar.a7.V(textView, i11, resourceProvider);
            e.addView(textView, w7.b6.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            } else {
                str = null;
            }
            String K0 = org.telegram.messenger.i0.K0(str, false);
            if (!TextUtils.isEmpty(K0)) {
                TextView textView2 = new TextView(parentActivity);
                a30.n(textView2, 1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Ci, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) K0);
                textView2.setText(spannableStringBuilder);
                e.addView(textView2, w7.b6.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(dd.L0(2131743183, null));
            org.telegram.ui.ActionBar.a7.V(textView3, i11, resourceProvider);
            e.addView(textView3, w7.b6.t(-2, -2, 49, 36, 16, 36, 28));
            vh.d dVar = new vh.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(dd.L0(2131743156, null));
            int i12 = org.telegram.ui.ActionBar.t6.f21171q7;
            dVar.setColor(org.telegram.ui.ActionBar.t6.w0(i12, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.a7.k(dVar, background, N2, null, resourceProvider);
            }
            e.addView(dVar, w7.b6.t(-1, 44, 1, 16, 0, 16, 16));
            a3 a3Var = new a3(parentActivity, e, resourceProvider);
            a3Var.show();
            imageView.setOnClickListener(new r1(a3Var, 1));
            dVar.setOnClickListener(new n8(dVar, d01Var, a3Var, resourceProvider, 3));
        }
    }

    @Override
    public final boolean c0(b51 b51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f30217a);
        this.f30217a.r1();
        this.f30217a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ii iiVar;
        if (i10 == at.f14678a4 && (iiVar = this.f30217a) != null) {
            iiVar.f31183f3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, at.f14678a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, at.f14678a4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f30217a.setPadding(0, 0, 0, i13);
        this.f30217a.setClipToPadding(false);
    }
}
