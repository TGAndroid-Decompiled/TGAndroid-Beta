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
public final class z6 extends org.telegram.ui.ActionBar.n2 {
    public int f35747a;
    public t4 f35748b;
    public LinearLayout f35749c;
    public ci.d d;
    public ImageView f35750e;
    public ScrollView f35751f;
    public ea0 h;
    public int f35752n;
    public boolean f35753r;
    public byte[] f35754s;
    public final ArrayList v;

    public z6() {
        super(null);
        this.f35747a = 12;
        this.v = new ArrayList();
    }

    public static void U(z6 z6Var, String str, k0 k0Var, org.telegram.ui.ActionBar.n2 n2Var, String str2) {
        z6Var.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                ad.a0(z6Var).e0(str2, false);
                return;
            }
            if (z6Var.f35753r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, k0Var.r())) {
                new p0(z6Var.getParentActivity(), str, z6Var.currentAccount).B();
            }
            AndroidUtilities.runOnUIThread(new ii1(15, z6Var, n2Var), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
        org.telegram.messenger.q.p(R.string.WalletOK, alertDialog$Builder, null);
    }

    public static void V(z6 z6Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (!z6Var.d.N) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = z6Var.v;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList.add(((g9) obj).getWord().toLowerCase().trim());
            }
            h0 d = h0.d(arrayList);
            try {
                z6Var.d.setLoading(true);
                org.telegram.ui.ActionBar.n2 n2Var = null;
                if (z6Var.f35754s != null) {
                    try {
                        bArr = WalletEngine2.secretPhraseToPublicKey(d);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        bArr = null;
                    }
                    if (bArr == null) {
                        z6Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
                        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
                        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
                        alertDialog$Builder.k(LocaleController.getString(R.string.WalletOK), null);
                        alertDialog$Builder.o();
                    } else if (!Arrays.equals(bArr, z6Var.f35754s)) {
                        try {
                            str = WalletEngine2.secretPhraseToAddress(d);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            frameLayout = new FrameLayout(z6Var.getParentActivity());
                            TextView textView = new TextView(z6Var.getParentActivity());
                            textView.setTextSize(1, 14.0f);
                            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, z6Var.resourceProvider));
                            textView.setText(X(str));
                            textView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                            textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                            textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, z6Var.resourceProvider)));
                            textView.setGravity(17);
                            frameLayout.addView(textView, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 7));
                        } else {
                            frameLayout = null;
                        }
                        z6Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
                        alertDialog$Builder2.f20374a.R = LocaleController.getString(R.string.WalletWrongSecretPhrase);
                        alertDialog$Builder2.f20374a.T = LocaleController.getString(R.string.WalletWrongSecretPhraseInfo);
                        alertDialog$Builder2.n(frameLayout);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.o();
                    } else {
                        k0 v = k0.v(z6Var.currentAccount);
                        v.f35095c.p(UserConfig.getInstance(z6Var.currentAccount).getClientUserId(), bArr, d, new y6(0, z6Var, v));
                    }
                    d.close();
                    return;
                }
                z6Var.d.setLoading(true);
                k0 v9 = k0.v(z6Var.currentAccount);
                String r10 = v9.r();
                if (z6Var.getParentLayout() != null && z6Var.getParentLayout().getFragmentStack().size() > 1) {
                    n2Var = (org.telegram.ui.ActionBar.n2) z6Var.getParentLayout().getFragmentStack().get(z6Var.getParentLayout().getFragmentStack().size() - 2);
                }
                v9.A(false, true, d, new q(z6Var, r10, v9, n2Var));
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
            arrayList.add(((g9) obj).getWord());
        }
        this.f35749c.removeAllViews();
        arrayList2.clear();
        for (int i12 = 0; i12 < this.f35747a; i12++) {
            if (i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g9 g9Var = new g9(i12, context, this.resourceProvider, z10);
            g9Var.setOnTextChangedListener(new x6(this, 1));
            g9Var.setOnPasteListener(new r(this, i12, 2));
            g9Var.setOnNextListener(new bi0(this, i12, g9Var, 14));
            LinearLayout linearLayout = this.f35749c;
            if (i12 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout.addView(g9Var, w7.x5.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(g9Var);
        }
        for (int i13 = 0; i13 < arrayList.size() && i13 < arrayList2.size(); i13++) {
            if (!((String) arrayList.get(i13)).isEmpty()) {
                ((g9) arrayList2.get(i13)).setText((String) arrayList.get(i13));
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
                if (((g9) obj).getWord().isEmpty()) {
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
        this.f35751f = scrollView;
        scrollView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                int i19 = i14 - i12;
                int i20 = i18 - i16;
                z6 z6Var = z6.this;
                if (i19 < i20) {
                    ArrayList arrayList = z6Var.v;
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList.get(i21);
                        i21++;
                        g9 g9Var = (g9) obj;
                        if (g9Var.hasFocus()) {
                            g9Var.requestRectangleOnScreen(new Rect(0, 0, g9Var.getWidth(), g9Var.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                z6Var.getClass();
            }
        });
        ((FrameLayout) this.fragmentView).addView(scrollView, w7.x5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, w7.x5.n(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f35750e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f35750e;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f35750e.setImageResource(R.drawable.ic_ab_close);
        this.f35750e.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, this.resourceProvider), 3, -1));
        this.f35750e.setOnClickListener(new View.OnClickListener(this) {
            public final z6 f35598b;

            {
                this.f35598b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35598b.finishFragment();
                        return;
                    default:
                        z6.V(this.f35598b);
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.f35750e, w7.x5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
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
        if (this.f35754s != null) {
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
        if (this.f35754s != null) {
            this.h.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WalletEnterSecretPhrase), new x6(this, 0)));
        } else {
            this.h.setText(LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, 12));
        }
        linearLayout.addView(this.h, w7.x5.t(-1, -2, 1, 32, 0, 32, 8));
        t4 t4Var = new t4(context, new CharSequence[]{LocaleController.formatPluralString("WalletPhraseWords", 12, new Object[0]), LocaleController.formatPluralString("WalletPhraseWords", 24, new Object[0])}, new j(this, 4), this.resourceProvider);
        this.f35748b = t4Var;
        t4Var.f35479e = true;
        t4Var.e();
        this.f35748b.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.f35748b.setClipToPadding(false);
        linearLayout.addView(this.f35748b, w7.x5.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f35749c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f35749c.setGravity(1);
        this.f35749c.setClipChildren(false);
        linearLayout.addView(this.f35749c, w7.x5.t(-1, -2, 1, 0, 16, 0, 0));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.e();
        this.d.setText(LocaleController.getString(R.string.WalletImportButton));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final z6 f35598b;

            {
                this.f35598b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35598b.finishFragment();
                        return;
                    default:
                        z6.V(this.f35598b);
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
        ScrollView scrollView = this.f35751f;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35751f.getLayoutParams();
            int max = Math.max(i13, this.f35752n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f35751f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.f35750e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f35750e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f35752n = k1Var.f46775a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }
}
