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
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.u61;
public final class ca extends n71 implements NotificationCenter.NotificationCenterDelegate {
    public static void Z(ca caVar, TL_wallet.tonConnectSession tonconnectsession, Utilities.Callback callback) {
        e2 e2Var = l0.x(caVar.currentAccount).f36838g;
        e2Var.getClass();
        AndroidUtilities.runOnUIThread(new h(e2Var, tonconnectsession, callback, 4));
    }

    @Override
    public final void V(ArrayList arrayList, k71 k71Var) {
        e2 e2Var = l0.x(this.currentAccount).f36838g;
        if (!e2Var.d.isEmpty()) {
            ic.a.p(R.string.WalletActiveConnections, arrayList);
        }
        ArrayList arrayList2 = e2Var.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            int i11 = aa.f36402a;
            u61 K = u61.K(aa.class);
            K.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        ic.a.z(R.string.WalletConnectedAppsInfo, arrayList);
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.WalletConnectedApps);
    }

    @Override
    public final void X(u61 u61Var, View view) {
        String string;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = u61Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
            s sVar = new s(14, this, tonconnectsession);
            LinearLayout f7 = org.telegram.messenger.t.f(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(R.drawable.ic_ab_close);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i10 = org.telegram.ui.ActionBar.y6.f23449i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i10, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
            imageView.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, resourceProvider);
            int i11 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.t(imageView, i11, resourceProvider, PorterDuff.Mode.SRC_IN);
            kb1.b(imageView);
            frameLayout.addView(imageView, kb1.h(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
            y9Var.setRoundRadius(AndroidUtilities.dp(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(y9Var, kb1.h(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            f7.addView(frameLayout, kb1.r(-1, -2));
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
            org.telegram.ui.ActionBar.f7.V(textView, i11, resourceProvider);
            f7.addView(textView, kb1.x(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            } else {
                str = null;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str);
            if (!TextUtils.isEmpty(hostAuthority)) {
                TextView textView2 = new TextView(parentActivity);
                wh.j(14.0f, 1, textView2);
                org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.Oh, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) hostAuthority);
                textView2.setText(spannableStringBuilder);
                f7.addView(textView2, kb1.x(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(LocaleController.getString(R.string.WalletConnectedAppInfo));
            org.telegram.ui.ActionBar.f7.V(textView3, i11, resourceProvider);
            f7.addView(textView3, kb1.x(-2, -2, 49, 36, 16, 36, 28));
            fi.d dVar = new fi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletDisconnect));
            int i12 = org.telegram.ui.ActionBar.y6.f23599q7;
            dVar.setColor(org.telegram.ui.ActionBar.y6.w0(i12, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.f7.k(dVar, background, N2, null, resourceProvider);
            }
            f7.addView(dVar, kb1.x(-1, 44, 1, 16, 0, 16, 16));
            j2 j2Var = new j2(parentActivity, f7, resourceProvider);
            j2Var.show();
            imageView.setOnClickListener(new f1(j2Var, 1));
            dVar.setOnClickListener(new a8(dVar, sVar, j2Var, resourceProvider));
        }
    }

    @Override
    public final boolean Y(u61 u61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f30764a);
        this.f30764a.u1();
        this.f30764a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m71 m71Var;
        if (i10 == NotificationCenter.walletUpdate && (m71Var = this.f30764a) != null) {
            m71Var.f32504g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.walletUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f30764a.setPadding(0, 0, 0, i13);
        this.f30764a.setClipToPadding(false);
    }
}
