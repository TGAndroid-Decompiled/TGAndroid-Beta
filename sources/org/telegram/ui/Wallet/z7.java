package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
public final class z7 extends org.telegram.ui.ActionBar.n2 {
    public int f35211a;
    public g5 f35212b;
    public LinearLayout f35213c;
    public ei.d d;
    public ImageView e;
    public ScrollView f35214f;
    public x90 h;
    public int f35215n;
    public boolean f35216r;
    public byte[] f35217s;
    public final ArrayList v;

    public z7() {
        super(null);
        this.f35211a = 12;
        this.v = new ArrayList();
    }

    public static void U(z7 z7Var, String str, m0 m0Var, org.telegram.ui.ActionBar.n2 n2Var, String str2) {
        z7Var.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                xc.a0(z7Var).e0(str2, false);
                return;
            }
            if (z7Var.f35216r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, m0Var.s())) {
                new q0(z7Var.getParentActivity(), str, z7Var.currentAccount).B();
            }
            AndroidUtilities.runOnUIThread(new t3(12, z7Var, n2Var), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z7Var.getParentActivity(), 0, z7Var.getResourceProvider());
        alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
        org.telegram.messenger.q.p(R.string.WalletOK, alertDialog$Builder, null);
    }

    public static void V(z7 z7Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (!z7Var.d.N) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = z7Var.v;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList.add(((ia) obj).getWord().toLowerCase().trim());
            }
            j0 d = j0.d(arrayList);
            try {
                z7Var.d.setLoading(true);
                org.telegram.ui.ActionBar.n2 n2Var = null;
                if (z7Var.f35217s != null) {
                    try {
                        bArr = WalletEngine2.secretPhraseToPublicKey(d);
                    } catch (Exception e) {
                        FileLog.e(e);
                        bArr = null;
                    }
                    if (bArr == null) {
                        z7Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z7Var.getParentActivity(), 0, z7Var.getResourceProvider());
                        alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
                        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
                        alertDialog$Builder.k(LocaleController.getString(R.string.WalletOK), null);
                        alertDialog$Builder.o();
                    } else if (!Arrays.equals(bArr, z7Var.f35217s)) {
                        try {
                            str = WalletEngine2.secretPhraseToAddress(d);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            frameLayout = new FrameLayout(z7Var.getParentActivity());
                            TextView textView = new TextView(z7Var.getParentActivity());
                            textView.setTextSize(1, 14.0f);
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, z7Var.resourceProvider));
                            textView.setText(X(str));
                            textView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                            textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                            textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20928a7, z7Var.resourceProvider)));
                            textView.setGravity(17);
                            frameLayout.addView(textView, w7.z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 7));
                        } else {
                            frameLayout = null;
                        }
                        z7Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z7Var.getParentActivity(), 0, z7Var.getResourceProvider());
                        alertDialog$Builder2.f20601a.R = LocaleController.getString(R.string.WalletWrongSecretPhrase);
                        alertDialog$Builder2.f20601a.T = LocaleController.getString(R.string.WalletWrongSecretPhraseInfo);
                        alertDialog$Builder2.n(frameLayout);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.o();
                    } else {
                        m0 w9 = m0.w(z7Var.currentAccount);
                        w9.f34553c.p(UserConfig.getInstance(z7Var.currentAccount).getClientUserId(), bArr, d, new x(7, z7Var, w9));
                    }
                    d.close();
                    return;
                }
                z7Var.d.setLoading(true);
                m0 w10 = m0.w(z7Var.currentAccount);
                String s10 = w10.s();
                if (z7Var.getParentLayout() != null && z7Var.getParentLayout().getFragmentStack().size() > 1) {
                    n2Var = (org.telegram.ui.ActionBar.n2) z7Var.getParentLayout().getFragmentStack().get(z7Var.getParentLayout().getFragmentStack().size() - 2);
                }
                w10.B(false, true, d, new o(z7Var, s10, w10, n2Var));
                d.close();
            } catch (Throwable th2) {
                try {
                    d.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static SpannableStringBuilder X(String str) {
        char c10;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (i12 > 0 && i12 % 4 == 0) {
                int i13 = i12 % 24;
                if (i13 == 0) {
                    c10 = '\n';
                } else {
                    c10 = ' ';
                }
                spannableStringBuilder.append(c10);
                if (i13 == 0) {
                    i11++;
                }
                i10 = spannableStringBuilder.length();
            }
            spannableStringBuilder.append(str.charAt(i12));
            if (i12 % 4 == 3) {
                int i14 = i11 + 1;
                if (i11 % 2 == 1) {
                    su suVar = new su(false);
                    suVar.f30330b = (int) 191.25f;
                    spannableStringBuilder.setSpan(suVar, i10, spannableStringBuilder.length(), 33);
                }
                i10 = spannableStringBuilder.length();
                i11 = i14;
            }
        }
        return spannableStringBuilder;
    }

    public final void W(Context context) {
        boolean z10;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(((ia) obj).getWord());
        }
        this.f35213c.removeAllViews();
        arrayList2.clear();
        for (int i12 = 0; i12 < this.f35211a; i12++) {
            if (i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ia iaVar = new ia(i12, context, this.resourceProvider, z10);
            iaVar.setOnTextChangedListener(new y7(this, 1));
            iaVar.setOnPasteListener(new j(this, i12, 3));
            iaVar.setOnNextListener(new w31(this, i12, iaVar, 19));
            LinearLayout linearLayout = this.f35213c;
            if (i12 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout.addView(iaVar, w7.z5.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(iaVar);
        }
        for (int i13 = 0; i13 < arrayList.size() && i13 < arrayList2.size(); i13++) {
            if (!((String) arrayList.get(i13)).isEmpty()) {
                ((ia) arrayList2.get(i13)).setText((String) arrayList.get(i13));
            }
        }
    }

    public final void Y() {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((ia) obj).getWord().isEmpty()) {
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        this.d.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        jw0 jw0Var = new jw0(context, null);
        this.fragmentView = jw0Var;
        jw0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, this.resourceProvider));
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        this.f35214f = scrollView;
        scrollView.addOnLayoutChangeListener(new l7(this, 1));
        ((FrameLayout) this.fragmentView).addView(scrollView, w7.z5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, w7.z5.n(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.e.setImageResource(R.drawable.ic_ab_close);
        this.e.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, this.resourceProvider), 3, -1));
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f35137b;

            {
                this.f35137b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35137b.finishFragment();
                        return;
                    default:
                        z7.V(this.f35137b);
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, w7.z5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.setAspectFit(true);
        w9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(w9Var, "RestrictedEmoji", "📝", "100_100");
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(w9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider));
        if (this.f35217s != null) {
            i10 = R.string.WalletSecretPhrase;
        } else {
            i10 = R.string.WalletImport;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 10));
        x90 x90Var = new x90(context, null);
        this.h = x90Var;
        x90Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21391z6, this.resourceProvider));
        this.h.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, this.resourceProvider));
        if (this.f35217s != null) {
            this.h.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WalletEnterSecretPhrase), new y7(this, 0)));
        } else {
            this.h.setText(LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, 12));
        }
        linearLayout.addView(this.h, w7.z5.t(-1, -2, 1, 32, 0, 32, 8));
        g5 g5Var = new g5(context, new CharSequence[]{LocaleController.formatPluralString("WalletPhraseWords", 12, new Object[0]), LocaleController.formatPluralString("WalletPhraseWords", 24, new Object[0])}, new l(this, 5), this.resourceProvider);
        this.f35212b = g5Var;
        g5Var.e = true;
        g5Var.d();
        this.f35212b.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.f35212b.setClipToPadding(false);
        linearLayout.addView(this.f35212b, w7.z5.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f35213c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f35213c.setGravity(1);
        this.f35213c.setClipChildren(false);
        linearLayout.addView(this.f35213c, w7.z5.t(-1, -2, 1, 0, 16, 0, 0));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.e();
        this.d.setText(LocaleController.getString(R.string.WalletImportButton));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f35137b;

            {
                this.f35137b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35137b.finishFragment();
                        return;
                    default:
                        z7.V(this.f35137b);
                        return;
                }
            }
        });
        linearLayout.addView(this.d, w7.z5.t(-1, 48, 1, 0, 24, 0, 0));
        W(context);
        Y();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams;
        ScrollView scrollView = this.f35214f;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35214f.getLayoutParams();
            int max = Math.max(i13, this.f35215n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f35214f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f35215n = k1Var.f44853a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }
}
