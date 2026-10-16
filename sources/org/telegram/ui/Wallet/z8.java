package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.sk;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.c90;
public final class z8 extends org.telegram.ui.ActionBar.m2 {
    public final String[] f33665a;
    public final int[] f33666b;
    public final n f33667c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f33668f;
    public di.d h;
    public int f33669n;
    public int f33670r;
    public int f33671s;
    public int v;
    public int f33672w;
    public boolean f33673x;

    public z8(ArrayList arrayList, n nVar) {
        super(null);
        this.f33666b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f33665a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f33667c = nVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f33665a.length; i11 = com.google.android.gms.internal.play_billing.k3.f(i11, i11, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f33666b;
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
        if (arrayList.size() == this.f33666b.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z10 &= !((h9) obj).getWord().isEmpty();
        }
        di.d dVar = this.h;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        dVar.setVisibility(i10);
        di.d dVar2 = this.h;
        if (z10 && !this.f33673x) {
            z11 = true;
        }
        dVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        ow0 ow0Var = new ow0(context, null);
        ow0Var.setDelegate(new nw0() {
            @Override
            public final void H(int i11, boolean z10) {
                z8 z8Var = z8.this;
                z8Var.getClass();
                if (i11 <= AndroidUtilities.dp(20.0f)) {
                    i11 = 0;
                }
                z8Var.f33669n = i11;
                z8Var.onInsets(z8Var.f33670r, z8Var.f33671s, z8Var.v, z8Var.f33672w);
            }
        });
        ow0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, this.resourceProvider));
        this.fragmentView = ow0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        ow0Var.addView(this.e, w7.z5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f33668f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f33668f;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f33668f.setImageResource(R.drawable.ic_ab_close);
        this.f33668f.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, this.resourceProvider), 3, -1));
        this.f33668f.setOnClickListener(new View.OnClickListener(this) {
            public final z8 f33631b;

            {
                this.f33631b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33631b.finishFragment();
                        return;
                    default:
                        z8 z8Var = this.f33631b;
                        int[] iArr = z8Var.f33666b;
                        ArrayList arrayList = z8Var.d;
                        if (!z8Var.f33673x && arrayList.size() == iArr.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList.get(i12);
                                    i12++;
                                    if (((h9) obj).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i13 = 0; i13 < iArr.length; i13++) {
                                    h9 h9Var = (h9) arrayList.get(i13);
                                    boolean equalsIgnoreCase = z8Var.f33665a[iArr[i13]].equalsIgnoreCase(h9Var.getWord());
                                    if (!equalsIgnoreCase && h9Var.v) {
                                        AndroidUtilities.shakeViewSpring(h9Var);
                                    }
                                    h9Var.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            z8Var.f33673x = true;
                            z8Var.U();
                            AndroidUtilities.hideKeyboard(z8Var.fragmentView);
                            n nVar = z8Var.f33667c;
                            if (nVar != null) {
                                nVar.run();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ow0Var.addView(this.f33668f, w7.z5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        z9 z9Var = new z9(context);
        z9Var.setAspectFit(true);
        z9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(z9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        z9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(z9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, this.resourceProvider));
        textView.setText(LocaleController.getString(R.string.WalletTestPhrase));
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 10), context);
        i12.setTextSize(1, 14.0f);
        i12.setGravity(1);
        i12.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, this.resourceProvider));
        int i13 = R.string.WalletTestPhraseInfo;
        int[] iArr = this.f33666b;
        sk.r(i13, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, i12);
        linearLayout.addView(i12, w7.z5.t(-1, -2, 1, 32, 0, 32, 8));
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
            arrayList.add(((h9) obj).getWord());
        }
        arrayList2.clear();
        for (int i15 = 0; i15 < iArr.length; i15++) {
            h9 h9Var = new h9(iArr[i15], context, this.resourceProvider, false);
            if (i15 < arrayList.size()) {
                h9Var.setText((String) arrayList.get(i15));
            }
            h9Var.setOnTextChangedListener(new n(this, 15));
            h9Var.setOnNextListener(new c90(this, i15, h9Var, 16));
            if (i15 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout2.addView(h9Var, w7.z5.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(h9Var);
        }
        linearLayout.addView(new View(context), w7.z5.l(1.0f, -1, 0));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.e();
        this.h.setText(LocaleController.getString(R.string.WalletContinue));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final z8 f33631b;

            {
                this.f33631b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33631b.finishFragment();
                        return;
                    default:
                        z8 z8Var = this.f33631b;
                        int[] iArr2 = z8Var.f33666b;
                        ArrayList arrayList3 = z8Var.d;
                        if (!z8Var.f33673x && arrayList3.size() == iArr2.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size2 = arrayList3.size();
                                int i122 = 0;
                                while (i122 < size2) {
                                    Object obj2 = arrayList3.get(i122);
                                    i122++;
                                    if (((h9) obj2).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i132 = 0; i132 < iArr2.length; i132++) {
                                    h9 h9Var2 = (h9) arrayList3.get(i132);
                                    boolean equalsIgnoreCase = z8Var.f33665a[iArr2[i132]].equalsIgnoreCase(h9Var2.getWord());
                                    if (!equalsIgnoreCase && h9Var2.v) {
                                        AndroidUtilities.shakeViewSpring(h9Var2);
                                    }
                                    h9Var2.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            z8Var.f33673x = true;
                            z8Var.U();
                            AndroidUtilities.hideKeyboard(z8Var.fragmentView);
                            n nVar = z8Var.f33667c;
                            if (nVar != null) {
                                nVar.run();
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
        this.f33670r = i10;
        this.f33671s = i11;
        this.v = i12;
        this.f33672w = i13;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13 + this.f33669n);
        }
        ImageView imageView = this.f33668f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f33668f.setLayoutParams(layoutParams);
        }
    }
}
