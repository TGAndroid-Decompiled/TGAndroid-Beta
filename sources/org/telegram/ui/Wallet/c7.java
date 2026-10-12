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
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ci0;
public final class c7 extends org.telegram.ui.ActionBar.m2 {
    public int f34582a;
    public w4 f34583b;
    public LinearLayout f34584c;
    public ci.d d;
    public ImageView f34585e;
    public ScrollView f34586f;
    public ia0 h;
    public int f34587n;
    public boolean f34588r;
    public byte[] f34589s;
    public final ArrayList v;

    public c7() {
        super(null);
        this.f34582a = 12;
        this.v = new ArrayList();
    }

    public static void U(c7 c7Var, String str, l0 l0Var, org.telegram.ui.ActionBar.m2 m2Var, String str2) {
        c7Var.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                zc.a0(c7Var).e0(str2, false);
                return;
            }
            if (c7Var.f34588r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, l0Var.r())) {
                new q0(c7Var.getParentActivity(), str, c7Var.currentAccount).B();
            }
            AndroidUtilities.runOnUIThread(new s(12, c7Var, m2Var), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c7Var.getParentActivity(), 0, c7Var.getResourceProvider());
        alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
        alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
        org.telegram.messenger.v0.p(R.string.WalletOK, alertDialog$Builder, null);
    }

    public static void V(c7 c7Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (!c7Var.d.N) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = c7Var.v;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList.add(((j9) obj).getWord().toLowerCase().trim());
            }
            i0 d = i0.d(arrayList);
            try {
                c7Var.d.setLoading(true);
                org.telegram.ui.ActionBar.m2 m2Var = null;
                if (c7Var.f34589s != null) {
                    try {
                        bArr = WalletEngine2.secretPhraseToPublicKey(d);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        bArr = null;
                    }
                    if (bArr == null) {
                        c7Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c7Var.getParentActivity(), 0, c7Var.getResourceProvider());
                        alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
                        alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
                        alertDialog$Builder.k(LocaleController.getString(R.string.WalletOK), null);
                        alertDialog$Builder.o();
                    } else if (!Arrays.equals(bArr, c7Var.f34589s)) {
                        try {
                            str = WalletEngine2.secretPhraseToAddress(d);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            frameLayout = new FrameLayout(c7Var.getParentActivity());
                            TextView textView = new TextView(c7Var.getParentActivity());
                            textView.setTextSize(1, 14.0f);
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c7Var.resourceProvider));
                            textView.setText(X(str));
                            textView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                            textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                            textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20503a7, c7Var.resourceProvider)));
                            textView.setGravity(17);
                            frameLayout.addView(textView, w7.w5.a(-2.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 7));
                        } else {
                            frameLayout = null;
                        }
                        c7Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(c7Var.getParentActivity(), 0, c7Var.getResourceProvider());
                        alertDialog$Builder2.f20141a.R = LocaleController.getString(R.string.WalletWrongSecretPhrase);
                        alertDialog$Builder2.f20141a.T = LocaleController.getString(R.string.WalletWrongSecretPhraseInfo);
                        alertDialog$Builder2.n(frameLayout);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.o();
                    } else {
                        l0 v = l0.v(c7Var.currentAccount);
                        v.f34996c.p(UserConfig.getInstance(c7Var.currentAccount).getClientUserId(), bArr, d, new b7(0, c7Var, v));
                    }
                    d.close();
                    return;
                }
                c7Var.d.setLoading(true);
                l0 v9 = l0.v(c7Var.currentAccount);
                String r10 = v9.r();
                if (c7Var.getParentLayout() != null && c7Var.getParentLayout().getFragmentStack().size() > 1) {
                    m2Var = (org.telegram.ui.ActionBar.m2) c7Var.getParentLayout().getFragmentStack().get(c7Var.getParentLayout().getFragmentStack().size() - 2);
                }
                v9.A(false, true, d, new r(c7Var, r10, v9, m2Var));
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
                    ev evVar = new ev(false);
                    evVar.f25788b = (int) 191.25f;
                    spannableStringBuilder.setSpan(evVar, i10, spannableStringBuilder.length(), 33);
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
            arrayList.add(((j9) obj).getWord());
        }
        this.f34584c.removeAllViews();
        arrayList2.clear();
        for (int i12 = 0; i12 < this.f34582a; i12++) {
            if (i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j9 j9Var = new j9(i12, context, this.resourceProvider, z10);
            j9Var.setOnTextChangedListener(new a7(this, 1));
            j9Var.setOnPasteListener(new i(this, i12, 3));
            j9Var.setOnNextListener(new ci0(this, i12, j9Var, 14));
            LinearLayout linearLayout = this.f34584c;
            if (i12 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout.addView(j9Var, w7.w5.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(j9Var);
        }
        for (int i13 = 0; i13 < arrayList.size() && i13 < arrayList2.size(); i13++) {
            if (!((String) arrayList.get(i13)).isEmpty()) {
                ((j9) arrayList2.get(i13)).setText((String) arrayList.get(i13));
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
                if (((j9) obj).getWord().isEmpty()) {
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
        yw0 yw0Var = new yw0(context, null);
        this.fragmentView = yw0Var;
        yw0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, this.resourceProvider));
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        this.f34586f = scrollView;
        scrollView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                int i19 = i14 - i12;
                int i20 = i18 - i16;
                c7 c7Var = c7.this;
                if (i19 < i20) {
                    ArrayList arrayList = c7Var.v;
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList.get(i21);
                        i21++;
                        j9 j9Var = (j9) obj;
                        if (j9Var.hasFocus()) {
                            j9Var.requestRectangleOnScreen(new Rect(0, 0, j9Var.getWidth(), j9Var.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                c7Var.getClass();
            }
        });
        ((FrameLayout) this.fragmentView).addView(scrollView, w7.w5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, w7.w5.n(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f34585e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f34585e;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f34585e.setImageResource(R.drawable.ic_ab_close);
        this.f34585e.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i6, this.resourceProvider), 3, -1));
        this.f34585e.setOnClickListener(new View.OnClickListener(this) {
            public final c7 f35602b;

            {
                this.f35602b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35602b.finishFragment();
                        return;
                    default:
                        c7.V(this.f35602b);
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.f34585e, w7.w5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        y9 y9Var = new y9(context);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(y9Var, w7.w5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider));
        if (this.f34589s != null) {
            i10 = R.string.WalletSecretPhrase;
        } else {
            i10 = R.string.WalletImport;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, w7.w5.t(-1, -2, 1, 32, 0, 32, 10));
        ia0 ia0Var = new ia0(context, null);
        this.h = ia0Var;
        ia0Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20963z6, this.resourceProvider));
        this.h.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, this.resourceProvider));
        if (this.f34589s != null) {
            this.h.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WalletEnterSecretPhrase), new a7(this, 0)));
        } else {
            this.h.setText(LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, 12));
        }
        linearLayout.addView(this.h, w7.w5.t(-1, -2, 1, 32, 0, 32, 8));
        w4 w4Var = new w4(context, new CharSequence[]{LocaleController.formatPluralString("WalletPhraseWords", 12, new Object[0]), LocaleController.formatPluralString("WalletPhraseWords", 24, new Object[0])}, new k(this, 4), this.resourceProvider);
        this.f34583b = w4Var;
        w4Var.f35474e = true;
        w4Var.e();
        this.f34583b.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.f34583b.setClipToPadding(false);
        linearLayout.addView(this.f34583b, w7.w5.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f34584c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f34584c.setGravity(1);
        this.f34584c.setClipChildren(false);
        linearLayout.addView(this.f34584c, w7.w5.t(-1, -2, 1, 0, 16, 0, 0));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.e();
        this.d.setText(LocaleController.getString(R.string.WalletImportButton));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final c7 f35602b;

            {
                this.f35602b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35602b.finishFragment();
                        return;
                    default:
                        c7.V(this.f35602b);
                        return;
                }
            }
        });
        linearLayout.addView(this.d, w7.w5.t(-1, 48, 1, 0, 24, 0, 0));
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
        ScrollView scrollView = this.f34586f;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f34586f.getLayoutParams();
            int max = Math.max(i13, this.f34587n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f34586f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.f34585e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f34585e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f34587n = k1Var.f46992a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }
}
