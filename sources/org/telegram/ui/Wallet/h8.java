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
import org.telegram.messenger.mk;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.y31;
import org.telegram.ui.k71;
public final class h8 extends x61 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList d = new ArrayList();
    public boolean e;

    public static void Y(h8 h8Var, Utilities.Callback callback, m0 m0Var, q0 q0Var, j0 j0Var) {
        if (j0Var == null) {
            callback.run("STORAGE_FAILED");
            return;
        }
        p pVar = null;
        callback.run(null);
        ArrayList g10 = j0Var.g();
        Activity parentActivity = h8Var.getParentActivity();
        org.telegram.ui.ActionBar.d6 d6Var = h8Var.resourceProvider;
        if (BuildVars.DEBUG_PRIVATE_VERSION && m0Var.d()) {
            pVar = new p((x61) h8Var, m0Var, (Object) g10, 6);
        }
        f0(parentActivity, g10, d6Var, pVar, new z3(13, h8Var, q0Var));
    }

    public static void Z(h8 h8Var, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        pf.c h = b2Var.h(i10, true, true);
        h.d();
        int i11 = h8Var.currentAccount;
        d8 d8Var = new d8(h8Var, h, 0);
        m0 w9 = m0.w(i11);
        w9.j0(new y31(i11, d8Var, w9));
    }

    public static void a0(h8 h8Var, Boolean bool) {
        m0 w9 = m0.w(h8Var.currentAccount);
        h hVar = new h(h8Var, bool, w9, 20);
        if (bool.booleanValue() && BuildVars.DEBUG_PRIVATE_VERSION) {
            w9.j0(new e2.o0((Object) w9, (Object) new x(8, h8Var, hVar), false, true, 3));
        } else {
            hVar.run();
        }
    }

    public static void b0(h8 h8Var, Utilities.Callback callback, j0 j0Var, String str) {
        if (str != null) {
            callback.run(str);
        } else if (j0Var == null) {
            callback.run("WORDS_NULL");
        } else {
            callback.run(null);
            f0(h8Var.getParentActivity(), j0Var.g(), h8Var.resourceProvider, null, null);
        }
    }

    public static LinearLayout d0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, String str) {
        LinearLayout e = mk.e(context, 0);
        e.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        e.addView(imageView, w7.z5.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView.setText(AndroidUtilities.replaceTags(str));
        e.addView(textView, w7.z5.o(-1, -2, 1.0f, 16));
        return e;
    }

    public static LinearLayout e0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.d6 d6Var) {
        LinearLayout e = mk.e(context, 1);
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
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21395z6, d6Var));
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
            i15.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
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

    public static void f0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.d6 d6Var, p pVar, z3 z3Var) {
        ei.d dVar;
        float f7;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, d6Var, false);
        f3Var.fixNavigationBar();
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
        w9Var.setAspectFit(true);
        w9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(w9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(w9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView.setText(LocaleController.getString(R.string.WalletYourRecoveryPhrase));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21395z6, d6Var));
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
        LinearLayout e02 = e0(0, size, activity, arrayList, d6Var);
        LinearLayout e03 = e0(size, arrayList.size(), activity, arrayList, d6Var);
        linearLayout3.addView(e02, w7.z5.o(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), w7.z5.n(10, 0));
        linearLayout3.addView(e03, w7.z5.o(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, w7.z5.q(-1, -2, 1));
        linearLayout.addView(linearLayout2, w7.z5.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e.addView(linearLayout, w7.z5.n(-1, -2));
        if (pVar != null) {
            dVar = new ei.d(activity, d6Var, true);
            dVar.setRoundRadius(24);
            e.addView(dVar, w7.z5.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 4.0f));
        } else {
            dVar = null;
        }
        ei.d dVar2 = new ei.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        if (dVar != null) {
            f7 = 4.0f;
        } else {
            f7 = 14.0f;
        }
        e.addView(dVar2, w7.z5.d(-1, 48.0f, 1, 14.0f, f7, 14.0f, 14.0f));
        f3Var.customView = e;
        f3Var.fixNavigationBar();
        if (dVar != null && pVar != null) {
            dVar2.setFilled(false);
            dVar.setText(LocaleController.getString(R.string.WalletImportThisWallet));
            ei.d dVar3 = dVar;
            dVar3.setOnClickListener(new y7(dVar3, pVar, f3Var, d6Var, 1));
        }
        if (z3Var != null) {
            dVar2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21228q7, d6Var));
            dVar2.setText(LocaleController.getString(R.string.WalletDelete));
            dVar2.setOnClickListener(new a8(activity, d6Var, z3Var, f3Var));
        } else {
            dVar2.setText(LocaleController.getString(R.string.WalletDone));
            dVar2.setOnClickListener(new o3(f3Var, 1));
        }
        f3Var.show();
    }

    public static void g0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, d6Var, false);
        f3Var.fixNavigationBar();
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        LinearLayout e7 = org.telegram.messenger.g0.e(activity, 1);
        e7.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), 0);
        w21 w21Var = new w21(activity, d6Var);
        w21Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(4.0f));
        w21Var.setEmojiSize(100);
        org.telegram.ui.Components.w9 w9Var = w21Var.f31956b;
        w9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(w9Var, "RestrictedEmoji", "📝", "100_100");
        e7.addView(w21Var, w7.z5.q(-1, -2, 7));
        String string = LocaleController.getString(R.string.WalletRecoveryPhraseLearnTitle);
        x90 x90Var = w21Var.f31957c;
        CharSequence replaceEmoji = Emoji.replaceEmoji(string, x90Var.getPaint().getFontMetricsInt(), false);
        String string2 = LocaleController.getString(R.string.WalletRecoveryPhraseLearnInfo);
        x90 x90Var2 = w21Var.d;
        w21Var.a(replaceEmoji, Emoji.replaceEmoji(string2, x90Var2.getPaint().getFontMetricsInt(), false));
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21395z6, d6Var));
        NotificationCenter.listenEmojiLoading(x90Var);
        NotificationCenter.listenEmojiLoading(x90Var2);
        e7.addView(d0(activity, d6Var, R.drawable.wallet_learn_hidden, LocaleController.getString(R.string.WalletRecoveryPhraseNeverShare)));
        e7.addView(d0(activity, d6Var, R.drawable.wallet_learn_warn, LocaleController.getString(R.string.WalletRecoveryPhraseFundsWarning)));
        e7.addView(d0(activity, d6Var, R.drawable.wallet_learn_protected, LocaleController.getString(R.string.WalletRecoveryPhraseSupportWarning)));
        e.addView(e7, w7.z5.n(-1, -2));
        ei.d dVar = new ei.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton), false, true);
        e.addView(dVar, w7.z5.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        f3Var.customView = e;
        f3Var.fixNavigationBar();
        dVar.setOnClickListener(new y7(dVar, callback, f3Var, d6Var, 0));
        f3Var.show();
    }

    @Override
    public final void U(java.util.ArrayList r9, org.telegram.ui.Components.u61 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h8.U(java.util.ArrayList, org.telegram.ui.Components.u61):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletKeysAndBackup);
    }

    @Override
    public final void W(h61 h61Var, View view) {
        int i10 = h61Var.d;
        if (i10 == 1) {
            m0 w9 = m0.w(this.currentAccount);
            if (w9.e()) {
                w7 w7Var = new w7();
                w7Var.f35076s = w9.x();
                presentFragment(w7Var);
                return;
            }
            g0(getParentActivity(), getResourceProvider(), new x7(this, 0));
            return;
        }
        String str = null;
        if (i10 == 3) {
            m0 w10 = m0.w(this.currentAccount);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            b2Var.r(500L);
            k kVar = new k(this, b2Var, w10);
            m0.F("emulate disable backup: when ready");
            k71 k71Var = new k71(26, w10, kVar);
            if (w10.E() && w10.f34480f != null) {
                k71Var.run();
            } else {
                w10.f34495w.add(new WeakReference(k71Var));
            }
        } else if (i10 == 2) {
            m0 w11 = m0.w(this.currentAccount);
            x7 x7Var = new x7(this, 1);
            m0.F("enable backup: when ready...");
            w11.j0(new k71(24, w11, x7Var));
        } else if (i10 == 4) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
            String string2 = LocaleController.getString(R.string.WalletDeleteWalletInfo);
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str = LocaleController.getString(R.string.WalletSaveOnDevice);
            }
            org.telegram.ui.ActionBar.b2 h02 = org.telegram.ui.Components.f5.h0(parentActivity, string, string2, str, LocaleController.getString(R.string.WalletDeleteAnyway), new x7(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) h02.d(-1);
            if (textView != null) {
                textView.setTextColor(h02.f(org.telegram.ui.ActionBar.h6.f21228q7));
            }
        } else if (h61Var.G(f8.class)) {
            String charSequence = h61Var.f26782l.toString();
            g0(getParentActivity(), getResourceProvider(), new o(this, m0.w(this.currentAccount), charSequence, new q0(getParentActivity(), charSequence, this.currentAccount)));
        }
    }

    @Override
    public final boolean X(h61 h61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f32356a);
        this.f32356a.p1();
        this.f32356a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w61 w61Var;
        if (i10 == NotificationCenter.walletUpdate && (w61Var = this.f32356a) != null) {
            w61Var.W2.N(true);
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
            ((h0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f32356a.setPadding(0, 0, 0, i13);
        this.f32356a.setClipToPadding(false);
    }
}
