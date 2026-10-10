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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.y9;
public final class d9 extends g71 implements NotificationCenter.NotificationCenterDelegate {
    public static void Y(d9 d9Var, TL_wallet.tonConnectSession tonconnectsession, Utilities.Callback callback) {
        e2 e2Var = k0.v(d9Var.currentAccount).f35160g;
        e2Var.getClass();
        AndroidUtilities.runOnUIThread(new l(e2Var, tonconnectsession, callback, 4));
    }

    @Override
    public final void U(ArrayList arrayList, d71 d71Var) {
        e2 e2Var = k0.v(this.currentAccount).f35160g;
        if (!e2Var.d.isEmpty()) {
            com.google.android.gms.internal.vision.e2.n(R.string.WalletActiveConnections, arrayList);
        }
        ArrayList arrayList2 = e2Var.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            int i11 = b9.f34753a;
            q61 J = q61.J(b9.class);
            J.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(J);
        }
        hg.c.n(R.string.WalletConnectedAppsInfo, arrayList);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletConnectedApps);
    }

    @Override
    public final void W(q61 q61Var, View view) {
        String string;
        TLRPC.WebDocument webDocument;
        Object obj = q61Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            a7 a7Var = new a7(5, this, tonconnectsession);
            LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(R.drawable.ic_ab_close);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, resourceProvider), 1, -1));
            int i10 = org.telegram.ui.ActionBar.i6.G6;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, resourceProvider), PorterDuff.Mode.SRC_IN));
            w7.z5.a(imageView);
            frameLayout.addView(imageView, w7.x5.a(48.0f, 4.0f, 0.0f, 0.0f, 0.0f, 48, 51));
            y9 y9Var = new y9(parentActivity);
            y9Var.setRoundRadius(AndroidUtilities.dp(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            String str = null;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(y9Var, w7.x5.a(76.0f, 0.0f, 32.0f, 0.0f, 0.0f, 76, 49));
            e7.addView(frameLayout, w7.x5.n(-1, -2));
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
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, resourceProvider));
            e7.addView(textView, w7.x5.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str);
            if (!TextUtils.isEmpty(hostAuthority)) {
                TextView textView2 = new TextView(parentActivity);
                bi.k(14.0f, 1, textView2);
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, resourceProvider));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) hostAuthority);
                textView2.setText(spannableStringBuilder);
                e7.addView(textView2, w7.x5.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(LocaleController.getString(R.string.WalletConnectedAppInfo));
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, resourceProvider));
            e7.addView(textView3, w7.x5.t(-2, -2, 49, 36, 16, 36, 28));
            ci.d dVar = new ci.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletDisconnect));
            dVar.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21041q7, resourceProvider));
            e7.addView(dVar, w7.x5.t(-1, 44, 1, 16, 0, 16, 16));
            j2 j2Var = new j2(parentActivity, e7, resourceProvider);
            j2Var.show();
            imageView.setOnClickListener(new f1(j2Var, 1));
            dVar.setOnClickListener(new f7(dVar, a7Var, j2Var, resourceProvider));
        }
    }

    @Override
    public final boolean X(q61 q61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f26629a);
        this.f26629a.p1();
        this.f26629a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f71 f71Var;
        if (i10 == NotificationCenter.walletUpdate && (f71Var = this.f26629a) != null) {
            f71Var.W2.N(true);
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
        this.f26629a.setPadding(0, 0, 0, i13);
        this.f26629a.setClipToPadding(false);
    }
}
