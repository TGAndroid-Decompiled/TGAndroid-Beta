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
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.p51;
public final class ya extends e51 implements gs {
    public static void d0(ya yaVar, TL_wallet.tonConnectSession tonconnectsession, y10 y10Var) {
        l2 l2Var = u0.D(yaVar.currentAccount).f45098g;
        l2Var.getClass();
        org.telegram.messenger.g0.g3(new p(l2Var, tonconnectsession, y10Var, 5));
    }

    @Override
    public final void Z(ArrayList arrayList, c51 c51Var) {
        l2 l2Var = u0.D(this.currentAccount).f45098g;
        if (!l2Var.d.isEmpty()) {
            i5.c.s(2131742962, null, arrayList);
        }
        ArrayList arrayList2 = l2Var.d;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            int i10 = wa.f45237b;
            o41 K = o41.K(wa.class);
            K.H = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        l2Var.getClass();
        arrayList.add(o41.C(hd.N0(2131742911, null)));
    }

    @Override
    public final CharSequence a0() {
        return hd.N0(2131742912, null);
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
            int i7 = org.telegram.ui.ActionBar.m6.f29439i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i7, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, resourceProvider);
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.s(imageView, i10, resourceProvider, PorterDuff.Mode.SRC_IN);
            c8.sa.a(imageView);
            frameLayout.addView(imageView, c8.na.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(parentActivity);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                q9Var.p(gc.p(i20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(q9Var, c8.na.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            f10.addView(frameLayout, c8.na.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                N0 = tonconnectmanifest2.name;
            } else {
                N0 = hd.N0(2131742914, null);
            }
            textView.setText(N0);
            org.telegram.ui.ActionBar.t6.U(textView, i10, resourceProvider);
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
                o10.p(textView2, 1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Fi, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) K0);
                textView2.setText(spannableStringBuilder);
                f10.addView(textView2, c8.na.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(hd.N0(2131742913, null));
            org.telegram.ui.ActionBar.t6.U(textView3, i10, resourceProvider);
            f10.addView(textView3, c8.na.t(-2, -2, 49, 36, 16, 36, 28));
            hi.d dVar = new hi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(hd.N0(2131742886, null));
            int i11 = org.telegram.ui.ActionBar.m6.f29588q7;
            dVar.setColor(org.telegram.ui.ActionBar.m6.w0(i11, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(dVar, background, M2, null, resourceProvider);
            }
            f10.addView(dVar, c8.na.t(-1, 44, 1, 16, 0, 16, 16));
            e3 e3Var = new e3(parentActivity, f10, resourceProvider);
            e3Var.show();
            imageView.setOnClickListener(new z1(e3Var, 1));
            dVar.setOnClickListener(new w8(dVar, p51Var, e3Var, resourceProvider, 3));
        }
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f34671a);
        this.f34671a.r1();
        this.f34671a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.i6 i6Var;
        if (i7 == ls.f25260d4 && (i6Var = this.f34671a) != null) {
            i6Var.f35742g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ls.f25260d4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ls.f25260d4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f34671a.setPadding(0, 0, 0, i12);
        this.f34671a.setClipToPadding(false);
    }
}
