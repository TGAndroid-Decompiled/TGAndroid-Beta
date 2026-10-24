package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.tl;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nw0;
public final class aa extends org.telegram.ui.ActionBar.o2 {
    public final String[] f34307a;
    public final int[] f34308b;
    public final m f34309c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f34310f;
    public ei.d h;
    public int f34311n;
    public int f34312r;
    public int f34313s;
    public int v;
    public int f34314w;
    public boolean f34315x;

    public aa(ArrayList arrayList, m mVar) {
        super(null);
        this.f34308b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f34307a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f34309c = mVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f34307a.length; i11 = com.google.android.gms.internal.play_billing.k3.f(i11, i11, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f34308b;
            if (i10 < iArr.length) {
                iArr[i10] = ((Integer) arrayList2.get(i10)).intValue();
                i10++;
            } else {
                Arrays.sort(iArr);
                return;
            }
        }
    }

    public final void U() {
        boolean z10;
        int i10;
        if (this.h == null) {
            return;
        }
        ArrayList arrayList = this.d;
        boolean z11 = false;
        if (arrayList.size() == this.f34308b.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z10 &= !((ia) obj).getWord().isEmpty();
        }
        ei.d dVar = this.h;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        dVar.setVisibility(i10);
        ei.d dVar2 = this.h;
        if (z10 && !this.f34315x) {
            z11 = true;
        }
        dVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        nw0 nw0Var = new nw0(context, null);
        nw0Var.setDelegate(new mw0() {
            @Override
            public final void G(int i11, boolean z10) {
                aa aaVar = aa.this;
                aaVar.getClass();
                if (i11 <= AndroidUtilities.dp(20.0f)) {
                    i11 = 0;
                }
                aaVar.f34311n = i11;
                aaVar.onInsets(aaVar.f34312r, aaVar.f34313s, aaVar.v, aaVar.f34314w);
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, nw0Var, this.resourceProvider);
        this.fragmentView = nw0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        nw0Var.addView(this.e, w7.z5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f34310f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f34310f;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f34310f.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.f34310f;
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.ActionBar.r6.S(imageView3, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.O(i12), this.resourceProvider);
        this.f34310f.setOnClickListener(new View.OnClickListener(this) {
            public final aa f35516b;

            {
                this.f35516b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35516b.finishFragment();
                        return;
                    default:
                        aa aaVar = this.f35516b;
                        int[] iArr = aaVar.f34308b;
                        ArrayList arrayList = aaVar.d;
                        if (!aaVar.f34315x && arrayList.size() == iArr.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size = arrayList.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = arrayList.get(i13);
                                    i13++;
                                    if (((ia) obj).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i14 = 0; i14 < iArr.length; i14++) {
                                    ia iaVar = (ia) arrayList.get(i14);
                                    boolean equalsIgnoreCase = aaVar.f34307a[iArr[i14]].equalsIgnoreCase(iaVar.getWord());
                                    if (!equalsIgnoreCase && iaVar.v) {
                                        AndroidUtilities.shakeViewSpring(iaVar);
                                    }
                                    iaVar.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            aaVar.f34315x = true;
                            aaVar.U();
                            AndroidUtilities.hideKeyboard(aaVar.fragmentView);
                            m mVar = aaVar.f34309c;
                            if (mVar != null) {
                                mVar.run();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        nw0Var.addView(this.f34310f, w7.z5.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        u9Var.setAspectFit(true);
        u9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(u9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        u9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(u9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(textView, i11, this.resourceProvider);
        textView.setText(LocaleController.getString(R.string.WalletTestPhrase));
        TextView f7 = tl.f(linearLayout, textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 10), context);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(f7, org.telegram.ui.ActionBar.k6.f21589z6, this.resourceProvider);
        int i13 = R.string.WalletTestPhraseInfo;
        int[] iArr = this.f34308b;
        tl.r(i13, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f7);
        linearLayout.addView(f7, w7.z5.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, w7.z5.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            arrayList.add(((ia) obj).getWord());
        }
        arrayList2.clear();
        for (int i15 = 0; i15 < iArr.length; i15++) {
            ia iaVar = new ia(iArr[i15], context, this.resourceProvider, false);
            if (i15 < arrayList.size()) {
                iaVar.setText((String) arrayList.get(i15));
            }
            iaVar.setOnTextChangedListener(new m(this, 14));
            iaVar.setOnNextListener(new b41(this, i15, iaVar, 21));
            if (i15 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout2.addView(iaVar, w7.z5.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(iaVar);
        }
        linearLayout.addView(new View(context), w7.z5.l(1.0f, -1, 0));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(LocaleController.getString(R.string.WalletContinue));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final aa f35516b;

            {
                this.f35516b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35516b.finishFragment();
                        return;
                    default:
                        aa aaVar = this.f35516b;
                        int[] iArr2 = aaVar.f34308b;
                        ArrayList arrayList3 = aaVar.d;
                        if (!aaVar.f34315x && arrayList3.size() == iArr2.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size2 = arrayList3.size();
                                int i132 = 0;
                                while (i132 < size2) {
                                    Object obj2 = arrayList3.get(i132);
                                    i132++;
                                    if (((ia) obj2).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i142 = 0; i142 < iArr2.length; i142++) {
                                    ia iaVar2 = (ia) arrayList3.get(i142);
                                    boolean equalsIgnoreCase = aaVar.f34307a[iArr2[i142]].equalsIgnoreCase(iaVar2.getWord());
                                    if (!equalsIgnoreCase && iaVar2.v) {
                                        AndroidUtilities.shakeViewSpring(iaVar2);
                                    }
                                    iaVar2.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            aaVar.f34315x = true;
                            aaVar.U();
                            AndroidUtilities.hideKeyboard(aaVar.fragmentView);
                            m mVar = aaVar.f34309c;
                            if (mVar != null) {
                                mVar.run();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout.addView(this.h, w7.z5.t(-1, 48, 1, 0, 24, 0, 0));
        U();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34312r = i10;
        this.f34313s = i11;
        this.v = i12;
        this.f34314w = i13;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13 + this.f34311n);
        }
        ImageView imageView = this.f34310f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f34310f.setLayoutParams(layoutParams);
        }
    }
}
