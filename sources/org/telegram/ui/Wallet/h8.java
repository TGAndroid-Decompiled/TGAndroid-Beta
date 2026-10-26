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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j31;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.z90;
import org.telegram.ui.yx;
import org.telegram.ui.zc1;
public final class h8 extends m71 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList e = new ArrayList();
    public boolean f36640f;

    public static void Z(h8 h8Var, Utilities.Callback callback, l0 l0Var, p0 p0Var, i0 i0Var) {
        if (i0Var == null) {
            callback.run("STORAGE_FAILED");
            return;
        }
        o oVar = null;
        callback.run(null);
        ArrayList g7 = i0Var.g();
        Activity parentActivity = h8Var.getParentActivity();
        org.telegram.ui.ActionBar.u6 u6Var = h8Var.resourceProvider;
        if (BuildVars.DEBUG_PRIVATE_VERSION && l0Var.d()) {
            oVar = new o((m71) h8Var, l0Var, (Object) g7, 6);
        }
        g0(parentActivity, g7, u6Var, oVar, new q6(3, h8Var, p0Var));
    }

    public static void a0(h8 h8Var, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        qf.c h = e2Var.h(i10, true, true);
        h.d();
        int i11 = h8Var.currentAccount;
        d8 d8Var = new d8(h8Var, h, 0);
        l0 w10 = l0.w(i11);
        w10.j0(new yx(i11, d8Var, w10));
    }

    public static void b0(h8 h8Var, Boolean bool) {
        l0 w10 = l0.w(h8Var.currentAccount);
        h hVar = new h(h8Var, bool, w10, 20);
        if (bool.booleanValue() && BuildVars.DEBUG_PRIVATE_VERSION) {
            w10.j0(new e2.p0((Object) w10, (Object) new s(10, h8Var, hVar), false, true, 3));
        } else {
            hVar.run();
        }
    }

    public static void c0(h8 h8Var, Utilities.Callback callback, i0 i0Var, String str) {
        if (str != null) {
            callback.run(str);
        } else if (i0Var == null) {
            callback.run("WORDS_NULL");
        } else {
            callback.run(null);
            g0(h8Var.getParentActivity(), i0Var.g(), h8Var.resourceProvider, null, null);
        }
    }

    public static LinearLayout e0(Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10, String str) {
        LinearLayout d = vh.d(context, 0);
        d.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i10);
        d.addView(imageView, gb1.x(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setText(AndroidUtilities.replaceTags(str));
        d.addView(textView, gb1.s(-1, -2, 1.0f, 16));
        return d;
    }

    public static LinearLayout f0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var) {
        LinearLayout d = vh.d(context, 1);
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
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
            StringBuilder sb2 = new StringBuilder();
            int i14 = i12 + 1;
            sb2.append(i14);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView e = vh.e(linearLayout, textView, gb1.x(26, -2, 8388613, 0, 0, 6, 0), context);
            e.setTextSize(1, 15.0f);
            e.setTypeface(AndroidUtilities.bold());
            e.setIncludeFontPadding(false);
            e.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.G6, u6Var);
            e.setText((CharSequence) arrayList.get(i12));
            linearLayout.addView(e, gb1.r(-2, -2));
            if (i12 != i10) {
                i13 = 10;
            }
            d.addView(linearLayout, gb1.x(-2, -2, 8388611, 0, i13, 0, 0));
            i12 = i14;
        }
        return d;
    }

    public static void g0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var, o oVar, q6 q6Var) {
        fi.d dVar;
        float f7;
        org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) activity, u6Var2, false);
        k3Var.fixNavigationBar();
        LinearLayout f10 = org.telegram.messenger.t.f(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(y9Var, gb1.x(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var2);
        textView.setText(LocaleController.getString(R.string.WalletYourRecoveryPhrase));
        linearLayout.addView(textView, gb1.x(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23767z6, u6Var2);
        textView2.setText(LocaleController.getString(R.string.WalletRecoveryPhraseInfo));
        textView2.setMaxWidth(AndroidUtilities.dp(330.0f));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, gb1.u(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout f02 = f0(0, size, activity, arrayList, u6Var2);
        LinearLayout f03 = f0(size, arrayList.size(), activity, arrayList, u6Var2);
        linearLayout3.addView(f02, gb1.s(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), gb1.r(10, 0));
        linearLayout3.addView(f03, gb1.s(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, gb1.u(-1, -2, 1));
        linearLayout.addView(linearLayout2, gb1.o(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        f10.addView(linearLayout, gb1.r(-1, -2));
        if (oVar != null) {
            dVar = new fi.d(activity, u6Var2, true);
            dVar.setRoundRadius(24);
            f10.addView(dVar, gb1.h(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 4.0f));
        } else {
            dVar = null;
        }
        fi.d dVar2 = new fi.d(activity, u6Var2, true);
        dVar2.setRoundRadius(24);
        if (dVar != null) {
            f7 = 4.0f;
        } else {
            f7 = 14.0f;
        }
        f10.addView(dVar2, gb1.h(-1, 48.0f, 1, 14.0f, f7, 14.0f, 14.0f));
        k3Var.customView = f10;
        k3Var.fixNavigationBar();
        if (dVar != null && oVar != null) {
            dVar2.setFilled(false);
            dVar.setText(LocaleController.getString(R.string.WalletImportThisWallet));
            fi.d dVar3 = dVar;
            y7 y7Var = new y7(dVar3, oVar, k3Var, u6Var, 1);
            k3Var = k3Var;
            u6Var2 = u6Var;
            dVar3.setOnClickListener(y7Var);
        }
        if (q6Var != null) {
            int i10 = org.telegram.ui.ActionBar.y6.f23598q7;
            dVar2.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var2));
            if (dVar2.getBackground() != null) {
                Drawable background = dVar2.getBackground();
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
                dVar2.setBackground(background);
                org.telegram.ui.ActionBar.f7.k(dVar2, background, N, null, u6Var2);
            }
            dVar2.setText(LocaleController.getString(R.string.WalletDelete));
            dVar2.setOnClickListener(new a8(activity, u6Var2, q6Var, k3Var, 0));
        } else {
            dVar2.setText(LocaleController.getString(R.string.WalletDone));
            dVar2.setOnClickListener(new n3(k3Var, 1));
        }
        k3Var.show();
    }

    public static void h0(Activity activity, org.telegram.ui.ActionBar.u6 u6Var, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) activity, u6Var, false);
        k3Var.fixNavigationBar();
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        LinearLayout f10 = org.telegram.messenger.t.f(activity, 1);
        f10.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), 0);
        j31 j31Var = new j31(activity, u6Var);
        j31Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(4.0f));
        j31Var.setEmojiSize(100);
        org.telegram.ui.Components.y9 y9Var = j31Var.f29472b;
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        f10.addView(j31Var, gb1.u(-1, -2, 7));
        String string = LocaleController.getString(R.string.WalletRecoveryPhraseLearnTitle);
        z90 z90Var = j31Var.f29473c;
        CharSequence replaceEmoji = Emoji.replaceEmoji(string, z90Var.getPaint().getFontMetricsInt(), false);
        String string2 = LocaleController.getString(R.string.WalletRecoveryPhraseLearnInfo);
        z90 z90Var2 = j31Var.d;
        j31Var.a(replaceEmoji, Emoji.replaceEmoji(string2, z90Var2.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.ui.ActionBar.f7.V(z90Var2, org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
        NotificationCenter.listenEmojiLoading(z90Var);
        NotificationCenter.listenEmojiLoading(z90Var2);
        f10.addView(e0(activity, u6Var, R.drawable.wallet_learn_hidden, LocaleController.getString(R.string.WalletRecoveryPhraseNeverShare)));
        f10.addView(e0(activity, u6Var, R.drawable.wallet_learn_warn, LocaleController.getString(R.string.WalletRecoveryPhraseFundsWarning)));
        f10.addView(e0(activity, u6Var, R.drawable.wallet_learn_protected, LocaleController.getString(R.string.WalletRecoveryPhraseSupportWarning)));
        f7.addView(f10, gb1.r(-1, -2));
        fi.d dVar = new fi.d(activity, u6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton), false, true);
        f7.addView(dVar, gb1.h(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        k3Var.customView = f7;
        k3Var.fixNavigationBar();
        dVar.setOnClickListener(new y7(dVar, callback, k3Var, u6Var, 0));
        k3Var.show();
    }

    @Override
    public final void V(java.util.ArrayList r9, org.telegram.ui.Components.j71 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h8.V(java.util.ArrayList, org.telegram.ui.Components.j71):void");
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.WalletKeysAndBackup);
    }

    @Override
    public final void X(t61 t61Var, View view) {
        int i10 = t61Var.d;
        if (i10 == 1) {
            l0 w10 = l0.w(this.currentAccount);
            if (w10.e()) {
                w7 w7Var = new w7();
                w7Var.f37448s = w10.x();
                presentFragment(w7Var);
                return;
            }
            h0(getParentActivity(), getResourceProvider(), new x7(this, 0));
            return;
        }
        String str = null;
        if (i10 == 3) {
            l0 w11 = l0.w(this.currentAccount);
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
            e2Var.r(500L);
            j jVar = new j(this, e2Var, w11);
            l0.F("emulate disable backup: when ready");
            zc1 zc1Var = new zc1(16, w11, jVar);
            if (w11.E() && w11.f36810f != null) {
                zc1Var.run();
            } else {
                w11.f36825w.add(new WeakReference(zc1Var));
            }
        } else if (i10 == 2) {
            l0 w12 = l0.w(this.currentAccount);
            x7 x7Var = new x7(this, 1);
            l0.F("enable backup: when ready...");
            w12.j0(new zc1(14, w12, x7Var));
        } else if (i10 == 4) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
            String string2 = LocaleController.getString(R.string.WalletDeleteWalletInfo);
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str = LocaleController.getString(R.string.WalletSaveOnDevice);
            }
            org.telegram.ui.ActionBar.e2 h02 = org.telegram.ui.Components.g5.h0(parentActivity, string, string2, str, LocaleController.getString(R.string.WalletDeleteAnyway), new x7(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) h02.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, h02.f22580k1);
            }
        } else if (t61Var.H(f8.class)) {
            String charSequence = t61Var.f32875l.toString();
            h0(getParentActivity(), getResourceProvider(), new n(this, l0.w(this.currentAccount), charSequence, new p0(getParentActivity(), charSequence, this.currentAccount)));
        }
    }

    @Override
    public final boolean Y(t61 t61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f30419a);
        this.f30419a.u1();
        this.f30419a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l71 l71Var;
        if (i10 == NotificationCenter.walletUpdate && (l71Var = this.f30419a) != null) {
            l71Var.f32152g3.O(true);
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
        this.f36640f = true;
        ArrayList arrayList = this.e;
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
        this.f30419a.setPadding(0, 0, 0, i13);
        this.f30419a.setClipToPadding(false);
    }
}
