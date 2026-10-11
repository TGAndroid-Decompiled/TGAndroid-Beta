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
import org.telegram.messenger.ai;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.g31;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ai0;
public final class n7 extends h71 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList d = new ArrayList();
    public boolean f35336e;

    public static void Y(n7 n7Var, Utilities.Callback callback, l0 l0Var, q0 q0Var, i0 i0Var) {
        if (i0Var == null) {
            callback.run("STORAGE_FAILED");
            return;
        }
        q qVar = null;
        callback.run(null);
        ArrayList g10 = i0Var.g();
        Activity parentActivity = n7Var.getParentActivity();
        org.telegram.ui.ActionBar.d6 d6Var = n7Var.resourceProvider;
        if (BuildVars.DEBUG_PRIVATE_VERSION && l0Var.e()) {
            qVar = new q((h71) n7Var, l0Var, (Object) g10, 6);
        }
        f0(parentActivity, g10, d6Var, qVar, new i(15, n7Var, q0Var));
    }

    public static void Z(n7 n7Var, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        of.e g10 = a2Var.g(i10, true, true);
        g10.d();
        int i11 = n7Var.currentAccount;
        j7 j7Var = new j7(n7Var, g10, 0);
        l0 v = l0.v(i11);
        v.h0(new ai0(i11, j7Var, v));
    }

    public static void a0(n7 n7Var, Boolean bool) {
        l0 v = l0.v(n7Var.currentAccount);
        m mVar = new m(n7Var, bool, v);
        if (bool.booleanValue() && BuildVars.DEBUG_PRIVATE_VERSION) {
            v.h0(new org.telegram.messenger.camera.i((Object) v, (Object) new b7(1, n7Var, mVar), false, true, 2));
        } else {
            mVar.run();
        }
    }

    public static void b0(n7 n7Var, Utilities.Callback callback, i0 i0Var, String str) {
        if (str != null) {
            callback.run(str);
        } else if (i0Var == null) {
            callback.run("WORDS_NULL");
        } else {
            callback.run(null);
            f0(n7Var.getParentActivity(), i0Var.g(), n7Var.resourceProvider, null, null);
        }
    }

    public static void c0(n7 n7Var, Utilities.Callback callback) {
        l0.v(n7Var.currentAccount).x(new ai.m0(28, n7Var, callback), true, false);
    }

    public static LinearLayout d0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, String str) {
        LinearLayout e7 = ai.e(context, 0);
        e7.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        e7.addView(imageView, w7.x5.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView.setText(AndroidUtilities.replaceTags(str));
        e7.addView(textView, w7.x5.o(-1, -2, 1.0f, 16));
        return e7;
    }

    public static LinearLayout e0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.d6 d6Var) {
        LinearLayout e7 = ai.e(context, 1);
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
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21189z6, d6Var));
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
            h.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
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

    public static void f0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.d6 d6Var, q qVar, i iVar) {
        ci.d dVar;
        float f7;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) activity, d6Var, false);
        e3Var.fixNavigationBar();
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
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView.setText(LocaleController.getString(R.string.WalletYourRecoveryPhrase));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21189z6, d6Var));
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
        LinearLayout e02 = e0(0, size, activity, arrayList, d6Var);
        LinearLayout e03 = e0(size, arrayList.size(), activity, arrayList, d6Var);
        linearLayout3.addView(e02, w7.x5.o(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), w7.x5.n(10, 0));
        linearLayout3.addView(e03, w7.x5.o(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, w7.x5.q(-1, -2, 1));
        linearLayout.addView(linearLayout2, w7.x5.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e7.addView(linearLayout, w7.x5.n(-1, -2));
        if (qVar != null) {
            dVar = new ci.d(activity, d6Var, true);
            dVar.setRoundRadius(24);
            e7.addView(dVar, w7.x5.a(48.0f, 14.0f, 14.0f, 14.0f, 4.0f, -1, 1));
        } else {
            dVar = null;
        }
        ci.d dVar2 = new ci.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        if (dVar != null) {
            f7 = 4.0f;
        } else {
            f7 = 14.0f;
        }
        e7.addView(dVar2, w7.x5.a(48.0f, 14.0f, f7, 14.0f, 14.0f, -1, 1));
        e3Var.customView = e7;
        e3Var.fixNavigationBar();
        if (dVar != null && qVar != null) {
            dVar2.setFilled(false);
            dVar.setText(LocaleController.getString(R.string.WalletImportThisWallet));
            ci.d dVar3 = dVar;
            dVar3.setOnClickListener(new e7(dVar3, qVar, e3Var, d6Var, 1));
        }
        if (iVar != null) {
            dVar2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21026q7, d6Var));
            dVar2.setText(LocaleController.getString(R.string.WalletDelete));
            dVar2.setOnClickListener(new g7(activity, d6Var, iVar, e3Var));
        } else {
            dVar2.setText(LocaleController.getString(R.string.WalletDone));
            dVar2.setOnClickListener(new g3(e3Var, 1));
        }
        e3Var.show();
    }

    public static void g0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) activity, d6Var, false);
        e3Var.fixNavigationBar();
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        e7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        LinearLayout e10 = org.telegram.messenger.q.e(activity, 1);
        e10.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), 0);
        g31 g31Var = new g31(activity, d6Var);
        g31Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(4.0f));
        g31Var.setEmojiSize(100);
        y9 y9Var = g31Var.f26595b;
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        e10.addView(g31Var, w7.x5.q(-1, -2, 7));
        String string = LocaleController.getString(R.string.WalletRecoveryPhraseLearnTitle);
        fa0 fa0Var = g31Var.f26596c;
        CharSequence replaceEmoji = Emoji.replaceEmoji(string, fa0Var.getPaint().getFontMetricsInt(), false);
        String string2 = LocaleController.getString(R.string.WalletRecoveryPhraseLearnInfo);
        fa0 fa0Var2 = g31Var.d;
        g31Var.a(replaceEmoji, Emoji.replaceEmoji(string2, fa0Var2.getPaint().getFontMetricsInt(), false));
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        fa0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21189z6, d6Var));
        NotificationCenter.listenEmojiLoading(fa0Var);
        NotificationCenter.listenEmojiLoading(fa0Var2);
        e10.addView(d0(activity, d6Var, R.drawable.wallet_learn_hidden, LocaleController.getString(R.string.WalletRecoveryPhraseNeverShare)));
        e10.addView(d0(activity, d6Var, R.drawable.wallet_learn_warn, LocaleController.getString(R.string.WalletRecoveryPhraseFundsWarning)));
        e10.addView(d0(activity, d6Var, R.drawable.wallet_learn_protected, LocaleController.getString(R.string.WalletRecoveryPhraseSupportWarning)));
        e7.addView(e10, w7.x5.n(-1, -2));
        ci.d dVar = new ci.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton), false, true);
        e7.addView(dVar, w7.x5.a(48.0f, 14.0f, 14.0f, 14.0f, 0.0f, -1, 7));
        e3Var.customView = e7;
        e3Var.fixNavigationBar();
        dVar.setOnClickListener(new e7(dVar, callback, e3Var, d6Var, 0));
        e3Var.show();
    }

    @Override
    public final void U(java.util.ArrayList r9, org.telegram.ui.Components.e71 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n7.U(java.util.ArrayList, org.telegram.ui.Components.e71):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletKeysAndBackup);
    }

    @Override
    public final void W(r61 r61Var, View view) {
        int i10 = r61Var.d;
        if (i10 == 1) {
            l0 v = l0.v(this.currentAccount);
            if (v.f()) {
                c7 c7Var = new c7();
                c7Var.f34780s = v.w();
                presentFragment(c7Var);
                return;
            }
            g0(getParentActivity(), getResourceProvider(), new d7(this, 0));
            return;
        }
        String str = null;
        if (i10 == 3) {
            l0 v9 = l0.v(this.currentAccount);
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
            a2Var.q(500L);
            k kVar = new k(this, a2Var, v9);
            l0.E("emulate disable backup: when ready");
            i iVar = new i(3, v9, kVar);
            if (v9.D() && v9.f35189f != null) {
                iVar.run();
            } else {
                v9.v.add(new WeakReference(iVar));
            }
        } else if (i10 == 2) {
            l0 v10 = l0.v(this.currentAccount);
            d7 d7Var = new d7(this, 1);
            l0.E("enable backup: when ready...");
            v10.h0(new i(1, v10, d7Var));
        } else if (i10 == 4) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
            String string2 = LocaleController.getString(R.string.WalletDeleteWalletInfo);
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str = LocaleController.getString(R.string.WalletSaveOnDevice);
            }
            org.telegram.ui.ActionBar.a2 h02 = org.telegram.ui.Components.g5.h0(parentActivity, string, string2, str, LocaleController.getString(R.string.WalletDeleteAnyway), new d7(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) h02.d(-1);
            if (textView != null) {
                textView.setTextColor(h02.e(org.telegram.ui.ActionBar.h6.f21026q7));
            }
        } else if (r61Var.G(l7.class)) {
            String charSequence = r61Var.f30361l.toString();
            g0(getParentActivity(), getResourceProvider(), new s(this, l0.v(this.currentAccount), charSequence, new q0(getParentActivity(), charSequence, this.currentAccount)));
        }
    }

    @Override
    public final boolean X(r61 r61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f26922a);
        this.f26922a.p1();
        this.f26922a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g71 g71Var;
        if (i10 == NotificationCenter.walletUpdate && (g71Var = this.f26922a) != null) {
            g71Var.W2.N(true);
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
        this.f35336e = true;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f26922a.setPadding(0, 0, 0, i13);
        this.f26922a.setClipToPadding(false);
    }
}
