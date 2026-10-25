package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z90;
import org.telegram.ui.wg1;
import org.telegram.ui.yx;
public final class w7 extends org.telegram.ui.ActionBar.r2 {
    public int f37439a;
    public g5 f37440b;
    public LinearLayout f37441c;
    public fi.d d;
    public ImageView e;
    public ScrollView f37442f;
    public z90 h;
    public int f37443n;
    public boolean f37444r;
    public byte[] f37445s;
    public final ArrayList v;

    public w7() {
        super(null);
        this.f37439a = 12;
        this.v = new ArrayList();
    }

    public static void V(w7 w7Var, String str, l0 l0Var, org.telegram.ui.ActionBar.r2 r2Var, String str2) {
        w7Var.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                wc.b0(w7Var).f0(str2, false);
                return;
            }
            if (w7Var.f37444r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, l0Var.s())) {
                new p0(w7Var.getParentActivity(), str, w7Var.currentAccount).B();
            }
            AndroidUtilities.runOnUIThread(new q6(2, w7Var, r2Var), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w7Var.getParentActivity(), 0, w7Var.getResourceProvider());
        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
        org.telegram.messenger.t.p(R.string.WalletOK, alertDialog$Builder, null);
    }

    public static void W(w7 w7Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (!w7Var.d.Q) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = w7Var.v;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList.add(((ha) obj).getWord().toLowerCase().trim());
            }
            i0 d = i0.d(arrayList);
            try {
                w7Var.d.setLoading(true);
                org.telegram.ui.ActionBar.r2 r2Var = null;
                if (w7Var.f37445s != null) {
                    try {
                        bArr = WalletEngine2.secretPhraseToPublicKey(d);
                    } catch (Exception e) {
                        FileLog.e(e);
                        bArr = null;
                    }
                    if (bArr == null) {
                        w7Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w7Var.getParentActivity(), 0, w7Var.getResourceProvider());
                        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
                        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
                        alertDialog$Builder.k(LocaleController.getString(R.string.WalletOK), null);
                        alertDialog$Builder.p();
                    } else if (!Arrays.equals(bArr, w7Var.f37445s)) {
                        try {
                            str = WalletEngine2.secretPhraseToAddress(d);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            frameLayout = new FrameLayout(w7Var.getParentActivity());
                            TextView textView = new TextView(w7Var.getParentActivity());
                            textView.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, w7Var.resourceProvider);
                            textView.setText(Y(str));
                            textView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                            textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                            int dp = AndroidUtilities.dp(10.0f);
                            int i11 = org.telegram.ui.ActionBar.y6.f23297a7;
                            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i11, w7Var.resourceProvider));
                            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
                            org.telegram.ui.ActionBar.u6 u6Var = w7Var.resourceProvider;
                            textView.setBackground(c02);
                            org.telegram.ui.ActionBar.f7.k(textView, c02, N, null, u6Var);
                            textView.setGravity(17);
                            frameLayout.addView(textView, gb1.h(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                        } else {
                            frameLayout = null;
                        }
                        w7Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(w7Var.getParentActivity(), 0, w7Var.getResourceProvider());
                        alertDialog$Builder2.f22366a.R = LocaleController.getString(R.string.WalletWrongSecretPhrase);
                        alertDialog$Builder2.f22366a.T = LocaleController.getString(R.string.WalletWrongSecretPhraseInfo);
                        alertDialog$Builder2.o(frameLayout);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.p();
                    } else {
                        l0 w10 = l0.w(w7Var.currentAccount);
                        w10.f36806c.p(UserConfig.getInstance(w7Var.currentAccount).getClientUserId(), bArr, d, new s(9, w7Var, w10));
                    }
                    d.close();
                    return;
                }
                w7Var.d.setLoading(true);
                l0 w11 = l0.w(w7Var.currentAccount);
                String s10 = w11.s();
                if (w7Var.getParentLayout() != null && w7Var.getParentLayout().getFragmentStack().size() > 1) {
                    r2Var = (org.telegram.ui.ActionBar.r2) w7Var.getParentLayout().getFragmentStack().get(w7Var.getParentLayout().getFragmentStack().size() - 2);
                }
                w11.B(false, true, d, new n(w7Var, s10, w11, r2Var));
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

    public static SpannableStringBuilder Y(String str) {
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
                    tu tuVar = new tu(false);
                    tuVar.f33152b = (int) 191.25f;
                    spannableStringBuilder.setSpan(tuVar, i10, spannableStringBuilder.length(), 33);
                }
                i10 = spannableStringBuilder.length();
                i11 = i14;
            }
        }
        return spannableStringBuilder;
    }

    public final void X(Context context) {
        boolean z10;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(((ha) obj).getWord());
        }
        this.f37441c.removeAllViews();
        arrayList2.clear();
        for (int i12 = 0; i12 < this.f37439a; i12++) {
            if (i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ha haVar = new ha(i12, context, this.resourceProvider, z10);
            haVar.setOnTextChangedListener(new v7(this, 1));
            haVar.setOnPasteListener(new wg1(this, i12, 5));
            haVar.setOnNextListener(new yx(this, i12, haVar, 18));
            LinearLayout linearLayout = this.f37441c;
            if (i12 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout.addView(haVar, gb1.x(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(haVar);
        }
        for (int i13 = 0; i13 < arrayList.size() && i13 < arrayList2.size(); i13++) {
            if (!((String) arrayList.get(i13)).isEmpty()) {
                ((ha) arrayList2.get(i13)).setText((String) arrayList.get(i13));
            }
        }
    }

    public final void Z() {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((ha) obj).getWord().isEmpty()) {
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
        vw0 vw0Var = new vw0(context, null);
        this.fragmentView = vw0Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, vw0Var, this.resourceProvider);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        this.f37442f = scrollView;
        scrollView.addOnLayoutChangeListener(new i7(this, 1));
        ((FrameLayout) this.fragmentView).addView(scrollView, gb1.g(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, gb1.r(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.e.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.e;
        int i12 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.ActionBar.f7.R(imageView3, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.f7.N(i12), this.resourceProvider);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final w7 f37354b;

            {
                this.f37354b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37354b.finishFragment();
                        return;
                    default:
                        w7.W(this.f37354b);
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, gb1.h(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(y9Var, gb1.x(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(textView, i11, this.resourceProvider);
        if (this.f37445s != null) {
            i10 = R.string.WalletSecretPhrase;
        } else {
            i10 = R.string.WalletImport;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, gb1.x(-1, -2, 1, 32, 0, 32, 10));
        z90 z90Var = new z90(context, null);
        this.h = z90Var;
        z90Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(this.h, org.telegram.ui.ActionBar.y6.f23765z6, this.resourceProvider);
        org.telegram.ui.ActionBar.f7.H(this.h, org.telegram.ui.ActionBar.y6.gc, this.resourceProvider);
        if (this.f37445s != null) {
            this.h.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WalletEnterSecretPhrase), new v7(this, 0)));
        } else {
            this.h.setText(LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, 12));
        }
        linearLayout.addView(this.h, gb1.x(-1, -2, 1, 32, 0, 32, 8));
        g5 g5Var = new g5(context, new CharSequence[]{LocaleController.formatPluralString("WalletPhraseWords", 12, new Object[0]), LocaleController.formatPluralString("WalletPhraseWords", 24, new Object[0])}, new k(this, 5), this.resourceProvider);
        this.f37440b = g5Var;
        g5Var.e = true;
        g5Var.updateColors();
        this.f37440b.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.f37440b.setClipToPadding(false);
        linearLayout.addView(this.f37440b, gb1.x(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f37441c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f37441c.setGravity(1);
        this.f37441c.setClipChildren(false);
        linearLayout.addView(this.f37441c, gb1.x(-1, -2, 1, 0, 16, 0, 0));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.f();
        this.d.setText(LocaleController.getString(R.string.WalletImportButton));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final w7 f37354b;

            {
                this.f37354b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37354b.finishFragment();
                        return;
                    default:
                        w7.W(this.f37354b);
                        return;
                }
            }
        });
        linearLayout.addView(this.d, gb1.x(-1, 48, 1, 0, 24, 0, 0));
        X(context);
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams;
        ScrollView scrollView = this.f37442f;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f37442f.getLayoutParams();
            int max = Math.max(i13, this.f37443n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f37442f.setLayoutParams(layoutParams2);
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
        this.f37443n = k1Var.f47115a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }
}
