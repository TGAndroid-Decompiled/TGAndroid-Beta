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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.c90;
import org.telegram.ui.je1;
import org.telegram.ui.li1;
public final class z6 extends org.telegram.ui.ActionBar.m2 {
    public int f33952a;
    public u4 f33953b;
    public LinearLayout f33954c;
    public di.d d;
    public ImageView e;
    public ScrollView f33955f;
    public da0 h;
    public int f33956n;
    public boolean f33957r;
    public byte[] f33958s;
    public final ArrayList v;

    public z6() {
        super(null);
        this.f33952a = 12;
        this.v = new ArrayList();
    }

    public static void U(z6 z6Var, String str, j0 j0Var, org.telegram.ui.ActionBar.m2 m2Var, String str2) {
        z6Var.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                zc.a0(z6Var).e0(str2, false);
                return;
            }
            if (z6Var.f33957r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, j0Var.r())) {
                new o0(z6Var.getParentActivity(), str, z6Var.currentAccount).B();
            }
            AndroidUtilities.runOnUIThread(new je1(26, z6Var, m2Var), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
        org.telegram.messenger.q.A(R.string.WalletOK, alertDialog$Builder, null);
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
                arrayList.add(((h9) obj).getWord().toLowerCase().trim());
            }
            g0 d = g0.d(arrayList);
            try {
                z6Var.d.setLoading(true);
                org.telegram.ui.ActionBar.m2 m2Var = null;
                if (z6Var.f33958s != null) {
                    try {
                        bArr = WalletEngine2.secretPhraseToPublicKey(d);
                    } catch (Exception e) {
                        FileLog.e(e);
                        bArr = null;
                    }
                    if (bArr == null) {
                        z6Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
                        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
                        alertDialog$Builder.k(LocaleController.getString(R.string.WalletOK), null);
                        alertDialog$Builder.o();
                    } else if (!Arrays.equals(bArr, z6Var.f33958s)) {
                        try {
                            str = WalletEngine2.secretPhraseToAddress(d);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            frameLayout = new FrameLayout(z6Var.getParentActivity());
                            TextView textView = new TextView(z6Var.getParentActivity());
                            textView.setTextSize(1, 14.0f);
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, z6Var.resourceProvider));
                            textView.setText(X(str));
                            textView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                            textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                            textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, z6Var.resourceProvider)));
                            textView.setGravity(17);
                            frameLayout.addView(textView, w7.a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 7));
                        } else {
                            frameLayout = null;
                        }
                        z6Var.d.setLoading(false);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
                        alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.WalletWrongSecretPhrase);
                        alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.WalletWrongSecretPhraseInfo);
                        alertDialog$Builder2.n(frameLayout);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.o();
                    } else {
                        j0 v = j0.v(z6Var.currentAccount);
                        v.f33321c.p(UserConfig.getInstance(z6Var.currentAccount).getClientUserId(), bArr, d, new y6(0, z6Var, v));
                    }
                    d.close();
                    return;
                }
                z6Var.d.setLoading(true);
                j0 v10 = j0.v(z6Var.currentAccount);
                String r10 = v10.r();
                if (z6Var.getParentLayout() != null && z6Var.getParentLayout().getFragmentStack().size() > 1) {
                    m2Var = (org.telegram.ui.ActionBar.m2) z6Var.getParentLayout().getFragmentStack().get(z6Var.getParentLayout().getFragmentStack().size() - 2);
                }
                v10.A(false, true, d, new q(z6Var, r10, v10, m2Var));
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
                    xu xuVar = new xu(false);
                    xuVar.f31330b = (int) 191.25f;
                    spannableStringBuilder.setSpan(xuVar, i10, spannableStringBuilder.length(), 33);
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
        this.f33954c.removeAllViews();
        arrayList2.clear();
        for (int i12 = 0; i12 < this.f33952a; i12++) {
            if (i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h9 h9Var = new h9(i12, context, this.resourceProvider, z10);
            h9Var.setOnTextChangedListener(new x6(this, 1));
            h9Var.setOnPasteListener(new li1(this, i12, 4));
            h9Var.setOnNextListener(new c90(this, i12, h9Var, 15));
            LinearLayout linearLayout = this.f33954c;
            if (i12 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout.addView(h9Var, w7.a6.t(-1, 50, 1, 0, i10, 0, 0));
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
        ow0 ow0Var = new ow0(context, null);
        this.fragmentView = ow0Var;
        ow0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, this.resourceProvider));
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        this.f33955f = scrollView;
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
                        h9 h9Var = (h9) obj;
                        if (h9Var.hasFocus()) {
                            h9Var.requestRectangleOnScreen(new Rect(0, 0, h9Var.getWidth(), h9Var.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                z6Var.getClass();
            }
        });
        ((FrameLayout) this.fragmentView).addView(scrollView, w7.a6.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, w7.a6.n(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.e.setImageResource(R.drawable.ic_ab_close);
        this.e.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, this.resourceProvider), 3, -1));
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final z6 f33800b;

            {
                this.f33800b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33800b.finishFragment();
                        return;
                    default:
                        z6.V(this.f33800b);
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, w7.a6.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        z9 z9Var = new z9(context);
        z9Var.setAspectFit(true);
        z9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(z9Var, "RestrictedEmoji", "📝", "100_100");
        z9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(z9Var, w7.a6.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, this.resourceProvider));
        if (this.f33958s != null) {
            i10 = R.string.WalletSecretPhrase;
        } else {
            i10 = R.string.WalletImport;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, w7.a6.t(-1, -2, 1, 32, 0, 32, 10));
        da0 da0Var = new da0(context, null);
        this.h = da0Var;
        da0Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, this.resourceProvider));
        this.h.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, this.resourceProvider));
        if (this.f33958s != null) {
            this.h.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WalletEnterSecretPhrase), new x6(this, 0)));
        } else {
            this.h.setText(LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, 12));
        }
        linearLayout.addView(this.h, w7.a6.t(-1, -2, 1, 32, 0, 32, 8));
        u4 u4Var = new u4(context, new CharSequence[]{LocaleController.formatPluralString("WalletPhraseWords", 12, new Object[0]), LocaleController.formatPluralString("WalletPhraseWords", 24, new Object[0])}, new j(this, 4), this.resourceProvider);
        this.f33953b = u4Var;
        u4Var.e = true;
        u4Var.d();
        this.f33953b.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.f33953b.setClipToPadding(false);
        linearLayout.addView(this.f33953b, w7.a6.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f33954c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f33954c.setGravity(1);
        this.f33954c.setClipChildren(false);
        linearLayout.addView(this.f33954c, w7.a6.t(-1, -2, 1, 0, 16, 0, 0));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.e();
        this.d.setText(LocaleController.getString(R.string.WalletImportButton));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final z6 f33800b;

            {
                this.f33800b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33800b.finishFragment();
                        return;
                    default:
                        z6.V(this.f33800b);
                        return;
                }
            }
        });
        linearLayout.addView(this.d, w7.a6.t(-1, 48, 1, 0, 24, 0, 0));
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
        ScrollView scrollView = this.f33955f;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f33955f.getLayoutParams();
            int max = Math.max(i13, this.f33956n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f33955f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.f33956n = l1Var.f43741a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }
}
