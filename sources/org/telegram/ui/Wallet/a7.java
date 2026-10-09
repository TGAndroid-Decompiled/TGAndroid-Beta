package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.bi0;
import org.telegram.ui.ii1;
public final class a7 extends org.telegram.ui.ActionBar.n2 {
    public int f34651a;
    public u4 f34652b;
    public LinearLayout f34653c;
    public ci.d d;
    public ImageView f34654e;
    public ScrollView f34655f;
    public ea0 h;
    public int f34656n;
    public boolean f34657r;
    public byte[] f34658s;
    public final ArrayList v;

    public a7() {
        super(null);
        this.f34651a = 12;
        this.v = new ArrayList();
    }

    public static void U(a7 a7Var, String str, k0 k0Var, org.telegram.ui.ActionBar.n2 n2Var, String str2) {
        a7Var.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                ad.a0(a7Var).e0(str2, false);
                return;
            }
            if (a7Var.f34657r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, k0Var.r())) {
                new p0(a7Var.getParentActivity(), str, a7Var.currentAccount).B();
            }
            AndroidUtilities.runOnUIThread(new ii1(15, a7Var, n2Var), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a7Var.getParentActivity(), 0, a7Var.getResourceProvider());
        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
        org.telegram.messenger.q.p(R.string.WalletOK, alertDialog$Builder, null);
    }

    public static void V(a7 a7Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (!a7Var.d.N) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = a7Var.v;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList.add(((h9) obj).getWord().toLowerCase().trim());
            }
            h0 d = h0.d(arrayList);
            try {
                a7Var.d.setLoading(true);
                org.telegram.ui.ActionBar.n2 n2Var = null;
                if (a7Var.f34658s != null) {
                    try {
                        bArr = WalletEngine2.secretPhraseToPublicKey(d);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        bArr = null;
                    }
                    if (bArr == null) {
                        a7Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a7Var.getParentActivity(), 0, a7Var.getResourceProvider());
                        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
                        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
                        alertDialog$Builder.k(LocaleController.getString(R.string.WalletOK), null);
                        alertDialog$Builder.o();
                    } else if (!Arrays.equals(bArr, a7Var.f34658s)) {
                        try {
                            str = WalletEngine2.secretPhraseToAddress(d);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            frameLayout = new FrameLayout(a7Var.getParentActivity());
                            TextView textView = new TextView(a7Var.getParentActivity());
                            textView.setTextSize(1, 14.0f);
                            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, a7Var.resourceProvider));
                            textView.setText(X(str));
                            textView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                            textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                            textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, a7Var.resourceProvider)));
                            textView.setGravity(17);
                            frameLayout.addView(textView, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 7));
                        } else {
                            frameLayout = null;
                        }
                        a7Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(a7Var.getParentActivity(), 0, a7Var.getResourceProvider());
                        alertDialog$Builder2.f20374a.R = LocaleController.getString(R.string.WalletWrongSecretPhrase);
                        alertDialog$Builder2.f20374a.T = LocaleController.getString(R.string.WalletWrongSecretPhraseInfo);
                        alertDialog$Builder2.n(frameLayout);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.o();
                    } else {
                        k0 v = k0.v(a7Var.currentAccount);
                        v.f35119c.p(UserConfig.getInstance(a7Var.currentAccount).getClientUserId(), bArr, d, new z6(0, a7Var, v));
                    }
                    d.close();
                    return;
                }
                a7Var.d.setLoading(true);
                k0 v9 = k0.v(a7Var.currentAccount);
                String r10 = v9.r();
                if (a7Var.getParentLayout() != null && a7Var.getParentLayout().getFragmentStack().size() > 1) {
                    n2Var = (org.telegram.ui.ActionBar.n2) a7Var.getParentLayout().getFragmentStack().get(a7Var.getParentLayout().getFragmentStack().size() - 2);
                }
                v9.A(false, true, d, new q(a7Var, r10, v9, n2Var));
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
                    bv bvVar = new bv(false);
                    bvVar.f25107b = (int) 191.25f;
                    spannableStringBuilder.setSpan(bvVar, i10, spannableStringBuilder.length(), 33);
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
            arrayList.add(((h9) obj).getWord());
        }
        this.f34653c.removeAllViews();
        arrayList2.clear();
        for (int i12 = 0; i12 < this.f34651a; i12++) {
            if (i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h9 h9Var = new h9(i12, context, this.resourceProvider, z10);
            h9Var.setOnTextChangedListener(new y6(this, 1));
            h9Var.setOnPasteListener(new r(this, i12, 2));
            h9Var.setOnNextListener(new bi0(this, i12, h9Var, 14));
            LinearLayout linearLayout = this.f34653c;
            if (i12 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout.addView(h9Var, w7.x5.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(h9Var);
        }
        for (int i13 = 0; i13 < arrayList.size() && i13 < arrayList2.size(); i13++) {
            if (!((String) arrayList.get(i13)).isEmpty()) {
                ((h9) arrayList2.get(i13)).setText((String) arrayList.get(i13));
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
                if (((h9) obj).getWord().isEmpty()) {
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
        sw0 sw0Var = new sw0(context, null);
        this.fragmentView = sw0Var;
        sw0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.resourceProvider));
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        this.f34655f = scrollView;
        scrollView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                int i19 = i14 - i12;
                int i20 = i18 - i16;
                a7 a7Var = a7.this;
                if (i19 < i20) {
                    ArrayList arrayList = a7Var.v;
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList.get(i21);
                        i21++;
                        h9 h9Var = (h9) obj;
                        if (h9Var.hasFocus()) {
                            h9Var.requestRectangleOnScreen(new Rect(0, 0, h9Var.getWidth(), h9Var.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                a7Var.getClass();
            }
        });
        ((FrameLayout) this.fragmentView).addView(scrollView, w7.x5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, w7.x5.n(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f34654e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f34654e;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f34654e.setImageResource(R.drawable.ic_ab_close);
        this.f34654e.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, this.resourceProvider), 3, -1));
        this.f34654e.setOnClickListener(new View.OnClickListener(this) {
            public final a7 f35668b;

            {
                this.f35668b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35668b.finishFragment();
                        return;
                    default:
                        a7.V(this.f35668b);
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.f34654e, w7.x5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        y9 y9Var = new y9(context);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(y9Var, w7.x5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, this.resourceProvider));
        if (this.f34658s != null) {
            i10 = R.string.WalletSecretPhrase;
        } else {
            i10 = R.string.WalletImport;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, w7.x5.t(-1, -2, 1, 32, 0, 32, 10));
        ea0 ea0Var = new ea0(context, null);
        this.h = ea0Var;
        ea0Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        this.h.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21199z6, this.resourceProvider));
        this.h.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, this.resourceProvider));
        if (this.f34658s != null) {
            this.h.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WalletEnterSecretPhrase), new y6(this, 0)));
        } else {
            this.h.setText(LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, 12));
        }
        linearLayout.addView(this.h, w7.x5.t(-1, -2, 1, 32, 0, 32, 8));
        u4 u4Var = new u4(context, new CharSequence[]{LocaleController.formatPluralString("WalletPhraseWords", 12, new Object[0]), LocaleController.formatPluralString("WalletPhraseWords", 24, new Object[0])}, new j(this, 4), this.resourceProvider);
        this.f34652b = u4Var;
        u4Var.f35538e = true;
        u4Var.e();
        this.f34652b.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.f34652b.setClipToPadding(false);
        linearLayout.addView(this.f34652b, w7.x5.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f34653c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f34653c.setGravity(1);
        this.f34653c.setClipChildren(false);
        linearLayout.addView(this.f34653c, w7.x5.t(-1, -2, 1, 0, 16, 0, 0));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.e();
        this.d.setText(LocaleController.getString(R.string.WalletImportButton));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final a7 f35668b;

            {
                this.f35668b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35668b.finishFragment();
                        return;
                    default:
                        a7.V(this.f35668b);
                        return;
                }
            }
        });
        linearLayout.addView(this.d, w7.x5.t(-1, 48, 1, 0, 24, 0, 0));
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
        ScrollView scrollView = this.f34655f;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f34655f.getLayoutParams();
            int max = Math.max(i13, this.f34656n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f34655f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.f34654e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f34654e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f34656n = k1Var.f46777a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }
}
