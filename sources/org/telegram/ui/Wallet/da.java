package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
public final class da extends v61 implements NotificationCenter.NotificationCenterDelegate {
    public static void Y(da daVar, TL_wallet.tonConnectSession tonconnectsession, Utilities.Callback callback) {
        f2 f2Var = m0.w(daVar.currentAccount).f34555g;
        f2Var.getClass();
        AndroidUtilities.runOnUIThread(new h(f2Var, tonconnectsession, callback, 4));
    }

    @Override
    public final void U(ArrayList arrayList, s61 s61Var) {
        f2 f2Var = m0.w(this.currentAccount).f34555g;
        if (!f2Var.d.isEmpty()) {
            i0.a.p(R.string.WalletActiveConnections, arrayList);
        }
        ArrayList arrayList2 = f2Var.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            int i11 = ba.f34057a;
            f61 J = f61.J(ba.class);
            J.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(J);
        }
        i0.a.A(R.string.WalletConnectedAppsInfo, arrayList);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletConnectedApps);
    }

    @Override
    public final void W(f61 f61Var, View view) {
        String string;
        TLRPC.WebDocument webDocument;
        Object obj = f61Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
            x xVar = new x(12, this, tonconnectsession);
            LinearLayout e = org.telegram.messenger.q.e(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(R.drawable.ic_ab_close);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, resourceProvider), 1, -1));
            int i10 = org.telegram.ui.ActionBar.h6.G6;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, resourceProvider), PorterDuff.Mode.SRC_IN));
            w7.b6.a(imageView);
            frameLayout.addView(imageView, w7.z5.a(48.0f, 4.0f, 0.0f, 0.0f, 0.0f, 48, 51));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
            w9Var.setRoundRadius(AndroidUtilities.dp(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            String str = null;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                w9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(w9Var, w7.z5.a(76.0f, 0.0f, 32.0f, 0.0f, 0.0f, 76, 49));
            e.addView(frameLayout, w7.z5.n(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                string = tonconnectmanifest2.name;
            } else {
                string = LocaleController.getString(R.string.WalletConnectedApp);
            }
            textView.setText(string);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, resourceProvider));
            e.addView(textView, w7.z5.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str);
            if (!TextUtils.isEmpty(hostAuthority)) {
                TextView textView2 = new TextView(parentActivity);
                wh.k(14.0f, 1, textView2);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, resourceProvider));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) hostAuthority);
                textView2.setText(spannableStringBuilder);
                e.addView(textView2, w7.z5.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(LocaleController.getString(R.string.WalletConnectedAppInfo));
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, resourceProvider));
            e.addView(textView3, w7.z5.t(-2, -2, 49, 36, 16, 36, 28));
            ei.d dVar = new ei.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletDisconnect));
            dVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21224q7, resourceProvider));
            e.addView(dVar, w7.z5.t(-1, 44, 1, 16, 0, 16, 16));
            k2 k2Var = new k2(parentActivity, e, resourceProvider);
            k2Var.show();
            imageView.setOnClickListener(new g1(k2Var, 1));
            dVar.setOnClickListener(new d8(dVar, xVar, k2Var, resourceProvider));
        }
    }

    @Override
    public final boolean X(f61 f61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f31190a);
        this.f31190a.p1();
        this.f31190a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        if (i10 == NotificationCenter.walletUpdate && (u61Var = this.f31190a) != null) {
            u61Var.W2.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31190a.setPadding(0, 0, 0, i13);
        this.f31190a.setClipToPadding(false);
    }
}
