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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.f31;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.y9;
import org.telegram.ui.bi0;
import org.telegram.ui.ii1;
public final class m7 extends g71 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList d = new ArrayList();
    public boolean f35306e;

    public static void Y(m7 m7Var, Utilities.Callback callback, k0 k0Var, p0 p0Var, h0 h0Var) {
        if (h0Var == null) {
            callback.run("STORAGE_FAILED");
            return;
        }
        p pVar = null;
        callback.run(null);
        ArrayList g10 = h0Var.g();
        Activity parentActivity = m7Var.getParentActivity();
        org.telegram.ui.ActionBar.e6 e6Var = m7Var.resourceProvider;
        if (BuildVars.DEBUG_PRIVATE_VERSION && k0Var.e()) {
            pVar = new p((g71) m7Var, k0Var, (Object) g10, 6);
        }
        f0(parentActivity, g10, e6Var, pVar, new ii1(16, m7Var, p0Var));
    }

    public static void Z(m7 m7Var, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        of.e g10 = b2Var.g(i10, true, true);
        g10.d();
        int i11 = m7Var.currentAccount;
        i7 i7Var = new i7(m7Var, g10, 0);
        k0 v = k0.v(i11);
        v.h0(new bi0(i11, i7Var, v));
    }

    public static void a0(m7 m7Var, Boolean bool) {
        k0 v = k0.v(m7Var.currentAccount);
        l lVar = new l(m7Var, bool, v);
        if (bool.booleanValue() && BuildVars.DEBUG_PRIVATE_VERSION) {
            v.h0(new org.telegram.messenger.camera.i((Object) v, (Object) new a7(1, m7Var, lVar), false, true, 2));
        } else {
            lVar.run();
        }
    }

    public static void b0(m7 m7Var, Utilities.Callback callback, h0 h0Var, String str) {
        if (str != null) {
            callback.run(str);
        } else if (h0Var == null) {
            callback.run("WORDS_NULL");
        } else {
            callback.run(null);
            f0(m7Var.getParentActivity(), h0Var.g(), m7Var.resourceProvider, null, null);
        }
    }

    public static void c0(m7 m7Var, Utilities.Callback callback) {
        k0.v(m7Var.currentAccount).x(new ai.m0(28, m7Var, callback), true, false);
    }

    public static LinearLayout d0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, String str) {
        LinearLayout e7 = bi.e(context, 0);
        e7.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        e7.addView(imageView, w7.x5.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        textView.setText(AndroidUtilities.replaceTags(str));
        e7.addView(textView, w7.x5.o(-1, -2, 1.0f, 16));
        return e7;
    }

    public static LinearLayout e0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        LinearLayout e7 = bi.e(context, 1);
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
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, e6Var));
            StringBuilder sb2 = new StringBuilder();
            int i14 = i12 + 1;
            sb2.append(i14);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(26, -2, 8388613, 0, 0, 6, 0), context);
            h.setTextSize(1, 15.0f);
            h.setTypeface(AndroidUtilities.bold());
            h.setIncludeFontPadding(false);
            h.setLineSpacing(0.0f, 1.0f);
            h.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
            h.setText((CharSequence) arrayList.get(i12));
            linearLayout.addView(h, w7.x5.n(-2, -2));
            if (i12 != i10) {
                i13 = 10;
            }
            e7.addView(linearLayout, w7.x5.t(-2, -2, 8388611, 0, i13, 0, 0));
            i12 = i14;
        }
        return e7;
    }

    public static void f0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var, p pVar, ii1 ii1Var) {
        ci.d dVar;
        float f7;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, e6Var, false);
        f3Var.fixNavigationBar();
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        y9 y9Var = new y9(activity);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(y9Var, w7.x5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView.setText(LocaleController.getString(R.string.WalletYourRecoveryPhrase));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, e6Var));
        textView2.setText(LocaleController.getString(R.string.WalletRecoveryPhraseInfo));
        textView2.setMaxWidth(AndroidUtilities.dp(330.0f));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.x5.q(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout e02 = e0(0, size, activity, arrayList, e6Var);
        LinearLayout e03 = e0(size, arrayList.size(), activity, arrayList, e6Var);
        linearLayout3.addView(e02, w7.x5.o(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), w7.x5.n(10, 0));
        linearLayout3.addView(e03, w7.x5.o(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, w7.x5.q(-1, -2, 1));
        linearLayout.addView(linearLayout2, w7.x5.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e7.addView(linearLayout, w7.x5.n(-1, -2));
        if (pVar != null) {
            dVar = new ci.d(activity, e6Var, true);
            dVar.setRoundRadius(24);
            e7.addView(dVar, w7.x5.a(48.0f, 14.0f, 14.0f, 14.0f, 4.0f, -1, 1));
        } else {
            dVar = null;
        }
        ci.d dVar2 = new ci.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        if (dVar != null) {
            f7 = 4.0f;
        } else {
            f7 = 14.0f;
        }
        e7.addView(dVar2, w7.x5.a(48.0f, 14.0f, f7, 14.0f, 14.0f, -1, 1));
        f3Var.customView = e7;
        f3Var.fixNavigationBar();
        if (dVar != null && pVar != null) {
            dVar2.setFilled(false);
            dVar.setText(LocaleController.getString(R.string.WalletImportThisWallet));
            ci.d dVar3 = dVar;
            dVar3.setOnClickListener(new d7(dVar3, pVar, f3Var, e6Var, 1));
        }
        if (ii1Var != null) {
            dVar2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21041q7, e6Var));
            dVar2.setText(LocaleController.getString(R.string.WalletDelete));
            dVar2.setOnClickListener(new f7(activity, e6Var, ii1Var, f3Var));
        } else {
            dVar2.setText(LocaleController.getString(R.string.WalletDone));
            dVar2.setOnClickListener(new f3(f3Var, 1));
        }
        f3Var.show();
    }

    public static void g0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, e6Var, false);
        f3Var.fixNavigationBar();
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        e7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        LinearLayout e10 = org.telegram.messenger.q.e(activity, 1);
        e10.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), 0);
        f31 f31Var = new f31(activity, e6Var);
        f31Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(4.0f));
        f31Var.setEmojiSize(100);
        y9 y9Var = f31Var.f26266b;
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        e10.addView(f31Var, w7.x5.q(-1, -2, 7));
        String string = LocaleController.getString(R.string.WalletRecoveryPhraseLearnTitle);
        fa0 fa0Var = f31Var.f26267c;
        CharSequence replaceEmoji = Emoji.replaceEmoji(string, fa0Var.getPaint().getFontMetricsInt(), false);
        String string2 = LocaleController.getString(R.string.WalletRecoveryPhraseLearnInfo);
        fa0 fa0Var2 = f31Var.d;
        f31Var.a(replaceEmoji, Emoji.replaceEmoji(string2, fa0Var2.getPaint().getFontMetricsInt(), false));
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        fa0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, e6Var));
        NotificationCenter.listenEmojiLoading(fa0Var);
        NotificationCenter.listenEmojiLoading(fa0Var2);
        e10.addView(d0(activity, e6Var, R.drawable.wallet_learn_hidden, LocaleController.getString(R.string.WalletRecoveryPhraseNeverShare)));
        e10.addView(d0(activity, e6Var, R.drawable.wallet_learn_warn, LocaleController.getString(R.string.WalletRecoveryPhraseFundsWarning)));
        e10.addView(d0(activity, e6Var, R.drawable.wallet_learn_protected, LocaleController.getString(R.string.WalletRecoveryPhraseSupportWarning)));
        e7.addView(e10, w7.x5.n(-1, -2));
        ci.d dVar = new ci.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton), false, true);
        e7.addView(dVar, w7.x5.a(48.0f, 14.0f, 14.0f, 14.0f, 0.0f, -1, 7));
        f3Var.customView = e7;
        f3Var.fixNavigationBar();
        dVar.setOnClickListener(new d7(dVar, callback, f3Var, e6Var, 0));
        f3Var.show();
    }

    @Override
    public final void U(java.util.ArrayList r9, org.telegram.ui.Components.d71 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m7.U(java.util.ArrayList, org.telegram.ui.Components.d71):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletKeysAndBackup);
    }

    @Override
    public final void W(q61 q61Var, View view) {
        int i10 = q61Var.d;
        if (i10 == 1) {
            k0 v = k0.v(this.currentAccount);
            if (v.f()) {
                b7 b7Var = new b7();
                b7Var.f34749s = v.w();
                presentFragment(b7Var);
                return;
            }
            g0(getParentActivity(), getResourceProvider(), new c7(this, 0));
            return;
        }
        String str = null;
        if (i10 == 3) {
            k0 v9 = k0.v(this.currentAccount);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            b2Var.q(500L);
            j jVar = new j(this, b2Var, v9);
            k0.E("emulate disable backup: when ready");
            ii1 ii1Var = new ii1(4, v9, jVar);
            if (v9.D() && v9.f35159f != null) {
                ii1Var.run();
            } else {
                v9.v.add(new WeakReference(ii1Var));
            }
        } else if (i10 == 2) {
            k0 v10 = k0.v(this.currentAccount);
            c7 c7Var = new c7(this, 1);
            k0.E("enable backup: when ready...");
            v10.h0(new ii1(2, v10, c7Var));
        } else if (i10 == 4) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
            String string2 = LocaleController.getString(R.string.WalletDeleteWalletInfo);
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str = LocaleController.getString(R.string.WalletSaveOnDevice);
            }
            org.telegram.ui.ActionBar.b2 h02 = org.telegram.ui.Components.g5.h0(parentActivity, string, string2, str, LocaleController.getString(R.string.WalletDeleteAnyway), new c7(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) h02.d(-1);
            if (textView != null) {
                textView.setTextColor(h02.e(org.telegram.ui.ActionBar.i6.f21041q7));
            }
        } else if (q61Var.G(k7.class)) {
            String charSequence = q61Var.f30063l.toString();
            g0(getParentActivity(), getResourceProvider(), new r(this, k0.v(this.currentAccount), charSequence, new p0(getParentActivity(), charSequence, this.currentAccount)));
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
        this.f35306e = true;
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
        this.f26629a.setPadding(0, 0, 0, i13);
        this.f26629a.setClipToPadding(false);
    }
}
