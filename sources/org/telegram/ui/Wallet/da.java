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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m61;
public final class da extends e71 implements NotificationCenter.NotificationCenterDelegate {
    public static void Y(da daVar, TL_wallet.tonConnectSession tonconnectsession, Utilities.Callback callback) {
        e2 e2Var = l0.w(daVar.currentAccount).f34745g;
        e2Var.getClass();
        AndroidUtilities.runOnUIThread(new h(e2Var, tonconnectsession, callback, 4));
    }

    @Override
    public final void U(ArrayList arrayList, b71 b71Var) {
        e2 e2Var = l0.w(this.currentAccount).f34745g;
        if (!e2Var.d.isEmpty()) {
            i2.o1.q(R.string.WalletActiveConnections, arrayList);
        }
        ArrayList arrayList2 = e2Var.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            int i11 = ba.f34342a;
            m61 J = m61.J(ba.class);
            J.G = (TL_wallet.tonConnectSession) obj;
            arrayList.add(J);
        }
        i2.o1.B(R.string.WalletConnectedAppsInfo, arrayList);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletConnectedApps);
    }

    @Override
    public final void W(m61 m61Var, View view) {
        String string;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = m61Var.G;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
            w wVar = new w(12, this, tonconnectsession);
            LinearLayout f7 = org.telegram.messenger.v0.f(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(R.drawable.ic_ab_close);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i10 = org.telegram.ui.ActionBar.k6.f21272i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i10, resourceProvider), 1, -1);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
            imageView.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, resourceProvider);
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.t(imageView, i11, resourceProvider, PorterDuff.Mode.SRC_IN);
            w7.b6.a(imageView);
            frameLayout.addView(imageView, w7.z5.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
            w9Var.setRoundRadius(AndroidUtilities.dp(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                w9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(w9Var, w7.z5.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            f7.addView(frameLayout, w7.z5.n(-1, -2));
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
            org.telegram.ui.ActionBar.r6.W(textView, i11, resourceProvider);
            f7.addView(textView, w7.z5.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            } else {
                str = null;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str);
            if (!TextUtils.isEmpty(hostAuthority)) {
                TextView textView2 = new TextView(parentActivity);
                sl.k(14.0f, 1, textView2);
                org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Oh, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) hostAuthority);
                textView2.setText(spannableStringBuilder);
                f7.addView(textView2, w7.z5.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(LocaleController.getString(R.string.WalletConnectedAppInfo));
            org.telegram.ui.ActionBar.r6.W(textView3, i11, resourceProvider);
            f7.addView(textView3, w7.z5.t(-2, -2, 49, 36, 16, 36, 28));
            ei.d dVar = new ei.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletDisconnect));
            int i12 = org.telegram.ui.ActionBar.k6.f21421q7;
            dVar.setColor(org.telegram.ui.ActionBar.k6.w0(i12, resourceProvider));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(dVar, background, O2, null, resourceProvider);
            }
            f7.addView(dVar, w7.z5.t(-1, 44, 1, 16, 0, 16, 16));
            j2 j2Var = new j2(parentActivity, f7, resourceProvider);
            j2Var.show();
            imageView.setOnClickListener(new f1(j2Var, 1));
            dVar.setOnClickListener(new a8(dVar, wVar, j2Var, resourceProvider));
        }
    }

    @Override
    public final boolean X(m61 m61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f25907a);
        this.f25907a.t1();
        this.f25907a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d71 d71Var;
        if (i10 == NotificationCenter.walletUpdate && (d71Var = this.f25907a) != null) {
            d71Var.Z2.N(true);
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
        this.f25907a.setPadding(0, 0, 0, i13);
        this.f25907a.setClipToPadding(false);
    }
}
