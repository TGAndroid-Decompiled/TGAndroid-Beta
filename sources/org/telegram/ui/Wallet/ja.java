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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.m20;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.x31;
public final class ja extends o41 implements ls {
    public static void d0(ja jaVar, TL_wallet.tonConnectSession tonconnectsession, c20 c20Var) {
        d2 d2Var = l0.x(jaVar.currentAccount).f42754g;
        d2Var.getClass();
        org.telegram.messenger.g0.h3(new g(d2Var, tonconnectsession, c20Var, 4));
    }

    @Override
    public final void Z(ArrayList arrayList, m41 m41Var) {
        d2 d2Var = l0.x(this.currentAccount).f42754g;
        if (!d2Var.d.isEmpty()) {
            arrayList.add(x31.u(id.M0(2131743206, null)));
        }
        ArrayList arrayList2 = d2Var.d;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            int i10 = ha.f42596b;
            x31 K = x31.K(ha.class);
            K.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        arrayList.add(x31.C(id.M0(2131743155, null)));
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131743156, null);
    }

    @Override
    public final void b0(x31 x31Var, View view) {
        String M0;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = x31Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
            s sVar = new s(12, this, tonconnectsession);
            LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231241);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i7 = org.telegram.ui.ActionBar.m6.f27982i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i7, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.s(imageView, i10, resourceProvider, PorterDuff.Mode.SRC_IN);
            c8.ka.a(imageView);
            frameLayout.addView(imageView, c8.ha.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                k9Var.p(hc.p(m20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(k9Var, c8.ha.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            e10.addView(frameLayout, c8.ha.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                M0 = tonconnectmanifest2.name;
            } else {
                M0 = id.M0(2131743158, null);
            }
            textView.setText(M0);
            org.telegram.ui.ActionBar.t6.U(textView, i10, resourceProvider);
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
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Ci, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) K0);
                textView2.setText(spannableStringBuilder);
                e10.addView(textView2, c8.ha.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(id.M0(2131743157, null));
            org.telegram.ui.ActionBar.t6.U(textView3, i10, resourceProvider);
            e10.addView(textView3, c8.ha.t(-2, -2, 49, 36, 16, 36, 28));
            fi.d dVar = new fi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(id.M0(2131743130, null));
            int i11 = org.telegram.ui.ActionBar.m6.f28131q7;
            dVar.setColor(org.telegram.ui.ActionBar.m6.w0(i11, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(dVar, background, M2, null, resourceProvider);
            }
            e10.addView(dVar, c8.ha.t(-1, 44, 1, 16, 0, 16, 16));
            y2 y2Var = new y2(parentActivity, e10, resourceProvider);
            y2Var.show();
            imageView.setOnClickListener(new q1(y2Var, 1));
            dVar.setOnClickListener(new j8(dVar, sVar, y2Var, resourceProvider, 3));
        }
    }

    @Override
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f36518a);
        this.f36518a.r1();
        this.f36518a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.w3 w3Var;
        if (i7 == qs.f24975a4 && (w3Var = this.f36518a) != null) {
            w3Var.f37496f3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.f24975a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.f24975a4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f36518a.setPadding(0, 0, 0, i12);
        this.f36518a.setClipToPadding(false);
    }
}
