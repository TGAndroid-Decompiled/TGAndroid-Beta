package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.sl;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.y90;
import org.telegram.ui.o71;
public final class i8 extends e71 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList d = new ArrayList();
    public boolean e;

    public static void Y(i8 i8Var, Utilities.Callback callback, l0 l0Var, p0 p0Var, i0 i0Var) {
        if (i0Var == null) {
            callback.run("STORAGE_FAILED");
            return;
        }
        o oVar = null;
        callback.run(null);
        ArrayList g10 = i0Var.g();
        Activity parentActivity = i8Var.getParentActivity();
        org.telegram.ui.ActionBar.g6 g6Var = i8Var.resourceProvider;
        if (BuildVars.DEBUG_PRIVATE_VERSION && l0Var.d()) {
            oVar = new o((e71) i8Var, l0Var, (Object) g10, 6);
        }
        f0(parentActivity, g10, g6Var, oVar, new y3(13, i8Var, p0Var));
    }

    public static void Z(i8 i8Var, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        pf.c h = c2Var.h(i10, true, true);
        h.d();
        int i11 = i8Var.currentAccount;
        d8 d8Var = new d8(i8Var, h, 0);
        l0 w9 = l0.w(i11);
        w9.j0(new c41(i11, d8Var, w9));
    }

    public static void a0(i8 i8Var, Boolean bool) {
        l0 w9 = l0.w(i8Var.currentAccount);
        h hVar = new h(i8Var, bool, w9, 20);
        if (bool.booleanValue() && BuildVars.DEBUG_PRIVATE_VERSION) {
            w9.j0(new e2.o0((Object) w9, (Object) new w(8, i8Var, hVar), false, true, 3));
        } else {
            hVar.run();
        }
    }

    public static void b0(i8 i8Var, Utilities.Callback callback, i0 i0Var, String str) {
        if (str != null) {
            callback.run(str);
        } else if (i0Var == null) {
            callback.run("WORDS_NULL");
        } else {
            callback.run(null);
            f0(i8Var.getParentActivity(), i0Var.g(), i8Var.resourceProvider, null, null);
        }
    }

    public static LinearLayout d0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, String str) {
        LinearLayout e = sl.e(context, 0);
        e.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i10);
        e.addView(imageView, w7.z5.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setText(AndroidUtilities.replaceTags(str));
        e.addView(textView, w7.z5.o(-1, -2, 1.0f, 16));
        return e;
    }

    public static LinearLayout e0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var) {
        LinearLayout e = sl.e(context, 1);
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
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21588z6, g6Var);
            StringBuilder sb2 = new StringBuilder();
            int i14 = i12 + 1;
            sb2.append(i14);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView f7 = sl.f(linearLayout, textView, w7.z5.t(26, -2, 8388613, 0, 0, 6, 0), context);
            f7.setTextSize(1, 15.0f);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setIncludeFontPadding(false);
            f7.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.r6.W(f7, org.telegram.ui.ActionBar.k6.G6, g6Var);
            f7.setText((CharSequence) arrayList.get(i12));
            linearLayout.addView(f7, w7.z5.n(-2, -2));
            if (i12 != i10) {
                i13 = 10;
            }
            e.addView(linearLayout, w7.z5.t(-2, -2, 8388611, 0, i13, 0, 0));
            i12 = i14;
        }
        return e;
    }

    public static void f0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var, o oVar, y3 y3Var) {
        ei.d dVar;
        float f7;
        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, g6Var2, false);
        h3Var.fixNavigationBar();
        LinearLayout f10 = org.telegram.messenger.v0.f(activity, 1);
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
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var2);
        textView.setText(LocaleController.getString(R.string.WalletYourRecoveryPhrase));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21588z6, g6Var2);
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
        LinearLayout e02 = e0(0, size, activity, arrayList, g6Var2);
        LinearLayout e03 = e0(size, arrayList.size(), activity, arrayList, g6Var2);
        linearLayout3.addView(e02, w7.z5.o(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), w7.z5.n(10, 0));
        linearLayout3.addView(e03, w7.z5.o(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, w7.z5.q(-1, -2, 1));
        linearLayout.addView(linearLayout2, w7.z5.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        f10.addView(linearLayout, w7.z5.n(-1, -2));
        if (oVar != null) {
            dVar = new ei.d(activity, g6Var2, true);
            dVar.setRoundRadius(24);
            f10.addView(dVar, w7.z5.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 4.0f));
        } else {
            dVar = null;
        }
        ei.d dVar2 = new ei.d(activity, g6Var2, true);
        dVar2.setRoundRadius(24);
        if (dVar != null) {
            f7 = 4.0f;
        } else {
            f7 = 14.0f;
        }
        f10.addView(dVar2, w7.z5.d(-1, 48.0f, 1, 14.0f, f7, 14.0f, 14.0f));
        h3Var.customView = f10;
        h3Var.fixNavigationBar();
        if (dVar != null && oVar != null) {
            dVar2.setFilled(false);
            dVar.setText(LocaleController.getString(R.string.WalletImportThisWallet));
            ei.d dVar3 = dVar;
            y7 y7Var = new y7(dVar3, oVar, h3Var, g6Var, 1);
            h3Var = h3Var;
            g6Var2 = g6Var;
            dVar3.setOnClickListener(y7Var);
        }
        if (y3Var != null) {
            int i10 = org.telegram.ui.ActionBar.k6.f21421q7;
            dVar2.setColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var2));
            if (dVar2.getBackground() != null) {
                Drawable background = dVar2.getBackground();
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
                dVar2.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(dVar2, background, O, null, g6Var2);
            }
            dVar2.setText(LocaleController.getString(R.string.WalletDelete));
            dVar2.setOnClickListener(new a8(activity, g6Var2, y3Var, h3Var, 0));
        } else {
            dVar2.setText(LocaleController.getString(R.string.WalletDone));
            dVar2.setOnClickListener(new n3(h3Var, 1));
        }
        h3Var.show();
    }

    public static void g0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, g6Var, false);
        h3Var.fixNavigationBar();
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        LinearLayout f10 = org.telegram.messenger.v0.f(activity, 1);
        f10.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), 0);
        a31 a31Var = new a31(activity, g6Var);
        a31Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(4.0f));
        a31Var.setEmojiSize(100);
        org.telegram.ui.Components.w9 w9Var = a31Var.f24619b;
        w9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(w9Var, "RestrictedEmoji", "📝", "100_100");
        f10.addView(a31Var, w7.z5.q(-1, -2, 7));
        String string = LocaleController.getString(R.string.WalletRecoveryPhraseLearnTitle);
        y90 y90Var = a31Var.f24620c;
        CharSequence replaceEmoji = Emoji.replaceEmoji(string, y90Var.getPaint().getFontMetricsInt(), false);
        String string2 = LocaleController.getString(R.string.WalletRecoveryPhraseLearnInfo);
        y90 y90Var2 = a31Var.d;
        a31Var.a(replaceEmoji, Emoji.replaceEmoji(string2, y90Var2.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        org.telegram.ui.ActionBar.r6.W(y90Var2, org.telegram.ui.ActionBar.k6.f21588z6, g6Var);
        NotificationCenter.listenEmojiLoading(y90Var);
        NotificationCenter.listenEmojiLoading(y90Var2);
        f10.addView(d0(activity, g6Var, R.drawable.wallet_learn_hidden, LocaleController.getString(R.string.WalletRecoveryPhraseNeverShare)));
        f10.addView(d0(activity, g6Var, R.drawable.wallet_learn_warn, LocaleController.getString(R.string.WalletRecoveryPhraseFundsWarning)));
        f10.addView(d0(activity, g6Var, R.drawable.wallet_learn_protected, LocaleController.getString(R.string.WalletRecoveryPhraseSupportWarning)));
        f7.addView(f10, w7.z5.n(-1, -2));
        ei.d dVar = new ei.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton), false, true);
        f7.addView(dVar, w7.z5.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        h3Var.customView = f7;
        h3Var.fixNavigationBar();
        dVar.setOnClickListener(new y7(dVar, callback, h3Var, g6Var, 0));
        h3Var.show();
    }

    @Override
    public final void U(java.util.ArrayList r9, org.telegram.ui.Components.b71 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.i8.U(java.util.ArrayList, org.telegram.ui.Components.b71):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletKeysAndBackup);
    }

    @Override
    public final void W(m61 m61Var, View view) {
        int i10 = m61Var.d;
        if (i10 == 1) {
            l0 w9 = l0.w(this.currentAccount);
            if (w9.e()) {
                w7 w7Var = new w7();
                w7Var.f35356s = w9.x();
                presentFragment(w7Var);
                return;
            }
            g0(getParentActivity(), getResourceProvider(), new x7(this, 0));
            return;
        }
        String str = null;
        if (i10 == 3) {
            l0 w10 = l0.w(this.currentAccount);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            c2Var.r(500L);
            j jVar = new j(this, c2Var, w10);
            l0.F("emulate disable backup: when ready");
            o71 o71Var = new o71(26, w10, jVar);
            if (w10.E() && w10.f34744f != null) {
                o71Var.run();
            } else {
                w10.f34759w.add(new WeakReference(o71Var));
            }
        } else if (i10 == 2) {
            l0 w11 = l0.w(this.currentAccount);
            x7 x7Var = new x7(this, 1);
            l0.F("enable backup: when ready...");
            w11.j0(new o71(24, w11, x7Var));
        } else if (i10 == 4) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
            String string2 = LocaleController.getString(R.string.WalletDeleteWalletInfo);
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str = LocaleController.getString(R.string.WalletSaveOnDevice);
            }
            org.telegram.ui.ActionBar.c2 i02 = org.telegram.ui.Components.f5.i0(parentActivity, string, string2, str, LocaleController.getString(R.string.WalletDeleteAnyway), new x7(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) i02.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, i02.f20767k1);
            }
        } else if (m61Var.G(g8.class)) {
            String charSequence = m61Var.f28559l.toString();
            g0(getParentActivity(), getResourceProvider(), new n(this, l0.w(this.currentAccount), charSequence, new p0(getParentActivity(), charSequence, this.currentAccount)));
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
        this.e = true;
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
        this.f25907a.setPadding(0, 0, 0, i13);
        this.f25907a.setClipToPadding(false);
    }
}
