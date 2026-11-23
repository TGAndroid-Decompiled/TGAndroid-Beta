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
import org.telegram.messenger.g20;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.a31;
public final class za extends d51 implements fs {
    public static void d0(za zaVar, TL_wallet.tonConnectSession tonconnectsession, w10 w10Var) {
        m2 m2Var = v0.D(zaVar.currentAccount).f45260g;
        m2Var.getClass();
        org.telegram.messenger.g0.g3(new p(m2Var, tonconnectsession, w10Var, 5));
    }

    @Override
    public final void Z(ArrayList arrayList, b51 b51Var) {
        m2 m2Var = v0.D(this.currentAccount).f45260g;
        if (!m2Var.d.isEmpty()) {
            i5.c.s(2131742955, null, arrayList);
        }
        ArrayList arrayList2 = m2Var.d;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            int i10 = xa.f45399b;
            n41 K = n41.K(xa.class);
            K.H = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        m2Var.getClass();
        arrayList.add(n41.C(gd.N0(2131742904, null)));
    }

    @Override
    public final CharSequence a0() {
        return gd.N0(2131742905, null);
    }

    @Override
    public final void b0(n41 n41Var, View view) {
        String N0;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = n41Var.H;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
            a31 a31Var = new a31(17, this, tonconnectsession);
            LinearLayout f10 = org.telegram.messenger.f3.f(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231244);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.s(imageView, i10, resourceProvider, PorterDuff.Mode.SRC_IN);
            c8.sa.a(imageView);
            frameLayout.addView(imageView, c8.na.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                p9Var.p(fc.p(g20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(p9Var, c8.na.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            f10.addView(frameLayout, c8.na.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                N0 = tonconnectmanifest2.name;
            } else {
                N0 = gd.N0(2131742907, null);
            }
            textView.setText(N0);
            org.telegram.ui.ActionBar.u6.U(textView, i10, resourceProvider);
            f10.addView(textView, c8.na.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            } else {
                str = null;
            }
            String K0 = org.telegram.messenger.g0.K0(str, false);
            if (!TextUtils.isEmpty(K0)) {
                TextView textView2 = new TextView(parentActivity);
                m10.p(textView2, 1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Fi, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) K0);
                textView2.setText(spannableStringBuilder);
                f10.addView(textView2, c8.na.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(gd.N0(2131742906, null));
            org.telegram.ui.ActionBar.u6.U(textView3, i10, resourceProvider);
            f10.addView(textView3, c8.na.t(-2, -2, 49, 36, 16, 36, 28));
            hi.e eVar = new hi.e(parentActivity, resourceProvider, true);
            eVar.setRoundRadius(24);
            eVar.setText(gd.N0(2131742879, null));
            int i11 = org.telegram.ui.ActionBar.n6.f29692q7;
            eVar.setColor(org.telegram.ui.ActionBar.n6.w0(i11, resourceProvider));
            if (eVar.getBackground() != null) {
                Drawable background = eVar.getBackground();
                org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
                eVar.setBackground(background);
                org.telegram.ui.ActionBar.u6.j(eVar, background, M2, null, resourceProvider);
            }
            f10.addView(eVar, c8.na.t(-1, 44, 1, 16, 0, 16, 16));
            f3 f3Var = new f3(parentActivity, f10, resourceProvider);
            f3Var.show();
            imageView.setOnClickListener(new a2(f3Var, 1));
            eVar.setOnClickListener(new x8(eVar, a31Var, f3Var, resourceProvider, 3));
        }
    }

    @Override
    public final boolean c0(n41 n41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f34213a);
        this.f34213a.r1();
        this.f34213a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.i6 i6Var;
        if (i7 == ks.f25201d4 && (i6Var = this.f34213a) != null) {
            i6Var.f35323g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.f25201d4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.f25201d4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f34213a.setPadding(0, 0, 0, i12);
        this.f34213a.setClipToPadding(false);
    }
}
