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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.z9;
public final class c9 extends c71 implements NotificationCenter.NotificationCenterDelegate {
    public static void Y(c9 c9Var, TL_wallet.tonConnectSession tonconnectsession, Utilities.Callback callback) {
        d2 d2Var = j0.v(c9Var.currentAccount).f33323g;
        d2Var.getClass();
        AndroidUtilities.runOnUIThread(new k(d2Var, tonconnectsession, callback, 4));
    }

    @Override
    public final void U(ArrayList arrayList, z61 z61Var) {
        d2 d2Var = j0.v(this.currentAccount).f33323g;
        if (!d2Var.d.isEmpty()) {
            i2.d.o(R.string.WalletActiveConnections, arrayList);
        }
        ArrayList arrayList2 = d2Var.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            int i11 = a9.f32938a;
            l61 J = l61.J(a9.class);
            J.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(J);
        }
        i2.d.y(R.string.WalletConnectedAppsInfo, arrayList);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletConnectedApps);
    }

    @Override
    public final void W(l61 l61Var, View view) {
        String string;
        TLRPC.WebDocument webDocument;
        Object obj = l61Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.c6 resourceProvider = getResourceProvider();
            y6 y6Var = new y6(5, this, tonconnectsession);
            LinearLayout f7 = org.telegram.messenger.q.f(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(R.drawable.ic_ab_close);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, resourceProvider), 1, -1));
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, resourceProvider), PorterDuff.Mode.SRC_IN));
            w7.c6.a(imageView);
            frameLayout.addView(imageView, w7.a6.a(48.0f, 4.0f, 0.0f, 0.0f, 0.0f, 48, 51));
            z9 z9Var = new z9(parentActivity);
            z9Var.setRoundRadius(AndroidUtilities.dp(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            String str = null;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                z9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(z9Var, w7.a6.a(76.0f, 0.0f, 32.0f, 0.0f, 0.0f, 76, 49));
            f7.addView(frameLayout, w7.a6.n(-1, -2));
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
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, resourceProvider));
            f7.addView(textView, w7.a6.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str);
            if (!TextUtils.isEmpty(hostAuthority)) {
                TextView textView2 = new TextView(parentActivity);
                yh.k(14.0f, 1, textView2);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, resourceProvider));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) hostAuthority);
                textView2.setText(spannableStringBuilder);
                f7.addView(textView2, w7.a6.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(LocaleController.getString(R.string.WalletConnectedAppInfo));
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, resourceProvider));
            f7.addView(textView3, w7.a6.t(-2, -2, 49, 36, 16, 36, 28));
            di.d dVar = new di.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletDisconnect));
            dVar.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20139q7, resourceProvider));
            f7.addView(dVar, w7.a6.t(-1, 44, 1, 16, 0, 16, 16));
            i2 i2Var = new i2(parentActivity, f7, resourceProvider);
            i2Var.show();
            imageView.setOnClickListener(new e1(i2Var, 1));
            dVar.setOnClickListener(new d7(dVar, y6Var, i2Var, resourceProvider));
        }
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f23964a);
        this.f23964a.p1();
        this.f23964a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        if (i10 == NotificationCenter.walletUpdate && (b71Var = this.f23964a) != null) {
            b71Var.W2.N(true);
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
        this.f23964a.setPadding(0, 0, 0, i13);
        this.f23964a.setClipToPadding(false);
    }
}
