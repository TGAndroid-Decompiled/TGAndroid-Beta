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
import org.telegram.messenger.c20;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.m20;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.r31;
public final class ia extends h41 implements ls {
    public static void d0(ia iaVar, TL_wallet.tonConnectSession tonconnectsession, c20 c20Var) {
        f2 f2Var = n0.x(iaVar.currentAccount).f42773g;
        f2Var.getClass();
        org.telegram.messenger.g0.h3(new g(f2Var, tonconnectsession, c20Var, 4));
    }

    @Override
    public final void Z(ArrayList arrayList, f41 f41Var) {
        f2 f2Var = n0.x(this.currentAccount).f42773g;
        if (!f2Var.d.isEmpty()) {
            arrayList.add(r31.u(hd.M0(2131743207, null)));
        }
        ArrayList arrayList2 = f2Var.d;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            int i10 = ga.f42519b;
            r31 K = r31.K(ga.class);
            K.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        arrayList.add(r31.C(hd.M0(2131743156, null)));
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131743157, null);
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
            org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
            t tVar = new t(12, this, tonconnectsession);
            LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231241);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i7 = org.telegram.ui.ActionBar.k6.f27940i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i7, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.t(imageView, i10, resourceProvider, PorterDuff.Mode.SRC_IN);
            c8.ka.a(imageView);
            frameLayout.addView(imageView, c8.ha.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(parentActivity);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                l9Var.p(hc.p(m20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(l9Var, c8.ha.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            e10.addView(frameLayout, c8.ha.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                M0 = tonconnectmanifest2.name;
            } else {
                M0 = hd.M0(2131743159, null);
            }
            textView.setText(M0);
            org.telegram.ui.ActionBar.r6.V(textView, i10, resourceProvider);
            e10.addView(textView, c8.ha.t(-2, -2, 49, 36, 16, 36, 0));
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
                e10.addView(textView2, c8.ha.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(hd.M0(2131743158, null));
            org.telegram.ui.ActionBar.r6.V(textView3, i10, resourceProvider);
            e10.addView(textView3, c8.ha.t(-2, -2, 49, 36, 16, 36, 28));
            fi.d dVar = new fi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(hd.M0(2131743131, null));
            int i11 = org.telegram.ui.ActionBar.k6.f28089q7;
            dVar.setColor(org.telegram.ui.ActionBar.k6.w0(i11, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(dVar, background, N2, null, resourceProvider);
            }
            e10.addView(dVar, c8.ha.t(-1, 44, 1, 16, 0, 16, 16));
            a3 a3Var = new a3(parentActivity, e10, resourceProvider);
            a3Var.show();
            imageView.setOnClickListener(new s1(a3Var, 1));
            dVar.setOnClickListener(new i8(dVar, tVar, a3Var, resourceProvider, 3));
        }
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f34211a);
        this.f34211a.r1();
        this.f34211a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.w3 w3Var;
        if (i7 == qs.f24954a4 && (w3Var = this.f34211a) != null) {
            w3Var.f35167f3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.f24954a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.f24954a4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f34211a.setPadding(0, 0, 0, i12);
        this.f34211a.setClipToPadding(false);
    }
}
