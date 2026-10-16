package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.z9;
import org.telegram.ui.c90;
import org.telegram.ui.wg1;
public final class l7 extends d71 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList d = new ArrayList();
    public boolean e;

    public static void Y(l7 l7Var, Utilities.Callback callback, k0 k0Var, p0 p0Var, h0 h0Var) {
        if (h0Var == null) {
            callback.run("STORAGE_FAILED");
            return;
        }
        p pVar = null;
        callback.run(null);
        ArrayList g10 = h0Var.g();
        Activity parentActivity = l7Var.getParentActivity();
        org.telegram.ui.ActionBar.c6 c6Var = l7Var.resourceProvider;
        if (BuildVars.DEBUG_PRIVATE_VERSION && k0Var.e()) {
            pVar = new p((d71) l7Var, k0Var, (Object) g10, 6);
        }
        f0(parentActivity, g10, c6Var, pVar, new wg1(22, l7Var, p0Var));
    }

    public static void Z(l7 l7Var, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        pf.c g10 = a2Var.g(i10, true, true);
        g10.d();
        int i11 = l7Var.currentAccount;
        h7 h7Var = new h7(l7Var, g10, 0);
        k0 v = k0.v(i11);
        v.h0(new c90(i11, h7Var, v));
    }

    public static void a0(l7 l7Var, Boolean bool) {
        k0 v = k0.v(l7Var.currentAccount);
        l lVar = new l(l7Var, bool, v);
        if (bool.booleanValue() && BuildVars.DEBUG_PRIVATE_VERSION) {
            v.h0(new e2.o0((Object) v, (Object) new z6(1, l7Var, lVar), false, true, 3));
        } else {
            lVar.run();
        }
    }

    public static void b0(l7 l7Var, Utilities.Callback callback, h0 h0Var, String str) {
        if (str != null) {
            callback.run(str);
        } else if (h0Var == null) {
            callback.run("WORDS_NULL");
        } else {
            callback.run(null);
            f0(l7Var.getParentActivity(), h0Var.g(), l7Var.resourceProvider, null, null);
        }
    }

    public static void c0(l7 l7Var, Utilities.Callback callback) {
        k0.v(l7Var.currentAccount).x(new bi.f0(28, l7Var, callback), true, false);
    }

    public static LinearLayout d0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, String str) {
        LinearLayout e = sk.e(context, 0);
        e.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        e.addView(imageView, w7.z5.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        textView.setText(AndroidUtilities.replaceTags(str));
        e.addView(textView, w7.z5.o(-1, -2, 1.0f, 16));
        return e;
    }

    public static LinearLayout e0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.c6 c6Var) {
        LinearLayout e = sk.e(context, 1);
        int i12 = i10;
        while (i12 < i11) {
            LinearLayout linearLayout = new LinearLayout(context);
            int i13 = 0;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(8388613);
            textView.setIncludeFontPadding(false);
            textView.setLineSpacing(0.0f, 1.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
            StringBuilder sb2 = new StringBuilder();
            int i14 = i12 + 1;
            sb2.append(i14);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView i15 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(26, -2, 8388613, 0, 0, 6, 0), context);
            i15.setTextSize(1, 15.0f);
            i15.setTypeface(AndroidUtilities.bold());
            i15.setIncludeFontPadding(false);
            i15.setLineSpacing(0.0f, 1.0f);
            i15.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            i15.setText((CharSequence) arrayList.get(i12));
            linearLayout.addView(i15, w7.z5.n(-2, -2));
            if (i12 != i10) {
                i13 = 10;
            }
            e.addView(linearLayout, w7.z5.t(-2, -2, 8388611, 0, i13, 0, 0));
            i12 = i14;
        }
        return e;
    }

    public static void f0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.c6 c6Var, p pVar, wg1 wg1Var) {
        di.d dVar;
        float f7;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) activity, c6Var, false);
        e3Var.fixNavigationBar();
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        z9 z9Var = new z9(activity);
        z9Var.setAspectFit(true);
        z9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(z9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(z9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView.setText(LocaleController.getString(R.string.WalletYourRecoveryPhrase));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
        textView2.setText(LocaleController.getString(R.string.WalletRecoveryPhraseInfo));
        textView2.setMaxWidth(AndroidUtilities.dp(330.0f));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.z5.q(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout e02 = e0(0, size, activity, arrayList, c6Var);
        LinearLayout e03 = e0(size, arrayList.size(), activity, arrayList, c6Var);
        linearLayout3.addView(e02, w7.z5.o(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), w7.z5.n(10, 0));
        linearLayout3.addView(e03, w7.z5.o(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, w7.z5.q(-1, -2, 1));
        linearLayout.addView(linearLayout2, w7.z5.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e.addView(linearLayout, w7.z5.n(-1, -2));
        if (pVar != null) {
            dVar = new di.d(activity, c6Var, true);
            dVar.setRoundRadius(24);
            e.addView(dVar, w7.z5.a(48.0f, 14.0f, 14.0f, 14.0f, 4.0f, -1, 1));
        } else {
            dVar = null;
        }
        di.d dVar2 = new di.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        if (dVar != null) {
            f7 = 4.0f;
        } else {
            f7 = 14.0f;
        }
        e.addView(dVar2, w7.z5.a(48.0f, 14.0f, f7, 14.0f, 14.0f, -1, 1));
        e3Var.customView = e;
        e3Var.fixNavigationBar();
        if (dVar != null && pVar != null) {
            dVar2.setFilled(false);
            dVar.setText(LocaleController.getString(R.string.WalletImportThisWallet));
            di.d dVar3 = dVar;
            dVar3.setOnClickListener(new c7(dVar3, pVar, e3Var, c6Var, 1));
        }
        if (wg1Var != null) {
            dVar2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19839q7, c6Var));
            dVar2.setText(LocaleController.getString(R.string.WalletDelete));
            dVar2.setOnClickListener(new e7(activity, c6Var, wg1Var, e3Var));
        } else {
            dVar2.setText(LocaleController.getString(R.string.WalletDone));
            dVar2.setOnClickListener(new f3(e3Var, 1));
        }
        e3Var.show();
    }

    public static void g0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) activity, c6Var, false);
        e3Var.fixNavigationBar();
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        LinearLayout e7 = org.telegram.messenger.g0.e(activity, 1);
        e7.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), 0);
        b31 b31Var = new b31(activity, c6Var);
        b31Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(4.0f));
        b31Var.setEmojiSize(100);
        z9 z9Var = b31Var.f23382b;
        z9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(z9Var, "RestrictedEmoji", "📝", "100_100");
        e7.addView(b31Var, w7.z5.q(-1, -2, 7));
        String string = LocaleController.getString(R.string.WalletRecoveryPhraseLearnTitle);
        da0 da0Var = b31Var.f23383c;
        CharSequence replaceEmoji = Emoji.replaceEmoji(string, da0Var.getPaint().getFontMetricsInt(), false);
        String string2 = LocaleController.getString(R.string.WalletRecoveryPhraseLearnInfo);
        da0 da0Var2 = b31Var.d;
        b31Var.a(replaceEmoji, Emoji.replaceEmoji(string2, da0Var2.getPaint().getFontMetricsInt(), false));
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
        NotificationCenter.listenEmojiLoading(da0Var);
        NotificationCenter.listenEmojiLoading(da0Var2);
        e7.addView(d0(activity, c6Var, R.drawable.wallet_learn_hidden, LocaleController.getString(R.string.WalletRecoveryPhraseNeverShare)));
        e7.addView(d0(activity, c6Var, R.drawable.wallet_learn_warn, LocaleController.getString(R.string.WalletRecoveryPhraseFundsWarning)));
        e7.addView(d0(activity, c6Var, R.drawable.wallet_learn_protected, LocaleController.getString(R.string.WalletRecoveryPhraseSupportWarning)));
        e.addView(e7, w7.z5.n(-1, -2));
        di.d dVar = new di.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton), false, true);
        e.addView(dVar, w7.z5.a(48.0f, 14.0f, 14.0f, 14.0f, 0.0f, -1, 7));
        e3Var.customView = e;
        e3Var.fixNavigationBar();
        dVar.setOnClickListener(new c7(dVar, callback, e3Var, c6Var, 0));
        e3Var.show();
    }

    @Override
    public final void U(java.util.ArrayList r9, org.telegram.ui.Components.a71 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l7.U(java.util.ArrayList, org.telegram.ui.Components.a71):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletKeysAndBackup);
    }

    @Override
    public final void W(m61 m61Var, View view) {
        int i10 = m61Var.d;
        if (i10 == 1) {
            k0 v = k0.v(this.currentAccount);
            if (v.f()) {
                a7 a7Var = new a7();
                a7Var.f32675s = v.w();
                presentFragment(a7Var);
                return;
            }
            g0(getParentActivity(), getResourceProvider(), new b7(this, 0));
            return;
        }
        String str = null;
        if (i10 == 3) {
            k0 v10 = k0.v(this.currentAccount);
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
            a2Var.q(500L);
            j jVar = new j(this, a2Var, v10);
            k0.E("emulate disable backup: when ready");
            wg1 wg1Var = new wg1(10, v10, jVar);
            if (v10.D() && v10.f33095f != null) {
                wg1Var.run();
            } else {
                v10.v.add(new WeakReference(wg1Var));
            }
        } else if (i10 == 2) {
            k0 v11 = k0.v(this.currentAccount);
            b7 b7Var = new b7(this, 1);
            k0.E("enable backup: when ready...");
            v11.h0(new wg1(8, v11, b7Var));
        } else if (i10 == 4) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
            String string2 = LocaleController.getString(R.string.WalletDeleteWalletInfo);
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str = LocaleController.getString(R.string.WalletSaveOnDevice);
            }
            org.telegram.ui.ActionBar.a2 h02 = org.telegram.ui.Components.g5.h0(parentActivity, string, string2, str, LocaleController.getString(R.string.WalletDeleteAnyway), new b7(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) h02.d(-1);
            if (textView != null) {
                textView.setTextColor(h02.e(org.telegram.ui.ActionBar.g6.f19839q7));
            }
        } else if (m61Var.G(j7.class)) {
            String charSequence = m61Var.f26946l.toString();
            g0(getParentActivity(), getResourceProvider(), new r(this, k0.v(this.currentAccount), charSequence, new p0(getParentActivity(), charSequence, this.currentAccount)));
        }
    }

    @Override
    public final boolean X(m61 m61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f24003a);
        this.f24003a.p1();
        this.f24003a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        if (i10 == NotificationCenter.walletUpdate && (c71Var = this.f24003a) != null) {
            c71Var.W2.N(true);
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
        this.e = true;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f24003a.setPadding(0, 0, 0, i13);
        this.f24003a.setClipToPadding(false);
    }
}
