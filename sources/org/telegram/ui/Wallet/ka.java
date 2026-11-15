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
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.k20;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.x21;
public final class ka extends r41 implements is {
    public static void d0(ka kaVar, TL_wallet.tonConnectSession tonconnectsession, z10 z10Var) {
        d2 d2Var = l0.x(kaVar.currentAccount).f44083g;
        d2Var.getClass();
        org.telegram.messenger.g0.h3(new g(d2Var, tonconnectsession, z10Var, 4));
    }

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
        d2 d2Var = l0.x(this.currentAccount).f44083g;
        if (!d2Var.d.isEmpty()) {
            arrayList.add(b41.u(hd.M0(2131743206, null)));
        }
        ArrayList arrayList2 = d2Var.d;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            int i10 = ia.f43996b;
            b41 K = b41.K(ia.class);
            K.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        arrayList.add(b41.C(hd.M0(2131743155, null)));
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131743156, null);
    }

    @Override
    public final void b0(b41 b41Var, View view) {
        String M0;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = b41Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            x21 x21Var = new x21(17, this, tonconnectsession);
            LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231241);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i7, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.s(imageView, i10, resourceProvider, PorterDuff.Mode.SRC_IN);
            c8.na.a(imageView);
            frameLayout.addView(imageView, c8.ja.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(parentActivity);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                i9Var.p(gc.p(k20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(i9Var, c8.ja.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            e10.addView(frameLayout, c8.ja.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                M0 = tonconnectmanifest2.name;
            } else {
                M0 = hd.M0(2131743158, null);
            }
            textView.setText(M0);
            org.telegram.ui.ActionBar.q6.U(textView, i10, resourceProvider);
            e10.addView(textView, c8.ja.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            } else {
                str = null;
            }
            String K0 = org.telegram.messenger.g0.K0(str, false);
            if (!TextUtils.isEmpty(K0)) {
                TextView textView2 = new TextView(parentActivity);
                i20.o(textView2, 1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Fi, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) K0);
                textView2.setText(spannableStringBuilder);
                e10.addView(textView2, c8.ja.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(hd.M0(2131743157, null));
            org.telegram.ui.ActionBar.q6.U(textView3, i10, resourceProvider);
            e10.addView(textView3, c8.ja.t(-2, -2, 49, 36, 16, 36, 28));
            hi.d dVar = new hi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(hd.M0(2131743130, null));
            int i11 = org.telegram.ui.ActionBar.j6.f29090q7;
            dVar.setColor(org.telegram.ui.ActionBar.j6.w0(i11, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.q6.j(dVar, background, M2, null, resourceProvider);
            }
            e10.addView(dVar, c8.ja.t(-1, 44, 1, 16, 0, 16, 16));
            x2 x2Var = new x2(parentActivity, e10, resourceProvider);
            x2Var.show();
            imageView.setOnClickListener(new q1(x2Var, 1));
            dVar.setOnClickListener(new i8(dVar, x21Var, x2Var, resourceProvider, 3));
        }
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f38880a);
        this.f38880a.r1();
        this.f38880a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.v3 v3Var;
        if (i7 == ns.f25468a4 && (v3Var = this.f38880a) != null) {
            v3Var.f39892g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.f25468a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.f25468a4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f38880a.setPadding(0, 0, 0, i12);
        this.f38880a.setClipToPadding(false);
    }
}
